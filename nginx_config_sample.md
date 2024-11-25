### Configure Nginx or lighthttp virtualhost

```bash

server {
        listen 80 default_server;
        listen [::]:80 default_server;
        server_name music.selman.work;



 location / {
        proxy_pass http://localhost:8080;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
         try_files $uri /index.html index.php;

    }

    location /mp3/ {
        autoindex on;
        root /var/www;
        access_log off;
    }



}



### Configure Nginx or lighthttp virtualhost

```bash

server {
listen 80;
server_name music.selman.work;

    location / {
        proxy_pass http://localhost:8080;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
    }

    location /mp3/ {
        root /home/user/MusicBox/src/main/resources/static;
        access_log off;
    }
}

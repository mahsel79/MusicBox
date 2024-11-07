# Run app with systemd

```bash

[Unit]
Description=MusicBox Web Radio Player
After=syslog.target

[Service]
User=your_user
ExecStart=/usr/bin/java -jar /home/user/MusicBox-0.0.1-SNAPSHOT.jar
SuccessExitStatus=143
Restart=on-failure
RestartSec=10
StandardOutput=syslog
StandardError=syslog

[Install]
WantedBy=multi-user.target

```
### Enable and start the service

```bash
sudo systemctl enable musicbox

```

### Start the service

```bash
sudo systemctl start musicbox
```

### Check service status 

```bash
sudo systemctl status musicbox
```
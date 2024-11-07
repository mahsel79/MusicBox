# Deployment Guide for MusicBox Web Radio Player

This guide provides step-by-step instructions to install necessary packages and deploy the MusicBox Java Spring Boot application on an Ubuntu server with Nginx as the reverse proxy.

---

## 1. Update System Packages

Before starting, ensure your system packages are up-to-date.

```bash
sudo apt update && sudo apt upgrade -y
sudo apt install -y openjdk-21-jdk


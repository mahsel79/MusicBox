## MusicBox Web Radio Player

This project is a web radio player built with Java Spring Boot. It provides a dark-themed interface with a playlist, allowing users to play MP3 files hosted on the server.

## Prerequisites

1. **Java 21** - Ensure that Java 21 or later is installed on your server.
2. **Maven** - Required to build the Spring Boot application.
3. **Nginx** - Installed and configured as the web server.
4. **Domain** - Set up DNS for `https://music.selman.work` pointing to the server.

## Project Structure

- `src/main/java/work/selman/webradio`: Java source code, organized by config, controller, and model packages.
- `src/main/resources/static`: Static files like HTML, CSS, JavaScript, and MP3 files.
- `src/main/resources/templates`: Thymeleaf templates (for any dynamic HTML views).

## Build and Run Locally

1. **Clone the Repository** (if not already done)
   ```bash
   git clone https://github.com/mahsel79/MusicBox.git
   cd MusicBox
   mvn clean install
   java -jar target/webradio-0.0.1-SNAPSHOT.jar
   chown -R www-data:www-data /home/neo/MusicBox
   
 
## Locate the build target jar file

```bash
target/webradio-0.0.1-SNAPSHOT.jar

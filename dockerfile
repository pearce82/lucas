FROM openjdk:21-slim

# Ustaw katalog roboczy w kontenerze
WORKDIR /app

# Skopiuj plik JAR do kontenera
COPY build/libs/lukas-0.0.1-SNAPSHOT.war /app/app.jar

# Określ port, na którym działa Twoja aplikacja
EXPOSE 8090

# Uruchom aplikację Spring Boot po uruchomieniu kontenera
CMD ["java", "-jar", "app.jar"]
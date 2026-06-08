FROM python:3.9-alpine
WORKDIR /app
RUN echo "<h1>Bravo ! Le deploiement Jenkins a fonctionne !</h1><p>Mission accomplie pour le TP.</p>" > index.html
CMD ["python", "-m", "http.server", "8081"]

FROM python:3.9-slim-buster

WORKDIR /app

COPY tester.py .
COPY locust_1000_users_report.html .

RUN pip3 install locust

ENV LOCUST_USERS=10
ENV LOCUST_HATCH_RATE=1
ENV LOCUST_RUN_TIME=10s
ENV LOCUST_HOST=http://localhost:8080

EXPOSE 8089 5557 5558

CMD ["locust", "-f", "tester.py"]
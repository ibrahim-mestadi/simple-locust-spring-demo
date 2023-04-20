FROM python:3.9-slim-buster

# set working directory
WORKDIR /app

COPY tester.py .
COPY locust_1000_users_report.html .

# install required dependencies
RUN pip3 install locust

# set environment variables
# ENV LOCUST_USERS=10
# ENV LOCUST_HATCH_RATE=1
# ENV LOCUST_RUN_TIME=10s
# ENV LOCUST_HOST=http://localhost:8080

# expose locust web UI and master/slave ports
EXPOSE 8089 5557 5558

# start locust using the locustfile.py
CMD ["locust", "-f", "tester.py"]

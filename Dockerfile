FROM ubuntu:latest
LABEL authors="smartsafe"

ENTRYPOINT ["top", "-b"]
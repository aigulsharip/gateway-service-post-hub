#!/usr/bin/env bash

PROFILE=${PROFILE:-prod}

echo "Starting service with profile: $PROFILE"
exec java -jar gateway-service-1.0-SNAPSHOT.jar

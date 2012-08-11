#!/bin/sh

for v in 0.11.2 0.11.3 0.12.0
do
  sbt -sbt-version $v publish
done

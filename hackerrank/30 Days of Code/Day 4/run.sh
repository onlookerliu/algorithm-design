#!/bin/sh

echo -e "4\n-1\n10\n16\n18\n" | go run classvinstance.go

echo -e "4\n-1\n10\n16\n18\n" | node classvinstance.js

echo -e "4\n-1\n10\n16\n18\n" | python classvinstance.py

javac Person.java && echo -e "4\n-1\n10\n16\n18\n" | java Person

g++ classvinstance.cpp -o classvinstance && echo -e "4\n-1\n10\n16\n18\n" | ./classvinstance

echo -e "4\n-1\n10\n16\n18\n" | scala Person.scala
#!/bin/sh

echo "kai" | clj helloworld.clj

echo "kai" | node helloworld.js

echo "kai" | scala HelloWorld.scala

javac Solution.java && echo "kai" | java Solution

g++ HelloWorld.cpp -o HelloWorld && echo "kai" | ./HelloWorld
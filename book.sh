#!/bin/sh

# Post book
echo "Post book"

http POST http://localhost:8080/books isbn="11-123999" title="the bobbitses" author="j r r tolkine"

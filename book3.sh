#!/bin/bash

# Post book
echo "Post book"

echo -n '{"isbn": "99-99", "title": "the world", "author": "jrr toliken"}' | http http://localhost:8080/books


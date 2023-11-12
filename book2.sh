#!/bin/bash

# Post book
echo "Post book"

http POST http://localhost:8080/books < book.json

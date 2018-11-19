#!/bin/sh
echo "来了宝贝"
git init
git add .
git status 
git commit -m "commit"
git log
git remote rm origin
git remote add origin https://github.com/LiJiahuiQAQ/springboot-learn.git
git commit -m "commit"
git push -u origin master

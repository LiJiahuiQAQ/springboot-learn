#!/bin/sh
dirname $0
cd `dirname $0`
git init
git add .
git commit -m "commit"
# git remote rm origin
# git remote add origin https://github.com/LiJiahuiQAQ/springboot-learn.git
git commit -m "commit"
git push -u origin master

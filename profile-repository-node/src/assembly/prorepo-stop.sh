#!/bin/bash
# 程序的根目录
basedir=/usr/share/prorepo

PID=$(cat $basedir/prorepo.pid)
kill "$PID"

#!/bin/sh
# 程序的根目录
basedir="/usr/local/prorepo"

PID=$(cat "$basedir/prorepo.pid")
kill "$PID"

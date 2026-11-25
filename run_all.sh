#!/usr/bin/env bash
# Нэг нэгээр нь ажиллуул, АЛХАМ БҮРИЙН ДАРАА commit хий (доорх README.md-ийн "Commit төлөвлөгөө").
set -e
mkdir -p results screenshots
k6 version | tee results/k6-version.txt
k6 run --vus 5   --duration 1m script.js | tee results/run-05vu.txt
k6 run --vus 30  --duration 1m script.js | tee results/run-30vu.txt
k6 run --vus 100 --duration 1m script.js | tee results/run-100vu.txt
k6 run stages.js | tee results/run-stages.txt
k6 run threshold-pass.js | tee results/threshold-pass.txt || true
k6 run threshold-fail.js | tee results/threshold-fail.txt || true
python3 make_table.py

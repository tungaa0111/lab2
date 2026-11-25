#!/usr/bin/env python3
"""results/run-*.txt-ээс README-ийн хүснэгтийг автоматаар үүсгэнэ (тоо таарахгүй байх эрсдэлгүй)."""
import re, glob
def ms(v, u):
    return float(v) * {'µs': 0.001, 'us': 0.001, 'ms': 1, 's': 1000}[u]
print('| VU | p90 (ms) | p95 (ms) | throughput (req/s) | error rate |')
print('|---|---|---|---|---|')
for f in sorted(glob.glob('results/run-*vu.txt')):
    t = open(f, encoding='utf-8').read()
    vu = re.search(r'run-0*(\d+)vu', f).group(1)
    d = re.search(r'http_req_duration[ .]*:.*?p\(90\)=([\d.]+)(µs|us|ms|s)\s+p\(95\)=([\d.]+)(µs|us|ms|s)', t)
    r = re.search(r'http_reqs[ .]*:\s*(\d+)\s+([\d.]+)/s', t)
    e = re.search(r'http_req_failed[ .]*:\s*([\d.]+)%', t)
    print(f'| {vu} | {ms(d[1], d[2]):.1f} | {ms(d[3], d[4]):.1f} | {r[2]} | {e[1]}% |')

# Lab 02 — k6-аар гүйцэтгэлийн хэмжүүр

- **Нэр:** <НЭР>
- **Оюутны код:** <КОД>
- **k6 version:** (`results/k6-version.txt`-ээс хуул)
```
<k6 version гаралт>
```
- **Бай:** https://test.k6.io (зөвшөөрөгдсөн)

## Файлууд
`script.js`, `stages.js`, `threshold-pass.js`, `threshold-fail.js`, `make_table.py`, `results/*.txt`, `screenshots/`

## Baseline (5 VU)
p95 = <X> ms (results/run-05vu.txt)

## 5 / 30 / 100 VU хүснэгт
(`python3 make_table.py` гаралтыг энд буулга)

## Stages (5→30→100→0)
<ажиглалт, results/run-stages.txt>

## SLO ба threshold
SLO: p95 < <baseline × 1.5> ms, error rate < 1%. Шалтгаан: <1-2 өгүүлбэр>.
- PASS: results/threshold-pass.txt (screenshots/pass.png)
- FAIL (p95<50): results/threshold-fail.txt (screenshots/fail.png)

## Дүгнэлт (8-10 өгүүлбэр)
<өөрийн ажиглалтаар бич>

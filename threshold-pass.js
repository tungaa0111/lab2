import http from 'k6/http';
import { sleep, check } from 'k6';

// SLO = baseline p95 (results/run-05vu.txt) x 1.5.
// ДООРХ ТООГ өөрийн хэмжилтээр солино, README-ийн тоотой ЯГ ИЖИЛ байх ёстой.
const SLO_P95_MS = 0; // TODO: жишээ нь baseline 180ms -> 270

export const options = {
  vus: 30,
  duration: '1m',
  thresholds: {
    http_req_duration: [`p(95)<${SLO_P95_MS}`],
    http_req_failed: ['rate<0.01'],
  },
};

export default function () {
  const res = http.get('https://test.k6.io');
  check(res, { 'status 200 байна': (r) => r.status === 200 });
  sleep(1);
}

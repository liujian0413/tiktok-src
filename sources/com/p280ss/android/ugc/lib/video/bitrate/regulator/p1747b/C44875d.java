package com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b;

import com.p280ss.android.ugc.lib.video.bitrate.regulator.BitrateNotMatchException;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.C44860a;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.Shift;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44862b;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44864d;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44865e;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44866f;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44867a.C44868a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.b.d */
public final class C44875d extends C44867a {

    /* renamed from: e */
    private Shift[] f115396e;

    /* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.b.d$a */
    public static class C44877a extends C44868a {
        /* renamed from: a */
        public final C44879e mo107318a() {
            C44875d dVar = new C44875d(this.f115388a);
            dVar.mo107312a(this.f115389b);
            dVar.mo107313b(this.f115390c);
            dVar.mo107311a(this.f115391d);
            dVar.mo107338e(this.f115389b);
            return dVar;
        }

        public C44877a(C44864d dVar) {
            super(dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.b.d$b */
    public static class C44878b {

        /* renamed from: a */
        public Map<String, Object> f115397a = new HashMap();

        /* renamed from: a */
        public static C44878b m141608a() {
            return new C44878b();
        }

        private C44878b() {
        }

        /* renamed from: a */
        public final C44878b mo107339a(int i) {
            this.f115397a.put("internet_speed", Integer.valueOf(i));
            return this;
        }
    }

    private C44875d(C44864d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    private static int m141598a(Map<String, Object> map) {
        Object obj = map.get("internet_speed");
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    /* renamed from: b */
    private C44860a m141603b(double d) {
        C44862b bVar;
        if (d <= 0.0d || this.f115386c == null || this.f115386c.size() == 0) {
            return null;
        }
        Iterator it = this.f115386c.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (C44862b) it.next();
            if (bVar != null && d <= bVar.getSpeed()) {
                break;
            }
        }
        if (bVar == null) {
            bVar = (C44862b) this.f115386c.get(this.f115386c.size() - 1);
        }
        if (bVar == null) {
            return null;
        }
        return new C44860a(bVar.getBitrate(), true);
    }

    /* renamed from: c */
    private C44860a m141604c(double d) {
        if (d <= 0.0d || this.f115387d == null) {
            return null;
        }
        return new C44860a(Math.max((this.f115387d.mo104857a() * d * d * d) + (this.f115387d.mo104858b() * d * d) + (this.f115387d.mo104859c() * d) + this.f115387d.mo104860d(), this.f115387d.mo104861e()), true);
    }

    /* renamed from: e */
    public final void mo107338e(List<? extends C44865e> list) {
        if (list != null && !list.isEmpty()) {
            this.f115396e = new Shift[list.size()];
            for (int i = 0; i < list.size(); i++) {
                C44865e eVar = (C44865e) list.get(i);
                double bitRate = (double) eVar.getBitRate();
                double networkLower = (double) eVar.getNetworkLower();
                Double.isNaN(networkLower);
                double d = networkLower * 8000.0d;
                double networkUpper = (double) eVar.getNetworkUpper();
                Double.isNaN(networkUpper);
                Shift shift = new Shift(bitRate, d, 8000.0d * networkUpper);
                this.f115396e[i] = shift;
            }
        }
    }

    /* renamed from: a */
    private C44860a m141601a(double d) {
        Shift[] shiftArr;
        if (d <= 0.0d || this.f115396e == null) {
            return null;
        }
        double d2 = Double.MAX_VALUE;
        Shift shift = null;
        for (Shift shift2 : this.f115396e) {
            double abs = Math.abs(shift2.getMedianThreshold() - d);
            if (abs < d2) {
                shift = shift2;
                d2 = abs;
            }
        }
        if (shift != null) {
            return new C44860a(shift.mRate, false);
        }
        return null;
    }

    /* renamed from: a */
    private static <T extends C44863c> T m141599a(double d, List<T> list) {
        r0 = null;
        if (list != null) {
            for (T t : list) {
                if (d >= ((double) t.getBitRate())) {
                    break;
                }
            }
        }
        return t;
    }

    /* renamed from: b */
    private static <T extends C44863c> T m141602b(double d, List<T> list) {
        T t = null;
        if (list != null) {
            for (T t2 : list) {
                if (t != null) {
                    double bitRate = (double) t2.getBitRate();
                    Double.isNaN(bitRate);
                    double abs = Math.abs(bitRate - d);
                    double bitRate2 = (double) t.getBitRate();
                    Double.isNaN(bitRate2);
                    if (abs >= Math.abs(bitRate2 - d)) {
                    }
                }
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: a */
    private <T extends C44863c> T m141600a(C44860a aVar, List<T> list) throws BitrateNotMatchException {
        T t;
        if (aVar != null) {
            List c = mo107314c(list);
            if (!c.isEmpty()) {
                if (aVar.f115379b) {
                    t = m141599a(aVar.f115378a, c);
                } else {
                    t = m141602b(aVar.f115378a, c);
                }
                return t;
            }
            throw new BitrateNotMatchException(5, "Intersection bitrate list is empty.");
        } else if (this.f115384a != null) {
            return mo107315d(list);
        } else {
            throw new BitrateNotMatchException(6, "gear config is null");
        }
    }

    /* renamed from: a */
    public final C44866f mo107322a(List<? extends C44863c> list, Map<String, Object> map) {
        boolean z;
        C44860a aVar;
        C44866f fVar = new C44866f();
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            fVar.f115381b = new BitrateNotMatchException(0, "bitrate list is empty...");
            return fVar;
        }
        if (this.f115387d != null) {
            aVar = m141604c((double) m141598a(map));
        } else if (this.f115386c != null) {
            aVar = m141603b((double) m141598a(map));
        } else {
            aVar = m141601a((double) m141598a(map));
        }
        if (aVar != null) {
            fVar.f115383d = aVar.f115378a;
        }
        try {
            fVar.f115380a = m141600a(aVar, list);
        } catch (BitrateNotMatchException e) {
            fVar.f115381b = e;
        }
        if (fVar.f115380a == null) {
            fVar.f115380a = (C44863c) list.get(0);
        }
        return fVar;
    }
}

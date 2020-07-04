package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16579hf.C16584e;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.go */
final class C16560go implements C16675kl {

    /* renamed from: a */
    private final zztv f46363a;

    /* renamed from: a */
    public static C16560go m54029a(zztv zztv) {
        if (zztv.f46683a != null) {
            return zztv.f46683a;
        }
        return new C16560go(zztv);
    }

    private C16560go(zztv zztv) {
        this.f46363a = (zztv) C16586hh.m54188a(zztv, "output");
    }

    /* renamed from: a */
    public final int mo42843a() {
        return C16584e.f46416j;
    }

    /* renamed from: a */
    public final void mo42847a(int i, int i2) throws IOException {
        this.f46363a.mo43283e(i, i2);
    }

    /* renamed from: a */
    public final void mo42848a(int i, long j) throws IOException {
        this.f46363a.mo43255a(i, j);
    }

    /* renamed from: b */
    public final void mo42860b(int i, long j) throws IOException {
        this.f46363a.mo43278c(i, j);
    }

    /* renamed from: a */
    public final void mo42846a(int i, float f) throws IOException {
        this.f46363a.mo43253a(i, f);
    }

    /* renamed from: a */
    public final void mo42845a(int i, double d) throws IOException {
        this.f46363a.mo43252a(i, d);
    }

    /* renamed from: b */
    public final void mo42859b(int i, int i2) throws IOException {
        this.f46363a.mo43270b(i, i2);
    }

    /* renamed from: c */
    public final void mo42866c(int i, long j) throws IOException {
        this.f46363a.mo43255a(i, j);
    }

    /* renamed from: c */
    public final void mo42865c(int i, int i2) throws IOException {
        this.f46363a.mo43270b(i, i2);
    }

    /* renamed from: d */
    public final void mo42869d(int i, long j) throws IOException {
        this.f46363a.mo43278c(i, j);
    }

    /* renamed from: d */
    public final void mo42868d(int i, int i2) throws IOException {
        this.f46363a.mo43283e(i, i2);
    }

    /* renamed from: a */
    public final void mo42857a(int i, boolean z) throws IOException {
        this.f46363a.mo43260a(i, z);
    }

    /* renamed from: a */
    public final void mo42853a(int i, String str) throws IOException {
        this.f46363a.mo43259a(i, str);
    }

    /* renamed from: a */
    public final void mo42850a(int i, zzte zzte) throws IOException {
        this.f46363a.mo43258a(i, zzte);
    }

    /* renamed from: e */
    public final void mo42871e(int i, int i2) throws IOException {
        this.f46363a.mo43277c(i, i2);
    }

    /* renamed from: f */
    public final void mo42874f(int i, int i2) throws IOException {
        this.f46363a.mo43282d(i, i2);
    }

    /* renamed from: e */
    public final void mo42872e(int i, long j) throws IOException {
        this.f46363a.mo43271b(i, j);
    }

    /* renamed from: a */
    public final void mo42852a(int i, Object obj, C16633ja jaVar) throws IOException {
        this.f46363a.mo43257a(i, (C16615ij) obj, jaVar);
    }

    /* renamed from: b */
    public final void mo42861b(int i, Object obj, C16633ja jaVar) throws IOException {
        zztv zztv = this.f46363a;
        C16615ij ijVar = (C16615ij) obj;
        zztv.mo43254a(i, 3);
        jaVar.mo42993a(ijVar, (C16675kl) zztv.f46683a);
        zztv.mo43254a(i, 4);
    }

    /* renamed from: a */
    public final void mo42844a(int i) throws IOException {
        this.f46363a.mo43254a(i, 3);
    }

    /* renamed from: b */
    public final void mo42858b(int i) throws IOException {
        this.f46363a.mo43254a(i, 4);
    }

    /* renamed from: a */
    public final void mo42851a(int i, Object obj) throws IOException {
        if (obj instanceof zzte) {
            this.f46363a.mo43273b(i, (zzte) obj);
        } else {
            this.f46363a.mo43272b(i, (C16615ij) obj);
        }
    }

    /* renamed from: a */
    public final void mo42856a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m54937f(((Integer) list.get(i4)).intValue());
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43251a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43270b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo42864b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43281d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43283e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo42867c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m54933d(((Long) list.get(i4)).longValue());
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43261a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43255a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo42870d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m54936e(((Long) list.get(i4)).longValue());
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43261a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43255a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo42873e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43279c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43278c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo42875f(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43250a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43253a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo42876g(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43249a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43252a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo42877h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m54948i(((Integer) list.get(i4)).intValue());
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43251a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43270b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo42878i(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43267a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43260a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo42854a(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C16598ht) {
            C16598ht htVar = (C16598ht) list;
            while (i2 < list.size()) {
                Object b = htVar.mo42964b(i2);
                if (b instanceof String) {
                    this.f46363a.mo43259a(i, (String) b);
                } else {
                    this.f46363a.mo43258a(i, (zzte) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43259a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo42862b(int i, List<zzte> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f46363a.mo43258a(i, (zzte) list.get(i2));
        }
    }

    /* renamed from: j */
    public final void mo42879j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m54941g(((Integer) list.get(i4)).intValue());
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43269b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43277c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo42880k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43281d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43283e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo42881l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43279c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43278c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo42882m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m54945h(((Integer) list.get(i4)).intValue());
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43276c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43282d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo42883n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46363a.mo43254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m54940f(((Long) list.get(i4)).longValue());
            }
            this.f46363a.mo43269b(i3);
            while (i2 < list.size()) {
                this.f46363a.mo43274b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46363a.mo43271b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo42855a(int i, List<?> list, C16633ja jaVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo42852a(i, list.get(i2), jaVar);
        }
    }

    /* renamed from: b */
    public final void mo42863b(int i, List<?> list, C16633ja jaVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo42861b(i, list.get(i2), jaVar);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo42849a(int i, C16609id<K, V> idVar, Map<K, V> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            this.f46363a.mo43254a(i, 2);
            this.f46363a.mo43269b(C16608ic.m54242a(idVar, entry.getKey(), entry.getValue()));
            C16608ic.m54243a(this.f46363a, idVar, entry.getKey(), entry.getValue());
        }
    }
}

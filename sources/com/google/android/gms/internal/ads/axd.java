package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15550e;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class axd implements bbe {

    /* renamed from: a */
    private final zzccv f41161a;

    /* renamed from: a */
    public static axd m47577a(zzccv zzccv) {
        if (zzccv.f45692a != null) {
            return zzccv.f45692a;
        }
        return new axd(zzccv);
    }

    private axd(zzccv zzccv) {
        this.f41161a = (zzccv) axw.m47745a(zzccv, "output");
    }

    /* renamed from: a */
    public final int mo40198a() {
        return C15550e.f41208j;
    }

    /* renamed from: a */
    public final void mo40202a(int i, int i2) throws IOException {
        this.f41161a.mo42330e(i, i2);
    }

    /* renamed from: a */
    public final void mo40203a(int i, long j) throws IOException {
        this.f41161a.mo42301a(i, j);
    }

    /* renamed from: b */
    public final void mo40215b(int i, long j) throws IOException {
        this.f41161a.mo42325c(i, j);
    }

    /* renamed from: a */
    public final void mo40201a(int i, float f) throws IOException {
        this.f41161a.mo42299a(i, f);
    }

    /* renamed from: a */
    public final void mo40200a(int i, double d) throws IOException {
        this.f41161a.mo42298a(i, d);
    }

    /* renamed from: b */
    public final void mo40214b(int i, int i2) throws IOException {
        this.f41161a.mo42316b(i, i2);
    }

    /* renamed from: c */
    public final void mo40221c(int i, long j) throws IOException {
        this.f41161a.mo42301a(i, j);
    }

    /* renamed from: c */
    public final void mo40220c(int i, int i2) throws IOException {
        this.f41161a.mo42316b(i, i2);
    }

    /* renamed from: d */
    public final void mo40224d(int i, long j) throws IOException {
        this.f41161a.mo42325c(i, j);
    }

    /* renamed from: d */
    public final void mo40223d(int i, int i2) throws IOException {
        this.f41161a.mo42330e(i, i2);
    }

    /* renamed from: a */
    public final void mo40212a(int i, boolean z) throws IOException {
        this.f41161a.mo42306a(i, z);
    }

    /* renamed from: a */
    public final void mo40208a(int i, String str) throws IOException {
        this.f41161a.mo42305a(i, str);
    }

    /* renamed from: a */
    public final void mo40205a(int i, zzcce zzcce) throws IOException {
        this.f41161a.mo42304a(i, zzcce);
    }

    /* renamed from: e */
    public final void mo40226e(int i, int i2) throws IOException {
        this.f41161a.mo42324c(i, i2);
    }

    /* renamed from: f */
    public final void mo40229f(int i, int i2) throws IOException {
        this.f41161a.mo42329d(i, i2);
    }

    /* renamed from: e */
    public final void mo40227e(int i, long j) throws IOException {
        this.f41161a.mo42317b(i, j);
    }

    /* renamed from: a */
    public final void mo40207a(int i, Object obj, azs azs) throws IOException {
        this.f41161a.mo42303a(i, (aza) obj, azs);
    }

    /* renamed from: b */
    public final void mo40216b(int i, Object obj, azs azs) throws IOException {
        zzccv zzccv = this.f41161a;
        aza aza = (aza) obj;
        zzccv.mo42300a(i, 3);
        azs.mo40347a(aza, (bbe) zzccv.f45692a);
        zzccv.mo42300a(i, 4);
    }

    /* renamed from: a */
    public final void mo40199a(int i) throws IOException {
        this.f41161a.mo42300a(i, 3);
    }

    /* renamed from: b */
    public final void mo40213b(int i) throws IOException {
        this.f41161a.mo42300a(i, 4);
    }

    /* renamed from: a */
    public final void mo40206a(int i, Object obj) throws IOException {
        if (obj instanceof zzcce) {
            this.f41161a.mo42319b(i, (zzcce) obj);
        } else {
            this.f41161a.mo42318b(i, (aza) obj);
        }
    }

    /* renamed from: a */
    public final void mo40211a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzccv.m53022f(((Integer) list.get(i4)).intValue());
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42297a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42316b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo40219b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42328d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42330e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo40222c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzccv.m53017d(((Long) list.get(i4)).longValue());
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42307a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42301a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo40225d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzccv.m53021e(((Long) list.get(i4)).longValue());
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42307a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42301a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo40228e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42326c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42325c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo40230f(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42296a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42299a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo40231g(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42295a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42298a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo40232h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzccv.m53033i(((Integer) list.get(i4)).intValue());
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42297a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42316b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo40233i(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42313a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42306a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo40209a(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof ayk) {
            ayk ayk = (ayk) list;
            while (i2 < list.size()) {
                Object b = ayk.mo40318b(i2);
                if (b instanceof String) {
                    this.f41161a.mo42305a(i, (String) b);
                } else {
                    this.f41161a.mo42304a(i, (zzcce) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42305a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo40217b(int i, List<zzcce> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f41161a.mo42304a(i, (zzcce) list.get(i2));
        }
    }

    /* renamed from: j */
    public final void mo40234j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzccv.m53026g(((Integer) list.get(i4)).intValue());
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42315b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42324c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo40235k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42328d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42330e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo40236l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42326c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42325c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo40237m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzccv.m53030h(((Integer) list.get(i4)).intValue());
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42323c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42329d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo40238n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41161a.mo42300a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzccv.m53025f(((Long) list.get(i4)).longValue());
            }
            this.f41161a.mo42315b(i3);
            while (i2 < list.size()) {
                this.f41161a.mo42320b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41161a.mo42317b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo40210a(int i, List<?> list, azs azs) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo40207a(i, list.get(i2), azs);
        }
    }

    /* renamed from: b */
    public final void mo40218b(int i, List<?> list, azs azs) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo40216b(i, list.get(i2), azs);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo40204a(int i, ayu<K, V> ayu, Map<K, V> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            this.f41161a.mo42300a(i, 2);
            this.f41161a.mo42315b(ayt.m47802a(ayu, entry.getKey(), entry.getValue()));
            ayt.m47803a(this.f41161a, ayu, entry.getKey(), entry.getValue());
        }
    }
}

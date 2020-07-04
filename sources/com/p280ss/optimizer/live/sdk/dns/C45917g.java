package com.p280ss.optimizer.live.sdk.dns;

import android.support.p022v4.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: com.ss.optimizer.live.sdk.dns.g */
final class C45917g {

    /* renamed from: a */
    public final String f117369a;

    /* renamed from: b */
    public C45921j f117370b;

    /* renamed from: c */
    public final Map<String, C45919h> f117371c = new ArrayMap();

    /* renamed from: d */
    public String f117372d = null;

    /* renamed from: e */
    private final Random f117373e;

    /* renamed from: f */
    private C45921j f117374f;

    /* renamed from: g */
    private final List<String> f117375g = new ArrayList(10);

    /* renamed from: h */
    private final List<String> f117376h = new ArrayList();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final List<String> mo111203b() {
        return Collections.unmodifiableList(this.f117375g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo111199a() {
        if (this.f117376h != null && !this.f117376h.isEmpty()) {
            return (String) this.f117376h.get(this.f117373e.nextInt(this.f117376h.size()));
        }
        if (this.f117374f != null && this.f117374f.f117386b != null && !this.f117374f.f117386b.isEmpty()) {
            return (String) this.f117374f.f117386b.get(this.f117373e.nextInt(this.f117374f.f117386b.size()));
        }
        if (this.f117370b == null || this.f117370b.f117386b == null || this.f117370b.f117386b.isEmpty()) {
            return null;
        }
        return (String) this.f117370b.f117386b.get(this.f117373e.nextInt(this.f117370b.f117386b.size()));
    }

    /* renamed from: c */
    private boolean m144023c() {
        this.f117375g.clear();
        if (this.f117374f == null || this.f117370b == null) {
            return false;
        }
        if (this.f117374f.f117386b.size() > 5) {
            this.f117375g.addAll(this.f117374f.f117386b.subList(0, 5));
        } else {
            this.f117375g.addAll(this.f117374f.f117386b);
        }
        ArrayList arrayList = new ArrayList(this.f117370b.f117386b);
        arrayList.removeAll(this.f117374f.f117386b);
        int size = 10 - this.f117375g.size();
        if (arrayList.size() >= size) {
            this.f117375g.addAll(arrayList.subList(0, size));
        } else {
            this.f117375g.addAll(arrayList);
            int size2 = 10 - this.f117375g.size();
            if (this.f117374f.f117386b.size() - 5 > size2) {
                this.f117375g.addAll(this.f117374f.f117386b.subList(5, size2 + 5));
            } else if (this.f117374f.f117386b.size() - 5 > 0) {
                this.f117375g.addAll(this.f117374f.f117386b.subList(5, this.f117374f.f117386b.size()));
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo111202a(C45921j jVar) {
        this.f117374f = jVar;
        return m144023c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo111200a(String str) {
        if (this.f117374f.f117386b.contains(str)) {
            return this.f117372d;
        }
        return "local_dns";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo111204b(C45921j jVar) {
        this.f117370b = jVar;
        return m144023c();
    }

    C45917g(String str) {
        this.f117369a = str;
        this.f117373e = new Random(System.currentTimeMillis());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo111201a(C45919h hVar) {
        boolean z;
        this.f117371c.put(hVar.f117378a, hVar);
        if (this.f117371c.size() == this.f117375g.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList arrayList = new ArrayList(this.f117375g);
            Collections.sort(arrayList, new Comparator<String>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public int compare(String str, String str2) {
                    C45919h hVar = (C45919h) C45917g.this.f117371c.get(str);
                    C45919h hVar2 = (C45919h) C45917g.this.f117371c.get(str2);
                    if (hVar == null && hVar2 == null) {
                        return 0;
                    }
                    if (hVar == null) {
                        return 1;
                    }
                    if (hVar2 == null) {
                        return -1;
                    }
                    int signum = (int) Math.signum(hVar.f117380c - hVar2.f117380c);
                    if (signum == 0) {
                        signum = (int) Math.signum(hVar.f117381d - hVar2.f117381d);
                    }
                    return signum;
                }
            });
            this.f117376h.clear();
            if (arrayList.size() <= 3) {
                this.f117376h.addAll(arrayList);
            } else {
                this.f117376h.addAll(arrayList.subList(0, 3));
            }
        }
        return z;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class azh<T> implements azs<T> {

    /* renamed from: a */
    private final aza f41267a;

    /* renamed from: b */
    private final bak<?, ?> f41268b;

    /* renamed from: c */
    private final boolean f41269c;

    /* renamed from: d */
    private final axj<?> f41270d;

    private azh(bak<?, ?> bak, axj<?> axj, aza aza) {
        this.f41268b = bak;
        this.f41269c = axj.mo40253a(aza);
        this.f41270d = axj;
        this.f41267a = aza;
    }

    /* renamed from: a */
    static <T> azh<T> m47900a(bak<?, ?> bak, axj<?> axj, aza aza) {
        return new azh<>(bak, axj, aza);
    }

    /* renamed from: a */
    public final T mo40345a() {
        return this.f41267a.mo40287n().mo40292d();
    }

    /* renamed from: a */
    public final boolean mo40349a(T t, T t2) {
        if (!this.f41268b.mo40410b(t).equals(this.f41268b.mo40410b(t2))) {
            return false;
        }
        if (this.f41269c) {
            return this.f41270d.mo40247a((Object) t).equals(this.f41270d.mo40247a((Object) t2));
        }
        return true;
    }

    /* renamed from: a */
    public final int mo40343a(T t) {
        int hashCode = this.f41268b.mo40410b(t).hashCode();
        return this.f41269c ? (hashCode * 53) + this.f41270d.mo40247a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo40351b(T t, T t2) {
        azu.m47992a(this.f41268b, t, t2);
        if (this.f41269c) {
            azu.m47990a(this.f41270d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo40347a(T t, bbe bbe) throws IOException {
        Iterator d = this.f41270d.mo40247a((Object) t).mo40260d();
        while (d.hasNext()) {
            Entry entry = (Entry) d.next();
            axo axo = (axo) entry.getKey();
            if (axo.mo40271c() != zzcha.MESSAGE || axo.mo40272d() || axo.mo40273e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof ayg) {
                bbe.mo40206a(axo.mo40267a(), (Object) ((ayg) entry).mo40307a().mo40316c());
            } else {
                bbe.mo40206a(axo.mo40267a(), entry.getValue());
            }
        }
        bak<?, ?> bak = this.f41268b;
        bak.mo40412b(bak.mo40410b(t), bbe);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40348a(T r9, byte[] r10, int r11, int r12, com.google.android.gms.internal.ads.awj r13) throws java.io.IOException {
        /*
            r8 = this;
            r0 = r9
            com.google.android.gms.internal.ads.axu r0 = (com.google.android.gms.internal.ads.axu) r0
            com.google.android.gms.internal.ads.bal r1 = r0.zzfza
            com.google.android.gms.internal.ads.bal r2 = com.google.android.gms.internal.ads.bal.m48096a()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.ads.bal r1 = com.google.android.gms.internal.ads.bal.m48099b()
            r0.zzfza = r1
        L_0x0011:
            com.google.android.gms.internal.ads.axu$c r9 = (com.google.android.gms.internal.ads.axu.C15548c) r9
            com.google.android.gms.internal.ads.axm<java.lang.Object> r0 = r9.zzfzg
            boolean r0 = r0.f41176a
            if (r0 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.axm<java.lang.Object> r0 = r9.zzfzg
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.axm r0 = (com.google.android.gms.internal.ads.axm) r0
            r9.zzfzg = r0
        L_0x0023:
            r9 = 0
            r0 = r9
        L_0x0025:
            if (r11 >= r12) goto L_0x00aa
            int r4 = com.google.android.gms.internal.ads.awi.m47428a(r10, r11, r13)
            int r2 = r13.f41128a
            r11 = 11
            r3 = 2
            if (r2 == r11) goto L_0x005b
            r11 = r2 & 7
            if (r11 != r3) goto L_0x0056
            com.google.android.gms.internal.ads.axj<?> r11 = r8.f41270d
            com.google.android.gms.internal.ads.axi r0 = r13.f41131d
            com.google.android.gms.internal.ads.aza r3 = r8.f41267a
            int r5 = r2 >>> 3
            java.lang.Object r11 = r11.mo40248a(r0, r3, r5)
            r0 = r11
            com.google.android.gms.internal.ads.axu$d r0 = (com.google.android.gms.internal.ads.axu.C15549d) r0
            if (r0 != 0) goto L_0x0050
            r3 = r10
            r5 = r12
            r6 = r1
            r7 = r13
            int r11 = com.google.android.gms.internal.ads.awi.m47422a(r2, r3, r4, r5, r6, r7)
            goto L_0x0025
        L_0x0050:
            java.lang.NoSuchMethodError r9 = new java.lang.NoSuchMethodError
            r9.<init>()
            throw r9
        L_0x0056:
            int r11 = com.google.android.gms.internal.ads.awi.m47420a(r2, r10, r4, r12, r13)
            goto L_0x0025
        L_0x005b:
            r11 = 0
            r11 = r9
            r2 = 0
        L_0x005e:
            if (r4 >= r12) goto L_0x009f
            int r4 = com.google.android.gms.internal.ads.awi.m47428a(r10, r4, r13)
            int r5 = r13.f41128a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            switch(r6) {
                case 2: goto L_0x0081;
                case 3: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0096
        L_0x006e:
            if (r0 != 0) goto L_0x007b
            if (r7 != r3) goto L_0x0096
            int r4 = com.google.android.gms.internal.ads.awi.m47436e(r10, r4, r13)
            java.lang.Object r11 = r13.f41130c
            com.google.android.gms.internal.ads.zzcce r11 = (com.google.android.gms.internal.ads.zzcce) r11
            goto L_0x005e
        L_0x007b:
            java.lang.NoSuchMethodError r9 = new java.lang.NoSuchMethodError
            r9.<init>()
            throw r9
        L_0x0081:
            if (r7 != 0) goto L_0x0096
            int r4 = com.google.android.gms.internal.ads.awi.m47428a(r10, r4, r13)
            int r2 = r13.f41128a
            com.google.android.gms.internal.ads.axj<?> r0 = r8.f41270d
            com.google.android.gms.internal.ads.axi r5 = r13.f41131d
            com.google.android.gms.internal.ads.aza r6 = r8.f41267a
            java.lang.Object r0 = r0.mo40248a(r5, r6, r2)
            com.google.android.gms.internal.ads.axu$d r0 = (com.google.android.gms.internal.ads.axu.C15549d) r0
            goto L_0x005e
        L_0x0096:
            r6 = 12
            if (r5 == r6) goto L_0x009f
            int r4 = com.google.android.gms.internal.ads.awi.m47420a(r5, r10, r4, r12, r13)
            goto L_0x005e
        L_0x009f:
            if (r11 == 0) goto L_0x00a7
            int r2 = r2 << 3
            r2 = r2 | r3
            r1.mo40419a(r2, r11)
        L_0x00a7:
            r11 = r4
            goto L_0x0025
        L_0x00aa:
            if (r11 != r12) goto L_0x00ad
            return
        L_0x00ad:
            com.google.android.gms.internal.ads.zzcdx r9 = com.google.android.gms.internal.ads.zzcdx.zzaua()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azh.mo40348a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.awj):void");
    }

    /* renamed from: a */
    public final void mo40346a(T t, azr azr, axi axi) throws IOException {
        boolean z;
        bak<?, ?> bak = this.f41268b;
        axj<?> axj = this.f41270d;
        Object c = bak.mo40414c(t);
        axm b = axj.mo40254b(t);
        do {
            try {
                if (azr.mo40156a() == Integer.MAX_VALUE) {
                    bak.mo40413b((Object) t, c);
                    return;
                }
                int b2 = azr.mo40161b();
                if (b2 == 11) {
                    Object obj = null;
                    zzcce zzcce = null;
                    int i = 0;
                    while (azr.mo40156a() != Integer.MAX_VALUE) {
                        int b3 = azr.mo40161b();
                        if (b3 == 16) {
                            i = azr.mo40189o();
                            obj = axj.mo40248a(axi, this.f41267a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                axj.mo40250a(azr, obj, axi, b);
                            } else {
                                zzcce = azr.mo40187n();
                            }
                        } else if (!azr.mo40166c()) {
                            break;
                        }
                    }
                    if (azr.mo40161b() != 12) {
                        throw zzcdx.zzaty();
                    } else if (zzcce != null) {
                        if (obj != null) {
                            axj.mo40252a(zzcce, obj, axi, b);
                        } else {
                            bak.mo40405a(c, i, zzcce);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = axj.mo40248a(axi, this.f41267a, b2 >>> 3);
                    if (a != null) {
                        axj.mo40250a(azr, a, axi, b);
                    } else {
                        z = bak.mo40409a(c, azr);
                        continue;
                    }
                } else {
                    z = azr.mo40166c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                bak.mo40413b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: c */
    public final void mo40352c(T t) {
        this.f41268b.mo40416d(t);
        this.f41270d.mo40255c(t);
    }

    /* renamed from: d */
    public final boolean mo40353d(T t) {
        return this.f41270d.mo40247a((Object) t).mo40263f();
    }

    /* renamed from: b */
    public final int mo40350b(T t) {
        bak<?, ?> bak = this.f41268b;
        int e = bak.mo40417e(bak.mo40410b(t)) + 0;
        return this.f41269c ? e + this.f41270d.mo40247a((Object) t).mo40265h() : e;
    }
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16572gz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.gx */
final class C16570gx<FieldDescriptorType extends C16572gz<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C16570gx f46376d = new C16570gx(true);

    /* renamed from: a */
    public boolean f46377a;

    /* renamed from: b */
    private final C16636jd<FieldDescriptorType, Object> f46378b = C16636jd.m54458a(16);

    /* renamed from: c */
    private boolean f46379c;

    private C16570gx() {
    }

    private C16570gx(boolean z) {
        mo42904c();
    }

    /* renamed from: a */
    public static <T extends C16572gz<T>> C16570gx<T> m54110a() {
        return f46376d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo42903b() {
        return this.f46378b.isEmpty();
    }

    /* renamed from: c */
    public final void mo42904c() {
        if (!this.f46377a) {
            this.f46378b.mo43007a();
            this.f46377a = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16570gx)) {
            return false;
        }
        return this.f46378b.equals(((C16570gx) obj).f46378b);
    }

    public final int hashCode() {
        return this.f46378b.hashCode();
    }

    /* renamed from: d */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo42906d() {
        if (this.f46379c) {
            return new C16595hq(this.f46378b.entrySet().iterator());
        }
        return this.f46378b.entrySet().iterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo42907e() {
        if (this.f46379c) {
            return new C16595hq(this.f46378b.mo43013d().iterator());
        }
        return this.f46378b.mo43013d().iterator();
    }

    /* renamed from: a */
    private final Object m54111a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f46378b.get(fielddescriptortype);
        return obj instanceof C16591hm ? C16591hm.m54196a() : obj;
    }

    /* renamed from: a */
    private final void m54113a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo42918d()) {
            m54115a(fielddescriptortype.mo42916b(), obj);
            r7 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m54115a(fielddescriptortype.mo42916b(), obj2);
            }
            r7 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r7 instanceof C16591hm) {
            this.f46379c = true;
        }
        this.f46378b.put(fielddescriptortype, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C16591hm) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C16587hi) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m54115a(com.google.android.gms.internal.measurement.zzxs r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.C16586hh.m54186a(r3)
            int[] r0 = com.google.android.gms.internal.measurement.C16571gy.f46380a
            com.google.android.gms.internal.measurement.zzxx r2 = r2.zzyv()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C16615ij
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C16591hm
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C16587hi
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzte
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16570gx.m54115a(com.google.android.gms.internal.measurement.zzxs, java.lang.Object):void");
    }

    /* renamed from: f */
    public final boolean mo42909f() {
        for (int i = 0; i < this.f46378b.mo43008b(); i++) {
            if (!m54116a(this.f46378b.mo43009b(i))) {
                return false;
            }
        }
        for (Entry a : this.f46378b.mo43010c()) {
            if (!m54116a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m54116a(Entry<FieldDescriptorType, Object> entry) {
        C16572gz gzVar = (C16572gz) entry.getKey();
        if (gzVar.mo42917c() == zzxx.MESSAGE) {
            if (gzVar.mo42918d()) {
                for (C16615ij f : (List) entry.getValue()) {
                    if (!f.mo42931f()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C16615ij) {
                    if (!((C16615ij) value).mo42931f()) {
                        return false;
                    }
                } else if (value instanceof C16591hm) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo42902a(C16570gx<FieldDescriptorType> gxVar) {
        for (int i = 0; i < gxVar.f46378b.mo43008b(); i++) {
            m54119b(gxVar.f46378b.mo43009b(i));
        }
        for (Entry b : gxVar.f46378b.mo43010c()) {
            m54119b(b);
        }
    }

    /* renamed from: a */
    private static Object m54112a(Object obj) {
        if (obj instanceof C16622iq) {
            return ((C16622iq) obj).mo42999a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: b */
    private final void m54119b(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        C16572gz gzVar = (C16572gz) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C16591hm) {
            value = C16591hm.m54196a();
        }
        if (gzVar.mo42918d()) {
            Object a = m54111a((FieldDescriptorType) gzVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m54112a(a2));
            }
            this.f46378b.put(gzVar, a);
        } else if (gzVar.mo42917c() == zzxx.MESSAGE) {
            Object a3 = m54111a((FieldDescriptorType) gzVar);
            if (a3 == null) {
                this.f46378b.put(gzVar, m54112a(value));
                return;
            }
            if (a3 instanceof C16622iq) {
                obj = gzVar.mo42915a((C16622iq) a3, (C16622iq) value);
            } else {
                obj = gzVar.mo42914a(((C16615ij) a3).mo42935j(), (C16615ij) value).mo42942d();
            }
            this.f46378b.put(gzVar, obj);
        } else {
            this.f46378b.put(gzVar, m54112a(value));
        }
    }

    /* renamed from: a */
    static void m54114a(zztv zztv, zzxs zzxs, int i, Object obj) throws IOException {
        if (zzxs == zzxs.GROUP) {
            C16615ij ijVar = (C16615ij) obj;
            zztv.mo43254a(i, 3);
            ijVar.mo42929a(zztv);
            zztv.mo43254a(i, 4);
            return;
        }
        zztv.mo43254a(i, zzxs.zzyw());
        switch (C16571gy.f46381b[zzxs.ordinal()]) {
            case 1:
                zztv.mo43249a(((Double) obj).doubleValue());
                return;
            case 2:
                zztv.mo43250a(((Float) obj).floatValue());
                return;
            case 3:
                zztv.mo43261a(((Long) obj).longValue());
                return;
            case 4:
                zztv.mo43261a(((Long) obj).longValue());
                return;
            case 5:
                zztv.mo43251a(((Integer) obj).intValue());
                return;
            case 6:
                zztv.mo43279c(((Long) obj).longValue());
                return;
            case 7:
                zztv.mo43281d(((Integer) obj).intValue());
                return;
            case 8:
                zztv.mo43267a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C16615ij) obj).mo42929a(zztv);
                return;
            case 10:
                zztv.mo43262a((C16615ij) obj);
                return;
            case 11:
                if (obj instanceof zzte) {
                    zztv.mo43264a((zzte) obj);
                    return;
                } else {
                    zztv.mo43265a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzte) {
                    zztv.mo43264a((zzte) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zztv.mo43280c(bArr, 0, bArr.length);
                return;
            case 13:
                zztv.mo43269b(((Integer) obj).intValue());
                return;
            case 14:
                zztv.mo43281d(((Integer) obj).intValue());
                return;
            case 15:
                zztv.mo43279c(((Long) obj).longValue());
                return;
            case 16:
                zztv.mo43276c(((Integer) obj).intValue());
                return;
            case 17:
                zztv.mo43274b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof C16587hi)) {
                    zztv.mo43251a(((Integer) obj).intValue());
                    break;
                } else {
                    zztv.mo43251a(((C16587hi) obj).zzc());
                    return;
                }
        }
    }

    /* renamed from: g */
    public final int mo42910g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f46378b.mo43008b(); i2++) {
            Entry b = this.f46378b.mo43009b(i2);
            i += m54117b((C16572gz) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f46378b.mo43010c()) {
            i += m54117b((C16572gz) entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: h */
    public final int mo42911h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f46378b.mo43008b(); i2++) {
            i += m54120c(this.f46378b.mo43009b(i2));
        }
        for (Entry c : this.f46378b.mo43010c()) {
            i += m54120c(c);
        }
        return i;
    }

    /* renamed from: c */
    private static int m54120c(Entry<FieldDescriptorType, Object> entry) {
        C16572gz gzVar = (C16572gz) entry.getKey();
        Object value = entry.getValue();
        if (gzVar.mo42917c() != zzxx.MESSAGE || gzVar.mo42918d() || gzVar.mo42919e()) {
            return m54117b(gzVar, value);
        }
        if (value instanceof C16591hm) {
            return zztv.m54916b(((C16572gz) entry.getKey()).mo42913a(), (C16596hr) (C16591hm) value);
        }
        return zztv.m54931d(((C16572gz) entry.getKey()).mo42913a(), (C16615ij) value);
    }

    /* renamed from: a */
    static int m54109a(zzxs zzxs, int i, Object obj) {
        int e = zztv.m54934e(i);
        if (zzxs == zzxs.GROUP) {
            e <<= 1;
        }
        return e + m54118b(zzxs, obj);
    }

    /* renamed from: b */
    private static int m54118b(zzxs zzxs, Object obj) {
        switch (C16571gy.f46381b[zzxs.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return zztv.m54933d(((Long) obj).longValue());
            case 4:
                return zztv.m54936e(((Long) obj).longValue());
            case 5:
                return zztv.m54937f(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return 8;
            case 7:
                ((Integer) obj).intValue();
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return 1;
            case 9:
                return zztv.m54928c((C16615ij) obj);
            case 10:
                if (obj instanceof C16591hm) {
                    return zztv.m54911a((C16596hr) (C16591hm) obj);
                }
                return zztv.m54920b((C16615ij) obj);
            case 11:
                if (obj instanceof zzte) {
                    return zztv.m54922b((zzte) obj);
                }
                return zztv.m54923b((String) obj);
            case 12:
                if (obj instanceof zzte) {
                    return zztv.m54922b((zzte) obj);
                }
                return zztv.m54924b((byte[]) obj);
            case 13:
                return zztv.m54941g(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                return zztv.m54945h(((Integer) obj).intValue());
            case 17:
                return zztv.m54940f(((Long) obj).longValue());
            case 18:
                if (obj instanceof C16587hi) {
                    return zztv.m54948i(((C16587hi) obj).zzc());
                }
                return zztv.m54948i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private static int m54117b(C16572gz<?> gzVar, Object obj) {
        zzxs b = gzVar.mo42916b();
        int a = gzVar.mo42913a();
        if (!gzVar.mo42918d()) {
            return m54109a(b, a, obj);
        }
        int i = 0;
        if (gzVar.mo42919e()) {
            for (Object b2 : (List) obj) {
                i += m54118b(b, b2);
            }
            return zztv.m54934e(a) + i + zztv.m54950j(i);
        }
        for (Object a2 : (List) obj) {
            i += m54109a(b, a, a2);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C16570gx gxVar = new C16570gx();
        for (int i = 0; i < this.f46378b.mo43008b(); i++) {
            Entry b = this.f46378b.mo43009b(i);
            gxVar.m54113a((FieldDescriptorType) (C16572gz) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f46378b.mo43010c()) {
            gxVar.m54113a((FieldDescriptorType) (C16572gz) entry.getKey(), entry.getValue());
        }
        gxVar.f46379c = this.f46379c;
        return gxVar;
    }
}

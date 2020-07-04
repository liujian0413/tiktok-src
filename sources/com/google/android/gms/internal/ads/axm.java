package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class axm<FieldDescriptorType extends axo<FieldDescriptorType>> {

    /* renamed from: d */
    private static final axm f41175d = new axm(true);

    /* renamed from: a */
    public boolean f41176a;

    /* renamed from: b */
    private final azv<FieldDescriptorType, Object> f41177b = azv.m48035a(16);

    /* renamed from: c */
    private boolean f41178c;

    private axm() {
    }

    private axm(boolean z) {
        mo40258c();
    }

    /* renamed from: a */
    public static <T extends axo<T>> axm<T> m47658a() {
        return f41175d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo40257b() {
        return this.f41177b.isEmpty();
    }

    /* renamed from: c */
    public final void mo40258c() {
        if (!this.f41176a) {
            this.f41177b.mo40361a();
            this.f41176a = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axm)) {
            return false;
        }
        return this.f41177b.equals(((axm) obj).f41177b);
    }

    public final int hashCode() {
        return this.f41177b.hashCode();
    }

    /* renamed from: d */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo40260d() {
        if (this.f41178c) {
            return new ayh(this.f41177b.entrySet().iterator());
        }
        return this.f41177b.entrySet().iterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo40261e() {
        if (this.f41178c) {
            return new ayh(this.f41177b.mo40367d().iterator());
        }
        return this.f41177b.mo40367d().iterator();
    }

    /* renamed from: a */
    private final Object m47659a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f41177b.get(fielddescriptortype);
        return obj instanceof aye ? aye.m47758a() : obj;
    }

    /* renamed from: a */
    private final void m47661a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo40272d()) {
            m47663a(fielddescriptortype.mo40270b(), obj);
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
                m47663a(fielddescriptortype.mo40270b(), obj2);
            }
            r7 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r7 instanceof aye) {
            this.f41178c = true;
        }
        this.f41177b.put(fielddescriptortype, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.aye) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.axx) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m47663a(com.google.android.gms.internal.ads.zzcgv r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.axw.m47743a(r3)
            int[] r0 = com.google.android.gms.internal.ads.axn.f41179a
            com.google.android.gms.internal.ads.zzcha r2 = r2.zzawa()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.aza
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.aye
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.axx
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzcce
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axm.m47663a(com.google.android.gms.internal.ads.zzcgv, java.lang.Object):void");
    }

    /* renamed from: f */
    public final boolean mo40263f() {
        for (int i = 0; i < this.f41177b.mo40362b(); i++) {
            if (!m47664a(this.f41177b.mo40363b(i))) {
                return false;
            }
        }
        for (Entry a : this.f41177b.mo40364c()) {
            if (!m47664a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m47664a(Entry<FieldDescriptorType, Object> entry) {
        axo axo = (axo) entry.getKey();
        if (axo.mo40271c() == zzcha.MESSAGE) {
            if (axo.mo40272d()) {
                for (aza i : (List) entry.getValue()) {
                    if (!i.mo40284i()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof aza) {
                    if (!((aza) value).mo40284i()) {
                        return false;
                    }
                } else if (value instanceof aye) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo40256a(axm<FieldDescriptorType> axm) {
        for (int i = 0; i < axm.f41177b.mo40362b(); i++) {
            m47667b(axm.f41177b.mo40363b(i));
        }
        for (Entry b : axm.f41177b.mo40364c()) {
            m47667b(b);
        }
    }

    /* renamed from: a */
    private static Object m47660a(Object obj) {
        if (obj instanceof azi) {
            return ((azi) obj).mo40354a();
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
    private final void m47667b(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        axo axo = (axo) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aye) {
            value = aye.m47758a();
        }
        if (axo.mo40272d()) {
            Object a = m47659a((FieldDescriptorType) axo);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m47660a(a2));
            }
            this.f41177b.put(axo, a);
        } else if (axo.mo40271c() == zzcha.MESSAGE) {
            Object a3 = m47659a((FieldDescriptorType) axo);
            if (a3 == null) {
                this.f41177b.put(axo, m47660a(value));
                return;
            }
            if (a3 instanceof azi) {
                obj = axo.mo40269a((azi) a3, (azi) value);
            } else {
                obj = axo.mo40268a(((aza) a3).mo40286m(), (aza) value).mo40293e();
            }
            this.f41177b.put(axo, obj);
        } else {
            this.f41177b.put(axo, m47660a(value));
        }
    }

    /* renamed from: a */
    static void m47662a(zzccv zzccv, zzcgv zzcgv, int i, Object obj) throws IOException {
        if (zzcgv == zzcgv.GROUP) {
            aza aza = (aza) obj;
            zzccv.mo42300a(i, 3);
            aza.mo40281a(zzccv);
            zzccv.mo42300a(i, 4);
            return;
        }
        zzccv.mo42300a(i, zzcgv.zzawb());
        switch (axn.f41180b[zzcgv.ordinal()]) {
            case 1:
                zzccv.mo42295a(((Double) obj).doubleValue());
                return;
            case 2:
                zzccv.mo42296a(((Float) obj).floatValue());
                return;
            case 3:
                zzccv.mo42307a(((Long) obj).longValue());
                return;
            case 4:
                zzccv.mo42307a(((Long) obj).longValue());
                return;
            case 5:
                zzccv.mo42297a(((Integer) obj).intValue());
                return;
            case 6:
                zzccv.mo42326c(((Long) obj).longValue());
                return;
            case 7:
                zzccv.mo42328d(((Integer) obj).intValue());
                return;
            case 8:
                zzccv.mo42313a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((aza) obj).mo40281a(zzccv);
                return;
            case 10:
                zzccv.mo42308a((aza) obj);
                return;
            case 11:
                if (obj instanceof zzcce) {
                    zzccv.mo42310a((zzcce) obj);
                    return;
                } else {
                    zzccv.mo42311a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzcce) {
                    zzccv.mo42310a((zzcce) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzccv.mo42327c(bArr, 0, bArr.length);
                return;
            case 13:
                zzccv.mo42315b(((Integer) obj).intValue());
                return;
            case 14:
                zzccv.mo42328d(((Integer) obj).intValue());
                return;
            case 15:
                zzccv.mo42326c(((Long) obj).longValue());
                return;
            case 16:
                zzccv.mo42323c(((Integer) obj).intValue());
                return;
            case 17:
                zzccv.mo42320b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof axx)) {
                    zzccv.mo42297a(((Integer) obj).intValue());
                    break;
                } else {
                    zzccv.mo42297a(((axx) obj).zzac());
                    return;
                }
        }
    }

    /* renamed from: g */
    public final int mo40264g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f41177b.mo40362b(); i2++) {
            Entry b = this.f41177b.mo40363b(i2);
            i += m47665b((axo) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f41177b.mo40364c()) {
            i += m47665b((axo) entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: h */
    public final int mo40265h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f41177b.mo40362b(); i2++) {
            i += m47668c(this.f41177b.mo40363b(i2));
        }
        for (Entry c : this.f41177b.mo40364c()) {
            i += m47668c(c);
        }
        return i;
    }

    /* renamed from: c */
    private static int m47668c(Entry<FieldDescriptorType, Object> entry) {
        axo axo = (axo) entry.getKey();
        Object value = entry.getValue();
        if (axo.mo40271c() != zzcha.MESSAGE || axo.mo40272d() || axo.mo40273e()) {
            return m47665b(axo, value);
        }
        if (value instanceof aye) {
            return zzccv.m53001b(((axo) entry.getKey()).mo40267a(), (ayi) (aye) value);
        }
        return zzccv.m53015d(((axo) entry.getKey()).mo40267a(), (aza) value);
    }

    /* renamed from: a */
    static int m47657a(zzcgv zzcgv, int i, Object obj) {
        int e = zzccv.m53019e(i);
        if (zzcgv == zzcgv.GROUP) {
            e <<= 1;
        }
        return e + m47666b(zzcgv, obj);
    }

    /* renamed from: b */
    private static int m47666b(zzcgv zzcgv, Object obj) {
        switch (axn.f41180b[zzcgv.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return zzccv.m53017d(((Long) obj).longValue());
            case 4:
                return zzccv.m53021e(((Long) obj).longValue());
            case 5:
                return zzccv.m53022f(((Integer) obj).intValue());
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
                return zzccv.m53013c((aza) obj);
            case 10:
                if (obj instanceof aye) {
                    return zzccv.m52996a((ayi) (aye) obj);
                }
                return zzccv.m53005b((aza) obj);
            case 11:
                if (obj instanceof zzcce) {
                    return zzccv.m53007b((zzcce) obj);
                }
                return zzccv.m53008b((String) obj);
            case 12:
                if (obj instanceof zzcce) {
                    return zzccv.m53007b((zzcce) obj);
                }
                return zzccv.m53009b((byte[]) obj);
            case 13:
                return zzccv.m53026g(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                return zzccv.m53030h(((Integer) obj).intValue());
            case 17:
                return zzccv.m53025f(((Long) obj).longValue());
            case 18:
                if (obj instanceof axx) {
                    return zzccv.m53033i(((axx) obj).zzac());
                }
                return zzccv.m53033i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private static int m47665b(axo<?> axo, Object obj) {
        zzcgv b = axo.mo40270b();
        int a = axo.mo40267a();
        if (!axo.mo40272d()) {
            return m47657a(b, a, obj);
        }
        int i = 0;
        if (axo.mo40273e()) {
            for (Object b2 : (List) obj) {
                i += m47666b(b, b2);
            }
            return zzccv.m53019e(a) + i + zzccv.m53035j(i);
        }
        for (Object a2 : (List) obj) {
            i += m47657a(b, a, a2);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        axm axm = new axm();
        for (int i = 0; i < this.f41177b.mo40362b(); i++) {
            Entry b = this.f41177b.mo40363b(i);
            axm.m47661a((FieldDescriptorType) (axo) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f41177b.mo40364c()) {
            axm.m47661a((FieldDescriptorType) (axo) entry.getKey(), entry.getValue());
        }
        axm.f41178c = this.f41178c;
        return axm;
    }
}

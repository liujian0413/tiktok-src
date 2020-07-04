package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.d */
public final class C27650d {

    /* renamed from: a */
    private static final Map<C27679w, Class<?>> f72847a = new ConcurrentHashMap();

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.d$a */
    public static final class C27651a {

        /* renamed from: a */
        public static final C27651a f72848a = new C27651a(0);

        /* renamed from: b */
        public static final C27651a f72849b = new C27651a(1);

        /* renamed from: c */
        public static final C27651a f72850c = new C27651a(2);

        /* renamed from: d */
        public final int f72851d;

        private C27651a(int i) {
            this.f72851d = i;
        }
    }

    static {
        m90656a(C27648b.class);
        m90656a(C27654g.class);
        m90656a(C27659k.class);
        m90656a(C27658j.class);
        m90656a(C27662n.class);
    }

    /* renamed from: a */
    private static C27668s m90655a(C27679w wVar) throws InstantiationException, IllegalAccessException {
        Class cls = (Class) f72847a.get(wVar);
        if (cls != null) {
            return (C27668s) cls.newInstance();
        }
        C27661m mVar = new C27661m();
        mVar.f72871a = wVar;
        return mVar;
    }

    /* renamed from: a */
    private static void m90656a(Class<?> cls) {
        try {
            f72847a.put(((C27668s) cls.newInstance()).mo71050a(), cls);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" doesn't implement ZipExtraField");
            throw new RuntimeException(sb.toString());
        } catch (InstantiationException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls);
            sb2.append(" is not a concrete class");
            throw new RuntimeException(sb2.toString());
        } catch (IllegalAccessException unused3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls);
            sb3.append("'s no-arg constructor is not public");
            throw new RuntimeException(sb3.toString());
        }
    }

    /* renamed from: b */
    public static byte[] m90659b(C27668s[] sVarArr) {
        boolean z;
        int i;
        if (sVarArr.length <= 0 || !(sVarArr[sVarArr.length - 1] instanceof C27660l)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = sVarArr.length - 1;
        } else {
            i = sVarArr.length;
        }
        int i2 = i * 4;
        for (C27668s c : sVarArr) {
            i2 += c.mo71047c().f72965a;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            System.arraycopy(sVarArr[i4].mo71050a().mo71107a(), 0, bArr, i3, 2);
            System.arraycopy(sVarArr[i4].mo71047c().mo71107a(), 0, bArr, i3 + 2, 2);
            byte[] b = sVarArr[i4].mo71046b();
            System.arraycopy(b, 0, bArr, i3 + 4, b.length);
            i3 += b.length + 4;
        }
        if (z) {
            byte[] b2 = sVarArr[sVarArr.length - 1].mo71046b();
            System.arraycopy(b2, 0, bArr, i3, b2.length);
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m90657a(C27668s[] sVarArr) {
        boolean z;
        int i;
        if (sVarArr.length <= 0 || !(sVarArr[sVarArr.length - 1] instanceof C27660l)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = sVarArr.length - 1;
        } else {
            i = sVarArr.length;
        }
        int i2 = i * 4;
        for (C27668s e : sVarArr) {
            i2 += e.mo71049e().f72965a;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            System.arraycopy(sVarArr[i4].mo71050a().mo71107a(), 0, bArr, i3, 2);
            System.arraycopy(sVarArr[i4].mo71049e().mo71107a(), 0, bArr, i3 + 2, 2);
            byte[] d = sVarArr[i4].mo71048d();
            System.arraycopy(d, 0, bArr, i3 + 4, d.length);
            i3 += d.length + 4;
        }
        if (z) {
            byte[] d2 = sVarArr[sVarArr.length - 1].mo71048d();
            System.arraycopy(d2, 0, bArr, i3, d2.length);
        }
        return bArr;
    }

    /* renamed from: a */
    public static C27668s[] m90658a(byte[] bArr, boolean z, C27651a aVar) throws ZipException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i > bArr.length - 4) {
                break;
            }
            C27679w wVar = new C27679w(bArr, i);
            int i2 = new C27679w(bArr, i + 2).f72965a;
            int i3 = i + 4;
            if (i3 + i2 > bArr.length) {
                switch (aVar.f72851d) {
                    case 0:
                        StringBuilder sb = new StringBuilder("bad extra field starting at ");
                        sb.append(i);
                        sb.append(".  Block length of ");
                        sb.append(i2);
                        sb.append(" bytes exceeds remaining data of ");
                        sb.append((bArr.length - i) - 4);
                        sb.append(" bytes.");
                        throw new ZipException(sb.toString());
                    case 1:
                        break;
                    case 2:
                        C27660l lVar = new C27660l();
                        if (z) {
                            lVar.mo71044a(bArr, i, bArr.length - i);
                        } else {
                            lVar.mo71052b(bArr, i, bArr.length - i);
                        }
                        arrayList.add(lVar);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("unknown UnparseableExtraField key: ");
                        sb2.append(aVar.f72851d);
                        throw new ZipException(sb2.toString());
                }
            } else {
                try {
                    C27668s a = m90655a(wVar);
                    if (!z) {
                        if (a instanceof C27649c) {
                            ((C27649c) a).mo71052b(bArr, i3, i2);
                            arrayList.add(a);
                            i += i2 + 4;
                        }
                    }
                    a.mo71044a(bArr, i3, i2);
                    arrayList.add(a);
                    i += i2 + 4;
                } catch (InstantiationException e) {
                    throw new ZipException(e.getMessage());
                } catch (IllegalAccessException e2) {
                    throw new ZipException(e2.getMessage());
                }
            }
        }
        return (C27668s[]) arrayList.toArray(new C27668s[arrayList.size()]);
    }
}

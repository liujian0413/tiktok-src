package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.b */
public class C27648b implements C27668s, Cloneable {

    /* renamed from: e */
    private static final C27679w f72840e = new C27679w(30062);

    /* renamed from: a */
    public int f72841a;

    /* renamed from: b */
    public int f72842b;

    /* renamed from: c */
    public int f72843c;

    /* renamed from: d */
    public String f72844d = "";

    /* renamed from: f */
    private boolean f72845f;

    /* renamed from: g */
    private CRC32 f72846g = new CRC32();

    /* renamed from: a */
    public final C27679w mo71050a() {
        return f72840e;
    }

    /* renamed from: b */
    public final byte[] mo71046b() {
        return mo71048d();
    }

    /* renamed from: c */
    public final C27679w mo71047c() {
        return mo71049e();
    }

    /* renamed from: f */
    private boolean m90646f() {
        if (this.f72844d.length() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m90647g() {
        if (!this.f72845f || m90646f()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final C27679w mo71049e() {
        return new C27679w(this.f72844d.getBytes().length + 14);
    }

    public Object clone() {
        try {
            C27648b bVar = (C27648b) super.clone();
            bVar.f72846g = new CRC32();
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public final byte[] mo71048d() {
        byte[] bArr = new byte[(mo71049e().f72965a - 4)];
        System.arraycopy(C27679w.m90807a(this.f72841a), 0, bArr, 0, 2);
        byte[] bytes = this.f72844d.getBytes();
        System.arraycopy(C27676u.m90767a((long) bytes.length), 0, bArr, 2, 4);
        System.arraycopy(C27679w.m90807a(this.f72842b), 0, bArr, 6, 2);
        System.arraycopy(C27679w.m90807a(this.f72843c), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.f72846g.reset();
        this.f72846g.update(bArr);
        byte[] bArr2 = new byte[(bArr.length + 4)];
        System.arraycopy(C27676u.m90767a(this.f72846g.getValue()), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    private void m90643a(int i) {
        this.f72841a = m90645b(i);
    }

    /* renamed from: a */
    private void m90644a(boolean z) {
        this.f72845f = z;
        this.f72841a = m90645b(this.f72841a);
    }

    /* renamed from: b */
    private int m90645b(int i) {
        int i2;
        if (m90646f()) {
            i2 = 40960;
        } else if (m90647g()) {
            i2 = 16384;
        } else {
            i2 = 32768;
        }
        return (i & 4095) | i2;
    }

    /* renamed from: a */
    public final void mo71044a(byte[] bArr, int i, int i2) throws ZipException {
        long b = C27676u.m90768b(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        boolean z = false;
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.f72846g.reset();
        this.f72846g.update(bArr2);
        long value = this.f72846g.getValue();
        if (b == value) {
            int a = C27679w.m90805a(bArr2, 0);
            byte[] bArr3 = new byte[((int) C27676u.m90768b(bArr2, 2))];
            this.f72842b = C27679w.m90805a(bArr2, 6);
            this.f72843c = C27679w.m90805a(bArr2, 8);
            if (bArr3.length == 0) {
                this.f72844d = "";
            } else {
                System.arraycopy(bArr2, 10, bArr3, 0, bArr3.length);
                this.f72844d = new String(bArr3);
            }
            if ((a & 16384) != 0) {
                z = true;
            }
            m90644a(z);
            m90643a(a);
            return;
        }
        StringBuilder sb = new StringBuilder("bad CRC checksum ");
        sb.append(Long.toHexString(b));
        sb.append(" instead of ");
        sb.append(Long.toHexString(value));
        throw new ZipException(sb.toString());
    }
}

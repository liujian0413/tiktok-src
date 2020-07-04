package com.google.common.hash;

import com.google.common.base.C17439m;
import java.io.Serializable;

/* renamed from: com.google.common.hash.e */
public abstract class C18080e {

    /* renamed from: a */
    private static final char[] f49412a = "0123456789abcdef".toCharArray();

    /* renamed from: com.google.common.hash.e$a */
    static final class C18081a extends C18080e implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final byte[] f49413a;

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final byte[] mo46694e() {
            return this.f49413a;
        }

        /* renamed from: a */
        public final int mo46689a() {
            return this.f49413a.length * 8;
        }

        /* renamed from: d */
        public final byte[] mo46693d() {
            return (byte[]) this.f49413a.clone();
        }

        /* renamed from: c */
        public final long mo46692c() {
            boolean z;
            if (this.f49413a.length >= 8) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57983b(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", this.f49413a.length);
            return m59810f();
        }

        /* renamed from: f */
        private long m59810f() {
            long j = (long) (this.f49413a[0] & 255);
            for (int i = 1; i < Math.min(this.f49413a.length, 8); i++) {
                j |= (((long) this.f49413a[i]) & 255) << (i * 8);
            }
            return j;
        }

        /* renamed from: b */
        public final int mo46691b() {
            boolean z;
            if (this.f49413a.length >= 4) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57983b(z, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", this.f49413a.length);
            return (this.f49413a[0] & 255) | ((this.f49413a[1] & 255) << 8) | ((this.f49413a[2] & 255) << 16) | ((this.f49413a[3] & 255) << 24);
        }

        C18081a(byte[] bArr) {
            this.f49413a = (byte[]) C17439m.m57962a(bArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo46690a(C18080e eVar) {
            boolean z;
            if (this.f49413a.length != eVar.mo46694e().length) {
                return false;
            }
            boolean z2 = true;
            for (int i = 0; i < this.f49413a.length; i++) {
                if (this.f49413a[i] == eVar.mo46694e()[i]) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            return z2;
        }
    }

    C18080e() {
    }

    /* renamed from: a */
    public abstract int mo46689a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo46690a(C18080e eVar);

    /* renamed from: b */
    public abstract int mo46691b();

    /* renamed from: c */
    public abstract long mo46692c();

    /* renamed from: d */
    public abstract byte[] mo46693d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public byte[] mo46694e() {
        return mo46693d();
    }

    public final int hashCode() {
        if (mo46689a() >= 32) {
            return mo46691b();
        }
        byte[] e = mo46694e();
        byte b = e[0] & 255;
        for (int i = 1; i < e.length; i++) {
            b |= (e[i] & 255) << (i * 8);
        }
        return b;
    }

    public final String toString() {
        byte[] e = mo46694e();
        StringBuilder sb = new StringBuilder(e.length * 2);
        for (byte b : e) {
            sb.append(f49412a[(b >> 4) & 15]);
            sb.append(f49412a[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    static C18080e m59803a(byte[] bArr) {
        return new C18081a(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18080e)) {
            return false;
        }
        C18080e eVar = (C18080e) obj;
        if (mo46689a() != eVar.mo46689a() || !mo46690a(eVar)) {
            return false;
        }
        return true;
    }
}

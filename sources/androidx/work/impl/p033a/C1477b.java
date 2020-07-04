package androidx.work.impl.p033a;

import com.C1642a;

/* renamed from: androidx.work.impl.a.b */
public final class C1477b {

    /* renamed from: a */
    public boolean f5686a;

    /* renamed from: b */
    public boolean f5687b;

    /* renamed from: c */
    public boolean f5688c;

    /* renamed from: d */
    public boolean f5689d;

    public final int hashCode() {
        int i;
        if (this.f5686a) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f5687b) {
            i += 16;
        }
        if (this.f5688c) {
            i += 256;
        }
        if (this.f5689d) {
            return i + 4096;
        }
        return i;
    }

    public final String toString() {
        return C1642a.m8034a("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f5686a), Boolean.valueOf(this.f5687b), Boolean.valueOf(this.f5688c), Boolean.valueOf(this.f5689d)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1477b bVar = (C1477b) obj;
        if (this.f5686a == bVar.f5686a && this.f5687b == bVar.f5687b && this.f5688c == bVar.f5688c && this.f5689d == bVar.f5689d) {
            return true;
        }
        return false;
    }

    public C1477b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5686a = z;
        this.f5687b = z2;
        this.f5688c = z3;
        this.f5689d = z4;
    }
}

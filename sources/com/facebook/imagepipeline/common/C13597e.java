package com.facebook.imagepipeline.common;

import com.C1642a;
import com.facebook.common.util.C13334a;

/* renamed from: com.facebook.imagepipeline.common.e */
public final class C13597e {

    /* renamed from: c */
    private static final C13597e f36028c = new C13597e(-1, false);

    /* renamed from: d */
    private static final C13597e f36029d = new C13597e(-2, false);

    /* renamed from: e */
    private static final C13597e f36030e = new C13597e(-1, true);

    /* renamed from: a */
    public final boolean f36031a;

    /* renamed from: b */
    private final int f36032b;

    /* renamed from: a */
    public static C13597e m40009a() {
        return f36028c;
    }

    /* renamed from: b */
    public static C13597e m40010b() {
        return f36029d;
    }

    /* renamed from: c */
    public static C13597e m40011c() {
        return f36030e;
    }

    /* renamed from: d */
    public final boolean mo33158d() {
        if (this.f36032b == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo33159e() {
        if (this.f36032b != -2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo33161f() {
        if (!mo33158d()) {
            return this.f36032b;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public final int hashCode() {
        return C13334a.m39026a((Object) Integer.valueOf(this.f36032b), (Object) Boolean.valueOf(this.f36031a));
    }

    public final String toString() {
        return C1642a.m8035a(null, "%d defer:%b", new Object[]{Integer.valueOf(this.f36032b), Boolean.valueOf(this.f36031a)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13597e)) {
            return false;
        }
        C13597e eVar = (C13597e) obj;
        if (this.f36032b == eVar.f36032b && this.f36031a == eVar.f36031a) {
            return true;
        }
        return false;
    }

    private C13597e(int i, boolean z) {
        this.f36032b = i;
        this.f36031a = z;
    }
}

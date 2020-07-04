package com.facebook.imagepipeline.common;

import com.C1642a;
import com.facebook.common.internal.C13307g;
import com.facebook.common.util.C13334a;
import java.util.regex.Pattern;

/* renamed from: com.facebook.imagepipeline.common.a */
public final class C13593a {

    /* renamed from: c */
    private static Pattern f35998c;

    /* renamed from: a */
    public final int f35999a;

    /* renamed from: b */
    public final int f36000b;

    public final int hashCode() {
        return C13334a.m39024a(this.f35999a, this.f36000b);
    }

    public final String toString() {
        return C1642a.m8035a(null, "%s-%s", new Object[]{m40000c(this.f35999a), m40000c(this.f36000b)});
    }

    /* renamed from: a */
    public final String mo33143a() {
        return C1642a.m8035a(null, "bytes=%s-%s", new Object[]{m40000c(this.f35999a), m40000c(this.f36000b)});
    }

    /* renamed from: b */
    public static C13593a m39999b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        return new C13593a(0, i);
    }

    /* renamed from: c */
    private static String m40000c(int i) {
        if (i == Integer.MAX_VALUE) {
            return "";
        }
        return Integer.toString(i);
    }

    /* renamed from: a */
    public static C13593a m39997a(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        return new C13593a(i, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13593a)) {
            return false;
        }
        C13593a aVar = (C13593a) obj;
        if (this.f35999a == aVar.f35999a && this.f36000b == aVar.f36000b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C13593a m39998a(String str) throws IllegalArgumentException {
        boolean z;
        boolean z2;
        boolean z3;
        if (str == null) {
            return null;
        }
        if (f35998c == null) {
            f35998c = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f35998c.split(str);
            if (split.length == 4) {
                z = true;
            } else {
                z = false;
            }
            C13307g.m38943a(z);
            C13307g.m38943a(split[0].equals("bytes"));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            if (parseInt2 > parseInt) {
                z2 = true;
            } else {
                z2 = false;
            }
            C13307g.m38943a(z2);
            if (parseInt3 > parseInt2) {
                z3 = true;
            } else {
                z3 = false;
            }
            C13307g.m38943a(z3);
            if (parseInt2 < parseInt3 - 1) {
                return new C13593a(parseInt, parseInt2);
            }
            return new C13593a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(C1642a.m8035a(null, "Invalid Content-Range header value: \"%s\"", new Object[]{str}), e);
        }
    }

    /* renamed from: a */
    public final boolean mo33144a(C13593a aVar) {
        if (aVar != null && this.f35999a <= aVar.f35999a && this.f36000b >= aVar.f36000b) {
            return true;
        }
        return false;
    }

    private C13593a(int i, int i2) {
        this.f35999a = i;
        this.f36000b = i2;
    }
}

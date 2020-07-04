package com.airbnb.lottie.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.e */
public final class C1817e {

    /* renamed from: a */
    public C1818f f6553a;

    /* renamed from: b */
    private final List<String> f6554b;

    /* renamed from: a */
    private boolean m8519a() {
        return ((String) this.f6554b.get(this.f6554b.size() - 1)).equals("**");
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f6554b);
        sb.append(",resolved=");
        if (this.f6553a != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m8520b(String str) {
        return str.equals("__container");
    }

    /* renamed from: a */
    public final C1817e mo7307a(C1818f fVar) {
        C1817e eVar = new C1817e(this);
        eVar.f6553a = fVar;
        return eVar;
    }

    public C1817e(String... strArr) {
        this.f6554b = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final C1817e mo7308a(String str) {
        C1817e eVar = new C1817e(this);
        eVar.f6554b.add(str);
        return eVar;
    }

    private C1817e(C1817e eVar) {
        this.f6554b = new ArrayList(eVar.f6554b);
        this.f6553a = eVar.f6553a;
    }

    /* renamed from: b */
    public final int mo7310b(String str, int i) {
        if (m8520b(str)) {
            return 0;
        }
        if (!((String) this.f6554b.get(i)).equals("**")) {
            return 1;
        }
        if (i != this.f6554b.size() - 1 && ((String) this.f6554b.get(i + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public final boolean mo7312d(String str, int i) {
        if (!str.equals("__container") && i >= this.f6554b.size() - 1 && !((String) this.f6554b.get(i)).equals("**")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo7309a(String str, int i) {
        if (m8520b(str)) {
            return true;
        }
        if (i >= this.f6554b.size()) {
            return false;
        }
        if (((String) this.f6554b.get(i)).equals(str) || ((String) this.f6554b.get(i)).equals("**") || ((String) this.f6554b.get(i)).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo7311c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f6554b.size()) {
            return false;
        }
        if (i == this.f6554b.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = (String) this.f6554b.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((z || (i == this.f6554b.size() - 2 && m8519a())) && z3) {
                return true;
            }
            return false;
        }
        if (z || !((String) this.f6554b.get(i + 1)).equals(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (i == this.f6554b.size() - 2 || (i == this.f6554b.size() - 3 && m8519a())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f6554b.size() - 1) {
                return false;
            }
            return ((String) this.f6554b.get(i2)).equals(str);
        }
    }
}

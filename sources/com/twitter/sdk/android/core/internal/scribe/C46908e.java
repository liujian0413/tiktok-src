package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.p276a.C6593c;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.e */
public final class C46908e {
    @C6593c(mo15949a = "client")

    /* renamed from: a */
    public final String f120280a;
    @C6593c(mo15949a = "page")

    /* renamed from: b */
    public final String f120281b;
    @C6593c(mo15949a = "section")

    /* renamed from: c */
    public final String f120282c;
    @C6593c(mo15949a = "component")

    /* renamed from: d */
    public final String f120283d;
    @C6593c(mo15949a = "element")

    /* renamed from: e */
    public final String f120284e;
    @C6593c(mo15949a = "action")

    /* renamed from: f */
    public final String f120285f;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.e$a */
    public static class C46909a {

        /* renamed from: a */
        private String f120286a;

        /* renamed from: b */
        private String f120287b;

        /* renamed from: c */
        private String f120288c;

        /* renamed from: d */
        private String f120289d;

        /* renamed from: e */
        private String f120290e;

        /* renamed from: f */
        private String f120291f;

        /* renamed from: a */
        public final C46908e mo118035a() {
            C46908e eVar = new C46908e(this.f120286a, this.f120287b, this.f120288c, this.f120289d, this.f120290e, this.f120291f);
            return eVar;
        }

        /* renamed from: a */
        public final C46909a mo118034a(String str) {
            this.f120286a = str;
            return this;
        }

        /* renamed from: b */
        public final C46909a mo118036b(String str) {
            this.f120287b = str;
            return this;
        }

        /* renamed from: c */
        public final C46909a mo118037c(String str) {
            this.f120288c = str;
            return this;
        }

        /* renamed from: d */
        public final C46909a mo118038d(String str) {
            this.f120289d = str;
            return this;
        }

        /* renamed from: e */
        public final C46909a mo118039e(String str) {
            this.f120290e = str;
            return this;
        }

        /* renamed from: f */
        public final C46909a mo118040f(String str) {
            this.f120291f = str;
            return this;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (this.f120280a != null) {
            i = this.f120280a.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        if (this.f120281b != null) {
            i2 = this.f120281b.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        if (this.f120282c != null) {
            i3 = this.f120282c.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        if (this.f120283d != null) {
            i4 = this.f120283d.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        if (this.f120284e != null) {
            i5 = this.f120284e.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        if (this.f120285f != null) {
            i6 = this.f120285f.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("client=");
        sb.append(this.f120280a);
        sb.append(", page=");
        sb.append(this.f120281b);
        sb.append(", section=");
        sb.append(this.f120282c);
        sb.append(", component=");
        sb.append(this.f120283d);
        sb.append(", element=");
        sb.append(this.f120284e);
        sb.append(", action=");
        sb.append(this.f120285f);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C46908e eVar = (C46908e) obj;
        if (this.f120285f == null ? eVar.f120285f != null : !this.f120285f.equals(eVar.f120285f)) {
            return false;
        }
        if (this.f120280a == null ? eVar.f120280a != null : !this.f120280a.equals(eVar.f120280a)) {
            return false;
        }
        if (this.f120283d == null ? eVar.f120283d != null : !this.f120283d.equals(eVar.f120283d)) {
            return false;
        }
        if (this.f120284e == null ? eVar.f120284e != null : !this.f120284e.equals(eVar.f120284e)) {
            return false;
        }
        if (this.f120281b == null ? eVar.f120281b != null : !this.f120281b.equals(eVar.f120281b)) {
            return false;
        }
        if (this.f120282c == null ? eVar.f120282c == null : this.f120282c.equals(eVar.f120282c)) {
            return true;
        }
        return false;
    }

    public C46908e(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f120280a = str;
        this.f120281b = str2;
        this.f120282c = str3;
        this.f120283d = str4;
        this.f120284e = str5;
        this.f120285f = str6;
    }
}

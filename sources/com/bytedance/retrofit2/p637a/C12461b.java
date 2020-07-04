package com.bytedance.retrofit2.p637a;

/* renamed from: com.bytedance.retrofit2.a.b */
public final class C12461b {

    /* renamed from: a */
    public final String f33095a;

    /* renamed from: b */
    public final String f33096b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f33095a != null) {
            i = this.f33095a.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f33096b != null) {
            i2 = this.f33096b.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f33095a != null) {
            str = this.f33095a;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(": ");
        if (this.f33096b != null) {
            str2 = this.f33096b;
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12461b bVar = (C12461b) obj;
        if (this.f33095a == null ? bVar.f33095a != null : !this.f33095a.equals(bVar.f33095a)) {
            return false;
        }
        if (this.f33096b == null ? bVar.f33096b == null : this.f33096b.equals(bVar.f33096b)) {
            return true;
        }
        return false;
    }

    public C12461b(String str, String str2) {
        this.f33095a = str;
        this.f33096b = str2;
    }
}

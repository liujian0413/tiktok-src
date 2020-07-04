package com.google.android.play.core.install;

/* renamed from: com.google.android.play.core.install.a */
public final class C17093a {

    /* renamed from: a */
    public final int f47799a;

    /* renamed from: b */
    public final int f47800b;

    /* renamed from: c */
    public final String f47801c;

    public C17093a(int i, int i2, String str) {
        this.f47799a = i;
        this.f47800b = i2;
        this.f47801c = str;
    }

    public final String toString() {
        String str = this.f47801c;
        int i = this.f47799a;
        int i2 = this.f47800b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69);
        sb.append("InstallState{packageName=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}

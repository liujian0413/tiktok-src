package com.fasterxml.jackson.core.p735b;

import com.fasterxml.jackson.core.C14661c;

/* renamed from: com.fasterxml.jackson.core.b.e */
public final class C14656e extends C14661c {

    /* renamed from: c */
    public final C14656e f37846c;

    /* renamed from: d */
    protected String f37847d;

    /* renamed from: f */
    public static C14656e m42384f() {
        return new C14656e(0, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        m42383a(sb);
        return sb.toString();
    }

    /* renamed from: a */
    private void m42383a(StringBuilder sb) {
        if (this.f37879a == 2) {
            sb.append('{');
            if (this.f37847d != null) {
                sb.append('\"');
                sb.append(this.f37847d);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else if (this.f37879a == 1) {
            sb.append('[');
            sb.append(mo37155e());
            sb.append(']');
        } else {
            sb.append("/");
        }
    }

    private C14656e(int i, C14656e eVar) {
        this.f37879a = 0;
        this.f37846c = null;
        this.f37880b = -1;
    }
}

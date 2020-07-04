package com.fasterxml.jackson.core.p735b;

import com.fasterxml.jackson.core.C14661c;
import com.fasterxml.jackson.core.p737io.C14673b;

/* renamed from: com.fasterxml.jackson.core.b.d */
public final class C14655d extends C14661c {

    /* renamed from: c */
    public final C14655d f37842c;

    /* renamed from: d */
    protected int f37843d;

    /* renamed from: e */
    protected int f37844e;

    /* renamed from: f */
    public String f37845f;

    /* renamed from: f */
    public static C14655d m42382f() {
        return new C14655d(null, 0, 1, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        switch (this.f37879a) {
            case 0:
                sb.append("/");
                break;
            case 1:
                sb.append('[');
                sb.append(mo37155e());
                sb.append(']');
                break;
            case 2:
                sb.append('{');
                if (this.f37845f != null) {
                    sb.append('\"');
                    C14673b.m42436a(sb, this.f37845f);
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append('}');
                break;
        }
        return sb.toString();
    }

    private C14655d(C14655d dVar, int i, int i2, int i3) {
        this.f37879a = 0;
        this.f37842c = null;
        this.f37843d = 1;
        this.f37844e = 0;
        this.f37880b = -1;
    }
}

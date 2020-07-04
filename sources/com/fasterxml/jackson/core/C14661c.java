package com.fasterxml.jackson.core;

/* renamed from: com.fasterxml.jackson.core.c */
public abstract class C14661c {

    /* renamed from: a */
    protected int f37879a;

    /* renamed from: b */
    protected int f37880b;

    protected C14661c() {
    }

    /* renamed from: a */
    public final boolean mo37151a() {
        if (this.f37879a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final int mo37154d() {
        return this.f37880b + 1;
    }

    /* renamed from: b */
    public final boolean mo37152b() {
        if (this.f37879a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo37155e() {
        if (this.f37880b < 0) {
            return 0;
        }
        return this.f37880b;
    }

    /* renamed from: c */
    public final String mo37153c() {
        switch (this.f37879a) {
            case 0:
                return "ROOT";
            case 1:
                return "ARRAY";
            case 2:
                return "OBJECT";
            default:
                return "?";
        }
    }
}

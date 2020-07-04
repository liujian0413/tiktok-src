package com.bytedance.ies.web.jsbridge2;

import android.content.Context;

public final class CallContext {

    /* renamed from: a */
    public Context f30265a;

    /* renamed from: b */
    public String f30266b;

    /* renamed from: c */
    C11160g f30267c;

    public enum HostType {
        PRIVATE,
        PROTECTED,
        PUBLIC
    }

    /* renamed from: a */
    public static HostType m32636a() {
        return HostType.PUBLIC;
    }

    /* renamed from: a */
    public final <T> void mo27138a(String str, T t) {
        this.f30267c.mo27178a(str, t);
    }
}

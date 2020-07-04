package com.bytedance.ies.web.jsbridge2;

/* renamed from: com.bytedance.ies.web.jsbridge2.d */
public abstract class C11155d<P, R> extends C11150a<P, R> {
    public abstract R invoke(P p, CallContext callContext) throws Exception;

    protected static void terminate() throws C11177r {
        throw new C11177r(0);
    }

    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    protected static void terminate(String str) throws C11177r {
        throw new C11177r(0, str);
    }
}

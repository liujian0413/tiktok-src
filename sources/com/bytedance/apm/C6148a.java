package com.bytedance.apm;

import android.content.Context;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p240d.C6186b;
import com.bytedance.apm.p253n.C6288d;

/* renamed from: com.bytedance.apm.a */
public final class C6148a {

    /* renamed from: com.bytedance.apm.a$a */
    static class C6150a {

        /* renamed from: a */
        public static final C6148a f18102a = new C6148a();
    }

    private C6148a() {
    }

    /* renamed from: a */
    public static C6148a m19085a() {
        return C6150a.f18102a;
    }

    /* renamed from: a */
    public static void m19086a(Context context) {
        ApmDelegate.getInstance().init(context);
    }

    /* renamed from: a */
    public static void m19087a(C6186b bVar) {
        ApmDelegate.getInstance().start(bVar);
    }

    /* renamed from: a */
    public final C6148a mo14819a(C6288d dVar) {
        ApmDelegate.getInstance().setTraceConfig(dVar);
        return this;
    }
}

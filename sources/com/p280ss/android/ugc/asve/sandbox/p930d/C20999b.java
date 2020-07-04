package com.p280ss.android.ugc.asve.sandbox.p930d;

import com.p280ss.android.ugc.asve.recorder.p921a.C20673b;
import com.p280ss.android.ugc.asve.sandbox.C21029h.C21030a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20908b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.b */
public final class C20999b extends C21030a {

    /* renamed from: a */
    private final C20673b f56466a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.b$a */
    static final class C21000a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C20908b f56467a;

        C21000a(C20908b bVar) {
            this.f56467a = bVar;
        }

        public final void run() {
            C20908b bVar = this.f56467a;
            if (bVar != null) {
                bVar.mo56421a();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo56552a() {
        return this.f56466a.mo55877a();
    }

    /* renamed from: a */
    public final void mo56551a(boolean z) {
        this.f56466a.mo55876a(z);
    }

    /* renamed from: b */
    public final void mo56553b(boolean z) {
        this.f56466a.mo55878b(z);
    }

    /* renamed from: c */
    public final void mo56554c(boolean z) {
        this.f56466a.mo55879c(z);
    }

    public C20999b(C20673b bVar) {
        C7573i.m23587b(bVar, "duetController");
        this.f56466a = bVar;
    }

    /* renamed from: a */
    public final void mo56549a(C20908b bVar) {
        this.f56466a.mo55874a((Runnable) new C21000a(bVar));
    }

    /* renamed from: a */
    public final void mo56550a(String str, String str2, float f, float f2, float f3, boolean z) {
        C7573i.m23587b(str, "duetVideoPath");
        this.f56466a.mo55875a(str, str2, f, f2, f3, z);
    }
}

package com.p280ss.android.ugc.aweme.sec.p1509a;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.secapi.C37420a;
import com.p280ss.sys.p1806ck.SCCheckListener;
import com.p280ss.sys.p1806ck.SCCheckUtils;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sec.a.b */
public final class C37399b extends SCCheckListener {

    /* renamed from: a */
    private SCCheckUtils f97681a;

    /* renamed from: b */
    private Activity f97682b;

    /* renamed from: c */
    private C37420a f97683c;

    public final void dialogOnReady() {
        super.dialogOnReady();
    }

    /* renamed from: a */
    private final void m120016a() {
        SCCheckUtils sCCheckUtils = this.f97681a;
        if (sCCheckUtils != null) {
            sCCheckUtils.activity = null;
        }
        this.f97682b = null;
    }

    /* renamed from: a */
    public final C37399b mo94164a(SCCheckUtils sCCheckUtils) {
        C7573i.m23587b(sCCheckUtils, "checker");
        this.f97681a = sCCheckUtils;
        return this;
    }

    public final void dialogOnClose(int i) {
        super.dialogOnClose(i);
        C37420a aVar = this.f97683c;
        if (aVar != null) {
            aVar.mo80301a(i);
        }
    }

    public C37399b(Activity activity, C37420a aVar) {
        this.f97682b = activity;
        this.f97683c = aVar;
    }

    public final void dialogOnResult(boolean z, String str) {
        C7573i.m23587b(str, "message");
        super.dialogOnResult(z, str);
        C37420a aVar = this.f97683c;
        if (aVar != null) {
            aVar.mo80302a(z, str);
        }
        m120016a();
    }
}

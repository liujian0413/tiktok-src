package com.p280ss.android.ugc.aweme.mobile;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.mobile.C33606d.C33607a;

/* renamed from: com.ss.android.ugc.aweme.mobile.i */
final /* synthetic */ class C33612i implements OnClickListener {

    /* renamed from: a */
    private final C33606d f87733a;

    /* renamed from: b */
    private final C33607a f87734b;

    C33612i(C33606d dVar, C33607a aVar) {
        this.f87733a = dVar;
        this.f87734b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f87733a.mo85941a(this.f87734b, view);
    }
}

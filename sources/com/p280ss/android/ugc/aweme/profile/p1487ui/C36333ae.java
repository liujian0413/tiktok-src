package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ae */
final /* synthetic */ class C36333ae implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f95470a;

    /* renamed from: b */
    private final C36149a f95471b;

    /* renamed from: c */
    private final String f95472c;

    /* renamed from: d */
    private final String f95473d;

    C36333ae(EnterpriseTransformLayout enterpriseTransformLayout, C36149a aVar, String str, String str2) {
        this.f95470a = enterpriseTransformLayout;
        this.f95471b = aVar;
        this.f95472c = str;
        this.f95473d = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95470a.mo92006c(this.f95471b, this.f95472c, this.f95473d, view);
    }
}

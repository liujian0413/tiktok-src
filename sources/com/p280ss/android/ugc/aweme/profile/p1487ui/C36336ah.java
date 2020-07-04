package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ah */
final /* synthetic */ class C36336ah implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f95483a;

    /* renamed from: b */
    private final C36149a f95484b;

    /* renamed from: c */
    private final String f95485c;

    /* renamed from: d */
    private final String f95486d;

    C36336ah(EnterpriseTransformLayout enterpriseTransformLayout, C36149a aVar, String str, String str2) {
        this.f95483a = enterpriseTransformLayout;
        this.f95484b = aVar;
        this.f95485c = str;
        this.f95486d = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95483a.mo92003a(this.f95484b, this.f95485c, this.f95486d, view);
    }
}

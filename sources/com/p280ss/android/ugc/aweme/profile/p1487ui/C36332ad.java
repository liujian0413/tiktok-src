package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ad */
final /* synthetic */ class C36332ad implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f95466a;

    /* renamed from: b */
    private final C36149a f95467b;

    /* renamed from: c */
    private final String f95468c;

    /* renamed from: d */
    private final String f95469d;

    C36332ad(EnterpriseTransformLayout enterpriseTransformLayout, C36149a aVar, String str, String str2) {
        this.f95466a = enterpriseTransformLayout;
        this.f95467b = aVar;
        this.f95468c = str;
        this.f95469d = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95466a.mo92007d(this.f95467b, this.f95468c, this.f95469d, view);
    }
}

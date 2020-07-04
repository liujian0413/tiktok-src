package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ac */
final /* synthetic */ class C36331ac implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f95462a;

    /* renamed from: b */
    private final C36149a f95463b;

    /* renamed from: c */
    private final String f95464c;

    /* renamed from: d */
    private final String f95465d;

    C36331ac(EnterpriseTransformLayout enterpriseTransformLayout, C36149a aVar, String str, String str2) {
        this.f95462a = enterpriseTransformLayout;
        this.f95463b = aVar;
        this.f95464c = str;
        this.f95465d = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95462a.mo92008e(this.f95463b, this.f95464c, this.f95465d, view);
    }
}

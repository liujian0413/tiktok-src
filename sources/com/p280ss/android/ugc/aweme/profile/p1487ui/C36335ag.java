package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ag */
final /* synthetic */ class C36335ag implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f95479a;

    /* renamed from: b */
    private final C36149a f95480b;

    /* renamed from: c */
    private final String f95481c;

    /* renamed from: d */
    private final String f95482d;

    C36335ag(EnterpriseTransformLayout enterpriseTransformLayout, C36149a aVar, String str, String str2) {
        this.f95479a = enterpriseTransformLayout;
        this.f95480b = aVar;
        this.f95481c = str;
        this.f95482d = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95479a.mo92005b(this.f95480b, this.f95481c, this.f95482d, view);
    }
}

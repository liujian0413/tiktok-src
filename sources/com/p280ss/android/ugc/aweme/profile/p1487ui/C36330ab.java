package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ab */
final /* synthetic */ class C36330ab implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f95459a;

    /* renamed from: b */
    private final C36149a f95460b;

    /* renamed from: c */
    private final String f95461c;

    C36330ab(EnterpriseTransformLayout enterpriseTransformLayout, C36149a aVar, String str) {
        this.f95459a = enterpriseTransformLayout;
        this.f95460b = aVar;
        this.f95461c = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95459a.mo92001a(this.f95460b, this.f95461c, view);
    }
}

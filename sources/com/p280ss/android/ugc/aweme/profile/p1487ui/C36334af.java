package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commerce.OfflineInfo;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.af */
final /* synthetic */ class C36334af implements OnClickListener {

    /* renamed from: a */
    private final EnterpriseTransformLayout f95474a;

    /* renamed from: b */
    private final C36149a f95475b;

    /* renamed from: c */
    private final String f95476c;

    /* renamed from: d */
    private final OfflineInfo f95477d;

    /* renamed from: e */
    private final String f95478e;

    C36334af(EnterpriseTransformLayout enterpriseTransformLayout, C36149a aVar, String str, OfflineInfo offlineInfo, String str2) {
        this.f95474a = enterpriseTransformLayout;
        this.f95475b = aVar;
        this.f95476c = str;
        this.f95477d = offlineInfo;
        this.f95478e = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95474a.mo92002a(this.f95475b, this.f95476c, this.f95477d, this.f95478e, view);
    }
}

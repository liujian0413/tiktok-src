package com.p280ss.android.ugc.aweme.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.model.C25000i;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.share.g */
final /* synthetic */ class C38042g implements OnClickListener {

    /* renamed from: a */
    private final C38028e f99028a;

    /* renamed from: b */
    private final Aweme f99029b;

    /* renamed from: c */
    private final C25000i f99030c;

    C38042g(C38028e eVar, Aweme aweme, C25000i iVar) {
        this.f99028a = eVar;
        this.f99029b = aweme;
        this.f99030c = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f99028a.mo95668a(this.f99029b, this.f99030c, view);
    }
}

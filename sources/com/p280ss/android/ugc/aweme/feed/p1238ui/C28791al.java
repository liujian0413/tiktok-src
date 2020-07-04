package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.model.C25000i;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.al */
final /* synthetic */ class C28791al implements OnClickListener {

    /* renamed from: a */
    private final C28787ak f75934a;

    /* renamed from: b */
    private final Aweme f75935b;

    /* renamed from: c */
    private final C25000i f75936c;

    C28791al(C28787ak akVar, Aweme aweme, C25000i iVar) {
        this.f75934a = akVar;
        this.f75935b = aweme;
        this.f75936c = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f75934a.mo74013a(this.f75935b, this.f75936c, view);
    }
}

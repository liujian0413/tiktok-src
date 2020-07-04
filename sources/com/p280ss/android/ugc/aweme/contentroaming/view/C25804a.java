package com.p280ss.android.ugc.aweme.contentroaming.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.challenge.C23685d;

/* renamed from: com.ss.android.ugc.aweme.contentroaming.view.a */
final /* synthetic */ class C25804a implements OnClickListener {

    /* renamed from: a */
    private final ContentRoamingViewHolder f68227a;

    /* renamed from: b */
    private final View f68228b;

    /* renamed from: c */
    private final C23685d f68229c;

    C25804a(ContentRoamingViewHolder contentRoamingViewHolder, View view, C23685d dVar) {
        this.f68227a = contentRoamingViewHolder;
        this.f68228b = view;
        this.f68229c = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f68227a.mo67066a(this.f68228b, this.f68229c, view);
    }
}

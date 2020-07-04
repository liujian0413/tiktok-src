package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.challenge.C23685d;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ai */
final /* synthetic */ class C28137ai implements OnClickListener {

    /* renamed from: a */
    private final LocationCellBViewHolder f74207a;

    /* renamed from: b */
    private final View f74208b;

    /* renamed from: c */
    private final C23685d f74209c;

    C28137ai(LocationCellBViewHolder locationCellBViewHolder, View view, C23685d dVar) {
        this.f74207a = locationCellBViewHolder;
        this.f74208b = view;
        this.f74209c = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74207a.mo71600a(this.f74208b, this.f74209c, view);
    }
}

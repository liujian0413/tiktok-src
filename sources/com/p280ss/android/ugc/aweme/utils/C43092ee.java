package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;

/* renamed from: com.ss.android.ugc.aweme.utils.ee */
final /* synthetic */ class C43092ee implements OnClickListener {

    /* renamed from: a */
    private final Context f111709a;

    /* renamed from: b */
    private final ShareCompleteEvent f111710b;

    /* renamed from: c */
    private final Snackbar f111711c;

    C43092ee(Context context, ShareCompleteEvent shareCompleteEvent, Snackbar snackbar) {
        this.f111709a = context;
        this.f111710b = shareCompleteEvent;
        this.f111711c = snackbar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C43091ed.m136698a(this.f111709a, this.f111710b, this.f111711c, view);
    }
}

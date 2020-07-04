package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.y */
final /* synthetic */ class C36687y implements OnClickListener {

    /* renamed from: a */
    private final C36688z f96311a;

    /* renamed from: b */
    private final Context f96312b;

    /* renamed from: c */
    private final Challenge f96313c;

    /* renamed from: d */
    private final Activity f96314d;

    C36687y(C36688z zVar, Context context, Challenge challenge, Activity activity) {
        this.f96311a = zVar;
        this.f96312b = context;
        this.f96313c = challenge;
        this.f96314d = activity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C36145a.m116595a(this.f96311a, this.f96312b, this.f96313c, this.f96314d, view);
    }
}

package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.c */
final /* synthetic */ class C29750c implements OnClickListener {

    /* renamed from: a */
    private final ViewHolder f78275a;

    /* renamed from: b */
    private final CharSequence[] f78276b;

    /* renamed from: c */
    private final User f78277c;

    /* renamed from: d */
    private final Resources f78278d;

    C29750c(ViewHolder viewHolder, CharSequence[] charSequenceArr, User user, Resources resources) {
        this.f78275a = viewHolder;
        this.f78276b = charSequenceArr;
        this.f78277c = user;
        this.f78278d = resources;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f78275a.mo75728a(this.f78276b, this.f78277c, this.f78278d, view);
    }
}

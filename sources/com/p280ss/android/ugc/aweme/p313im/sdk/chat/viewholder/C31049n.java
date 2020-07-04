package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.n */
final /* synthetic */ class C31049n implements OnClickListener {

    /* renamed from: a */
    private final ShareAwemeReceiveAutoPlayViewHolder f81492a;

    /* renamed from: b */
    private final OnClickListener f81493b;

    C31049n(ShareAwemeReceiveAutoPlayViewHolder shareAwemeReceiveAutoPlayViewHolder, OnClickListener onClickListener) {
        this.f81492a = shareAwemeReceiveAutoPlayViewHolder;
        this.f81493b = onClickListener;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f81492a.mo81452a(this.f81493b, view);
    }
}

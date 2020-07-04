package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ar */
final /* synthetic */ class C28146ar implements OnClickListener {

    /* renamed from: a */
    private final VideoViewHolder f74229a;

    C28146ar(VideoViewHolder videoViewHolder) {
        this.f74229a = videoViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74229a.mo71690b(view);
    }
}

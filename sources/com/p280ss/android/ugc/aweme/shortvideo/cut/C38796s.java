package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter.AddVideoViewHolder;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.s */
final /* synthetic */ class C38796s implements OnClickListener {

    /* renamed from: a */
    private final AddVideoViewHolder f100819a;

    C38796s(AddVideoViewHolder addVideoViewHolder) {
        this.f100819a = addVideoViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f100819a.mo96812a(view);
    }
}

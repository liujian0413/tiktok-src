package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter.VideoSegmentViewHolder;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.t */
final /* synthetic */ class C39238t implements OnClickListener {

    /* renamed from: a */
    private final VideoSegmentViewHolder f101728a;

    /* renamed from: b */
    private final VideoSegmentViewHolder f101729b;

    C39238t(VideoSegmentViewHolder videoSegmentViewHolder, VideoSegmentViewHolder videoSegmentViewHolder2) {
        this.f101728a = videoSegmentViewHolder;
        this.f101729b = videoSegmentViewHolder2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f101728a.mo96815a(this.f101729b, view);
    }
}

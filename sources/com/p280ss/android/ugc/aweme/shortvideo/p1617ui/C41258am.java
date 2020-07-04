package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.am */
final /* synthetic */ class C41258am implements OnClickListener {

    /* renamed from: a */
    private final VideoPreviewActivity f107503a;

    C41258am(VideoPreviewActivity videoPreviewActivity) {
        this.f107503a = videoPreviewActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f107503a.mo101738a(view);
    }
}

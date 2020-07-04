package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a */
final /* synthetic */ class C42069a implements OnClickListener {

    /* renamed from: a */
    private final ColorSelectLayout f109352a;

    /* renamed from: b */
    private final ColorCircleView f109353b;

    C42069a(ColorSelectLayout colorSelectLayout, ColorCircleView colorCircleView) {
        this.f109352a = colorSelectLayout;
        this.f109353b = colorCircleView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f109352a.mo103312a(this.f109353b, view);
    }
}

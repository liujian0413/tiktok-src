package com.p280ss.android.ugc.aweme.story.shootvideo.textfont;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.h */
final /* synthetic */ class C42045h implements OnClickListener {

    /* renamed from: a */
    private final TextSelectFontStyleLayout f109207a;

    /* renamed from: b */
    private final TextFontTypeLayout f109208b;

    C42045h(TextSelectFontStyleLayout textSelectFontStyleLayout, TextFontTypeLayout textFontTypeLayout) {
        this.f109207a = textSelectFontStyleLayout;
        this.f109208b = textFontTypeLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f109207a.mo103204a(this.f109208b, view);
    }
}

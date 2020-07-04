package com.p280ss.android.ugc.aweme.feedback;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feedback.c */
final /* synthetic */ class C29070c implements OnClickListener {

    /* renamed from: a */
    private final FeedbackActivity f76743a;

    C29070c(FeedbackActivity feedbackActivity) {
        this.f76743a = feedbackActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f76743a.mo74480b(view);
    }
}

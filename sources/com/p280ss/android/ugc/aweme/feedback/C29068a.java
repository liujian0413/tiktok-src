package com.p280ss.android.ugc.aweme.feedback;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feedback.a */
final /* synthetic */ class C29068a implements OnClickListener {

    /* renamed from: a */
    private final FeedbackActivity f76741a;

    C29068a(FeedbackActivity feedbackActivity) {
        this.f76741a = feedbackActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f76741a.mo74482d(view);
    }
}

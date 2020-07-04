package com.p280ss.android.ugc.aweme.feedback;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feedback.b */
final /* synthetic */ class C29069b implements OnClickListener {

    /* renamed from: a */
    private final FeedbackActivity f76742a;

    C29069b(FeedbackActivity feedbackActivity) {
        this.f76742a = feedbackActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f76742a.mo74481c(view);
    }
}

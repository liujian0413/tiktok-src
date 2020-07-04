package com.p280ss.android.ugc.aweme.feedback;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feedback.d */
final /* synthetic */ class C29071d implements OnClickListener {

    /* renamed from: a */
    private final FeedbackActivity f76744a;

    C29071d(FeedbackActivity feedbackActivity) {
        this.f76744a = feedbackActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f76744a.mo74478a(view);
    }
}

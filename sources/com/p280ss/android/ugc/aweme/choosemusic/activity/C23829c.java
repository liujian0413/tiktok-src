package com.p280ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.c */
final /* synthetic */ class C23829c implements OnClickListener {

    /* renamed from: a */
    private final OnlineMusicFragmentActivity f62905a;

    C23829c(OnlineMusicFragmentActivity onlineMusicFragmentActivity) {
        this.f62905a = onlineMusicFragmentActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f62905a.mo61874a(view);
    }
}

package com.p280ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.a */
final /* synthetic */ class C23827a implements OnClickListener {

    /* renamed from: a */
    private final ChooseMusicActivity f62903a;

    C23827a(ChooseMusicActivity chooseMusicActivity) {
        this.f62903a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f62903a.mo61870b(view);
    }
}

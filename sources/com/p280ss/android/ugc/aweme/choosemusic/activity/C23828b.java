package com.p280ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.b */
final /* synthetic */ class C23828b implements OnClickListener {

    /* renamed from: a */
    private final ChooseMusicActivity f62904a;

    C23828b(ChooseMusicActivity chooseMusicActivity) {
        this.f62904a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f62904a.mo61868a(view);
    }
}

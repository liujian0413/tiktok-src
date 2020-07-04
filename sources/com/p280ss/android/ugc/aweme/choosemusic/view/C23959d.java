package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.d */
final /* synthetic */ class C23959d implements OnClickListener {

    /* renamed from: a */
    private final ChooseMusicFragmentView f63305a;

    C23959d(ChooseMusicFragmentView chooseMusicFragmentView) {
        this.f63305a = chooseMusicFragmentView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f63305a.mo62123a(view);
    }
}

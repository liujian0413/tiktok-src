package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.a */
final /* synthetic */ class C23956a implements OnClickListener {

    /* renamed from: a */
    private final BaseMusicListView f63302a;

    C23956a(BaseMusicListView baseMusicListView) {
        this.f63302a = baseMusicListView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f63302a.mo62111a(view);
    }
}

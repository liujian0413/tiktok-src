package com.p280ss.android.ugc.aweme.music;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.music.e */
final /* synthetic */ class C33791e implements OnClickListener {

    /* renamed from: a */
    private final OriginMusicListFragment f88153a;

    C33791e(OriginMusicListFragment originMusicListFragment) {
        this.f88153a = originMusicListFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f88153a.mo86062a(view);
    }
}

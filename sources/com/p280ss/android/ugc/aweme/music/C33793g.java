package com.p280ss.android.ugc.aweme.music;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.music.g */
final /* synthetic */ class C33793g implements OnClickListener {

    /* renamed from: a */
    private final OriginMusicViewHolder f88154a;

    C33793g(OriginMusicViewHolder originMusicViewHolder) {
        this.f88154a = originMusicViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f88154a.mo86070a(view);
    }
}

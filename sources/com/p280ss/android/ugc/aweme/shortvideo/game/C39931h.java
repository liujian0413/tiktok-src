package com.p280ss.android.ugc.aweme.shortvideo.game;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.game.h */
final /* synthetic */ class C39931h implements OnClickListener {

    /* renamed from: a */
    private final C39929f f103720a;

    C39931h(C39929f fVar) {
        this.f103720a = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f103720a.mo99349a(view);
    }
}

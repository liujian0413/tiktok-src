package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.ui.u */
final /* synthetic */ class C33983u implements OnClickListener {

    /* renamed from: a */
    private final MusicDetailFragment f88635a;

    /* renamed from: b */
    private final List f88636b;

    C33983u(MusicDetailFragment musicDetailFragment, List list) {
        this.f88635a = musicDetailFragment;
        this.f88636b = list;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f88635a.mo86482a(this.f88636b, view);
    }
}

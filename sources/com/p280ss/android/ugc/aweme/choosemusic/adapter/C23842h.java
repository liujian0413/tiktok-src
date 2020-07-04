package com.p280ss.android.ugc.aweme.choosemusic.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.h */
final /* synthetic */ class C23842h implements OnClickListener {

    /* renamed from: a */
    private final MusicSheetViewHolder f62956a;

    C23842h(MusicSheetViewHolder musicSheetViewHolder) {
        this.f62956a = musicSheetViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f62956a.mo61898a(view);
    }
}

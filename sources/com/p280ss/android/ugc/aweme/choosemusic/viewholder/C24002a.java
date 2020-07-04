package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.a */
final /* synthetic */ class C24002a implements OnClickListener {

    /* renamed from: a */
    private final MusicBoardViewHolder f63449a;

    C24002a(MusicBoardViewHolder musicBoardViewHolder) {
        this.f63449a = musicBoardViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f63449a.mo62199a(view);
    }
}

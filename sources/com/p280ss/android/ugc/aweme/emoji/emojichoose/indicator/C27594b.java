package com.p280ss.android.ugc.aweme.emoji.emojichoose.indicator;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.indicator.b */
public final class C27594b {

    /* renamed from: a */
    private EmojiIndicatorAdapter f72726a = new EmojiIndicatorAdapter();

    public C27594b(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.mo5427b(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f72726a);
    }

    /* renamed from: a */
    public final void mo70839a(int i, int i2, int i3) {
        this.f72726a.mo70837a(i, i2, i3);
    }
}

package com.p280ss.android.ugc.aweme.choosemusic.widgets;

import android.view.View;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23963h;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.d */
final /* synthetic */ class C24015d implements C23963h {

    /* renamed from: a */
    private final MusicBoardWidget f63508a;

    /* renamed from: b */
    private final MusicCollectionItem f63509b;

    C24015d(MusicBoardWidget musicBoardWidget, MusicCollectionItem musicCollectionItem) {
        this.f63508a = musicBoardWidget;
        this.f63509b = musicCollectionItem;
    }

    /* renamed from: a */
    public final void mo61894a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
        this.f63508a.mo62266a(this.f63509b, musicItemViewHolder, view, musicModel, i);
    }
}

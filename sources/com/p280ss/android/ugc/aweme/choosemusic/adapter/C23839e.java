package com.p280ss.android.ugc.aweme.choosemusic.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.e */
final /* synthetic */ class C23839e implements OnClickListener {

    /* renamed from: a */
    private final C238322 f62951a;

    /* renamed from: b */
    private final MusicModel f62952b;

    /* renamed from: c */
    private final MusicItemViewHolder f62953c;

    /* renamed from: d */
    private final AVMusic f62954d;

    C23839e(C238322 r1, MusicModel musicModel, MusicItemViewHolder musicItemViewHolder, AVMusic aVMusic) {
        this.f62951a = r1;
        this.f62952b = musicModel;
        this.f62953c = musicItemViewHolder;
        this.f62954d = aVMusic;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f62951a.mo61895a(this.f62952b, this.f62953c, this.f62954d, dialogInterface, i);
    }
}

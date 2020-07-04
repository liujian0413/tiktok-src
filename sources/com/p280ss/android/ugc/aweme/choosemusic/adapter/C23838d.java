package com.p280ss.android.ugc.aweme.choosemusic.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.d */
final /* synthetic */ class C23838d implements OnClickListener {

    /* renamed from: a */
    private final AVMusic f62949a;

    /* renamed from: b */
    private final MusicModel f62950b;

    C23838d(AVMusic aVMusic, MusicModel musicModel) {
        this.f62949a = aVMusic;
        this.f62950b = musicModel;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C238322.m78076a(this.f62949a, this.f62950b, dialogInterface, i);
    }
}

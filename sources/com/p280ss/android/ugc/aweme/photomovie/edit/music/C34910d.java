package com.p280ss.android.ugc.aweme.photomovie.edit.music;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.d */
final /* synthetic */ class C34910d implements Runnable {

    /* renamed from: a */
    private final PhotoMovieMusicAdapter f91061a;

    C34910d(PhotoMovieMusicAdapter photoMovieMusicAdapter) {
        this.f91061a = photoMovieMusicAdapter;
    }

    public final void run() {
        this.f91061a.notifyDataSetChanged();
    }
}

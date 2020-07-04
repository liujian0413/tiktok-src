package com.p280ss.android.ugc.aweme.photomovie.edit.music;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.f */
final /* synthetic */ class C34912f implements Runnable {

    /* renamed from: a */
    private final PhotoMovieMusicAdapter f91063a;

    C34912f(PhotoMovieMusicAdapter photoMovieMusicAdapter) {
        this.f91063a = photoMovieMusicAdapter;
    }

    public final void run() {
        this.f91063a.notifyDataSetChanged();
    }
}

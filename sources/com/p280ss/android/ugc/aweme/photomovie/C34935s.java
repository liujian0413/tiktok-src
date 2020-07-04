package com.p280ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;

/* renamed from: com.ss.android.ugc.aweme.photomovie.s */
final /* synthetic */ class C34935s implements Runnable {

    /* renamed from: a */
    private final PhotoMoviePublishFragment f91113a;

    /* renamed from: b */
    private final Bitmap f91114b;

    C34935s(PhotoMoviePublishFragment photoMoviePublishFragment, Bitmap bitmap) {
        this.f91113a = photoMoviePublishFragment;
        this.f91114b = bitmap;
    }

    public final void run() {
        this.f91113a.mo88364a(this.f91114b);
    }
}

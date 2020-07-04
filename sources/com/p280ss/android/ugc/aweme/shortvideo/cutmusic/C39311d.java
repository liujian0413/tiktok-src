package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.d */
final /* synthetic */ class C39311d implements Runnable {

    /* renamed from: a */
    private final MusicDragView f102113a;

    private C39311d(MusicDragView musicDragView) {
        this.f102113a = musicDragView;
    }

    /* renamed from: a */
    static Runnable m125619a(MusicDragView musicDragView) {
        return new C39311d(musicDragView);
    }

    public final void run() {
        this.f102113a.mo97845a();
    }
}

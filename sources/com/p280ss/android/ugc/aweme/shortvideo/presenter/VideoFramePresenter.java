package com.p280ss.android.ugc.aweme.shortvideo.presenter;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.medialib.jni.FrameThumb;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.VideoFramePresenter */
public class VideoFramePresenter implements C0042h {

    /* renamed from: a */
    public FrameThumb f104512a;

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f104512a.unInitVideoToGraph();
    }
}

package com.p280ss.android.ugc.aweme.live.alphaplayer;

import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLSurfaceView.Renderer;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.f */
public interface C32462f extends OnFrameAvailableListener, Renderer {

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.f$a */
    public interface C32463a {
        /* renamed from: a */
        void mo83671a();

        /* renamed from: a */
        void mo83672a(Surface surface);
    }

    /* renamed from: a */
    void mo83711a();

    /* renamed from: a */
    void mo83712a(float f, float f2, float f3, float f4);

    /* renamed from: a */
    void mo83713a(ScaleType scaleType);

    /* renamed from: a */
    void mo83714a(C32463a aVar);

    /* renamed from: a */
    void mo83715a(String str);

    /* renamed from: b */
    void mo83716b();
}

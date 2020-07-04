package com.bytedance.android.live.broadcast.widget;

import android.opengl.GLSurfaceView;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.stream.p141a.C2958f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class CaptureWidget extends AbsCaptureWidget {

    /* renamed from: c */
    C2958f f9337c;

    /* renamed from: d */
    GLSurfaceView f9338d;

    public int getLayoutId() {
        return R.layout.ayh;
    }

    public void onCreate() {
        super.onCreate();
        this.f9338d = (GLSurfaceView) this.contentView;
    }

    CaptureWidget(C2958f fVar, C2429a aVar) {
        super(aVar);
        this.f9337c = fVar;
    }
}

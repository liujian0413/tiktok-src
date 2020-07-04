package com.bytedance.android.live.broadcast.widget;

import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.stream.p141a.C2958f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class CaptureWidget2 extends AbsCaptureWidget {

    /* renamed from: c */
    C2958f f9339c;

    /* renamed from: d */
    SurfaceView f9340d;

    public int getLayoutId() {
        return R.layout.ayi;
    }

    public void onCreate() {
        super.onCreate();
        this.f9340d = (SurfaceView) this.contentView;
    }

    CaptureWidget2(C2958f fVar, C2429a aVar) {
        super(aVar);
        this.f9339c = fVar;
    }
}

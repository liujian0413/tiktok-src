package com.p280ss.video.rtc.engine.mediaio;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.p280ss.video.rtc.engine.p1833ui.VideoFrameRender.OnEglSurfaceCreated;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.SoftReference;
import org.webrtc.EglBase.Context;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.SurfaceEglRenderer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.mediaio.SurfaceEglRender */
public class SurfaceEglRender extends SurfaceEglRenderer {
    private boolean hasInit;
    private Callback mCallback;
    private OnEglSurfaceCreated mOnEglSurfaceCreated;
    private SoftReference<SurfaceView> surfaceViewSoftReference;

    public void release() {
        this.hasInit = false;
        LogUtil.m145278d("SurfaceEglRender", "release");
        super.release();
        if (this.surfaceViewSoftReference != null) {
            SurfaceView surfaceView = (SurfaceView) this.surfaceViewSoftReference.get();
            if (surfaceView != null) {
                surfaceView.getHolder().removeCallback(this);
            }
        }
    }

    public SurfaceEglRender(String str) {
        super(str);
    }

    public void setOnEglSurfaceCreated(OnEglSurfaceCreated onEglSurfaceCreated) {
        this.mOnEglSurfaceCreated = onEglSurfaceCreated;
    }

    public void setSurfaceHolderCallback(Callback callback) {
        this.mCallback = callback;
    }

    public void onFrame(VideoFrame videoFrame) {
        if (this.hasInit) {
            super.onFrame(videoFrame);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        LogUtil.m145278d("SurfaceEglRender", "surfaceDestroyed");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        LogUtil.m145278d("SurfaceEglRender", "surfaceCreated");
        if (this.mOnEglSurfaceCreated != null) {
            this.mOnEglSurfaceCreated.onCreated();
        }
    }

    public void bind(SurfaceView surfaceView) {
        if (!this.hasInit) {
            LogUtil.m145278d("SurfaceEglRender", "surfaceView not init!");
            return;
        }
        LogUtil.m145278d("SurfaceEglRender", "bind");
        surfaceView.getHolder().addCallback(this);
        if (this.mCallback != null) {
            surfaceView.getHolder().addCallback(this.mCallback);
        }
        this.surfaceViewSoftReference = new SoftReference<>(surfaceView);
        if (surfaceView.isShown()) {
            surfaceView.setVisibility(4);
            surfaceView.setVisibility(0);
        }
    }

    public void init(Context context, int[] iArr, GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.m145278d("SurfaceEglRender", "init");
        this.hasInit = true;
        super.init(context, iArr, glDrawer);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        LogUtil.m145278d("SurfaceEglRender", "surfaceChanged");
    }
}

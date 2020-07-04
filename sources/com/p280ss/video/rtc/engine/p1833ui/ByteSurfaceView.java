package com.p280ss.video.rtc.engine.p1833ui;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.p280ss.video.rtc.engine.mediaio.IVideoSink;
import java.nio.ByteBuffer;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;

/* renamed from: com.ss.video.rtc.engine.ui.ByteSurfaceView */
public class ByteSurfaceView extends SurfaceView implements IVideoSink {
    private boolean isRelease = true;
    private EglBase mEglBase;
    private boolean mIsStart;
    private VideoFrameRender mVideoFrameRender;

    public int getBufferType() {
        return 0;
    }

    public EGLContext getEGLContextHandle() {
        return null;
    }

    public int getPixelFormat() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public Looper getTextureFrameProcessLooper() {
        return null;
    }

    public void onStop() {
        this.mIsStart = false;
    }

    public void disableFpsReduction() {
        this.mVideoFrameRender.disableFpsReduction();
    }

    private void init() {
        this.mVideoFrameRender = new VideoFrameRender("ByteSurfaceViewRender");
        this.mVideoFrameRender.setRenderView((SurfaceView) this, (Callback) null);
    }

    public boolean onStart() {
        this.mIsStart = true;
        this.mVideoFrameRender.onStart();
        return true;
    }

    public void onDispose() {
        if (!this.isRelease) {
            this.isRelease = true;
            this.mVideoFrameRender.release();
            if (this.mEglBase != null) {
                this.mEglBase.release();
            }
        }
    }

    public boolean onInitialize() {
        if (!this.isRelease) {
            return false;
        }
        this.mEglBase = EglBase$$CC.create$$STATIC$$();
        this.isRelease = false;
        this.mVideoFrameRender.init(this.mEglBase.getEglBaseContext());
        this.mVideoFrameRender.setProcessTextureLopper(getTextureFrameProcessLooper());
        return true;
    }

    public void setEnableHardwareScaler(boolean z) {
        this.mVideoFrameRender.setEnableHardwareScaler(z);
    }

    public void setFpsReduction(float f) {
        this.mVideoFrameRender.setFpsReduction(f);
    }

    public ByteSurfaceView(Context context) {
        super(context);
        init();
    }

    public ByteSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ByteSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public ByteSurfaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    public void consumeByteArrayFrame(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        if (this.mIsStart) {
            this.mVideoFrameRender.consumeByteArrayFrame(bArr, i, i2, i3, i4, j);
        }
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.mIsStart) {
            this.mVideoFrameRender.consumeByteBufferFrame(byteBuffer, i, i2, i3, i4, j);
        }
    }

    public void consumeTextureFrame(int i, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        if (this.mIsStart) {
            this.mVideoFrameRender.consumeTextureFrame(i, i2, i3, i4, i5, j, fArr);
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        this.mVideoFrameRender.consumeYUVByteArrayFrame(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, j);
    }
}

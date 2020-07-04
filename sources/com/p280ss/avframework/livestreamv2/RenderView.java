package com.p280ss.avframework.livestreamv2;

import android.opengl.Matrix;
import android.view.SurfaceView;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.opengl.GLRenderVideoSink;
import com.p280ss.avframework.opengl.GLRenderVideoSink.GLRenderer;
import com.p280ss.avframework.opengl.GlRenderDrawer;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.RenderView */
public class RenderView extends GLRenderVideoSink implements GLRenderer {
    private GlRenderDrawer mDrawer;
    private boolean mFitMode;
    private int mFrameHeight;
    private int mFrameWidth;
    private boolean mMirrorX;
    private boolean mMirrorY;
    private float[] mPrj = new float[16];
    private VideoFrameRender mRenderFrame;
    private boolean mSizedChanged;
    private int mWindHeight;
    private int mWindWidth;

    public boolean isFitMode() {
        return this.mFitMode;
    }

    public void onSurfaceCreated() {
        this.mDrawer = new GlRenderDrawer();
    }

    public void onSurfaceDestroy() {
        this.mDrawer.release();
        this.mDrawer = null;
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mMirrorX;
        }
        return this.mMirrorY;
    }

    public void setFitMode(boolean z) {
        this.mFitMode = z;
        this.mSizedChanged = true;
    }

    public RenderView(SurfaceView surfaceView) {
        super(surfaceView);
        setRenderer(this);
        Matrix.setIdentityM(this.mPrj, 0);
        this.mRenderFrame = new VideoFrameRender();
    }

    public void onDrawFrame(VideoFrame videoFrame) {
        if (this.mDrawer != null) {
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (!(!this.mSizedChanged && rotatedHeight == this.mFrameHeight && rotatedWidth == this.mFrameWidth)) {
                calcViewRatio(rotatedWidth, rotatedHeight);
                this.mSizedChanged = false;
            }
            if (!this.mRenderFrame.drawFrame(videoFrame, this.mDrawer, this.mPrj, null, 0, 0, this.mWindWidth, this.mWindHeight)) {
                StringBuilder sb = new StringBuilder("Render frame failed timestamp ");
                sb.append(videoFrame.getTimestampNs());
                AVLog.m143700w("RenderView", sb.toString());
            }
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        this.mWindWidth = i;
        this.mWindHeight = i2;
        this.mSizedChanged = true;
    }

    public void setMirror(boolean z, boolean z2) {
        if (z2) {
            this.mMirrorX = z;
        } else {
            this.mMirrorY = z;
        }
        this.mSizedChanged = true;
    }

    private void calcViewRatio(int i, int i2) {
        this.mFrameHeight = i2;
        this.mFrameWidth = i;
        Matrix.setIdentityM(this.mPrj, 0);
        RendererCommon.calcWindRatio(this.mFitMode, this.mMirrorX, this.mMirrorY, this.mWindWidth, this.mWindHeight, i, i2, this.mPrj);
    }
}

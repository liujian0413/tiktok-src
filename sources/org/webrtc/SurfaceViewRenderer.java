package org.webrtc;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import org.webrtc.EglRenderer.FrameListener;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.RendererCommon.RendererEvents;
import org.webrtc.RendererCommon.ScalingType;
import org.webrtc.RendererCommon.VideoLayoutMeasure;

public class SurfaceViewRenderer extends SurfaceView implements Callback, RendererEvents, VideoSink {
    private final SurfaceEglRenderer eglRenderer = new SurfaceEglRenderer(this.resourceName);
    private boolean enableFixedSize;
    private float radius;
    private RendererEvents rendererEvents;
    private final String resourceName = getResourceName();
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final VideoLayoutMeasure videoLayoutMeasure = new VideoLayoutMeasure();

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (NotFoundException unused) {
            return "";
        }
    }

    public void onFirstFrameRendered() {
        if (this.rendererEvents != null) {
            this.rendererEvents.onFirstFrameRendered();
        }
    }

    private void updateSurfaceSize() {
        int i;
        int i2;
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = ((float) getWidth()) / ((float) getHeight());
        if (((float) this.rotatedFrameWidth) / ((float) this.rotatedFrameHeight) > width) {
            i2 = (int) (((float) this.rotatedFrameHeight) * width);
            i = this.rotatedFrameHeight;
        } else {
            int i3 = this.rotatedFrameWidth;
            i = (int) (((float) this.rotatedFrameWidth) / width);
            i2 = i3;
        }
        int min = Math.min(getWidth(), i2);
        int min2 = Math.min(getHeight(), i);
        StringBuilder sb = new StringBuilder("updateSurfaceSize. Layout size: ");
        sb.append(getWidth());
        sb.append("x");
        sb.append(getHeight());
        sb.append(", frame size: ");
        sb.append(this.rotatedFrameWidth);
        sb.append("x");
        sb.append(this.rotatedFrameHeight);
        sb.append(", requested surface size: ");
        sb.append(min);
        sb.append("x");
        sb.append(min2);
        sb.append(", old surface size: ");
        sb.append(this.surfaceWidth);
        sb.append("x");
        sb.append(this.surfaceHeight);
        logD(sb.toString());
        if (!(min == this.surfaceWidth && min2 == this.surfaceHeight)) {
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            getHolder().setFixedSize(min, min2);
        }
    }

    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setFpsReduction(float f) {
        this.eglRenderer.setFpsReduction(f);
    }

    public void setMirror(boolean z) {
        this.eglRenderer.setMirror(z);
    }

    public void setRadius(float f) {
        this.radius = Math.max(0.0f, f);
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    private void logD(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.resourceName);
        sb.append(": ");
        sb.append(str);
        Logging.m150047d("SurfaceViewRenderer", sb.toString());
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public void setScalingType(ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
        this.eglRenderer.setRenderModel(scalingType);
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
        getHolder().addCallback(this);
        getHolder().addCallback(this.eglRenderer);
        this.radius = 0.0f;
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(17170445)));
    }

    public void draw(Canvas canvas) {
        if (this.radius > 0.0f) {
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.radius, this.radius, Direction.CCW);
            canvas.clipPath(path, Op.REPLACE);
        }
        super.draw(canvas);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        this.eglRenderer.addFrameListener(frameListener, f);
    }

    public void init(EglBase.Context context, RendererEvents rendererEvents2) {
        init(context, rendererEvents2, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onFrameResolutionChanged$0$SurfaceViewRenderer(int i, int i2) {
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
        updateSurfaceSize();
        requestLayout();
    }

    public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        StringBuilder sb = new StringBuilder("onMeasure(). New size: ");
        sb.append(measure.x);
        sb.append("x");
        sb.append(measure.y);
        logD(sb.toString());
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getHolder().addCallback(this);
        getHolder().addCallback(this.eglRenderer);
        this.radius = 0.0f;
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(17170445)));
    }

    public void addFrameListener(FrameListener frameListener, float f, GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f, glDrawer);
    }

    public void onFrameResolutionChanged(int i, int i2, int i3) {
        int i4;
        if (this.rendererEvents != null) {
            this.rendererEvents.onFrameResolutionChanged(i, i2, i3);
        }
        if (i3 == 0 || i3 == 180) {
            i4 = i;
        } else {
            i4 = i2;
        }
        if (i3 == 0 || i3 == 180) {
            i = i2;
        }
        postOrRun(new SurfaceViewRenderer$$Lambda$0(this, i4, i));
    }

    public void init(EglBase.Context context, RendererEvents rendererEvents2, int[] iArr, GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
        updateSurfaceSize();
    }
}

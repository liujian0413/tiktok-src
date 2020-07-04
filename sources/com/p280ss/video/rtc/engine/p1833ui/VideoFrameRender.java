package com.p280ss.video.rtc.engine.p1833ui;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.p280ss.video.rtc.engine.adapter.VideoFrameConverter;
import com.p280ss.video.rtc.engine.mediaio.AutoReleaseJavaI420Buffer;
import com.p280ss.video.rtc.engine.mediaio.IVideoFrameConsumer;
import com.p280ss.video.rtc.engine.mediaio.SurfaceEglRender;
import com.p280ss.video.rtc.engine.mediaio.TextureEglRenderer;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import org.webrtc.EglBase;
import org.webrtc.EglBase.Context;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.RendererCommon;
import org.webrtc.RendererCommon.RendererEvents;
import org.webrtc.RendererCommon.ScalingType;
import org.webrtc.TextureBufferImpl;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;
import org.webrtc.YuvConverter;

/* renamed from: com.ss.video.rtc.engine.ui.VideoFrameRender */
public class VideoFrameRender implements OnLayoutChangeListener, IVideoFrameConsumer, RenderView, RendererEvents {
    private boolean enableFixedSize;
    private boolean hasInit;
    private boolean hasRenderView;
    private EglRenderer mEglRenderer;
    private boolean mEglSurfaceCreated;
    private OnEglSurfaceCreated mOnEglSurfaceCreatedCallback = new VideoFrameRender$$Lambda$0(this);
    private String mRenderName;
    private Surface mSurface;
    private SurfaceView mSurfaceView;
    private Looper mTextureProcessLooper;
    private TextureView mTextureView;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;

    /* renamed from: com.ss.video.rtc.engine.ui.VideoFrameRender$OnEglSurfaceCreated */
    public interface OnEglSurfaceCreated {
        void onCreated();
    }

    static final /* synthetic */ void lambda$renderTextureFrame$4$VideoFrameRender() {
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$new$0$VideoFrameRender() {
        this.mEglSurfaceCreated = true;
    }

    public void onFirstFrameRendered() {
    }

    public void release() {
        onDispose();
    }

    private void initSurfaceView() {
        runOnUIThread(new VideoFrameRender$$Lambda$1(this));
    }

    public void disableFpsReduction() {
        if (this.mEglRenderer != null) {
            this.mEglRenderer.disableFpsReduction();
        }
    }

    public void onStart() {
        if (this.hasRenderView && this.hasInit) {
            if (this.mTextureView != null) {
                initTextureView();
                return;
            }
            if (this.mSurfaceView != null) {
                initSurfaceView();
            }
        }
    }

    private void initTextureView() {
        if (this.mTextureView != null && this.mEglRenderer != null && this.hasInit && (this.mEglRenderer instanceof TextureEglRenderer)) {
            TextureEglRenderer textureEglRenderer = (TextureEglRenderer) this.mEglRenderer;
            textureEglRenderer.bind(this.mTextureView, this.mOnEglSurfaceCreatedCallback);
            if (this.mTextureView.isShown()) {
                textureEglRenderer.setLayoutAspectRatio(((float) this.mTextureView.getMeasuredWidth()) / ((float) this.mTextureView.getMeasuredHeight()));
            }
            this.mTextureView.addOnLayoutChangeListener(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$initSurfaceView$1$VideoFrameRender() {
        if (this.mSurfaceView != null && this.mEglRenderer != null && this.hasInit && (this.mEglRenderer instanceof SurfaceEglRender)) {
            ((SurfaceEglRender) this.mEglRenderer).bind(this.mSurfaceView);
            this.mSurfaceView.addOnLayoutChangeListener(this);
        }
    }

    public void onDispose() {
        this.hasInit = false;
        if (this.mEglRenderer != null) {
            this.mEglRenderer.release();
            this.mEglRenderer.createEglSurface((Surface) null);
        }
        if (this.mSurfaceView != null) {
            this.mSurfaceView.removeOnLayoutChangeListener(this);
            return;
        }
        if (this.mTextureView != null) {
            this.mTextureView.setSurfaceTextureListener(null);
            this.mTextureView.removeOnLayoutChangeListener(this);
        }
    }

    private void updateSurfaceSize() {
        int i;
        int i2;
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || this.mSurfaceView.getWidth() == 0 || this.mSurfaceView.getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            this.mSurfaceView.getHolder().setSizeFromLayout();
            return;
        }
        float width = ((float) this.mSurfaceView.getWidth()) / ((float) this.mSurfaceView.getHeight());
        if (((float) this.rotatedFrameWidth) / ((float) this.rotatedFrameHeight) > width) {
            i2 = (int) (((float) this.rotatedFrameHeight) * width);
            i = this.rotatedFrameHeight;
        } else {
            int i3 = this.rotatedFrameWidth;
            i = (int) (((float) this.rotatedFrameWidth) / width);
            i2 = i3;
        }
        int min = Math.min(this.mSurfaceView.getWidth(), i2);
        int min2 = Math.min(this.mSurfaceView.getHeight(), i);
        StringBuilder sb = new StringBuilder("updateSurfaceSize. Layout size: ");
        sb.append(this.mSurfaceView.getWidth());
        sb.append("x");
        sb.append(this.mSurfaceView.getHeight());
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
        LogUtil.m145278d("VideoFrameRender", sb.toString());
        if (!(min == this.surfaceWidth && min2 == this.surfaceHeight)) {
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            this.mSurfaceView.getHolder().setFixedSize(min, min2);
        }
    }

    public void setProcessTextureLopper(Looper looper) {
        this.mTextureProcessLooper = looper;
    }

    public void setMirror(boolean z) {
        this.mEglRenderer.setMirror(z);
    }

    public VideoFrameRender(String str) {
        this.mRenderName = str;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$init$2$VideoFrameRender(Context context) {
        this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    public void onVideoFrame(VideoFrame videoFrame) {
        if (this.mEglSurfaceCreated) {
            this.mEglRenderer.onFrame(videoFrame);
        }
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    public void setFpsReduction(float f) {
        if (this.mEglRenderer != null) {
            this.mEglRenderer.setFpsReduction(f);
        }
    }

    public void setScalingType(ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.mEglRenderer.setRenderModel(scalingType);
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        }
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void setRenderView(Surface surface) {
        if (!this.mEglSurfaceCreated && surface != null && !this.hasRenderView) {
            this.hasRenderView = true;
            this.mSurface = surface;
            new EglRenderer(this.mRenderName).createEglSurface(surface);
            this.mEglSurfaceCreated = true;
        }
    }

    public void init(Context context) {
        if (this.hasInit) {
            throw new IllegalStateException("Already initialized");
        } else if (this.mSurfaceView != null || this.mSurface != null || this.mTextureView != null || this.mEglRenderer != null) {
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            ThreadUtils.invokeAtFrontUninterruptibly(new Handler(Looper.getMainLooper()), (Runnable) new VideoFrameRender$$Lambda$2(this, context));
            this.hasInit = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onFrameResolutionChanged$3$VideoFrameRender(int i, int i2) {
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
    }

    public void setRenderView(SurfaceView surfaceView, Callback callback) {
        if (!this.mEglSurfaceCreated && surfaceView != null && !this.hasRenderView) {
            this.hasRenderView = true;
            this.mSurfaceView = surfaceView;
            SurfaceEglRender surfaceEglRender = new SurfaceEglRender(this.mRenderName);
            surfaceEglRender.setSurfaceHolderCallback(callback);
            surfaceEglRender.setOnEglSurfaceCreated(this.mOnEglSurfaceCreatedCallback);
            this.mEglRenderer = surfaceEglRender;
        }
    }

    public void setRenderView(TextureView textureView, SurfaceTextureListener surfaceTextureListener) {
        if (!this.mEglSurfaceCreated && textureView != null && !this.hasRenderView) {
            this.hasRenderView = true;
            this.mTextureView = textureView;
            TextureEglRenderer textureEglRenderer = new TextureEglRenderer(this.mRenderName);
            textureEglRenderer.setSurfaceTextureListener(surfaceTextureListener);
            this.mEglRenderer = textureEglRenderer;
        }
    }

    public void onFrameResolutionChanged(int i, int i2, int i3) {
        int i4;
        if (i3 == 0 || i3 == 180) {
            i4 = i;
        } else {
            i4 = i2;
        }
        if (i3 == 0 || i3 == 180) {
            i = i2;
        }
        postOrRun(new VideoFrameRender$$Lambda$3(this, i4, i));
    }

    private Buffer createYUV(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int i3 = (i + 1) / 2;
        int i4 = i * i2;
        int i5 = ((i2 + 1) / 2) * i3;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i4);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i5);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i5);
        allocateDirect.put(bArr, 0, i4);
        allocateDirect2.put(bArr, i4, i5);
        allocateDirect3.put(bArr, i4 + i5, i5);
        allocateDirect.position(0);
        allocateDirect2.position(0);
        allocateDirect3.position(0);
        if (!(this.mEglRenderer instanceof TextureEglRenderer)) {
            return JavaI420Buffer.wrap(i, i2, allocateDirect, i, allocateDirect2, i3, allocateDirect3, i3, null);
        }
        return AutoReleaseJavaI420Buffer.wrap(i, i2, allocateDirect, i, allocateDirect2, i3, allocateDirect3, i3, (TextureEglRenderer) this.mEglRenderer);
    }

    private void renderI420Frame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if (byteBuffer != null) {
            byteBuffer.position(0);
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr, 0, bArr.length);
            renderI420Frame(bArr, i, i2, i3, j);
        }
    }

    private void renderI420Frame(byte[] bArr, int i, int i2, int i3, long j) {
        if (bArr != null) {
            Buffer createYUV = createYUV(bArr, i, i2);
            if (createYUV != null) {
                VideoFrame videoFrame = new VideoFrame(createYUV, i3, j);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    public void consumeByteArrayFrame(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        if (i == 0) {
            renderI420Frame(bArr, i2, i3, i4, j);
        }
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (i == 0) {
            renderI420Frame(byteBuffer, i2, i3, i4, j);
        }
    }

    public void consumeTextureFrame(int i, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        if (i2 == 1) {
            if (this.mTextureProcessLooper == null) {
                this.mTextureProcessLooper = Looper.getMainLooper();
            }
            renderTextureFrame(i, Type.RGB, i3, i4, i5, j, fArr, this.mTextureProcessLooper);
        }
    }

    private void renderTextureFrame(int i, Type type, int i2, int i3, int i4, long j, float[] fArr, Looper looper) {
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i2, i3, type, i, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), new Handler(looper), new YuvConverter(), VideoFrameRender$$Lambda$4.$instance);
        int i5 = i4;
        VideoFrame videoFrame = new VideoFrame(textureBufferImpl, i4, j);
        onVideoFrame(videoFrame);
        videoFrame.release();
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ThreadUtils.checkIsOnMainThread();
        this.mEglRenderer.setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        renderI420Frame(VideoFrameConverter.convertRawYUV2ByteArray(bArr, bArr2, bArr3, i, i2, i3, i4, i5), i4, i5, i6, j);
    }
}

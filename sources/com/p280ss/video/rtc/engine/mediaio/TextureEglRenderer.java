package com.p280ss.video.rtc.engine.mediaio;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.p280ss.video.rtc.engine.p1833ui.VideoFrameRender.OnEglSurfaceCreated;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase.Context;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.mediaio.TextureEglRenderer */
public class TextureEglRenderer extends EglRenderer implements SurfaceTextureListener {
    private static Object TextureViewUniTag = new Object();
    private volatile boolean hasInit = false;
    private CountDownLatch mCountDownLatch;
    private OnEglSurfaceCreated mOnEglSurfaceCreated;
    private SurfaceTextureListener mSurfaceTextureListener;
    private WeakReference<TextureView> mTextureViewRef;
    private Handler mainHandler = new Handler(Looper.getMainLooper());
    private Runnable onFrameCompleteRunnable = new TextureEglRenderer$$Lambda$0(this);

    public Runnable getOnFrameCompleteRunnable() {
        return this.onFrameCompleteRunnable;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$new$0$TextureEglRenderer() {
        if (this.mCountDownLatch != null) {
            this.mCountDownLatch.countDown();
        }
    }

    public void release() {
        LogUtil.m145278d("TextureEglRenderer", "release");
        this.hasInit = false;
        super.release();
        if (this.mTextureViewRef != null) {
            TextureView textureView = (TextureView) this.mTextureViewRef.get();
            if (textureView != null) {
                textureView.setSurfaceTextureListener(null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onFrame$2$TextureEglRenderer(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        this.mSurfaceTextureListener = surfaceTextureListener;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.mSurfaceTextureListener != null) {
            this.mSurfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public TextureEglRenderer(String str) {
        super(str);
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$bind$1$TextureEglRenderer(TextureView textureView) {
        textureView.setSurfaceTextureListener(this);
        if (textureView.getSurfaceTexture() != null) {
            createEglSurface(textureView.getSurfaceTexture());
            if (this.mOnEglSurfaceCreated != null) {
                this.mOnEglSurfaceCreated.onCreated();
            }
        }
    }

    public void onFrame(VideoFrame videoFrame) {
        TextureView textureView = (TextureView) this.mTextureViewRef.get();
        if (videoFrame != null && textureView != null && textureView.isShown() && this.hasInit) {
            if (!(videoFrame.getBuffer() instanceof AutoReleaseJavaI420Buffer) || !(textureView instanceof IVideoSink)) {
                super.onFrame(videoFrame);
                return;
            }
            this.mCountDownLatch = new CountDownLatch(1);
            postOnMainThreadAndLock(new TextureEglRenderer$$Lambda$3(this, videoFrame), this.mCountDownLatch);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LogUtil.m145278d("TextureEglRenderer", "onSurfaceTextureDestroyed");
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.getClass();
        releaseEglSurface(TextureEglRenderer$$Lambda$2.get$Lambda(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        if (this.mSurfaceTextureListener != null) {
            this.mSurfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    private void postOnMainThreadAndLock(Runnable runnable, CountDownLatch countDownLatch) {
        this.mainHandler.post(new TextureEglRenderer$$Lambda$4(runnable, countDownLatch));
    }

    static final /* synthetic */ void lambda$postOnMainThreadAndLock$3$TextureEglRenderer(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        try {
            if (countDownLatch.getCount() != 0) {
                countDownLatch.await();
            }
        } catch (InterruptedException unused) {
        }
    }

    public void bind(TextureView textureView, OnEglSurfaceCreated onEglSurfaceCreated) {
        if (!this.hasInit) {
            LogUtil.m145278d("TextureEglRenderer", "TextureView not init");
            return;
        }
        LogUtil.m145278d("TextureEglRenderer", "bind");
        this.mTextureViewRef = new WeakReference<>(textureView);
        this.mOnEglSurfaceCreated = onEglSurfaceCreated;
        runOnUIThread(new TextureEglRenderer$$Lambda$1(this, textureView));
    }

    public void init(Context context, int[] iArr, GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.m145278d("TextureEglRenderer", "init");
        this.hasInit = true;
        super.init(context, iArr, glDrawer);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.m145278d("TextureEglRenderer", "onSurfaceTextureAvailable");
        createEglSurface(surfaceTexture);
        if (this.mOnEglSurfaceCreated != null) {
            this.mOnEglSurfaceCreated.onCreated();
        }
        if (this.mSurfaceTextureListener != null) {
            this.mSurfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        LogUtil.m145278d("TextureEglRenderer", "onSurfaceTextureSizeChanged");
        if (this.mSurfaceTextureListener != null) {
            this.mSurfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}

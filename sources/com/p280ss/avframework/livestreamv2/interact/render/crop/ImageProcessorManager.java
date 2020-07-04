package com.p280ss.avframework.livestreamv2.interact.render.crop;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.p280ss.avframework.buffer.GlTextureFrameBuffer;
import com.p280ss.avframework.livestreamv2.interact.render.ImageFrame;
import com.p280ss.avframework.livestreamv2.interact.render.opengl.EglBase;
import com.p280ss.avframework.livestreamv2.interact.render.opengl.EglBase$$CC;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.utils.ThreadUtils;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.interact.render.crop.ImageProcessorManager */
public class ImageProcessorManager {
    private boolean isDestroy;
    private long mFrameCounter;
    private long mFrameTimeCost;
    private RenderThread mRenderThread = new RenderThread("FrameCropRenderThread");
    public int mTargetHeight;
    public int mTargetWidth;
    public Texture2DProcessor mTexture2DProcessor;
    public Handler threadHandler;

    /* renamed from: com.ss.avframework.livestreamv2.interact.render.crop.ImageProcessorManager$RenderThread */
    class RenderThread extends HandlerThread {
        private CountDownLatch mCountDownLatch = new CountDownLatch(1);
        private EGLContext mEGLContext10;
        private android.opengl.EGLContext mEGLContext14;
        private EglBase mEglBase;
        private GlTextureFrameBuffer textureFrameBuffer;

        public EglBase getEglBase() {
            return this.mEglBase;
        }

        public GlTextureFrameBuffer getGlTextureFrameBuffer() {
            return this.textureFrameBuffer;
        }

        public void await() {
            try {
                this.mCountDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }

        /* access modifiers changed from: protected */
        public void onLooperPrepared() {
            ImageProcessorManager.this.threadHandler = new Handler(getLooper());
            ImageProcessorManager.this.threadHandler.post(new ImageProcessorManager$RenderThread$$Lambda$0(this));
        }

        public void onStop() {
            if (this.mEglBase != null) {
                if (ImageProcessorManager.this.mTexture2DProcessor != null) {
                    ImageProcessorManager.this.mTexture2DProcessor.release();
                }
                if (this.textureFrameBuffer != null) {
                    this.textureFrameBuffer.release();
                }
                this.mEglBase.release();
            }
        }

        public boolean quit() {
            ThreadUtils.invokeAtFrontUninterruptibly(ImageProcessorManager.this.threadHandler, (Runnable) new ImageProcessorManager$RenderThread$$Lambda$1(this));
            return super.quit();
        }

        public boolean quitSafely() {
            ImageProcessorManager.this.threadHandler.post(new ImageProcessorManager$RenderThread$$Lambda$2(this));
            return super.quitSafely();
        }

        /* access modifiers changed from: private */
        /* renamed from: initEgl */
        public void bridge$lambda$0$ImageProcessorManager$RenderThread() {
            if (this.mEGLContext14 != null) {
                this.mEglBase = EglBase$$CC.createEgl14$$STATIC$$(this.mEGLContext14, EglBase.CONFIG_PIXEL_BUFFER);
            } else if (this.mEGLContext10 != null) {
                this.mEglBase = EglBase$$CC.createEgl10$$STATIC$$(this.mEGLContext10, EglBase.CONFIG_PIXEL_BUFFER);
            }
            try {
                this.mEglBase.createPbufferSurface(ImageProcessorManager.this.mTargetWidth, ImageProcessorManager.this.mTargetHeight);
                this.mEglBase.makeCurrent();
                this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
                this.textureFrameBuffer.setSize(ImageProcessorManager.this.mTargetWidth, ImageProcessorManager.this.mTargetHeight);
                this.mCountDownLatch.countDown();
            } catch (RuntimeException e) {
                this.mEglBase.release();
                quitSafely();
                throw e;
            }
        }

        public void start(android.opengl.EGLContext eGLContext) {
            this.mEGLContext14 = eGLContext;
            start();
            await();
        }

        public void start(EGLContext eGLContext) {
            this.mEGLContext10 = eGLContext;
            start();
            await();
        }

        public RenderThread(String str) {
            super(str, 10);
        }
    }

    public void destroy() {
        if (this.mRenderThread != null && this.mRenderThread.isAlive()) {
            this.isDestroy = true;
            this.mRenderThread.quitSafely();
        }
    }

    public synchronized float getAvgVpsElapse() {
        if (this.mFrameCounter > 0) {
            if (this.mFrameTimeCost > 0) {
                float f = ((float) this.mFrameTimeCost) / ((float) this.mFrameCounter);
                this.mFrameTimeCost = 0;
                this.mFrameCounter = 0;
                return f;
            }
        }
        return 0.0f;
    }

    public synchronized ImageFrame pushImageFrame(ImageFrame imageFrame) {
        if (this.isDestroy) {
            return imageFrame;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ImageFrame pushImage = this.mTexture2DProcessor.pushImage(cropAndScaleWithMatrix(imageFrame));
        this.mFrameTimeCost += System.currentTimeMillis() - currentTimeMillis;
        this.mFrameCounter++;
        return pushImage;
    }

    public ImageFrame cropAndScaleWithMatrix(ImageFrame imageFrame) {
        float f;
        int i;
        int width = imageFrame.getWidth();
        int height = imageFrame.getHeight();
        float f2 = (float) width;
        float f3 = (float) height;
        float f4 = 1.0f;
        int i2 = 0;
        if (f2 / f3 >= ((float) this.mTargetWidth) / ((float) this.mTargetHeight)) {
            i = (width - ((int) ((((float) this.mTargetWidth) / ((float) this.mTargetHeight)) * f3))) / 2;
            f = ((float) ((int) ((((float) this.mTargetWidth) / ((float) this.mTargetHeight)) * f3))) / f2;
        } else {
            i2 = (height - ((int) ((((float) this.mTargetHeight) / ((float) this.mTargetWidth)) * f2))) / 2;
            f4 = ((float) ((int) ((((float) this.mTargetHeight) / ((float) this.mTargetWidth)) * f2))) / f3;
            i = 0;
            f = 1.0f;
        }
        Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(imageFrame.getTransfromMatrix());
        convertMatrixToAndroidGraphicsMatrix.postScale(f, f4);
        convertMatrixToAndroidGraphicsMatrix.postTranslate(((float) i) / f2, ((float) i2) / f3);
        imageFrame.setTransfromMatrix(RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix));
        return imageFrame;
    }

    public ImageProcessorManager(android.opengl.EGLContext eGLContext, int i, int i2) {
        this.mTargetWidth = i;
        this.mTargetHeight = i2;
        this.mRenderThread.start(eGLContext);
        Texture2DProcessor texture2DProcessor = new Texture2DProcessor(this.mTargetWidth, this.mTargetHeight, this.threadHandler, this.mRenderThread.getEglBase(), this.mRenderThread.getGlTextureFrameBuffer());
        this.mTexture2DProcessor = texture2DProcessor;
    }

    public ImageProcessorManager(EGLContext eGLContext, int i, int i2) {
        this.mTargetWidth = i;
        this.mTargetHeight = i2;
        this.mRenderThread.start(eGLContext);
        Texture2DProcessor texture2DProcessor = new Texture2DProcessor(this.mTargetWidth, this.mTargetHeight, this.threadHandler, this.mRenderThread.getEglBase(), this.mRenderThread.getGlTextureFrameBuffer());
        this.mTexture2DProcessor = texture2DProcessor;
    }
}

package com.p280ss.avframework.livestreamv2.interact.vendor.bytertc;

import com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import com.p280ss.avframework.livestreamv2.interact.render.ImageFrame;
import com.p280ss.avframework.livestreamv2.interact.render.crop.ImageProcessorManager;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClient;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientStatisic;
import com.p280ss.video.rtc.engine.utils.ExtVideoFrame;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoClient */
public class ByteVideoClient implements VideoClientStatisic {
    private ByteVideoCallback mCallback;
    private VideoClientFactory mFactory;
    private ImageProcessorManager mFrameCropManager;
    private FrameFormat mFrameFormat;
    private int mInputHeight;
    private int mInputWidth;
    private VideoClient mParent;
    private float[] mTransform = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    private VideoQuality mVideoQuality;

    /* renamed from: com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoClient$1 */
    static /* synthetic */ class C457241 {

        /* renamed from: $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$FrameFormat */
        static final /* synthetic */ int[] f117097xf5400d4b = new int[FrameFormat.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.ss.avframework.livestreamv2.interact.model.Config$FrameFormat[] r0 = com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f117097xf5400d4b = r0
                int[] r0 = f117097xf5400d4b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.avframework.livestreamv2.interact.model.Config$FrameFormat r1 = com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat.TEXTURE_OES     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f117097xf5400d4b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.avframework.livestreamv2.interact.model.Config$FrameFormat r1 = com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat.TEXTURE_2D     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoClient.C457241.<clinit>():void");
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoClient$ByteVideoCallback */
    public interface ByteVideoCallback {
        boolean updateVideoFrame(ExtVideoFrame extVideoFrame);
    }

    public int getInputHeight() {
        return this.mInputHeight;
    }

    public int getInputWidth() {
        return this.mInputWidth;
    }

    public void start() {
        this.mParent.start();
    }

    public void stop() {
        this.mParent.stop();
    }

    public float getAvgVpsElapse() {
        if (this.mFrameCropManager == null) {
            return -1.0f;
        }
        return this.mFrameCropManager.getAvgVpsElapse();
    }

    private int getPixelFormat() {
        if (C457241.f117097xf5400d4b[this.mFrameFormat.ordinal()] != 1) {
            return 10;
        }
        return 11;
    }

    public void prepare() {
        this.mParent = this.mFactory.create();
        this.mParent.prepare(new ByteVideoClient$$Lambda$0(this));
    }

    public void release() {
        this.mFactory.destroy(this.mParent);
        if (this.mFrameCropManager != null) {
            this.mFrameCropManager.destroy();
        }
        this.mParent = null;
    }

    public ByteVideoClient(VideoClientFactory videoClientFactory, FrameFormat frameFormat, VideoQuality videoQuality, ByteVideoCallback byteVideoCallback) {
        this.mFactory = videoClientFactory;
        this.mFrameFormat = frameFormat;
        this.mCallback = byteVideoCallback;
        this.mVideoQuality = videoQuality;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ boolean lambda$prepare$0$ByteVideoClient(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
        if (this.mInputWidth == 0) {
            this.mInputWidth = i2;
        }
        if (this.mInputHeight == 0) {
            this.mInputHeight = i3;
        }
        if (this.mFrameCropManager == null) {
            if (eGLContext2 != null) {
                this.mFrameCropManager = new ImageProcessorManager(eGLContext2, this.mVideoQuality.getWidth(), this.mVideoQuality.getHeight());
            } else if (eGLContext != null) {
                this.mFrameCropManager = new ImageProcessorManager(eGLContext, this.mVideoQuality.getWidth(), this.mVideoQuality.getHeight());
            }
        }
        ImageFrame imageFrame = new ImageFrame(i, i2, i3, this.mTransform);
        if (this.mFrameCropManager != null) {
            imageFrame = this.mFrameCropManager.pushImageFrame(imageFrame);
        }
        ExtVideoFrame extVideoFrame = new ExtVideoFrame();
        extVideoFrame.format = getPixelFormat();
        extVideoFrame.timeStamp = j * TimeUnit.MILLISECONDS.toNanos(1);
        extVideoFrame.stride = imageFrame.getWidth();
        extVideoFrame.height = imageFrame.getHeight();
        extVideoFrame.eglContext11 = eGLContext;
        extVideoFrame.eglContext14 = eGLContext2;
        extVideoFrame.textureID = imageFrame.getTextureID();
        extVideoFrame.syncMode = false;
        extVideoFrame.transform = imageFrame.getTransfromMatrix();
        return this.mCallback.updateVideoFrame(extVideoFrame);
    }
}

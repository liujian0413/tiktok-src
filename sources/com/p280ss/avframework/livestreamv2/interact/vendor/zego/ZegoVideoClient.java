package com.p280ss.avframework.livestreamv2.interact.vendor.zego;

import android.view.View;
import com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import com.p280ss.avframework.livestreamv2.interact.render.ImageFrame;
import com.p280ss.avframework.livestreamv2.interact.render.crop.ImageProcessorManager;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClient;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientStatisic;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice.Client;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoVideoClient */
public class ZegoVideoClient extends ZegoVideoCaptureDevice implements VideoClientStatisic {
    private ZegoVideoCallback mCallback;
    private Client mClient;
    private VideoClientFactory mFactory;
    private ImageProcessorManager mFrameCropManager;
    private FrameFormat mFrameFormat;
    private int mInputHeight;
    private int mInputWidth;
    private VideoClient mParent;
    private VideoQuality mVideoQuality;

    /* renamed from: com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoVideoClient$1 */
    static /* synthetic */ class C457411 {

        /* renamed from: $SwitchMap$com$ss$avframework$livestreamv2$interact$model$Config$FrameFormat */
        static final /* synthetic */ int[] f117098xf5400d4b = new int[FrameFormat.values().length];

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
                f117098xf5400d4b = r0
                int[] r0 = f117098xf5400d4b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.avframework.livestreamv2.interact.model.Config$FrameFormat r1 = com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat.TEXTURE_OES     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f117098xf5400d4b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.avframework.livestreamv2.interact.model.Config$FrameFormat r1 = com.p280ss.avframework.livestreamv2.interact.model.Config.FrameFormat.TEXTURE_2D     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.vendor.zego.ZegoVideoClient.C457411.<clinit>():void");
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoVideoClient$ZegoVideoCallback */
    public interface ZegoVideoCallback {
        void onVideoFrameRenderSuccess();
    }

    public int enableTorch(boolean z) {
        return 0;
    }

    public int getInputHeight() {
        return this.mInputHeight;
    }

    public int getInputWidth() {
        return this.mInputWidth;
    }

    public int setCaptureRotation(int i) {
        return 0;
    }

    public int setFrameRate(int i) {
        return 0;
    }

    public int setFrontCam(int i) {
        return 0;
    }

    public int setPowerlineFreq(int i) {
        return 0;
    }

    public int setResolution(int i, int i2) {
        return 0;
    }

    public int setView(View view) {
        return 0;
    }

    public int setViewMode(int i) {
        return 0;
    }

    public int setViewRotation(int i) {
        return 0;
    }

    public int startPreview() {
        return 0;
    }

    public int stopPreview() {
        return 0;
    }

    public int takeSnapshot() {
        return 0;
    }

    public int startCapture() {
        this.mParent.start();
        return 0;
    }

    public float getAvgVpsElapse() {
        if (this.mFrameCropManager == null) {
            return -1.0f;
        }
        return this.mFrameCropManager.getAvgVpsElapse();
    }

    public int stopCapture() {
        if (this.mFrameCropManager != null) {
            this.mFrameCropManager.destroy();
        }
        this.mParent.stop();
        return 0;
    }

    public synchronized void stopAndDeAllocate() {
        this.mFactory.destroy(this.mParent);
        this.mClient.destroy();
        this.mParent = null;
        this.mClient = null;
    }

    public int supportBufferType() {
        if (C457411.f117098xf5400d4b[this.mFrameFormat.ordinal()] != 1) {
            return 8;
        }
        return 4;
    }

    public void setOnPushFrameSuccessListener(ZegoVideoCallback zegoVideoCallback) {
        this.mCallback = zegoVideoCallback;
    }

    public void allocateAndStart(Client client) {
        this.mClient = client;
        this.mClient.setFillMode(1);
        this.mParent = this.mFactory.create();
        this.mParent.prepare(new ZegoVideoClient$$Lambda$0(this));
    }

    public ZegoVideoClient(VideoClientFactory videoClientFactory, FrameFormat frameFormat, VideoQuality videoQuality) {
        this.mFactory = videoClientFactory;
        this.mFrameFormat = frameFormat;
        this.mVideoQuality = videoQuality;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ boolean lambda$allocateAndStart$0$ZegoVideoClient(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
        if (this.mInputWidth == 0) {
            this.mInputWidth = i2;
        }
        if (this.mInputHeight == 0) {
            this.mInputHeight = i3;
        }
        synchronized (this) {
            if (this.mFrameCropManager == null) {
                if (eGLContext2 != null) {
                    this.mFrameCropManager = new ImageProcessorManager(eGLContext2, this.mVideoQuality.getWidth(), this.mVideoQuality.getHeight());
                } else if (eGLContext != null) {
                    this.mFrameCropManager = new ImageProcessorManager(eGLContext, this.mVideoQuality.getWidth(), this.mVideoQuality.getHeight());
                }
            }
            ImageFrame imageFrame = new ImageFrame(i, i2, i3, ImageFrame.ANDROID_DEFAULT_TRANSFORM_MATRIX);
            if (this.mFrameCropManager != null) {
                imageFrame = this.mFrameCropManager.pushImageFrame(imageFrame);
            }
            if (this.mClient == null) {
                return false;
            }
            this.mClient.onTextureCaptured(imageFrame.getTextureID(), imageFrame.getWidth(), imageFrame.getHeight(), (double) j);
            if (this.mCallback != null) {
                this.mCallback.onVideoFrameRenderSuccess();
            }
            return true;
        }
    }
}

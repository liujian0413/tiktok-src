package com.p280ss.avframework.codec;

import android.media.MediaCodecInfo;
import android.os.Handler;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.opengl.GlUtil;
import com.p280ss.avframework.utils.TEBundle;
import com.p280ss.avframework.utils.ThreadUtils;

/* renamed from: com.ss.avframework.codec.H264HWVideoEncoder */
class H264HWVideoEncoder extends HardwareVideoEncoder {
    private GLThread glEncodeThread = new GLThread("HWH264EncodeThread");
    public MediaCodecInfo info;
    private Handler mHandler;

    public void superRelease() {
        super.release();
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.glEncodeThread != null) {
            this.glEncodeThread.quit();
            this.glEncodeThread = null;
        }
    }

    public boolean setupCodecName() {
        this.info = MediaCodecUtils.findCodecForType("video/avc");
        if (this.info != null) {
            return true;
        }
        return false;
    }

    public H264HWVideoEncoder() {
        this.glEncodeThread.start();
        this.mHandler = this.glEncodeThread.getHandler();
    }

    public synchronized void release() {
        if (this.mHandler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    H264HWVideoEncoder.this.superRelease();
                }
            });
            this.glEncodeThread.quit();
            this.glEncodeThread = null;
            this.mHandler = null;
        }
    }

    public int superEncode(VideoFrame videoFrame) {
        return super.Encode(videoFrame);
    }

    public boolean superInitEncoder(TEBundle tEBundle) {
        return super.InitEncoder(tEBundle);
    }

    public void setNativeObj(long j) {
        super.setNativeObj(j);
        if (j == 0) {
            release();
        }
    }

    public int Encode(final VideoFrame videoFrame) {
        videoFrame.retain();
        if (!this.mHandler.post(new Runnable() {
            public void run() {
                H264HWVideoEncoder.this.superEncode(videoFrame);
                videoFrame.release();
            }
        })) {
            videoFrame.release();
        }
        return 0;
    }

    public boolean InitEncoder(final TEBundle tEBundle) {
        if (this.info == null || this.mHandler == null) {
            return false;
        }
        final boolean[] zArr = {false};
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    String str = "video/avc";
                    H264HWVideoEncoder.this.setupCodecName(H264HWVideoEncoder.this.info.getName(), str, MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, H264HWVideoEncoder.this.info.getCapabilitiesForType(str)), MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, H264HWVideoEncoder.this.info.getCapabilitiesForType(str)));
                    GlUtil.nativeAttachThreadToOpenGl();
                    zArr[0] = H264HWVideoEncoder.this.superInitEncoder(tEBundle);
                }
            });
        } catch (Throwable unused) {
        }
        return zArr[0];
    }
}

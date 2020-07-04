package com.p280ss.avframework.codec;

import android.media.MediaCodecInfo;
import android.os.Handler;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.opengl.GlUtil;
import com.p280ss.avframework.utils.TEBundle;
import com.p280ss.avframework.utils.ThreadUtils;

/* renamed from: com.ss.avframework.codec.H265HWVideoEncoder */
public class H265HWVideoEncoder extends HardwareVideoEncoder {
    private GLThread glEncodeThread = new GLThread("HWH265EncodeThread");
    public MediaCodecInfo info;
    private Handler mHandler;

    public void superRelease() {
        super.release();
    }

    public /* bridge */ /* synthetic */ int[] getColorFormats() {
        return super.getColorFormats();
    }

    public /* bridge */ /* synthetic */ byte[] getExtraData() {
        return super.getExtraData();
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.glEncodeThread != null) {
            this.glEncodeThread.quit();
            this.glEncodeThread = null;
        }
    }

    public boolean setupCodecName() {
        this.info = MediaCodecUtils.findCodecForType("video/hevc");
        if (this.info != null) {
            return true;
        }
        return false;
    }

    public H265HWVideoEncoder() {
        this.glEncodeThread.start();
        this.mHandler = this.glEncodeThread.getHandler();
    }

    public synchronized void release() {
        if (this.mHandler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    H265HWVideoEncoder.this.superRelease();
                }
            });
            this.glEncodeThread.quit();
            this.glEncodeThread = null;
            this.mHandler = null;
        }
    }

    public /* bridge */ /* synthetic */ void SetBitrate(int i) {
        super.SetBitrate(i);
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
                H265HWVideoEncoder.this.superEncode(videoFrame);
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
                    String str = "video/hevc";
                    H265HWVideoEncoder.this.setupCodecName(H265HWVideoEncoder.this.info.getName(), str, MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, H265HWVideoEncoder.this.info.getCapabilitiesForType(str)), MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, H265HWVideoEncoder.this.info.getCapabilitiesForType(str)));
                    GlUtil.nativeAttachThreadToOpenGl();
                    zArr[0] = H265HWVideoEncoder.this.superInitEncoder(tEBundle);
                }
            });
        } catch (Throwable unused) {
        }
        return zArr[0];
    }

    public /* bridge */ /* synthetic */ void setupCodecName(String str, String str2, Integer num, Integer num2) {
        super.setupCodecName(str, str2, num, num2);
    }
}

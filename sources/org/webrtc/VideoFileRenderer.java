package org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.taobao.android.dexposed.ClassUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase.Context;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;

public class VideoFileRenderer implements VideoSink {
    public EglBase eglBase;
    private final HandlerThread fileThread;
    private final Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    public YuvConverter yuvConverter;

    public void release() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.renderThreadHandler.post(new VideoFileRenderer$$Lambda$2(this, countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new VideoFileRenderer$$Lambda$3(this));
        try {
            this.fileThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Logging.m150049e("VideoFileRenderer", "Interrupted while waiting for the write to disk to complete.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$release$3$VideoFileRenderer() {
        try {
            this.videoOutFile.close();
            StringBuilder sb = new StringBuilder("Video written to disk as ");
            sb.append(this.outputFileName);
            sb.append(". The number of frames is ");
            sb.append(this.frameCount);
            sb.append(" and the dimensions of the frames are ");
            sb.append(this.outputFileWidth);
            sb.append("x");
            sb.append(this.outputFileHeight);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            Logging.m150047d("VideoFileRenderer", sb.toString());
            this.fileThread.quit();
        } catch (IOException e) {
            throw new RuntimeException("Error closing output file", e);
        }
    }

    public void onFrame(VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new VideoFileRenderer$$Lambda$0(this, videoFrame));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$release$2$VideoFileRenderer(CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    /* renamed from: renderFrameOnRenderThread */
    public void lambda$onFrame$0$VideoFileRenderer(VideoFrame videoFrame) {
        int i;
        int i2;
        Buffer buffer = videoFrame.getBuffer();
        if (videoFrame.getRotation() % NormalGiftView.ALPHA_180 == 0) {
            i = this.outputFileWidth;
        } else {
            i = this.outputFileHeight;
        }
        int i3 = i;
        if (videoFrame.getRotation() % NormalGiftView.ALPHA_180 == 0) {
            i2 = this.outputFileHeight;
        } else {
            i2 = this.outputFileWidth;
        }
        int i4 = i2;
        float width = ((float) buffer.getWidth()) / ((float) buffer.getHeight());
        float f = ((float) i3) / ((float) i4);
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f > width) {
            height = (int) (((float) height) * (width / f));
        } else {
            width2 = (int) (((float) width2) * (f / width));
        }
        Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i3, i4);
        videoFrame.release();
        I420Buffer i420 = cropAndScale.toI420();
        cropAndScale.release();
        this.fileThreadHandler.post(new VideoFileRenderer$$Lambda$1(this, i420, videoFrame));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$renderFrameOnRenderThread$1$VideoFileRenderer(I420Buffer i420Buffer, VideoFrame videoFrame) {
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(Charset.forName("US-ASCII")));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (IOException e) {
            throw new RuntimeException("Error writing video to disk", e);
        }
    }

    public VideoFileRenderer(String str, int i, int i2, final Context context) throws IOException {
        if (i % 2 == 1 || i2 % 2 == 1) {
            throw new IllegalArgumentException("Does not support uneven width or height");
        }
        this.outputFileName = str;
        this.outputFileWidth = i;
        this.outputFileHeight = i2;
        this.outputFrameSize = ((i * i2) * 3) / 2;
        this.outputFrameBuffer = ByteBuffer.allocateDirect(this.outputFrameSize);
        this.videoOutFile = new FileOutputStream(str);
        FileOutputStream fileOutputStream = this.videoOutFile;
        StringBuilder sb = new StringBuilder("YUV4MPEG2 C420 W");
        sb.append(i);
        sb.append(" H");
        sb.append(i2);
        sb.append(" Ip F30:1 A1:1\n");
        fileOutputStream.write(sb.toString().getBytes(Charset.forName("US-ASCII")));
        this.renderThread = new HandlerThread("VideoFileRendererRenderThread");
        this.renderThread.start();
        this.renderThreadHandler = new Handler(this.renderThread.getLooper());
        this.fileThread = new HandlerThread("VideoFileRendererFileThread");
        this.fileThread.start();
        this.fileThreadHandler = new Handler(this.fileThread.getLooper());
        ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, (Runnable) new Runnable() {
            public void run() {
                VideoFileRenderer.this.eglBase = EglBase$$CC.create$$STATIC$$(context, EglBase.CONFIG_PIXEL_BUFFER);
                VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                VideoFileRenderer.this.eglBase.makeCurrent();
                VideoFileRenderer.this.yuvConverter = new YuvConverter();
            }
        });
    }
}

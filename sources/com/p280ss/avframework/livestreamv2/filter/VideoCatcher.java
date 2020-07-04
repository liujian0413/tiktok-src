package com.p280ss.avframework.livestreamv2.filter;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.capture.video.ExternalVideoCapturer;
import com.p280ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver;
import com.p280ss.avframework.codec.DefaultVideoEncoderFactory;
import com.p280ss.avframework.engine.MediaEncodeStream;
import com.p280ss.avframework.engine.MediaEncodeStream.Observer;
import com.p280ss.avframework.engine.MediaEngineFactory;
import com.p280ss.avframework.engine.Transport;
import com.p280ss.avframework.engine.Transport.FeedbackObserver;
import com.p280ss.avframework.engine.Transport.MediaPacket;
import com.p280ss.avframework.engine.VideoEncoderFactory;
import com.p280ss.avframework.engine.VideoTrack;
import com.p280ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.TEBundle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.avframework.livestreamv2.filter.VideoCatcher */
public class VideoCatcher implements VideoCapturerObserver, Observer {
    private String[] mAvailableVideoEncoders;
    public CatchVideoCallback mCallback;
    private TEBundle mEncodeStreamOpt;
    private int mFps;
    private H264Dumper mH264Dumper;
    public Handler mHandler;
    private int mHeight;
    private MediaEncodeStream mMediaEncodeStream;
    private int mMode;
    private PngShotter mPngShotter;
    private AtomicBoolean mStarted = new AtomicBoolean(false);
    private boolean mUseHardwareEncoder = true;
    private ExternalVideoCapturer mVideoCapturer;
    private VideoEncoderFactory mVideoEncoderFactory;
    private VideoTrack mVideoTrack;
    private int mWidth;

    /* renamed from: com.ss.avframework.livestreamv2.filter.VideoCatcher$H264Dumper */
    class H264Dumper extends Transport {
        public int codeOnQuit;
        public Object mDumpFence;
        private Thread mDumpThread;
        public ConcurrentLinkedQueue<MediaPacket> mPacketQueue;
        public boolean mRunning;

        public void registerFeedbackObserber(FeedbackObserver feedbackObserver) {
        }

        public void unRegisterFeedbackObserber(FeedbackObserver feedbackObserver) {
        }

        private H264Dumper() {
            this.mPacketQueue = new ConcurrentLinkedQueue<>();
            this.mDumpFence = new Object();
            this.codeOnQuit = 0;
        }

        public void sendPacket(MediaPacket mediaPacket) {
            this.mPacketQueue.offer(mediaPacket);
            synchronized (this.mDumpFence) {
                this.mDumpFence.notify();
            }
        }

        public void stop(int i) {
            this.mRunning = false;
            this.codeOnQuit = i;
            synchronized (this.mDumpFence) {
                this.mDumpFence.notifyAll();
            }
            try {
                this.mDumpThread.join(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
            } catch (Exception unused) {
            }
            this.mDumpThread = null;
        }

        public boolean setupUrl(final String str) {
            this.mDumpThread = new Thread(new Runnable() {
                private String mH264OutputPath;
                private FileOutputStream mH264OutputStream;

                private void onQuit() {
                    if (this.mH264OutputStream != null) {
                        while (!H264Dumper.this.mPacketQueue.isEmpty()) {
                            MediaPacket mediaPacket = (MediaPacket) H264Dumper.this.mPacketQueue.poll();
                            if (mediaPacket != null) {
                                try {
                                    this.mH264OutputStream.getChannel().write(mediaPacket.buffer);
                                } catch (Exception e) {
                                    if (VideoCatcher.this.mCallback != null) {
                                        VideoCatcher.this.mCallback.onError(-5, e.toString());
                                    }
                                }
                            }
                        }
                        try {
                            this.mH264OutputStream.close();
                        } catch (IOException unused) {
                        }
                        this.mH264OutputStream = null;
                    }
                    if (H264Dumper.this.codeOnQuit != 0) {
                        try {
                            File file = new File(this.mH264OutputPath);
                            if (file.exists() && file.isFile()) {
                                file.delete();
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }

                public void run() {
                    this.mH264OutputPath = str;
                    H264Dumper.this.mRunning = onStart();
                    while (H264Dumper.this.mRunning) {
                        if (H264Dumper.this.mPacketQueue.isEmpty()) {
                            try {
                                synchronized (H264Dumper.this.mDumpFence) {
                                    H264Dumper.this.mDumpFence.wait();
                                }
                            } catch (Exception e) {
                                if (VideoCatcher.this.mCallback != null) {
                                    VideoCatcher.this.mCallback.onError(-5, e.toString());
                                }
                            }
                        }
                        MediaPacket mediaPacket = (MediaPacket) H264Dumper.this.mPacketQueue.poll();
                        if (!(mediaPacket == null || this.mH264OutputStream == null)) {
                            try {
                                this.mH264OutputStream.getChannel().write(mediaPacket.buffer);
                            } catch (Exception e2) {
                                if (VideoCatcher.this.mCallback != null) {
                                    VideoCatcher.this.mCallback.onError(-5, e2.toString());
                                }
                            }
                        }
                    }
                    onQuit();
                }

                private boolean onStart() {
                    try {
                        File file = new File(this.mH264OutputPath);
                        String parent = file.getParent();
                        File file2 = new File(parent);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        if (!file2.exists()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(parent);
                            sb.append(" doesn't exist.");
                            throw new Exception(sb.toString());
                        } else if (file2.canWrite()) {
                            if (file.exists() && file.isFile()) {
                                file.delete();
                            }
                            this.mH264OutputStream = new FileOutputStream(file, false);
                            return true;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(parent);
                            sb2.append(" is forbidden to write.");
                            throw new Exception(sb2.toString());
                        }
                    } catch (Exception e) {
                        if (this.mH264OutputStream != null) {
                            try {
                                this.mH264OutputStream.close();
                            } catch (IOException unused) {
                            }
                            this.mH264OutputStream = null;
                        }
                        if (VideoCatcher.this.mCallback != null) {
                            VideoCatcher.this.mCallback.onError(-5, e.toString());
                        }
                        return false;
                    }
                }
            });
            Thread thread = this.mDumpThread;
            StringBuilder sb = new StringBuilder("DumpH264Thread_");
            sb.append(this.mDumpThread);
            thread.setName(sb.toString());
            this.mDumpThread.start();
            return true;
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.VideoCatcher$PngShotter */
    class PngShotter {
        public Bitmap mBitmap;
        private ByteBuffer mBuffer;
        public int mCount;
        public Object mFence;
        public String mPngSaveDir;
        private Handler mShotHandler;
        private HandlerThread mShotThread;

        private PngShotter() {
            this.mFence = new Object();
        }

        public void stop(final int i) {
            Handler handler = VideoCatcher.this.mHandler;
            if (handler != null) {
                this.mShotHandler = null;
                handler.post(new Runnable() {
                    public void run() {
                        if (i != 0) {
                            File file = new File(PngShotter.this.mPngSaveDir);
                            if (file.exists() && file.isDirectory()) {
                                for (int i = 1; i <= PngShotter.this.mCount; i++) {
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(PngShotter.this.mPngSaveDir);
                                        sb.append("/");
                                        sb.append(i);
                                        sb.append(".png");
                                        File file2 = new File(sb.toString());
                                        if (file2.exists() && file2.isFile()) {
                                            file2.delete();
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                });
                if (this.mShotThread != null) {
                    if (VERSION.SDK_INT >= 18) {
                        this.mShotThread.quitSafely();
                    } else {
                        this.mShotThread.quit();
                    }
                    this.mShotThread = null;
                }
                if (this.mBitmap != null) {
                    if (!this.mBitmap.isRecycled()) {
                        this.mBitmap.recycle();
                        System.gc();
                    }
                    this.mBitmap = null;
                }
                if (this.mBuffer != null) {
                    this.mBuffer = null;
                }
            }
        }

        public void readPixels(int i, int i2) {
            try {
                this.mBuffer.clear();
                GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, this.mBuffer);
            } catch (Exception unused) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    StringBuilder sb = new StringBuilder("glReadPixels error ");
                    sb.append(glGetError);
                    AVLog.logToIODevice2(6, "VideoCatcher", sb.toString(), null, "VideoCatcher.PngShotter:onFrame", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                }
            }
            try {
                synchronized (this.mFence) {
                    this.mBitmap.copyPixelsFromBuffer(this.mBuffer);
                }
            } catch (Exception unused2) {
            }
            this.mShotHandler.post(new Runnable() {
                public void run() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(PngShotter.this.mPngSaveDir);
                    sb.append("/");
                    PngShotter pngShotter = PngShotter.this;
                    int i = pngShotter.mCount + 1;
                    pngShotter.mCount = i;
                    sb.append(i);
                    sb.append(".png");
                    try {
                        File file = new File(sb.toString());
                        if (file.exists()) {
                            file.delete();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        synchronized (PngShotter.this.mFence) {
                            PngShotter.this.mBitmap.compress(CompressFormat.PNG, 100, fileOutputStream);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception unused) {
                    }
                }
            });
        }

        public void start(int i, int i2, String str) {
            this.mPngSaveDir = str;
            this.mBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
            this.mBuffer = ByteBuffer.allocateDirect(i * i2 * 4);
            this.mShotThread = new HandlerThread("");
            HandlerThread handlerThread = this.mShotThread;
            StringBuilder sb = new StringBuilder("PngShotThread_");
            sb.append(this.mShotThread);
            handlerThread.setName(sb.toString());
            this.mShotThread.start();
            this.mShotHandler = new Handler(this.mShotThread.getLooper());
            this.mShotHandler.post(new Runnable() {
                public void run() {
                    try {
                        File file = new File(PngShotter.this.mPngSaveDir);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        if (!file.exists()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(file);
                            sb.append(" doesn't exist.");
                            throw new Exception(sb.toString());
                        } else if (!file.canWrite()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(file);
                            sb2.append(" is forbidden to write.");
                            throw new Exception(sb2.toString());
                        }
                    } catch (Exception e) {
                        if (VideoCatcher.this.mCallback != null) {
                            VideoCatcher.this.mCallback.onError(-5, e.toString());
                        }
                    }
                }
            });
        }
    }

    public int getMode() {
        return this.mMode;
    }

    public void release() {
    }

    public void onVideoCapturerStarted() {
        AVLog.iod("VideoCatcher", "onVideoCapturerStarted");
    }

    public void onVideoCapturerStoped() {
        AVLog.iod("VideoCatcher", "onVideoCapturerStoped");
    }

    private String chooseVideoEncode() {
        String[] strArr;
        if (this.mAvailableVideoEncoders == null) {
            String GetSupportedFormats = this.mVideoEncoderFactory.GetSupportedFormats();
            if (GetSupportedFormats != null) {
                this.mAvailableVideoEncoders = GetSupportedFormats.split(":");
            } else {
                throw new AndroidRuntimeException("Not found any valid video encoder");
            }
        }
        String str = null;
        if (this.mUseHardwareEncoder) {
            String str2 = null;
            for (String str3 : this.mAvailableVideoEncoders) {
                if (str3.contains("video_enable_accelera=true") && str3.contains("video_type=video/avc")) {
                    str2 = "video/avc";
                }
            }
            str = str2;
        }
        if (str != null) {
            return str;
        }
        AVLog.iow("VideoCatcher", "Hardware video encoder not found, use x264 instead.");
        String str4 = "video/x264";
        this.mUseHardwareEncoder = false;
        return str4;
    }

    private void setupParameter() {
        if (this.mMediaEncodeStream != null) {
            if (this.mEncodeStreamOpt == null) {
                this.mEncodeStreamOpt = this.mMediaEncodeStream.getParameter();
            }
            this.mEncodeStreamOpt.setString("video_type", chooseVideoEncode());
            this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mUseHardwareEncoder);
            this.mEncodeStreamOpt.setInt("video_width", this.mWidth);
            this.mEncodeStreamOpt.setInt("video_height", this.mHeight);
            this.mEncodeStreamOpt.setInt("video_profileLevel", 3);
            this.mEncodeStreamOpt.setInt("video_fps", this.mFps);
            this.mEncodeStreamOpt.setInt("video_gop", this.mFps * 2);
            this.mEncodeStreamOpt.setInt("video_is_cbr", 1);
            this.mEncodeStreamOpt.setInt("configuration_type", 1);
            this.mEncodeStreamOpt.setBool("video_lossless_encode", true);
            StringBuilder sb = new StringBuilder("Dump all encodeStream config:");
            sb.append(this.mEncodeStreamOpt.toString());
            AVLog.iod("VideoCatcher", sb.toString());
            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
        }
    }

    public void onCreateEncoderError() {
        String string = this.mEncodeStreamOpt.getString("video_type");
        if (this.mMediaEncodeStream != null) {
            String string2 = this.mEncodeStreamOpt.getString("video_type");
            int i = this.mEncodeStreamOpt.getInt("video_profileLevel");
            if (this.mUseHardwareEncoder) {
                int i2 = 1;
                if (i == 1) {
                    this.mUseHardwareEncoder = false;
                    string2 = "video/x264";
                    i2 = 3;
                }
                StringBuilder sb = new StringBuilder("Video encoder switch to ");
                sb.append(string2);
                sb.append(", hardware ");
                sb.append(this.mUseHardwareEncoder);
                sb.append(", profile ");
                sb.append(i2);
                AVLog.iow("VideoCatcher", sb.toString());
                this.mEncodeStreamOpt.setString("video_type", string2);
                this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mUseHardwareEncoder);
                this.mEncodeStreamOpt.setInt("video_profileLevel", i2);
                this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                return;
            }
            StringBuilder sb2 = new StringBuilder("Video encoder(");
            sb2.append(string);
            sb2.append(") created failed");
            String sb3 = sb2.toString();
            AVLog.ioe("VideoCatcher", sb3);
            if (this.mCallback != null) {
                this.mCallback.onError(-4, sb3);
            }
        }
    }

    public void stop(int i) {
        if (this.mMediaEncodeStream != null) {
            this.mMediaEncodeStream.stop();
        }
        if (!(this.mMediaEncodeStream == null || this.mVideoTrack == null)) {
            this.mMediaEncodeStream.removeTrack(this.mVideoTrack);
        }
        if (this.mH264Dumper != null) {
            this.mH264Dumper.stop(i);
            this.mH264Dumper = null;
        }
        if (this.mEncodeStreamOpt != null) {
            this.mEncodeStreamOpt.release();
            this.mEncodeStreamOpt = null;
        }
        if (this.mMediaEncodeStream != null) {
            this.mMediaEncodeStream.registerObserver(null);
            this.mMediaEncodeStream.release();
            this.mMediaEncodeStream = null;
        }
        if (this.mVideoEncoderFactory != null) {
            this.mVideoEncoderFactory.release();
            this.mVideoEncoderFactory = null;
        }
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
        if (this.mVideoTrack != null) {
            this.mVideoTrack.release();
            this.mVideoTrack = null;
        }
        if (this.mPngShotter != null) {
            this.mPngShotter.stop(i);
            this.mPngShotter = null;
        }
        this.mStarted.set(false);
    }

    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        if (this.mMode == 0) {
            Buffer buffer = videoFrame.getBuffer();
            if (!(buffer instanceof TextureBuffer)) {
                if (this.mCallback != null) {
                    this.mCallback.onError(-4, "Video frame type not supported.");
                }
                return;
            }
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            if (width != this.mWidth || height != this.mHeight) {
                if (this.mCallback != null) {
                    CatchVideoCallback catchVideoCallback = this.mCallback;
                    StringBuilder sb = new StringBuilder("Video frame size (");
                    sb.append(width);
                    sb.append(", ");
                    sb.append(height);
                    sb.append(") does not match the init size (");
                    sb.append(this.mWidth);
                    sb.append(", ");
                    sb.append(this.mHeight);
                    sb.append(")");
                    catchVideoCallback.onError(-4, sb.toString());
                }
            } else if (this.mVideoCapturer != null) {
                TextureBuffer textureBuffer = (TextureBuffer) buffer;
                Type type = textureBuffer.getType();
                float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
                ExternalVideoCapturer externalVideoCapturer = this.mVideoCapturer;
                int textureId = textureBuffer.getTextureId();
                if (type == Type.OES) {
                    z = true;
                } else {
                    z = false;
                }
                externalVideoCapturer.pushVideoFrame(textureId, z, width, height, 0, convertMatrixFromAndroidGraphicsMatrix, videoFrame.getTimestampNs() / 1000, null);
            }
        }
    }

    public void onVideoCapturerError(int i, Exception exc) {
        if (this.mCallback != null) {
            CatchVideoCallback catchVideoCallback = this.mCallback;
            StringBuilder sb = new StringBuilder("onVideoCapturerError: ");
            sb.append(i);
            sb.append(", ");
            sb.append(exc.toString());
            catchVideoCallback.onError(-3, sb.toString());
        }
    }

    public void readPixels(int i, int i2) {
        if (this.mMode == 1) {
            if (i != this.mWidth || i2 != this.mHeight) {
                if (this.mCallback != null) {
                    CatchVideoCallback catchVideoCallback = this.mCallback;
                    StringBuilder sb = new StringBuilder("Video frame size (");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i2);
                    sb.append(") does not match the init size (");
                    sb.append(this.mWidth);
                    sb.append(", ");
                    sb.append(this.mHeight);
                    sb.append(")");
                    catchVideoCallback.onError(-4, sb.toString());
                }
            } else if (this.mPngShotter != null) {
                this.mPngShotter.readPixels(i, i2);
            }
        }
    }

    public void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
        Handler handler = this.mHandler;
        final int i3 = i;
        final int i4 = i2;
        final long j2 = j;
        final String str2 = str;
        C456881 r1 = new Runnable() {
            public void run() {
                int i = i3;
                if (i != 5) {
                    switch (i) {
                        case 1:
                            AVLog.iod("VideoCatcher", "Video encoder created");
                            return;
                        case 2:
                            VideoCatcher.this.onCreateEncoderError();
                            return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Video encoder format changed: code1 ");
                    sb.append(i3);
                    sb.append(", code2 ");
                    sb.append(i4);
                    sb.append(", code3 ");
                    sb.append(j2);
                    sb.append(", msg \"");
                    sb.append(str2);
                    sb.append("\"");
                    AVLog.iow("VideoCatcher", sb.toString());
                }
            }
        };
        handler.post(r1);
    }

    public void start(int i, int i2, int i3, int i4, boolean z, String str, CatchVideoCallback catchVideoCallback, MediaEngineFactory mediaEngineFactory, Handler handler) {
        if (this.mStarted.get()) {
            if (catchVideoCallback != null) {
                catchVideoCallback.onError(-2, "Video catching already started.");
            }
            return;
        }
        this.mStarted.set(true);
        if ((i == 0 || i == 1) && i2 > 0 && i3 > 0 && i4 > 0 && !TextUtils.isEmpty(str) && mediaEngineFactory != null && handler != null) {
            this.mMode = i;
            this.mWidth = i2;
            this.mHeight = i3;
            this.mFps = i4;
            this.mCallback = catchVideoCallback;
            this.mHandler = handler;
            if (this.mMode == 0) {
                this.mVideoCapturer = new ExternalVideoCapturer(this, handler);
                this.mVideoTrack = mediaEngineFactory.createVideoTrack(this.mVideoCapturer);
                this.mUseHardwareEncoder = z;
                this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
                this.mH264Dumper = new H264Dumper();
                this.mMediaEncodeStream = mediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mH264Dumper);
                this.mMediaEncodeStream.registerObserver(this);
                this.mMediaEncodeStream.start();
                setupParameter();
                this.mH264Dumper.setupUrl(str);
                this.mMediaEncodeStream.addTrack(this.mVideoTrack);
                this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
                return;
            }
            this.mPngShotter = new PngShotter();
            this.mPngShotter.start(this.mWidth, this.mHeight, str);
            return;
        }
        if (catchVideoCallback != null) {
            StringBuilder sb = new StringBuilder("Param error: mode ");
            sb.append(i);
            sb.append(", width ");
            sb.append(i2);
            sb.append(", height ");
            sb.append(i3);
            sb.append(", fps ");
            sb.append(i4);
            sb.append(", outputPath ");
            sb.append(str);
            sb.append(", MediaEngineFactory ");
            sb.append(mediaEngineFactory);
            sb.append(", handler ");
            sb.append(handler);
            catchVideoCallback.onError(-1, sb.toString());
        }
    }
}

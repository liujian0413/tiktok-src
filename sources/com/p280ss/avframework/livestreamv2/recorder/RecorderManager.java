package com.p280ss.avframework.livestreamv2.recorder;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.p280ss.android.socialbase.downloader.impls.C20318n;
import com.p280ss.avframework.buffer.SurfaceTextureHelper;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.capture.audio.AudioCapturer;
import com.p280ss.avframework.capture.video.ScreenVideoCapturer;
import com.p280ss.avframework.capture.video.VideoCapturer;
import com.p280ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver;
import com.p280ss.avframework.codec.DefaultVideoEncoderFactory;
import com.p280ss.avframework.engine.AudioTrack;
import com.p280ss.avframework.engine.MediaEncodeStream;
import com.p280ss.avframework.engine.MediaEncodeStream.Observer;
import com.p280ss.avframework.engine.MediaEngineFactory;
import com.p280ss.avframework.engine.Transport;
import com.p280ss.avframework.engine.Transport.EventObserver;
import com.p280ss.avframework.engine.Transport.FeedbackObserver;
import com.p280ss.avframework.engine.Transport.MediaPacket;
import com.p280ss.avframework.engine.VideoEncoderFactory;
import com.p280ss.avframework.engine.VideoProcessor;
import com.p280ss.avframework.engine.VideoSink;
import com.p280ss.avframework.engine.VideoTrack;
import com.p280ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture;
import com.p280ss.avframework.livestreamv2.recorder.IRecorderManager.Config;
import com.p280ss.avframework.livestreamv2.recorder.IRecorderManager.IRecorderListener;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.opengl.GlUtil;
import com.p280ss.avframework.recorder.MediaRecorder;
import com.p280ss.avframework.recorder.NativeMp4Recorder;
import com.p280ss.avframework.recorder.SystemMediaRecorder;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.TEBundle;
import com.p280ss.avframework.utils.ThreadUtils;
import com.p280ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager */
public class RecorderManager implements VideoCapturerObserver, Observer, EventObserver, IRecorderManager {
    private final int STAT_ERROR;
    private final int STAT_RELEASE;
    private final int STAT_START;
    private final int STAT_STOP;
    private int mAudioRecordIdx;
    private AudioTrack mAudioTrack;
    public Config mConfig;
    private boolean mEnableAccelera;
    public TEBundle mEncodeOpt;
    private Transport mEncodeStreamCallback;
    public IRecorderManager mExternRecordMgr;
    private String mFile;
    public Handler mGLHandler;
    private GLThread mGLThread;
    public IRecorderListener mListener;
    public MediaEncodeStream mMediaEncodeStream;
    private MediaEngineFactory mMediaEngineFactory;
    private ArrayList<MediaPacket> mMediaPacketsCache;
    public int mMode;
    public long mReceiveAudioFrameCounts;
    public long mReceiveVideoFrameCounts;
    private HandlerThread mRecordThread;
    private Handler mRecordThreadHandler;
    private MediaRecorder mRecorder;
    private Context mScreenContext;
    private Intent mScreenIntent;
    private AudioCapturer mSharedAudioCapture;
    private RecordVideoSink mSharedCaptureSink;
    private VideoCapturer mSharedVideoCapture;
    public AtomicInteger mState;
    public SurfaceTextureSharedHandler mSurfaceTextureSharedHandler;
    private VideoCapturer mVideoCapturer;
    private VideoEncoderFactory mVideoEncoderFactory;
    private int mVideoRecordIdx;
    private VideoTrack mVideoTrack;
    private WaterMarkProcess mWaterMarkProcess;
    private long mWriteAudioFrameCounts;
    private long mWriteVideoFrameCounts;

    /* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager$EncodeStreamCallback */
    class EncodeStreamCallback extends Transport {
        public void registerFeedbackObserber(FeedbackObserver feedbackObserver) {
        }

        public void unRegisterFeedbackObserber(FeedbackObserver feedbackObserver) {
        }

        private EncodeStreamCallback() {
        }

        public void sendPacket(MediaPacket mediaPacket) {
            if (mediaPacket.isVideo) {
                RecorderManager.this.mReceiveVideoFrameCounts++;
            } else {
                RecorderManager.this.mReceiveAudioFrameCounts++;
            }
            RecorderManager.this.receiverPacket(mediaPacket);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager$ScreenSourceWrapper */
    class ScreenSourceWrapper extends ScreenVideoCapturer {
        private long mBaseTime;
        private long mLastTime;

        public void setOutputFormat(int i, int i2, int i3) {
            nativeAdaptedOutputFormat(i, i2, i3);
        }

        public ScreenSourceWrapper(Intent intent, VideoCapturerObserver videoCapturerObserver) {
            super(intent, videoCapturerObserver);
        }

        public int onFrame(Buffer buffer, int i, int i2, int i3, long j) {
            if (this.mLastTime == 0) {
                this.mLastTime = j;
            }
            if (this.mBaseTime == 0) {
                this.mBaseTime = TimeUtils.nanoTime() / 1000;
                long guessFrameTimestampDiffUs = LiveStreamVideoCapture.guessFrameTimestampDiffUs(j);
                if (guessFrameTimestampDiffUs > 0) {
                    this.mBaseTime -= guessFrameTimestampDiffUs;
                }
            }
            this.mBaseTime += j - this.mLastTime;
            this.mLastTime = j;
            return super.onFrame(buffer, i, i2, i3, this.mBaseTime);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager$SurfaceTextureSharedHandler */
    class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
        public void handlerExit() {
        }

        public SurfaceTextureSharedHandler(Handler handler) {
            super(handler);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager$WaterMarkProcess */
    class WaterMarkProcess extends VideoProcessor implements OnFrameAvailableListener {
        private Handler mHandler;
        private Surface mSurface;
        private SurfaceTexture mSurfaceTexture = new SurfaceTexture(this.mTex);
        private int mTex = GlUtil.generateTexture(36197);
        private boolean mUpdateFrame;

        public synchronized void release() {
            this.mSurface.release();
            this.mSurfaceTexture.release();
            GLES20.glDeleteTextures(1, new int[]{this.mTex}, 0);
            super.release();
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.mUpdateFrame = true;
        }

        public Canvas lock(Rect rect) {
            return this.mSurface.lockCanvas(rect);
        }

        public VideoFrame process(VideoFrame videoFrame) {
            if (this.mUpdateFrame) {
                this.mUpdateFrame = false;
            }
            return videoFrame;
        }

        public void unlockAndPost(Canvas canvas) {
            this.mSurface.unlockCanvasAndPost(canvas);
        }

        public WaterMarkProcess(Handler handler) {
            this.mHandler = handler;
            if (VERSION.SDK_INT >= 15) {
                this.mSurfaceTexture.setDefaultBufferSize(RecorderManager.this.mConfig.videoWidth, RecorderManager.this.mConfig.videoHeight);
            }
            if (VERSION.SDK_INT >= 21) {
                this.mSurfaceTexture.setOnFrameAvailableListener(this, this.mHandler);
            } else {
                this.mSurfaceTexture.setOnFrameAvailableListener(this);
            }
            this.mSurface = new Surface(this.mSurfaceTexture);
        }
    }

    public IRecorderManager getExternRecordMgr() {
        return this.mExternRecordMgr;
    }

    public void onVideoCapturerStarted() {
    }

    public void onVideoCapturerStoped() {
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, float[] fArr, long j) {
        return -1;
    }

    public Config getConfig() {
        return this.mConfig.dump();
    }

    public VideoSink getSharedSink() {
        if (this.mSharedCaptureSink != null) {
            return this.mSharedCaptureSink.getVideoSink();
        }
        return null;
    }

    public void onClearCache() {
        while (!this.mMediaPacketsCache.isEmpty()) {
            onWriteFile((MediaPacket) this.mMediaPacketsCache.remove(0));
        }
    }

    public void stop() {
        if (this.mState.get() != 4) {
            this.mRecordThreadHandler.post(new Runnable() {
                public void run() {
                    if (RecorderManager.this.mExternRecordMgr == null || RecorderManager.this.mMode != 2) {
                        RecorderManager.this.onStop();
                    } else {
                        RecorderManager.this.mExternRecordMgr.stop();
                    }
                }
            });
        }
    }

    private void onCreateEncodeStream() {
        if (this.mMediaEncodeStream == null) {
            this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
            if (this.mRecorder instanceof Transport) {
                this.mEncodeStreamCallback = (Transport) this.mRecorder;
            } else {
                this.mEncodeStreamCallback = new EncodeStreamCallback();
            }
            this.mMediaEncodeStream = this.mMediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mEncodeStreamCallback);
            this.mMediaEncodeStream.registerObserver(this);
            this.mMediaEncodeStream.stop();
        }
    }

    private void onStartCamera() {
        boolean z;
        if (this.mConfig.havaVideo) {
            if (this.mSharedVideoCapture == null) {
                this.mSharedVideoCapture = this.mSharedCaptureSink;
                z = true;
            } else {
                z = false;
            }
            onCreateVideoTrack();
            if (z) {
                this.mSharedCaptureSink.start(this.mConfig.videoWidth, this.mConfig.videoHeight, this.mConfig.videoFps);
            }
        }
        onStartAudio();
    }

    private void onCreateAudioTrack() {
        onCreateEncodeStream();
        this.mAudioTrack = this.mMediaEngineFactory.createAudioTrack(this.mSharedAudioCapture);
        if (this.mEncodeOpt == null) {
            this.mEncodeOpt = this.mMediaEncodeStream.getParameter();
        }
        this.mEncodeOpt.setString("audio_type", "audio/faac");
        this.mEncodeOpt.setInt("audio_sample", this.mConfig.audioSample);
        this.mEncodeOpt.setInt("audio_channels", this.mConfig.audioChannel);
        this.mEncodeOpt.setLong("audio_bit_rate", this.mConfig.audioBitrate);
        this.mMediaEncodeStream.setParameter(this.mEncodeOpt);
        this.mMediaEncodeStream.addTrack(this.mAudioTrack);
    }

    private void onStartAudio() {
        if (this.mConfig.haveAudio) {
            if (this.mSharedAudioCapture == null) {
                this.mState.set(3);
                this.mListener.onRecorderError(-4, new Exception("Not found shared audio capture."));
                return;
            }
            onCreateAudioTrack();
        }
        if (this.mSharedAudioCapture != null) {
            this.mSharedAudioCapture.resume();
        }
        StringBuilder sb = new StringBuilder("encoderStream cfg:");
        sb.append(this.mEncodeOpt.toString());
        AVLog.iod("RecorderManager", sb.toString());
    }

    private void onStartRecorder() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.mConfig.havaVideo || this.mConfig.haveAudio) {
            z = true;
        } else {
            z = false;
        }
        if (!z || ((!this.mConfig.havaVideo || this.mVideoRecordIdx < 0) && this.mConfig.havaVideo)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && ((this.mConfig.haveAudio && this.mAudioRecordIdx >= 0) || !this.mConfig.haveAudio)) {
            z3 = true;
        }
        if (z3) {
            int start = this.mRecorder.start();
            if (start < 0) {
                this.mState.set(3);
                IRecorderListener iRecorderListener = this.mListener;
                StringBuilder sb = new StringBuilder("Start recorder error (");
                sb.append(start);
                sb.append(")");
                iRecorderListener.onRecorderError(-7, new Exception(sb.toString()));
            }
        }
    }

    private void onStartScreen() {
        if (this.mConfig.havaVideo) {
            ScreenSourceWrapper screenSourceWrapper = new ScreenSourceWrapper(this.mScreenIntent, this);
            if (this.mGLHandler == null) {
                this.mGLThread = new GLThread("RecorderProcessThread");
                this.mGLThread.start();
                this.mGLHandler = this.mGLThread.getHandler();
            }
            ThreadUtils.invokeAtFrontUninterruptibly(this.mGLHandler, (Runnable) new Runnable() {
                public void run() {
                    RecorderManager.this.mSurfaceTextureSharedHandler = new SurfaceTextureSharedHandler(RecorderManager.this.mGLHandler);
                }
            });
            screenSourceWrapper.initialize(this.mSurfaceTextureSharedHandler, this.mScreenContext);
            screenSourceWrapper.setOutputFormat(this.mConfig.videoWidth, this.mConfig.videoHeight, this.mConfig.videoFps);
            this.mVideoCapturer = screenSourceWrapper;
            onCreateVideoTrack();
        }
        onStartAudio();
        if (this.mVideoCapturer != null && this.mState.get() != 3) {
            this.mVideoCapturer.start(this.mConfig.videoWidth, this.mConfig.videoHeight, this.mConfig.videoFps);
        }
    }

    public void onStop() {
        int i;
        String str;
        onDestroyTrack();
        int i2 = this.mState.get();
        this.mState.set(2);
        if (this.mRecorder != null) {
            i = this.mRecorder.stop();
            this.mRecorder.release();
            this.mRecorder = null;
        } else {
            i = -1;
        }
        this.mVideoRecordIdx = -1;
        this.mAudioRecordIdx = -1;
        this.mWriteAudioFrameCounts = 0;
        this.mWriteVideoFrameCounts = 0;
        this.mReceiveAudioFrameCounts = 0;
        this.mReceiveVideoFrameCounts = 0;
        this.mMediaPacketsCache.clear();
        if (this.mListener != null) {
            IRecorderListener iRecorderListener = this.mListener;
            if (i < 0 || i2 == 3) {
                str = "";
            } else {
                str = this.mFile;
            }
            iRecorderListener.onRecorderStoped(str);
        }
    }

    public synchronized void release() {
        stop();
        if (this.mRecordThreadHandler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mRecordThreadHandler, (Runnable) new Runnable() {
                public void run() {
                    AVLog.m143698i("RecorderManager", "recordManager thread exit done.");
                }
            });
            this.mRecordThread.quit();
            if (this.mGLThread != null) {
                this.mGLThread.quit();
            }
            this.mRecordThreadHandler = null;
            this.mRecordThread = null;
            this.mGLHandler = null;
            this.mGLThread = null;
            this.mGLHandler = null;
            this.mMediaEngineFactory = null;
        }
        if (this.mSharedCaptureSink != null) {
            this.mSharedCaptureSink.release();
            this.mSharedCaptureSink = null;
        }
        this.mScreenContext = null;
        this.mState.set(4);
    }

    private void onCreateVideoTrack() {
        VideoCapturer videoCapturer;
        onCreateEncodeStream();
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        if (this.mVideoCapturer != null) {
            videoCapturer = this.mVideoCapturer;
        } else {
            videoCapturer = this.mSharedVideoCapture;
        }
        this.mVideoTrack = mediaEngineFactory.createVideoTrack(videoCapturer);
        if (this.mWaterMarkProcess != null) {
            this.mVideoTrack.setVideoProcessor(this.mWaterMarkProcess);
        }
        if (this.mEncodeOpt == null) {
            this.mEncodeOpt = this.mMediaEncodeStream.getParameter();
        }
        this.mEncodeOpt.setString("video_type", "video/avc");
        this.mEncodeOpt.setInt("video_width", this.mConfig.videoWidth);
        this.mEncodeOpt.setInt("video_height", this.mConfig.videoHeight);
        this.mEncodeOpt.setLong("video_bitrate", this.mConfig.videoBitrate);
        this.mEncodeOpt.setInt("video_fps", this.mConfig.videoFps);
        this.mEncodeOpt.setBool("video_enable_accelera", this.mEnableAccelera);
        this.mEncodeOpt.setBool("video_enable_bframe", false);
        this.mEncodeOpt.setInt("configuration_type", 1);
        if (this.mConfig.videoProfileHigh) {
            this.mEncodeOpt.setInt("video_profileLevel", 3);
        } else {
            this.mEncodeOpt.setInt("video_profileLevel", 1);
        }
        if (this.mEnableAccelera) {
            this.mEncodeOpt.setInt("video_profileLevel", 1);
        }
        this.mMediaEncodeStream.setParameter(this.mEncodeOpt);
        this.mMediaEncodeStream.addTrack(this.mVideoTrack);
    }

    private void onDestroyTrack() {
        if (this.mMediaEncodeStream != null) {
            this.mMediaEncodeStream.stop();
        }
        if (this.mSharedCaptureSink != null) {
            this.mSharedCaptureSink.stop();
        }
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.stop();
        }
        if (!(this.mMediaEncodeStream == null || this.mVideoTrack == null)) {
            this.mMediaEncodeStream.removeTrack(this.mVideoTrack);
        }
        if (!(this.mMediaEncodeStream == null || this.mAudioTrack == null)) {
            this.mMediaEncodeStream.removeTrack(this.mAudioTrack);
        }
        if (this.mMediaEncodeStream != null) {
            this.mMediaEncodeStream.release();
            this.mMediaEncodeStream = null;
        }
        if (this.mVideoTrack != null) {
            this.mVideoTrack.release();
            this.mVideoTrack = null;
        }
        if (this.mAudioTrack != null) {
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
        if (this.mSurfaceTextureSharedHandler != null) {
            this.mSurfaceTextureSharedHandler.dispose();
            this.mSurfaceTextureSharedHandler = null;
        }
        if (this.mVideoEncoderFactory != null) {
            this.mVideoEncoderFactory.release();
            this.mVideoEncoderFactory = null;
        }
        if (this.mEncodeStreamCallback != null) {
            if (!(this.mEncodeStreamCallback instanceof MediaRecorder)) {
                this.mEncodeStreamCallback.release();
            }
            this.mEncodeStreamCallback = null;
        }
    }

    public void setupAudioSource(AudioCapturer audioCapturer) {
        this.mSharedAudioCapture = audioCapturer;
    }

    public void setupVideoSource(VideoCapturer videoCapturer) {
        this.mSharedVideoCapture = videoCapturer;
    }

    public void onWriteCache(MediaPacket mediaPacket) {
        this.mMediaPacketsCache.add(mediaPacket);
    }

    public Canvas lock(Rect rect) {
        if (this.mWaterMarkProcess != null) {
            return this.mWaterMarkProcess.lock(rect);
        }
        return null;
    }

    public void unlockAndPost(Canvas canvas) {
        if (this.mWaterMarkProcess != null) {
            this.mWaterMarkProcess.unlockAndPost(canvas);
        }
    }

    private MediaPacket copyPacket(MediaPacket mediaPacket) {
        MediaPacket mediaPacket2 = new MediaPacket();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaPacket.size);
        mediaPacket.buffer.position(mediaPacket.offset);
        mediaPacket.buffer.limit(mediaPacket.size);
        allocateDirect.put(mediaPacket.buffer);
        mediaPacket2.set(allocateDirect, mediaPacket.isVideo, 0, mediaPacket.size, mediaPacket.presentationTimeUs, mediaPacket.flags);
        return mediaPacket2;
    }

    private int findNextNal(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int position = byteBuffer.position();
        int position2 = byteBuffer.position();
        if (byteBuffer.get(position2) == 0 && byteBuffer.get(position2 + 1) == 0 && byteBuffer.get(position2 + 2) == 0 && byteBuffer.get(position2 + 3) == 1) {
            i = position2 + 4;
            i2 = 4;
        } else if (byteBuffer.get(position2) == 0 && byteBuffer.get(position2 + 1) == 0 && byteBuffer.get(position2 + 2) == 1) {
            i = position2 + 3;
            i2 = 3;
        } else {
            i = position2;
            i2 = 0;
        }
        byte b = -1;
        while (i2 + position < byteBuffer.capacity() - 3) {
            int i3 = b << 8;
            byte b2 = byteBuffer.get(i);
            i++;
            b = i3 | b2;
            i2++;
            if (b == 1) {
                return i2 - 4;
            }
            if ((16777215 & b) == 1) {
                return i2 - 3;
            }
        }
        return 0;
    }

    private boolean onUpdateConfig(Config config) {
        if (config.havaVideo && (config.videoFps <= 0 || config.videoWidth <= 0 || config.videoHeight <= 0 || config.videoBitrate < 1)) {
            this.mListener.onRecorderError(-2, new IllegalArgumentException("video parameter invalid."));
            return false;
        } else if (!config.haveAudio || (config.audioBitrate >= 1 && config.audioSample > 0 && config.audioChannel >= 0)) {
            this.mConfig = config;
            this.mConfig.videoHeight = align(this.mConfig.videoHeight, 16);
            this.mConfig.videoWidth = align(this.mConfig.videoWidth, 16);
            return true;
        } else {
            this.mListener.onRecorderError(-3, new IllegalArgumentException("Audio parameter invalid"));
            return false;
        }
    }

    private void setupParameter(LiveStreamBuilder liveStreamBuilder) {
        boolean z;
        this.mConfig = new Config();
        this.mConfig.videoBitrate = (long) liveStreamBuilder.getVideoBitrate();
        this.mConfig.videoFps = liveStreamBuilder.getVideoFps();
        this.mConfig.videoHeight = liveStreamBuilder.getVideoHeight();
        this.mConfig.videoWidth = liveStreamBuilder.getVideoWidth();
        Config config = this.mConfig;
        if (liveStreamBuilder.getVideoProfile() == 3) {
            z = true;
        } else {
            z = false;
        }
        config.videoProfileHigh = z;
        this.mConfig.audioBitrate = (long) liveStreamBuilder.getAudioBitrate();
        this.mConfig.audioChannel = liveStreamBuilder.getAudioChannel();
        this.mConfig.audioSample = liveStreamBuilder.getAudioSampleHZ();
        this.mScreenIntent = liveStreamBuilder.getScreenCaptureIntent();
        this.mScreenContext = liveStreamBuilder.getContext();
        this.mEnableAccelera = liveStreamBuilder.isEnableVideoEncodeAccelera();
    }

    public void onWriteFile(MediaPacket mediaPacket) {
        int i;
        String str;
        String str2;
        String str3;
        BufferInfo bufferInfo = new BufferInfo();
        int i2 = 1;
        if ((mediaPacket.flags & 1) != 0) {
            i = 2;
        } else {
            i = 0;
        }
        bufferInfo.flags = i;
        int i3 = bufferInfo.flags;
        if ((2 & mediaPacket.flags) == 0) {
            i2 = 0;
        }
        bufferInfo.flags = i3 | i2;
        bufferInfo.presentationTimeUs = mediaPacket.presentationTimeUs;
        bufferInfo.offset = mediaPacket.offset;
        bufferInfo.size = mediaPacket.size;
        if (mediaPacket.isVideo && this.mVideoRecordIdx >= 0 && this.mRecorder != null) {
            this.mWriteVideoFrameCounts++;
            this.mRecorder.writeSampleData(this.mVideoRecordIdx, mediaPacket.buffer, bufferInfo);
        } else if (mediaPacket.isVideo || this.mAudioRecordIdx < 0 || this.mRecorder == null) {
            String str4 = "RecorderManager";
            StringBuilder sb = new StringBuilder("Maybe we are receiver a ");
            if (mediaPacket.isVideo) {
                str = "video";
            } else {
                str = "audio";
            }
            sb.append(str);
            sb.append("frame and size ");
            sb.append(mediaPacket.size);
            sb.append(", but the recorder no config it or have a internal error (statue:");
            sb.append(this.mState);
            sb.append(",v/a:");
            if (this.mConfig.havaVideo) {
                str2 = "y";
            } else {
                str2 = C20318n.f54884f;
            }
            sb.append(str2);
            sb.append("/");
            if (this.mConfig.haveAudio) {
                str3 = "y";
            } else {
                str3 = C20318n.f54884f;
            }
            sb.append(str3);
            sb.append(",idx v/a:");
            sb.append(this.mVideoRecordIdx);
            sb.append("/");
            sb.append(this.mAudioRecordIdx);
            AVLog.m143700w(str4, sb.toString());
        } else {
            this.mWriteAudioFrameCounts++;
            this.mRecorder.writeSampleData(this.mAudioRecordIdx, mediaPacket.buffer, bufferInfo);
        }
        mediaPacket.buffer = null;
    }

    public void receiverPacket(MediaPacket mediaPacket) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        final boolean z5 = true;
        if (this.mState.get() == 1) {
            if ((mediaPacket.flags & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!mediaPacket.isVideo || (mediaPacket.flags & 2) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.mRecorder == null) {
                this.mState.set(3);
                this.mListener.onRecorderError(-1, new Exception("Recorder is null"));
                return;
            }
            if (!z || !mediaPacket.isVideo) {
                if (z && !mediaPacket.isVideo && this.mConfig.haveAudio && this.mAudioRecordIdx < 0) {
                    createRecordAudioTrack(mediaPacket, true);
                    return;
                }
            } else if (this.mConfig.havaVideo && this.mVideoRecordIdx < 0) {
                createRecordVideoTrack(mediaPacket, true);
                return;
            }
            if (z2 && this.mVideoRecordIdx < 0) {
                createRecordVideoTrack(mediaPacket, false);
            }
            if (this.mConfig.havaVideo || this.mConfig.haveAudio) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || ((!this.mConfig.havaVideo || this.mVideoRecordIdx < 0) && this.mConfig.havaVideo)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4 || ((!this.mConfig.haveAudio || this.mAudioRecordIdx < 0) && this.mConfig.haveAudio)) {
                z5 = false;
            }
            final MediaPacket copyPacket = copyPacket(mediaPacket);
            this.mRecordThreadHandler.post(new Runnable() {
                public void run() {
                    if (z5) {
                        RecorderManager.this.onClearCache();
                        RecorderManager.this.onWriteFile(copyPacket);
                        return;
                    }
                    RecorderManager.this.onWriteCache(copyPacket);
                }
            });
        }
    }

    public RecorderManager(LiveStreamBuilder liveStreamBuilder, MediaEngineFactory mediaEngineFactory) {
        this(liveStreamBuilder, mediaEngineFactory, null);
    }

    private int align(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        return (((i + i2) - 1) / i2) * i2;
    }

    public void onVideoCapturerError(final int i, final Exception exc) {
        this.mRecordThreadHandler.post(new Runnable() {
            public void run() {
                RecorderManager.this.mState.set(3);
                RecorderManager.this.mListener.onRecorderError(i, exc);
            }
        });
    }

    private void createRecordAudioTrack(MediaPacket mediaPacket, boolean z) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.mConfig.audioSample, this.mConfig.audioChannel);
        mediaPacket.buffer.position(mediaPacket.offset);
        mediaPacket.buffer.limit(mediaPacket.size);
        createAudioFormat.setByteBuffer("csd-0", mediaPacket.buffer);
        this.mAudioRecordIdx = this.mRecorder.addTrack(createAudioFormat);
        onStartRecorder();
    }

    private void createRecordVideoTrack(MediaPacket mediaPacket, boolean z) {
        int i;
        int i2;
        mediaPacket.buffer.position(mediaPacket.offset);
        mediaPacket.buffer.limit(mediaPacket.size);
        ByteBuffer slice = mediaPacket.buffer.slice();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.mConfig.videoWidth, this.mConfig.videoHeight);
        slice.position(0);
        slice.position(0);
        int findNextNal = findNextNal(slice);
        if (findNextNal <= 0 || findNextNal >= slice.capacity()) {
            i2 = -1;
            i = 0;
        } else {
            slice.position(findNextNal);
            int findNextNal2 = findNextNal(slice);
            if (findNextNal2 <= 0 && slice.capacity() < 50) {
                findNextNal2 = slice.limit();
            } else if (findNextNal2 <= 0) {
                AVLog.m143700w("RecorderManager", "Not found spspps");
                return;
            } else if (findNextNal2 > 0) {
                findNextNal2 += findNextNal;
            }
            i = findNextNal2;
            i2 = findNextNal;
        }
        if (i2 <= 0 || i <= 0) {
            AVLog.m143700w("RecorderManager", "Not found spspps on recorder.");
            return;
        }
        slice.position(0);
        slice.limit(findNextNal);
        ByteBuffer slice2 = slice.slice();
        slice.limit(i);
        slice.position(findNextNal);
        ByteBuffer slice3 = slice.slice();
        createVideoFormat.setByteBuffer("csd-0", slice2);
        createVideoFormat.setByteBuffer("csd-1", slice3);
        createVideoFormat.setInteger("color-format", 19);
        this.mVideoRecordIdx = this.mRecorder.addTrack(createVideoFormat);
        onStartRecorder();
    }

    public RecorderManager(LiveStreamBuilder liveStreamBuilder, MediaEngineFactory mediaEngineFactory, IRecorderManager iRecorderManager) {
        this.STAT_START = 1;
        this.STAT_STOP = 2;
        this.STAT_ERROR = 3;
        this.STAT_RELEASE = 4;
        this.mAudioRecordIdx = -1;
        this.mVideoRecordIdx = -1;
        this.mMediaEngineFactory = mediaEngineFactory;
        this.mRecordThread = new HandlerThread("RecorderThread");
        this.mRecordThread.start();
        this.mRecordThreadHandler = new Handler(this.mRecordThread.getLooper());
        this.mState = new AtomicInteger(2);
        this.mMediaPacketsCache = new ArrayList<>();
        this.mSharedCaptureSink = new RecordVideoSink();
        setupParameter(liveStreamBuilder);
        this.mExternRecordMgr = iRecorderManager;
    }

    public void onMediaEncodeStreamEvent(final int i, int i2, long j, String str) {
        if (this.mRecordThreadHandler != null) {
            this.mRecordThreadHandler.post(new Runnable() {
                public void run() {
                    String str;
                    if (2 == i) {
                        boolean bool = RecorderManager.this.mEncodeOpt.getBool("video_enable_accelera");
                        String string = RecorderManager.this.mEncodeOpt.getString("video_type");
                        if (bool || !string.equalsIgnoreCase("video/x264")) {
                            RecorderManager.this.mEncodeOpt.setString("video_type", "video/x264");
                            RecorderManager.this.mEncodeOpt.setBool("video_enable_accelera", false);
                            if (RecorderManager.this.mMediaEncodeStream != null) {
                                RecorderManager.this.mMediaEncodeStream.setParameter(RecorderManager.this.mEncodeOpt);
                            }
                            AVLog.m143696d("RecorderManager", "Update recorder encoder to soft.");
                            return;
                        }
                        RecorderManager.this.mState.set(3);
                        IRecorderListener iRecorderListener = RecorderManager.this.mListener;
                        StringBuilder sb = new StringBuilder("Not found video encoder (");
                        sb.append(string);
                        sb.append("/");
                        if (bool) {
                            str = "h";
                        } else {
                            str = "w";
                        }
                        sb.append(str);
                        sb.append(")");
                        iRecorderListener.onRecorderError(-1, new Exception(sb.toString()));
                    }
                }
            });
        }
    }

    public void onTransportEvent(int i, int i2, long j, String str) {
        if (this.mRecordThreadHandler != null) {
            Handler handler = this.mRecordThreadHandler;
            final int i3 = i;
            final int i4 = i2;
            final long j2 = j;
            C457463 r0 = new Runnable() {
                public void run() {
                    switch (i3) {
                        case 1:
                            AVLog.m143696d("RecorderManager", "Recording on native.");
                            return;
                        case 2:
                            AVLog.m143696d("RecorderManager", "Recorded on native.");
                            break;
                        case 3:
                            RecorderManager.this.mState.set(3);
                            IRecorderListener iRecorderListener = RecorderManager.this.mListener;
                            int i = i3;
                            StringBuilder sb = new StringBuilder("Recorder have an internal error (");
                            sb.append(i4);
                            sb.append(", ");
                            sb.append(j2);
                            sb.append(")");
                            iRecorderListener.onRecorderError(i, new Exception(sb.toString()));
                            if (RecorderManager.this.mMediaEncodeStream != null) {
                                RecorderManager.this.mMediaEncodeStream.stop();
                                return;
                            }
                            break;
                    }
                }
            };
            handler.post(r0);
        }
    }

    public void start(String str, IRecorderListener iRecorderListener, Config config, int i) {
        if (this.mState.get() != 4) {
            Handler handler = this.mRecordThreadHandler;
            final int i2 = i;
            final String str2 = str;
            final IRecorderListener iRecorderListener2 = iRecorderListener;
            final Config config2 = config;
            C457485 r1 = new Runnable() {
                public void run() {
                    if (RecorderManager.this.mExternRecordMgr == null || i2 != 2) {
                        RecorderManager.this.onStart(str2, iRecorderListener2, config2, i2);
                        return;
                    }
                    RecorderManager.this.mMode = i2;
                    RecorderManager.this.mExternRecordMgr.start(str2, iRecorderListener2, config2, i2);
                }
            };
            handler.post(r1);
        }
    }

    public void onStart(String str, IRecorderListener iRecorderListener, Config config, int i) {
        if (this.mState.get() == 1) {
            iRecorderListener.onRecorderError(-1, new IllegalStateException("Already start"));
        }
        if (this.mState.get() == 3) {
            iRecorderListener.onRecorderError(-1, new IllegalStateException("Error status call and no stop."));
            return;
        }
        this.mListener = iRecorderListener;
        if (onUpdateConfig(config)) {
            this.mFile = str;
            this.mMode = i;
            if (!this.mConfig.useMediaMuxer) {
                NativeMp4Recorder nativeMp4Recorder = new NativeMp4Recorder(this.mConfig.havaVideo, this.mConfig.haveAudio);
                nativeMp4Recorder.setEventObserver(this);
                TEBundle parameter = nativeMp4Recorder.getParameter();
                parameter.dump();
                parameter.setInt("mp4_video_height", this.mConfig.videoHeight);
                parameter.setInt("mp4_video_width", this.mConfig.videoWidth);
                parameter.setInt("mp4_fps", this.mConfig.videoFps);
                parameter.setBool("mp4_enable_BFrame", false);
                parameter.setString("mp4_file_name", this.mFile);
                parameter.dump();
                nativeMp4Recorder.setParameter(parameter);
                this.mRecorder = nativeMp4Recorder;
                nativeMp4Recorder.start();
            } else if (VERSION.SDK_INT >= 18) {
                this.mRecorder = new SystemMediaRecorder(this.mFile, 0);
            } else {
                this.mState.set(3);
                iRecorderListener.onRecorderError(-6, new UnsupportedOperationException("Not found a valid recorder."));
                return;
            }
            if (this.mRecorder == null) {
                this.mState.set(3);
                iRecorderListener.onRecorderError(-6, new UnsupportedOperationException("Not found MediaRecorder"));
                return;
            }
            if (this.mMode == 1) {
                onStartScreen();
            } else {
                onStartCamera();
            }
            if (this.mState.get() != 3) {
                this.mState.set(1);
                this.mMediaEncodeStream.start();
                this.mListener.onRecorderStarted();
            }
        }
    }
}

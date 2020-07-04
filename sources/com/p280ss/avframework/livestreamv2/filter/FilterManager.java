package com.p280ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.OrientationEventListener;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p280ss.avframework.buffer.GlTextureFrameBuffer;
import com.p280ss.avframework.buffer.TextureBufferImpl;
import com.p280ss.avframework.buffer.TextureBufferImpl.ToI420Interface;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p280ss.avframework.capture.audio.AudioCapturer;
import com.p280ss.avframework.effect.EffectWrapper;
import com.p280ss.avframework.effect.IVideoEffectProcessor;
import com.p280ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener;
import com.p280ss.avframework.engine.AudioTrack;
import com.p280ss.avframework.engine.MediaEngineFactory;
import com.p280ss.avframework.engine.VideoProcessor;
import com.p280ss.avframework.livestreamv2.IInputAudioStream;
import com.p280ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.ErrorListener;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.FaceDetectListener;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.MicrophoneDetectListener;
import com.p280ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.opengl.GlRenderDrawer;
import com.p280ss.avframework.opengl.GlUtil;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.opengl.YuvConverter;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.ThreadUtils;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager */
public class FilterManager extends VideoProcessor implements ToI420Interface, IFilterManager {
    private EffectInputAudioStream mAudioStream;
    private InputAudioStreamObserver mAudioStreamObserver;
    public CatchVideoCallback mCatchVideoCallback;
    public int mCatchVideoFrameCount;
    public int mCatchVideoFrameInterval;
    public IVideoEffectProcessor mEffect;
    public VideoCatcher mEffectFrameCatcher;
    private boolean mEnabled;
    public ErrorListener mErrorListener;
    private boolean mForceOutput2DTex;
    public boolean mForceSticker;
    public GLThread mGLThread;
    public Handler mHandler;
    private long mLastCatchTimestamp;
    public EffectMsgListener mMsgListener;
    public GlRenderDrawer mOffscreenDraw;
    public int mOrientation;
    private AlbumOrientationEventListener mOrientationListener;
    public VideoCatcher mOriginFrameCatcher;
    public GlTextureFrameBuffer mOut2DTex;
    private boolean mReleased;
    private boolean mRoiEnabled;
    private boolean mShouldCatch;
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public YuvConverter mYuvConverter;

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$AlbumOrientationEventListener */
    class AlbumOrientationEventListener extends OrientationEventListener {
        public void onOrientationChanged(int i) {
            if (i != -1) {
                int i2 = (((i + 45) / 90) * 90) % 360;
                if (i2 != FilterManager.this.mOrientation) {
                    FilterManager.this.mOrientation = i2;
                }
            }
        }

        public AlbumOrientationEventListener(Context context) {
            super(context);
            if (canDetectOrientation()) {
                enable();
            } else {
                AVLog.m143697e("FilterManager", "Can't Detect Orientation");
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$EffectInputAudioStream */
    public class EffectInputAudioStream implements IInputAudioStream {
        private AudioCapturer mAudioCapturer;
        private AudioMixerDescription mAudioMixerDescription;
        private AudioTrack mAudioTrack;
        private int mChannel;
        private InputAudioStreamObserver mObserver;
        private int mSample;

        public AudioTrack getAudioTrack() {
            return this.mAudioTrack;
        }

        public int getChannel() {
            return this.mChannel;
        }

        public AudioMixerDescription getMixerDescription() {
            return this.mAudioMixerDescription;
        }

        public int getSample() {
            return this.mSample;
        }

        public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
            return 0;
        }

        public String name() {
            if (this.mAudioTrack != null) {
                return this.mAudioTrack.mo109133id();
            }
            return "";
        }

        public int start() {
            if (this.mAudioCapturer != null) {
                this.mAudioCapturer.start();
                this.mAudioCapturer.resume();
            }
            return 0;
        }

        public int stop() {
            if (this.mAudioCapturer != null) {
                this.mAudioCapturer.stop();
            }
            return 0;
        }

        public void release() {
            stop();
            if (this.mObserver != null) {
                this.mObserver.onInputAudioStreamRelease(this);
            }
            this.mAudioCapturer = null;
            if (this.mAudioTrack != null) {
                this.mAudioTrack.release();
                this.mAudioTrack = null;
            }
        }

        public void setMixerDescription(AudioMixerDescription audioMixerDescription) {
            this.mAudioMixerDescription = audioMixerDescription;
        }

        public void mute(boolean z) {
            if (this.mAudioCapturer != null) {
                this.mAudioCapturer.mute(z);
            }
        }

        public EffectInputAudioStream(AudioCapturer audioCapturer, InputAudioStreamObserver inputAudioStreamObserver) {
            if (audioCapturer != null) {
                this.mAudioCapturer = audioCapturer;
                this.mObserver = inputAudioStreamObserver;
                this.mAudioMixerDescription = new AudioMixerDescription();
                if (this.mObserver != null) {
                    this.mObserver.onInputAudioStreamCreated(this);
                }
            }
        }

        public void setupAudioTrack(MediaEngineFactory mediaEngineFactory, int i, int i2) {
            if (this.mAudioCapturer != null) {
                this.mAudioTrack = mediaEngineFactory.createAudioTrack(this.mAudioCapturer);
                this.mSample = i;
                this.mChannel = i2;
                this.mAudioCapturer.setOutputFormat(i, i2, 16);
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$InputAudioStreamObserver */
    public interface InputAudioStreamObserver {
        void onInputAudioStreamCreated(EffectInputAudioStream effectInputAudioStream);

        void onInputAudioStreamRelease(EffectInputAudioStream effectInputAudioStream);
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public boolean isEnable() {
        return this.mEnabled;
    }

    static {
        try {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("effect");
        } catch (Throwable unused) {
        }
    }

    public static IFilterManager createDummy() {
        return new IFilterManager() {
            public final int composerAppendNodes(String[] strArr) {
                return 0;
            }

            public final int composerReloadNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerRemoveNodes(String[] strArr) {
                return 0;
            }

            public final int composerSetMode(int i, int i2) {
                return 0;
            }

            public final int composerSetNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerUpdateNode(String str, String str2, float f) {
                return 0;
            }

            public final void configEffect(int i, int i2, String str, String str2, boolean z) {
            }

            public final void configEffect(int i, int i2, String str, String str2, boolean z, AssetManager assetManager) {
            }

            public final void configEffect(int i, int i2, String str, String str2, boolean z, Object obj) {
            }

            public final void enable(boolean z) {
            }

            public final int enableMockFace(boolean z) {
                return 0;
            }

            public final void enableRoi(boolean z) {
            }

            public final void forceOutput2DTex(boolean z) {
            }

            public final String getEffectVersion() {
                return null;
            }

            public final String getVersion() {
                return "";
            }

            public final boolean isEnable() {
                return true;
            }

            public final boolean isValid() {
                return false;
            }

            public final String name() {
                return "DummyFilter";
            }

            public final int pauseEffect() {
                return 0;
            }

            public final void processDoubleClickEvent(float f, float f2) {
            }

            public final void processLongPressEvent(float f, float f2) {
            }

            public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
            }

            public final void processRotationEvent(float f, float f2) {
            }

            public final void processScaleEvent(float f, float f2) {
            }

            public final void processTouchDownEvent(float f, float f2, int i) {
            }

            public final void processTouchEvent(float f, float f2) {
            }

            public final void processTouchUpEvent(float f, float f2, int i) {
            }

            public final void release() {
            }

            public final int resumeEffect() {
                return 0;
            }

            public final int sendEffectMsg(int i, int i2, int i3, String str) {
                return 0;
            }

            public final int setBeautify(String str, float f, float f2) {
                return 0;
            }

            public final int setBeautify(String str, float f, float f2, float f3) {
                return 0;
            }

            public final int setCustomEffect(String str, String str2) {
                return 0;
            }

            public final int setEffect(String str) {
                return 0;
            }

            public final int setEffect(String str, boolean z) {
                return 0;
            }

            public final void setEffectAlgorithmAB(boolean z) {
            }

            public final void setEffectMsgListener(IFilterManager.EffectMsgListener effectMsgListener) {
            }

            public final void setErrorListener(ErrorListener errorListener) {
            }

            public final int setFaceAttribute(boolean z) {
                return 0;
            }

            public final void setFaceDetectListener(FaceDetectListener faceDetectListener) {
            }

            public final int setFilter(String str, float f) {
                return 0;
            }

            public final int setFilter(String str, String str2, float f) {
                return 0;
            }

            public final void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener) {
            }

            public final int setReshape(String str, float f, float f2) {
                return 0;
            }

            public final int startEffectAudio() {
                return 0;
            }

            public final int stopEffectAudio() {
                return 0;
            }
        };
    }

    public String getEffectVersion() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null) {
            return "";
        }
        return iVideoEffectProcessor.getEffectVersion();
    }

    public String getVersion() {
        if (isValid()) {
            return this.mEffect.getEffectVersion();
        }
        return "";
    }

    public boolean isValid() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null || !iVideoEffectProcessor.valid()) {
            return false;
        }
        return true;
    }

    public String name() {
        if (isValid()) {
            return this.mEffect.name();
        }
        return "";
    }

    public int pauseEffect() {
        final String callInfo = getCallInfo(new Object[0]);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int pauseEffect = FilterManager.this.mEffect.pauseEffect();
                    if (pauseEffect != 0) {
                        FilterManager.this.mErrorListener.onError(pauseEffect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int resumeEffect() {
        final String callInfo = getCallInfo(new Object[0]);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int resumeEffect = FilterManager.this.mEffect.resumeEffect();
                    if (resumeEffect != 0) {
                        FilterManager.this.mErrorListener.onError(resumeEffect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int startEffectAudio() {
        stopEffectAudio();
        if (isValid()) {
            this.mAudioStream = new EffectInputAudioStream(this.mEffect.getEffectAudioSource(), this.mAudioStreamObserver);
            this.mAudioStream.start();
        }
        return 0;
    }

    public int stopEffectAudio() {
        if (this.mAudioStream != null) {
            this.mAudioStream.stop();
            this.mAudioStream.release();
            this.mAudioStream = null;
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.mGLThread.getHandler().post(new com.p280ss.avframework.livestreamv2.filter.FilterManager.C456835(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.mGLThread.join(3000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r2 = "FilterManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = new java.lang.StringBuilder("FilerManager thread exit exception at ");
        r3.append(3000);
        r3.append(" ms.");
        com.p280ss.avframework.utils.AVLog.m143697e(r2, r3.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.mReleased     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            r0 = 1
            r5.mReleased = r0     // Catch:{ all -> 0x0065 }
            r5.stopEffectAudio()     // Catch:{ all -> 0x0065 }
            android.os.Handler r0 = r5.mHandler     // Catch:{ all -> 0x0065 }
            com.ss.avframework.livestreamv2.filter.FilterManager$4 r1 = new com.ss.avframework.livestreamv2.filter.FilterManager$4     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            r0.post(r1)     // Catch:{ all -> 0x0065 }
            com.ss.avframework.opengl.GLThread r0 = r5.mGLThread     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0056
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0027 }
            r1 = 18
            if (r0 < r1) goto L_0x0060
            com.ss.avframework.opengl.GLThread r0 = r5.mGLThread     // Catch:{ Throwable -> 0x0027 }
            r0.quitSafely()     // Catch:{ Throwable -> 0x0027 }
            goto L_0x0060
        L_0x0027:
            com.ss.avframework.opengl.GLThread r0 = r5.mGLThread     // Catch:{ all -> 0x0065 }
            android.os.Handler r0 = r0.getHandler()     // Catch:{ all -> 0x0065 }
            com.ss.avframework.livestreamv2.filter.FilterManager$5 r1 = new com.ss.avframework.livestreamv2.filter.FilterManager$5     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            r0.post(r1)     // Catch:{ all -> 0x0065 }
            r0 = 3000(0xbb8, double:1.482E-320)
            com.ss.avframework.opengl.GLThread r2 = r5.mGLThread     // Catch:{ InterruptedException -> 0x003d }
            r2.join(r0)     // Catch:{ InterruptedException -> 0x003d }
            goto L_0x0060
        L_0x003d:
            java.lang.String r2 = "FilterManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = "FilerManager thread exit exception at "
            r3.<init>(r4)     // Catch:{ all -> 0x0065 }
            r3.append(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = " ms."
            r3.append(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0065 }
            com.p280ss.avframework.utils.AVLog.m143697e(r2, r0)     // Catch:{ all -> 0x0065 }
            goto L_0x0060
        L_0x0056:
            android.os.Handler r0 = r5.mHandler     // Catch:{ all -> 0x0065 }
            com.ss.avframework.livestreamv2.filter.FilterManager$6 r1 = new com.ss.avframework.livestreamv2.filter.FilterManager$6     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            com.p280ss.avframework.utils.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)     // Catch:{ all -> 0x0065 }
        L_0x0060:
            super.release()     // Catch:{ all -> 0x0065 }
            monitor-exit(r5)
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.filter.FilterManager.release():void");
    }

    public int enableMockFace(boolean z) {
        this.mForceSticker = z;
        return 0;
    }

    public void enableRoi(boolean z) {
        this.mRoiEnabled = z;
    }

    public void forceOutput2DTex(boolean z) {
        this.mForceOutput2DTex = z;
    }

    public void setErrorListener(ErrorListener errorListener) {
        this.mErrorListener = errorListener;
    }

    public void setEffectAlgorithmAB(final boolean z) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setAlgorithmAB(z);
                }
            }
        });
    }

    public void setEffectMsgListener(final IFilterManager.EffectMsgListener effectMsgListener) {
        this.mMsgListener = effectMsgListener;
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setEffectMsgListener(effectMsgListener);
                }
            }
        });
    }

    public void setFaceDetectListener(final FaceDetectListener faceDetectListener) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setFaceDetectListener(faceDetectListener);
                }
            }
        });
    }

    public void setMicrophoneDetectListener(final MicrophoneDetectListener microphoneDetectListener) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setMicrophoneDetectListener(microphoneDetectListener);
                }
            }
        });
    }

    public int composerAppendNodes(final String[] strArr) {
        final String callInfo = getCallInfo(strArr, "");
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerAppendNodes = FilterManager.this.mEffect.composerAppendNodes(strArr);
                    if (composerAppendNodes != 0) {
                        FilterManager.this.mErrorListener.onError(composerAppendNodes, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int composerRemoveNodes(final String[] strArr) {
        final String callInfo = getCallInfo(strArr, "");
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerRemoveNodes = FilterManager.this.mEffect.composerRemoveNodes(strArr);
                    if (composerRemoveNodes != 0) {
                        FilterManager.this.mErrorListener.onError(composerRemoveNodes, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setEffect(final String str) {
        final String callInfo = getCallInfo(str);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int effect = FilterManager.this.mEffect.setEffect(str);
                    if (effect != 0) {
                        FilterManager.this.mErrorListener.onError(effect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setFaceAttribute(final boolean z) {
        final String callInfo = getCallInfo(Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int faceAttribute = FilterManager.this.mEffect.setFaceAttribute(z);
                    if (faceAttribute != 0) {
                        FilterManager.this.mErrorListener.onError(faceAttribute, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public I420Buffer toI420(final TextureBuffer textureBuffer) {
        final I420Buffer[] i420BufferArr = new I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null && FilterManager.this.mYuvConverter == null) {
                    FilterManager.this.mYuvConverter = new YuvConverter();
                }
                if (FilterManager.this.mYuvConverter != null) {
                    i420BufferArr[0] = FilterManager.this.mYuvConverter.convert(textureBuffer);
                }
            }
        });
        if (i420BufferArr[0] != null) {
            return i420BufferArr[0];
        }
        throw new AndroidRuntimeException("BUG, Please fixed me");
    }

    public void enable(boolean z) {
        StringBuilder sb = new StringBuilder("enable ");
        sb.append(this.mEnabled);
        sb.append(" -> ");
        sb.append(z);
        AVLog.iod("FilterManager", sb.toString());
        this.mEnabled = z;
        if (this.mAudioStream != null) {
            this.mAudioStream.mute(!z);
        }
    }

    private String getCallInfo(Object... objArr) {
        String str;
        String str2 = "(";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getStackTrace()[3].getMethodName());
            sb.append(str2);
            str2 = sb.toString();
        } catch (Exception unused) {
        }
        int i = 0;
        while (objArr != null && i < objArr.length) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(objArr[i]);
            if (i == objArr.length - 1) {
                str = "";
            } else {
                str = ", ";
            }
            sb2.append(str);
            str2 = sb2.toString();
            i++;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(")");
        return sb3.toString();
    }

    public VideoFrame process(final VideoFrame videoFrame) {
        boolean z;
        videoFrame.retain();
        this.mShouldCatch = false;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mCatchVideoFrameCount > 0 && (!(this.mOriginFrameCatcher == null && this.mEffectFrameCatcher == null) && currentTimeMillis - this.mLastCatchTimestamp > ((long) this.mCatchVideoFrameInterval))) {
            this.mShouldCatch = true;
            this.mLastCatchTimestamp = currentTimeMillis;
        }
        Buffer buffer = videoFrame.getBuffer();
        if (!this.mEnabled || !isValid()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (buffer instanceof TextureBuffer) && !this.mShouldCatch) {
            Type type = ((TextureBuffer) buffer).getType();
            if (type == Type.RGB || (!this.mForceOutput2DTex && type == Type.OES)) {
                return videoFrame;
            }
        }
        final VideoFrame[] videoFrameArr = new VideoFrame[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                try {
                    videoFrameArr[0] = FilterManager.this.onProcess(videoFrame);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("FilterManager process error ");
                    sb.append(Log.getStackTraceString(th));
                    AVLog.ioe("FilterManager", sb.toString());
                }
            }
        });
        if (this.mShouldCatch && this.mCatchVideoFrameCount > 0) {
            this.mCatchVideoFrameCount--;
            if (this.mCatchVideoFrameCount <= 0) {
                this.mHandler.postDelayed(new Runnable() {
                    public void run() {
                        FilterManager.this.stopCatchTask(0, null);
                    }
                }, 1000);
            }
        }
        if (videoFrameArr[0] != videoFrame) {
            videoFrame.release();
        }
        return videoFrameArr[0];
    }

    public VideoFrame onProcess(VideoFrame videoFrame) {
        int i;
        int i2;
        int i3;
        stRoiInfo stroiinfo;
        boolean z;
        VideoFrame videoFrame2 = videoFrame;
        Buffer buffer = videoFrame.getBuffer();
        if (this.mTextureFrameBuffer != null) {
            this.mTextureFrameBuffer.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        }
        if (buffer instanceof TextureBuffer) {
            TextureBuffer textureBuffer = (TextureBuffer) buffer;
            GLES20.glBindFramebuffer(36160, this.mTextureFrameBuffer.getFrameBufferId());
            Matrix transformMatrix = textureBuffer.getTransformMatrix();
            if (videoFrame.getRotation() != 0) {
                transformMatrix.preTranslate(0.5f, 0.5f);
                transformMatrix.preRotate((float) videoFrame.getRotation());
                transformMatrix.preTranslate(-0.5f, -0.5f);
            }
            transformMatrix.preTranslate(0.5f, 0.5f);
            transformMatrix.preScale(1.0f, -1.0f);
            transformMatrix.preTranslate(-0.5f, -0.5f);
            float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(transformMatrix);
            if (textureBuffer.getType() == Type.OES) {
                this.mOffscreenDraw.drawOes(textureBuffer.getTextureId(), null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
            } else {
                this.mOffscreenDraw.drawRgb(textureBuffer.getTextureId(), null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, textureBuffer.getWidth(), textureBuffer.getHeight());
            }
            GLES20.glBindFramebuffer(36160, 0);
            i2 = this.mTextureFrameBuffer.getTextureId();
            if (!this.mEnabled || !isValid()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.mOut2DTex == null) {
                    this.mOut2DTex = new GlTextureFrameBuffer(6408);
                }
                this.mOut2DTex.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                i = this.mOut2DTex.getTextureId();
            } else {
                i = -1;
            }
        } else {
            i2 = this.mTextureFrameBuffer.getTextureId();
            i = this.mTextureFrameBuffer.getTextureId();
            AVLog.logToIODevice2(5, "FilterManager", "Non-texture frame is not supported yet. Outputs may be black frames", null, "FilterManager.java:onProcess:3", VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
        }
        stRoiInfo stroiinfo2 = null;
        if (this.mOriginFrameCatcher != null && this.mShouldCatch) {
            if (this.mOriginFrameCatcher.getMode() == 0) {
                this.mOriginFrameCatcher.onFrame(wrapperFrame(i2, videoFrame2, null));
            } else if (this.mOriginFrameCatcher.getMode() == 1) {
                if (i2 == this.mTextureFrameBuffer.getTextureId()) {
                    GLES20.glBindFramebuffer(36160, this.mTextureFrameBuffer.getFrameBufferId());
                    this.mOriginFrameCatcher.readPixels(buffer.getWidth(), buffer.getHeight());
                    GLES20.glBindFramebuffer(36160, 0);
                } else {
                    AVLog.ioe("FilterManager", "can't read in2dTex pixel buffer");
                }
            }
        }
        if (i2 > 0 && i > 0 && i2 != i) {
            if (this.mRoiEnabled) {
                stroiinfo = new stRoiInfo();
            } else {
                stroiinfo = null;
            }
            if (this.mEffect.process(i2, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), i, this.mOrientation / 90, stroiinfo, videoFrame.getTimestampNs(), this.mForceSticker) != 0) {
                AVLog.logToIODevice2(6, "FilterManager", "effect process failed", null, "FilterManager.java:onProcess:1", VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
            } else {
                AVLog.logToIODevice2(3, "FilterManager", "effect process success", null, "FilterManager.java:onProcess:2", VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
                i2 = i;
                stroiinfo2 = stroiinfo;
            }
        }
        VideoFrame wrapperFrame = wrapperFrame(i2, videoFrame2, stroiinfo2);
        if (this.mEffectFrameCatcher != null && this.mShouldCatch) {
            if (this.mEffectFrameCatcher.getMode() == 0) {
                this.mEffectFrameCatcher.onFrame(wrapperFrame);
            } else if (this.mEffectFrameCatcher.getMode() == 1) {
                if (this.mOut2DTex != null && i2 == this.mOut2DTex.getTextureId()) {
                    i3 = this.mOut2DTex.getFrameBufferId();
                } else if (i2 == this.mTextureFrameBuffer.getTextureId()) {
                    i3 = this.mTextureFrameBuffer.getFrameBufferId();
                } else {
                    i3 = 0;
                }
                if (i3 > 0) {
                    GLES20.glBindFramebuffer(36160, i3);
                    this.mEffectFrameCatcher.readPixels(buffer.getWidth(), buffer.getHeight());
                    GLES20.glBindFramebuffer(36160, 0);
                } else {
                    AVLog.ioe("FilterManager", "can't read out2dTex pixel buffer");
                }
            }
        }
        GLES20.glFlush();
        return wrapperFrame;
    }

    public void onCatchError(int i, String str) {
        stopCatchTask(i, str);
    }

    public void processDoubleClickEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processDoubleClickEvent(f, f2);
                }
            }
        });
    }

    public void processLongPressEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processLongPressEvent(f, f2);
                }
            }
        });
    }

    public void processRotationEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processRotationEvent(f, f2);
                }
            }
        });
    }

    public void processScaleEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processScaleEvent(f, f2);
                }
            }
        });
    }

    public void processTouchEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchEvent(f, f2);
                }
            }
        });
    }

    static final /* synthetic */ void lambda$new$0$FilterManager(int i, String str) {
        StringBuilder sb = new StringBuilder("Effect api return error: ");
        sb.append(i);
        sb.append(". Calling info: ");
        sb.append(str);
        AVLog.ioe("FilterManager", sb.toString());
    }

    public int composerReloadNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerReloadNodes = FilterManager.this.mEffect.composerReloadNodes(strArr, i);
                    if (composerReloadNodes != 0) {
                        FilterManager.this.mErrorListener.onError(composerReloadNodes, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int composerSetMode(final int i, final int i2) {
        final String callInfo = getCallInfo(Integer.valueOf(i), Integer.valueOf(i2));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerSetMode = FilterManager.this.mEffect.composerSetMode(i, i2);
                    if (composerSetMode != 0) {
                        FilterManager.this.mErrorListener.onError(composerSetMode, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int composerSetNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerSetNodes = FilterManager.this.mEffect.composerSetNodes(strArr, i);
                    if (composerSetNodes != 0) {
                        FilterManager.this.mErrorListener.onError(composerSetNodes, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setCustomEffect(final String str, final String str2) {
        final String callInfo = getCallInfo(str, str2);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int customEffect = FilterManager.this.mEffect.setCustomEffect(str, str2);
                    if (customEffect != 0) {
                        FilterManager.this.mErrorListener.onError(customEffect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setFilter(final String str, final float f) {
        final String callInfo = getCallInfo(str, Float.valueOf(f));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int filter = FilterManager.this.mEffect.setFilter(str, f);
                    if (filter != 0) {
                        FilterManager.this.mErrorListener.onError(filter, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setEffect(final String str, final boolean z) {
        final String callInfo = getCallInfo(str, Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mForceSticker = z;
                    int effect = FilterManager.this.mEffect.setEffect(str);
                    if (effect != 0) {
                        FilterManager.this.mErrorListener.onError(effect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public void stopCatchTask(final int i, final String str) {
        if (Thread.currentThread() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    FilterManager.this.stopCatchTask(i, str);
                }
            });
            return;
        }
        if (this.mOriginFrameCatcher != null) {
            this.mOriginFrameCatcher.stop(i);
            this.mOriginFrameCatcher.release();
            this.mOriginFrameCatcher = null;
        }
        if (this.mEffectFrameCatcher != null) {
            this.mEffectFrameCatcher.stop(i);
            this.mEffectFrameCatcher.release();
            this.mEffectFrameCatcher = null;
        }
        if (this.mCatchVideoCallback != null) {
            if (i == 0) {
                this.mCatchVideoCallback.onComplete();
            } else {
                this.mCatchVideoCallback.onError(i, str);
            }
            this.mCatchVideoCallback = null;
        }
        this.mCatchVideoFrameCount = 0;
    }

    public void catchVideo(MediaEngineFactory mediaEngineFactory, final Bundle bundle, final CatchVideoCallback catchVideoCallback) {
        final WeakReference weakReference = new WeakReference(mediaEngineFactory);
        this.mHandler.post(new Runnable() {
            public void run() {
                C456771 r19;
                if (FilterManager.this.mOriginFrameCatcher == null && FilterManager.this.mEffectFrameCatcher == null) {
                    MediaEngineFactory mediaEngineFactory = (MediaEngineFactory) weakReference.get();
                    int i = bundle.getInt("mode", -1);
                    int i2 = bundle.getInt("width");
                    int i3 = bundle.getInt("height");
                    int i4 = bundle.getInt("fps");
                    boolean z = bundle.getBoolean("hardwareEncode", true);
                    String string = bundle.getString("outputPathOrigin");
                    String string2 = bundle.getString("outputPathWithEffect");
                    FilterManager.this.mCatchVideoFrameCount = bundle.getInt("frameCount");
                    if (i == 0 && bundle.containsKey("duration")) {
                        FilterManager.this.mCatchVideoFrameCount = (int) (bundle.getFloat("duration") * ((float) i4));
                    }
                    FilterManager.this.mCatchVideoFrameInterval = (int) (bundle.getFloat("interval") * 1000.0f);
                    FilterManager.this.mCatchVideoCallback = catchVideoCallback;
                    C456771 r11 = new CatchVideoCallback() {
                        public void onComplete() {
                        }

                        public void onError(int i, String str) {
                            FilterManager.this.onCatchError(i, str);
                        }
                    };
                    if (!TextUtils.isEmpty(string)) {
                        FilterManager.this.mOriginFrameCatcher = new VideoCatcher();
                        r19 = r11;
                        FilterManager.this.mOriginFrameCatcher.start(i, i2, i3, i4, z, string, r11, mediaEngineFactory, FilterManager.this.mHandler);
                    } else {
                        r19 = r11;
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        FilterManager.this.mEffectFrameCatcher = new VideoCatcher();
                        FilterManager.this.mEffectFrameCatcher.start(i, i2, i3, i4, z, string2, r19, mediaEngineFactory, FilterManager.this.mHandler);
                    }
                    return;
                }
                if (catchVideoCallback != null) {
                    catchVideoCallback.onError(-2, "Already started a catching task");
                }
            }
        });
    }

    public void processTouchDownEvent(final float f, final float f2, final int i) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchDownEvent(f, f2, i);
                }
            }
        });
    }

    public void processTouchUpEvent(final float f, final float f2, final int i) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchUpEvent(f, f2, i);
                }
            }
        });
    }

    private VideoFrame wrapperFrame(int i, VideoFrame videoFrame, stRoiInfo stroiinfo) {
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), Type.RGB, i, matrix, (ToI420Interface) this, (Runnable) new Runnable() {
            public void run() {
            }
        });
        textureBufferImpl.setROIInfo(stroiinfo);
        return new VideoFrame(textureBufferImpl, 0, videoFrame.getTimestampNs());
    }

    public int composerUpdateNode(String str, String str2, float f) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f));
        Handler handler = this.mHandler;
        final String str3 = str;
        final String str4 = str2;
        final float f2 = f;
        C4565622 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerUpdateNode = FilterManager.this.mEffect.composerUpdateNode(str3, str4, f2);
                    if (composerUpdateNode != 0) {
                        FilterManager.this.mErrorListener.onError(composerUpdateNode, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public int setBeautify(String str, float f, float f2) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Float.valueOf(f2));
        Handler handler = this.mHandler;
        final String str2 = str;
        final float f3 = f;
        final float f4 = f2;
        C4564411 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int beautify = FilterManager.this.mEffect.setBeautify(str2, f3, f4);
                    if (beautify != 0) {
                        FilterManager.this.mErrorListener.onError(beautify, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public int setFilter(String str, String str2, float f) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f));
        Handler handler = this.mHandler;
        final String str3 = str;
        final String str4 = str2;
        final float f2 = f;
        C4565219 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int filter = FilterManager.this.mEffect.setFilter(str3, str4, f2);
                    if (filter != 0) {
                        FilterManager.this.mErrorListener.onError(filter, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public int setReshape(String str, float f, float f2) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Float.valueOf(f2));
        Handler handler = this.mHandler;
        final String str2 = str;
        final float f3 = f;
        final float f4 = f2;
        C4564613 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int reshape = FilterManager.this.mEffect.setReshape(str2, f3, f4);
                    if (reshape != 0) {
                        FilterManager.this.mErrorListener.onError(reshape, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public static IFilterManager create(InputAudioStreamObserver inputAudioStreamObserver, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor) {
        return new FilterManager(inputAudioStreamObserver, context, handler, iVideoEffectProcessor);
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        final String callInfo = getCallInfo(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        Handler handler = this.mHandler;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final String str2 = str;
        C4567136 r3 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int sendEffectMsg = FilterManager.this.mEffect.sendEffectMsg(i4, i5, i6, str2);
                    if (sendEffectMsg != 0) {
                        FilterManager.this.mErrorListener.onError(sendEffectMsg, callInfo);
                    }
                }
            }
        };
        handler.post(r3);
        return 0;
    }

    public FilterManager(InputAudioStreamObserver inputAudioStreamObserver, Context context, Handler handler, final IVideoEffectProcessor iVideoEffectProcessor) {
        this.mHandler = handler;
        if (this.mHandler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        FilterManager.this.mHandler = null;
                    }
                }
            });
        }
        if (this.mHandler == null) {
            this.mGLThread = new GLThread("LiveFilterThread");
            this.mGLThread.start();
            this.mHandler = this.mGLThread.getHandler();
        }
        this.mAudioStreamObserver = inputAudioStreamObserver;
        this.mOrientationListener = new AlbumOrientationEventListener(context);
        this.mErrorListener = FilterManager$$Lambda$0.$instance;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (iVideoEffectProcessor != null) {
                    FilterManager.this.mEffect = iVideoEffectProcessor;
                } else {
                    FilterManager.this.mEffect = new EffectWrapper();
                }
                if (!FilterManager.this.mEffect.valid()) {
                    FilterManager.this.mEffect.release();
                    FilterManager.this.mEffect = null;
                    return;
                }
                StringBuilder sb = new StringBuilder("Using Effect info ");
                sb.append(FilterManager.this.mEffect.name());
                sb.append(" ");
                sb.append(FilterManager.this.mEffect.getEffectVersion());
                AVLog.iow("FilterManager", sb.toString());
                FilterManager.this.mOffscreenDraw = new GlRenderDrawer();
                FilterManager.this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            }
        });
    }

    public int setBeautify(String str, float f, float f2, float f3) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        Handler handler = this.mHandler;
        final String str2 = str;
        final float f4 = f;
        final float f5 = f2;
        final float f6 = f3;
        C4564512 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int beautify = FilterManager.this.mEffect.setBeautify(str2, f4, f5, f6);
                    if (beautify != 0) {
                        FilterManager.this.mErrorListener.onError(beautify, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z) {
        Handler handler = this.mHandler;
        final int i3 = i;
        final int i4 = i2;
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = z;
        C456857 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.configEffect(i3, i4, str3, str4, z2, false);
                    if (FilterManager.this.mMsgListener != null) {
                        FilterManager.this.mMsgListener.onMessageReceived(2139095041, 0, 0, null);
                    }
                }
            }
        };
        handler.post(r1);
    }

    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        Handler handler = this.mHandler;
        final float f6 = f;
        final float f7 = f2;
        final float f8 = f3;
        final float f9 = f4;
        final float f10 = f5;
        C4566127 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processPanEvent(f6, f7, f8, f9, f10);
                }
            }
        };
        handler.post(r1);
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, AssetManager assetManager) {
        Handler handler = this.mHandler;
        final AssetManager assetManager2 = assetManager;
        final int i3 = i;
        final int i4 = i2;
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = z;
        C456868 r0 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setAssetManager(assetManager2);
                    FilterManager.this.mEffect.configEffect(i3, i4, str3, str4, z2, false);
                    if (FilterManager.this.mMsgListener != null) {
                        FilterManager.this.mMsgListener.onMessageReceived(2139095041, 0, 0, null);
                    }
                }
            }
        };
        handler.post(r0);
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, Object obj) {
        Handler handler = this.mHandler;
        final Object obj2 = obj;
        final int i3 = i;
        final int i4 = i2;
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = z;
        C456879 r0 = new Runnable() {
            public void run() {
                boolean z;
                if (FilterManager.this.isValid()) {
                    if (obj2 != null) {
                        FilterManager.this.mEffect.setResourceFinder(obj2);
                    }
                    IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
                    int i = i3;
                    int i2 = i4;
                    String str = str3;
                    String str2 = str4;
                    boolean z2 = z2;
                    if (obj2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iVideoEffectProcessor.configEffect(i, i2, str, str2, z2, z);
                    if (FilterManager.this.mMsgListener != null) {
                        FilterManager.this.mMsgListener.onMessageReceived(2139095041, 0, 0, null);
                    }
                }
            }
        };
        handler.post(r0);
    }
}

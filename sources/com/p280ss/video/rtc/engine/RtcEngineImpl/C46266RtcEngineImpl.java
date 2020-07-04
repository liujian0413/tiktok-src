package com.p280ss.video.rtc.engine.RtcEngineImpl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView.SurfaceTextureListener;
import com.C1642a;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.p280ss.video.rtc.base.feedback.FeedbackOptions;
import com.p280ss.video.rtc.base.utils.RtcContextUtils;
import com.p280ss.video.rtc.engine.IAudioFrameObserver;
import com.p280ss.video.rtc.engine.InternalVideoStreamDescription;
import com.p280ss.video.rtc.engine.NativeFunctions;
import com.p280ss.video.rtc.engine.PublisherConfiguration;
import com.p280ss.video.rtc.engine.RtcEngineEx;
import com.p280ss.video.rtc.engine.SubscribeConfig;
import com.p280ss.video.rtc.engine.VideoCanvas;
import com.p280ss.video.rtc.engine.VideoStreamDescription;
import com.p280ss.video.rtc.engine.adapter.VideoSinkAdapter;
import com.p280ss.video.rtc.engine.client.IVideoRenderer;
import com.p280ss.video.rtc.engine.client.VideoCanvasManager;
import com.p280ss.video.rtc.engine.client.VideoSinkManager;
import com.p280ss.video.rtc.engine.data.ByteRtcData;
import com.p280ss.video.rtc.engine.handler.ByteRtcEngineEventHandler;
import com.p280ss.video.rtc.engine.handler.ByteRtcVideoFrameObserver;
import com.p280ss.video.rtc.engine.handler.EngineAudioDeviceEventHandler;
import com.p280ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel;
import com.p280ss.video.rtc.engine.live.LiveTranscoding;
import com.p280ss.video.rtc.engine.live.LiveTranscoding.Layout;
import com.p280ss.video.rtc.engine.loader.RtcNativeLibraryListenerImpl;
import com.p280ss.video.rtc.engine.loader.RtcNativeLibraryLoaderListener;
import com.p280ss.video.rtc.engine.mediaio.IFrameRender;
import com.p280ss.video.rtc.engine.mediaio.IVideoSink;
import com.p280ss.video.rtc.engine.p1833ui.RenderView;
import com.p280ss.video.rtc.engine.p1833ui.VideoFrameRender;
import com.p280ss.video.rtc.engine.utils.AudioUtils;
import com.p280ss.video.rtc.engine.utils.ExtVideoFrame;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.utils.LogUtil.LoggerSink;
import com.p280ss.video.rtc.engine.utils.VideoFrameConverter;
import com.p280ss.video.rtc.engine.video.VideoEncoderConfiguration.ORIENTATION_MODE;
import com.p280ss.video.rtc.engine.video.VideoFrameDeliver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.RendererCommon.ScalingType;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.voiceengine.WebRtcAudioManager;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl */
public final class C46266RtcEngineImpl extends RtcEngineEx {
    private static C46266RtcEngineImpl mInstance;
    private static boolean mLibraryLoaded;
    private static WeakReference<IRtcEngineAudioDeviceEventHandler> mRtcEngineAudioDeviceHandler;
    private static RtcNativeLibraryLoaderListener mRtcNativeLibraryListener = new RtcNativeLibraryListenerImpl();
    private static Handler mUiHandler = null;
    private String mAppId;
    private boolean mAudioEnabled = true;
    private ByteRtcVideoFrameObserver mByteRtcVideoFrameObserver;
    private VideoCanvasManager mCanvasManager = new VideoCanvasManager();
    private int mChannelProfile;
    private int mClientRole = 2;
    private Context mContext;
    private Handler mEglHandler;
    private HandlerThread mEglThread;
    private boolean mEnableTranscode;
    private EngineAudioDeviceEventHandler mEngineAudioDeviceEventHandler;
    private ByteRtcEngineEventHandler mEngineEventHandler;
    private LiveTranscoding mLiveTranscoding;
    private LoggerSink mLoggerSink = RtcEngineImpl$$Lambda$0.$instance;
    private boolean mMonitorAudioRouting = true;
    private long mNativeByteRtcEngine = -1;
    private Runnable mOnDestroyCompletedCallback;
    private boolean mPushMode = true;
    private boolean mRequestSoftwareEncoder;
    private String mRoom;
    private EglBase mRootEglBase;
    private WeakReference<IRtcEngineEventHandler> mRtcEngineHandler;
    private String mSessionId;
    private State mState;
    private String mToken;
    private boolean mUseExtTexture;
    private boolean mUseExtVideoSource;
    private String mUser;
    private boolean mVideoEnabled = true;
    private VideoFrameConverter mVideoFrameConverter;
    private VideoFrameDeliver mVideoFrameDeliver;
    private int mVideoMirrorMode;
    private VideoSinkManager mVideoSinkManager = new VideoSinkManager();

    /* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$State */
    enum State {
        IDLE,
        IN_ROOM,
        DESTORY
    }

    /* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public final int addPublishStreamUrl(String str, boolean z) {
        return 0;
    }

    public final int channelInviteDTMF(String str, String str2) {
        return 0;
    }

    public final int channelInviteEnd(String str, String str2) {
        return 0;
    }

    public final int clearVideoWatermarks() {
        return 0;
    }

    public final int complain(String str, String str2) {
        return 0;
    }

    public final int createDataStream(boolean z, boolean z2) {
        return 0;
    }

    public final int createTexture(int i, int i2, SurfaceTextureListener surfaceTextureListener) {
        return 0;
    }

    public final void destroyTexture() {
    }

    public final int disableLastmileTest() {
        return 0;
    }

    public final int enableAudioQualityIndication(boolean z) {
        return 0;
    }

    public final int enableDualStreamMode(boolean z) {
        return 0;
    }

    public final boolean enableHighPerfWifiMode(boolean z) {
        return false;
    }

    public final int enableLastmileTest() {
        return 0;
    }

    public final void enableLogStatisticReport(boolean z) {
    }

    public final int enableRecap(int i) {
        return 0;
    }

    public final int enableTransportQualityIndication(boolean z) {
        return 0;
    }

    public final int enableWebSdkInteroperability(boolean z) {
        return 0;
    }

    public final String getCallId() {
        return null;
    }

    public final float getCameraMaxZoomFactor() {
        return 0.0f;
    }

    public final long getNativeHandle() {
        return this.mNativeByteRtcEngine;
    }

    public final String getParameter(String str, String str2) {
        return null;
    }

    public final String getParameters(String str) {
        return null;
    }

    public final String getRoomName() {
        return this.mRoom;
    }

    public final SurfaceTexture getSurfaceTexture() {
        return null;
    }

    public final boolean isCameraAutoFocusFaceModeSupported() {
        return false;
    }

    public final boolean isCameraFocusSupported() {
        return false;
    }

    public final boolean isCameraTorchSupported() {
        return false;
    }

    public final boolean isCameraZoomSupported() {
        return false;
    }

    public final boolean isInEarMonitoring() {
        return this.mMonitorAudioRouting;
    }

    public final boolean isTextureEncodeSupported() {
        return false;
    }

    public final String makeQualityReportUrl(String str, int i, int i2, int i3) {
        return null;
    }

    public final int monitorAudioRouteChange(boolean z) {
        return 0;
    }

    public final void monitorConnectionEvent(boolean z) {
    }

    public final int playRecap() {
        return 0;
    }

    public final int pushExternalAudioFrame(byte[] bArr, long j) {
        return 0;
    }

    public final int refreshRecordingServiceStatus() {
        return 0;
    }

    public final int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        return 0;
    }

    public final int removePublishStreamUrl(String str) {
        return 0;
    }

    public final int renewToken(String str) {
        return 0;
    }

    public final int sendStreamMessage(int i, byte[] bArr) {
        return 0;
    }

    public final int setApiCallMode(int i) {
        return 0;
    }

    public final int setAudioProfile(int i, int i2) {
        return 0;
    }

    public final int setCameraAutoFocusFaceModeEnabled(boolean z) {
        return 0;
    }

    public final int setCameraFocusPositionInPreview(float f, float f2) {
        return 0;
    }

    public final int setCameraTorchOn(boolean z) {
        return 0;
    }

    public final int setCameraZoomFactor(float f) {
        return 0;
    }

    public final int setEncryptionMode(String str) {
        return 0;
    }

    public final int setEncryptionSecret(String str) {
        return 0;
    }

    public final int setExternalAudioSource(boolean z, int i, int i2) {
        return 0;
    }

    public final int setInEarMonitoringVolume(int i) {
        return 0;
    }

    public final int setLocalRenderMode(int i) {
        return 0;
    }

    public final int setLocalVideoRenderer(IVideoRenderer iVideoRenderer) {
        return 0;
    }

    public final int setLocalVoiceEqualization(int i, int i2) {
        return 0;
    }

    public final int setLocalVoicePitch(double d) {
        return 0;
    }

    public final int setLocalVoiceReverb(int i, int i2) {
        return 0;
    }

    public final int setLogFile(String str) {
        return -1;
    }

    public final int setLogFileDir(String str) {
        return -1;
    }

    public final int setMixedAudioFrameParameters(int i, int i2) {
        return 0;
    }

    public final int setParameters(String str) {
        return 0;
    }

    public final int setPlaybackAudioFrameParameters(int i, int i2, int i3, int i4) {
        return 0;
    }

    public final int setProfile(String str, boolean z) {
        return 0;
    }

    public final int setRecordingAudioFrameParameters(int i, int i2, int i3, int i4) {
        return 0;
    }

    public final int setRemoteDefaultVideoStreamType(int i) {
        return 0;
    }

    public final int setRemoteRenderMode(String str, int i) {
        return 0;
    }

    public final int setRemoteVideoRenderer(int i, IVideoRenderer iVideoRenderer) {
        return 0;
    }

    public final int setRemoteVideoStreamType(int i, int i2) {
        return 0;
    }

    public final int setSendScreenMaxKbps(int i) {
        return 0;
    }

    public final int setSignalServerAddr(String str) {
        return 0;
    }

    public final int setSpeakerphoneVolume(int i) {
        return 0;
    }

    public final int setUserAgentIp(String str) {
        return 0;
    }

    public final int setVideoMaxKbps(int i) {
        return 0;
    }

    public final int setVideoQualityParameters(boolean z) {
        return 0;
    }

    public final int startAudioRecording(String str, int i) {
        return 0;
    }

    public final int startEchoTest() {
        return 0;
    }

    public final int startPlayingStream(String str) {
        return 0;
    }

    public final int startRecordingService(String str) {
        return 0;
    }

    public final int stopAudioRecording() {
        return 0;
    }

    public final int stopEchoTest() {
        return 0;
    }

    public final int stopPlayingStream() {
        return 0;
    }

    public final int stopRecordingService(String str) {
        return 0;
    }

    public final void switchView(int i, int i2) {
    }

    public final void uploadLogFile(String str) {
    }

    public final int useExternalAudioDevice() {
        return 0;
    }

    public static Context getApplicationContext() {
        return RtcContextUtils.getApplicationContext();
    }

    public final int getAudioMixingStreamCachedFrameNum() {
        return NativeFunctions.nativeGetAudioMixingStreamCachedFrameNum(this.mNativeByteRtcEngine);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$doDestroy$3$RtcEngineImpl() {
        this.mRootEglBase.release();
    }

    public static String getLocalUser() {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        return mInstance.mUser;
    }

    public static IRtcEngineAudioDeviceEventHandler getRtcEngineAudioDeviceEventHandler() {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        return (IRtcEngineAudioDeviceEventHandler) mRtcEngineAudioDeviceHandler.get();
    }

    public static String getSDKVersion() {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        return NativeFunctions.nativeGetSDKVersion();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$doDestroy$2$RtcEngineImpl() {
        if (this.mOnDestroyCompletedCallback != null) {
            this.mOnDestroyCompletedCallback.run();
        }
    }

    private void checkAudioRouter() {
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, checkAudioRouter failed.");
        } else if (this.mMonitorAudioRouting) {
            NativeFunctions.nativeStartAudioRoutingMonitoring(this.mNativeByteRtcEngine);
        } else {
            NativeFunctions.nativeStopAudioRoutingMonitoring(this.mNativeByteRtcEngine);
        }
    }

    public final void disableLiveTranscoding() {
        LogUtil.m145278d("RtcEngineImpl", "disableLiveTranscoding...");
        this.mEnableTranscode = false;
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, disableLiveTranscoding failed.");
        } else {
            NativeFunctions.nativeDisableLiveTranscoding(this.mNativeByteRtcEngine);
        }
    }

    public final int getAudioMixingCurrentPosition() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeGetAudioMixingCurrentPosition(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, getAudioMixingCurrentPosition failed.");
        return -1;
    }

    public final int getAudioMixingDuration() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeGetAudioMixingDuration(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, getAudioMixingDuration failed.");
        return -1;
    }

    public final boolean isSpeakerphoneEnabled() {
        Context context = this.mContext;
        if (context == null) {
            return false;
        }
        return ((AudioManager) context.getSystemService("audio")).isSpeakerphoneOn();
    }

    public final int pauseAllEffects() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativePauseAllEffects(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, pauseAllEffects failed.");
        return -1;
    }

    public final int pauseAudio() {
        LogUtil.m145278d("RtcEngineImpl", "pauseAudio.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, pauseAudio failed.");
            return -1;
        }
        NativeFunctions.nativePauseAudio(this.mNativeByteRtcEngine);
        return 0;
    }

    public final int pauseAudioMixing() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativePauseAudioMixing(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, pauseAudioMixing failed.");
        return -1;
    }

    public final int publishScreen() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativePublishScreen(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, publishScreen failed.");
        return -1;
    }

    public final int resumeAllEffects() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeResumeAllEffects(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, resumeAllEffects failed.");
        return -1;
    }

    public final int resumeAudio() {
        LogUtil.m145278d("RtcEngineImpl", "resumeAudio.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, resumeAudio failed.");
            return -1;
        }
        NativeFunctions.nativeResumeAudio(this.mNativeByteRtcEngine);
        return 0;
    }

    public final int resumeAudioMixing() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeResumeAudioMixing(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, resumeAudioMixing failed.");
        return -1;
    }

    public final int startPreview() {
        LogUtil.m145278d("RtcEngineImpl", "startPreview.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, startPreview failed.");
            return -1;
        }
        NativeFunctions.nativeStartPreview(this.mNativeByteRtcEngine);
        return 0;
    }

    public final int stopAllEffects() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeStopAllEffects(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, stopAllEffects failed.");
        return -1;
    }

    public final int stopAudioMixing() {
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, stopAudioMixing failed.");
            return -1;
        }
        NativeFunctions.nativeStopAudioMixing(this.mNativeByteRtcEngine);
        return 0;
    }

    public final int stopPreview() {
        LogUtil.m145278d("RtcEngineImpl", "stopPreview.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, stopPreview failed.");
            return -1;
        }
        NativeFunctions.nativeStopPreview(this.mNativeByteRtcEngine);
        return 0;
    }

    public final int switchCamera() {
        LogUtil.m145278d("RtcEngineImpl", "switchCamera");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, switchCamera failed.");
            return -1;
        }
        NativeFunctions.nativeSwitchCamera(this.mNativeByteRtcEngine);
        return 0;
    }

    public final int unloadAllEffects() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeUnloadAllEffects(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, unloadAllEffects failed.");
        return -1;
    }

    public final int unpublishScreen() {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeUnpublishScreen(this.mNativeByteRtcEngine);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, unpublishScreen failed.");
        return -1;
    }

    public static IRtcEngineEventHandler getRtcEngineHandler() {
        synchronized (C46266RtcEngineImpl.class) {
            if (!mLibraryLoaded) {
                loadSoFile();
            }
            if (mInstance != null) {
                if (mInstance.mRtcEngineHandler != null) {
                    IRtcEngineEventHandler iRtcEngineEventHandler = (IRtcEngineEventHandler) mInstance.mRtcEngineHandler.get();
                    return iRtcEngineEventHandler;
                }
            }
            return null;
        }
    }

    public final int disableAudio() {
        LogUtil.m145278d("RtcEngineImpl", "disableAudio.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, disableAudio failed.");
            return -1;
        }
        this.mAudioEnabled = false;
        NativeFunctions.nativeDisableAudio(this.mNativeByteRtcEngine);
        return 0;
    }

    public final int disableVideo() {
        LogUtil.m145278d("RtcEngineImpl", "disableVideo.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, disableVideo failed.");
            return -1;
        }
        this.mVideoEnabled = false;
        NativeFunctions.nativeDisableVideo(this.mNativeByteRtcEngine);
        return 0;
    }

    public final int enableAudio() {
        LogUtil.m145278d("RtcEngineImpl", "enableAudio.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, enableAudio failed.");
            return -1;
        }
        this.mAudioEnabled = true;
        NativeFunctions.nativeEnableAudio(this.mNativeByteRtcEngine);
        return 0;
    }

    public final int enableVideo() {
        LogUtil.m145278d("RtcEngineImpl", "enableVideo.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, enableVideo failed.");
            return -1;
        }
        this.mVideoEnabled = true;
        NativeFunctions.nativeEnableVideo(this.mNativeByteRtcEngine);
        return 0;
    }

    private static void loadSoFile() {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("bytertc");
        } else if (mRtcNativeLibraryLoader != null) {
            boolean load = mRtcNativeLibraryLoader.load("bytertc");
            mLibraryLoaded = load;
            if (load) {
                mRtcNativeLibraryListener.onLoadSuccess("bytertc");
            } else {
                mRtcNativeLibraryListener.onLoadError("bytertc");
            }
        } else {
            try {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("bytertc");
                mLibraryLoaded = true;
                mRtcNativeLibraryListener.onLoadSuccess("bytertc");
            } catch (UnsatisfiedLinkError e) {
                LogUtil.m145280e("RtcEngineImpl", "Failed to load native library: bytertc", e);
                mRtcNativeLibraryListener.onLoadError("bytertc");
            }
        }
    }

    public final void doDestroy() {
        LogUtil.m145278d("RtcEngineImpl", "destroy RtcEngineImpl.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, no need to destroy now.");
            return;
        }
        this.mState = State.DESTORY;
        LogUtil.setLoggerSink(null);
        mUiHandler = null;
        if (this.mCanvasManager != null) {
            this.mCanvasManager.release();
        }
        if (this.mVideoSinkManager != null) {
            this.mVideoSinkManager.release();
        }
        NativeFunctions.nativeDestroyByteRtcEngine(this.mNativeByteRtcEngine);
        this.mNativeByteRtcEngine = -1;
        mInstance = null;
        this.mVideoFrameConverter.dispose();
        this.mVideoFrameConverter = null;
        new Handler(Looper.getMainLooper()).post(new RtcEngineImpl$$Lambda$2(this));
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, (Runnable) new RtcEngineImpl$$Lambda$3(this));
        this.mEglThread.quit();
    }

    public final int leaveChannel() {
        LogUtil.m145278d("RtcEngineImpl", "leaveChannel");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, leaveChannel failed.");
            return -1;
        }
        this.mState = State.IDLE;
        this.mRoom = "";
        this.mUser = "";
        this.mSessionId = "";
        this.mToken = "";
        if (this.mRtcEngineHandler != null) {
            ((IRtcEngineEventHandler) this.mRtcEngineHandler.get()).onLeaveChannel(null);
        }
        if (this.mCanvasManager != null) {
            this.mCanvasManager.release();
        }
        if (this.mVideoSinkManager != null) {
            this.mVideoSinkManager.release();
        }
        if (this.mVideoFrameDeliver != null) {
            this.mVideoFrameDeliver.clearObservers();
        }
        NativeFunctions.nativeLeaveChannel(this.mNativeByteRtcEngine);
        return 0;
    }

    public final void setLogFilter(RtcLogLevel rtcLogLevel) {
        LogUtil.setLogLevel(rtcLogLevel);
    }

    public final void setOnDestroyCompletedCallback(Runnable runnable) {
        this.mOnDestroyCompletedCallback = runnable;
    }

    public static void setSignalingServer(String str) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
    }

    public final int enableInEarMonitoring(boolean z) {
        this.mMonitorAudioRouting = z;
        checkAudioRouter();
        return 0;
    }

    public final int setVideoResolutions(VideoStreamDescription[] videoStreamDescriptionArr) {
        return setVideoResolutions(videoStreamDescriptionArr, ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE);
    }

    public static FeedbackOptions getFeedbackContent(Context context) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        return NativeFunctions.nativeGetFeedbackContent(context);
    }

    public static int setDeviceId(String str) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        return NativeFunctions.nativeSetDeviceId(str);
    }

    public static void useDefaultSignalingServer(boolean z) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        NativeFunctions.nativeUseDefaultSignalingServer(z);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$pushExternalVideoFrame$7$RtcEngineImpl(VideoFrame videoFrame) {
        NativeFunctions.nativePushExternalVideoFrame(this.mNativeByteRtcEngine, videoFrame);
        videoFrame.release();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$pushExternalVideoFrame$8$RtcEngineImpl(VideoFrame videoFrame) {
        NativeFunctions.nativePushExternalVideoFrame(this.mNativeByteRtcEngine, videoFrame);
        videoFrame.release();
    }

    public final boolean setAudioDeviceEventHandler(IRtcEngineAudioDeviceEventHandler iRtcEngineAudioDeviceEventHandler) {
        mRtcEngineAudioDeviceHandler = new WeakReference<>(iRtcEngineAudioDeviceEventHandler);
        return true;
    }

    public final int setupLocalVideo(VideoCanvas videoCanvas) {
        mUiHandler.post(new RtcEngineImpl$$Lambda$5(this, videoCanvas));
        return 0;
    }

    public final int setupRemoteVideo(VideoCanvas videoCanvas) {
        mUiHandler.post(new RtcEngineImpl$$Lambda$4(this, videoCanvas));
        return 0;
    }

    public static void setApiServerHost(String[] strArr) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        if (strArr.length > 1) {
            LogUtil.m145278d("RtcEngineImpl", "Native sdk only support only on now, Need to change later.");
        }
        NativeFunctions.nativeSetApiServerHost(strArr[0]);
    }

    public final int adjustAudioMixingPlayoutVolume(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeAdjustAudioMixingPlayoutVolume(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPlayoutVolume failed.");
        return -1;
    }

    public final int adjustAudioMixingPublishVolume(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeAdjustAudioMixingPublishVolume(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPublishVolume failed.");
        return -1;
    }

    public final int adjustAudioMixingVolume(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeAdjustAudioMixingVolume(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingVolume failed.");
        return -1;
    }

    public final int adjustPlaybackSignalVolume(int i) {
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, adjustPlaybackSignalVolume failed.");
            return -1;
        }
        NativeFunctions.nativeAdjustPlaybackSignalVolume(this.mNativeByteRtcEngine, i);
        return 0;
    }

    public final int adjustRecordingSignalVolume(int i) {
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, adjustRecordingSignalVolume failed.");
            return -1;
        }
        NativeFunctions.nativeAdjustRecordingSignalVolume(this.mNativeByteRtcEngine, i);
        return 0;
    }

    public final int getEffectVolume(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeGetEffectVolume(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, getEffectVolume failed.");
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$setupLocalScreen$9$RtcEngineImpl(VideoCanvas videoCanvas) {
        this.mCanvasManager.add(videoCanvas.uid, true, videoCanvas);
        setupVideoViewOnMainThread(videoCanvas);
        this.mVideoFrameDeliver.registerScreenFrameObserver(videoCanvas.uid, videoCanvas.view);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$setupRemoteScreen$6$RtcEngineImpl(VideoCanvas videoCanvas) {
        this.mCanvasManager.add(videoCanvas.uid, true, videoCanvas);
        setupVideoViewOnMainThread(videoCanvas);
        setupRemoteVideoInternal(videoCanvas.view, videoCanvas.uid, true);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$setupRemoteVideo$4$RtcEngineImpl(VideoCanvas videoCanvas) {
        this.mCanvasManager.add(videoCanvas.uid, false, videoCanvas);
        setupVideoViewOnMainThread(videoCanvas);
        if (videoCanvas.view != null) {
            videoCanvas.view.setMirror(false);
        }
        setupRemoteVideoInternal(videoCanvas.view, videoCanvas.uid, false);
    }

    public final int pauseEffect(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativePauseEffect(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, pauseEffect failed.");
        return -1;
    }

    public final int resumeEffect(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeResumeEffect(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, resumeEffect failed.");
        return -1;
    }

    public final void sendCustomMessage(String str) {
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
        } else {
            NativeFunctions.nativeSendCustomMessage(this.mNativeByteRtcEngine, str);
        }
    }

    public final int setAudioMixingPosition(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeSetAudioMixingPosition(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setAudioMixingPosition failed.");
        return -1;
    }

    public final void setAudioMode(int i) {
        if (this.mContext != null) {
            AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
            if (!(audioManager == null || audioManager.getMode() == i)) {
                audioManager.setMode(i);
            }
        }
    }

    public final int setEffectsVolume(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeSetEffectsVolume(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setEffectsVolume failed.");
        return -1;
    }

    public final int setLocalVideoMirrorMode(int i) {
        this.mVideoMirrorMode = i;
        VideoCanvas videoCanvas = this.mCanvasManager.get(this.mUser, false);
        if (videoCanvas != null) {
            RenderView renderView = videoCanvas.view;
            if (renderView != null) {
                if (i == 1) {
                    renderView.setMirror(true);
                } else {
                    renderView.setMirror(false);
                }
            }
        }
        return 0;
    }

    public final int stopEffect(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeStopEffect(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, stopEffect failed.");
        return -1;
    }

    public final int unloadEffect(int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeUnloadEffect(this.mNativeByteRtcEngine, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, unloadEffect failed.");
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: initEglContext */
    public void lambda$new$1$RtcEngineImpl(Object obj) {
        if (obj == null) {
            this.mRootEglBase = EglBase$$CC.create$$STATIC$$();
        } else if (obj instanceof EGLContext) {
            this.mRootEglBase = EglBase$$CC.createEgl10$$STATIC$$((EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof android.opengl.EGLContext) {
            this.mRootEglBase = EglBase$$CC.createEgl14$$STATIC$$((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else {
            this.mRootEglBase = EglBase$$CC.create$$STATIC$$();
        }
    }

    public static void setRtcEngineEventHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        LogUtil.m145278d("RtcEngineImpl", "setRtcEngineEventHandler");
        synchronized (C46266RtcEngineImpl.class) {
            if (!mLibraryLoaded) {
                loadSoFile();
            }
            if (mInstance != null) {
                mInstance.mRtcEngineHandler = new WeakReference<>(iRtcEngineEventHandler);
            }
        }
    }

    public final void enableAutoSubscribe(boolean z) {
        StringBuilder sb = new StringBuilder("enableAutoSubscribe: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, enableAutoSubscribe failed.");
        } else {
            NativeFunctions.nativeEnableAutoSubscribe(this.mNativeByteRtcEngine, z);
        }
    }

    public final int enableLocalAudio(boolean z) {
        StringBuilder sb = new StringBuilder("enableLocalAudio...enable: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, enableLocalAudio failed.");
            return -1;
        }
        NativeFunctions.nativeEnableLocalAudio(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final int enableLocalVideo(boolean z) {
        StringBuilder sb = new StringBuilder("enableLocalVideo...enable: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, enableLocalVideo failed.");
            return -1;
        }
        NativeFunctions.nativeEnableLocalVideo(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final void enableSubscribeLocalStream(boolean z) {
        StringBuilder sb = new StringBuilder("enableSubscribeLocalStream: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, enableSubscribeLocalStream failed.");
        } else {
            NativeFunctions.nativeEnableSubscribeLocalStream(this.mNativeByteRtcEngine, z);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$setupLocalVideo$5$RtcEngineImpl(VideoCanvas videoCanvas) {
        this.mCanvasManager.add(videoCanvas.uid, false, videoCanvas);
        setupVideoViewOnMainThread(videoCanvas);
        if (videoCanvas.view != null) {
            if (this.mVideoMirrorMode == 1) {
                videoCanvas.view.setMirror(true);
            }
            this.mVideoFrameDeliver.registerVideoFrameObserver(videoCanvas.uid, videoCanvas.view);
        }
    }

    public final int muteAllRemoteAudioStreams(boolean z) {
        StringBuilder sb = new StringBuilder("muteAllRemoteAudioStreams: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, muteAllRemoteAudioStreams failed.");
            return -1;
        }
        NativeFunctions.nativeMuteAllRemoteAudioStreams(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final int muteAllRemoteVideoStreams(boolean z) {
        StringBuilder sb = new StringBuilder("muteAllRemoteVideoStreams: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, muteAllRemoteVideoStreams failed.");
            return -1;
        }
        NativeFunctions.nativeMuteAllRemoteVideoStreams(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final int muteLocalAudioStream(boolean z) {
        StringBuilder sb = new StringBuilder("muteLocalAudioStream: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, muteLocalAudioStream failed.");
            return -1;
        }
        NativeFunctions.nativeMuteLocalAudioStream(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final int muteLocalVideoStream(boolean z) {
        StringBuilder sb = new StringBuilder("muteLocalVideoStream: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, muteLocalVideoStream failed.");
            return -1;
        }
        NativeFunctions.nativeMuteLocalVideoStream(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final boolean pushExternalVideoFrame(ExtVideoFrame extVideoFrame) {
        if (this.mVideoFrameConverter == null || !this.mUseExtVideoSource) {
            return false;
        }
        VideoFrame videoFrame = this.mVideoFrameConverter.getVideoFrame(extVideoFrame);
        if (videoFrame == null) {
            return false;
        }
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, pushExternalVideoFrame failed.");
            return false;
        }
        this.mVideoFrameConverter.post(new RtcEngineImpl$$Lambda$7(this, videoFrame));
        return true;
    }

    public final boolean pushScreenFrame(ExtVideoFrame extVideoFrame) {
        if (this.mVideoFrameConverter == null) {
            return false;
        }
        VideoFrame videoFrame = this.mVideoFrameConverter.getVideoFrame(extVideoFrame);
        if (videoFrame == null) {
            return false;
        }
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, pushScreenFrame failed.");
            return false;
        }
        boolean nativePushScreenFrame = NativeFunctions.nativePushScreenFrame(this.mNativeByteRtcEngine, videoFrame);
        videoFrame.release();
        return nativePushScreenFrame;
    }

    public final int setChannelProfile(int i) {
        StringBuilder sb = new StringBuilder("setChannelProfile. profile : ");
        sb.append(i);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setChannelProfile failed.");
            return -1;
        }
        NativeFunctions.nativeSetChannelProfile(this.mNativeByteRtcEngine, i);
        return 0;
    }

    public final int setClientRole(int i) {
        StringBuilder sb = new StringBuilder("setClientRole. role : ");
        sb.append(i);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setClientRole failed.");
            return -1;
        }
        NativeFunctions.nativeSetClientRole(this.mNativeByteRtcEngine, i);
        return 0;
    }

    public final int setDefaultAudioRouteToSpeakerPhone(boolean z) {
        StringBuilder sb = new StringBuilder("setDefaultAudioRouteToSpeakerPhone: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setDefaultAudioRouteToSpeakerPhone failed.");
            return -1;
        }
        this.mMonitorAudioRouting = true;
        checkAudioRouter();
        NativeFunctions.nativeSetDefaultAudioRouteToSpeakerPhone(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final int setDefaultMuteAllRemoteAudioStreams(boolean z) {
        StringBuilder sb = new StringBuilder("setDefaultMuteAllRemoteAudioStreams: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setDefaultMuteAllRemoteAudioStreams failed.");
            return -1;
        }
        NativeFunctions.nativeSetDefaultMuteAllRemoteAudioStreams(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final int setDefaultMuteAllRemoteVideoStreams(boolean z) {
        StringBuilder sb = new StringBuilder("setDefaultMuteAllRemoteVideoStreams: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setDefaultMuteAllRemoteVideoStreams failed.");
            return -1;
        }
        NativeFunctions.nativeSetDefaultMuteAllRemoteVideoStreams(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final int setEnableSpeakerphone(boolean z) {
        StringBuilder sb = new StringBuilder("setEnableSpeakerphone: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setEnableSpeakerphone failed.");
            return -1;
        }
        NativeFunctions.nativeSetEnableSpeakerphone(this.mNativeByteRtcEngine, z);
        return 0;
    }

    public final void setHeadsetConnectionStatus(boolean z) {
        StringBuilder sb = new StringBuilder("setHeadsetConnectionStatus: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setHeadsetConnectionStatus failed.");
        } else {
            NativeFunctions.nativeSetHeadsetConnectionStatus(this.mNativeByteRtcEngine, z);
        }
    }

    public final int setMediaServerAddr(String str) {
        StringBuilder sb = new StringBuilder("setMediaServerAddr: ");
        sb.append(str);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setMediaServerAddr failed.");
            return -1;
        }
        NativeFunctions.nativeSetMediaServerAddr(this.mNativeByteRtcEngine, str);
        return 0;
    }

    public final int setupLocalScreen(VideoCanvas videoCanvas) {
        if (videoCanvas == null || videoCanvas.uid == null || videoCanvas.uid.isEmpty()) {
            LogUtil.m145281i("RtcEngineImpl", "EventType: setupLocalScreen canvas is null");
            return -1;
        }
        StringBuilder sb = new StringBuilder("EventType: setupLocalScreen canvas:");
        sb.append(videoCanvas.hashCode());
        LogUtil.m145281i("RtcEngineImpl", sb.toString());
        mUiHandler.post(new RtcEngineImpl$$Lambda$9(this, videoCanvas));
        return 0;
    }

    public final void setupRemoteScreen(VideoCanvas videoCanvas) {
        if (videoCanvas == null) {
            LogUtil.m145281i("RtcEngineImpl", "EventType: setupRemoteScreen canvas is null");
            return;
        }
        StringBuilder sb = new StringBuilder("EventType: setupRemoteScreen canvas:");
        sb.append(videoCanvas.hashCode());
        LogUtil.m145281i("RtcEngineImpl", sb.toString());
        mUiHandler.post(new RtcEngineImpl$$Lambda$6(this, videoCanvas));
    }

    public final void unSubscribe(String str) {
        StringBuilder sb = new StringBuilder("unSubscribe: ");
        sb.append(str);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, unSubscribe failed.");
        } else {
            NativeFunctions.nativeUnSubscribe(this.mNativeByteRtcEngine, str);
        }
    }

    private int setupVideoViewOnMainThread(VideoCanvas videoCanvas) {
        if (!videoCanvas.isValid()) {
            return -1;
        }
        try {
            LogUtil.m145282w("RtcEngineImpl", "setup video view on main thread");
            LogUtil.m145278d("RtcEngineImpl", "setupVideoViewOnMainThread-createEglContext");
            videoCanvas.view.init(this.mRootEglBase.getEglBaseContext());
            if (videoCanvas.view instanceof VideoFrameRender) {
                LogUtil.m145278d("RtcEngineImpl", "setupVideoViewOnMainThread-createSurface");
                ((VideoFrameRender) videoCanvas.view).onStart();
            }
            switch (videoCanvas.renderMode) {
                case 1:
                    videoCanvas.view.setScalingType(ScalingType.SCALE_ASPECT_FILL);
                    break;
                case 2:
                    videoCanvas.view.setScalingType(ScalingType.SCALE_ASPECT_FIT);
                    break;
                case 3:
                    videoCanvas.view.setScalingType(ScalingType.SCALE_ASPECT_BALANCED);
                    break;
                default:
                    videoCanvas.view.setScalingType(ScalingType.SCALE_ASPECT_FIT);
                    break;
            }
            return 0;
        } catch (Exception e) {
            LogUtil.m145283w("RtcEngineImpl", "setup video view on main thread happen exception", e);
            return -1;
        }
    }

    public final void enableLiveTranscoding(LiveTranscoding liveTranscoding) {
        LogUtil.m145278d("RtcEngineImpl", "enableLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.m145278d("RtcEngineImpl", "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
        } else if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, enableLiveTranscoding failed.");
        } else {
            this.mEnableTranscode = true;
            this.mLiveTranscoding = liveTranscoding;
            this.mLiveTranscoding.setAction("started");
            String jSONObject = this.mLiveTranscoding.getTranscodeMessage().toString();
            StringBuilder sb = new StringBuilder("enableLiveTranscoding...liveTranscodeJson: ");
            sb.append(jSONObject);
            LogUtil.m145278d("RtcEngineImpl", sb.toString());
            NativeFunctions.nativeEnableLiveTranscoding(this.mNativeByteRtcEngine, jSONObject);
        }
    }

    public final void setVideoCompositingLayout(Layout layout) {
        LogUtil.m145278d("RtcEngineImpl", "setVideoCompositingLayout...");
        if (this.mLiveTranscoding == null) {
            LogUtil.m145278d("RtcEngineImpl", "setVideoCompositingLayout...mLiveTranscoding is null, no effect, please check.");
        } else if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setVideoCompositingLayout failed.");
        } else {
            this.mLiveTranscoding.setLayout(layout);
            this.mLiveTranscoding.setAction("layoutChanged");
            String jSONObject = this.mLiveTranscoding.getTranscodeMessage().toString();
            StringBuilder sb = new StringBuilder("setVideoCompositingLayout...liveTranscodeJson: ");
            sb.append(jSONObject);
            LogUtil.m145278d("RtcEngineImpl", sb.toString());
            NativeFunctions.nativeSetVideoCompositingLayout(this.mNativeByteRtcEngine, jSONObject);
        }
    }

    public final boolean pushAudioMixingStreamData(byte[] bArr, int i) {
        return NativeFunctions.nativePushAudioMixingStreamData(this.mNativeByteRtcEngine, bArr, i);
    }

    public final int setupLocalScreenRender(IVideoSink iVideoSink, String str) {
        return setLocalRenderInternal(iVideoSink, str, true, false);
    }

    public final int setupLocalVideoRender(IVideoSink iVideoSink, String str) {
        return setLocalRenderInternal(iVideoSink, str, false, false);
    }

    public final int setupRemoteScreenRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRenderInternal(iVideoSink, str, true, false);
    }

    public final int setupRemoteVideoRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRenderInternal(iVideoSink, str, false, false);
    }

    public static void sendFeedback(Context context, FeedbackOptions feedbackOptions) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        NativeFunctions.nativeSendFeedback(context, feedbackOptions);
    }

    public static void setDnsResults(String str, String str2) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        NativeFunctions.nativeSetDnsResults(str, str2);
    }

    public final int preloadEffect(int i, String str) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativePreloadEffect(this.mNativeByteRtcEngine, i, str);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, preloadEffect failed.");
        return -1;
    }

    public final boolean pullExternalAudioFrame(byte[] bArr, int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativePullExternalAudioFrame(this.mNativeByteRtcEngine, bArr, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, pullExternalAudioFrame failed.");
        return false;
    }

    public final boolean pushExternalAudioFrame(byte[] bArr, int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativePushExternalAudioFrame(this.mNativeByteRtcEngine, bArr, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, pushExternalAudioFrame failed.");
        return false;
    }

    public final long sendMessage(String str, String str2) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeSendMessage(this.mNativeByteRtcEngine, str, str2);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, sendMessage failed.");
        return -1;
    }

    public final int setVolumeOfEffect(int i, int i2) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeSetVolumeOfEffect(this.mNativeByteRtcEngine, i, i2);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setVolumeOfEffect failed.");
        return -1;
    }

    public static void setApiServerHost(String[] strArr, String str) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        if (strArr.length > 1) {
            LogUtil.m145278d("RtcEngineImpl", "Native sdk only support only on now, Need to change later.");
        }
        NativeFunctions.nativeSetApiServerHost(strArr[0]);
        NativeFunctions.nativeSetSignalingHost(str);
    }

    public final int enableAudioVolumeIndication(int i, int i2) {
        StringBuilder sb = new StringBuilder("enableAudioVolumeIndication interval: ");
        sb.append(i);
        sb.append(" ,smooth: ");
        sb.append(i2);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, enableAudioVolumeIndication failed.");
            return -1;
        }
        NativeFunctions.nativeEnableAudioVolumeIndication(this.mNativeByteRtcEngine, i, i2);
        return 0;
    }

    public final int muteRemoteAudioStream(String str, boolean z) {
        StringBuilder sb = new StringBuilder("muteRemoteAudioStream, uid: ");
        sb.append(str);
        sb.append(" , muted: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, muteRemoteAudioStream failed.");
            return -1;
        }
        NativeFunctions.nativeMuteRemoteAudioStream(this.mNativeByteRtcEngine, str, z);
        return 0;
    }

    public final int muteRemoteVideoStream(String str, boolean z) {
        StringBuilder sb = new StringBuilder("muteRemoteVideoStream, uid: ");
        sb.append(str);
        sb.append(" , muted: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, muteRemoteVideoStream failed.");
            return -1;
        }
        NativeFunctions.nativeMuteRemoteVideoStream(this.mNativeByteRtcEngine, str, z);
        return 0;
    }

    public final int setVideoProfile(int i, boolean z) {
        StringBuilder sb = new StringBuilder("muteLocalVideoStream: profile: ");
        sb.append(i);
        sb.append(" swapWidthAndHeight: ");
        sb.append(z);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setVideoProfile failed.");
            return -1;
        }
        NativeFunctions.nativeSetVideoProfile(this.mNativeByteRtcEngine, i, z);
        return 0;
    }

    public final void subscribeStream(String str, SubscribeConfig subscribeConfig) {
        StringBuilder sb = new StringBuilder("subscribeStream: ");
        sb.append(str);
        sb.append(", info:");
        sb.append(subscribeConfig.toString());
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (subscribeConfig != null) {
            if (this.mNativeByteRtcEngine == -1) {
                LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
            } else {
                NativeFunctions.nativeSubscribeStream(this.mNativeByteRtcEngine, str, subscribeConfig.subVideo, subscribeConfig.subAudio, subscribeConfig.videoIndex);
            }
        }
    }

    public final boolean pushExternalVideoFrame(ExtVideoFrame extVideoFrame, boolean z) {
        VideoFrame videoFrame;
        if (this.mVideoFrameConverter == null || !this.mUseExtVideoSource) {
            return false;
        }
        if (z) {
            videoFrame = this.mVideoFrameConverter.converterExtFrametoVideoFrame(extVideoFrame);
        } else {
            videoFrame = this.mVideoFrameConverter.getVideoFrame(extVideoFrame);
        }
        if (videoFrame == null) {
            return false;
        }
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, pushExternalVideoFrame failed.");
            return false;
        }
        if (z) {
            NativeFunctions.nativePushExternalVideoFrame(this.mNativeByteRtcEngine, videoFrame);
            videoFrame.release();
        } else {
            this.mVideoFrameConverter.post(new RtcEngineImpl$$Lambda$8(this, videoFrame));
        }
        return true;
    }

    public final int setVideoResolutions(VideoStreamDescription[] videoStreamDescriptionArr, ORIENTATION_MODE orientation_mode) {
        if (videoStreamDescriptionArr == null) {
            videoStreamDescriptionArr = new VideoStreamDescription[0];
        }
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setVideoResolutions failed.");
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoStreamDescription videoStreamDescription : videoStreamDescriptionArr) {
            if (!videoStreamDescription.isValid()) {
                LogUtil.m145279e("RtcEngineImpl", "setVideoResolutions with illegal params");
                return -2;
            }
            arrayList.add(new InternalVideoStreamDescription(videoStreamDescription));
        }
        ByteRtcData.instance().setOrientationMode(orientation_mode);
        NativeFunctions.nativeSetVideoResolutions(this.mNativeByteRtcEngine, arrayList);
        return 0;
    }

    public final void setAudioPlayoutMixStream(boolean z, int i, int i2) {
        NativeFunctions.nativeSetAudioPlayoutMixStream(this.mNativeByteRtcEngine, z, i, i2);
    }

    public static int rate(String str, int i, String str2) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        return 0;
    }

    public final int setupLocalVideoRender(IVideoSink iVideoSink, String str, boolean z) {
        return setLocalRenderInternal(iVideoSink, str, false, z);
    }

    public final int setupRemoteVideoRender(IVideoSink iVideoSink, String str, boolean z) {
        return setupRemoteVideoRenderInternal(iVideoSink, str, false, z);
    }

    public final void setExternalVideoSource(boolean z, boolean z2, boolean z3) {
        this.mUseExtVideoSource = z;
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setExternalVideoSource failed.");
        } else {
            NativeFunctions.nativeSetExternalVideoSource(this.mNativeByteRtcEngine, z);
        }
    }

    static final /* synthetic */ void lambda$new$0$RtcEngineImpl(RtcLogLevel rtcLogLevel, String str, Throwable th) {
        IRtcEngineEventHandler rtcEngineHandler = getRtcEngineHandler();
        if (rtcEngineHandler != null) {
            try {
                rtcEngineHandler.onLoggerMessage(rtcLogLevel, str, th);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Exception in App thread when handler onLoggerMessage , e : ");
                sb.append(e.getMessage());
                LogUtil.m145279e("RtcEngineImpl", sb.toString());
            }
        }
    }

    private void setupRemoteVideoInternal(IFrameRender iFrameRender, String str, boolean z) {
        StringBuilder sb = new StringBuilder("setupRemoteVideoInternal user is:");
        sb.append(str);
        sb.append("isScreen is:");
        sb.append(z);
        LogUtil.m145281i("RtcEngineImpl", sb.toString());
        if (iFrameRender instanceof IVideoSink) {
            IVideoSink iVideoSink = (IVideoSink) iFrameRender;
            iVideoSink.onInitialize();
            iVideoSink.onStart();
        }
        if (z) {
            if (iFrameRender != null) {
                this.mVideoFrameDeliver.registerScreenFrameObserver(str, iFrameRender);
            }
        } else if (iFrameRender != null) {
            this.mVideoFrameDeliver.registerVideoFrameObserver(str, iFrameRender);
        }
    }

    public final void setExternalVideoSource(boolean z, boolean z2, boolean z3, boolean z4) {
        setExternalVideoSource(z, z2, z3);
    }

    public final int joinChannel(String str, String str2, PublisherConfiguration publisherConfiguration, String str3) {
        return joinChannel(str, str2, publisherConfiguration, str3, "");
    }

    public final int startAudioMixing(String str, boolean z, boolean z2, int i) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativeStartAudioMixing(this.mNativeByteRtcEngine, str, z, z2, i);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, startAudioMixing failed.");
        return -1;
    }

    private int setLocalRenderInternal(IVideoSink iVideoSink, String str, boolean z, boolean z2) {
        if (iVideoSink == null) {
            LogUtil.m145281i("RtcEngineImpl", "EventType: setLocalRenderInternal videoSink is null");
            return -1;
        }
        StringBuilder sb = new StringBuilder("EventType: setLocalRenderInternal videoSink:");
        sb.append(iVideoSink.hashCode());
        sb.append(" ThreadPool  workthreadID");
        sb.append(Thread.currentThread().getId());
        LogUtil.m145281i("RtcEngineImpl", sb.toString());
        VideoSinkAdapter videoSinkAdapter = new VideoSinkAdapter(iVideoSink, str, false, z2);
        this.mVideoSinkManager.add(videoSinkAdapter.getUid(), videoSinkAdapter.isScreen(), videoSinkAdapter);
        this.mVideoFrameDeliver.registerVideoFrameObserver(str, videoSinkAdapter);
        videoSinkAdapter.onInitialize();
        videoSinkAdapter.onStart();
        return 0;
    }

    private int setupRemoteVideoRenderInternal(IVideoSink iVideoSink, String str, boolean z, boolean z2) {
        if (iVideoSink == null) {
            LogUtil.m145281i("RtcEngineImpl", "EventType: setupRemoteRenderInternal videoSink is null");
            return -1;
        }
        StringBuilder sb = new StringBuilder("EventType: setupRemoteRenderInternal canvas:");
        sb.append(iVideoSink.hashCode());
        LogUtil.m145281i("RtcEngineImpl", sb.toString());
        VideoSinkAdapter videoSinkAdapter = new VideoSinkAdapter(iVideoSink, str, z, z2);
        this.mVideoSinkManager.add(videoSinkAdapter.getUid(), videoSinkAdapter.isScreen(), videoSinkAdapter);
        setupRemoteVideoInternal(videoSinkAdapter, videoSinkAdapter.getUid(), videoSinkAdapter.isScreen());
        return 0;
    }

    public final boolean setExternalAudioDevice(boolean z, int i, int i2, int i3) {
        if (i != 8000 && i != 16000 && i != 32000 && i != 44100 && i != 48000) {
            StringBuilder sb = new StringBuilder("sample rate should in [8000 / 16000 / 32000 / 44100 / 48000], but it is setted to be:  ");
            sb.append(i);
            LogUtil.m145281i("RtcEngineImpl", sb.toString());
            return false;
        } else if (i2 != 1 && i2 != 2) {
            StringBuilder sb2 = new StringBuilder("record channel num should be in [ 1 / 2 ], but it is setted to be:  ");
            sb2.append(i2);
            LogUtil.m145281i("RtcEngineImpl", sb2.toString());
            return false;
        } else if (i3 != 1 && i3 != 2) {
            StringBuilder sb3 = new StringBuilder("playout channel num should be in [ 1 / 2 ], but it is setted to be:  ");
            sb3.append(i3);
            LogUtil.m145281i("RtcEngineImpl", sb3.toString());
            return false;
        } else if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setExternalAudioDevice failed.");
            return false;
        } else {
            NativeFunctions.nativeSetExternalAudioDevice(this.mNativeByteRtcEngine, z, i, i2, i3);
            NativeFunctions.nativeSetAudioDeviceObserver(this.mNativeByteRtcEngine, this.mEngineAudioDeviceEventHandler);
            return true;
        }
    }

    public final int setVideoResolution(int i, int i2, int i3, int i4) {
        LogUtil.m145278d("RtcEngineImpl", C1642a.m8034a("setVideoResolution, width: %d, height: %d, frameRate: %d, bitrate: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, setVideoResolution failed.");
            return -1;
        }
        NativeFunctions.nativeSetVideoResolution(this.mNativeByteRtcEngine, i, i2, i3, i4);
        return 0;
    }

    public C46266RtcEngineImpl(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, Object obj) {
        StringBuilder sb = new StringBuilder("create RtcEngineImpl with appId: ");
        sb.append(str);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        mInstance = this;
        this.mEglThread = new HandlerThread("rtc_egl_thread");
        this.mEglThread.start();
        this.mEglHandler = new Handler(this.mEglThread.getLooper());
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, (Runnable) new RtcEngineImpl$$Lambda$1(this, obj));
        this.mContext = context.getApplicationContext();
        RtcContextUtils.initialize(this.mContext);
        this.mAppId = str;
        this.mState = State.IDLE;
        mUiHandler = new Handler(Looper.getMainLooper());
        this.mRtcEngineHandler = new WeakReference<>(iRtcEngineEventHandler);
        LogUtil.setLoggerSink(this.mLoggerSink);
        this.mEngineEventHandler = new ByteRtcEngineEventHandler(this);
        this.mVideoFrameConverter = new VideoFrameConverter();
        this.mEngineAudioDeviceEventHandler = new EngineAudioDeviceEventHandler();
        this.mVideoFrameDeliver = VideoFrameDeliver.instance();
        this.mByteRtcVideoFrameObserver = new ByteRtcVideoFrameObserver();
        this.mNativeByteRtcEngine = NativeFunctions.nativeCreateByteRtcEngine(this.mContext.getApplicationContext(), str, this.mEngineEventHandler, this.mRootEglBase.getEglBaseContext());
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "create native engine error, native engine is invalid.");
        } else {
            NativeFunctions.nativeRegisterVideoFrameObserver(this.mNativeByteRtcEngine, this.mByteRtcVideoFrameObserver);
        }
    }

    public final int playEffect(int i, String str, boolean z, int i2, int i3) {
        if (this.mNativeByteRtcEngine != -1) {
            return NativeFunctions.nativePlayEffect(this.mNativeByteRtcEngine, i, str, z, i2, i3);
        }
        LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, playEffect failed.");
        return -1;
    }

    public final int joinChannel(String str, String str2, PublisherConfiguration publisherConfiguration, String str3, String str4) {
        StringBuilder sb = new StringBuilder("joinChannel with token: ");
        sb.append(str);
        sb.append(" , channel: ");
        sb.append(str2);
        sb.append(" and uid: ");
        sb.append(str3);
        sb.append(" and trace_id: ");
        sb.append(str4);
        LogUtil.m145278d("RtcEngineImpl", sb.toString());
        if (this.mState != State.IDLE) {
            return -1;
        }
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m145279e("RtcEngineImpl", "native engine is invalid, joinChannel failed.");
            return -1;
        }
        this.mState = State.IN_ROOM;
        this.mRoom = str2;
        this.mUser = str3;
        if (AudioUtils.isInOpenSLESBlackModelSet()) {
            StringBuilder sb2 = new StringBuilder("Current device is in opensles blacklist, will disable opensles when low latency is supported. device module is: ");
            sb2.append(Build.MODEL);
            LogUtil.m145282w("RtcEngineImpl", sb2.toString());
            WebRtcAudioManager.setBlacklistDeviceForOpenSLESUsage(true);
        } else {
            StringBuilder sb3 = new StringBuilder("Current device is not in opensles blacklist, will enable opensles when low latency is supported. device module is: ");
            sb3.append(Build.MODEL);
            LogUtil.m145282w("RtcEngineImpl", sb3.toString());
        }
        System.currentTimeMillis();
        NativeFunctions.nativeJoinChannel(this.mNativeByteRtcEngine, str, str2, str3, "", str4);
        checkAudioRouter();
        return 0;
    }
}

package com.p280ss.video.rtc.engine;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView.SurfaceTextureListener;
import com.p280ss.video.rtc.base.feedback.FeedbackOptions;
import com.p280ss.video.rtc.engine.RtcEngineImpl.C46266RtcEngineImpl;
import com.p280ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel;
import com.p280ss.video.rtc.engine.live.LiveTranscoding;
import com.p280ss.video.rtc.engine.live.LiveTranscoding.Layout;
import com.p280ss.video.rtc.engine.loader.RtcNativeLibraryLoader;
import com.p280ss.video.rtc.engine.loader.RtcNativeLibraryLoaderImpl;
import com.p280ss.video.rtc.engine.mediaio.IVideoSink;
import com.p280ss.video.rtc.engine.p1833ui.RenderView;
import com.p280ss.video.rtc.engine.utils.ExtVideoFrame;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.video.VideoEncoderConfiguration.ORIENTATION_MODE;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.video.rtc.engine.RtcEngine */
public abstract class RtcEngine {
    private static C46266RtcEngineImpl mInstance;
    public static RtcNativeLibraryLoader mRtcNativeLibraryLoader = new RtcNativeLibraryLoaderImpl();

    /* renamed from: com.ss.video.rtc.engine.RtcEngine$RtcRenderViewType */
    public enum RtcRenderViewType {
        RTC_SURFACEVIEW,
        RTC_TEXTUREVIEW
    }

    public static RtcNativeLibraryLoader getRtcNativeLibraryLoader() {
        return mRtcNativeLibraryLoader;
    }

    public static void releaseRenderView(SurfaceView surfaceView) {
    }

    public static void releaseRenderView(RenderView renderView) {
    }

    public abstract int addPublishStreamUrl(String str, boolean z);

    public abstract int adjustAudioMixingPlayoutVolume(int i);

    public abstract int adjustAudioMixingPublishVolume(int i);

    public abstract int adjustAudioMixingVolume(int i);

    public abstract int adjustPlaybackSignalVolume(int i);

    public abstract int adjustRecordingSignalVolume(int i);

    public abstract int channelInviteDTMF(String str, String str2);

    public abstract int channelInviteEnd(String str, String str2);

    public abstract int clearVideoWatermarks();

    public abstract int complain(String str, String str2);

    public abstract int createDataStream(boolean z, boolean z2);

    public abstract int createTexture(int i, int i2, SurfaceTextureListener surfaceTextureListener);

    public abstract void destroyTexture();

    public abstract int disableAudio();

    public abstract int disableLastmileTest();

    public abstract void disableLiveTranscoding();

    public abstract int disableVideo();

    public abstract int enableAudio();

    public abstract int enableAudioQualityIndication(boolean z);

    public abstract int enableAudioVolumeIndication(int i, int i2);

    public abstract void enableAutoSubscribe(boolean z);

    public abstract int enableDualStreamMode(boolean z);

    public abstract boolean enableHighPerfWifiMode(boolean z);

    public abstract int enableInEarMonitoring(boolean z);

    public abstract int enableLastmileTest();

    public abstract void enableLiveTranscoding(LiveTranscoding liveTranscoding);

    public abstract int enableLocalAudio(boolean z);

    public abstract int enableLocalVideo(boolean z);

    public abstract void enableLogStatisticReport(boolean z);

    public abstract void enableSubscribeLocalStream(boolean z);

    public abstract int enableVideo();

    public abstract int enableWebSdkInteroperability(boolean z);

    public abstract int getAudioMixingCurrentPosition();

    public abstract int getAudioMixingDuration();

    public abstract int getAudioMixingStreamCachedFrameNum();

    public abstract String getCallId();

    public abstract float getCameraMaxZoomFactor();

    public abstract int getEffectVolume(int i);

    public abstract long getNativeHandle();

    public abstract String getParameter(String str, String str2);

    public abstract SurfaceTexture getSurfaceTexture();

    public abstract boolean isCameraAutoFocusFaceModeSupported();

    public abstract boolean isCameraFocusSupported();

    public abstract boolean isCameraTorchSupported();

    public abstract boolean isCameraZoomSupported();

    public abstract boolean isInEarMonitoring();

    public abstract boolean isSpeakerphoneEnabled();

    public abstract boolean isTextureEncodeSupported();

    public abstract int joinChannel(String str, String str2, PublisherConfiguration publisherConfiguration, String str3);

    public abstract int joinChannel(String str, String str2, PublisherConfiguration publisherConfiguration, String str3, String str4);

    public abstract int leaveChannel();

    public abstract void monitorConnectionEvent(boolean z);

    public abstract int muteAllRemoteAudioStreams(boolean z);

    public abstract int muteAllRemoteVideoStreams(boolean z);

    public abstract int muteLocalAudioStream(boolean z);

    public abstract int muteLocalVideoStream(boolean z);

    public abstract int muteRemoteAudioStream(String str, boolean z);

    public abstract int muteRemoteVideoStream(String str, boolean z);

    public abstract int pauseAllEffects();

    public abstract int pauseAudio();

    public abstract int pauseAudioMixing();

    public abstract int pauseEffect(int i);

    public abstract int playEffect(int i, String str, boolean z, int i2, int i3);

    public abstract int preloadEffect(int i, String str);

    public abstract int publishScreen();

    public abstract boolean pullExternalAudioFrame(byte[] bArr, int i);

    public abstract boolean pushAudioMixingStreamData(byte[] bArr, int i);

    public abstract int pushExternalAudioFrame(byte[] bArr, long j);

    public abstract boolean pushExternalAudioFrame(byte[] bArr, int i);

    public abstract boolean pushExternalVideoFrame(ExtVideoFrame extVideoFrame);

    public abstract boolean pushExternalVideoFrame(ExtVideoFrame extVideoFrame, boolean z);

    public abstract boolean pushScreenFrame(ExtVideoFrame extVideoFrame);

    public abstract int refreshRecordingServiceStatus();

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract int removePublishStreamUrl(String str);

    public abstract int renewToken(String str);

    public abstract int resumeAllEffects();

    public abstract int resumeAudio();

    public abstract int resumeAudioMixing();

    public abstract int resumeEffect(int i);

    public abstract void sendCustomMessage(String str);

    public abstract long sendMessage(String str, String str2);

    public abstract int sendStreamMessage(int i, byte[] bArr);

    public abstract boolean setAudioDeviceEventHandler(IRtcEngineAudioDeviceEventHandler iRtcEngineAudioDeviceEventHandler);

    public abstract int setAudioMixingPosition(int i);

    public abstract void setAudioPlayoutMixStream(boolean z, int i, int i2);

    public abstract int setAudioProfile(int i, int i2);

    public abstract int setCameraAutoFocusFaceModeEnabled(boolean z);

    public abstract int setCameraFocusPositionInPreview(float f, float f2);

    public abstract int setCameraTorchOn(boolean z);

    public abstract int setCameraZoomFactor(float f);

    public abstract int setChannelProfile(int i);

    public abstract int setClientRole(int i);

    public abstract int setDefaultAudioRouteToSpeakerPhone(boolean z);

    public abstract int setDefaultMuteAllRemoteAudioStreams(boolean z);

    public abstract int setDefaultMuteAllRemoteVideoStreams(boolean z);

    public abstract int setEffectsVolume(int i);

    public abstract int setEnableSpeakerphone(boolean z);

    public abstract int setEncryptionMode(String str);

    public abstract int setEncryptionSecret(String str);

    public abstract boolean setExternalAudioDevice(boolean z, int i, int i2, int i3);

    public abstract int setExternalAudioSource(boolean z, int i, int i2);

    public abstract void setExternalVideoSource(boolean z, boolean z2, boolean z3);

    public abstract void setExternalVideoSource(boolean z, boolean z2, boolean z3, boolean z4);

    public abstract void setHeadsetConnectionStatus(boolean z);

    public abstract int setInEarMonitoringVolume(int i);

    public abstract int setLocalRenderMode(int i);

    public abstract int setLocalVideoMirrorMode(int i);

    public abstract int setLocalVoiceEqualization(int i, int i2);

    public abstract int setLocalVoicePitch(double d);

    public abstract int setLocalVoiceReverb(int i, int i2);

    public abstract int setLogFile(String str);

    public abstract int setLogFileDir(String str);

    public abstract void setLogFilter(RtcLogLevel rtcLogLevel);

    public abstract int setMediaServerAddr(String str);

    public abstract int setMixedAudioFrameParameters(int i, int i2);

    public abstract void setOnDestroyCompletedCallback(Runnable runnable);

    public abstract int setParameters(String str);

    public abstract int setPlaybackAudioFrameParameters(int i, int i2, int i3, int i4);

    public abstract int setRecordingAudioFrameParameters(int i, int i2, int i3, int i4);

    public abstract int setRemoteDefaultVideoStreamType(int i);

    public abstract int setRemoteRenderMode(String str, int i);

    public abstract int setRemoteVideoStreamType(int i, int i2);

    public abstract int setSendScreenMaxKbps(int i);

    public abstract int setSignalServerAddr(String str);

    public abstract int setSpeakerphoneVolume(int i);

    public abstract int setUserAgentIp(String str);

    public abstract void setVideoCompositingLayout(Layout layout);

    public abstract int setVideoMaxKbps(int i);

    public abstract int setVideoProfile(int i, boolean z);

    public abstract int setVideoQualityParameters(boolean z);

    public abstract int setVideoResolution(int i, int i2, int i3, int i4);

    public abstract int setVideoResolutions(VideoStreamDescription[] videoStreamDescriptionArr);

    public abstract int setVideoResolutions(VideoStreamDescription[] videoStreamDescriptionArr, ORIENTATION_MODE orientation_mode);

    public abstract int setVolumeOfEffect(int i, int i2);

    public abstract int setupLocalScreen(VideoCanvas videoCanvas);

    public abstract int setupLocalScreenRender(IVideoSink iVideoSink, String str);

    public abstract int setupLocalVideo(VideoCanvas videoCanvas);

    public abstract int setupLocalVideoRender(IVideoSink iVideoSink, String str);

    public abstract int setupLocalVideoRender(IVideoSink iVideoSink, String str, boolean z);

    public abstract void setupRemoteScreen(VideoCanvas videoCanvas);

    public abstract int setupRemoteScreenRender(IVideoSink iVideoSink, String str);

    public abstract int setupRemoteVideo(VideoCanvas videoCanvas);

    public abstract int setupRemoteVideoRender(IVideoSink iVideoSink, String str);

    public abstract int setupRemoteVideoRender(IVideoSink iVideoSink, String str, boolean z);

    public abstract int startAudioMixing(String str, boolean z, boolean z2, int i);

    public abstract int startAudioRecording(String str, int i);

    public abstract int startEchoTest();

    public abstract int startPlayingStream(String str);

    public abstract int startPreview();

    public abstract int startRecordingService(String str);

    public abstract int stopAllEffects();

    public abstract int stopAudioMixing();

    public abstract int stopAudioRecording();

    public abstract int stopEchoTest();

    public abstract int stopEffect(int i);

    public abstract int stopPlayingStream();

    public abstract int stopPreview();

    public abstract int stopRecordingService(String str);

    public abstract void subscribeStream(String str, SubscribeConfig subscribeConfig);

    public abstract int switchCamera();

    public abstract void switchView(int i, int i2);

    public abstract void unSubscribe(String str);

    public abstract int unloadAllEffects();

    public abstract int unloadEffect(int i);

    public abstract int unpublishScreen();

    public abstract void uploadLogFile(String str);

    public abstract int useExternalAudioDevice();

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, String[] strArr, EGLContext eGLContext) {
        RtcEngine create;
        synchronized (RtcEngine.class) {
            if (strArr != null) {
                try {
                    setApiServerHost(strArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            create = create(context, str, iRtcEngineEventHandler, false, eGLContext);
        }
        return create;
    }

    public static String getSdkVersion() {
        return C46266RtcEngineImpl.getSDKVersion();
    }

    public static long getNativeEngineHandler() {
        if (mInstance != null) {
            return mInstance.getNativeHandle();
        }
        return -1;
    }

    public static synchronized void destroy() {
        synchronized (RtcEngine.class) {
            if (mInstance != null) {
                mInstance.doDestroy();
                mInstance = null;
                System.gc();
            }
        }
    }

    public static void setApiServerHost(String[] strArr) {
        C46266RtcEngineImpl.setApiServerHost(strArr);
    }

    public static void setEnableLog(boolean z) {
        LogUtil.setDebug(z);
    }

    public static void setLoggerMessageLevel(RtcLogLevel rtcLogLevel) {
        LogUtil.setLogLevel(rtcLogLevel);
    }

    public static void setSignalingServer(String str) {
        C46266RtcEngineImpl.setSignalingServer(str);
    }

    public static void useDefaultSignalingServer(boolean z) {
        C46266RtcEngineImpl.useDefaultSignalingServer(z);
    }

    public static FeedbackOptions getFeedbackContent(Context context) {
        return C46266RtcEngineImpl.getFeedbackContent(context);
    }

    public static int setDeviceId(String str) {
        return C46266RtcEngineImpl.setDeviceId(str);
    }

    public static void setRtcEngineEventHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (mInstance != null) {
            C46266RtcEngineImpl.setRtcEngineEventHandler(iRtcEngineEventHandler);
        }
    }

    public static void setRtcNativeLibraryLoader(RtcNativeLibraryLoader rtcNativeLibraryLoader) {
        StringBuilder sb = new StringBuilder("set rtc native library loader");
        sb.append(rtcNativeLibraryLoader);
        LogUtil.m145281i("RtcEngine", sb.toString());
        mRtcNativeLibraryLoader = rtcNativeLibraryLoader;
    }

    public static void setDnsResults(Map<String, List<String>> map) {
        if (map.size() > 0) {
            String str = "";
            List list = null;
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                str = (String) entry.getKey();
                list = (List) entry.getValue();
            }
            String str2 = "";
            if (list != null && list.size() > 0) {
                str2 = (String) list.get(0);
            }
            C46266RtcEngineImpl.setDnsResults(str, str2);
        }
    }

    public static void sendFeedback(Context context, FeedbackOptions feedbackOptions) {
        C46266RtcEngineImpl.sendFeedback(context, feedbackOptions);
    }

    public static void setApiServerHost(String[] strArr, String str) {
        C46266RtcEngineImpl.setApiServerHost(strArr, str);
    }

    public static int rate(String str, int i, String str2) {
        return C46266RtcEngineImpl.rate(str, i, str2);
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngine create;
        synchronized (RtcEngine.class) {
            create = create(context, str, iRtcEngineEventHandler, false);
        }
        return create;
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, android.opengl.EGLContext eGLContext) {
        RtcEngine create;
        synchronized (RtcEngine.class) {
            create = create(context, str, iRtcEngineEventHandler, false, eGLContext);
        }
        return create;
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, EGLContext eGLContext) {
        RtcEngine create;
        synchronized (RtcEngine.class) {
            create = create(context, str, iRtcEngineEventHandler, false, eGLContext);
        }
        return create;
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, boolean z) {
        synchronized (RtcEngine.class) {
            if (context == null) {
                return null;
            }
            if (mInstance == null) {
                mInstance = new C46266RtcEngineImpl(context, str, iRtcEngineEventHandler, null);
            }
            C46266RtcEngineImpl rtcEngineImpl = mInstance;
            return rtcEngineImpl;
        }
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, String[] strArr) {
        RtcEngine create;
        synchronized (RtcEngine.class) {
            if (strArr != null) {
                try {
                    setApiServerHost(strArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            create = create(context, str, iRtcEngineEventHandler, false);
        }
        return create;
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, boolean z, android.opengl.EGLContext eGLContext) {
        synchronized (RtcEngine.class) {
            if (context == null) {
                return null;
            }
            if (mInstance == null) {
                mInstance = new C46266RtcEngineImpl(context, str, iRtcEngineEventHandler, eGLContext);
            }
            C46266RtcEngineImpl rtcEngineImpl = mInstance;
            return rtcEngineImpl;
        }
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, boolean z, EGLContext eGLContext) {
        synchronized (RtcEngine.class) {
            if (context == null) {
                return null;
            }
            if (mInstance == null) {
                mInstance = new C46266RtcEngineImpl(context, str, iRtcEngineEventHandler, eGLContext);
            }
            C46266RtcEngineImpl rtcEngineImpl = mInstance;
            return rtcEngineImpl;
        }
    }

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, String[] strArr, android.opengl.EGLContext eGLContext) {
        RtcEngine create;
        synchronized (RtcEngine.class) {
            if (strArr != null) {
                try {
                    setApiServerHost(strArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            create = create(context, str, iRtcEngineEventHandler, false, eGLContext);
        }
        return create;
    }
}

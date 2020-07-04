package com.zego.zegoliveroom;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.C1642a;
import com.zego.zegoavkit2.ZegoStreamExtraPlayInfo;
import com.zego.zegoavkit2.entities.ZegoStreamRelayCDNInfo;
import com.zego.zegoavkit2.mixstream.ZegoCompleteMixStreamInfo;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamInfo;
import com.zego.zegoavkit2.mixstream.ZegoStreamMixer;
import com.zego.zegoavkit2.utils.ZegoLogUtil;
import com.zego.zegoliveroom.callback.IZegoAVEngineCallback;
import com.zego.zegoliveroom.callback.IZegoAudioPrepCallback;
import com.zego.zegoliveroom.callback.IZegoAudioPrepCallback2;
import com.zego.zegoliveroom.callback.IZegoAudioRecordCallback;
import com.zego.zegoliveroom.callback.IZegoAudioRecordCallback2;
import com.zego.zegoliveroom.callback.IZegoCustomCommandCallback;
import com.zego.zegoliveroom.callback.IZegoDeviceEventCallback;
import com.zego.zegoliveroom.callback.IZegoEndJoinLiveCallback;
import com.zego.zegoliveroom.callback.IZegoExternalRenderCallback;
import com.zego.zegoliveroom.callback.IZegoInitSDKCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import com.zego.zegoliveroom.callback.IZegoLivePlayerCallback;
import com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2;
import com.zego.zegoliveroom.callback.IZegoLivePublisherCallback;
import com.zego.zegoliveroom.callback.IZegoLivePublisherCallback2;
import com.zego.zegoliveroom.callback.IZegoLivePublisherExCallback;
import com.zego.zegoliveroom.callback.IZegoLogInfoCallback;
import com.zego.zegoliveroom.callback.IZegoLoginCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoMediaSideCallback;
import com.zego.zegoliveroom.callback.IZegoResponseCallback;
import com.zego.zegoliveroom.callback.IZegoRoomCallback;
import com.zego.zegoliveroom.callback.IZegoSnapshotCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoSnapshotCompletionCallback2;
import com.zego.zegoliveroom.callback.IZegoUpdatePublishTargetCallback;
import com.zego.zegoliveroom.callback.p1852im.IZegoBigRoomMessageCallback;
import com.zego.zegoliveroom.callback.p1852im.IZegoIMCallback;
import com.zego.zegoliveroom.callback.p1852im.IZegoRoomMessageCallback;
import com.zego.zegoliveroom.callback.reliablemessage.IZegoGetReliableMessageCallback;
import com.zego.zegoliveroom.callback.reliablemessage.IZegoReliableMessageCallback;
import com.zego.zegoliveroom.callback.reliablemessage.IZegoSendReliableMessageCallback;
import com.zego.zegoliveroom.constants.ZegoAvConfig;
import com.zego.zegoliveroom.entity.AuxData;
import com.zego.zegoliveroom.entity.ZegoAudioFrame;
import com.zego.zegoliveroom.entity.ZegoAudioRecordConfig;
import com.zego.zegoliveroom.entity.ZegoBigRoomMessage;
import com.zego.zegoliveroom.entity.ZegoExtPrepSet;
import com.zego.zegoliveroom.entity.ZegoPlayStreamQuality;
import com.zego.zegoliveroom.entity.ZegoPublishStreamQuality;
import com.zego.zegoliveroom.entity.ZegoReliableMessage;
import com.zego.zegoliveroom.entity.ZegoReliableMessageInfo;
import com.zego.zegoliveroom.entity.ZegoRoomMessage;
import com.zego.zegoliveroom.entity.ZegoStreamInfo;
import com.zego.zegoliveroom.entity.ZegoUser;
import com.zego.zegoliveroom.entity.ZegoUserState;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class ZegoLiveRoom implements IJniZegoIMCallback, IJniZegoLiveRoomCallback {
    static SDKContext mContext;
    private static String sLogPath;
    private volatile IZegoResponseCallback mInviteJoinLiveResponseCallback;
    private volatile IZegoResponseCallback mJoinLiveResponseCallback;
    private Map<Integer, IZegoCustomCommandCallback> mMapCustomCommandCallback = new HashMap();
    private Map<Integer, IZegoEndJoinLiveCallback> mMapEndJoinLiveResponseCallback = new HashMap();
    private Map<Integer, IZegoGetReliableMessageCallback> mMapGetReliableMessageCallback = new HashMap();
    private Map<Object, Object> mMapIMCallback = new HashMap();
    private Map<Integer, IZegoSendReliableMessageCallback> mMapSendReliableMessageCallback = new HashMap();
    private Map<String, IZegoSnapshotCompletionCallback> mMapStreamSnapshotCompletionCallback = new HashMap();
    private Map<Integer, IZegoUpdatePublishTargetCallback> mMapUpdatePublishTargetCallback = new HashMap();
    private Map<String, IZegoLoginCompletionCallback> mMapZegoLoginCompletionCallback = new HashMap();
    private volatile IZegoSnapshotCompletionCallback mPreviewSnapshotCompletionCallback;
    private volatile IZegoSnapshotCompletionCallback2 mPreviewSnapshotCompletionCallback2;
    private Handler mUIHandler = new Handler(Looper.getMainLooper());
    private volatile int mWaitingInviteJoinLiveResponseSeq;
    private volatile int mWaitingJoinLiveResponseSeq;
    private volatile IZegoAVEngineCallback mZegoAVEngineCallback;
    private volatile IZegoAudioPrepCallback mZegoAudioPrepCallback;
    private volatile IZegoAudioPrepCallback2 mZegoAudioPrepCallback2;
    private volatile IZegoAudioRecordCallback mZegoAudioRecordCallback;
    private volatile IZegoAudioRecordCallback2 mZegoAudioRecordCallback2;
    private volatile IZegoDeviceEventCallback mZegoDeviceEventCallback;
    private volatile IZegoExternalRenderCallback mZegoExternalRenderCallback;
    private volatile IZegoIMCallback mZegoIMCallback;
    private volatile IZegoInitSDKCompletionCallback mZegoInitSDKCallback;
    private volatile IZegoLiveEventCallback mZegoLiveEventCallback;
    private volatile IZegoLivePlayerCallback mZegoLivePlayerCallback;
    private volatile IZegoLivePublisherCallback mZegoLivePublisherCallback;
    private volatile IZegoLivePublisherCallback2 mZegoLivePublisherCallback2;
    private volatile IZegoLivePublisherExCallback mZegoLivePublisherExCallback;
    private volatile IZegoLogInfoCallback mZegoLogInfoCallback;
    private volatile IZegoMediaSideCallback mZegoMediaSideCallback;
    private volatile IZegoReliableMessageCallback mZegoReliableMessageCallback;
    private volatile IZegoRoomCallback mZegoRoomCallback;

    public interface SDKContext {
        Application getAppContext();

        String getLogPath();

        String getSoFullPath();
    }

    public interface SDKContextEx extends SDKContext {
        long getLogFileSize();

        String getSubLogFolder();
    }

    public static void uploadLog() {
        ZegoLiveRoomJNI.uploadLog();
    }

    public static int getMaxPlayChannelCount() {
        return ZegoLiveRoomJNI.getMaxPlayChannelCount();
    }

    public static String version() {
        return ZegoLiveRoomJNI.version();
    }

    public static String version2() {
        return ZegoLiveRoomJNI.version2();
    }

    public final int getAudioRouteType() {
        return ZegoLiveRoomJNI.getAudioRouteType();
    }

    public final float getCaptureSoundLevel() {
        return ZegoLiveRoomJNI.getCaptureSoundLevel();
    }

    public final boolean logoutRoom() {
        removeAllRoomCallback();
        return ZegoLiveRoomJNI.logoutRoom();
    }

    public final boolean startPreview() {
        return ZegoLiveRoomJNI.startPreview(0);
    }

    public final boolean stopPreview() {
        return ZegoLiveRoomJNI.stopPreview(0);
    }

    public final boolean stopPublishing() {
        return ZegoLiveRoomJNI.stopPublishing(0);
    }

    public final void onAVEngineStart() {
        final IZegoAVEngineCallback iZegoAVEngineCallback = this.mZegoAVEngineCallback;
        if (iZegoAVEngineCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoAVEngineCallback.onAVEngineStart();
                }
            });
        }
    }

    public final void onAVEngineStop() {
        final IZegoAVEngineCallback iZegoAVEngineCallback = this.mZegoAVEngineCallback;
        if (iZegoAVEngineCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoAVEngineCallback.onAVEngineStop();
                }
            });
        }
    }

    public final void onCaptureAudioFirstFrame() {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLivePublisherCallback.onCaptureAudioFirstFrame();
                }
            });
        }
    }

    public final void onCaptureVideoFirstFrame() {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLivePublisherCallback.onCaptureVideoFirstFrame();
                }
            });
        }
    }

    public final void onLogWillOverwrite() {
        final IZegoLogInfoCallback iZegoLogInfoCallback = this.mZegoLogInfoCallback;
        if (iZegoLogInfoCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLogInfoCallback.onLogWillOverwrite();
                }
            });
        }
    }

    private void removeAllRoomCallback() {
        this.mMapEndJoinLiveResponseCallback.clear();
        this.mMapZegoLoginCompletionCallback.clear();
        this.mWaitingInviteJoinLiveResponseSeq = 0;
        this.mWaitingJoinLiveResponseSeq = 0;
        this.mInviteJoinLiveResponseCallback = null;
        this.mJoinLiveResponseCallback = null;
        this.mMapStreamSnapshotCompletionCallback.clear();
        this.mPreviewSnapshotCompletionCallback = null;
        this.mPreviewSnapshotCompletionCallback2 = null;
        this.mMapIMCallback.clear();
        this.mMapCustomCommandCallback.clear();
        this.mMapSendReliableMessageCallback.clear();
        this.mMapGetReliableMessageCallback.clear();
        this.mMapUpdatePublishTargetCallback.clear();
    }

    public final boolean unInitSDK() {
        try {
            sLogPath = null;
            this.mZegoRoomCallback = null;
            this.mZegoLivePlayerCallback = null;
            this.mZegoLivePublisherCallback = null;
            this.mZegoLivePublisherExCallback = null;
            this.mZegoLivePublisherCallback2 = null;
            this.mZegoDeviceEventCallback = null;
            this.mZegoLiveEventCallback = null;
            this.mZegoExternalRenderCallback = null;
            this.mZegoAudioRecordCallback = null;
            this.mZegoAudioPrepCallback = null;
            this.mZegoAudioPrepCallback2 = null;
            this.mZegoIMCallback = null;
            this.mZegoMediaSideCallback = null;
            this.mZegoAVEngineCallback = null;
            this.mZegoInitSDKCallback = null;
            this.mZegoReliableMessageCallback = null;
            this.mZegoLogInfoCallback = null;
            removeAllRoomCallback();
            ZegoLiveRoomJNI.setZegoLiveRoomCallback(null);
            ZegoLiveRoomJNI.setZegoIMCallback(null);
        } catch (Exception unused) {
        }
        return ZegoLiveRoomJNI.unInitSDK();
    }

    public static void enableAudioPrep(boolean z) {
        ZegoLiveRoomJNI.enableAudioPrep(z);
    }

    public static void enableCheckPoc(boolean z) {
        ZegoLiveRoomJNI.enableCheckPoc(z);
    }

    public static void enableExternalRender(boolean z) {
        ZegoLiveRoomJNI.enableExternalRender(z);
    }

    private static void setAlphaEnv(boolean z) {
        ZegoLiveRoomJNI.setAlphaEnv(z);
    }

    public static void setAudioDeviceMode(int i) {
        ZegoLiveRoomJNI.setAudioDeviceMode(i);
    }

    public static void setBusinessType(int i) {
        ZegoLiveRoomJNI.setBusinessType(i);
    }

    public static void setConfig(String str) {
        ZegoLiveRoomJNI.setConfig(str);
    }

    public static void setLogPath(String str) {
        sLogPath = str;
    }

    private void setNetAgentSwitchMode(int i) {
        ZegoLiveRoomJNI.setNetAgentSwitchMode(i);
    }

    public static void setTestEnv(boolean z) {
        ZegoLiveRoomJNI.setTestEnv(z);
    }

    public static void setVerbose(boolean z) {
        ZegoLiveRoomJNI.setVerbose(z);
    }

    public final void enableAEC(boolean z) {
        ZegoLiveRoomJNI.enableAEC(z);
    }

    public final void enableAECWhenHeadsetDetected(boolean z) {
        ZegoLiveRoomJNI.enableAECWhenHeadsetDetected(z);
    }

    public final void enableAGC(boolean z) {
        ZegoLiveRoomJNI.enableAGC(z);
    }

    public final void enableDTX(boolean z) {
        ZegoLiveRoomJNI.enableDTX(z);
    }

    public final void enableVAD(boolean z) {
        ZegoLiveRoomJNI.enableVAD(z);
    }

    public final void pauseModule(int i) {
        ZegoLiveRoomJNI.pauseModule(i);
    }

    public final void resumeModule(int i) {
        ZegoLiveRoomJNI.resumeModule(i);
    }

    public final void setAECMode(int i) {
        ZegoLiveRoomJNI.setAECMode(i);
    }

    public final void setAudioChannelCount(int i) {
        ZegoLiveRoomJNI.setAudioChannelCount(i);
    }

    public final void setAuxVolume(int i) {
        ZegoLiveRoomJNI.setAuxVolume(i);
    }

    public final void setCapturePipelineScaleMode(int i) {
        ZegoLiveRoomJNI.setCapturePipelineScaleMode(i);
    }

    public final void setCaptureVolume(int i) {
        ZegoLiveRoomJNI.setCaptureVolume(i);
    }

    public final void setCustomToken(String str) {
        ZegoLiveRoomJNI.setCustomToken(str);
    }

    public final void setLatencyMode(int i) {
        ZegoLiveRoomJNI.setLatencyMode(i);
    }

    public final void setLoopbackVolume(int i) {
        ZegoLiveRoomJNI.setLoopbackVolume(i);
    }

    public final void setReliableMessageCallback(IZegoReliableMessageCallback iZegoReliableMessageCallback) {
        this.mZegoReliableMessageCallback = iZegoReliableMessageCallback;
    }

    public final void setRoomMaxUserCount(int i) {
        ZegoLiveRoomJNI.setRoomMaxUserCount(i);
    }

    public final void setZegoAVEngineCallback(IZegoAVEngineCallback iZegoAVEngineCallback) {
        this.mZegoAVEngineCallback = iZegoAVEngineCallback;
    }

    public final void setZegoAudioPrepCallback(IZegoAudioPrepCallback iZegoAudioPrepCallback) {
        this.mZegoAudioPrepCallback = iZegoAudioPrepCallback;
    }

    public final void setZegoAudioPrepCallback2(IZegoAudioPrepCallback2 iZegoAudioPrepCallback2) {
        this.mZegoAudioPrepCallback2 = iZegoAudioPrepCallback2;
    }

    public final void setZegoAudioRecordCallback(IZegoAudioRecordCallback2 iZegoAudioRecordCallback2) {
        this.mZegoAudioRecordCallback2 = iZegoAudioRecordCallback2;
    }

    public final void setZegoDeviceEventCallback(IZegoDeviceEventCallback iZegoDeviceEventCallback) {
        this.mZegoDeviceEventCallback = iZegoDeviceEventCallback;
    }

    public final void setZegoExternalRenderCallback(IZegoExternalRenderCallback iZegoExternalRenderCallback) {
        this.mZegoExternalRenderCallback = iZegoExternalRenderCallback;
    }

    public final void setZegoIMCallback(IZegoIMCallback iZegoIMCallback) {
        this.mZegoIMCallback = iZegoIMCallback;
    }

    public final void setZegoLiveEventCallback(IZegoLiveEventCallback iZegoLiveEventCallback) {
        this.mZegoLiveEventCallback = iZegoLiveEventCallback;
    }

    public final void setZegoLivePlayerCallback(IZegoLivePlayerCallback iZegoLivePlayerCallback) {
        this.mZegoLivePlayerCallback = iZegoLivePlayerCallback;
    }

    public final void setZegoLivePublisherCallback(IZegoLivePublisherCallback iZegoLivePublisherCallback) {
        this.mZegoLivePublisherCallback = iZegoLivePublisherCallback;
    }

    public final void setZegoLivePublisherCallback2(IZegoLivePublisherCallback2 iZegoLivePublisherCallback2) {
        this.mZegoLivePublisherCallback2 = iZegoLivePublisherCallback2;
    }

    public final void setZegoLivePublisherExCallback(IZegoLivePublisherExCallback iZegoLivePublisherExCallback) {
        this.mZegoLivePublisherExCallback = iZegoLivePublisherExCallback;
    }

    public final void setZegoLogInfoCallback(IZegoLogInfoCallback iZegoLogInfoCallback) {
        this.mZegoLogInfoCallback = iZegoLogInfoCallback;
    }

    public final void setZegoRoomCallback(IZegoRoomCallback iZegoRoomCallback) {
        this.mZegoRoomCallback = iZegoRoomCallback;
    }

    private static String getServiceUrl(String str) {
        return ZegoLiveRoomJNI.getServiceUrl(str);
    }

    public static boolean requireHardwareDecoder(boolean z) {
        return ZegoLiveRoomJNI.requireHardwareDecoder(z);
    }

    public static boolean requireHardwareEncoder(boolean z) {
        return ZegoLiveRoomJNI.requireHardwareEncoder(z);
    }

    public static boolean setPlayQualityMonitorCycle(long j) {
        return ZegoLiveRoomJNI.setPlayQualityMonitorCycle(j);
    }

    public static boolean setPreviewWaterMarkRect(Rect rect) {
        return setPreviewWaterMarkRectInner(rect, 0);
    }

    public static boolean setPublishQualityMonitorCycle(long j) {
        return ZegoLiveRoomJNI.setPublishQualityMonitorCycle(j);
    }

    public static boolean setPublishWaterMarkRect(Rect rect) {
        return setPublishWaterMarkRectInner(rect, 0);
    }

    public static boolean setVideoCaptureFactory(Object obj) {
        return setVideoCaptureFactory(obj, 0);
    }

    public static boolean setVideoFilterFactory(Object obj) {
        return setVideoFilterFactory(obj, 0);
    }

    public static boolean setWaterMarkImagePath(String str) {
        return setWaterMarkImagePathInner(str, 0);
    }

    public final boolean enableAudioRecord(boolean z) {
        return ZegoLiveRoomJNI.enableAudioRecord(z);
    }

    public final boolean enableAux(boolean z) {
        return ZegoLiveRoomJNI.enableAux(z);
    }

    public final boolean enableBeautifying(int i) {
        return ZegoLiveRoomJNI.enableBeautifying(i, 0);
    }

    public final boolean enableCamera(boolean z) {
        return ZegoLiveRoomJNI.enableCamera(z, 0);
    }

    public final boolean enableCaptureMirror(boolean z) {
        return ZegoLiveRoomJNI.enableCaptureMirror(z, 0);
    }

    public final boolean enableLoopback(boolean z) {
        return ZegoLiveRoomJNI.enableLoopback(z);
    }

    public final boolean enableMic(boolean z) {
        return ZegoLiveRoomJNI.enableMic(z);
    }

    public final boolean enableMicDevice(boolean z) {
        return ZegoLiveRoomJNI.enableMicDevice(z);
    }

    public final boolean enableNoiseSuppress(boolean z) {
        return ZegoLiveRoomJNI.enableNoiseSuppress(z);
    }

    public final boolean enablePreviewMirror(boolean z) {
        return ZegoLiveRoomJNI.enablePreviewMirror(z, 0);
    }

    public final boolean enableRateControl(boolean z) {
        return ZegoLiveRoomJNI.enableRateControl(z, 0);
    }

    public final boolean enableSpeaker(boolean z) {
        return ZegoLiveRoomJNI.enableSpeaker(z);
    }

    public final boolean enableTorch(boolean z) {
        return ZegoLiveRoomJNI.enableTorch(z, 0);
    }

    public final int muteAudioPublish(boolean z) {
        return muteAudioPublish(z, 0);
    }

    public final boolean muteAux(boolean z) {
        return ZegoLiveRoomJNI.muteAux(z);
    }

    public final int muteVideoPublish(boolean z) {
        return muteVideoPublish(z, 0);
    }

    public final boolean setAVConfig(ZegoAvConfig zegoAvConfig) {
        return setAVConfigInner(zegoAvConfig, 0);
    }

    public final boolean setAppOrientation(int i) {
        return setAppOrientationInner(i, 0);
    }

    public final boolean setAudioBitrate(int i) {
        return ZegoLiveRoomJNI.setAudioBitrate(i);
    }

    public final boolean setBuiltInSpeakerOn(boolean z) {
        return ZegoLiveRoomJNI.setBuiltInSpeakerOn(z);
    }

    public final boolean setFilter(int i) {
        return ZegoLiveRoomJNI.setFilter(i, 0);
    }

    public final boolean setFrontCam(boolean z) {
        return ZegoLiveRoomJNI.setFrontCam(z, 0);
    }

    public final boolean setPlayVolume(int i) {
        return ZegoLiveRoomJNI.setPlayVolume(i);
    }

    public final boolean setPolishFactor(float f) {
        return ZegoLiveRoomJNI.setPolishFactor(f, 0);
    }

    public final boolean setPolishStep(float f) {
        return ZegoLiveRoomJNI.setPolishStep(f, 0);
    }

    public final boolean setPreviewRotation(int i) {
        return ZegoLiveRoomJNI.setPreviewRotation(i, 0);
    }

    public final boolean setPreviewView(Object obj) {
        return ZegoLiveRoomJNI.setPreviewView(obj, 0);
    }

    public final boolean setPreviewViewBackgroundColor(int i) {
        return ZegoLiveRoomJNI.setPreviewViewBackgroundColor(i, 0);
    }

    public final boolean setPreviewViewMode(int i) {
        return ZegoLiveRoomJNI.setPreviewViewMode(i, 0);
    }

    public final void setPublishConfig(Map<String, Object> map) {
        setPublishConfigInner(map, 0);
    }

    public final boolean setSharpenFactor(float f) {
        return ZegoLiveRoomJNI.setSharpenFactor(f, 0);
    }

    public final boolean setVideoKeyFrameInterval(int i) {
        return setVideoKeyFrameInterval(i, 0);
    }

    public final boolean setWhitenFactor(float f) {
        return ZegoLiveRoomJNI.setWhitenFactor(f, 0);
    }

    public final void setZegoAudioRecordCallback(IZegoAudioRecordCallback iZegoAudioRecordCallback) {
        this.mZegoAudioRecordCallback = iZegoAudioRecordCallback;
    }

    public final boolean updateMixInputStreams(ZegoMixStreamInfo[] zegoMixStreamInfoArr) {
        return ZegoLiveRoomJNI.updateMixInputStreams(zegoMixStreamInfoArr);
    }

    public final boolean updateStreamExtraInfo(String str) {
        return updateStreamExtraInfoInner(str, 0);
    }

    public final ByteBuffer getInputBuffer(int i) {
        IZegoExternalRenderCallback iZegoExternalRenderCallback = this.mZegoExternalRenderCallback;
        if (iZegoExternalRenderCallback != null) {
            return iZegoExternalRenderCallback.getInputBuffer(i);
        }
        return null;
    }

    public final ZegoAudioFrame onAudioPrep2(ZegoAudioFrame zegoAudioFrame) {
        IZegoAudioPrepCallback2 iZegoAudioPrepCallback2 = this.mZegoAudioPrepCallback2;
        if (iZegoAudioPrepCallback2 != null) {
            return iZegoAudioPrepCallback2.onAudioPrep(zegoAudioFrame);
        }
        return null;
    }

    public final AuxData onAuxCallback(int i) {
        IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            return iZegoLivePublisherCallback.onAuxCallback(i);
        }
        return null;
    }

    public final void onInitSDK(final int i) {
        final IZegoInitSDKCompletionCallback iZegoInitSDKCompletionCallback = this.mZegoInitSDKCallback;
        if (iZegoInitSDKCompletionCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoInitSDKCompletionCallback.onInitSDK(i);
                }
            });
        }
    }

    public final void onLogUploadResult(final int i) {
        final IZegoLogInfoCallback iZegoLogInfoCallback = this.mZegoLogInfoCallback;
        if (iZegoLogInfoCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLogInfoCallback.onLogUploadResult(i);
                }
            });
        }
    }

    public final void setZegoMediaSideCallback(IZegoMediaSideCallback iZegoMediaSideCallback) {
        this.mZegoMediaSideCallback = iZegoMediaSideCallback;
        if (iZegoMediaSideCallback != null) {
            ZegoLiveRoomJNI.setMediaSideCallback(true);
        } else {
            ZegoLiveRoomJNI.setMediaSideCallback(false);
        }
    }

    public final boolean startPreview(int i) {
        return ZegoLiveRoomJNI.startPreview(i);
    }

    public final boolean stopPreview(int i) {
        return ZegoLiveRoomJNI.stopPreview(i);
    }

    public final boolean stopPublishing(int i) {
        return ZegoLiveRoomJNI.stopPublishing(i);
    }

    public final boolean enableSelectedAudioRecord(ZegoAudioRecordConfig zegoAudioRecordConfig) {
        if (zegoAudioRecordConfig != null) {
            return ZegoLiveRoomJNI.enableSelectedAudioRecord(zegoAudioRecordConfig.mask, zegoAudioRecordConfig.sampleRate, zegoAudioRecordConfig.channels);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_enableSelectedAudioRecord] failed, config is NULL");
        return false;
    }

    public final float getSoundLevelOfStream(String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.getSoundLevelOfStream(str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_getSoundLevelOfStream] failed, streamID is empty");
        return 0.0f;
    }

    public final void onCaptureVideoFirstFrame(final int i) {
        final IZegoLivePublisherCallback2 iZegoLivePublisherCallback2 = this.mZegoLivePublisherCallback2;
        if (iZegoLivePublisherCallback2 != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLivePublisherCallback2.onCaptureVideoFirstFrame(i);
                }
            });
        }
    }

    public final void onRecvRemoteAudioFirstFrame(final String str) {
        if (this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) {
            final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback;
            if (iZegoLivePlayerCallback2 != null) {
                this.mUIHandler.post(new Runnable() {
                    public void run() {
                        iZegoLivePlayerCallback2.onRecvRemoteAudioFirstFrame(str);
                    }
                });
            }
        }
    }

    public final void onRecvRemoteVideoFirstFrame(final String str) {
        if (this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) {
            final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback;
            if (iZegoLivePlayerCallback2 != null) {
                this.mUIHandler.post(new Runnable() {
                    public void run() {
                        iZegoLivePlayerCallback2.onRecvRemoteVideoFirstFrame(str);
                    }
                });
            }
        }
    }

    public final void onRenderRemoteVideoFirstFrame(final String str) {
        if (this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) {
            final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback;
            if (iZegoLivePlayerCallback2 != null) {
                this.mUIHandler.post(new Runnable() {
                    public void run() {
                        iZegoLivePlayerCallback2.onRenderRemoteVideoFirstFrame(str);
                    }
                });
            }
        }
    }

    public final boolean requestJoinLive(IZegoResponseCallback iZegoResponseCallback) {
        if (iZegoResponseCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_requestJoinLive] failed, callback is null");
            return false;
        }
        int requestJoinLive = ZegoLiveRoomJNI.requestJoinLive();
        if (requestJoinLive <= 0) {
            return false;
        }
        this.mWaitingJoinLiveResponseSeq = requestJoinLive;
        this.mJoinLiveResponseCallback = iZegoResponseCallback;
        return true;
    }

    public final boolean stopPlayingStream(String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.stopPlayingStream(str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_stopPlayingStream] failed, streamID is empty");
        return false;
    }

    public final boolean takePreviewSnapshot(IZegoSnapshotCompletionCallback iZegoSnapshotCompletionCallback) {
        if (iZegoSnapshotCompletionCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_takePreviewSnapshot] failed, callback is null");
            return false;
        }
        this.mPreviewSnapshotCompletionCallback = iZegoSnapshotCompletionCallback;
        return ZegoLiveRoomJNI.takePreviewSnapshot(0);
    }

    public final void onPreviewSnapshot(final Bitmap bitmap) {
        final IZegoSnapshotCompletionCallback iZegoSnapshotCompletionCallback = this.mPreviewSnapshotCompletionCallback;
        if (iZegoSnapshotCompletionCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoSnapshotCompletionCallback.onZegoSnapshotCompletion(bitmap);
                }
            });
            this.mPreviewSnapshotCompletionCallback = null;
        }
    }

    public final boolean setMixStreamConfig(Map<String, Object> map) {
        if (map == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setMixStreamConfig] failed, config is null");
            return false;
        }
        String str = (String) map.get("mixStreamID");
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.setMixStreamConfig(str, ((Integer) map.get("mixStreamWidth")).intValue(), ((Integer) map.get("mixStreamHeight")).intValue());
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setMixStreamConfig] failed, mixStreamID is empty");
        return false;
    }

    private ZegoUser[] getListOfLegalUser(ZegoUser[] zegoUserArr) {
        if (zegoUserArr == null || zegoUserArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ZegoUser zegoUser : zegoUserArr) {
            if (zegoUser != null && !TextUtils.isEmpty(zegoUser.userID) && !TextUtils.isEmpty(zegoUser.userName)) {
                arrayList.add(zegoUser);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        ZegoUser[] zegoUserArr2 = new ZegoUser[size];
        for (int i = 0; i < size; i++) {
            zegoUserArr2[i] = (ZegoUser) arrayList.get(i);
        }
        return zegoUserArr2;
    }

    public static int setSDKContext(SDKContext sDKContext) {
        mContext = sDKContext;
        Application appContext = sDKContext.getAppContext();
        int ensureSoLoaded = ZegoLiveRoomJNI.ensureSoLoaded(appContext, sDKContext.getSoFullPath());
        if (ensureSoLoaded >= 0) {
            String logPath = sDKContext.getLogPath();
            if (logPath == null || logPath.length() == 0) {
                logPath = ZegoLogUtil.getLogPath(appContext);
            }
            long j = 5242880;
            String str = null;
            if (sDKContext instanceof SDKContextEx) {
                SDKContextEx sDKContextEx = (SDKContextEx) sDKContext;
                j = sDKContextEx.getLogFileSize();
                str = sDKContextEx.getSubLogFolder();
            }
            ZegoLiveRoomJNI.setLogPathAndSize(logPath, j, str, appContext);
        }
        if (ensureSoLoaded > 0) {
            StringBuilder sb = new StringBuilder("Java_ZegoLiveRoom_setSDKContext，reload zegoliveroom native library success with code: ");
            sb.append(ensureSoLoaded);
            ZegoLiveRoomJNI.logPrint(sb.toString());
        }
        return ensureSoLoaded;
    }

    public static void enableAudioPrep2(boolean z, ZegoExtPrepSet zegoExtPrepSet) {
        ZegoLiveRoomJNI.enableAudioPrep2(z, zegoExtPrepSet);
    }

    public final void enableTrafficControl(int i, boolean z) {
        ZegoLiveRoomJNI.enableTrafficControl(i, z);
    }

    public final void setChannelExtraParam(String str, int i) {
        ZegoLiveRoomJNI.setChannelExtraParam(str, i);
    }

    public final void setMinVideoBitrateForTrafficControl(int i, int i2) {
        ZegoLiveRoomJNI.setMinVideoBitrateForTrafficControl(i, i2);
    }

    public final void setPublishConfig(Map<String, Object> map, int i) {
        setPublishConfigInner(map, i);
    }

    public final void setRoomConfig(boolean z, boolean z2) {
        ZegoLiveRoomJNI.setRoomConfig(z, z2);
    }

    public static void _logPrint(String str, Object... objArr) {
        ZegoLiveRoomJNI.logPrint(C1642a.m8034a(str, objArr));
    }

    public final int activateAudioPlayStream(String str, boolean z) {
        return ZegoLiveRoomJNI.activateAudioPlayStream(str, z);
    }

    public final int activateVideoPlayStream(String str, boolean z) {
        return ZegoLiveRoomJNI.activateVideoPlayStream(str, z, -1);
    }

    public final boolean enableSelectedAudioRecord(int i, int i2) {
        return ZegoLiveRoomJNI.enableSelectedAudioRecord(i, i2, 1);
    }

    public final boolean initSDK(long j, byte[] bArr) {
        return initSDK(j, bArr, (IZegoInitSDKCompletionCallback) null);
    }

    public final boolean respondInviteJoinLiveReq(int i, int i2) {
        return ZegoLiveRoomJNI.respondInviteJoinLiveReq(i, i2);
    }

    public final boolean respondJoinLiveReq(int i, int i2) {
        return ZegoLiveRoomJNI.respondJoinLiveReq(i, i2);
    }

    public final boolean setAudioEqualizerGain(int i, float f) {
        return ZegoLiveRoomJNI.setAudioEqualizerGain(i, f);
    }

    public final void setMediaSideFlags(boolean z, boolean z2) {
        ZegoLiveRoomJNI.setMediaSideFlags(z, z2, 0, 0, 0);
    }

    public final boolean setVideoCaptureDeviceId(String str, int i) {
        return ZegoLiveRoomJNI.setVideoCaptureDeviceId(str, i);
    }

    public final boolean setVideoCodecId(int i, int i2) {
        return ZegoLiveRoomJNI.setVideoCodecId(i, i2);
    }

    public final void setVideoEncoderRateControlConfig(int i, int i2) {
        ZegoLiveRoomJNI.setVideoEncoderRateControlConfig(i, i2, 0);
    }

    public final boolean setVideoMirrorMode(int i, int i2) {
        return ZegoLiveRoomJNI.setVideoMirrorMode(i, i2);
    }

    public final boolean startPlayingStream(String str, Object obj) {
        return startPlayingStreamInner(str, obj, null);
    }

    public static boolean setAudioDevice(int i, String str) {
        if (i == 0 || i == 1) {
            return ZegoLiveRoomJNI.setAudioDevice(i, str);
        }
        return false;
    }

    public static boolean setPreviewWaterMarkRect(Rect rect, int i) {
        return setPreviewWaterMarkRectInner(rect, i);
    }

    public static boolean setPublishWaterMarkRect(Rect rect, int i) {
        return setPublishWaterMarkRectInner(rect, i);
    }

    public static boolean setWaterMarkImagePath(String str, int i) {
        return setWaterMarkImagePathInner(str, i);
    }

    private boolean updateStreamExtraInfoInner(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return ZegoLiveRoomJNI.updateStreamExtraInfo(str, i);
    }

    public final boolean enableBeautifying(int i, int i2) {
        return ZegoLiveRoomJNI.enableBeautifying(i, i2);
    }

    public final boolean enableCamera(boolean z, int i) {
        return ZegoLiveRoomJNI.enableCamera(z, i);
    }

    public final boolean enableCaptureMirror(boolean z, int i) {
        return ZegoLiveRoomJNI.enableCaptureMirror(z, i);
    }

    public final boolean enablePreviewMirror(boolean z, int i) {
        return ZegoLiveRoomJNI.enablePreviewMirror(z, i);
    }

    public final boolean enableRateControl(boolean z, int i) {
        return ZegoLiveRoomJNI.enableRateControl(z, i);
    }

    public final boolean enableTorch(boolean z, int i) {
        return ZegoLiveRoomJNI.enableTorch(z, i);
    }

    public final boolean mixStream(ZegoCompleteMixStreamInfo zegoCompleteMixStreamInfo, int i) {
        return new ZegoStreamMixer().mixStream(zegoCompleteMixStreamInfo, i);
    }

    public final int muteAudioPublish(boolean z, int i) {
        return ZegoLiveRoomJNI.muteAudioPublish(z, i);
    }

    public final int muteVideoPublish(boolean z, int i) {
        return ZegoLiveRoomJNI.muteVideoPublish(z, i);
    }

    public final void onCaptureVideoSizeChanged(final int i, final int i2) {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLivePublisherCallback.onCaptureVideoSizeChangedTo(i, i2);
                }
            });
        }
    }

    public final void onDeviceError(final String str, final int i) {
        final IZegoDeviceEventCallback iZegoDeviceEventCallback = this.mZegoDeviceEventCallback;
        if (iZegoDeviceEventCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoDeviceEventCallback.onDeviceError(str, i);
                }
            });
        }
    }

    public final void onDisconnect(final int i, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoRoomCallback.onDisconnect(i, str);
                }
            });
        }
    }

    public final void onLiveEvent(final int i, final HashMap<String, String> hashMap) {
        final IZegoLiveEventCallback iZegoLiveEventCallback = this.mZegoLiveEventCallback;
        if (iZegoLiveEventCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLiveEventCallback.onLiveEvent(i, hashMap);
                }
            });
        }
    }

    public final void onPlayQualityUpdate(final String str, final ZegoPlayStreamQuality zegoPlayStreamQuality) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLivePlayerCallback.onPlayQualityUpdate(str, zegoPlayStreamQuality);
                }
            });
        }
    }

    public final void onPlayStateUpdate(final int i, final String str) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLivePlayerCallback.onPlayStateUpdate(i, str);
                }
            });
        }
    }

    public final void onPublishQulityUpdate(final String str, final ZegoPublishStreamQuality zegoPublishStreamQuality) {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLivePublisherCallback.onPublishQualityUpdate(str, zegoPublishStreamQuality);
                }
            });
        }
    }

    public final void onReconnect(final int i, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoRoomCallback.onReconnect(i, str);
                }
            });
        }
    }

    public final void onRecvBigRoomMessage(final String str, final ZegoBigRoomMessage[] zegoBigRoomMessageArr) {
        final IZegoIMCallback iZegoIMCallback = this.mZegoIMCallback;
        if (iZegoIMCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoIMCallback.onRecvBigRoomMessage(str, zegoBigRoomMessageArr);
                }
            });
        }
    }

    public final void onRecvReliableMessage(final String str, final ZegoReliableMessage zegoReliableMessage) {
        final IZegoReliableMessageCallback iZegoReliableMessageCallback = this.mZegoReliableMessageCallback;
        if (iZegoReliableMessageCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoReliableMessageCallback.onRecvReliableMessage(str, zegoReliableMessage);
                }
            });
        }
    }

    public final void onRecvRoomMessage(final String str, final ZegoRoomMessage[] zegoRoomMessageArr) {
        final IZegoIMCallback iZegoIMCallback = this.mZegoIMCallback;
        if (iZegoIMCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoIMCallback.onRecvRoomMessage(str, zegoRoomMessageArr);
                }
            });
        }
    }

    public final void onRelayCDNStateUpdate(final ZegoStreamRelayCDNInfo[] zegoStreamRelayCDNInfoArr, final String str) {
        final IZegoLivePublisherExCallback iZegoLivePublisherExCallback = this.mZegoLivePublisherExCallback;
        if (iZegoLivePublisherExCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLivePublisherExCallback.onRelayCDNStateUpdate(zegoStreamRelayCDNInfoArr, str);
                }
            });
        }
    }

    public final void onStreamExtraInfoUpdated(final ZegoStreamInfo[] zegoStreamInfoArr, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoRoomCallback.onStreamExtraInfoUpdated(zegoStreamInfoArr, str);
                }
            });
        }
    }

    public final void onTempBroken(final int i, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoRoomCallback.onTempBroken(i, str);
                }
            });
        }
    }

    public final void onUpdateOnlineCount(final String str, final int i) {
        final IZegoIMCallback iZegoIMCallback = this.mZegoIMCallback;
        if (iZegoIMCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoIMCallback.onUpdateOnlineCount(str, i);
                }
            });
        }
    }

    public final void onUpdateReliableMessageInfo(final String str, final ZegoReliableMessageInfo[] zegoReliableMessageInfoArr) {
        final IZegoReliableMessageCallback iZegoReliableMessageCallback = this.mZegoReliableMessageCallback;
        if (iZegoReliableMessageCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoReliableMessageCallback.onUpdateReliableMessageInfo(str, zegoReliableMessageInfoArr);
                }
            });
        }
    }

    public final void onUserUpdate(final ZegoUserState[] zegoUserStateArr, final int i) {
        final IZegoIMCallback iZegoIMCallback = this.mZegoIMCallback;
        if (iZegoIMCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoIMCallback.onUserUpdate(zegoUserStateArr, i);
                }
            });
        }
    }

    public final boolean setAVConfig(ZegoAvConfig zegoAvConfig, int i) {
        return setAVConfigInner(zegoAvConfig, i);
    }

    public final boolean setAppOrientation(int i, int i2) {
        return setAppOrientationInner(i, i2);
    }

    public final boolean setFilter(int i, int i2) {
        return ZegoLiveRoomJNI.setFilter(i, i2);
    }

    public final boolean setFrontCam(boolean z, int i) {
        return ZegoLiveRoomJNI.setFrontCam(z, i);
    }

    public final boolean setPlayVolume(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return ZegoLiveRoomJNI.setPlayVolume2(i, str);
    }

    public final boolean setPolishFactor(float f, int i) {
        return ZegoLiveRoomJNI.setPolishFactor(f, i);
    }

    public final boolean setPolishStep(float f, int i) {
        return ZegoLiveRoomJNI.setPolishStep(f, i);
    }

    public final boolean setPreviewRotation(int i, int i2) {
        return ZegoLiveRoomJNI.setPreviewRotation(i, i2);
    }

    public final boolean setPreviewView(Object obj, int i) {
        return ZegoLiveRoomJNI.setPreviewView(obj, i);
    }

    public final boolean setPreviewViewBackgroundColor(int i, int i2) {
        return ZegoLiveRoomJNI.setPreviewViewBackgroundColor(i, i2);
    }

    public final boolean setPreviewViewMode(int i, int i2) {
        return ZegoLiveRoomJNI.setPreviewViewMode(i, i2);
    }

    public final boolean setSharpenFactor(float f, int i) {
        return ZegoLiveRoomJNI.setSharpenFactor(f, i);
    }

    public final boolean setVideoKeyFrameInterval(int i, int i2) {
        return ZegoLiveRoomJNI.setVideoKeyFrameInterval(i, i2);
    }

    public final boolean setWhitenFactor(float f, int i) {
        return ZegoLiveRoomJNI.setWhitenFactor(f, i);
    }

    public final boolean takePreviewSnapshot(IZegoSnapshotCompletionCallback2 iZegoSnapshotCompletionCallback2, int i) {
        if (iZegoSnapshotCompletionCallback2 == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_takePreviewSnapshot_channel] failed, callback is null");
            return false;
        }
        this.mPreviewSnapshotCompletionCallback2 = iZegoSnapshotCompletionCallback2;
        return ZegoLiveRoomJNI.takePreviewSnapshot(i);
    }

    public final boolean updateStreamExtraInfo(String str, int i) {
        return updateStreamExtraInfoInner(str, i);
    }

    private boolean setAppOrientationInner(int i, int i2) {
        if (i >= 0 && i <= 3) {
            return ZegoLiveRoomJNI.setAppOrientation(i, i2);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setAppOrientationInner] failed, orientation is illegal");
        return false;
    }

    private static boolean setPreviewWaterMarkRectInner(Rect rect, int i) {
        if (rect == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setPreviewWaterMarkRectInner] failed, rect is null");
            return false;
        }
        ZegoLiveRoomJNI.setPreviewWaterMarkRect(rect.left, rect.top, rect.right, rect.bottom, i);
        return true;
    }

    private static boolean setPublishWaterMarkRectInner(Rect rect, int i) {
        if (rect == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setPublishWaterMarkRectInner] failed, rect is null");
            return false;
        }
        ZegoLiveRoomJNI.setPublishWaterMarkRect(rect.left, rect.top, rect.right, rect.bottom, i);
        return true;
    }

    public static boolean setUser(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setUser] failed, userID is empty");
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            return ZegoLiveRoomJNI.setUser(str, str2);
        } else {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setUser] failed, userName is empty");
            return false;
        }
    }

    private static boolean setWaterMarkImagePathInner(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setWaterMarkImagePathInner] failed, imagePath is empty");
            return false;
        }
        ZegoLiveRoomJNI.setWaterMarkImagePath(str, i);
        return true;
    }

    public final void onPreviewSnapshot(final int i, final Bitmap bitmap) {
        final IZegoSnapshotCompletionCallback2 iZegoSnapshotCompletionCallback2 = this.mPreviewSnapshotCompletionCallback2;
        if (iZegoSnapshotCompletionCallback2 != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoSnapshotCompletionCallback2.onZegoSnapshotCompletion(i, bitmap);
                }
            });
            this.mPreviewSnapshotCompletionCallback2 = null;
        }
    }

    public final void onSnapshot(final Bitmap bitmap, String str) {
        final IZegoSnapshotCompletionCallback iZegoSnapshotCompletionCallback = (IZegoSnapshotCompletionCallback) this.mMapStreamSnapshotCompletionCallback.get(str);
        if (iZegoSnapshotCompletionCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoSnapshotCompletionCallback.onZegoSnapshotCompletion(bitmap);
                }
            });
            this.mMapStreamSnapshotCompletionCallback.remove(str);
        }
    }

    public final boolean setViewBackgroundColor(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.setViewBackgroundColor(i, str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setViewBackgroundColor] failed, streamID is empty");
        return false;
    }

    public final boolean setViewMode(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.setViewMode(i, str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setViewMode] failed, streamID is empty");
        return false;
    }

    public final boolean setViewRotation(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.setViewRotation(i, str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setViewRotation] failed, streamID is empty");
        return false;
    }

    public final boolean updatePlayView(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.updatePlayView(str, obj);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_updatePlayView] failed, streamID is empty");
        return false;
    }

    private void setPublishConfigInner(Map<String, Object> map, int i) {
        if (map == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setPublishConfigInner] invalid params, config is null");
            return;
        }
        String str = (String) map.get("publishCustomTarget");
        if (!TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.setPublishConfig(str, i);
        }
        String str2 = (String) map.get("publish_cdn_target");
        if (!TextUtils.isEmpty(str2)) {
            ZegoLiveRoomJNI.setCDNPublishTarget(str2, i);
        }
    }

    public final boolean getReliableMessage(String[] strArr, IZegoGetReliableMessageCallback iZegoGetReliableMessageCallback) {
        if (iZegoGetReliableMessageCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_getReliableMessage] callback is null");
            return false;
        }
        int reliableMessage = ZegoLiveRoomJNI.getReliableMessage(strArr);
        if (reliableMessage != -1) {
            this.mMapGetReliableMessageCallback.put(Integer.valueOf(reliableMessage), iZegoGetReliableMessageCallback);
            return true;
        }
        StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_sendReliableMessage] failed, seq:");
        sb.append(reliableMessage);
        ZegoLiveRoomJNI.logPrint(sb.toString());
        return false;
    }

    public final boolean inviteJoinLive(String str, IZegoResponseCallback iZegoResponseCallback) {
        if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_inviteJoinLive] failed, userID is empty");
            return false;
        } else if (iZegoResponseCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_inviteJoinLive] failed, callback is null");
            return false;
        } else {
            int inviteJoinLive = ZegoLiveRoomJNI.inviteJoinLive(str);
            if (inviteJoinLive <= 0) {
                return false;
            }
            this.mWaitingInviteJoinLiveResponseSeq = inviteJoinLive;
            this.mInviteJoinLiveResponseCallback = iZegoResponseCallback;
            return true;
        }
    }

    public final boolean setAVConfigInner(ZegoAvConfig zegoAvConfig, int i) {
        if (zegoAvConfig == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setAVConfigInner] failed, config is null");
            return false;
        }
        return ZegoLiveRoomJNI.setVideoCaptureResolution(zegoAvConfig.getVideoCaptureResolutionWidth(), zegoAvConfig.getVideoCaptureResolutionHeight(), i) & ZegoLiveRoomJNI.setVideoFPS(zegoAvConfig.getVideoFPS(), i) & true & ZegoLiveRoomJNI.setVideoBitrate(zegoAvConfig.getVideoBitrate(), i) & ZegoLiveRoomJNI.setVideoEncodeResolution(zegoAvConfig.getVideoEncodeResolutionWidth(), zegoAvConfig.getVideoEncodeResolutionHeight(), i);
    }

    public final boolean takeSnapshotOfStream(String str, IZegoSnapshotCompletionCallback iZegoSnapshotCompletionCallback) {
        if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_takeSnapshotOfStream] failed, streamID is empty");
            return false;
        } else if (iZegoSnapshotCompletionCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_takeSnapshotOfStream] failed, callback is null");
            return false;
        } else {
            boolean takeSnapshot = ZegoLiveRoomJNI.takeSnapshot(str);
            if (takeSnapshot) {
                if (this.mMapStreamSnapshotCompletionCallback.get(str) != null) {
                    StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_takeSnapshotOfStream] unfinished snapshot, streamID:");
                    sb.append(str);
                    ZegoLiveRoomJNI.logPrint(sb.toString());
                }
                this.mMapStreamSnapshotCompletionCallback.put(str, iZegoSnapshotCompletionCallback);
            }
            return takeSnapshot;
        }
    }

    public static boolean setVideoCaptureFactory(Object obj, int i) {
        try {
            return ((Boolean) Class.forName("com.zego.zegoavkit2.ZegoExternalVideoCapture").getMethod("setVideoCaptureFactory", new Class[]{Class.forName("com.zego.zegoavkit2.ZegoVideoCaptureFactory"), Integer.TYPE}).invoke(null, new Object[]{obj, Integer.valueOf(i)})).booleanValue();
        } catch (ClassNotFoundException unused) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setVideoCaptureFactory] failed, class not found exception");
            return false;
        } catch (NoSuchMethodException unused2) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setVideoCaptureFactory] failed, no such method exception");
            return false;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_setVideoCaptureFactory] failed, invoke method exception: ");
            sb.append(e);
            ZegoLiveRoomJNI.logPrint(sb.toString());
            return false;
        }
    }

    public static boolean setVideoFilterFactory(Object obj, int i) {
        try {
            return ((Boolean) Class.forName("com.zego.zegoavkit2.videofilter.ZegoExternalVideoFilter").getMethod("setVideoFilterFactory", new Class[]{Class.forName("com.zego.zegoavkit2.videofilter.ZegoVideoFilterFactory"), Integer.TYPE}).invoke(null, new Object[]{obj, Integer.valueOf(i)})).booleanValue();
        } catch (ClassNotFoundException unused) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setVideoFilterFactory] failed, class not found exception");
            return false;
        } catch (NoSuchMethodException unused2) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setVideoFilterFactory] failed, no such method exception");
            return false;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_setVideoFilterFactory] failed, invoke method exception: ");
            sb.append(e);
            ZegoLiveRoomJNI.logPrint(sb.toString());
            return false;
        }
    }

    public final boolean endJoinLive(String str, IZegoEndJoinLiveCallback iZegoEndJoinLiveCallback) {
        if (iZegoEndJoinLiveCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_endJoinLive] failed, callback is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_endJoinLive] failed, userId is empty");
            return false;
        } else {
            int endJoinLive = ZegoLiveRoomJNI.endJoinLive(str);
            if (endJoinLive > 0) {
                if (this.mMapEndJoinLiveResponseCallback.get(Integer.valueOf(endJoinLive)) != null) {
                    StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_endJoinLive], unfinished send end join live, seq:");
                    sb.append(endJoinLive);
                    ZegoLiveRoomJNI.logPrint(sb.toString());
                }
                this.mMapEndJoinLiveResponseCallback.put(Integer.valueOf(endJoinLive), iZegoEndJoinLiveCallback);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("[Java_ZegoLiveRoom_endJoinLive] failed, seq:");
            sb2.append(endJoinLive);
            ZegoLiveRoomJNI.logPrint(sb2.toString());
            return false;
        }
    }

    public final void setVideoEncoderRateControlConfig(int i, int i2, int i3) {
        ZegoLiveRoomJNI.setVideoEncoderRateControlConfig(i, i2, i3);
    }

    public final boolean loginRoom(String str, int i, IZegoLoginCompletionCallback iZegoLoginCompletionCallback) {
        return loginRoom(str, "", i, iZegoLoginCompletionCallback);
    }

    public final void onMediaSideCallback(String str, ByteBuffer byteBuffer, int i) {
        IZegoMediaSideCallback iZegoMediaSideCallback = this.mZegoMediaSideCallback;
        if (iZegoMediaSideCallback != null) {
            iZegoMediaSideCallback.onRecvMediaSideInfo(str, byteBuffer, i);
        }
    }

    public final void sendMediaSideInfo(ByteBuffer byteBuffer, int i, boolean z) {
        ZegoLiveRoomJNI.sendMediaSideInfo(byteBuffer, i, z, 0);
    }

    public final boolean startPublishing(String str, String str2, int i) {
        return startPublishInner(str, str2, i);
    }

    public final int activateVideoPlayStream(String str, boolean z, int i) {
        return ZegoLiveRoomJNI.activateVideoPlayStream(str, z, i);
    }

    public final int dequeueInputBuffer(int i, int i2, int i3) {
        IZegoExternalRenderCallback iZegoExternalRenderCallback = this.mZegoExternalRenderCallback;
        if (iZegoExternalRenderCallback != null) {
            return iZegoExternalRenderCallback.dequeueInputBuffer(i, i2, i3);
        }
        return 0;
    }

    public final void setMediaSideFlags(boolean z, boolean z2, int i) {
        ZegoLiveRoomJNI.setMediaSideFlags(z, z2, 0, 0, i);
    }

    public final boolean startPlayingStream(String str, Object obj, ZegoStreamExtraPlayInfo zegoStreamExtraPlayInfo) {
        return startPlayingStreamInner(str, obj, zegoStreamExtraPlayInfo);
    }

    private boolean startPlayingStreamInner(String str, Object obj, ZegoStreamExtraPlayInfo zegoStreamExtraPlayInfo) {
        if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_startPlayingStreamInner] failed, streamID is empty");
            return false;
        }
        if (zegoStreamExtraPlayInfo != null && TextUtils.isEmpty(zegoStreamExtraPlayInfo.params)) {
            zegoStreamExtraPlayInfo.params = "";
        }
        return ZegoLiveRoomJNI.startPlayingStream(str, obj, zegoStreamExtraPlayInfo);
    }

    private boolean startPublishInner(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return ZegoLiveRoomJNI.startPublishing(str, str2, i);
    }

    public final void onCaptureVideoSizeChanged(int i, int i2, int i3) {
        final IZegoLivePublisherCallback2 iZegoLivePublisherCallback2 = this.mZegoLivePublisherCallback2;
        if (iZegoLivePublisherCallback2 != null) {
            Handler handler = this.mUIHandler;
            final int i4 = i;
            final int i5 = i2;
            final int i6 = i3;
            C4729132 r0 = new Runnable() {
                public void run() {
                    iZegoLivePublisherCallback2.onCaptureVideoSizeChangedTo(i4, i5, i6);
                }
            };
            handler.post(r0);
        }
    }

    public final void onEndJoinLive(final int i, int i2, final String str) {
        final IZegoEndJoinLiveCallback iZegoEndJoinLiveCallback = (IZegoEndJoinLiveCallback) this.mMapEndJoinLiveResponseCallback.remove(Integer.valueOf(i2));
        if (iZegoEndJoinLiveCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoEndJoinLiveCallback.onEndJoinLive(i, str);
                }
            });
        }
    }

    public final void onKickOut(int i, String str, String str2) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            Handler handler = this.mUIHandler;
            final int i2 = i;
            final String str3 = str;
            final String str4 = str2;
            C473105 r0 = new Runnable() {
                public void run() {
                    iZegoRoomCallback.onKickOut(i2, str3, str4);
                }
            };
            handler.post(r0);
        }
    }

    public final void onLoginRoom(final int i, String str, final ZegoStreamInfo[] zegoStreamInfoArr) {
        final IZegoLoginCompletionCallback iZegoLoginCompletionCallback = (IZegoLoginCompletionCallback) this.mMapZegoLoginCompletionCallback.get(str);
        if (iZegoLoginCompletionCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoLoginCompletionCallback.onLoginCompletion(i, zegoStreamInfoArr);
                }
            });
            this.mMapZegoLoginCompletionCallback.remove(str);
        }
    }

    public final void onMixStreamConfigUpdate(int i, String str, HashMap<String, Object> hashMap) {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            Handler handler = this.mUIHandler;
            final int i2 = i;
            final String str2 = str;
            final HashMap<String, Object> hashMap2 = hashMap;
            C4728426 r0 = new Runnable() {
                public void run() {
                    iZegoLivePublisherCallback.onMixStreamConfigUpdate(i2, str2, hashMap2);
                }
            };
            handler.post(r0);
        }
    }

    public final void onPublishStateUpdate(int i, String str, HashMap<String, Object> hashMap) {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            Handler handler = this.mUIHandler;
            final int i2 = i;
            final String str2 = str;
            final HashMap<String, Object> hashMap2 = hashMap;
            C4728123 r0 = new Runnable() {
                public void run() {
                    iZegoLivePublisherCallback.onPublishStateUpdate(i2, str2, hashMap2);
                }
            };
            handler.post(r0);
        }
    }

    public final void onRecvEndJoinLiveCommand(String str, String str2, String str3) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            Handler handler = this.mUIHandler;
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            C4727215 r0 = new Runnable() {
                public void run() {
                    iZegoLivePlayerCallback.onRecvEndJoinLiveCommand(str4, str5, str6);
                }
            };
            handler.post(r0);
        }
    }

    public final void onRemoteCameraStatusUpdate(String str, int i, int i2) {
        if (this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) {
            final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback;
            if (iZegoLivePlayerCallback2 != null) {
                Handler handler = this.mUIHandler;
                final String str2 = str;
                final int i3 = i;
                final int i4 = i2;
                C4727417 r1 = new Runnable() {
                    public void run() {
                        iZegoLivePlayerCallback2.onRemoteCameraStatusUpdate(str2, i3, i4);
                    }
                };
                handler.post(r1);
            }
        }
    }

    public final void onRemoteMicStatusUpdate(String str, int i, int i2) {
        if (this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) {
            final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback;
            if (iZegoLivePlayerCallback2 != null) {
                Handler handler = this.mUIHandler;
                final String str2 = str;
                final int i3 = i;
                final int i4 = i2;
                C4727518 r1 = new Runnable() {
                    public void run() {
                        iZegoLivePlayerCallback2.onRemoteMicStatusUpdate(str2, i3, i4);
                    }
                };
                handler.post(r1);
            }
        }
    }

    public final void onStreamUpdated(int i, ZegoStreamInfo[] zegoStreamInfoArr, String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            Handler handler = this.mUIHandler;
            final int i2 = i;
            final ZegoStreamInfo[] zegoStreamInfoArr2 = zegoStreamInfoArr;
            final String str2 = str;
            C473209 r0 = new Runnable() {
                public void run() {
                    iZegoRoomCallback.onStreamUpdated(i2, zegoStreamInfoArr2, str2);
                }
            };
            handler.post(r0);
        }
    }

    public final void onUpdatePublishTargetState(final int i, final String str, int i2) {
        final IZegoUpdatePublishTargetCallback iZegoUpdatePublishTargetCallback = (IZegoUpdatePublishTargetCallback) this.mMapUpdatePublishTargetCallback.remove(Integer.valueOf(i2));
        if (iZegoUpdatePublishTargetCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoUpdatePublishTargetCallback.onUpdatePublishTargetState(i, str);
                }
            });
        }
    }

    public final void onVideoSizeChanged(String str, int i, int i2) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            Handler handler = this.mUIHandler;
            final String str2 = str;
            final int i3 = i;
            final int i4 = i2;
            C4727316 r0 = new Runnable() {
                public void run() {
                    iZegoLivePlayerCallback.onVideoSizeChangedTo(str2, i3, i4);
                }
            };
            handler.post(r0);
        }
    }

    public final boolean startPlayingStream(String str, Object obj, String str2) {
        ZegoStreamExtraPlayInfo zegoStreamExtraPlayInfo = new ZegoStreamExtraPlayInfo();
        zegoStreamExtraPlayInfo.params = str2;
        return startPlayingStreamInner(str, obj, zegoStreamExtraPlayInfo);
    }

    private boolean _initSDKInner(long j, byte[] bArr, Context context) {
        if (j == 0 || bArr == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_initSDK] failed, appSign is null");
            return false;
        } else if (!ZegoLiveRoomJNI.initSDK((int) j, bArr, context)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_initSDK], init failed");
            return false;
        } else {
            ZegoLiveRoomJNI.setZegoLiveRoomCallback(this);
            ZegoLiveRoomJNI.setZegoIMCallback(this);
            return true;
        }
    }

    public final boolean initSDK(long j, byte[] bArr, Context context) {
        if (context == null && (mContext == null || mContext.getAppContext() == null)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_initSDK] failed, context is null");
            return false;
        }
        if (mContext == null) {
            String str = sLogPath;
            if (str == null || str.length() == 0) {
                str = ZegoLogUtil.getLogPath(context);
            }
            ZegoLiveRoomJNI.setLogPathAndSize(str, 5242880, null, context);
        }
        if (context == null) {
            context = mContext.getAppContext();
        }
        return _initSDKInner(j, bArr, context);
    }

    public final void onCustomCommand(final int i, int i2, final String str) {
        final IZegoCustomCommandCallback iZegoCustomCommandCallback = (IZegoCustomCommandCallback) this.mMapCustomCommandCallback.get(Integer.valueOf(i2));
        if (iZegoCustomCommandCallback != null) {
            this.mUIHandler.post(new Runnable() {
                public void run() {
                    iZegoCustomCommandCallback.onSendCustomCommand(i, str);
                }
            });
            this.mMapCustomCommandCallback.remove(Integer.valueOf(i2));
        }
    }

    public final boolean addPublishTarget(String str, String str2, IZegoUpdatePublishTargetCallback iZegoUpdatePublishTargetCallback) {
        if (iZegoUpdatePublishTargetCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_addPublishTarget] failed, callback is null");
            return false;
        }
        int addPublishTarget = ZegoLiveRoomJNI.addPublishTarget(str, str2);
        if (addPublishTarget != -1) {
            if (this.mMapUpdatePublishTargetCallback.get(Integer.valueOf(addPublishTarget)) != null) {
                StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_addPublishTarget], unfinished add publish target, seq:");
                sb.append(addPublishTarget);
                ZegoLiveRoomJNI.logPrint(sb.toString());
            }
            this.mMapUpdatePublishTargetCallback.put(Integer.valueOf(addPublishTarget), iZegoUpdatePublishTargetCallback);
            return true;
        }
        StringBuilder sb2 = new StringBuilder("[Java_ZegoLiveRoom_addPublishTarget] failed, seq:");
        sb2.append(addPublishTarget);
        ZegoLiveRoomJNI.logPrint(sb2.toString());
        return false;
    }

    public final boolean deletePublishTarget(String str, String str2, IZegoUpdatePublishTargetCallback iZegoUpdatePublishTargetCallback) {
        if (iZegoUpdatePublishTargetCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_deletePublishTarget] failed, callback is null");
            return false;
        }
        int deletePublishTarget = ZegoLiveRoomJNI.deletePublishTarget(str, str2);
        if (deletePublishTarget != -1) {
            if (this.mMapUpdatePublishTargetCallback.get(Integer.valueOf(deletePublishTarget)) != null) {
                StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_deletePublishTarget], unfinished delete publish target, seq:");
                sb.append(deletePublishTarget);
                ZegoLiveRoomJNI.logPrint(sb.toString());
            }
            this.mMapUpdatePublishTargetCallback.put(Integer.valueOf(deletePublishTarget), iZegoUpdatePublishTargetCallback);
            return true;
        }
        StringBuilder sb2 = new StringBuilder("[Java_ZegoLiveRoom_deletePublishTarget] failed, seq:");
        sb2.append(deletePublishTarget);
        ZegoLiveRoomJNI.logPrint(sb2.toString());
        return false;
    }

    public final boolean initSDK(long j, byte[] bArr, IZegoInitSDKCompletionCallback iZegoInitSDKCompletionCallback) {
        this.mZegoInitSDKCallback = iZegoInitSDKCompletionCallback;
        if (mContext != null && mContext.getAppContext() != null) {
            return _initSDKInner(j, bArr, mContext.getAppContext().getApplicationContext());
        }
        throw new RuntimeException("must call setSDKContext(SDKContext) before any other methods");
    }

    public final boolean sendCustomCommand(ZegoUser[] zegoUserArr, String str, IZegoCustomCommandCallback iZegoCustomCommandCallback) {
        if (iZegoCustomCommandCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendCustomCommand] failed, callback is null");
            return false;
        }
        ZegoUser[] listOfLegalUser = getListOfLegalUser(zegoUserArr);
        if (listOfLegalUser == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendCustomCommand] failed, listMember is empty");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendCustomCommand] failed, content is empty");
            return false;
        } else {
            int sendCustomCommand = ZegoLiveRoomJNI.sendCustomCommand(listOfLegalUser, (long) listOfLegalUser.length, str);
            if (sendCustomCommand == -1) {
                return false;
            }
            if (this.mMapCustomCommandCallback.get(Integer.valueOf(sendCustomCommand)) != null) {
                StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_sendCustomCommand], unfinished custom command, seq:");
                sb.append(sendCustomCommand);
                ZegoLiveRoomJNI.logPrint(sb.toString());
            }
            this.mMapCustomCommandCallback.put(Integer.valueOf(sendCustomCommand), iZegoCustomCommandCallback);
            return true;
        }
    }

    public final void sendMediaSideInfo(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        ZegoLiveRoomJNI.sendMediaSideInfo(byteBuffer, i, z, i2);
    }

    public final boolean startPublishing2(String str, String str2, int i, int i2) {
        return startPublishInner2(str, str2, i, i2, null, null);
    }

    public final void onGetReliableMessage(int i, int i2, String str, ZegoReliableMessage[] zegoReliableMessageArr) {
        final IZegoGetReliableMessageCallback iZegoGetReliableMessageCallback = (IZegoGetReliableMessageCallback) this.mMapGetReliableMessageCallback.remove(Integer.valueOf(i2));
        if (iZegoGetReliableMessageCallback != null) {
            Handler handler = this.mUIHandler;
            final int i3 = i;
            final String str2 = str;
            final ZegoReliableMessage[] zegoReliableMessageArr2 = zegoReliableMessageArr;
            C4731554 r0 = new Runnable() {
                public void run() {
                    iZegoGetReliableMessageCallback.onGetReliableMessage(i3, str2, zegoReliableMessageArr2);
                }
            };
            handler.post(r0);
        }
    }

    public final void onInviteJoinLiveRequest(int i, String str, String str2, String str3) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            Handler handler = this.mUIHandler;
            final int i2 = i;
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            C4727114 r0 = new Runnable() {
                public void run() {
                    iZegoLivePlayerCallback.onInviteJoinLiveRequest(i2, str4, str5, str6);
                }
            };
            handler.post(r0);
        }
    }

    public final void onInviteJoinLiveResponse(int i, String str, String str2, int i2) {
        final IZegoResponseCallback iZegoResponseCallback = this.mInviteJoinLiveResponseCallback;
        if (this.mWaitingInviteJoinLiveResponseSeq == i2 && iZegoResponseCallback != null) {
            Handler handler = this.mUIHandler;
            final int i3 = i;
            final String str3 = str;
            final String str4 = str2;
            C4728628 r0 = new Runnable() {
                public void run() {
                    iZegoResponseCallback.onResponse(i3, str3, str4);
                }
            };
            handler.post(r0);
            this.mInviteJoinLiveResponseCallback = null;
            this.mWaitingInviteJoinLiveResponseSeq = 0;
        }
    }

    public final void onJoinLiveRequest(int i, String str, String str2, String str3) {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            Handler handler = this.mUIHandler;
            final int i2 = i;
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            C4728527 r0 = new Runnable() {
                public void run() {
                    iZegoLivePublisherCallback.onJoinLiveRequest(i2, str4, str5, str6);
                }
            };
            handler.post(r0);
        }
    }

    public final void onJoinLiveResponse(int i, String str, String str2, int i2) {
        final IZegoResponseCallback iZegoResponseCallback = this.mJoinLiveResponseCallback;
        if (this.mWaitingJoinLiveResponseSeq == i2 && iZegoResponseCallback != null) {
            Handler handler = this.mUIHandler;
            final int i3 = i;
            final String str3 = str;
            final String str4 = str2;
            C4727013 r0 = new Runnable() {
                public void run() {
                    iZegoResponseCallback.onResponse(i3, str3, str4);
                }
            };
            handler.post(r0);
            this.mJoinLiveResponseCallback = null;
            this.mWaitingJoinLiveResponseSeq = 0;
        }
    }

    public final void onRecvCustomCommand(String str, String str2, String str3, String str4) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            Handler handler = this.mUIHandler;
            final String str5 = str;
            final String str6 = str2;
            final String str7 = str3;
            final String str8 = str4;
            C4730343 r0 = new Runnable() {
                public void run() {
                    iZegoRoomCallback.onRecvCustomCommand(str5, str6, str7, str8);
                }
            };
            handler.post(r0);
        }
    }

    public final boolean startPublishing(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str3) || ZegoLiveRoomJNI.updateStreamExtraInfo(str3, 0)) {
            return startPublishInner(str, str2, i);
        }
        return false;
    }

    public final void onSendBigRoomMessage(int i, String str, int i2, String str2) {
        final IZegoBigRoomMessageCallback iZegoBigRoomMessageCallback = (IZegoBigRoomMessageCallback) this.mMapIMCallback.get(Integer.valueOf(i2));
        if (iZegoBigRoomMessageCallback != null) {
            Handler handler = this.mUIHandler;
            final int i3 = i;
            final String str3 = str;
            final String str4 = str2;
            C4730949 r1 = new Runnable() {
                public void run() {
                    iZegoBigRoomMessageCallback.onSendBigRoomMessage(i3, str3, str4);
                }
            };
            handler.post(r1);
            this.mMapIMCallback.remove(Integer.valueOf(i2));
        }
    }

    public final void onSendRoomMessage(int i, String str, int i2, long j) {
        final IZegoRoomMessageCallback iZegoRoomMessageCallback = (IZegoRoomMessageCallback) this.mMapIMCallback.get(Integer.valueOf(i2));
        if (iZegoRoomMessageCallback != null) {
            Handler handler = this.mUIHandler;
            final int i3 = i;
            final String str2 = str;
            final long j2 = j;
            C4730848 r1 = new Runnable() {
                public void run() {
                    iZegoRoomMessageCallback.onSendRoomMessage(i3, str2, j2);
                }
            };
            handler.post(r1);
            this.mMapIMCallback.remove(Integer.valueOf(i2));
        }
    }

    public final boolean loginRoom(String str, String str2, int i, IZegoLoginCompletionCallback iZegoLoginCompletionCallback) {
        if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_loginRoom] failed, roomID is empty");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (iZegoLoginCompletionCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_loginRoom] failed, callback is null");
            return false;
        }
        boolean loginRoom = ZegoLiveRoomJNI.loginRoom(str, str2, i);
        if (loginRoom) {
            if (this.mMapZegoLoginCompletionCallback.get(str) != null) {
                StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_loginRoom], unfinished room login: ");
                sb.append(str);
                ZegoLiveRoomJNI.logPrint(sb.toString());
            }
            this.mMapZegoLoginCompletionCallback.put(str, iZegoLoginCompletionCallback);
        }
        return loginRoom;
    }

    public final boolean sendBigRoomMessage(int i, int i2, String str, IZegoBigRoomMessageCallback iZegoBigRoomMessageCallback) {
        if (iZegoBigRoomMessageCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendBigRoomMessage] callback is null");
        }
        if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendBigRoomMessage] failed, content is empty");
            return false;
        }
        int sendBigRoomMessage = ZegoLiveRoomJNI.sendBigRoomMessage(i, i2, str);
        if (sendBigRoomMessage != -1) {
            if (this.mMapIMCallback.get(Integer.valueOf(sendBigRoomMessage)) != null) {
                StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_sendBigRoomMessage], unfinished send room message, seq:");
                sb.append(sendBigRoomMessage);
                ZegoLiveRoomJNI.logPrint(sb.toString());
            }
            if (iZegoBigRoomMessageCallback != null) {
                this.mMapIMCallback.put(Integer.valueOf(sendBigRoomMessage), iZegoBigRoomMessageCallback);
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder("[Java_ZegoLiveRoom_sendBigRoomMessage] failed, seq:");
        sb2.append(sendBigRoomMessage);
        ZegoLiveRoomJNI.logPrint(sb2.toString());
        return false;
    }

    public final boolean sendReliableMessage(String str, String str2, long j, IZegoSendReliableMessageCallback iZegoSendReliableMessageCallback) {
        if (iZegoSendReliableMessageCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendReliableMessage] callback is null");
        }
        if (TextUtils.isEmpty(str2)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendReliableMessage] failed, type is empty");
            return false;
        }
        if (str == null) {
            str = "";
        }
        int sendReliableMessage = ZegoLiveRoomJNI.sendReliableMessage(str, str2, j);
        if (sendReliableMessage != -1) {
            if (this.mMapSendReliableMessageCallback.get(Integer.valueOf(sendReliableMessage)) != null) {
                StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_sendReliableMessage], unfinished send reliable message, seq:");
                sb.append(sendReliableMessage);
                ZegoLiveRoomJNI.logPrint(sb.toString());
            }
            if (iZegoSendReliableMessageCallback != null) {
                this.mMapSendReliableMessageCallback.put(Integer.valueOf(sendReliableMessage), iZegoSendReliableMessageCallback);
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder("[Java_ZegoLiveRoom_sendReliableMessage] failed, seq:");
        sb2.append(sendReliableMessage);
        ZegoLiveRoomJNI.logPrint(sb2.toString());
        return false;
    }

    public final boolean sendRoomMessage(int i, int i2, String str, IZegoRoomMessageCallback iZegoRoomMessageCallback) {
        if (iZegoRoomMessageCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendRoomMessage] failed, callback is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendRoomMessage] failed, content is empty");
            return false;
        } else {
            int sendRoomMessageEx = ZegoLiveRoomJNI.sendRoomMessageEx(i, i2, str);
            if (sendRoomMessageEx != -1) {
                if (this.mMapIMCallback.get(Integer.valueOf(sendRoomMessageEx)) != null) {
                    StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_sendRoomMessage], unfinished send room message, seq:");
                    sb.append(sendRoomMessageEx);
                    ZegoLiveRoomJNI.logPrint(sb.toString());
                }
                this.mMapIMCallback.put(Integer.valueOf(sendRoomMessageEx), iZegoRoomMessageCallback);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("[Java_ZegoLiveRoom_sendRoomMessage] failed, seq:");
            sb2.append(sendRoomMessageEx);
            ZegoLiveRoomJNI.logPrint(sb2.toString());
            return false;
        }
    }

    public final void setMediaSideFlags(boolean z, boolean z2, int i, int i2, int i3) {
        ZegoLiveRoomJNI.setMediaSideFlags(z, z2, i, i2, i3);
    }

    public final void onAudioPrep(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2) {
        IZegoAudioPrepCallback iZegoAudioPrepCallback = this.mZegoAudioPrepCallback;
        if (iZegoAudioPrepCallback != null) {
            iZegoAudioPrepCallback.onAudioPrep(byteBuffer, i, i2, i3, byteBuffer2);
        }
    }

    public final void queueInputBuffer(int i, String str, int i2, int i3, int i4) {
        IZegoExternalRenderCallback iZegoExternalRenderCallback = this.mZegoExternalRenderCallback;
        if (iZegoExternalRenderCallback != null) {
            iZegoExternalRenderCallback.queueInputBuffer(i, str, i2, i3, i4);
        }
    }

    public final void onSendReliableMessage(int i, int i2, String str, String str2, long j) {
        final IZegoSendReliableMessageCallback iZegoSendReliableMessageCallback = (IZegoSendReliableMessageCallback) this.mMapSendReliableMessageCallback.remove(Integer.valueOf(i2));
        if (iZegoSendReliableMessageCallback != null) {
            Handler handler = this.mUIHandler;
            final int i3 = i;
            final String str3 = str;
            final String str4 = str2;
            final long j2 = j;
            C4731453 r0 = new Runnable() {
                public void run() {
                    iZegoSendReliableMessageCallback.onSendReliableMessage(i3, str3, str4, j2);
                }
            };
            handler.post(r0);
        }
    }

    public final boolean startPublishing2(String str, String str2, int i, String str3, int i2) {
        return startPublishInner2(str, str2, i, i2, str3, null);
    }

    public final void onAudioRecordCallback(byte[] bArr, int i, int i2, int i3, int i4) {
        final IZegoAudioRecordCallback2 iZegoAudioRecordCallback2 = this.mZegoAudioRecordCallback2;
        if (iZegoAudioRecordCallback2 != null) {
            Handler handler = this.mUIHandler;
            final byte[] bArr2 = bArr;
            final int i5 = i;
            final int i6 = i2;
            final int i7 = i3;
            final int i8 = i4;
            C4730040 r0 = new Runnable() {
                public void run() {
                    iZegoAudioRecordCallback2.onAudioRecordCallback(bArr2, i5, i6, i7, i8);
                }
            };
            handler.post(r0);
            return;
        }
        final IZegoAudioRecordCallback iZegoAudioRecordCallback = this.mZegoAudioRecordCallback;
        if (iZegoAudioRecordCallback != null) {
            Handler handler2 = this.mUIHandler;
            final byte[] bArr3 = bArr;
            final int i9 = i;
            final int i10 = i2;
            final int i11 = i3;
            C4730141 r02 = new Runnable() {
                public void run() {
                    iZegoAudioRecordCallback.onAudioRecordCallback(bArr3, i9, i10, i11);
                }
            };
            handler2.post(r02);
        }
    }

    public final boolean sendRoomMessage(int i, int i2, int i3, String str, IZegoRoomMessageCallback iZegoRoomMessageCallback) {
        if (iZegoRoomMessageCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendRoomMessage] failed, callback is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendRoomMessage] failed, content is empty");
            return false;
        } else {
            int sendRoomMessage = ZegoLiveRoomJNI.sendRoomMessage(i, i2, i3, str);
            if (sendRoomMessage != -1) {
                if (this.mMapIMCallback.get(Integer.valueOf(sendRoomMessage)) != null) {
                    StringBuilder sb = new StringBuilder("[Java_ZegoLiveRoom_sendRoomMessage], unfinished send room message, seq:");
                    sb.append(sendRoomMessage);
                    ZegoLiveRoomJNI.logPrint(sb.toString());
                }
                this.mMapIMCallback.put(Integer.valueOf(sendRoomMessage), iZegoRoomMessageCallback);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("[Java_ZegoLiveRoom_sendRoomMessage] failed, seq:");
            sb2.append(sendRoomMessage);
            ZegoLiveRoomJNI.logPrint(sb2.toString());
            return false;
        }
    }

    private boolean startPublishInner2(String str, String str2, int i, int i2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        if (TextUtils.isEmpty(str3) || ZegoLiveRoomJNI.updateStreamExtraInfo(str3, i2)) {
            return ZegoLiveRoomJNI.startPublishing2(str, str2, i, i2, str4);
        }
        return false;
    }

    public final boolean startPublishing2(String str, String str2, int i, String str3, String str4, int i2) {
        return startPublishInner2(str, str2, i, i2, str3, str4);
    }
}

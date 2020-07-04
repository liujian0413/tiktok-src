package com.zego.zegoliveroom;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.zego.zegoavkit2.ZegoStreamExtraPlayInfo;
import com.zego.zegoavkit2.entities.ZegoStreamRelayCDNInfo;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamInfo;
import com.zego.zegoliveroom.entity.AuxData;
import com.zego.zegoliveroom.entity.ZegoAudioFrame;
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
import com.zego.zegoliveroom.utils.SoLoadUtil;
import java.nio.ByteBuffer;
import java.util.HashMap;

final class ZegoLiveRoomJNI {
    private static volatile boolean hasInitSuccess;
    private static volatile IJniZegoIMCallback sJNIZegoIMCallback;
    private static volatile IJniZegoLiveRoomCallback sJNIZegoLiveRoomCallback;

    interface IJniZegoIMCallback {
        void onRecvBigRoomMessage(String str, ZegoBigRoomMessage[] zegoBigRoomMessageArr);

        void onRecvRoomMessage(String str, ZegoRoomMessage[] zegoRoomMessageArr);

        void onSendBigRoomMessage(int i, String str, int i2, String str2);

        void onSendRoomMessage(int i, String str, int i2, long j);

        void onUpdateOnlineCount(String str, int i);

        void onUserUpdate(ZegoUserState[] zegoUserStateArr, int i);
    }

    interface IJniZegoLiveRoomCallback {
        int dequeueInputBuffer(int i, int i2, int i3);

        ByteBuffer getInputBuffer(int i);

        void onAVEngineStart();

        void onAVEngineStop();

        void onAudioPrep(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2);

        ZegoAudioFrame onAudioPrep2(ZegoAudioFrame zegoAudioFrame);

        void onAudioRecordCallback(byte[] bArr, int i, int i2, int i3, int i4);

        AuxData onAuxCallback(int i);

        void onCaptureAudioFirstFrame();

        void onCaptureVideoFirstFrame();

        void onCaptureVideoFirstFrame(int i);

        void onCaptureVideoSizeChanged(int i, int i2);

        void onCaptureVideoSizeChanged(int i, int i2, int i3);

        void onCustomCommand(int i, int i2, String str);

        void onDeviceError(String str, int i);

        void onDisconnect(int i, String str);

        void onEndJoinLive(int i, int i2, String str);

        void onGetReliableMessage(int i, int i2, String str, ZegoReliableMessage[] zegoReliableMessageArr);

        void onInitSDK(int i);

        void onInviteJoinLiveRequest(int i, String str, String str2, String str3);

        void onInviteJoinLiveResponse(int i, String str, String str2, int i2);

        void onJoinLiveRequest(int i, String str, String str2, String str3);

        void onJoinLiveResponse(int i, String str, String str2, int i2);

        void onKickOut(int i, String str, String str2);

        void onLiveEvent(int i, HashMap<String, String> hashMap);

        void onLogUploadResult(int i);

        void onLogWillOverwrite();

        void onLoginRoom(int i, String str, ZegoStreamInfo[] zegoStreamInfoArr);

        void onMediaSideCallback(String str, ByteBuffer byteBuffer, int i);

        void onMixStreamConfigUpdate(int i, String str, HashMap<String, Object> hashMap);

        void onPlayQualityUpdate(String str, ZegoPlayStreamQuality zegoPlayStreamQuality);

        void onPlayStateUpdate(int i, String str);

        void onPreviewSnapshot(int i, Bitmap bitmap);

        void onPreviewSnapshot(Bitmap bitmap);

        void onPublishQulityUpdate(String str, ZegoPublishStreamQuality zegoPublishStreamQuality);

        void onPublishStateUpdate(int i, String str, HashMap<String, Object> hashMap);

        void onReconnect(int i, String str);

        void onRecvCustomCommand(String str, String str2, String str3, String str4);

        void onRecvEndJoinLiveCommand(String str, String str2, String str3);

        void onRecvReliableMessage(String str, ZegoReliableMessage zegoReliableMessage);

        void onRecvRemoteAudioFirstFrame(String str);

        void onRecvRemoteVideoFirstFrame(String str);

        void onRelayCDNStateUpdate(ZegoStreamRelayCDNInfo[] zegoStreamRelayCDNInfoArr, String str);

        void onRemoteCameraStatusUpdate(String str, int i, int i2);

        void onRemoteMicStatusUpdate(String str, int i, int i2);

        void onRenderRemoteVideoFirstFrame(String str);

        void onSendReliableMessage(int i, int i2, String str, String str2, long j);

        void onSnapshot(Bitmap bitmap, String str);

        void onStreamExtraInfoUpdated(ZegoStreamInfo[] zegoStreamInfoArr, String str);

        void onStreamUpdated(int i, ZegoStreamInfo[] zegoStreamInfoArr, String str);

        void onTempBroken(int i, String str);

        void onUpdatePublishTargetState(int i, String str, int i2);

        void onUpdateReliableMessageInfo(String str, ZegoReliableMessageInfo[] zegoReliableMessageInfoArr);

        void onVideoSizeChanged(String str, int i, int i2);

        void queueInputBuffer(int i, String str, int i2, int i3, int i4);
    }

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    ZegoLiveRoomJNI() {
    }

    static native int activateAudioPlayStream(String str, boolean z);

    static native int activateVideoPlayStream(String str, boolean z, int i);

    public static native int addPublishTarget(String str, String str2);

    public static native int createConversation(String str, ZegoUser[] zegoUserArr, long j);

    public static native int deletePublishTarget(String str, String str2);

    public static native void enableAEC(boolean z);

    static native void enableAECWhenHeadsetDetected(boolean z);

    public static native void enableAGC(boolean z);

    public static native void enableAudioPrep(boolean z);

    public static native void enableAudioPrep2(boolean z, ZegoExtPrepSet zegoExtPrepSet);

    public static native boolean enableAudioRecord(boolean z);

    public static native boolean enableAux(boolean z);

    public static native boolean enableBeautifying(int i, int i2);

    public static native boolean enableCamera(boolean z, int i);

    public static native boolean enableCaptureMirror(boolean z, int i);

    public static native void enableCheckPoc(boolean z);

    public static native void enableDTX(boolean z);

    public static native void enableExternalRender(boolean z);

    public static native boolean enableLoopback(boolean z);

    public static native boolean enableMic(boolean z);

    public static native boolean enableMicDevice(boolean z);

    public static native boolean enableNoiseSuppress(boolean z);

    public static native boolean enablePreviewMirror(boolean z, int i);

    public static native boolean enableRateControl(boolean z, int i);

    public static native boolean enableSelectedAudioRecord(int i, int i2, int i3);

    public static native boolean enableSpeaker(boolean z);

    public static native boolean enableTorch(boolean z, int i);

    public static native void enableTrafficControl(int i, boolean z);

    public static native void enableVAD(boolean z);

    public static native int endJoinLive(String str);

    public static native int getAudioRouteType();

    public static native float getCaptureSoundLevel();

    public static native boolean getConversationInfo(String str);

    public static native int getMaxPlayChannelCount();

    static native int getReliableMessage(String[] strArr);

    static native String getServiceUrl(String str);

    public static native float getSoundLevelOfStream(String str);

    public static native boolean initSDK(int i, byte[] bArr, Context context);

    public static native int inviteJoinLive(String str);

    public static native void logPrint(String str);

    public static native boolean loginRoom(String str, String str2, int i);

    public static native boolean logoutRoom();

    static native int muteAudioPublish(boolean z, int i);

    public static native boolean muteAux(boolean z);

    static native int muteVideoPublish(boolean z, int i);

    public static native void pauseModule(int i);

    public static native int requestJoinLive();

    public static native boolean requireHardwareDecoder(boolean z);

    public static native boolean requireHardwareEncoder(boolean z);

    public static native boolean respondInviteJoinLiveReq(int i, int i2);

    public static native boolean respondJoinLiveReq(int i, int i2);

    public static native void resumeModule(int i);

    public static native int sendBigRoomMessage(int i, int i2, String str);

    public static native int sendConversationMessage(int i, String str, String str2);

    public static native int sendCustomCommand(ZegoUser[] zegoUserArr, long j, String str);

    public static native void sendMediaSideInfo(ByteBuffer byteBuffer, int i, boolean z, int i2);

    static native int sendReliableMessage(String str, String str2, long j);

    public static native int sendRoomMessage(int i, int i2, int i3, String str);

    public static native int sendRoomMessageEx(int i, int i2, String str);

    public static native void setAECMode(int i);

    public static native void setAlphaEnv(boolean z);

    public static native boolean setAppOrientation(int i, int i2);

    public static native boolean setAudioBitrate(int i);

    public static native void setAudioChannelCount(int i);

    public static native boolean setAudioDevice(int i, String str);

    public static native void setAudioDeviceMode(int i);

    public static native boolean setAudioEqualizerGain(int i, float f);

    public static native void setAuxVolume(int i);

    public static native boolean setBluetoothOn(boolean z);

    public static native boolean setBuiltInSpeakerOn(boolean z);

    public static native void setBusinessType(int i);

    public static native void setCDNPublishTarget(String str, int i);

    public static native void setCapturePipelineScaleMode(int i);

    public static native void setCaptureVolume(int i);

    static native void setChannelExtraParam(String str, int i);

    static native void setConfig(String str);

    public static native void setCustomToken(String str);

    public static native boolean setFilter(int i, int i2);

    public static native boolean setFrontCam(boolean z, int i);

    public static native void setLatencyMode(int i);

    public static native boolean setLogPathAndSize(String str, long j, String str2, Context context);

    public static native void setLoopbackVolume(int i);

    public static native void setMediaSideCallback(boolean z);

    public static native void setMediaSideFlags(boolean z, boolean z2, int i, int i2, int i3);

    public static native void setMinVideoBitrateForTrafficControl(int i, int i2);

    public static native boolean setMixStreamConfig(String str, int i, int i2);

    public static native void setNetAgentSwitchMode(int i);

    public static native boolean setPlayQualityMonitorCycle(long j);

    public static native boolean setPlayVolume(int i);

    public static native boolean setPlayVolume2(int i, String str);

    public static native boolean setPolishFactor(float f, int i);

    public static native boolean setPolishStep(float f, int i);

    public static native boolean setPreviewRotation(int i, int i2);

    public static native boolean setPreviewView(Object obj, int i);

    public static native boolean setPreviewViewBackgroundColor(int i, int i2);

    public static native boolean setPreviewViewMode(int i, int i2);

    public static native void setPreviewWaterMarkRect(int i, int i2, int i3, int i4, int i5);

    public static native void setPublishConfig(String str, int i);

    public static native boolean setPublishQualityMonitorCycle(long j);

    public static native void setPublishWaterMarkRect(int i, int i2, int i3, int i4, int i5);

    public static native void setRoomConfig(boolean z, boolean z2);

    public static native void setRoomMaxUserCount(int i);

    public static native boolean setSharpenFactor(float f, int i);

    public static native void setTestEnv(boolean z);

    public static native boolean setUser(String str, String str2);

    public static native void setVerbose(boolean z);

    public static native boolean setVideoBitrate(int i, int i2);

    static native boolean setVideoCaptureDeviceId(String str, int i);

    public static native boolean setVideoCaptureResolution(int i, int i2, int i3);

    static native boolean setVideoCodecId(int i, int i2);

    public static native boolean setVideoEncodeResolution(int i, int i2, int i3);

    public static native void setVideoEncoderRateControlConfig(int i, int i2, int i3);

    public static native boolean setVideoFPS(int i, int i2);

    public static native boolean setVideoKeyFrameInterval(int i, int i2);

    public static native boolean setVideoMirrorMode(int i, int i2);

    public static native boolean setViewBackgroundColor(int i, String str);

    public static native boolean setViewMode(int i, String str);

    public static native boolean setViewRotation(int i, String str);

    public static native void setWaterMarkImagePath(String str, int i);

    public static native boolean setWhitenFactor(float f, int i);

    public static native boolean startPlayingStream(String str, Object obj, ZegoStreamExtraPlayInfo zegoStreamExtraPlayInfo);

    public static native boolean startPreview(int i);

    public static native boolean startPublishing(String str, String str2, int i);

    public static native boolean startPublishing2(String str, String str2, int i, int i2, String str3);

    public static native boolean stopPlayingStream(String str);

    public static native boolean stopPreview(int i);

    public static native boolean stopPublishing(int i);

    public static native boolean takePreviewSnapshot(int i);

    public static native boolean takeSnapshot(String str);

    public static native boolean unInitSDK();

    public static native boolean updateMixInputStreams(ZegoMixStreamInfo[] zegoMixStreamInfoArr);

    public static native boolean updatePlayView(String str, Object obj);

    public static native boolean updateStreamExtraInfo(String str, int i);

    public static native void uploadLog();

    public static native String version();

    public static native String version2();

    public static void onAVEngineStart() {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onAVEngineStart();
        }
    }

    public static void onAVEngineStop() {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onAVEngineStop();
        }
    }

    public static void onCaptureAudioFirstFrame() {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onCaptureAudioFirstFrame();
        }
    }

    public static void onCaptureVideoFirstFrame() {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onCaptureVideoFirstFrame();
        }
    }

    public static void onLogWillOverwrite() {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onLogWillOverwrite();
        }
    }

    static {
        try {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("zegoliveroom");
            hasInitSuccess = true;
        } catch (UnsatisfiedLinkError unused) {
            hasInitSuccess = false;
        }
    }

    static void setZegoIMCallback(IJniZegoIMCallback iJniZegoIMCallback) {
        sJNIZegoIMCallback = iJniZegoIMCallback;
    }

    static void setZegoLiveRoomCallback(IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback) {
        sJNIZegoLiveRoomCallback = iJniZegoLiveRoomCallback;
    }

    public static void onInitSDK(int i) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onInitSDK(i);
        }
    }

    public static void onLogUploadResult(int i) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onLogUploadResult(i);
        }
    }

    public static void onRecvRemoteAudioFirstFrame(String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onRecvRemoteAudioFirstFrame(str);
        }
    }

    public static void onRecvRemoteVideoFirstFrame(String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onRecvRemoteVideoFirstFrame(str);
        }
    }

    public static void onRenderRemoteVideoFirstFrame(String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onRenderRemoteVideoFirstFrame(str);
        }
    }

    public static ByteBuffer getInputBuffer(int i) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            return iJniZegoLiveRoomCallback.getInputBuffer(i);
        }
        return null;
    }

    public static ZegoAudioFrame onAudioPrep2(ZegoAudioFrame zegoAudioFrame) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            return iJniZegoLiveRoomCallback.onAudioPrep2(zegoAudioFrame);
        }
        return null;
    }

    public static AuxData onAuxCallback(int i) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            return iJniZegoLiveRoomCallback.onAuxCallback(i);
        }
        return null;
    }

    public static void onCaptureVideoFirstFrame(int i) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onCaptureVideoFirstFrame(i);
        }
    }

    public static void onPreviewSnapshot(Bitmap bitmap) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onPreviewSnapshot(bitmap);
        }
    }

    public static void onCaptureVideoSizeChanged(int i, int i2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onCaptureVideoSizeChanged(i, i2);
        }
    }

    public static void onDeviceError(String str, int i) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onDeviceError(str, i);
        }
    }

    public static void onDisconnect(int i, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onDisconnect(i, str);
        }
    }

    public static void onPlayQualityUpdate(String str, ZegoPlayStreamQuality zegoPlayStreamQuality) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onPlayQualityUpdate(str, zegoPlayStreamQuality);
        }
    }

    public static void onPlayStateUpdate(int i, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onPlayStateUpdate(i, str);
        }
    }

    public static void onPreviewSnapshot(int i, Bitmap bitmap) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onPreviewSnapshot(i, bitmap);
        }
    }

    public static void onPublishQulityUpdate(String str, ZegoPublishStreamQuality zegoPublishStreamQuality) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onPublishQulityUpdate(str, zegoPublishStreamQuality);
        }
    }

    public static void onReconnect(int i, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onReconnect(i, str);
        }
    }

    public static void onRecvBigRoomMessage(String str, ZegoBigRoomMessage[] zegoBigRoomMessageArr) {
        IJniZegoIMCallback iJniZegoIMCallback = sJNIZegoIMCallback;
        if (iJniZegoIMCallback != null) {
            iJniZegoIMCallback.onRecvBigRoomMessage(str, zegoBigRoomMessageArr);
        }
    }

    public static void onRecvReliableMessage(String str, ZegoReliableMessage zegoReliableMessage) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onRecvReliableMessage(str, zegoReliableMessage);
        }
    }

    public static void onRecvRoomMessage(String str, ZegoRoomMessage[] zegoRoomMessageArr) {
        IJniZegoIMCallback iJniZegoIMCallback = sJNIZegoIMCallback;
        if (iJniZegoIMCallback != null) {
            iJniZegoIMCallback.onRecvRoomMessage(str, zegoRoomMessageArr);
        }
    }

    public static void onRelayCDNStateUpdate(ZegoStreamRelayCDNInfo[] zegoStreamRelayCDNInfoArr, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onRelayCDNStateUpdate(zegoStreamRelayCDNInfoArr, str);
        }
    }

    public static void onSnapshot(Bitmap bitmap, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onSnapshot(bitmap, str);
        }
    }

    public static void onTempBroken(int i, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onTempBroken(i, str);
        }
    }

    public static void onUpdateOnlineCount(String str, int i) {
        IJniZegoIMCallback iJniZegoIMCallback = sJNIZegoIMCallback;
        if (iJniZegoIMCallback != null) {
            iJniZegoIMCallback.onUpdateOnlineCount(str, i);
        }
    }

    public static void onUpdateReliableMessageInfo(String str, ZegoReliableMessageInfo[] zegoReliableMessageInfoArr) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onUpdateReliableMessageInfo(str, zegoReliableMessageInfoArr);
        }
    }

    public static void onUserUpdate(ZegoUserState[] zegoUserStateArr, int i) {
        IJniZegoIMCallback iJniZegoIMCallback = sJNIZegoIMCallback;
        if (iJniZegoIMCallback != null) {
            iJniZegoIMCallback.onUserUpdate(zegoUserStateArr, i);
        }
    }

    static int ensureSoLoaded(Context context, String str) {
        int i = -1;
        if (hasInitSuccess || TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            try {
                boolean loadSpecialLibrary = SoLoadUtil.loadSpecialLibrary(str, context);
                hasInitSuccess = loadSpecialLibrary;
                if (loadSpecialLibrary) {
                    i = 1;
                }
            } catch (Exception | UnsatisfiedLinkError unused) {
            }
        }
        if (hasInitSuccess) {
            return i;
        }
        try {
            boolean loadSoFile = SoLoadUtil.loadSoFile("libzegoliveroom.so", context);
            hasInitSuccess = loadSoFile;
            if (loadSoFile) {
                return 2;
            }
        } catch (UnsatisfiedLinkError unused2) {
        }
        return -2;
    }

    public static void onCustomCommand(int i, int i2, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onCustomCommand(i, i2, str);
        }
    }

    public static void onEndJoinLive(int i, int i2, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onEndJoinLive(i, i2, str);
        }
    }

    public static void onKickOut(int i, String str, String str2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onKickOut(i, str, str2);
        }
    }

    public static void onMediaSideCallback(String str, ByteBuffer byteBuffer, int i) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onMediaSideCallback(str, byteBuffer, i);
        }
    }

    public static void onRecvEndJoinLiveCommand(String str, String str2, String str3) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onRecvEndJoinLiveCommand(str, str2, str3);
        }
    }

    public static void onRemoteCameraStatusUpdate(String str, int i, int i2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onRemoteCameraStatusUpdate(str, i, i2);
        }
    }

    public static void onRemoteMicStatusUpdate(String str, int i, int i2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onRemoteMicStatusUpdate(str, i, i2);
        }
    }

    public static void onStreamExtraInfoUpdated(ZegoStreamInfo[] zegoStreamInfoArr, long j, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onStreamExtraInfoUpdated(zegoStreamInfoArr, str);
        }
    }

    public static void onUpdatePublishTargetState(int i, String str, int i2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onUpdatePublishTargetState(i, str, i2);
        }
    }

    public static void onVideoSizeChanged(String str, int i, int i2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onVideoSizeChanged(str, i, i2);
        }
    }

    public static int dequeueInputBuffer(int i, int i2, int i3) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            return iJniZegoLiveRoomCallback.dequeueInputBuffer(i, i2, i3);
        }
        return -1;
    }

    public static void onCaptureVideoSizeChanged(int i, int i2, int i3) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onCaptureVideoSizeChanged(i, i2, i3);
        }
    }

    public static void onLiveEvent(int i, String[] strArr, String[] strArr2) {
        int i2;
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            HashMap hashMap = new HashMap();
            if (strArr.length <= strArr2.length) {
                i2 = strArr.length;
            } else {
                i2 = strArr2.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                hashMap.put(strArr[i3], strArr2[i3]);
            }
            iJniZegoLiveRoomCallback.onLiveEvent(i, hashMap);
        }
    }

    public static void onGetReliableMessage(int i, int i2, String str, ZegoReliableMessage[] zegoReliableMessageArr) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onGetReliableMessage(i, i2, str, zegoReliableMessageArr);
        }
    }

    public static void onInviteJoinLiveRequest(int i, String str, String str2, String str3) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onInviteJoinLiveRequest(i, str, str2, str3);
        }
    }

    public static void onInviteJoinLiveResponse(int i, String str, String str2, int i2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onInviteJoinLiveResponse(i, str, str2, i2);
        }
    }

    public static void onJoinLiveRequest(int i, String str, String str2, String str3) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onJoinLiveRequest(i, str, str2, str3);
        }
    }

    public static void onJoinLiveResponse(int i, String str, String str2, int i2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onJoinLiveResponse(i, str, str2, i2);
        }
    }

    public static void onLoginRoom(int i, String str, ZegoStreamInfo[] zegoStreamInfoArr, long j) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onLoginRoom(i, str, zegoStreamInfoArr);
        }
    }

    public static void onRecvCustomCommand(String str, String str2, String str3, String str4) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onRecvCustomCommand(str, str2, str3, str4);
        }
    }

    public static void onSendBigRoomMessage(int i, String str, int i2, String str2) {
        IJniZegoIMCallback iJniZegoIMCallback = sJNIZegoIMCallback;
        if (iJniZegoIMCallback != null) {
            iJniZegoIMCallback.onSendBigRoomMessage(i, str, i2, str2);
        }
    }

    public static void onStreamUpdated(int i, ZegoStreamInfo[] zegoStreamInfoArr, long j, String str) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onStreamUpdated(i, zegoStreamInfoArr, str);
        }
    }

    public static void onSendRoomMessage(int i, String str, int i2, long j) {
        IJniZegoIMCallback iJniZegoIMCallback = sJNIZegoIMCallback;
        if (iJniZegoIMCallback != null) {
            iJniZegoIMCallback.onSendRoomMessage(i, str, i2, j);
        }
    }

    public static void onAudioPrep(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onAudioPrep(byteBuffer, i, i2, i3, byteBuffer2);
        }
    }

    public static void onAudioRecordCallback(byte[] bArr, int i, int i2, int i3, int i4) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onAudioRecordCallback(bArr, i, i2, i3, i4);
        }
    }

    public static void onSendReliableMessage(int i, int i2, String str, String str2, long j) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.onSendReliableMessage(i, i2, str, str2, j);
        }
    }

    public static void queueInputBuffer(int i, String str, int i2, int i3, int i4) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            iJniZegoLiveRoomCallback.queueInputBuffer(i, str, i2, i3, i4);
        }
    }

    public static void onPublishStateUpdate(int i, String str, String[] strArr, String[] strArr2, String[] strArr3) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("streamID", str);
            hashMap.put("rtmpList", strArr);
            hashMap.put("flvList", strArr2);
            hashMap.put("hlsList", strArr3);
            iJniZegoLiveRoomCallback.onPublishStateUpdate(i, str, hashMap);
        }
    }

    public static void onMixStreamConfigUpdate(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i2) {
        IJniZegoLiveRoomCallback iJniZegoLiveRoomCallback = sJNIZegoLiveRoomCallback;
        if (iJniZegoLiveRoomCallback != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("mixStreamID", str);
            hashMap.put("rtmpList", strArr);
            hashMap.put("flvList", strArr2);
            hashMap.put("hlsList", strArr3);
            hashMap.put("nonExists", strArr4);
            hashMap.put("mixConfigSeq", Integer.valueOf(i2));
            iJniZegoLiveRoomCallback.onMixStreamConfigUpdate(i, str, hashMap);
        }
    }
}

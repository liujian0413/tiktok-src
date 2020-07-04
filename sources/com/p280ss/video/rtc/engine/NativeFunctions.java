package com.p280ss.video.rtc.engine;

import android.content.Context;
import com.p280ss.video.rtc.base.feedback.FeedbackOptions;
import com.p280ss.video.rtc.engine.handler.ByteRtcEngineEventHandler;
import com.p280ss.video.rtc.engine.handler.ByteRtcVideoFrameObserver;
import com.p280ss.video.rtc.engine.handler.EngineAudioDeviceEventHandler;
import com.p280ss.video.rtc.engine.utils.RtcRunnable;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.NativeFunctions */
public final class NativeFunctions {
    public static native int nativeAdjustAudioMixingPlayoutVolume(long j, int i);

    public static native int nativeAdjustAudioMixingPublishVolume(long j, int i);

    public static native int nativeAdjustAudioMixingVolume(long j, int i);

    public static native void nativeAdjustPlaybackSignalVolume(long j, int i);

    public static native void nativeAdjustRecordingSignalVolume(long j, int i);

    public static native long nativeCreateByteRtcEngine(Context context, String str, ByteRtcEngineEventHandler byteRtcEngineEventHandler, EglBase.Context context2);

    public static native void nativeDestroyByteRtcEngine(long j);

    public static native int nativeDisableAudio(long j);

    public static native void nativeDisableLiveTranscoding(long j);

    public static native int nativeDisableVideo(long j);

    public static native int nativeEnableAudio(long j);

    public static native int nativeEnableAudioVolumeIndication(long j, int i, int i2);

    public static native int nativeEnableAutoSubscribe(long j, boolean z);

    public static native void nativeEnableLiveTranscoding(long j, String str);

    public static native int nativeEnableLocalAudio(long j, boolean z);

    public static native int nativeEnableLocalVideo(long j, boolean z);

    public static native int nativeEnableSubscribeLocalStream(long j, boolean z);

    public static native int nativeEnableVideo(long j);

    public static native int nativeGetAudioMixingCurrentPosition(long j);

    public static native int nativeGetAudioMixingDuration(long j);

    public static native int nativeGetAudioMixingStreamCachedFrameNum(long j);

    public static native long nativeGetByteLogReport();

    public static native int nativeGetEffectVolume(long j, int i);

    public static native FeedbackOptions nativeGetFeedbackContent(Context context);

    public static native String nativeGetSDKVersion();

    public static native void nativeInvokeWorkerUninterruptibly(long j, RtcRunnable rtcRunnable);

    public static native int nativeJoinChannel(long j, String str, String str2, String str3, String str4, String str5);

    public static native int nativeLeaveChannel(long j);

    public static native int nativeMuteAllRemoteAudioStreams(long j, boolean z);

    public static native int nativeMuteAllRemoteVideoStreams(long j, boolean z);

    public static native int nativeMuteLocalAudioStream(long j, boolean z);

    public static native int nativeMuteLocalVideoStream(long j, boolean z);

    public static native int nativeMuteRemoteAudioStream(long j, String str, boolean z);

    public static native int nativeMuteRemoteVideoStream(long j, String str, boolean z);

    public static native void nativeOnAudioRoutingChanged(long j, int i);

    public static native void nativeOnCapturerStarted(long j, boolean z);

    public static native void nativeOnCapturerStopped(long j);

    public static native void nativeOnFrameCaptured(long j, VideoFrame videoFrame);

    public static native int nativePauseAllEffects(long j);

    public static native int nativePauseAudio(long j);

    public static native int nativePauseAudioMixing(long j);

    public static native int nativePauseEffect(long j, int i);

    public static native int nativePlayEffect(long j, int i, String str, boolean z, int i2, int i3);

    public static native int nativePreloadEffect(long j, int i, String str);

    public static native int nativePublishScreen(long j);

    public static native boolean nativePullExternalAudioFrame(long j, byte[] bArr, int i);

    public static native boolean nativePushAudioMixingStreamData(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalAudioFrame(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalVideoFrame(long j, VideoFrame videoFrame);

    public static native boolean nativePushScreenFrame(long j, VideoFrame videoFrame);

    public static native void nativeRegisterVideoFrameObserver(long j, ByteRtcVideoFrameObserver byteRtcVideoFrameObserver);

    public static native void nativeReportRtcCamera(long j, String str, boolean z, String str2);

    public static native void nativeReportSDKSelfError(long j, String str);

    public static native int nativeResumeAllEffects(long j);

    public static native int nativeResumeAudio(long j);

    public static native int nativeResumeAudioMixing(long j);

    public static native int nativeResumeEffect(long j, int i);

    public static native void nativeSdkAPICall(long j, int i, String str, String str2);

    public static native void nativeSendCustomMessage(long j, String str);

    public static native void nativeSendFeedback(Context context, FeedbackOptions feedbackOptions);

    public static native long nativeSendMessage(long j, String str, String str2);

    public static native void nativeSetApiServerHost(String str);

    public static native void nativeSetAudioDeviceObserver(long j, EngineAudioDeviceEventHandler engineAudioDeviceEventHandler);

    public static native int nativeSetAudioMixingPosition(long j, int i);

    public static native void nativeSetAudioPlayoutMixStream(long j, boolean z, int i, int i2);

    public static native int nativeSetChannelProfile(long j, int i);

    public static native int nativeSetClientRole(long j, int i);

    public static native int nativeSetDefaultAudioRouteToSpeakerPhone(long j, boolean z);

    public static native int nativeSetDefaultMuteAllRemoteAudioStreams(long j, boolean z);

    public static native int nativeSetDefaultMuteAllRemoteVideoStreams(long j, boolean z);

    public static native int nativeSetDeviceId(String str);

    public static native void nativeSetDnsResults(String str, String str2);

    public static native int nativeSetEffectsVolume(long j, int i);

    public static native int nativeSetEnableSpeakerphone(long j, boolean z);

    public static native void nativeSetExternalAudioDevice(long j, boolean z, int i, int i2, int i3);

    public static native void nativeSetExternalVideoSource(long j, boolean z);

    public static native void nativeSetHeadsetConnectionStatus(long j, boolean z);

    public static native int nativeSetMediaServerAddr(long j, String str);

    public static native void nativeSetSignalingHost(String str);

    public static native void nativeSetVideoCompositingLayout(long j, String str);

    public static native void nativeSetVideoProfile(long j, int i, boolean z);

    public static native void nativeSetVideoResolution(long j, int i, int i2, int i3, int i4);

    public static native void nativeSetVideoResolutions(long j, List<InternalVideoStreamDescription> list);

    public static native int nativeSetVolumeOfEffect(long j, int i, int i2);

    public static native int nativeStartAudioMixing(long j, String str, boolean z, boolean z2, int i);

    public static native int nativeStartAudioRoutingMonitoring(long j);

    public static native int nativeStartPreview(long j);

    public static native int nativeStopAllEffects(long j);

    public static native void nativeStopAudioMixing(long j);

    public static native int nativeStopAudioRoutingMonitoring(long j);

    public static native int nativeStopEffect(long j, int i);

    public static native int nativeStopPreview(long j);

    public static native void nativeSubscribeStream(long j, String str, boolean z, boolean z2, int i);

    public static native int nativeSwitchCamera(long j);

    public static native int nativeUnSubscribe(long j, String str);

    public static native int nativeUnloadAllEffects(long j);

    public static native int nativeUnloadEffect(long j, int i);

    public static native int nativeUnpublishScreen(long j);

    public static native void nativeUseDefaultSignalingServer(boolean z);
}

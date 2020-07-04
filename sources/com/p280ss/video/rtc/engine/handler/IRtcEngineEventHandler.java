package com.p280ss.video.rtc.engine.handler;

import com.p280ss.video.rtc.engine.ByteStream;
import com.p280ss.video.rtc.engine.InternalAudioVolumeInfo;
import com.p280ss.video.rtc.engine.InternalLocalAudioStats;
import com.p280ss.video.rtc.engine.InternalLocalVideoStats;
import com.p280ss.video.rtc.engine.InternalRemoteAudioStats;
import com.p280ss.video.rtc.engine.InternalRemoteVideoStats;
import com.p280ss.video.rtc.engine.InternalRtcStats;
import com.p280ss.video.rtc.engine.SubscribeConfig;
import com.p280ss.video.rtc.engine.SubscribeState;
import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler */
public abstract class IRtcEngineEventHandler {

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$AudioVolumeInfo */
    public static class AudioVolumeInfo {
        public String uid;
        public int volume;

        public AudioVolumeInfo(InternalAudioVolumeInfo internalAudioVolumeInfo) {
            this.uid = internalAudioVolumeInfo.uid;
            this.volume = internalAudioVolumeInfo.volume;
        }

        public AudioVolumeInfo(String str, int i) {
            this.uid = str;
            this.volume = i;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$LocalAudioStats */
    public static class LocalAudioStats {
        public float audioLossRate;
        public int rtt;
        public float sendKBitrate;
        public int statsInterval;

        public LocalAudioStats() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LocalAudioStats{audioLossRate='");
            sb.append(this.audioLossRate);
            sb.append('\'');
            sb.append(", sendKBitrate='");
            sb.append(this.sendKBitrate);
            sb.append('\'');
            sb.append(", rtt='");
            sb.append(this.rtt);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public LocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
            this.audioLossRate = internalLocalAudioStats.audioLossRate;
            this.sendKBitrate = (float) internalLocalAudioStats.sendKBitrate;
            this.statsInterval = internalLocalAudioStats.statsInterval;
            this.rtt = internalLocalAudioStats.rtt;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$LocalVideoStats */
    public static class LocalVideoStats {
        public int encoderOutputFrameRate;
        public int rendererOutputFrameRate;
        public int rtt;
        public int sentFrameRate;
        public float sentKBitrate;
        public int statsInterval;
        public int targetFrameRate;
        public int targetKBitrate;
        public float videoLossRate;

        public LocalVideoStats() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LocalVideoStats{sentKBitrate='");
            sb.append(this.sentKBitrate);
            sb.append('\'');
            sb.append(", sentFrameRate='");
            sb.append(this.sentFrameRate);
            sb.append('\'');
            sb.append(", encoderOutputFrameRate='");
            sb.append(this.encoderOutputFrameRate);
            sb.append('\'');
            sb.append(", rendererOutputFrameRate='");
            sb.append(this.rendererOutputFrameRate);
            sb.append('\'');
            sb.append(", targetKBitrate='");
            sb.append(this.targetKBitrate);
            sb.append('\'');
            sb.append(", targetFrameRate='");
            sb.append(this.targetFrameRate);
            sb.append('\'');
            sb.append(", videoLossRate='");
            sb.append(this.videoLossRate);
            sb.append('\'');
            sb.append(", rtt='");
            sb.append(this.rtt);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public LocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
            this.sentKBitrate = internalLocalVideoStats.sentKBitrate;
            this.sentFrameRate = internalLocalVideoStats.sentFrameRate;
            this.encoderOutputFrameRate = internalLocalVideoStats.encoderOutputFrameRate;
            this.rendererOutputFrameRate = internalLocalVideoStats.rendererOutputFrameRate;
            this.targetKBitrate = internalLocalVideoStats.targetKBitrate;
            this.targetFrameRate = internalLocalVideoStats.targetFrameRate;
            this.statsInterval = internalLocalVideoStats.statsInterval;
            this.videoLossRate = internalLocalVideoStats.videoLossRate;
            this.rtt = internalLocalVideoStats.rtt;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RemoteAudioStats */
    public static class RemoteAudioStats {
        public float audioLossRate;
        public long e2eDelay;
        public float receivedKBitrate;
        public int rtt;
        public int stallCount;
        public int stallDuration;
        public int statsInterval;
        public String uid;

        public RemoteAudioStats() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RemoteAudioStats{uid='");
            sb.append(this.uid);
            sb.append('\'');
            sb.append(", audioLossRate='");
            sb.append(this.audioLossRate);
            sb.append('\'');
            sb.append(", receivedKBitrate='");
            sb.append(this.receivedKBitrate);
            sb.append('\'');
            sb.append(", stallCount='");
            sb.append(this.stallCount);
            sb.append('\'');
            sb.append(", stallDuration='");
            sb.append(this.stallDuration);
            sb.append('\'');
            sb.append(", e2eDelay='");
            sb.append(this.e2eDelay);
            sb.append('\'');
            sb.append(", rtt='");
            sb.append(this.rtt);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public RemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
            this.uid = internalRemoteAudioStats.uid;
            this.audioLossRate = internalRemoteAudioStats.audioLossRate;
            this.receivedKBitrate = (float) internalRemoteAudioStats.receivedKBitrate;
            this.stallCount = internalRemoteAudioStats.stallCount;
            this.stallDuration = internalRemoteAudioStats.stallDuration;
            this.e2eDelay = internalRemoteAudioStats.e2eDelay;
            this.statsInterval = internalRemoteAudioStats.statsInterval;
            this.rtt = internalRemoteAudioStats.rtt;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RemoteVideoStats */
    public static class RemoteVideoStats {
        public int decoderOutputFrameRate;
        public long e2eDelay;
        public int height;
        public boolean isScreen;
        public float receivedKBitrate;
        public int rendererOutputFrameRate;
        public int rtt;
        public int stallCount;
        public int stallDuration;
        public int statsInterval;
        public String uid;
        public float videoLossRate;
        public int width;

        public RemoteVideoStats() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RemoteVideoStats{uid='");
            sb.append(this.uid);
            sb.append('\'');
            sb.append(", width='");
            sb.append(this.width);
            sb.append('\'');
            sb.append(", height='");
            sb.append(this.height);
            sb.append('\'');
            sb.append(", videoLossRate='");
            sb.append(this.videoLossRate);
            sb.append('\'');
            sb.append(", receivedKBitrate='");
            sb.append(this.receivedKBitrate);
            sb.append('\'');
            sb.append(", decoderOutputFrameRate='");
            sb.append(this.decoderOutputFrameRate);
            sb.append('\'');
            sb.append(", rendererOutputFrameRate='");
            sb.append(this.rendererOutputFrameRate);
            sb.append('\'');
            sb.append(", stallCount='");
            sb.append(this.stallCount);
            sb.append('\'');
            sb.append(", stallDuration='");
            sb.append(this.stallDuration);
            sb.append('\'');
            sb.append(", e2eDelay='");
            sb.append(this.e2eDelay);
            sb.append('\'');
            sb.append(", isScreen='");
            sb.append(this.isScreen);
            sb.append('\'');
            sb.append(", rtt='");
            sb.append(this.rtt);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public RemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
            this.uid = internalRemoteVideoStats.uid;
            this.width = internalRemoteVideoStats.width;
            this.height = internalRemoteVideoStats.height;
            this.videoLossRate = internalRemoteVideoStats.videoLossRate;
            this.receivedKBitrate = internalRemoteVideoStats.receivedKBitrate;
            this.decoderOutputFrameRate = internalRemoteVideoStats.decoderOutputFrameRate;
            this.rendererOutputFrameRate = internalRemoteVideoStats.rendererOutputFrameRate;
            this.stallCount = internalRemoteVideoStats.stallCount;
            this.e2eDelay = internalRemoteVideoStats.e2eDelay;
            this.isScreen = internalRemoteVideoStats.isScreen;
            this.statsInterval = internalRemoteVideoStats.statsInterval;
            this.rtt = internalRemoteVideoStats.rtt;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcErrorCode */
    public class RtcErrorCode {
        RtcErrorCode() {
        }
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcEventCode */
    public class RtcEventCode {
        RtcEventCode() {
        }
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel */
    public enum RtcLogLevel {
        RTC_LOG_LEVEL_TRACE,
        RTC_LOG_LEVEL_DEBUG,
        RTC_LOG_LEVEL_INFO,
        RTC_LOG_LEVEL_WARNING,
        RTC_LOG_LEVEL_ERROR
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcStats */
    public static class RtcStats {
        public double cpuAppUsage;
        public double cpuTotalUsage;
        public int rxAudioKBitRate;
        public long rxBytes;
        public int rxKBitRate;
        public int rxVideoKBitRate;
        public int totalDuration;
        public int txAudioKBitRate;
        public long txBytes;
        public int txKBitRate;
        public int txVideoKBitRate;
        public int users;

        public RtcStats() {
        }

        public void reset() {
            this.totalDuration = 0;
            this.txBytes = 0;
            this.rxBytes = 0;
            this.txKBitRate = 0;
            this.rxKBitRate = 0;
            this.txAudioKBitRate = 0;
            this.rxAudioKBitRate = 0;
            this.txVideoKBitRate = 0;
            this.rxVideoKBitRate = 0;
            this.users = 0;
            this.cpuTotalUsage = 0.0d;
            this.cpuAppUsage = 0.0d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RtcStats{totalDuration=");
            sb.append(this.totalDuration);
            sb.append(", txBytes=");
            sb.append(this.txBytes);
            sb.append(", rxBytes=");
            sb.append(this.rxBytes);
            sb.append(", txKBitRate=");
            sb.append(this.txKBitRate);
            sb.append(", rxKBitRate=");
            sb.append(this.rxKBitRate);
            sb.append(", txAudioKBitRate=");
            sb.append(this.txAudioKBitRate);
            sb.append(", rxAudioKBitRate=");
            sb.append(this.rxAudioKBitRate);
            sb.append(", txVideoKBitRate=");
            sb.append(this.txVideoKBitRate);
            sb.append(", rxVideoKBitRate=");
            sb.append(this.rxVideoKBitRate);
            sb.append(", users=");
            sb.append(this.users);
            sb.append(", cpuTotalUsage=");
            sb.append(this.cpuTotalUsage);
            sb.append(", cpuAppUsage=");
            sb.append(this.cpuAppUsage);
            sb.append('}');
            return sb.toString();
        }

        public RtcStats(InternalRtcStats internalRtcStats) {
            this.totalDuration = internalRtcStats.totalDuration;
            this.txBytes = (long) internalRtcStats.txBytes;
            this.rxBytes = (long) internalRtcStats.rxBytes;
            this.txKBitRate = internalRtcStats.txKBitRate;
            this.rxKBitRate = internalRtcStats.rxKBitRate;
            this.txAudioKBitRate = internalRtcStats.txAudioKBitRate;
            this.rxAudioKBitRate = internalRtcStats.rxAudioKBitRate;
            this.txVideoKBitRate = internalRtcStats.txVideoKBitRate;
            this.rxVideoKBitRate = internalRtcStats.rxVideoKBitRate;
            this.users = internalRtcStats.users;
            this.cpuTotalUsage = internalRtcStats.cpuTotalUsage;
            this.cpuAppUsage = internalRtcStats.cpuAppUsage;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcTransCodeingErrorCode */
    public class RtcTransCodeingErrorCode {
        RtcTransCodeingErrorCode() {
        }
    }

    /* renamed from: com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcWarnCode */
    public static class RtcWarnCode {
    }

    public void onActiveSpeaker(String str) {
    }

    public void onApiCallExecuted(String str, int i) {
    }

    public void onAudioEffectFinished(int i) {
    }

    public void onAudioMixingFinished() {
    }

    public void onAudioQuality(String str, int i, short s, short s2) {
    }

    public void onAudioRouteChanged(int i) {
    }

    public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
    }

    public void onCameraReady() {
    }

    public void onClientRoleChanged(int i, int i2) {
    }

    public void onConnectionBanned() {
    }

    public void onConnectionInterrupted() {
    }

    public void onConnectionLost() {
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    public void onCustomMessage(String str) {
    }

    public void onError(int i) {
    }

    public void onFirstLocalAudioFrame(int i) {
    }

    public void onFirstLocalScreenFrame(int i, int i2, int i3) {
    }

    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
    }

    public void onFirstRemoteAudioFrame(String str, long j) {
    }

    public void onFirstRemoteScreenFrame(String str, int i, int i2, int i3) {
    }

    public void onFirstRemoteVideoDecoded(String str, int i, int i2, int i3) {
    }

    public void onFirstRemoteVideoFrame(String str, int i, int i2, int i3) {
    }

    public void onInviteAcceptedByPeer(String str, String str2) {
    }

    public void onInviteEndByMyself(String str, String str2) {
    }

    public void onInviteEndByPeer(String str, String str2) {
    }

    public void onInviteFailed(String str, String str2, int i) {
    }

    public void onInviteReceivedByPeer(String str, String str2) {
    }

    public void onJoinChannelSuccess(String str, String str2, int i) {
    }

    public void onLastmileQuality(int i) {
    }

    public void onLeaveChannel(RtcStats rtcStats) {
    }

    public void onLocalAudioStats(LocalAudioStats localAudioStats) {
    }

    public void onLocalVideoStats(LocalVideoStats localVideoStats) {
    }

    public void onLogReport(String str, JSONObject jSONObject) {
    }

    public void onLoggerMessage(RtcLogLevel rtcLogLevel, String str, Throwable th) {
    }

    public void onMediaEngineLoadSuccess() {
    }

    public void onMediaEngineStartCallSuccess() {
    }

    public void onMessageReceived(String str, String str2) {
    }

    public void onMessageSendResult(long j, int i) {
    }

    public void onNetStateChanged(int i) {
    }

    public void onNetworkQuality(String str, int i, int i2) {
    }

    public void onProviderEvent(int i, String str, String str2) {
    }

    public void onRejoinChannelSuccess(String str, String str2, int i) {
    }

    public void onRemoteAudioStats(RemoteAudioStats remoteAudioStats) {
    }

    public void onRemoteAudioTransportStats(String str, int i, int i2, int i3) {
    }

    public void onRemoteVideoStateChanged(String str, int i) {
    }

    public void onRemoteVideoStats(RemoteVideoStats remoteVideoStats) {
    }

    public void onRequestToken() {
    }

    public void onResponse(String str) {
    }

    public void onRtcStats(RtcStats rtcStats) {
    }

    public void onScreenStreamRemove(String str, String str2) {
    }

    public void onSetupVideoError(String str, String str2) {
    }

    public void onStreamAdd(ByteStream byteStream) {
    }

    public void onStreamMessage(String str, int i, byte[] bArr) {
    }

    public void onStreamMessageError(String str, int i, int i2, int i3, int i4) {
    }

    public void onStreamPublishSucceed(String str) {
    }

    public void onStreamPublished(String str, int i) {
    }

    public void onStreamRemove(ByteStream byteStream) {
    }

    public void onStreamRemove(String str, String str2) {
    }

    public void onStreamSubscribed(SubscribeState subscribeState, String str, SubscribeConfig subscribeConfig) {
    }

    public void onUserEnableAudio(String str, boolean z) {
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
    }

    public void onUserEnableLocalVideo(String str, boolean z) {
    }

    public void onUserEnableVideo(String str, boolean z) {
    }

    public void onUserJoined(String str, int i) {
    }

    public void onUserMuteAudio(String str, boolean z) {
    }

    public void onUserMuteVideo(String str, boolean z) {
    }

    public void onUserOffline(String str, int i) {
    }

    public void onVideoSizeChanged(String str, int i, int i2, int i3) {
    }

    public void onVideoStopped() {
    }

    public void onWarning(int i) {
    }

    public void uploadLogFinished(boolean z) {
    }
}

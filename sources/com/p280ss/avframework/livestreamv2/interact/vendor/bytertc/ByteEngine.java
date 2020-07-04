package com.p280ss.avframework.livestreamv2.interact.vendor.bytertc;

import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import com.C1642a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClient;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.p280ss.avframework.livestreamv2.interact.engine.Engine;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.model.Config.AudioProfile;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Character;
import com.p280ss.avframework.livestreamv2.interact.model.Config.MixStreamConfig;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Type;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoCodec;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import com.p280ss.avframework.livestreamv2.interact.statistic.LogReporter;
import com.p280ss.avframework.livestreamv2.interact.statistic.RemoteUserStats;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p280ss.avframework.livestreamv2.interact.utils.LogUtil;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.AVLog.ILogFilter;
import com.p280ss.avframework.utils.LibraryLoader;
import com.p280ss.video.rtc.engine.RtcEngine;
import com.p280ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.AudioVolumeInfo;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.LocalAudioStats;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.LocalVideoStats;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RemoteAudioStats;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RemoteVideoStats;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcStats;
import com.p280ss.video.rtc.engine.live.LiveTranscoding;
import com.p280ss.video.rtc.engine.live.LiveTranscoding.AACProfile;
import com.p280ss.video.rtc.engine.live.LiveTranscoding.AudioConfig;
import com.p280ss.video.rtc.engine.live.LiveTranscoding.Layout;
import com.p280ss.video.rtc.engine.live.LiveTranscoding.Layout.Builder;
import com.p280ss.video.rtc.engine.live.LiveTranscoding.Layout.Region;
import com.p280ss.video.rtc.engine.live.LiveTranscoding.VideoConfig;
import com.p280ss.video.rtc.engine.loader.RtcNativeLibraryLoader;
import com.p280ss.video.rtc.engine.utils.ExtVideoFrame;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteEngine */
public class ByteEngine extends Engine {
    public ByteAudioClient mAudioClient;
    private IRtcEngineAudioDeviceEventHandler mAudioDeviceEventHandler = new IRtcEngineAudioDeviceEventHandler() {
        public void onAudioDevicePlayoutStart() {
            ByteAudioSink byteAudioSink = ByteEngine.this.mAudioSink;
            if (byteAudioSink != null) {
                byteAudioSink.onAudioDevicePlayoutStart();
            }
        }

        public void onAudioDevicePlayoutStop() {
            ByteAudioSink byteAudioSink = ByteEngine.this.mAudioSink;
            if (byteAudioSink != null) {
                byteAudioSink.onAudioDevicePlayoutStop();
            }
        }

        public void onAudioDeviceRecordStart() {
            ByteAudioClient byteAudioClient = ByteEngine.this.mAudioClient;
            if (byteAudioClient != null) {
                byteAudioClient.onAudioDeviceRecordStart();
            }
        }

        public void onAudioDeviceRecordStop() {
            ByteAudioClient byteAudioClient = ByteEngine.this.mAudioClient;
            if (byteAudioClient != null) {
                byteAudioClient.onAudioDeviceRecordStop();
            }
        }
    };
    public ByteAudioSink mAudioSink;
    public Map<Integer, ByteVideoSink> mByteVideoSinkMap = new ConcurrentHashMap();
    public final Object mLeaveChannelNotifier = new Object();
    public RtcEngine mRtcEngine;
    private IRtcEngineEventHandler mRtcEngineEventHandler = new IRtcEngineEventHandler() {
        public void onConnectionBanned() {
            ByteEngine.this.mLogReporter.onConnectFailed(-2, "onConnectionBanned");
            ByteEngine.this.mCallback.onError("byte onConnectionBanned");
            LogUtil.m143692e("byte onConnectionBanned");
        }

        public void onConnectionInterrupted() {
            ByteEngine.this.mLogReporter.onConnectFailed(-1, "onConnectionInterrupted");
            ByteEngine.this.mCallback.onWarn("byte onConnectionInterrupted");
            LogUtil.m143695w("byte onConnectionInterrupted");
        }

        public void onConnectionLost() {
            ByteEngine.this.mLogReporter.onConnectionLost();
            ByteEngine.this.mCallback.onWarn("byte onConnectionLost");
            LogUtil.m143695w("byte onConnectionLost");
        }

        public void onLeaveChannel(RtcStats rtcStats) {
            LogUtil.m143691d("onLeaveChannel");
            synchronized (ByteEngine.this.mLeaveChannelNotifier) {
                ByteEngine.this.mLeaveChannelNotifier.notifyAll();
            }
        }

        public void onLocalAudioStats(LocalAudioStats localAudioStats) {
            ByteEngine.this.mSendAudioLoss = (int) (localAudioStats.audioLossRate * 100.0f);
            ByteEngine.this.mSendAudioRTT = localAudioStats.rtt;
        }

        public void onLocalVideoStats(LocalVideoStats localVideoStats) {
            ByteEngine.this.mSendVideoFrameRate = localVideoStats.sentFrameRate;
            ByteEngine.this.mSendEncoderOutputFrameRate = localVideoStats.encoderOutputFrameRate;
            ByteEngine.this.mSendVideoLoss = (int) (localVideoStats.videoLossRate * 100.0f);
            ByteEngine.this.mSendVideoRTT = localVideoStats.rtt;
        }

        public void onRemoteAudioStats(RemoteAudioStats remoteAudioStats) {
            RemoteUserStats remoteUserStatsByUID = ByteEngine.this.getRemoteUserStatsByUID(remoteAudioStats.uid);
            if (remoteUserStatsByUID != null) {
                remoteUserStatsByUID.setAudioBitrate((int) remoteAudioStats.receivedKBitrate);
                remoteUserStatsByUID.setAudioLossRate((int) remoteAudioStats.audioLossRate);
                remoteUserStatsByUID.setAudioDelay((int) remoteAudioStats.e2eDelay);
                remoteUserStatsByUID.setAudioRTT(remoteAudioStats.rtt);
            }
        }

        public void onRemoteVideoStats(RemoteVideoStats remoteVideoStats) {
            RemoteUserStats remoteUserStatsByUID = ByteEngine.this.getRemoteUserStatsByUID(remoteVideoStats.uid);
            if (remoteUserStatsByUID != null) {
                remoteUserStatsByUID.setVideoBitrate((int) remoteVideoStats.receivedKBitrate);
                remoteUserStatsByUID.setVideoDecodeFps(remoteVideoStats.decoderOutputFrameRate);
                remoteUserStatsByUID.setVideoLossRate((int) (remoteVideoStats.videoLossRate * 100.0f));
                remoteUserStatsByUID.setVideoRTT(remoteVideoStats.rtt);
            }
        }

        public void onRtcStats(RtcStats rtcStats) {
            ByteEngine.this.mCallback.onPushStreamQuality((long) rtcStats.txVideoKBitRate, (long) rtcStats.txAudioKBitRate);
            ByteEngine.this.mSendAudioBitrate = rtcStats.txAudioKBitRate;
            ByteEngine.this.mReceiveAudioBitrate = rtcStats.rxAudioKBitRate;
            ByteEngine.this.mSendVideoBitrate = rtcStats.txVideoKBitRate;
            ByteEngine.this.mReceiveVideoBitrate = rtcStats.rxVideoKBitRate;
            ByteEngine.this.mUserCount = rtcStats.users;
        }

        public void onWarning(int i) {
            ByteEngine.this.mLogReporter.onWarningOccurs(i, String.valueOf(ByteEngine.this.mConfig.getInteractId()));
            EngineCallback engineCallback = ByteEngine.this.mCallback;
            StringBuilder sb = new StringBuilder("byte onWarning, code: ");
            sb.append(i);
            engineCallback.onWarn(sb.toString());
            StringBuilder sb2 = new StringBuilder("byte warning: ");
            sb2.append(i);
            LogUtil.m143695w(sb2.toString());
        }

        public void onError(int i) {
            ByteEngine.this.mLogReporter.onErrorOccurs(i, String.valueOf(ByteEngine.this.mConfig.getInteractId()), ByteEngine.this.mConfig.getByteToken());
            EngineCallback engineCallback = ByteEngine.this.mCallback;
            StringBuilder sb = new StringBuilder("byte onError, code: ");
            sb.append(i);
            engineCallback.onError(sb.toString());
            StringBuilder sb2 = new StringBuilder("byte error: ");
            sb2.append(i);
            LogUtil.m143692e(sb2.toString());
        }

        public void onLogReport(String str, JSONObject jSONObject) {
            ByteEngine.this.mCallback.onLogReport(str, jSONObject);
        }

        public void onStreamPublished(String str, int i) {
            StringBuilder sb = new StringBuilder("IRtcEngineEventHandler.onRtmpStreamingStateChanged: url ");
            sb.append(str);
            ByteEngine.this.mLogReporter.onStreamStateChange(i, sb.toString(), 0);
        }

        public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            int i2;
            boolean z;
            int length = audioVolumeInfoArr.length;
            String[] strArr = new String[length];
            boolean[] zArr = new boolean[length];
            int volumeThreshold = ByteEngine.this.mConfig.getVolumeThreshold();
            for (int i3 = 0; i3 < length; i3++) {
                AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i3];
                try {
                    int parseInt = Integer.parseInt(audioVolumeInfo.uid);
                    if (parseInt == 0) {
                        i2 = ByteEngine.this.mConfig.getInteractId();
                    } else {
                        i2 = parseInt;
                    }
                    strArr[i3] = String.valueOf(i2);
                    if (audioVolumeInfo.volume >= volumeThreshold) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zArr[i3] = z;
                    if (parseInt != ByteEngine.this.mConfig.getInteractId()) {
                        RemoteUserStats remoteUserStatsByUID = ByteEngine.this.getRemoteUserStatsByUID(audioVolumeInfo.uid);
                        if (remoteUserStatsByUID != null) {
                            remoteUserStatsByUID.setAudioVoiceVolume((int) ((((float) audioVolumeInfo.volume) / 255.0f) * 100.0f));
                        }
                    }
                } catch (NumberFormatException e) {
                    LogUtil.m143692e(e.toString());
                }
            }
            ByteEngine.this.onTalkStateUpdated(strArr, zArr);
        }

        public void onFirstRemoteAudioFrame(String str, long j) {
            StringBuilder sb = new StringBuilder("onFirstRemoteAudioFrame: ");
            sb.append(str);
            LogUtil.m143691d(sb.toString());
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt != ByteEngine.this.mConfig.getInteractId()) {
                    ByteEngine.this.mCallback.onFirstRemoteAudioFrame(parseInt);
                    LogReporter logReporter = ByteEngine.this.mLogReporter;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(parseInt);
                    logReporter.onFirstRemoteFrame(true, sb2.toString());
                }
            } catch (NumberFormatException e) {
                LogUtil.m143692e(e.toString());
            }
        }

        public void onUserJoined(String str, int i) {
            StringBuilder sb = new StringBuilder("onUserJoined: ");
            sb.append(str);
            LogUtil.m143691d(sb.toString());
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt != ByteEngine.this.mConfig.getInteractId()) {
                    ByteEngine.this.recordGuestJoined(parseInt);
                    ByteEngine.this.mCallback.onUserJoined(parseInt);
                    ByteEngine.this.mLogReporter.onRemoteUserOnlineOffline(true, str);
                    ByteEngine.this.mRemoteStateMap.put(str, new RemoteUserStats(str));
                }
            } catch (NumberFormatException e) {
                LogUtil.m143692e(e.toString());
            }
        }

        public void onUserOffline(String str, int i) {
            StringBuilder sb = new StringBuilder("onUserOffline: ");
            sb.append(str);
            LogUtil.m143691d(sb.toString());
            if (str != null && ByteEngine.this.mFirstVideoFrameTimeStamp.containsKey(str)) {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) ByteEngine.this.mFirstVideoFrameTimeStamp.get(str)).longValue();
                ByteEngine.this.mPullStreamsDuration += currentTimeMillis;
                ByteEngine.this.mFirstVideoFrameTimeStamp.remove(str);
            }
            try {
                int parseInt = Integer.parseInt(str);
                ByteEngine.this.recordGuestLeaved(parseInt);
                ByteEngine.this.mCallback.onUserLeaved(parseInt);
                ByteVideoSink byteVideoSink = (ByteVideoSink) ByteEngine.this.mByteVideoSinkMap.remove(Integer.valueOf(parseInt));
                if (byteVideoSink != null) {
                    byteVideoSink.stopRenderVideoStallStatistics();
                }
                ByteEngine.this.mLogReporter.onRemoteUserOnlineOffline(false, str);
                ByteEngine.this.mRemoteStateMap.remove(str);
            } catch (NumberFormatException e) {
                LogUtil.m143692e(e.toString());
            }
        }

        public void onLoggerMessage(RtcLogLevel rtcLogLevel, String str, Throwable th) {
            String str2 = "ByteEngineLog";
            ILogFilter logIODevice = AVLog.getLogIODevice();
            if (logIODevice != null) {
                switch (C457234.f117096x11981ef6[rtcLogLevel.ordinal()]) {
                    case 1:
                        logIODevice.print(2, str2, str, th);
                        return;
                    case 2:
                        logIODevice.print(4, str2, str, th);
                        return;
                    case 3:
                        logIODevice.print(3, str2, str, th);
                        return;
                    case 4:
                        logIODevice.print(5, str2, str, th);
                        return;
                    case 5:
                        logIODevice.print(6, str2, str, th);
                        break;
                }
            }
        }

        public void onProviderEvent(int i, String str, String str2) {
            String str3;
            switch (i) {
                case 1:
                    str3 = "rtc_joinchannel";
                    break;
                case 2:
                    str3 = "rtc_add_stream";
                    break;
                case 3:
                    str3 = "rtc_start_puborsub";
                    break;
                case 4:
                    str3 = "rtc_recv_answer";
                    break;
                case 5:
                    str3 = "rtc_ice_complete";
                    break;
                default:
                    str3 = "unknown";
                    break;
            }
            if (ByteEngine.this.mLogReporter != null) {
                ByteEngine.this.mLogReporter.onProviderEvent(str3, str, str2);
            }
        }

        public void onJoinChannelSuccess(String str, String str2, int i) {
            LogUtil.m143691d("onJoinChannelSuccess");
            ByteEngine.this.mCallback.onStartSuccess();
            ByteEngine.this.mShouldReport = true;
            ByteEngine.this.mLogReporter.onJoinChannelSuccess();
            if (ByteEngine.this.mConfig.getType() == Type.VIDEO && ByteEngine.this.mVideoClient != null) {
                ByteEngine.this.mVideoClient.stop();
                ByteEngine.this.mVideoClient.start();
            }
            ByteEngine.this.mByteVideoSinkMap.clear();
            if (ByteEngine.this.mAudioClient != null) {
                ByteEngine.this.mAudioClient.start();
            }
            if (ByteEngine.this.mAudioSink != null) {
                ByteEngine.this.mAudioSink.start();
            }
        }

        public void onAudioQuality(String str, int i, short s, short s2) {
            ByteEngine.this.mCallback.onStreamDelay(s);
        }

        public void onFirstRemoteVideoFrame(String str, int i, int i2, int i3) {
            StringBuilder sb = new StringBuilder("onFirstRemoteVideoFrame: ");
            sb.append(str);
            LogUtil.m143691d(sb.toString());
            if (!ByteEngine.this.mFirstVideoFrameTimeStamp.containsKey(str)) {
                ByteEngine.this.mFirstVideoFrameTimeStamp.put(str, Long.valueOf(System.currentTimeMillis()));
            }
            try {
                final int parseInt = Integer.parseInt(str);
                if (parseInt != ByteEngine.this.mConfig.getInteractId()) {
                    ByteEngine.this.mMainThreadHandler.post(new Runnable() {
                        public void run() {
                            EngineCallback engineCallback;
                            int i = parseInt;
                            if (ByteEngine.this.mConfig.isClientMixStream()) {
                                engineCallback = ByteEngine.this.mCallback;
                            } else {
                                engineCallback = null;
                            }
                            ByteVideoSink byteVideoSink = new ByteVideoSink(i, engineCallback, ByteEngine.this.mLogReporter.getLogReportCallback(), ByteEngine.this.mRenderVideoStallCallback, ByteEngine.this.mMainThreadHandler, ByteEngine.this.mContext);
                            SurfaceView surfaceView = byteVideoSink;
                            surfaceView.setZOrderMediaOverlay(false);
                            ByteEngine.this.mRtcEngine.setupRemoteVideoRender(byteVideoSink, String.valueOf(parseInt));
                            ByteEngine.this.mByteVideoSinkMap.put(Integer.valueOf(parseInt), byteVideoSink);
                            ByteEngine.this.mCallback.onFirstRemoteVideoFrame(parseInt, surfaceView);
                        }
                    });
                    LogReporter logReporter = ByteEngine.this.mLogReporter;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(parseInt);
                    logReporter.onFirstRemoteFrame(false, sb2.toString());
                }
            } catch (NumberFormatException e) {
                LogUtil.m143692e(e.toString());
            }
        }
    };
    public ByteVideoClient mVideoClient;

    /* renamed from: com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteEngine$4 */
    static /* synthetic */ class C457234 {

        /* renamed from: $SwitchMap$com$ss$video$rtc$engine$handler$IRtcEngineEventHandler$RtcLogLevel */
        static final /* synthetic */ int[] f117096x11981ef6 = new int[RtcLogLevel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel[] r0 = com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f117096x11981ef6 = r0
                int[] r0 = f117096x11981ef6     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_TRACE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f117096x11981ef6     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_INFO     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f117096x11981ef6     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_DEBUG     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f117096x11981ef6     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_WARNING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f117096x11981ef6     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_ERROR     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.vendor.bytertc.ByteEngine.C457234.<clinit>():void");
        }
    }

    public String getVendor() {
        return "byte";
    }

    public void destroy() {
        this.mLogReporter.onEngineAPICall("destroy", null);
        this.mCallback.onDestroySuccess();
        super.destroy();
    }

    public void pause() {
        this.mLogReporter.onEngineAPICall("pause", null);
        if (this.mRtcEngine != null) {
            this.mRtcEngine.enableLocalAudio(false);
        }
    }

    public void resume() {
        this.mLogReporter.onEngineAPICall("resume", null);
        if (this.mRtcEngine != null) {
            this.mRtcEngine.enableLocalAudio(true);
        }
    }

    static {
        String[] strArr = {"bytertc"};
        for (int i = 0; i <= 0; i++) {
            try {
                LibraryLoader.loadLibrary(strArr[0]);
            } catch (Throwable unused) {
                StringBuilder sb = new StringBuilder("Load library failed: ");
                sb.append(strArr[0]);
                AVLog.m143697e("ByteEngine", sb.toString());
            }
        }
    }

    public ArrayList<RenderVideoFpsStatisticsReport> getVideoRenderFpsReport() {
        ArrayList<RenderVideoFpsStatisticsReport> arrayList = new ArrayList<>();
        for (ByteVideoSink byteVideoSink : this.mByteVideoSinkMap.values()) {
            if (byteVideoSink != null) {
                arrayList.add(byteVideoSink.getVideoFpsReport());
            }
        }
        return arrayList;
    }

    public void stop() {
        this.mLogReporter.onEngineAPICall("stop", null);
        if (this.mConfig.getCharacter() == Character.ANCHOR && !this.mConfig.isClientMixStream()) {
            this.mRtcEngine.disableLiveTranscoding();
        }
        if (this.mConfig.getType() == Type.VIDEO) {
            this.mVideoClient.stop();
            this.mVideoClient.release();
            this.mVideoClient = null;
        }
        if (this.mAudioClient != null) {
            this.mAudioClient.stop();
            this.mAudioClient.release();
            this.mAudioClient = null;
        }
        if (this.mAudioSink != null) {
            this.mAudioSink.stop();
            this.mAudioSink.release();
            this.mAudioSink = null;
        }
        if (this.mByteVideoSinkMap != null) {
            this.mByteVideoSinkMap.clear();
        }
        this.mRtcEngine.disableAudio();
        this.mRtcEngine.enableLocalAudio(false);
        this.mSwitchAppId = false;
        this.mLogReporter.onLeavingChannel(this.mPullStreamsDuration);
        int leaveChannel = this.mRtcEngine.leaveChannel();
        if (leaveChannel == 0) {
            try {
                synchronized (this.mLeaveChannelNotifier) {
                    this.mLeaveChannelNotifier.wait(1000);
                }
            } catch (InterruptedException unused) {
            }
        }
        this.mLogReporter.onLeaveChannelReturn();
        this.mShouldReport = false;
        super.stop();
        if (leaveChannel == 0) {
            this.mCallback.onStopSuccess();
            return;
        }
        EngineCallback engineCallback = this.mCallback;
        StringBuilder sb = new StringBuilder("result: ");
        sb.append(leaveChannel);
        engineCallback.onStopFailed(10007, sb.toString());
        super.destroy();
    }

    public void init() {
        this.mLogReporter.onEngineAPICall("init", null);
        try {
            String byteAppId = this.mConfig.getByteAppId();
            if (mAppId != null && !mAppId.equals(byteAppId)) {
                RtcEngine.destroy();
                this.mSwitchAppId = true;
            }
            mAppId = byteAppId;
            RtcEngine.setRtcNativeLibraryLoader(new RtcNativeLibraryLoader() {
                public boolean load(String str) {
                    return true;
                }
            });
            RtcEngine.setDeviceId(this.mConfig.getDeviceId());
            RtcEngine.useDefaultSignalingServer(this.mConfig.isUseDefaultSignalingServerFirstFromRtcExt());
            this.mRtcEngine = RtcEngine.create(this.mContext, this.mConfig.getByteAppId(), this.mRtcEngineEventHandler, this.mConfig.getSharedEGLContext14());
            RtcEngine.setRtcEngineEventHandler(this.mRtcEngineEventHandler);
            this.mRtcEngine.setDefaultAudioRouteToSpeakerPhone(true);
            if (this.mRtcEngine == null) {
                AVLog.ioe("ByteRtcEngine", "Create ByteEngine failed.");
                return;
            }
            StringBuilder sb = new StringBuilder("------ ByteRtc SDK version: ");
            sb.append(RtcEngine.getSdkVersion());
            LogUtil.m143693i(sb.toString());
            this.mLogReporter.setThirdPartyRtcVersion(RtcEngine.getSdkVersion());
            int channelProfile = this.mRtcEngine.setChannelProfile(1);
            if (channelProfile < 0) {
                EngineCallback engineCallback = this.mCallback;
                StringBuilder sb2 = new StringBuilder("result: ");
                sb2.append(channelProfile);
                sb2.append(", channel profile: 1");
                engineCallback.onInitFailed(30001, sb2.toString());
                return;
            }
            int clientRole = this.mRtcEngine.setClientRole(1);
            if (clientRole < 0) {
                EngineCallback engineCallback2 = this.mCallback;
                StringBuilder sb3 = new StringBuilder("result: ");
                sb3.append(clientRole);
                sb3.append(", role: 1");
                engineCallback2.onInitFailed(30002, sb3.toString());
                return;
            }
            VideoQuality videoQuality = this.mConfig.getVideoQuality();
            int videoResolution = this.mRtcEngine.setVideoResolution(videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getFps(), videoQuality.getBitrate());
            if (videoResolution < 0) {
                EngineCallback engineCallback3 = this.mCallback;
                StringBuilder sb4 = new StringBuilder("result: ");
                sb4.append(videoResolution);
                engineCallback3.onInitFailed(10003, sb4.toString());
                return;
            }
            if (this.mConfig.getVolumeCallbackInterval() > 0) {
                int enableAudioVolumeIndication = this.mRtcEngine.enableAudioVolumeIndication(this.mConfig.getVolumeCallbackInterval(), 3);
                if (enableAudioVolumeIndication < 0) {
                    EngineCallback engineCallback4 = this.mCallback;
                    StringBuilder sb5 = new StringBuilder("result: ");
                    sb5.append(enableAudioVolumeIndication);
                    sb5.append(", interval: ");
                    sb5.append(this.mConfig.getVolumeCallbackInterval());
                    engineCallback4.onInitFailed(30004, sb5.toString());
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.mConfig.getLogFile())) {
                this.mRtcEngine.setLogFile(this.mConfig.getLogFile());
            }
            this.mCallback.onInitSuccess();
        } catch (Exception e) {
            LogUtil.m143692e(e.toString());
            this.mCallback.onInitFailed(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT, e.toString());
        }
    }

    public void start() {
        String str;
        String str2;
        AACProfile aACProfile;
        boolean z;
        EngineCallback engineCallback = null;
        this.mLogReporter.onEngineAPICall("start", null);
        this.mRtcEngine.enableAudio();
        if (this.mAudioClientFactory != null || this.mConfig.isClientMixStream()) {
            if (this.mAudioClientFactory != null) {
                if (!this.mConfig.isClientMixStream()) {
                    LogUtil.m143695w("You have set an external audio source, but forget to enable external audio render, the interact sdk will helps you to render it.");
                }
                AudioClient create = this.mAudioClientFactory.create();
                if (create == null) {
                    throw new AndroidRuntimeException("AudioClientFactory.create() returns null.");
                } else if (create.getSampleRate() != this.mConfig.getOutPlayerAudioSampleHz()) {
                    this.mCallback.onStartFailed(30008, "Audio sample rate of external capture and external render should equal.");
                    this.mAudioClientFactory.destroy(create);
                    return;
                } else {
                    this.mRtcEngine.setExternalAudioDevice(true, create.getSampleRate(), create.getChannelCount(), this.mConfig.getOutPlayerAudioChannel());
                    this.mRtcEngine.setAudioDeviceEventHandler(this.mAudioDeviceEventHandler);
                    this.mAudioClient = new ByteAudioClient(this.mAudioClientFactory, this.mRtcEngine);
                    int outPlayerAudioSampleHz = this.mConfig.getOutPlayerAudioSampleHz();
                    int outPlayerAudioChannel = this.mConfig.getOutPlayerAudioChannel();
                    if (this.mConfig.isClientMixStream()) {
                        z = this.mConfig.isAutoPlayRemoteAudio();
                    } else {
                        z = true;
                    }
                    RtcEngine rtcEngine = this.mRtcEngine;
                    if (this.mConfig.isClientMixStream()) {
                        engineCallback = this.mCallback;
                    }
                    ByteAudioSink byteAudioSink = new ByteAudioSink(outPlayerAudioSampleHz, outPlayerAudioChannel, 10, z, rtcEngine, engineCallback);
                    this.mAudioSink = byteAudioSink;
                }
            } else {
                LogUtil.m143692e("If you want to play audio externally, you should also input audio by yourself !!!");
                throw new AndroidRuntimeException("You need to set an AudioClientFactory !!!");
            }
        }
        if (this.mConfig.getType() == Type.VIDEO) {
            this.mVideoClient = new ByteVideoClient(this.mVideoClientFactory, this.mConfig.getFrameFormat(), this.mConfig.getVideoQuality(), new ByteEngine$$Lambda$0(this));
            this.mVideoClientStatisic = this.mVideoClient;
            this.mRtcEngine.setExternalVideoSource(true, true, true);
            this.mRtcEngine.enableVideo();
            this.mVideoClient.prepare();
        } else {
            this.mRtcEngine.disableVideo();
        }
        this.mRtcEngine.startPreview();
        if (this.mConfig.getCharacter() == Character.ANCHOR && !this.mConfig.isClientMixStream() && this.mConfig.getMixStreamConfig() != null) {
            LiveTranscoding defualtLiveTranscode = LiveTranscoding.getDefualtLiveTranscode();
            MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
            VideoConfig height = defualtLiveTranscode.getVideo().setBitRate(mixStreamConfig.getVideoBitrate() * 1000).setFps(mixStreamConfig.getVideoFrameRate()).setWidth(mixStreamConfig.getVideoWidth()).setHeight(mixStreamConfig.getVideoHeight());
            if (mixStreamConfig.getVideoCodec() == VideoCodec.H264) {
                str2 = "H264";
            } else {
                str2 = "H265";
            }
            height.setCodec(str2).setGop((int) (mixStreamConfig.getVideoGop() * ((float) mixStreamConfig.getVideoFrameRate())));
            AudioConfig sampleRate = defualtLiveTranscode.getAudio().setChannels(mixStreamConfig.getAudioChannels()).setSampleRate(mixStreamConfig.getAudioSampleRateValue());
            if (mixStreamConfig.getAudioProfile() == AudioProfile.HE) {
                aACProfile = AACProfile.HEV1;
            } else {
                aACProfile = AACProfile.LC;
            }
            sampleRate.setAacProfile(aACProfile).setBitRate(mixStreamConfig.getAudioBitrate() * 1000);
            mixStreamConfig.updateStreamUrlPriority();
            mixStreamConfig.updatePushCount();
            defualtLiveTranscode.setUrl(mixStreamConfig.getStreamUrl());
            Builder builder = new Builder();
            Region region = new Region();
            region.uid(String.valueOf(this.mConfig.getInteractId())).position(0.0d, 0.0d).size(1.0d, 1.0d).zorder(0).alpha(1.0d).renderMode(1);
            builder.addRegoin(region);
            defualtLiveTranscode.setLayout(builder.builder());
            this.mRtcEngine.enableLiveTranscoding(defualtLiveTranscode);
            if (this.mLogReporter != null) {
                this.mLogReporter.onRtcUpdateLayout(defualtLiveTranscode.getLayout().toString());
            }
        }
        if (this.mConfig.getByteToken() == null) {
            str = "";
        } else {
            str = this.mConfig.getByteToken();
        }
        if ((this.mConfig.getChannelName() == null || this.mConfig.getChannelName().equals("0") || this.mConfig.getInteractId() == 0) && this.mCallback != null) {
            EngineCallback engineCallback2 = this.mCallback;
            StringBuilder sb = new StringBuilder("join channel parameters error channel name:");
            sb.append(this.mConfig.getChannelName());
            sb.append(" ,interactID:");
            sb.append(this.mConfig.getInteractId());
            engineCallback2.onStartFailed(-8000, sb.toString());
            this.mLogReporter.onErrorOccurs(-8000, String.valueOf(this.mConfig.getInteractId()), this.mConfig.getByteToken());
        }
        int joinChannel = this.mRtcEngine.joinChannel(str, this.mConfig.getChannelName(), null, String.valueOf(this.mConfig.getInteractId()), String.valueOf(this.mConfig.getUserId()));
        this.mLogReporter.onJoiningChannel(joinChannel, str, this.mConfig.getByteAppId(), this.mSwitchAppId);
        this.mLogReporter.onPublishStream(joinChannel);
        StringBuilder sb2 = new StringBuilder("channel name: ");
        sb2.append(this.mConfig.getChannelName());
        LogUtil.m143691d(sb2.toString());
        if (joinChannel < 0) {
            EngineCallback engineCallback3 = this.mCallback;
            StringBuilder sb3 = new StringBuilder("result: ");
            sb3.append(joinChannel);
            engineCallback3.onStartFailed(30006, sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ boolean lambda$start$0$ByteEngine(ExtVideoFrame extVideoFrame) {
        if (!this.mRtcEngine.pushExternalVideoFrame(extVideoFrame)) {
            LogUtil.m143692e("push external video frame failed");
            return false;
        }
        this.mLogReporter.onFirstLocalExternalVideoFrame();
        this.mTotalRenderFps++;
        return true;
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        this.mLogReporter.onEngineAPICall("muteAllRemoteAudioStreams", C1642a.m8034a(" mute:%b", new Object[]{Boolean.valueOf(z)}));
        this.mRtcEngine.muteAllRemoteAudioStreams(z);
    }

    public void switchAudio(boolean z) {
        this.mLogReporter.onEngineAPICall("switchAudio", C1642a.m8034a("enable:%b", new Object[]{Boolean.valueOf(z)}));
        this.mRtcEngine.muteLocalAudioStream(!z);
    }

    public void muteRemoteAudioStream(int i, boolean z) {
        this.mLogReporter.onEngineAPICall("muteRemoteAudioStream", C1642a.m8034a("interactId:%d, mute:%b", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)}));
        this.mRtcEngine.muteRemoteAudioStream(String.valueOf(i), z);
    }

    public void mixStream(List<com.p280ss.avframework.livestreamv2.interact.model.Region> list, boolean z) {
        int i;
        if (!this.mConfig.isClientMixStream()) {
            Builder builder = new Builder();
            builder.backgroundColor(this.mBackgroundColor);
            int i2 = 0;
            for (com.p280ss.avframework.livestreamv2.interact.model.Region region : list) {
                Region region2 = new Region();
                Region alpha = region2.uid(String.valueOf(region.getInteractId())).position(region.getX(), region.getY()).size(region.getWidth(), region.getHeight()).renderMode(1).alpha(1.0d);
                if (region.isMuteAudio()) {
                    i = 2;
                } else {
                    i = 0;
                }
                Region contentControl = alpha.contentControl(i);
                int i3 = i2 + 1;
                contentControl.zorder(i2);
                builder.addRegoin(region2);
                i2 = i3;
            }
            String createSei = createSei(list);
            LogUtil.m143693i(createSei);
            builder.appData(createSei);
            Layout builder2 = builder.builder();
            this.mRtcEngine.setVideoCompositingLayout(builder.builder());
            if (this.mLogReporter != null) {
                this.mLogReporter.onRtcUpdateLayout(builder2.toString());
            }
        }
    }

    public ByteEngine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        super(config, videoClientFactory, audioClientFactory, engineCallback);
    }
}

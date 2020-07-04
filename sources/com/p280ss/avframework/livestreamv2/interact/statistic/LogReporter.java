package com.p280ss.avframework.livestreamv2.interact.statistic;

import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.model.Config.AudioProfile;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Character;
import com.p280ss.avframework.livestreamv2.interact.model.Config.InteractMode;
import com.p280ss.avframework.livestreamv2.interact.model.Config.MixStreamConfig;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Vendor;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoCodec;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality;
import com.p280ss.avframework.livestreamv2.interact.model.LocalUserStatisticInfo;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.ugc.live.sdk.message.BuildConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.interact.statistic.LogReporter */
public class LogReporter {
    private boolean isFirstLocalExternalVideoFrame = true;
    private Config mConfig;
    private boolean mFirstJoin = true;
    private EngineCallback mLogReportCallback;
    private LogReportCallback mReportCallback;
    private long mStartJoiningTs;
    private long mStartReconnectTs;
    private String mThirdPartySdkVersion = "";
    private ConcurrentHashMap<String, Boolean> mUserFirstAudioFrameChecker;
    private ConcurrentHashMap<String, Boolean> mUserFirstVideoFrameChecker;
    private boolean mbStreamPublished;
    private final AtomicLong sLogId = new AtomicLong(0);

    /* renamed from: com.ss.avframework.livestreamv2.interact.statistic.LogReporter$LogReportCallback */
    public interface LogReportCallback {
        void onFirstRemoteVideoRender(int i);
    }

    public LogReportCallback getLogReportCallback() {
        if (this.mReportCallback == null) {
            this.mReportCallback = new LogReportCallback() {
                public void onFirstRemoteVideoRender(int i) {
                    LogReporter.this.onFirstRemoteVideoRender(i);
                }
            };
        }
        return this.mReportCallback;
    }

    public void onConnectionLost() {
        JSONObject createCommonLog = createCommonLog("rtc_connect_lost");
        if (createCommonLog != null) {
            reportLog(createCommonLog);
        }
    }

    public void onReconnecting() {
        this.mStartReconnectTs = System.currentTimeMillis();
        JSONObject createCommonLog = createCommonLog("rtc_reconnect");
        if (createCommonLog != null) {
            reportLog(createCommonLog);
        }
    }

    public void onFirstLocalExternalVideoFrame() {
        if (this.mStartJoiningTs > 0 && this.isFirstLocalExternalVideoFrame) {
            this.isFirstLocalExternalVideoFrame = false;
            long currentTimeMillis = System.currentTimeMillis() - this.mStartJoiningTs;
            JSONObject createCommonLog = createCommonLog("rtc_first_local_video");
            if (createCommonLog != null) {
                try {
                    createCommonLog.put("elapsed", currentTimeMillis);
                    reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }
        }
    }

    public void onLeaveChannelReturn() {
        long j;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
            this.mStartJoiningTs = 0;
        } else {
            j = 0;
        }
        JSONObject createCommonLog = createCommonLog("rtc_leave_channel_callback");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("elapsed", j);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onReconnected() {
        long j = 0;
        if (this.mStartReconnectTs != 0) {
            j = System.currentTimeMillis() - this.mStartReconnectTs;
        }
        JSONObject createCommonLog = createCommonLog("rtc_reconnected");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("elapsed", j);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onJoinChannelSuccess() {
        long j = 0;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
        }
        JSONObject createCommonLog = createCommonLog("rtc_join_channel_success");
        if (createCommonLog != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.mConfig.getInteractId());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.mConfig.getUserId());
                createCommonLog.put("elapsed", j).put("link_id", sb.toString()).put("account", sb2.toString()).put("first_joined", this.mFirstJoin);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
        this.mFirstJoin = false;
    }

    public void setThirdPartyRtcVersion(String str) {
        this.mThirdPartySdkVersion = str;
    }

    private String getAudioProfile(AudioProfile audioProfile) {
        switch (audioProfile) {
            case LC:
                return "LC";
            case HE:
                return "HE";
            default:
                return "";
        }
    }

    private String getCharacterName(Character character) {
        switch (character) {
            case ANCHOR:
                return "host";
            case GUEST:
                return "guest";
            default:
                return "";
        }
    }

    private String getInteractType(InteractMode interactMode) {
        switch (interactMode) {
            case PK:
                return "pk";
            case NORMAL:
                return "normal";
            default:
                return "";
        }
    }

    private String getVideoCodec(VideoCodec videoCodec) {
        switch (videoCodec) {
            case H264:
                return "h264";
            case H265:
                return "h265";
            default:
                return "";
        }
    }

    public void onFirstRemoteVideoRender(int i) {
        JSONObject createCommonLog = createCommonLog("rtc_first_remote_render");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("uid", i);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onNetworkChanged(String str) {
        JSONObject createCommonLog = createCommonLog("rtc_network_changed");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("access", str);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onRtcUpdateLayout(String str) {
        JSONObject createCommonLog = createCommonLog("rtc_update_layout");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("message", str);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    private String genMixAudioReportJson(MixStreamConfig mixStreamConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("audio_sample_rate", mixStreamConfig.getAudioSampleRateValue());
            jSONObject.put("audio_channel", mixStreamConfig.getAudioChannels());
            jSONObject.put("audio_profile", mixStreamConfig.getAudioProfile().toString());
            jSONObject.put("audio_bitrate", mixStreamConfig.getAudioBitrate());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private String getVendorName(Vendor vendor) {
        switch (vendor) {
            case AGORA:
                return "agora";
            case ZEGO:
                return "zego";
            case BYTE:
                return "byte";
            default:
                return "";
        }
    }

    private String getVideoQuality(VideoQuality videoQuality) {
        StringBuilder sb = new StringBuilder();
        sb.append(videoQuality.getWidth());
        sb.append("x");
        sb.append(videoQuality.getHeight());
        sb.append("x");
        sb.append(videoQuality.getFps());
        sb.append("x");
        sb.append(videoQuality.getBitrate());
        return sb.toString();
    }

    private void reportLog(JSONObject jSONObject) {
        if (this.mLogReportCallback != null) {
            try {
                if (!"rtc_push_stream".equals(jSONObject.getString("event_key"))) {
                    AVLog.ioi("live_client_monitor_log", jSONObject.toString());
                }
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
            this.mLogReportCallback.onLogReport("live_client_monitor_log", jSONObject);
        }
    }

    public void onLeavingChannel(long j) {
        long j2 = 0;
        if (this.mStartJoiningTs != 0) {
            j2 = System.currentTimeMillis() - this.mStartJoiningTs;
        }
        JSONObject createCommonLog = createCommonLog("rtc_leave_channel");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("elapsed", j2);
                createCommonLog.put("pull_streams_video_duration", j);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    private String genMixVideoReportJson(MixStreamConfig mixStreamConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", mixStreamConfig.getVideoWidth());
            jSONObject.put("height", mixStreamConfig.getVideoHeight());
            jSONObject.put("fps", mixStreamConfig.getVideoFrameRate());
            jSONObject.put("codec", mixStreamConfig.getVideoCodec());
            jSONObject.put("video_profile", mixStreamConfig.getVideoProfile().toString().toLowerCase());
            jSONObject.put("video_bitrate", mixStreamConfig.getVideoBitrate());
            jSONObject.put("gop", (double) mixStreamConfig.getVideoGop());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private JSONObject createCommonLog(String str) {
        String str2;
        String str3;
        try {
            JSONObject put = new JSONObject().put(C38347c.f99551f, BuildConfig.VERSION_NAME).put("event_key", str).put("mode", "rtc").put("timestamp", System.currentTimeMillis()).put("project_key", this.mConfig.getProjectKey()).put("report_version", 5).put("product_line", "live");
            String str4 = "rtc_channel_id";
            if (this.mConfig.getChannelName() == null) {
                str2 = "";
            } else {
                str2 = this.mConfig.getChannelName();
            }
            JSONObject put2 = put.put(str4, str2).put("rtc_type", getInteractType(this.mConfig.getInteractMode())).put("rtc_vendor", getVendorName(this.mConfig.getVendor())).put("rtc_role", getCharacterName(this.mConfig.getCharacter())).put("rtc_version", this.mThirdPartySdkVersion).put("rtc_sdk_version", "6.0.0.11").put("rtc_app_channel", this.mConfig.getAppChannel()).put("rtc_report_id", this.sLogId.incrementAndGet());
            String str5 = "stream_name";
            if (this.mConfig.getMixStreamConfig() != null) {
                str3 = this.mConfig.getMixStreamConfig().getStreamName();
            } else {
                str3 = "";
            }
            return put2.put(str5, str3);
        } catch (JSONException e) {
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            return null;
        }
    }

    public void onPublishStream(int i) {
        String str;
        if (!this.mbStreamPublished) {
            this.mbStreamPublished = true;
            JSONObject createCommonLog = createCommonLog("rtc_publish_stream");
            if (createCommonLog != null) {
                String str2 = "mix_type";
                try {
                    if (this.mConfig.isClientMixStream()) {
                        str = "client";
                    } else {
                        str = "server";
                    }
                    createCommonLog.put(str2, str).put("error_code", i);
                    if (this.mConfig.getMixStreamConfig() != null) {
                        MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
                        createCommonLog.put("url", mixStreamConfig.getStreamUrl()).put("audio_profile", getAudioProfile(mixStreamConfig.getAudioProfile())).put("meta_video_bitrate", mixStreamConfig.getVideoBitrate()).put("meta_video_framerate", mixStreamConfig.getVideoFrameRate()).put("width", mixStreamConfig.getVideoWidth()).put("height", mixStreamConfig.getVideoHeight()).put("video_codec", getVideoCodec(mixStreamConfig.getVideoCodec())).put("live_stream_session_id", mixStreamConfig.getStreamUniqueId());
                    }
                    reportLog(createCommonLog);
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                }
            }
        }
    }

    public LogReporter(EngineCallback engineCallback, Config config) {
        this.mLogReportCallback = engineCallback;
        this.mConfig = config;
        this.mUserFirstAudioFrameChecker = new ConcurrentHashMap<>();
        this.mUserFirstVideoFrameChecker = new ConcurrentHashMap<>();
    }

    public void onConnectFailed(int i, String str) {
        JSONObject createCommonLog = createCommonLog("rtc_connect_fail");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("error_code", i).put("message", str);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onEngineAPICall(String str, String str2) {
        JSONObject createCommonLog = createCommonLog("rtc_engine_api_call");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("engine_api_name", str).put("api_parameter_info", str2);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onRTCEngineAPICall(String str, String str2) {
        JSONObject createCommonLog = createCommonLog("rtc_engine_api_call");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("rtc_engine_api_name", str).put("rtc_api_parameter_info", str2);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onRemoteVideoFrozen(String str, int i) {
        JSONObject createCommonLog = createCommonLog("rtc_remote_video_frozen");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("remote_link_id", str).put("elapsed", i);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onWarningOccurs(int i, String str) {
        JSONObject createCommonLog = createCommonLog("rtc_occur_warning");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("error_code", i);
                createCommonLog.put("link_id", str);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onFirstRemoteFrame(boolean z, String str) {
        String str2;
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        long j = 0;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
        }
        if (z) {
            str2 = "rtc_first_remote_audio";
        } else {
            str2 = "rtc_first_remote_video";
        }
        JSONObject createCommonLog = createCommonLog(str2);
        if (createCommonLog != null) {
            if (z) {
                try {
                    concurrentHashMap = this.mUserFirstAudioFrameChecker;
                } catch (JSONException e) {
                    AVLog.ioe("live_client_monitor_log", String.valueOf(e));
                    return;
                }
            } else {
                concurrentHashMap = this.mUserFirstVideoFrameChecker;
            }
            Boolean valueOf = Boolean.valueOf(true);
            if (concurrentHashMap.containsKey(str)) {
                valueOf = (Boolean) concurrentHashMap.get(str);
            }
            createCommonLog.put("remote_link_id", str).put("elapsed", j).put("first_joined", valueOf);
            concurrentHashMap.put(str, Boolean.valueOf(false));
            reportLog(createCommonLog);
        }
    }

    public void onRemoteUserOnlineOffline(boolean z, String str) {
        String str2;
        long j = 0;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
        }
        if (z) {
            str2 = "rtc_remote_user_joined";
        } else {
            str2 = "rtc_remote_user_offline";
        }
        JSONObject createCommonLog = createCommonLog(str2);
        if (createCommonLog != null) {
            try {
                createCommonLog.put("remote_link_id", str).put("elapsed", j);
                reportLog(createCommonLog);
                if (z) {
                    if (!this.mUserFirstVideoFrameChecker.containsKey(str)) {
                        this.mUserFirstVideoFrameChecker.put(str, Boolean.valueOf(true));
                    }
                    if (!this.mUserFirstAudioFrameChecker.containsKey(str)) {
                        this.mUserFirstAudioFrameChecker.put(str, Boolean.valueOf(true));
                    }
                }
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onEngineCallBack(String str, String str2, int i) {
        JSONObject createCommonLog = createCommonLog("rtc_engine_callback");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("engine_callback_name", str).put("callback_parameter_info", str2).put("callback_error_code", i);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onErrorOccurs(int i, String str, String str2) {
        JSONObject createCommonLog = createCommonLog("rtc_occur_error");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("error_code", i);
                createCommonLog.put("link_id", str);
                createCommonLog.put("rtc_token", str2);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onProviderEvent(String str, String str2, String str3) {
        JSONObject createCommonLog = createCommonLog("rtc_provider_event");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("event_name", str).put("direction", str2).put("message", str3);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onStreamStateChange(int i, String str, int i2) {
        JSONObject createCommonLog = createCommonLog("rtc_stream_state_changed");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("error_code", i).put("message", str).put("state", i2);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onJoiningChannel(int i, String str, String str2, boolean z) {
        this.mStartJoiningTs = System.currentTimeMillis();
        JSONObject createCommonLog = createCommonLog("rtc_join_channel");
        if (createCommonLog != null) {
            try {
                VideoQuality videoQuality = this.mConfig.getVideoQuality();
                MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
                boolean isUseDefaultSignalingServerFirstFromRtcExt = this.mConfig.isUseDefaultSignalingServerFirstFromRtcExt();
                String str3 = "";
                if (this.mConfig.getSdkParams() != null) {
                    str3 = this.mConfig.getSdkParams().toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.mConfig.getInteractId());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.mConfig.getUserId());
                JSONObject put = createCommonLog.put("error_code", i).put("rtc_video_profile", getVideoQuality(this.mConfig.getVideoQuality())).put("link_id", sb.toString()).put("account", sb2.toString());
                String str4 = "rtc_token";
                if (str == null) {
                    str = "";
                }
                JSONObject put2 = put.put(str4, str).put("useSdkParam", this.mConfig.isUseRtcExtParams() ? 1 : 0);
                String str5 = "sdkParams";
                if (str3 == null) {
                    str3 = "";
                }
                JSONObject put3 = put2.put(str5, str3).put("width", videoQuality.getWidth()).put("height", videoQuality.getHeight()).put("fps", videoQuality.getFps()).put("video_bitrate", videoQuality.getBitrate()).put("rtc_mix_audio_profile", genMixAudioReportJson(mixStreamConfig)).put("mix_video_profile", genMixVideoReportJson(mixStreamConfig)).put("default_server_first", isUseDefaultSignalingServerFirstFromRtcExt ? 1 : 0);
                String str6 = "rtc_app_id";
                if (str2 == null) {
                    str2 = "";
                }
                put3.put(str6, str2).put("rtc_switch_app_id", z);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }

    public void onInteractStatus(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, int i10, String str, String str2, String str3, LocalUserStatisticInfo localUserStatisticInfo) {
        JSONObject createCommonLog = createCommonLog("rtc_push_stream");
        if (createCommonLog != null) {
            int i11 = i;
            try {
                int i12 = i2;
                int i13 = i3;
                int i14 = i4;
                int i15 = i5;
                int i16 = i6;
                int i17 = i7;
                int i18 = i8;
                createCommonLog.put("send_audio_bitrate", i).put("receive_audio_bitrate", i2).put("send_video_bitrate", i3).put("receive_video_bitrate", i4).put("user_count", i9).put("real_video_framerate", i5).put("preview_fps", i6).put("width", i7).put("height", i8).put("avg_vps_elapse", (double) f).put("stream_statistics", str2).put("send_vencode_fps", localUserStatisticInfo.getSendVencodeFps()).put("send_video_loss", localUserStatisticInfo.getSendVideoLoss()).put("send_audio_loss", localUserStatisticInfo.getSendAudioLoss()).put("send_audio_rtt", localUserStatisticInfo.getSendAudioRtt()).put("send_video_rtt", localUserStatisticInfo.getSendVideoRtt()).put("remote_user_info", str3).put("send_encode_fps", i10);
                reportLog(createCommonLog);
            } catch (JSONException e) {
                AVLog.ioe("live_client_monitor_log", String.valueOf(e));
            }
        }
    }
}

package com.p280ss.avframework.livestreamv2.interact.engine;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.C1642a;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Character;
import com.p280ss.avframework.livestreamv2.interact.model.Config.MixStreamConfig;
import com.p280ss.avframework.livestreamv2.interact.model.LocalUserStatisticInfo;
import com.p280ss.avframework.livestreamv2.interact.model.Region;
import com.p280ss.avframework.livestreamv2.interact.statistic.LogReporter;
import com.p280ss.avframework.livestreamv2.interact.statistic.RemoteUserStats;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics.IRenderVideoStallCallback;
import com.p280ss.avframework.livestreamv2.interact.utils.LogUtil;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientStatisic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.interact.engine.Engine */
public abstract class Engine {
    private static final String TAG = "com.ss.avframework.livestreamv2.interact.engine.Engine";
    protected static String mAppId;
    private int mAnchor;
    protected AudioClientFactory mAudioClientFactory;
    protected String mBackgroundColor;
    private List<Region> mCachedRegion;
    public EngineCallback mCallback;
    public Config mConfig;
    public Context mContext;
    public Map<String, Long> mFirstVideoFrameTimeStamp = new ConcurrentHashMap();
    private List<Integer> mGuestList;
    private long mLastRenderFps;
    private long mLastTimeUpdateSeiForTalk;
    public Runnable mLogReportRunnable;
    public LogReporter mLogReporter;
    public Handler mMainThreadHandler;
    protected int mOutputHeight;
    protected int mOutputWidth;
    public long mPullStreamsDuration = 0;
    public int mReceiveAudioBitrate;
    public int mReceiveVideoBitrate;
    public Map<String, RemoteUserStats> mRemoteStateMap = new ConcurrentHashMap();
    public IRenderVideoStallCallback mRenderVideoStallCallback = new IRenderVideoStallCallback() {
        public void onRenderVideoStall(String str, int i) {
            StringBuilder sb = new StringBuilder("onRemoteVideoFrozen interactId: ");
            sb.append(str);
            sb.append(" elapsed: ");
            sb.append(i);
            LogUtil.m143693i(sb.toString());
            if (Engine.this.mLogReporter != null) {
                Engine.this.mLogReporter.onRemoteVideoFrozen(str, i);
            }
        }
    };
    public int mSendAudioBitrate;
    public int mSendAudioLoss;
    public int mSendAudioRTT;
    public int mSendEncoderOutputFrameRate;
    public int mSendVideoBitrate;
    public int mSendVideoFrameRate;
    public int mSendVideoLoss;
    public int mSendVideoRTT;
    public boolean mShouldReport;
    public String mStatUid = "";
    protected boolean mSwitchAppId = false;
    private Map<String, Boolean> mTalkStateMap = new HashMap();
    public int mTotalRenderFps;
    private int mUpdateTalkSeiInterval;
    public int mUserCount;
    public VideoClientFactory mVideoClientFactory;
    public VideoClientStatisic mVideoClientStatisic;

    /* renamed from: com.ss.avframework.livestreamv2.interact.engine.Engine$LogReportRunnable */
    class LogReportRunnable implements Runnable {
        public void run() {
            float f;
            int i;
            int i2;
            int calcRenderFrameRate = Engine.this.calcRenderFrameRate(Engine.this.mConfig.getLogReportInterval());
            if (Engine.this.mShouldReport) {
                if (Engine.this.mVideoClientStatisic != null) {
                    int inputHeight = Engine.this.mVideoClientStatisic.getInputHeight();
                    i = inputHeight;
                    i2 = Engine.this.mVideoClientStatisic.getInputWidth();
                    f = Engine.this.mVideoClientStatisic.getAvgVpsElapse();
                } else {
                    i2 = -1;
                    i = -1;
                    f = -1.0f;
                }
                String remoteVideoRenderFps = Engine.this.getRemoteVideoRenderFps();
                String parseRemoteUserData = Engine.this.parseRemoteUserData();
                LocalUserStatisticInfo localUserStatisticInfo = new LocalUserStatisticInfo();
                localUserStatisticInfo.setSendVencodeFps(Engine.this.mSendEncoderOutputFrameRate);
                localUserStatisticInfo.setSendAudioLoss(Engine.this.mSendAudioLoss);
                localUserStatisticInfo.setSendVideoLoss(Engine.this.mSendVideoLoss);
                localUserStatisticInfo.setSendAudioRtt(Engine.this.mSendAudioRTT);
                localUserStatisticInfo.setSendVideoRtt(Engine.this.mSendVideoRTT);
                Engine.this.mLogReporter.onInteractStatus(Engine.this.mSendAudioBitrate, Engine.this.mReceiveAudioBitrate, Engine.this.mSendVideoBitrate, Engine.this.mReceiveVideoBitrate, Engine.this.mSendVideoFrameRate, calcRenderFrameRate, i2, i, f, Engine.this.mUserCount, Engine.this.mSendEncoderOutputFrameRate, Engine.this.mStatUid, remoteVideoRenderFps, parseRemoteUserData, localUserStatisticInfo);
                Engine.this.mSendAudioBitrate = 0;
                Engine.this.mReceiveAudioBitrate = 0;
                Engine.this.mSendVideoBitrate = 0;
                Engine.this.mReceiveVideoBitrate = 0;
                Engine.this.mSendVideoFrameRate = 0;
                Engine.this.mUserCount = 0;
                Engine.this.mStatUid = "";
            }
            Engine.this.mMainThreadHandler.postDelayed(Engine.this.mLogReportRunnable, (long) (Engine.this.mConfig.getLogReportInterval() * 1000));
        }

        private LogReportRunnable() {
        }
    }

    public int getAnchor() {
        return this.mAnchor;
    }

    public List<Integer> getGuestList() {
        return this.mGuestList;
    }

    public int getOutputHeight() {
        return this.mOutputHeight;
    }

    public int getOutputWidth() {
        return this.mOutputWidth;
    }

    /* access modifiers changed from: protected */
    public abstract String getVendor();

    public abstract ArrayList<RenderVideoFpsStatisticsReport> getVideoRenderFpsReport();

    public abstract void init();

    public abstract void mixStream(List<Region> list, boolean z);

    public abstract void muteAllRemoteAudioStreams(boolean z);

    public abstract void muteRemoteAudioStream(int i, boolean z);

    public abstract void pause();

    public abstract void resume();

    public abstract void start();

    public abstract void switchAudio(boolean z);

    public void destroy() {
        this.mMainThreadHandler.removeCallbacks(this.mLogReportRunnable);
    }

    public void stop() {
        this.mGuestList.clear();
    }

    private void configStreamParameters() {
        MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
        if (mixStreamConfig != null) {
            this.mOutputWidth = mixStreamConfig.getVideoWidth();
            this.mOutputHeight = mixStreamConfig.getVideoHeight();
            this.mBackgroundColor = mixStreamConfig.getBackgroundColorString();
        }
    }

    public String getRemoteVideoRenderFps() {
        JSONArray jSONArray = new JSONArray();
        ArrayList videoRenderFpsReport = getVideoRenderFpsReport();
        if (videoRenderFpsReport == null) {
            return "";
        }
        Iterator it = videoRenderFpsReport.iterator();
        while (it.hasNext()) {
            RenderVideoFpsStatisticsReport renderVideoFpsStatisticsReport = (RenderVideoFpsStatisticsReport) it.next();
            if (renderVideoFpsStatisticsReport != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fps", renderVideoFpsStatisticsReport.getFps());
                    jSONObject.put("uid", renderVideoFpsStatisticsReport.getInteractId());
                    jSONObject.put("direction", "down");
                    jSONArray.put(jSONObject);
                    RemoteUserStats remoteUserStatsByUID = getRemoteUserStatsByUID(String.valueOf(renderVideoFpsStatisticsReport.getInteractId()));
                    if (remoteUserStatsByUID != null) {
                        remoteUserStatsByUID.setVideoRenderFps(renderVideoFpsStatisticsReport.getFps());
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONArray.toString();
    }

    public String parseRemoteUserData() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (RemoteUserStats remoteUserStats : this.mRemoteStateMap.values()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("user_id", remoteUserStats.getUid());
                jSONObject.put("recv_video_bitrate", remoteUserStats.getVideoBitrate());
                jSONObject.put("recv_vdecode_fps", remoteUserStats.getVideoDecodeFps());
                jSONObject.put("recv_vrender_fps", remoteUserStats.getVideoRenderFps());
                jSONObject.put("recv_video_loss", remoteUserStats.getVideoLossRate());
                jSONObject.put("recv_audio_bitrate", remoteUserStats.getAudioBitrate());
                jSONObject.put("recv_audio_delay", remoteUserStats.getAudioDelay());
                jSONObject.put("recv_audio_loss", remoteUserStats.getAudioLossRate());
                jSONObject.put("recv_audio_rtt", remoteUserStats.getAudioRTT());
                jSONObject.put("recv_video_rtt", remoteUserStats.getVideoRTT());
                jSONObject.put("recv_audio_volume", remoteUserStats.getAudioVoiceVolume());
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONArray.toString();
    }

    public void mixStream(List<Region> list) {
        mixStream(list, true);
    }

    public RemoteUserStats getRemoteUserStatsByUID(String str) {
        return (RemoteUserStats) this.mRemoteStateMap.get(str);
    }

    public int calcRenderFrameRate(int i) {
        long j = ((long) this.mTotalRenderFps) - this.mLastRenderFps;
        this.mLastRenderFps = (long) this.mTotalRenderFps;
        return Math.round(((float) j) / ((float) i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void releaseRtcEngineResource(com.p280ss.avframework.livestreamv2.interact.model.Config.Vendor r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "releaseRtcEngineResource vendor:"
            r0.<init>(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p280ss.avframework.livestreamv2.interact.utils.LogUtil.m143693i(r0)
            int[] r0 = com.p280ss.avframework.livestreamv2.interact.engine.Engine.C457122.f117083x53f10761     // Catch:{ Exception -> 0x004c }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x004c }
            r4 = r0[r4]     // Catch:{ Exception -> 0x004c }
            r0 = 0
            r1 = 0
            switch(r4) {
                case 1: goto L_0x0037;
                case 2: goto L_0x0023;
                default: goto L_0x0022;
            }     // Catch:{ Exception -> 0x004c }
        L_0x0022:
            goto L_0x004b
        L_0x0023:
            java.lang.String r4 = "com.ss.video.rtc.engine.RtcEngine"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = "destroy"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Method r4 = r4.getMethod(r2, r3)     // Catch:{ Exception -> 0x004c }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x004c }
            r4.invoke(r0, r1)     // Catch:{ Exception -> 0x004c }
            goto L_0x004b
        L_0x0037:
            java.lang.String r4 = "io.agora.rtc.RtcEngine"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = "destroy"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x004c }
            java.lang.reflect.Method r4 = r4.getMethod(r2, r3)     // Catch:{ Exception -> 0x004c }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x004c }
            r4.invoke(r0, r1)     // Catch:{ Exception -> 0x004c }
            goto L_0x0056
        L_0x004b:
            return
        L_0x004c:
            r4 = move-exception
            java.lang.String r0 = TAG
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            com.p280ss.avframework.utils.AVLog.m143700w(r0, r4)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.engine.Engine.releaseRtcEngineResource(com.ss.avframework.livestreamv2.interact.model.Config$Vendor):void");
    }

    public void recordGuestJoined(int i) {
        this.mLogReporter.onEngineAPICall("recordGuestJoined", C1642a.m8034a(" interactId:%d", new Object[]{Integer.valueOf(i)}));
        if (this.mConfig.getCharacter() == Character.ANCHOR) {
            Iterator it = this.mGuestList.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() == i) {
                    it.remove();
                }
            }
            this.mGuestList.add(Integer.valueOf(i));
        }
    }

    public void recordGuestLeaved(int i) {
        this.mLogReporter.onEngineAPICall("recordGuestLeaved", C1642a.m8034a(" interactId:%d", new Object[]{Integer.valueOf(i)}));
        this.mTalkStateMap.remove(String.valueOf(i));
        if (this.mConfig.getCharacter() == Character.ANCHOR) {
            Iterator it = this.mGuestList.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() == i) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public String createSei(List<Region> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ver", this.mConfig.getSeiVersion());
            jSONObject.put("vendor", getVendor());
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("channel_id", this.mConfig.getChannelName());
            JSONArray jSONArray = new JSONArray();
            for (Region region : list) {
                if (region.needWriteToSei()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", region.getMediaType());
                    int i = 1;
                    jSONObject2.put("alpha", 1);
                    jSONObject2.put("w", region.getWidth());
                    jSONObject2.put("h", region.getHeight());
                    jSONObject2.put("x", region.getX());
                    jSONObject2.put("y", region.getY());
                    jSONObject2.put("account", region.getUserId());
                    jSONObject2.put("uid", region.getInteractId());
                    jSONObject2.put("zorder", 0);
                    jSONObject2.put("stat", region.getStatus());
                    String valueOf = String.valueOf(region.getInteractId());
                    if (!this.mTalkStateMap.containsKey(valueOf) || !((Boolean) this.mTalkStateMap.get(valueOf)).booleanValue()) {
                        i = 0;
                    }
                    jSONObject2.put("talk", i);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("grids", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", this.mOutputWidth);
            jSONObject3.put("height", this.mOutputHeight);
            jSONObject3.put("background", this.mBackgroundColor);
            jSONObject.put("canvas", jSONObject3);
            this.mCachedRegion = list;
            return jSONObject.toString();
        } catch (JSONException e) {
            LogUtil.m143692e(e.toString());
            EngineCallback engineCallback = this.mCallback;
            StringBuilder sb = new StringBuilder("create sei failed: ");
            sb.append(e.toString());
            engineCallback.onWarn(sb.toString());
            return null;
        }
    }

    public void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
        this.mCallback.onTalkStateUpdated(strArr, zArr);
        if (this.mConfig.getCharacter() == Character.ANCHOR && this.mConfig.isAutoUpdateSeiForTalk()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastTimeUpdateSeiForTalk >= ((long) this.mUpdateTalkSeiInterval)) {
                int length = strArr.length;
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    String str = strArr[i];
                    boolean z2 = zArr[i];
                    if (!this.mTalkStateMap.containsKey(str) || ((Boolean) this.mTalkStateMap.get(str)).booleanValue() != z2) {
                        z = true;
                    }
                    this.mTalkStateMap.put(str, Boolean.valueOf(z2));
                }
                if (z) {
                    mixStream(this.mCachedRegion, false);
                    LogUtil.m143691d("update sei for talk");
                    this.mLastTimeUpdateSeiForTalk = currentTimeMillis;
                }
            }
        }
    }

    public Engine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        Handler handler;
        this.mConfig = config;
        this.mVideoClientFactory = videoClientFactory;
        this.mAudioClientFactory = audioClientFactory;
        this.mContext = config.getContext();
        this.mCallback = engineCallback;
        this.mLogReporter = new LogReporter(engineCallback, config);
        this.mLogReportRunnable = new LogReportRunnable();
        this.mUpdateTalkSeiInterval = config.getUpdateTalkSeiInterval();
        if (config.getCharacter() == Character.ANCHOR) {
            this.mAnchor = config.getInteractId();
        }
        this.mGuestList = new ArrayList();
        if (config.getHandler() != null) {
            handler = config.getHandler();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        this.mMainThreadHandler = handler;
        this.mMainThreadHandler.postDelayed(this.mLogReportRunnable, (long) (this.mConfig.getLogReportInterval() * 1000));
        configStreamParameters();
    }
}

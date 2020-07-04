package com.p280ss.avframework.livestreamv2.interact.vendor.zego;

import android.app.Application;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import com.C1642a;
import com.facebook.ads.AdError;
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
import com.p280ss.avframework.livestreamv2.interact.model.Region;
import com.p280ss.avframework.livestreamv2.interact.statistic.LogReporter;
import com.p280ss.avframework.livestreamv2.interact.statistic.RemoteUserStats;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p280ss.avframework.livestreamv2.interact.utils.LogUtil;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.LibraryLoader;
import com.zego.zegoavkit2.ZegoExternalVideoCapture;
import com.zego.zegoavkit2.ZegoVideoCaptureDevice;
import com.zego.zegoavkit2.ZegoVideoCaptureFactory;
import com.zego.zegoavkit2.audiodevice.ZegoExternalAudioDevice;
import com.zego.zegoavkit2.entities.ZegoStreamRelayCDNInfo;
import com.zego.zegoavkit2.mixstream.IZegoMixStreamExCallback;
import com.zego.zegoavkit2.mixstream.IZegoMixStreamRelayCDNCallback;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamConfig;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamInfo;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamOutput;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamResultEx;
import com.zego.zegoavkit2.mixstream.ZegoStreamMixer;
import com.zego.zegoavkit2.soundlevel.IZegoSoundLevelCallback;
import com.zego.zegoavkit2.soundlevel.ZegoSoundLevelInfo;
import com.zego.zegoavkit2.soundlevel.ZegoSoundLevelMonitor;
import com.zego.zegoliveroom.ZegoLiveRoom;
import com.zego.zegoliveroom.ZegoLiveRoom.SDKContext;
import com.zego.zegoliveroom.ZegoLiveRoom.SDKContextEx;
import com.zego.zegoliveroom.callback.IZegoAVEngineCallback;
import com.zego.zegoliveroom.callback.IZegoInitSDKCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import com.zego.zegoliveroom.callback.IZegoLivePlayerCallback;
import com.zego.zegoliveroom.callback.IZegoLivePublisherCallback;
import com.zego.zegoliveroom.callback.IZegoLoginCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoRoomCallback;
import com.zego.zegoliveroom.constants.ZegoAvConfig;
import com.zego.zegoliveroom.entity.AuxData;
import com.zego.zegoliveroom.entity.ZegoPlayStreamQuality;
import com.zego.zegoliveroom.entity.ZegoPublishStreamQuality;
import com.zego.zegoliveroom.entity.ZegoStreamInfo;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoEngine */
public class ZegoEngine extends Engine {
    public static final Map<Integer, String> detailDescs = new HashMap();
    private static SDKContext sSDKContext;
    private boolean bExternalAudioDevice;
    private boolean bMuted;
    private boolean isStarting;
    private ZegoAudioClient mAudioClient;
    private ZegoAudioSink mAudioSink;
    public ConcurrentHashMap<String, ZegoStreamInfo> mCurrentUserInRoom = new ConcurrentHashMap<>();
    public ZegoSoundLevelInfo[] mGuestSoundLevelInfos;
    private IZegoLiveEventCallback mLiveEventCallback = new IZegoLiveEventCallback() {
        public void onLiveEvent(int i, HashMap<String, String> hashMap) {
            if (i == 3) {
                ZegoEngine.this.mLogReporter.onReconnecting();
                EngineCallback engineCallback = ZegoEngine.this.mCallback;
                StringBuilder sb = new StringBuilder("zego onLiveEvent Publish_BeginRetry: ");
                sb.append(hashMap);
                engineCallback.onWarn(sb.toString());
                return;
            }
            if (i == 4) {
                ZegoEngine.this.mLogReporter.onReconnected();
                EngineCallback engineCallback2 = ZegoEngine.this.mCallback;
                StringBuilder sb2 = new StringBuilder("zego onLiveEvent Publish_RetrySuccess: ");
                sb2.append(hashMap);
                engineCallback2.onWarn(sb2.toString());
            }
        }
    };
    private IZegoLivePlayerCallback mLivePlayerCallback = new IZegoLivePlayerCallback() {
        public void onInviteJoinLiveRequest(int i, String str, String str2, String str3) {
        }

        public void onPlayStateUpdate(int i, String str) {
        }

        public void onRecvEndJoinLiveCommand(String str, String str2, String str3) {
        }

        public void onVideoSizeChangedTo(String str, int i, int i2) {
        }

        public void onPlayQualityUpdate(String str, ZegoPlayStreamQuality zegoPlayStreamQuality) {
            StringBuilder sb = new StringBuilder("onPlayQualityUpdate, stream id: ");
            sb.append(str);
            sb.append(", quality: ");
            sb.append(zegoPlayStreamQuality.quality);
            sb.append(", delay: ");
            sb.append(zegoPlayStreamQuality.delay);
            LogUtil.m143691d(sb.toString());
            ZegoEngine.this.mCallback.onStreamDelay(zegoPlayStreamQuality.delay);
            ZegoEngine.this.mReceiveAudioBitrate = (int) zegoPlayStreamQuality.akbps;
            ZegoEngine.this.mReceiveVideoBitrate = (int) zegoPlayStreamQuality.vkbps;
            ZegoEngine.this.mStatUid = ZegoEngine.splitInteractIdFromStreamId(str);
            RemoteUserStats remoteUserStatsByUID = ZegoEngine.this.getRemoteUserStatsByUID(ZegoEngine.this.mStatUid);
            if (remoteUserStatsByUID != null) {
                remoteUserStatsByUID.setVideoBitrate((int) zegoPlayStreamQuality.vkbps);
                remoteUserStatsByUID.setAudioDelay(zegoPlayStreamQuality.delay);
                remoteUserStatsByUID.setAudioLossRate(zegoPlayStreamQuality.pktLostRate);
                remoteUserStatsByUID.setVideoDecodeFps((int) zegoPlayStreamQuality.vdecFps);
                remoteUserStatsByUID.setVideoLossRate(zegoPlayStreamQuality.pktLostRate);
                remoteUserStatsByUID.setVideoRTT(zegoPlayStreamQuality.rtt);
                remoteUserStatsByUID.setVideoRTT(zegoPlayStreamQuality.rtt);
            }
        }
    };
    private IZegoLivePublisherCallback mLivePublisherCallback = new IZegoLivePublisherCallback() {
        public AuxData onAuxCallback(int i) {
            return null;
        }

        public void onCaptureVideoSizeChangedTo(int i, int i2) {
        }

        public void onJoinLiveRequest(int i, String str, String str2, String str3) {
        }

        public void onCaptureAudioFirstFrame() {
            LogUtil.m143691d("onCaptureAudioFirstFrame");
        }

        public void onCaptureVideoFirstFrame() {
            LogUtil.m143691d("onCaptureVideoFirstFrame");
        }

        public void onPublishQualityUpdate(String str, ZegoPublishStreamQuality zegoPublishStreamQuality) {
            StringBuilder sb = new StringBuilder("onPublishQualityUpdate, stream id: ");
            sb.append(str);
            sb.append(", quality: ");
            sb.append(zegoPublishStreamQuality.quality);
            LogUtil.m143691d(sb.toString());
            ZegoEngine.this.mCallback.onPushStreamQuality((long) zegoPublishStreamQuality.vkbps, (long) zegoPublishStreamQuality.akbps);
            ZegoEngine.this.mSendAudioBitrate = (int) zegoPublishStreamQuality.akbps;
            ZegoEngine.this.mSendVideoBitrate = (int) zegoPublishStreamQuality.vnetFps;
            ZegoEngine.this.mSendVideoFrameRate = (int) zegoPublishStreamQuality.vnetFps;
            ZegoEngine.this.mSendEncoderOutputFrameRate = (int) zegoPublishStreamQuality.vencFps;
            ZegoEngine.this.mSendVideoLoss = (int) ((((float) zegoPublishStreamQuality.pktLostRate) / 255.0f) * 100.0f);
            ZegoEngine.this.mSendAudioLoss = (int) ((((float) zegoPublishStreamQuality.pktLostRate) / 255.0f) * 100.0f);
            ZegoEngine.this.mSendVideoRTT = zegoPublishStreamQuality.rtt;
            ZegoEngine.this.mSendAudioRTT = zegoPublishStreamQuality.rtt;
            ZegoEngine.this.mUserCount = ZegoEngine.this.getGuestList().size() + 1;
        }

        public void onMixStreamConfigUpdate(int i, String str, HashMap<String, Object> hashMap) {
            StringBuilder sb = new StringBuilder("onMixStreamConfigUpdate: ");
            sb.append(i);
            sb.append("， mixStreamID: ");
            sb.append(str);
            LogUtil.m143691d(sb.toString());
        }

        public void onPublishStateUpdate(int i, String str, HashMap<String, Object> hashMap) {
            StringBuilder sb = new StringBuilder("onPublishStateUpdate, stateCode: ");
            sb.append(i);
            sb.append(", streamID: ");
            sb.append(str);
            LogUtil.m143691d(sb.toString());
            if (i == 0) {
                ZegoEngine.this.mSoundLevelMonitor = ZegoSoundLevelMonitor.getInstance();
                if (ZegoEngine.this.mConfig.getVolumeCallbackInterval() > 0) {
                    ZegoEngine.this.mSoundLevelMonitor.setCycle(ZegoEngine.this.mConfig.getVolumeCallbackInterval());
                    ZegoEngine.this.mSoundLevelMonitor.setCallback(new IZegoSoundLevelCallback() {
                        public void onSoundLevelUpdate(ZegoSoundLevelInfo[] zegoSoundLevelInfoArr) {
                            ZegoEngine.this.mGuestSoundLevelInfos = zegoSoundLevelInfoArr;
                        }

                        public void onCaptureSoundLevelUpdate(ZegoSoundLevelInfo zegoSoundLevelInfo) {
                            int i;
                            boolean z;
                            int i2;
                            boolean z2;
                            if (ZegoEngine.this.mGuestSoundLevelInfos == null || ZegoEngine.this.mGuestSoundLevelInfos.length <= 0) {
                                i = 1;
                            } else {
                                i = ZegoEngine.this.mGuestSoundLevelInfos.length + 1;
                            }
                            String[] strArr = new String[i];
                            boolean[] zArr = new boolean[i];
                            int volumeThreshold = ZegoEngine.this.mConfig.getVolumeThreshold();
                            String splitInteractIdFromStreamId = ZegoEngine.splitInteractIdFromStreamId(zegoSoundLevelInfo.streamID);
                            int i3 = (int) zegoSoundLevelInfo.soundLevel;
                            strArr[0] = splitInteractIdFromStreamId;
                            if (i3 >= volumeThreshold) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zArr[0] = z;
                            if (ZegoEngine.this.mGuestSoundLevelInfos == null) {
                                i2 = 0;
                            } else {
                                i2 = ZegoEngine.this.mGuestSoundLevelInfos.length;
                            }
                            int i4 = 0;
                            while (i4 < i2) {
                                ZegoSoundLevelInfo zegoSoundLevelInfo2 = ZegoEngine.this.mGuestSoundLevelInfos[i4];
                                i4++;
                                strArr[i4] = ZegoEngine.splitInteractIdFromStreamId(zegoSoundLevelInfo2.streamID);
                                if (((int) zegoSoundLevelInfo2.soundLevel) >= volumeThreshold) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zArr[i4] = z2;
                                RemoteUserStats remoteUserStatsByUID = ZegoEngine.this.getRemoteUserStatsByUID(strArr[i4]);
                                if (remoteUserStatsByUID != null) {
                                    remoteUserStatsByUID.setAudioVoiceVolume((int) zegoSoundLevelInfo2.soundLevel);
                                }
                            }
                            ZegoEngine.this.onTalkStateUpdated(strArr, zArr);
                        }
                    });
                    ZegoEngine.this.mSoundLevelMonitor.start();
                } else if (ZegoEngine.this.mSoundLevelMonitor != null) {
                    ZegoEngine.this.mSoundLevelMonitor.stop();
                }
                ZegoEngine.this.continueStart(2);
                if (ZegoEngine.this.mCurrentUserInRoom.size() > 0) {
                    int i2 = 0;
                    ZegoStreamInfo[] zegoStreamInfoArr = new ZegoStreamInfo[ZegoEngine.this.mCurrentUserInRoom.size()];
                    for (ZegoStreamInfo zegoStreamInfo : ZegoEngine.this.mCurrentUserInRoom.values()) {
                        int i3 = i2 + 1;
                        zegoStreamInfoArr[i2] = zegoStreamInfo;
                        i2 = i3;
                    }
                    ZegoEngine.this.onUserJoined(zegoStreamInfoArr);
                }
                ZegoEngine.this.mShouldReport = true;
                return;
            }
            StringBuilder sb2 = new StringBuilder("onStartFailed, state code: ");
            sb2.append(i);
            LogUtil.m143692e(sb2.toString());
            ZegoEngine zegoEngine = ZegoEngine.this;
            StringBuilder sb3 = new StringBuilder("state code: ");
            sb3.append(i);
            zegoEngine.onStartFailed(20004, sb3.toString());
        }
    };
    private IZegoMixStreamExCallback mMixStreamExCallback = new IZegoMixStreamExCallback() {
        public void onMixStreamExConfigUpdate(int i, String str, ZegoMixStreamResultEx zegoMixStreamResultEx) {
            String str2;
            StringBuilder sb = new StringBuilder("onMixStreamExConfigUpdate: stateCode ");
            sb.append(i);
            sb.append(", mixStreamID ");
            sb.append(str);
            if (zegoMixStreamResultEx == null) {
                str2 = "";
            } else {
                StringBuilder sb2 = new StringBuilder(", seq ");
                sb2.append(zegoMixStreamResultEx.seq);
                str2 = sb2.toString();
            }
            sb.append(str2);
            LogUtil.m143691d(sb.toString());
        }
    };
    private ZegoMixStreamConfig mMixStreamInfo;
    private IZegoMixStreamRelayCDNCallback mMixStreamRelayCDNCallback = new IZegoMixStreamRelayCDNCallback() {
        public void onMixStreamRelayCDNStateUpdate(ZegoStreamRelayCDNInfo[] zegoStreamRelayCDNInfoArr, String str) {
            String str2;
            if (zegoStreamRelayCDNInfoArr != null && zegoStreamRelayCDNInfoArr.length > 0) {
                ZegoStreamRelayCDNInfo zegoStreamRelayCDNInfo = zegoStreamRelayCDNInfoArr[0];
                if (ZegoEngine.detailDescs.isEmpty()) {
                    ZegoEngine.detailDescs.put(Integer.valueOf(0), "no error");
                    ZegoEngine.detailDescs.put(Integer.valueOf(8), "server error");
                    ZegoEngine.detailDescs.put(Integer.valueOf(9), "hand shake failed");
                    ZegoEngine.detailDescs.put(Integer.valueOf(10), "access point error");
                    ZegoEngine.detailDescs.put(Integer.valueOf(11), "create stream failed");
                    ZegoEngine.detailDescs.put(Integer.valueOf(12), "bad name");
                    ZegoEngine.detailDescs.put(Integer.valueOf(13), "cdn server disconnected");
                    ZegoEngine.detailDescs.put(Integer.valueOf(14), "disconnected");
                }
                if (ZegoEngine.detailDescs.containsKey(Integer.valueOf(zegoStreamRelayCDNInfo.detail))) {
                    str2 = (String) ZegoEngine.detailDescs.get(Integer.valueOf(zegoStreamRelayCDNInfo.detail));
                } else {
                    str2 = "unknown";
                }
                ZegoEngine.this.mLogReporter.onStreamStateChange(zegoStreamRelayCDNInfo.detail, str2, zegoStreamRelayCDNInfo.state);
            }
        }
    };
    private IZegoRoomCallback mRoomCallback = new IZegoRoomCallback() {
        public void onReconnect(int i, String str) {
        }

        public void onRecvCustomCommand(String str, String str2, String str3, String str4) {
        }

        public void onStreamExtraInfoUpdated(ZegoStreamInfo[] zegoStreamInfoArr, String str) {
        }

        public void onDisconnect(int i, String str) {
            ZegoEngine.this.mLogReporter.onConnectionLost();
            ZegoEngine.this.mLogReporter.onConnectFailed(i, "onDisconnect");
            EngineCallback engineCallback = ZegoEngine.this.mCallback;
            StringBuilder sb = new StringBuilder("zego onDisconnect, errorCode: ");
            sb.append(i);
            sb.append(", roomId: ");
            sb.append(str);
            engineCallback.onError(sb.toString());
        }

        public void onTempBroken(int i, String str) {
            ZegoEngine.this.mLogReporter.onConnectFailed(i, "onTempBroken");
            EngineCallback engineCallback = ZegoEngine.this.mCallback;
            StringBuilder sb = new StringBuilder("zego onTempBroken, errorCode: ");
            sb.append(i);
            sb.append(", roomId: ");
            sb.append(str);
            engineCallback.onWarn(sb.toString());
        }

        public void onKickOut(int i, String str, String str2) {
            EngineCallback engineCallback = ZegoEngine.this.mCallback;
            StringBuilder sb = new StringBuilder("zego onKickOut, reason: ");
            sb.append(i);
            sb.append(", roomId: ");
            sb.append(str);
            sb.append(", customReason:");
            sb.append(str2);
            engineCallback.onWarn(sb.toString());
        }

        public void onStreamUpdated(int i, ZegoStreamInfo[] zegoStreamInfoArr, String str) {
            if (zegoStreamInfoArr != null && zegoStreamInfoArr.length > 0) {
                String str2 = "";
                int i2 = 0;
                switch (i) {
                    case AdError.INTERNAL_ERROR_CODE /*2001*/:
                        if (zegoStreamInfoArr != null) {
                            int length = zegoStreamInfoArr.length;
                            while (i2 < length) {
                                ZegoStreamInfo zegoStreamInfo = zegoStreamInfoArr[i2];
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(zegoStreamInfo.userID);
                                sb.append(" ");
                                str2 = sb.toString();
                                i2++;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder("onStreamUpdated, user added: ");
                        sb2.append(str2);
                        LogUtil.m143691d(sb2.toString());
                        ZegoEngine.this.onUserJoined(zegoStreamInfoArr);
                        return;
                    case AdError.CACHE_ERROR_CODE /*2002*/:
                        if (zegoStreamInfoArr != null) {
                            int length2 = zegoStreamInfoArr.length;
                            while (i2 < length2) {
                                ZegoStreamInfo zegoStreamInfo2 = zegoStreamInfoArr[i2];
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str2);
                                sb3.append(zegoStreamInfo2.userID);
                                sb3.append(" ");
                                str2 = sb3.toString();
                                i2++;
                            }
                        }
                        StringBuilder sb4 = new StringBuilder("onStreamUpdated, user deleted: ");
                        sb4.append(str2);
                        LogUtil.m143691d(sb4.toString());
                        ZegoEngine.this.onUserLeaved(zegoStreamInfoArr);
                        break;
                }
            }
        }
    };
    public ZegoSoundLevelMonitor mSoundLevelMonitor;
    private ZegoVideoSink mVideoSink;
    public ZegoLiveRoom mZegoLiveRoom;
    private ZegoStreamMixer mZegoStreamMixer;
    private int startStatus;

    public String getVendor() {
        return "zego";
    }

    public void destroy() {
        this.mLogReporter.onEngineAPICall("destroy", null);
        super.destroy();
    }

    public ArrayList<RenderVideoFpsStatisticsReport> getVideoRenderFpsReport() {
        if (this.mVideoSink != null) {
            return this.mVideoSink.getVideoFpsReport();
        }
        return null;
    }

    public void pause() {
        this.mLogReporter.onEngineAPICall("pause", null);
        if (this.mZegoLiveRoom != null) {
            this.mZegoLiveRoom.enableMicDevice(false);
        }
    }

    public void resume() {
        this.mLogReporter.onEngineAPICall("resume", null);
        if (this.mZegoLiveRoom != null) {
            this.mZegoLiveRoom.enableMicDevice(true);
            if (this.bMuted) {
                this.mZegoLiveRoom.enableMic(false);
            }
        }
    }

    static {
        String[] strArr = {"zegoliveroom"};
        for (int i = 0; i <= 0; i++) {
            try {
                LibraryLoader.loadLibrary(strArr[0]);
            } catch (Throwable unused) {
                StringBuilder sb = new StringBuilder("Load library failed: ");
                sb.append(strArr[0]);
                AVLog.m143697e("ZegoEngine", sb.toString());
            }
        }
    }

    public void init() {
        int i;
        this.mLogReporter.onEngineAPICall("init", null);
        if (this.mConfig.getCharacter() == Character.ANCHOR && !this.mConfig.isClientMixStream() && this.mConfig.getMixStreamConfig() != null) {
            MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
            this.mZegoStreamMixer = new ZegoStreamMixer();
            this.mZegoStreamMixer.setMixStreamExCallback(this.mMixStreamExCallback);
            this.mZegoStreamMixer.setRelayCDNStateCallback(this.mMixStreamRelayCDNCallback);
            this.mMixStreamInfo = new ZegoMixStreamConfig();
            this.mMixStreamInfo.outputFps = mixStreamConfig.getVideoFrameRate();
            this.mMixStreamInfo.outputBitrate = mixStreamConfig.getVideoBitrate() * 1000;
            this.mMixStreamInfo.outputWidth = mixStreamConfig.getVideoWidth();
            this.mMixStreamInfo.outputHeight = mixStreamConfig.getVideoHeight();
            if (mixStreamConfig.getVideoCodec() == VideoCodec.H265) {
                this.mMixStreamInfo.advancedConfig = "video_encode=h265";
            }
            this.mMixStreamInfo.channels = mixStreamConfig.getAudioChannels();
            ZegoMixStreamConfig zegoMixStreamConfig = this.mMixStreamInfo;
            if (mixStreamConfig.getAudioProfile() == AudioProfile.HE) {
                i = 0;
            } else {
                i = 1;
            }
            zegoMixStreamConfig.outputAudioConfig = i;
            this.mMixStreamInfo.outputAudioBitrate = mixStreamConfig.getAudioBitrate() * 1000;
            this.mMixStreamInfo.outputBackgroundColor = mixStreamConfig.getBackgroundColor() << 8;
            this.mMixStreamInfo.outputList = new ZegoMixStreamOutput[1];
            this.mMixStreamInfo.outputList[0] = new ZegoMixStreamOutput();
            this.mMixStreamInfo.outputList[0].isUrl = true;
            mixStreamConfig.updateStreamUrlPriority();
            mixStreamConfig.updatePushCount();
            this.mMixStreamInfo.outputList[0].target = mixStreamConfig.getStreamUrl();
        }
        this.mZegoLiveRoom = new ZegoLiveRoom();
        this.mZegoLiveRoom.setLatencyMode(2);
        this.mZegoLiveRoom.setAudioBitrate(80000);
        ZegoAvConfig zegoAvConfig = new ZegoAvConfig(0);
        VideoQuality videoQuality = this.mConfig.getVideoQuality();
        zegoAvConfig.setVideoEncodeResolution(videoQuality.getWidth(), videoQuality.getHeight());
        zegoAvConfig.setVideoCaptureResolution(videoQuality.getWidth(), videoQuality.getHeight());
        zegoAvConfig.setVideoBitrate(videoQuality.getBitrate() * 1000);
        zegoAvConfig.setVideoFPS(videoQuality.getFps());
        this.mZegoLiveRoom.setAVConfig(zegoAvConfig);
        this.mZegoLiveRoom.setZegoAVEngineCallback(new IZegoAVEngineCallback() {
            public void onAVEngineStart() {
                LogUtil.m143691d("onAVEngineStart");
            }

            public void onAVEngineStop() {
                LogUtil.m143691d("onAVEngineStop, destroy zego success");
                ZegoEngine.this.mZegoLiveRoom.unInitSDK();
                ZegoEngine.this.mCallback.onDestroySuccess();
            }
        });
        this.mZegoLiveRoom.setZegoLivePublisherCallback(this.mLivePublisherCallback);
        this.mZegoLiveRoom.setZegoLivePlayerCallback(this.mLivePlayerCallback);
        this.mZegoLiveRoom.setZegoLiveEventCallback(this.mLiveEventCallback);
        this.mZegoLiveRoom.setZegoRoomCallback(this.mRoomCallback);
        this.mZegoLiveRoom.setPreviewViewMode(1);
        this.mZegoLiveRoom.initSDK(this.mConfig.getZegoAppId(), this.mConfig.getZegoSignature(), (IZegoInitSDKCompletionCallback) new IZegoInitSDKCompletionCallback() {
            public void onInitSDK(int i) {
                if (i == 0) {
                    ZegoEngine.this.mCallback.onInitSuccess();
                    return;
                }
                LogUtil.m143692e("init sdk failed");
                EngineCallback engineCallback = ZegoEngine.this.mCallback;
                StringBuilder sb = new StringBuilder("init sdk failed, error code is ");
                sb.append(i);
                engineCallback.onInitFailed(20000, sb.toString());
            }
        });
    }

    public void start() {
        int i;
        int i2;
        boolean z;
        EngineCallback engineCallback;
        EngineCallback engineCallback2 = null;
        this.mLogReporter.onEngineAPICall("start", null);
        if (this.mAudioClientFactory != null) {
            this.mAudioClient = new ZegoAudioClient(this.mAudioClientFactory);
        } else {
            this.mZegoLiveRoom.enableMicDevice(true);
        }
        this.mZegoLiveRoom.enableMic(true);
        if (this.bExternalAudioDevice) {
            int outPlayerAudioSampleHz = this.mConfig.getOutPlayerAudioSampleHz();
            int outPlayerAudioChannel = this.mConfig.getOutPlayerAudioChannel();
            if (this.mConfig.isClientMixStream()) {
                z = this.mConfig.isAutoPlayRemoteAudio();
            } else {
                z = true;
            }
            if (this.mConfig.isClientMixStream()) {
                engineCallback = this.mCallback;
            } else {
                engineCallback = null;
            }
            ZegoAudioSink zegoAudioSink = new ZegoAudioSink(outPlayerAudioSampleHz, outPlayerAudioChannel, 10, z, engineCallback);
            this.mAudioSink = zegoAudioSink;
        }
        if (this.mConfig.getType() == Type.VIDEO) {
            if (this.mVideoClientFactory == null) {
                this.mZegoLiveRoom.enableCamera(true);
            }
            if (this.mConfig.isClientMixStream()) {
                engineCallback2 = this.mCallback;
            }
            this.mVideoSink = new ZegoVideoSink(engineCallback2, this.mRenderVideoStallCallback, this.mLogReporter.getLogReportCallback(), this.mMainThreadHandler);
        }
        this.isStarting = true;
        if (this.mConfig.getCharacter() == Character.ANCHOR) {
            i = 1;
        } else {
            i = 2;
        }
        LogUtil.m143691d("zego start loginRoom");
        if ((this.mConfig.getChannelName() == null || this.mConfig.getChannelName().equals("0") || this.mConfig.getInteractId() == 0 || this.mConfig.getZegoSignature() == null || this.mConfig.getZegoThirdPartyToken() == null) && this.mCallback != null) {
            EngineCallback engineCallback3 = this.mCallback;
            StringBuilder sb = new StringBuilder("join channel parameters error channel name:");
            sb.append(this.mConfig.getChannelName());
            sb.append(" ,interactID:");
            sb.append(this.mConfig.getInteractId());
            engineCallback3.onStartFailed(-8000, sb.toString());
            this.mLogReporter.onErrorOccurs(-8000, String.valueOf(this.mConfig.getInteractId()), String.valueOf(this.mConfig.getZegoSignature()));
            return;
        }
        this.mZegoLiveRoom.setCustomToken(this.mConfig.getZegoThirdPartyToken());
        boolean loginRoom = this.mZegoLiveRoom.loginRoom(this.mConfig.getChannelName(), i, new IZegoLoginCompletionCallback() {
            public void onLoginCompletion(int i, ZegoStreamInfo[] zegoStreamInfoArr) {
                if (i != 0) {
                    LogUtil.m143692e("login room failed");
                    ZegoEngine zegoEngine = ZegoEngine.this;
                    StringBuilder sb = new StringBuilder("login room failed, error code is ");
                    sb.append(i);
                    zegoEngine.onStartFailed(20001, sb.toString());
                    ZegoEngine.this.mLogReporter.onErrorOccurs(i, String.valueOf(ZegoEngine.this.mConfig.getInteractId()), String.valueOf(ZegoEngine.this.mConfig.getZegoSignature()));
                    return;
                }
                String str = "";
                if (zegoStreamInfoArr != null) {
                    for (ZegoStreamInfo zegoStreamInfo : zegoStreamInfoArr) {
                        ZegoEngine.this.mCurrentUserInRoom.put(zegoStreamInfo.userID, zegoStreamInfo);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(zegoStreamInfo.userID);
                        sb2.append(" ");
                        str = sb2.toString();
                    }
                }
                StringBuilder sb3 = new StringBuilder("onLoginCompletion, users: ");
                sb3.append(str);
                LogUtil.m143691d(sb3.toString());
                ZegoEngine.this.continueStart(1);
                ZegoEngine.this.mLogReporter.onJoinChannelSuccess();
            }
        });
        if (mAppId != null && !mAppId.equals(String.valueOf(this.mConfig.getZegoAppId()))) {
            this.mSwitchAppId = true;
        }
        LogReporter logReporter = this.mLogReporter;
        int i3 = 0;
        if (loginRoom) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        logReporter.onJoiningChannel(i2, new String(this.mConfig.getZegoSignature()), String.valueOf(this.mConfig.getZegoAppId()), this.mSwitchAppId);
        LogUtil.m143691d("zego start publishing");
        ZegoLiveRoom zegoLiveRoom = this.mZegoLiveRoom;
        String streamId = getStreamId(this.mConfig.getInteractId());
        String valueOf = String.valueOf(this.mConfig.getUserId());
        if (this.mConfig.getCharacter() == Character.ANCHOR) {
            i3 = 2;
        }
        if (!zegoLiveRoom.startPublishing(streamId, valueOf, i3)) {
            LogUtil.m143692e("start publishing failed");
            onStartFailed(20002, "start publishing failed");
        }
    }

    public void stop() {
        LogUtil.m143691d("stop zego");
        this.mLogReporter.onEngineAPICall("stop", null);
        if (this.mConfig.getCharacter() == Character.ANCHOR && !this.mConfig.isClientMixStream() && this.mZegoStreamMixer != null && this.mMixStreamInfo != null) {
            this.mMixStreamInfo.lenOfUserData = 0;
            this.mMixStreamInfo.inputStreamList = null;
            if (this.mZegoStreamMixer.mixStreamEx(this.mMixStreamInfo, getMixStreamId(this.mConfig.getInteractId())) <= 0) {
                LogUtil.m143692e("failed mix stream");
            }
            this.mLogReporter.onRtcUpdateLayout(getMixStreamInfo(this.mMixStreamInfo));
        }
        this.mZegoLiveRoom.enableMic(false);
        this.mZegoLiveRoom.enableMicDevice(false);
        this.mZegoLiveRoom.enableCamera(false);
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
        if (this.mVideoSink != null) {
            this.mVideoSink.stop();
            this.mVideoSink.release();
            this.mVideoSink = null;
        }
        if (this.mConfig.getVolumeCallbackInterval() > 0 && this.mSoundLevelMonitor != null) {
            this.mSoundLevelMonitor.stop();
        }
        for (ZegoStreamInfo zegoStreamInfo : this.mCurrentUserInRoom.values()) {
            this.mZegoLiveRoom.stopPlayingStream(zegoStreamInfo.streamID);
        }
        boolean stopPublishing = this.mZegoLiveRoom.stopPublishing();
        boolean logoutRoom = this.mZegoLiveRoom.logoutRoom();
        if (this.mFirstVideoFrameTimeStamp.size() > 0) {
            for (Entry value : this.mFirstVideoFrameTimeStamp.entrySet()) {
                this.mPullStreamsDuration += System.currentTimeMillis() - ((Long) value.getValue()).longValue();
            }
        }
        this.mFirstVideoFrameTimeStamp.clear();
        this.mLogReporter.onLeavingChannel(this.mPullStreamsDuration);
        this.mPullStreamsDuration = 0;
        this.mLogReporter.onLeaveChannelReturn();
        super.stop();
        if (!stopPublishing || !logoutRoom) {
            if (!stopPublishing) {
                LogUtil.m143691d("zego stop publish failed");
                this.mCallback.onStopFailed(20003, "stop publishing failed");
            } else {
                LogUtil.m143691d("zego logout room failed");
                this.mCallback.onStopFailed(20004, "logout room failed");
            }
            super.destroy();
        } else {
            LogUtil.m143691d("stop zego success");
            this.mCallback.onStopSuccess();
        }
        this.startStatus = 0;
        this.mShouldReport = false;
    }

    private String getMixStreamId(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(getStreamId(i));
        sb.append("-mix");
        return sb.toString();
    }

    private String getStreamId(int i) {
        StringBuilder sb = new StringBuilder("s-");
        sb.append(this.mConfig.getChannelName());
        sb.append("-");
        sb.append(i);
        return sb.toString();
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        this.mLogReporter.onEngineAPICall("muteAllRemoteAudioStreams", C1642a.m8034a(" mute:%b", new Object[]{Boolean.valueOf(z)}));
    }

    public static String splitInteractIdFromStreamId(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.contains("-")) {
            return "";
        }
        String[] split = str.split("-");
        if (split.length < 3) {
            return "";
        }
        return split[2];
    }

    public static int splitInteractIdFromUserId(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("_")) {
            return -1;
        }
        String[] split = str.split("_");
        if (split.length <= 0) {
            return -1;
        }
        try {
            return Integer.parseInt(split[0]);
        } catch (Exception unused) {
            return -1;
        }
    }

    private String wrapSEI(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_data", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            LogUtil.m143692e(e.toString());
            EngineCallback engineCallback = this.mCallback;
            StringBuilder sb = new StringBuilder("zego wrap sei error: ");
            sb.append(e.toString());
            engineCallback.onWarn(sb.toString());
            return null;
        }
    }

    public void continueStart(int i) {
        if (this.isStarting) {
            this.startStatus = i | this.startStatus;
            if (this.startStatus == 3) {
                this.isStarting = false;
                this.mCallback.onStartSuccess();
                if (this.mAudioClient != null) {
                    this.mAudioClient.start();
                }
                if (this.mAudioSink != null) {
                    this.mAudioSink.start();
                }
                if (this.mVideoSink != null) {
                    this.mVideoSink.start();
                }
            }
        }
    }

    public void switchAudio(boolean z) {
        this.mLogReporter.onEngineAPICall("switchAudio", C1642a.m8034a("enable:%b", new Object[]{Boolean.valueOf(z)}));
        this.bMuted = !z;
        this.mZegoLiveRoom.enableMic(z);
    }

    public void onUserJoined(ZegoStreamInfo[] zegoStreamInfoArr) {
        if (zegoStreamInfoArr != null && zegoStreamInfoArr.length > 0) {
            for (ZegoStreamInfo zegoStreamInfo : zegoStreamInfoArr) {
                try {
                    int splitInteractIdFromUserId = splitInteractIdFromUserId(zegoStreamInfo.userID);
                    if (splitInteractIdFromUserId > 0) {
                        recordGuestJoined(splitInteractIdFromUserId);
                        this.mCurrentUserInRoom.put(zegoStreamInfo.userID, zegoStreamInfo);
                        if (this.startStatus == 3) {
                            if (splitInteractIdFromUserId != this.mConfig.getInteractId()) {
                                this.mCallback.onUserJoined(splitInteractIdFromUserId);
                                LogReporter logReporter = this.mLogReporter;
                                StringBuilder sb = new StringBuilder();
                                sb.append(splitInteractIdFromUserId);
                                logReporter.onRemoteUserOnlineOffline(true, sb.toString());
                                this.mCallback.onFirstRemoteAudioFrame(splitInteractIdFromUserId);
                                LogReporter logReporter2 = this.mLogReporter;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(splitInteractIdFromUserId);
                                logReporter2.onFirstRemoteFrame(true, sb2.toString());
                                SurfaceView surfaceView = new SurfaceView(this.mContext);
                                this.mZegoLiveRoom.startPlayingStream(zegoStreamInfo.streamID, surfaceView);
                                this.mCallback.onFirstRemoteVideoFrame(splitInteractIdFromUserId, surfaceView);
                                if (!this.mFirstVideoFrameTimeStamp.containsKey(String.valueOf(splitInteractIdFromUserId))) {
                                    this.mFirstVideoFrameTimeStamp.put(String.valueOf(splitInteractIdFromUserId), Long.valueOf(System.currentTimeMillis()));
                                }
                                LogReporter logReporter3 = this.mLogReporter;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(splitInteractIdFromUserId);
                                logReporter3.onFirstRemoteFrame(false, sb3.toString());
                                this.mZegoLiveRoom.setViewMode(1, zegoStreamInfo.streamID);
                                ZegoVideoSink.enableVideoFrameCallback(true, zegoStreamInfo.streamID);
                                if (this.mVideoSink != null) {
                                    this.mVideoSink.onUserJoined(splitInteractIdFromUserId);
                                }
                                this.mRemoteStateMap.put(String.valueOf(splitInteractIdFromUserId), new RemoteUserStats(String.valueOf(splitInteractIdFromUserId)));
                            } else {
                                return;
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    LogUtil.m143692e(e.toString());
                    EngineCallback engineCallback = this.mCallback;
                    StringBuilder sb4 = new StringBuilder("zego parse user id to int error: ");
                    sb4.append(e.toString());
                    engineCallback.onWarn(sb4.toString());
                }
            }
        }
    }

    public void onUserLeaved(ZegoStreamInfo[] zegoStreamInfoArr) {
        int i;
        if (zegoStreamInfoArr != null && zegoStreamInfoArr.length > 0) {
            for (ZegoStreamInfo zegoStreamInfo : zegoStreamInfoArr) {
                try {
                    i = splitInteractIdFromUserId(zegoStreamInfo.userID);
                } catch (NumberFormatException e) {
                    LogUtil.m143692e(e.toString());
                    EngineCallback engineCallback = this.mCallback;
                    StringBuilder sb = new StringBuilder("zego parse user id to int error: ");
                    sb.append(e.toString());
                    engineCallback.onWarn(sb.toString());
                    i = 0;
                }
                if (i > 0) {
                    if (this.mFirstVideoFrameTimeStamp.containsKey(String.valueOf(i))) {
                        this.mPullStreamsDuration += System.currentTimeMillis() - ((Long) this.mFirstVideoFrameTimeStamp.get(String.valueOf(i))).longValue();
                        this.mFirstVideoFrameTimeStamp.remove(String.valueOf(i));
                    }
                    recordGuestLeaved(i);
                    this.mCurrentUserInRoom.remove(zegoStreamInfo.userID);
                    if (this.startStatus == 3) {
                        LogReporter logReporter = this.mLogReporter;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i);
                        logReporter.onRemoteUserOnlineOffline(false, sb2.toString());
                        ZegoVideoSink.enableVideoFrameCallback(false, zegoStreamInfo.streamID);
                        if (this.mVideoSink != null) {
                            this.mVideoSink.onUserLeaved(i);
                        }
                        this.mZegoLiveRoom.stopPlayingStream(zegoStreamInfo.streamID);
                        this.mCallback.onUserLeaved(i);
                        this.mRemoteStateMap.remove(String.valueOf(i));
                    }
                }
            }
        }
    }

    private String getMixStreamInfo(ZegoMixStreamConfig zegoMixStreamConfig) {
        ZegoMixStreamOutput[] zegoMixStreamOutputArr;
        ZegoMixStreamInfo[] zegoMixStreamInfoArr;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        try {
            jSONObject2.put("output_fps", zegoMixStreamConfig.outputFps);
            jSONObject2.put("output_rate_control_mode", zegoMixStreamConfig.outputRateControlMode);
            jSONObject2.put("output_bitrate", zegoMixStreamConfig.outputBitrate);
            jSONObject2.put("output_quality", zegoMixStreamConfig.outputQuality);
            jSONObject2.put("output_audio_bitrate", zegoMixStreamConfig.outputAudioBitrate);
            jSONObject2.put("output_width", zegoMixStreamConfig.outputWidth);
            jSONObject2.put("output_height", zegoMixStreamConfig.outputHeight);
            jSONObject2.put("outputAudioConfig", zegoMixStreamConfig.outputAudioConfig);
            zegoMixStreamConfig.userData.flip();
            jSONObject2.put("user_data", new String(zegoMixStreamConfig.userData.array(), zegoMixStreamConfig.userData.position(), zegoMixStreamConfig.userData.limit(), "utf-8"));
            zegoMixStreamConfig.userData.flip();
            jSONObject2.put("len_of_user_data", zegoMixStreamConfig.lenOfUserData);
            jSONObject2.put("channels", zegoMixStreamConfig.channels);
            jSONObject2.put("outputBackgroundColor", zegoMixStreamConfig.outputBackgroundColor);
            if (zegoMixStreamConfig.inputStreamList != null) {
                for (ZegoMixStreamInfo zegoMixStreamInfo : zegoMixStreamConfig.inputStreamList) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("stream_id", zegoMixStreamInfo.streamID);
                    jSONObject3.put("top", zegoMixStreamInfo.top);
                    jSONObject3.put("bottom", zegoMixStreamInfo.bottom);
                    jSONObject3.put("left", zegoMixStreamInfo.left);
                    jSONObject3.put("right", zegoMixStreamInfo.right);
                    jSONObject3.put("sound_level_id", zegoMixStreamInfo.soundLevelID);
                    jSONObject3.put("content_control", zegoMixStreamInfo.contentControl);
                    jSONArray.put(jSONObject3);
                }
            }
            if (zegoMixStreamConfig.outputList != null) {
                for (ZegoMixStreamOutput zegoMixStreamOutput : zegoMixStreamConfig.outputList) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("is_url", zegoMixStreamOutput.isUrl);
                    jSONObject4.put("target", zegoMixStreamOutput.target);
                    jSONArray2.put(jSONObject4);
                }
            }
            jSONObject.put("output_config", jSONObject2);
            jSONObject.put("input_streams", jSONArray);
            jSONObject.put("output_streams", jSONArray2);
            return jSONObject.toString();
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("create layout json message happen exception: ");
            sb.append(e);
            LogUtil.m143692e(sb.toString());
            return null;
        } catch (UnsupportedEncodingException e2) {
            StringBuilder sb2 = new StringBuilder("create layout json message happen unsupported encoding exception: ");
            sb2.append(e2);
            LogUtil.m143692e(sb2.toString());
            return null;
        }
    }

    public void onStartFailed(int i, String str) {
        this.isStarting = false;
        this.startStatus = 0;
        this.mCallback.onStartFailed(i, str);
    }

    public void muteRemoteAudioStream(int i, boolean z) {
        this.mLogReporter.onEngineAPICall("muteRemoteAudioStream", C1642a.m8034a("interactId:%d, mute:%b", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)}));
    }

    public void mixStream(List<Region> list, boolean z) {
        int i;
        int i2;
        if (this.mConfig.getCharacter() == Character.ANCHOR) {
            if (this.mConfig.isClientMixStream()) {
                this.mLogReporter.onPublishStream(0);
            } else if (this.mZegoStreamMixer != null && this.mMixStreamInfo != null) {
                String wrapSEI = wrapSEI(createSei(list));
                byte[] bArr = new byte[0];
                if (wrapSEI != null) {
                    bArr = wrapSEI.getBytes();
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
                allocateDirect.put(bArr);
                this.mMixStreamInfo.userData = allocateDirect;
                this.mMixStreamInfo.lenOfUserData = bArr.length;
                this.mMixStreamInfo.extra = z ^ true ? 1 : 0;
                if (list == null) {
                    i = 0;
                } else {
                    i = list.size();
                }
                ZegoMixStreamInfo[] zegoMixStreamInfoArr = new ZegoMixStreamInfo[i];
                for (int i3 = 0; i3 < i; i3++) {
                    ZegoMixStreamInfo zegoMixStreamInfo = new ZegoMixStreamInfo();
                    Region region = (Region) list.get(i3);
                    double d = (double) this.mOutputHeight;
                    double y = region.getY();
                    Double.isNaN(d);
                    zegoMixStreamInfo.top = (int) (d * y);
                    int i4 = zegoMixStreamInfo.top;
                    double d2 = (double) this.mOutputHeight;
                    double height = region.getHeight();
                    Double.isNaN(d2);
                    zegoMixStreamInfo.bottom = i4 + ((int) (d2 * height));
                    double d3 = (double) this.mOutputWidth;
                    double x = region.getX();
                    Double.isNaN(d3);
                    zegoMixStreamInfo.left = (int) (d3 * x);
                    int i5 = zegoMixStreamInfo.left;
                    double d4 = (double) this.mOutputWidth;
                    double width = region.getWidth();
                    Double.isNaN(d4);
                    zegoMixStreamInfo.right = i5 + ((int) (d4 * width));
                    zegoMixStreamInfo.streamID = getStreamId(region.getInteractId());
                    if (region.isMuteAudio()) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    zegoMixStreamInfo.contentControl = i2;
                    zegoMixStreamInfoArr[i3] = zegoMixStreamInfo;
                }
                this.mMixStreamInfo.inputStreamList = zegoMixStreamInfoArr;
                int mixStreamEx = this.mZegoStreamMixer.mixStreamEx(this.mMixStreamInfo, getMixStreamId(this.mConfig.getInteractId()));
                if (mixStreamEx <= 0) {
                    LogUtil.m143692e("failed mix stream");
                }
                this.mLogReporter.onPublishStream(mixStreamEx);
                this.mLogReporter.onRtcUpdateLayout(getMixStreamInfo(this.mMixStreamInfo));
            }
        }
    }

    public ZegoEngine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        super(config, videoClientFactory, audioClientFactory, engineCallback);
        if (sSDKContext == null) {
            C457291 r1 = new SDKContextEx() {
                public long getLogFileSize() {
                    return 10;
                }

                public String getLogPath() {
                    return null;
                }

                public String getSoFullPath() {
                    return null;
                }

                public String getSubLogFolder() {
                    return null;
                }

                public Application getAppContext() {
                    return (Application) ZegoEngine.this.mContext.getApplicationContext();
                }
            };
            sSDKContext = r1;
            ZegoLiveRoom.setSDKContext(r1);
            ZegoLiveRoom.setTestEnv(this.mConfig.isTest());
            ZegoLiveRoom.setBusinessType(0);
            ZegoLiveRoom.setVerbose(this.mConfig.isTest());
            StringBuilder sb = new StringBuilder("------ Zego SDK version: ");
            sb.append(ZegoLiveRoom.version());
            sb.append(", version 2: ");
            sb.append(ZegoLiveRoom.version2());
            LogUtil.m143693i(sb.toString());
            this.mLogReporter.setThirdPartyRtcVersion(ZegoLiveRoom.version());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mConfig.getInteractId());
        sb2.append("_");
        sb2.append(this.mConfig.getUserId());
        ZegoLiveRoom.setUser(sb2.toString(), String.valueOf(this.mConfig.getUserId()));
        if (this.mAudioClientFactory != null || this.mConfig.isClientMixStream()) {
            ZegoExternalAudioDevice.enableExternalAudioDevice(true);
            this.bExternalAudioDevice = true;
            if (this.mAudioClientFactory == null) {
                LogUtil.m143692e("If you want to play audio externally, you should also input audio by yourself !!!");
                throw new AndroidRuntimeException("You need to set an AudioClientFactory !!!");
            } else if (!this.mConfig.isClientMixStream()) {
                LogUtil.m143695w("You have set an external audio source, but forget to enable external audio render, the interact sdk will helps you to render it.");
            }
        } else {
            ZegoLiveRoom.setAudioDeviceMode(1);
        }
        if (this.mConfig.getType() == Type.VIDEO) {
            if (this.mVideoClientFactory != null) {
                ZegoExternalVideoCapture.setVideoCaptureFactory(new ZegoVideoCaptureFactory() {
                    public void destroy(ZegoVideoCaptureDevice zegoVideoCaptureDevice) {
                    }

                    /* access modifiers changed from: 0000 */
                    public final /* synthetic */ void lambda$create$0$ZegoEngine$2() {
                        ZegoEngine.this.mLogReporter.onFirstLocalExternalVideoFrame();
                        ZegoEngine.this.mTotalRenderFps++;
                    }

                    public ZegoVideoCaptureDevice create(String str) {
                        ZegoVideoClient zegoVideoClient = new ZegoVideoClient(ZegoEngine.this.mVideoClientFactory, ZegoEngine.this.mConfig.getFrameFormat(), ZegoEngine.this.mConfig.getVideoQuality());
                        ZegoEngine.this.mVideoClientStatisic = zegoVideoClient;
                        zegoVideoClient.setOnPushFrameSuccessListener(new ZegoEngine$2$$Lambda$0(this));
                        return zegoVideoClient;
                    }
                }, 0);
            }
            ZegoVideoSink.enableExternalVideoRender(true);
        }
        ZegoLiveRoom.requireHardwareDecoder(true);
        ZegoLiveRoom.requireHardwareEncoder(true);
    }
}

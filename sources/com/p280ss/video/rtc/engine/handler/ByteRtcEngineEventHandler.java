package com.p280ss.video.rtc.engine.handler;

import com.p280ss.video.rtc.engine.ByteStream;
import com.p280ss.video.rtc.engine.InternalAudioVolumeInfo;
import com.p280ss.video.rtc.engine.InternalLocalAudioStats;
import com.p280ss.video.rtc.engine.InternalLocalVideoStats;
import com.p280ss.video.rtc.engine.InternalRemoteAudioStats;
import com.p280ss.video.rtc.engine.InternalRemoteVideoStats;
import com.p280ss.video.rtc.engine.InternalRtcStats;
import com.p280ss.video.rtc.engine.RtcEngineImpl.C46266RtcEngineImpl;
import com.p280ss.video.rtc.engine.SubscribeConfig;
import com.p280ss.video.rtc.engine.SubscribeState;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.AudioVolumeInfo;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.LocalAudioStats;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.LocalVideoStats;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RemoteAudioStats;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RemoteVideoStats;
import com.p280ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcStats;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.engine.handler.ByteRtcEngineEventHandler */
public class ByteRtcEngineEventHandler {
    private long mJoinChannelTime;
    private String mRoom;
    private WeakReference<C46266RtcEngineImpl> mRtcEngineImpl;
    private String mSession;
    private State mState = State.IDLE;
    private String mUser;

    /* renamed from: com.ss.video.rtc.engine.handler.ByteRtcEngineEventHandler$State */
    enum State {
        IDLE,
        IN_ROOM
    }

    public void onAudioMixingFinished() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onAudioMixingFinished...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onAudioMixingFinished();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onAudioMixingFinished callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onCameraReady() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onCameraReady...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onCameraReady();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onCameraReady callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onConnectionBanned() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onConnectionBanned...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onConnectionBanned();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onConnectionBanned callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onConnectionInterrupted() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onConnectionInterrupt...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onConnectionInterrupted();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onConnectionInterrupted callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onConnectionLost() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onConnectionLost...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onConnectionLost();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onConnectionLost callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onMediaEngineLoadSuccess() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onMediaEngineLoadSuccess...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onMediaEngineLoadSuccess();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onMediaEngineLoadSuccess callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onMediaEngineStartCallSuccess() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onMediaEngineStartCallSuccess...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onMediaEngineStartCallSuccess();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onMediaEngineStartCallSuccess callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onRequestToken() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onRequestToken...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onRequestToken();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onRequestToken callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onVideoStopped() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onVideoStopped...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onVideoStopped();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onVideoStopped callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onWebsocketConnected() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onWebsocketConnected...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onConnectionStateChanged(3, -1);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onWebsocketConnected callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onWebsocketConnecting() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onWebsocketConnecting...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onConnectionStateChanged(2, -1);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onWebsocketConnecting callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onWebsocketDisconnected() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onWebsocketDisconnected...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onConnectionStateChanged(1, -1);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onWebsocketDisconnected callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onWebsocketReconnecting() {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onWebsocketReconnecting...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onConnectionStateChanged(4, -1);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onWebsocketReconnecting callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void setJoinChannelTime(long j) {
        this.mJoinChannelTime = j;
    }

    public ByteRtcEngineEventHandler(C46266RtcEngineImpl rtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rtcEngineImpl);
    }

    public void onActiveSpeaker(String str) {
        StringBuilder sb = new StringBuilder("onActiveSpeaker...uid: ");
        sb.append(str);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onActiveSpeaker(str);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onActiveSpeaker callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onAudioEffectFinished(int i) {
        StringBuilder sb = new StringBuilder("onAudioEffectFinished...soundId: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onAudioEffectFinished(i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onAudioEffectFinished callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onCustomMessage(String str) {
        StringBuilder sb = new StringBuilder("onCustomMessage: ");
        sb.append(str);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onCustomMessage(str);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onCustomMessage callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onError(int i) {
        StringBuilder sb = new StringBuilder("onError...errorNum: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onError(i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onError callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onFirstLocalAudioFrame(int i) {
        StringBuilder sb = new StringBuilder("onFirstLocalAudioFrame...elapsed: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onFirstLocalAudioFrame(i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onFirstLocalAudioFrame callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onLastmileQuality(int i) {
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onLastmileQuality(i);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onLastmileQuality callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onLeaveChannel(InternalRtcStats internalRtcStats) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onLeaveChannel...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onLeaveChannel(new RtcStats(internalRtcStats));
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onLeaveChannel callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onLocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onLocalAudioStats...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onLocalAudioStats(new LocalAudioStats(internalLocalAudioStats));
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onLocalAudioStats callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onLocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onLocalVideoStats...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onLocalVideoStats(new LocalVideoStats(internalLocalVideoStats));
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onLocalVideoStats callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onNetStateChanged(int i) {
        StringBuilder sb = new StringBuilder("onNetStateChanged...time: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onNetStateChanged(i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onNetStateChanged callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onRemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onRemoteAudioStats...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onRemoteAudioStats(new RemoteAudioStats(internalRemoteAudioStats));
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onRemoteAudioStats callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onRemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onRemoteVideoStats...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onRemoteVideoStats(new RemoteVideoStats(internalRemoteVideoStats));
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onRemoteVideoStats callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onResponse(String str) {
        StringBuilder sb = new StringBuilder("onResponse, res: ");
        sb.append(str);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onResponse(str);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onResponse callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onRtcStats(InternalRtcStats internalRtcStats) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onRtcStats...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onRtcStats(new RtcStats(internalRtcStats));
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onRtcStats callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onStreamAdd(ByteStream byteStream) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onStreamAdd...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onStreamAdd(byteStream);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onStreamAdd callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onStreamPublishSucceed(String str) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onStreamPublishSucceed...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onStreamPublishSucceed(str);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onStreamPublishSucceed callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onStreamRemove(ByteStream byteStream) {
        StringBuilder sb = new StringBuilder("onStreamRemove...uid: ");
        sb.append(byteStream.userId);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onStreamRemove(byteStream);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onStreamRemove callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onWarning(int i) {
        StringBuilder sb = new StringBuilder("onWarning, warnNum: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onWarning(i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onWarning callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void uploadLogFinished(boolean z) {
        StringBuilder sb = new StringBuilder("uploadLogFinished...uploadLogResult: ");
        sb.append(z);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().uploadLogFinished(z);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("uploadLogFinished callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onAudioRouteChanged(int i) {
        StringBuilder sb = new StringBuilder("onAudioRouteChanged...routing: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (this.mRtcEngineImpl != null) {
                if (i == 0) {
                    ((C46266RtcEngineImpl) this.mRtcEngineImpl.get()).setHeadsetConnectionStatus(true);
                } else {
                    ((C46266RtcEngineImpl) this.mRtcEngineImpl.get()).setHeadsetConnectionStatus(false);
                }
            }
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onAudioRouteChanged(i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onAudioRouteChanged callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onAudioVolumeIndication(InternalAudioVolumeInfo[] internalAudioVolumeInfoArr, int i) {
        try {
            AudioVolumeInfo[] audioVolumeInfoArr = new AudioVolumeInfo[internalAudioVolumeInfoArr.length];
            for (int i2 = 0; i2 < internalAudioVolumeInfoArr.length; i2++) {
                audioVolumeInfoArr[i2] = new AudioVolumeInfo(internalAudioVolumeInfoArr[i2]);
            }
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onAudioVolumeIndication(audioVolumeInfoArr, i);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onAudioVolumeIndication callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onMessageReceived(String str, String str2) {
        StringBuilder sb = new StringBuilder("onMessageReceived: ");
        sb.append(str);
        sb.append(str2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onMessageReceived(str, str2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onMessageReceived callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onMessageSendResult(long j, int i) {
        StringBuilder sb = new StringBuilder("onMessageSendResult: ");
        sb.append(j);
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onMessageSendResult(j, i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onMessageSendResult callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void OnTranscodingError(String str, int i) {
        StringBuilder sb = new StringBuilder("OnTranscodingError error(");
        sb.append(i);
        sb.append(") url:");
        sb.append(str);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onStreamPublished(str, i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("OnTranscodingError callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onApiCallExecuted(String str, int i) {
        StringBuilder sb = new StringBuilder("onApiCallExecuted, api: ");
        sb.append(str);
        sb.append(", error: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onApiCallExecuted(str, i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onApiCallExecuted callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onClientRoleChanged(int i, int i2) {
        StringBuilder sb = new StringBuilder("onClientRoleChanged...oldRole: ");
        sb.append(i);
        sb.append(", newRole: ");
        sb.append(i2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onClientRoleChanged(i, i2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onClientRoleChanged callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onFirstRemoteAudioFrame(String str, int i) {
        StringBuilder sb = new StringBuilder("onFirstRemoteAudioFrame...uid: ");
        sb.append(str);
        sb.append(", elapsed: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onFirstRemoteAudioFrame(str, (long) i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onFirstRemoteAudioFrame callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onInviteAcceptedByPeer(String str, String str2) {
        StringBuilder sb = new StringBuilder("onInviteAcceptedByPeer...roomid: ");
        sb.append(str);
        sb.append(", phoneNumber: ");
        sb.append(str2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onInviteAcceptedByPeer(str, str2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onInviteAcceptedByPeer callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onInviteEndByMyself(String str, String str2) {
        StringBuilder sb = new StringBuilder("onInviteEndByMyself...roomid: ");
        sb.append(str);
        sb.append(", phoneNumber: ");
        sb.append(str2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onInviteEndByMyself(str, str2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onInviteEndByMyself callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onInviteEndByPeer(String str, String str2) {
        StringBuilder sb = new StringBuilder("onInviteEndByPeer...roomid: ");
        sb.append(str);
        sb.append(", phoneNumber: ");
        sb.append(str2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onInviteEndByPeer(str, str2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onInviteEndByPeer callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onInviteReceivedByPeer(String str, String str2) {
        StringBuilder sb = new StringBuilder("onInviteReceivedByPeer...roomid: ");
        sb.append(str);
        sb.append(", phoneNumber: ");
        sb.append(str2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onInviteReceivedByPeer(str, str2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onInviteReceivedByPeer callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onScreenStreamRemove(String str, String str2) {
        StringBuilder sb = new StringBuilder("onScreenStreamRemove...uid: ");
        sb.append(str);
        sb.append(", streamInfo: ");
        sb.append(str2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onScreenStreamRemove(str, str2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onScreenStreamRemove callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onSetupVideoError(String str, String str2) {
        StringBuilder sb = new StringBuilder("onSetupVideoError...uid: ");
        sb.append(str);
        sb.append(", errorInfo: ");
        sb.append(str2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onSetupVideoError(str, str2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onSetupVideoError callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onStreamRemove(String str, String str2) {
        StringBuilder sb = new StringBuilder("onStreamRemove...uid: ");
        sb.append(str);
        sb.append(", streamInfo: ");
        sb.append(str2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onStreamRemove(str, str2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onStreamRemove 2 callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onUserEnableAudio(String str, boolean z) {
        StringBuilder sb = new StringBuilder("onUserEnableAudio... uid: ");
        sb.append(str);
        sb.append(", enabled: ");
        sb.append(z);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onUserEnableAudio(str, z);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onUserEnableAudio callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        StringBuilder sb = new StringBuilder("onUserEnableLocalAudio... uid: ");
        sb.append(str);
        sb.append(", enabled: ");
        sb.append(z);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onUserEnableLocalAudio(str, z);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onUserEnableLocalAudio callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onUserEnableLocalVideo(String str, boolean z) {
        StringBuilder sb = new StringBuilder("onUserEnableLocalVideo... uid: ");
        sb.append(str);
        sb.append(", enabled: ");
        sb.append(z);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onUserEnableLocalVideo(str, z);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onUserEnableLocalVideo callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onUserEnableVideo(String str, boolean z) {
        StringBuilder sb = new StringBuilder("onUserEnableVideo... uid: ");
        sb.append(str);
        sb.append(", enabled: ");
        sb.append(z);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onUserEnableVideo(str, z);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onUserEnableVideo callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onUserJoined(String str, int i) {
        StringBuilder sb = new StringBuilder("onUserJoined... uid: ");
        sb.append(str);
        sb.append(", elapsed: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onUserJoined(str, i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onUserJoined callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onUserMuteAudio(String str, boolean z) {
        StringBuilder sb = new StringBuilder("onUserMuteAudio... uid: ");
        sb.append(str);
        sb.append(", muted: ");
        sb.append(z);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onUserMuteAudio(str, z);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onUserMuteAudio callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onUserMuteVideo(String str, boolean z) {
        StringBuilder sb = new StringBuilder("onUserMuteVideo... uid: ");
        sb.append(str);
        sb.append(", muted: ");
        sb.append(z);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onUserMuteVideo(str, z);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onUserMuteVideo callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onUserOffline(String str, int i) {
        StringBuilder sb = new StringBuilder("onUserOffline... uid: ");
        sb.append(str);
        sb.append(", reason: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onUserOffline(str, i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onUserOffline callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onLogReport(String str, String str2) {
        try {
            if ("live_webrtc_monitor_log".equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                        C46266RtcEngineImpl.getRtcEngineHandler().onLogReport(str, jSONObject);
                    }
                    try {
                        if ("rtc_media_statistics".equals(jSONObject.getString("event_key")) || "rtc_transport_statistics".equals(jSONObject.getString("event_key"))) {
                            return;
                        }
                    } catch (JSONException e) {
                        String str3 = "ByteRtcEngineEventHandler";
                        StringBuilder sb = new StringBuilder("onLogReport...get event_key catch exception: ");
                        sb.append(e.getMessage());
                        LogUtil.m145278d(str3, sb.toString());
                        return;
                    }
                } catch (JSONException e2) {
                    StringBuilder sb2 = new StringBuilder("onLogReport...parse json catch exception: ");
                    sb2.append(e2.getMessage());
                    LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
                    return;
                }
            }
            LogUtil.m145281i(str, str2);
        } catch (Exception e3) {
            StringBuilder sb3 = new StringBuilder("onLogReport callback catch exception.\n");
            sb3.append(e3.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb3.toString());
        }
    }

    public void onJoinChannelSuccess(String str, String str2, int i) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onJoinChannelSuccess...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onJoinChannelSuccess(str, str2, i);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onJoinChannelSuccess callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onRejoinChannelSuccess(String str, String str2, int i) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onRejoinChannelSuccess...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onRejoinChannelSuccess(str, str2, i);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onRejoinChannelSuccess callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        LogUtil.m145278d("ByteRtcEngineEventHandler", "onStreamSubscribed...");
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onStreamSubscribed(SubscribeState.values()[i], str, subscribeConfig);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onStreamSubscribed callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onFirstLocalScreenFrame(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("onFirstLocalScreenFrame...width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        sb.append(", elapsed: ");
        sb.append(i3);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onFirstLocalScreenFrame(i, i2, i3);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onFirstLocalScreenFrame callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("onFirstLocalVideoFrame...width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        sb.append(", elapsed: ");
        sb.append(i3);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onFirstLocalVideoFrame(i, i2, i3);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onFirstLocalVideoFrame callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onInviteFailed(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder("onInviteFailed...roomid: ");
        sb.append(str);
        sb.append(", phoneNumber: ");
        sb.append(str2);
        sb.append(", errorcode: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onInviteFailed(str, str2, i);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onInviteFailed callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onNetworkQuality(String str, int i, int i2) {
        int i3;
        int i4 = 1;
        switch (i) {
            case -1:
                i3 = 6;
                break;
            case 0:
                i3 = 5;
                break;
            case 1:
                i3 = 4;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 2;
                break;
            case 4:
                i3 = 1;
                break;
            default:
                i3 = 0;
                break;
        }
        switch (i2) {
            case -1:
                i4 = 6;
                break;
            case 0:
                i4 = 5;
                break;
            case 1:
                i4 = 4;
                break;
            case 2:
                i4 = 3;
                break;
            case 3:
                i4 = 2;
                break;
            case 4:
                break;
            default:
                i4 = 0;
                break;
        }
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onNetworkQuality(str, i3, i4);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("onNetworkQuality callback catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        }
    }

    public void onProviderEvent(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("onProviderEvent, event: ");
        sb.append(i);
        sb.append(" direction: ");
        sb.append(str);
        sb.append(" message: ");
        sb.append(str2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onProviderEvent(i, str, str2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onProviderEvent callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onStreamMessage(String str, int i, byte[] bArr) {
        StringBuilder sb = new StringBuilder("onStreamMessage...uid: ");
        sb.append(str);
        sb.append(", streamId: ");
        sb.append(i);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onStreamMessage(str, i, bArr);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onStreamMessage callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onAudioQuality(String str, int i, short s, short s2) {
        StringBuilder sb = new StringBuilder("onAudioQuality...uid: ");
        sb.append(str);
        sb.append(", quality: ");
        sb.append(i);
        sb.append(", delay: ");
        sb.append(s);
        sb.append(", lost: ");
        sb.append(s2);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onAudioQuality(str, i, s, s2);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onAudioQuality callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onFirstRemoteScreenFrame(String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("onFirstRemoteScreenFrame...udi: ");
        sb.append(str);
        sb.append(", width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        sb.append(", elapsed: ");
        sb.append(i3);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onFirstRemoteScreenFrame(str, i, i2, i3);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onFirstRemoteScreenFrame callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onFirstRemoteVideoDecoded(String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("onFirstRemoteVideoDecoded...udi: ");
        sb.append(str);
        sb.append(", width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        sb.append(", elapsed: ");
        sb.append(i3);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onFirstRemoteVideoDecoded(str, i, i2, i3);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onFirstRemoteVideoDecoded callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onFirstRemoteVideoFrame(String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("onFirstRemoteVideoFrame...udi: ");
        sb.append(str);
        sb.append(", width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        sb.append(", elapsed: ");
        sb.append(i3);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onFirstRemoteVideoFrame(str, i, i2, i3);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onFirstRemoteVideoFrame callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onVideoSizeChanged(String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("onVideoSizeChanged...udi: ");
        sb.append(str);
        sb.append(", width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        sb.append(", rotation: ");
        sb.append(i3);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onVideoSizeChanged(str, i, i2, i3);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onVideoSizeChanged callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }

    public void onStreamMessageError(String str, int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder("onStreamMessageError...uid: ");
        sb.append(str);
        sb.append(", streamId: ");
        sb.append(i);
        sb.append(", error: ");
        sb.append(i2);
        sb.append(", missed: ");
        sb.append(i3);
        sb.append(", cached: ");
        sb.append(i4);
        LogUtil.m145278d("ByteRtcEngineEventHandler", sb.toString());
        try {
            if (C46266RtcEngineImpl.getRtcEngineHandler() != null) {
                C46266RtcEngineImpl.getRtcEngineHandler().onStreamMessageError(str, i, i2, i3, i4);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("onStreamMessageError callback catch exception.\n");
            sb2.append(e.getMessage());
            LogUtil.m145278d("ByteRtcEngineEventHandler", sb2.toString());
        }
    }
}

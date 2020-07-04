package com.p280ss.video.rtc.engine.utils.audioRouting;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p280ss.video.rtc.engine.LogReport;
import com.p280ss.video.rtc.engine.NativeFunctions;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager.OnBTScoDeviceCallback;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.EarpieceDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.SpeakerphoneDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.WiredHeadsetDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.WiredHeadsetDeviceManager.OnDeviceCallback;
import com.p280ss.video.rtc.engine.utils.audioRouting.controllerState.EventDispatcher;
import java.lang.ref.WeakReference;
import org.webrtc.ContextUtils;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.AudioRoutingController */
public class AudioRoutingController extends BaseAudioRoutingController {
    private BluetoothHeadsetScoDeviceManager mBTScoDeviceManager;
    private WeakReference<Context> mContext = new WeakReference<>(ContextUtils.getApplicationContext());
    private EarpieceDeviceManager mEarpieceDeviceManager;
    private EventHandler mEventHandler;
    private int mLastAudioRouting = -1;
    private long mNativeByteRtcEngine;
    public EventDispatcher mRoutingControl;
    private SpeakerphoneDeviceManager mSpeakerphoneDeviceManager;
    private WiredHeadsetDeviceManager mWiredHeadsetDeviceManager;

    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.AudioRoutingController$EventHandler */
    class EventHandler extends Handler {
        public void handleMessage(Message message) {
            AudioRoutingController.this.mRoutingControl.onEvent(message.what, message.arg1);
        }

        EventHandler(Looper looper) {
            super(looper);
        }
    }

    public String getAudioRouteDesc(int i) {
        if (i == 3) {
            return "Speakerphone";
        }
        if (i == 5) {
            return "HeadsetBluetooth";
        }
        switch (i) {
            case -1:
                return "Default";
            case 0:
                return "Headset";
            case 1:
                return "Earpiece";
            default:
                return "Unknown";
        }
    }

    public void startMonitoring() {
        this.mRoutingControl.changeRouteState(1);
    }

    public void stopMonitoring() {
        this.mRoutingControl.changeRouteState(2);
    }

    public boolean isBTHeadsetPlugged() {
        if (this.mBTScoDeviceManager != null) {
            return this.mBTScoDeviceManager.isDevicePlugged();
        }
        return false;
    }

    public boolean isWiredHeadsetPlugged() {
        if (this.mWiredHeadsetDeviceManager != null) {
            return this.mWiredHeadsetDeviceManager.isActive();
        }
        return false;
    }

    public void stopBtSco() {
        if (this.mBTScoDeviceManager != null) {
            this.mBTScoDeviceManager.inactiveDevice();
        }
    }

    public AudioManager getAudioManager() {
        Context context = (Context) this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    public int queryCurrentAudioRouting() {
        if (this.mSpeakerphoneDeviceManager.isActive()) {
            return 3;
        }
        if (this.mBTScoDeviceManager.isActive()) {
            return 5;
        }
        if (this.mWiredHeadsetDeviceManager.isActive()) {
            return 0;
        }
        return 1;
    }

    public void uninitialize() {
        LogUtil.m145278d("AudioRoutingController", "uninitialize");
        this.mWiredHeadsetDeviceManager.destory();
        this.mBTScoDeviceManager.destory();
    }

    public int initialize() {
        LogUtil.m145281i("AudioRoutingController", "initialize +");
        Context context = (Context) this.mContext.get();
        if (context == null) {
            LogUtil.m145279e("AudioRoutingController", "context has been GCed");
            return -1;
        } else if (getAudioManager() == null) {
            LogUtil.m145279e("AudioRoutingController", "invalid context: can't get AudioManager");
            return -1;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.mEventHandler = new EventHandler(myLooper);
            } else {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    this.mEventHandler = new EventHandler(mainLooper);
                } else {
                    this.mEventHandler = null;
                }
            }
            this.mRoutingControl = new EventDispatcher(this);
            this.mSpeakerphoneDeviceManager = new SpeakerphoneDeviceManager(context, new AudioRoutingController$$Lambda$0(this));
            this.mEarpieceDeviceManager = new EarpieceDeviceManager(context, new AudioRoutingController$$Lambda$1(this));
            this.mWiredHeadsetDeviceManager = new WiredHeadsetDeviceManager(context, new OnDeviceCallback() {
                public void onDeviceOnline() {
                }

                public void onDeviceOffline() {
                    AudioRoutingController.this.sendEvent(22, 0);
                }

                public void reportHeadsetType(int i) {
                    switch (i) {
                        case 0:
                        case 1:
                            AudioRoutingController.this.sendEvent(1, 0);
                            return;
                        default:
                            return;
                    }
                }

                public void onError(int i, String str) {
                    LogUtil.m145281i("AudioRoutingController", str);
                    AudioRoutingController.this.resetAudioRouting(true);
                }
            });
            this.mBTScoDeviceManager = new BluetoothHeadsetScoDeviceManager(context, this.mEventHandler, new OnBTScoDeviceCallback() {
                public void onScoConnected() {
                    LogUtil.m145281i("AudioRoutingController", "BTHeadset w/o mic connected");
                }

                public void onScoDisconnected() {
                    LogUtil.m145281i("AudioRoutingController", "BTHeadset w/o mic disconnected");
                }

                public void onDeviceOffline() {
                    LogUtil.m145281i("AudioRoutingController", "BTHeadset disconnected");
                    AudioRoutingController.this.sendEvent(22, 0);
                }

                public void onDeviceOnline() {
                    LogUtil.m145281i("AudioRoutingController", "BTHeadset Device connected");
                    AudioRoutingController.this.sendEvent(2, 1);
                }

                public void onError(int i, String str) {
                    LogUtil.m145281i("AudioRoutingController", str);
                    AudioRoutingController.this.resetAudioRouting(true);
                }
            });
            LogUtil.m145281i("AudioRoutingController", "initialize -");
            return 0;
        }
    }

    private static AudioRoutingController create(long j) {
        return new AudioRoutingController(j);
    }

    public void notifyAudioRoutingChanged(int i) {
        NativeFunctions.nativeOnAudioRoutingChanged(this.mNativeByteRtcEngine, i);
    }

    public AudioRoutingController(long j) {
        this.mNativeByteRtcEngine = j;
    }

    public int updateBluetoothSco(int i) {
        LogUtil.m145278d("AudioRoutingController", "updateBluetoothSco sco started");
        if (i == 5 && 1 != this.mBTScoDeviceManager.getActiveState()) {
            this.mBTScoDeviceManager.activeDevice();
        } else if (5 == queryCurrentAudioRouting() && i != 5 && 1 == this.mBTScoDeviceManager.getActiveState()) {
            this.mBTScoDeviceManager.inactiveDevice();
        }
        return 0;
    }

    public void setAudioRouting(int i) {
        StringBuilder sb = new StringBuilder("set audio output routing from ");
        sb.append(getAudioRouteDesc(queryCurrentAudioRouting()));
        sb.append(" to ");
        sb.append(getAudioRouteDesc(i));
        LogUtil.m145281i("AudioRoutingController", sb.toString());
        if (5 == i) {
            try {
                updateBluetoothSco(i);
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("set audio routing error : ");
                sb2.append(e.toString());
                LogUtil.m145279e("AudioRoutingController", sb2.toString());
                LogReport instance = LogReport.instance();
                StringBuilder sb3 = new StringBuilder("set audio routing error : ");
                sb3.append(e.toString());
                instance.reportSDKSelfError(sb3.toString());
            }
        } else {
            updateBluetoothSco(i);
            if (i == 0) {
                this.mWiredHeadsetDeviceManager.activeDevice();
            } else if (3 == i) {
                this.mSpeakerphoneDeviceManager.activeDevice();
            } else {
                this.mEarpieceDeviceManager.activeDevice();
            }
        }
        this.mLastAudioRouting = i;
        notifyAudioRoutingChanged(i);
    }

    public void resetAudioRouting(boolean z) {
        int i = 1;
        if (getRoutingInfo().getForceSpeakerphone() != 1 || !z) {
            if (this.mBTScoDeviceManager.isDevicePlugged()) {
                i = 5;
            } else if (this.mWiredHeadsetDeviceManager.isDevicePlugged()) {
                i = 0;
            } else if (getRoutingInfo().getForceSpeakerphone() != 0) {
                i = getRoutingInfo().getDefaultRouting();
            }
            StringBuilder sb = new StringBuilder("reset audio routing, default routing: ");
            sb.append(getAudioRouteDesc(getRoutingInfo().getDefaultRouting()));
            sb.append(", current routing: ");
            sb.append(getAudioRouteDesc(queryCurrentAudioRouting()));
            sb.append(", target routing: ");
            sb.append(getAudioRouteDesc(i));
            sb.append(", actual system routing: ");
            sb.append(getAudioRouteDesc(queryCurrentAudioRouting()));
            LogUtil.m145281i("AudioRoutingController", sb.toString());
            if (!(queryCurrentAudioRouting() == i && this.mLastAudioRouting == i)) {
                setAudioRouting(i);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("reset(force) audio routing, default routing: ");
        sb2.append(getAudioRouteDesc(getRoutingInfo().getDefaultRouting()));
        sb2.append(", current routing: ");
        sb2.append(getAudioRouteDesc(queryCurrentAudioRouting()));
        sb2.append(", target routing: ");
        sb2.append(getAudioRouteDesc(3));
        sb2.append(", actual system routing:");
        sb2.append(getAudioRouteDesc(queryCurrentAudioRouting()));
        LogUtil.m145281i("AudioRoutingController", sb2.toString());
        if (queryCurrentAudioRouting() != 3) {
            setAudioRouting(3);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$initialize$0$AudioRoutingController(int i, String str) {
        LogUtil.m145281i("AudioRoutingController", str);
        resetAudioRouting(true);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$initialize$1$AudioRoutingController(int i, String str) {
        LogUtil.m145281i("AudioRoutingController", str);
        resetAudioRouting(true);
    }

    public void sendEvent(int i, int i2) {
        StringBuilder sb = new StringBuilder("sendEvent: [");
        sb.append(i);
        sb.append("], extra arg: ");
        sb.append(i2);
        sb.append("... ");
        sb.append(this.mEventHandler);
        LogUtil.m145278d("AudioRoutingController", sb.toString());
        if (this.mEventHandler != null) {
            this.mEventHandler.sendMessage(this.mEventHandler.obtainMessage(i, i2, 0));
        }
    }
}

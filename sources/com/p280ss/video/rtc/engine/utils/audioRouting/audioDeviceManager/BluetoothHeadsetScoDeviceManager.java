package com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.BaseHotplugAudioDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.base.IAudioDeviceManager.OnHotPlugDeviceCallback;
import com.p280ss.video.rtc.engine.utils.audioRouting.receiver.BTHeadsetBroadcastReceiver;
import com.p280ss.video.rtc.engine.utils.audioRouting.receiver.base.BaseAudioDeviceBroadcastReceiver;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager */
public class BluetoothHeadsetScoDeviceManager extends BaseHotplugAudioDeviceManager {
    private final String BLUETOOTH_PERMISSION = "android.permission.BLUETOOTH";
    private final Runnable bluetoothSCOConnCheckerRunnable = new BluetoothHeadsetScoDeviceManager$$Lambda$0(this);
    public BluetoothAdapter mBTAdapter;
    public BluetoothHeadset mBTHeadset;
    private ServiceListener mBTHeadsetListener;
    private OnBTScoDeviceCallback mCallback;
    private int mDynamicTimeout = 4000;
    private Handler mHandler;
    private int mScoConnectionAttempts;

    /* renamed from: com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager$OnBTScoDeviceCallback */
    public interface OnBTScoDeviceCallback extends OnHotPlugDeviceCallback {
        void onScoConnected();

        void onScoDisconnected();
    }

    public void onDeviceOffline() {
        super.onDeviceOffline();
    }

    public void onDeviceOnline() {
        super.onDeviceOnline();
    }

    public void resetScoConnectionAttempts() {
        this.mScoConnectionAttempts = 0;
    }

    private ServiceListener createBTHeadsetListener() {
        return new ServiceListener() {
            public void onServiceDisconnected(int i) {
                StringBuilder sb = new StringBuilder("onServiceDisconnected ");
                sb.append(i);
                sb.append(" =? headset(1");
                sb.append(")");
                LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", sb.toString());
                if (i == 1) {
                    StringBuilder sb2 = new StringBuilder("on BT service disconnected: ");
                    sb2.append(i);
                    LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", sb2.toString());
                    BluetoothHeadsetScoDeviceManager.this.cancelBluetoothSCOConnTimer();
                    BluetoothHeadsetScoDeviceManager.this.mBTHeadset = null;
                }
            }

            public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                StringBuilder sb = new StringBuilder("onServiceConnected ");
                sb.append(i);
                sb.append(" =? headset(1");
                sb.append(")");
                LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", sb.toString());
                if (i == 1) {
                    StringBuilder sb2 = new StringBuilder("on BT service connected: ");
                    sb2.append(i);
                    sb2.append(" ");
                    sb2.append(bluetoothProfile);
                    LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", sb2.toString());
                    BluetoothHeadsetScoDeviceManager.this.mBTHeadset = (BluetoothHeadset) bluetoothProfile;
                    BluetoothHeadsetScoDeviceManager.this.registerReceiver();
                }
            }
        };
    }

    public BaseAudioDeviceBroadcastReceiver getBroadcastReceiver() {
        return new BTHeadsetBroadcastReceiver(this);
    }

    public void onDestroy() {
        super.onDestroy();
        clearBTResource();
    }

    public void onScoConnected() {
        this.mCallback.onScoConnected();
    }

    public void onScoDisconnected() {
        this.mCallback.onScoDisconnected();
    }

    public void cancelBluetoothSCOConnTimer() {
        LogUtil.m145278d("BluetoothHeadsetScoDeviceManager", "cancel bluetooth timer");
        this.mHandler.removeCallbacks(this.bluetoothSCOConnCheckerRunnable);
    }

    public void inactiveDevice() {
        if (1 == getActiveState()) {
            stopBtSco();
        }
    }

    public boolean isDevicePlugged() {
        if (2 == getOnlineState()) {
            return true;
        }
        return false;
    }

    private void clearBTResource() {
        if (this.mBTAdapter != null) {
            this.mBTAdapter.closeProfileProxy(1, this.mBTHeadset);
            this.mBTAdapter = null;
        }
        if (this.mBTHeadsetListener != null) {
            this.mBTHeadsetListener = null;
        }
    }

    private void startBluetoothSCOConnTimer() {
        LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", "start bluetooth timer");
        this.mDynamicTimeout = this.mScoConnectionAttempts * 4000;
        this.mHandler.postDelayed(this.bluetoothSCOConnCheckerRunnable, (long) this.mDynamicTimeout);
    }

    public void activeDevice() {
        if (getActiveState() == 1) {
            this.mCallback.onError(-1000, "Device already active");
        } else {
            checkAndActiveSCO();
        }
    }

    public int getActiveState() {
        if (getOnlineState() != 2) {
            return 2;
        }
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && audioManager.isBluetoothScoOn()) {
            return 1;
        }
        return 2;
    }

    private void stopBtSco() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            LogUtil.m145279e("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(-1002, "invalid context: can't get AudioManager");
            return;
        }
        LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", "try to stopping bt sco ");
        doStopBTSco(audioManager);
    }

    public IntentFilter getBroadcastIntentFilter() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        return intentFilter;
    }

    private void initBluetoothHeadset() {
        Context context = getContext();
        if (context != null) {
            if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != 0) {
                LogUtil.m145282w("BluetoothHeadsetScoDeviceManager", "do not support BT monitoring on this device");
            } else if (!hasPermission(context)) {
                LogUtil.m145282w("BluetoothHeadsetScoDeviceManager", "lacks BLUETOOTH permission");
            } else if (this.mBTHeadsetListener != null) {
                LogUtil.m145282w("BluetoothHeadsetScoDeviceManager", "Bluetooth service Listener already been initialized");
            } else {
                this.mBTAdapter = BluetoothAdapter.getDefaultAdapter();
                if (this.mBTAdapter == null) {
                    LogUtil.m145279e("BluetoothHeadsetScoDeviceManager", "initialize: failed to get bluetooth adapter!!");
                    return;
                }
                try {
                    this.mBTHeadsetListener = createBTHeadsetListener();
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("initialize failed: unable to create BluetoothProfile.ServiceListener, err=");
                    sb.append(e.getMessage());
                    LogUtil.m145279e("BluetoothHeadsetScoDeviceManager", sb.toString());
                }
                this.mBTAdapter.getProfileProxy(context, this.mBTHeadsetListener, 1);
                if (2 == this.mBTAdapter.getProfileConnectionState(1)) {
                    onDeviceOnline();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bluetoothSCOConnChecker */
    public void bridge$lambda$0$BluetoothHeadsetScoDeviceManager() {
        boolean z;
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            LogUtil.m145279e("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(-1002, "invalid context: can't get AudioManager");
            return;
        }
        if (audioManager.isBluetoothScoOn()) {
            LogUtil.m145278d("BluetoothHeadsetScoDeviceManager", "SCO connected");
            z = true;
        } else {
            LogUtil.m145278d("BluetoothHeadsetScoDeviceManager", "SCO is not connected");
            z = false;
        }
        if (this.mScoConnectionAttempts < 5) {
            StringBuilder sb = new StringBuilder("attemps trying, bt sco started: ");
            sb.append(btStateAsString(getActiveState()));
            sb.append(" sco connected: ");
            sb.append(z);
            sb.append(" ");
            sb.append(this.mScoConnectionAttempts);
            sb.append(" times ");
            sb.append(getActiveState());
            sb.append("[");
            sb.append(btStateAsString(getActiveState()));
            sb.append("]");
            LogUtil.m145278d("BluetoothHeadsetScoDeviceManager", sb.toString());
            if (1 != this.mOnlineState && 1 == getActiveState()) {
                startBluetoothSCOConnTimer();
                this.mScoConnectionAttempts++;
                doActiveSco(audioManager);
            }
        } else {
            LogUtil.m145279e("BluetoothHeadsetScoDeviceManager", "start bluetooth sco timeout");
            this.mScoConnectionAttempts = 0;
            this.mCallback.onError(-1001, "Could not establish SCO link.");
        }
    }

    private void checkAndActiveSCO() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            LogUtil.m145279e("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(-1002, "invalid context: can't get AudioManager");
            return;
        }
        int mode = audioManager.getMode();
        StringBuilder sb = new StringBuilder("try to opening bt sco ");
        sb.append(this.mScoConnectionAttempts);
        sb.append(" ");
        sb.append(mode);
        sb.append("[");
        sb.append(modeAsString(mode));
        sb.append("] ");
        sb.append(getActiveState());
        sb.append("[");
        sb.append(btStateAsString(getActiveState()));
        sb.append("] sco on: ");
        sb.append(audioManager.isBluetoothScoOn());
        LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", sb.toString());
        if (!audioManager.isBluetoothScoOn()) {
            StringBuilder sb2 = new StringBuilder("Off call sco support = ");
            sb2.append(audioManager.isBluetoothScoAvailableOffCall());
            LogUtil.m145278d("BluetoothHeadsetScoDeviceManager", sb2.toString());
            startBluetoothSCOConnTimer();
            this.mScoConnectionAttempts++;
            doActiveSco(audioManager);
        }
    }

    private boolean hasPermission(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0) {
            return true;
        }
        return false;
    }

    private String btStateAsString(int i) {
        switch (i) {
            case 0:
                return "SCO_CONNECTING";
            case 1:
                return "SCO_ACTIVE";
            case 2:
                return "SCO_INACTIVE";
            default:
                StringBuilder sb = new StringBuilder("Unknown ");
                sb.append(i);
                return sb.toString();
        }
    }

    private void doStopBTSco(AudioManager audioManager) {
        StringBuilder sb = new StringBuilder("doStopBTSco ");
        sb.append(VERSION.SDK_INT);
        sb.append(" sco on: ");
        sb.append(audioManager.isBluetoothScoOn());
        LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", sb.toString());
        audioManager.setBluetoothScoOn(false);
        audioManager.stopBluetoothSco();
        if (VERSION.SDK_INT < 22) {
            audioManager.setStreamMute(0, false);
        }
    }

    private String modeAsString(int i) {
        switch (i) {
            case 0:
                return "MODE_NORMAL";
            case 1:
                return "MODE_RINGTONE";
            case 2:
                return "MODE_IN_CALL";
            case 3:
                return "MODE_IN_COMMUNICATION";
            default:
                StringBuilder sb = new StringBuilder("Unknown ");
                sb.append(i);
                return sb.toString();
        }
    }

    public void onStickyIntentFoundWhenRegister(Intent intent) {
        if (TextUtils.equals(intent.getAction(), "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
            if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0) != 1) {
                LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", "initial Bluetooth SCO device unconnected");
            } else {
                LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", "initial Bluetooth SCO device connected");
                onScoConnected();
            }
        }
    }

    private void doActiveSco(AudioManager audioManager) {
        if (audioManager == null) {
            LogUtil.m145279e("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(-1002, "invalid context: can't get AudioManager");
            return;
        }
        int mode = audioManager.getMode();
        StringBuilder sb = new StringBuilder("doStartBTSco ");
        sb.append(VERSION.SDK_INT);
        sb.append(" sco on: ");
        sb.append(audioManager.isBluetoothScoOn());
        sb.append(" ");
        sb.append(mode);
        sb.append("[");
        sb.append(modeAsString(mode));
        sb.append("]");
        LogUtil.m145281i("BluetoothHeadsetScoDeviceManager", sb.toString());
        if (VERSION.SDK_INT < 22) {
            audioManager.setStreamMute(0, true);
        }
        if (isDevicePlugged()) {
            try {
                audioManager.setMode(0);
                audioManager.setSpeakerphoneOn(false);
                if (!audioManager.isBluetoothScoOn()) {
                    audioManager.setBluetoothScoOn(true);
                    audioManager.startBluetoothSco();
                }
            } catch (Exception e) {
                LogUtil.m145279e("BluetoothHeadsetScoDeviceManager", e.getMessage());
            }
        } else {
            audioManager.setMode(2);
            if (audioManager.getMode() != 2) {
                audioManager.setMode(3);
            }
        }
        StringBuilder sb2 = new StringBuilder("doStartBTSco done sco on: ");
        sb2.append(audioManager.isBluetoothScoOn());
        sb2.append(" ");
        sb2.append(audioManager.getMode());
        sb2.append("[");
        sb2.append(modeAsString(audioManager.getMode()));
        sb2.append("]");
        LogUtil.m145278d("BluetoothHeadsetScoDeviceManager", sb2.toString());
    }

    public BluetoothHeadsetScoDeviceManager(Context context, Handler handler, OnBTScoDeviceCallback onBTScoDeviceCallback) {
        super(context, onBTScoDeviceCallback);
        this.mCallback = onBTScoDeviceCallback;
        this.mHandler = handler;
        initBluetoothHeadset();
    }
}

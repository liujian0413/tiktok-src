package com.p280ss.video.rtc.engine.utils.audioRouting.receiver;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import com.p280ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager;
import com.p280ss.video.rtc.engine.utils.audioRouting.receiver.base.BaseAudioDeviceBroadcastReceiver;

/* renamed from: com.ss.video.rtc.engine.utils.audioRouting.receiver.BTHeadsetBroadcastReceiver */
public class BTHeadsetBroadcastReceiver extends BaseAudioDeviceBroadcastReceiver {
    private BluetoothHeadsetScoDeviceManager mBTDeviceManager;

    public BTHeadsetBroadcastReceiver(BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager) {
        this.mBTDeviceManager = bluetoothHeadsetScoDeviceManager;
    }

    private void onBlueToothDeviceOffline(BluetoothDevice bluetoothDevice) {
        if (this.mBTDeviceManager.isDevicePlugged() && bluetoothDevice != null) {
            StringBuilder sb = new StringBuilder("Bluetooth device ");
            sb.append(bluetoothDevice);
            sb.append("checking is device disconnected");
            LogUtil.m145281i("BTHeadsetBroadcastReceiver", sb.toString());
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && 2 != defaultAdapter.getProfileConnectionState(1)) {
                StringBuilder sb2 = new StringBuilder("Bluetooth device ");
                sb2.append(bluetoothDevice);
                sb2.append(" disconnected");
                LogUtil.m145281i("BTHeadsetBroadcastReceiver", sb2.toString());
                this.mBTDeviceManager.onDeviceOffline();
            }
        }
    }

    private void onBlueToothDeviceOnline(BluetoothDevice bluetoothDevice) {
        if (!(this.mBTDeviceManager.isDevicePlugged() || bluetoothDevice == null || bluetoothDevice.getBluetoothClass() == null)) {
            boolean hasService = bluetoothDevice.getBluetoothClass().hasService(2097152);
            boolean hasService2 = bluetoothDevice.getBluetoothClass().hasService(4194304);
            if (hasService || hasService2) {
                StringBuilder sb = new StringBuilder("Bluetooth device ");
                sb.append(bluetoothDevice);
                sb.append(" connected");
                LogUtil.m145281i("BTHeadsetBroadcastReceiver", sb.toString());
                this.mBTDeviceManager.resetScoConnectionAttempts();
                this.mBTDeviceManager.onDeviceOnline();
                return;
            }
            StringBuilder sb2 = new StringBuilder("Bluetooth device ");
            sb2.append(bluetoothDevice);
            sb2.append(" class is: ");
            sb2.append(bluetoothDevice.getBluetoothClass());
            LogUtil.m145281i("BTHeadsetBroadcastReceiver", sb2.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r5 = r6.getAction()
            java.lang.String r0 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
            boolean r0 = r0.equals(r5)
            r1 = -99
            if (r0 == 0) goto L_0x0096
            java.lang.String r5 = "android.bluetooth.profile.extra.STATE"
            int r5 = r6.getIntExtra(r5, r1)
            java.lang.String r0 = "android.bluetooth.profile.extra.PREVIOUS_STATE"
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r1 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "BT ACTION_CONNECTION_STATE_CHANGED prev "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145278d(r1, r0)
            java.lang.String r0 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r6 = r6.getParcelableExtra(r0)
            android.bluetooth.BluetoothDevice r6 = (android.bluetooth.BluetoothDevice) r6
            switch(r5) {
                case 0: goto L_0x0092;
                case 1: goto L_0x0079;
                case 2: goto L_0x0075;
                case 3: goto L_0x005c;
                default: goto L_0x0040;
            }
        L_0x0040:
            java.lang.String r0 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Bluetooth device "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = " unknown event, state="
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r0, r5)
            return
        L_0x005c:
            java.lang.String r5 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bluetooth device "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " disconnecting"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r5, r6)
            return
        L_0x0075:
            r4.onBlueToothDeviceOnline(r6)
            return
        L_0x0079:
            java.lang.String r5 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bluetooth device "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " connecting"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r5, r6)
            return
        L_0x0092:
            r4.onBlueToothDeviceOffline(r6)
            return
        L_0x0096:
            java.lang.String r0 = "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0137
            java.lang.String r5 = "android.bluetooth.profile.extra.STATE"
            int r5 = r6.getIntExtra(r5, r1)
            java.lang.String r0 = "android.bluetooth.profile.extra.PREVIOUS_STATE"
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r1 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "BT ACTION_AUDIO_STATE_CHANGED prev "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145278d(r1, r0)
            java.lang.String r0 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r6 = r6.getParcelableExtra(r0)
            android.bluetooth.BluetoothDevice r6 = (android.bluetooth.BluetoothDevice) r6
            switch(r5) {
                case 10: goto L_0x011e;
                case 11: goto L_0x0105;
                case 12: goto L_0x00ec;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            java.lang.String r0 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Bluetooth audio device "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = " event, state="
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r0, r5)
            return
        L_0x00ec:
            java.lang.String r5 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bluetooth audio device "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " connected"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r5, r6)
            return
        L_0x0105:
            java.lang.String r5 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bluetooth audio device "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " connecting"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r5, r6)
            return
        L_0x011e:
            java.lang.String r5 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bluetooth audio device "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " disconnected"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r5, r6)
            return
        L_0x0137:
            java.lang.String r0 = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0202
            java.lang.String r5 = "android.media.extra.SCO_AUDIO_STATE"
            int r5 = r6.getIntExtra(r5, r1)
            java.lang.String r0 = "android.media.extra.SCO_AUDIO_PREVIOUS_STATE"
            int r6 = r6.getIntExtra(r0, r1)
            java.lang.String r0 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "BT ACTION_SCO_AUDIO_STATE_UPDATED prev "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = ", "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r6 = r1.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145278d(r0, r6)
            switch(r5) {
                case -1: goto L_0x01fa;
                case 0: goto L_0x01ed;
                case 1: goto L_0x0185;
                case 2: goto L_0x017d;
                default: goto L_0x0169;
            }
        L_0x0169:
            java.lang.String r6 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bluetooth SCO device unknown event, state="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r6, r5)
            return
        L_0x017d:
            java.lang.String r5 = "BTHeadsetBroadcastReceiver"
            java.lang.String r6 = "Bluetooth SCO device connecting"
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r5, r6)
            return
        L_0x0185:
            com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager r5 = r4.mBTDeviceManager
            android.bluetooth.BluetoothAdapter r5 = r5.mBTAdapter
            if (r5 != 0) goto L_0x018c
            return
        L_0x018c:
            com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager r5 = r4.mBTDeviceManager
            android.bluetooth.BluetoothAdapter r5 = r5.mBTAdapter
            java.util.Set r5 = r5.getBondedDevices()
            if (r5 == 0) goto L_0x02c4
            java.util.Iterator r5 = r5.iterator()
        L_0x019a:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x01a1
            return
        L_0x01a1:
            java.lang.Object r6 = r5.next()
            android.bluetooth.BluetoothDevice r6 = (android.bluetooth.BluetoothDevice) r6
            if (r6 == 0) goto L_0x01c7
            android.bluetooth.BluetoothClass r0 = r6.getBluetoothClass()
            if (r0 == 0) goto L_0x01c7
            android.bluetooth.BluetoothClass r0 = r6.getBluetoothClass()
            r1 = 2097152(0x200000, float:2.938736E-39)
            boolean r0 = r0.hasService(r1)
            if (r0 != 0) goto L_0x01c7
            android.bluetooth.BluetoothClass r0 = r6.getBluetoothClass()
            r1 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r0.hasService(r1)
            if (r0 == 0) goto L_0x019a
        L_0x01c7:
            if (r6 == 0) goto L_0x01ec
            android.bluetooth.BluetoothClass r5 = r6.getBluetoothClass()
            if (r5 == 0) goto L_0x01ec
            java.lang.String r5 = "BTHeadsetBroadcastReceiver"
            java.lang.String r6 = "Bluetooth SCO device connected"
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r5, r6)
            com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager r5 = r4.mBTDeviceManager
            r5.cancelBluetoothSCOConnTimer()
            com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager r5 = r4.mBTDeviceManager
            android.media.AudioManager r5 = r5.getAudioManager()
            if (r5 == 0) goto L_0x01e7
            r6 = 3
            r5.setMode(r6)
        L_0x01e7:
            com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager r5 = r4.mBTDeviceManager
            r5.onScoConnected()
        L_0x01ec:
            return
        L_0x01ed:
            java.lang.String r5 = "BTHeadsetBroadcastReceiver"
            java.lang.String r6 = "Bluetooth SCO device disconnected"
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r5, r6)
            com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager r5 = r4.mBTDeviceManager
            r5.onScoDisconnected()
            return
        L_0x01fa:
            java.lang.String r5 = "BTHeadsetBroadcastReceiver"
            java.lang.String r6 = "Bluetooth SCO device error"
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r5, r6)
            return
        L_0x0202:
            java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0247
            java.lang.String r5 = "android.bluetooth.adapter.extra.STATE"
            int r5 = r6.getIntExtra(r5, r1)
            java.lang.String r0 = "android.bluetooth.adapter.extra.PREVIOUS_STATE"
            int r6 = r6.getIntExtra(r0, r1)
            java.lang.String r0 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "BluetoothAdapter.ACTION_STATE_CHANGED prev "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = ", "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r6 = r1.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145278d(r0, r6)
            r6 = 10
            if (r5 == r6) goto L_0x0240
            r6 = 12
            if (r5 == r6) goto L_0x023a
            goto L_0x023f
        L_0x023a:
            com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager r5 = r4.mBTDeviceManager
            r5.onDeviceOnline()
        L_0x023f:
            return
        L_0x0240:
            com.ss.video.rtc.engine.utils.audioRouting.audioDeviceManager.BluetoothHeadsetScoDeviceManager r5 = r4.mBTDeviceManager
            r5.onDeviceOffline()
            goto L_0x02c4
        L_0x0247:
            java.lang.String r5 = "android.bluetooth.device.action.ACL_CONNECTED"
            java.lang.String r0 = r6.getAction()
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0286
            java.lang.String r5 = "android.bluetooth.adapter.extra.STATE"
            int r5 = r6.getIntExtra(r5, r1)
            java.lang.String r0 = "android.bluetooth.adapter.extra.PREVIOUS_STATE"
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r1 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "BluetoothDevice.ACTION_ACL_CONNECTED prev "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145278d(r1, r5)
            java.lang.String r5 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r5 = r6.getParcelableExtra(r5)
            android.bluetooth.BluetoothDevice r5 = (android.bluetooth.BluetoothDevice) r5
            r4.onBlueToothDeviceOnline(r5)
            return
        L_0x0286:
            java.lang.String r5 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            java.lang.String r0 = r6.getAction()
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x02c4
            java.lang.String r5 = "android.bluetooth.adapter.extra.STATE"
            int r5 = r6.getIntExtra(r5, r1)
            java.lang.String r0 = "android.bluetooth.adapter.extra.PREVIOUS_STATE"
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r1 = "BTHeadsetBroadcastReceiver"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "BluetoothDevice.ACTION_ACL_DISCONNECTED prev "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.p280ss.video.rtc.engine.utils.LogUtil.m145278d(r1, r5)
            java.lang.String r5 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r5 = r6.getParcelableExtra(r5)
            android.bluetooth.BluetoothDevice r5 = (android.bluetooth.BluetoothDevice) r5
            r4.onBlueToothDeviceOffline(r5)
        L_0x02c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.video.rtc.engine.utils.audioRouting.receiver.BTHeadsetBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}

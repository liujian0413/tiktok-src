package com.zego.zegoavkit2.mediarecorder;

public class ZegoMediaRecorder implements IZegoMediaRecordCallback {
    private volatile IZegoMediaRecordCallback mZegoMediaRecordCallback;

    public boolean stopRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        ZegoMediaRecordJNI.stopRecord(zegoMediaRecordChannelIndex.value());
        return true;
    }

    public void setZegoMediaRecordCallback(IZegoMediaRecordCallback iZegoMediaRecordCallback) {
        this.mZegoMediaRecordCallback = iZegoMediaRecordCallback;
        if (iZegoMediaRecordCallback != null) {
            ZegoMediaRecordJNI.setCallback(this);
            ZegoMediaRecordJNI.setMediaRecordCallback(true);
            return;
        }
        ZegoMediaRecordJNI.setCallback(null);
        ZegoMediaRecordJNI.setMediaRecordCallback(false);
    }

    public void onMediaRecord(int i, ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, String str) {
        IZegoMediaRecordCallback iZegoMediaRecordCallback = this.mZegoMediaRecordCallback;
        if (iZegoMediaRecordCallback != null) {
            iZegoMediaRecordCallback.onMediaRecord(i, zegoMediaRecordChannelIndex, str);
        }
    }

    public boolean startRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, ZegoMediaRecordType zegoMediaRecordType, String str) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return ZegoMediaRecordJNI.startRecord(zegoMediaRecordChannelIndex.value(), zegoMediaRecordType.value(), str);
    }

    public void onRecordStatusUpdate(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, String str, long j, long j2) {
        IZegoMediaRecordCallback iZegoMediaRecordCallback = this.mZegoMediaRecordCallback;
        if (iZegoMediaRecordCallback != null) {
            iZegoMediaRecordCallback.onRecordStatusUpdate(zegoMediaRecordChannelIndex, str, j, j2);
        }
    }

    public boolean startRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, ZegoMediaRecordType zegoMediaRecordType, String str, boolean z, int i) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return ZegoMediaRecordJNI.startRecordEx(zegoMediaRecordChannelIndex.value(), zegoMediaRecordType.value(), str, z, i, ZegoMediaRecordFormat.FLV.value(), false);
    }

    public boolean startRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, ZegoMediaRecordType zegoMediaRecordType, String str, boolean z, int i, ZegoMediaRecordFormat zegoMediaRecordFormat) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return ZegoMediaRecordJNI.startRecordEx(zegoMediaRecordChannelIndex.value(), zegoMediaRecordType.value(), str, z, i, zegoMediaRecordFormat.value(), false);
    }

    public boolean startRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, ZegoMediaRecordType zegoMediaRecordType, String str, boolean z, int i, ZegoMediaRecordFormat zegoMediaRecordFormat, boolean z2) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return ZegoMediaRecordJNI.startRecordEx(zegoMediaRecordChannelIndex.value(), zegoMediaRecordType.value(), str, z, i, zegoMediaRecordFormat.value(), z2);
    }
}

package com.zego.zegoavkit2.mediarecorder;

public interface IZegoMediaRecordCallback {
    void onMediaRecord(int i, ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, String str);

    void onRecordStatusUpdate(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, String str, long j, long j2);
}

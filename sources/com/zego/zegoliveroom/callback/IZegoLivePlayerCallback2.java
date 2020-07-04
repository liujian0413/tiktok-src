package com.zego.zegoliveroom.callback;

public interface IZegoLivePlayerCallback2 extends IZegoLivePlayerCallback {
    void onRecvRemoteAudioFirstFrame(String str);

    void onRecvRemoteVideoFirstFrame(String str);

    void onRemoteCameraStatusUpdate(String str, int i, int i2);

    void onRemoteMicStatusUpdate(String str, int i, int i2);

    void onRenderRemoteVideoFirstFrame(String str);
}

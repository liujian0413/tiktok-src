package com.zego.zegoliveroom.callback;

import com.zego.zegoliveroom.entity.ZegoPlayStreamQuality;

public interface IZegoLivePlayerCallback {
    void onInviteJoinLiveRequest(int i, String str, String str2, String str3);

    void onPlayQualityUpdate(String str, ZegoPlayStreamQuality zegoPlayStreamQuality);

    void onPlayStateUpdate(int i, String str);

    void onRecvEndJoinLiveCommand(String str, String str2, String str3);

    void onVideoSizeChangedTo(String str, int i, int i2);
}

package com.zego.zegoliveroom.callback;

import com.zego.zegoliveroom.entity.ZegoStreamInfo;

public interface IZegoRoomCallback {
    void onDisconnect(int i, String str);

    void onKickOut(int i, String str, String str2);

    void onReconnect(int i, String str);

    void onRecvCustomCommand(String str, String str2, String str3, String str4);

    void onStreamExtraInfoUpdated(ZegoStreamInfo[] zegoStreamInfoArr, String str);

    void onStreamUpdated(int i, ZegoStreamInfo[] zegoStreamInfoArr, String str);

    void onTempBroken(int i, String str);
}

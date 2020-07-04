package com.zego.zegoliveroom.callback;

import com.zego.zegoliveroom.entity.ZegoStreamInfo;

public interface IZegoLoginCompletionCallback {
    void onLoginCompletion(int i, ZegoStreamInfo[] zegoStreamInfoArr);
}

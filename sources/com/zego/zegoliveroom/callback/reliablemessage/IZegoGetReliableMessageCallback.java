package com.zego.zegoliveroom.callback.reliablemessage;

import com.zego.zegoliveroom.entity.ZegoReliableMessage;

public interface IZegoGetReliableMessageCallback {
    void onGetReliableMessage(int i, String str, ZegoReliableMessage[] zegoReliableMessageArr);
}

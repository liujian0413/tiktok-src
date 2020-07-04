package com.zego.zegoliveroom.callback.reliablemessage;

import com.zego.zegoliveroom.entity.ZegoReliableMessage;
import com.zego.zegoliveroom.entity.ZegoReliableMessageInfo;

public interface IZegoReliableMessageCallback {
    void onRecvReliableMessage(String str, ZegoReliableMessage zegoReliableMessage);

    void onUpdateReliableMessageInfo(String str, ZegoReliableMessageInfo[] zegoReliableMessageInfoArr);
}

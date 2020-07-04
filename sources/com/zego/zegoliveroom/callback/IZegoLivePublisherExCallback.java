package com.zego.zegoliveroom.callback;

import com.zego.zegoavkit2.entities.ZegoStreamRelayCDNInfo;

public interface IZegoLivePublisherExCallback {
    void onRelayCDNStateUpdate(ZegoStreamRelayCDNInfo[] zegoStreamRelayCDNInfoArr, String str);
}

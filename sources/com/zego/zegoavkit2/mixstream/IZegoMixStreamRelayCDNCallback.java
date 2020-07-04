package com.zego.zegoavkit2.mixstream;

import com.zego.zegoavkit2.entities.ZegoStreamRelayCDNInfo;

public interface IZegoMixStreamRelayCDNCallback {
    void onMixStreamRelayCDNStateUpdate(ZegoStreamRelayCDNInfo[] zegoStreamRelayCDNInfoArr, String str);
}

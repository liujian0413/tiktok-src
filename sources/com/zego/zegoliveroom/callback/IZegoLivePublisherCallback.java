package com.zego.zegoliveroom.callback;

import com.zego.zegoliveroom.entity.AuxData;
import com.zego.zegoliveroom.entity.ZegoPublishStreamQuality;
import java.util.HashMap;

public interface IZegoLivePublisherCallback {
    AuxData onAuxCallback(int i);

    void onCaptureAudioFirstFrame();

    void onCaptureVideoFirstFrame();

    void onCaptureVideoSizeChangedTo(int i, int i2);

    void onJoinLiveRequest(int i, String str, String str2, String str3);

    void onMixStreamConfigUpdate(int i, String str, HashMap<String, Object> hashMap);

    void onPublishQualityUpdate(String str, ZegoPublishStreamQuality zegoPublishStreamQuality);

    void onPublishStateUpdate(int i, String str, HashMap<String, Object> hashMap);
}

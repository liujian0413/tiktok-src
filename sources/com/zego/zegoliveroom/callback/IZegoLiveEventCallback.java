package com.zego.zegoliveroom.callback;

import java.util.HashMap;

public interface IZegoLiveEventCallback {
    void onLiveEvent(int i, HashMap<String, String> hashMap);
}

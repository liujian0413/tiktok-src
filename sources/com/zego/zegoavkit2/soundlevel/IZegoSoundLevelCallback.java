package com.zego.zegoavkit2.soundlevel;

public interface IZegoSoundLevelCallback {
    void onCaptureSoundLevelUpdate(ZegoSoundLevelInfo zegoSoundLevelInfo);

    void onSoundLevelUpdate(ZegoSoundLevelInfo[] zegoSoundLevelInfoArr);
}

package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.InternalAudioVolumeInfo */
public class InternalAudioVolumeInfo {
    public String uid;
    public int volume;

    public InternalAudioVolumeInfo(String str, int i) {
        this.uid = str;
        this.volume = i;
    }

    private static InternalAudioVolumeInfo create(String str, int i) {
        return new InternalAudioVolumeInfo(str, i);
    }
}

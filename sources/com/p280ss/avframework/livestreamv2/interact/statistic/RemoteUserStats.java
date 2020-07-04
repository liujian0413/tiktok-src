package com.p280ss.avframework.livestreamv2.interact.statistic;

/* renamed from: com.ss.avframework.livestreamv2.interact.statistic.RemoteUserStats */
public class RemoteUserStats {
    private int audioBitrate;
    private int audioDelay;
    private int audioLossRate;
    private int audioRTT;
    private int audioVoiceVolume;
    private String uid;
    private int videoBitrate;
    private int videoDecodeFps;
    private int videoLossRate;
    private int videoRTT;
    private int videoRenderFps;

    public int getAudioBitrate() {
        return this.audioBitrate;
    }

    public int getAudioDelay() {
        return this.audioDelay;
    }

    public int getAudioLossRate() {
        return this.audioLossRate;
    }

    public int getAudioRTT() {
        return this.audioRTT;
    }

    public int getAudioVoiceVolume() {
        return this.audioVoiceVolume;
    }

    public String getUid() {
        return this.uid;
    }

    public int getVideoBitrate() {
        return this.videoBitrate;
    }

    public int getVideoDecodeFps() {
        return this.videoDecodeFps;
    }

    public int getVideoLossRate() {
        return this.videoLossRate;
    }

    public int getVideoRTT() {
        return this.videoRTT;
    }

    public int getVideoRenderFps() {
        return this.videoRenderFps;
    }

    public void setAudioBitrate(int i) {
        this.audioBitrate = i;
    }

    public void setAudioDelay(int i) {
        this.audioDelay = i;
    }

    public void setAudioLossRate(int i) {
        this.audioLossRate = i;
    }

    public void setAudioRTT(int i) {
        this.audioRTT = i;
    }

    public void setAudioVoiceVolume(int i) {
        this.audioVoiceVolume = i;
    }

    public void setVideoBitrate(int i) {
        this.videoBitrate = i;
    }

    public void setVideoDecodeFps(int i) {
        this.videoDecodeFps = i;
    }

    public void setVideoLossRate(int i) {
        this.videoLossRate = i;
    }

    public void setVideoRTT(int i) {
        this.videoRTT = i;
    }

    public void setVideoRenderFps(int i) {
        this.videoRenderFps = i;
    }

    public RemoteUserStats(String str) {
        this.uid = str;
    }
}

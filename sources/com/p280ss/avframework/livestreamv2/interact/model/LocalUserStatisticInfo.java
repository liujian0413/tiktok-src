package com.p280ss.avframework.livestreamv2.interact.model;

/* renamed from: com.ss.avframework.livestreamv2.interact.model.LocalUserStatisticInfo */
public class LocalUserStatisticInfo {
    private int sendAudioLoss;
    private int sendAudioRtt;
    private int sendVencodeFps;
    private int sendVideoLoss;
    private int sendVideoRtt;

    public int getSendAudioLoss() {
        return this.sendAudioLoss;
    }

    public int getSendAudioRtt() {
        return this.sendAudioRtt;
    }

    public int getSendVencodeFps() {
        return this.sendVencodeFps;
    }

    public int getSendVideoLoss() {
        return this.sendVideoLoss;
    }

    public int getSendVideoRtt() {
        return this.sendVideoRtt;
    }

    public void setSendAudioLoss(int i) {
        this.sendAudioLoss = i;
    }

    public void setSendAudioRtt(int i) {
        this.sendAudioRtt = i;
    }

    public void setSendVencodeFps(int i) {
        this.sendVencodeFps = i;
    }

    public void setSendVideoLoss(int i) {
        this.sendVideoLoss = i;
    }

    public void setSendVideoRtt(int i) {
        this.sendVideoRtt = i;
    }
}

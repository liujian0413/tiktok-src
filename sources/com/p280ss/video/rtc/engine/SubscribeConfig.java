package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.SubscribeConfig */
public class SubscribeConfig {
    public boolean subAudio;
    public boolean subVideo;
    public int videoIndex;

    public SubscribeConfig() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscribeConfig{subVideo=");
        sb.append(this.subVideo);
        sb.append(", subAudio=");
        sb.append(this.subAudio);
        sb.append(", videoIndex=");
        sb.append(this.videoIndex);
        sb.append("}");
        return sb.toString();
    }

    public SubscribeConfig(SubscribeConfig subscribeConfig) {
        if (subscribeConfig != null) {
            this.subVideo = subscribeConfig.subVideo;
            this.subAudio = subscribeConfig.subAudio;
            this.videoIndex = subscribeConfig.videoIndex;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeConfig subscribeConfig = (SubscribeConfig) obj;
        if (this.subVideo == subscribeConfig.subVideo && this.subAudio == subscribeConfig.subAudio && this.videoIndex == subscribeConfig.videoIndex) {
            return true;
        }
        return false;
    }

    private static SubscribeConfig create(boolean z, boolean z2, int i) {
        return new SubscribeConfig(z, z2, i);
    }

    public SubscribeConfig(boolean z, boolean z2, int i) {
        this.subVideo = z;
        this.subAudio = z2;
        this.videoIndex = i;
    }
}

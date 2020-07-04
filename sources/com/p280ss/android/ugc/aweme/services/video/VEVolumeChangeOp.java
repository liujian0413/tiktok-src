package com.p280ss.android.ugc.aweme.services.video;

/* renamed from: com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp */
public class VEVolumeChangeOp {
    public final int mType;
    public final float mVolume;

    public String toString() {
        StringBuilder sb = new StringBuilder("VEVolumeChangeOp{mType=");
        sb.append(this.mType);
        sb.append(", mVolume=");
        sb.append(this.mVolume);
        sb.append('}');
        return sb.toString();
    }

    public static VEVolumeChangeOp ofMusic(float f) {
        return new VEVolumeChangeOp(1, f);
    }

    public static VEVolumeChangeOp ofVoice(float f) {
        return new VEVolumeChangeOp(0, f);
    }

    private VEVolumeChangeOp(int i, float f) {
        this.mType = i;
        this.mVolume = f;
    }
}

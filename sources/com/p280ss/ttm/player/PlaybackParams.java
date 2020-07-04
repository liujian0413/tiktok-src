package com.p280ss.ttm.player;

/* renamed from: com.ss.ttm.player.PlaybackParams */
public final class PlaybackParams {
    private int mAudioFallbackMode = -1;
    private int mDescribeContents = -1;
    private float mPitch = -1.0f;
    private float mSpeed = -1.0f;

    public final PlaybackParams allowDefaults() {
        return this;
    }

    public final int describeContents() {
        return this.mDescribeContents;
    }

    public final int getAudioFallbackMode() {
        return this.mAudioFallbackMode;
    }

    public final float getPitch() {
        return this.mPitch;
    }

    public final float getSpeed() {
        return this.mSpeed;
    }

    public final PlaybackParams setAudioFallbackMode(int i) {
        this.mAudioFallbackMode = i;
        return this;
    }

    public final PlaybackParams setPitch(float f) {
        this.mPitch = f;
        return this;
    }

    public final PlaybackParams setSpeed(float f) {
        this.mSpeed = f;
        return this;
    }
}

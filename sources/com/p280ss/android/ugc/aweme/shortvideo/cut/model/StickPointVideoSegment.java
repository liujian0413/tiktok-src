package com.p280ss.android.ugc.aweme.shortvideo.cut.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.StickPointVideoSegment */
public final class StickPointVideoSegment implements Serializable {
    private float speed = 1.0f;
    private long videoDuration;
    private long videoEnd = (this.videoStart + this.videoRange);
    private int videoIndex;
    private long videoRange;
    private long videoStart;

    public final float getSpeed() {
        return this.speed;
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final long getVideoEnd() {
        return this.videoEnd;
    }

    public final int getVideoIndex() {
        return this.videoIndex;
    }

    public final long getVideoRange() {
        return this.videoRange;
    }

    public final long getVideoStart() {
        return this.videoStart;
    }

    public final StickPointVideoSegment clone() {
        StickPointVideoSegment stickPointVideoSegment = new StickPointVideoSegment(this.videoIndex, this.videoStart, this.videoRange, this.videoDuration);
        return stickPointVideoSegment;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setVideoDuration(long j) {
        this.videoDuration = j;
    }

    public final void setVideoEnd(long j) {
        this.videoEnd = j;
    }

    public final void setVideoIndex(int i) {
        this.videoIndex = i;
    }

    public final void setVideoRange(long j) {
        this.videoRange = j;
    }

    public final void setVideoStart(long j) {
        this.videoStart = j;
    }

    public final void updateVideoStartTime(long j) {
        if (j > 0 && this.videoRange > 0) {
            this.videoRange = j;
            long j2 = (this.videoEnd / 2) - (j / 2);
            if (j2 > 0) {
                this.videoStart = j2;
            } else {
                this.videoStart = 0;
            }
            this.videoEnd = this.videoStart + j;
        }
    }

    public final void resetVideoStartTime(long j, long j2) {
        this.videoStart = j;
        this.videoRange = j2;
        this.videoEnd = j + j2;
    }

    public StickPointVideoSegment(int i, long j, long j2, long j3) {
        this.videoIndex = i;
        this.videoStart = j;
        this.videoRange = j2;
        this.videoDuration = j3;
    }
}

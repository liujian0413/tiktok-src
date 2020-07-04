package com.p280ss.android.ugc.aweme.shortvideo.countdown;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState */
public final class CountdownState implements C11670t {
    private final long maxDuration;
    private final String musicPath;
    private final long sdkRecordTime;
    private final long startTime;
    private final UrlModel taps;
    private final long totalTime;
    private final AVMusicWaveBean waveInfo;

    public static /* synthetic */ CountdownState copy$default(CountdownState countdownState, String str, UrlModel urlModel, long j, long j2, long j3, long j4, AVMusicWaveBean aVMusicWaveBean, int i, Object obj) {
        CountdownState countdownState2 = countdownState;
        return countdownState.copy((i & 1) != 0 ? countdownState2.musicPath : str, (i & 2) != 0 ? countdownState2.taps : urlModel, (i & 4) != 0 ? countdownState2.sdkRecordTime : j, (i & 8) != 0 ? countdownState2.startTime : j2, (i & 16) != 0 ? countdownState2.totalTime : j3, (i & 32) != 0 ? countdownState2.maxDuration : j4, (i & 64) != 0 ? countdownState2.waveInfo : aVMusicWaveBean);
    }

    public final String component1() {
        return this.musicPath;
    }

    public final UrlModel component2() {
        return this.taps;
    }

    public final long component3() {
        return this.sdkRecordTime;
    }

    public final long component4() {
        return this.startTime;
    }

    public final long component5() {
        return this.totalTime;
    }

    public final long component6() {
        return this.maxDuration;
    }

    public final AVMusicWaveBean component7() {
        return this.waveInfo;
    }

    public final CountdownState copy(String str, UrlModel urlModel, long j, long j2, long j3, long j4, AVMusicWaveBean aVMusicWaveBean) {
        CountdownState countdownState = new CountdownState(str, urlModel, j, j2, j3, j4, aVMusicWaveBean);
        return countdownState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CountdownState) {
                CountdownState countdownState = (CountdownState) obj;
                if (C7573i.m23585a((Object) this.musicPath, (Object) countdownState.musicPath) && C7573i.m23585a((Object) this.taps, (Object) countdownState.taps)) {
                    if (this.sdkRecordTime == countdownState.sdkRecordTime) {
                        if (this.startTime == countdownState.startTime) {
                            if (this.totalTime == countdownState.totalTime) {
                                if (!(this.maxDuration == countdownState.maxDuration) || !C7573i.m23585a((Object) this.waveInfo, (Object) countdownState.waveInfo)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final long getSdkRecordTime() {
        return this.sdkRecordTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final UrlModel getTaps() {
        return this.taps;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public final AVMusicWaveBean getWaveInfo() {
        return this.waveInfo;
    }

    public final int hashCode() {
        String str = this.musicPath;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.taps;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        long j = this.sdkRecordTime;
        int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.startTime;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.totalTime;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.maxDuration;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        AVMusicWaveBean aVMusicWaveBean = this.waveInfo;
        if (aVMusicWaveBean != null) {
            i = aVMusicWaveBean.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CountdownState(musicPath=");
        sb.append(this.musicPath);
        sb.append(", taps=");
        sb.append(this.taps);
        sb.append(", sdkRecordTime=");
        sb.append(this.sdkRecordTime);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", totalTime=");
        sb.append(this.totalTime);
        sb.append(", maxDuration=");
        sb.append(this.maxDuration);
        sb.append(", waveInfo=");
        sb.append(this.waveInfo);
        sb.append(")");
        return sb.toString();
    }

    public CountdownState(String str, UrlModel urlModel, long j, long j2, long j3, long j4, AVMusicWaveBean aVMusicWaveBean) {
        this.musicPath = str;
        this.taps = urlModel;
        this.sdkRecordTime = j;
        this.startTime = j2;
        this.totalTime = j3;
        this.maxDuration = j4;
        this.waveInfo = aVMusicWaveBean;
    }
}

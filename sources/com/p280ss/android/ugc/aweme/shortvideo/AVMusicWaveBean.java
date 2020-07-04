package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean */
public final class AVMusicWaveBean implements Serializable {
    @C6593c(mo15949a = "music_length")
    private long musicLength;
    @C6593c(mo15949a = "music_wave_ary")
    private float[] musicWavePointArray = new float[0];
    @C6593c(mo15949a = "video_length")
    private long videoLenght;

    public final long getMusicLength() {
        return this.musicLength;
    }

    public final float[] getMusicWavePointArray() {
        return this.musicWavePointArray;
    }

    public final long getVideoLenght() {
        return this.videoLenght;
    }

    public final void setMusicLength(long j) {
        this.musicLength = j;
    }

    public final void setVideoLenght(long j) {
        this.videoLenght = j;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        C7573i.m23587b(fArr, "<set-?>");
        this.musicWavePointArray = fArr;
    }
}

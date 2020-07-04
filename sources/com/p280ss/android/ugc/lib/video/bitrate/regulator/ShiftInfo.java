package com.p280ss.android.ugc.lib.video.bitrate.regulator;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.ShiftInfo */
public class ShiftInfo implements Serializable {
    public double duration;
    public double preloadSize;
    public boolean shift;
    public double speed;
    public int type;
    public double videoSize;

    public ShiftInfo(double d, double d2, double d3, double d4, boolean z, int i) {
        this.preloadSize = d;
        this.videoSize = d2;
        this.duration = d3;
        this.speed = d4;
        this.shift = z;
        this.type = i;
    }
}

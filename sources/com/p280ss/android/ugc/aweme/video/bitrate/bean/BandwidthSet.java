package com.p280ss.android.ugc.aweme.video.bitrate.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44862b;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.BandwidthSet */
public class BandwidthSet implements C44862b {
    @C6593c(mo15949a = "bitrate")
    private double bitRate;
    @C6593c(mo15949a = "speed")
    private double speed;

    public double getBitrate() {
        return this.bitRate;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BandwidthSet{speed=");
        sb.append(this.speed);
        sb.append(", bitRate=");
        sb.append(this.bitRate);
        sb.append('}');
        return sb.toString();
    }

    public void setBitRate(long j) {
        this.bitRate = (double) j;
    }

    public void setSpeed(int i) {
        this.speed = (double) i;
    }
}

package com.p280ss.android.ugc.aweme.video.bitrate.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44865e;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.GearSet */
public class GearSet implements C44865e {
    @C6593c(mo15949a = "bit_rate")
    private int bitRate;
    @C6593c(mo15949a = "network_lower")
    private int networkLower;
    @C6593c(mo15949a = "network_upper")
    private int networkUpper;

    public int getBitRate() {
        return this.bitRate;
    }

    public int getNetworkLower() {
        return this.networkLower;
    }

    public int getNetworkUpper() {
        return this.networkUpper;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GearSet{networkUpper=");
        sb.append(this.networkUpper);
        sb.append(", networkLower=");
        sb.append(this.networkLower);
        sb.append(", bitRate=");
        sb.append(this.bitRate);
        sb.append('}');
        return sb.toString();
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setNetworkLower(int i) {
        this.networkLower = i;
    }

    public void setNetworkUpper(int i) {
        this.networkUpper = i;
    }
}

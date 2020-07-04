package com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose;

import com.p280ss.android.vesdk.VEWaterMarkPosition;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.WaterMarkPositionConfig */
public class WaterMarkPositionConfig implements Serializable {
    public VEWaterMarkPosition position;
    public int xOffset;
    public int yOffset;

    public String toString() {
        StringBuilder sb = new StringBuilder("WaterMarkPositionConfig{xOffset=");
        sb.append(this.xOffset);
        sb.append(", yOffset=");
        sb.append(this.yOffset);
        sb.append(", position=");
        sb.append(this.position);
        sb.append('}');
        return sb.toString();
    }
}

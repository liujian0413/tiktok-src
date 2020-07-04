package com.p280ss.android.ugc.aweme.poi.bean;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.bean.PoiAwemePosition */
public class PoiAwemePosition implements Serializable {
    public int offset;
    public int position = -1;

    public PoiAwemePosition(int i, int i2) {
        this.position = i;
        this.offset = i2;
    }
}

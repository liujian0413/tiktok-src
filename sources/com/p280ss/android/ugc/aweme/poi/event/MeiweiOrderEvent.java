package com.p280ss.android.ugc.aweme.poi.event;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.event.MeiweiOrderEvent */
public class MeiweiOrderEvent implements Serializable {
    public int orderResult;
    public String pageType;

    public boolean isSuccess() {
        if (this.orderResult == 1) {
            return true;
        }
        return false;
    }

    public boolean isBookOrder() {
        return "book".equalsIgnoreCase(this.pageType);
    }

    public MeiweiOrderEvent(String str, int i) {
        this.pageType = str;
        this.orderResult = i;
    }
}

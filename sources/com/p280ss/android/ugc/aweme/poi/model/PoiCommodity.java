package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiCommodity */
public class PoiCommodity implements Serializable {
    @C6593c(mo15949a = "book_url")
    public String book_url;
    @C6593c(mo15949a = "queue_status")
    public int queueStatus;
    @C6593c(mo15949a = "queue_url")
    public String queue_url;

    public boolean isAvailable() {
        if (this.queueStatus < 2 || this.queueStatus > 4) {
            return true;
        }
        return false;
    }
}

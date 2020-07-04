package com.p280ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomExtra */
public class RoomExtra implements Serializable {
    @C6593c(mo15949a = "config")
    public RoomConfig config;
    @C6593c(mo15949a = "with_promotion")
    public boolean withPromotion;

    public RoomConfig getConfig() {
        return this.config;
    }

    public void setConfig(RoomConfig roomConfig) {
        this.config = roomConfig;
    }
}

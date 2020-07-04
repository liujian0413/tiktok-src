package com.p280ss.android.ugc.aweme.services.publish;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.services.publish.SeedPublishModel */
public class SeedPublishModel {
    private String dataType;
    private String referSeedId;
    private String referSeedName;
    private String seedId;
    private String seedName;

    public String getDataType() {
        return this.dataType;
    }

    public String getReferSeedId() {
        return this.referSeedId;
    }

    public String getReferSeedName() {
        return this.referSeedName;
    }

    public String getSeedName() {
        return this.seedName;
    }

    public String getSeedId() {
        if (!TextUtils.isEmpty(this.seedId)) {
            return this.seedId;
        }
        return "0";
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public void setReferSeedId(String str) {
        this.referSeedId = str;
    }

    public void setReferSeedName(String str) {
        this.referSeedName = str;
    }

    public void setSeedId(String str) {
        this.seedId = str;
    }

    public void setSeedName(String str) {
        this.seedName = str;
    }
}

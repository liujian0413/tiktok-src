package com.p280ss.android.ugc.aweme.antiaddic.lock.entity;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.entity.MinorSetting */
public class MinorSetting implements Serializable {
    private List<MinorSettingData> minorSetting;

    public List<MinorSettingData> getMinorSetting() {
        return this.minorSetting;
    }

    public void setMinorSetting(List<MinorSettingData> list) {
        this.minorSetting = list;
    }
}

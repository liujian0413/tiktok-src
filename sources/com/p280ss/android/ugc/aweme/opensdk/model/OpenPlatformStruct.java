package com.p280ss.android.ugc.aweme.opensdk.model;

import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct */
public class OpenPlatformStruct implements Serializable {
    public OpenPlatformRawData rawData;
    @C6593c(mo15949a = "raw_data")
    public String rawDataJson;

    public String getRawDataJson() {
        return this.rawDataJson;
    }

    public OpenPlatformRawData getRawData() {
        if (this.rawData == null) {
            this.rawData = (OpenPlatformRawData) new C6600e().mo15974a(this.rawDataJson, OpenPlatformRawData.class);
        }
        return this.rawData;
    }

    public void setRawData(OpenPlatformRawData openPlatformRawData) {
        this.rawData = openPlatformRawData;
    }

    public void setRawDataJson(String str) {
        this.rawDataJson = str;
    }
}

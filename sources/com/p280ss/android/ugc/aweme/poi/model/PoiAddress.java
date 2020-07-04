package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiAddress */
public class PoiAddress implements Serializable {
    @C6593c(mo15949a = "city")
    public String city;
    @C6593c(mo15949a = "city_code")
    public String cityCode;
    @C6593c(mo15949a = "district")
    public String district;
    @C6593c(mo15949a = "province")
    public String province;
    @C6593c(mo15949a = "simple_addr")
    public String simple_addr;

    public PoiAddress(String str) {
        this.city = str;
    }
}

package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiOptionStruct;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiClassRankStruct */
public class PoiClassRankStruct implements Serializable {
    @C6593c(mo15949a = "backend_type")
    public PoiBackendType backendType;
    @C6593c(mo15949a = "business_area_option")
    public PoiOptionStruct businessAreaOption;
    @C6593c(mo15949a = "city_code")
    public String cityCode;
    @C6593c(mo15949a = "class_option")
    public PoiOptionStruct classOption;
    @C6593c(mo15949a = "description")
    public String description;
    @C6593c(mo15949a = "district_code")
    public String districtCode;
    @C6593c(mo15949a = "poi_class_code")
    public long poiClassCode;
    @C6593c(mo15949a = "poi_id")
    public String poiId;
    @C6593c(mo15949a = "rank_value")
    public long rankValue;
}

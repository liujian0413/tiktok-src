package com.p280ss.android.ugc.aweme.tools.extension;

/* renamed from: com.ss.android.ugc.aweme.tools.extension.SupportedBusiness */
public enum SupportedBusiness {
    MAIN_BUSINESS("main_business_data_in_tools_line"),
    SOCIAL("social_data_in_tools_line"),
    POI("poi_data_in_tools_line"),
    COMMERCE("commerce_data_in_tools_line"),
    UG("ug_data_in_tools_line"),
    TECH("tech_data_in_tools_line"),
    GLOBAL("global_data_in_tools_line");
    
    public final String intentKey;

    private SupportedBusiness(String str) {
        this.intentKey = str;
    }
}

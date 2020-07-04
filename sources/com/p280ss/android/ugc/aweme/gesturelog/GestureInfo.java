package com.p280ss.android.ugc.aweme.gesturelog;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.gesturelog.GestureInfo */
public class GestureInfo {
    @C6593c(mo15949a = "general_data")
    public GenericData data;
    @C6593c(mo15949a = "touch_data_list")
    public List<TouchData> touchDataList;

    public GestureInfo(GenericData genericData, List<TouchData> list) {
        this.data = genericData;
        this.touchDataList = list;
    }
}

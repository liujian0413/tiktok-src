package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AggregationSdk */
public class AggregationSdk implements Serializable {
    @C6593c(mo15949a = "common_data")
    private Object commonData;

    public JSONObject getCommonData() {
        try {
            return new JSONObject(new C6600e().mo15979b(this.commonData));
        } catch (JSONException unused) {
            return null;
        }
    }
}

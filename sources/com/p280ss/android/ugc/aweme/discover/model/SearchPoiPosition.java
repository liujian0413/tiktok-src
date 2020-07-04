package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchPoiPosition */
public class SearchPoiPosition implements Serializable {
    @C6593c(mo15949a = "position")
    public List<Position> position;
    @C6593c(mo15949a = "target")
    String target;

    public boolean isPoiAddress() {
        return "poi_address".endsWith(this.target);
    }

    public boolean isPoiName() {
        return "poi_name".endsWith(this.target);
    }
}

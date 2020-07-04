package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchCommodity */
public class SearchCommodity implements Serializable {
    private static final long serialVersionUID = 1;
    @C6593c(mo15949a = "goods_info")
    Commodity commodity;
    @C6593c(mo15949a = "position")
    List<Position> positions;

    public Commodity getCommodity() {
        return this.commodity;
    }

    public List<Position> getPositions() {
        return this.positions;
    }

    public int hashCode() {
        return this.commodity.hashCode();
    }

    public void setCommodity(Commodity commodity2) {
        this.commodity = commodity2;
    }

    public void setPositions(List<Position> list) {
        this.positions = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCommodity)) {
            return false;
        }
        return this.commodity.equals(((SearchCommodity) obj).commodity);
    }
}

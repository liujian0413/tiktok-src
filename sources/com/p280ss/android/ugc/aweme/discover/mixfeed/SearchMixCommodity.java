package com.p280ss.android.ugc.aweme.discover.mixfeed;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.discover.model.Commodity;
import com.p280ss.android.ugc.aweme.discover.model.Position;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchMixCommodity */
public class SearchMixCommodity implements Serializable {
    private static final long serialVersionUID = 42;
    @C6593c(mo15949a = "product_info")
    private List<Commodity> commodityList;
    @C6593c(mo15949a = "has_more")
    private boolean hasMore;
    @C6593c(mo15949a = "position")
    List<Position> positions;

    public List<Commodity> getCommodityList() {
        return this.commodityList;
    }

    public List<Position> getPositions() {
        return this.positions;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setCommodityList(List<Commodity> list) {
        this.commodityList = list;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setPositions(List<Position> list) {
        this.positions = list;
    }
}

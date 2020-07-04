package com.p280ss.android.ugc.aweme.discover.model;

import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData */
public class SearchMixCommodityData {
    public List<SearchCommodity> commodityList;
    public boolean hasMoreCommodity;

    public SearchMixCommodityData setCommodityList(List<SearchCommodity> list) {
        this.commodityList = list;
        return this;
    }

    public SearchMixCommodityData setHasMoreCommodity(boolean z) {
        this.hasMoreCommodity = z;
        return this;
    }

    public SearchMixCommodityData(List<SearchCommodity> list, boolean z) {
        this.commodityList = list;
        this.hasMoreCommodity = z;
    }
}

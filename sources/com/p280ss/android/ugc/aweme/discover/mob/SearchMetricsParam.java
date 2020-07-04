package com.p280ss.android.ugc.aweme.discover.mob;

import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.metrics.ExtraMetricsParam;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.SearchMetricsParam */
public class SearchMetricsParam extends ExtraMetricsParam {
    private String enterFrom;
    private String enterMethod;
    private int order;
    private String rid;
    private String searchKeyword;

    public HashMap<String, String> buildParams() {
        appendParam(POIService.KEY_ORDER, String.valueOf(this.order), C33260a.f86770a);
        appendParam("search_keyword", this.searchKeyword, C33260a.f86770a);
        appendParam("request_id", this.rid, C33260a.f86770a);
        appendParam("enter_from", this.enterFrom, C33260a.f86770a);
        appendParam("enter_method", this.enterMethod, C33260a.f86770a);
        appendParam("log_pb", C28199ae.m92689a().mo71791a(this.rid), C33260a.f86770a);
        return this.params;
    }

    public SearchMetricsParam setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public SearchMetricsParam setEnterMethod(String str) {
        this.enterMethod = str;
        return this;
    }

    public SearchMetricsParam setOrder(int i) {
        this.order = i;
        return this;
    }

    public SearchMetricsParam setRid(String str) {
        this.rid = str;
        return this;
    }

    public SearchMetricsParam setSearchKeyword(String str) {
        this.searchKeyword = str;
        return this;
    }
}

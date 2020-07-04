package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchListResponse */
public class HotSearchListResponse extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 1;
    @C6593c(mo15949a = "ad_search_list")
    private List<AdDefaultSearchStruct> adSearchList;
    @C6593c(mo15949a = "data")
    private HotSearchEntity data;
    @C6593c(mo15949a = "op_default_word")
    private String defaultSearchKeyword;
    @C6593c(mo15949a = "log_pb")
    private LogPbBean logPb;
    @C6593c(mo15949a = "op_default_search_word")
    private String realDefaultSearchKeyword;

    public List<AdDefaultSearchStruct> getAdSearchList() {
        return this.adSearchList;
    }

    public HotSearchEntity getData() {
        return this.data;
    }

    public String getDefaultSearchKeyword() {
        return this.defaultSearchKeyword;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public String getRealDefaultSearchKeyword() {
        return this.realDefaultSearchKeyword;
    }

    public void setData(HotSearchEntity hotSearchEntity) {
        this.data = hotSearchEntity;
    }

    public void setDefaultSearchKeyword(String str) {
        this.defaultSearchKeyword = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setRealDefaultSearchKeyword(String str) {
        this.realDefaultSearchKeyword = str;
    }
}

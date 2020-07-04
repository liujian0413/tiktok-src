package com.p280ss.android.ugc.aweme.story.api.model.redpackage.common;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.api.model.redpackage.common.AdStruct */
public class AdStruct implements Serializable {
    @C6593c(mo15949a = "ad_name")
    private String adName;
    @C6593c(mo15949a = "ad_id")

    /* renamed from: id */
    private long f109060id;
    @C6593c(mo15949a = "is_high_level")
    private boolean isHighLevel;
    @C6593c(mo15949a = "jump_url")
    private String jumpUrl;
    @C6593c(mo15949a = "pic_url")
    private List<UrlModel> picUrlList;

    public String getAdName() {
        return this.adName;
    }

    public long getId() {
        return this.f109060id;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public List<UrlModel> getPicUrlList() {
        return this.picUrlList;
    }

    public boolean isHighLevel() {
        return this.isHighLevel;
    }

    public AdStruct setAdName(String str) {
        this.adName = str;
        return this;
    }

    public AdStruct setHighLevel(boolean z) {
        this.isHighLevel = z;
        return this;
    }

    public AdStruct setId(long j) {
        this.f109060id = j;
        return this;
    }

    public AdStruct setJumpUrl(String str) {
        this.jumpUrl = str;
        return this;
    }

    public AdStruct setPicUrlList(List<UrlModel> list) {
        this.picUrlList = list;
        return this;
    }
}

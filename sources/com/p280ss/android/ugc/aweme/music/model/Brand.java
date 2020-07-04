package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.Brand */
public class Brand implements Serializable {
    @C6593c(mo15949a = "heat")
    private int heat;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private int f88170id;
    @C6593c(mo15949a = "logo_url")
    private UrlModel logoUrl;
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "rank")
    private int rank;
    @C6593c(mo15949a = "rank_diff")
    private int rankDiff;

    public int getHeat() {
        return this.heat;
    }

    public int getId() {
        return this.f88170id;
    }

    public UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public String getName() {
        return this.name;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRankDiff() {
        return this.rankDiff;
    }

    public void setHeat(int i) {
        this.heat = i;
    }

    public void setId(int i) {
        this.f88170id = i;
    }

    public void setLogoUrl(UrlModel urlModel) {
        this.logoUrl = urlModel;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setRankDiff(int i) {
        this.rankDiff = i;
    }
}

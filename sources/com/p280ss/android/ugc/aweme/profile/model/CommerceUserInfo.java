package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.CommerceUserInfo */
public class CommerceUserInfo implements Serializable {
    @C6593c(mo15949a = "ad_influencer_type")
    public int adInfluencerType;
    @C6593c(mo15949a = "has_ads_entry")
    public boolean hasAdEntry;
    @C6593c(mo15949a = "is_ad_partner")
    public boolean isAdPartner;
    @C6593c(mo15949a = "link_user_info")
    public LinkUserInfoStruct linkUserInfo;
    @C6593c(mo15949a = "show_star_atlas_cooperation")
    public boolean showStarAtlasCooperation;
    @C6593c(mo15949a = "star_atlas")
    public int starAtlas;

    public int getAdInfluencerType() {
        return this.adInfluencerType;
    }

    public LinkUserInfoStruct getLinkUserInfo() {
        return this.linkUserInfo;
    }

    public int getStarAtlas() {
        return this.starAtlas;
    }

    public boolean isAdPartner() {
        return this.isAdPartner;
    }

    public boolean isShowStarAtlasCooperation() {
        return this.showStarAtlasCooperation;
    }
}

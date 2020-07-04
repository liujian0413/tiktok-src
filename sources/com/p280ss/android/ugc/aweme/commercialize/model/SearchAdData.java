package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.log.C24933af;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.SearchAdData */
public class SearchAdData implements C24933af, Serializable {
    @C6593c(mo15949a = "ad_id")
    public long adId = -1;
    @C6593c(mo15949a = "ad_type")
    public int adType = -1;
    @C6593c(mo15949a = "advanced_infos")
    public List<C24987a> advancedInfoList;
    @C6593c(mo15949a = "advertiser_info")
    public User advertisementInfo;
    @C6593c(mo15949a = "brand_billboard_info")
    public BlueVBrandInfo brandInfo;
    @C6593c(mo15949a = "challenge_list")
    public List<Challenge> challengeList;
    @C6593c(mo15949a = "click_track_url_list")
    public UrlModel clickTrackUrlList;
    @C6593c(mo15949a = "count_down_ts")
    public long countDownTimeStamp;
    @C6593c(mo15949a = "guide_text")
    public String guideText = "";
    @C6593c(mo15949a = "icon_list")
    public List<UrlModel> iconList = new ArrayList();
    @C6593c(mo15949a = "creative_id")

    /* renamed from: id */
    public long f65873id = -1;
    @C6593c(mo15949a = "image_list")
    public List<UrlModel> imageList;
    @C6593c(mo15949a = "is_preview")
    public boolean isPreview;
    @C6593c(mo15949a = "label")
    public String label;
    @C6593c(mo15949a = "log_extra")
    public String logExtra;
    @C6593c(mo15949a = "mp_url")
    public String mpUrl;
    @C6593c(mo15949a = "native_type")
    public int nativeType;
    @C6593c(mo15949a = "open_url")
    public String openUrl;
    @C6593c(mo15949a = "source")
    public String source;
    @C6593c(mo15949a = "sub_text")
    public String subText = "";
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "track_url_list")
    public UrlModel trackUrlList;
    @C6593c(mo15949a = "type")
    public String type;
    @C6593c(mo15949a = "web_title")
    public String webTitle;
    @C6593c(mo15949a = "web_url")
    public String webUrl;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.SearchAdData$a */
    public static class C24987a {
        @C6593c(mo15949a = "title")

        /* renamed from: a */
        public String f65874a;
        @C6593c(mo15949a = "web_title")

        /* renamed from: b */
        public String f65875b;
        @C6593c(mo15949a = "web_url")

        /* renamed from: c */
        public String f65876c;
        @C6593c(mo15949a = "open_url")

        /* renamed from: d */
        public String f65877d;
        @C6593c(mo15949a = "mp_url")

        /* renamed from: e */
        public String f65878e;
        @C6593c(mo15949a = "image_info")

        /* renamed from: f */
        public UrlModel f65879f;
    }

    public long getCreativeId() {
        return this.f65873id;
    }

    public String getLogExtra() {
        return this.logExtra;
    }
}

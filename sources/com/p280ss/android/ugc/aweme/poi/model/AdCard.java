package com.p280ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.AdCard */
public class AdCard implements Serializable {
    private AwemeRawAd mAwemeRawAd;
    private List<AwemeRawAd> mAwemeRawAds;
    @C6593c(mo15949a = "raw_data")
    private String rawData;
    @C6593c(mo15949a = "raw_datas")
    private List<String> rawDatas;
    @C6593c(mo15949a = "title")
    private String title;

    public AwemeRawAd getAwemeAd() {
        return this.mAwemeRawAd;
    }

    public List<AwemeRawAd> getAwemeAds() {
        return this.mAwemeRawAds;
    }

    public String getRawData() {
        return this.rawData;
    }

    public List<String> getRawDatas() {
        return this.rawDatas;
    }

    public String getTitle() {
        if (TextUtils.isEmpty(this.title)) {
            return "";
        }
        return this.title;
    }

    public void parseRawData() {
        if (!TextUtils.isEmpty(this.rawData)) {
            this.mAwemeRawAd = getAwemeRawAd(this.rawData);
        }
        if (this.mAwemeRawAd == null && !C6307b.m19566a((Collection<T>) this.rawDatas)) {
            for (String awemeRawAd : this.rawDatas) {
                AwemeRawAd awemeRawAd2 = getAwemeRawAd(awemeRawAd);
                if (awemeRawAd2 != null && !awemeRawAd2.isNewStyleAd()) {
                    this.mAwemeRawAd = awemeRawAd2;
                    return;
                }
            }
        }
    }

    public void setAwemeRawAds(List<AwemeRawAd> list) {
        this.mAwemeRawAds = list;
    }

    public void setRawData(String str) {
        this.rawData = str;
    }

    public static AwemeRawAd getAwemeRawAd(String str) {
        try {
            return (AwemeRawAd) new C6600e().mo15975a(str, new C6597a<AwemeRawAd>() {
            }.type);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            return null;
        }
    }
}

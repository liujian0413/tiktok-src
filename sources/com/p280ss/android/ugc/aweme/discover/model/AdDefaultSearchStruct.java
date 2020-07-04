package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.AdDefaultSearchStruct */
public class AdDefaultSearchStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @C6592b(mo15947a = StringJsonAdapterFactory.class)
    @C6593c(mo15949a = "ad_data")
    private AwemeRawAd adData;
    @C6593c(mo15949a = "default_word")
    private String defaultWord;
    @C6593c(mo15949a = "position")
    private int position;
    @C6593c(mo15949a = "search_word")
    private String searchWord;

    public AwemeRawAd getAdData() {
        return this.adData;
    }

    public String getDefaultWord() {
        return this.defaultWord;
    }

    public int getPosition() {
        return this.position;
    }

    public String getSearchWord() {
        return this.searchWord;
    }
}

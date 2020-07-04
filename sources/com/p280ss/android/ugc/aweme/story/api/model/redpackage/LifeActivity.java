package com.p280ss.android.ugc.aweme.story.api.model.redpackage;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.story.api.model.redpackage.common.AdStruct;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.story.api.model.redpackage.LifeActivity */
public class LifeActivity implements Serializable {
    @C6593c(mo15949a = "ad")

    /* renamed from: ad */
    AdStruct f109059ad;
    @C6593c(mo15949a = "card")
    int cardType;

    public AdStruct getAd() {
        return this.f109059ad;
    }

    public int getCardType() {
        return this.cardType;
    }

    public void setAd(AdStruct adStruct) {
        this.f109059ad = adStruct;
    }

    public void setCardType(int i) {
        this.cardType = i;
    }
}

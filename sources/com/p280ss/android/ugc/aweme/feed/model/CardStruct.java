package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CardStruct */
public class CardStruct implements Serializable {
    @C6593c(mo15949a = "card_data")
    private Object cardData;
    @C6593c(mo15949a = "card_style")
    int cardStyle;
    @C6593c(mo15949a = "card_type")
    int cardType;
    @C6593c(mo15949a = "card_url")
    String cardUrl;
    @C6593c(mo15949a = "dynamic_type")
    private int dynamicType;
    @C6593c(mo15949a = "show_duration")
    private int showDuration;
    @C6593c(mo15949a = "show_seconds")
    int showSeconds;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.CardStruct$IStatusCode */
    public interface IStatusCode {
    }

    public int getCardStyle() {
        return this.cardStyle;
    }

    public int getCardType() {
        return this.cardType;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public int getDynamicType() {
        return this.dynamicType;
    }

    public int getShowDuration() {
        return this.showDuration;
    }

    public int getShowSeconds() {
        return this.showSeconds;
    }

    public JSONObject getCardData() {
        try {
            return new JSONObject(new C6600e().mo15979b(this.cardData));
        } catch (Exception unused) {
            return null;
        }
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setCardUrl(String str) {
        this.cardUrl = str;
    }
}

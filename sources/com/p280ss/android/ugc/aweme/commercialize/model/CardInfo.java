package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.profile.p1482c.C35739a;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.CardInfo */
public final class CardInfo implements Serializable {
    @C6592b(mo15947a = C35739a.class)
    @C6593c(mo15949a = "card_data")
    private String cardData;
    @C6593c(mo15949a = "card_style")
    private int cardStyle;
    @C6593c(mo15949a = "card_type")
    private int cardType;
    @C6593c(mo15949a = "card_url")
    private String cardUrl;
    @C6593c(mo15949a = "show_duration")
    private int showDuration;
    @C6593c(mo15949a = "show_seconds")
    private int showSeconds;

    public final String getCardData() {
        return this.cardData;
    }

    public final int getCardStyle() {
        return this.cardStyle;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final String getCardUrl() {
        return this.cardUrl;
    }

    public final int getShowDuration() {
        return this.showDuration;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final void setCardData(String str) {
        this.cardData = str;
    }

    public final void setCardStyle(int i) {
        this.cardStyle = i;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public final void setShowDuration(int i) {
        this.showDuration = i;
    }

    public final void setShowSeconds(int i) {
        this.showSeconds = i;
    }
}

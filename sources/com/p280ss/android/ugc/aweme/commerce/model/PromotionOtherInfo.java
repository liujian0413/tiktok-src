package com.p280ss.android.ugc.aweme.commerce.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.PromotionOtherInfo */
public final class PromotionOtherInfo implements Serializable {
    @C6593c(mo15949a = "card_predict_duration")
    public int cardPredictDuration;
    @C6593c(mo15949a = "order_share_recommend")
    public boolean isOrderShareRecommend;
    @C6593c(mo15949a = "recall_reason")
    public String recallReason = "";

    public final int getCardPredictDuration() {
        return this.cardPredictDuration;
    }

    public final String getRecallReason() {
        return this.recallReason;
    }

    public final boolean isOrderShareRecommend() {
        return this.isOrderShareRecommend;
    }

    public final void setCardPredictDuration(int i) {
        this.cardPredictDuration = i;
    }

    public final void setOrderShareRecommend(boolean z) {
        this.isOrderShareRecommend = z;
    }

    public final void setRecallReason(String str) {
        this.recallReason = str;
    }
}

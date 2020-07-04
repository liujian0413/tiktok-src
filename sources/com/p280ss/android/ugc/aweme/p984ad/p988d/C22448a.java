package com.p280ss.android.ugc.aweme.p984ad.p988d;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.p280ss.android.ugc.aweme.p984ad.model.AdTagTextLabelModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.ad.d.a */
public final class C22448a {
    /* renamed from: a */
    public static ReplacementSpan m74302a(Context context, AdTagTextLabelModel adTagTextLabelModel) {
        if (adTagTextLabelModel.isAd() && adTagTextLabelModel.isRightStyle()) {
            C22449b bVar = new C22449b(context, adTagTextLabelModel.getBgColor(), adTagTextLabelModel.getLabelName(), adTagTextLabelModel.getTextColor());
            bVar.f59863a = adTagTextLabelModel.isAdHollowText();
            return bVar;
        } else if (TextUtils.isEmpty(adTagTextLabelModel.getAdMoreTextual())) {
            return new C22450c(context, R.drawable.a8f);
        } else {
            return new C22451d(context, R.color.en, adTagTextLabelModel.getAdMoreTextual(), R.drawable.aod);
        }
    }
}

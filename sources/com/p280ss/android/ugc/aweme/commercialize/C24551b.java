package com.p280ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24475h;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24449a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.SimpleShopSeedingModel;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28231a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.video.C43316v;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b */
public final class C24551b extends C28231a {
    public C24551b(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    public final void mo64356a(C28318an anVar, String str) {
        Activity d = mo71837d();
        if (d != null) {
            Aweme aweme = (Aweme) anVar.f74632b;
            String aid = aweme.getAid();
            SimpleShopSeedingModel simpleShopSeedingModel = aweme.getSimpleShopSeedingModel();
            if (!TextUtils.isEmpty(aid) && simpleShopSeedingModel != null && aweme.getAuthor() != null) {
                C6903bc.m21503v().mo58104a(d, simpleShopSeedingModel.getSeedId(), aid, aweme.getAuthorUid(), aweme.getAuthor().getSecUid(), str, str);
                new C24475h().mo63582a(aweme.getAid()).mo63583b(aweme.getAuthorUid()).mo63584c(simpleShopSeedingModel.getSeedId()).mo63585d(simpleShopSeedingModel.getTitle()).mo63586e(str).mo63537a();
            }
        }
    }

    /* renamed from: b */
    public final void mo64358b(C28318an anVar, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        Aweme aweme = (Aweme) anVar.f74632b;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            User author = aweme.getAuthor();
            if (mo71838e() != null && author != null && aweme.getPromotion() != null) {
                ICommerceService a = C24436a.m80356a();
                Activity d = mo71837d();
                String promotionId = aweme.getPromotion().getPromotionId();
                long promotionSource = (long) aweme.getPromotion().getPromotionSource();
                if (TextUtils.isEmpty(str3)) {
                    str4 = "INVALID_ENTER_FROM";
                } else {
                    str4 = str3;
                }
                if (TextUtils.isEmpty(str)) {
                    str5 = "";
                } else {
                    str5 = str;
                }
                String str7 = "full_screen_card";
                if (TextUtils.isEmpty(str2)) {
                    str6 = "";
                } else {
                    str6 = str2;
                }
                a.logAndStartPreview(d, aweme, promotionId, promotionSource, author, str4, str5, str7, str6, C43316v.m137450K().mo104915n());
            }
        }
    }

    /* renamed from: a */
    public final void mo64357a(C28318an anVar, String str, String str2, String str3) {
        User user;
        String str4;
        String str5;
        String str6;
        Aweme aweme = (Aweme) anVar.f74632b;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            User author = aweme.getAuthor();
            if (aweme.hasPromotion() && mo71838e() != null && aweme.hasPromotion()) {
                if (C6861a.m21337f().isMe(author.getUid())) {
                    user = C6861a.m21337f().getCurUser();
                } else {
                    user = author;
                }
                if (C24449a.m80374a(user) != null) {
                    ICommerceService a = C24436a.m80356a();
                    Activity d = mo71837d();
                    String promotionId = aweme.getPromotion().getPromotionId();
                    long promotionSource = (long) aweme.getPromotion().getPromotionSource();
                    if (TextUtils.isEmpty(str3)) {
                        str4 = "INVALID_ENTER_FROM";
                    } else {
                        str4 = str3;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str5 = "";
                    } else {
                        str5 = str;
                    }
                    String str7 = "full_screen_card";
                    if (TextUtils.isEmpty(str2)) {
                        str6 = "";
                    } else {
                        str6 = str2;
                    }
                    a.logAndStartPreview(d, aweme, promotionId, promotionSource, author, str4, str5, str7, str6, C43316v.m137450K().mo104915n());
                }
            }
        }
    }
}

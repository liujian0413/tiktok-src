package com.p280ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43150p;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ac */
public abstract class C36003ac extends C25652b<C25640a<UserResponse>, C36041o> {
    /* renamed from: a */
    public final void mo91623a(User user) {
        mo91624a(user, true);
    }

    /* renamed from: b */
    private static int m115970b(User user) {
        if (C36337ai.m117567a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    /* renamed from: a */
    public void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C36041o) this.f67572c).mo91707b(exc);
        }
    }

    /* renamed from: a */
    public final void mo91624a(User user, boolean z) {
        int i;
        int i2;
        String str;
        String str2;
        if (this.f67572c != null && ((C36041o) this.f67572c).mo91726f()) {
            ((C36041o) this.f67572c).setUser(user);
            if (z) {
                ((C36041o) this.f67572c).mo91705b(user.getFollowingCount());
                ((C36041o) this.f67572c).mo91697a(m115970b(user));
                ((C36041o) this.f67572c).mo91700a(user.getTotalFavorited());
            }
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                ((C36041o) this.f67572c).mo91703a(user.getRemarkName(), user.getStarBillboardRank(), user.getBrandInfo(), user);
            } else {
                ((C36041o) this.f67572c).mo91703a(user.getNickname(), user.getStarBillboardRank(), user.getBrandInfo(), user);
            }
            ((C36041o) this.f67572c).mo91699a(user.getFollowStatus(), user.getSignature());
            ((C36041o) this.f67572c).mo91710b(user.isLive(), C43122ff.m136791v(user), StoryUnreadUtils.hasUnreadStory(user));
            ((C36041o) this.f67572c).mo91712c(user);
            ((C36041o) this.f67572c).mo91701a(C43150p.m136858b(user));
            ((C36041o) this.f67572c).mo91728g(user);
            ((C36041o) this.f67572c).mo91711c(user.getAwemeCount());
            ((C36041o) this.f67572c).mo91704a(user.isWithFusionShopEntry(), user.isWithNewGoods(), user.isWithCommerceEntry());
            ((C36041o) this.f67572c).mo91716d(user.getFavoritingCount());
            C7213d.m22500a();
            if (!C7213d.m22502aq() || !C43122ff.m136787r(user)) {
                ((C36041o) this.f67572c).mo91724f(user.getDongtaiCount());
            } else {
                ((C36041o) this.f67572c).mo91724f(user.getCollectCount());
            }
            ((C36041o) this.f67572c).mo91721e(user.getStoryCount());
            C36041o oVar = (C36041o) this.f67572c;
            if (user.getOriginalMusician() != null) {
                i = user.getOriginalMusician().getMusicCount();
            } else {
                i = 0;
            }
            oVar.mo91727g(i);
            C36041o oVar2 = (C36041o) this.f67572c;
            if (user.getEffectArtistDetail() != null) {
                i2 = user.getEffectArtistDetail().getTotal();
            } else {
                i2 = 0;
            }
            oVar2.mo91730h(i2);
            ((C36041o) this.f67572c).mo91706b(user);
            C36041o oVar3 = (C36041o) this.f67572c;
            if (TextUtils.isEmpty(user.getCustomVerify())) {
                str = user.getWeiboVerify();
            } else {
                str = user.getCustomVerify();
            }
            oVar3.mo91708b(str);
            ((C36041o) this.f67572c).mo91715d();
            ((C36041o) this.f67572c).mo91718d(user.getEnterpriseVerifyReason());
            C36041o oVar4 = (C36041o) this.f67572c;
            if (TextUtils.isEmpty(user.getUniqueId())) {
                str2 = user.getShortId();
            } else {
                str2 = user.getUniqueId();
            }
            oVar4.mo91713c(str2);
            ((C36041o) this.f67572c).mo91714c(user.isBindedWeibo());
            ((C36041o) this.f67572c).mo91719d(C43122ff.m136793x(user));
            ((C36041o) this.f67572c).mo91717d(user);
            ((C36041o) this.f67572c).mo91725f(user);
            if (C43122ff.m136787r(user)) {
                ((C36041o) this.f67572c).mo91698a(3, user.getFollowerStatus());
                ((C36041o) this.f67572c).mo91709b(false);
            } else {
                ((C36041o) this.f67572c).mo91698a(user.getFollowStatus(), user.getFollowerStatus());
                ((C36041o) this.f67572c).mo91709b(true);
            }
            ((C36041o) this.f67572c).mo91723e(user.hasMedal());
            ((C36041o) this.f67572c).mo91722e(user);
            user.getCustomVerify();
            ((C36041o) this.f67572c).mo91720e();
        }
    }
}

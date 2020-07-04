package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43166q;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c */
public class C25329c {

    /* renamed from: a */
    static final /* synthetic */ boolean f66713a = (!C25329c.class.desiredAssertionStatus());

    /* renamed from: D */
    public static final boolean m83202D(Aweme aweme) {
        if (m83240w(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m83220c(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 34) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m83221d(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m83228k(Aweme aweme) {
        if (aweme == null || !aweme.isCmtSwt()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final AwemeRawAd m83229l(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            return aweme.getAwemeRawAd();
        }
        return null;
    }

    /* renamed from: m */
    public static final AwemeSplashInfo m83230m(Aweme aweme) {
        AwemeRawAd l = m83229l(aweme);
        if (l == null) {
            return null;
        }
        return l.getSplashInfo();
    }

    /* renamed from: p */
    public static final boolean m83233p(Aweme aweme) {
        AwemeSplashInfo m = m83230m(aweme);
        if (m == null) {
            return false;
        }
        return m.isShown();
    }

    /* renamed from: u */
    public static final void m83238u(Aweme aweme) {
        AwemeSplashInfo m = m83230m(aweme);
        if (m != null) {
            m.setShown(true);
        }
    }

    /* renamed from: v */
    public static final float m83239v(Aweme aweme) {
        AwemeSplashInfo m = m83230m(aweme);
        if (m == null) {
            return 0.0f;
        }
        return m.getSplashShowTime();
    }

    /* renamed from: z */
    public static final String m83243z(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return aweme.getAwemeRawAd().getButtonText();
    }

    /* renamed from: B */
    public static final boolean m83200B(Aweme aweme) {
        if (aweme != null && aweme.isAd() && !m83224g(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static final boolean m83201C(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAnimationType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static final boolean m83203E(Aweme aweme) {
        if (aweme == null || (!m83201C(aweme) && !m83202D(aweme) && !C43166q.m136903a(aweme) && m83204F(aweme) == null)) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public static final CardStruct m83204F(Aweme aweme) {
        AwemeRawAd l = m83229l(aweme);
        if (l == null) {
            return null;
        }
        Map cardInfos = l.getCardInfos();
        if (cardInfos == null) {
            return null;
        }
        return (CardStruct) cardInfos.get("4");
    }

    /* renamed from: G */
    public static final boolean m83205G(Aweme aweme) {
        if (!m83221d(aweme) || !aweme.getAwemeRawAd().isContextTrackSent()) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public static final boolean m83206H(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAdType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public static final boolean m83209K(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().liveRoom != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m83222e(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || !aweme.getAwemeRawAd().getShowSpecialAvatar() || !m83215a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m83223f(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m83224g(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m83225h(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static final boolean m83226i(Aweme aweme) {
        if (aweme == null || aweme.getCommerceVideoAuthInfo() == null || aweme.getCommerceVideoAuthInfo().getAdSource() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final boolean m83227j(Aweme aweme) {
        if (!m83224g(aweme) || aweme.getAwemeRawAd().getDisableFollowToClick() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m83231n(Aweme aweme) {
        AwemeSplashInfo m = m83230m(aweme);
        if (m != null && !TextUtils.isEmpty(m.getAwesomeSplashId())) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m83232o(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        LinkData a = C25268bg.m83039a(aweme);
        if (a != null && a.feedShowType == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final boolean m83234q(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdTagPosition() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static final boolean m83235r(Aweme aweme) {
        User curUser = C6861a.m21337f().getCurUser();
        if (curUser == null || !curUser.isWithDouplusEntry()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static final boolean m83236s(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return aweme.getAwemeRawAd().isShowAdAfterInteraction();
    }

    /* renamed from: t */
    public static final int m83237t(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return 0;
        }
        return aweme.getAwemeRawAd().getInteractionSeconds();
    }

    /* renamed from: w */
    public static final CardStruct m83240w(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getDefaultCardInfo() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getDefaultCardInfo();
    }

    /* renamed from: x */
    public static final String m83241x(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getDownloadUrl();
    }

    /* renamed from: A */
    public static final boolean m83199A(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        }
        if (awemeRawAd.getAnimationType() == 1 || awemeRawAd.getAnimationType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static final boolean m83208J(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isAdFake()) {
            return false;
        }
        if (m83207I(aweme).booleanValue() || aweme.getAwemeRawAd().isAllowDspAutoJump()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static boolean m83210L(Aweme aweme) {
        if (aweme == null || !aweme.isAppAd()) {
            return false;
        }
        if (!f66713a && aweme.getAwemeRawAd() == null) {
            throw new AssertionError();
        } else if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getLightWebUrl())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static final void m83214a(List<Aweme> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) list.get(i);
                if (m83221d(aweme)) {
                    C24671f.m80851a().mo64680k(C6399b.m19921a(), aweme);
                }
            }
        }
    }

    /* renamed from: b */
    public static final void m83218b(List<Aweme> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Aweme aweme = (Aweme) list.get(size);
                if (aweme != null && aweme.isAd()) {
                    if (!m83216a(aweme.getAwemeRawAd(), "feed_download_ad")) {
                        break;
                    }
                    list.remove(size);
                }
            }
        }
    }

    /* renamed from: y */
    public static final String m83242y(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return C23481i.m77089a().getString(R.color.w0);
        }
        String learnMoreBgColor = aweme.getAwemeRawAd().getLearnMoreBgColor();
        if (TextUtils.isEmpty(learnMoreBgColor)) {
            return C23481i.m77089a().getString(R.color.w0);
        }
        return learnMoreBgColor;
    }

    /* renamed from: I */
    public static final Boolean m83207I(Aweme aweme) {
        boolean z = false;
        if (aweme == null) {
            return Boolean.valueOf(false);
        }
        if (!aweme.isAd()) {
            return Boolean.valueOf(false);
        }
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        if (TextUtils.isEmpty(openUrl)) {
            return Boolean.valueOf(false);
        }
        Uri parse = Uri.parse(openUrl);
        if (parse.getScheme() == null) {
            return Boolean.valueOf(false);
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if ((C22909c.f60637a.equals(lowerCase) || C22909c.f60639c.equals(lowerCase)) && !C33447f.m108191d(parse.toString())) {
            return Boolean.valueOf(true);
        }
        if (C6399b.m19944t() && C24671f.m80853c().mo64689a(openUrl)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: b */
    public static final boolean m83219b(Aweme aweme) {
        if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        }
        CommerceActivityStruct activityPendant = aweme.getActivityPendant();
        UrlModel image = activityPendant.getImage();
        if (image == null || C6307b.m19566a((Collection<T>) image.getUrlList())) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis < activityPendant.getStartTime() || currentTimeMillis > activityPendant.getEndTime()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m83215a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return true;
        }
        return author.isAdFake();
    }

    /* renamed from: a */
    public static boolean m83217a(String str) {
        if (C6399b.m19944t() || (!TextUtils.equals(str, "general_search") && !TextUtils.equals(str, "search_result"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m83213a(Aweme aweme, boolean z) {
        if (m83221d(aweme)) {
            aweme.getAwemeRawAd().setContextTrackSent(false);
        }
    }

    /* renamed from: a */
    private static Aweme m83211a(List<Aweme> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (Aweme) list.get(i);
    }

    /* renamed from: a */
    private static boolean m83216a(AwemeRawAd awemeRawAd, String str) {
        boolean z = false;
        if (awemeRawAd == null) {
            return false;
        }
        if (awemeRawAd.isHideIfExists() && awemeRawAd.isAppAd() && C6776h.m20948b(C6399b.m19921a(), awemeRawAd.getPackageName())) {
            C24671f.m80851a().mo64661a(C6399b.m19921a(), awemeRawAd, str);
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static final String m83212a(Aweme aweme, List<Aweme> list, int i) {
        Aweme aweme2;
        if (aweme == null || !aweme.isAd() || C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        if (System.currentTimeMillis() % 2 == 0) {
            aweme2 = m83211a(list, i - 1);
        } else {
            aweme2 = m83211a(list, i + 1);
        }
        if (aweme2 == null || aweme2.getVideo() == null || aweme2.getVideo().getPlayAddr() == null || C6307b.m19566a((Collection<T>) aweme2.getVideo().getPlayAddr().getUrlList())) {
            return null;
        }
        return (String) aweme2.getVideo().getPlayAddr().getUrlList().get(0);
    }
}

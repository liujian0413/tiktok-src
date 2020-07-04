package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25568n;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.FormAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.GeneralAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.InteractAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.PoiAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.PollAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.ShopAdCardAction;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.SurveyAdCardAction;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29961b;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C7513am;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j */
public final class C25364j {

    /* renamed from: a */
    public static final C25364j f66767a = new C25364j();

    /* renamed from: b */
    private static final Set<Integer> f66768b = C7513am.m23410a((T[]) new Integer[]{Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(10), Integer.valueOf(6), Integer.valueOf(11), Integer.valueOf(7)});

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j$a */
    public interface C25365a {

        /* renamed from: a */
        public static final C25366a f66769a = C25366a.f66770a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.j$a$a */
        public static final class C25366a {

            /* renamed from: a */
            static final /* synthetic */ C25366a f66770a = new C25366a();

            /* renamed from: b */
            private static final int f66771b = 1;

            private C25366a() {
            }

            /* renamed from: a */
            public static int m83409a() {
                return f66771b;
            }
        }
    }

    private C25364j() {
    }

    /* renamed from: h */
    private static boolean m83408h(Aweme aweme) {
        if (m83399a(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final CardStruct m83399a(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Map cardInfos = awemeRawAd.getCardInfos();
                if (cardInfos != null) {
                    return (CardStruct) cardInfos.get("3");
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final CardStruct m83402b(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Map cardInfos = awemeRawAd.getCardInfos();
                if (cardInfos != null) {
                    return (CardStruct) cardInfos.get("4");
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final long m83405e(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        if (m83404d(aweme)) {
            return 240;
        }
        return 200;
    }

    /* renamed from: a */
    public static final View m83397a(ViewGroup viewGroup) {
        int i;
        if (viewGroup == null) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            if (VERSION.SDK_INT >= 17) {
                i = View.generateViewId();
            } else {
                i = R.id.c0;
            }
            View frameLayout = new FrameLayout(viewGroup.getContext());
            ((FrameLayout) frameLayout).setId(i);
            viewGroup.addView(frameLayout, new LayoutParams(-1, -1));
            childAt = frameLayout;
        }
        return childAt;
    }

    /* renamed from: c */
    public static final int m83403c(Aweme aweme) {
        Integer num;
        if (m83408h(aweme)) {
            CardStruct a = m83399a(aweme);
            if (a != null) {
                num = Integer.valueOf(a.getShowDuration());
            } else {
                num = null;
            }
        } else {
            num = Integer.valueOf(0);
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: f */
    public static final void m83406f(Aweme aweme) {
        if (aweme != null) {
            CardStruct b = m83402b(aweme);
            if (b != null && b.getCardType() == 1001) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    Map cardInfos = awemeRawAd.getCardInfos();
                    if (cardInfos != null) {
                        cardInfos.remove("4");
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static final boolean m83407g(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        CardStruct b = m83402b(aweme);
        if (b == null) {
            return false;
        }
        if (b.getCardType() == 9 || b.getCardType() == 1001) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m83404d(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean z3;
        C7573i.m23587b(aweme, "aweme");
        CardStruct w = C25329c.m83240w(aweme);
        if (w == null) {
            return false;
        }
        if (w.getCardStyle() == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean contains = f66768b.contains(Integer.valueOf(w.getCardType()));
        if (w.getCardStyle() == 2 && w.getDynamicType() == C25366a.m83409a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C6399b.m19944t() || w.getCardType() != 4 || w.getCardStyle() == 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((!z || !contains) && !z2 && !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m83396a(CardStruct cardStruct, View view) {
        Integer num;
        C7573i.m23587b(view, "container");
        if (cardStruct != null) {
            num = Integer.valueOf(cardStruct.getCardType());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            return C23486n.m77122a(278.0d);
        }
        if (num != null && num.intValue() == 9) {
            return C23486n.m77122a(342.0d);
        }
        if (num != null && num.intValue() == 8) {
            return C23486n.m77122a(295.0d);
        }
        return view.getHeight();
    }

    /* renamed from: a */
    public static final boolean m83401a(Aweme aweme, CardStruct cardStruct) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        cardStruct.setCardType(1001);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            Map cardInfos = awemeRawAd.getCardInfos();
            if (cardInfos != null) {
                cardInfos.put("4", cardStruct);
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final AbsHalfWebPageAction m83398a(Context context, Aweme aweme, C25568n nVar) {
        Integer num;
        C7573i.m23587b(nVar, "adHalfWebPage");
        CardStruct a = m83399a(aweme);
        if (a != null) {
            num = Integer.valueOf(a.getCardType());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 2) {
            return new DownloadAdCardAction(context, aweme, nVar);
        }
        if (num != null && num.intValue() == 3) {
            return new ShopAdCardAction(context, aweme, nVar);
        }
        if (num != null && num.intValue() == 1) {
            return new FormAdCardAction(context, aweme, nVar);
        }
        if (num != null && num.intValue() == 4) {
            return new ImageAdCardAction(context, aweme, nVar);
        }
        if (num != null && num.intValue() == 5) {
            return new InteractAdCardAction(context, aweme, nVar);
        }
        if (num != null && num.intValue() == 6) {
            return new PollAdCardAction(context, aweme, nVar);
        }
        if (num != null && num.intValue() == 7) {
            return new SurveyAdCardAction(context, aweme, nVar);
        }
        if ((num != null && num.intValue() == 8) || (num != null && num.intValue() == 9)) {
            return new CouponAdCardAction(context, aweme, nVar);
        }
        if (num != null && num.intValue() == 10) {
            return new PoiAdCardAction(context, aweme, nVar);
        }
        if (num != null && num.intValue() == 11) {
            return new SelectAdCardAction(context, aweme, nVar);
        }
        if (num != null && num.intValue() == 12) {
            return new GeneralAdCardAction(context, aweme, nVar);
        }
        return new LandingPageAdCardAction(context, aweme, nVar);
    }

    /* renamed from: a */
    public static final void m83400a(Context context, Aweme aweme, ViewGroup viewGroup, View view) {
        int i;
        if (context != null && aweme != null && viewGroup != null) {
            if (!C21085a.m71117a().f56622i || (C25352e.m83231n(aweme) && !C25352e.m83337ai(aweme))) {
                i = 0;
            } else {
                C21085a a = C21085a.m71117a();
                C7573i.m23582a((Object) a, "AdaptationManager.getInstance()");
                i = -a.mo56926b();
            }
            int a2 = i + C23487o.m77129a(context, (int) R.dimen.bk);
            C7573i.m23582a((Object) C21085a.m71117a(), "AdaptationManager.getInstance()");
            if (C21085a.m71129c()) {
                a2 += C21085a.f56610a;
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (C25352e.m83329aa(aweme) && view != null) {
                    int a3 = a2 + C23487o.m77129a(context, (int) R.dimen.bi);
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                        marginLayoutParams.bottomMargin = a3 + ((MarginLayoutParams) layoutParams2).bottomMargin;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else if (C25352e.m83330ab(aweme)) {
                    marginLayoutParams.bottomMargin = a2 + C23487o.m77129a(context, (int) R.dimen.bi);
                } else {
                    marginLayoutParams.bottomMargin = a2;
                }
                if (aweme.isHotSearchAweme() || aweme.isHotVideoAweme() || aweme.isMixAweme()) {
                    marginLayoutParams.bottomMargin += C29961b.m98232a(context, 32.0f);
                }
                viewGroup.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}

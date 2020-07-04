package com.p280ss.android.ugc.aweme.commercialize.splash;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.adapter.C28198z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment;
import com.p280ss.android.ugc.aweme.feed.panel.C28633q;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29976e;
import com.p280ss.android.ugc.aweme.setting.C7213d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.e */
public final class C25060e {

    /* renamed from: a */
    private static boolean f66164a;

    /* renamed from: a */
    public static boolean m82536a() {
        return f66164a;
    }

    /* renamed from: b */
    public static boolean m82539b() {
        if (!TextUtils.isEmpty(C25054b.m82490a().f66139f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static void m82535a(boolean z) {
        if (!f66164a) {
            f66164a = z;
        }
    }

    /* renamed from: b */
    private static void m82538b(View view) {
        view.postDelayed(new C25061f(view), 260);
    }

    /* renamed from: a */
    static final /* synthetic */ void m82534a(View view) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(430).start();
    }

    /* renamed from: a */
    public static boolean m82537a(FeedRecommendFragment feedRecommendFragment) {
        int i;
        if (feedRecommendFragment == null) {
            return false;
        }
        String str = C25054b.m82490a().f66139f;
        C25054b.m82490a().mo65554b();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C25054b.m82490a();
        Aweme c = C25054b.m82496c(str);
        if (c == null || !c.isAd()) {
            return false;
        }
        C28633q qVar = feedRecommendFragment.f75690k;
        if (qVar == null || qVar.mo71886W() == null) {
            return false;
        }
        int ak = qVar.mo71905ak();
        C28198z W = qVar.mo71886W();
        int b = C28482e.m93608b(W.mo71593b(), c);
        if (b >= 0) {
            Aweme b2 = W.mo67568b(b);
            Context a = C6399b.m19921a();
            if (b2.isAd()) {
                i = 1;
            } else {
                i = 2;
            }
            C24976t.m82045a(a, c, i);
        }
        int i2 = -1;
        for (int i3 = 0; i3 < W.getCount(); i3++) {
            Aweme b3 = W.mo67568b(i3);
            if ((b3 == c || TextUtils.equals(b3.getAid(), c.getAid())) && c.getAwemeRawAd().isEnableFilterSameVideo()) {
                C24976t.m82156b((Context) AwemeApplication.m21341a(), c, C25054b.m82490a().mo65549a("8", (String) null));
                return false;
            }
            if (i3 >= ak && i2 == -1 && !b3.isAd()) {
                i2 = i3;
            }
        }
        int bi = C7213d.m22500a().mo18797bi();
        if (bi > 0) {
            try {
                Thread.sleep((long) bi);
            } catch (InterruptedException unused) {
            }
        }
        Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(c);
        AwemeSplashInfo m = C25352e.m83230m(updateAweme);
        if (m != null) {
            m.setShown(false);
            m.contextTrackSent = false;
        }
        C29976e.m98287b(true);
        qVar.mo73328a(updateAweme, ak);
        qVar.mo73324a(ak, false);
        C29976e.m98287b(false);
        if (!C25083o.m82614e() && C7213d.m22500a().mo18748aK()) {
            for (int count = W.getCount() - 1; count > ak; count--) {
                if (count != i2 + 1 && (qVar instanceof C28633q)) {
                    qVar.mo73323a(count, W.mo67568b(count));
                }
            }
            feedRecommendFragment.mo67659a();
        } else if (!C25083o.m82614e()) {
            C25054b.m82490a().mo65557c();
        }
        return true;
    }

    /* renamed from: a */
    public static void m82533a(int i, View... viewArr) {
        if (viewArr != null && viewArr.length != 0) {
            int i2 = 0;
            switch (i) {
                case 1:
                case 2:
                    int length = viewArr.length;
                    while (i2 < length) {
                        View view = viewArr[i2];
                        if (!(view == null || view.getVisibility() == 8)) {
                            view.setVisibility(4);
                        }
                        i2++;
                    }
                    return;
                case 3:
                    int length2 = viewArr.length;
                    while (i2 < length2) {
                        View view2 = viewArr[i2];
                        if (!(view2 == null || view2.getVisibility() == 8)) {
                            m82538b(view2);
                        }
                        i2++;
                    }
                    return;
                case 4:
                    for (View view3 : viewArr) {
                        if (!(view3 == null || view3.getVisibility() == 8)) {
                            view3.setVisibility(0);
                            view3.setAlpha(1.0f);
                        }
                    }
                    break;
            }
        }
    }
}

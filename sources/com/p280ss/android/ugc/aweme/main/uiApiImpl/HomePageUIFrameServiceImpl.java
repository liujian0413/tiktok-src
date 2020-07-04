package com.p280ss.android.ugc.aweme.main.uiApiImpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter.C23435a;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.discover.DiscoverPageFragment;
import com.p280ss.android.ugc.aweme.feed.C28675r;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedTimeLineFragment;
import com.p280ss.android.ugc.aweme.follow.p1263ui.TeenagerFollowFragment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainFragment;
import com.p280ss.android.ugc.aweme.main.MainPageFragment;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.p280ss.android.ugc.aweme.main.experiment.ForYouTranslationsExperiment;
import com.p280ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl;
import com.p280ss.android.ugc.aweme.message.MessagesFragment;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FriendTabFragment;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.p1685ug.praise.C42731b;
import com.p280ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.p280ss.android.ugc.aweme.profile.SlideSettingPageFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.unlogin.UnloginSignUpFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.Triple;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl */
public final class HomePageUIFrameServiceImpl extends HomePageUIFrameServiceCommonImpl {
    public final Class<? extends Activity> getHomePageInflateActivityClass() {
        return MainActivity.class;
    }

    public final String getSecondTabDesc(Context context) {
        C7573i.m23587b(context, "context");
        return "";
    }

    public final C23435a getBuilderForFragmentInHomePageActivity() {
        int i;
        C23435a aVar = new C23435a();
        if (C33003b.m106651a()) {
            aVar.mo61038a(DiscoverPageFragment.class, "page_discover");
        }
        if (C33003b.m106651a()) {
            i = 2;
        } else {
            i = 1;
        }
        aVar.mo61038a(MainPageFragment.class, "page_feed").mo61039a(ProfilePageFragment.m115142d(), "page_profile", i, 1.0f);
        if (ProfileNewStyleExperiment.INSTANCE.getCOMMON_T()) {
            aVar.mo61039a(SlideSettingPageFragment.class, "page_setting", i, 0.666f);
        }
        return aVar;
    }

    private final void addFollowFeedTab(TabChangeManager tabChangeManager) {
        if (!C33003b.m106651a() || !TimeLockRuler.isInTeenagerModeNewVersion()) {
            tabChangeManager.mo84573a(FriendTabFragment.class, "DISCOVER", (Bundle) null);
        } else {
            tabChangeManager.mo84573a(TeenagerFollowFragment.class, "DISCOVER", (Bundle) null);
        }
    }

    public final void afterTabChangedInMainPageFragment(String str) {
        Activity g = C6405d.m19984g();
        if (!TextUtils.equals("HOME", str) && g != null) {
            C42731b.m135641a((Context) g);
        }
    }

    private final void addProfileTab(TabChangeManager tabChangeManager) {
        Bundle bundle = new Bundle();
        bundle.putString("from", "from_main");
        Object service = ServiceManager.get().getService(IBridgeService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ridgeService::class.java)");
        tabChangeManager.mo84573a(((IBridgeService) service).getMyProfileFragmentClass(), "USER", bundle);
    }

    private final Bundle getMainFragmentBundle(Intent intent) {
        int i = -1;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("tab");
            if (C6319n.m19593a(stringExtra)) {
                i = intent.getIntExtra("tab", -1);
            } else {
                try {
                    i = Integer.parseInt(stringExtra);
                } catch (Throwable unused) {
                }
            }
        }
        if (i < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("tab", i);
        return bundle;
    }

    public final int getItemPosition(Object obj) {
        boolean z;
        C7573i.m23587b(obj, "object");
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl showTimeLineTab = inst.getShowTimeLineTab();
        C7573i.m23582a((Object) showTimeLineTab, "SharePrefCache.inst().showTimeLineTab");
        Object d = showTimeLineTab.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().showTimeLineTab.cache");
        if (!((Boolean) d).booleanValue() || C33003b.m106651a()) {
            z = false;
        } else {
            z = true;
        }
        if (z || !(obj instanceof FeedTimeLineFragment)) {
            return 0;
        }
        return -2;
    }

    public final Triple<String[], int[], String[]> getContentForMainFragment(Context context) {
        String[] strArr;
        int[] iArr;
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl isShowNearBy = inst.getIsShowNearBy();
        C7573i.m23582a((Object) isShowNearBy, "SharePrefCache.inst().isShowNearBy");
        Boolean bool = (Boolean) isShowNearBy.mo59877d();
        C7573i.m23582a((Object) bool, "isShowNearby");
        if (bool.booleanValue()) {
            iArr = new int[]{1, 0, 7};
            strArr = new String[]{"homepage_follow", "homepage_hot", "nearby"};
        } else {
            iArr = new int[]{1, 0, 2};
            strArr = new String[]{"homepage_follow", "homepage_hot", "homepage_fresh"};
        }
        return new Triple<>(getTitles(context, bool.booleanValue()), iArr, strArr);
    }

    public final int getCount(int i) {
        boolean z;
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl showTimeLineTab = inst.getShowTimeLineTab();
        C7573i.m23582a((Object) showTimeLineTab, "SharePrefCache.inst().showTimeLineTab");
        Object d = showTimeLineTab.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().showTimeLineTab.cache");
        if (!((Boolean) d).booleanValue() || C33003b.m106651a()) {
            z = false;
        } else {
            z = true;
        }
        SharePrefCache inst2 = SharePrefCache.inst();
        C7573i.m23582a((Object) inst2, "SharePrefCache.inst()");
        C22903bl isShowNearBy = inst2.getIsShowNearBy();
        C7573i.m23582a((Object) isShowNearBy, "SharePrefCache.inst().isShowNearBy");
        Boolean bool = (Boolean) isShowNearBy.mo59877d();
        C7573i.m23582a((Object) bool, "isShowNearby");
        if (bool.booleanValue() || z) {
            return i;
        }
        return i - 1;
    }

    private final String[] getTitles(Context context, boolean z) {
        String[] strArr;
        String[] stringArray;
        Resources resources = null;
        if (z) {
            if (context != null) {
                resources = context.getResources();
            }
            if (resources == null) {
                C7573i.m23580a();
            }
            strArr = resources.getStringArray(R.array.ad);
        } else {
            if (context != null) {
                resources = context.getResources();
            }
            if (resources == null) {
                C7573i.m23580a();
            }
            strArr = resources.getStringArray(R.array.ab);
        }
        if (C6384b.m19835a().mo15292a(ForYouTranslationsExperiment.class, true, "for_you_new_translations", C6384b.m19835a().mo15295d().for_you_new_translations, false)) {
            if (z) {
                Resources resources2 = context.getResources();
                if (resources2 == null) {
                    C7573i.m23580a();
                }
                stringArray = resources2.getStringArray(R.array.ae);
            } else {
                Resources resources3 = context.getResources();
                if (resources3 == null) {
                    C7573i.m23580a();
                }
                stringArray = resources3.getStringArray(R.array.ac);
            }
            strArr = stringArray;
        }
        C7573i.m23582a((Object) strArr, "tabs");
        return strArr;
    }

    public final void addTabToMainPageFragment(TabChangeManager tabChangeManager, Intent intent) {
        C7573i.m23587b(tabChangeManager, "mTabChangeManager");
        C7573i.m23587b(intent, "intent");
        tabChangeManager.mo84573a(MainFragment.class, "HOME", getMainFragmentBundle(intent));
        addFollowFeedTab(tabChangeManager);
        Class<MessagesFragment> b = C34315c.m110981b();
        if (b == null) {
            b = MessagesFragment.class;
        }
        tabChangeManager.mo84573a((Class) b, "NOTIFICATION", (Bundle) null);
        Bundle bundle = new Bundle();
        bundle.putString("tab", "UNLOGIN_NOTIFICATION");
        tabChangeManager.mo84573a(UnloginSignUpFragment.class, "UNLOGIN_NOTIFICATION", bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("tab", "UNLOGIN_PROFILE");
        tabChangeManager.mo84573a(UnloginSignUpFragment.class, "UNLOGIN_PROFILE", bundle2);
        addProfileTab(tabChangeManager);
    }

    public final Fragment getItemForPagerInMainFragment(AbsFragment absFragment, int i, String str) {
        C7573i.m23587b(absFragment, "mainFragment");
        C7573i.m23587b(str, "eventType");
        AwemeAppData a = AwemeAppData.m65765a();
        C7573i.m23582a((Object) a, "AwemeAppData.inst()");
        a.f60328h = str;
        Fragment a2 = C28675r.m94344a(i, str);
        if (a2 instanceof FeedFragment) {
            ((FeedFragment) a2).f75687p = absFragment;
        }
        C7573i.m23582a((Object) a2, "fragment");
        return a2;
    }
}

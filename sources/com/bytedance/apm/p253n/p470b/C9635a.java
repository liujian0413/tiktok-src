package com.bytedance.apm.p253n.p470b;

import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.bytedance.apm.n.b.a */
public final class C9635a {

    /* renamed from: a */
    private static HashMap<String, Integer> f26353a = new HashMap<>();

    /* renamed from: a */
    private static void m28502a() {
        m28503a("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", R.id.a4g);
        m28503a("com.ss.android.ugc.aweme.splash.SplashActivity", R.id.a1c);
        m28503a("com.ss.android.ugc.aweme.discover.ui.DiscoverFragment", R.id.fo);
        m28503a("com.ss.android.ugc.aweme.profile.ui.UserProfileFragment", R.id.dzn);
        m28503a("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", R.id.b64);
        m28503a("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", R.id.a4g);
        m28503a("com.ss.android.ugc.aweme.main.MainActivity", R.id.a4g);
        m28503a("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity", R.id.m6);
    }

    static {
        m28502a();
    }

    /* renamed from: a */
    public static Integer m28501a(String str) {
        return (Integer) f26353a.get(str);
    }

    /* renamed from: a */
    private static void m28503a(String str, int i) {
        f26353a.put(str, Integer.valueOf(i));
    }
}

package com.p280ss.android.ugc.aweme.video.p1700d;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.framework.p1275d.C29958a;

/* renamed from: com.ss.android.ugc.aweme.video.d.a */
public final class C43206a {
    /* renamed from: b */
    public static boolean m136998b() {
        return ((Boolean) SharePrefCache.inst().getVideoPreload().mo59877d()).booleanValue();
    }

    /* renamed from: a */
    public static boolean m136997a() {
        if (!((Boolean) SharePrefCache.inst().getVideoPreload().mo59877d()).booleanValue() || (!C29958a.m98225a(C6399b.m19921a()) && ((Integer) SharePrefCache.inst().getWeakNetPreLoadSwitch().mo59877d()).intValue() != 1)) {
            return false;
        }
        return true;
    }
}

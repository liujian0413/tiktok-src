package com.p280ss.android.ugc.aweme.setting.p1521i;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.i.a */
public final class C37651a {

    /* renamed from: a */
    public static final C37651a f98122a = new C37651a();

    private C37651a() {
    }

    /* renamed from: b */
    public static String m120474b() {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl referralEntrance = inst.getReferralEntrance();
        C7573i.m23582a((Object) referralEntrance, "SharePrefCache.inst().referralEntrance");
        Object d = referralEntrance.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().referralEntrance.cache");
        return (String) d;
    }

    /* renamed from: c */
    public static boolean m120475c() {
        if (!((C37652b) C23336d.m76560a(C6399b.m19921a(), C37652b.class)).mo60391a(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m120476d() {
        ((C37652b) C23336d.m76560a(C6399b.m19921a(), C37652b.class)).mo60392b(true);
    }

    /* renamed from: a */
    public static boolean m120473a() {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl referralEntrance = inst.getReferralEntrance();
        C7573i.m23582a((Object) referralEntrance, "SharePrefCache.inst().referralEntrance");
        if (!TextUtils.isEmpty((CharSequence) referralEntrance.mo59877d())) {
            return true;
        }
        return false;
    }
}

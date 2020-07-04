package com.p280ss.android.ugc.aweme.discover.helper;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.d */
public final class C26656d {

    /* renamed from: a */
    private static Boolean f70282a;

    /* renamed from: a */
    public static boolean m87587a() {
        if (f70282a == null) {
            f70282a = (Boolean) SharePrefCache.inst().getIsHotSearchBillboardEnable().mo59877d();
        }
        return f70282a.booleanValue();
    }

    /* renamed from: b */
    public static boolean m87588b() {
        if (C6384b.m19835a().mo15292a(ShowIndependenceRankingListExperiment.class, true, "category_show_branch_billboard_entrance", C6384b.m19835a().mo15295d().category_show_branch_billboard_entrance, false)) {
            return true;
        }
        return false;
    }
}

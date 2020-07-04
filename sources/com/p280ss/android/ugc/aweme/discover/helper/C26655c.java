package com.p280ss.android.ugc.aweme.discover.helper;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.discover.abtest.DetailSearchEntranceExperiment;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchInDetailModeExperiment;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.c */
public final class C26655c {
    /* renamed from: a */
    public static boolean m87586a() {
        if (C6384b.m19835a().mo15287a(SearchInDetailModeExperiment.class, true, "search_in_detail_mode", C6384b.m19835a().mo15295d().search_in_detail_mode, 0) == 2 || C6384b.m19835a().mo15287a(DetailSearchEntranceExperiment.class, true, "show_detail_search_entrance", C6384b.m19835a().mo15295d().show_detail_search_entrance, 0) == 1) {
            return true;
        }
        return false;
    }
}

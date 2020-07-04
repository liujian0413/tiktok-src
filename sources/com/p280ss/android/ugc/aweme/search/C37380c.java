package com.p280ss.android.ugc.aweme.search;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.discover.abtest.EnableHistorySugNewStyleExperiment;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchIntermediateExperiment;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchMiddleComponentExperiment;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchUserStyleExperiment;

/* renamed from: com.ss.android.ugc.aweme.search.c */
public final class C37380c {
    /* renamed from: c */
    public static int m119976c() {
        return C6384b.m19835a().mo15287a(SearchIntermediateExperiment.class, true, "search_intermediate_style", C6384b.m19835a().mo15295d().search_intermediate_style, 0);
    }

    /* renamed from: e */
    public static boolean m119978e() {
        if (m119976c() == 5 || m119977d() == 1 || m119977d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m119974a() {
        if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(EnableHistorySugNewStyleExperiment.class, true, "enable_history_sug_new_style", C6384b.m19835a().mo15295d().enable_history_sug_new_style, 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m119975b() {
        if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(EnableHistorySugNewStyleExperiment.class, true, "enable_history_sug_new_style", C6384b.m19835a().mo15295d().enable_history_sug_new_style, 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m119977d() {
        if (C6399b.m19944t()) {
            return 0;
        }
        return C6384b.m19835a().mo15287a(SearchMiddleComponentExperiment.class, true, "search_middle_component_style", C6384b.m19835a().mo15295d().search_middle_component_style, 3);
    }

    /* renamed from: f */
    public static int m119979f() {
        if (C6399b.m19945u()) {
            return 0;
        }
        return C6384b.m19835a().mo15287a(SearchUserStyleExperiment.class, true, "search_user_style", C6384b.m19835a().mo15295d().search_user_style, 2);
    }
}

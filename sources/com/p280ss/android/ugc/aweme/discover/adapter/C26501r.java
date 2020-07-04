package com.p280ss.android.ugc.aweme.discover.adapter;

import com.p280ss.android.ugc.aweme.discover.mob.C26799t.C26800a;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext.CurrentItemMethod;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.r */
public final class C26501r {

    /* renamed from: a */
    public boolean f69897a;

    /* renamed from: b */
    public SearchResultParam f69898b;

    /* renamed from: c */
    public SearchApiResult f69899c;

    /* renamed from: d */
    public String f69900d;

    /* renamed from: e */
    public int f69901e;

    /* renamed from: f */
    public String f69902f;

    /* renamed from: g */
    public CurrentItemMethod f69903g;

    /* renamed from: a */
    public final int mo68126a() {
        return C26800a.m87997a(this.f69900d);
    }

    /* renamed from: b */
    public final String mo68129b() {
        SearchResultParam searchResultParam = this.f69898b;
        if (searchResultParam != null) {
            String keyword = searchResultParam.getKeyword();
            if (keyword != null) {
                return keyword;
            }
        }
        return "";
    }

    /* renamed from: c */
    public final String mo68130c() {
        SearchResultParam searchResultParam = this.f69898b;
        if (searchResultParam != null) {
            String enterFrom = searchResultParam.getEnterFrom();
            if (enterFrom != null) {
                return enterFrom;
            }
        }
        return "";
    }

    /* renamed from: e */
    public final int mo68132e() {
        SearchResultParam searchResultParam = this.f69898b;
        if (searchResultParam != null) {
            return searchResultParam.getRankInList();
        }
        return 0;
    }

    /* renamed from: d */
    public final String mo68131d() {
        SearchApiResult searchApiResult = this.f69899c;
        if (searchApiResult != null) {
            LogPbBean logPbBean = searchApiResult.logPb;
            if (logPbBean != null) {
                String imprId = logPbBean.getImprId();
                if (imprId != null) {
                    return imprId;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo68127a(CurrentItemMethod currentItemMethod) {
        C7573i.m23587b(currentItemMethod, "value");
        this.f69903g = currentItemMethod;
    }

    public C26501r(boolean z) {
        this.f69900d = "";
        this.f69901e = -1;
        this.f69903g = CurrentItemMethod.FROM_SEARCH_RESULT;
        this.f69897a = z;
    }

    /* renamed from: a */
    public final void mo68128a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f69900d = str;
    }

    public C26501r(boolean z, SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "searchResultParam");
        this.f69900d = "";
        this.f69901e = -1;
        this.f69903g = CurrentItemMethod.FROM_SEARCH_RESULT;
        this.f69897a = true;
        this.f69898b = searchResultParam;
    }
}

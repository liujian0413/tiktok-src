package com.p280ss.android.ugc.aweme.discover.presenter;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdInfo;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.discover.base.C26602g;
import com.p280ss.android.ugc.aweme.discover.base.C26602g.C26603a;
import com.p280ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p280ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p280ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.search.filter.FilterOption;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.h */
public abstract class C26826h<T, RESPONSE extends SearchApiResult> extends C26098c<T, RESPONSE> implements C26602g {

    /* renamed from: b */
    private final LinkedHashSet<T> f70786b = new LinkedHashSet<>();

    /* renamed from: c */
    private String f70787c = "";

    /* renamed from: d */
    public FilterOption f70788d;

    /* renamed from: e */
    public int f70789e;

    /* renamed from: f */
    public String f70790f;

    /* renamed from: g */
    public String f70791g;

    /* renamed from: c */
    public final String mo69489c() {
        return this.f70787c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo69487b() {
        this.f70786b.clear();
    }

    public List<T> getItems() {
        return new ArrayList<>(this.f70786b);
    }

    /* renamed from: d */
    public final QueryCorrectInfo mo69491d() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C7573i.m23582a(obj, "mData");
        return ((SearchApiResult) obj).queryCorrectInfo;
    }

    /* renamed from: e */
    public final SearchPreventSuicide mo69492e() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C7573i.m23582a(obj, "mData");
        return ((SearchApiResult) obj).suicidePrevent;
    }

    /* renamed from: f */
    public final SearchAdInfo mo69493f() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C7573i.m23582a(obj, "mData");
        return ((SearchApiResult) obj).adInfo;
    }

    /* renamed from: g */
    public final List<GuideSearchWord> mo69494g() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C7573i.m23582a(obj, "mData");
        List<GuideSearchWord> list = ((SearchApiResult) obj).guideSearchWordList;
        if (list != null && list.size() < 3) {
            list = null;
        }
        return list;
    }

    /* renamed from: a */
    public void mo69486a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f70787c = str;
    }

    /* renamed from: b */
    private SearchApiResult m88110b(SearchApiResult searchApiResult) {
        C7573i.m23587b(searchApiResult, "data");
        return C26603a.m87384a(this, searchApiResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo69490c(List<? extends T> list) {
        if (list != null) {
            this.f70786b.addAll(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo69488b(List<? extends T> list) {
        this.f70786b.clear();
        if (list != null) {
            this.f70786b.addAll(list);
        }
    }

    public boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "param");
        if (objArr.length >= 2) {
            String str = objArr[1];
            if (!(str instanceof String)) {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void handleData(RESPONSE response) {
        String str;
        if (response != null && this.mListQueryType == 1) {
            m88110b((SearchApiResult) response);
            this.f70790f = response.getRequestId();
            if (response.logPb == null) {
                str = "";
            } else {
                LogPbBean logPbBean = response.logPb;
                C7573i.m23582a((Object) logPbBean, "data.logPb");
                str = logPbBean.getImprId();
            }
            this.f70791g = str;
        }
    }
}

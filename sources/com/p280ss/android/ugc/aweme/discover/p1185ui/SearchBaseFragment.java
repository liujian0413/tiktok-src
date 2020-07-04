package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.mob.C26804x.C26805a;
import com.p280ss.android.ugc.aweme.lego.lazy.LazyFragmentPagerAdapter.C32338a;
import com.p280ss.android.ugc.aweme.search.filter.FilterOption;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment */
public abstract class SearchBaseFragment extends AmeBaseFragment implements C32338a {

    /* renamed from: q */
    public static final String f71082q = f71082q;

    /* renamed from: r */
    public static final String f71083r = f71083r;

    /* renamed from: s */
    public static final int f71084s = 1;

    /* renamed from: t */
    public static final int f71085t = f71085t;

    /* renamed from: u */
    public static final C26932a f71086u = new C26932a(null);

    /* renamed from: e */
    private HashMap f71087e;

    /* renamed from: g */
    public SearchResultParam f71088g;

    /* renamed from: h */
    public C26501r f71089h = new C26501r(true);

    /* renamed from: i */
    public String f71090i = "";

    /* renamed from: j */
    public String f71091j = "";

    /* renamed from: k */
    public int f71092k = C27029ba.f71321c;

    /* renamed from: l */
    public int f71093l;

    /* renamed from: m */
    public String f71094m = "";

    /* renamed from: n */
    public String f71095n = "";

    /* renamed from: o */
    public int f71096o;

    /* renamed from: p */
    public int f71097p = 1;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment$a */
    public static final class C26932a {
        private C26932a() {
        }

        /* renamed from: a */
        public static int m88487a() {
            return SearchBaseFragment.f71084s;
        }

        public /* synthetic */ C26932a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public View mo68429a(int i) {
        if (this.f71087e == null) {
            this.f71087e = new HashMap();
        }
        View view = (View) this.f71087e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71087e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: c */
    public void mo69655c(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "searchResultParam");
    }

    /* renamed from: g */
    public void mo68430g() {
        if (this.f71087e != null) {
            this.f71087e.clear();
        }
    }

    /* renamed from: k */
    public abstract String mo68437k();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo68430g();
    }

    /* renamed from: q */
    public final FilterOption mo69659q() {
        SearchResultParam searchResultParam = this.f71088g;
        if (searchResultParam != null) {
            return searchResultParam.getFilterOption();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo69654b(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f71090i = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo69657d(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f71094m = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo69658e(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f71095n = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo69653b(SearchResultParam searchResultParam) {
        this.f71088g = searchResultParam;
        this.f71089h.f69898b = this.f71088g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo69656c(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f71091j = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f71089h.mo68128a(mo68437k());
        C26805a.m88002a(view, this.f71089h);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C7573i.m23582a((Object) activity, "it");
            Window window = activity.getWindow();
            C7573i.m23582a((Object) window, "it.window");
            View decorView = window.getDecorView();
            C7573i.m23582a((Object) decorView, "it.window.decorView");
            C26805a.m88002a(decorView, this.f71089h);
        }
    }
}

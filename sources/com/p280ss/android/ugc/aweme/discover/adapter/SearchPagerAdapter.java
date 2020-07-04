package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.discover.abtest.AsyncInflateSearchExperiment;
import com.p280ss.android.ugc.aweme.discover.abtest.DynamicSearchTabTitle;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchCommodityAB;
import com.p280ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27019at;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27029ba;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchFragment;
import com.p280ss.android.ugc.aweme.p1052b.C23146a;
import com.p280ss.android.ugc.aweme.p1052b.C23148c;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.p1052b.C23150e;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchPagerAdapter */
public class SearchPagerAdapter<T extends Fragment> extends LazyFragmentPagerRebuildAdapter<T> {

    /* renamed from: a */
    public T f69770a;

    /* renamed from: d */
    private Context f69771d;

    /* renamed from: e */
    private SearchResultParam f69772e;

    /* renamed from: f */
    private SearchTabTitle f69773f;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo68066b() {
        C23148c inflater = ((C23149d) this.f69771d).getInflater();
        if (inflater instanceof C23150e) {
            ((C23150e) inflater).mo60292a().mo60294a((int) R.layout.layout_search_mix_for_user).mo60295a(R.layout.item_search_user, 3).mo60295a(R.layout.item_search_video, 4).mo60294a((int) R.layout.layout_search_mix).mo60295a(R.layout.item_search_music, 2).mo60295a(R.layout.item_search_challenge, 3).mo60296a();
        }
    }

    /* renamed from: a */
    public final SearchPagerAdapter mo68065a(SearchResultParam searchResultParam) {
        this.f69772e = searchResultParam;
        return this;
    }

    /* renamed from: d */
    private String m87051d(int i) {
        if (this.f69773f == null) {
            return null;
        }
        if (i == C27029ba.f71319a) {
            return this.f69773f.general;
        }
        if (i == C27029ba.f71321c) {
            return this.f69773f.user;
        }
        if (i == C27029ba.f71323e) {
            return this.f69773f.music;
        }
        if (i == C27029ba.f71324f) {
            return this.f69773f.challenge;
        }
        if (i == C27029ba.f71320b) {
            return this.f69773f.video;
        }
        if (i == C27029ba.f71322d) {
            return this.f69773f.poi;
        }
        if (i == C27029ba.f71325g) {
            return this.f69773f.commodity;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Fragment mo67984c(int i) {
        if (i == C27029ba.f71319a && (this.f69771d instanceof C23149d) && C6399b.m19944t() && C6384b.m19835a().mo15292a(AsyncInflateSearchExperiment.class, true, "is_async_search", C6384b.m19835a().mo15295d().is_async_search, true)) {
            C23146a.m76058a().post(new C26477ab(this));
        }
        SearchFragment a = C27019at.m88774a(this.f69772e, i);
        a.f71096o = i;
        return a;
    }

    public CharSequence getPageTitle(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String d = m87051d(i);
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        if (i == C27029ba.f71319a) {
            Context context = this.f69771d;
            if (!C6399b.m19944t()) {
                i5 = R.string.c_8;
            } else if (C6399b.m19946v()) {
                i5 = R.string.c_g;
            } else {
                i5 = R.string.c_i;
            }
            return context.getString(i5);
        } else if (i == C27029ba.f71321c) {
            Context context2 = this.f69771d;
            if (C6399b.m19947w()) {
                i4 = R.string.fmt;
            } else {
                i4 = R.string.flk;
            }
            return context2.getString(i4);
        } else if (i == C27029ba.f71323e) {
            Context context3 = this.f69771d;
            if (C6399b.m19947w()) {
                i3 = R.string.cht;
            } else {
                i3 = R.string.cgm;
            }
            return context3.getString(i3);
        } else if (i == C27029ba.f71324f) {
            Context context4 = this.f69771d;
            if (C6399b.m19947w()) {
                i2 = R.string.z3;
            } else {
                i2 = R.string.yl;
            }
            return context4.getString(i2);
        } else if (i == C27029ba.f71320b) {
            String string = this.f69771d.getString(R.string.djm);
            if (C6399b.m19946v()) {
                return string.toUpperCase();
            }
            return string;
        } else if (i == C27029ba.f71322d) {
            return this.f69771d.getString(R.string.dke);
        } else {
            if (i != C27029ba.f71325g) {
                return super.getPageTitle(i);
            }
            if (C6384b.m19835a().mo15287a(SearchCommodityAB.class, true, "merchandise_search_style", C6384b.m19835a().mo15295d().merchandise_search_style, 0) == 1) {
                return this.f69771d.getString(R.string.ax4);
            }
            return this.f69771d.getString(R.string.djo);
        }
    }

    public SearchPagerAdapter(C0608j jVar, Context context) {
        super(jVar, C27019at.m88771a());
        this.f69771d = context;
        try {
            this.f69773f = (SearchTabTitle) C10292j.m30480a().mo25014a(DynamicSearchTabTitle.class, "dynamic_search_result_tab_title", C6384b.m19835a().mo15294c().getDynamicSearchResultTabTitle(), "com.ss.android.ugc.aweme.discover.abtest.modules.SearchTabTitle", SearchTabTitle.class);
        } catch (Throwable unused) {
            this.f69773f = null;
        }
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f69770a = (Fragment) obj;
        super.setPrimaryItem(viewGroup, i, obj);
    }
}

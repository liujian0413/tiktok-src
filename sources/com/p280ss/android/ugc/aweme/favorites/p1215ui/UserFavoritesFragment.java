package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.C10830c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10820c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.favorites.adapter.UserFavoritesPagerAdapter;
import com.p280ss.android.ugc.aweme.favorites.api.notice.C27739a;
import com.p280ss.android.ugc.aweme.favorites.api.notice.C27739a.C27741a;
import com.p280ss.android.ugc.aweme.favorites.api.notice.CollectionNotice;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28504t;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.UserFavoritesFragment */
public class UserFavoritesFragment extends AmeBaseFragment implements C0935e {

    /* renamed from: e */
    boolean f73316e;

    /* renamed from: f */
    public String[] f73317f;

    /* renamed from: g */
    public boolean f73318g;

    /* renamed from: h */
    public int f73319h;

    /* renamed from: i */
    protected UserFavoritesPagerAdapter f73320i;

    /* renamed from: j */
    protected int f73321j;

    /* renamed from: k */
    public boolean f73322k = true;

    /* renamed from: l */
    private String f73323l = "personal_homepage";

    /* renamed from: m */
    private String f73324m;
    DmtTabLayout mTabLayout;
    protected TextTitleBar mTitleBar;
    protected ViewPager mViewPager;

    /* renamed from: n */
    private String f73325n;

    /* renamed from: o */
    private C27739a f73326o;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    /* renamed from: a */
    public final void mo71296a() {
        if (getActivity() != null && (getActivity() instanceof UserFavoritesActivity)) {
            getActivity().finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo71298d() {
        if (this.mTabLayout != null) {
            C10830c.m31774a(this.mTabLayout);
        }
        if (this.mViewPager != null) {
            this.mViewPager.setCurrentItem(this.f73321j);
        }
    }

    /* renamed from: f */
    private void m91204f() {
        this.mTabLayout.setCustomTabViewResId(R.layout.v9);
        this.mTabLayout.setupWithViewPager(this.mViewPager);
        this.mTabLayout.setOnTabClickListener(new C27815f(this));
        this.mTabLayout.mo26058a((C10820c) new C10820c() {
            /* renamed from: b */
            public final void mo26116b(C10825f fVar) {
                String str;
                int i = fVar.f29291e;
                if (UserFavoritesFragment.this.f73322k) {
                    str = "click";
                } else {
                    str = "slide";
                }
                if (UserFavoritesFragment.this.f73318g) {
                    if (i == UserFavoritesFragment.this.f73319h) {
                        C27752a.m90973a(str, UserFavoritesFragment.this.f73317f[i]);
                    }
                    UserFavoritesFragment.this.f73318g = false;
                } else {
                    C27752a.m90973a(str, UserFavoritesFragment.this.f73317f[i]);
                }
                UserFavoritesFragment.this.f73322k = false;
                fVar.f29294h.findViewById(R.id.bmi).setVisibility(8);
            }
        });
        this.mTabLayout.setTabMode(0);
        this.mTabLayout.setAutoFillWhenScrollable(true);
        this.mTabLayout.mo26056a(C23486n.m77122a(16.0d), 0, C23486n.m77122a(16.0d), 0);
    }

    public void onResume() {
        super.onResume();
        if (!this.f73316e && this.f73320i != null) {
            this.f73320i.mo71198c(this.f73321j);
        }
        this.f73316e = false;
        if (C28504t.m93691a()) {
            if (this.f73326o == null) {
                this.f73326o = new C27739a();
            }
            this.f73326o.mo71222a((C27741a) new C27741a() {
                /* renamed from: a */
                public final void mo71225a(CollectionNotice collectionNotice) {
                    if (collectionNotice != null && collectionNotice.getMixStatus() && UserFavoritesFragment.this.f73320i != null && UserFavoritesFragment.this.mViewPager != null && UserFavoritesFragment.this.mTabLayout != null) {
                        Integer a = UserFavoritesFragment.this.f73320i.mo71197a();
                        if (a != null && UserFavoritesFragment.this.mViewPager.getCurrentItem() != a.intValue()) {
                            C10825f b = UserFavoritesFragment.this.mTabLayout.mo26066b(a.intValue());
                            if (b != null) {
                                b.f29294h.findViewById(R.id.bmi).setVisibility(0);
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private void m91203e() {
        if (getActivity() == null || getActivity().getIntent() == null) {
            this.f73323l = "personal_homepage";
        } else if (getActivity().getIntent().hasExtra("enter_from")) {
            this.f73323l = getActivity().getIntent().getStringExtra("enter_from");
        } else {
            this.f73323l = "h5";
        }
        Intent intent = getActivity().getIntent();
        ArrayList arrayList = null;
        if (intent != null) {
            if (intent.hasExtra("tab_name")) {
                this.f73325n = intent.getStringExtra("tab_name");
            }
            if (intent.hasExtra("push_ids")) {
                String stringExtra = intent.getStringExtra("push_ids");
                if ("compilation".equals(this.f73325n)) {
                    arrayList = new ArrayList(Arrays.asList(stringExtra.split(",")));
                }
            }
        }
        this.f73320i = new UserFavoritesPagerAdapter(getChildFragmentManager(), getActivity(), this.f73323l, arrayList);
        this.mViewPager.setAdapter(this.f73320i);
        if (intent != null) {
            if (intent.hasExtra("tab_name")) {
                this.f73325n = intent.getStringExtra("tab_name");
                int i = 0;
                while (true) {
                    if (i >= this.f73317f.length) {
                        break;
                    } else if (TextUtils.equals(this.f73325n, this.f73317f[i])) {
                        this.f73319h = i;
                        break;
                    } else {
                        i++;
                    }
                }
                if (this.f73319h > 0 && this.f73319h < this.f73320i.getCount()) {
                    this.f73321j = this.f73319h;
                    this.f73318g = true;
                }
            } else if (intent.hasExtra("index")) {
                this.f73319h = Integer.valueOf(intent.getStringExtra("index")).intValue();
                if (C28504t.m93691a() && this.f73319h > 0) {
                    this.f73319h++;
                }
                if (this.f73319h > 0 && this.f73319h < this.f73320i.getCount()) {
                    this.f73321j = this.f73319h;
                    this.f73318g = true;
                }
            }
            if (intent.hasExtra("enter_method")) {
                this.f73324m = intent.getStringExtra("enter_method");
            } else {
                this.f73324m = "click_h5";
            }
            if (intent.hasExtra("tab_name")) {
                this.f73325n = intent.getStringExtra("tab_name");
            }
            C22984d a = C22984d.m75611a();
            if (!TextUtils.isEmpty(this.f73323l)) {
                a.mo59973a("enter_from", this.f73323l);
            }
            if (!TextUtils.isEmpty(this.f73324m)) {
                a.mo59973a("enter_method", this.f73324m);
            }
            if (intent.hasExtra("scene_id")) {
                a.mo59970a("scene_id", intent.getIntExtra("scene_id", 0));
            }
            if (!TextUtils.isEmpty(this.f73324m)) {
                a.mo59973a("enter_method", this.f73324m);
            }
            if (!TextUtils.isEmpty(this.f73325n)) {
                a.mo59973a("tab_name", this.f73325n);
            }
            C6907h.m21524a("enter_personal_favourite", (Map) a.f60753a);
        }
        m91204f();
        this.mViewPager.addOnPageChangeListener(this);
        this.mViewPager.setOffscreenPageLimit(5);
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                UserFavoritesFragment.this.mo71296a();
            }
        });
        C27752a.m90972a(this.f73323l);
        this.mTabLayout.post(new C27814e(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onPageSelected(int i) {
        if (this.f73320i != null && i >= 0 && i < this.f73320i.getCount()) {
            this.f73321j = i;
            this.f73320i.mo71199d(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71297a(C10825f fVar) {
        this.f73322k = true;
        fVar.mo26137a();
        fVar.f29294h.findViewById(R.id.bmi).setVisibility(8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = new ArrayList(8);
        if (C30538p.m99745a()) {
            this.f73317f = new String[]{"video", "challenge", "music", "prop"};
            return;
        }
        arrayList.add("video");
        if (C28504t.m93691a()) {
            arrayList.add("compilation");
        }
        arrayList.add("location");
        arrayList.add("micro_app");
        arrayList.add("goods");
        arrayList.addAll(Arrays.asList(new String[]{"challenge", "music", "prop", "entertainment"}));
        this.f73317f = new String[arrayList.size()];
        arrayList.toArray(this.f73317f);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m91203e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getArguments();
        return layoutInflater.inflate(R.layout.rp, viewGroup, false);
    }
}

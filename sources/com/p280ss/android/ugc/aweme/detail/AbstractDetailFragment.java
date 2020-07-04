package com.p280ss.android.ugc.aweme.detail;

import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C25763a;
import com.p280ss.android.ugc.aweme.detail.p1157a.C26044b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.AbstractDetailFragment */
public abstract class AbstractDetailFragment extends AmeBaseFragment implements C0935e, C25763a {

    /* renamed from: r */
    protected static final String f68818r;

    /* renamed from: A */
    public FragmentPagerAdapter f68819A;

    /* renamed from: B */
    protected int f68820B;

    /* renamed from: C */
    protected boolean f68821C = true;

    /* renamed from: D */
    protected List<C26060f> f68822D;

    /* renamed from: E */
    protected List<AmeBaseFragment> f68823E;

    /* renamed from: F */
    protected String f68824F;

    /* renamed from: G */
    protected C26065h f68825G;

    /* renamed from: H */
    protected long f68826H = -1;

    /* renamed from: e */
    private int f68827e;

    /* renamed from: s */
    protected DetailViewModel f68828s;

    /* renamed from: t */
    public ScrollableLayout f68829t;

    /* renamed from: u */
    protected TextView f68830u;

    /* renamed from: v */
    protected View f68831v;

    /* renamed from: w */
    protected ViewPager f68832w;

    /* renamed from: x */
    protected DmtTabLayout f68833x;

    /* renamed from: y */
    ImageView f68834y;

    /* renamed from: z */
    protected ImageView f68835z;

    /* renamed from: Y_ */
    public boolean mo16933Y_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo61693a(int i);

    /* renamed from: a */
    public void mo61695a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo67555a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61696a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67556a(View view) {
    }

    /* renamed from: c */
    public void mo67558c(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo61706m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract String mo61707n();

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract FragmentPagerAdapter mo61713q();

    /* renamed from: r */
    public final boolean mo62081r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo67559t() {
        return true;
    }

    /* renamed from: d */
    private void mo29173d() {
        if (this.f68825G != null) {
            this.f68825G.mo67570a();
        }
    }

    public void onPause() {
        super.onPause();
        if (mo67559t()) {
            mo67560u();
        }
        mo29173d();
    }

    public void onResume() {
        super.onResume();
        this.f68826H = System.currentTimeMillis();
        mo29060a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final /* synthetic */ void mo67562w() {
        if (isViewValid()) {
            this.f68825G.mo67573b();
        }
    }

    static {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.edp);
        sb.append(":");
        f68818r = sb.toString();
    }

    /* renamed from: a */
    private void mo29060a() {
        if (this.f68825G != null) {
            new Handler().postDelayed(new C26042a(this), 500);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo61712p() {
        if (this.f68829t != null) {
            this.f68829t.setOnScrollListener(this);
        }
        this.f68819A = mo61713q();
        this.f68832w.setAdapter(this.f68819A);
        mo29191e();
        this.f68832w.addOnPageChangeListener(this);
        this.f68832w.setCurrentItem(this.f68820B);
        onPageSelected(this.f68820B);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo67560u() {
        if (this.f68826H != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f68826H;
            String a = mo61693a(this.f68820B);
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            C6907h.m21520a(getContext(), "stay_time", a, sb.toString(), mo61707n());
            this.f68826H = -1;
        }
    }

    /* renamed from: e */
    private void mo29191e() {
        if (this.f68833x != null) {
            this.f68833x.setVisibility(0);
            this.f68833x.setCustomTabViewResId(R.layout.ue);
            this.f68833x.setBackgroundColor(getResources().getColor(R.color.a7g));
            this.f68833x.mo26056a(C23486n.m77122a(16.0d), 0, C23486n.m77122a(16.0d), 0);
            if (C6399b.m19946v()) {
                LinearLayout linearLayout = (LinearLayout) this.f68833x.getChildAt(0);
                linearLayout.setShowDividers(2);
                linearLayout.setDividerDrawable(C0683b.m2903a(getContext(), (int) R.drawable.wk));
                linearLayout.setDividerPadding(C23486n.m77122a(16.0d));
            }
            this.f68833x.setupWithViewPager(this.f68832w);
            this.f68833x.setOnTabClickListener(new C26049b(this));
            this.f68833x.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo67561v() {
        if (isViewValid()) {
            RecyclerView recyclerView = null;
            if (!(this.f68822D == null || this.f68822D.get(this.f68820B) == null)) {
                recyclerView = (RecyclerView) ((C26060f) this.f68822D.get(this.f68820B)).mo61750j();
            }
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                if (childCount == 0) {
                    this.f68829t.mo66866a();
                    ((C26060f) this.f68822D.get((this.f68820B + 1) % this.f68822D.size())).mo61751k();
                    this.f68829t.setMaxScrollHeight(0);
                    return;
                }
                View g = recyclerView.getLayoutManager().mo5788g(childCount - 1);
                int childCount2 = this.f68829t.getChildCount();
                if (childCount2 >= 2 && g != null) {
                    int bottom = (g.getBottom() + this.f68829t.getChildAt(childCount2 - 1).getTop()) - this.f68829t.getCurScrollY();
                    this.f68829t.setMaxScrollHeight(((bottom + this.f68829t.getCurScrollY()) + C9738o.m28717e(getContext())) - C9738o.m28709b(getContext()));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C26065h mo67554a(ViewGroup viewGroup) {
        return new C26044b(getContext(), viewGroup);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("cur_pos", this.f68820B);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: b */
    private void mo86485b(View view) {
        this.f68829t = (ScrollableLayout) view.findViewById(R.id.czg);
        this.f68830u = (TextView) view.findViewById(R.id.title);
        this.f68831v = view.findViewById(R.id.dk8);
        this.f68832w = (ViewPager) view.findViewById(R.id.edp);
        this.f68833x = (DmtTabLayout) view.findViewById(R.id.dfo);
        this.f68834y = (ImageView) view.findViewById(R.id.d4t);
        this.f68835z = (ImageView) view.findViewById(R.id.jo);
    }

    public void onPageSelected(int i) {
        boolean z;
        if (i < 0 || !(this.f68832w == null || this.f68832w.getAdapter() == null || i < this.f68832w.getAdapter().getCount())) {
            i = 0;
        }
        if (!(this.f68826H == -1 || this.f68820B == i)) {
            long currentTimeMillis = System.currentTimeMillis() - this.f68826H;
            String a = mo61693a(this.f68820B);
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            C6907h.m21520a(getContext(), "stay_time", a, sb.toString(), mo61707n());
            this.f68826H = System.currentTimeMillis();
        }
        if (i != this.f68827e) {
            z = true;
        } else {
            z = false;
        }
        mo67555a(i, z);
        this.f68827e = i;
        this.f68820B = i;
        if (this.f68832w.getCurrentItem() != this.f68820B) {
            this.f68832w.setCurrentItem(this.f68820B);
        }
        if (!(this.f68829t == null || this.f68829t.getHelper() == null || this.f68822D == null)) {
            this.f68829t.getHelper().f68075b = (C25766a) this.f68822D.get(this.f68820B);
        }
        if (this.f68825G != null) {
            this.f68825G.mo67571a(i);
        }
        if (!(this.f68819A == null || this.f68832w == null)) {
            int count = this.f68819A.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                Fragment a2 = this.f68819A.mo2423a(i2);
                if (!(a2 == null || a2.mFragmentManager == null)) {
                    if (i2 == i) {
                        a2.setUserVisibleHint(true);
                        mo61695a(i, a2.hashCode());
                    } else {
                        a2.setUserVisibleHint(false);
                    }
                    ((C26060f) a2).mo61749g();
                }
            }
        }
        mo67561v();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67557a(C10825f fVar) {
        mo67558c(fVar.f29291e);
        fVar.mo26137a();
    }

    /* renamed from: b */
    public void mo61702b(int i, int i2) {
        this.f68828s.mo67567a();
    }

    /* renamed from: a */
    public void mo61694a(float f, float f2) {
        mo67561v();
        if (Math.abs(f) < Math.abs(f2) && this.f68821C) {
            if (f2 > 30.0f) {
                if (this.f68825G != null) {
                    this.f68825G.mo67575d();
                }
            } else if (f2 < -30.0f && this.f68825G != null) {
                this.f68825G.mo67574c();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo86485b(view);
        if (this.f68825G == null) {
            this.f68825G = mo67554a((ViewGroup) view);
        }
        if (bundle != null) {
            this.f68820B = bundle.getInt("cur_pos", 0);
        }
        this.f68828s = (DetailViewModel) C0069x.m159a(getActivity()).mo147a(DetailViewModel.class);
        mo61712p();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mo61696a(getArguments());
        View inflate = layoutInflater.inflate(mo61706m(), viewGroup, false);
        mo67556a(inflate);
        return inflate;
    }
}

package com.p280ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27413a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41012g;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterScrollerModule */
public class FilterScrollerModule implements C0042h {

    /* renamed from: a */
    public RecyclerView f77019a;

    /* renamed from: b */
    public AppCompatActivity f77020b;

    /* renamed from: c */
    public LinearLayoutManager f77021c;

    /* renamed from: d */
    public EffectFilterAdapter f77022d;

    /* renamed from: e */
    public List<EffectCategoryResponse> f77023e = new ArrayList();

    /* renamed from: f */
    public AVETParameter f77024f;

    /* renamed from: g */
    C29298i f77025g;

    /* renamed from: h */
    C29296g f77026h;

    /* renamed from: i */
    public C29296g f77027i;

    /* renamed from: j */
    public C29240bc f77028j;

    /* renamed from: k */
    public boolean f77029k;

    /* renamed from: l */
    private ImageView f77030l;

    /* renamed from: m */
    private View f77031m;

    /* renamed from: n */
    private AVDmtTabLayout f77032n;

    /* renamed from: o */
    private Map<C29296g, C27413a<C29296g, Void>> f77033o = new HashMap();

    /* renamed from: p */
    private C27413a<C29296g, Void> f77034p = new C27413a<C29296g, Void>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo70519a(C29296g gVar) {
            int a = FilterScrollerModule.this.mo74729a(gVar);
            if (a >= 0 && a < FilterScrollerModule.this.f77022d.getItemCount()) {
                FilterScrollerModule.this.f77022d.notifyItemChanged(a);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo70521a(C29296g gVar, Void voidR) {
            int a = FilterScrollerModule.this.mo74729a(gVar);
            if (a >= 0 && a < FilterScrollerModule.this.f77022d.getItemCount()) {
                FilterScrollerModule.this.f77022d.notifyItemChanged(a);
                C29341z.m96268d(gVar);
            }
            if (gVar.equals(FilterScrollerModule.this.f77027i)) {
                FilterViewModel.m95784a(FilterScrollerModule.this.f77020b, gVar);
                FilterScrollerModule.this.f77027i = null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo70520a(C29296g gVar, Integer num, String str, Exception exc) {
            int a = FilterScrollerModule.this.mo74729a(gVar);
            if (a >= 0 && a < FilterScrollerModule.this.f77022d.getItemCount()) {
                FilterScrollerModule.this.f77022d.notifyItemChanged(a);
            }
        }
    };

    /* renamed from: q */
    private C29175b f77035q;

    /* renamed from: r */
    private C29174a f77036r;

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterScrollerModule$TopSmoothScroller */
    public class TopSmoothScroller extends LinearSmoothScroller {
        /* renamed from: b */
        public final int mo5471b() {
            return -1;
        }

        /* renamed from: c */
        public final int mo5473c() {
            return -1;
        }

        TopSmoothScroller(Context context) {
            super(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterScrollerModule$a */
    interface C29174a {
        /* renamed from: a */
        boolean mo74747a();
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterScrollerModule$b */
    interface C29175b {
        /* renamed from: a */
        void mo74748a(boolean z);
    }

    /* renamed from: a */
    public final void mo74736a(boolean z) {
        if (this.f77035q != null) {
            this.f77035q.mo74748a(z);
        }
        this.f77029k = z;
        FilterViewModel.m95785a(this.f77020b, Boolean.valueOf(z));
        this.f77030l.setSelected(z);
        if (this.f77036r == null) {
            this.f77022d.mo74654a(z);
        } else if (z) {
            this.f77022d.mo74654a(true);
        } else if (this.f77036r.mo74747a()) {
            this.f77022d.mo74654a(false);
        } else {
            this.f77022d.mo74654a(true);
        }
        if (z) {
            if (this.f77032n.getCurSelectedTab() != null && (this.f77032n.getCurSelectedTab().f106703f instanceof AVDmtTabItemView)) {
                this.f77032n.getCurSelectedTab().f106703f.setSelected(false);
            }
            this.f77032n.mo101348d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74735a(Map map) {
        m95727a(map.entrySet());
        List a = this.f77022d.mo62312a();
        List a2 = C29286e.m96049a(map);
        this.f77022d.mo58045a(a2);
        m95726a(a2);
        C1143a.m5067a(new EffectFilterDiff(a, a2), true).mo4548a((C1262a) this.f77022d);
        ((SimpleItemAnimator) this.f77019a.getItemAnimator()).f5112m = false;
        if (this.f77026h != null) {
            this.f77022d.mo74656b(this.f77026h);
            m95729d(this.f77026h);
            this.f77026h = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74733a(C29296g gVar, boolean z) {
        if (z) {
            this.f77027i = null;
            FilterViewModel.m95784a(this.f77020b, gVar);
            return;
        }
        this.f77027i = gVar;
        FilterViewModel.m95787b(this.f77020b, gVar);
    }

    /* renamed from: g */
    private void m95732g() {
        this.f77025g.mo74981a();
        C29341z.m96257a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo74737b() {
        mo74731a(C29286e.m96050b(this.f77022d, this.f77021c.mo5445j()));
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void removeListener() {
        if (this.f77028j != null) {
            this.f77028j.mo74867a();
        }
        m95731f();
    }

    /* renamed from: d */
    private void m95728d() {
        this.f77032n.setTabMargin(12);
        this.f77032n.mo101335a(new C41006c() {
            /* renamed from: b */
            public final void mo74744b(C41011f fVar) {
            }

            /* renamed from: c */
            public final void mo74745c(C41011f fVar) {
            }

            /* renamed from: a */
            public final void mo74743a(C41011f fVar) {
                if (!(fVar == null || fVar.f106703f == null || fVar.f106702e >= FilterScrollerModule.this.f77023e.size())) {
                    View view = fVar.f106703f;
                    if (view instanceof AVDmtTabItemView) {
                        ((AVDmtTabItemView) view).mo103525b(false);
                    }
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) FilterScrollerModule.this.f77023e.get(fVar.f106702e);
                    if (!(effectCategoryResponse == null || FilterScrollerModule.this.f77028j == null)) {
                        FilterScrollerModule.this.f77028j.mo74868a(effectCategoryResponse.f113500id, effectCategoryResponse.tagsUpdateTime, C29217aq.f77123a);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74730a() {
        ((FilterViewModel) C0069x.m159a((FragmentActivity) this.f77020b).mo147a(FilterViewModel.class)).mo74771b().setValue(this.f77022d.mo74661j());
    }

    /* renamed from: e */
    private void m95730e() {
        if (this.f77025g != null) {
            new EffectCategoryResponse().name = this.f77025g.f77285g.mo74987a();
            View a = this.f77025g.f77285g.mo74986a(this.f77020b);
            C41011f a2 = this.f77032n.mo101329a().mo101401a(a);
            ((View) a.getParent()).setOnClickListener(new C29214an(this));
            this.f77032n.mo101336a(a2);
        }
    }

    /* renamed from: f */
    private void m95731f() {
        for (Entry entry : this.f77033o.entrySet()) {
            FilterManager.m95700a().mo74718b((C29296g) entry.getKey(), (C27413a) entry.getValue());
        }
    }

    /* renamed from: c */
    public final void mo74740c() {
        if (this.f77022d != null) {
            this.f77022d.notifyDataSetChanged();
            C29296g gVar = (C29296g) ((FilterViewModel) C0069x.m159a((FragmentActivity) this.f77020b).mo147a(FilterViewModel.class)).mo74771b().getValue();
            if (gVar != null) {
                m95729d(gVar);
                this.f77022d.mo74658c(gVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74734a(C41011f fVar) {
        this.f77032n.mo101345b(fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74739b(C29296g gVar) {
        if (gVar != null) {
            m95729d(gVar);
            this.f77022d.mo74658c(gVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo74741c(C29296g gVar) {
        if (gVar != null) {
            mo74736a(false);
            if (!this.f77022d.mo74656b(gVar)) {
                this.f77026h = gVar;
                return;
            }
            m95729d(gVar);
        }
    }

    /* renamed from: a */
    private void m95726a(List<C29296g> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (C29296g gVar : list) {
                if (!this.f77033o.containsKey(gVar)) {
                    FilterManager.m95700a().mo74713a(gVar, this.f77034p);
                    this.f77033o.put(gVar, this.f77034p);
                }
            }
        }
    }

    /* renamed from: d */
    private void m95729d(C29296g gVar) {
        int a = this.f77022d.mo74653a(gVar);
        if (a != -1) {
            int c = C29286e.m96051c(this.f77022d, a);
            if (this.f77032n.getSelectedTabPosition() != c) {
                mo74731a(c);
            }
        }
    }

    /* renamed from: a */
    private void m95725a(LiveData<Map<EffectCategoryResponse, List<C29296g>>> liveData) {
        this.f77021c = new EffectCenterLayoutManager(this.f77019a.getContext(), 0, false);
        this.f77019a.setLayoutManager(this.f77021c);
        this.f77022d = new EffectFilterAdapter(this.f77028j);
        this.f77022d.mo58045a(C35574k.m114859a().mo70097l().mo74951d().mo74830d());
        this.f77022d.mo66516d(false);
        this.f77022d.mo74660f();
        this.f77019a.setAdapter(this.f77022d);
        if (liveData != null) {
            liveData.observe(this.f77020b, new C29215ao(this));
        }
        this.f77019a.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (!FilterScrollerModule.this.f77029k) {
                    FilterScrollerModule.this.mo74731a(C29286e.m96050b(FilterScrollerModule.this.f77022d, FilterScrollerModule.this.f77021c.mo5445j()));
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        });
        this.f77022d.f76908c = new C29216ap(this);
        this.f77022d.registerAdapterDataObserver(new C1264c() {
            /* renamed from: b */
            public final void mo5725b(int i, int i2) {
                super.mo5725b(i, i2);
                FilterScrollerModule.this.mo74737b();
            }

            /* renamed from: c */
            public final void mo5726c(int i, int i2) {
                super.mo5726c(i, i2);
                FilterScrollerModule.this.mo74737b();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74738b(View view) {
        mo74736a(true);
        this.f77027i = null;
        if (this.f77024f != null) {
            C6907h.m21524a("select_filter", (Map) C38511bc.m123103a().mo96485a("creation_id", this.f77024f.getCreationId()).mo96485a("shoot_way", this.f77024f.getShootWay()).mo96483a("draft_id", this.f77024f.getDraftId()).mo96485a("filter_name", "empty").mo96485a("filter_id", "0").mo96485a("content_source", this.f77024f.getContentSource()).mo96485a("content_type", this.f77024f.getContentType()).mo96485a("enter_from", "video_shoot_page").f100112a);
        }
    }

    /* renamed from: a */
    private void m95727a(Set<Entry<EffectCategoryResponse, List<C29296g>>> set) {
        int i;
        int i2;
        int tabCount = this.f77032n.getTabCount();
        if (this.f77025g == null) {
            i = 0;
        } else {
            i = 1;
        }
        if (tabCount - i != set.size()) {
            if (this.f77025g == null) {
                i2 = set.size();
            } else {
                i2 = set.size() + 1;
            }
            ArrayList arrayList = new ArrayList();
            for (Entry key : set) {
                arrayList.add(((EffectCategoryResponse) key.getKey()).name);
            }
            this.f77032n.mo103529a(i2, (List<String>) arrayList);
            this.f77032n.mo101344b();
            this.f77023e.clear();
            final int i3 = 0;
            for (Entry entry : set) {
                this.f77023e.add(entry.getKey());
                View a = C29286e.m96048a(this.f77020b, i3, (EffectCategoryResponse) entry.getKey(), this.f77028j);
                final C41011f a2 = this.f77032n.mo101329a().mo101401a(a);
                C41012g gVar = a2.f106705h;
                if (gVar != null) {
                    gVar.setBackgroundColor(C0683b.m2912c(this.f77020b, R.color.ac4));
                }
                this.f77032n.mo101337a(a2, false);
                a.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        FilterScrollerModule.this.mo74736a(false);
                        if (FilterScrollerModule.this.f77021c != null) {
                            TopSmoothScroller topSmoothScroller = new TopSmoothScroller(FilterScrollerModule.this.f77019a.getContext());
                            topSmoothScroller.f4993g = C29286e.m96047a(FilterScrollerModule.this.f77022d, i3);
                            FilterScrollerModule.this.f77021c.mo5755a((C1287r) topSmoothScroller);
                        }
                        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) FilterScrollerModule.this.f77023e.get(a2.f106702e);
                        if (!(FilterScrollerModule.this.f77024f == null || effectCategoryResponse == null)) {
                            C42962b.f111525a.mo104671a("click_filter_tab", C38511bc.m123103a().mo96485a("creation_id", FilterScrollerModule.this.f77024f.getCreationId()).mo96485a("shoot_way", FilterScrollerModule.this.f77024f.getShootWay()).mo96485a("tab_name", effectCategoryResponse.name).mo96485a("content_source", FilterScrollerModule.this.f77024f.getContentSource()).mo96485a("content_type", FilterScrollerModule.this.f77024f.getContentType()).mo96485a("enter_from", "video_shoot_page").mo96485a("scene_id", "1002").f100112a);
                        }
                        a2.mo101403a();
                    }
                });
                i3++;
            }
            m95730e();
            if (!set.isEmpty()) {
                C41011f a3 = this.f77032n.mo101330a(0);
                if (a3 != null) {
                    this.f77032n.post(new C29212al(this, a3));
                }
            }
            this.f77032n.setOnTabClickListener(C29213am.f77119a);
        }
    }

    /* renamed from: a */
    public final int mo74729a(C29296g gVar) {
        List a = this.f77022d.mo62312a();
        if (C6307b.m19566a((Collection<T>) a) || gVar == null) {
            return -1;
        }
        for (int i = 0; i < a.size(); i++) {
            if (gVar.equals(a.get(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo74731a(int i) {
        if (this.f77032n != null) {
            C41011f a = this.f77032n.mo101330a(i);
            if (a != null) {
                a.mo101403a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74732a(View view) {
        String str;
        if (!this.f77025g.f77285g.mo74989b()) {
            m95732g();
        }
        String str2 = "click_filter_box";
        C38511bc a = C38511bc.m123103a();
        String str3 = "enter_from";
        if (this.f77024f != null) {
            str = this.f77024f.getShootWay();
        } else {
            str = "";
        }
        C6907h.m21524a(str2, (Map) a.mo96485a(str3, str).f100112a);
    }

    FilterScrollerModule(AppCompatActivity appCompatActivity, C29240bc bcVar, LinearLayout linearLayout, LiveData<Map<EffectCategoryResponse, List<C29296g>>> liveData, AVETParameter aVETParameter, C29298i iVar, boolean z, boolean z2, C29175b bVar, C29174a aVar) {
        this.f77019a = (RecyclerView) linearLayout.findViewById(R.id.akm);
        this.f77032n = (AVDmtTabLayout) linearLayout.findViewById(R.id.akp);
        this.f77030l = (ImageView) linearLayout.findViewById(R.id.ayw);
        this.f77031m = linearLayout.findViewById(R.id.dft);
        this.f77035q = bVar;
        this.f77036r = aVar;
        if (z) {
            this.f77030l.setVisibility(0);
            this.f77031m.setVisibility(0);
        }
        this.f77030l.setOnClickListener(new C29209ai(this));
        this.f77020b = appCompatActivity;
        this.f77028j = bcVar;
        this.f77024f = aVETParameter;
        this.f77025g = iVar;
        m95728d();
        m95725a(liveData);
        FilterManager.m95700a().mo74727k();
        FilterViewModel.m95783a(this.f77020b, (C0053p<C29296g>) new C29210aj<C29296g>(this));
        FilterViewModel.m95786b(this.f77020b, (C0053p<C29296g>) new C29211ak<C29296g>(this));
        mo74736a(z2);
        this.f77020b.getLifecycle().mo55a(this);
    }
}

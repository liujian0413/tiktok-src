package com.p280ss.android.ugc.aweme.photo.setfilter;

import android.content.Context;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27413a;
import com.p280ss.android.ugc.aweme.filter.C29229ay;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29238ba;
import com.p280ss.android.ugc.aweme.filter.C29249bi;
import com.p280ss.android.ugc.aweme.filter.C29286e;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29297h;
import com.p280ss.android.ugc.aweme.filter.EffectCenterLayoutManager;
import com.p280ss.android.ugc.aweme.filter.EffectFilterDiff;
import com.p280ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelFrameLayout;
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

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.EffectSetFilterLayoutNew */
public class EffectSetFilterLayoutNew extends AVDmtPanelFrameLayout implements OnClickListener, OnSeekBarChangeListener, C34816k {

    /* renamed from: a */
    public C29229ay f90734a;

    /* renamed from: b */
    public PhotoContext f90735b;

    /* renamed from: c */
    public LinearLayoutManager f90736c;

    /* renamed from: d */
    public List<EffectCategoryResponse> f90737d;

    /* renamed from: e */
    public C29296g f90738e;

    /* renamed from: f */
    private RecyclerView f90739f;

    /* renamed from: g */
    private ImageView f90740g;

    /* renamed from: h */
    private ImageView f90741h;

    /* renamed from: i */
    private FilterBeautySeekBar f90742i;

    /* renamed from: j */
    private int f90743j;

    /* renamed from: k */
    private float f90744k;

    /* renamed from: l */
    private int f90745l;

    /* renamed from: m */
    private float f90746m;

    /* renamed from: n */
    private C29296g f90747n;

    /* renamed from: o */
    private C34817l f90748o;

    /* renamed from: p */
    private AVDmtTabLayout f90749p;

    /* renamed from: q */
    private Map<C29296g, C27413a<C29296g, Void>> f90750q;

    /* renamed from: r */
    private C27413a<C29296g, Void> f90751r;

    /* renamed from: s */
    private C29230az f90752s;

    /* renamed from: t */
    private C29238ba f90753t;

    /* renamed from: u */
    private C29296g f90754u;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: f */
    private void m112247f() {
        this.f90749p.mo101335a(new C41006c() {
            /* renamed from: b */
            public final void mo74744b(C41011f fVar) {
            }

            /* renamed from: c */
            public final void mo74745c(C41011f fVar) {
            }

            /* renamed from: a */
            public final void mo74743a(C41011f fVar) {
                if (fVar != null && fVar.f106703f != null) {
                    View view = fVar.f106703f;
                    if (view instanceof AVDmtTabItemView) {
                        ((AVDmtTabItemView) view).mo103525b(false);
                    }
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) EffectSetFilterLayoutNew.this.f90737d.get(fVar.f106702e);
                    if (!(effectCategoryResponse == null || EffectSetFilterLayoutNew.this.f90734a.mo74843c() == null)) {
                        EffectSetFilterLayoutNew.this.f90734a.mo74843c().mo74868a(effectCategoryResponse.f113500id, effectCategoryResponse.tagsUpdateTime, C34815j.f90806a);
                    }
                }
            }
        });
    }

    /* renamed from: c */
    private void m112242c() {
        m112237a(this.f90745l, this.f90746m);
        if (this.f90739f != null) {
            this.f90739f.mo5576f();
        }
        if (this.f90748o != null) {
            this.f90748o.mo88249a(this.f90735b, 0);
        }
    }

    /* renamed from: d */
    private void m112244d() {
        m112237a(this.f90743j, this.f90744k);
        if (this.f90748o != null) {
            this.f90748o.mo88249a(this.f90735b, 1);
        }
    }

    /* renamed from: b */
    private void m112240b() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a9o, this, true);
        this.f90739f = (RecyclerView) inflate.findViewById(R.id.akm);
        this.f90736c = new EffectCenterLayoutManager(getContext(), 0, false);
        this.f90739f.setLayoutManager(this.f90736c);
        this.f90740g = (ImageView) inflate.findViewById(R.id.ak4);
        this.f90740g.setOnClickListener(this);
        this.f90741h = (ImageView) inflate.findViewById(R.id.ak6);
        this.f90741h.setOnClickListener(this);
        this.f90742i = (FilterBeautySeekBar) inflate.findViewById(R.id.cyf);
        this.f90742i.setOnSeekBarChangeListener(this);
        this.f90749p = (AVDmtTabLayout) inflate.findViewById(R.id.akp);
        C35574k.m114859a().mo70097l().mo74950c().mo74727k();
        m112246e();
        m112247f();
    }

    /* renamed from: e */
    private void m112246e() {
        this.f90734a = C35574k.m114859a().mo70097l().mo74953f();
        this.f90734a.mo74835a().mo58045a(C35574k.m114859a().mo70097l().mo74951d().mo74830d());
        this.f90734a.mo74835a().mo66516d(false);
        this.f90734a.mo74840b();
        this.f90739f.setAdapter(this.f90734a.mo74835a());
        setOnFilterChangeListener(this.f90748o);
        this.f90739f.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    EffectSetFilterLayoutNew.this.mo88275a(C29286e.m96050b(EffectSetFilterLayoutNew.this.f90734a.mo74835a(), EffectSetFilterLayoutNew.this.f90736c.mo5445j()));
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        });
    }

    /* renamed from: a */
    public final void mo88256a() {
        for (Entry entry : this.f90750q.entrySet()) {
            C35574k.m114859a().mo70097l().mo74950c().mo74718b((C29296g) entry.getKey(), (C27413a) entry.getValue());
        }
    }

    public void setFilterIntensityStore(C29230az azVar) {
        this.f90752s = azVar;
    }

    public void setFilterInternalDefaultIntensityGetter(C29238ba baVar) {
        this.f90753t = baVar;
    }

    public EffectSetFilterLayoutNew(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88278a(C41011f fVar) {
        this.f90749p.mo101345b(fVar);
    }

    /* renamed from: a */
    public final void mo88275a(int i) {
        if (this.f90749p != null) {
            this.f90749p.mo101331a(i, 0.0f, true);
            C41011f a = this.f90749p.mo101330a(i);
            if (a != null) {
                a.mo101403a();
            }
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ak4) {
            m112242c();
            return;
        }
        if (id == R.id.ak6) {
            m112244d();
        }
    }

    public void setData(List<C29296g> list) {
        if (!C6311g.m19573a(list)) {
            this.f90734a.mo74835a().mo58045a(list);
        }
    }

    public void setOnFilterChangeListener(C34817l lVar) {
        this.f90748o = lVar;
        if (this.f90734a != null) {
            this.f90734a.mo74837a((C29249bi) new C34813h(this));
        }
    }

    public void setPhotoContext(PhotoContext photoContext) {
        this.f90735b = photoContext;
        if (this.f90735b != null) {
            this.f90745l = this.f90735b.mFilterIndex;
            this.f90746m = this.f90735b.mFilterRate;
        }
    }

    /* renamed from: c */
    private void m112243c(C29296g gVar) {
        int c = this.f90734a.mo74842c(gVar);
        if (c != -1) {
            int c2 = C29286e.m96051c(this.f90734a.mo74835a(), c);
            if (this.f90749p.getSelectedTabPosition() != c2) {
                mo88275a(c2);
            }
        }
    }

    /* renamed from: b */
    public final int mo88279b(C29296g gVar) {
        List a = this.f90734a.mo74835a().mo62312a();
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

    public void setData(Map<EffectCategoryResponse, List<C29296g>> map) {
        if (map != null && !map.isEmpty()) {
            m112239a(map.entrySet());
            List a = this.f90734a.mo74835a().mo62312a();
            List a2 = C29286e.m96049a(map);
            C1143a.m5067a(new EffectFilterDiff(a, a2), true).mo4548a((C1262a) this.f90734a.mo74835a());
            this.f90734a.mo74835a().mo58045a(a2);
            m112238a(a2);
        }
    }

    public void setFilterIndex(int i) {
        if (C35574k.m114859a().mo70097l().mo74949b().mo74964a(this.f90734a.mo74839b(this.f90743j))) {
            this.f90743j = i;
            m112241b(this.f90743j);
        }
    }

    /* renamed from: a */
    private void m112238a(List<C29296g> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (C29296g gVar : list) {
                if (!this.f90750q.containsKey(gVar)) {
                    C35574k.m114859a().mo70097l().mo74950c().mo74713a(gVar, this.f90751r);
                    this.f90750q.put(gVar, this.f90751r);
                }
            }
        }
    }

    /* renamed from: d */
    private void m112245d(C29296g gVar) {
        if (this.f90754u != null) {
            C6907h.m21524a("adjust_filter_complete", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("creation_id", this.f90735b.creationId).mo59973a("shoot_way", this.f90735b.mShootWay).mo59970a("draft_id", this.f90735b.draftId).mo59970a("filter_id", this.f90754u.f77266a).mo59973a("filter_name", this.f90754u.f77267b).mo59972a("value", (Object) Float.valueOf(C29297h.m96116a(this.f90754u, this.f90752s, this.f90753t))).f60753a);
        }
        this.f90754u = gVar;
    }

    /* renamed from: a */
    private void m112239a(Set<Entry<EffectCategoryResponse, List<C29296g>>> set) {
        if (this.f90749p.getTabCount() != set.size()) {
            final int i = 0;
            for (Entry entry : set) {
                this.f90737d.add(entry.getKey());
                View a = C29286e.m96048a(getContext(), i, (EffectCategoryResponse) entry.getKey(), this.f90734a.mo74843c());
                final C41011f a2 = this.f90749p.mo101329a().mo101401a(a);
                this.f90749p.mo101336a(a2);
                a.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (EffectSetFilterLayoutNew.this.f90736c != null) {
                            EffectSetFilterLayoutNew.this.f90736c.mo5417a(C29286e.m96047a(EffectSetFilterLayoutNew.this.f90734a.mo74835a(), i), 0);
                        }
                        a2.mo101403a();
                        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) EffectSetFilterLayoutNew.this.f90737d.get(a2.f106702e);
                        if (EffectSetFilterLayoutNew.this.f90735b != null && effectCategoryResponse != null) {
                            C42962b.f111525a.mo104671a("click_filter_tab", C38511bc.m123103a().mo96485a("creation_id", EffectSetFilterLayoutNew.this.f90735b.creationId).mo96485a("shoot_way", EffectSetFilterLayoutNew.this.f90735b.mShootWay).mo96485a("tab_name", effectCategoryResponse.name).mo96485a("content_source", EffectSetFilterLayoutNew.this.f90735b.getAvetParameter().getContentSource()).mo96485a("content_type", EffectSetFilterLayoutNew.this.f90735b.getAvetParameter().getContentType()).mo96485a("enter_from", "video_edit_page").mo96485a("scene_id", "1002").f100112a);
                        }
                    }
                });
                i++;
            }
            C41011f a3 = this.f90749p.mo101330a(0);
            if (a3 != null) {
                this.f90749p.post(new C34814i(this, a3));
            }
        }
    }

    /* renamed from: b */
    private void m112241b(int i) {
        this.f90747n = this.f90734a.mo74839b(i);
        this.f90744k = C29297h.m96116a(this.f90747n, this.f90752s, this.f90753t);
        this.f90742i.setProgress(this.f90752s.mo74794a(this.f90747n, this.f90753t));
        this.f90734a.mo74836a(this.f90743j);
        m112243c(this.f90747n);
        if (i != 0) {
            m112237a(i, this.f90744k);
            if (this.f90748o != null) {
                this.f90748o.mo88249a(this.f90735b, 5);
            }
        }
    }

    /* renamed from: a */
    public final void mo88276a(C29296g gVar) {
        this.f90747n = gVar;
        this.f90743j = gVar.f77270e;
        this.f90744k = C29297h.m96116a(this.f90747n, this.f90752s, this.f90753t);
        this.f90742i.setProgress(this.f90752s.mo74794a(this.f90747n, this.f90753t));
        int a = C29297h.m96117a(this.f90747n, this.f90747n.f77275j, this.f90753t);
        if (a == 0 || a == 100) {
            this.f90742i.setDefaultDotProgress(-1);
        } else {
            this.f90742i.setDefaultDotProgress(a);
        }
        if (C29297h.m96119b(gVar, this.f90753t) == 0.0f) {
            this.f90742i.setVisibility(8);
        } else {
            this.f90742i.setVisibility(0);
        }
        m112237a(gVar.f77270e, this.f90744k);
        if (this.f90748o != null) {
            this.f90748o.mo88249a(this.f90735b, 5);
        }
        this.f90734a.mo74838a(gVar);
        m112245d(gVar);
    }

    public EffectSetFilterLayoutNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m112237a(int i, float f) {
        this.f90735b.mFilterIndex = i;
        C29296g a = C35574k.m114859a().mo70097l().mo74949b().mo74962a(i);
        if (a != null) {
            this.f90735b.mFilterName = a.f77268c;
            this.f90735b.mFilterId = a.f77266a;
        }
        this.f90735b.mFilterRate = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88277a(C29296g gVar, boolean z) {
        if (!z) {
            this.f90738e = gVar;
            m112243c(gVar);
            this.f90734a.mo74841b(gVar);
            return;
        }
        this.f90738e = null;
        m112243c(gVar);
        this.f90734a.mo74841b(gVar);
        mo88276a(gVar);
    }

    public EffectSetFilterLayoutNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f90744k = 0.8f;
        this.f90737d = new ArrayList();
        this.f90750q = new HashMap();
        this.f90751r = new C27413a<C29296g, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo70519a(C29296g gVar) {
                int b = EffectSetFilterLayoutNew.this.mo88279b(gVar);
                if (b >= 0 && b < EffectSetFilterLayoutNew.this.f90734a.mo74835a().mo62312a().size()) {
                    EffectSetFilterLayoutNew.this.f90734a.mo74835a().notifyItemChanged(b);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo70521a(C29296g gVar, Void voidR) {
                int b = EffectSetFilterLayoutNew.this.mo88279b(gVar);
                if (b >= 0 && b < EffectSetFilterLayoutNew.this.f90734a.mo74835a().mo62312a().size()) {
                    EffectSetFilterLayoutNew.this.f90734a.mo74835a().notifyItemChanged(b);
                }
                if (gVar.equals(EffectSetFilterLayoutNew.this.f90738e)) {
                    EffectSetFilterLayoutNew.this.mo88276a(gVar);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo70520a(C29296g gVar, Integer num, String str, Exception exc) {
                EffectSetFilterLayoutNew.this.f90734a.mo74835a().notifyItemChanged(EffectSetFilterLayoutNew.this.mo88279b(gVar));
            }
        };
        this.f90754u = null;
        m112240b();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.f90747n != null) {
            this.f90744k = C29297h.m96115a(this.f90747n, i, this.f90753t);
            if (this.f90752s != null) {
                this.f90752s.mo74795a(this.f90747n, C29297h.m96117a(this.f90747n, this.f90744k, this.f90753t));
            }
            m112237a(this.f90743j, this.f90744k);
            if (this.f90748o != null) {
                this.f90748o.mo88249a(this.f90735b, 4);
            }
        }
    }
}

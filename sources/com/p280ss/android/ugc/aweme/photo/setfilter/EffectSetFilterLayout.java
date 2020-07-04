package com.p280ss.android.ugc.aweme.photo.setfilter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
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
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27413a;
import com.p280ss.android.ugc.aweme.filter.C29229ay;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29238ba;
import com.p280ss.android.ugc.aweme.filter.C29249bi;
import com.p280ss.android.ugc.aweme.filter.C29286e;
import com.p280ss.android.ugc.aweme.filter.C29296g;
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

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.EffectSetFilterLayout */
public class EffectSetFilterLayout extends AVDmtPanelFrameLayout implements OnClickListener, OnSeekBarChangeListener, C34816k {

    /* renamed from: a */
    public C29229ay f90707a;

    /* renamed from: b */
    public RelativeLayout f90708b;

    /* renamed from: c */
    public PhotoContext f90709c;

    /* renamed from: d */
    public LinearLayoutManager f90710d;

    /* renamed from: e */
    public List<EffectCategoryResponse> f90711e;

    /* renamed from: f */
    public C29296g f90712f;

    /* renamed from: g */
    private RecyclerView f90713g;

    /* renamed from: h */
    private ImageView f90714h;

    /* renamed from: i */
    private ImageView f90715i;

    /* renamed from: j */
    private FilterBeautySeekBar f90716j;

    /* renamed from: k */
    private TextView f90717k;

    /* renamed from: l */
    private TextView f90718l;

    /* renamed from: m */
    private int f90719m;

    /* renamed from: n */
    private float f90720n;

    /* renamed from: o */
    private int f90721o;

    /* renamed from: p */
    private float f90722p;

    /* renamed from: q */
    private C34817l f90723q;

    /* renamed from: r */
    private AVDmtTabLayout f90724r;

    /* renamed from: s */
    private Map<C29296g, C27413a<C29296g, Void>> f90725s;

    /* renamed from: t */
    private C27413a<C29296g, Void> f90726t;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public void setFilterIntensityStore(C29230az azVar) {
    }

    public void setFilterInternalDefaultIntensityGetter(C29238ba baVar) {
    }

    /* renamed from: k */
    private void m112221k() {
        this.f90724r.mo101335a(new C41006c() {
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
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) EffectSetFilterLayout.this.f90711e.get(fVar.f106702e);
                    if (!(effectCategoryResponse == null || EffectSetFilterLayout.this.f90707a.mo74843c() == null)) {
                        EffectSetFilterLayout.this.f90707a.mo74843c().mo74868a(effectCategoryResponse.f113500id, effectCategoryResponse.tagsUpdateTime, C34812g.f90802a);
                    }
                }
            }
        });
    }

    /* renamed from: e */
    private void m112215e() {
        if (this.f90716j != null) {
            this.f90716j.setProgress((int) (this.f90720n * 100.0f));
        }
    }

    /* renamed from: f */
    private void m112216f() {
        m112207a(this.f90721o, this.f90722p);
        if (this.f90713g != null) {
            this.f90713g.mo5576f();
        }
        if (this.f90723q != null) {
            this.f90723q.mo88249a(this.f90709c, 0);
        }
    }

    /* renamed from: g */
    private void m112217g() {
        m112207a(this.f90719m, this.f90720n);
        if (this.f90723q != null) {
            this.f90723q.mo88249a(this.f90709c, 1);
        }
    }

    /* renamed from: i */
    private void m112219i() {
        m112207a(this.f90719m, this.f90720n);
        if (this.f90723q != null) {
            this.f90723q.mo88249a(this.f90709c, 2);
        }
        m112212c();
    }

    /* renamed from: c */
    private void m112212c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f90708b, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                EffectSetFilterLayout.this.f90708b.setVisibility(8);
            }
        });
        ofFloat.setDuration(150);
        ofFloat.start();
    }

    /* renamed from: d */
    private void m112214d() {
        this.f90708b.setVisibility(0);
        ObjectAnimator.ofFloat(this.f90708b, "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
        m112215e();
    }

    /* renamed from: h */
    private void m112218h() {
        this.f90720n = 0.8f;
        if (this.f90719m == this.f90721o) {
            this.f90720n = this.f90722p;
        }
        m112207a(this.f90719m, this.f90720n);
        if (this.f90723q != null) {
            this.f90723q.mo88249a(this.f90709c, 3);
        }
        m112212c();
    }

    /* renamed from: j */
    private void m112220j() {
        this.f90707a = C35574k.m114859a().mo70097l().mo74953f();
        this.f90707a.mo74835a().mo58045a(C35574k.m114859a().mo70097l().mo74951d().mo74830d());
        this.f90707a.mo74835a().mo66516d(false);
        this.f90707a.mo74840b();
        this.f90713g.setAdapter(this.f90707a.mo74835a());
        setOnFilterChangeListener(this.f90723q);
        this.f90713g.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    EffectSetFilterLayout.this.mo88257a(C29286e.m96050b(EffectSetFilterLayout.this.f90707a.mo74835a(), EffectSetFilterLayout.this.f90710d.mo5445j()));
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        });
    }

    /* renamed from: b */
    private void m112210b() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a9n, this, true);
        this.f90713g = (RecyclerView) inflate.findViewById(R.id.akm);
        this.f90710d = new EffectCenterLayoutManager(getContext(), 0, false);
        this.f90713g.setLayoutManager(this.f90710d);
        this.f90714h = (ImageView) inflate.findViewById(R.id.ak4);
        this.f90714h.setOnClickListener(this);
        this.f90715i = (ImageView) inflate.findViewById(R.id.ak6);
        this.f90715i.setOnClickListener(this);
        this.f90708b = (RelativeLayout) inflate.findViewById(R.id.akk);
        this.f90716j = (FilterBeautySeekBar) inflate.findViewById(R.id.d22);
        this.f90716j.setOnSeekBarChangeListener(this);
        this.f90717k = (TextView) inflate.findViewById(R.id.aki);
        this.f90717k.setOnClickListener(this);
        this.f90718l = (TextView) inflate.findViewById(R.id.akj);
        this.f90718l.setOnClickListener(this);
        this.f90724r = (AVDmtTabLayout) inflate.findViewById(R.id.akp);
        C35574k.m114859a().mo70097l().mo74950c().mo74727k();
        m112220j();
        m112221k();
        this.f90708b.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo88256a() {
        for (Entry entry : this.f90725s.entrySet()) {
            C35574k.m114859a().mo70097l().mo74950c().mo74718b((C29296g) entry.getKey(), (C27413a) entry.getValue());
        }
    }

    public EffectSetFilterLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88260a(C41011f fVar) {
        this.f90724r.mo101345b(fVar);
    }

    /* renamed from: c */
    private void m112213c(C29296g gVar) {
        int c = this.f90707a.mo74842c(gVar);
        if (c != -1) {
            int c2 = C29286e.m96051c(this.f90707a.mo74835a(), c);
            if (this.f90724r.getSelectedTabPosition() != c2) {
                mo88257a(c2);
            }
        }
    }

    /* renamed from: a */
    public final void mo88257a(int i) {
        if (this.f90724r != null) {
            this.f90724r.mo101331a(i, 0.0f, true);
            C41011f a = this.f90724r.mo101330a(i);
            if (a != null) {
                a.mo101403a();
            }
        }
    }

    public void setData(List<C29296g> list) {
        if (!C6311g.m19573a(list)) {
            this.f90707a.mo74835a().mo58045a(list);
        }
    }

    public void setOnFilterChangeListener(C34817l lVar) {
        this.f90723q = lVar;
        if (this.f90707a != null) {
            this.f90707a.mo74837a((C29249bi) new C34810e(this));
        }
    }

    public void setPhotoContext(PhotoContext photoContext) {
        this.f90709c = photoContext;
        if (this.f90709c != null) {
            this.f90721o = this.f90709c.mFilterIndex;
            this.f90722p = this.f90709c.mFilterRate;
        }
    }

    /* renamed from: b */
    private void m112211b(int i) {
        C29296g b = this.f90707a.mo74839b(this.f90719m);
        this.f90720n = 0.8f;
        this.f90707a.mo74836a(this.f90719m);
        m112213c(b);
        if (i != 0) {
            m112207a(i, this.f90720n);
            if (this.f90723q != null) {
                this.f90723q.mo88249a(this.f90709c, 5);
            }
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ak4) {
            m112216f();
        } else if (id == R.id.ak6) {
            m112217g();
        } else if (id == R.id.aki) {
            m112218h();
        } else {
            if (id == R.id.akj) {
                m112219i();
            }
        }
    }

    public void setData(Map<EffectCategoryResponse, List<C29296g>> map) {
        if (map != null && !map.isEmpty()) {
            m112209a(map.entrySet());
            List a = this.f90707a.mo74835a().mo62312a();
            List a2 = C29286e.m96049a(map);
            C1143a.m5067a(new EffectFilterDiff(a, a2), true).mo4548a((C1262a) this.f90707a.mo74835a());
            this.f90707a.mo74835a().mo58045a(a2);
            m112208a(a2);
        }
    }

    public void setFilterIndex(int i) {
        if (C35574k.m114859a().mo70097l().mo74949b().mo74964a(this.f90707a.mo74839b(this.f90719m))) {
            this.f90719m = i;
            m112211b(this.f90719m);
        }
    }

    /* renamed from: a */
    private void m112208a(List<C29296g> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (C29296g gVar : list) {
                if (!this.f90725s.containsKey(gVar)) {
                    C35574k.m114859a().mo70097l().mo74950c().mo74713a(gVar, this.f90726t);
                    this.f90725s.put(gVar, this.f90726t);
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo88261b(C29296g gVar) {
        List a = this.f90707a.mo74835a().mo62312a();
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
    private void m112209a(Set<Entry<EffectCategoryResponse, List<C29296g>>> set) {
        if (this.f90724r.getTabCount() != set.size()) {
            final int i = 0;
            for (Entry entry : set) {
                this.f90711e.add(entry.getKey());
                View a = C29286e.m96048a(getContext(), i, (EffectCategoryResponse) entry.getKey(), this.f90707a.mo74843c());
                final C41011f a2 = this.f90724r.mo101329a().mo101401a(a);
                this.f90724r.mo101336a(a2);
                a.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (EffectSetFilterLayout.this.f90710d != null) {
                            EffectSetFilterLayout.this.f90710d.mo5417a(C29286e.m96047a(EffectSetFilterLayout.this.f90707a.mo74835a(), i), 0);
                        }
                        a2.mo101403a();
                        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) EffectSetFilterLayout.this.f90711e.get(a2.f106702e);
                        if (EffectSetFilterLayout.this.f90709c != null && effectCategoryResponse != null) {
                            C42962b.f111525a.mo104671a("click_filter_tab", C38511bc.m123103a().mo96485a("creation_id", EffectSetFilterLayout.this.f90709c.creationId).mo96485a("shoot_way", EffectSetFilterLayout.this.f90709c.mShootWay).mo96485a("tab_name", effectCategoryResponse.name).mo96485a("content_source", EffectSetFilterLayout.this.f90709c.getAvetParameter().getContentSource()).mo96485a("content_type", EffectSetFilterLayout.this.f90709c.getAvetParameter().getContentType()).mo96485a("enter_from", "video_edit_page").mo96485a("scene_id", "1002").f100112a);
                        }
                    }
                });
                i++;
            }
            C41011f a3 = this.f90724r.mo101330a(0);
            if (a3 != null) {
                this.f90724r.post(new C34811f(this, a3));
            }
        }
    }

    /* renamed from: a */
    public final void mo88258a(C29296g gVar) {
        this.f90719m = gVar.f77270e;
        this.f90720n = 0.8f;
        m112207a(gVar.f77270e, this.f90720n);
        if (this.f90723q != null) {
            this.f90723q.mo88249a(this.f90709c, 5);
        }
        this.f90707a.mo74838a(gVar);
    }

    public EffectSetFilterLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m112207a(int i, float f) {
        this.f90709c.mFilterIndex = i;
        C29296g a = C35574k.m114859a().mo70097l().mo74949b().mo74962a(i);
        if (a != null) {
            this.f90709c.mFilterName = a.f77268c;
            this.f90709c.mFilterId = a.f77266a;
        }
        this.f90709c.mFilterRate = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88259a(C29296g gVar, boolean z) {
        if (!z) {
            this.f90712f = gVar;
            m112213c(gVar);
            this.f90707a.mo74841b(gVar);
            return;
        }
        this.f90712f = null;
        m112213c(gVar);
        this.f90707a.mo74841b(gVar);
        if (this.f90719m != gVar.f77270e) {
            mo88258a(gVar);
        } else {
            m112214d();
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f90720n = (((float) i) * 1.0f) / 100.0f;
        m112207a(this.f90719m, this.f90720n);
        if (this.f90723q != null) {
            this.f90723q.mo88249a(this.f90709c, 4);
        }
    }

    public EffectSetFilterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f90720n = 0.8f;
        this.f90711e = new ArrayList();
        this.f90725s = new HashMap();
        this.f90726t = new C27413a<C29296g, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo70519a(C29296g gVar) {
                int b = EffectSetFilterLayout.this.mo88261b(gVar);
                if (b >= 0 && b < EffectSetFilterLayout.this.f90707a.mo74835a().mo62312a().size()) {
                    EffectSetFilterLayout.this.f90707a.mo74835a().notifyItemChanged(b);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo70521a(C29296g gVar, Void voidR) {
                int b = EffectSetFilterLayout.this.mo88261b(gVar);
                if (b >= 0 && b < EffectSetFilterLayout.this.f90707a.mo74835a().mo62312a().size()) {
                    EffectSetFilterLayout.this.f90707a.mo74835a().notifyItemChanged(b);
                }
                if (gVar.equals(EffectSetFilterLayout.this.f90712f)) {
                    EffectSetFilterLayout.this.mo88258a(gVar);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo70520a(C29296g gVar, Integer num, String str, Exception exc) {
                EffectSetFilterLayout.this.f90707a.mo74835a().notifyItemChanged(EffectSetFilterLayout.this.mo88261b(gVar));
            }
        };
        m112210b();
    }
}

package com.p280ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.lifecycle.LiveData;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39370d;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39376h;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40582c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterViewImpl */
class FilterViewImpl implements C0042h, C29241bd {

    /* renamed from: a */
    AppCompatActivity f77045a;

    /* renamed from: b */
    public C29231b f77046b;

    /* renamed from: c */
    public C29180a f77047c;

    /* renamed from: d */
    public C29296g f77048d;

    /* renamed from: e */
    public List<C39376h> f77049e = new ArrayList();

    /* renamed from: f */
    public C39376h f77050f = new C39376h() {
        /* renamed from: a */
        public final void mo74759a(C29296g gVar) {
            for (C39376h a : FilterViewImpl.this.f77049e) {
                a.mo74759a(gVar);
            }
        }

        /* renamed from: b */
        public final void mo74761b(C29296g gVar) {
            for (C39376h b : FilterViewImpl.this.f77049e) {
                b.mo74761b(gVar);
            }
        }

        /* renamed from: c */
        public final void mo74762c(C29296g gVar) {
            for (C39376h c : FilterViewImpl.this.f77049e) {
                c.mo74762c(gVar);
            }
        }

        /* renamed from: d */
        public final void mo74763d(C29296g gVar) {
            for (C39376h d : FilterViewImpl.this.f77049e) {
                d.mo74763d(gVar);
            }
        }

        /* renamed from: a */
        public final void mo74760a(C29296g gVar, int i) {
            for (C39376h a : FilterViewImpl.this.f77049e) {
                a.mo74760a(gVar, i);
            }
        }
    };

    /* renamed from: g */
    public C39370d f77051g;

    /* renamed from: h */
    private View f77052h;

    /* renamed from: i */
    private FrameLayout f77053i;

    /* renamed from: j */
    private FrameLayout f77054j;

    /* renamed from: k */
    private FilterScrollerModule f77055k;

    /* renamed from: l */
    private C29298i f77056l;

    /* renamed from: m */
    private C29231b f77057m;

    /* renamed from: n */
    private FilterBeautySeekBar f77058n;

    /* renamed from: o */
    private boolean f77059o;

    /* renamed from: p */
    private boolean f77060p;

    /* renamed from: q */
    private AVETParameter f77061q;

    /* renamed from: r */
    private C29240bc f77062r;

    /* renamed from: s */
    private final C23258e f77063s;

    /* renamed from: t */
    private C23254a f77064t = new C29223as(this);

    /* renamed from: u */
    private Boolean f77065u;

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterViewImpl$a */
    static class C29180a implements C0043i {

        /* renamed from: a */
        public C0044j f77072a = new C0044j(this);

        public final Lifecycle getLifecycle() {
            return this.f77072a;
        }

        C29180a() {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ boolean mo74757c() {
        if (this.f77048d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo74755b() {
        if (this.f77045a != null) {
            FilterViewModel.m95782a(this.f77045a);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f77052h = null;
        this.f77049e.clear();
        this.f77045a = null;
    }

    /* renamed from: d */
    private void m95763d() {
        if (this.f77057m != null) {
            this.f77057m.mo74849b(new C40582c());
        }
        if (this.f77063s != null) {
            this.f77063s.mo60526b(this.f77064t);
        }
    }

    /* renamed from: a */
    public final void mo74749a() {
        this.f77053i.removeAllViews();
        m95761a(this.f77045a, this.f77053i);
        this.f77057m.mo74845a((C34856c) new C40582c());
        if (this.f77063s != null) {
            this.f77063s.mo60525a(this.f77064t);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74750a(View view) {
        m95763d();
    }

    /* renamed from: a */
    private void m95762a(C39376h hVar) {
        if (hVar != null) {
            this.f77049e.add(hVar);
        }
    }

    /* renamed from: a */
    public final void mo74751a(C29296g gVar) {
        if (this.f77045a != null) {
            FilterViewModel.m95784a(this.f77045a, gVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74752a(Object obj) {
        this.f77055k.mo74730a();
    }

    FilterViewImpl(C29208ah ahVar) {
        this.f77045a = ahVar.f77113k;
        this.f77053i = ahVar.f77103a;
        this.f77054j = ahVar.f77104b;
        this.f77062r = ahVar.f77107e;
        this.f77061q = ahVar.f77110h;
        this.f77059o = ahVar.f77108f;
        this.f77060p = ahVar.f77109g;
        m95762a(ahVar.f77105c);
        this.f77063s = ahVar.f77106d;
        this.f77047c = new C29180a();
        this.f77065u = Boolean.valueOf(ahVar.f77111i);
        this.f77051g = ahVar.f77112j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74753a(boolean z) {
        int i;
        if (z) {
            this.f77048d = null;
        }
        FilterBeautySeekBar filterBeautySeekBar = this.f77058n;
        if (z || this.f77048d == null || this.f77051g.mo74913c(this.f77048d) == 0.0f) {
            i = 8;
        } else {
            i = 0;
        }
        filterBeautySeekBar.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74756b(C29296g gVar) {
        this.f77048d = null;
        if (C29341z.m96266c(gVar)) {
            this.f77048d = gVar;
            if (this.f77065u.booleanValue()) {
                if (this.f77051g.mo74913c(this.f77048d) == 0.0f) {
                    this.f77058n.setVisibility(8);
                } else {
                    this.f77058n.setVisibility(0);
                    this.f77058n.setProgress(this.f77051g.mo74911a(this.f77048d));
                    int b = this.f77051g.mo74912b(this.f77048d);
                    if (b == 0 || b == 100) {
                        this.f77058n.setDefaultDotProgress(-1);
                    } else {
                        this.f77058n.setDefaultDotProgress(this.f77051g.mo74912b(this.f77048d));
                    }
                }
            }
            this.f77050f.mo74762c(gVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo74754a(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (this.f77056l == null || !this.f77056l.f77280b) {
            m95763d();
        } else {
            this.f77056l.mo74983b();
        }
        return true;
    }

    /* renamed from: a */
    private void m95761a(final AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
        C29175b bVar;
        C29174a aVar;
        if (this.f77052h == null) {
            appCompatActivity.getLifecycle().mo55a(this);
            this.f77052h = LayoutInflater.from(appCompatActivity).inflate(R.layout.gs, frameLayout, false);
            LinearLayout linearLayout = (LinearLayout) this.f77052h.findViewById(R.id.daz);
            this.f77058n = (FilterBeautySeekBar) this.f77052h.findViewById(R.id.cyf);
            if (this.f77065u.booleanValue()) {
                this.f77058n.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
                    public final void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public final void onStopTrackingTouch(SeekBar seekBar) {
                        if (FilterViewImpl.this.f77048d != null && FilterViewImpl.this.f77051g != null) {
                            FilterViewImpl.this.f77050f.mo74763d(FilterViewImpl.this.f77048d);
                        }
                    }

                    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        if (FilterViewImpl.this.f77048d != null && FilterViewImpl.this.f77051g != null) {
                            FilterViewImpl.this.f77050f.mo74760a(FilterViewImpl.this.f77048d, i);
                        }
                    }
                });
            } else {
                this.f77058n.setVisibility(8);
            }
            final EffectFilterManager effectFilterManager = new EffectFilterManager();
            this.f77057m = new C29231b(frameLayout, this.f77052h, linearLayout);
            this.f77052h.findViewById(R.id.dbj).setOnClickListener(new C29224at(this));
            this.f77057m.mo74846a((C34860g) new C34861a() {
                /* renamed from: d */
                public final void mo74768d() {
                    FilterViewImpl.this.f77047c.f77072a.mo117a(State.CREATED);
                    FilterViewImpl.this.f77050f.mo74761b(null);
                }

                /* renamed from: a */
                public final void mo74767a() {
                    FilterViewImpl.this.f77047c.f77072a.mo117a(State.STARTED);
                    ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).mo74771b().setValue(FilterViewImpl.this.f77048d);
                    FilterViewImpl.this.f77050f.mo74759a(null);
                }
            });
            if (this.f77054j != null) {
                this.f77056l = new C29298i(C29318l.m96164a(this), appCompatActivity, this.f77054j);
                this.f77046b = new C29231b(frameLayout, this.f77052h, linearLayout);
                this.f77056l.f77284f = new C34861a() {
                    /* renamed from: a */
                    public final void mo74767a() {
                        FilterViewImpl.this.f77046b.mo74849b(new C40582c());
                    }

                    /* renamed from: c */
                    public final void mo74769c() {
                        FilterViewImpl.this.f77046b.mo74845a((C34856c) new C40582c());
                    }
                };
            }
            C29240bc bcVar = this.f77062r;
            LinearLayout linearLayout2 = (LinearLayout) this.f77052h.findViewById(R.id.ak8);
            LiveData b = C35574k.m114859a().mo70097l().mo74951d().mo74824b();
            AVETParameter aVETParameter = this.f77061q;
            C29298i iVar = this.f77056l;
            boolean z = this.f77060p;
            boolean z2 = this.f77059o;
            if (this.f77065u.booleanValue()) {
                bVar = new C29225au(this);
            } else {
                bVar = null;
            }
            if (this.f77065u.booleanValue()) {
                aVar = new C29226av(this);
            } else {
                aVar = null;
            }
            FilterScrollerModule filterScrollerModule = new FilterScrollerModule(appCompatActivity, bcVar, linearLayout2, b, aVETParameter, iVar, z, z2, bVar, aVar);
            this.f77055k = filterScrollerModule;
            ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).mo74770a().observe(appCompatActivity, new C29227aw(this));
            ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).mo74771b().observe(this.f77047c, new C29228ax(this));
            return;
        }
        this.f77055k.mo74740c();
    }
}

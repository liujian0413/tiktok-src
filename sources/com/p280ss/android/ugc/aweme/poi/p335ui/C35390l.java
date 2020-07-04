package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29374h;
import com.p280ss.android.ugc.aweme.flowfeed.p1255i.C29383a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.C35086h.C35087a;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle.C35003a;
import com.p280ss.android.ugc.aweme.poi.adapter.C35012a;
import com.p280ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35025a;
import com.p280ss.android.ugc.aweme.poi.model.C35118h;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35386j.C35388a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.l */
public class C35390l extends C29383a<PoiAwemeFeedAdapter, C34145b> {

    /* renamed from: k */
    protected String f92832k;

    /* renamed from: l */
    protected String f92833l;

    /* renamed from: m */
    public PoiSimpleBundle f92834m;

    /* renamed from: n */
    protected C35386j f92835n;

    /* renamed from: o */
    public boolean f92836o;

    /* renamed from: p */
    protected long f92837p = 9999;

    /* renamed from: q */
    protected String f92838q = "";

    /* renamed from: r */
    protected String f92839r = "";

    /* renamed from: s */
    public C35025a f92840s;

    /* renamed from: t */
    protected C35388a f92841t;

    /* renamed from: u */
    public int f92842u;

    /* renamed from: v */
    protected String f92843v;

    /* renamed from: b */
    public final void mo75157b() {
    }

    /* renamed from: e */
    public void mo75167e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C35012a mo89817l() {
        return null;
    }

    /* renamed from: a */
    public void mo89813a(boolean z, String str, String str2, boolean z2) {
        String str3;
        if (this.f92835n != null) {
            if (TextUtils.isEmpty(C28290d.m93037a())) {
                str3 = C28290d.m93043d();
            } else {
                str3 = C28290d.m93037a();
            }
            long j = 0;
            try {
                if (!TextUtils.isEmpty(str3)) {
                    j = Long.parseLong(str3);
                }
            } catch (Exception unused) {
            }
            this.f92835n.mo56976a(Integer.valueOf(1), new C35087a().mo88940b(3).mo88937a(this.f92832k).mo88942b(str).mo88944c(str2).mo88935a(z ? 1 : 0).mo88936a(j).mo88945d(this.f92833l).mo88943b(z2).mo88938a(this.f92841t.mo89732e()).mo88946e(this.f92841t.mo89733f()).mo88939a());
        }
    }

    /* renamed from: a */
    public final void mo75154a(boolean z, Aweme aweme) {
        super.mo75154a(z, aweme);
        this.f92841t.mo89744q();
    }

    /* renamed from: p */
    private C29374h m114310p() {
        return this.f92841t.mo89715E();
    }

    /* renamed from: d */
    public final C21744b mo75166d() {
        return new C21744b() {
            /* renamed from: d */
            public final String mo58075d() {
                return "key_container_poi";
            }

            /* renamed from: e */
            public final Object mo58076e() {
                return C35390l.this.f77427f;
            }

            /* renamed from: a */
            public final boolean mo58072a() {
                if (C35390l.this.f77429h == null || !C35390l.this.f77429h.isViewValid()) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final Context mo58074c() {
                if (C35390l.this.f77429h != null) {
                    return C35390l.this.f77429h.getActivity();
                }
                return C35390l.this.f77423b.getContext();
            }

            /* renamed from: b */
            public final boolean mo58073b() {
                if (C35390l.this.f77429h == null || !C35390l.this.f77429h.getLifecycle().mo54a().equals(State.RESUMED) || !C35390l.this.f77429h.mUserVisibleHint) {
                    return false;
                }
                return true;
            }
        };
    }

    /* renamed from: m */
    public final void mo90115m() {
        if (this.f77427f != null) {
            ((PoiAwemeFeedAdapter) this.f77427f).mo88768o();
        }
    }

    /* renamed from: n */
    public final void mo90116n() {
        if (this.f77427f != null && ((PoiAwemeFeedAdapter) this.f77427f).getItemCount() > 0) {
            ((PoiAwemeFeedAdapter) this.f77427f).notifyItemChanged(0, "UPDATE_LOCATION");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public PoiAwemeFeedAdapter mo75164c() {
        this.f77427f = new PoiAwemeFeedAdapter(this.f77423b, m114310p());
        if (C6399b.m19944t()) {
            ((PoiAwemeFeedAdapter) this.f77427f).mo66506d(R.string.dvr);
        } else {
            ((PoiAwemeFeedAdapter) this.f77427f).mo66506d(R.string.bnk);
        }
        ((PoiAwemeFeedAdapter) this.f77427f).f91411F = this.f77429h;
        ((PoiAwemeFeedAdapter) this.f77427f).f91414I = this.f92840s;
        ((PoiAwemeFeedAdapter) this.f77427f).f91410E = this.f92834m;
        ((PoiAwemeFeedAdapter) this.f77427f).f91416K = this.f92842u;
        ((PoiAwemeFeedAdapter) this.f77427f).f58249x = this.f92843v;
        ((PoiAwemeFeedAdapter) this.f77427f).f91412G = mo89817l();
        ((PoiAwemeFeedAdapter) this.f77427f).f91415J = this.f92841t.mo89714D();
        ((PoiAwemeFeedAdapter) this.f77427f).f67550q = getContext().getResources().getColor(R.color.a3q);
        return (PoiAwemeFeedAdapter) this.f77427f;
    }

    public void bd_() {
        if (isViewValid() && this.f92835n.mo66539h() != null && ((!(this.f92835n.mo66539h() instanceof C25673a) || !((C25673a) this.f92835n.mo66539h()).isDataEmpty()) && ((C35118h) this.f92835n.mo66539h()).isHasMore() && this.f92835n != null)) {
            this.f92835n.mo56976a(Integer.valueOf(4), new C35087a().mo88940b(3).mo88937a(this.f92832k).mo88941b(this.f92837p).mo88942b(this.f92838q).mo88944c(this.f92839r).mo88945d(this.f92833l).mo88939a());
        }
    }

    /* renamed from: a */
    public final void mo90109a(C1281m mVar) {
        this.f77423b.mo5528a(mVar);
    }

    /* renamed from: a */
    public final void mo90110a(CouponInfo couponInfo) {
        if (this.f77427f != null && ((PoiAwemeFeedAdapter) this.f77427f).getItemCount() > 0) {
            ((PoiAwemeFeedAdapter) this.f77427f).mo88765a(couponInfo);
        }
    }

    /* renamed from: b */
    public final void mo90113b(View view) {
        if (isViewValid() && this.f77427f != null) {
            ((PoiAwemeFeedAdapter) this.f77427f).mo88766c(view);
        }
    }

    /* renamed from: c */
    public final void mo90114c(int i) {
        if (isViewValid() && this.f77427f != null) {
            ((PoiAwemeFeedAdapter) this.f77427f).mo88767g(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90111a(PoiDetail poiDetail) {
        long defaultPoiClassCode = poiDetail.getDefaultPoiClassCode();
        if (defaultPoiClassCode > 0) {
            this.f92837p = defaultPoiClassCode;
        }
    }

    /* renamed from: a */
    public final PoiSimpleBundle mo90108a(PoiBundle poiBundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (poiBundle != null) {
            str = poiBundle.poiId;
        } else {
            str = "";
        }
        this.f92832k = str;
        if (poiBundle != null) {
            str2 = poiBundle.awemeid;
        } else {
            str2 = "";
        }
        this.f92833l = str2;
        C35003a aVar = new C35003a();
        if (poiBundle != null) {
            str3 = poiBundle.poiId;
        } else {
            str3 = "";
        }
        C35003a a = aVar.mo88730a(str3);
        if (poiBundle != null) {
            str4 = poiBundle.poiType;
        } else {
            str4 = "";
        }
        C35003a c = a.mo88732b(str4).mo88733c(C33230ac.m107214b());
        if (poiBundle != null) {
            str5 = poiBundle.from;
        } else {
            str5 = "";
        }
        C35003a f = c.mo88736f(str5);
        if (poiBundle != null) {
            str6 = poiBundle.awemeid;
        } else {
            str6 = "";
        }
        C35003a e = f.mo88735e(str6);
        if (poiBundle != null) {
            str7 = poiBundle.activityId;
        } else {
            str7 = "";
        }
        C35003a d = e.mo88734d(str7);
        if (poiBundle != null) {
            str8 = poiBundle.backendType;
        } else {
            str8 = "";
        }
        C35003a g = d.mo88737g(str8);
        if (poiBundle != null) {
            str9 = poiBundle.cityCode;
        } else {
            str9 = "";
        }
        this.f92834m = g.mo88738h(str9).mo88731a();
        return this.f92834m;
    }

    /* renamed from: a */
    public void mo75133a(int i) {
        if (isViewValid()) {
            switch (i) {
                case 1:
                    mo75160b(null);
                    if (this.f77424c != null) {
                        if (!this.f92836o) {
                            this.f77424c.mo25944h();
                        } else {
                            this.f77424c.mo25939d();
                        }
                    }
                    if (this.f77427f != null) {
                        ((PoiAwemeFeedAdapter) this.f77427f).ah_();
                        return;
                    }
                    break;
                case 2:
                    if (!this.f92836o && this.f77424c != null) {
                        this.f77424c.mo25942f();
                        return;
                    }
                case 3:
                    if (this.f77424c != null) {
                        if (!this.f92836o) {
                            this.f77424c.mo25943g();
                        } else {
                            this.f77424c.mo25939d();
                        }
                    }
                    mo75160b(null);
                    if (this.f77427f != null) {
                        ((PoiAwemeFeedAdapter) this.f77427f).ah_();
                        return;
                    }
                    break;
                case 4:
                    if (this.f77424c != null) {
                        this.f77424c.mo25939d();
                        break;
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90112a(Runnable runnable) {
        m114308a(runnable, 0);
    }

    /* renamed from: a */
    private void m114308a(Runnable runnable, int i) {
        this.f77423b.postDelayed(runnable, 0);
    }

    /* renamed from: a */
    public void mo75152a(List<C34145b> list, boolean z) {
        if (isViewValid()) {
            if (this.f77424c != null) {
                this.f77424c.mo25939d();
            }
            if (!this.f92836o) {
                this.f92836o = !C6311g.m19573a(list);
            }
            if (this.f77427f != null) {
                ((PoiAwemeFeedAdapter) this.f77427f).mo58045a(list);
            }
            mo75162b(z);
        }
    }

    /* renamed from: a */
    public void mo89812a(C35388a aVar, View view, C35386j jVar, C21743a aVar2) {
        this.f92835n = jVar;
        this.f92841t = aVar;
        super.mo75135a(aVar.mo89736j(), view, jVar, aVar2, aVar.mo90106v(), aVar.mo73844w(), aVar.mo73845x());
    }
}

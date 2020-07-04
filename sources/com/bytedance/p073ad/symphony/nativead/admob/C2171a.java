package com.bytedance.p073ad.symphony.nativead.admob;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.p073ad.symphony.p074a.p075a.C2082a;
import com.bytedance.p073ad.symphony.p074a.p075a.C2088e;
import com.bytedance.p073ad.symphony.p074a.p075a.C2088e.C2089a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.util.C2198a;
import com.bytedance.p073ad.symphony.util.C2202e;
import com.google.android.gms.ads.C14732b;
import com.google.android.gms.ads.C14739c.C14740a;
import com.google.android.gms.ads.C14871k;
import com.google.android.gms.ads.C14871k.C14872a;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.C14747a.C14749b;
import com.google.android.gms.ads.formats.C14761h;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import java.util.List;

/* renamed from: com.bytedance.ad.symphony.nativead.admob.a */
public final class C2171a extends C2082a {

    /* renamed from: r */
    private static final int f7368r = 2131296450;

    /* renamed from: s */
    private static final int f7369s = 2131296449;

    /* renamed from: A */
    private String f7370A;

    /* renamed from: B */
    private float f7371B;

    /* renamed from: C */
    private String f7372C;

    /* renamed from: D */
    private boolean f7373D;

    /* renamed from: E */
    private int f7374E;

    /* renamed from: F */
    private int f7375F;

    /* renamed from: G */
    private C14740a f7376G;

    /* renamed from: H */
    private ViewGroup[] f7377H;

    /* renamed from: q */
    public C14871k f7378q;

    /* renamed from: t */
    private C14761h f7379t;

    /* renamed from: u */
    private boolean f7380u;

    /* renamed from: v */
    private ViewGroup f7381v;

    /* renamed from: w */
    private String f7382w;

    /* renamed from: x */
    private String f7383x;

    /* renamed from: y */
    private String f7384y;

    /* renamed from: z */
    private String f7385z;

    /* renamed from: com.bytedance.ad.symphony.nativead.admob.a$a */
    class C2174a implements C2088e, C2089a {
        /* renamed from: a */
        public final void mo7775a() {
            if (C2171a.this.f7378q != null) {
                C2171a.this.f7378q.mo37872b();
            }
        }

        /* renamed from: b */
        public final void mo7776b() {
            if (C2171a.this.f7378q != null) {
                C2171a.this.f7378q.mo37873c();
            }
        }

        /* renamed from: c */
        public final boolean mo7778c() {
            if (C2171a.this.f7378q == null || C2171a.this.f7378q.mo37874d()) {
                return true;
            }
            return false;
        }

        private C2174a() {
        }

        /* renamed from: a */
        public final void mo7777a(boolean z) {
            if (C2171a.this.f7378q != null) {
                C2171a.this.f7378q.mo37871a(false);
            }
        }
    }

    /* renamed from: c */
    public final String mo7764c() {
        return this.f7382w;
    }

    /* renamed from: d */
    public final String mo7765d() {
        return this.f7383x;
    }

    /* renamed from: e */
    public final String mo7766e() {
        return this.f7384y;
    }

    /* renamed from: g */
    public final String mo7767g() {
        return this.f7385z;
    }

    /* renamed from: h */
    public final String mo7768h() {
        return this.f7370A;
    }

    /* renamed from: i */
    public final String mo7769i() {
        return this.f7372C;
    }

    /* renamed from: j */
    public final float mo7770j() {
        return this.f7371B;
    }

    /* renamed from: k */
    public final boolean mo7771k() {
        return true;
    }

    /* renamed from: m */
    private void m9448m() {
        boolean z;
        if (this.f7378q == null || !this.f7378q.mo37875e()) {
            z = false;
        } else {
            z = true;
        }
        this.f7373D = z;
    }

    /* renamed from: n */
    private void m9449n() {
        if (this.f7378q != null) {
            this.f7378q.mo37869a((C14872a) new C14872a() {
                /* renamed from: a */
                public final void mo7873a() {
                    super.mo7873a();
                    if (C2171a.this.f7177k != null) {
                        C2171a.this.f7177k.ar_();
                    }
                }

                /* renamed from: b */
                public final void mo7874b() {
                    super.mo7874b();
                    if (C2171a.this.f7177k != null) {
                        C2171a.this.f7177k.ar_();
                    }
                }

                /* renamed from: c */
                public final void mo7875c() {
                    super.mo7875c();
                    if (C2171a.this.f7177k != null) {
                        C2171a.this.f7177k.as_();
                    }
                }

                /* renamed from: d */
                public final void mo7876d() {
                    super.mo7876d();
                    if (C2171a.this.f7177k != null) {
                        C2171a.this.f7177k.at_();
                    }
                }
            });
            this.f7182p = new C2174a();
        }
    }

    /* renamed from: o */
    private MediaView m9450o() {
        ViewGroup viewGroup = this.f7381v;
        if (viewGroup.findViewById(f7369s) instanceof MediaView) {
            return (MediaView) viewGroup.findViewById(f7369s);
        }
        MediaView mediaView = new MediaView(viewGroup.getContext());
        mediaView.setId(f7369s);
        viewGroup.addView(mediaView, new LayoutParams(-1, -1));
        return mediaView;
    }

    /* renamed from: l */
    private void m9447l() {
        String str;
        this.f7382w = C2198a.m9502a(this.f7379t.mo37538a());
        this.f7383x = C2198a.m9502a(this.f7379t.mo37540c());
        if (this.f7379t.mo37543f() == null) {
            str = "";
        } else {
            str = this.f7379t.mo37543f().toString();
        }
        this.f7370A = str;
        if (!(this.f7379t.mo37539b() == null || this.f7379t.mo37539b().isEmpty() || this.f7379t.mo37539b().get(0) == null)) {
            C14749b bVar = (C14749b) this.f7379t.mo37539b().get(0);
            if (bVar.mo37500b() != null) {
                this.f7384y = bVar.mo37500b().toString();
            }
            if (bVar.mo37499a() != null) {
                this.f7374E = bVar.mo37499a().getIntrinsicWidth();
                this.f7375F = bVar.mo37499a().getIntrinsicHeight();
            }
        }
        if (!(this.f7379t.mo37541d() == null || this.f7379t.mo37541d() == null || this.f7379t.mo37541d().mo37500b() == null)) {
            this.f7385z = this.f7379t.mo37541d().mo37500b().toString();
        }
        if (this.f7379t.mo37544g() != null) {
            this.f7371B = this.f7379t.mo37544g().floatValue();
        }
        this.f7372C = C2198a.m9502a(this.f7379t.mo37542e());
        this.f7378q = this.f7379t.mo37547j();
        m9448m();
        if (this.f7373D && this.f7378q != null) {
            this.f7375F = 1000;
            this.f7374E = (int) (this.f7378q.mo37876f() * 1000.0f);
        }
    }

    /* renamed from: a */
    public final void mo7757a(ViewGroup[] viewGroupArr) {
        this.f7377H = viewGroupArr;
    }

    /* renamed from: a */
    public final boolean mo7758a(boolean z) {
        if (mo7761c_()) {
            return false;
        }
        if (this.f7182p != null) {
            this.f7182p.mo7776b();
        }
        this.f7380u = false;
        if (!z) {
            this.f7379t.mo37548k();
        }
        if (this.f7178l.findViewById(f7368r) != null) {
            UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView) this.f7178l.findViewById(f7368r);
            unifiedNativeAdView.setVisibility(8);
            if (this.f7175i == null || this.f7175i.isEmpty()) {
                mo7752a((View) this.f7178l);
            } else {
                for (View a : this.f7175i) {
                    mo7752a(a);
                }
            }
            unifiedNativeAdView.removeAllViews();
            unifiedNativeAdView.mo37468a();
            if (unifiedNativeAdView.getParent() instanceof ViewGroup) {
                ((ViewGroup) unifiedNativeAdView.getParent()).removeView(unifiedNativeAdView);
            }
        }
        if (this.f7377H != null) {
            for (ViewGroup removeAllViews : this.f7377H) {
                removeAllViews.removeAllViews();
            }
            this.f7377H = null;
        }
        View findViewById = this.f7178l.findViewById(f7369s);
        if (findViewById != null && (findViewById.getParent() instanceof ViewGroup)) {
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
        if (this.f7175i != null) {
            this.f7175i.clear();
        }
        return super.mo7758a(z);
    }

    /* renamed from: a */
    public final void mo7753a(ViewGroup viewGroup, int i) {
        if (!mo7761c_()) {
            this.f7381v = viewGroup;
            this.f7380u = true;
        }
    }

    /* renamed from: a */
    private void m9444a(ViewGroup viewGroup, UnifiedNativeAdView unifiedNativeAdView) {
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            if (this.f7377H != null) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.gravity = 5;
                AdChoicesView adChoicesView = new AdChoicesView(context, null);
                this.f7377H[0].addView(adChoicesView, layoutParams);
                unifiedNativeAdView.setAdChoicesView(adChoicesView);
            }
        }
    }

    /* renamed from: a */
    private void m9445a(ViewGroup viewGroup, List<View> list) {
        UnifiedNativeAdView unifiedNativeAdView;
        Context context = viewGroup.getContext();
        if (viewGroup.findViewById(f7368r) != null) {
            unifiedNativeAdView = (UnifiedNativeAdView) viewGroup.findViewById(f7368r);
        } else {
            UnifiedNativeAdView unifiedNativeAdView2 = new UnifiedNativeAdView(context, null);
            unifiedNativeAdView2.setId(f7368r);
            C2202e.m9513a(unifiedNativeAdView2, -1, -2);
            viewGroup.addView(unifiedNativeAdView2);
            unifiedNativeAdView = unifiedNativeAdView2;
        }
        boolean z = true;
        if (list == null || list.isEmpty()) {
            viewGroup.setClickable(true);
            unifiedNativeAdView.setImageView(viewGroup);
            unifiedNativeAdView.setCallToActionView(this.f7179m);
        } else {
            m9446a(unifiedNativeAdView, list);
        }
        unifiedNativeAdView.setVisibility(0);
        StringBuilder sb = new StringBuilder("mPendingBindVideo-->");
        sb.append(this.f7380u);
        sb.append(", mVideoContainer != null-->");
        if (this.f7381v == null) {
            z = false;
        }
        sb.append(z);
        if (this.f7380u && this.f7381v != null) {
            MediaView o = m9450o();
            if (o != null) {
                unifiedNativeAdView.setMediaView(o);
            }
            m9449n();
        }
        m9444a(viewGroup, unifiedNativeAdView);
        unifiedNativeAdView.setNativeAd(this.f7379t);
        unifiedNativeAdView.setClickable(false);
    }

    /* renamed from: a */
    private void m9446a(UnifiedNativeAdView unifiedNativeAdView, List<View> list) {
        if (unifiedNativeAdView != null && list != null) {
            if (list.size() > 0) {
                unifiedNativeAdView.setHeadlineView((View) list.get(0));
            }
            if (list.size() > 1) {
                unifiedNativeAdView.setBodyView((View) list.get(1));
            }
            if (list.size() > 2) {
                unifiedNativeAdView.setAdvertiserView((View) list.get(2));
            }
            if (list.size() > 3) {
                unifiedNativeAdView.setImageView((View) list.get(3));
            }
            if (list.size() > 4) {
                unifiedNativeAdView.setStoreView((View) list.get(4));
            }
            if (this.f7179m != null) {
                unifiedNativeAdView.setCallToActionView(this.f7179m);
                if (this.f7175i != null) {
                    this.f7175i.add(this.f7179m);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7754a(ViewGroup viewGroup, View view, List<View> list) {
        if (!mo7761c_()) {
            super.mo7754a(viewGroup, view, list);
            this.f7175i = list;
            m9445a(viewGroup, list);
            if (this.f7376G instanceof C2170b) {
                ((C2170b) this.f7376G).f7366a = new C14732b() {
                    /* renamed from: b */
                    public final void mo7869b() {
                        C2171a.this.mo7760b_();
                    }

                    /* renamed from: v_ */
                    public final void mo7870v_() {
                        C2171a.this.mo7759a_();
                    }
                };
            }
        }
    }

    public C2171a(Context context, C2142a aVar, C2143b bVar, C14761h hVar, String str, C14740a aVar2, String str2) {
        super(context, aVar, bVar, str2);
        this.f7379t = hVar;
        this.f7180n = str;
        this.f7376G = aVar2;
        m9447l();
    }
}

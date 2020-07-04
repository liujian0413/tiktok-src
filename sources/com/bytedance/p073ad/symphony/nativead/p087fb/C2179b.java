package com.bytedance.p073ad.symphony.nativead.p087fb;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.p073ad.symphony.p074a.p075a.C2082a;
import com.bytedance.p073ad.symphony.p074a.p075a.C2086c;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.p086i.C2164b;
import com.bytedance.p073ad.symphony.util.C2204g;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.C13098Ad;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.bidding.C13230b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ad.symphony.nativead.fb.b */
public final class C2179b extends C2082a implements C2086c {

    /* renamed from: r */
    private static final int f7397r = 2131297984;

    /* renamed from: s */
    private static final int f7398s = 2131297985;

    /* renamed from: t */
    private static final int f7399t = 2131301979;

    /* renamed from: q */
    public C13230b f7400q;

    /* renamed from: u */
    private MediaView f7401u;

    /* renamed from: v */
    private NativeAd f7402v;

    /* renamed from: w */
    private String f7403w;

    /* renamed from: x */
    private ViewGroup[] f7404x;

    /* renamed from: y */
    private int f7405y;

    /* renamed from: z */
    private long f7406z;

    /* renamed from: e */
    public final String mo7766e() {
        return "";
    }

    /* renamed from: g */
    public final String mo7767g() {
        return this.f7403w;
    }

    /* renamed from: j */
    public final float mo7770j() {
        return 0.0f;
    }

    /* renamed from: k */
    public final boolean mo7771k() {
        return true;
    }

    /* renamed from: m */
    public final long mo7773m() {
        return this.f7406z;
    }

    /* renamed from: d */
    public final String mo7765d() {
        return this.f7402v.getAdBodyText();
    }

    /* renamed from: h */
    public final String mo7768h() {
        return this.f7402v.getAdSocialContext();
    }

    /* renamed from: i */
    public final String mo7769i() {
        return this.f7402v.getAdCallToAction();
    }

    /* renamed from: o */
    private void m9475o() {
        this.f7402v.setAdListener(new NativeAdListener() {
            public final void onAdLoaded(C13098Ad ad) {
            }

            public final void onError(C13098Ad ad, AdError adError) {
            }

            public final void onMediaDownloaded(C13098Ad ad) {
            }

            public final void onAdClicked(C13098Ad ad) {
                C2179b.this.mo7759a_();
            }

            public final void onLoggingImpression(C13098Ad ad) {
                C2179b.this.mo7760b_();
            }
        });
    }

    /* renamed from: n */
    public final String mo7774n() {
        if (this.f7400q != null) {
            return this.f7400q.mo32422d();
        }
        return "";
    }

    /* renamed from: c */
    public final String mo7764c() {
        new StringBuilder("title-->").append(this.f7402v.getAdHeadline());
        return this.f7402v.getAdHeadline();
    }

    /* renamed from: l */
    public final double mo7772l() {
        if (this.f7400q == null || mo7750a()) {
            return 0.0d;
        }
        return this.f7400q.mo32425g();
    }

    /* renamed from: p */
    private void m9476p() {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        try {
            if (this.f7405y == 1) {
                mediaViewVideoRenderer = new C2185e(this.f7168b);
            } else {
                mediaViewVideoRenderer = new DefaultMediaViewVideoRenderer(this.f7168b);
            }
            this.f7182p = new C2182c(mediaViewVideoRenderer);
            this.f7401u.setVideoRenderer(mediaViewVideoRenderer);
            this.f7401u.setListener(new C2178a() {
                public final void onComplete(MediaView mediaView) {
                    if (C2179b.this.f7177k != null) {
                        C2179b.this.f7177k.at_();
                    }
                }

                public final void onPause(MediaView mediaView) {
                    if (C2179b.this.f7177k != null) {
                        C2179b.this.f7177k.as_();
                    }
                }

                public final void onPlay(MediaView mediaView) {
                    if (C2179b.this.f7177k != null) {
                        C2179b.this.f7177k.ar_();
                    }
                }
            });
        } catch (Exception e) {
            new StringBuilder("catch exception ").append(e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo7757a(ViewGroup[] viewGroupArr) {
        this.f7404x = viewGroupArr;
    }

    /* renamed from: a */
    private void m9473a(ViewGroup viewGroup) {
        ViewGroup[] viewGroupArr;
        Context context = viewGroup.getContext();
        if (this.f7404x != null) {
            viewGroupArr = this.f7404x;
        } else if (viewGroup.findViewById(f7397r) == null) {
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            ViewGroup[] viewGroupArr2 = {new FrameLayout(context)};
            viewGroupArr2[0].setId(f7397r);
            layoutParams.gravity = 5;
            viewGroup.addView(viewGroupArr2[0], layoutParams);
            viewGroupArr = viewGroupArr2;
        } else {
            View findViewById = viewGroup.findViewById(f7397r);
            if (findViewById instanceof FrameLayout) {
                viewGroupArr = new ViewGroup[]{(FrameLayout) findViewById};
            } else {
                viewGroupArr = null;
            }
        }
        if (viewGroupArr != null) {
            for (ViewGroup viewGroup2 : viewGroupArr) {
                NativeAdLayout nativeAdLayout = new NativeAdLayout(this.f7168b, (AttributeSet) null);
                LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                AdOptionsView adOptionsView = new AdOptionsView(context, this.f7402v, nativeAdLayout);
                adOptionsView.setIconColor(Color.parseColor("#00b2de"));
                viewGroup2.addView(nativeAdLayout, layoutParams2);
                nativeAdLayout.addView(adOptionsView, layoutParams2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7758a(boolean z) {
        if (mo7761c_()) {
            return false;
        }
        this.f7402v.unregisterView();
        this.f7402v.destroy();
        this.f7402v.setAdListener(null);
        new StringBuilder("willReuse:").append(z);
        ViewGroup viewGroup = this.f7178l;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(f7397r);
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        if (this.f7404x != null) {
            for (ViewGroup removeAllViews : this.f7404x) {
                removeAllViews.removeAllViews();
            }
            this.f7404x = null;
        }
        View findViewById = viewGroup.findViewById(f7398s);
        if (findViewById != null && (findViewById.getParent() instanceof ViewGroup)) {
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
        if (this.f7175i == null || this.f7175i.isEmpty()) {
            ArrayList<View> arrayList = new ArrayList<>();
            m9474a((List<View>) arrayList, (View) viewGroup);
            for (View a : arrayList) {
                mo7752a(a);
            }
        } else {
            for (View a2 : this.f7175i) {
                mo7752a(a2);
            }
        }
        if (this.f7175i != null) {
            this.f7175i.clear();
        }
        if (this.f7401u != null) {
            this.f7401u.destroy();
        }
        return super.mo7758a(z);
    }

    /* renamed from: a */
    private void m9474a(List<View> list, View view) {
        if (!(view instanceof AdOptionsView) && !(view instanceof C2164b)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m9474a(list, viewGroup.getChildAt(i));
                }
                return;
            }
            list.add(view);
        }
    }

    /* renamed from: a */
    public final void mo7753a(ViewGroup viewGroup, int i) {
        if (!mo7761c_()) {
            this.f7405y = i;
            if (viewGroup.findViewById(f7398s) instanceof MediaView) {
                this.f7401u = (MediaView) viewGroup.findViewById(f7398s);
                return;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            this.f7401u = new MediaView(viewGroup.getContext());
            this.f7401u.setId(f7398s);
            viewGroup.addView(this.f7401u, layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo7754a(ViewGroup viewGroup, View view, List<View> list) {
        if (!mo7761c_() && viewGroup != null) {
            super.mo7754a(viewGroup, view, list);
            this.f7175i = list;
            m9473a(viewGroup);
            m9476p();
            m9475o();
            Object tag = viewGroup.getTag(f7399t);
            if ((tag instanceof NativeAd) && tag != this.f7402v) {
                ((NativeAd) tag).unregisterView();
            }
            viewGroup.setTag(f7399t, this.f7402v);
            viewGroup.setClickable(true);
            this.f7402v.unregisterView();
            if (list == null) {
                list = new ArrayList<>();
                m9474a(list, (View) viewGroup);
            } else {
                list.add(this.f7179m);
                this.f7175i.add(this.f7179m);
            }
            try {
                this.f7402v.registerViewForInteraction((View) viewGroup, this.f7401u, list);
            } catch (Exception e) {
                C2204g.m9517a((Throwable) e);
            }
        }
    }

    public C2179b(Context context, C2142a aVar, C2143b bVar, NativeAd nativeAd, String str, String str2, String str3) {
        this(context, aVar, bVar, nativeAd, str, str2, null, str3, 0);
    }

    public C2179b(Context context, C2142a aVar, C2143b bVar, NativeAd nativeAd, String str, String str2, C13230b bVar2, String str3, long j) {
        super(context, aVar, bVar, str3);
        this.f7402v = nativeAd;
        this.f7180n = str;
        this.f7403w = str2;
        this.f7400q = bVar2;
        this.f7406z = j;
    }
}

package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.link.C24795l;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdData;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdData.C24987a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a.C25176a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25196d;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25210f;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchMixVideoDisplayStyle;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdView */
public class SearchAdView extends LinearLayout implements OnClickListener {

    /* renamed from: A */
    private final C25509b f67178A = new C25509b(this);

    /* renamed from: B */
    private float f67179B = 18.0f;

    /* renamed from: a */
    public DmtTextView f67180a;

    /* renamed from: b */
    private RemoteImageView f67181b;

    /* renamed from: c */
    private RemoteImageView f67182c;

    /* renamed from: d */
    private TextView f67183d;

    /* renamed from: e */
    private TextView f67184e;

    /* renamed from: f */
    private LinearLayout f67185f;

    /* renamed from: g */
    private LinearLayout f67186g;

    /* renamed from: h */
    private KeepRatioLayout f67187h;

    /* renamed from: i */
    private KeepRatioLayout f67188i;

    /* renamed from: j */
    private RemoteImageView f67189j;

    /* renamed from: k */
    private ConstraintLayout f67190k;

    /* renamed from: l */
    private LinearLayout f67191l;

    /* renamed from: m */
    private DmtTextView f67192m;

    /* renamed from: n */
    private LinearLayout f67193n;

    /* renamed from: o */
    private DmtTextView f67194o;

    /* renamed from: p */
    private FrameLayout f67195p;

    /* renamed from: q */
    private View f67196q;

    /* renamed from: r */
    private View f67197r;

    /* renamed from: s */
    private C24795l f67198s;

    /* renamed from: t */
    private CountDownTimer f67199t;

    /* renamed from: u */
    private SearchAdData f67200u;

    /* renamed from: v */
    private View f67201v;

    /* renamed from: w */
    private Rect f67202w;

    /* renamed from: x */
    private boolean f67203x;

    /* renamed from: y */
    private long f67204y;

    /* renamed from: z */
    private long f67205z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdView$ViewHolder */
    public static class ViewHolder extends C1293v {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdView$a */
    static class C25508a implements OnClickListener {

        /* renamed from: a */
        private final Context f67207a;

        /* renamed from: b */
        private final SearchAdData f67208b;

        /* renamed from: c */
        private final C24987a f67209c;

        /* renamed from: d */
        private final int f67210d;

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String a = C1642a.m8035a(Locale.US, "sq_module%d", new Object[]{Integer.valueOf(this.f67210d + 1)});
            C24958f.m81905a().mo65266a("result_ad").mo65276b("click").mo65264a(Long.valueOf(this.f67208b.f65873id)).mo65283e(a).mo65286h(this.f67208b.logExtra).mo65270a(this.f67207a);
            C25196d.m82879a(this.f67207a, new C25176a().mo65772c(this.f67209c.f65877d).mo65771b(true).mo65777g(this.f67209c.f65878e).mo65766a(new C33472a().mo85794e(C25210f.m82902a(this.f67209c.f65877d, this.f67209c.f65878e)).mo85790a()).mo65775e(this.f67209c.f65876c).mo65776f(this.f67209c.f65875b).mo65764a(this.f67208b.f65873id).mo65770b(this.f67208b.logExtra).mo65778h("result_ad").mo65779i(a).f66436a).mo65822a();
        }

        C25508a(Context context, SearchAdData searchAdData, C24987a aVar, int i) {
            this.f67207a = context;
            this.f67208b = searchAdData;
            this.f67209c = aVar;
            this.f67210d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdView$b */
    static class C25509b extends C1281m implements OnLayoutChangeListener {

        /* renamed from: a */
        private final SearchAdView f67211a;

        C25509b(SearchAdView searchAdView) {
            this.f67211a = searchAdView;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            this.f67211a.mo66245c();
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f67211a.mo66245c();
        }
    }

    /* renamed from: l */
    private boolean m83878l() {
        if (this.f67200u.nativeType == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m83879m() {
        if (this.f67200u.nativeType == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private View m83871e() {
        View view = this;
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return view;
            }
            if (parent instanceof RecyclerView) {
                return (View) parent;
            }
            if (!(parent instanceof View)) {
                return view;
            }
            view = (View) parent;
        }
    }

    /* renamed from: k */
    private boolean m83877k() {
        if (m83878l() || m83879m()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo66241a() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f67188i.getLayoutParams();
        marginLayoutParams.topMargin = C23486n.m77122a(24.0d);
        this.f67188i.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: b */
    public final void mo66243b() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f67188i.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f67188i.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: c */
    public final void mo66245c() {
        this.f67204y = System.currentTimeMillis();
        postDelayed(new C25587i(this), 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void mo66246d() {
        if (this.f67200u != null && this.f67205z < this.f67204y) {
            this.f67205z = System.currentTimeMillis();
            if (this.f67202w == null) {
                this.f67202w = new Rect();
            }
            if (!getGlobalVisibleRect(this.f67202w) || this.f67202w.isEmpty()) {
                this.f67203x = false;
            } else if (!this.f67203x) {
                this.f67203x = true;
                m83873g();
            }
        }
    }

    /* renamed from: g */
    private void m83873g() {
        String str;
        if (this.f67200u != null && this.f67200u.adType != 1) {
            if (m83877k()) {
                str = "flash";
            } else {
                str = "superstar_region";
            }
            C24976t.m82068a(getContext(), Long.toString(this.f67200u.f65873id), str, this.f67200u.logExtra);
            C24962g.m81952a((C24939aj) new C25588j(this), this.f67200u.trackUrlList, true);
        }
    }

    /* renamed from: h */
    private void m83874h() {
        this.f67188i.setVisibility(8);
        this.f67187h.setVisibility(8);
        this.f67190k.setVisibility(8);
        this.f67196q.setVisibility(0);
        setPadding(C23486n.m77122a(16.0d), 0, 0, 0);
        if (this.f67198s == null) {
            this.f67198s = new C24795l(this.f67197r);
        }
        this.f67198s.mo64827a(this.f67200u);
        this.f67197r.setVisibility(0);
    }

    /* renamed from: i */
    private void m83875i() {
        if (this.f67191l != null) {
            if (TextUtils.isEmpty(this.f67200u.guideText) || !m83877k()) {
                this.f67191l.setVisibility(8);
            } else {
                this.f67191l.setVisibility(0);
                if (this.f67192m != null) {
                    this.f67192m.setText(this.f67200u.guideText);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f67201v = m83871e();
        if (this.f67201v instanceof RecyclerView) {
            ((RecyclerView) this.f67201v).mo5528a((C1281m) this.f67178A);
        } else {
            this.f67201v.addOnLayoutChangeListener(this.f67178A);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f67201v instanceof RecyclerView) {
            ((RecyclerView) this.f67201v).mo5545b((C1281m) this.f67178A);
        } else {
            this.f67201v.removeOnLayoutChangeListener(this.f67178A);
        }
        this.f67201v = null;
        if (this.f67199t != null) {
            this.f67199t.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f67181b = (RemoteImageView) findViewById(R.id.d03);
        this.f67182c = (RemoteImageView) findViewById(R.id.czt);
        this.f67183d = (TextView) findViewById(R.id.d09);
        this.f67184e = (TextView) findViewById(R.id.d08);
        this.f67185f = (LinearLayout) findViewById(R.id.czs);
        this.f67186g = (LinearLayout) findViewById(R.id.c8);
        this.f67187h = (KeepRatioLayout) findViewById(R.id.c9);
        this.f67188i = (KeepRatioLayout) findViewById(R.id.d05);
        this.f67189j = (RemoteImageView) findViewById(R.id.d1f);
        this.f67190k = (ConstraintLayout) findViewById(R.id.czv);
        this.f67191l = (LinearLayout) findViewById(R.id.d00);
        this.f67192m = (DmtTextView) findViewById(R.id.d01);
        this.f67193n = (LinearLayout) findViewById(R.id.czw);
        this.f67194o = (DmtTextView) findViewById(R.id.czy);
        this.f67180a = (DmtTextView) findViewById(R.id.czx);
        try {
            this.f67180a.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "DIN-Condensed-Bold.otf"));
        } catch (Exception unused) {
        }
        this.f67195p = (FrameLayout) findViewById(R.id.czz);
        this.f67196q = findViewById(R.id.czu);
        this.f67197r = findViewById(R.id.ci);
        this.f67188i.mo66181a(750, 272, 1);
        setOnClickListener(this);
        this.f67190k.setOnClickListener(this);
    }

    /* renamed from: j */
    private void m83876j() {
        if (this.f67193n != null) {
            if (m83877k()) {
                if (this.f67194o != null) {
                    if (!TextUtils.isEmpty(this.f67200u.subText)) {
                        this.f67194o.setText(this.f67200u.subText);
                        this.f67194o.setVisibility(0);
                    } else {
                        this.f67194o.setVisibility(8);
                    }
                }
                if (this.f67180a != null) {
                    if (m83878l()) {
                        this.f67180a.setVisibility(0);
                        long currentTimeMillis = System.currentTimeMillis();
                        if ((this.f67200u.countDownTimeStamp * 1000) - currentTimeMillis > 0) {
                            C255071 r9 = new CountDownTimer((this.f67200u.countDownTimeStamp * 1000) - currentTimeMillis, 1000) {
                                public final void onFinish() {
                                    SearchAdView.this.f67180a.setText("00 : 00 : 00");
                                }

                                public final void onTick(long j) {
                                    int i = (int) (j / 1000);
                                    int i2 = i / 60;
                                    SearchAdView.this.f67180a.setText(C1642a.m8035a(Locale.getDefault(), "%02d : %02d : %02d", new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60), Integer.valueOf(i % 60)}));
                                }
                            };
                            this.f67199t = r9;
                            this.f67199t.start();
                        } else {
                            this.f67180a.setText("00 : 00 : 00");
                        }
                    } else {
                        this.f67180a.setVisibility(8);
                    }
                }
                if (this.f67195p != null) {
                    this.f67195p.removeAllViews();
                    if (C6307b.m19566a((Collection<T>) this.f67200u.iconList) || !m83879m()) {
                        this.f67195p.setVisibility(8);
                    } else {
                        this.f67195p.setVisibility(0);
                        Context context = getContext();
                        int b = (int) C9738o.m28708b(context, 20.0f);
                        int b2 = (int) C9738o.m28708b(context, 16.0f);
                        int b3 = (int) C9738o.m28708b(context, 2.0f);
                        int size = (this.f67200u.iconList.size() - 1) * b2;
                        for (int size2 = this.f67200u.iconList.size() - 1; size2 >= 0; size2--) {
                            AvatarWithBorderView avatarWithBorderView = new AvatarWithBorderView(context);
                            avatarWithBorderView.setBorderColor(R.color.a8t);
                            avatarWithBorderView.setBorderWidthPx(b3);
                            C23323e.m76524b(avatarWithBorderView, (UrlModel) this.f67200u.iconList.get(size2));
                            LayoutParams layoutParams = new LayoutParams(b, b);
                            layoutParams.setMargins(size, 0, 0, 0);
                            this.f67195p.addView(avatarWithBorderView, layoutParams);
                            size -= b2;
                        }
                    }
                }
                this.f67193n.setVisibility(8);
                int childCount = this.f67193n.getChildCount();
                int i = 0;
                while (i < childCount) {
                    View childAt = this.f67193n.getChildAt(i);
                    if (childAt == null || childAt.getVisibility() != 0) {
                        i++;
                    } else {
                        this.f67193n.setVisibility(0);
                    }
                }
                return;
            }
            this.f67193n.setVisibility(8);
        }
    }

    public SearchAdView(Context context) {
        super(context);
    }

    private void setupBottomDivideLine(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f67196q.getLayoutParams();
        layoutParams.topMargin = i;
        this.f67196q.setLayoutParams(layoutParams);
    }

    public void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        if (view != null && this.f67200u != null && this.f67200u.adType != 1) {
            if (view.getId() != R.id.czv || m83877k()) {
                if (m83877k()) {
                    str = "flash";
                } else {
                    str = "card";
                }
                C24976t.m82162b(getContext(), Long.toString(this.f67200u.f65873id), str, this.f67200u.logExtra);
                C24962g.m81952a((C24939aj) new C25586h(this), this.f67200u.clickTrackUrlList, true);
                C25196d.m82879a(getContext(), new C25176a().mo65772c(this.f67200u.openUrl).mo65774d("result_ad").mo65771b(true).mo65777g(this.f67200u.mpUrl).mo65766a(new C33472a().mo85794e(C25210f.m82902a(this.f67200u.openUrl, this.f67200u.mpUrl)).mo85790a()).mo65775e(this.f67200u.webUrl).mo65776f(this.f67200u.webTitle).mo65764a(this.f67200u.f65873id).mo65770b(this.f67200u.logExtra).mo65778h("result_ad").mo65779i(str).f66436a).mo65822a();
                return;
            }
            C24976t.m82162b(getContext(), Long.toString(this.f67200u.f65873id), "photoname", this.f67200u.logExtra);
            if (this.f67200u.advertisementInfo != null) {
                UserProfileActivity.m117387a(getContext(), this.f67200u.advertisementInfo);
            }
        }
    }

    public void setup(SearchAdData searchAdData) {
        int i;
        int i2;
        int i3;
        this.f67200u = searchAdData;
        if (searchAdData.adType == 1) {
            m83874h();
            return;
        }
        this.f67188i.setVisibility(0);
        this.f67187h.setVisibility(0);
        this.f67197r.setVisibility(8);
        setPadding(C23486n.m77122a(16.0d), 0, C23486n.m77122a(16.0d), 0);
        if (searchAdData.imageList != null && !searchAdData.imageList.isEmpty()) {
            C23323e.m76524b(this.f67181b, (UrlModel) searchAdData.imageList.get(0));
        }
        IMiniAppService a = C7167b.m22380b().mo18647a();
        if (!TextUtils.isEmpty(searchAdData.openUrl)) {
            a.preloadMiniApp(searchAdData.openUrl);
        }
        if (!TextUtils.isEmpty(searchAdData.mpUrl)) {
            a.preloadMiniApp(searchAdData.mpUrl);
        }
        if (!TextUtils.isEmpty(searchAdData.label)) {
            this.f67184e.setText(searchAdData.label);
        } else {
            this.f67184e.setText(R.string.ee);
        }
        if (searchAdData.advertisementInfo == null || searchAdData.advertisementInfo.getAvatarThumb() == null) {
            this.f67182c.setVisibility(8);
        } else {
            C23323e.m76524b(this.f67182c, searchAdData.advertisementInfo.getAvatarThumb());
            this.f67182c.setVisibility(0);
        }
        if (!TextUtils.isEmpty(searchAdData.title)) {
            this.f67183d.setText(searchAdData.title);
            this.f67183d.setVisibility(0);
        } else {
            this.f67183d.setVisibility(8);
        }
        LinearLayout linearLayout = this.f67185f;
        if (!(this.f67182c.getVisibility() == 0 && this.f67183d.getVisibility() == 0) && !m83877k()) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        this.f67190k.setVisibility(this.f67185f.getVisibility());
        this.f67196q.setVisibility(this.f67185f.getVisibility());
        this.f67186g.removeAllViews();
        if (searchAdData.advancedInfoList != null && !searchAdData.advancedInfoList.isEmpty()) {
            LayoutInflater from = LayoutInflater.from(getContext());
            for (int i4 = 0; i4 < searchAdData.advancedInfoList.size(); i4++) {
                C24987a aVar = (C24987a) searchAdData.advancedInfoList.get(i4);
                if (aVar != null) {
                    if (!TextUtils.isEmpty(aVar.f65877d)) {
                        a.preloadMiniApp(aVar.f65877d);
                    }
                    if (!TextUtils.isEmpty(aVar.f65878e)) {
                        a.preloadMiniApp(aVar.f65878e);
                    }
                    if (this.f67186g.getChildCount() > 0) {
                        from.inflate(R.layout.a2_, this.f67186g);
                    }
                    View inflate = from.inflate(R.layout.a29, this.f67186g, false);
                    RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.d04);
                    View findViewById = inflate.findViewById(R.id.d06);
                    DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.d07);
                    C23323e.m76524b(remoteImageView, aVar.f65879f);
                    dmtTextView.setText(aVar.f65874a);
                    inflate.setOnClickListener(new C25508a(getContext(), searchAdData, aVar, i4));
                    if (TextUtils.isEmpty(aVar.f65874a.trim())) {
                        findViewById.setVisibility(8);
                    }
                    this.f67186g.addView(inflate);
                }
            }
        }
        if (this.f67186g.getChildCount() > 0) {
            this.f67187h.mo66181a(310, 76, 1);
        } else {
            this.f67187h.mo66180a();
        }
        if (this.f67189j != null) {
            if (!m83877k() || searchAdData.imageList == null || searchAdData.imageList.isEmpty()) {
                this.f67181b.setVisibility(0);
                this.f67189j.setVisibility(8);
            } else {
                this.f67181b.setVisibility(8);
                this.f67189j.setVisibility(0);
                C23323e.m76524b(this.f67189j, (UrlModel) searchAdData.imageList.get(0));
            }
        }
        m83875i();
        m83876j();
        if (this.f67193n != null) {
            if (this.f67193n.getVisibility() == 0) {
                i3 = (int) C9738o.m28708b(getContext(), 12.0f);
            } else {
                i3 = 0;
            }
            this.f67185f.setPadding(this.f67185f.getPaddingLeft(), i3, this.f67185f.getPaddingRight(), this.f67186g.getPaddingBottom());
        }
        if (this.f67190k != null) {
            if (m83877k()) {
                this.f67190k.setBackgroundResource(R.drawable.rt);
                setupBottomDivideLine((int) C9738o.m28708b(getContext(), 16.0f));
            } else {
                this.f67190k.setBackgroundColor(0);
                setupBottomDivideLine(0);
                View view = this.f67196q;
                if (C6384b.m19835a().mo15287a(SearchMixVideoDisplayStyle.class, true, "search_mix_multi_mod", C6384b.m19835a().mo15295d().search_mix_multi_mod, 0) == 0) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
                if (this.f67196q != null && this.f67190k.getVisibility() == 8 && this.f67196q.getVisibility() == 0) {
                    setupBottomDivideLine((int) C9738o.m28708b(getContext(), this.f67179B));
                }
            }
        }
        this.f67203x = false;
        mo66245c();
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo66242a(String str, String str2, long j) {
        C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65257a(this.f67200u).mo65270a(getContext());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo66244b(String str, String str2, long j) {
        C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65257a(this.f67200u).mo65270a(getContext());
    }
}

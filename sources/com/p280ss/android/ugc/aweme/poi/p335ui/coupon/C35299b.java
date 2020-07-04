package com.p280ss.android.ugc.aweme.poi.p335ui.coupon;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35007b;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35409r;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35303c.C35304a;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.b */
public final class C35299b extends Dialog {

    /* renamed from: a */
    public CouponInfo f92545a;

    /* renamed from: b */
    public boolean f92546b;

    /* renamed from: c */
    public String f92547c;

    /* renamed from: d */
    public final boolean f92548d;

    /* renamed from: e */
    public final PoiSimpleBundle f92549e;

    /* renamed from: f */
    public final C35304a f92550f;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.b$a */
    static final class C35300a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35299b f92551a;

        C35300a(C35299b bVar) {
            this.f92551a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92551a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.b$b */
    static final class C35301b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35299b f92552a;

        C35301b(C35299b bVar) {
            this.f92552a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f92552a.f92546b && !TextUtils.isEmpty(this.f92552a.f92547c)) {
                C35409r.f92878a = "coupon_toast";
                C35299b bVar = this.f92552a;
                String str = this.f92552a.f92547c;
                if (str == null) {
                    C7573i.m23580a();
                }
                Context context = this.f92552a.getContext();
                C7573i.m23582a((Object) context, "context");
                String string = context.getResources().getString(R.string.d0d);
                C7573i.m23582a((Object) string, "context.resources.getString(R.string.poi_reserve)");
                bVar.mo89846a(str, string);
                C35007b.m113003a("click", "reserve", "poi_page", "coupon_toast", this.f92552a.f92549e);
                this.f92552a.mo89845a("click_reserve");
            } else if (this.f92552a.f92548d) {
                this.f92552a.mo89845a("click_share_friend");
                C35304a aVar = this.f92552a.f92550f;
                if (aVar != null) {
                    aVar.mo89716F();
                }
            } else {
                this.f92552a.mo89845a("click_first_ok");
            }
            this.f92552a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.b$c */
    static final class C35302c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35299b f92553a;

        C35302c(C35299b bVar) {
            this.f92553a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f92553a.f92545a != null) {
                this.f92553a.mo89845a("click_first_look");
                C35454m.m114523a(this.f92553a.f92549e, "enter_card_bag", C22984d.m75611a().mo59973a("enter_from", "poi_page"));
                SmartRouter.buildRoute(this.f92553a.getContext(), "//coupon").withParam("is_coupon_valid", true).open();
            }
            this.f92553a.dismiss();
        }
    }

    public final void show() {
        super.show();
        if (this.f92546b) {
            m113957b("click_reserve");
        } else if (this.f92548d) {
            m113957b("click_first_coupon_share_friend");
        } else {
            m113957b("click_first_coupon");
        }
    }

    /* renamed from: b */
    private final void m113956b() {
        ((ImageView) findViewById(R.id.x_)).setOnClickListener(new C35300a(this));
        ((DmtTextView) findViewById(R.id.c8b)).setOnClickListener(new C35301b(this));
        ((DmtTextView) findViewById(R.id.ash)).setOnClickListener(new C35302c(this));
    }

    /* renamed from: a */
    private final void m113955a() {
        setCanceledOnTouchOutside(false);
        CouponInfo couponInfo = this.f92545a;
        if (couponInfo != null) {
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.a4f);
            C7573i.m23582a((Object) dmtTextView, "coupon_valid_date");
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            String string = context.getResources().getString(R.string.aii);
            C7573i.m23582a((Object) string, "context.resources.getStr…oupon_valid_start_to_end)");
            String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{couponInfo.getValidStart(), couponInfo.getValidEnd()}, 2));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            dmtTextView.setText(a);
            if (this.f92546b) {
                ((DmtTextView) findViewById(R.id.c8b)).setText(R.string.czf);
                DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.ash);
                C7573i.m23582a((Object) dmtTextView2, "go_coupon_detail");
                dmtTextView2.setVisibility(8);
            } else {
                if (this.f92548d) {
                    ((DmtTextView) findViewById(R.id.c8b)).setText(R.string.aib);
                } else {
                    ((DmtTextView) findViewById(R.id.c8b)).setText(R.string.fka);
                }
                DmtTextView dmtTextView3 = (DmtTextView) findViewById(R.id.ash);
                C7573i.m23582a((Object) dmtTextView3, "go_coupon_detail");
                dmtTextView3.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.li);
        m113955a();
        m113956b();
    }

    /* renamed from: a */
    public final void mo89845a(String str) {
        String str2;
        PoiSimpleBundle poiSimpleBundle = this.f92549e;
        String str3 = "click_coupon_toast";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", str);
        String str4 = "coupon_id";
        CouponInfo couponInfo = this.f92545a;
        if (couponInfo == null) {
            C7573i.m23580a();
        }
        C22984d a2 = a.mo59970a(str4, couponInfo.getCouponId());
        String str5 = "poi_id";
        PoiSimpleBundle poiSimpleBundle2 = this.f92549e;
        if (poiSimpleBundle2 != null) {
            str2 = poiSimpleBundle2.getPoiId();
        } else {
            str2 = null;
        }
        C35454m.m114523a(poiSimpleBundle, str3, a2.mo59973a(str5, str2));
    }

    /* renamed from: b */
    private final void m113957b(String str) {
        String str2;
        PoiSimpleBundle poiSimpleBundle = this.f92549e;
        String str3 = "show_coupon_toast";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", str);
        String str4 = "coupon_id";
        CouponInfo couponInfo = this.f92545a;
        if (couponInfo == null) {
            C7573i.m23580a();
        }
        C22984d a2 = a.mo59970a(str4, couponInfo.getCouponId());
        String str5 = "poi_id";
        PoiSimpleBundle poiSimpleBundle2 = this.f92549e;
        if (poiSimpleBundle2 != null) {
            str2 = poiSimpleBundle2.getPoiId();
        } else {
            str2 = null;
        }
        C35454m.m114523a(poiSimpleBundle, str3, a2.mo59973a(str5, str2));
    }

    /* renamed from: a */
    public final void mo89846a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("title", str2);
        bundle.putBoolean("hide_nav_bar", false);
        bundle.putBoolean("hide_status_bar", false);
        bundle.putBoolean("use_webview_title", false);
        bundle.putBoolean("show_closeall", true);
        C35460p.m114545a(getContext(), str, bundle);
    }

    public C35299b(Context context, CouponInfo couponInfo, boolean z, String str, boolean z2, PoiSimpleBundle poiSimpleBundle, C35304a aVar) {
        C7573i.m23587b(context, "context");
        super(context, R.style.ug);
        this.f92545a = couponInfo;
        this.f92546b = z;
        this.f92547c = str;
        this.f92548d = z2;
        this.f92549e = poiSimpleBundle;
        this.f92550f = aVar;
    }
}

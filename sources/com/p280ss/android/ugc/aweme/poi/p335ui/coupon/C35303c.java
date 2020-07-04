package com.p280ss.android.ugc.aweme.poi.p335ui.coupon;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.c */
public final class C35303c extends Dialog {

    /* renamed from: a */
    public final String f92554a;

    /* renamed from: b */
    public final PoiSimpleBundle f92555b;

    /* renamed from: c */
    public final C35304a f92556c;

    /* renamed from: d */
    private final String f92557d;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.c$a */
    public interface C35304a {
        /* renamed from: F */
        void mo89716F();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.c$b */
    static final class C35305b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35303c f92558a;

        C35305b(C35303c cVar) {
            this.f92558a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92558a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.c$c */
    static final class C35306c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35303c f92559a;

        C35306c(C35303c cVar) {
            this.f92559a = cVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            PoiSimpleBundle poiSimpleBundle = this.f92559a.f92555b;
            String str2 = "click_coupon_toast";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "click_share_friend").mo59973a("coupon_id", this.f92559a.f92554a);
            String str3 = "poi_id";
            PoiSimpleBundle poiSimpleBundle2 = this.f92559a.f92555b;
            if (poiSimpleBundle2 != null) {
                str = poiSimpleBundle2.getPoiId();
            } else {
                str = null;
            }
            C35454m.m114523a(poiSimpleBundle, str2, a.mo59973a(str3, str));
            C35304a aVar = this.f92559a.f92556c;
            if (aVar != null) {
                aVar.mo89716F();
            }
            this.f92559a.dismiss();
        }
    }

    /* renamed from: a */
    private final void m113960a() {
        setCanceledOnTouchOutside(false);
        String str = this.f92557d;
        if (str != null) {
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.d52);
            C7573i.m23582a((Object) dmtTextView, "share_content");
            dmtTextView.setText(str);
        }
    }

    /* renamed from: b */
    private final void m113961b() {
        ((ImageView) findViewById(R.id.x_)).setOnClickListener(new C35305b(this));
        ((DmtTextView) findViewById(R.id.c8b)).setOnClickListener(new C35306c(this));
    }

    public final void show() {
        String str;
        super.show();
        PoiSimpleBundle poiSimpleBundle = this.f92555b;
        String str2 = "show_coupon_toast";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", "share_friend").mo59973a("coupon_id", this.f92554a);
        String str3 = "poi_id";
        PoiSimpleBundle poiSimpleBundle2 = this.f92555b;
        if (poiSimpleBundle2 != null) {
            str = poiSimpleBundle2.getPoiId();
        } else {
            str = null;
        }
        C35454m.m114523a(poiSimpleBundle, str2, a.mo59973a(str3, str));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.lg);
        m113960a();
        m113961b();
    }

    public C35303c(Context context, String str, String str2, PoiSimpleBundle poiSimpleBundle, C35304a aVar) {
        C7573i.m23587b(context, "context");
        super(context, R.style.ug);
        this.f92557d = str;
        this.f92554a = str2;
        this.f92555b = poiSimpleBundle;
        this.f92556c = aVar;
    }
}

package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35456o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.r */
public final class C35409r extends Dialog {

    /* renamed from: a */
    public static String f92878a = "";

    /* renamed from: b */
    private boolean f92879b;

    /* renamed from: c */
    private PoiSimpleBundle f92880c;

    /* renamed from: d */
    private RemoteImageView f92881d;

    /* renamed from: e */
    private View f92882e;

    /* renamed from: a */
    private void m114378a() {
        String a = C6903bc.m21496o().mo88908a("poi_resource", "imagePOIOrder.png");
        m114380a("imagePOIOrder.png", !TextUtils.isEmpty(a));
        if (TextUtils.isEmpty(a)) {
            this.f92882e.setVisibility(8);
        } else {
            C23323e.m76514a(this.f92881d, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90151a(View view) {
        m114379a("click");
        dismiss();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.kx);
        setCanceledOnTouchOutside(false);
        this.f92882e = findViewById(R.id.a8c);
        this.f92881d = (RemoteImageView) findViewById(R.id.a8b);
        findViewById(R.id.a8d).setOnClickListener(new C35410s(this));
        m114378a();
        m114379a("show");
    }

    /* renamed from: a */
    private void m114379a(String str) {
        String str2;
        PoiSimpleBundle poiSimpleBundle = this.f92880c;
        String str3 = "poi_puscene_success";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("previous_page", this.f92880c.getPreviousPage()).mo59973a("enter_method", str).mo59973a("poi_id", this.f92880c.getPoiId());
        String str4 = "content_type";
        if (this.f92879b) {
            str2 = "reserve";
        } else {
            str2 = "queue";
        }
        C35454m.m114523a(poiSimpleBundle, str3, a.mo59973a(str4, str2).mo59973a("poi_posititon", ""));
    }

    /* renamed from: a */
    public static boolean m114381a(Context context) {
        long c = C6887b.m21436b().mo16910c(context, "order_guide_displayed");
        long currentTimeMillis = System.currentTimeMillis();
        if (c <= 0) {
            C6887b.m21436b().mo16899a(context, "order_guide_displayed", currentTimeMillis);
            return true;
        } else if (currentTimeMillis <= c || currentTimeMillis - c <= 604800000) {
            return false;
        } else {
            C6887b.m21436b().mo16899a(context, "order_guide_displayed", currentTimeMillis);
            return true;
        }
    }

    /* renamed from: a */
    private static void m114380a(String str, boolean z) {
        C6869c a = C6869c.m21381a();
        a.mo16887a("action", str);
        a.mo16885a("success", Integer.valueOf(z ? 1 : 0));
        C35456o.m114538a("resource_preload_error_rate", a.mo16888b());
    }

    public C35409r(Activity activity, boolean z, PoiSimpleBundle poiSimpleBundle) {
        super(activity, R.style.uu);
        this.f92879b = z;
        this.f92880c = poiSimpleBundle;
    }
}

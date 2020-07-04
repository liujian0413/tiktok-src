package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.poi.model.PoiCommodity;
import com.p280ss.android.ugc.aweme.poi.utils.C35442b;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.e */
public final class C35045e {

    /* renamed from: a */
    public static final C35045e f91649a = new C35045e();

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.e$a */
    public static final class C35046a implements C23305g {

        /* renamed from: a */
        final /* synthetic */ Context f91650a;

        /* renamed from: b */
        final /* synthetic */ PoiCommodity f91651b;

        /* renamed from: c */
        final /* synthetic */ String f91652c;

        /* renamed from: d */
        final /* synthetic */ String f91653d;

        /* renamed from: e */
        final /* synthetic */ String f91654e;

        /* renamed from: f */
        final /* synthetic */ String f91655f;

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo58663a() {
            Context context = this.f91650a;
            String a = C35045e.m113151a(this.f91650a, this.f91653d, this.f91654e, this.f91655f);
            String string = this.f91650a.getResources().getString(R.string.czo);
            C7573i.m23582a((Object) string, "it.resources.getString(R.string.poi_queue)");
            C35045e.m113153a(context, a, string);
        }

        C35046a(Context context, PoiCommodity poiCommodity, String str, String str2, String str3, String str4) {
            this.f91650a = context;
            this.f91651b = poiCommodity;
            this.f91652c = str;
            this.f91653d = str2;
            this.f91654e = str3;
            this.f91655f = str4;
        }
    }

    private C35045e() {
    }

    /* renamed from: a */
    public static final void m113153a(Context context, String str, String str2) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "title");
        if (context != null) {
            Bundle bundle = new Bundle();
            bundle.putString("title", str2);
            bundle.putBoolean("hide_nav_bar", false);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("use_webview_title", false);
            bundle.putBoolean("show_closeall_and_back", true);
            C35460p.m114545a(context, str, bundle);
        }
    }

    /* renamed from: a */
    private static final void m113154a(Context context, String str, String str2, C23305g gVar) {
        if (!(context instanceof Activity)) {
            context = null;
        }
        if (context == null) {
            return;
        }
        if (context != null) {
            C32656f.m105745a((Activity) context, str2, str, gVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    public static final String m113151a(Context context, String str, String str2, String str3) {
        LocationResult a = C32640a.m105721a().mo84021a();
        String str4 = "";
        double[] dArr = new double[2];
        if (a != null && a.isValid() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                dArr[0] = Double.parseDouble(str);
                dArr[1] = Double.parseDouble(str2);
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
            str4 = String.valueOf(C35442b.m114466a(dArr, new double[]{a.getLatitude(), a.getLongitude()}));
        }
        if (C7634n.m23776c((CharSequence) str3, (CharSequence) "?", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append("&distance=");
            sb.append(str4);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append("?distance=");
        sb2.append(str4);
        return sb2.toString();
    }

    /* renamed from: a */
    public static final void m113152a(Context context, PoiCommodity poiCommodity, String str, String str2, String str3, String str4) {
        C7573i.m23587b(poiCommodity, "poiCommodity");
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str4, "queueUrl");
        if (context != null) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (!f.isLogin()) {
                C35046a aVar = new C35046a(context, poiCommodity, str, str2, str3, str4);
                m113154a(context, "queue", str, (C23305g) aVar);
            } else {
                String a = m113151a(context, str2, str3, str4);
                String string = context.getResources().getString(R.string.czo);
                C7573i.m23582a((Object) string, "it.resources.getString(R.string.poi_queue)");
                m113153a(context, a, string);
            }
        }
    }
}

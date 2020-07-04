package com.p280ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiOptionStruct;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.router.C37286v;
import com.p280ss.android.ugc.aweme.router.C7195s;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.c */
public final class C35014c {

    /* renamed from: a */
    public String f91468a;

    /* renamed from: b */
    public int f91469b;

    /* renamed from: c */
    public String f91470c;

    /* renamed from: d */
    private PoiSimpleBundle f91471d;

    /* renamed from: a */
    private final void m113043a(PoiClassRankBannerStruct poiClassRankBannerStruct) {
        PoiOptionStruct classOption = poiClassRankBannerStruct.getClassOption();
        C7573i.m23582a((Object) classOption, "struct.classOption");
        C35454m.m114523a(this.f91471d, "enter_poi_leaderboard", C22984d.m75611a().mo59973a("enter_from", this.f91468a).mo59973a("city_info", C33230ac.m107204a()).mo59973a("enter_method", "click_leaderboard_banner").mo59973a("poi_channel", this.f91470c).mo59973a("sub_class", classOption.getName()).mo59973a("district_code", poiClassRankBannerStruct.getDistrictCode()));
    }

    /* renamed from: b */
    private final void m113045b(PoiClassRankBannerStruct poiClassRankBannerStruct) {
        CharSequence charSequence;
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f91468a).mo59973a("enter_method", "click_poi_banner").mo59973a("banner_id", poiClassRankBannerStruct.getBid());
        String str = "tag_id";
        String schema = poiClassRankBannerStruct.getSchema();
        C7573i.m23582a((Object) schema, "struct.schema");
        String schema2 = poiClassRankBannerStruct.getSchema();
        C7573i.m23582a((Object) schema2, "struct.schema");
        int b = C7634n.m23757b((CharSequence) schema2, '/', C7634n.m23780f(schema2), false) + 1;
        if (schema != null) {
            String substring = schema.substring(b);
            C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            C22984d a2 = a.mo59973a(str, substring).mo59973a("poi_channel", this.f91470c).mo59973a("city_info", C33230ac.m107204a());
            PoiSimpleBundle poiSimpleBundle = this.f91471d;
            String str2 = null;
            if (poiSimpleBundle != null) {
                charSequence = poiSimpleBundle.getPoiId();
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                String str3 = "from_poi_id";
                PoiSimpleBundle poiSimpleBundle2 = this.f91471d;
                if (poiSimpleBundle2 != null) {
                    str2 = poiSimpleBundle2.getPoiId();
                }
                a2.mo59973a(str3, str2);
            }
            C35454m.m114523a(this.f91471d, "enter_tag_detail", a2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final void m113044a(PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
        CharSequence charSequence;
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f91468a).mo59973a("previous_page", this.f91468a).mo59973a("banner_id", poiClassRankBannerStruct.getBid()).mo59970a("client_order", i).mo59973a("city_info", C33230ac.m107204a()).mo59973a("poi_channel", this.f91470c);
        PoiSimpleBundle poiSimpleBundle = this.f91471d;
        String str = null;
        if (poiSimpleBundle != null) {
            charSequence = poiSimpleBundle.getPoiId();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            String str2 = "from_poi_id";
            PoiSimpleBundle poiSimpleBundle2 = this.f91471d;
            if (poiSimpleBundle2 != null) {
                str = poiSimpleBundle2.getPoiId();
            }
            a.mo59973a(str2, str);
        }
        C35454m.m114523a(this.f91471d, "banner_click", a);
    }

    /* renamed from: a */
    public final void mo88781a(Context context, PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(poiClassRankBannerStruct, "struct");
        m113044a(poiClassRankBannerStruct, i);
        if (TextUtils.isEmpty(poiClassRankBannerStruct.getSchema())) {
            m113043a(poiClassRankBannerStruct);
            Bundle bundle = new Bundle();
            bundle.putString("backend_type_code", this.f91470c);
            bundle.putString("enter_from", "categorized_city_poi");
            bundle.putString("enter_method", "click_leaderboard_banner");
            bundle.putString("district_code", poiClassRankBannerStruct.getDistrictCode());
            SmartRouter.buildRoute(context, "//poi/city/rank").withParam(bundle).open();
            return;
        }
        String str = null;
        if (C37286v.m119758a("aweme://poi/detail/:id", poiClassRankBannerStruct.getSchema())) {
            C35109e eVar = new C35109e();
            String schema = poiClassRankBannerStruct.getSchema();
            C7573i.m23582a((Object) schema, "struct.schema");
            String schema2 = poiClassRankBannerStruct.getSchema();
            C7573i.m23582a((Object) schema2, "struct.schema");
            int b = C7634n.m23757b((CharSequence) schema2, '/', C7634n.m23780f(schema2), false) + 1;
            if (schema != null) {
                String substring = schema.substring(b);
                C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                C35109e v = eVar.mo89342c(substring).mo89335a(this.f91471d).mo89352m(this.f91468a).mo89356q("click_poi_banner").mo89357r(this.f91470c).mo89361v(poiClassRankBannerStruct.getBid());
                PoiSimpleBundle poiSimpleBundle = this.f91471d;
                if (poiSimpleBundle != null) {
                    str = poiSimpleBundle.getPoiId();
                }
                SmartRouter.buildRoute(context, "//poi/detail").withParam("poi_bundle", (Serializable) v.mo89362w(str).mo89331a()).open();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String schema3 = poiClassRankBannerStruct.getSchema();
        C7573i.m23582a((Object) schema3, "struct.schema");
        if (C7634n.m23776c((CharSequence) schema3, (CharSequence) "poi/detail", false)) {
            C35109e v2 = new C35109e().mo89342c(C37286v.m119759b(poiClassRankBannerStruct.getSchema(), "id")).mo89335a(this.f91471d).mo89352m(this.f91468a).mo89356q("click_poi_banner").mo89357r(this.f91470c).mo89361v(poiClassRankBannerStruct.getBid());
            PoiSimpleBundle poiSimpleBundle2 = this.f91471d;
            if (poiSimpleBundle2 != null) {
                str = poiSimpleBundle2.getPoiId();
            }
            SmartRouter.buildRoute(context, "//poi/detail").withParam("poi_bundle", (Serializable) v2.mo89362w(str).mo89331a()).open();
            return;
        }
        String schema4 = poiClassRankBannerStruct.getSchema();
        C7573i.m23582a((Object) schema4, "struct.schema");
        if (C7634n.m23721b(schema4, WebKitApi.SCHEME_HTTP, false)) {
            String schema5 = poiClassRankBannerStruct.getSchema();
            C7573i.m23582a((Object) schema5, "struct.schema");
            if (!C7634n.m23776c((CharSequence) schema5, (CharSequence) "title=", false)) {
                String schema6 = poiClassRankBannerStruct.getSchema();
                C7573i.m23582a((Object) schema6, "struct.schema");
                if (C7634n.m23730a((CharSequence) schema6, "?", 0, false, 6, (Object) null) != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(poiClassRankBannerStruct.getSchema());
                    sb.append("&title=");
                    sb.append(poiClassRankBannerStruct.getTitle());
                    poiClassRankBannerStruct.updateSchema(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(poiClassRankBannerStruct.getSchema());
                    sb2.append("?title=");
                    sb2.append(poiClassRankBannerStruct.getTitle());
                    poiClassRankBannerStruct.updateSchema(sb2.toString());
                }
            }
            StringBuilder sb3 = new StringBuilder("aweme://webview/?url=");
            sb3.append(Uri.encode(poiClassRankBannerStruct.getSchema()));
            C7195s.m22438a().mo18682a(sb3.toString());
            return;
        }
        C7195s.m22438a().mo18682a(poiClassRankBannerStruct.getSchema());
        if (C37286v.m119758a("aweme://challenge/detail/:id", poiClassRankBannerStruct.getSchema())) {
            m113045b(poiClassRankBannerStruct);
        }
    }

    public C35014c(PoiSimpleBundle poiSimpleBundle, String str, int i, String str2) {
        C7573i.m23587b(str, "fromPage");
        this.f91471d = poiSimpleBundle;
        this.f91468a = str;
        this.f91469b = i;
        this.f91470c = str2;
    }
}

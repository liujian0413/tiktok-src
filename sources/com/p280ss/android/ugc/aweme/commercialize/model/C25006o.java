package com.p280ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.link.C24769b;
import com.p280ss.android.ugc.aweme.commercialize.star.C25088b;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.o */
public class C25006o {
    @C6593c(mo15949a = "commerce_ad_link")

    /* renamed from: a */
    public boolean f65938a = C24769b.m81288c();
    @C6593c(mo15949a = "commerce_ad_link_tags")

    /* renamed from: b */
    public String f65939b;
    @C6593c(mo15949a = "star_atlas_order_id")

    /* renamed from: c */
    public long f65940c = 0;
    @C6593c(mo15949a = "is_star_atlas")

    /* renamed from: d */
    public boolean f65941d;
    @C6593c(mo15949a = "star_atlas_content")

    /* renamed from: e */
    public String f65942e;
    @C6593c(mo15949a = "shop_order_share_structinfo")

    /* renamed from: f */
    public ShopOrderShareStructInfo f65943f;
    @C6593c(mo15949a = "anchor_id")

    /* renamed from: g */
    public String f65944g = "";
    @C6593c(mo15949a = "anchor_business_type")

    /* renamed from: h */
    public int f65945h = AnchorBusinessType.NO_TYPE.getTYPE();
    @C6593c(mo15949a = "anchor_content")

    /* renamed from: i */
    public String f65946i;
    @C6593c(mo15949a = "anchor_title")

    /* renamed from: j */
    public String f65947j;
    @C6593c(mo15949a = "anchor_icon")

    /* renamed from: k */
    public UrlModel f65948k;
    @C6593c(mo15949a = "source")

    /* renamed from: l */
    public int f65949l;
    @C6593c(mo15949a = "open_url")

    /* renamed from: m */
    public String f65950m;
    @C6593c(mo15949a = "mp_url")

    /* renamed from: n */
    public String f65951n;
    @C6593c(mo15949a = "web_url")

    /* renamed from: o */
    public String f65952o;
    @C6593c(mo15949a = "task_id")

    /* renamed from: p */
    public String f65953p = "";
    @C6593c(mo15949a = "outer_star_atlas")

    /* renamed from: q */
    public String f65954q;
    @C6593c(mo15949a = "anchor_tag")

    /* renamed from: r */
    public String f65955r;

    /* renamed from: s */
    public String f65956s;

    /* renamed from: t */
    public String f65957t;

    /* renamed from: u */
    public String f65958u;

    /* renamed from: v */
    public String f65959v;

    /* renamed from: w */
    public String f65960w;
    @C6593c(mo15949a = "recommend_anchor")

    /* renamed from: x */
    public List<C24536e> f65961x = null;

    /* renamed from: a */
    public final long mo65435a() {
        if (C25088b.m82629a()) {
            return this.f65940c;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m82326a(C25006o oVar) {
        if (oVar == null) {
            return null;
        }
        return new C6600e().mo15979b((Object) oVar);
    }

    /* renamed from: a */
    public static C25006o m82325a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C25006o();
        }
        return (C25006o) new C6600e().mo15974a(str, C25006o.class);
    }

    /* renamed from: b */
    public static C25006o m82327b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C25006o();
        }
        return (C25006o) new C6600e().mo15974a(str, C25006o.class);
    }

    /* renamed from: a */
    public static C25006o m82323a(PhotoContext photoContext) {
        if (photoContext == null || TextUtils.isEmpty(photoContext.commerceData)) {
            return new C25006o();
        }
        return (C25006o) new C6600e().mo15974a(photoContext.commerceData, C25006o.class);
    }

    /* renamed from: a */
    public static C25006o m82324a(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null || TextUtils.isEmpty(baseShortVideoContext.commerceData)) {
            return new C25006o();
        }
        return (C25006o) new C6600e().mo15974a(baseShortVideoContext.commerceData, C25006o.class);
    }

    /* renamed from: a */
    public final void mo65436a(boolean z) {
        if (C25088b.m82629a()) {
            this.f65941d = z;
        } else {
            this.f65941d = false;
        }
    }
}

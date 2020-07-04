package com.p280ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.poi.model.e */
public final class C35109e {

    /* renamed from: A */
    private String f91800A;

    /* renamed from: B */
    private String f91801B;

    /* renamed from: C */
    private String f91802C;

    /* renamed from: D */
    private String f91803D;

    /* renamed from: E */
    private int f91804E;

    /* renamed from: F */
    private String f91805F;

    /* renamed from: G */
    private int f91806G;

    /* renamed from: H */
    private boolean f91807H;

    /* renamed from: I */
    private String f91808I;

    /* renamed from: J */
    private String f91809J;

    /* renamed from: a */
    public String f91810a;

    /* renamed from: b */
    public String f91811b;

    /* renamed from: c */
    public String f91812c;

    /* renamed from: d */
    public String f91813d;

    /* renamed from: e */
    public String f91814e;

    /* renamed from: f */
    public String f91815f;

    /* renamed from: g */
    public String f91816g;

    /* renamed from: h */
    public String f91817h;

    /* renamed from: i */
    public String f91818i;

    /* renamed from: j */
    public String f91819j;

    /* renamed from: k */
    public String f91820k;

    /* renamed from: l */
    public HashMap<String, String> f91821l;

    /* renamed from: m */
    private String f91822m;

    /* renamed from: n */
    private String f91823n;

    /* renamed from: o */
    private String f91824o;

    /* renamed from: p */
    private String f91825p;

    /* renamed from: q */
    private String f91826q;

    /* renamed from: r */
    private String f91827r;

    /* renamed from: s */
    private String f91828s;

    /* renamed from: t */
    private String f91829t = "click_label";

    /* renamed from: u */
    private boolean f91830u;

    /* renamed from: v */
    private String f91831v;

    /* renamed from: w */
    private Aweme f91832w;

    /* renamed from: x */
    private String f91833x;

    /* renamed from: y */
    private String f91834y;

    /* renamed from: z */
    private String f91835z;

    /* renamed from: a */
    public final PoiBundle mo89331a() {
        PoiBundle poiBundle = new PoiBundle();
        poiBundle.pagePoiId = this.f91822m;
        poiBundle.poiId = this.f91823n;
        poiBundle.activityId = this.f91813d;
        poiBundle.couponId = this.f91814e;
        poiBundle.rankIndex = this.f91815f;
        poiBundle.subClass = this.f91816g;
        poiBundle.districtCode = this.f91817h;
        poiBundle.poiType = this.f91825p;
        poiBundle.poiName = this.f91824o;
        poiBundle.from = this.f91826q;
        poiBundle.contentSource = this.f91827r;
        poiBundle.awemeid = this.f91828s;
        poiBundle.toUserId = this.f91810a;
        poiBundle.fromUserId = this.f91811b;
        poiBundle.clickMethod = this.f91829t;
        poiBundle.isPreviewMode = this.f91830u;
        poiBundle.pageType = this.f91831v;
        poiBundle.forwardTypeV3Params = this.f91821l;
        poiBundle.distanceInfo = m113271e(this.f91832w);
        poiBundle.requestId = m113270d(this.f91832w);
        poiBundle.authorId = m113269c(this.f91832w);
        if (!TextUtils.isEmpty(this.f91805F)) {
            poiBundle.authorId = this.f91805F;
        }
        if (C6319n.m19593a(this.f91828s)) {
            poiBundle.awemeid = m113268b(this.f91832w);
        } else {
            poiBundle.awemeid = this.f91828s;
        }
        poiBundle.poiChannel = this.f91801B;
        poiBundle.searchKeyWord = this.f91802C;
        poiBundle.logPb = this.f91803D;
        poiBundle.order = this.f91804E;
        poiBundle.isCoupon = this.f91833x;
        poiBundle.bannerId = this.f91834y;
        poiBundle.fromPoiId = this.f91835z;
        poiBundle.poiLabelType = this.f91800A;
        poiBundle.contentType = this.f91812c;
        poiBundle.displayStyle = this.f91806G;
        poiBundle.hasActivity = this.f91807H;
        poiBundle.challengeId = this.f91808I;
        poiBundle.sticker = this.f91809J;
        poiBundle.backendType = this.f91818i;
        poiBundle.cityCode = this.f91819j;
        poiBundle.previousPage = this.f91820k;
        return poiBundle;
    }

    /* renamed from: A */
    public final C35109e mo89328A(String str) {
        this.f91809J = str;
        return this;
    }

    /* renamed from: B */
    public final C35109e mo89329B(String str) {
        this.f91820k = str;
        return this;
    }

    /* renamed from: C */
    public final C35109e mo89330C(String str) {
        this.f91819j = str;
        return this;
    }

    /* renamed from: a */
    public final C35109e mo89332a(int i) {
        this.f91804E = i;
        return this;
    }

    /* renamed from: b */
    public final C35109e mo89340b(String str) {
        this.f91811b = str;
        return this;
    }

    /* renamed from: c */
    public final C35109e mo89342c(String str) {
        this.f91823n = str;
        return this;
    }

    /* renamed from: d */
    public final C35109e mo89343d(String str) {
        this.f91822m = str;
        return this;
    }

    /* renamed from: e */
    public final C35109e mo89344e(String str) {
        this.f91813d = str;
        return this;
    }

    /* renamed from: f */
    public final C35109e mo89345f(String str) {
        this.f91814e = str;
        return this;
    }

    /* renamed from: g */
    public final C35109e mo89346g(String str) {
        this.f91815f = str;
        return this;
    }

    /* renamed from: h */
    public final C35109e mo89347h(String str) {
        this.f91816g = str;
        return this;
    }

    /* renamed from: i */
    public final C35109e mo89348i(String str) {
        this.f91817h = str;
        return this;
    }

    /* renamed from: j */
    public final C35109e mo89349j(String str) {
        this.f91825p = str;
        return this;
    }

    /* renamed from: k */
    public final C35109e mo89350k(String str) {
        this.f91824o = str;
        return this;
    }

    /* renamed from: l */
    public final C35109e mo89351l(String str) {
        this.f91805F = str;
        return this;
    }

    /* renamed from: m */
    public final C35109e mo89352m(String str) {
        this.f91826q = str;
        return this;
    }

    /* renamed from: n */
    public final C35109e mo89353n(String str) {
        this.f91827r = str;
        return this;
    }

    /* renamed from: o */
    public final C35109e mo89354o(String str) {
        this.f91831v = str;
        return this;
    }

    /* renamed from: p */
    public final C35109e mo89355p(String str) {
        this.f91828s = str;
        return this;
    }

    /* renamed from: q */
    public final C35109e mo89356q(String str) {
        this.f91829t = str;
        return this;
    }

    /* renamed from: r */
    public final C35109e mo89357r(String str) {
        this.f91801B = str;
        return this;
    }

    /* renamed from: s */
    public final C35109e mo89358s(String str) {
        this.f91802C = str;
        return this;
    }

    /* renamed from: t */
    public final C35109e mo89359t(String str) {
        this.f91803D = str;
        return this;
    }

    /* renamed from: u */
    public final C35109e mo89360u(String str) {
        this.f91833x = str;
        return this;
    }

    /* renamed from: v */
    public final C35109e mo89361v(String str) {
        this.f91834y = str;
        return this;
    }

    /* renamed from: w */
    public final C35109e mo89362w(String str) {
        this.f91835z = str;
        return this;
    }

    /* renamed from: x */
    public final C35109e mo89363x(String str) {
        this.f91800A = str;
        return this;
    }

    /* renamed from: y */
    public final C35109e mo89364y(String str) {
        this.f91812c = str;
        return this;
    }

    /* renamed from: z */
    public final C35109e mo89365z(String str) {
        this.f91808I = str;
        return this;
    }

    /* renamed from: a */
    public final C35109e mo89337a(String str) {
        this.f91810a = str;
        return this;
    }

    /* renamed from: b */
    public final C35109e mo89341b(boolean z) {
        this.f91807H = z;
        return this;
    }

    /* renamed from: b */
    private static String m113268b(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    /* renamed from: e */
    private static String m113271e(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return m113267D(aweme.getDistance());
    }

    /* renamed from: a */
    public final C35109e mo89333a(Aweme aweme) {
        this.f91832w = aweme;
        this.f91828s = m113268b(aweme);
        return this;
    }

    /* renamed from: c */
    private static String m113269c(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    /* renamed from: d */
    private static String m113270d(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getRequestId() != null) {
            return aweme.getRequestId();
        }
        return "";
    }

    /* renamed from: a */
    public final C35109e mo89334a(SimplePoiInfoStruct simplePoiInfoStruct) {
        if (simplePoiInfoStruct != null) {
            this.f91818i = simplePoiInfoStruct.getPoiBackendType();
            if (!TextUtils.isEmpty(simplePoiInfoStruct.getCityCode())) {
                this.f91819j = simplePoiInfoStruct.getCityCode();
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C35109e mo89335a(PoiSimpleBundle poiSimpleBundle) {
        if (poiSimpleBundle != null) {
            this.f91818i = poiSimpleBundle.getBackendType();
            if (!TextUtils.isEmpty(poiSimpleBundle.getPoiCity())) {
                this.f91819j = poiSimpleBundle.getPoiCity();
            }
        }
        return this;
    }

    /* renamed from: D */
    private static String m113267D(String str) {
        float f;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("<1km".equalsIgnoreCase(str)) {
            return "type_0_1";
        }
        if (">100km".equalsIgnoreCase(str)) {
            return "type_20+";
        }
        int indexOf = str.indexOf("km");
        if (indexOf == -1) {
            return "";
        }
        try {
            f = Float.parseFloat(str.substring(0, indexOf));
        } catch (Exception unused) {
            f = 0.0f;
        }
        if (f <= 1.0f) {
            return "type_0_1";
        }
        if (f > 1.0f && f <= 3.0f) {
            return "type_1_3";
        }
        if (f > 3.0f && f <= 5.0f) {
            return "type_3_5";
        }
        if (f > 5.0f && f <= 10.0f) {
            return "type_5_10";
        }
        if (f > 10.0f && f <= 20.0f) {
            return "type_10_20";
        }
        if (f > 20.0f) {
            return "type_20+";
        }
        return "";
    }

    /* renamed from: a */
    public final C35109e mo89336a(PoiStruct poiStruct) {
        if (poiStruct != null) {
            this.f91818i = poiStruct.getBackendTypeCode();
            if (poiStruct.getAddress() != null) {
                this.f91819j = poiStruct.getAddress().cityCode;
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C35109e mo89338a(HashMap<String, String> hashMap) {
        this.f91821l = hashMap;
        return this;
    }

    /* renamed from: a */
    public final C35109e mo89339a(boolean z) {
        this.f91830u = z;
        return this;
    }
}

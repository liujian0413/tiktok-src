package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.ads.AdError;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.d */
public abstract class C33259d {

    /* renamed from: a */
    private final Map<String, String> f86750a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f86751b = new HashMap();

    /* renamed from: d */
    protected final String f86752d;

    /* renamed from: e */
    protected String f86753e;

    /* renamed from: f */
    protected String f86754f;

    /* renamed from: g */
    protected String f86755g;

    /* renamed from: h */
    protected String f86756h;

    /* renamed from: i */
    protected String f86757i;

    /* renamed from: j */
    protected String f86758j;

    /* renamed from: k */
    protected String f86759k;

    /* renamed from: l */
    protected String f86760l;

    /* renamed from: m */
    protected String f86761m;

    /* renamed from: n */
    protected String f86762n;

    /* renamed from: o */
    protected String f86763o;

    /* renamed from: p */
    protected String f86764p;

    /* renamed from: q */
    protected String f86765q;

    /* renamed from: r */
    protected String f86766r;

    /* renamed from: s */
    protected String f86767s;

    /* renamed from: t */
    public boolean f86768t = true;

    /* renamed from: u */
    protected String f86769u;

    /* renamed from: com.ss.android.ugc.aweme.metrics.d$a */
    public interface C33260a {

        /* renamed from: a */
        public static final C33260a f86770a = new C33260a() {
            /* renamed from: a */
            public final String mo85256a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C33260a f86771b = new C33260a() {
            /* renamed from: a */
            public final String mo85256a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo85256a(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo67592a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo85050b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo85253f() {
        if (!C6399b.m19946v()) {
            this.f86750a.put("_staging_flag", "1");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo85254g() {
        try {
            if (this.f86768t) {
                C6759a.m20910a(this.f86752d, C33230ac.m107211a(this.f86750a));
                return;
            }
            C6906g.m21515a(this.f86752d, this.f86750a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public final void mo85252e() {
        mo85050b();
        mo67592a();
        this.f86750a.putAll(this.f86751b);
        C6726a.m20842a(new C33263e(this));
    }

    /* renamed from: d */
    public final void mo85251d() {
        String str;
        if (!TextUtils.isEmpty(this.f86754f)) {
            mo85248a("city_info", this.f86754f, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86758j)) {
            mo85248a("distance_info", this.f86758j, C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86760l)) {
            mo85248a("poi_city", this.f86760l, C33260a.f86770a);
            String str2 = "poi_device_samecity";
            if (this.f86760l.equalsIgnoreCase(C28290d.m93043d())) {
                str = "1";
            } else {
                str = "0";
            }
            mo85248a(str2, str, C33260a.f86770a);
        }
        mo85248a("poi_type", this.f86756h, C33260a.f86770a);
        mo85248a("poi_channel", this.f86757i, C33260a.f86770a);
        mo85248a("card_type", this.f86765q, C33260a.f86770a);
        mo85248a("object_id", this.f86766r, C33260a.f86770a);
    }

    /* renamed from: c */
    public final void mo85250c() {
        String str;
        if (!TextUtils.isEmpty(this.f86755g)) {
            mo85248a("poi_id", this.f86755g, C33260a.f86771b);
            mo85248a("poi_backend_type", this.f86759k, C33260a.f86770a);
            if (!TextUtils.isEmpty(this.f86760l)) {
                mo85248a("poi_city", this.f86760l, C33260a.f86770a);
                String str2 = "poi_device_samecity";
                if (this.f86760l.equalsIgnoreCase(C28290d.m93043d())) {
                    str = "1";
                } else {
                    str = "0";
                }
                mo85248a(str2, str, C33260a.f86770a);
            }
        }
        if ("poi_page".equalsIgnoreCase(this.f86753e)) {
            if (!TextUtils.isEmpty(this.f86761m)) {
                mo85245a("page_poi_id", this.f86761m);
            }
            if (!TextUtils.isEmpty(this.f86762n)) {
                mo85245a("page_poi_city", this.f86762n);
            }
            if (!TextUtils.isEmpty(this.f86763o)) {
                mo85245a("page_poi_device_samecity", this.f86763o);
            }
            if (!TextUtils.isEmpty(this.f86764p)) {
                mo85245a("page_poi_backend_type", this.f86764p);
            }
        }
        if ("poi_map".equalsIgnoreCase(this.f86753e) && !TextUtils.isEmpty(this.f86761m)) {
            mo85245a("page_poi_id", this.f86761m);
        }
        mo85251d();
    }

    /* renamed from: a */
    public final C33259d mo85246a(Map<String, String> map) {
        this.f86751b.putAll(map);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo85255h(String str) {
        mo85248a("log_pb", C28199ae.m92689a().mo71791a(str), C33260a.f86770a);
    }

    public C33259d(String str) {
        this.f86752d = str;
    }

    /* renamed from: c */
    static String m107477c(Aweme aweme) {
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    /* renamed from: e */
    static Long m107479e(Aweme aweme) {
        long j;
        if (aweme.getMusic() == null) {
            j = 0;
        } else {
            j = aweme.getMusic().getId();
        }
        return Long.valueOf(j);
    }

    /* renamed from: d */
    static String m107478d(Aweme aweme) {
        int awemeType = aweme.getAwemeType();
        if (awemeType == 2) {
            return "photo";
        }
        if (awemeType == 101) {
            return "live";
        }
        switch (awemeType) {
            case AdError.MEDIATION_ERROR_CODE /*3001*/:
                return "leaderboard";
            case 3002:
                return "operation_card";
            default:
                return "video";
        }
    }

    /* renamed from: b */
    public final void mo85249b(Aweme aweme) {
        if (aweme != null) {
            HotSearchInfo hotSearchInfo = aweme.getHotSearchInfo();
            if (hotSearchInfo == null || hotSearchInfo.getSentence() == null) {
                this.f86767s = aweme.getHotSpot();
            } else {
                this.f86767s = hotSearchInfo.getSentence();
            }
        }
    }

    /* renamed from: a */
    public final void mo85247a(Aweme aweme) {
        if (aweme != null) {
            this.f86758j = C33230ac.m107218b(aweme.getDistance());
            this.f86754f = C33230ac.m107204a();
            if (aweme.getPoiStruct() != null) {
                this.f86755g = aweme.getPoiStruct().poiId;
                this.f86756h = C33230ac.m107229h(aweme);
                this.f86757i = C33230ac.m107214b();
                this.f86759k = C33230ac.m107225f(aweme);
                this.f86760l = aweme.getPoiStruct().getCityCode();
            } else if (aweme.getSimplePoiInfoStruct() != null) {
                this.f86755g = aweme.getSimplePoiInfoStruct().getPoiId();
                this.f86759k = aweme.getSimplePoiInfoStruct().getPoiBackendType();
                this.f86760l = aweme.getSimplePoiInfoStruct().getCityCode();
            }
            if (aweme.getMobParams() != null) {
                this.f86761m = (String) aweme.getMobParams().get("page_poi_id");
                this.f86762n = (String) aweme.getMobParams().get("page_poi_city");
                this.f86763o = (String) aweme.getMobParams().get("page_poi_device_samecity");
                this.f86764p = (String) aweme.getMobParams().get("page_poi_backend_type");
            }
        }
    }

    /* renamed from: a */
    public final C33259d mo85245a(String str, String str2) {
        mo85248a(str, str2, C33260a.f86770a);
        return this;
    }

    /* renamed from: a */
    static String m107475a(Aweme aweme, int i) {
        JSONObject requestIdAndOrderJsonObject = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(aweme, i);
        if (requestIdAndOrderJsonObject != null) {
            return requestIdAndOrderJsonObject.optString("request_id");
        }
        return "";
    }

    /* renamed from: b */
    static String m107476b(Aweme aweme, int i) {
        JSONObject requestIdAndOrderJsonObject = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(aweme, i);
        if (requestIdAndOrderJsonObject != null) {
            return requestIdAndOrderJsonObject.optString(POIService.KEY_ORDER);
        }
        return "";
    }

    /* renamed from: a */
    public final void mo85248a(String str, String str2, C33260a aVar) {
        this.f86750a.put(str, aVar.mo85256a(str2));
    }
}

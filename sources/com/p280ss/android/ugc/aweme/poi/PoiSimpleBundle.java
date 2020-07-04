package com.p280ss.android.ugc.aweme.poi;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.PoiSimpleBundle */
public final class PoiSimpleBundle implements Serializable {
    private String activityId;
    private String awemeId;
    private String backendType;
    private String poiChannel;
    private String poiCity;
    private String poiId;
    private String poiType;
    private String previousPage;

    /* renamed from: com.ss.android.ugc.aweme.poi.PoiSimpleBundle$a */
    public static final class C35003a {

        /* renamed from: a */
        public String f91361a;

        /* renamed from: b */
        public String f91362b;

        /* renamed from: c */
        public String f91363c;

        /* renamed from: d */
        public String f91364d;

        /* renamed from: e */
        public String f91365e;

        /* renamed from: f */
        public String f91366f;

        /* renamed from: g */
        public String f91367g;

        /* renamed from: h */
        public String f91368h;

        /* renamed from: a */
        public final PoiSimpleBundle mo88731a() {
            PoiSimpleBundle poiSimpleBundle = new PoiSimpleBundle();
            poiSimpleBundle.setPoiId(this.f91361a);
            poiSimpleBundle.setPoiType(this.f91362b);
            poiSimpleBundle.setPoiChannel(this.f91363c);
            poiSimpleBundle.setActivityId(this.f91364d);
            poiSimpleBundle.setAwemeId(this.f91365e);
            poiSimpleBundle.setPreviousPage(this.f91366f);
            poiSimpleBundle.setBackendType(this.f91367g);
            poiSimpleBundle.setPoiCity(this.f91368h);
            return poiSimpleBundle;
        }

        /* renamed from: a */
        public final C35003a mo88730a(String str) {
            this.f91361a = str;
            return this;
        }

        /* renamed from: b */
        public final C35003a mo88732b(String str) {
            this.f91362b = str;
            return this;
        }

        /* renamed from: c */
        public final C35003a mo88733c(String str) {
            this.f91363c = str;
            return this;
        }

        /* renamed from: d */
        public final C35003a mo88734d(String str) {
            this.f91364d = str;
            return this;
        }

        /* renamed from: e */
        public final C35003a mo88735e(String str) {
            this.f91365e = str;
            return this;
        }

        /* renamed from: f */
        public final C35003a mo88736f(String str) {
            this.f91366f = str;
            return this;
        }

        /* renamed from: g */
        public final C35003a mo88737g(String str) {
            this.f91367g = str;
            return this;
        }

        /* renamed from: h */
        public final C35003a mo88738h(String str) {
            this.f91368h = str;
            return this;
        }
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getBackendType() {
        return this.backendType;
    }

    public final String getPoiChannel() {
        return this.poiChannel;
    }

    public final String getPoiCity() {
        return this.poiCity;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final String getPoiType() {
        return this.poiType;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final void setActivityId(String str) {
        this.activityId = str;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setBackendType(String str) {
        this.backendType = str;
    }

    public final void setPoiChannel(String str) {
        this.poiChannel = str;
    }

    public final void setPoiCity(String str) {
        this.poiCity = str;
    }

    public final void setPoiId(String str) {
        this.poiId = str;
    }

    public final void setPoiType(String str) {
        this.poiType = str;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }
}

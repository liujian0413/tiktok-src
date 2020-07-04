package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.draft.model.C27310b;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.tools.extension.C42305a;
import com.p280ss.android.ugc.aweme.tools.extension.C42308b;
import com.p280ss.android.ugc.aweme.tools.extension.SupportedBusiness;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.j */
public final class C40005j {

    /* renamed from: a */
    private static final C42308b f103908a = new C42308b() {
        /* renamed from: a */
        public final String mo88377a(SupportedBusiness supportedBusiness) {
            return null;
        }
    };

    /* renamed from: b */
    private static final C42305a f103909b = new C42305a() {
        /* renamed from: a */
        public final void mo88378a(SupportedBusiness supportedBusiness, String str) {
        }
    };

    /* renamed from: a */
    public static C42305a m127909a(final ShortVideoContext shortVideoContext) {
        return new C42305a() {
            /* renamed from: a */
            public final void mo88378a(SupportedBusiness supportedBusiness, String str) {
                switch (C400103.f103912a[supportedBusiness.ordinal()]) {
                    case 1:
                        shortVideoContext.f99754ao = str;
                        return;
                    case 2:
                        shortVideoContext.f99755ap = str;
                        return;
                    case 3:
                        shortVideoContext.f99756aq = str;
                        return;
                    case 4:
                        shortVideoContext.f99757ar = str;
                        return;
                    case 5:
                        shortVideoContext.f99758as = str;
                        return;
                    case 6:
                        shortVideoContext.f99759at = str;
                        return;
                    case 7:
                        shortVideoContext.f99760au = str;
                        break;
                }
            }
        };
    }

    /* renamed from: b */
    public static C42305a m127911b(final BaseShortVideoContext baseShortVideoContext) {
        return new C42305a() {
            /* renamed from: a */
            public final void mo88378a(SupportedBusiness supportedBusiness, String str) {
                switch (supportedBusiness) {
                    case MAIN_BUSINESS:
                        baseShortVideoContext.setMainBusinessData(str);
                        return;
                    case SOCIAL:
                        baseShortVideoContext.socialData = str;
                        return;
                    case POI:
                        baseShortVideoContext.poiData = str;
                        return;
                    case COMMERCE:
                        baseShortVideoContext.commerceData = str;
                        return;
                    case UG:
                        baseShortVideoContext.ugData = str;
                        return;
                    case TECH:
                        baseShortVideoContext.techData = str;
                        return;
                    case GLOBAL:
                        baseShortVideoContext.globalData = str;
                        break;
                }
            }
        };
    }

    /* renamed from: a */
    public static C42305a m127907a(final C27310b bVar) {
        if (bVar == null) {
            return f103909b;
        }
        return new C42305a() {
            /* renamed from: a */
            public final void mo88378a(SupportedBusiness supportedBusiness, String str) {
                switch (supportedBusiness) {
                    case MAIN_BUSINESS:
                        bVar.f72000n = str;
                        return;
                    case SOCIAL:
                        bVar.f72001o = str;
                        return;
                    case POI:
                        bVar.f72002p = str;
                        return;
                    case COMMERCE:
                        bVar.f72003q = str;
                        return;
                    case UG:
                        bVar.f72004r = str;
                        return;
                    case TECH:
                        bVar.f72005s = str;
                        return;
                    case GLOBAL:
                        bVar.f72006t = str;
                        break;
                }
            }
        };
    }

    /* renamed from: b */
    public static C42308b m127912b(final C27310b bVar) {
        if (bVar == null) {
            return f103908a;
        }
        return new C42308b() {
            /* renamed from: a */
            public final String mo88377a(SupportedBusiness supportedBusiness) {
                switch (C400103.f103912a[supportedBusiness.ordinal()]) {
                    case 1:
                        return bVar.f72000n;
                    case 2:
                        return bVar.f72001o;
                    case 3:
                        return bVar.f72002p;
                    case 4:
                        return bVar.f72003q;
                    case 5:
                        return bVar.f72004r;
                    case 6:
                        return bVar.f72005s;
                    case 7:
                        return bVar.f72006t;
                    default:
                        return null;
                }
            }
        };
    }

    /* renamed from: a */
    public static C42305a m127908a(final PhotoContext photoContext) {
        if (photoContext == null) {
            return f103909b;
        }
        return new C42305a() {
            /* renamed from: a */
            public final void mo88378a(SupportedBusiness supportedBusiness, String str) {
                switch (supportedBusiness) {
                    case MAIN_BUSINESS:
                        photoContext.mainBusinessData = str;
                        return;
                    case SOCIAL:
                        photoContext.socialData = str;
                        return;
                    case POI:
                        photoContext.poiData = str;
                        return;
                    case COMMERCE:
                        photoContext.commerceData = str;
                        return;
                    case UG:
                        photoContext.ugData = str;
                        return;
                    case TECH:
                        photoContext.techData = str;
                        return;
                    case GLOBAL:
                        photoContext.globalData = str;
                        break;
                }
            }
        };
    }

    /* renamed from: b */
    public static C42308b m127913b(final PhotoContext photoContext) {
        if (photoContext == null) {
            return f103908a;
        }
        return new C42308b() {
            /* renamed from: a */
            public final String mo88377a(SupportedBusiness supportedBusiness) {
                switch (supportedBusiness) {
                    case MAIN_BUSINESS:
                        return photoContext.mainBusinessData;
                    case SOCIAL:
                        return photoContext.socialData;
                    case POI:
                        return photoContext.poiData;
                    case COMMERCE:
                        return photoContext.commerceData;
                    case UG:
                        return photoContext.ugData;
                    case TECH:
                        return photoContext.techData;
                    case GLOBAL:
                        return photoContext.globalData;
                    default:
                        return null;
                }
            }
        };
    }

    /* renamed from: a */
    public static C42308b m127910a(final BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null) {
            return f103908a;
        }
        return new C42308b() {
            /* renamed from: a */
            public final String mo88377a(SupportedBusiness supportedBusiness) {
                switch (supportedBusiness) {
                    case MAIN_BUSINESS:
                        return baseShortVideoContext.getMainBusinessData();
                    case SOCIAL:
                        return baseShortVideoContext.socialData;
                    case POI:
                        return baseShortVideoContext.poiData;
                    case COMMERCE:
                        return baseShortVideoContext.commerceData;
                    case UG:
                        return baseShortVideoContext.ugData;
                    case TECH:
                        return baseShortVideoContext.techData;
                    case GLOBAL:
                        return baseShortVideoContext.globalData;
                    default:
                        return null;
                }
            }
        };
    }

    /* renamed from: b */
    public static C42308b m127914b(final ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return f103908a;
        }
        return new C42308b() {
            /* renamed from: a */
            public final String mo88377a(SupportedBusiness supportedBusiness) {
                switch (supportedBusiness) {
                    case MAIN_BUSINESS:
                        return shortVideoContext.f99754ao;
                    case SOCIAL:
                        return shortVideoContext.f99755ap;
                    case POI:
                        return shortVideoContext.f99756aq;
                    case COMMERCE:
                        return shortVideoContext.f99757ar;
                    case UG:
                        return shortVideoContext.f99758as;
                    case TECH:
                        return shortVideoContext.f99759at;
                    case GLOBAL:
                        return shortVideoContext.f99760au;
                    default:
                        return null;
                }
            }
        };
    }
}

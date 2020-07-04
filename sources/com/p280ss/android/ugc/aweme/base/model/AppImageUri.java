package com.p280ss.android.ugc.aweme.base.model;

/* renamed from: com.ss.android.ugc.aweme.base.model.AppImageUri */
public final class AppImageUri {

    /* renamed from: a */
    public Type f61444a;

    /* renamed from: b */
    private Object f61445b;

    /* renamed from: com.ss.android.ugc.aweme.base.model.AppImageUri$Type */
    public enum Type {
        RES_ID,
        URL,
        URL_MODEL
    }

    /* renamed from: b */
    public final String mo60653b() {
        return (String) this.f61445b;
    }

    /* renamed from: c */
    public final UrlModel mo60654c() {
        return (UrlModel) this.f61445b;
    }

    /* renamed from: a */
    public final int mo60652a() {
        if (this.f61445b == null) {
            return 0;
        }
        return ((Integer) this.f61445b).intValue();
    }

    /* renamed from: a */
    public static AppImageUri m76616a(UrlModel urlModel) {
        return new AppImageUri(Type.URL_MODEL, urlModel);
    }

    /* renamed from: a */
    public static AppImageUri m76615a(int i) {
        return new AppImageUri(Type.RES_ID, Integer.valueOf(i));
    }

    private AppImageUri(Type type, Object obj) {
        this.f61444a = type;
        this.f61445b = obj;
    }
}

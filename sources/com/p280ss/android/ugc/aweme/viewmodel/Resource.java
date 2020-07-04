package com.p280ss.android.ugc.aweme.viewmodel;

/* renamed from: com.ss.android.ugc.aweme.viewmodel.Resource */
public final class Resource<T> {

    /* renamed from: a */
    public final Status f112149a;

    /* renamed from: b */
    public final T f112150b;

    /* renamed from: c */
    public final Exception f112151c;

    /* renamed from: com.ss.android.ugc.aweme.viewmodel.Resource$Status */
    public enum Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    /* renamed from: a */
    public static <T> Resource<T> m137531a(Exception exc) {
        return new Resource<>(Status.ERROR, null, exc);
    }

    /* renamed from: a */
    public static <T> Resource<T> m137532a(T t) {
        return new Resource<>(Status.SUCCESS, t, null);
    }

    private Resource(Status status, T t, Exception exc) {
        this.f112149a = status;
        this.f112150b = t;
        this.f112151c = exc;
    }
}

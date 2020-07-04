package com.p280ss.android.ugc.aweme.mvp.model;

/* renamed from: com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper */
public final class LiveDataWrapper<M> {

    /* renamed from: a */
    public M f88767a;

    /* renamed from: b */
    public STATUS f88768b;

    /* renamed from: c */
    public int f88769c;

    /* renamed from: d */
    public Throwable f88770d;

    /* renamed from: com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS */
    public enum STATUS {
        INIT,
        SUCCESS,
        ERROR,
        LOADING,
        PROGRESS
    }

    /* renamed from: a */
    public static <M> LiveDataWrapper<M> m109595a() {
        LiveDataWrapper<M> liveDataWrapper = new LiveDataWrapper<>();
        liveDataWrapper.f88768b = STATUS.LOADING;
        return liveDataWrapper;
    }

    /* renamed from: a */
    public static <M> LiveDataWrapper<M> m109599a(M m) {
        LiveDataWrapper<M> liveDataWrapper = new LiveDataWrapper<>();
        liveDataWrapper.f88768b = STATUS.SUCCESS;
        liveDataWrapper.f88767a = m;
        return liveDataWrapper;
    }

    /* renamed from: a */
    public static <T extends Throwable, M> LiveDataWrapper<M> m109600a(T t) {
        LiveDataWrapper<M> liveDataWrapper = new LiveDataWrapper<>();
        liveDataWrapper.f88768b = STATUS.ERROR;
        liveDataWrapper.f88770d = t;
        return liveDataWrapper;
    }

    /* renamed from: a */
    public static <M> LiveDataWrapper<M> m109596a(STATUS status, M m) {
        LiveDataWrapper<M> liveDataWrapper = new LiveDataWrapper<>();
        liveDataWrapper.f88768b = status;
        liveDataWrapper.f88767a = m;
        return liveDataWrapper;
    }

    /* renamed from: a */
    public static <T extends Throwable, M> LiveDataWrapper<M> m109598a(STATUS status, T t) {
        LiveDataWrapper<M> liveDataWrapper = new LiveDataWrapper<>();
        liveDataWrapper.f88768b = status;
        liveDataWrapper.f88770d = t;
        return liveDataWrapper;
    }

    /* renamed from: a */
    public static <M> LiveDataWrapper<M> m109597a(STATUS status, M m, int i) {
        LiveDataWrapper<M> liveDataWrapper = new LiveDataWrapper<>();
        liveDataWrapper.f88768b = status;
        liveDataWrapper.f88767a = m;
        liveDataWrapper.f88769c = i;
        return liveDataWrapper;
    }
}

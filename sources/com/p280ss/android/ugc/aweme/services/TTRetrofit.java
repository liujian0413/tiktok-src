package com.p280ss.android.ugc.aweme.services;

import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.p638c.C12469a;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.ugc.aweme.services.TTRetrofit */
public final class TTRetrofit implements IRetrofit {
    private final IRetrofit retrofit;

    /* renamed from: com.ss.android.ugc.aweme.services.TTRetrofit$RetrofitDelegateImpl */
    static class RetrofitDelegateImpl implements IRetrofit {
        private String baseUrl;
        private List<C12469a> interceptors;
        private AtomicReference<C12516p> retrofit = new AtomicReference<>(null);

        public C12516p getRetrofit() {
            if (this.retrofit.get() == null) {
                synchronized (this) {
                    if (this.retrofit.get() == null) {
                        this.retrofit.set(C22838j.m75279b(this.baseUrl, this.interceptors));
                    }
                }
            }
            return (C12516p) this.retrofit.get();
        }

        public <T> T create(final Class<T> cls) {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
                private volatile T retrofitService;

                private T getRetrofitService() {
                    if (this.retrofitService == null) {
                        synchronized (this) {
                            if (this.retrofitService == null) {
                                this.retrofitService = RetrofitDelegateImpl.this.getRetrofit().mo30492a(cls);
                            }
                        }
                    }
                    return this.retrofitService;
                }

                private Method getRetrofitMethod(T t, Method method) throws NoSuchMethodException {
                    return t.getClass().getMethod(method.getName(), method.getParameterTypes());
                }

                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    Object retrofitService2 = getRetrofitService();
                    return getRetrofitMethod(retrofitService2, method).invoke(retrofitService2, objArr);
                }
            });
        }

        RetrofitDelegateImpl(String str, List<C12469a> list) {
            this.baseUrl = str;
            this.interceptors = list;
        }
    }

    public final <T> T create(Class<T> cls) {
        return this.retrofit.create(cls);
    }

    public TTRetrofit(String str) {
        this.retrofit = new RetrofitDelegateImpl(str, null);
    }

    public TTRetrofit(String str, List<C12469a> list) {
        this.retrofit = new RetrofitDelegateImpl(str, list);
    }
}

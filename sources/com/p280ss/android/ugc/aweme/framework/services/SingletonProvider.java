package com.p280ss.android.ugc.aweme.framework.services;

/* renamed from: com.ss.android.ugc.aweme.framework.services.SingletonProvider */
class SingletonProvider<T> implements ServiceProvider<T> {
    volatile T service;
    ServiceProvider<T> serviceProvider;

    public synchronized T get() {
        if (this.service == null) {
            this.service = this.serviceProvider.get();
        }
        return this.service;
    }

    SingletonProvider(ServiceProvider serviceProvider2) {
        this.serviceProvider = serviceProvider2;
    }
}

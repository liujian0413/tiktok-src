package com.p280ss.android.ugc.aweme.framework.services;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.framework.services.Binding */
public final class Binding<T> {
    Class<T> klass;
    ServiceManager serviceManager;
    ServiceProvider<T> serviceProvider;

    public final Binding<T> asSingleton() {
        Set set = (Set) this.serviceManager.classServiceProviderConcurrentHashMap.get(this.klass);
        if (!(this.serviceProvider instanceof SingletonProvider)) {
            set.remove(this.serviceProvider);
            this.serviceProvider = new SingletonProvider(this.serviceProvider);
            set.add(this.serviceProvider);
        }
        return this;
    }

    Binding(ServiceManager serviceManager2, Class<T> cls, ServiceProvider<T> serviceProvider2) {
        this.serviceManager = serviceManager2;
        this.klass = cls;
        this.serviceProvider = serviceProvider2;
        Set set = (Set) serviceManager2.classServiceProviderConcurrentHashMap.get(cls);
        if (set == null) {
            Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
            synchronizedSet.add(serviceProvider2);
            serviceManager2.classServiceProviderConcurrentHashMap.put(cls, synchronizedSet);
            return;
        }
        set.add(serviceProvider2);
    }
}

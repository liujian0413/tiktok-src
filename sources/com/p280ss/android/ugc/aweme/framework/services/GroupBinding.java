package com.p280ss.android.ugc.aweme.framework.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.framework.services.GroupBinding */
public final class GroupBinding<T> {
    Map<Class<?>, Map<String, ServiceProvider<?>>> classProviderMaps;
    String groupName;
    Class<T> klass;
    ServiceProvider<T> serviceProvider;

    public final GroupBinding<T> asSingleton() {
        if (!(this.serviceProvider instanceof SingletonProvider)) {
            Map map = (Map) this.classProviderMaps.get(this.klass);
            map.remove(this.serviceProvider);
            this.serviceProvider = new SingletonProvider(this.serviceProvider);
            map.put(this.groupName, this.serviceProvider);
        }
        return this;
    }

    GroupBinding(Map<Class<?>, Map<String, ServiceProvider<?>>> map, Class<T> cls, String str, ServiceProvider<T> serviceProvider2) {
        this.classProviderMaps = map;
        this.groupName = str;
        this.klass = cls;
        this.serviceProvider = serviceProvider2;
        Map map2 = (Map) this.classProviderMaps.get(this.klass);
        if (map2 == null) {
            map2 = Collections.synchronizedMap(new HashMap());
            this.classProviderMaps.put(cls, map2);
        }
        map2.put(str, serviceProvider2);
    }
}

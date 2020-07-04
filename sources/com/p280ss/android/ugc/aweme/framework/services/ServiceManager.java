package com.p280ss.android.ugc.aweme.framework.services;

import com.p280ss.android.ugc.graph.C7289f;
import com.p280ss.android.ugc.p302a.C6843a;
import com.p280ss.android.ugc.p302a.C6850d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.framework.services.ServiceManager */
public final class ServiceManager {
    final ConcurrentHashMap<Class<?>, Set<ServiceProvider<?>>> classServiceProviderConcurrentHashMap;
    final Map<Class<?>, Map<String, ServiceProvider<?>>> groupServiceProviderConcurrentHashMap;

    /* renamed from: com.ss.android.ugc.aweme.framework.services.ServiceManager$Holder */
    static final class Holder {
        public static final ServiceManager INSTANCE = new ServiceManager();

        private Holder() {
        }
    }

    public static ServiceManager get() {
        return Holder.INSTANCE;
    }

    private ServiceManager() {
        this.classServiceProviderConcurrentHashMap = new ConcurrentHashMap<>();
        this.groupServiceProviderConcurrentHashMap = Collections.synchronizedMap(new HashMap());
    }

    public final <T> T getService(Class<T> cls) {
        return getService(cls, false);
    }

    public final <T> Set<T> getServices(Class<T> cls) {
        return (Set) C6843a.m21275a((Class) cls).mo16705b().mo16706c();
    }

    public final <T> Binding bind(Class<T> cls, ServiceProvider<T> serviceProvider) {
        return new Binding(this, cls, serviceProvider);
    }

    public final <T> T getServiceByGroup(Class<T> cls, String str) {
        Map map = (Map) this.groupServiceProviderConcurrentHashMap.get(cls);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return ((ServiceProvider) map.get(str)).get();
    }

    public final <T> T getLegacyService(Class<T> cls, boolean z) {
        Set set = (Set) this.classServiceProviderConcurrentHashMap.get(cls);
        if (set != null && !set.isEmpty() && !z) {
            return ((ServiceProvider) set.toArray()[0]).get();
        }
        Iterator it = ConfigLoader.iterator(cls);
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public final <T> T getService(final Class<T> cls, final boolean z) {
        T t;
        if (!z) {
            t = C7289f.m22851a(cls);
        } else {
            t = null;
        }
        if (t != null) {
            return t;
        }
        return C6843a.m21275a((Class) cls).mo16704a((C6850d) new C6850d<T>() {
            public T get(Class cls, Class cls2) {
                T legacyService = ServiceManager.this.getLegacyService(cls, z);
                if (legacyService == null) {
                    return super.get(cls, cls2);
                }
                return legacyService;
            }
        }).mo16703a().mo16706c();
    }

    public final <T> GroupBinding bind(Class<T> cls, String str, ServiceProvider<T> serviceProvider) {
        return new GroupBinding(this.groupServiceProviderConcurrentHashMap, cls, str, serviceProvider);
    }
}

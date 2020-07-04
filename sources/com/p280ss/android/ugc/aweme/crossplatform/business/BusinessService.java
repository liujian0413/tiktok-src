package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25834c;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.BusinessService */
public final class BusinessService {

    /* renamed from: a */
    private final C25856c f68326a;

    /* renamed from: b */
    private HashMap<Class, Business> f68327b = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business */
    public static abstract class Business {

        /* renamed from: g */
        protected final C25834c f68328g;

        /* renamed from: h */
        protected final C25856c f68329h;

        /* renamed from: i */
        protected final C25886b f68330i = this.f68328g.getCrossPlatformParams();

        /* renamed from: j */
        protected final Context f68331j = this.f68328g.getContext();

        public Business(C25856c cVar) {
            this.f68329h = cVar;
            this.f68328g = cVar.f68385a;
        }
    }

    BusinessService(C25856c cVar) {
        this.f68326a = cVar;
    }

    /* renamed from: a */
    public final <T extends Business> T mo67175a(Class<T> cls) {
        T t;
        if (this.f68327b.containsKey(cls)) {
            return (Business) this.f68327b.get(cls);
        }
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{C25856c.class});
                declaredConstructor.setAccessible(true);
                t = (Business) declaredConstructor.newInstance(new Object[]{this.f68326a});
                try {
                    this.f68327b.put(cls, t);
                } catch (Exception | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (Exception | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused2) {
                t = null;
            }
            if (t == null) {
                return null;
            }
            return t;
        }
        StringBuilder sb = new StringBuilder("can't use abstract class!");
        sb.append(cls.getSimpleName());
        throw new IllegalStateException(sb.toString());
    }
}

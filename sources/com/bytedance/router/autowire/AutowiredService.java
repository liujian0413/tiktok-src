package com.bytedance.router.autowire;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;

public class AutowiredService {
    private List<String> blackList;
    private LruCache<String, ISyringe> classCache;

    static final class Single {
        public static final AutowiredService single = new AutowiredService();

        private Single() {
        }
    }

    public static AutowiredService inst() {
        return Single.single;
    }

    private AutowiredService() {
        this.classCache = new LruCache<>(66);
        this.blackList = new ArrayList();
    }

    public void autowire(Object obj) {
        String name = obj.getClass().getName();
        try {
            if (!this.blackList.contains(name)) {
                ISyringe iSyringe = (ISyringe) this.classCache.get(name);
                if (iSyringe == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj.getClass().getName());
                    sb.append("$$SmartRouter$$Autowired");
                    iSyringe = (ISyringe) Class.forName(sb.toString()).getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                iSyringe.inject(obj);
                this.classCache.put(name, iSyringe);
            }
        } catch (Exception unused) {
            this.blackList.add(name);
        }
    }
}

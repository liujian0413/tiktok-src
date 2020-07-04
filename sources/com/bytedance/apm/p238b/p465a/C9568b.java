package com.bytedance.apm.p238b.p465a;

import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.apm.b.a.b */
public final class C9568b {

    /* renamed from: a */
    private Map<String, C9570d> f26141a = new HashMap();

    /* renamed from: a */
    public final void mo23879a() throws Exception {
        if (this.f26141a.size() != 0) {
            Class cls = Class.forName("android.os.ServiceManager");
            Method declaredMethod = cls.getDeclaredMethod("getService", new Class[]{String.class});
            Field declaredField = cls.getDeclaredField("sCache");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(null);
            for (Entry entry : this.f26141a.entrySet()) {
                String str = (String) entry.getKey();
                C9570d dVar = (C9570d) entry.getValue();
                IBinder iBinder = (IBinder) declaredMethod.invoke(null, new Object[]{str});
                ClassLoader classLoader = cls.getClassLoader();
                Class[] clsArr = {IBinder.class};
                C9569c cVar = new C9569c(iBinder, dVar);
                IBinder iBinder2 = (IBinder) Proxy.newProxyInstance(classLoader, clsArr, cVar);
                cVar.mo23881a(iBinder2);
                map.put(str, iBinder2);
            }
        }
    }

    /* renamed from: a */
    public final void mo23880a(String str, C9570d dVar) {
        this.f26141a.put(str, dVar);
    }
}

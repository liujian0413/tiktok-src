package com.bytedance.android.livesdk;

import com.bytedance.ies.sdk.widgets.IRecyclableWidget;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.ab */
public class C3850ab implements IWidgetProvider {

    /* renamed from: a */
    private static volatile C3850ab f11544a;

    /* renamed from: b */
    private Map<Class, IRecyclableWidget> f11545b = new HashMap();

    /* renamed from: a */
    public static C3850ab m13691a() {
        if (f11544a == null) {
            synchronized (C3850ab.class) {
                if (f11544a == null) {
                    f11544a = new C3850ab();
                }
            }
        }
        return f11544a;
    }

    /* renamed from: b */
    public final void mo11396b() {
        for (Entry value : this.f11545b.entrySet()) {
            ((IRecyclableWidget) value.getValue()).setClearAfterDestroyed();
        }
        this.f11545b.clear();
    }

    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
        T t = (IRecyclableWidget) this.f11545b.get(cls);
        if (t != null && t.isAlive()) {
            t.setClearAfterDestroyed();
            t = null;
        }
        if (t != null) {
            return t;
        }
        try {
            T t2 = (IRecyclableWidget) cls.newInstance();
            this.f11545b.put(cls, t2);
            return t2;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }
}

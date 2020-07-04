package androidx.work;

import androidx.work.C1458e.C1459a;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class ArrayCreatingInputMerger extends C1460f {
    /* renamed from: a */
    private static Object m7291a(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }

    /* renamed from: a */
    public final C1458e mo6664a(List<C1458e> list) {
        C1459a aVar = new C1459a();
        HashMap hashMap = new HashMap();
        loop0:
        for (C1458e a : list) {
            Iterator it = a.mo6692a().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    Class cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            if (cls2.isArray()) {
                                value = m7292a(obj, value);
                            } else {
                                value = m7293b(obj, value);
                            }
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = m7294c(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = m7294c(value, obj);
                        }
                    } else if (!cls.isArray()) {
                        value = m7291a(value);
                    }
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.mo6695a(hashMap);
        return aVar.mo6696a();
    }

    /* renamed from: a */
    private static Object m7292a(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    /* renamed from: b */
    private static Object m7293b(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    /* renamed from: c */
    private static Object m7294c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }
}

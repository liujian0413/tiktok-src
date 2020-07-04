package com.bytedance.android.live.core.setting;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.setting.d */
public final class C3330d {
    /* renamed from: a */
    private static C3338l m12425a(Object obj) {
        C3338l lVar;
        if (obj instanceof C3338l) {
            return (C3338l) obj;
        }
        try {
            Class cls = obj.getClass();
            Field declaredField = cls.getDeclaredField("name");
            declaredField.setAccessible(true);
            String str = (String) declaredField.get(obj);
            Field declaredField2 = cls.getDeclaredField("description");
            declaredField2.setAccessible(true);
            String str2 = (String) declaredField2.get(obj);
            Field declaredField3 = cls.getDeclaredField("defaultValue");
            declaredField3.setAccessible(true);
            Object obj2 = declaredField3.get(obj);
            if (obj2 != null) {
                Field declaredField4 = cls.getDeclaredField("option");
                declaredField4.setAccessible(true);
                lVar = new C3338l(str, obj2, str2, (String[]) declaredField4.get(obj));
            } else {
                Field declaredField5 = cls.getDeclaredField("type");
                declaredField5.setAccessible(true);
                lVar = new C3338l(str, (Class) declaredField5.get(obj), str2);
            }
        } catch (Exception unused) {
            lVar = null;
        }
        return lVar;
    }

    /* renamed from: a */
    public static List<C3338l> m12426a(String[] strArr) {
        Field[] fields;
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (String cls : strArr) {
            try {
                for (Field field : Class.forName(cls).getFields()) {
                    if (Modifier.isStatic(field.getModifiers())) {
                        try {
                            obj = field.get(null);
                        } catch (IllegalAccessException unused) {
                            obj = null;
                        }
                        C3338l a = m12425a(obj);
                        if (a != null && !TextUtils.isEmpty(C3339m.m12455d(a))) {
                            arrayList.add(a);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        Collections.sort(arrayList, C3331e.f10082a);
        return arrayList;
    }
}

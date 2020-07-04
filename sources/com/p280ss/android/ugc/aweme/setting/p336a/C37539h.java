package com.p280ss.android.ugc.aweme.setting.p336a;

import android.text.TextUtils;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.setting.a.h */
public final class C37539h {

    /* renamed from: a */
    private Field f97924a;

    /* renamed from: b */
    private C7206i f97925b;

    /* renamed from: c */
    private Object f97926c;

    /* renamed from: b */
    public final String mo94824b() {
        if (TextUtils.isEmpty(this.f97925b.mo18699a())) {
            return this.f97924a.getName();
        }
        return this.f97925b.mo18699a();
    }

    /* renamed from: c */
    public final String[] mo94825c() {
        String[] c = this.f97925b.mo18701c();
        if (c.length == 0) {
            c = new String[this.f97925b.mo18700b().length];
            for (int i = 0; i < this.f97925b.mo18700b().length; i++) {
                c[i] = String.valueOf(this.f97925b.mo18700b()[i]);
            }
        }
        return c;
    }

    /* renamed from: a */
    public final String mo94822a() throws IllegalAccessException {
        String sb;
        int intValue = ((Integer) this.f97924a.get(this.f97926c)).intValue();
        int[] b = this.f97925b.mo18700b();
        String[] c = this.f97925b.mo18701c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(intValue);
        String sb3 = sb2.toString();
        if (c.length == 0) {
            return sb3;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= b.length) {
                break;
            } else if (b[i] == intValue) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            sb = c[i];
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(intValue);
            sb4.append(" (你没有指定过这个数字)");
            sb = sb4.toString();
        }
        return sb;
    }

    /* renamed from: b */
    private int m120254b(int i) {
        return this.f97925b.mo18700b()[i];
    }

    /* renamed from: a */
    public final void mo94823a(int i) {
        try {
            this.f97924a.set(this.f97926c, Integer.valueOf(m120254b(i)));
        } catch (IllegalAccessException unused) {
        }
    }

    public C37539h(Field field, Object obj) {
        this.f97924a = field;
        this.f97926c = obj;
        field.setAccessible(true);
        this.f97925b = (C7206i) field.getAnnotation(C7206i.class);
    }
}

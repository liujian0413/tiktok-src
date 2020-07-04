package com.google.gson;

import com.google.gson.internal.C6619a;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

/* renamed from: com.google.gson.o */
public final class C6712o extends C6709k {

    /* renamed from: a */
    private static final Class<?>[] f19166a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b */
    private Object f19167b;

    /* renamed from: a */
    public final boolean mo16156a() {
        return this.f19167b instanceof Boolean;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final Boolean mo16139p() {
        return (Boolean) this.f19167b;
    }

    /* renamed from: q */
    public final boolean mo16159q() {
        return this.f19167b instanceof Number;
    }

    /* renamed from: r */
    public final boolean mo16160r() {
        return this.f19167b instanceof String;
    }

    /* renamed from: d */
    public final double mo15999d() {
        if (mo16159q()) {
            return mo15997b().doubleValue();
        }
        return Double.parseDouble(mo15998c());
    }

    /* renamed from: e */
    public final float mo16000e() {
        if (mo16159q()) {
            return mo15997b().floatValue();
        }
        return Float.parseFloat(mo15998c());
    }

    /* renamed from: f */
    public final long mo16002f() {
        if (mo16159q()) {
            return mo15997b().longValue();
        }
        return Long.parseLong(mo15998c());
    }

    /* renamed from: g */
    public final int mo16003g() {
        if (mo16159q()) {
            return mo15997b().intValue();
        }
        return Integer.parseInt(mo15998c());
    }

    /* renamed from: h */
    public final boolean mo16004h() {
        if (mo16156a()) {
            return mo16139p().booleanValue();
        }
        return Boolean.parseBoolean(mo15998c());
    }

    /* renamed from: b */
    public final Number mo15997b() {
        if (this.f19167b instanceof String) {
            return new LazilyParsedNumber((String) this.f19167b);
        }
        return (Number) this.f19167b;
    }

    /* renamed from: c */
    public final String mo15998c() {
        if (mo16159q()) {
            return mo15997b().toString();
        }
        if (mo16156a()) {
            return mo16139p().toString();
        }
        return (String) this.f19167b;
    }

    public final int hashCode() {
        if (this.f19167b == null) {
            return 31;
        }
        if (m20764a(this)) {
            long longValue = mo15997b().longValue();
            return (int) ((longValue >>> 32) ^ longValue);
        } else if (!(this.f19167b instanceof Number)) {
            return this.f19167b.hashCode();
        } else {
            long doubleToLongBits = Double.doubleToLongBits(mo15997b().doubleValue());
            return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
        }
    }

    public C6712o(Boolean bool) {
        m20763a((Object) bool);
    }

    public C6712o(Number number) {
        m20763a((Object) number);
    }

    C6712o(Object obj) {
        m20763a(obj);
    }

    /* renamed from: b */
    private static boolean m20765b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class<?> isAssignableFrom : f19166a) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public C6712o(String str) {
        m20763a((Object) str);
    }

    /* renamed from: a */
    private void m20763a(Object obj) {
        boolean z;
        if (obj instanceof Character) {
            this.f19167b = String.valueOf(((Character) obj).charValue());
            return;
        }
        if ((obj instanceof Number) || m20765b(obj)) {
            z = true;
        } else {
            z = false;
        }
        C6619a.m20528a(z);
        this.f19167b = obj;
    }

    /* renamed from: a */
    private static boolean m20764a(C6712o oVar) {
        if (!(oVar.f19167b instanceof Number)) {
            return false;
        }
        Number number = (Number) oVar.f19167b;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6712o oVar = (C6712o) obj;
        if (this.f19167b == null) {
            if (oVar.f19167b == null) {
                return true;
            }
            return false;
        } else if (!m20764a(this) || !m20764a(oVar)) {
            if (!(this.f19167b instanceof Number) || !(oVar.f19167b instanceof Number)) {
                return this.f19167b.equals(oVar.f19167b);
            }
            double doubleValue = mo15997b().doubleValue();
            double doubleValue2 = oVar.mo15997b().doubleValue();
            if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                return true;
            }
            return false;
        } else if (mo15997b().longValue() == oVar.mo15997b().longValue()) {
            return true;
        } else {
            return false;
        }
    }
}

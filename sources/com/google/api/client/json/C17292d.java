package com.google.api.client.json;

import com.google.api.client.util.C17350ae;
import com.google.api.client.util.C17362g;
import com.google.api.client.util.C17366i;
import com.google.api.client.util.C17371k;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.GenericData;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.json.d */
public abstract class C17292d {
    /* renamed from: a */
    public abstract void mo44675a() throws IOException;

    /* renamed from: a */
    public abstract void mo44676a(double d) throws IOException;

    /* renamed from: a */
    public abstract void mo44677a(float f) throws IOException;

    /* renamed from: a */
    public abstract void mo44678a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo44679a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo44680a(String str) throws IOException;

    /* renamed from: a */
    public abstract void mo44681a(BigDecimal bigDecimal) throws IOException;

    /* renamed from: a */
    public abstract void mo44682a(BigInteger bigInteger) throws IOException;

    /* renamed from: a */
    public abstract void mo44683a(boolean z) throws IOException;

    /* renamed from: b */
    public abstract void mo44684b() throws IOException;

    /* renamed from: b */
    public abstract void mo44685b(String str) throws IOException;

    /* renamed from: c */
    public abstract void mo44686c() throws IOException;

    /* renamed from: d */
    public abstract void mo44687d() throws IOException;

    /* renamed from: e */
    public abstract void mo44688e() throws IOException;

    /* renamed from: f */
    public abstract void mo44689f() throws IOException;

    /* renamed from: g */
    public void mo44690g() throws IOException {
    }

    /* renamed from: a */
    public final void mo44723a(Object obj) throws IOException {
        m57580a(false, obj);
    }

    /* renamed from: a */
    private void m57580a(boolean z, Object obj) throws IOException {
        boolean z2;
        C17362g gVar;
        boolean z3;
        if (obj != null) {
            Class cls = obj.getClass();
            if (C17366i.m57811a(obj)) {
                mo44689f();
            } else if (obj instanceof String) {
                mo44685b((String) obj);
            } else {
                boolean z4 = true;
                if (obj instanceof Number) {
                    if (z) {
                        mo44685b(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        mo44681a((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        mo44682a((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        mo44679a(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                            z4 = false;
                        }
                        C17384w.m57850a(z4);
                        mo44677a(floatValue);
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        mo44678a(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                            z4 = false;
                        }
                        C17384w.m57850a(z4);
                        mo44676a(doubleValue);
                    }
                } else if (obj instanceof Boolean) {
                    mo44683a(((Boolean) obj).booleanValue());
                } else if (obj instanceof DateTime) {
                    mo44685b(((DateTime) obj).toStringRfc3339());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    mo44684b();
                    for (Object a : C17350ae.m57777a(obj)) {
                        m57580a(z, a);
                    }
                    mo44686c();
                } else {
                    if (cls.isEnum()) {
                        String str = C17371k.m57823a((Enum) obj).f48314c;
                        if (str == null) {
                            mo44689f();
                        } else {
                            mo44685b(str);
                        }
                    } else {
                        mo44687d();
                        if (!(obj instanceof Map) || (obj instanceof GenericData)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            gVar = null;
                        } else {
                            gVar = C17362g.m57798a(cls);
                        }
                        for (Entry entry : C17366i.m57815b(obj).entrySet()) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String str2 = (String) entry.getKey();
                                if (z2) {
                                    z3 = z;
                                } else {
                                    Field b = gVar.mo44833b(str2);
                                    if (b == null || b.getAnnotation(C6578h.class) == null) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                }
                                mo44680a(str2);
                                m57580a(z3, value);
                            }
                        }
                        mo44688e();
                    }
                }
            }
        }
    }
}

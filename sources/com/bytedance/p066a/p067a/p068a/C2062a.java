package com.bytedance.p066a.p067a.p068a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.a.a.a.a */
public final class C2062a {

    /* renamed from: a */
    private Map<String, List<C2071f>> f7120a = new HashMap();

    /* renamed from: b */
    private Map<Class<?>, C2070e> f7121b = new HashMap();

    /* renamed from: c */
    private Set<String> f7122c = new HashSet();

    /* renamed from: d */
    private Set<String> f7123d = new HashSet();

    /* renamed from: e */
    private Set<String> f7124e = new HashSet();

    /* renamed from: b */
    public final void mo7715b(Object obj) {
        this.f7121b.remove(obj.getClass());
        Iterator it = this.f7120a.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = ((List) this.f7120a.get(str)).iterator();
            while (it2.hasNext()) {
                if (obj.equals(((C2071f) it2.next()).mo7729a())) {
                    it2.remove();
                }
            }
            if (((List) this.f7120a.get(str)).isEmpty()) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void mo7713a(Object obj) {
        SystemClock.elapsedRealtime();
        Class cls = obj.getClass();
        C2070e a = C2067b.m9139a(cls);
        this.f7121b.put(cls, a);
        for (C2068c cVar : a.mo7726a()) {
            String str = cVar.f7128c;
            String str2 = cVar.f7127b;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1106578487) {
                if (hashCode != -977423767) {
                    if (hashCode == -608539730 && str.equals("protected")) {
                        c = 1;
                    }
                } else if (str.equals("public")) {
                    c = 0;
                }
            } else if (str.equals("legacy")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    this.f7122c.add(str2);
                    break;
                case 1:
                    this.f7123d.add(str2);
                    break;
                case 2:
                    this.f7124e.add(str2);
                    break;
            }
            if (!this.f7120a.containsKey(str2)) {
                this.f7120a.put(str2, new ArrayList());
            }
            ((List) this.f7120a.get(str2)).add(new C2071f(obj, cVar.f7126a));
        }
    }

    /* renamed from: a */
    public final boolean mo7714a(String str, JSONObject jSONObject, String str2, JSONObject jSONObject2) {
        String str3;
        float f;
        double d;
        boolean z;
        long j;
        int i;
        C2062a aVar = this;
        String str4 = str;
        JSONObject jSONObject3 = jSONObject;
        SystemClock.elapsedRealtime();
        if (!aVar.f7120a.containsKey(str4)) {
            return false;
        }
        boolean z2 = false;
        for (C2071f fVar : (List) aVar.f7120a.get(str4)) {
            if (fVar.mo7729a() != null) {
                Method method = fVar.f7135a;
                C2069d[] dVarArr = ((C2070e) aVar.f7121b.get(fVar.f7136b)).mo7725a(str4).f7129d;
                Object[] objArr = new Object[dVarArr.length];
                int i2 = 0;
                while (i2 < dVarArr.length) {
                    C2069d dVar = dVarArr[i2];
                    switch (dVar.f7130a) {
                        case 0:
                            String str5 = dVar.f7132c;
                            if (TextUtils.isEmpty(dVar.f7132c)) {
                                break;
                            } else {
                                Class<?> cls = dVar.f7131b;
                                Object obj = dVar.f7133d;
                                Object obj2 = null;
                                if (cls == Integer.TYPE) {
                                    if (jSONObject3 != null) {
                                        i = jSONObject3.optInt(str5, ((Integer) obj).intValue());
                                    } else {
                                        i = ((Integer) obj).intValue();
                                    }
                                    obj2 = Integer.valueOf(i);
                                } else if (cls == Long.TYPE) {
                                    if (jSONObject3 != null) {
                                        j = jSONObject3.optLong(str5, ((Long) obj).longValue());
                                    } else {
                                        j = ((Long) obj).longValue();
                                    }
                                    obj2 = Long.valueOf(j);
                                } else if (cls == Boolean.TYPE) {
                                    if (jSONObject3 != null) {
                                        z = jSONObject3.optBoolean(str5, ((Boolean) obj).booleanValue());
                                    } else {
                                        z = ((Boolean) obj).booleanValue();
                                    }
                                    obj2 = Boolean.valueOf(z);
                                } else if (cls == Double.TYPE) {
                                    if (jSONObject3 != null) {
                                        d = jSONObject3.optDouble(str5, ((Double) obj).doubleValue());
                                    } else {
                                        d = ((Double) obj).doubleValue();
                                    }
                                    obj2 = Double.valueOf(d);
                                } else if (cls == Float.TYPE) {
                                    if (jSONObject3 != null) {
                                        f = (float) jSONObject3.optDouble(str5, (double) ((Float) obj).floatValue());
                                    } else {
                                        f = ((Float) obj).floatValue();
                                    }
                                    obj2 = Float.valueOf(f);
                                } else if (cls == String.class) {
                                    if (jSONObject3 != null) {
                                        str3 = jSONObject3.optString(str5, (String) obj);
                                    } else {
                                        str3 = (String) obj;
                                    }
                                    objArr[i2] = str3;
                                    break;
                                } else if (cls == JSONObject.class) {
                                    if (jSONObject3 != null) {
                                        obj2 = jSONObject3.optJSONObject(str5);
                                    }
                                    objArr[i2] = obj2;
                                    break;
                                } else if (cls != JSONArray.class) {
                                    break;
                                } else if (jSONObject3 != null) {
                                    obj2 = jSONObject3.optJSONArray(str5);
                                }
                                objArr[i2] = obj2;
                                break;
                            }
                        case 1:
                            objArr[i2] = str2;
                            break;
                        case 2:
                            objArr[i2] = jSONObject2;
                            break;
                    }
                    i2++;
                    String str6 = str;
                }
                try {
                    Object invoke = method.invoke(fVar.mo7729a(), objArr);
                    if (!(invoke instanceof Boolean) || !((Boolean) invoke).booleanValue()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } catch (Throwable unused) {
                }
            }
            aVar = this;
            str4 = str;
        }
        return z2;
    }
}

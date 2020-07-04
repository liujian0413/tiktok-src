package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16505en;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.bh */
public final class C17017bh {

    /* renamed from: a */
    private static Long f47661a = new Long(0);

    /* renamed from: b */
    private static Double f47662b = new Double(0.0d);

    /* renamed from: c */
    private static C17016bg f47663c = C17016bg.m56485a(0);

    /* renamed from: d */
    private static String f47664d = new String("");

    /* renamed from: e */
    private static Boolean f47665e = new Boolean(false);

    /* renamed from: f */
    private static List<Object> f47666f = new ArrayList(0);

    /* renamed from: g */
    private static Map<Object, Object> f47667g = new HashMap();

    /* renamed from: h */
    private static C16505en f47668h = m56489a((Object) f47664d);

    /* renamed from: a */
    public static C16505en m56488a() {
        return f47668h;
    }

    /* renamed from: b */
    private static String m56492b(Object obj) {
        return obj == null ? f47664d : obj.toString();
    }

    /* renamed from: a */
    public static String m56490a(C16505en enVar) {
        return m56492b(m56493c(enVar));
    }

    /* renamed from: b */
    public static Boolean m56491b(C16505en enVar) {
        Object c = m56493c(enVar);
        if (c instanceof Boolean) {
            return (Boolean) c;
        }
        String b = m56492b(c);
        if ("true".equalsIgnoreCase(b)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(b)) {
            return Boolean.FALSE;
        }
        return f47665e;
    }

    /* renamed from: a */
    public static C16505en m56489a(Object obj) {
        String str;
        C16505en enVar = new C16505en();
        if (obj instanceof C16505en) {
            return (C16505en) obj;
        }
        boolean z = false;
        if (obj instanceof String) {
            enVar.f46251a = 1;
            enVar.f46252b = (String) obj;
        } else if (obj instanceof List) {
            enVar.f46251a = 2;
            List<Object> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            boolean z2 = false;
            for (Object a : list) {
                C16505en a2 = m56489a(a);
                if (a2 == f47668h) {
                    return f47668h;
                }
                z2 = z2 || a2.f46262l;
                arrayList.add(a2);
            }
            enVar.f46253c = (C16505en[]) arrayList.toArray(new C16505en[0]);
            z = z2;
        } else if (obj instanceof Map) {
            enVar.f46251a = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            ArrayList arrayList2 = new ArrayList(entrySet.size());
            ArrayList arrayList3 = new ArrayList(entrySet.size());
            boolean z3 = false;
            for (Entry entry : entrySet) {
                C16505en a3 = m56489a(entry.getKey());
                C16505en a4 = m56489a(entry.getValue());
                if (a3 == f47668h || a4 == f47668h) {
                    return f47668h;
                }
                z3 = z3 || a3.f46262l || a4.f46262l;
                arrayList2.add(a3);
                arrayList3.add(a4);
            }
            enVar.f46254d = (C16505en[]) arrayList2.toArray(new C16505en[0]);
            enVar.f46255e = (C16505en[]) arrayList3.toArray(new C16505en[0]);
            z = z3;
        } else if (m56494c(obj)) {
            enVar.f46251a = 1;
            enVar.f46252b = obj.toString();
        } else if (m56495d(obj)) {
            enVar.f46251a = 6;
            enVar.f46258h = m56496e(obj);
        } else if (obj instanceof Boolean) {
            enVar.f46251a = 8;
            enVar.f46259i = ((Boolean) obj).booleanValue();
        } else {
            String str2 = "Converting to Value from unknown object type: ";
            if (obj == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str = obj.getClass().toString();
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return f47668h;
        }
        enVar.f46262l = z;
        return enVar;
    }

    /* renamed from: c */
    private static boolean m56494c(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof C17016bg) && ((C17016bg) obj).mo44232a());
    }

    /* renamed from: d */
    private static boolean m56495d(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof C17016bg) && ((C17016bg) obj).mo44233b());
    }

    /* renamed from: e */
    private static long m56496e(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0;
    }

    /* renamed from: c */
    public static Object m56493c(C16505en enVar) {
        if (enVar == null) {
            return null;
        }
        int i = 0;
        switch (enVar.f46251a) {
            case 1:
                return enVar.f46252b;
            case 2:
                ArrayList arrayList = new ArrayList(enVar.f46253c.length);
                C16505en[] enVarArr = enVar.f46253c;
                int length = enVarArr.length;
                while (i < length) {
                    Object c = m56493c(enVarArr[i]);
                    if (c == null) {
                        return null;
                    }
                    arrayList.add(c);
                    i++;
                }
                return arrayList;
            case 3:
                if (enVar.f46254d.length != enVar.f46255e.length) {
                    String str = "Converting an invalid value to object: ";
                    String valueOf = String.valueOf(enVar.toString());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        new String(str);
                    }
                    return null;
                }
                HashMap hashMap = new HashMap(enVar.f46255e.length);
                while (i < enVar.f46254d.length) {
                    Object c2 = m56493c(enVar.f46254d[i]);
                    Object c3 = m56493c(enVar.f46255e[i]);
                    if (c2 == null || c3 == null) {
                        return null;
                    }
                    hashMap.put(c2, c3);
                    i++;
                }
                return hashMap;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Long.valueOf(enVar.f46258h);
            case 7:
                StringBuilder sb = new StringBuilder();
                C16505en[] enVarArr2 = enVar.f46260j;
                int length2 = enVarArr2.length;
                while (i < length2) {
                    String b = m56492b(m56493c(enVarArr2[i]));
                    if (b == f47664d) {
                        return null;
                    }
                    sb.append(b);
                    i++;
                }
                return sb.toString();
            case 8:
                return Boolean.valueOf(enVar.f46259i);
            default:
                int i2 = enVar.f46251a;
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Failed to convert a value of type: ");
                sb2.append(i2);
                return null;
        }
    }
}

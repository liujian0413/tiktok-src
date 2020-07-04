package com.google.api.client.http;

import com.C1642a;
import com.google.api.client.repackaged.com.google.common.base.C17323i;
import com.google.api.client.util.C17350ae;
import com.google.api.client.util.C17366i;
import com.google.api.client.util.C17371k;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.p782a.C17340a;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.http.aa */
public final class C17237aa {

    /* renamed from: a */
    static final Map<Character, C17238a> f48034a = new HashMap();

    /* renamed from: com.google.api.client.http.aa$a */
    enum C17238a {
        PLUS(Character.valueOf('+'), "", ",", false, true),
        HASH(Character.valueOf('#'), "#", ",", false, true),
        DOT(Character.valueOf('.'), ClassUtils.PACKAGE_SEPARATOR, ClassUtils.PACKAGE_SEPARATOR, false, false),
        FORWARD_SLASH(Character.valueOf('/'), "/", "/", false, false),
        SEMI_COLON(Character.valueOf(';'), ";", ";", true, false),
        QUERY(Character.valueOf('?'), "?", "&", true, false),
        AMP(Character.valueOf('&'), "&", "&", true, false),
        SIMPLE(null, "", ",", false, false);
        

        /* renamed from: i */
        public final String f48044i;

        /* renamed from: j */
        public final String f48045j;

        /* renamed from: k */
        public final boolean f48046k;

        /* renamed from: l */
        public final boolean f48047l;

        /* renamed from: m */
        private final Character f48048m;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo44589a() {
            if (this.f48048m == null) {
                return 0;
            }
            return 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo44590a(String str) {
            if (this.f48047l) {
                return C17340a.m57754c(str);
            }
            return C17340a.m57752a(str);
        }

        private C17238a(Character ch, String str, String str2, boolean z, boolean z2) {
            this.f48048m = ch;
            this.f48044i = (String) C17384w.m57847a(str);
            this.f48045j = (String) C17384w.m57847a(str2);
            this.f48046k = z;
            this.f48047l = z2;
            if (ch != null) {
                C17237aa.f48034a.put(ch, this);
            }
        }
    }

    static {
        C17238a.values();
    }

    /* renamed from: a */
    private static C17238a m57300a(String str) {
        C17238a aVar = (C17238a) f48034a.get(Character.valueOf(str.charAt(0)));
        if (aVar == null) {
            return C17238a.SIMPLE;
        }
        return aVar;
    }

    /* renamed from: a */
    private static Map<String, Object> m57305a(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : C17366i.m57815b(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !C17366i.m57811a(value)) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private static String m57301a(String str, Object obj, boolean z) {
        int i;
        Object obj2;
        Map a = m57305a(obj);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int indexOf = str.indexOf(123, i2);
            if (indexOf != -1) {
                sb.append(str.substring(i2, indexOf));
                int indexOf2 = str.indexOf(125, indexOf + 2);
                int i3 = indexOf2 + 1;
                String substring = str.substring(indexOf + 1, indexOf2);
                C17238a a2 = m57300a(substring);
                ListIterator listIterator = C17323i.m57695a(',').mo44755a((CharSequence) substring).listIterator();
                boolean z2 = true;
                while (listIterator.hasNext()) {
                    String str2 = (String) listIterator.next();
                    boolean endsWith = str2.endsWith("*");
                    if (listIterator.nextIndex() == 1) {
                        i = a2.mo44589a();
                    } else {
                        i = 0;
                    }
                    int length2 = str2.length();
                    if (endsWith) {
                        length2--;
                    }
                    String substring2 = str2.substring(i, length2);
                    Object remove = a.remove(substring2);
                    if (remove != null) {
                        if (!z2) {
                            sb.append(a2.f48045j);
                        } else {
                            sb.append(a2.f48044i);
                            z2 = false;
                        }
                        if (remove instanceof Iterator) {
                            obj2 = m57303a(substring2, (Iterator) remove, endsWith, a2);
                        } else if ((remove instanceof Iterable) || remove.getClass().isArray()) {
                            obj2 = m57303a(substring2, C17350ae.m57777a(remove).iterator(), endsWith, a2);
                        } else if (remove.getClass().isEnum()) {
                            if (C17371k.m57823a((Enum) remove).f48314c != null) {
                                if (a2.f48046k) {
                                    remove = C1642a.m8034a("%s=%s", new Object[]{substring2, remove});
                                }
                                remove = C17340a.m57754c(remove.toString());
                            }
                            obj2 = remove;
                        } else if (!C17366i.m57817d(remove)) {
                            obj2 = m57304a(substring2, m57305a(remove), endsWith, a2);
                        } else {
                            if (a2.f48046k) {
                                remove = C1642a.m8034a("%s=%s", new Object[]{substring2, remove});
                            }
                            if (a2.f48047l) {
                                obj2 = C17340a.m57755d(remove.toString());
                            } else {
                                obj2 = C17340a.m57754c(remove.toString());
                            }
                        }
                        sb.append(obj2);
                    }
                }
                i2 = i3;
            } else if (i2 == 0 && !z) {
                return str;
            } else {
                sb.append(str.substring(i2));
            }
        }
        if (z) {
            C17256g.m57364a(a.entrySet(), sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m57302a(String str, String str2, Object obj, boolean z) {
        String str3;
        if (str2.startsWith("/")) {
            C17256g gVar = new C17256g(str);
            gVar.mo44608b(null);
            String valueOf = String.valueOf(gVar.mo44609c());
            String valueOf2 = String.valueOf(str2);
            if (valueOf2.length() != 0) {
                str3 = valueOf.concat(valueOf2);
                return m57301a(str3, obj, true);
            }
            str2 = new String(valueOf);
        } else if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(str2);
            if (valueOf4.length() != 0) {
                str2 = valueOf3.concat(valueOf4);
            } else {
                str2 = new String(valueOf3);
            }
        }
        str3 = str2;
        return m57301a(str3, obj, true);
    }

    /* renamed from: a */
    private static String m57303a(String str, Iterator<?> it, boolean z, C17238a aVar) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = aVar.f48045j;
        } else {
            str2 = ",";
            if (aVar.f48046k) {
                sb.append(C17340a.m57754c(str));
                sb.append("=");
            }
        }
        while (it.hasNext()) {
            if (z && aVar.f48046k) {
                sb.append(C17340a.m57754c(str));
                sb.append("=");
            }
            sb.append(aVar.mo44590a(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m57304a(String str, Map<String, Object> map, boolean z, C17238a aVar) {
        String str2;
        String str3;
        if (map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str3 = aVar.f48045j;
            str2 = "=";
        } else {
            String str4 = ",";
            String str5 = ",";
            if (aVar.f48046k) {
                sb.append(C17340a.m57754c(str));
                sb.append("=");
            }
            str3 = str4;
            str2 = str5;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            String a = aVar.mo44590a((String) entry.getKey());
            String a2 = aVar.mo44590a(entry.getValue().toString());
            sb.append(a);
            sb.append(str2);
            sb.append(a2);
            if (it.hasNext()) {
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}

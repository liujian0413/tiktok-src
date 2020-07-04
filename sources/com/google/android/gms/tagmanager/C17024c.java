package com.google.android.gms.tagmanager;

import com.C1642a;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.tagmanager.c */
public final class C17024c {

    /* renamed from: a */
    public static final Object f47676a = new Object();

    /* renamed from: b */
    private static final String[] f47677b = "gtm.lifetime".toString().split("\\.");

    /* renamed from: c */
    private static final Pattern f47678c = Pattern.compile("(\\d+)\\s*([smhd]?)");

    /* renamed from: d */
    private final ConcurrentHashMap<C17026b, Integer> f47679d;

    /* renamed from: e */
    private final Map<String, Object> f47680e;

    /* renamed from: f */
    private final ReentrantLock f47681f;

    /* renamed from: g */
    private final LinkedList<Map<String, Object>> f47682g;

    /* renamed from: h */
    private final C17027c f47683h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final CountDownLatch f47684i;

    /* renamed from: com.google.android.gms.tagmanager.c$a */
    static final class C17025a {

        /* renamed from: a */
        public final String f47685a;

        /* renamed from: b */
        public final Object f47686b;

        C17025a(String str, Object obj) {
            this.f47685a = str;
            this.f47686b = obj;
        }

        public final String toString() {
            String str = this.f47685a;
            String obj = this.f47686b.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(obj).length());
            sb.append("Key: ");
            sb.append(str);
            sb.append(" value: ");
            sb.append(obj);
            return sb.toString();
        }

        public final int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.f47685a.hashCode()), Integer.valueOf(this.f47686b.hashCode())});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17025a)) {
                return false;
            }
            C17025a aVar = (C17025a) obj;
            if (!this.f47685a.equals(aVar.f47685a) || !this.f47686b.equals(aVar.f47686b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.gms.tagmanager.c$b */
    interface C17026b {
        /* renamed from: a */
        void mo44228a(Map<String, Object> map);
    }

    /* renamed from: com.google.android.gms.tagmanager.c$c */
    interface C17027c {
        /* renamed from: a */
        void mo44256a(C17034i iVar);

        /* renamed from: a */
        void mo44257a(List<C17025a> list, long j);
    }

    C17024c() {
        this(new C17032g());
    }

    C17024c(C17027c cVar) {
        this.f47683h = cVar;
        this.f47679d = new ConcurrentHashMap<>();
        this.f47680e = new HashMap();
        this.f47681f = new ReentrantLock();
        this.f47682g = new LinkedList<>();
        this.f47684i = new CountDownLatch(1);
        this.f47683h.mo44256a(new C17033h(this));
    }

    public final String toString() {
        String sb;
        synchronized (this.f47680e) {
            StringBuilder sb2 = new StringBuilder();
            for (Entry entry : this.f47680e.entrySet()) {
                sb2.append(C1642a.m8034a("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{entry.getKey(), entry.getValue()}));
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public final void mo44251a(Map<String, Object> map) {
        try {
            this.f47684i.await();
        } catch (InterruptedException unused) {
        }
        m56519b(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m56519b(Map<String, Object> map) {
        Long l;
        Object obj;
        this.f47681f.lock();
        try {
            this.f47682g.offer(map);
            int i = 0;
            if (this.f47681f.getHoldCount() == 1) {
                int i2 = 0;
                while (true) {
                    Map map2 = (Map) this.f47682g.poll();
                    if (map2 == null) {
                        break;
                    }
                    synchronized (this.f47680e) {
                        for (String str : map2.keySet()) {
                            m56518a(m56513a(str, map2.get(str)), this.f47680e);
                        }
                    }
                    for (C17026b a : this.f47679d.keySet()) {
                        a.mo44228a(map2);
                    }
                    i2++;
                    if (i2 > 500) {
                        this.f47682g.clear();
                        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                    }
                }
            }
            String[] strArr = f47677b;
            int length = strArr.length;
            Object obj2 = map;
            while (true) {
                l = null;
                if (i >= length) {
                    obj = obj2;
                    break;
                }
                String str2 = strArr[i];
                if (!(obj2 instanceof Map)) {
                    obj = 0;
                    break;
                } else {
                    i++;
                    obj2 = ((Map) obj2).get(str2);
                }
            }
            if (obj != 0) {
                l = m56512a(obj.toString());
            }
            if (l != null) {
                ArrayList arrayList = new ArrayList();
                m56517a(map, "", arrayList);
                this.f47683h.mo44257a(arrayList, l.longValue());
            }
            this.f47681f.unlock();
        } catch (Throwable th) {
            this.f47681f.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    private final void m56517a(Map<String, Object> map, String str, Collection<C17025a> collection) {
        for (Entry entry : map.entrySet()) {
            String str2 = str.length() == 0 ? "" : ClassUtils.PACKAGE_SEPARATOR;
            String str3 = (String) entry.getKey();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            String sb2 = sb.toString();
            if (entry.getValue() instanceof Map) {
                m56517a((Map) entry.getValue(), sb2, collection);
            } else if (!sb2.equals("gtm.lifetime")) {
                collection.add(new C17025a(sb2, entry.getValue()));
            }
        }
    }

    /* renamed from: a */
    private static Long m56512a(String str) {
        long j;
        Matcher matcher = f47678c.matcher(str);
        if (!matcher.matches()) {
            String str2 = "unknown _lifetime: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        }
        try {
            j = Long.parseLong(matcher.group(1));
        } catch (NumberFormatException unused) {
            String str3 = "illegal number in _lifetime value: ";
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3.concat(valueOf2);
            } else {
                new String(str3);
            }
            j = 0;
        }
        if (j <= 0) {
            String str4 = "non-positive _lifetime: ";
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                str4.concat(valueOf3);
            } else {
                new String(str4);
            }
            return null;
        }
        String group = matcher.group(2);
        if (group.length() == 0) {
            return Long.valueOf(j);
        }
        char charAt = group.charAt(0);
        if (charAt == 'd') {
            return Long.valueOf(j * 1000 * 60 * 60 * 24);
        }
        if (charAt == 'h') {
            return Long.valueOf(j * 1000 * 60 * 60);
        }
        if (charAt == 'm') {
            return Long.valueOf(j * 1000 * 60);
        }
        if (charAt == 's') {
            return Long.valueOf(j * 1000);
        }
        String str5 = "unknown units in _lifetime: ";
        String valueOf4 = String.valueOf(str);
        if (valueOf4.length() != 0) {
            str5.concat(valueOf4);
        } else {
            new String(str5);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44250a(C17026b bVar) {
        this.f47679d.put(bVar, Integer.valueOf(0));
    }

    /* renamed from: a */
    static Map<String, Object> m56513a(String str, Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        HashMap hashMap2 = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap3 = new HashMap();
            hashMap2.put(split[i], hashMap3);
            i++;
            hashMap2 = hashMap3;
        }
        hashMap2.put(split[split.length - 1], obj);
        return hashMap;
    }

    /* renamed from: a */
    private final void m56518a(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                m56516a((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                m56518a((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    /* renamed from: a */
    private final void m56516a(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                m56516a((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                m56518a((Map) obj, (Map) list2.get(i));
            } else if (obj != f47676a) {
                list2.set(i, obj);
            }
        }
    }
}

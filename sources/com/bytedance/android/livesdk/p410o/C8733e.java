package com.bytedance.android.livesdk.p410o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.e */
public final class C8733e {

    /* renamed from: a */
    Map<String, List<Object>> f23740a = new HashMap();

    /* renamed from: com.bytedance.android.livesdk.o.e$a */
    static final class C8734a {

        /* renamed from: a */
        public static final C8733e f23741a = new C8733e();
    }

    /* renamed from: a */
    public static final C8733e m26099a() {
        return C8734a.f23741a;
    }

    /* renamed from: a */
    private List<Object> m26100a(String str) {
        List<Object> list = (List) this.f23740a.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f23740a.put(str, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21732a(String[] strArr) {
        for (String a : strArr) {
            Iterator it = m26100a(a).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo21734b(String[] strArr, String[] strArr2) {
        for (String a : strArr2) {
            Iterator it = m26100a(a).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo21735c(String[] strArr, String[] strArr2) {
        for (String a : strArr2) {
            Iterator it = m26100a(a).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21733a(String[] strArr, String[] strArr2) {
        for (String a : strArr2) {
            Iterator it = m26100a(a).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}

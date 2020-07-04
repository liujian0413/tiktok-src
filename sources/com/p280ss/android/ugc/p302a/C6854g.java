package com.p280ss.android.ugc.p302a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.a.g */
public abstract class C6854g {

    /* renamed from: a */
    protected List<String> f19495a = new ArrayList();

    /* renamed from: b */
    protected Map<Class, List<String>> f19496b = new HashMap();

    /* renamed from: a */
    public abstract <T> T mo16707a(String str, Object... objArr);

    /* renamed from: a */
    public abstract <T> List<T> mo16708a(Class<T> cls, Object... objArr);

    /* renamed from: a */
    public C6854g mo16709a(Class cls) {
        if (this.f19496b.get(cls) != null) {
            return this;
        }
        return null;
    }

    /* renamed from: a */
    public C6854g mo16710a(String str) {
        if (this.f19495a.contains(str)) {
            return this;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> List<T> mo16716a(List<String> list, Object... objArr) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String a : list) {
            try {
                Object a2 = mo16707a(a, objArr);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16717a(Class cls, String... strArr) {
        List list = (List) this.f19496b.get(cls);
        if (list == null) {
            list = new ArrayList();
        }
        list.addAll(Arrays.asList(strArr));
        this.f19496b.put(cls, list);
    }
}

package com.bytedance.lobby.internal;

import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0902i;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12196a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.lobby.internal.a */
final class C12220a {

    /* renamed from: a */
    private static volatile C12220a f32504a;

    /* renamed from: b */
    private final Map<C0902i<String, Integer>, List<C12196a>> f32505b = new ArrayMap();

    private C12220a() {
    }

    /* renamed from: a */
    static C12220a m35533a() {
        if (f32504a == null) {
            synchronized (C12220a.class) {
                if (f32504a == null) {
                    f32504a = new C12220a();
                }
            }
        }
        return f32504a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29960a(String str, int i, AuthResult authResult) {
        synchronized (this.f32505b) {
            List<C12196a> list = (List) this.f32505b.get(new C0902i(str, Integer.valueOf(i)));
            if (!(list == null || authResult == null)) {
                for (C12196a a : list) {
                    a.mo29929a(authResult);
                }
                list.clear();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29961a(String str, int i, C12196a aVar) {
        synchronized (this.f32505b) {
            C0902i iVar = new C0902i(str, Integer.valueOf(1));
            List list = (List) this.f32505b.get(iVar);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                this.f32505b.put(iVar, arrayList);
            } else if (!list.contains(aVar)) {
                list.add(aVar);
            }
        }
    }
}

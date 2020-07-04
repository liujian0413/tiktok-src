package com.bytedance.p524g.p525a;

import android.content.Context;
import com.bytedance.p524g.p525a.p526a.C10255a;
import com.bytedance.p524g.p525a.p526a.C10256b;
import com.bytedance.p524g.p525a.p526a.C10257c;
import com.bytedance.p524g.p525a.p527b.C10267c;
import com.bytedance.p524g.p525a.p528c.C10270b;

/* renamed from: com.bytedance.g.a.c */
public final class C10268c {

    /* renamed from: a */
    private static C10256b<C10270b> f27899a = new C10257c();

    /* renamed from: b */
    private static C10256b<C10267c> f27900b = new C10255a();

    /* renamed from: a */
    public static C10267c m30418a(byte b) {
        return (C10267c) f27900b.mo24982a(b);
    }

    /* renamed from: b */
    private static C10270b m30421b(byte b) {
        return (C10270b) f27899a.mo24982a(b);
    }

    /* renamed from: a */
    public static void m30420a(C10249a aVar) {
        if (aVar != null) {
            C10267c cVar = aVar.f27863f;
            if (cVar != null) {
                cVar.mo24983a(aVar);
            }
        }
    }

    /* renamed from: b */
    public static boolean m30422b(C10249a aVar) {
        if (aVar == null) {
            return false;
        }
        if (aVar.f27858a == null || aVar.f27858a.isEmpty()) {
            return true;
        }
        C10267c cVar = aVar.f27863f;
        if (cVar == null) {
            return false;
        }
        return cVar.mo24984b(aVar).containsAll(aVar.f27858a);
    }

    /* renamed from: a */
    public static void m30419a(Context context, String str, byte b) {
        m30421b(2).mo24991a(context, str);
    }
}

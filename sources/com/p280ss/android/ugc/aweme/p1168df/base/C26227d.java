package com.p280ss.android.ugc.aweme.p1168df.base;

import com.bytedance.morpheus.C12235a;
import com.bytedance.morpheus.C12249c;
import com.bytedance.morpheus.core.C12250a;
import com.bytedance.morpheus.p617a.C12236a;
import com.google.android.play.core.splitinstall.C17133c;
import com.google.android.play.core.splitinstall.C17137g;
import com.p280ss.android.ugc.aweme.p1168df.base.p1169a.C26223b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.df.base.d */
public final class C26227d {
    /* renamed from: b */
    public static C17133c m86227b() {
        return C12236a.m35596a();
    }

    static {
        C12249c.m35631a((C12235a) new C26228e());
    }

    /* renamed from: a */
    public static List<String> m86224a() {
        ArrayList arrayList = new ArrayList();
        Map c = C12249c.m35637c();
        if (c != null) {
            for (C12250a aVar : c.values()) {
                if (aVar.f32568c == 5) {
                    arrayList.add(aVar.f32566a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m86225a(C17137g gVar) {
        C12236a.m35597a(gVar);
    }

    /* renamed from: b */
    public static void m86228b(C17137g gVar) {
        C12236a.m35600b(gVar);
    }

    /* renamed from: a */
    public static void m86226a(String str) {
        C12250a b = C12249c.m35635b(str);
        if (b != null) {
            if (b.f32568c != 5) {
                C12236a.m35598a(str);
            }
            C26223b.m86216a(str, b.f32568c);
        }
    }
}

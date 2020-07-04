package com.p280ss.android.ugc.aweme.p313im.sdk.p316h;

import android.support.p022v4.util.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.h.b */
public final class C31330b {

    /* renamed from: a */
    public static final C31330b f82102a = new C31330b();

    /* renamed from: b */
    private static final ArrayMap<C31328a, String> f82103b = new ArrayMap<>();

    /* renamed from: c */
    private static final ArrayList<C31328a> f82104c = new ArrayList<>();

    private C31330b() {
    }

    /* renamed from: c */
    private static void m102014c(C31328a aVar) {
        C7573i.m23587b(aVar, "storyMessageSetting");
        f82103b.remove(aVar);
    }

    /* renamed from: a */
    public static final void m102010a(C31328a aVar) {
        C7573i.m23587b(aVar, "storyMessageSetting");
        if (!f82104c.contains(aVar)) {
            f82104c.add(aVar);
        }
    }

    /* renamed from: b */
    public static final void m102013b(C31328a aVar) {
        C7573i.m23587b(aVar, "storyMessageSetting");
        if (f82104c.contains(aVar)) {
            f82104c.remove(aVar);
        }
        m102014c(aVar);
    }

    /* renamed from: a */
    public static final void m102012a(boolean z) {
        Iterator it = f82104c.iterator();
        while (it.hasNext()) {
            C31328a aVar = (C31328a) it.next();
            if (aVar != null) {
                aVar.mo80433a(z, (String) f82103b.get(aVar));
                m102014c(aVar);
            }
        }
    }

    /* renamed from: a */
    public static final void m102011a(C31328a aVar, String str) {
        C7573i.m23587b(aVar, "storyMessageSetting");
        C7573i.m23587b(str, "msgUUID");
        f82103b.put(aVar, str);
    }
}

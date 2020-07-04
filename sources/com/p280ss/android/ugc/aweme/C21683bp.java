package com.p280ss.android.ugc.aweme;

import android.app.Application;
import android.os.Bundle;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.ugc.aweme.IAccountUserService.C6856a;
import com.p280ss.android.ugc.aweme.account.network.C22203a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bp */
public class C21683bp {

    /* renamed from: a */
    private static C21679bl f58090a;

    /* renamed from: b */
    private static C22203a f58091b;

    /* renamed from: c */
    private static List<C6856a> f58092c = new LinkedList();

    /* renamed from: a */
    public static C22203a m72581a() {
        return f58091b;
    }

    /* renamed from: b */
    public static Application m72587b() {
        return C21084a.f56601a;
    }

    /* renamed from: d */
    public static void m72590d() {
        C21679bl.m72577a();
    }

    /* renamed from: c */
    public static boolean m72589c() {
        return f58090a.f58086a;
    }

    /* renamed from: a */
    public static void m72585a(C22203a aVar) {
        f58091b = aVar;
    }

    /* renamed from: b */
    public static void m72588b(C6856a aVar) {
        synchronized (C21683bp.class) {
            f58092c.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m72584a(C6856a aVar) {
        synchronized (C21683bp.class) {
            if (!f58092c.contains(aVar)) {
                f58092c.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m72586a(C21679bl blVar) {
        f58090a = blVar;
    }

    /* renamed from: a */
    public static void m72583a(C12898b bVar, String str) {
        f58090a.mo57953a(bVar, str);
    }

    /* renamed from: a */
    public static void m72582a(int i, User user, User user2, Bundle bundle) {
        LinkedList<C6856a> linkedList = new LinkedList<>();
        synchronized (C21683bp.class) {
            linkedList.addAll(f58092c);
        }
        for (C6856a onChanged : linkedList) {
            onChanged.onChanged(i, user, user2, bundle);
        }
    }
}

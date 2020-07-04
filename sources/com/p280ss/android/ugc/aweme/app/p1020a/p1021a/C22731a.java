package com.p280ss.android.ugc.aweme.app.p1020a.p1021a;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.account.util.C22316a;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.a.a.a */
public final class C22731a {

    /* renamed from: a */
    public static List<C22316a> f60420a = new ArrayList();

    /* renamed from: b */
    public static final CopyOnWriteArrayList<C22734c> f60421b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public static final C22732a f60422c = new C22732a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.a.a.a$a */
    public static final class C22732a {
        private C22732a() {
        }

        /* renamed from: a */
        private static void m75108a() {
            Iterator it = C22731a.f60421b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }

        /* renamed from: b */
        private static void m75110b() {
            for (C22734c a : C22731a.f60421b) {
                a.mo59805a();
            }
        }

        public /* synthetic */ C22732a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m75109a(C22734c cVar) {
            C7573i.m23587b(cVar, "listener");
            C22731a.f60421b.add(cVar);
        }

        /* renamed from: b */
        public static void m75111b(C22734c cVar) {
            C7573i.m23587b(cVar, "listener");
            C22731a.f60421b.remove(cVar);
        }

        /* renamed from: a */
        public final void mo59803a(Bundle bundle) {
            List list;
            List<C22316a> list2;
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            if (iBridgeService != null) {
                list = iBridgeService.getAfterLoginActions(bundle);
            } else {
                list = null;
            }
            if (list != null) {
                list2 = C7525m.m23509d((Collection<? extends T>) list);
            } else {
                list2 = new ArrayList<>();
            }
            C22731a.f60420a = list2;
            m75108a();
            mo59804b(bundle);
        }

        /* renamed from: b */
        public final void mo59804b(Bundle bundle) {
            if (!C22731a.f60420a.isEmpty()) {
                ((C22316a) C22731a.f60420a.remove(0)).mo58748a(bundle);
            } else {
                m75110b();
            }
        }
    }

    /* renamed from: a */
    public static final void m75104a(Bundle bundle) {
        f60422c.mo59803a(bundle);
    }

    /* renamed from: a */
    public static final void m75105a(C22734c cVar) {
        C22732a.m75109a(cVar);
    }

    /* renamed from: b */
    public static final void m75106b(Bundle bundle) {
        f60422c.mo59804b(bundle);
    }

    /* renamed from: b */
    public static final void m75107b(C22734c cVar) {
        C22732a.m75111b(cVar);
    }
}

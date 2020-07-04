package com.p280ss.android.ugc.aweme.crossplatform.view;

import com.facebook.react.ReactInstanceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.f */
public final class C26029f {

    /* renamed from: b */
    public static final C7541d f68805b = C7546e.m23569a(C26031b.f68809a);

    /* renamed from: c */
    public static final C26030a f68806c = new C26030a(null);

    /* renamed from: a */
    public final Map<C26033g, C26024b<ReactInstanceManager>> f68807a;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.f$a */
    public static final class C26030a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f68808a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26030a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/view/ReactInstanceHolder;"))};

        private C26030a() {
        }

        /* renamed from: a */
        public static C26029f m85508a() {
            return (C26029f) C26029f.f68805b.getValue();
        }

        public /* synthetic */ C26030a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.f$b */
    static final class C26031b extends Lambda implements C7561a<C26029f> {

        /* renamed from: a */
        public static final C26031b f68809a = new C26031b();

        C26031b() {
            super(0);
        }

        /* renamed from: a */
        private static C26029f m85509a() {
            return new C26029f(null);
        }

        public final /* synthetic */ Object invoke() {
            return m85509a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.f$c */
    static final class C26032c extends Lambda implements C7562b<ReactInstanceManager, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C26029f f68810a;

        /* renamed from: b */
        final /* synthetic */ C26033g f68811b;

        C26032c(C26029f fVar, C26033g gVar) {
            this.f68810a = fVar;
            this.f68811b = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m85510a((ReactInstanceManager) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m85510a(ReactInstanceManager reactInstanceManager) {
            C7573i.m23587b(reactInstanceManager, "$receiver");
            synchronized (this.f68810a) {
                this.f68810a.f68807a.remove(this.f68811b);
                StringBuilder sb = new StringBuilder();
                sb.append(this.f68811b);
                sb.append(" removed");
            }
        }
    }

    /* renamed from: a */
    public static final C26029f m85505a() {
        return C26030a.m85508a();
    }

    private C26029f() {
        this.f68807a = new LinkedHashMap();
    }

    public /* synthetic */ C26029f(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final C26024b<ReactInstanceManager> mo67549a(C26033g gVar) {
        C7573i.m23587b(gVar, "key");
        C26024b<ReactInstanceManager> bVar = (C26024b) this.f68807a.get(gVar);
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    /* renamed from: a */
    public final synchronized C26024b<ReactInstanceManager> mo67550a(C26033g gVar, ReactInstanceManager reactInstanceManager) {
        C26024b<ReactInstanceManager> a;
        C7573i.m23587b(gVar, "key");
        C7573i.m23587b(reactInstanceManager, "instance");
        a = mo67549a(gVar);
        if (a == null) {
            C26022a aVar = new C26022a(reactInstanceManager, new C26032c(this, gVar));
            this.f68807a.put(gVar, aVar);
            a = aVar;
        }
        return a;
    }
}

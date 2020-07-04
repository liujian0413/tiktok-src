package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.af */
public final class C41250af {

    /* renamed from: c */
    public static final C41251a f107487c = new C41251a(null);

    /* renamed from: d */
    private static int f107488d;

    /* renamed from: a */
    public final C7561a<C7581n> f107489a;

    /* renamed from: b */
    public final C7561a<C7581n> f107490b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.af$a */
    public static final class C41251a {
        private C41251a() {
        }

        public /* synthetic */ C41251a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo101944a() {
        int i = f107488d + 1;
        f107488d = i;
        if (i == 1) {
            C7561a<C7581n> aVar = this.f107489a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: b */
    public final void mo101945b() {
        int i = f107488d - 1;
        f107488d = i;
        if (i == 0) {
            C7561a<C7581n> aVar = this.f107490b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public C41250af(C7561a<C7581n> aVar, C7561a<C7581n> aVar2) {
        this.f107489a = aVar;
        this.f107490b = aVar2;
    }
}

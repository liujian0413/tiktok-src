package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn;

import com.bytedance.keva.Keva;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.c */
public final class C25914c {

    /* renamed from: b */
    public static final C7541d f68560b = C7546e.m23569a(C25916b.f68565a);

    /* renamed from: c */
    public static final C25915a f68561c = new C25915a(null);

    /* renamed from: a */
    public String f68562a;

    /* renamed from: d */
    private final Keva f68563d;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.c$a */
    public static final class C25915a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f68564a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25915a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/JsbDebugSettings;"))};

        private C25915a() {
        }

        /* renamed from: a */
        public static C25914c m85211a() {
            return (C25914c) C25914c.f68560b.getValue();
        }

        public /* synthetic */ C25915a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.c$b */
    static final class C25916b extends Lambda implements C7561a<C25914c> {

        /* renamed from: a */
        public static final C25916b f68565a = new C25916b();

        C25916b() {
            super(0);
        }

        /* renamed from: a */
        private static C25914c m85212a() {
            return new C25914c(null);
        }

        public final /* synthetic */ Object invoke() {
            return m85212a();
        }
    }

    /* renamed from: a */
    public static final C25914c m85209a() {
        return C25915a.m85211a();
    }

    private C25914c() {
        Keva repo = Keva.getRepo("jsb_debug_settings", 0);
        if (repo == null) {
            C7573i.m23580a();
        }
        this.f68563d = repo;
        this.f68562a = this.f68563d.getString("safe_host", null);
    }

    public /* synthetic */ C25914c(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final void mo67297a(String str) {
        this.f68562a = str;
        this.f68563d.storeString("safe_host", str);
    }
}

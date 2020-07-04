package com.bytedance.ies.bullet.core.p540c;

import android.net.Uri;
import com.bytedance.ies.bullet.core.C10331b;
import com.bytedance.ies.bullet.core.C10331b.C10333b;
import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.kit.C10387l;
import com.bytedance.ies.bullet.core.kit.C10393n;
import com.bytedance.ies.bullet.core.kit.C10400u;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import java.util.List;
import java.util.UUID;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.bullet.core.c.c */
public final class C10339c implements C10342d {

    /* renamed from: a */
    public static final C10340a f28047a = new C10340a(null);

    /* renamed from: d */
    private static final C7561a<String> f28048d = C10341b.f28051a;

    /* renamed from: b */
    private final C10387l f28049b = new C10393n();

    /* renamed from: c */
    private C10331b f28050c;

    /* renamed from: com.bytedance.ies.bullet.core.c.c$a */
    public static final class C10340a {
        private C10340a() {
        }

        public /* synthetic */ C10340a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.c.c$b */
    static final class C10341b extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C10341b f28051a = new C10341b();

        C10341b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m30635a();
        }

        /* renamed from: a */
        private static String m30635a() {
            String uuid = UUID.randomUUID().toString();
            C7573i.m23582a((Object) uuid, "UUID.randomUUID().toString()");
            return uuid;
        }
    }

    /* renamed from: a */
    public final void mo25110a() {
        C10331b bVar = this.f28050c;
        if (bVar == null) {
            C7573i.m23583a("core");
        }
        bVar.mo25073b(this.f28049b);
        this.f28049b.mo25110a();
    }

    /* renamed from: a */
    public final <T extends C10378c<?, ?, ?, ?>> C10382g mo25067a(Class<? extends T> cls) {
        C7573i.m23587b(cls, "clazz");
        return this.f28049b.mo25067a(cls);
    }

    /* renamed from: a */
    public final C10382g mo25068a(String str) {
        C7573i.m23587b(str, "sessionId");
        return this.f28049b.mo25068a(str);
    }

    /* renamed from: a */
    public final void mo25098a(C10333b bVar) {
        C7573i.m23587b(bVar, "coreProvider");
        C10331b a = bVar.mo25026a();
        a.mo25070a(this.f28049b);
        this.f28050c = a;
    }

    /* renamed from: a */
    public final void mo25111a(Uri uri, C10403b bVar, C48006q<? super C10382g, ? super Uri, ? super Boolean, C7581n> qVar, C7562b<? super Throwable, C7581n> bVar2) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(bVar, "providerFactory");
        C7573i.m23587b(qVar, "resolve");
        C7573i.m23587b(bVar2, "reject");
        C10337a aVar = new C10337a();
        aVar.mo25262a(Uri.class, uri);
        Uri uri2 = (Uri) aVar.f28044b.mo25251b();
        if (uri2 != null) {
            C10331b bVar3 = this.f28050c;
            if (bVar3 == null) {
                C7573i.m23583a("core");
            }
            C10387l lVar = this.f28049b;
            C10400u uVar = new C10400u((String) f28048d.invoke());
            List list = (List) aVar.f28043a.mo25251b();
            if (list == null) {
                list = C7525m.m23461a();
            }
            bVar3.mo25072a(lVar, uVar, uri2, list, bVar, qVar, bVar2);
        }
    }
}

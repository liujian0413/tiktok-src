package com.bytedance.ies.bullet.p551ui.common;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.bullet.core.C10331b.C10333b;
import com.bytedance.ies.bullet.core.kit.C10378c;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.p540c.C10339c;
import com.bytedance.ies.bullet.core.p540c.C10342d;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10680b;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10682c;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.bullet.ui.common.c */
public final class C10684c implements C10692f {

    /* renamed from: a */
    private final C10342d f28564a = new C10339c();

    /* renamed from: b */
    private final C10403b f28565b;

    /* renamed from: com.bytedance.ies.bullet.ui.common.c$a */
    static final class C10685a extends Lambda implements C48006q<C10382g, Uri, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f28566a;

        /* renamed from: b */
        final /* synthetic */ C48006q f28567b;

        /* renamed from: com.bytedance.ies.bullet.ui.common.c$a$a */
        static final class C10686a extends Lambda implements C7562b<List<? extends C10682c<View>>, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C10680b f28568a;

            /* renamed from: b */
            final /* synthetic */ C10685a f28569b;

            /* renamed from: c */
            final /* synthetic */ boolean f28570c;

            C10686a(C10680b bVar, C10685a aVar, boolean z) {
                this.f28568a = bVar;
                this.f28569b = aVar;
                this.f28570c = z;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m31221a((List) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m31221a(List<C10682c<View>> list) {
                C7573i.m23587b(list, "viewComponents");
                for (C10682c cVar : list) {
                    this.f28568a.mo25363a(cVar);
                    this.f28569b.f28566a.invoke(cVar);
                }
                this.f28569b.f28567b.invoke(this.f28568a, list, Boolean.valueOf(this.f28570c));
            }
        }

        C10685a(C7562b bVar, C48006q qVar) {
            this.f28566a = bVar;
            this.f28567b = qVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m31220a((C10382g) obj, (Uri) obj2, ((Boolean) obj3).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31220a(C10382g gVar, Uri uri, boolean z) {
            C7573i.m23587b(gVar, "instanceApi");
            C7573i.m23587b(uri, "uri");
            if (!(gVar instanceof C10680b)) {
                gVar = null;
            }
            if (gVar != null) {
                if (gVar != null) {
                    C10680b bVar = (C10680b) gVar;
                    if (bVar != null) {
                        if (z) {
                            bVar.mo25554b(new C10686a(bVar, this, z));
                        } else {
                            this.f28567b.invoke(bVar, C7525m.m23461a(), Boolean.valueOf(z));
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.kit.KitContainerApiDefault /* = com.bytedance.ies.bullet.ui.common.kit.KitContainerApi<android.view.View> */");
                }
            }
        }
    }

    /* renamed from: b */
    public final C10403b mo25563b() {
        return this.f28565b;
    }

    /* renamed from: a */
    public final void mo25110a() {
        this.f28564a.mo25110a();
    }

    /* renamed from: a */
    public final <T extends C10378c<?, ?, ?, ?>> C10382g mo25067a(Class<? extends T> cls) {
        C7573i.m23587b(cls, "clazz");
        return this.f28564a.mo25067a(cls);
    }

    public C10684c(Context context) {
        C7573i.m23587b(context, "context");
        C10403b bVar = new C10403b();
        bVar.mo25201a(Context.class, context);
        this.f28565b = bVar;
    }

    /* renamed from: a */
    public final C10382g mo25068a(String str) {
        C7573i.m23587b(str, "sessionId");
        return this.f28564a.mo25068a(str);
    }

    /* renamed from: a */
    public final void mo25098a(C10333b bVar) {
        C7573i.m23587b(bVar, "coreProvider");
        this.f28564a.mo25098a(bVar);
    }

    /* renamed from: a */
    public final void mo25562a(Uri uri, C7562b<? super C10403b, C7581n> bVar, C7562b<? super C10682c<? extends View>, C7581n> bVar2, C48006q<? super C10382g, ? super List<? extends C10682c<? extends View>>, ? super Boolean, C7581n> qVar, C7562b<? super Throwable, C7581n> bVar3) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(bVar, "providerFactoryHandler");
        C7573i.m23587b(bVar2, "viewComponentHandler");
        C7573i.m23587b(qVar, "resolve");
        C7573i.m23587b(bVar3, "reject");
        this.f28564a.mo25111a(uri, mo25563b(), new C10685a(bVar2, qVar), bVar3);
    }
}

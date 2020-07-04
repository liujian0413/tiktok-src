package com.p280ss.android.ugc.aweme.scene;

import android.app.Activity;
import android.content.Context;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.group.C12604b;
import com.bytedance.scene.navigation.C12648d;
import com.bytedance.scene.p642b.C12583b;
import com.bytedance.scene.p642b.C12584c;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.utils.C43041d;
import java.util.Iterator;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.scene.a */
public final class C37299a {

    /* renamed from: com.ss.android.ugc.aweme.scene.a$a */
    public static final class C37300a extends C12583b {

        /* renamed from: a */
        final /* synthetic */ C12648d f97429a;

        /* renamed from: b */
        final /* synthetic */ Class f97430b;

        /* renamed from: c */
        final /* synthetic */ C7561a f97431c;

        /* renamed from: com.ss.android.ugc.aweme.scene.a$a$a */
        static final class C37301a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C37300a f97432a;

            C37301a(C37300a aVar) {
                this.f97432a = aVar;
            }

            public final void run() {
                this.f97432a.f97429a.mo31059a((C12584c) this.f97432a);
            }
        }

        /* renamed from: b */
        public final void mo30859b(C12629j jVar) {
            C7573i.m23587b(jVar, "scene");
            if (C7573i.m23585a((Object) jVar.getClass(), (Object) this.f97430b)) {
                new SafeHandler(this.f97429a).post(new C37301a(this));
                this.f97431c.invoke();
            }
        }

        C37300a(C12648d dVar, Class cls, C7561a aVar) {
            this.f97429a = dVar;
            this.f97430b = cls;
            this.f97431c = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scene.a$b */
    public static final class C37302b extends C12583b {

        /* renamed from: a */
        final /* synthetic */ C12648d f97433a;

        /* renamed from: b */
        final /* synthetic */ C12629j f97434b;

        /* renamed from: c */
        final /* synthetic */ C7561a f97435c;

        /* renamed from: com.ss.android.ugc.aweme.scene.a$b$a */
        static final class C37303a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C37302b f97436a;

            C37303a(C37302b bVar) {
                this.f97436a = bVar;
            }

            public final void run() {
                this.f97436a.f97433a.mo31059a((C12584c) this.f97436a);
            }
        }

        /* renamed from: b */
        public final void mo30859b(C12629j jVar) {
            C7573i.m23587b(jVar, "s");
            if (C7573i.m23585a((Object) jVar, (Object) this.f97434b)) {
                new SafeHandler(this.f97433a).post(new C37303a(this));
                this.f97435c.invoke();
            }
        }

        C37302b(C12648d dVar, C12629j jVar, C7561a aVar) {
            this.f97433a = dVar;
            this.f97434b = jVar;
            this.f97435c = aVar;
        }
    }

    /* renamed from: a */
    public static final Activity m119788a(Context context) {
        C7573i.m23587b(context, "$this$getActivity");
        return C43041d.m136566a(context);
    }

    /* renamed from: a */
    public static final <T extends C12629j> boolean m119791a(C12604b bVar, String str) {
        C7573i.m23587b(bVar, "$this$exist");
        C7573i.m23587b(str, "tag");
        if (bVar.mo30924a(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m119792a(C12648d dVar, C12629j jVar) {
        Object obj;
        C7573i.m23587b(dVar, "$this$exist");
        C7573i.m23587b(jVar, "scene");
        List a = dVar.mo31055a();
        C7573i.m23582a((Object) a, "sceneList");
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7573i.m23585a((Object) (C12629j) obj, (Object) jVar)) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m119793a(C12648d dVar, Class<? extends C12629j> cls) {
        Object obj;
        C7573i.m23587b(dVar, "$this$exist");
        C7573i.m23587b(cls, "clazz");
        List a = dVar.mo31055a();
        C7573i.m23582a((Object) a, "sceneList");
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7573i.m23585a((Object) ((C12629j) obj).getClass(), (Object) cls)) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m119789a(C12648d dVar, C12629j jVar, C7561a<C7581n> aVar) {
        C7573i.m23587b(dVar, "$this$observeChildDestroy");
        C7573i.m23587b(jVar, "scene");
        C7573i.m23587b(aVar, "block");
        dVar.mo31060a((C12584c) new C37302b(dVar, jVar, aVar), false);
    }

    /* renamed from: a */
    public static final void m119790a(C12648d dVar, Class<? extends C12629j> cls, C7561a<C7581n> aVar) {
        C7573i.m23587b(dVar, "$this$observeChildDestroy");
        C7573i.m23587b(cls, "clazz");
        C7573i.m23587b(aVar, "block");
        dVar.mo31060a((C12584c) new C37300a(dVar, cls, aVar), false);
    }
}

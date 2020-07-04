package com.p280ss.android.ugc.aweme;

import android.content.Context;
import android.net.Uri;
import com.bytedance.p474c.p475a.p476a.C9668a;
import com.p280ss.android.ugc.aweme.search.C37381d;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.s */
public final class C21775s implements C21651ak {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f58286a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21775s.class), "floatPendantService", "getFloatPendantService()Lcom/ss/android/ugc/aweme/DefaultDiamondService$floatPendantService$2$1;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21775s.class), "individualTaskService", "getIndividualTaskService()Lcom/ss/android/ugc/aweme/DefaultDiamondService$individualTaskService$2$1;"))};

    /* renamed from: b */
    private final C7541d f58287b = C7546e.m23569a(C21776a.f58289a);

    /* renamed from: c */
    private final C7541d f58288c = C7546e.m23569a(C21778b.f58290a);

    /* renamed from: com.ss.android.ugc.aweme.s$a */
    static final class C21776a extends Lambda implements C7561a<C217771> {

        /* renamed from: a */
        public static final C21776a f58289a = new C21776a();

        C21776a() {
            super(0);
        }

        /* renamed from: a */
        private static C217771 m72804a() {
            return new C21652al() {
                /* renamed from: a */
                public final void mo57897a(String str, String str2) {
                    C7573i.m23587b(str2, "aid");
                }
            };
        }

        public final /* synthetic */ Object invoke() {
            return m72804a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.s$b */
    static final class C21778b extends Lambda implements C7561a<C217791> {

        /* renamed from: a */
        public static final C21778b f58290a = new C21778b();

        C21778b() {
            super(0);
        }

        /* renamed from: a */
        private static C217791 m72806a() {
            return new C21655ao() {
            };
        }

        public final /* synthetic */ Object invoke() {
            return m72806a();
        }
    }

    /* renamed from: c */
    private final C217771 m72794c() {
        return (C217771) this.f58287b.getValue();
    }

    /* renamed from: d */
    private final C217791 m72795d() {
        return (C217791) this.f58288c.getValue();
    }

    /* renamed from: a */
    public final C21098ab mo57889a(Context context) {
        C7573i.m23587b(context, "context");
        return null;
    }

    /* renamed from: a */
    public final void mo57891a(int i, long j, Map<String, String> map, C9668a<Object> aVar) {
        C7573i.m23587b(aVar, "callback");
    }

    /* renamed from: a */
    public final void mo57892a(Context context, String str, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "gameId");
    }

    /* renamed from: a */
    public final boolean mo57894a(Context context, Uri uri) {
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final C21098ab mo57895b(Context context) {
        C7573i.m23587b(context, "context");
        return null;
    }

    /* renamed from: a */
    public final C21652al mo57890a() {
        return m72794c();
    }

    /* renamed from: b */
    public final C21655ao mo57896b() {
        return m72795d();
    }

    /* renamed from: a */
    public final void mo57893a(String str, C37381d dVar) {
        C7573i.m23587b(str, "query");
        C7573i.m23587b(dVar, "callback");
        dVar.mo69769a();
    }
}

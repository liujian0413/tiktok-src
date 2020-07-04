package com.p280ss.android.ugc.aweme.p313im.sdk.common;

import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c */
public final class C31072c {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c$a */
    static final class C31073a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C31073a f81555a = new C31073a();

        C31073a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c$b */
    static final class C31074b extends Lambda implements C7563m<List<T>, Boolean, C7581n> {

        /* renamed from: a */
        public static final C31074b f81556a = new C31074b();

        C31074b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Boolean) obj2).booleanValue();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c$c */
    static final class C31075c extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        public static final C31075c f81557a = new C31075c();

        C31075c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.c$d */
    public static final class C31076d implements C31071b<T> {

        /* renamed from: a */
        final /* synthetic */ C7561a f81558a;

        /* renamed from: b */
        final /* synthetic */ C7563m f81559b;

        /* renamed from: c */
        final /* synthetic */ C7562b f81560c;

        /* renamed from: a */
        public final void mo81560a() {
            this.f81558a.invoke();
        }

        /* renamed from: a */
        public final void mo81561a(Throwable th) {
            this.f81560c.invoke(th);
        }

        /* renamed from: a */
        public final void mo81562a(List<T> list, boolean z) {
            this.f81559b.invoke(list, Boolean.valueOf(z));
        }

        C31076d(C7561a aVar, C7563m mVar, C7562b bVar) {
            this.f81558a = aVar;
            this.f81559b = mVar;
            this.f81560c = bVar;
        }
    }

    /* renamed from: a */
    public static final <T> C31071b<T> m101359a(C7561a<C7581n> aVar, C7563m<? super List<T>, ? super Boolean, C7581n> mVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(aVar, "onLoading");
        C7573i.m23587b(mVar, "onSuccess");
        C7573i.m23587b(bVar, "onError");
        return new C31076d<>(aVar, mVar, bVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C31071b m101360a(C7561a aVar, C7563m mVar, C7562b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = C31073a.f81555a;
        }
        if ((i & 2) != 0) {
            mVar = C31074b.f81556a;
        }
        if ((i & 4) != 0) {
            bVar = C31075c.f81557a;
        }
        return m101359a(aVar, mVar, bVar);
    }
}

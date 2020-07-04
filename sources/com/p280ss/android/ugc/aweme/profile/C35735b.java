package com.p280ss.android.ugc.aweme.profile;

import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.profile.b */
public final class C35735b {

    /* renamed from: com.ss.android.ugc.aweme.profile.b$a */
    static final class C35736a extends Lambda implements C7562b<T, R> {

        /* renamed from: a */
        final /* synthetic */ C7562b f93705a;

        C35736a(C7562b bVar) {
            this.f93705a = bVar;
            super(1);
        }

        public final R invoke(T t) {
            return this.f93705a.invoke(t);
        }
    }

    /* renamed from: a */
    public static final <T> T m115462a(T t) {
        return t;
    }

    /* renamed from: a */
    public static final <T, R> C7562b<T, R> m115463a(C7562b<? super T, ? extends R> bVar) {
        C7573i.m23587b(bVar, "f");
        return new C35736a<>(bVar);
    }
}

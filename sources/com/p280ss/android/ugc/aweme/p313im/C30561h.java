package com.p280ss.android.ugc.aweme.p313im;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.h */
public final class C30561h implements C37704a {

    /* renamed from: d */
    public static final C7541d f80264d = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C30563b.f80270a);

    /* renamed from: e */
    public static final C30562a f80265e = new C30562a(null);

    /* renamed from: a */
    public boolean f80266a;

    /* renamed from: b */
    public boolean f80267b;

    /* renamed from: c */
    public boolean f80268c;

    /* renamed from: com.ss.android.ugc.aweme.im.h$a */
    public static final class C30562a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f80269a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30562a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/im/NotificationManager;"))};

        private C30562a() {
        }

        /* renamed from: a */
        public static C30561h m99834a() {
            return (C30561h) C30561h.f80264d.getValue();
        }

        public /* synthetic */ C30562a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.h$b */
    static final class C30563b extends Lambda implements C7561a<C30561h> {

        /* renamed from: a */
        public static final C30563b f80270a = new C30563b();

        C30563b() {
            super(0);
        }

        /* renamed from: a */
        private static C30561h m99835a() {
            return new C30561h(null);
        }

        public final /* synthetic */ Object invoke() {
            return m99835a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.h$c */
    static final class C30564c<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C30561h f80271a;

        /* renamed from: b */
        final /* synthetic */ boolean f80272b;

        C30564c(C30561h hVar, boolean z) {
            this.f80271a = hVar;
            this.f80272b = z;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m99836a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m99836a(C1592h<Void> hVar) {
            C30553b.m99810g().showIMNotification(Boolean.valueOf(true));
            this.f80271a.f80268c = this.f80272b;
        }
    }

    private C30561h() {
    }

    /* renamed from: a */
    public static final C30561h m99828a() {
        return C30562a.m99834a();
    }

    /* renamed from: a */
    public final void mo59220a(Exception exc) {
        C7573i.m23587b(exc, "e");
    }

    public /* synthetic */ C30561h(C7571f fVar) {
        this();
    }

    /* renamed from: b */
    public final void mo80305b(Integer num) {
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        this.f80267b = z;
    }

    /* renamed from: a */
    public final void mo59219a(C37723b bVar) {
        boolean z;
        C7573i.m23587b(bVar, "settings");
        boolean z2 = false;
        if (bVar.f98276l == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f80266a = z;
        if (bVar.f98274j == 1) {
            z2 = true;
        }
        this.f80267b = z2;
    }

    /* renamed from: a */
    public final void mo80303a(Integer num) {
        boolean z = true;
        if (num == null || num.intValue() != 1) {
            z = false;
        }
        this.f80266a = z;
    }

    /* renamed from: a */
    public final void mo80304a(boolean z) {
        if (!z) {
            C1592h.m7848a(500).mo6876a((C1591g<TResult, TContinuationResult>) new C30564c<TResult,TContinuationResult>(this, z), C1592h.f5958b);
        } else {
            this.f80268c = z;
        }
    }
}

package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20917e;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20923g;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20926h;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20926h.C20927a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20929i;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20932j.C20933a;
import com.p280ss.android.vesdk.VEListener.C45210f;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.d */
public final class C20867d {

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.d$a */
    static final class C20868a extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20926h f56295a;

        C20868a(C20926h hVar) {
            this.f56295a = hVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m69898a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m69898a(int i) {
            this.f56295a.mo56401a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.d$b */
    static final class C20869b extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20929i f56296a;

        C20869b(C20929i iVar) {
            this.f56296a = iVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m69899a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m69899a(int i) {
            this.f56296a.mo56403a(i);
        }
    }

    /* renamed from: a */
    public static final C20917e m69892a(C45210f fVar) {
        C7573i.m23587b(fVar, "$this$stub");
        return new C20894y(fVar);
    }

    /* renamed from: b */
    public static final C20927a m69896b(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "$this$toSandboxIntResultCallback");
        return new C20890u(bVar);
    }

    /* renamed from: c */
    public static final C20923g m69897c(C7562b<? super RecorderConcatResult, C7581n> bVar) {
        C7573i.m23587b(bVar, "$this$stub");
        return new C20889t(bVar);
    }

    /* renamed from: a */
    public static final C20933a m69893a(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "$this$toSandboxStartRecorderCallback");
        return new C20891v(bVar);
    }

    /* renamed from: a */
    public static final C7562b<Integer, C7581n> m69894a(C20926h hVar) {
        C7573i.m23587b(hVar, "$this$convert");
        return new C20868a<>(hVar);
    }

    /* renamed from: a */
    public static final C7562b<Integer, C7581n> m69895a(C20929i iVar) {
        C7573i.m23587b(iVar, "$this$proxy");
        return new C20869b<>(iVar);
    }
}

package com.p280ss.android.ugc.asve.sandbox.p930d;

import android.os.IBinder;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.recorder.C20689c;
import com.p280ss.android.ugc.asve.recorder.VERecorderImpl;
import com.p280ss.android.ugc.asve.sandbox.C20983c;
import com.p280ss.android.ugc.asve.sandbox.C21041l.C21042a;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20870e;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20872f;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20914d;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20935k;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20938l;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20950p;
import com.p280ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21069d;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.runtime.C45362d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.f */
public final class C21007f extends C21042a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56477a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21007f.class), "recorder", "getRecorder()Lcom/ss/android/ugc/asve/recorder/IRecorder;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21007f.class), "effectService", "getEffectService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteEffectService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21007f.class), "cameraService", "getCameraService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteCameraService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21007f.class), "mediaService", "getMediaService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteMediaService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21007f.class), "duetService", "getDuetService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteDuetService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21007f.class), "reactionService", "getReactionService()Lcom/ss/android/ugc/asve/sandbox/remote/SandBoxRemoteReactionService;"))};

    /* renamed from: b */
    public final Future<C21008a> f56478b;

    /* renamed from: c */
    private final Map<IBinder, C19622b> f56479c = new LinkedHashMap();

    /* renamed from: d */
    private final C7541d f56480d;

    /* renamed from: e */
    private final C7541d f56481e;

    /* renamed from: f */
    private final C7541d f56482f;

    /* renamed from: g */
    private final C7541d f56483g;

    /* renamed from: h */
    private final C7541d f56484h;

    /* renamed from: i */
    private final C7541d f56485i;

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$a */
    static final class C21008a {

        /* renamed from: a */
        public final C20689c f56486a;

        /* renamed from: b */
        public final C21001c f56487b;

        /* renamed from: c */
        public final C20997a f56488c;

        /* renamed from: d */
        public final C21002d f56489d;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f56489d, (java.lang.Object) r3.f56489d) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof com.p280ss.android.ugc.asve.sandbox.p930d.C21007f.C21008a
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.asve.sandbox.d.f$a r3 = (com.p280ss.android.ugc.asve.sandbox.p930d.C21007f.C21008a) r3
                com.ss.android.ugc.asve.recorder.c r0 = r2.f56486a
                com.ss.android.ugc.asve.recorder.c r1 = r3.f56486a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.asve.sandbox.d.c r0 = r2.f56487b
                com.ss.android.ugc.asve.sandbox.d.c r1 = r3.f56487b
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.asve.sandbox.d.a r0 = r2.f56488c
                com.ss.android.ugc.asve.sandbox.d.a r1 = r3.f56488c
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.asve.sandbox.d.d r0 = r2.f56489d
                com.ss.android.ugc.asve.sandbox.d.d r3 = r3.f56489d
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.sandbox.p930d.C21007f.C21008a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C20689c cVar = this.f56486a;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            C21001c cVar2 = this.f56487b;
            int hashCode2 = (hashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
            C20997a aVar = this.f56488c;
            int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C21002d dVar = this.f56489d;
            if (dVar != null) {
                i = dVar.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Components(recorder=");
            sb.append(this.f56486a);
            sb.append(", effectService=");
            sb.append(this.f56487b);
            sb.append(", cameraService=");
            sb.append(this.f56488c);
            sb.append(", mediaService=");
            sb.append(this.f56489d);
            sb.append(")");
            return sb.toString();
        }

        public C21008a(C20689c cVar, C21001c cVar2, C20997a aVar, C21002d dVar) {
            C7573i.m23587b(cVar, "recorder");
            C7573i.m23587b(cVar2, "effectService");
            C7573i.m23587b(aVar, "cameraService");
            C7573i.m23587b(dVar, "mediaService");
            this.f56486a = cVar;
            this.f56487b = cVar2;
            this.f56488c = aVar;
            this.f56489d = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$b */
    static final class C21009b extends Lambda implements C7561a<C20997a> {

        /* renamed from: a */
        final /* synthetic */ C21007f f56490a;

        C21009b(C21007f fVar) {
            this.f56490a = fVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20997a invoke() {
            return ((C21008a) this.f56490a.f56478b.get()).f56488c;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$c */
    static final class C21010c<V> implements Callable<C21008a> {

        /* renamed from: a */
        final /* synthetic */ ASSandBoxRecorderContextWrapper f56491a;

        C21010c(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) {
            this.f56491a = aSSandBoxRecorderContextWrapper;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21008a call() {
            VERecorderImpl vERecorderImpl = new VERecorderImpl(C6855a.m21308b(), new C20983c(this.f56491a), null);
            return new C21008a(vERecorderImpl, new C21001c(vERecorderImpl.mo55850d()), new C20997a(vERecorderImpl.mo55846b()), new C21002d(vERecorderImpl.mo55851e()));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$d */
    static final class C21011d extends Lambda implements C7561a<C20999b> {

        /* renamed from: a */
        final /* synthetic */ C21007f f56492a;

        C21011d(C21007f fVar) {
            this.f56492a = fVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20999b invoke() {
            return new C20999b(this.f56492a.mo56716n().mo55849c());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$e */
    static final class C21012e extends Lambda implements C7561a<C21001c> {

        /* renamed from: a */
        final /* synthetic */ C21007f f56493a;

        C21012e(C21007f fVar) {
            this.f56493a = fVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21001c invoke() {
            return ((C21008a) this.f56493a.f56478b.get()).f56487b;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$f */
    static final class C21013f extends Lambda implements C7561a<C21002d> {

        /* renamed from: a */
        final /* synthetic */ C21007f f56494a;

        C21013f(C21007f fVar) {
            this.f56494a = fVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21002d invoke() {
            return ((C21008a) this.f56494a.f56478b.get()).f56489d;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$g */
    static final class C21014g extends Lambda implements C7561a<C21006e> {

        /* renamed from: a */
        final /* synthetic */ C21007f f56495a;

        C21014g(C21007f fVar) {
            this.f56495a = fVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21006e invoke() {
            return new C21006e(this.f56495a.mo56716n().mo55852f());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$h */
    static final class C21015h extends Lambda implements C7561a<C20689c> {

        /* renamed from: a */
        final /* synthetic */ C21007f f56496a;

        C21015h(C21007f fVar) {
            this.f56496a = fVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20689c invoke() {
            return ((C21008a) this.f56496a.f56478b.get()).f56486a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$i */
    static final class C21016i extends Lambda implements C7562b<Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20950p f56497a;

        C21016i(C20950p pVar) {
            this.f56497a = pVar;
            super(1);
        }

        /* renamed from: a */
        private void m70536a(long j) {
            C20950p pVar = this.f56497a;
            if (pVar != null) {
                pVar.mo56390a(j);
            }
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m70536a(((Number) obj).longValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$j */
    static final class C21017j extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20938l f56498a;

        C21017j(C20938l lVar) {
            this.f56498a = lVar;
            super(1);
        }

        /* renamed from: a */
        private void m70537a(int i) {
            C20938l lVar = this.f56498a;
            if (lVar != null) {
                lVar.mo56399a(i);
            }
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m70537a(((Number) obj).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.f$k */
    public static final class C21018k extends C45362d {

        /* renamed from: a */
        final /* synthetic */ C21069d f56499a;

        /* renamed from: b */
        final /* synthetic */ String f56500b;

        /* renamed from: a */
        public final String mo56149a() {
            String a = this.f56499a.mo56329a();
            C7573i.m23582a((Object) a, "resManager.segmentDirPath");
            return a;
        }

        /* renamed from: b */
        public final String mo56151b() {
            String b = this.f56499a.mo56331b();
            C7573i.m23582a((Object) b, "resManager.concatSegmentVideoPath");
            return b;
        }

        /* renamed from: c */
        public final String mo56153c() {
            String c = this.f56499a.mo56333c();
            C7573i.m23582a((Object) c, "resManager.concatSegmentAudioPath");
            return c;
        }

        /* renamed from: a */
        public final String mo56150a(int i) {
            String a = this.f56499a.mo56330a(i);
            C7573i.m23582a((Object) a, "resManager.genSegmentVideoPath(segmentIndex)");
            return a;
        }

        /* renamed from: b */
        public final String mo56152b(int i) {
            String b = this.f56499a.mo56332b(i);
            C7573i.m23582a((Object) b, "resManager.genSegmentAudioPath(segmentIndex)");
            return b;
        }

        C21018k(C21069d dVar, String str, String str2) {
            this.f56499a = dVar;
            this.f56500b = str;
            super(str2);
        }
    }

    /* renamed from: o */
    private final C21001c m70499o() {
        return (C21001c) this.f56481e.getValue();
    }

    /* renamed from: p */
    private final C20997a m70500p() {
        return (C20997a) this.f56482f.getValue();
    }

    /* renamed from: q */
    private final C21002d m70501q() {
        return (C21002d) this.f56483g.getValue();
    }

    /* renamed from: r */
    private final C20999b m70502r() {
        return (C20999b) this.f56484h.getValue();
    }

    /* renamed from: s */
    private final C21006e m70503s() {
        return (C21006e) this.f56485i.getValue();
    }

    /* renamed from: i */
    public final void mo56711i() {
        m70500p();
    }

    /* renamed from: k */
    public final void mo56713k() {
        m70500p();
    }

    /* renamed from: n */
    public final C20689c mo56716n() {
        return (C20689c) this.f56480d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public C21001c mo56705c() {
        return m70499o();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public C20997a mo56706d() {
        return m70500p();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public C21002d mo56707e() {
        return m70501q();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public C20999b mo56708f() {
        return m70502r();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public C21006e mo56709g() {
        return m70503s();
    }

    /* renamed from: a */
    public final void mo56697a() {
        mo56716n().mo55854h();
    }

    /* renamed from: b */
    public final void mo56703b() {
        mo56716n().release();
    }

    /* renamed from: h */
    public final void mo56710h() {
        m70500p().mo56545s();
    }

    /* renamed from: j */
    public final void mo56712j() {
        m70500p().mo56546t();
    }

    /* renamed from: l */
    public final void mo56714l() {
        m70500p().mo56547u();
    }

    /* renamed from: m */
    public final void mo56715m() {
        m70500p().mo56548v();
        mo56707e().mo56687l();
        mo56703b();
    }

    /* renamed from: a */
    public final void mo56698a(C20914d dVar) {
        C45393e eVar;
        C20689c n = mo56716n();
        if (dVar != null) {
            eVar = C20872f.m69905a(dVar);
        } else {
            eVar = null;
        }
        n.mo55844a(eVar);
    }

    /* renamed from: a */
    public final void mo56700a(C20938l lVar) {
        mo56716n().mo55848b((C7562b<? super Integer, C7581n>) new C21017j<Object,C7581n>(lVar));
    }

    /* renamed from: a */
    public final void mo56701a(C20950p pVar) {
        mo56716n().mo55845a((C7562b<? super Long, C7581n>) new C21016i<Object,C7581n>(pVar));
    }

    /* renamed from: b */
    public final void mo56704b(C20935k kVar) {
        C7573i.m23587b(kVar, "listener");
        C19622b bVar = (C19622b) this.f56479c.get(kVar.asBinder());
        if (bVar != null) {
            mo56716n().mo55847b(bVar);
            this.f56479c.remove(kVar.asBinder());
        }
    }

    public C21007f(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) {
        C7573i.m23587b(aSSandBoxRecorderContextWrapper, "context");
        this.f56478b = C6855a.m21306a().mo38944a().submit(new C21010c(aSSandBoxRecorderContextWrapper));
        this.f56480d = C7546e.m23569a(new C21015h(this));
        this.f56481e = C7546e.m23569a(new C21012e(this));
        this.f56482f = C7546e.m23569a(new C21009b(this));
        this.f56483g = C7546e.m23569a(new C21013f(this));
        this.f56484h = C7546e.m23569a(new C21011d(this));
        this.f56485i = C7546e.m23569a(new C21014g(this));
    }

    /* renamed from: a */
    public final void mo56699a(C20935k kVar) {
        C7573i.m23587b(kVar, "listener");
        if (this.f56479c.get(kVar.asBinder()) != null) {
            C20689c n = mo56716n();
            Object obj = this.f56479c.get(kVar.asBinder());
            if (obj == null) {
                C7573i.m23580a();
            }
            n.mo55842a((C19622b) obj);
            return;
        }
        C19622b a = C20870e.m69900a(kVar);
        Map<IBinder, C19622b> map = this.f56479c;
        IBinder asBinder = kVar.asBinder();
        C7573i.m23582a((Object) asBinder, "listener.asBinder()");
        map.put(asBinder, a);
        mo56716n().mo55842a(a);
    }

    /* renamed from: a */
    public final void mo56702a(C21069d dVar, String str) {
        C7573i.m23587b(dVar, "resManager");
        C7573i.m23587b(str, "path");
        mo56716n().mo55843a(new C21018k(dVar, str, str), str);
    }
}

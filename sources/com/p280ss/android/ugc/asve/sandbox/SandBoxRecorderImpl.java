package com.p280ss.android.ugc.asve.sandbox;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.p755c.C15396a;
import com.p280ss.android.ugc.asve.p755c.C15397b;
import com.p280ss.android.ugc.asve.p756d.C15455i;
import com.p280ss.android.ugc.asve.recorder.C20689c;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.p921a.C20673b;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.asve.recorder.reaction.C20779a;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20872f;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20881l;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20883n;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20888s;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20914d;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20935k;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20938l;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20950p;
import com.p280ss.android.ugc.asve.sandbox.p929c.C20989a;
import com.p280ss.android.ugc.asve.sandbox.p929c.C20991b;
import com.p280ss.android.ugc.asve.sandbox.p929c.C20993c;
import com.p280ss.android.ugc.asve.sandbox.p929c.C20994d;
import com.p280ss.android.ugc.asve.sandbox.p929c.C20995e;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21069d.C21070a;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.runtime.C45362d;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl */
public final class SandBoxRecorderImpl implements C0042h, C20689c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56197a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SandBoxRecorderImpl.class), "effectController", "getEffectController()Lcom/ss/android/ugc/asve/recorder/effect/IEffectController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SandBoxRecorderImpl.class), "cameraController", "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SandBoxRecorderImpl.class), "reactionController", "getReactionController()Lcom/ss/android/ugc/asve/recorder/reaction/IReactionController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SandBoxRecorderImpl.class), "duetController", "getDuetController()Lcom/ss/android/ugc/asve/recorder/duet/IDuetController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SandBoxRecorderImpl.class), "mediaController", "getMediaController()Lcom/ss/android/ugc/asve/recorder/media/IMediaController;"))};

    /* renamed from: b */
    public final C21041l f56198b;

    /* renamed from: c */
    public final C15432h f56199c;

    /* renamed from: d */
    public final C0043i f56200d;

    /* renamed from: e */
    private C7562b<? super Long, C7581n> f56201e;

    /* renamed from: f */
    private final C7541d f56202f;

    /* renamed from: g */
    private final C7541d f56203g;

    /* renamed from: h */
    private final C7541d f56204h;

    /* renamed from: i */
    private final C7541d f56205i;

    /* renamed from: j */
    private final C7541d f56206j;

    /* renamed from: k */
    private C7562b<? super Integer, C7581n> f56207k;

    /* renamed from: l */
    private final Map<C19622b, C20883n> f56208l;

    /* renamed from: m */
    private C45393e f56209m;

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$a */
    static final class C20817a extends Lambda implements C7561a<C20989a> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56211a;

        C20817a(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56211a = sandBoxRecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20989a invoke() {
            return new C20989a(this.f56211a.f56198b.mo56706d(), this.f56211a.f56199c.mo38930m());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$b */
    static final class C20818b extends Lambda implements C7561a<C20991b> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56212a;

        C20818b(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56212a = sandBoxRecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20991b invoke() {
            return new C20991b(this.f56212a.f56198b.mo56708f());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$c */
    static final class C20819c extends Lambda implements C7561a<C20993c> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56213a;

        C20819c(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56213a = sandBoxRecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20993c invoke() {
            return new C20993c(this.f56213a.f56198b.mo56705c());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$d */
    static final class C20820d extends Lambda implements C7561a<C20994d> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56214a;

        C20820d(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56214a = sandBoxRecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20994d invoke() {
            C21035j e = this.f56214a.f56198b.mo56707e();
            String absolutePath = this.f56214a.f56199c.mo38921d().mo38988e().getAbsolutePath();
            C7573i.m23582a((Object) absolutePath, "recoderContext.workspace…er.photoPath.absolutePath");
            return new C20994d(e, absolutePath);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$e */
    static final class C20821e extends Lambda implements C7561a<C20995e> {

        /* renamed from: a */
        final /* synthetic */ SandBoxRecorderImpl f56215a;

        C20821e(SandBoxRecorderImpl sandBoxRecorderImpl) {
            this.f56215a = sandBoxRecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20995e invoke() {
            return new C20995e(this.f56215a.f56198b.mo56709g(), this.f56215a.f56199c.mo38928k());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl$f */
    public static final class C20822f extends C21070a {

        /* renamed from: a */
        final /* synthetic */ C45362d f56216a;

        /* renamed from: a */
        public final String mo56329a() {
            String a = this.f56216a.mo56149a();
            C7573i.m23582a((Object) a, "resManager.segmentDirPath");
            return a;
        }

        /* renamed from: b */
        public final String mo56331b() {
            String b = this.f56216a.mo56151b();
            C7573i.m23582a((Object) b, "resManager.concatSegmentVideoPath");
            return b;
        }

        /* renamed from: c */
        public final String mo56333c() {
            String c = this.f56216a.mo56153c();
            C7573i.m23582a((Object) c, "resManager.concatSegmentAudioPath");
            return c;
        }

        C20822f(C45362d dVar) {
            this.f56216a = dVar;
        }

        /* renamed from: a */
        public final String mo56330a(int i) {
            String a = this.f56216a.mo56150a(i);
            C7573i.m23582a((Object) a, "resManager.genSegmentVideoPath(segmentIndex)");
            return a;
        }

        /* renamed from: b */
        public final String mo56332b(int i) {
            String b = this.f56216a.mo56152b(i);
            C7573i.m23582a((Object) b, "resManager.genSegmentAudioPath(segmentIndex)");
            return b;
        }
    }

    /* renamed from: a */
    public final void mo55841a(Context context) {
        C7573i.m23587b(context, "context");
    }

    /* renamed from: b */
    public final C20707b mo55846b() {
        return (C20707b) this.f56203g.getValue();
    }

    /* renamed from: c */
    public final C20673b mo55849c() {
        return (C20673b) this.f56205i.getValue();
    }

    /* renamed from: d */
    public final C20749b mo55850d() {
        return (C20749b) this.f56202f.getValue();
    }

    /* renamed from: e */
    public final C20676a mo55851e() {
        return (C20676a) this.f56206j.getValue();
    }

    /* renamed from: f */
    public final C20779a mo55852f() {
        return (C20779a) this.f56204h.getValue();
    }

    /* renamed from: g */
    public final C15397b mo55853g() {
        return new C15396a();
    }

    /* renamed from: h */
    public final void mo55854h() {
        this.f56198b.mo56697a();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
        C15382b.f39669a.mo38742c("camera ON_CREATE ");
        this.f56198b.mo56710h();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C15382b.f39669a.mo38742c("camera ON_DESTROY ");
        this.f56198b.mo56715m();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        C15382b.f39669a.mo38742c("camera ON_PAUSE ");
        this.f56198b.mo56713k();
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        C15382b.f39669a.mo38742c("camera ON_RESUME ");
        this.f56198b.mo56712j();
    }

    @C0054q(mo125a = Event.ON_START)
    public final void onStart() {
        C15382b.f39669a.mo38742c("camera ON_START ");
        this.f56198b.mo56711i();
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void onStop() {
        C15382b.f39669a.mo38742c("camera ON_STOP ");
        this.f56198b.mo56714l();
    }

    public final void release() {
        this.f56209m = null;
        this.f56207k = null;
        this.f56208l.clear();
        mo55846b().mo55928a();
        mo55851e().mo55922j();
        C20749b d = mo55850d();
        if (d != null) {
            ((C20993c) d).mo56498f();
            this.f56198b.mo56703b();
            this.f56198b.mo56698a((C20914d) null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.proxy.SandBoxEffectServiceProxy");
    }

    /* renamed from: b */
    public final void mo55847b(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        C20883n nVar = (C20883n) this.f56208l.get(bVar);
        if (nVar != null) {
            this.f56198b.mo56704b(nVar);
            this.f56208l.remove(bVar);
        }
    }

    /* renamed from: a */
    public final void mo55842a(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        if (this.f56208l.get(bVar) != null) {
            this.f56198b.mo56699a((C20935k) this.f56208l.get(bVar));
            return;
        }
        C20883n nVar = new C20883n(bVar);
        this.f56208l.put(bVar, nVar);
        this.f56198b.mo56699a((C20935k) nVar);
    }

    /* renamed from: b */
    public final void mo55848b(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f56207k = bVar;
        this.f56198b.mo56700a((C20938l) new C20888s(bVar));
    }

    /* renamed from: a */
    public final void mo55844a(C45393e eVar) {
        this.f56209m = eVar;
        if (this.f56209m == null) {
            this.f56198b.mo56698a((C20914d) null);
            return;
        }
        C21041l lVar = this.f56198b;
        C45393e eVar2 = this.f56209m;
        if (eVar2 == null) {
            C7573i.m23580a();
        }
        lVar.mo56698a((C20914d) C20872f.m69904a(eVar2));
    }

    /* renamed from: a */
    public final void mo55845a(C7562b<? super Long, C7581n> bVar) {
        C20881l lVar;
        C7573i.m23587b(bVar, "callback");
        this.f56201e = bVar;
        C21041l lVar2 = this.f56198b;
        C7562b<? super Long, C7581n> bVar2 = this.f56201e;
        if (bVar2 != null) {
            lVar = C20872f.m69903a(bVar2);
        } else {
            lVar = null;
        }
        lVar2.mo56701a((C20950p) lVar);
    }

    /* renamed from: a */
    public final void mo55843a(C45362d dVar, String str) {
        C7573i.m23587b(dVar, "resManager");
        C7573i.m23587b(str, "workSpacePath");
        this.f56198b.mo56702a(new C20822f(dVar), str);
    }

    public SandBoxRecorderImpl(C21041l lVar, C15432h hVar, C0043i iVar) {
        C7573i.m23587b(lVar, "remoteRecoder");
        C7573i.m23587b(hVar, "recoderContext");
        this.f56199c = hVar;
        this.f56200d = iVar;
        C15455i.m45262a(new C7561a<C7581n>(this) {

            /* renamed from: a */
            final /* synthetic */ SandBoxRecorderImpl f56210a;

            {
                this.f56210a = r1;
            }

            public final /* synthetic */ Object invoke() {
                m69729a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m69729a() {
                C0043i iVar = this.f56210a.f56200d;
                if (iVar != null) {
                    Lifecycle lifecycle = iVar.getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.mo55a(this.f56210a);
                    }
                }
            }
        });
        Object newProxyInstance = Proxy.newProxyInstance(C21041l.class.getClassLoader(), new Class[]{C21041l.class}, new C20996d(lVar));
        if (newProxyInstance != null) {
            this.f56198b = (C21041l) newProxyInstance;
            this.f56202f = C7546e.m23569a(new C20819c(this));
            this.f56203g = C7546e.m23569a(new C20817a(this));
            this.f56204h = C7546e.m23569a(new C20821e(this));
            this.f56205i = C7546e.m23569a(new C20818b(this));
            this.f56206j = C7546e.m23569a(new C20820d(this));
            this.f56208l = new LinkedHashMap();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteRecorderService");
    }
}

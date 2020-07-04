package com.p280ss.android.ugc.asve.recorder;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.p753a.C15381a;
import com.p280ss.android.ugc.asve.p755c.C15397b;
import com.p280ss.android.ugc.asve.p755c.C15400c;
import com.p280ss.android.ugc.asve.p756d.C15453g;
import com.p280ss.android.ugc.asve.p756d.C15455i;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.camera.VECameraController;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.effect.C20750c;
import com.p280ss.android.ugc.asve.recorder.p921a.C20673b;
import com.p280ss.android.ugc.asve.recorder.p921a.C20674c;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.asve.recorder.p922b.C20681d;
import com.p280ss.android.ugc.asve.recorder.reaction.C20779a;
import com.p280ss.android.ugc.asve.recorder.reaction.C20789c;
import com.p280ss.android.vesdk.C45256ag;
import com.p280ss.android.vesdk.C45382z;
import com.p280ss.android.vesdk.C45382z.C45391c;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.VEListener.C45225u;
import com.p280ss.android.vesdk.VEListener.C45226v;
import com.p280ss.android.vesdk.p1773a.C45248a;
import com.p280ss.android.vesdk.runtime.C45362d;
import java.util.concurrent.CopyOnWriteArrayList;
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

/* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl */
public final class VERecorderImpl implements C0042h, C20689c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f55807a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VERecorderImpl.class), "realCameraController", "getRealCameraController()Lcom/ss/android/ugc/asve/recorder/camera/VECameraController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VERecorderImpl.class), "duetController", "getDuetController()Lcom/ss/android/ugc/asve/recorder/duet/IDuetController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VERecorderImpl.class), "effectController", "getEffectController()Lcom/ss/android/ugc/asve/recorder/effect/IEffectController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VERecorderImpl.class), "cameraController", "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VERecorderImpl.class), "recorder", "getRecorder()Lcom/ss/android/vesdk/VERecorder;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VERecorderImpl.class), "nativeInitListeners", "getNativeInitListeners()Ljava/util/concurrent/CopyOnWriteArrayList;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VERecorderImpl.class), "mediaController", "getMediaController()Lcom/ss/android/ugc/asve/recorder/media/IMediaController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VERecorderImpl.class), "reactionController", "getReactionController()Lcom/ss/android/ugc/asve/recorder/reaction/IReactionController;"))};

    /* renamed from: b */
    public C7562b<? super Integer, C7581n> f55808b;

    /* renamed from: c */
    public C7562b<? super Long, C7581n> f55809c;

    /* renamed from: d */
    public final Context f55810d;

    /* renamed from: e */
    public final C15432h f55811e;

    /* renamed from: f */
    public final C0043i f55812f;

    /* renamed from: g */
    private final C7541d f55813g = C7546e.m23569a(new C20669g(this));

    /* renamed from: h */
    private final C7541d f55814h = C7546e.m23569a(new C20664b(this));

    /* renamed from: i */
    private final C7541d f55815i = C7546e.m23569a(new C20665c(this));

    /* renamed from: j */
    private final C7541d f55816j = C7546e.m23569a(new C20663a(this));

    /* renamed from: k */
    private final C7541d f55817k = C7546e.m23569a(new C20670h(this));

    /* renamed from: l */
    private final C15400c f55818l = new C15400c(mo55868i());

    /* renamed from: m */
    private final C7541d f55819m = C7546e.m23569a(C20667e.f55828a);

    /* renamed from: n */
    private final C7541d f55820n;

    /* renamed from: o */
    private final C7541d f55821o;

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$a */
    static final class C20663a extends Lambda implements C7561a<VECameraController> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55824a;

        C20663a(VERecorderImpl vERecorderImpl) {
            this.f55824a = vERecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VECameraController invoke() {
            return this.f55824a.mo55867a();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$b */
    static final class C20664b extends Lambda implements C7561a<C20674c> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55825a;

        C20664b(VERecorderImpl vERecorderImpl) {
            this.f55825a = vERecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20674c invoke() {
            return new C20674c(this.f55825a.mo55868i());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$c */
    static final class C20665c extends Lambda implements C7561a<C20750c> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55826a;

        C20665c(VERecorderImpl vERecorderImpl) {
            this.f55826a = vERecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20750c invoke() {
            return new C20750c(this.f55826a.mo55868i());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$d */
    static final class C20666d extends Lambda implements C7561a<C20681d> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55827a;

        C20666d(VERecorderImpl vERecorderImpl) {
            this.f55827a = vERecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20681d invoke() {
            return new C20681d(this.f55827a.mo55868i(), this.f55827a.f55811e, this.f55827a.mo55867a().f55871h);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$e */
    static final class C20667e extends Lambda implements C7561a<CopyOnWriteArrayList<C19622b>> {

        /* renamed from: a */
        public static final C20667e f55828a = new C20667e();

        C20667e() {
            super(0);
        }

        /* renamed from: a */
        private static CopyOnWriteArrayList<C19622b> m68493a() {
            return new CopyOnWriteArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m68493a();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$f */
    static final class C20668f extends Lambda implements C7561a<C20789c> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55829a;

        C20668f(VERecorderImpl vERecorderImpl) {
            this.f55829a = vERecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20789c invoke() {
            C20789c cVar = new C20789c(this.f55829a.mo55868i(), this.f55829a.f55810d, this.f55829a, this.f55829a.f55811e.mo38922e(), this.f55829a.f55811e.mo38928k());
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$g */
    static final class C20669g extends Lambda implements C7561a<VECameraController> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55830a;

        C20669g(VERecorderImpl vERecorderImpl) {
            this.f55830a = vERecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VECameraController invoke() {
            VECameraController vECameraController = new VECameraController(this.f55830a.f55810d, this.f55830a.f55812f, this.f55830a.mo55868i(), this.f55830a, this.f55830a.f55811e.mo38930m());
            return vECameraController;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$h */
    static final class C20670h extends Lambda implements C7561a<C45382z> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f55831a;

        C20670h(VERecorderImpl vERecorderImpl) {
            this.f55831a = vERecorderImpl;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C45382z invoke() {
            return new C45382z(new C20778k(this.f55831a.f55811e.mo38921d()), this.f55831a.f55810d.getApplicationContext());
        }
    }

    /* renamed from: a */
    public final VECameraController mo55867a() {
        return (VECameraController) this.f55813g.getValue();
    }

    /* renamed from: a */
    public final void mo55841a(Context context) {
        C7573i.m23587b(context, "context");
    }

    /* renamed from: b */
    public final C20707b mo55846b() {
        return (C20707b) this.f55816j.getValue();
    }

    /* renamed from: c */
    public final C20673b mo55849c() {
        return (C20673b) this.f55814h.getValue();
    }

    /* renamed from: d */
    public final C20749b mo55850d() {
        return (C20749b) this.f55815i.getValue();
    }

    /* renamed from: e */
    public final C20676a mo55851e() {
        return (C20676a) this.f55820n.getValue();
    }

    /* renamed from: f */
    public final C20779a mo55852f() {
        return (C20779a) this.f55821o.getValue();
    }

    /* renamed from: h */
    public final void mo55854h() {
    }

    /* renamed from: i */
    public final C45382z mo55868i() {
        return (C45382z) this.f55817k.getValue();
    }

    /* renamed from: j */
    public final CopyOnWriteArrayList<C19622b> mo55869j() {
        return (CopyOnWriteArrayList) this.f55819m.getValue();
    }

    /* renamed from: g */
    public final C15397b mo55853g() {
        return this.f55818l;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void release() {
        C15382b.f39669a.mo38742c("camera ON_DESTROY ");
        mo55868i().mo108738n();
    }

    /* renamed from: b */
    public final void mo55848b(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f55808b = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C7562b m68466a(VERecorderImpl vERecorderImpl) {
        C7562b<? super Integer, C7581n> bVar = vERecorderImpl.f55808b;
        if (bVar == null) {
            C7573i.m23583a("runningErrorCallback");
        }
        return bVar;
    }

    /* renamed from: b */
    public final void mo55847b(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        mo55869j().remove(bVar);
    }

    /* renamed from: a */
    public final void mo55842a(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        mo55869j().add(bVar);
    }

    /* renamed from: a */
    public final void mo55844a(C45393e eVar) {
        mo55868i().mo108666a(eVar);
    }

    /* renamed from: a */
    public final void mo55845a(C7562b<? super Long, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f55809c = bVar;
    }

    /* renamed from: a */
    public final void mo55843a(C45362d dVar, String str) {
        C7573i.m23587b(dVar, "resManager");
        C7573i.m23587b(str, "workSpacePath");
        mo55868i().mo108624a(dVar);
    }

    public VERecorderImpl(Context context, C15432h hVar, C0043i iVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(hVar, "recorderContext");
        this.f55810d = context;
        this.f55811e = hVar;
        this.f55812f = iVar;
        if (this.f55811e.mo38930m().mo38915f()) {
            C15453g.m45258a(new C20777j(this));
        }
        C15455i.m45262a(new C7561a<C7581n>(this) {

            /* renamed from: a */
            final /* synthetic */ VERecorderImpl f55822a;

            {
                this.f55822a = r1;
            }

            public final /* synthetic */ Object invoke() {
                m68484a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68484a() {
                C0043i iVar = this.f55822a.f55812f;
                if (iVar != null) {
                    Lifecycle lifecycle = iVar.getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.mo55a(this.f55822a);
                    }
                }
            }
        });
        C45256ag agVar = new C45256ag();
        agVar.f116448a = this.f55811e.mo38929l().mo38935a();
        agVar.f116449b = this.f55811e.mo38929l().mo38936b();
        mo55868i().mo108662a(agVar);
        mo55868i().mo108678a(this.f55811e.mo38923f());
        mo55868i().mo108659a((C45226v) new C45225u(this) {

            /* renamed from: a */
            final /* synthetic */ VERecorderImpl f55823a;

            {
                this.f55823a = r1;
            }

            /* renamed from: a */
            public final void mo55872a(boolean z) {
                for (C19622b a : this.f55823a.mo55869j()) {
                    a.mo52205a(z ? 1 : 0, 1);
                }
            }

            /* renamed from: b */
            public final void mo55873b(int i, String str) {
                C7573i.m23587b(str, "msg");
                VERecorderImpl.m68466a(this.f55823a).invoke(Integer.valueOf(i));
            }

            /* renamed from: a */
            public final void mo55871a(int i, String str) {
                for (C19622b a : this.f55823a.mo55869j()) {
                    a.mo52204a(i);
                }
                if (i == 0) {
                    this.f55823a.mo55868i().mo108625a((C45391c) new C15381a());
                }
            }

            /* renamed from: a */
            public final void mo55870a(int i, int i2, String str) {
                if (i == 1000) {
                    C20707b b = this.f55823a.mo55846b();
                    if (b != null) {
                        ((VECameraController) b).mo55981x();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
                } else if (i == 10001) {
                    C20707b b2 = this.f55823a.mo55846b();
                    if (b2 != null) {
                        ((VECameraController) b2).mo55982y();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
                } else {
                    if (i != 1020 && i == 1021) {
                        C7562b<? super Long, C7581n> bVar = this.f55823a.f55809c;
                        if (bVar != null) {
                            bVar.invoke(Long.valueOf(this.f55823a.mo55868i().mo108723g() / 1000));
                        }
                    }
                }
            }
        });
        mo55868i().mo108623a((C45248a) null, C20776i.m69341a(this.f55811e), C20776i.m69340a(), C20776i.m69342b(this.f55811e));
        this.f55820n = C7546e.m23569a(new C20666d(this));
        this.f55821o = C7546e.m23569a(new C20668f(this));
    }
}

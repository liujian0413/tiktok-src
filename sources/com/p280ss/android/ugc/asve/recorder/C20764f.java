package com.p280ss.android.ugc.asve.recorder;

import android.content.Context;
import android.opengl.EGLContext;
import com.p280ss.android.medialib.FaceBeautyInvoker;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.medialib.log.IMonitor;
import com.p280ss.android.medialib.model.C19753a;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.medialib.presenter.C19764d;
import com.p280ss.android.medialib.presenter.C19764d.C19779b;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.p755c.C15396a;
import com.p280ss.android.ugc.asve.p755c.C15397b;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.effect.C20745a;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.p921a.C20672a;
import com.p280ss.android.ugc.asve.recorder.p921a.C20673b;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.asve.recorder.p922b.C20677b;
import com.p280ss.android.ugc.asve.recorder.reaction.C20779a;
import com.p280ss.android.ugc.asve.recorder.reaction.C20787b;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.runtime.C45362d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.asve.recorder.f */
public final class C20764f implements C20689c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56055a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20764f.class), "nativeInitListeners", "getNativeInitListeners()Ljava/util/concurrent/CopyOnWriteArrayList;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20764f.class), "mediaController", "getMediaController()Lcom/ss/android/ugc/asve/recorder/media/IMediaController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20764f.class), "cameraController", "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20764f.class), "effectController", "getEffectController()Lcom/ss/android/ugc/asve/recorder/effect/IEffectController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20764f.class), "reactionController", "getReactionController()Lcom/ss/android/ugc/asve/recorder/reaction/IReactionController;"))};

    /* renamed from: b */
    public final Context f56056b;

    /* renamed from: c */
    public final C19764d f56057c;

    /* renamed from: d */
    private final C7541d f56058d;

    /* renamed from: e */
    private final C20769d f56059e;

    /* renamed from: f */
    private final C7541d f56060f;

    /* renamed from: g */
    private final C7541d f56061g;

    /* renamed from: h */
    private final C7541d f56062h;

    /* renamed from: i */
    private final C7541d f56063i;

    /* renamed from: com.ss.android.ugc.asve.recorder.f$a */
    static final class C20766a extends Lambda implements C7561a<C20734e> {

        /* renamed from: a */
        final /* synthetic */ C20764f f56065a;

        /* renamed from: b */
        final /* synthetic */ C15432h f56066b;

        C20766a(C20764f fVar, C15432h hVar) {
            this.f56065a = fVar;
            this.f56066b = hVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20734e invoke() {
            return new C20734e(this.f56065a.f56056b, this.f56065a, this.f56066b.mo38930m(), this.f56065a.f56057c);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.f$b */
    static final class C20767b extends Lambda implements C7561a<C20745a> {

        /* renamed from: a */
        final /* synthetic */ C20764f f56067a;

        C20767b(C20764f fVar) {
            this.f56067a = fVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20745a invoke() {
            return new C20745a(this.f56067a.f56057c);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.f$c */
    static final class C20768c extends Lambda implements C7561a<C20677b> {

        /* renamed from: a */
        final /* synthetic */ C20764f f56068a;

        /* renamed from: b */
        final /* synthetic */ C15432h f56069b;

        C20768c(C20764f fVar, C15432h hVar) {
            this.f56068a = fVar;
            this.f56069b = hVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20677b invoke() {
            return new C20677b(this.f56068a.f56057c, this.f56069b);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.f$d */
    public static final class C20769d implements C19622b {

        /* renamed from: a */
        final /* synthetic */ C20764f f56070a;

        C20769d(C20764f fVar) {
            this.f56070a = fVar;
        }

        /* renamed from: a */
        public final void mo52204a(int i) {
            for (C19622b a : this.f56070a.mo56148a()) {
                a.mo52204a(i);
            }
        }

        /* renamed from: a */
        public final void mo52205a(int i, int i2) {
            for (C19622b a : this.f56070a.mo56148a()) {
                a.mo52205a(i, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.f$e */
    static final class C20770e extends Lambda implements C7561a<CopyOnWriteArrayList<C19622b>> {

        /* renamed from: a */
        public static final C20770e f56071a = new C20770e();

        C20770e() {
            super(0);
        }

        /* renamed from: a */
        private static CopyOnWriteArrayList<C19622b> m69335a() {
            return new CopyOnWriteArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m69335a();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.f$f */
    static final class C20771f extends Lambda implements C7561a<C20787b> {

        /* renamed from: a */
        final /* synthetic */ C20764f f56072a;

        /* renamed from: b */
        final /* synthetic */ C15432h f56073b;

        C20771f(C20764f fVar, C15432h hVar) {
            this.f56072a = fVar;
            this.f56073b = hVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20787b invoke() {
            C20787b bVar = new C20787b(this.f56072a.f56057c, this.f56072a.f56056b, this.f56072a, this.f56073b.mo38922e(), this.f56073b.mo38928k());
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.f$g */
    public static final class C20772g implements OnRunningErrorCallback {

        /* renamed from: a */
        final /* synthetic */ C7562b f56074a;

        public final void onInfo(int i, int i2) {
        }

        C20772g(C7562b bVar) {
            this.f56074a = bVar;
        }

        public final void onError(int i) {
            this.f56074a.invoke(Integer.valueOf(i));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.f$h */
    public static final class C20773h implements C19779b {

        /* renamed from: a */
        final /* synthetic */ C45393e f56075a;

        public final boolean bW_() {
            return this.f56075a.mo56383a();
        }

        C20773h(C45393e eVar) {
            this.f56075a = eVar;
        }

        /* renamed from: a */
        public final void mo53070a(C19753a aVar) {
            EGLContext eGLContext;
            int i;
            int i2;
            int i3;
            int i4;
            long j;
            C45393e eVar = this.f56075a;
            if (aVar != null) {
                eGLContext = aVar.f53608a;
            } else {
                eGLContext = null;
            }
            if (aVar != null) {
                i = aVar.f53609b;
            } else {
                i = 0;
            }
            if (aVar != null) {
                i2 = aVar.f53610c;
            } else {
                i2 = 0;
            }
            if (aVar != null) {
                i3 = aVar.f53611d;
            } else {
                i3 = 0;
            }
            if (aVar != null) {
                i4 = aVar.f53612e;
            } else {
                i4 = 0;
            }
            if (aVar != null) {
                j = aVar.f53613f;
            } else {
                j = 0;
            }
            eVar.mo56382a(eGLContext, i, i2, i3, i4, j);
        }
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<C19622b> mo56148a() {
        return (CopyOnWriteArrayList) this.f56058d.getValue();
    }

    /* renamed from: a */
    public final void mo55843a(C45362d dVar, String str) {
        C7573i.m23587b(dVar, "resManager");
        C7573i.m23587b(str, "path");
    }

    /* renamed from: a */
    public final void mo55845a(C7562b<? super Long, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
    }

    /* renamed from: b */
    public final C20707b mo55846b() {
        return (C20707b) this.f56061g.getValue();
    }

    /* renamed from: d */
    public final C20749b mo55850d() {
        return (C20749b) this.f56062h.getValue();
    }

    /* renamed from: e */
    public final C20676a mo55851e() {
        return (C20676a) this.f56060f.getValue();
    }

    /* renamed from: f */
    public final C20779a mo55852f() {
        return (C20779a) this.f56063i.getValue();
    }

    public final void release() {
    }

    /* renamed from: g */
    public final C15397b mo55853g() {
        return new C15396a();
    }

    /* renamed from: h */
    public final void mo55854h() {
        this.f56057c.mo53014f();
    }

    /* renamed from: c */
    public final C20673b mo55849c() {
        return new C20672a(this.f56057c);
    }

    /* renamed from: a */
    public final void mo55841a(Context context) {
        C7573i.m23587b(context, "context");
        this.f56057c.mo52928a(context);
    }

    /* renamed from: b */
    public final void mo55847b(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        mo56148a().remove(bVar);
        if (mo56148a().isEmpty()) {
            FaceBeautyInvoker.setNativeInitListener(null);
        }
    }

    /* renamed from: a */
    public final void mo55842a(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        mo56148a().add(bVar);
        FaceBeautyInvoker.setNativeInitListener(this.f56059e);
    }

    /* renamed from: b */
    public final void mo55848b(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f56057c.mo52935a((OnRunningErrorCallback) new C20772g(bVar));
    }

    /* renamed from: a */
    public final void mo55844a(C45393e eVar) {
        if (eVar == null) {
            this.f56057c.mo52943a((C19779b) null);
        } else {
            this.f56057c.mo52943a((C19779b) new C20773h(eVar));
        }
    }

    private C20764f(Context context, C19764d dVar, C15432h hVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(dVar, "mediaRecordPresenter");
        C7573i.m23587b(hVar, "recorderContext");
        this.f56056b = context;
        this.f56057c = dVar;
        this.f56058d = C7546e.m23569a(C20770e.f56071a);
        this.f56059e = new C20769d(this);
        this.f56057c.mo52976b(hVar.mo38929l().mo38936b());
        this.f56057c.mo52940a((IMonitor) C207651.f56064a);
        this.f56060f = C7546e.m23569a(new C20768c(this, hVar));
        this.f56061g = C7546e.m23569a(new C20766a(this, hVar));
        this.f56062h = C7546e.m23569a(new C20767b(this));
        this.f56063i = C7546e.m23569a(new C20771f(this, hVar));
    }

    public /* synthetic */ C20764f(Context context, C19764d dVar, C15432h hVar, int i, C7571f fVar) {
        this(context, new C19764d(), hVar);
    }
}

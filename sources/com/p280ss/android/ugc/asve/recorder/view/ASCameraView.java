package com.p280ss.android.ugc.asve.recorder.view;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.C19667g.C19672a;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.ugc.asve.constant.ASCameraHardwareSupportLevel;
import com.p280ss.android.ugc.asve.constant.ASCameraType;
import com.p280ss.android.ugc.asve.constant.AS_CAMERA_LENS_FACING;
import com.p280ss.android.ugc.asve.context.C15422c;
import com.p280ss.android.ugc.asve.context.C15424d;
import com.p280ss.android.ugc.asve.context.C15428f;
import com.p280ss.android.ugc.asve.context.C15430g;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.recorder.ASRecorder;
import com.p280ss.android.ugc.asve.recorder.ASRecorder.C20656a;
import com.p280ss.android.ugc.asve.recorder.ASRecorder.Mode;
import com.p280ss.android.ugc.asve.recorder.C20733d;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.camera.C20713c;
import com.p280ss.android.ugc.asve.recorder.camera.p924b.C20711b;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p280ss.android.ugc.asve.recorder.reaction.p926a.C20784b;
import com.p280ss.android.ugc.asve.sandbox.C21053p;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.runtime.C45362d;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView */
public final class ASCameraView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56140a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ASCameraView.class), "effectController", "getEffectController()Lcom/ss/android/ugc/asve/recorder/effect/IEffectController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ASCameraView.class), "cameraController", "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ASCameraView.class), "mediaController", "getMediaController()Lcom/ss/android/ugc/asve/recorder/media/IMediaController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ASCameraView.class), "attrsHelper", "getAttrsHelper()Lcom/ss/android/ugc/asve/recorder/view/ASCameraViewAttrsHelper;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ASCameraView.class), "touchHelper", "getTouchHelper()Lcom/ss/android/ugc/asve/recorder/view/ASCameraViewTouchHelper;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ASCameraView.class), "cameraViewHelper", "getCameraViewHelper$tools_asve_release()Lcom/ss/android/ugc/asve/recorder/camera/view/CameraViewHelper;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ASCameraView.class), "reactionViewHelper", "getReactionViewHelper$tools_asve_release()Lcom/ss/android/ugc/asve/recorder/reaction/view/ReactionViewHelper;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ASCameraView.class), "gestureDispatcher", "getGestureDispatcher()Lcom/ss/android/ugc/asve/recorder/view/GestureDispatcher;"))};

    /* renamed from: b */
    public C0043i f56141b;

    /* renamed from: c */
    public View f56142c;

    /* renamed from: d */
    public ASRecorder f56143d;

    /* renamed from: e */
    private SurfaceView f56144e;

    /* renamed from: f */
    private TextureView f56145f;

    /* renamed from: g */
    private final C7541d f56146g;

    /* renamed from: h */
    private final C7541d f56147h;

    /* renamed from: i */
    private final C7541d f56148i;

    /* renamed from: j */
    private final Mode f56149j;

    /* renamed from: k */
    private final C7541d f56150k;

    /* renamed from: l */
    private final C7541d f56151l;

    /* renamed from: m */
    private final C7541d f56152m;

    /* renamed from: n */
    private final C7541d f56153n;

    /* renamed from: o */
    private final C7541d f56154o;

    /* renamed from: p */
    private Runnable f56155p;

    /* renamed from: q */
    private String f56156q;

    /* renamed from: r */
    private String f56157r;

    /* renamed from: s */
    private String f56158s;

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$a */
    static final class C20793a extends Lambda implements C7561a<C20807a> {

        /* renamed from: a */
        final /* synthetic */ Context f56159a;

        C20793a(Context context) {
            this.f56159a = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20807a invoke() {
            return new C20807a(this.f56159a);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$b */
    static final class C20794b extends Lambda implements C7561a<C20811e> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56160a;

        C20794b(ASCameraView aSCameraView) {
            this.f56160a = aSCameraView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20811e invoke() {
            return new C20811e(ASCameraView.m69416a(this.f56160a).mo55846b());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$c */
    static final class C20795c extends Lambda implements C7561a<C20711b> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56161a;

        /* renamed from: b */
        final /* synthetic */ Context f56162b;

        C20795c(ASCameraView aSCameraView, Context context) {
            this.f56161a = aSCameraView;
            this.f56162b = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20711b invoke() {
            return new C20711b(this.f56162b, this.f56161a, ASCameraView.m69416a(this.f56161a).f55793d.mo38930m());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$d */
    static final class C20796d extends Lambda implements C7561a<C20812f> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56163a;

        C20796d(ASCameraView aSCameraView) {
            this.f56163a = aSCameraView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20812f invoke() {
            return new C20812f(ASCameraView.m69416a(this.f56163a).mo55850d());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$e */
    static final class C20797e extends Lambda implements C7561a<C20813g> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56164a;

        C20797e(ASCameraView aSCameraView) {
            this.f56164a = aSCameraView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20813g invoke() {
            return this.f56164a.getTouchHelper().f56191a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$f */
    public static final class C20798f implements SurfaceTextureListener {

        /* renamed from: a */
        final /* synthetic */ SurfaceTextureListener f56165a;

        /* renamed from: b */
        final /* synthetic */ ASRecorder f56166b;

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$f$a */
        static final class C20799a extends Lambda implements C7562b<Integer, C7581n> {

            /* renamed from: a */
            public static final C20799a f56167a = new C20799a();

            C20799a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return C7581n.f20898a;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$f$b */
        static final class C20800b extends Lambda implements C7562b<Integer, C7581n> {

            /* renamed from: a */
            public static final C20800b f56168a = new C20800b();

            C20800b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return C7581n.f20898a;
            }
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            SurfaceTextureListener surfaceTextureListener = this.f56165a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f56166b.mo55851e().mo55910b((C7562b<? super Integer, C7581n>) C20800b.f56168a);
            SurfaceTextureListener surfaceTextureListener = this.f56165a;
            if (surfaceTextureListener != null) {
                return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
            }
            return true;
        }

        C20798f(SurfaceTextureListener surfaceTextureListener, ASRecorder aSRecorder) {
            this.f56165a = surfaceTextureListener;
            this.f56166b = aSRecorder;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SurfaceTextureListener surfaceTextureListener = this.f56165a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SurfaceTextureListener surfaceTextureListener = this.f56165a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
            Surface surface = new Surface(surfaceTexture);
            C20676a e = this.f56166b.mo55851e();
            String str = Build.DEVICE;
            C7573i.m23582a((Object) str, "Build.DEVICE");
            e.mo55896a(surface, str, (C7562b<? super Integer, C7581n>) C20799a.f56167a);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$g */
    static final class C20801g extends Lambda implements C7561a<C20814h> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56169a;

        C20801g(ASCameraView aSCameraView) {
            this.f56169a = aSCameraView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20814h invoke() {
            return new C20814h(ASCameraView.m69416a(this.f56169a).mo55851e());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$h */
    static final class C20802h extends Lambda implements C7561a<C20784b> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56170a;

        C20802h(ASCameraView aSCameraView) {
            this.f56170a = aSCameraView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20784b invoke() {
            return new C20784b(this.f56170a, this.f56170a.getPresentView(), ASCameraView.m69416a(this.f56170a).mo55852f());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$i */
    static final class C20803i extends Lambda implements C7561a<C20808b> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56171a;

        /* renamed from: b */
        final /* synthetic */ Context f56172b;

        C20803i(ASCameraView aSCameraView, Context context) {
            this.f56171a = aSCameraView;
            this.f56172b = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20808b invoke() {
            return new C20808b(this.f56172b, this.f56171a, ASCameraView.m69416a(this.f56171a));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$j */
    public static final class C20804j implements C15432h {

        /* renamed from: a */
        public final C15422c f56173a;

        /* renamed from: b */
        public final C15430g f56174b;

        /* renamed from: c */
        public final C20805a f56175c = new C20805a(this);

        /* renamed from: d */
        public final C20806b f56176d = new C20806b(this);

        /* renamed from: e */
        final /* synthetic */ ASCameraView f56177e;

        /* renamed from: f */
        final /* synthetic */ C15432h f56178f;

        /* renamed from: g */
        private final /* synthetic */ C15432h f56179g;

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$j$a */
        public static final class C20805a implements C15422c {

            /* renamed from: a */
            final /* synthetic */ C20804j f56180a;

            /* renamed from: b */
            private final int f56181b;

            /* renamed from: c */
            private final /* synthetic */ C15422c f56182c;

            /* renamed from: a */
            public final AS_CAMERA_LENS_FACING mo38910a() {
                return this.f56182c.mo38910a();
            }

            /* renamed from: b */
            public final ASCameraType mo38911b() {
                return this.f56182c.mo38911b();
            }

            /* renamed from: c */
            public final ASCameraHardwareSupportLevel mo38912c() {
                return this.f56182c.mo38912c();
            }

            /* renamed from: d */
            public final boolean mo38913d() {
                return this.f56182c.mo38913d();
            }

            /* renamed from: e */
            public final byte mo38914e() {
                return this.f56182c.mo38914e();
            }

            /* renamed from: f */
            public final boolean mo38915f() {
                return this.f56182c.mo38915f();
            }

            /* renamed from: g */
            public final int mo38916g() {
                return this.f56181b;
            }

            /* renamed from: h */
            public final int[] mo38917h() {
                return this.f56182c.mo38917h();
            }

            C20805a(C20804j jVar) {
                int i;
                this.f56180a = jVar;
                this.f56182c = jVar.f56173a;
                if (jVar.f56173a.mo38916g() != 0) {
                    i = jVar.f56173a.mo38916g();
                } else {
                    i = jVar.f56177e.getAttrsHelper().f56187a;
                }
                this.f56181b = i;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$j$b */
        public static final class C20806b implements C15430g {

            /* renamed from: a */
            final /* synthetic */ C20804j f56183a;

            /* renamed from: b */
            private final int f56184b;

            /* renamed from: c */
            private final int f56185c;

            /* renamed from: d */
            private final /* synthetic */ C15430g f56186d;

            /* renamed from: a */
            public final String mo38975a() {
                return this.f56186d.mo38975a();
            }

            /* renamed from: b */
            public final String mo38976b() {
                return this.f56186d.mo38976b();
            }

            /* renamed from: c */
            public final float mo38977c() {
                return this.f56186d.mo38977c();
            }

            /* renamed from: d */
            public final boolean mo38978d() {
                return this.f56186d.mo38978d();
            }

            /* renamed from: e */
            public final int mo38979e() {
                return this.f56184b;
            }

            /* renamed from: f */
            public final int mo38980f() {
                return this.f56185c;
            }

            /* renamed from: g */
            public final int mo38981g() {
                return this.f56186d.mo38981g();
            }

            C20806b(C20804j jVar) {
                int i;
                int i2;
                this.f56183a = jVar;
                this.f56186d = jVar.f56174b;
                if (jVar.f56174b.mo38979e() != 0) {
                    i = jVar.f56174b.mo38979e();
                } else {
                    i = jVar.f56177e.getAttrsHelper().f56188b;
                }
                this.f56184b = i;
                if (jVar.f56174b.mo38980f() != 0) {
                    i2 = jVar.f56174b.mo38980f();
                } else {
                    i2 = jVar.f56177e.getAttrsHelper().f56189c;
                }
                this.f56185c = i2;
            }
        }

        /* renamed from: a */
        public final Boolean mo38918a() {
            return this.f56179g.mo38918a();
        }

        /* renamed from: b */
        public final boolean mo38919b() {
            return this.f56179g.mo38919b();
        }

        /* renamed from: c */
        public final SurfaceHolder mo38920c() {
            return this.f56179g.mo38920c();
        }

        /* renamed from: d */
        public final C20733d mo38921d() {
            return this.f56179g.mo38921d();
        }

        /* renamed from: e */
        public final Pair<Integer, Integer> mo38922e() {
            return this.f56179g.mo38922e();
        }

        /* renamed from: f */
        public final boolean mo38923f() {
            return this.f56179g.mo38923f();
        }

        /* renamed from: g */
        public final boolean mo38924g() {
            return this.f56179g.mo38924g();
        }

        /* renamed from: h */
        public final boolean mo38925h() {
            return this.f56179g.mo38925h();
        }

        /* renamed from: i */
        public final boolean mo38926i() {
            return this.f56179g.mo38926i();
        }

        /* renamed from: j */
        public final C15428f mo38927j() {
            return this.f56179g.mo38927j();
        }

        /* renamed from: l */
        public final C15424d mo38929l() {
            return this.f56179g.mo38929l();
        }

        /* renamed from: n */
        public final boolean mo38931n() {
            return this.f56179g.mo38931n();
        }

        /* renamed from: o */
        public final C21053p mo38932o() {
            return this.f56179g.mo38932o();
        }

        /* renamed from: p */
        public final boolean mo38933p() {
            return this.f56179g.mo38933p();
        }

        /* renamed from: q */
        public final boolean mo38934q() {
            return this.f56179g.mo38934q();
        }

        /* renamed from: k */
        public final /* bridge */ /* synthetic */ C15430g mo38928k() {
            return this.f56176d;
        }

        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C15422c mo38930m() {
            return this.f56175c;
        }

        C20804j(ASCameraView aSCameraView, C15432h hVar) {
            this.f56177e = aSCameraView;
            this.f56178f = hVar;
            this.f56179g = hVar;
            this.f56173a = hVar.mo38930m();
            this.f56174b = hVar.mo38928k();
        }
    }

    public ASCameraView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final C20807a getAttrsHelper() {
        return (C20807a) this.f56150k.getValue();
    }

    public final String getBeautyFaceRes() {
        return this.f56156q;
    }

    public final C20707b getCameraController() {
        return (C20707b) this.f56147h.getValue();
    }

    public final C20711b getCameraViewHelper$tools_asve_release() {
        return (C20711b) this.f56152m.getValue();
    }

    public final Runnable getDataSourceVideoCompleteListener() {
        return this.f56155p;
    }

    public final C20749b getEffectController() {
        return (C20749b) this.f56146g.getValue();
    }

    public final String getFaceMakeUpRes() {
        return this.f56158s;
    }

    public final C20813g getGestureDispatcher() {
        return (C20813g) this.f56154o.getValue();
    }

    public final C20676a getMediaController() {
        return (C20676a) this.f56148i.getValue();
    }

    public final Mode getMode() {
        return this.f56149j;
    }

    public final C20784b getReactionViewHelper$tools_asve_release() {
        return (C20784b) this.f56153n.getValue();
    }

    public final String getReshapeRes() {
        return this.f56157r;
    }

    public final C20808b getTouchHelper() {
        return (C20808b) this.f56151l.getValue();
    }

    /* renamed from: a */
    public final void mo56221a(C15432h hVar) {
        C7573i.m23587b(hVar, "recorderContext");
        m69417b(hVar);
        m69418c(m69419d(hVar));
    }

    /* renamed from: a */
    public final void mo56223a(C45362d dVar, String str) {
        C7573i.m23587b(dVar, "resManager");
        C7573i.m23587b(str, "workSpacePath");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55843a(dVar, str);
    }

    /* renamed from: a */
    public final void mo56227a(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55848b(bVar);
    }

    /* renamed from: a */
    public final void mo56220a(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55842a(bVar);
    }

    /* renamed from: b */
    public final void mo56239b(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55848b(bVar);
    }

    /* renamed from: a */
    public final boolean mo56231a(int i, int i2, float f, float[] fArr) {
        C7573i.m23587b(fArr, "points");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55943a(i, i2, f, fArr);
    }

    /* renamed from: a */
    public final boolean mo56230a(float f) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55950b(f);
    }

    /* renamed from: b */
    public final boolean mo56240b(float f) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55954c(f);
    }

    /* renamed from: a */
    public final void mo56222a(C20713c cVar) {
        C7573i.m23587b(cVar, "zoomListener");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55936a(cVar);
    }

    /* renamed from: a */
    public final void mo56228a(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55948b(z);
    }

    /* renamed from: b */
    public final boolean mo56241b(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55962i().mo56027c(z);
    }

    /* renamed from: a */
    public final void mo56216a(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55909b(surface, str, bVar);
    }

    /* renamed from: a */
    public final void mo56226a(String str, long j, long j2) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55900a(str, j, j2);
    }

    /* renamed from: a */
    public final void mo56217a(OnARTextContentCallback onARTextContentCallback) {
        C7573i.m23587b(onARTextContentCallback, "callback");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56054a(onARTextContentCallback);
    }

    /* renamed from: a */
    public final void mo56225a(String str, int i, int i2, String str2) {
        C7573i.m23587b(str2, "arg3");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56063a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final void mo56218a(OnARTextCountCallback onARTextCountCallback) {
        C7573i.m23587b(onARTextCountCallback, "callback");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56055a(onARTextCountCallback);
    }

    /* renamed from: a */
    public final void mo56229a(String[] strArr, double[] dArr, boolean[] zArr) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56075a(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo56219a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C7573i.m23587b(onCherEffectParmaCallback, "callback");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56056a(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo56224a(String str) {
        C7573i.m23587b(str, "language");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56087b(str);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m69420q();
    }

    public final C0043i getLifecycleOwner() {
        C0043i iVar = this.f56141b;
        if (iVar == null) {
            C7573i.m23583a("lifecycleOwner");
        }
        return iVar;
    }

    public final View getPresentView() {
        View view = this.f56142c;
        if (view == null) {
            C7573i.m23583a("presentView");
        }
        return view;
    }

    /* renamed from: c */
    public final void mo56242c() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55965l();
    }

    /* renamed from: d */
    public final void mo56246d() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55980w();
    }

    public final int getBackCameraPos() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55962i().mo56026c();
    }

    public final int getCameraPosition() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55955d();
    }

    public final int getCameraPreviewHeight() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55959f();
    }

    public final int getCameraPreviewWidth() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55957e();
    }

    public final List<Integer> getCameraZoomList() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55963j();
    }

    public final int getCurrentCameraType() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55951c();
    }

    public final long getEndFrameTimeUS() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55851e().mo55919g();
    }

    public final int getFlashMode() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55968o();
    }

    public final int getFrontCameraPos() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55962i().mo56028d();
    }

    public final float getMaxCameraZoom() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55960g();
    }

    public final int getNextFlashMode() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55973p();
    }

    public final int[] getReactionCameraPosInViewPixel() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55852f().mo56160d();
    }

    public final int[] getReactionPosMarginInViewPixel() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55852f().mo56159c();
    }

    public final ReactionWindowInfo getReactionWindowInfo() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55852f().mo56162f();
    }

    public final int getWideStatus() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55962i().mo56019a();
    }

    /* renamed from: h */
    public final void mo56286h() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55964k();
    }

    /* renamed from: i */
    public final void mo56288i() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55977t();
    }

    /* renamed from: j */
    public final void mo56290j() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55962i().mo56021a((C19662d) null);
    }

    /* renamed from: k */
    public final boolean mo56291k() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55962i().mo56029e();
    }

    /* renamed from: l */
    public final void mo56292l() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55916e();
    }

    /* renamed from: m */
    public final void mo56293m() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55914d();
    }

    /* renamed from: n */
    public final void mo56294n() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55922j();
    }

    /* renamed from: o */
    public final boolean mo56295o() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55851e().mo55920h();
    }

    /* renamed from: p */
    public final void mo56299p() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55921i();
    }

    /* renamed from: a */
    public final void mo56209a() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55840a();
    }

    /* renamed from: e */
    public final boolean mo56251e() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55978u();
    }

    /* renamed from: f */
    public final boolean mo56253f() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55979v();
    }

    /* renamed from: g */
    public final boolean mo56255g() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55967n();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        m69420q();
        if (this.f56145f == null && this.f56144e == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View view = this.f56145f;
            if (view == null) {
                view = this.f56144e;
            }
            View view2 = view;
            if (view2 != null) {
                this.f56142c = view2;
                return;
            }
            throw new IllegalStateException("no present view!");
        }
        throw new IllegalStateException("ASCameraView must contain one SurfaceView or TextureView at least!".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m69420q() {
        /*
            r6 = this;
            android.view.TextureView r0 = r6.f56145f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
            if (r0 <= 0) goto L_0x0020
            int r0 = r6.getChildCount()
            r3 = 0
        L_0x0012:
            if (r3 >= r0) goto L_0x0020
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof android.view.TextureView
            if (r5 == 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0020:
            r4 = r1
        L_0x0021:
            android.view.TextureView r4 = (android.view.TextureView) r4
            r6.f56145f = r4
            android.view.TextureView r0 = r6.f56145f
            if (r0 == 0) goto L_0x002a
            return
        L_0x002a:
            android.view.SurfaceView r0 = r6.f56144e
            if (r0 == 0) goto L_0x002f
            return
        L_0x002f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L_0x0048
            int r0 = r6.getChildCount()
        L_0x0039:
            if (r2 >= r0) goto L_0x0048
            android.view.View r3 = r6.getChildAt(r2)
            boolean r4 = r3 instanceof android.view.SurfaceView
            if (r4 == 0) goto L_0x0045
            r1 = r3
            goto L_0x0048
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0048:
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            r6.f56144e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.recorder.view.ASCameraView.m69420q():void");
    }

    /* renamed from: b */
    public final void mo56234b() {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55966m();
    }

    /* renamed from: d */
    private final C15432h m69419d(C15432h hVar) {
        return new C20804j(this, hVar);
    }

    public final void setBeautyFaceRes(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f56156q = str;
    }

    public final void setFaceMakeUpRes(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f56158s = str;
    }

    public final void setLifecycleOwner(C0043i iVar) {
        C7573i.m23587b(iVar, "<set-?>");
        this.f56141b = iVar;
    }

    public final void setReshapeRes(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f56157r = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ ASRecorder m69416a(ASCameraView aSCameraView) {
        ASRecorder aSRecorder = aSCameraView.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        getTouchHelper().mo55997a(motionEvent);
        return true;
    }

    public final void setOnFrameAvailableListener(C45393e eVar) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55844a(eVar);
    }

    /* renamed from: b */
    private final void m69417b(C15432h hVar) {
        boolean z;
        if (this.f56141b != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("must set lifecycleOwner before start".toString());
        }
    }

    /* renamed from: e */
    public final void mo56250e(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56106d(true);
    }

    /* renamed from: f */
    public final void mo56252f(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56098c(z);
    }

    /* renamed from: g */
    public final void mo56254g(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56122i(z);
    }

    public final void setBeautyFaceWhiteIntensity(float f) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56081b(f);
    }

    public final void setBodyBeautyLevel(int i) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55930a(i);
    }

    public final void setCameraPreviewSizeInterface(C19761a aVar) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55935a(aVar);
    }

    public final void setDataSourceVideoCompleteListener(Runnable runnable) {
        if (this.f56143d != null) {
            ASRecorder aSRecorder = this.f56143d;
            if (aSRecorder == null) {
                C7573i.m23583a("recorder");
            }
            aSRecorder.mo55849c().mo55874a(runnable);
        }
    }

    public final void setDetectInterval(int i) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56095c(i);
    }

    public final void setDetectionMode(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56071a(z);
    }

    public final void setFilter(String str) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56118g(str);
    }

    public final void setHandDetectLowpower(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56090b(z);
    }

    public final void setMusicPath(String str) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55898a(str);
    }

    public final void setNextCameraMode(int i) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55952c(i);
    }

    public final void setOnFirstFrameRefreshListener(C19672a aVar) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55934a(aVar);
    }

    public final void setPreviewSizeRatio(float f) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55892a(f);
    }

    public final void setVideoQuality(int i) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55894a(i);
    }

    /* renamed from: c */
    private final void m69418c(C15432h hVar) {
        SurfaceTextureListener surfaceTextureListener;
        C0043i iVar = this.f56141b;
        if (iVar == null) {
            C7573i.m23583a("lifecycleOwner");
        }
        ASRecorder a = C20656a.m68462a(iVar, hVar);
        this.f56143d = a;
        TextureView textureView = this.f56145f;
        if (textureView != null) {
            surfaceTextureListener = textureView.getSurfaceTextureListener();
        } else {
            surfaceTextureListener = null;
        }
        TextureView textureView2 = this.f56145f;
        if (textureView2 != null) {
            textureView2.setSurfaceTextureListener(new C20798f(surfaceTextureListener, a));
        }
    }

    /* renamed from: d */
    public final void mo56247d(float f) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55852f().mo56155a(f);
    }

    /* renamed from: h */
    public final void mo56287h(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56119g(z);
    }

    /* renamed from: i */
    public final void mo56289i(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56116f(z);
    }

    /* renamed from: c */
    public final void mo56243c(C7562b<? super Integer, C7581n> bVar) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55910b(bVar);
    }

    /* renamed from: d */
    public final void mo56248d(C7562b<? super Integer, C7581n> bVar) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55903a(bVar);
    }

    /* renamed from: a */
    public final void mo56211a(int i) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55944b(i);
    }

    /* renamed from: c */
    public final boolean mo56244c(float f) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55846b().mo55942a(0.0f);
    }

    /* renamed from: d */
    public final void mo56249d(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55913c(z);
    }

    /* renamed from: c */
    public final boolean mo56245c(boolean z) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55851e().mo55911b(z);
    }

    /* renamed from: b */
    public final void mo56237b(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55847b(bVar);
    }

    /* renamed from: a */
    public final void mo56215a(Surface surface) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55895a(surface);
    }

    /* renamed from: b */
    public final void mo56238b(C20713c cVar) {
        C7573i.m23587b(cVar, "zoomListener");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55947b(cVar);
    }

    /* renamed from: a */
    public final void mo56212a(int i, int i2) {
        getCameraViewHelper$tools_asve_release().mo56006a(i, i2);
    }

    /* renamed from: a */
    public final int mo56208a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55851e().mo55885a(context, audioRecorderInterface);
    }

    /* renamed from: b */
    public final int mo56233b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        return aSRecorder.mo55851e().mo55905b(context, audioRecorderInterface);
    }

    /* renamed from: b */
    public final void mo56235b(int i, C19662d dVar) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55931a(i, dVar);
    }

    /* renamed from: a */
    public final void mo56214a(int i, C19662d dVar) {
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55846b().mo55945b(i, dVar);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        m69420q();
    }

    public ASCameraView(Context context, AttributeSet attributeSet, int i) {
        Mode mode;
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f56146g = C7546e.m23569a(new C20796d(this));
        this.f56147h = C7546e.m23569a(new C20794b(this));
        this.f56148i = C7546e.m23569a(new C20801g(this));
        if (this.f56143d != null) {
            ASRecorder aSRecorder = this.f56143d;
            if (aSRecorder == null) {
                C7573i.m23583a("recorder");
            }
            mode = aSRecorder.f55790a;
        } else {
            mode = Mode.CUSTOM;
        }
        this.f56149j = mode;
        this.f56150k = C7546e.m23569a(new C20793a(context));
        this.f56151l = C7546e.m23569a(new C20803i(this, context));
        this.f56152m = C7546e.m23569a(new C20795c(this, context));
        this.f56153n = C7546e.m23569a(new C20802h(this));
        getAttrsHelper().mo56322a(attributeSet);
        this.f56154o = C7546e.m23569a(new C20797e(this));
        this.f56156q = "";
        this.f56157r = "";
        this.f56158s = "";
    }

    /* renamed from: b */
    public final void mo56236b(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55896a(surface, str, bVar);
    }

    /* renamed from: a */
    public final void mo56213a(int i, long j, long j2, String str) {
        C7573i.m23587b(str, "msg");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55850d().mo56048a(i, j, 0, str);
    }

    private /* synthetic */ ASCameraView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }

    /* renamed from: a */
    public final void mo56210a(double d, boolean z, float f, int i, int i2, boolean z2, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        ASRecorder aSRecorder = this.f56143d;
        if (aSRecorder == null) {
            C7573i.m23583a("recorder");
        }
        aSRecorder.mo55851e().mo55891a(d, z, f, i, i2, false, bVar);
    }
}

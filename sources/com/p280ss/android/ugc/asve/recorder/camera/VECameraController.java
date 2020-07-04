package com.p280ss.android.ugc.asve.recorder.camera;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.C19667g.C19672a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.ttvecamera.C20632i.C20634b;
import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.context.C15422c;
import com.p280ss.android.ugc.asve.p756d.C15441a;
import com.p280ss.android.ugc.asve.p756d.C15455i;
import com.p280ss.android.ugc.asve.recorder.C20689c;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20719d;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20726i;
import com.p280ss.android.vesdk.C45323k;
import com.p280ss.android.vesdk.C45382z;
import com.p280ss.android.vesdk.C45382z.C45396g;
import com.p280ss.android.vesdk.C45382z.C45402m;
import com.p280ss.android.vesdk.VECameraSettings;
import com.p280ss.android.vesdk.VECameraSettings.C45180a;
import com.p280ss.android.vesdk.VEListener.C45211g;
import com.p280ss.android.vesdk.VEPreviewRadio;
import com.p280ss.android.vesdk.VESize;
import com.p280ss.android.vesdk.p1773a.C45249b;
import com.p280ss.android.vesdk.utils.C45375b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
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

/* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController */
public final class VECameraController implements C0042h, C20707b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f55854a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VECameraController.class), "wideCameraComponent", "getWideCameraComponent()Lcom/ss/android/ugc/asve/recorder/camera/widecamera/IWideCamera;"))};

    /* renamed from: A */
    private boolean f55855A;

    /* renamed from: B */
    private boolean f55856B;

    /* renamed from: C */
    private final C7541d f55857C = C7546e.m23569a(new C20702g(this));

    /* renamed from: D */
    private boolean f55858D = true;

    /* renamed from: E */
    private final List<Integer> f55859E = new ArrayList();

    /* renamed from: F */
    private final SparseIntArray f55860F;

    /* renamed from: G */
    private boolean f55861G;

    /* renamed from: H */
    private final C45382z f55862H;

    /* renamed from: I */
    private final C20689c f55863I;

    /* renamed from: J */
    private final C15422c f55864J;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C19629a> f55865b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final CopyOnWriteArrayList<C19672a> f55866c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public final CopyOnWriteArrayList<C19662d> f55867d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public boolean f55868e;

    /* renamed from: f */
    public int f55869f = -1;

    /* renamed from: g */
    public final C45323k f55870g = new C45323k();

    /* renamed from: h */
    public VECameraSettings f55871h = C15441a.m45219a(this.f55864J);

    /* renamed from: i */
    public float f55872i = -1.0f;

    /* renamed from: j */
    public float f55873j;

    /* renamed from: k */
    public float f55874k;

    /* renamed from: l */
    public final List<C20713c> f55875l = new ArrayList();

    /* renamed from: m */
    public C45402m f55876m;

    /* renamed from: n */
    public int f55877n;

    /* renamed from: o */
    public final Context f55878o;

    /* renamed from: p */
    public final C0043i f55879p;

    /* renamed from: q */
    private final boolean f55880q = true;

    /* renamed from: r */
    private C19629a f55881r;

    /* renamed from: s */
    private C19672a f55882s;

    /* renamed from: t */
    private C19761a f55883t;

    /* renamed from: u */
    private final int[] f55884u = {720, 1280};

    /* renamed from: v */
    private final int f55885v = 720;

    /* renamed from: w */
    private final int f55886w = 1280;

    /* renamed from: x */
    private final Object f55887x = new Object();

    /* renamed from: y */
    private boolean f55888y;

    /* renamed from: z */
    private boolean f55889z;

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$a */
    static final class C20691a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ VECameraController f55891a;

        /* renamed from: b */
        final /* synthetic */ C20713c f55892b;

        C20691a(VECameraController vECameraController, C20713c cVar) {
            this.f55891a = vECameraController;
            this.f55892b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m68720a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m68720a() {
            this.f55891a.f55875l.add(this.f55892b);
            if (this.f55891a.mo55960g() > 0.0f && this.f55891a.mo55951c() > 0 && this.f55891a.f55868e) {
                this.f55892b.mo56009a(this.f55891a.mo55951c(), true, this.f55891a.mo55961h(), this.f55891a.mo55960g(), this.f55891a.mo55963j());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$b */
    public static final class C20692b implements C19662d {

        /* renamed from: a */
        final /* synthetic */ VECameraController f55893a;

        /* renamed from: b */
        final /* synthetic */ C19662d f55894b;

        /* renamed from: a */
        public final void mo52271a(int i) {
            this.f55893a.mo55946b((C19662d) this);
            C19662d dVar = this.f55894b;
            if (dVar != null) {
                dVar.mo52271a(i);
            }
        }

        C20692b(VECameraController vECameraController, C19662d dVar) {
            this.f55893a = vECameraController;
            this.f55894b = dVar;
        }

        /* renamed from: a */
        public final void mo52272a(int i, int i2, String str) {
            this.f55893a.mo55946b((C19662d) this);
            C19662d dVar = this.f55894b;
            if (dVar != null) {
                dVar.mo52272a(i, i2, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$c */
    public static final class C20693c implements C19662d {

        /* renamed from: a */
        final /* synthetic */ VECameraController f55895a;

        /* renamed from: b */
        final /* synthetic */ C19662d f55896b;

        /* renamed from: a */
        public final void mo52271a(int i) {
            C19662d dVar = this.f55896b;
            if (dVar != null) {
                dVar.mo52271a(i);
            }
            this.f55895a.mo55946b((C19662d) this);
        }

        C20693c(VECameraController vECameraController, C19662d dVar) {
            this.f55895a = vECameraController;
            this.f55896b = dVar;
        }

        /* renamed from: a */
        public final void mo52272a(int i, int i2, String str) {
            C19662d dVar = this.f55896b;
            if (dVar != null) {
                dVar.mo52272a(i, i2, str);
            }
            this.f55895a.mo55946b((C19662d) this);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$d */
    public static final class C20694d implements C45396g {

        /* renamed from: a */
        final /* synthetic */ VECameraController f55897a;

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$d$a */
        static final class C20695a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C20694d f55898a;

            /* renamed from: b */
            final /* synthetic */ int f55899b;

            /* renamed from: c */
            final /* synthetic */ float f55900c;

            /* renamed from: d */
            final /* synthetic */ boolean f55901d;

            C20695a(C20694d dVar, int i, float f, boolean z) {
                this.f55898a = dVar;
                this.f55899b = i;
                this.f55900c = f;
                this.f55901d = z;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m68728a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68728a() {
                for (C20713c a : this.f55898a.f55897a.f55875l) {
                    a.mo56008a(this.f55899b, this.f55900c, this.f55901d);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$d$b */
        static final class C20696b extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C20694d f55902a;

            /* renamed from: b */
            final /* synthetic */ float f55903b;

            /* renamed from: c */
            final /* synthetic */ List f55904c;

            /* renamed from: d */
            final /* synthetic */ int f55905d;

            /* renamed from: e */
            final /* synthetic */ boolean f55906e;

            /* renamed from: f */
            final /* synthetic */ boolean f55907f;

            C20696b(C20694d dVar, float f, List list, int i, boolean z, boolean z2) {
                this.f55902a = dVar;
                this.f55903b = f;
                this.f55904c = list;
                this.f55905d = i;
                this.f55906e = z;
                this.f55907f = z2;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m68729a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68729a() {
                this.f55902a.f55897a.f55872i = this.f55903b;
                this.f55902a.f55897a.mo55963j().clear();
                List list = this.f55904c;
                if (list != null) {
                    this.f55902a.f55897a.mo55963j().addAll(list);
                }
                for (C20713c a : this.f55902a.f55897a.f55875l) {
                    a.mo56009a(this.f55905d, this.f55906e, this.f55907f, this.f55903b, this.f55904c);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo55985a() {
            return this.f55897a.mo55961h();
        }

        C20694d(VECameraController vECameraController) {
            this.f55897a = vECameraController;
        }

        /* renamed from: a */
        public final void mo55983a(int i, float f, boolean z) {
            C15455i.m45262a(new C20695a(this, i, f, z));
        }

        /* renamed from: a */
        public final void mo55984a(int i, boolean z, boolean z2, float f, List<Integer> list) {
            C20696b bVar = new C20696b(this, f, list, i, z, z2);
            C15455i.m45262a(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$e */
    public static final class C20697e implements C45211g {

        /* renamed from: a */
        public int f55908a = -9999;

        /* renamed from: b */
        public String f55909b = "";

        /* renamed from: c */
        final /* synthetic */ VECameraController f55910c;

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$e$a */
        static final class C20698a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C20697e f55911a;

            /* renamed from: b */
            final /* synthetic */ int f55912b;

            C20698a(C20697e eVar, int i) {
                this.f55911a = eVar;
                this.f55912b = i;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m68734a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68734a() {
                this.f55911a.f55910c.f55868e = false;
                this.f55911a.f55910c.f55869f = -1;
                this.f55911a.f55910c.f55873j = 0.0f;
                this.f55911a.f55910c.f55874k = 0.0f;
                for (C19662d a : this.f55911a.f55910c.f55867d) {
                    a.mo52272a(this.f55912b, this.f55911a.f55908a, this.f55911a.f55909b);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$e$b */
        static final class C20699b extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C20697e f55913a;

            /* renamed from: b */
            final /* synthetic */ int f55914b;

            /* renamed from: c */
            final /* synthetic */ int f55915c;

            C20699b(C20697e eVar, int i, int i2) {
                this.f55913a = eVar;
                this.f55914b = i;
                this.f55915c = i2;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m68735a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68735a() {
                int i = this.f55914b;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            this.f55913a.f55910c.f55868e = true;
                            this.f55913a.f55910c.f55869f = this.f55915c;
                            this.f55913a.f55910c.f55873j = 0.0f;
                            this.f55913a.f55910c.f55874k = 0.0f;
                            this.f55913a.f55910c.f55870g.mo108509h();
                            this.f55913a.f55910c.mo55962i().mo56020a(this.f55913a.f55910c.mo55951c());
                            for (C19662d a : this.f55913a.f55910c.f55867d) {
                                a.mo52271a(this.f55913a.f55910c.mo55951c());
                            }
                            this.f55913a.f55910c.f55870g.mo108506a((C45402m) new C45402m(this) {

                                /* renamed from: a */
                                final /* synthetic */ C20699b f55916a;

                                {
                                    this.f55916a = r1;
                                }

                                /* renamed from: a */
                                public final void mo55990a(int i, float f) {
                                    C45402m mVar = this.f55916a.f55913a.f55910c.f55876m;
                                    if (mVar != null) {
                                        mVar.mo55990a(i, f);
                                    }
                                }
                            });
                            break;
                        case 3:
                            for (C19672a a2 : this.f55913a.f55910c.f55866c) {
                                a2.mo52343a();
                            }
                            return;
                    }
                    return;
                }
                for (C19629a a3 : this.f55913a.f55910c.f55865b) {
                    a3.mo52246a();
                }
            }
        }

        /* renamed from: a */
        public final void mo55986a() {
            this.f55910c.mo55976s();
        }

        C20697e(VECameraController vECameraController) {
            this.f55910c = vECameraController;
        }

        /* renamed from: a */
        public final void mo55987a(int i) {
            C15455i.m45262a(new C20698a(this, i));
        }

        /* renamed from: a */
        public final void mo55989a(int i, String str) {
            this.f55908a = i;
            if (str != null) {
                this.f55909b = str;
            }
        }

        /* renamed from: a */
        public final void mo55988a(int i, int i2, String str) {
            C15455i.m45262a(new C20699b(this, i, i2));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$f */
    static final class C20701f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ VECameraController f55917a;

        /* renamed from: b */
        final /* synthetic */ C20713c f55918b;

        C20701f(VECameraController vECameraController, C20713c cVar) {
            this.f55917a = vECameraController;
            this.f55918b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m68737a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m68737a() {
            this.f55917a.f55875l.remove(this.f55918b);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$g */
    static final class C20702g extends Lambda implements C7561a<C20726i> {

        /* renamed from: a */
        final /* synthetic */ VECameraController f55919a;

        C20702g(VECameraController vECameraController) {
            this.f55919a = vECameraController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20726i invoke() {
            return new C20726i(this.f55919a.f55878o, this.f55919a);
        }
    }

    /* renamed from: a */
    public final void mo55928a() {
        m68665A();
    }

    /* renamed from: b */
    public final boolean mo55949b() {
        return this.f55880q;
    }

    /* renamed from: c */
    public final int mo55951c() {
        return this.f55869f;
    }

    /* renamed from: e */
    public final int mo55957e() {
        return this.f55885v;
    }

    /* renamed from: f */
    public final int mo55959f() {
        return this.f55886w;
    }

    /* renamed from: g */
    public final float mo55960g() {
        return this.f55872i;
    }

    /* renamed from: h */
    public final boolean mo55961h() {
        return this.f55856B;
    }

    /* renamed from: i */
    public final C20719d mo55962i() {
        return (C20719d) this.f55857C.getValue();
    }

    /* renamed from: j */
    public final List<Integer> mo55963j() {
        return this.f55859E;
    }

    /* renamed from: m */
    public final void mo55966m() {
    }

    /* renamed from: n */
    public final boolean mo55967n() {
        return this.f55868e;
    }

    /* renamed from: o */
    public final int mo55968o() {
        return this.f55877n;
    }

    /* renamed from: t */
    public final void mo55977t() {
        m68665A();
    }

    /* renamed from: a */
    public final void mo55940a(boolean z) {
        this.f55856B = z;
    }

    /* renamed from: a */
    public final void mo55941a(float[] fArr, double d) {
        C7573i.m23587b(fArr, "quaternion");
        this.f55862H.mo108680a(fArr, d);
    }

    /* renamed from: a */
    public final void mo55938a(C45402m mVar) {
        this.f55876m = mVar;
        this.f55870g.mo108506a(mVar);
    }

    /* renamed from: a */
    public final boolean mo55943a(int i, int i2, float f, float[] fArr) {
        C7573i.m23587b(fArr, "points");
        if (fArr.length < 2) {
            return false;
        }
        if (this.f55870g.mo108498a(i, i2, f, (int) fArr[0], (int) fArr[1]) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo55939a(C7562b<? super float[], C7581n> bVar) {
        C7573i.m23587b(bVar, "action");
        this.f55870g.mo108507a((C20634b) new C20731e(bVar));
    }

    /* renamed from: a */
    public final boolean mo55942a(float f) {
        if (!mo55978u()) {
            return false;
        }
        C15382b bVar = C15382b.f39669a;
        StringBuilder sb = new StringBuilder("ZOOM startZoom newZoom = ");
        sb.append(f);
        sb.append(", currentZoom = ");
        sb.append(this.f55874k);
        bVar.mo38743d(sb.toString());
        float a = mo55962i().mo56018a(mo55960g(), mo55955d());
        float b = mo55962i().mo56023b(0.0f, mo55955d());
        float max = Math.max(Math.min(mo55960g(), f), 0.0f);
        if (max < b || max > a) {
            return false;
        }
        this.f55870g.mo108497a(max);
        this.f55874k = max;
        return true;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.f55868e) {
            m68665A();
        }
    }

    /* renamed from: q */
    public final void mo55974q() {
        mo55944b(mo55973p());
    }

    /* renamed from: r */
    public final boolean mo55975r() {
        return this.f55870g.mo108508g();
    }

    /* renamed from: z */
    private final void m68667z() {
        synchronized (this.f55887x) {
            this.f55855A = false;
            this.f55870g.mo108190d();
        }
    }

    /* renamed from: d */
    public final int mo55955d() {
        return this.f55871h.f116130j.ordinal();
    }

    /* renamed from: p */
    public final int mo55973p() {
        return this.f55860F.get(mo55968o());
    }

    /* renamed from: A */
    private final void m68665A() {
        m68667z();
        this.f55870g.mo108191e();
        this.f55870g.mo108504a((C45211g) null);
        this.f55870g.mo108505a((C45396g) null);
        this.f55867d.clear();
        this.f55868e = false;
        this.f55869f = -1;
    }

    /* renamed from: l */
    public final void mo55965l() {
        if (!this.f55864J.mo38915f()) {
            m68665A();
            return;
        }
        throw new IllegalAccessError("自动启停模式下无法手动关闭摄像头");
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
        if (this.f55864J.mo38915f() && !this.f55861G) {
            this.f55861G = true;
            m68666c(this.f55871h.f116130j.ordinal(), null);
        }
    }

    @C0054q(mo125a = Event.ON_START)
    public final void onResume() {
        if (this.f55864J.mo38915f() && !this.f55861G) {
            this.f55861G = true;
            m68666c(this.f55871h.f116130j.ordinal(), null);
        }
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void onStop() {
        if (this.f55864J.mo38915f() && this.f55861G) {
            this.f55861G = false;
            m68665A();
        }
    }

    /* renamed from: u */
    public final boolean mo55978u() {
        if (mo55960g() != -1.0f && !mo55963j().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void mo55980w() {
        C15382b bVar = C15382b.f39669a;
        StringBuilder sb = new StringBuilder("ZOOM [");
        sb.append(System.identityHashCode(this));
        sb.append("] scaleEnd");
        bVar.mo38742c(sb.toString());
        this.f55873j = 0.0f;
    }

    /* renamed from: x */
    public final void mo55981x() {
        synchronized (this.f55887x) {
            boolean z = true;
            this.f55888y = true;
            if (this.f55855A) {
                this.f55862H.mo108661a((C45249b) this.f55870g);
            } else {
                z = false;
            }
            this.f55889z = z;
        }
    }

    /* renamed from: y */
    public final void mo55982y() {
        synchronized (this.f55887x) {
            this.f55888y = false;
            if (this.f55889z) {
                this.f55862H.mo108734l();
                this.f55889z = false;
            }
        }
    }

    /* renamed from: k */
    public final int mo55964k() {
        int i;
        boolean z = true;
        if (mo55955d() != 1) {
            z = false;
        }
        if (z) {
            i = mo55962i().mo56026c();
        } else {
            i = mo55962i().mo56028d();
        }
        mo55931a(i, (C19662d) null);
        return i;
    }

    /* renamed from: s */
    public final void mo55976s() {
        C19761a aVar = this.f55883t;
        if (aVar != null) {
            aVar.mo52872b(mo55957e(), mo55959f());
        }
        synchronized (this.f55887x) {
            this.f55855A = true;
            if (this.f55888y) {
                if (this.f55889z) {
                    this.f55870g.mo108189c();
                } else {
                    this.f55889z = true;
                    this.f55862H.mo108661a((C45249b) this.f55870g);
                }
            }
        }
    }

    /* renamed from: v */
    public final boolean mo55979v() {
        boolean z;
        if (!mo55978u()) {
            return false;
        }
        if (this.f55858D) {
            C20719d i = mo55962i();
            if (mo55955d() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i.mo56025b(z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void mo55956d(boolean z) {
        this.f55858D = z;
    }

    /* renamed from: e */
    public final void mo55958e(boolean z) {
        this.f55862H.mo108725g(z);
    }

    /* renamed from: a */
    public final void mo55930a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("body_beauty_level", i);
        this.f55870g.mo108503a(bundle);
    }

    /* renamed from: b */
    public final void mo55944b(int i) {
        this.f55870g.mo108500a(C20732f.m68910c(i));
        this.f55877n = i;
    }

    /* renamed from: a */
    public final void mo55932a(C19629a aVar) {
        synchronized (this.f55865b) {
            C19629a aVar2 = this.f55881r;
            if (aVar2 != null) {
                this.f55865b.remove(aVar2);
            }
            if (aVar != null) {
                this.f55865b.add(aVar);
            }
            this.f55881r = aVar;
        }
    }

    /* renamed from: c */
    public final void mo55952c(int i) {
        if (i == 0) {
            C45180a aVar = new C45180a(this.f55871h);
            aVar.mo107819a(0);
            aVar.mo107826b(2);
            VECameraSettings vECameraSettings = aVar.f116145a;
            C7573i.m23582a((Object) vECameraSettings, "VECameraSettings.Builder…                 .build()");
            this.f55871h = vECameraSettings;
        }
    }

    /* renamed from: b */
    public final void mo55946b(C19662d dVar) {
        C7573i.m23587b(dVar, "cameraOpenListener");
        this.f55867d.remove(dVar);
    }

    /* renamed from: a */
    public final void mo55933a(C19662d dVar) {
        C7573i.m23587b(dVar, "cameraOpenListener");
        this.f55867d.add(dVar);
    }

    /* renamed from: b */
    public final void mo55947b(C20713c cVar) {
        C7573i.m23587b(cVar, "zoomListener");
        C15455i.m45262a(new C20701f(this, cVar));
    }

    /* renamed from: c */
    public final void mo55953c(boolean z) {
        C45180a aVar = new C45180a(this.f55871h);
        aVar.mo107825a(z);
        aVar.mo107826b(2);
        VECameraSettings vECameraSettings = aVar.f116145a;
        C7573i.m23582a((Object) vECameraSettings, "VECameraSettings.Builder…\n                .build()");
        this.f55871h = vECameraSettings;
    }

    /* renamed from: a */
    public final void mo55934a(C19672a aVar) {
        synchronized (this.f55866c) {
            C19672a aVar2 = this.f55882s;
            if (aVar2 != null) {
                this.f55866c.remove(aVar2);
            }
            if (aVar != null) {
                this.f55866c.add(aVar);
            }
            this.f55882s = aVar;
        }
    }

    /* renamed from: b */
    public final void mo55948b(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_body_beauty", z);
        this.f55870g.mo108503a(bundle);
    }

    /* renamed from: c */
    public final boolean mo55954c(float f) {
        if (!mo55978u() || !mo55979v()) {
            return false;
        }
        C15382b bVar = C15382b.f39669a;
        StringBuilder sb = new StringBuilder("ZOOM [");
        sb.append(System.identityHashCode(this));
        sb.append("] scaleCameraByRatio ratio = ");
        sb.append(f);
        bVar.mo38742c(sb.toString());
        if (((double) f) <= 0.05d) {
            f /= 4.0f;
        }
        float max = Math.max(0.0f, ((f - this.f55873j) * mo55960g()) + this.f55874k);
        this.f55873j = f;
        return mo55942a(max);
    }

    /* renamed from: a */
    public final void mo55935a(C19761a aVar) {
        this.f55883t = aVar;
    }

    /* renamed from: b */
    public final boolean mo55950b(float f) {
        if (!mo55978u() || !mo55979v()) {
            return false;
        }
        C15382b bVar = C15382b.f39669a;
        StringBuilder sb = new StringBuilder("ZOOM scaleCamera distanceDelta = ");
        sb.append(f);
        bVar.mo38742c(sb.toString());
        return mo55942a(Math.max(0.0f, ((mo55960g() / 1000.0f) * f) + this.f55874k));
    }

    /* renamed from: a */
    public final void mo55936a(C20713c cVar) {
        C7573i.m23587b(cVar, "zoomListener");
        C15455i.m45262a(new C20691a(this, cVar));
    }

    /* renamed from: a */
    public final void mo55937a(VEPreviewRadio vEPreviewRadio) {
        boolean z;
        VESize vESize;
        C7573i.m23587b(vEPreviewRadio, "ratio");
        if (C45375b.m143418b(this.f55878o) >= 1080) {
            z = true;
        } else {
            z = false;
        }
        switch (C20730d.f55975a[vEPreviewRadio.ordinal()]) {
            case 1:
                if (!z) {
                    vESize = new VESize(720, 1280);
                    break;
                } else {
                    vESize = new VESize(1080, 1920);
                    break;
                }
            case 2:
            case 3:
            case 4:
                if (!z) {
                    vESize = new VESize(720, 960);
                    break;
                } else {
                    vESize = new VESize(1080, 1440);
                    break;
                }
            default:
                vESize = new VESize(720, 1280);
                break;
        }
        this.f55862H.mo108660a(vEPreviewRadio, vESize, null, null, 1, this.f55878o);
    }

    /* renamed from: b */
    public final void mo55945b(int i, C19662d dVar) {
        if (!this.f55864J.mo38915f()) {
            m68666c(i, dVar);
            return;
        }
        throw new IllegalAccessError("自动启停模式下无法手动开启摄像头");
    }

    /* renamed from: c */
    private final void m68666c(int i, C19662d dVar) {
        this.f55871h.f116130j = C20732f.m68908a(i);
        this.f55870g.mo108499a(this.f55878o.getApplicationContext(), this.f55871h);
        mo55933a((C19662d) new C20693c(this, dVar));
        this.f55870g.mo108505a((C45396g) new C20694d(this));
        this.f55870g.mo108504a((C45211g) new C20697e(this));
        this.f55870g.mo108188b();
    }

    /* renamed from: a */
    public final void mo55931a(int i, C19662d dVar) {
        mo55933a((C19662d) new C20692b(this, dVar));
        C45180a aVar = new C45180a(this.f55871h);
        aVar.mo107821a(C20732f.m68908a(i));
        aVar.mo107826b(2);
        VECameraSettings vECameraSettings = aVar.f116145a;
        C7573i.m23582a((Object) vECameraSettings, "VECameraSettings.Builder…\n                .build()");
        this.f55871h = vECameraSettings;
        this.f55870g.mo108501a(this.f55871h);
    }

    /* renamed from: a */
    public final void mo55929a(float f, float f2, float f3) {
        this.f55862H.mo108643a(f, f2, f3);
    }

    public VECameraController(Context context, C0043i iVar, C45382z zVar, C20689c cVar, C15422c cVar2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(zVar, "veRecorder");
        C7573i.m23587b(cVar, "recorder");
        C7573i.m23587b(cVar2, "cameraContext");
        this.f55878o = context;
        this.f55879p = iVar;
        this.f55862H = zVar;
        this.f55863I = cVar;
        this.f55864J = cVar2;
        C15455i.m45262a(new C7561a<C7581n>(this) {

            /* renamed from: a */
            final /* synthetic */ VECameraController f55890a;

            {
                this.f55890a = r1;
            }

            public final /* synthetic */ Object invoke() {
                m68719a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68719a() {
                C0043i iVar = this.f55890a.f55879p;
                if (iVar != null) {
                    Lifecycle lifecycle = iVar.getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.mo55a(this.f55890a);
                    }
                }
            }
        });
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        sparseIntArray.put(0, 2);
        sparseIntArray.put(2, 0);
        this.f55860F = sparseIntArray;
    }
}

package com.p280ss.android.ugc.asve.recorder;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.medialib.camera.C19667g.C19672a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19633e;
import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.medialib.presenter.C19762b;
import com.p280ss.android.medialib.presenter.C19763c;
import com.p280ss.android.medialib.presenter.C19764d;
import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.context.C15422c;
import com.p280ss.android.ugc.asve.p756d.C15441a;
import com.p280ss.android.ugc.asve.p756d.C15455i;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.camera.C20713c;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20719d;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20726i;
import com.p280ss.android.vesdk.C45382z.C45402m;
import com.p280ss.android.vesdk.VEPreviewRadio;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.asve.recorder.e */
public final class C20734e implements C20707b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f55977a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20734e.class), "wideCameraComponent", "getWideCameraComponent()Lcom/ss/android/ugc/asve/recorder/camera/widecamera/IWideCamera;"))};

    /* renamed from: b */
    public final C19667g f55978b = C19667g.m64797b();

    /* renamed from: c */
    public int f55979c = -1;

    /* renamed from: d */
    public int f55980d;

    /* renamed from: e */
    public final CopyOnWriteArrayList<C19662d> f55981e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    public float f55982f = -1.0f;

    /* renamed from: g */
    public final List<C20713c> f55983g = new ArrayList();

    /* renamed from: h */
    public int f55984h;

    /* renamed from: i */
    public final Context f55985i;

    /* renamed from: j */
    private final boolean f55986j;

    /* renamed from: k */
    private boolean f55987k;

    /* renamed from: l */
    private final C7541d f55988l = C7546e.m23569a(new C20744f(this));

    /* renamed from: m */
    private boolean f55989m = true;

    /* renamed from: n */
    private final List<Integer> f55990n = new ArrayList();

    /* renamed from: o */
    private float f55991o;

    /* renamed from: p */
    private float f55992p;

    /* renamed from: q */
    private final SparseIntArray f55993q;

    /* renamed from: r */
    private final C20689c f55994r;

    /* renamed from: s */
    private final C15422c f55995s;

    /* renamed from: t */
    private final C19764d f55996t;

    /* renamed from: com.ss.android.ugc.asve.recorder.e$a */
    public final class C20735a implements C19662d {

        /* renamed from: a */
        public final C19662d f55997a;

        /* renamed from: com.ss.android.ugc.asve.recorder.e$a$a */
        static final class C20736a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C20735a f55999a;

            /* renamed from: b */
            final /* synthetic */ int f56000b;

            /* renamed from: c */
            final /* synthetic */ int f56001c;

            /* renamed from: d */
            final /* synthetic */ String f56002d;

            C20736a(C20735a aVar, int i, int i2, String str) {
                this.f55999a = aVar;
                this.f56000b = i;
                this.f56001c = i2;
                this.f56002d = str;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m68970a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68970a() {
                C20734e.this.f55979c = -1;
                C20734e.this.f55982f = -1.0f;
                for (C19662d a : C20734e.this.f55981e) {
                    a.mo52272a(this.f56000b, this.f56001c, this.f56002d);
                }
                C19662d dVar = this.f55999a.f55997a;
                if (dVar != null) {
                    dVar.mo52272a(this.f56000b, this.f56001c, this.f56002d);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.e$a$b */
        static final class C20737b extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C20735a f56003a;

            /* renamed from: b */
            final /* synthetic */ int f56004b;

            C20737b(C20735a aVar, int i) {
                this.f56003a = aVar;
                this.f56004b = i;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m68971a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68971a() {
                C20734e.this.f55979c = this.f56004b;
                C20734e eVar = C20734e.this;
                C19667g gVar = C20734e.this.f55978b;
                C7573i.m23582a((Object) gVar, "iesCameraManager");
                eVar.f55982f = gVar.mo52334g();
                C20734e.this.mo56033s();
                for (C19662d a : C20734e.this.f55981e) {
                    a.mo52271a(this.f56004b);
                }
                C19662d dVar = this.f56003a.f55997a;
                if (dVar != null) {
                    dVar.mo52271a(this.f56004b);
                }
            }
        }

        /* renamed from: a */
        public final void mo52271a(int i) {
            C20734e.this.mo55962i().mo56020a(i);
            C15455i.m45262a(new C20737b(this, i));
        }

        public C20735a(C19662d dVar) {
            this.f55997a = dVar;
        }

        /* renamed from: a */
        public final void mo52272a(int i, int i2, String str) {
            C15455i.m45262a(new C20736a(this, i, i2, str));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.e$b */
    static final class C20738b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20734e f56005a;

        /* renamed from: b */
        final /* synthetic */ C20713c f56006b;

        C20738b(C20734e eVar, C20713c cVar) {
            this.f56005a = eVar;
            this.f56006b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m68972a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m68972a() {
            this.f56005a.f55983g.add(this.f56006b);
            if (this.f56005a.mo55960g() > 0.0f && this.f56005a.mo55951c() > 0) {
                this.f56006b.mo56009a(this.f56005a.mo55951c(), true, this.f56005a.mo55961h(), this.f56005a.mo55960g(), this.f56005a.mo55963j());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.e$c */
    static final class C20739c implements C19762b {

        /* renamed from: a */
        final /* synthetic */ C20734e f56007a;

        C20739c(C20734e eVar) {
            this.f56007a = eVar;
        }

        /* renamed from: i_ */
        public final void mo52873i_(int i) {
            this.f56007a.f55980d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.e$d */
    public static final class C20740d implements C19633e {

        /* renamed from: a */
        final /* synthetic */ C20734e f56008a;

        /* renamed from: com.ss.android.ugc.asve.recorder.e$d$a */
        static final class C20741a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C20740d f56009a;

            /* renamed from: b */
            final /* synthetic */ int f56010b;

            /* renamed from: c */
            final /* synthetic */ float f56011c;

            /* renamed from: d */
            final /* synthetic */ boolean f56012d;

            C20741a(C20740d dVar, int i, float f, boolean z) {
                this.f56009a = dVar;
                this.f56010b = i;
                this.f56011c = f;
                this.f56012d = z;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m68977a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68977a() {
                for (C20713c a : this.f56009a.f56008a.f55983g) {
                    a.mo56008a(this.f56010b, this.f56011c, this.f56012d);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.e$d$b */
        static final class C20742b extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C20740d f56013a;

            /* renamed from: b */
            final /* synthetic */ List f56014b;

            /* renamed from: c */
            final /* synthetic */ int f56015c;

            /* renamed from: d */
            final /* synthetic */ boolean f56016d;

            /* renamed from: e */
            final /* synthetic */ boolean f56017e;

            /* renamed from: f */
            final /* synthetic */ float f56018f;

            C20742b(C20740d dVar, List list, int i, boolean z, boolean z2, float f) {
                this.f56013a = dVar;
                this.f56014b = list;
                this.f56015c = i;
                this.f56016d = z;
                this.f56017e = z2;
                this.f56018f = f;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m68978a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m68978a() {
                this.f56013a.f56008a.mo55963j().clear();
                List list = this.f56014b;
                if (list != null) {
                    this.f56013a.f56008a.mo55963j().addAll(list);
                }
                for (C20713c a : this.f56013a.f56008a.f55983g) {
                    a.mo56009a(this.f56015c, this.f56016d, this.f56017e, this.f56018f, this.f56014b);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo52251a() {
            return this.f56008a.mo55961h();
        }

        C20740d(C20734e eVar) {
            this.f56008a = eVar;
        }

        /* renamed from: a */
        public final void mo52249a(int i, float f, boolean z) {
            C15455i.m45262a(new C20741a(this, i, f, z));
        }

        /* renamed from: a */
        public final void mo52250a(int i, boolean z, boolean z2, float f, List<Integer> list) {
            C20742b bVar = new C20742b(this, list, i, z, z2, f);
            C15455i.m45262a(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.e$e */
    static final class C20743e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20734e f56019a;

        /* renamed from: b */
        final /* synthetic */ C20713c f56020b;

        C20743e(C20734e eVar, C20713c cVar) {
            this.f56019a = eVar;
            this.f56020b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m68979a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m68979a() {
            this.f56019a.f55983g.remove(this.f56020b);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.e$f */
    static final class C20744f extends Lambda implements C7561a<C20726i> {

        /* renamed from: a */
        final /* synthetic */ C20734e f56021a;

        C20744f(C20734e eVar) {
            this.f56021a = eVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20726i invoke() {
            return new C20726i(this.f56021a.f55985i, this.f56021a);
        }
    }

    /* renamed from: a */
    public final void mo55928a() {
        mo55965l();
    }

    /* renamed from: a */
    public final void mo55937a(VEPreviewRadio vEPreviewRadio) {
        C7573i.m23587b(vEPreviewRadio, "ratio");
    }

    /* renamed from: a */
    public final void mo55938a(C45402m mVar) {
    }

    /* renamed from: b */
    public final boolean mo55949b() {
        return this.f55986j;
    }

    /* renamed from: c */
    public final int mo55951c() {
        return this.f55979c;
    }

    /* renamed from: g */
    public final float mo55960g() {
        return this.f55982f;
    }

    /* renamed from: h */
    public final boolean mo55961h() {
        return this.f55987k;
    }

    /* renamed from: i */
    public final C20719d mo55962i() {
        return (C20719d) this.f55988l.getValue();
    }

    /* renamed from: j */
    public final List<Integer> mo55963j() {
        return this.f55990n;
    }

    /* renamed from: o */
    public final int mo55968o() {
        return this.f55984h;
    }

    /* renamed from: a */
    public final void mo55941a(float[] fArr, double d) {
        C7573i.m23587b(fArr, "quaternion");
        this.f55996t.mo52956a(fArr, d);
    }

    /* renamed from: a */
    public final void mo55940a(boolean z) {
        this.f55987k = z;
    }

    /* renamed from: a */
    public final boolean mo55943a(int i, int i2, float f, float[] fArr) {
        C7573i.m23587b(fArr, "ponits");
        if (m68918x() == null) {
            return false;
        }
        return this.f55978b.mo52321a(i, i2, f, fArr, this.f55980d);
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
        sb.append(this.f55992p);
        bVar.mo38743d(sb.toString());
        float a = mo55962i().mo56018a(mo55960g(), mo55955d());
        float b = mo55962i().mo56023b(0.0f, mo55955d());
        float max = Math.max(Math.min(mo55960g(), f), 0.0f);
        if (max < b || max > a) {
            return false;
        }
        this.f55978b.mo52324b(max);
        this.f55992p = max;
        return true;
    }

    /* renamed from: a */
    public final void mo55939a(C7562b<? super float[], C7581n> bVar) {
        C7573i.m23587b(bVar, "action");
        bVar.invoke(new float[0]);
    }

    /* renamed from: e */
    public final int mo55957e() {
        return this.f55978b.mo52328c();
    }

    /* renamed from: f */
    public final int mo55959f() {
        return this.f55978b.mo52330d();
    }

    /* renamed from: n */
    public final boolean mo55967n() {
        return this.f55978b.mo52336i();
    }

    /* renamed from: q */
    public final void mo55974q() {
        mo55944b(mo55973p());
    }

    /* renamed from: x */
    private int[] m68918x() {
        C19667g gVar = this.f55978b;
        C7573i.m23582a((Object) gVar, "iesCameraManager");
        return gVar.mo52337j();
    }

    /* renamed from: d */
    public final int mo55955d() {
        C19667g gVar = this.f55978b;
        C7573i.m23582a((Object) gVar, "iesCameraManager");
        return gVar.mo52341n();
    }

    /* renamed from: l */
    public final void mo55965l() {
        this.f55978b.mo52333f();
        this.f55978b.mo52316a((C19633e) null);
    }

    /* renamed from: p */
    public final int mo55973p() {
        return this.f55993q.get(mo55968o());
    }

    /* renamed from: r */
    public final boolean mo55975r() {
        C19667g gVar = this.f55978b;
        C7573i.m23582a((Object) gVar, "iesCameraManager");
        return gVar.mo52335h();
    }

    /* renamed from: s */
    public final void mo56033s() {
        this.f55978b.mo52312a((Context) C6855a.m21308b());
    }

    /* renamed from: t */
    public final void mo55977t() {
        C19667g.m64797b().f53279c = null;
        C19667g.m64797b().mo52340m();
    }

    /* renamed from: m */
    public final void mo55966m() {
        this.f55978b.mo52318a((C19763c) this.f55996t);
        this.f55978b.f53279c = new C20739c(this);
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
        this.f55991o = 0.0f;
    }

    /* renamed from: k */
    public final int mo55964k() {
        int i;
        boolean z = true;
        if (mo55955d() != 1) {
            z = false;
        }
        if (z) {
            i = mo55962i().mo56028d();
        } else {
            i = mo55962i().mo56026c();
        }
        mo55931a(i, (C19662d) null);
        return i;
    }

    /* renamed from: v */
    public final boolean mo55979v() {
        boolean z;
        if (!mo55978u()) {
            return false;
        }
        if (this.f55989m) {
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
        this.f55989m = z;
    }

    /* renamed from: b */
    public final void mo55944b(int i) {
        this.f55978b.mo52320a(i);
        this.f55984h = i;
    }

    /* renamed from: a */
    public final void mo55930a(int i) {
        if (VERSION.SDK_INT >= 23) {
            this.f55978b.mo52325b(i);
        }
    }

    /* renamed from: b */
    public final void mo55946b(C19662d dVar) {
        C7573i.m23587b(dVar, "cameraOpenListener");
        this.f55981e.remove(dVar);
    }

    /* renamed from: c */
    public final void mo55953c(boolean z) {
        if (VERSION.SDK_INT >= 23) {
            C19667g.m64797b().mo52331d(z);
        }
    }

    /* renamed from: e */
    public final void mo55958e(boolean z) {
        this.f55978b.mo52327b(z);
    }

    /* renamed from: b */
    public final void mo55947b(C20713c cVar) {
        C7573i.m23587b(cVar, "zoomListener");
        C15455i.m45262a(new C20743e(this, cVar));
    }

    /* renamed from: c */
    public final void mo55952c(int i) {
        if (VERSION.SDK_INT < 23) {
            StringBuilder sb = new StringBuilder("An operation is not implemented: ");
            sb.append("VERSION.SDK_INT < M");
            throw new NotImplementedError(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo55932a(C19629a aVar) {
        this.f55978b.mo52314a(aVar);
    }

    /* renamed from: a */
    public final void mo55933a(C19662d dVar) {
        C7573i.m23587b(dVar, "cameraOpenListener");
        this.f55981e.addIfAbsent(dVar);
    }

    /* renamed from: b */
    public final void mo55948b(boolean z) {
        if (VERSION.SDK_INT >= 23) {
            this.f55978b.mo52329c(z);
        }
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
        float max = Math.max(0.0f, ((f - this.f55991o) * mo55960g()) + this.f55992p);
        this.f55991o = f;
        return mo55942a(max);
    }

    /* renamed from: a */
    public final void mo55934a(C19672a aVar) {
        this.f55978b.f53286j = aVar;
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
        return mo55942a(Math.max(0.0f, ((mo55960g() / 1000.0f) * f) + this.f55992p));
    }

    /* renamed from: a */
    public final void mo55935a(C19761a aVar) {
        this.f55978b.f53280d = aVar;
    }

    /* renamed from: a */
    public final void mo55936a(C20713c cVar) {
        C7573i.m23587b(cVar, "zoomListener");
        C15455i.m45262a(new C20738b(this, cVar));
    }

    /* renamed from: a */
    public final void mo55931a(int i, C19662d dVar) {
        this.f55978b.mo52313a(this.f55985i, i, (C19662d) new C20735a(dVar));
    }

    /* renamed from: b */
    public final void mo55945b(int i, C19662d dVar) {
        C19667g gVar = this.f55978b;
        C7573i.m23582a((Object) gVar, "iesCameraManager");
        if (!gVar.f53285i) {
            this.f55978b.mo52317a(C15441a.m45221b(this.f55995s));
        }
        this.f55978b.mo52316a((C19633e) new C20740d(this));
        this.f55978b.mo52322a(i, (C19662d) new C20735a(dVar));
    }

    /* renamed from: a */
    public final void mo55929a(float f, float f2, float f3) {
        this.f55996t.mo52922a(f, f2, f3);
    }

    public C20734e(Context context, C20689c cVar, C15422c cVar2, C19764d dVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(cVar, "recorder");
        C7573i.m23587b(cVar2, "cameraContext");
        C7573i.m23587b(dVar, "mediaRecordPresenter");
        this.f55985i = context;
        this.f55994r = cVar;
        this.f55995s = cVar2;
        this.f55996t = dVar;
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        sparseIntArray.put(0, 2);
        sparseIntArray.put(2, 0);
        this.f55993q = sparseIntArray;
    }
}

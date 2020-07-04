package com.p280ss.android.ugc.asve.sandbox.p929c;

import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.C19667g.C19672a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.ugc.asve.context.C15422c;
import com.p280ss.android.ugc.asve.p756d.C15441a;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.camera.C20713c;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20719d;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20720e;
import com.p280ss.android.ugc.asve.sandbox.C20996d;
import com.p280ss.android.ugc.asve.sandbox.C21026g;
import com.p280ss.android.ugc.asve.sandbox.C21050o;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20844b;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20905aa;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c.C20912a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20920f;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20920f.C20921a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20941m;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20941m.C20942a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20944n;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20944n.C20945a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20956r;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20956r.C20957a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20962t;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20962t.C20963a;
import com.p280ss.android.vesdk.C45382z.C45402m;
import com.p280ss.android.vesdk.VECameraSettings;
import com.p280ss.android.vesdk.VEPreviewRadio;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.a */
public final class C20989a implements C20707b {

    /* renamed from: a */
    private C45402m f56418a;

    /* renamed from: b */
    private final boolean f56419b = true;

    /* renamed from: c */
    private final C21026g f56420c;

    /* renamed from: d */
    private final C20719d f56421d;

    /* renamed from: e */
    private final int[] f56422e;

    /* renamed from: f */
    private final int f56423f;

    /* renamed from: g */
    private final int f56424g;

    /* renamed from: h */
    private VECameraSettings f56425h;

    /* renamed from: i */
    private C19662d f56426i;

    /* renamed from: j */
    private final Map<C19662d, C20911c> f56427j;

    /* renamed from: k */
    private C19761a f56428k;

    /* renamed from: l */
    private C19672a f56429l;

    /* renamed from: m */
    private C19629a f56430m;

    /* renamed from: n */
    private final Map<C20713c, C20944n> f56431n;

    /* renamed from: com.ss.android.ugc.asve.sandbox.c.a$a */
    public static final class C20990a extends C20957a {

        /* renamed from: a */
        final /* synthetic */ C7562b f56432a;

        C20990a(C7562b bVar) {
            this.f56432a = bVar;
        }

        /* renamed from: a */
        public final void mo56470a(float[] fArr) {
            C7573i.m23587b(fArr, "fovArray");
            this.f56432a.invoke(fArr);
        }
    }

    /* renamed from: a */
    public final void mo55940a(boolean z) {
    }

    /* renamed from: b */
    public final boolean mo55949b() {
        return this.f56419b;
    }

    /* renamed from: e */
    public final int mo55957e() {
        return this.f56423f;
    }

    /* renamed from: f */
    public final int mo55959f() {
        return this.f56424g;
    }

    /* renamed from: i */
    public final C20719d mo55962i() {
        return this.f56421d;
    }

    /* renamed from: a */
    public final void mo55938a(C45402m mVar) {
        this.f56418a = mVar;
        this.f56420c.mo56505a((C20905aa) mVar != null ? C20844b.m69818a(mVar) : null);
    }

    /* renamed from: a */
    public final void mo55937a(VEPreviewRadio vEPreviewRadio) {
        C7573i.m23587b(vEPreviewRadio, "ratio");
        this.f56420c.mo56517b(vEPreviewRadio.ordinal());
    }

    /* renamed from: a */
    public final boolean mo55943a(int i, int i2, float f, float[] fArr) {
        C7573i.m23587b(fArr, "points");
        return this.f56420c.mo56514a(i, i2, f, fArr);
    }

    /* renamed from: a */
    public final boolean mo55942a(float f) {
        this.f56420c.mo56501a(f);
        return true;
    }

    /* renamed from: a */
    public final void mo55941a(float[] fArr, double d) {
        C7573i.m23587b(fArr, "quaternion");
        this.f56420c.mo56513a(fArr, d);
    }

    /* renamed from: a */
    public final void mo55939a(C7562b<? super float[], C7581n> bVar) {
        C7573i.m23587b(bVar, "action");
        this.f56420c.mo56510a((C20956r) new C20990a(bVar));
    }

    /* renamed from: c */
    public final int mo55951c() {
        return this.f56420c.mo56544r();
    }

    /* renamed from: g */
    public final float mo55960g() {
        return this.f56420c.mo56537k();
    }

    /* renamed from: h */
    public final boolean mo55961h() {
        return this.f56420c.mo56536j();
    }

    /* renamed from: k */
    public final int mo55964k() {
        return this.f56420c.mo56500a();
    }

    /* renamed from: l */
    public final void mo55965l() {
        this.f56420c.mo56532f();
    }

    /* renamed from: m */
    public final void mo55966m() {
        this.f56420c.mo56533g();
    }

    /* renamed from: n */
    public final boolean mo55967n() {
        return this.f56420c.mo56543q();
    }

    /* renamed from: o */
    public final int mo55968o() {
        return this.f56420c.mo56515b();
    }

    /* renamed from: p */
    public final int mo55973p() {
        return this.f56420c.mo56522c();
    }

    /* renamed from: q */
    public final void mo55974q() {
        this.f56420c.mo56500a();
    }

    /* renamed from: r */
    public final boolean mo55975r() {
        return this.f56420c.mo56535i();
    }

    /* renamed from: t */
    public final void mo55977t() {
        this.f56420c.mo56534h();
    }

    /* renamed from: u */
    public final boolean mo55978u() {
        return this.f56420c.mo56540n();
    }

    /* renamed from: v */
    public final boolean mo55979v() {
        return this.f56420c.mo56541o();
    }

    /* renamed from: w */
    public final void mo55980w() {
        this.f56420c.mo56539m();
    }

    /* renamed from: d */
    public final int mo55955d() {
        return this.f56425h.f116130j.ordinal();
    }

    /* renamed from: a */
    public final void mo55928a() {
        this.f56431n.clear();
        this.f56427j.clear();
        this.f56426i = null;
        this.f56428k = null;
        this.f56429l = null;
        this.f56430m = null;
        this.f56420c.mo56542p();
    }

    /* renamed from: j */
    public final List<Integer> mo55963j() {
        List l = this.f56420c.mo56538l();
        if (l == null) {
            l = C7525m.m23461a();
        }
        if (l != null) {
            return C7577n.m23624d(l);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Int>");
    }

    /* renamed from: b */
    public final void mo55944b(int i) {
        this.f56420c.mo56524c(i);
    }

    /* renamed from: d */
    public final void mo55956d(boolean z) {
        this.f56420c.mo56525c(z);
    }

    /* renamed from: e */
    public final void mo55958e(boolean z) {
        this.f56420c.mo56531e(z);
    }

    /* renamed from: a */
    public final void mo55930a(int i) {
        this.f56420c.mo56530e(i);
    }

    /* renamed from: b */
    public final void mo55948b(boolean z) {
        this.f56420c.mo56528d(z);
    }

    /* renamed from: c */
    public final void mo55952c(int i) {
        this.f56420c.mo56527d(i);
    }

    /* renamed from: c */
    public final void mo55953c(boolean z) {
        this.f56420c.mo56512a(z);
    }

    /* renamed from: b */
    public final void mo55946b(C19662d dVar) {
        C7573i.m23587b(dVar, "cameraOpenListener");
        C20911c cVar = (C20911c) this.f56427j.get(dVar);
        if (cVar != null) {
            this.f56420c.mo56519b(cVar);
            this.f56427j.remove(dVar);
        }
    }

    /* renamed from: c */
    public final boolean mo55954c(float f) {
        this.f56420c.mo56523c(f);
        return true;
    }

    /* renamed from: a */
    public final void mo55932a(C19629a aVar) {
        C20942a aVar2;
        this.f56430m = aVar;
        C21026g gVar = this.f56420c;
        if (aVar != null) {
            aVar2 = C20844b.m69821a(aVar);
        } else {
            aVar2 = null;
        }
        gVar.mo56508a((C20941m) aVar2);
    }

    /* renamed from: b */
    public final void mo55947b(C20713c cVar) {
        C7573i.m23587b(cVar, "zoomListener");
        C20944n nVar = (C20944n) this.f56431n.get(cVar);
        if (nVar != null) {
            this.f56420c.mo56520b(nVar);
            this.f56431n.remove(cVar);
        }
    }

    /* renamed from: a */
    public final void mo55933a(C19662d dVar) {
        C7573i.m23587b(dVar, "cameraOpenListener");
        if (this.f56427j.get(dVar) != null) {
            this.f56420c.mo56506a((C20911c) this.f56427j.get(dVar));
            return;
        }
        C20912a a = C20844b.m69819a(dVar);
        this.f56427j.put(dVar, a);
        this.f56420c.mo56506a((C20911c) a);
    }

    /* renamed from: b */
    public final boolean mo55950b(float f) {
        this.f56420c.mo56516b(f);
        return true;
    }

    /* renamed from: a */
    public final void mo55934a(C19672a aVar) {
        C20963a aVar2;
        this.f56429l = aVar;
        C21026g gVar = this.f56420c;
        if (aVar != null) {
            aVar2 = C20844b.m69823a(aVar);
        } else {
            aVar2 = null;
        }
        gVar.mo56511a((C20962t) aVar2);
    }

    /* renamed from: a */
    public final void mo55935a(C19761a aVar) {
        C20921a aVar2;
        this.f56428k = aVar;
        C21026g gVar = this.f56420c;
        if (aVar != null) {
            aVar2 = C20844b.m69820a(aVar);
        } else {
            aVar2 = null;
        }
        gVar.mo56507a((C20920f) aVar2);
    }

    /* renamed from: a */
    public final void mo55936a(C20713c cVar) {
        C7573i.m23587b(cVar, "zoomListener");
        if (this.f56431n.get(cVar) != null) {
            this.f56420c.mo56520b((C20944n) this.f56431n.get(cVar));
            return;
        }
        C20945a a = C20844b.m69822a(cVar);
        this.f56431n.put(cVar, a);
        this.f56420c.mo56509a((C20944n) a);
    }

    /* renamed from: b */
    public final void mo55945b(int i, C19662d dVar) {
        C20912a aVar;
        this.f56426i = dVar;
        C21026g gVar = this.f56420c;
        if (dVar != null) {
            aVar = C20844b.m69819a(dVar);
        } else {
            aVar = null;
        }
        gVar.mo56504a(i, (C20911c) aVar);
    }

    /* renamed from: a */
    public final void mo55931a(int i, C19662d dVar) {
        C20912a aVar;
        C21026g gVar = this.f56420c;
        if (dVar != null) {
            aVar = C20844b.m69819a(dVar);
        } else {
            aVar = null;
        }
        gVar.mo56518b(i, aVar);
    }

    public C20989a(C21026g gVar, C15422c cVar) {
        C7573i.m23587b(cVar, "cameraContext");
        Object newProxyInstance = Proxy.newProxyInstance(C21026g.class.getClassLoader(), new Class[]{C21026g.class}, new C20996d(gVar));
        if (newProxyInstance != null) {
            this.f56420c = (C21026g) newProxyInstance;
            C21050o e = this.f56420c.mo56529e();
            C7573i.m23582a((Object) e, "safeRemoteCameraController.wideCameraComponent");
            this.f56421d = new C20720e(e);
            this.f56422e = new int[]{720, 1280};
            this.f56423f = 720;
            this.f56424g = 1280;
            this.f56425h = C15441a.m45219a(cVar);
            this.f56427j = new LinkedHashMap();
            this.f56431n = new LinkedHashMap();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteCameraService");
    }

    /* renamed from: a */
    public final void mo55929a(float f, float f2, float f3) {
        this.f56420c.mo56502a(f, f2, f3);
    }
}

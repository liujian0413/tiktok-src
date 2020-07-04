package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.C19667g.C19672a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.ugc.asve.recorder.camera.C20713c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20905aa;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20905aa.C20906a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c.C20912a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20920f;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20920f.C20921a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20941m;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20941m.C20942a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20944n;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20944n.C20945a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20956r;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20962t;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20962t.C20963a;
import com.p280ss.android.vesdk.C45382z.C45402m;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.b */
public final class C20844b {

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$a */
    public static final class C20845a implements C19662d {

        /* renamed from: a */
        final /* synthetic */ C20911c f56274a;

        C20845a(C20911c cVar) {
            this.f56274a = cVar;
        }

        /* renamed from: a */
        public final void mo52271a(int i) {
            this.f56274a.mo56385a(i);
        }

        /* renamed from: a */
        public final void mo52272a(int i, int i2, String str) {
            this.f56274a.mo56386a(i, i2, str);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$b */
    static final class C20846b implements C19761a {

        /* renamed from: a */
        final /* synthetic */ C20920f f56275a;

        C20846b(C20920f fVar) {
            this.f56275a = fVar;
        }

        /* renamed from: b */
        public final void mo52872b(int i, int i2) {
            this.f56275a.mo56387a(i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$c */
    public static final class C20847c implements C20713c {

        /* renamed from: a */
        final /* synthetic */ C20944n f56276a;

        C20847c(C20944n nVar) {
            this.f56276a = nVar;
        }

        /* renamed from: a */
        public final void mo56008a(int i, float f, boolean z) {
            this.f56276a.mo56367a(i, f, z);
        }

        /* renamed from: a */
        public final void mo56009a(int i, boolean z, boolean z2, float f, List<Integer> list) {
            int[] iArr;
            C20944n nVar = this.f56276a;
            if (list != null) {
                iArr = C7525m.m23507c((Collection<Integer>) list);
            } else {
                iArr = null;
            }
            nVar.mo56368a(i, z, z2, f, iArr);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$d */
    static final class C20848d extends Lambda implements C7562b<float[], C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20956r f56277a;

        C20848d(C20956r rVar) {
            this.f56277a = rVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m69831a((float[]) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m69831a(float[] fArr) {
            C7573i.m23587b(fArr, "result");
            this.f56277a.mo56470a(fArr);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$e */
    static final class C20849e implements C19672a {

        /* renamed from: a */
        final /* synthetic */ C20962t f56278a;

        C20849e(C20962t tVar) {
            this.f56278a = tVar;
        }

        /* renamed from: a */
        public final void mo52343a() {
            this.f56278a.mo56398a();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$f */
    static final class C20850f implements C19629a {

        /* renamed from: a */
        final /* synthetic */ C20941m f56279a;

        C20850f(C20941m mVar) {
            this.f56279a = mVar;
        }

        /* renamed from: a */
        public final void mo52246a() {
            this.f56279a.mo56384a();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$g */
    static final class C20851g implements C45402m {

        /* renamed from: a */
        final /* synthetic */ C20905aa f56280a;

        C20851g(C20905aa aaVar) {
            this.f56280a = aaVar;
        }

        /* renamed from: a */
        public final void mo55990a(int i, float f) {
            this.f56280a.mo56365a(i, f);
        }
    }

    /* renamed from: a */
    public static final C20945a m69822a(C20713c cVar) {
        C7573i.m23587b(cVar, "$this$stub");
        return new C20841ad(cVar);
    }

    /* renamed from: a */
    public static final C7562b<float[], C7581n> m69825a(C20956r rVar) {
        C7573i.m23587b(rVar, "$this$proxy");
        return new C20848d<>(rVar);
    }

    /* renamed from: a */
    public static final C20963a m69823a(C19672a aVar) {
        C7573i.m23587b(aVar, "$this$stub");
        return new C20887r(aVar);
    }

    /* renamed from: a */
    public static final C20942a m69821a(C19629a aVar) {
        C7573i.m23587b(aVar, "$this$stub");
        return new C20874g(aVar);
    }

    /* renamed from: a */
    public static final C45402m m69824a(C20905aa aaVar) {
        C7573i.m23587b(aaVar, "$this$proxy");
        return new C20851g(aaVar);
    }

    /* renamed from: a */
    public static final C19629a m69813a(C20941m mVar) {
        C7573i.m23587b(mVar, "$this$proxy");
        return new C20850f(mVar);
    }

    /* renamed from: a */
    public static final C19662d m69814a(C20911c cVar) {
        C7573i.m23587b(cVar, "$this$proxy");
        return new C20845a(cVar);
    }

    /* renamed from: a */
    public static final C19672a m69815a(C20962t tVar) {
        C7573i.m23587b(tVar, "$this$proxy");
        return new C20849e(tVar);
    }

    /* renamed from: a */
    public static final C19761a m69816a(C20920f fVar) {
        C7573i.m23587b(fVar, "$this$proxy");
        return new C20846b(fVar);
    }

    /* renamed from: a */
    public static final C20713c m69817a(C20944n nVar) {
        C7573i.m23587b(nVar, "$this$proxy");
        return new C20847c(nVar);
    }

    /* renamed from: a */
    public static final C20906a m69818a(C45402m mVar) {
        C7573i.m23587b(mVar, "$this$stub");
        return new C20839ab(mVar);
    }

    /* renamed from: a */
    public static final C20912a m69819a(C19662d dVar) {
        C7573i.m23587b(dVar, "$this$stub");
        return new C20875h(dVar);
    }

    /* renamed from: a */
    public static final C20921a m69820a(C19761a aVar) {
        C7573i.m23587b(aVar, "$this$stub");
        return new C20878i(aVar);
    }
}

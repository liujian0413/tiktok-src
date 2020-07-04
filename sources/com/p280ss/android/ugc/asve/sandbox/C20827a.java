package com.p280ss.android.ugc.asve.sandbox;

import com.bef.effectsdk.C1942b;
import com.p280ss.android.ugc.asve.C15395c;
import com.p280ss.android.ugc.asve.IASPathAdaptor;
import com.p280ss.android.ugc.asve.constant.ASMonitorServerLocation;
import com.p280ss.android.ugc.asve.constant.ASMonitorServerLocation.C15404a;
import com.p280ss.android.ugc.asve.context.C15426e;
import com.p280ss.android.ugc.asve.context.C15426e.C15427a;
import com.p280ss.android.ugc.asve.context.PreviewSize;
import com.p280ss.android.ugc.asve.recorder.C20675b;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20828a;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21063b;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21066c;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21072e;
import com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper;
import com.p280ss.android.vesdk.C45321i;
import com.p280ss.android.vesdk.VEListener.C45206b;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a */
public final class C20827a implements C15426e {

    /* renamed from: a */
    private final boolean f56226a;

    /* renamed from: b */
    private final boolean f56227b;

    /* renamed from: c */
    private final ASMonitorServerLocation f56228c;

    /* renamed from: d */
    private final boolean f56229d;

    /* renamed from: e */
    private final File f56230e;

    /* renamed from: f */
    private final int f56231f;

    /* renamed from: g */
    private final int f56232g;

    /* renamed from: h */
    private final boolean f56233h;

    /* renamed from: i */
    private final File f56234i;

    /* renamed from: j */
    private final boolean f56235j;

    /* renamed from: k */
    private final boolean f56236k;

    /* renamed from: l */
    private final C15395c f56237l;

    /* renamed from: m */
    private final C20675b f56238m;

    /* renamed from: n */
    private final C45206b f56239n;

    /* renamed from: o */
    private final IASPathAdaptor f56240o;

    /* renamed from: p */
    private final int f56241p;

    /* renamed from: q */
    private final String f56242q;

    /* renamed from: r */
    private final PreviewSize f56243r;

    /* renamed from: s */
    private final boolean f56244s;

    /* renamed from: t */
    private final boolean f56245t;

    /* renamed from: u */
    private final int f56246u;

    /* renamed from: v */
    private final boolean f56247v;

    /* renamed from: w */
    private final C45321i f56248w;

    /* renamed from: A */
    public final boolean mo38943A() {
        return false;
    }

    /* renamed from: b */
    public final C15395c mo38945b() {
        return this.f56237l;
    }

    /* renamed from: c */
    public final IASPathAdaptor mo38946c() {
        return this.f56240o;
    }

    /* renamed from: d */
    public final C20675b mo38947d() {
        return this.f56238m;
    }

    /* renamed from: e */
    public final C45206b mo38948e() {
        return this.f56239n;
    }

    /* renamed from: f */
    public final C1942b mo38949f() {
        return null;
    }

    /* renamed from: h */
    public final boolean mo38951h() {
        return this.f56227b;
    }

    /* renamed from: i */
    public final ASMonitorServerLocation mo38952i() {
        return this.f56228c;
    }

    /* renamed from: j */
    public final boolean mo38953j() {
        return this.f56244s;
    }

    /* renamed from: k */
    public final boolean mo38954k() {
        return this.f56229d;
    }

    /* renamed from: l */
    public final File mo38955l() {
        return this.f56230e;
    }

    /* renamed from: m */
    public final int mo38956m() {
        return this.f56231f;
    }

    /* renamed from: n */
    public final boolean mo38957n() {
        return this.f56245t;
    }

    /* renamed from: o */
    public final int mo38958o() {
        return this.f56232g;
    }

    /* renamed from: p */
    public final boolean mo38959p() {
        return this.f56233h;
    }

    /* renamed from: q */
    public final File mo38960q() {
        return this.f56234i;
    }

    /* renamed from: r */
    public final boolean mo38961r() {
        return this.f56235j;
    }

    /* renamed from: s */
    public final boolean mo38962s() {
        return this.f56236k;
    }

    /* renamed from: t */
    public final int mo38963t() {
        return this.f56246u;
    }

    /* renamed from: u */
    public final boolean mo38964u() {
        return this.f56247v;
    }

    /* renamed from: v */
    public final int mo38965v() {
        return this.f56241p;
    }

    /* renamed from: w */
    public final boolean mo38966w() {
        return this.f56226a;
    }

    /* renamed from: x */
    public final C45321i mo38967x() {
        return this.f56248w;
    }

    /* renamed from: y */
    public final PreviewSize mo38968y() {
        return this.f56243r;
    }

    /* renamed from: z */
    public final String mo38969z() {
        return this.f56242q;
    }

    /* renamed from: a */
    public final ExecutorService mo38944a() {
        return C15427a.m45139a(this);
    }

    /* renamed from: g */
    public final String mo38950g() {
        return C15427a.m45140b(this);
    }

    public C20827a(SandBoxASContextWrapper sandBoxASContextWrapper, C21066c cVar, C21072e eVar, C21063b bVar, C45321i iVar, C21023f fVar) {
        C20675b bVar2;
        C45206b bVar3;
        IASPathAdaptor iASPathAdaptor;
        C7573i.m23587b(sandBoxASContextWrapper, "sandBoxContextWrapper");
        C7573i.m23587b(cVar, "iasLogger");
        C7573i.m23587b(iVar, "veAppField");
        this.f56248w = iVar;
        this.f56227b = sandBoxASContextWrapper.f56528a;
        this.f56228c = C15404a.m45055a(sandBoxASContextWrapper.f56529b);
        this.f56229d = sandBoxASContextWrapper.f56530c;
        this.f56230e = new File(sandBoxASContextWrapper.f56531d);
        this.f56231f = sandBoxASContextWrapper.f56532e;
        this.f56232g = sandBoxASContextWrapper.f56533f;
        this.f56233h = sandBoxASContextWrapper.f56534g;
        this.f56234i = new File(sandBoxASContextWrapper.f56535h);
        this.f56235j = sandBoxASContextWrapper.f56536i;
        this.f56236k = sandBoxASContextWrapper.f56537j;
        this.f56237l = C20828a.m69776a(cVar);
        PreviewSize previewSize = null;
        if (eVar != null) {
            bVar2 = C20828a.m69777a(eVar);
        } else {
            bVar2 = null;
        }
        this.f56238m = bVar2;
        if (bVar != null) {
            bVar3 = C20828a.m69783a(bVar);
        } else {
            bVar3 = null;
        }
        this.f56239n = bVar3;
        if (fVar != null) {
            iASPathAdaptor = C20828a.m69775a(fVar);
        } else {
            iASPathAdaptor = null;
        }
        this.f56240o = iASPathAdaptor;
        this.f56241p = sandBoxASContextWrapper.f56547t;
        String str = sandBoxASContextWrapper.f56544q;
        C7573i.m23582a((Object) str, "sandBoxContextWrapper.veRuntimeConfig");
        this.f56242q = str;
        if (sandBoxASContextWrapper.f56545r * sandBoxASContextWrapper.f56546s != 0) {
            previewSize = new PreviewSize(sandBoxASContextWrapper.f56545r, sandBoxASContextWrapper.f56546s);
        }
        this.f56243r = previewSize;
        this.f56244s = sandBoxASContextWrapper.f56548u;
        this.f56245t = sandBoxASContextWrapper.f56549v;
        this.f56246u = sandBoxASContextWrapper.f56538k;
        this.f56247v = sandBoxASContextWrapper.f56539l;
    }
}

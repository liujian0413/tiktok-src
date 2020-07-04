package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.text.TextUtils;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel */
public final class CutVideoViewModel extends BaseJediViewModel<CutVideoState> {

    /* renamed from: c */
    public C38892aa f100990c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel$a */
    static final class C38887a extends Lambda implements C7562b<CutVideoState, CutVideoState> {

        /* renamed from: a */
        public static final C38887a f100991a = new C38887a();

        C38887a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m124161a((CutVideoState) obj);
        }

        /* renamed from: a */
        private static CutVideoState m124161a(CutVideoState cutVideoState) {
            C7573i.m23587b(cutVideoState, "$receiver");
            return CutVideoState.copy$default(cutVideoState, null, new C44412h(), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel$b */
    static final class C38888b extends Lambda implements C7562b<CutVideoState, CutVideoState> {

        /* renamed from: a */
        public static final C38888b f100992a = new C38888b();

        C38888b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m124162a((CutVideoState) obj);
        }

        /* renamed from: a */
        private static CutVideoState m124162a(CutVideoState cutVideoState) {
            C7573i.m23587b(cutVideoState, "$receiver");
            return CutVideoState.copy$default(cutVideoState, new C44412h(), null, 2, null);
        }
    }

    /* renamed from: r */
    private static CutVideoState m124147r() {
        return new CutVideoState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m124147r();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C38888b.f100992a);
    }

    /* renamed from: g */
    public final void mo97155g() {
        mo29038c(C38887a.f100991a);
    }

    /* renamed from: n */
    public static boolean m124146n() {
        return C35563c.f93231M.mo93305a(Property.EnableUploadVideoSlideAutoJust);
    }

    /* renamed from: h */
    public final C38892aa mo97156h() {
        C38892aa aaVar = this.f100990c;
        if (aaVar == null) {
            C7573i.m23583a("cutVideoModel");
        }
        return aaVar;
    }

    /* renamed from: i */
    public final boolean mo97157i() {
        C38892aa aaVar = this.f100990c;
        if (aaVar == null) {
            C7573i.m23583a("cutVideoModel");
        }
        if (aaVar.f100997a.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo97158j() {
        C38892aa aaVar = this.f100990c;
        if (aaVar == null) {
            C7573i.m23583a("cutVideoModel");
        }
        if (!aaVar.f100999c) {
            C38892aa aaVar2 = this.f100990c;
            if (aaVar2 == null) {
                C7573i.m23583a("cutVideoModel");
            }
            if (!aaVar2.f101009m) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo97160l() {
        C38892aa aaVar = this.f100990c;
        if (aaVar == null) {
            C7573i.m23583a("cutVideoModel");
        }
        if (aaVar.f101005i || mo97161m()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo97162o() {
        String str = "system_upload";
        C38892aa aaVar = this.f100990c;
        if (aaVar == null) {
            C7573i.m23583a("cutVideoModel");
        }
        if (C7573i.m23585a((Object) str, (Object) aaVar.f101008l)) {
            return false;
        }
        return C39182e.f101552a.mo97470h();
    }

    /* renamed from: p */
    public final boolean mo97163p() {
        if (this.f100990c != null) {
            C38892aa aaVar = this.f100990c;
            if (aaVar == null) {
                C7573i.m23583a("cutVideoModel");
            }
            if (aaVar.f101006j != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final Serializable mo97164q() {
        if (this.f100990c == null) {
            return null;
        }
        C38892aa aaVar = this.f100990c;
        if (aaVar == null) {
            C7573i.m23583a("cutVideoModel");
        }
        return aaVar.f101004h;
    }

    /* renamed from: k */
    public final boolean mo97159k() {
        C38892aa aaVar = this.f100990c;
        if (aaVar == null) {
            C7573i.m23583a("cutVideoModel");
        }
        if (aaVar.f101003g == null) {
            C38892aa aaVar2 = this.f100990c;
            if (aaVar2 == null) {
                C7573i.m23583a("cutVideoModel");
            }
            if (TextUtils.isEmpty(aaVar2.f101002f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo97161m() {
        C38892aa aaVar = this.f100990c;
        if (aaVar == null) {
            C7573i.m23583a("cutVideoModel");
        }
        if (aaVar.f101003g == null) {
            C38892aa aaVar2 = this.f100990c;
            if (aaVar2 == null) {
                C7573i.m23583a("cutVideoModel");
            }
            if (TextUtils.isEmpty(aaVar2.f101002f)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo97154a(C38892aa aaVar) {
        C7573i.m23587b(aaVar, "<set-?>");
        this.f100990c = aaVar;
    }
}

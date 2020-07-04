package com.p280ss.android.ugc.asve.sandbox.p930d;

import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p280ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.asve.sandbox.C21035j.C21036a;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20867d;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20872f;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20914d;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20917e;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20923g;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20926h;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20929i;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20932j;
import com.p280ss.android.vesdk.VEListener.C45210f;
import kotlin.C7581n;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.d */
public final class C21002d extends C21036a {

    /* renamed from: a */
    private Surface f56471a;

    /* renamed from: b */
    private final C20676a f56472b;

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.d$a */
    static final class C21003a extends Lambda implements C7562b<RecorderConcatResult, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20923g f56473a;

        C21003a(C20923g gVar) {
            this.f56473a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m70487a((RecorderConcatResult) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m70487a(RecorderConcatResult recorderConcatResult) {
            C7573i.m23587b(recorderConcatResult, "recorderConcatResult");
            C20923g gVar = this.f56473a;
            if (gVar != null) {
                gVar.mo56400a(recorderConcatResult);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.d$b */
    static final class C21004b extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C20932j f56474a;

        C21004b(C20932j jVar) {
            this.f56474a = jVar;
            super(1);
        }

        /* renamed from: a */
        private void m70488a(int i) {
            C20932j jVar = this.f56474a;
            if (jVar != null) {
                jVar.mo56402a(i);
            }
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m70488a(((Number) obj).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.d$c */
    static final class C21005c implements C45210f {

        /* renamed from: a */
        final /* synthetic */ C20917e f56475a;

        C21005c(C20917e eVar) {
            this.f56475a = eVar;
        }

        /* renamed from: a */
        public final void mo55926a(int i) {
            C20917e eVar = this.f56475a;
            if (eVar != null) {
                eVar.mo56405a(i, "");
            }
        }
    }

    /* renamed from: a */
    public final void mo56669a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i, C20917e eVar) {
        C7573i.m23587b(aSMediaSegmentArr, "segments");
        C7573i.m23587b(str, "videoDir");
        this.f56472b.mo55902a(C7519g.m23418a(aSMediaSegmentArr), str, str2, i, new C21005c(eVar));
    }

    /* renamed from: a */
    public final void mo56662a(C20914d dVar) {
        this.f56472b.mo55897a(dVar != null ? C20872f.m69905a(dVar) : null);
    }

    /* renamed from: a */
    public final void mo56665a(String str, int i, int i2, boolean z, int i3, C20929i iVar) {
        C7573i.m23587b(str, "path");
        C7573i.m23587b(iVar, "callback");
        this.f56472b.mo55899a(str, i, i2, z, CompressFormat.values()[i3], C20867d.m69895a(iVar));
    }

    /* renamed from: a */
    public final void mo56663a(C20926h hVar) {
        this.f56472b.mo55903a(hVar != null ? C20867d.m69894a(hVar) : null);
    }

    /* renamed from: a */
    public final void mo56661a(Surface surface, String str, C20926h hVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "device");
        this.f56472b.mo55909b(surface, str, hVar != null ? C20867d.m69894a(hVar) : null);
    }

    /* renamed from: a */
    public final void mo56660a(Surface surface) {
        this.f56472b.mo55895a(surface);
    }

    /* renamed from: a */
    public final void mo56667a(String str, String str2, boolean z, String str3, String str4, C20923g gVar) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "comment");
        this.f56472b.mo55901a(str, str2, z, str3, str4, (C7562b<? super RecorderConcatResult, C7581n>) new C21003a<Object,C7581n>(gVar));
    }

    /* renamed from: a */
    public final void mo56668a(boolean z) {
        this.f56472b.mo55904a(z);
    }

    /* renamed from: a */
    public final void mo56664a(String str) {
        this.f56472b.mo55898a(str);
    }

    /* renamed from: a */
    public final void mo56666a(String str, long j, long j2) {
        this.f56472b.mo55900a(str, j, j2);
    }

    /* renamed from: a */
    public final void mo56656a() {
        this.f56472b.mo55890a();
    }

    /* renamed from: b */
    public final void mo56670b() {
        this.f56472b.mo55906b();
    }

    /* renamed from: c */
    public final long mo56676c() {
        return this.f56472b.mo55912c();
    }

    /* renamed from: d */
    public final void mo56678d() {
        this.f56472b.mo55914d();
    }

    /* renamed from: e */
    public final void mo56680e() {
        this.f56472b.mo55916e();
    }

    /* renamed from: f */
    public final void mo56681f() {
        this.f56472b.mo55918f();
    }

    /* renamed from: g */
    public final long mo56682g() {
        return this.f56472b.mo55919g();
    }

    /* renamed from: h */
    public final boolean mo56683h() {
        return this.f56472b.mo55920h();
    }

    /* renamed from: i */
    public final void mo56684i() {
        this.f56472b.mo55921i();
    }

    /* renamed from: j */
    public final void mo56685j() {
        this.f56472b.mo55922j();
    }

    /* renamed from: k */
    public final void mo56686k() {
        this.f56472b.mo55923k();
    }

    /* renamed from: l */
    public final void mo56687l() {
        Surface surface = this.f56471a;
        if (surface != null) {
            surface.release();
        }
    }

    public C21002d(C20676a aVar) {
        C7573i.m23587b(aVar, "mediaController");
        this.f56472b = aVar;
    }

    /* renamed from: b */
    public final void mo56671b(Surface surface) {
        C7573i.m23587b(surface, "surface");
        this.f56472b.mo55907b(surface);
    }

    /* renamed from: c */
    public final void mo56677c(boolean z) {
        this.f56472b.mo55913c(z);
    }

    /* renamed from: d */
    public final void mo56679d(boolean z) {
        this.f56472b.mo55915d(z);
    }

    /* renamed from: b */
    public final void mo56674b(C20926h hVar) {
        C7562b bVar;
        C20676a aVar = this.f56472b;
        if (hVar != null) {
            bVar = C20867d.m69894a(hVar);
        } else {
            bVar = null;
        }
        aVar.mo55910b(bVar);
    }

    /* renamed from: b */
    public final boolean mo56675b(boolean z) {
        return this.f56472b.mo55911b(z);
    }

    /* renamed from: a */
    public final void mo56659a(int i) {
        this.f56472b.mo55894a(i);
    }

    /* renamed from: b */
    public final void mo56672b(Surface surface, String str) {
        this.f56472b.mo55908b(surface, str);
    }

    /* renamed from: a */
    public final int mo56653a(Surface surface, String str) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "device");
        return this.f56472b.mo55886a(surface, str);
    }

    /* renamed from: b */
    public final void mo56673b(Surface surface, String str, C20926h hVar) {
        C7562b bVar;
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "device");
        this.f56471a = surface;
        C20676a aVar = this.f56472b;
        if (hVar != null) {
            bVar = C20867d.m69894a(hVar);
        } else {
            bVar = null;
        }
        aVar.mo55909b(surface, str, bVar);
    }

    /* renamed from: a */
    public final void mo56658a(float f, int i, int i2) {
        this.f56472b.mo55893a(f, i, i2);
    }

    /* renamed from: a */
    public final int mo56654a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i) {
        C7573i.m23587b(aSMediaSegmentArr, "segments");
        C7573i.m23587b(str, "videoDir");
        return this.f56472b.mo55888a(C7519g.m23418a(aSMediaSegmentArr), str, str2, i);
    }

    /* renamed from: a */
    public final RecorderConcatResult mo56655a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "comment");
        return this.f56472b.mo55889a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final int mo56651a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f56472b.mo55883a(d, z, f, i, i2, z2);
    }

    /* renamed from: a */
    public final void mo56657a(double d, boolean z, float f, int i, int i2, boolean z2, C20932j jVar) {
        this.f56472b.mo55891a(d, z, f, i, i2, z2, new C21004b(jVar));
    }

    /* renamed from: a */
    public final int mo56652a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        String str3 = str;
        C7573i.m23587b(str, "path");
        String str4 = str2;
        C7573i.m23587b(str4, "strDetectModelsDir");
        return this.f56472b.mo55884a(i, i2, str3, i3, i4, str4, i5, z);
    }
}

package com.p280ss.android.ugc.asve.recorder.p922b;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.opengl.EGLContext;
import android.view.Surface;
import com.p280ss.android.medialib.common.C19702a.C19704b;
import com.p280ss.android.medialib.model.C19753a;
import com.p280ss.android.medialib.presenter.C19764d;
import com.p280ss.android.medialib.presenter.C19764d.C19779b;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.VEListener.C45210f;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.ugc.asve.recorder.b.b */
public final class C20677b implements C20676a {

    /* renamed from: a */
    public final C19764d f55835a;

    /* renamed from: b */
    private final C15432h f55836b;

    /* renamed from: com.ss.android.ugc.asve.recorder.b.b$a */
    static final class C20678a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C20677b f55837a;

        /* renamed from: b */
        final /* synthetic */ String f55838b;

        /* renamed from: c */
        final /* synthetic */ String f55839c;

        /* renamed from: d */
        final /* synthetic */ String f55840d;

        /* renamed from: e */
        final /* synthetic */ C7562b f55841e;

        C20678a(C20677b bVar, String str, String str2, String str3, C7562b bVar2) {
            this.f55837a = bVar;
            this.f55838b = str;
            this.f55839c = str2;
            this.f55840d = str3;
            this.f55841e = bVar2;
        }

        public final void run() {
            int a = this.f55837a.f55835a.mo52907a(this.f55838b, this.f55839c, this.f55840d, "");
            C7562b bVar = this.f55841e;
            if (bVar != null) {
                bVar.invoke(new RecorderConcatResult(a, this.f55838b, this.f55839c));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.b$b */
    public static final class C20679b implements C19779b {

        /* renamed from: a */
        final /* synthetic */ C45393e f55842a;

        public final boolean bW_() {
            return this.f55842a.mo56383a();
        }

        C20679b(C45393e eVar) {
            this.f55842a = eVar;
        }

        /* renamed from: a */
        public final void mo53070a(C19753a aVar) {
            EGLContext eGLContext;
            int i;
            int i2;
            int i3;
            int i4;
            long j;
            C45393e eVar = this.f55842a;
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

    /* renamed from: b */
    public final void mo55909b(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
    }

    /* renamed from: a */
    public final void mo55902a(List<ASMediaSegment> list, String str, String str2, int i, C45210f fVar) {
        C7573i.m23587b(list, "mediaSegments");
        C7573i.m23587b(str, "videoDir");
        C7573i.m23587b(fVar, "listener");
        fVar.mo55926a(this.f55835a.mo52890a(list.size(), str));
    }

    /* renamed from: a */
    public final void mo55898a(String str) {
        this.f55835a.mo52919a(str);
    }

    /* renamed from: a */
    public final void mo55900a(String str, long j, long j2) {
        this.f55835a.mo52918a(j, j2);
    }

    /* renamed from: a */
    public final void mo55897a(C45393e eVar) {
        if (eVar == null) {
            this.f55835a.mo52943a((C19779b) null);
        } else {
            this.f55835a.mo52943a((C19779b) new C20679b(eVar));
        }
    }

    /* renamed from: a */
    public final void mo55904a(boolean z) {
        this.f55835a.mo53052p(z);
    }

    /* renamed from: a */
    public final void mo55903a(C7562b<? super Integer, C7581n> bVar) {
        mo55916e();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(0));
        }
    }

    /* renamed from: a */
    public final void mo55895a(Surface surface) {
        this.f55835a.mo52968b(surface);
    }

    /* renamed from: a */
    public final void mo55894a(int i) {
        this.f55835a.mo52975b(i);
    }

    /* renamed from: a */
    public final void mo55899a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "strImagePath");
        C7573i.m23587b(compressFormat, "format");
        C7573i.m23587b(bVar, "callback");
        String str2 = str;
        this.f55835a.mo52909a(str2, new int[]{i, i2}, z, compressFormat, (C19704b) new C20680c(bVar));
    }

    /* renamed from: a */
    public final void mo55901a(String str, String str2, boolean z, String str3, String str4, C7562b<? super RecorderConcatResult, C7581n> bVar) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "coment");
        ExecutorService a = C6855a.m21306a().mo38944a();
        C20678a aVar = new C20678a(this, str, str2, str3, bVar);
        a.submit(aVar);
    }

    /* renamed from: a */
    public final void mo55896a(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(mo55886a(surface, str)));
        }
    }

    /* renamed from: a */
    public final void mo55892a(float f) {
        this.f55835a.mo52924a(f, -1, -1);
    }

    /* renamed from: a */
    public final void mo55893a(float f, int i, int i2) {
        this.f55835a.mo52924a(f, i, i2);
    }

    /* renamed from: a */
    public final void mo55890a() {
        this.f55835a.mo53051p();
    }

    /* renamed from: b */
    public final void mo55906b() {
        this.f55835a.mo53053q();
    }

    /* renamed from: c */
    public final long mo55912c() {
        return this.f55835a.mo53021g();
    }

    /* renamed from: d */
    public final void mo55914d() {
        this.f55835a.mo53032i();
    }

    /* renamed from: e */
    public final void mo55916e() {
        this.f55835a.mo53037j();
    }

    /* renamed from: f */
    public final void mo55918f() {
        this.f55835a.mo53049o();
    }

    /* renamed from: g */
    public final long mo55919g() {
        return this.f55835a.mo53021g();
    }

    /* renamed from: h */
    public final boolean mo55920h() {
        return this.f55835a.mo53041k();
    }

    /* renamed from: i */
    public final void mo55921i() {
        this.f55835a.mo53045m();
    }

    /* renamed from: j */
    public final void mo55922j() {
        this.f55835a.mo53014f();
    }

    /* renamed from: k */
    public final void mo55923k() {
        this.f55835a.mo53049o();
    }

    /* renamed from: c */
    public final void mo55913c(boolean z) {
        this.f55835a.mo53000d(z ? 1 : 0);
    }

    /* renamed from: d */
    public final void mo55915d(boolean z) {
        this.f55835a.mo53066x(z);
    }

    /* renamed from: e */
    public final void mo55917e(boolean z) {
        this.f55835a.mo53023g(z);
    }

    /* renamed from: b */
    public final void mo55907b(Surface surface) {
        C7573i.m23587b(surface, "surface");
        this.f55835a.mo52968b(surface);
    }

    /* renamed from: b */
    public final void mo55910b(C7562b<? super Integer, C7581n> bVar) {
        mo55918f();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(0));
        }
    }

    /* renamed from: b */
    public final boolean mo55911b(boolean z) {
        return this.f55835a.mo53046m(z);
    }

    /* renamed from: b */
    public final int mo55905b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        return this.f55835a.mo52988c(context, 5, audioRecorderInterface);
    }

    public C20677b(C19764d dVar, C15432h hVar) {
        C7573i.m23587b(dVar, "mediaRecordPresenter");
        C7573i.m23587b(hVar, "recorderContext");
        this.f55835a = dVar;
        this.f55836b = hVar;
    }

    /* renamed from: a */
    public final int mo55885a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        return this.f55835a.mo52891a(context, 5, audioRecorderInterface);
    }

    /* renamed from: b */
    public final void mo55908b(Surface surface, String str) {
        this.f55835a.mo52894a(surface, str);
    }

    /* renamed from: a */
    public final int mo55886a(Surface surface, String str) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        return this.f55835a.mo52894a(surface, str);
    }

    /* renamed from: a */
    public final int mo55887a(String str, int i, int i2, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "strImagePath");
        C7573i.m23587b(bVar, "callback");
        return this.f55835a.mo52908a(str, new int[]{i, i2}, (C19704b) new C20680c(bVar));
    }

    /* renamed from: a */
    public final int mo55888a(List<ASMediaSegment> list, String str, String str2, int i) {
        C7573i.m23587b(list, "mediaSegments");
        C7573i.m23587b(str, "videoDir");
        return this.f55835a.mo52890a(list.size(), str);
    }

    /* renamed from: a */
    public final RecorderConcatResult mo55889a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "coment");
        return new RecorderConcatResult(this.f55835a.mo52907a(str, str2, str3, ""), str, str2);
    }

    /* renamed from: a */
    public final int mo55883a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f55835a.mo52884a(d, z, f, i, i2, z2);
    }

    /* renamed from: a */
    public final void mo55891a(double d, boolean z, float f, int i, int i2, boolean z2, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        bVar.invoke(Integer.valueOf(mo55883a(d, z, f, i, i2, z2)));
    }

    /* renamed from: a */
    public final int mo55884a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        String str3 = str;
        C7573i.m23587b(str, "path");
        String str4 = str2;
        C7573i.m23587b(str4, "strDetectModelsDir");
        return this.f55835a.mo52889a(i, i2, str3, i3, i4, str4, i5, z);
    }
}

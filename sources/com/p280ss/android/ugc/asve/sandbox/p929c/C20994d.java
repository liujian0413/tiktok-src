package com.p280ss.android.ugc.asve.sandbox.p929c;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p280ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.asve.sandbox.C20996d;
import com.p280ss.android.ugc.asve.sandbox.C21035j;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20852c;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20867d;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20872f;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20914d;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20926h;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20926h.C20927a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20929i;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.VEListener.C45210f;
import java.lang.reflect.Proxy;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.d */
public final class C20994d implements C20676a {

    /* renamed from: a */
    private C45210f f56445a;

    /* renamed from: b */
    private final C21035j f56446b;

    /* renamed from: c */
    private C45393e f56447c;

    /* renamed from: d */
    private C7562b<? super Integer, C7581n> f56448d;

    /* renamed from: e */
    private C7562b<? super Integer, C7581n> f56449e;

    /* renamed from: f */
    private C7562b<? super Integer, C7581n> f56450f;

    /* renamed from: g */
    private C7562b<? super Integer, C7581n> f56451g;

    /* renamed from: h */
    private C7562b<? super Integer, C7581n> f56452h;

    /* renamed from: i */
    private C7562b<? super Integer, C7581n> f56453i;

    /* renamed from: j */
    private C7562b<? super RecorderConcatResult, C7581n> f56454j;

    /* renamed from: k */
    private final String f56455k;

    /* renamed from: a */
    public final int mo55885a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        return 0;
    }

    /* renamed from: b */
    public final int mo55905b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        return 0;
    }

    /* renamed from: e */
    public final void mo55917e(boolean z) {
    }

    /* renamed from: a */
    public final void mo55902a(List<ASMediaSegment> list, String str, String str2, int i, C45210f fVar) {
        C7573i.m23587b(list, "mediaSegments");
        C7573i.m23587b(str, "videoDir");
        C7573i.m23587b(fVar, "listener");
        this.f56445a = fVar;
        C21035j jVar = this.f56446b;
        Object[] array = list.toArray(new ASMediaSegment[0]);
        if (array != null) {
            jVar.mo56669a((ASMediaSegment[]) array, str, str2, i, C20867d.m69892a(fVar));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public final void mo55897a(C45393e eVar) {
        this.f56447c = eVar;
        this.f56446b.mo56662a((C20914d) eVar != null ? C20872f.m69904a(eVar) : null);
    }

    /* renamed from: a */
    public final void mo55899a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "strImagePath");
        C7573i.m23587b(compressFormat, "format");
        C7573i.m23587b(bVar, "callback");
        this.f56448d = bVar;
        this.f56446b.mo56665a(str, i, i2, z, compressFormat.ordinal(), (C20929i) C20852c.m69842a(bVar));
    }

    /* renamed from: a */
    public final void mo55894a(int i) {
        this.f56446b.mo56659a(i);
    }

    /* renamed from: a */
    public final void mo55903a(C7562b<? super Integer, C7581n> bVar) {
        this.f56450f = bVar;
        this.f56446b.mo56663a((C20926h) bVar != null ? C20867d.m69896b(bVar) : null);
    }

    /* renamed from: a */
    public final void mo55896a(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        this.f56452h = bVar;
        this.f56446b.mo56661a(surface, str, (C20926h) bVar != null ? C20867d.m69896b(bVar) : null);
    }

    /* renamed from: a */
    public final void mo55895a(Surface surface) {
        this.f56446b.mo56660a(surface);
    }

    /* renamed from: a */
    public final void mo55901a(String str, String str2, boolean z, String str3, String str4, C7562b<? super RecorderConcatResult, C7581n> bVar) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "coment");
        this.f56454j = bVar;
        this.f56446b.mo56667a(str, str2, z, str3, str4, bVar != null ? C20867d.m69897c(bVar) : null);
    }

    /* renamed from: a */
    public final void mo55892a(float f) {
        this.f56446b.mo56658a(f, -1, -1);
    }

    /* renamed from: a */
    public final void mo55893a(float f, int i, int i2) {
        this.f56446b.mo56658a(f, i, i2);
    }

    /* renamed from: a */
    public final void mo55904a(boolean z) {
        this.f56446b.mo56668a(z);
    }

    /* renamed from: a */
    public final void mo55898a(String str) {
        this.f56446b.mo56664a(str);
    }

    /* renamed from: a */
    public final void mo55900a(String str, long j, long j2) {
        this.f56446b.mo56666a(str, j, j2);
    }

    /* renamed from: c */
    public final long mo55912c() {
        return this.f56446b.mo56676c();
    }

    /* renamed from: d */
    public final void mo55914d() {
        this.f56446b.mo56678d();
    }

    /* renamed from: e */
    public final void mo55916e() {
        this.f56446b.mo56680e();
    }

    /* renamed from: f */
    public final void mo55918f() {
        this.f56446b.mo56681f();
    }

    /* renamed from: g */
    public final long mo55919g() {
        return this.f56446b.mo56682g();
    }

    /* renamed from: h */
    public final boolean mo55920h() {
        return this.f56446b.mo56683h();
    }

    /* renamed from: i */
    public final void mo55921i() {
        this.f56446b.mo56684i();
    }

    /* renamed from: k */
    public final void mo55923k() {
        this.f56446b.mo56686k();
    }

    /* renamed from: b */
    public final void mo55906b() {
        this.f56446b.mo56670b();
    }

    /* renamed from: j */
    public final void mo55922j() {
        this.f56449e = null;
        this.f56453i = null;
        this.f56452h = null;
        this.f56451g = null;
        this.f56450f = null;
        this.f56448d = null;
        this.f56447c = null;
        this.f56454j = null;
        this.f56446b.mo56685j();
    }

    /* renamed from: a */
    public final void mo55890a() {
        this.f56446b.mo56656a();
    }

    /* renamed from: c */
    public final void mo55913c(boolean z) {
        this.f56446b.mo56677c(z);
    }

    /* renamed from: d */
    public final void mo55915d(boolean z) {
        this.f56446b.mo56679d(z);
    }

    /* renamed from: b */
    public final void mo55907b(Surface surface) {
        C7573i.m23587b(surface, "surface");
        this.f56446b.mo56671b(surface);
    }

    /* renamed from: b */
    public final void mo55910b(C7562b<? super Integer, C7581n> bVar) {
        C20927a aVar;
        this.f56451g = bVar;
        C21035j jVar = this.f56446b;
        if (bVar != null) {
            aVar = C20867d.m69896b(bVar);
        } else {
            aVar = null;
        }
        jVar.mo56674b((C20926h) aVar);
    }

    /* renamed from: b */
    public final boolean mo55911b(boolean z) {
        return this.f56446b.mo56675b(z);
    }

    public C20994d(C21035j jVar, String str) {
        C7573i.m23587b(str, "photoPath");
        this.f56455k = str;
        Object newProxyInstance = Proxy.newProxyInstance(C21035j.class.getClassLoader(), new Class[]{C21035j.class}, new C20996d(jVar));
        if (newProxyInstance != null) {
            this.f56446b = (C21035j) newProxyInstance;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
    }

    /* renamed from: a */
    public final int mo55886a(Surface surface, String str) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        return this.f56446b.mo56653a(surface, str);
    }

    /* renamed from: b */
    public final void mo55908b(Surface surface, String str) {
        this.f56446b.mo56672b(surface, str);
    }

    /* renamed from: b */
    public final void mo55909b(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C20927a aVar;
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        this.f56453i = bVar;
        C21035j jVar = this.f56446b;
        if (bVar != null) {
            aVar = C20867d.m69896b(bVar);
        } else {
            aVar = null;
        }
        jVar.mo56673b(surface, str, aVar);
    }

    /* renamed from: a */
    public final int mo55887a(String str, int i, int i2, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "strImagePath");
        C7573i.m23587b(bVar, "callback");
        this.f56448d = bVar;
        this.f56446b.mo56665a(str, i, i2, true, CompressFormat.PNG.ordinal(), (C20929i) C20852c.m69842a(bVar));
        return 0;
    }

    /* renamed from: a */
    public final int mo55888a(List<ASMediaSegment> list, String str, String str2, int i) {
        C7573i.m23587b(list, "mediaSegments");
        C7573i.m23587b(str, "videoDir");
        C21035j jVar = this.f56446b;
        Object[] array = list.toArray(new ASMediaSegment[0]);
        if (array != null) {
            return jVar.mo56654a((ASMediaSegment[]) array, str, str2, i);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public final RecorderConcatResult mo55889a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "coment");
        RecorderConcatResult a = this.f56446b.mo56655a(str, str2, str3, str4);
        if (a == null) {
            return new RecorderConcatResult(-1, "", "");
        }
        return a;
    }

    /* renamed from: a */
    public final int mo55883a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f56446b.mo56651a(d, z, f, i, i2, z2);
    }

    /* renamed from: a */
    public final void mo55891a(double d, boolean z, float f, int i, int i2, boolean z2, C7562b<? super Integer, C7581n> bVar) {
        C7562b<? super Integer, C7581n> bVar2 = bVar;
        C7573i.m23587b(bVar2, "callback");
        this.f56449e = bVar2;
        this.f56446b.mo56657a(d, z, f, i, i2, z2, C20867d.m69893a(bVar));
    }

    /* renamed from: a */
    public final int mo55884a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        String str3 = str;
        C7573i.m23587b(str, "path");
        String str4 = str2;
        C7573i.m23587b(str4, "strDetectModelsDir");
        return this.f56446b.mo56652a(i, i2, str3, i3, i4, str4, i5, z);
    }
}

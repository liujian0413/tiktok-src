package com.p280ss.android.ugc.asve.recorder.p922b;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p280ss.android.ugc.asve.C15395c;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.IASPathAdaptor;
import com.p280ss.android.ugc.asve.IASPathAdaptor.MediaType;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p280ss.android.ugc.asve.recorder.C20671a;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.vesdk.C45382z;
import com.p280ss.android.vesdk.C45382z.C45390b;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.VECameraSettings;
import com.p280ss.android.vesdk.VEException;
import com.p280ss.android.vesdk.VEListener.C45210f;
import com.p280ss.android.vesdk.VEListener.C45214j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.ugc.asve.recorder.b.d */
public final class C20681d implements C20676a {

    /* renamed from: a */
    public final C45382z f55844a;

    /* renamed from: b */
    public final C15432h f55845b;

    /* renamed from: c */
    private final VECameraSettings f55846c;

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$a */
    static final class C20682a implements C45214j {

        /* renamed from: a */
        final /* synthetic */ C7562b f55847a;

        C20682a(C7562b bVar) {
            this.f55847a = bVar;
        }

        /* renamed from: a */
        public final void mo55925a(int i, String str, String str2) {
            C7562b bVar = this.f55847a;
            if (bVar != null) {
                C7573i.m23582a((Object) str, "reallyVideoPath");
                C7573i.m23582a((Object) str2, "reallyAudioPath");
                bVar.invoke(new RecorderConcatResult(i, str, str2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$b */
    static final class C20683b implements C45214j {

        /* renamed from: a */
        final /* synthetic */ C7562b f55848a;

        C20683b(C7562b bVar) {
            this.f55848a = bVar;
        }

        /* renamed from: a */
        public final void mo55925a(int i, String str, String str2) {
            C7562b bVar = this.f55848a;
            if (bVar != null) {
                C7573i.m23582a((Object) str, "reallyVideoPath");
                C7573i.m23582a((Object) str2, "reallyAudioPath");
                bVar.invoke(new RecorderConcatResult(i, str, str2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$c */
    static final class C20684c extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        public static final C20684c f55849a = new C20684c();

        C20684c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$d */
    static final class C20685d implements C45210f {

        /* renamed from: a */
        final /* synthetic */ C7562b f55850a;

        C20685d(C7562b bVar) {
            this.f55850a = bVar;
        }

        /* renamed from: a */
        public final void mo55926a(int i) {
            C7562b bVar = this.f55850a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$e */
    static final class C20686e implements C45210f {

        /* renamed from: a */
        final /* synthetic */ C7562b f55851a;

        C20686e(C7562b bVar) {
            this.f55851a = bVar;
        }

        /* renamed from: a */
        public final void mo55926a(int i) {
            this.f55851a.invoke(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final int mo55884a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        C7573i.m23587b(str, "path");
        C7573i.m23587b(str2, "strDetectModelsDir");
        return 0;
    }

    /* renamed from: a */
    public final int mo55885a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        return 0;
    }

    /* renamed from: a */
    public final void mo55892a(float f) {
    }

    /* renamed from: a */
    public final void mo55893a(float f, int i, int i2) {
    }

    /* renamed from: a */
    public final void mo55894a(int i) {
    }

    /* renamed from: a */
    public final void mo55898a(String str) {
    }

    /* renamed from: b */
    public final int mo55905b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C7573i.m23587b(context, "context");
        return 0;
    }

    /* renamed from: b */
    public final void mo55907b(Surface surface) {
        C7573i.m23587b(surface, "surface");
    }

    /* renamed from: b */
    public final void mo55908b(Surface surface, String str) {
    }

    /* renamed from: e */
    public final void mo55917e(boolean z) {
    }

    /* renamed from: i */
    public final void mo55921i() {
    }

    /* renamed from: j */
    public final void mo55922j() {
    }

    /* renamed from: a */
    public final void mo55901a(String str, String str2, boolean z, String str3, String str4, C7562b<? super RecorderConcatResult, C7581n> bVar) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "coment");
        if (z) {
            this.f55844a.mo108658a((C45214j) new C20682a(bVar));
        } else {
            this.f55844a.mo108650a(0, str3, str4, (C45214j) new C20683b(bVar));
        }
    }

    /* renamed from: a */
    public final void mo55902a(List<ASMediaSegment> list, String str, String str2, int i, C45210f fVar) {
        C7573i.m23587b(list, "mediaSegments");
        C7573i.m23587b(str, "videoDir");
        C7573i.m23587b(fVar, "listener");
        C45382z zVar = this.f55844a;
        Iterable<ASMediaSegment> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (ASMediaSegment a : iterable) {
            arrayList.add(C20671a.m68498a(a));
        }
        zVar.mo108677a((List) arrayList, str2, i, 2, fVar);
    }

    /* renamed from: a */
    public final void mo55900a(String str, long j, long j2) {
        if (str != null) {
            IASPathAdaptor c = C6855a.m21306a().mo38946c();
            this.f55844a.mo108630a(c != null ? c.mo38738a(str, MediaType.AUDIO) : null, (int) j, -1, 2);
        }
    }

    /* renamed from: a */
    public final void mo55897a(C45393e eVar) {
        this.f55844a.mo108666a(eVar);
    }

    /* renamed from: a */
    public final void mo55904a(boolean z) {
        this.f55844a.mo108731j(z);
    }

    /* renamed from: a */
    public final void mo55899a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "strImagePath");
        C7573i.m23587b(compressFormat, "format");
        C7573i.m23587b(bVar, "callback");
        this.f55844a.mo108672a(str, i, i2, false, z, compressFormat, (C45390b) new C20688f(bVar));
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r1v0, types: [com.ss.android.ugc.asve.recorder.b.e] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55903a(kotlin.jvm.p357a.C7562b<? super java.lang.Integer, kotlin.C7581n> r3) {
        /*
            r2 = this;
            com.ss.android.vesdk.z r0 = r2.f55844a
            if (r3 == 0) goto L_0x000a
            com.ss.android.ugc.asve.recorder.b.e r1 = new com.ss.android.ugc.asve.recorder.b.e
            r1.<init>(r3)
            r3 = r1
        L_0x000a:
            com.ss.android.vesdk.VEListener$f r3 = (com.p280ss.android.vesdk.VEListener.C45210f) r3
            r0.mo108657a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.recorder.p922b.C20681d.mo55903a(kotlin.jvm.a.b):void");
    }

    /* renamed from: a */
    public final void mo55896a(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        this.f55844a.mo108655a(this.f55846c);
        this.f55844a.mo108652a(surface, (C45210f) new C20685d(bVar));
    }

    /* renamed from: a */
    public final void mo55895a(Surface surface) {
        this.f55844a.mo108696b(surface);
    }

    /* renamed from: c */
    public final long mo55912c() {
        return mo55919g();
    }

    /* renamed from: e */
    public final void mo55916e() {
        this.f55844a.mo108719f();
    }

    /* renamed from: f */
    public final void mo55918f() {
        this.f55844a.mo108736m();
    }

    /* renamed from: g */
    public final long mo55919g() {
        return this.f55844a.mo108726h();
    }

    /* renamed from: k */
    public final void mo55923k() {
        this.f55844a.mo108736m();
    }

    /* renamed from: b */
    public final void mo55906b() {
        this.f55844a.mo108732k();
    }

    /* renamed from: h */
    public final boolean mo55920h() {
        if (this.f55844a.mo108715e() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo55914d() {
        if (this.f55844a.mo108715e() == 3) {
            mo55903a((C7562b<? super Integer, C7581n>) C20684c.f55849a);
        }
        this.f55844a.mo108728i();
    }

    /* renamed from: a */
    public final void mo55890a() {
        this.f55844a.mo108730j();
    }

    /* renamed from: d */
    public final void mo55915d(boolean z) {
        this.f55844a.mo108692b(z);
    }

    /* renamed from: c */
    public final void mo55913c(boolean z) {
        this.f55844a.mo108737m(z);
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r1v0, types: [com.ss.android.ugc.asve.recorder.b.e] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55910b(kotlin.jvm.p357a.C7562b<? super java.lang.Integer, kotlin.C7581n> r3) {
        /*
            r2 = this;
            com.ss.android.vesdk.z r0 = r2.f55844a
            if (r3 == 0) goto L_0x000a
            com.ss.android.ugc.asve.recorder.b.e r1 = new com.ss.android.ugc.asve.recorder.b.e
            r1.<init>(r3)
            r3 = r1
        L_0x000a:
            com.ss.android.vesdk.VEListener$f r3 = (com.p280ss.android.vesdk.VEListener.C45210f) r3
            r0.mo108697b(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.recorder.p922b.C20681d.mo55910b(kotlin.jvm.a.b):void");
    }

    /* renamed from: b */
    public final boolean mo55911b(boolean z) {
        return this.f55844a.mo108733k(z);
    }

    /* renamed from: a */
    public final int mo55886a(Surface surface, String str) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        this.f55844a.mo108655a(this.f55846c);
        this.f55844a.mo108651a(surface);
        return 0;
    }

    public C20681d(C45382z zVar, C15432h hVar, VECameraSettings vECameraSettings) {
        C7573i.m23587b(zVar, "recorder");
        C7573i.m23587b(hVar, "recorderContext");
        C7573i.m23587b(vECameraSettings, "cameraSettings");
        this.f55844a = zVar;
        this.f55845b = hVar;
        this.f55846c = vECameraSettings;
    }

    /* renamed from: b */
    public final void mo55909b(Surface surface, String str, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(surface, "surface");
        C7573i.m23587b(str, "deviceName");
        mo55896a(surface, str, bVar);
    }

    /* renamed from: a */
    public final int mo55887a(String str, int i, int i2, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "strImagePath");
        C7573i.m23587b(bVar, "callback");
        mo55899a(str, i, i2, true, CompressFormat.PNG, bVar);
        return 0;
    }

    /* renamed from: a */
    public final int mo55888a(List<ASMediaSegment> list, String str, String str2, int i) {
        C7573i.m23587b(list, "mediaSegments");
        C7573i.m23587b(str, "videoDir");
        C45382z zVar = this.f55844a;
        Iterable<ASMediaSegment> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (ASMediaSegment a : iterable) {
            arrayList.add(C20671a.m68498a(a));
        }
        return zVar.mo108634a((List) arrayList, str2, i, 2);
    }

    /* renamed from: a */
    public final RecorderConcatResult mo55889a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        C7573i.m23587b(str3, "description");
        C7573i.m23587b(str4, "coment");
        try {
            String[] a = this.f55844a.mo108683a(0, str3, str4);
            String str5 = a[0];
            C7573i.m23582a((Object) str5, "contactResult[0]");
            String str6 = a[1];
            C7573i.m23582a((Object) str6, "contactResult[1]");
            return new RecorderConcatResult(0, str5, str6);
        } catch (VEException e) {
            C15395c b = C6855a.m21306a().mo38945b();
            StringBuilder sb = new StringBuilder("msg: ");
            sb.append(e.getMsgDes());
            sb.append(" ret: ");
            sb.append(e.getRetCd());
            b.mo38741b(sb.toString());
            return new RecorderConcatResult(e.getRetCd(), str, str2);
        }
    }

    /* renamed from: a */
    public final int mo55883a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f55844a.mo108616a((float) d);
    }

    /* renamed from: a */
    public final void mo55891a(double d, boolean z, float f, int i, int i2, boolean z2, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f55844a.mo108645a((float) d, (C45210f) new C20686e(bVar));
    }
}

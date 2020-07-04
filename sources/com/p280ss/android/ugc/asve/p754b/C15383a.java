package com.p280ss.android.ugc.asve.p754b;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import com.p280ss.android.ttve.model.MVInfoBean;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VECherEffectParam;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEEditor.GET_FRAMES_FLAGS;
import com.p280ss.android.vesdk.VEEditor.SCALE_MODE;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEEditor.SET_RANGE_MODE;
import com.p280ss.android.vesdk.VEEditor.VEState;
import com.p280ss.android.vesdk.VEEditorModel;
import com.p280ss.android.vesdk.VEListener.C45205a;
import com.p280ss.android.vesdk.VEListener.C45209e;
import com.p280ss.android.vesdk.VEListener.C45215k;
import com.p280ss.android.vesdk.VEListener.C45217m;
import com.p280ss.android.vesdk.VEListener.C45218n;
import com.p280ss.android.vesdk.VEListener.C45219o;
import com.p280ss.android.vesdk.VEListener.C45220p;
import com.p280ss.android.vesdk.VEListener.VEInfoStickerBufferListener;
import com.p280ss.android.vesdk.VEMVAudioInfo;
import com.p280ss.android.vesdk.VERecordData;
import com.p280ss.android.vesdk.VESize;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p280ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p280ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p280ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p280ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p280ss.android.vesdk.runtime.C45345b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.b.a */
public class C15383a implements C15389d {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C45219o> f39670a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C45329l> f39671b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<C45329l> f39672c;

    /* renamed from: d */
    private final C45219o f39673d;

    /* renamed from: e */
    private final C45329l f39674e;

    /* renamed from: f */
    private final C45329l f39675f;

    /* renamed from: g */
    private boolean f39676g;

    /* renamed from: h */
    private final VEEditor f39677h;

    /* renamed from: com.ss.android.ugc.asve.b.a$a */
    static final class C15384a implements C45219o {

        /* renamed from: a */
        final /* synthetic */ C15383a f39678a;

        C15384a(C15383a aVar) {
            this.f39678a = aVar;
        }

        /* renamed from: a */
        public final void mo38884a() {
            for (C45219o a : this.f39678a.f39670a) {
                a.mo38884a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.b.a$b */
    static final class C15385b implements C45329l {

        /* renamed from: a */
        final /* synthetic */ C15383a f39679a;

        C15385b(C15383a aVar) {
            this.f39679a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onCallback(int i, int i2, float f, String str) {
            for (C45329l onCallback : this.f39679a.f39671b) {
                onCallback.onCallback(i, i2, f, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.b.a$c */
    static final class C15386c implements C45329l {

        /* renamed from: a */
        final /* synthetic */ C15383a f39680a;

        C15386c(C15383a aVar) {
            this.f39680a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onCallback(int i, int i2, float f, String str) {
            for (C45329l onCallback : this.f39680a.f39672c) {
                onCallback.onCallback(i, i2, f, str);
            }
        }
    }

    /* renamed from: a */
    public final C45345b mo38796a() {
        C45345b bVar = this.f39677h.f116179a;
        C7573i.m23582a((Object) bVar, "editor.resManager");
        return bVar;
    }

    /* renamed from: b */
    public final long mo38822b() {
        return this.f39677h.mo107943d();
    }

    /* renamed from: a */
    public final void mo38802a(String[] strArr) {
        this.f39677h.mo107935b(strArr);
    }

    /* renamed from: a */
    public final void mo38800a(C45219o oVar) {
        C7573i.m23587b(oVar, "firstFrameListener");
        if (this.f39670a.isEmpty()) {
            this.f39677h.f116220e = oVar;
        }
        if (!m44741a(this.f39670a, (Object) oVar)) {
            this.f39670a.add(oVar);
        }
    }

    /* renamed from: a */
    public final void mo38801a(C45329l lVar) {
        C7573i.m23587b(lVar, "callback");
        if (this.f39671b.isEmpty()) {
            this.f39677h.mo107914a(this.f39674e);
        }
        if (!m44741a(this.f39671b, (Object) lVar)) {
            this.f39671b.add(lVar);
        }
    }

    /* renamed from: b */
    public final void mo38824b(C45329l lVar) {
        C7573i.m23587b(lVar, "callback");
        if (this.f39672c.isEmpty()) {
            this.f39677h.mo107934b(this.f39675f);
        }
        if (!m44741a(this.f39672c, (Object) lVar)) {
            this.f39672c.add(lVar);
        }
    }

    /* renamed from: a */
    public final void mo38798a(int i, int i2, int i3, int i4) {
        this.f39677h.mo107911a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final VESize mo38795a(int i, int i2) {
        VESize b = this.f39677h.mo107931b(i, i2);
        C7573i.m23582a((Object) b, "editor.getInitSize(surfaceWidth, surfaceHeight)");
        return b;
    }

    /* renamed from: a */
    public final void mo38797a(float f, float f2, float f3, int i, int i2) {
        this.f39677h.mo107909a(f, f2, f3, i, i2);
    }

    /* renamed from: a */
    public final Bitmap mo38794a(int i) {
        return this.f39677h.mo107907a(i);
    }

    /* renamed from: b */
    public final void mo38823b(int i) {
        this.f39677h.mo107933b(i);
    }

    /* renamed from: a */
    public final int mo38756a(int i, int i2, SET_RANGE_MODE set_range_mode) {
        C7573i.m23587b(set_range_mode, "mode");
        return this.f39677h.mo107864a(i, i2, set_range_mode);
    }

    /* renamed from: a */
    public final int mo38790a(boolean z) {
        return this.f39677h.mo107899a(z);
    }

    /* renamed from: a */
    public int mo38772a(C15390e eVar) {
        C7573i.m23587b(eVar, "param");
        int a = eVar.mo38886a(this.f39677h, this.f39676g);
        this.f39676g = true;
        return a;
    }

    /* renamed from: a */
    public final int mo38775a(VERecordData vERecordData, boolean z) {
        return this.f39677h.mo107883a(vERecordData, false);
    }

    /* renamed from: b */
    public final int mo38819b(boolean z) {
        return this.f39677h.mo107939c(z);
    }

    /* renamed from: a */
    public int mo38781a(String str, int i, int i2) {
        C7573i.m23587b(str, "path");
        return this.f39677h.mo107889a(str, i, i2);
    }

    /* renamed from: a */
    public final int mo38789a(String str, String[] strArr, String[] strArr2) {
        C7573i.m23587b(str, "mvPath");
        C7573i.m23587b(strArr, "resourcesFilePaths");
        C7573i.m23587b(strArr2, "resourcesTypes");
        return this.f39677h.mo107897a(str, strArr, strArr2);
    }

    /* renamed from: a */
    public final int mo38776a(C45255af afVar) {
        C7573i.m23587b(afVar, "sceneTime");
        return this.f39677h.mo107884a(afVar);
    }

    /* renamed from: a */
    public final int mo38777a(C45255af afVar, int i, int i2) {
        C7573i.m23587b(afVar, "sceneTime");
        return this.f39677h.mo107885a(afVar, i, i2);
    }

    /* renamed from: a */
    public final int mo38755a(int i, int i2, ROTATE_DEGREE rotate_degree) {
        C7573i.m23587b(rotate_degree, "degree");
        return this.f39677h.mo107863a(0, i2, rotate_degree);
    }

    /* renamed from: a */
    public final int mo38760a(int i, int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        C7573i.m23587b(arrayList, "clipSourceParams");
        C7573i.m23587b(arrayList2, "clipTimelineParams");
        return this.f39677h.mo107868a(0, i2, arrayList, arrayList2);
    }

    /* renamed from: a */
    public final int mo38757a(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4) {
        C7573i.m23587b(vEBaseFilterParam, "param");
        return this.f39677h.mo107865a(0, 0, vEBaseFilterParam, i3, i4);
    }

    /* renamed from: a */
    public final int mo38765a(int i, VEBaseFilterParam vEBaseFilterParam) {
        C7573i.m23587b(vEBaseFilterParam, "param");
        return this.f39677h.mo107873a(i, vEBaseFilterParam);
    }

    /* renamed from: a */
    public final int mo38791a(int[] iArr) {
        C7573i.m23587b(iArr, "filterIndexes");
        return this.f39677h.mo107900a(iArr);
    }

    /* renamed from: b */
    public final int mo38821b(String[] strArr) {
        return this.f39677h.mo107902a(strArr);
    }

    /* renamed from: a */
    public final int mo38793a(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            return -100;
        }
        return this.f39677h.mo107905a(strArr, strArr2);
    }

    /* renamed from: a */
    public final int mo38773a(SCALE_MODE scale_mode) {
        C7573i.m23587b(scale_mode, "mode");
        return this.f39677h.mo107880a(scale_mode);
    }

    /* renamed from: a */
    public final int mo38763a(int i, SEEK_MODE seek_mode) {
        C7573i.m23587b(seek_mode, "flags");
        return this.f39677h.mo107871a(i, seek_mode);
    }

    /* renamed from: a */
    public final int mo38764a(int i, SEEK_MODE seek_mode, C45217m mVar) {
        C7573i.m23587b(seek_mode, "flags");
        return this.f39677h.mo107872a(i, seek_mode, mVar);
    }

    /* renamed from: a */
    public int mo38783a(String str, int i, int i2, boolean z) {
        C7573i.m23587b(str, "file");
        return this.f39677h.mo107891a(str, i, i2, z);
    }

    /* renamed from: a */
    public final boolean mo38803a(int i, int i2, float f) {
        return this.f39677h.mo107915a(i, i2, f);
    }

    /* renamed from: a */
    public final int mo38788a(String str, String[] strArr) {
        C7573i.m23587b(str, "path");
        return this.f39677h.mo107896a(str, strArr);
    }

    /* renamed from: a */
    public final int mo38774a(VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        return this.f39677h.mo107882a(vEInfoStickerBufferListener);
    }

    /* renamed from: a */
    public final int mo38780a(String str, float f, float f2, float f3, float f4) {
        C7573i.m23587b(str, "path");
        return this.f39677h.mo107888a(str, 0.0f, 0.0f, 1.0f, 1.0f);
    }

    /* renamed from: b */
    public final int mo38818b(String str, float f, float f2, float f3, float f4) {
        C7573i.m23587b(str, "path");
        return this.f39677h.mo107929b(str, 0.0f, 0.0f, 1.0f, f4);
    }

    /* renamed from: a */
    public final int mo38770a(int i, float[] fArr) {
        C7573i.m23587b(fArr, "pos");
        return this.f39677h.mo107878a(i, fArr);
    }

    /* renamed from: a */
    public final int mo38779a(String str, float f) {
        return this.f39677h.mo107887a(str, 1.0f);
    }

    /* renamed from: a */
    public final int mo38785a(String str, String str2, float f) {
        return this.f39677h.mo107893a(str, str2, f);
    }

    /* renamed from: a */
    public final int mo38786a(String str, String str2, float f, float f2, float f3) {
        C7573i.m23587b(str, "leftFilterPath");
        C7573i.m23587b(str2, "rightFilterPath");
        return this.f39677h.mo107894a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final int mo38778a(String str) {
        return this.f39677h.mo107927b(str);
    }

    /* renamed from: a */
    public final int mo38766a(int i, String str) {
        return this.f39677h.mo107925b(i, str);
    }

    /* renamed from: a */
    public final int[] mo38807a(int[] iArr, int[] iArr2, String[] strArr) {
        C7573i.m23587b(iArr, "seqIns");
        C7573i.m23587b(iArr2, "seqOuts");
        C7573i.m23587b(strArr, "effectPaths");
        int[] a = this.f39677h.mo107919a(iArr, iArr2, strArr);
        C7573i.m23582a((Object) a, "editor.addFilterEffects(…ns, seqOuts, effectPaths)");
        return a;
    }

    /* renamed from: b */
    public final int mo38820b(int[] iArr) {
        C7573i.m23587b(iArr, "filterIndexes");
        return this.f39677h.mo107930b(iArr);
    }

    /* renamed from: a */
    public final int[] mo38806a(int i, int i2, VECherEffectParam vECherEffectParam) {
        C7573i.m23587b(vECherEffectParam, "param");
        int[] a = this.f39677h.mo107918a(0, 1, vECherEffectParam);
        C7573i.m23582a((Object) a, "editor.addCherEffect(trackIndex, trackType, param)");
        return a;
    }

    /* renamed from: a */
    public final int mo38759a(int i, int i2, String str, byte[] bArr, int i3, int i4, C45205a aVar) {
        String str2 = str;
        C7573i.m23587b(str, "path");
        C45205a aVar2 = aVar;
        C7573i.m23587b(aVar2, "preprocessListener");
        return this.f39677h.mo107867a(i, i2, str2, bArr, i3, i4, aVar2);
    }

    /* renamed from: a */
    public final int mo38784a(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "value");
        return this.f39677h.mo107892a(str, str2);
    }

    /* renamed from: a */
    public final void mo38799a(C45218n nVar) {
        this.f39677h.f116156A = nVar;
    }

    /* renamed from: a */
    public final int mo38792a(int[] iArr, int i, int i2, GET_FRAMES_FLAGS get_frames_flags, C45220p pVar) {
        C7573i.m23587b(iArr, "timeStamps");
        C7573i.m23587b(get_frames_flags, "flags");
        C7573i.m23587b(pVar, "listener");
        return this.f39677h.mo107901a(iArr, i, i2, get_frames_flags, pVar);
    }

    /* renamed from: a */
    public final boolean mo38805a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, C45215k kVar) {
        C7573i.m23587b(vEVideoEncodeSettings, "settings");
        return this.f39677h.mo107917a(str, str2, vEVideoEncodeSettings, kVar);
    }

    /* renamed from: a */
    public final boolean mo38804a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) {
        C7573i.m23587b(vEVideoEncodeSettings, "settings");
        return this.f39677h.mo107916a(str, (String) null, vEVideoEncodeSettings);
    }

    /* renamed from: a */
    public final int mo38782a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        C7573i.m23587b(str, "audioFilePath");
        C7573i.m23587b(vEAlgorithmPath, "veAlgorithmPath");
        return this.f39677h.mo107890a(str, i, i2, vEAlgorithmPath);
    }

    /* renamed from: a */
    public final int mo38761a(int i, int i2, boolean z, C45209e eVar) {
        return this.f39677h.mo107869a(i, 1, true, eVar);
    }

    /* renamed from: a */
    public final int[] mo38808a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2) {
        C7573i.m23587b(iArr, "seqIns");
        C7573i.m23587b(iArr2, "seqOuts");
        C7573i.m23587b(strArr, "effectPaths");
        C7573i.m23587b(iArr3, "stickerIds");
        C7573i.m23587b(iArr4, "reqIds");
        C7573i.m23587b(strArr2, "effectTags");
        int[] a = this.f39677h.mo107920a(iArr, iArr2, strArr, iArr3, iArr4, strArr2);
        C7573i.m23582a((Object) a, "editor.addFilterEffectsW…rIds, reqIds, effectTags)");
        return a;
    }

    /* renamed from: a */
    public final int mo38767a(int i, String str, int i2, int i3, String str2) {
        return this.f39677h.mo107875a(i, str, 0, 0, str2);
    }

    /* renamed from: a */
    public final int mo38762a(int i, ROTATE_DEGREE rotate_degree) {
        C7573i.m23587b(rotate_degree, "rotate");
        return this.f39677h.mo107870a(i, rotate_degree);
    }

    /* renamed from: a */
    public final int mo38758a(int i, int i2, String str) {
        C7573i.m23587b(str, "srt");
        return this.f39677h.mo107866a(i, i2, str);
    }

    /* renamed from: a */
    public final int mo38769a(int i, boolean z) {
        return this.f39677h.mo107877a(i, z);
    }

    /* renamed from: a */
    public final int mo38771a(int i, ByteBuffer[] byteBufferArr) {
        C7573i.m23587b(byteBufferArr, "byteBuffer");
        return this.f39677h.mo107879a(i, byteBufferArr);
    }

    /* renamed from: a */
    public final int mo38768a(int i, ByteBuffer byteBuffer) {
        return this.f39677h.mo107876a(i, byteBuffer);
    }

    /* renamed from: a */
    public final int mo38787a(String str, String str2, String str3) {
        C7573i.m23587b(str, "photoPath");
        C7573i.m23587b(str2, "algorithmType");
        C7573i.m23587b(str3, "filePath");
        return this.f39677h.mo107895a(str, str2, str3);
    }

    /* renamed from: A */
    public final int mo38744A() {
        return this.f39677h.mo107850D();
    }

    /* renamed from: B */
    public final int mo38745B() {
        return this.f39677h.mo107851E();
    }

    /* renamed from: C */
    public final int mo38746C() {
        return this.f39677h.mo107853G();
    }

    /* renamed from: f */
    public final int mo38842f() {
        return this.f39677h.f116225j;
    }

    /* renamed from: h */
    public final VEState mo38850h() {
        return this.f39677h.mo107977o();
    }

    /* renamed from: l */
    public final int mo38860l() {
        return this.f39677h.mo107993w();
    }

    /* renamed from: m */
    public final int mo38862m() {
        return this.f39677h.mo107994x();
    }

    /* renamed from: p */
    public final int mo38868p() {
        return this.f39677h.mo107966j();
    }

    /* renamed from: t */
    public final void mo38876t() {
        this.f39677h.mo107976n();
    }

    /* renamed from: u */
    public final int mo38878u() {
        return this.f39677h.mo107980p();
    }

    /* renamed from: v */
    public final int mo38879v() {
        return this.f39677h.mo107988t();
    }

    /* renamed from: w */
    public final int mo38880w() {
        return this.f39677h.mo107990u();
    }

    /* renamed from: x */
    public final int mo38881x() {
        return this.f39677h.mo107992v();
    }

    /* renamed from: y */
    public final int mo38882y() {
        return this.f39677h.mo107995y();
    }

    /* renamed from: z */
    public final int mo38883z() {
        return this.f39677h.mo107996z();
    }

    /* renamed from: g */
    public final VEMVAudioInfo mo38847g() {
        return this.f39677h.mo107960h();
    }

    /* renamed from: j */
    public final String[] mo38857j() {
        return this.f39677h.mo107985r();
    }

    /* renamed from: k */
    public final String[] mo38859k() {
        return this.f39677h.mo107987s();
    }

    /* renamed from: n */
    public final List<VEClipAlgorithmParam> mo38865n() {
        return this.f39677h.mo107852F();
    }

    /* renamed from: o */
    public final VEEditorModel mo38867o() {
        return this.f39677h.mo107963i();
    }

    /* renamed from: q */
    public final void mo38871q() {
        this.f39677h.mo107970k();
    }

    /* renamed from: r */
    public final void mo38873r() {
        this.f39677h.mo107972l();
    }

    /* renamed from: s */
    public final void mo38875s() {
        this.f39677h.mo107974m();
    }

    /* renamed from: d */
    public final Bitmap mo38835d() {
        return this.f39677h.mo107953f();
    }

    /* renamed from: e */
    public final MVInfoBean mo38840e() {
        MVInfoBean g = this.f39677h.mo107957g();
        C7573i.m23582a((Object) g, "editor.mvInfo");
        return g;
    }

    /* renamed from: i */
    public final String[] mo38855i() {
        return this.f39677h.mo107983q();
    }

    /* renamed from: c */
    public final VESize mo38828c() {
        VESize e = this.f39677h.mo107948e();
        C7573i.m23582a((Object) e, "editor.initSize");
        return e;
    }

    /* renamed from: a */
    public final int mo38747a(float f) {
        return this.f39677h.mo107855a(f);
    }

    /* renamed from: d */
    public final int mo38833d(int i) {
        return this.f39677h.mo107947e(i);
    }

    /* renamed from: i */
    public final int mo38853i(int i) {
        return this.f39677h.mo107981p(i);
    }

    /* renamed from: j */
    public final int mo38856j(int i) {
        return this.f39677h.mo107982q(i);
    }

    /* renamed from: k */
    public final int mo38858k(int i) {
        return this.f39677h.mo107984r(i);
    }

    /* renamed from: n */
    public final int mo38864n(int i) {
        return this.f39677h.mo107991u(i);
    }

    /* renamed from: o */
    public final int mo38866o(int i) {
        return this.f39677h.mo107967j(i);
    }

    /* renamed from: q */
    public final int mo38870q(int i) {
        return this.f39677h.mo107971l(i);
    }

    /* renamed from: r */
    public final float mo38872r(int i) {
        return this.f39677h.mo107973m(i);
    }

    /* renamed from: s */
    public final float mo38874s(int i) {
        return this.f39677h.mo107975n(i);
    }

    public C15383a(String str) {
        C7573i.m23587b(str, "workSpace");
        this(new VEEditor(str));
    }

    /* renamed from: b */
    public final float mo38809b(String str) {
        C7573i.m23587b(str, "filterPath");
        return this.f39677h.mo107854a(str);
    }

    /* renamed from: c */
    public final int mo38826c(String str) {
        C7573i.m23587b(str, "filePath");
        return this.f39677h.mo107938c(str);
    }

    /* renamed from: d */
    public final int mo38834d(String str) {
        C7573i.m23587b(str, "filePath");
        return this.f39677h.mo107942d(str);
    }

    /* renamed from: e */
    public final int mo38839e(boolean z) {
        return this.f39677h.mo107952f(z);
    }

    /* renamed from: f */
    public final int mo38843f(int i) {
        return this.f39677h.mo107955g(i);
    }

    /* renamed from: h */
    public final void mo38851h(boolean z) {
        this.f39677h.mo107964i(z);
    }

    /* renamed from: i */
    public final void mo38854i(boolean z) {
        this.f39677h.mo107968j(true);
    }

    /* renamed from: l */
    public final void mo38861l(int i) {
        this.f39677h.mo107986s(i);
    }

    /* renamed from: m */
    public final int mo38863m(int i) {
        return this.f39677h.mo107989t(i);
    }

    /* renamed from: p */
    public final void mo38869p(int i) {
        this.f39677h.mo107969k(i);
    }

    /* renamed from: t */
    public final boolean mo38877t(int i) {
        return this.f39677h.mo107978o(i);
    }

    /* renamed from: c */
    public final int mo38827c(int[] iArr) {
        C7573i.m23587b(iArr, "filterIndexes");
        return this.f39677h.mo107940c(iArr);
    }

    /* renamed from: g */
    public final void mo38848g(boolean z) {
        this.f39677h.mo107961h(z);
    }

    /* renamed from: h */
    public final float[] mo38852h(int i) {
        float[] i2 = this.f39677h.mo107965i(i);
        C7573i.m23582a((Object) i2, "editor.getInfoStickerBou…ngBoxWithoutRotate(index)");
        return i2;
    }

    public C15383a(VEEditor vEEditor) {
        C7573i.m23587b(vEEditor, "editor");
        this.f39670a = new CopyOnWriteArrayList<>();
        this.f39673d = new C15384a(this);
        this.f39671b = new CopyOnWriteArrayList<>();
        this.f39674e = new C15385b(this);
        this.f39672c = new CopyOnWriteArrayList<>();
        this.f39675f = new C15386c(this);
        this.f39677h = vEEditor;
    }

    /* renamed from: e */
    public final boolean mo38841e(int i) {
        return this.f39677h.mo107954f(i);
    }

    /* renamed from: f */
    public final void mo38845f(boolean z) {
        this.f39677h.mo107958g(true);
    }

    /* renamed from: g */
    public final float[] mo38849g(int i) {
        float[] h = this.f39677h.mo107962h(i);
        C7573i.m23582a((Object) h, "editor.getInfoStickerBoundingBox(index)");
        return h;
    }

    /* renamed from: c */
    public final void mo38829c(int i) {
        this.f39677h.mo107944d(i);
    }

    /* renamed from: d */
    public final void mo38837d(boolean z) {
        this.f39677h.mo107950e(z);
    }

    /* renamed from: c */
    public final void mo38831c(C45329l lVar) {
        C7573i.m23587b(lVar, "callback");
        this.f39672c.remove(lVar);
    }

    /* renamed from: c */
    public final void mo38832c(boolean z) {
        this.f39677h.mo107946d(z);
    }

    /* renamed from: b */
    public final int mo38810b(int i, float f) {
        return this.f39677h.mo107921b(i, f);
    }

    /* renamed from: c */
    public final int mo38825c(int i, float f) {
        return this.f39677h.mo107936c(i, f);
    }

    /* renamed from: e */
    public final int mo38838e(int i, int i2) {
        return this.f39677h.mo107956g(i, i2);
    }

    /* renamed from: g */
    public final int mo38846g(int i, int i2) {
        return this.f39677h.mo107951f(i, i2);
    }

    /* renamed from: a */
    public final int mo38748a(int i, float f) {
        return this.f39677h.mo107856a(i, f);
    }

    public C15383a(String str, SurfaceView surfaceView) {
        C7573i.m23587b(str, "workSpace");
        C7573i.m23587b(surfaceView, "surfaceView");
        this(new VEEditor(str, surfaceView));
    }

    /* renamed from: a */
    private static boolean m44741a(CopyOnWriteArrayList<?> copyOnWriteArrayList, Object obj) {
        for (Object obj2 : copyOnWriteArrayList) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int mo38844f(int i, int i2) {
        return this.f39677h.mo107959h(i, i2);
    }

    /* renamed from: b */
    public final int mo38812b(int i, int i2) {
        return this.f39677h.mo107937c(i, i2);
    }

    /* renamed from: d */
    public final void mo38836d(int i, int i2) {
        this.f39677h.mo107949e(i, i2);
    }

    public C15383a(String str, TextureView textureView) {
        C7573i.m23587b(str, "workSpace");
        C7573i.m23587b(textureView, "textureView");
        this(new VEEditor(str, textureView));
    }

    /* renamed from: c */
    public final void mo38830c(int i, int i2) {
        this.f39677h.mo107945d(i, i2);
    }

    /* renamed from: b */
    public final int mo38815b(int i, String str) {
        C7573i.m23587b(str, "fontPath");
        return this.f39677h.mo107874a(i, str);
    }

    /* renamed from: b */
    public final int mo38816b(int i, float[] fArr) {
        C7573i.m23587b(fArr, "pos");
        return this.f39677h.mo107926b(i, fArr);
    }

    /* renamed from: b */
    public final int mo38817b(String str, float f) {
        return this.f39677h.mo107928b(str, f);
    }

    /* renamed from: b */
    public final int mo38811b(int i, float f, float f2) {
        return this.f39677h.mo107922b(i, f, f2);
    }

    /* renamed from: a */
    public final int mo38749a(int i, float f, float f2) {
        return this.f39677h.mo107857a(i, f, f2);
    }

    public C15383a(String str, SurfaceView surfaceView, long j) {
        C7573i.m23587b(str, "workspace");
        C7573i.m23587b(surfaceView, "surfaceView");
        this(new VEEditor(str, surfaceView, j));
    }

    /* renamed from: a */
    public final int mo38750a(int i, int i2, int i3) {
        return this.f39677h.mo107858a(0, i2, i3);
    }

    /* renamed from: b */
    public final int mo38813b(int i, int i2, int i3) {
        return this.f39677h.mo107923b(i, i2, i3);
    }

    /* renamed from: a */
    public final int mo38754a(int i, int i2, int i3, boolean z) {
        return this.f39677h.mo107862a(i, i2, i3, z);
    }

    /* renamed from: a */
    public final int mo38752a(int i, int i2, int i3, int i4, int i5) {
        return this.f39677h.mo107860a(0, 0, i3, 3, 600);
    }

    /* renamed from: a */
    public final int mo38751a(int i, int i2, int i3, int i4, float f, float f2) {
        return this.f39677h.mo107859a(0, 0, i3, i4, 0.5f, 1.333f);
    }

    /* renamed from: b */
    public final int mo38814b(int i, int i2, int i3, int i4, int i5, boolean z) {
        return this.f39677h.mo107924b(i, i2, i3, i4, i5, z);
    }

    /* renamed from: a */
    public final int mo38753a(int i, int i2, int i3, int i4, int i5, boolean z) {
        return this.f39677h.mo107861a(i, i2, i3, i4, i5, z);
    }
}

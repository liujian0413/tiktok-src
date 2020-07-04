package com.p280ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ttve.model.C20461a;
import com.p280ss.android.ttve.model.C20462b;
import com.p280ss.android.ttve.model.C20463c;
import com.p280ss.android.ttve.model.C20464d;
import com.p280ss.android.ttve.model.C20465e;
import com.p280ss.android.vesdk.C45382z.C45389a;
import com.p280ss.android.vesdk.C45382z.C45390b;
import com.p280ss.android.vesdk.C45382z.C45391c;
import com.p280ss.android.vesdk.C45382z.C45392d;
import com.p280ss.android.vesdk.C45382z.C45394f;
import com.p280ss.android.vesdk.C45382z.C45396g;
import com.p280ss.android.vesdk.C45382z.C45397h;
import com.p280ss.android.vesdk.C45382z.C45398i;
import com.p280ss.android.vesdk.C45382z.C45399j;
import com.p280ss.android.vesdk.C45382z.C45400k;
import com.p280ss.android.vesdk.C45382z.C45401l;
import com.p280ss.android.vesdk.C45382z.C45403n;
import com.p280ss.android.vesdk.C45382z.C45404o;
import com.p280ss.android.vesdk.VEListener.C45207c;
import com.p280ss.android.vesdk.VEListener.C45208d;
import com.p280ss.android.vesdk.VEListener.C45210f;
import com.p280ss.android.vesdk.VEListener.C45211g;
import com.p280ss.android.vesdk.VEListener.C45224t;
import com.p280ss.android.vesdk.VEListener.C45226v;
import com.p280ss.android.vesdk.p1773a.C45248a;
import com.p280ss.android.vesdk.p1773a.C45249b;
import com.p280ss.android.vesdk.p1777e.C45310c;
import com.p280ss.android.vesdk.runtime.C45362d;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.g */
public abstract class C45319g {

    /* renamed from: A */
    C45362d f116677A;

    /* renamed from: B */
    public C45226v f116678B;

    /* renamed from: C */
    C45211g f116679C;

    /* renamed from: D */
    public C45208d f116680D;

    /* renamed from: E */
    C45396g f116681E;

    /* renamed from: F */
    public C45224t f116682F;

    /* renamed from: G */
    C45399j f116683G;

    /* renamed from: H */
    C45398i f116684H;

    /* renamed from: I */
    C45400k f116685I;

    /* renamed from: J */
    C1944a f116686J;

    /* renamed from: K */
    C45389a f116687K;

    /* renamed from: L */
    C45397h f116688L;

    /* renamed from: M */
    C45394f f116689M;

    /* renamed from: N */
    C45403n f116690N;

    /* renamed from: O */
    C45247a<C45404o> f116691O = new C45247a<>();

    /* renamed from: P */
    C45401l f116692P;

    /* renamed from: Q */
    C45207c f116693Q;

    /* renamed from: R */
    IStickerRequestCallback f116694R;

    /* renamed from: S */
    public VECameraSettings f116695S;

    /* renamed from: T */
    VEVideoEncodeSettings f116696T;

    /* renamed from: U */
    VEAudioEncodeSettings f116697U;

    /* renamed from: V */
    String f116698V;

    /* renamed from: W */
    public boolean f116699W;

    /* renamed from: X */
    C45330m f116700X;

    /* renamed from: Y */
    C45381y f116701Y;

    /* renamed from: Z */
    public VERecordMode f116702Z = VERecordMode.DEFAULT;

    /* renamed from: aa */
    String f116703aa;

    /* renamed from: ab */
    long f116704ab;

    /* renamed from: ac */
    long f116705ac;

    /* renamed from: ad */
    int f116706ad;

    /* renamed from: ae */
    int f116707ae = VEPreviewRadio.RADIO_FULL.ordinal();

    /* renamed from: af */
    VESize f116708af = null;

    /* renamed from: ag */
    boolean f116709ag = false;

    /* renamed from: ah */
    C20461a f116710ah = new C20461a();

    /* renamed from: ai */
    C20462b f116711ai = new C20462b();

    /* renamed from: aj */
    C20464d f116712aj = new C20464d();

    /* renamed from: ak */
    C20465e f116713ak = new C20465e();

    /* renamed from: al */
    C20463c f116714al = new C20463c();

    /* renamed from: am */
    C45256ag f116715am = new C45256ag();

    /* renamed from: an */
    public boolean f116716an;

    /* renamed from: ao */
    boolean f116717ao = false;

    /* renamed from: ap */
    VESize f116718ap = new VESize(0, 0);

    /* renamed from: aq */
    VESize f116719aq = new VESize(1280, 720);

    /* renamed from: ar */
    float f116720ar = 0.125f;

    /* renamed from: as */
    float f116721as = 0.125f;

    /* renamed from: at */
    public boolean f116722at = false;

    /* renamed from: au */
    boolean f116723au;

    /* renamed from: av */
    VEWatermarkParam f116724av;

    /* renamed from: y */
    Context f116725y;

    /* renamed from: z */
    public C45310c f116726z;

    /* renamed from: a */
    public abstract int mo108201a(double d, double d2, double d3, double d4);

    /* renamed from: a */
    public abstract int mo108202a(float f);

    /* renamed from: a */
    public abstract int mo108203a(float f, float f2);

    /* renamed from: a */
    public abstract int mo108204a(float f, float f2, float f3, float f4, float f5);

    /* renamed from: a */
    public abstract int mo108205a(int i, float f);

    /* renamed from: a */
    public abstract int mo108206a(int i, float f, float f2, int i2);

    /* renamed from: a */
    public abstract int mo108207a(int i, String str);

    /* renamed from: a */
    public int mo108343a(Bitmap bitmap) {
        return -1;
    }

    /* renamed from: a */
    public abstract int mo108208a(VEEffectParams vEEffectParams);

    /* renamed from: a */
    public abstract int mo108209a(C45391c cVar);

    /* renamed from: a */
    public abstract int mo108210a(C45392d dVar);

    /* renamed from: a */
    public abstract int mo108211a(String str);

    /* renamed from: a */
    public abstract int mo108212a(String str, float f);

    /* renamed from: a */
    public abstract int mo108213a(String str, float f, float f2);

    /* renamed from: a */
    public abstract int mo108214a(String str, float f, boolean z);

    /* renamed from: a */
    public abstract int mo108215a(String str, int i, int i2, String str2);

    /* renamed from: a */
    public abstract int mo108216a(String str, int i, int i2, boolean z, String str2);

    /* renamed from: a */
    public abstract int mo108217a(String str, int i, int i2, boolean z, boolean z2, CompressFormat compressFormat, C45390b bVar, boolean z3);

    /* renamed from: a */
    public abstract int mo108219a(String str, String str2, int i, String str3, String str4);

    /* renamed from: a */
    public abstract int mo108220a(String str, Map<Integer, Float> map);

    /* renamed from: a */
    public abstract int mo108222a(Map<Integer, Float> map);

    /* renamed from: a */
    public abstract int mo108223a(boolean z, boolean z2, boolean z3, boolean z4);

    /* renamed from: a */
    public abstract int mo108224a(double[] dArr, double d);

    /* renamed from: a */
    public abstract int mo108225a(String[] strArr, int i);

    /* renamed from: a */
    public abstract String mo108226a();

    /* renamed from: a */
    public abstract void mo108227a(double d);

    /* renamed from: a */
    public abstract void mo108228a(float f, float f2, float f3);

    /* renamed from: a */
    public abstract void mo108229a(float f, float f2, float f3, float f4);

    /* renamed from: a */
    public abstract void mo108231a(int i, float f, VESize vESize, VESize vESize2);

    /* renamed from: a */
    public abstract void mo108232a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract void mo108234a(int i, long j, long j2, String str);

    /* renamed from: a */
    public abstract void mo108239a(IStickerRequestCallback iStickerRequestCallback);

    /* renamed from: a */
    public abstract void mo108240a(VECherEffectParam vECherEffectParam);

    /* renamed from: a */
    public abstract void mo108247a(Runnable runnable);

    /* renamed from: a */
    public abstract void mo108248a(String str, String str2);

    /* renamed from: a */
    public abstract void mo108249a(String str, String str2, float f);

    /* renamed from: a */
    public abstract void mo108250a(String str, String str2, float f, float f2, float f3);

    /* renamed from: a */
    public abstract void mo108251a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract void mo108252a(boolean z, long j);

    /* renamed from: a */
    public abstract void mo108253a(float[] fArr);

    /* renamed from: a */
    public abstract int[] mo108254a(int i, int i2, int i3, int i4, float f);

    /* renamed from: b */
    public abstract int mo108255b(double d, double d2, double d3, double d4);

    /* renamed from: b */
    public abstract int mo108256b(float f);

    /* renamed from: b */
    public abstract int mo108257b(float f, float f2);

    /* renamed from: b */
    public abstract int mo108258b(C45392d dVar);

    /* renamed from: b */
    public abstract int mo108259b(String str);

    /* renamed from: b */
    public abstract int mo108260b(String str, float f, float f2);

    /* renamed from: b */
    public abstract int mo108261b(String str, String str2, float f);

    /* renamed from: b */
    public abstract int mo108262b(String[] strArr, int i);

    /* renamed from: b */
    public abstract void mo108263b();

    /* renamed from: b */
    public void mo108352b(int i) {
    }

    /* renamed from: b */
    public abstract boolean mo108266b(boolean z);

    /* renamed from: b */
    public abstract int[] mo108267b(String str, String str2);

    /* renamed from: c */
    public abstract float mo108269c(String str);

    /* renamed from: c */
    public abstract int mo108270c(double d, double d2, double d3, double d4);

    /* renamed from: c */
    public abstract int mo108271c(float f, float f2);

    /* renamed from: c */
    public abstract int mo108272c(String str, String str2);

    /* renamed from: c */
    public abstract void mo108273c();

    /* renamed from: c */
    public void mo108274c(int i) {
    }

    /* renamed from: c */
    public abstract void mo108275c(int i, int i2);

    /* renamed from: c */
    public abstract void mo108276c(Surface surface);

    /* renamed from: c */
    public abstract void mo108277c(boolean z);

    /* renamed from: d */
    public abstract int mo108278d(float f, float f2);

    /* renamed from: d */
    public abstract int mo108279d(Surface surface);

    /* renamed from: d */
    public abstract int mo108280d(String str);

    /* renamed from: d */
    public long mo108281d() {
        return 0;
    }

    /* renamed from: d */
    public void mo108355d(int i) {
    }

    /* renamed from: d */
    public abstract void mo108282d(boolean z);

    /* renamed from: d */
    public abstract boolean mo108283d(int i, int i2);

    /* renamed from: e */
    public int mo108356e() {
        return 0;
    }

    /* renamed from: e */
    public abstract int mo108284e(float f, float f2);

    /* renamed from: e */
    public abstract int mo108285e(int i, int i2);

    /* renamed from: e */
    public abstract int mo108286e(String str);

    /* renamed from: e */
    public abstract void mo108287e(boolean z);

    /* renamed from: f */
    public void mo108358f(String str) {
    }

    /* renamed from: f */
    public abstract void mo108289f(boolean z);

    /* renamed from: g */
    public abstract void mo108290g();

    /* renamed from: g */
    public abstract void mo108291g(boolean z);

    /* renamed from: g_ */
    public abstract void mo108292g_(boolean z);

    /* renamed from: h */
    public abstract void mo108293h();

    /* renamed from: h */
    public abstract void mo108294h(boolean z);

    /* renamed from: i */
    public abstract int mo108295i();

    /* renamed from: i */
    public abstract void mo108296i(boolean z);

    /* renamed from: j */
    public abstract void mo108297j();

    /* renamed from: j */
    public abstract void mo108298j(boolean z);

    /* renamed from: k */
    public abstract void mo108299k(boolean z);

    /* renamed from: k */
    public abstract boolean mo108300k();

    /* renamed from: l */
    public abstract int mo108301l(boolean z);

    /* renamed from: l */
    public abstract int[] mo108302l();

    /* renamed from: m */
    public abstract void mo108303m(boolean z);

    /* renamed from: m */
    public abstract int[] mo108304m();

    /* renamed from: n */
    public abstract float mo108305n();

    /* renamed from: n */
    public abstract void mo108306n(boolean z);

    /* renamed from: o */
    public void mo108307o() {
        this.f116683G = null;
    }

    /* renamed from: o */
    public abstract void mo108308o(boolean z);

    /* renamed from: p */
    public void mo108310p() {
        this.f116684H = null;
    }

    /* renamed from: p */
    public void mo108311p(boolean z) {
    }

    /* renamed from: q */
    public abstract EnigmaResult mo108312q();

    /* renamed from: r */
    public long mo108361r() {
        return 0;
    }

    /* renamed from: s */
    public void mo108363s(boolean z) {
    }

    /* renamed from: t */
    public void mo108365t(boolean z) {
    }

    /* renamed from: a */
    public int mo108345a(C45362d dVar) {
        this.f116677A = dVar;
        return 0;
    }

    /* renamed from: a */
    public void mo108346a(C45248a aVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: a */
    public final void mo108493a(C45330m mVar) {
        this.f116700X = mVar;
        this.f116702Z = VERecordMode.DUET;
    }

    /* renamed from: a */
    public final void mo108494a(C45381y yVar) {
        this.f116701Y = yVar;
        this.f116702Z = VERecordMode.REACTION;
    }

    /* renamed from: a */
    public void mo108243a(C45394f fVar) {
        this.f116689M = fVar;
    }

    /* renamed from: a */
    public int mo108218a(String str, long j, long j2, int i) {
        this.f116703aa = str;
        this.f116704ab = j;
        this.f116705ac = j2;
        this.f116706ad = i;
        return 0;
    }

    /* renamed from: a */
    public int mo108221a(List<C45254ae> list, String str, int i, int i2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo108350a(List<C45254ae> list, String str, int i, int i2, C45210f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo108237a(Surface surface, C45210f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo108241a(C45210f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo108230a(float f, C45210f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: b */
    public void mo108265b(C45210f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo108349a(String str, String str2, int i, String str3, String str4, C45210f fVar) {
        fVar.mo55926a(-1);
    }

    /* renamed from: a */
    public void mo108242a(C45256ag agVar) {
        this.f116715am = agVar;
    }

    /* renamed from: a */
    public void mo108347a(C45249b bVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo108246a(C45399j jVar) {
        this.f116683G = jVar;
    }

    /* renamed from: b */
    public void mo108354b(C45399j jVar) {
        this.f116683G = null;
    }

    /* renamed from: a */
    public void mo108245a(C45398i iVar) {
        this.f116684H = iVar;
    }

    /* renamed from: a */
    public void mo108244a(C45397h hVar) {
        this.f116688L = hVar;
    }

    /* renamed from: a */
    public void mo108238a(C1944a aVar) {
        this.f116686J = aVar;
    }

    /* renamed from: a */
    public void mo108348a(C45336r rVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: b */
    public void mo108353b(C45336r rVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: a */
    public void mo108351a(float[] fArr, double d) {
        mo108253a(fArr);
    }

    /* renamed from: a */
    public final void mo108495a(C45404o oVar) {
        if (oVar != null) {
            this.f116691O.mo108184a(oVar);
        }
    }

    /* renamed from: b */
    public final void mo108496b(C45404o oVar) {
        this.f116691O.mo108186b(oVar);
    }

    /* renamed from: f */
    public void mo108288f() {
        this.f116679C = null;
        this.f116681E = null;
        this.f116682F = null;
        this.f116678B = null;
        this.f116680D = null;
        this.f116689M = null;
        this.f116683G = null;
        this.f116684H = null;
        this.f116685I = null;
        this.f116687K = null;
        this.f116686J = null;
        this.f116688L = null;
        this.f116690N = null;
        this.f116692P = null;
        this.f116693Q = null;
        this.f116725y = null;
        this.f116726z = null;
    }

    /* renamed from: r */
    public int mo108360r(boolean z) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public C45319g(Context context, C45362d dVar, C45310c cVar) {
        this.f116725y = context;
        this.f116677A = dVar;
        this.f116726z = cVar;
    }

    /* renamed from: a */
    public int mo108344a(C45248a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C45378w wVar, String str, String str2) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }
}

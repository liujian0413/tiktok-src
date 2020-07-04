package com.p280ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.C19721f;
import com.p280ss.android.medialib.FaceBeautyInvoker;
import com.p280ss.android.medialib.FaceBeautyInvoker.EffectAlgorithmCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.FaceInfoCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextBitmapCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19632d;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19633e;
import com.p280ss.android.medialib.common.C19702a.C19703a;
import com.p280ss.android.medialib.common.C19702a.C19704b;
import com.p280ss.android.medialib.common.C19705b;
import com.p280ss.android.medialib.model.C19753a;
import com.p280ss.android.medialib.model.C19755c;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.model.FaceAttributeInfo;
import com.p280ss.android.medialib.model.FaceDetectInfo;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.medialib.presenter.C19762b;
import com.p280ss.android.medialib.presenter.C19763c;
import com.p280ss.android.medialib.presenter.C19764d;
import com.p280ss.android.medialib.presenter.C19764d.C19779b;
import com.p280ss.android.medialib.presenter.C19764d.C19780c;
import com.p280ss.android.medialib.presenter.C19764d.C19781d;
import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ttve.model.VEFrame;
import com.p280ss.android.ttve.model.VEFrame.ETEPixelFormat;
import com.p280ss.android.vesdk.C45382z.C45390b;
import com.p280ss.android.vesdk.C45382z.C45391c;
import com.p280ss.android.vesdk.C45382z.C45392d;
import com.p280ss.android.vesdk.C45382z.C45394f;
import com.p280ss.android.vesdk.C45382z.C45394f.C45395a;
import com.p280ss.android.vesdk.C45382z.C45397h;
import com.p280ss.android.vesdk.C45382z.C45398i;
import com.p280ss.android.vesdk.C45382z.C45399j;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import com.p280ss.android.vesdk.VEListener.C45210f;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import com.p280ss.android.vesdk.faceinfo.C45314b;
import com.p280ss.android.vesdk.faceinfo.C45317d;
import com.p280ss.android.vesdk.model.BefTextLayout;
import com.p280ss.android.vesdk.model.BefTextLayoutResult;
import com.p280ss.android.vesdk.p1777e.C45308a;
import com.p280ss.android.vesdk.p1777e.C45309b;
import com.p280ss.android.vesdk.p1777e.C45310c;
import com.p280ss.android.vesdk.p1777e.C45311d;
import com.p280ss.android.vesdk.runtime.C45362d;
import com.p280ss.android.vesdk.utils.C45376c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.libsdl.app.AudioPlayerFS.ICompletionCallback;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.vesdk.b */
public final class C45257b extends C45319g implements C19622b, C19761a, C19762b, C45311d, ICompletionCallback, AudioRecorderInterface {

    /* renamed from: a */
    final List<C19755c> f116450a = new ArrayList();

    /* renamed from: b */
    C19667g f116451b;

    /* renamed from: c */
    public C19764d f116452c;

    /* renamed from: d */
    SurfaceView f116453d;

    /* renamed from: e */
    TextureView f116454e;

    /* renamed from: f */
    public boolean f116455f = false;

    /* renamed from: g */
    public long f116456g = 0;

    /* renamed from: h */
    C45378w f116457h;

    /* renamed from: i */
    private String f116458i = "IESurfaceVideoRecorder";

    /* renamed from: j */
    private int f116459j;

    /* renamed from: k */
    private C45271a f116460k;

    /* renamed from: l */
    private boolean f116461l = true;

    /* renamed from: m */
    private float f116462m = 1.0f;

    /* renamed from: n */
    private String f116463n;

    /* renamed from: o */
    private boolean f116464o = false;

    /* renamed from: p */
    private long f116465p = -1;

    /* renamed from: q */
    private boolean f116466q;

    /* renamed from: com.ss.android.vesdk.b$a */
    public static class C45271a {

        /* renamed from: a */
        public boolean f116495a = true;

        /* renamed from: b */
        public Surface f116496b;

        public C45271a(Surface surface, boolean z) {
            this.f116496b = surface;
        }
    }

    /* renamed from: a */
    public final void mo108231a(int i, float f, VESize vESize, VESize vESize2) {
    }

    /* renamed from: c */
    public final void mo108277c(boolean z) {
    }

    public final void lackPermission() {
    }

    public final void onComplete(boolean z) {
    }

    /* renamed from: q */
    public final EnigmaResult mo108312q() {
        return null;
    }

    public final void recordStatus(boolean z) {
    }

    /* renamed from: a */
    public final void mo52205a(int i, int i2) {
        if (this.f116678B != null) {
            this.f116678B.mo55872a(i != 0);
        }
    }

    /* renamed from: a */
    public final void mo52204a(int i) {
        if (m142792v()) {
            int i2 = this.f116696T.getVideoRes().f116385a;
            int i3 = this.f116696T.getVideoRes().f116386b;
            float[] fArr = this.f116701Y.f116900c;
            float f = (float) i3;
            float f2 = (float) i2;
            this.f116452c.mo52980b((int) (fArr[0] * f), (int) (fArr[1] * f), (int) (fArr[2] * f2), (int) (fArr[3] * f2));
            this.f116452c.mo53001d(2, 0);
            float[] fArr2 = this.f116701Y.f116901d;
            this.f116452c.mo52960a(0, 0, (int) (fArr2[2] * f2), (int) (fArr2[3] * f));
        }
        if (this.f116678B != null) {
            this.f116678B.mo55871a(i, "onNativeInitCallBack");
        }
        if (i >= 0) {
            if (!this.f116457h.f116889e) {
                mo108207a(this.f116710ah.f55267a, this.f116710ah.f55268b);
                mo108203a(this.f116710ah.f55269c, this.f116710ah.f55270d);
                if (this.f116712aj.f55289g) {
                    if (!TextUtils.isEmpty(this.f116712aj.f55283a) && !TextUtils.isEmpty(this.f116712aj.f55284b)) {
                        mo108250a(this.f116712aj.f55283a, this.f116712aj.f55284b, this.f116712aj.f55285c, this.f116712aj.f55286d, this.f116712aj.f55287e);
                    } else if (!TextUtils.isEmpty(this.f116712aj.f55283a)) {
                        this.f116452c.mo52984b(this.f116712aj.f55283a, this.f116712aj.f55286d);
                    }
                } else if (!TextUtils.isEmpty(this.f116712aj.f55283a) && !TextUtils.isEmpty(this.f116712aj.f55284b)) {
                    mo108249a(this.f116712aj.f55283a, this.f116712aj.f55284b, this.f116712aj.f55285c);
                } else if (!TextUtils.isEmpty(this.f116712aj.f55283a)) {
                    this.f116452c.mo53008e(this.f116712aj.f55283a);
                    if (!this.f116712aj.f55288f) {
                        this.f116452c.mo53039k(this.f116712aj.f55286d);
                    }
                }
                mo108213a(this.f116713ak.f55290a, this.f116713ak.f55291b, this.f116713ak.f55292c);
                mo108220a(this.f116713ak.f55290a, this.f116713ak.f55293d);
                mo108260b(this.f116714al.f55278a, this.f116714al.f55279b, this.f116714al.f55280c);
                if (!TextUtils.isEmpty(this.f116714al.f55278a)) {
                    mo108205a(19, this.f116714al.f55281d);
                    mo108205a(20, this.f116714al.f55282e);
                }
                mo108216a(this.f116711ai.f55271a, this.f116711ai.f55273c, this.f116711ai.f55274d, this.f116711ai.f55276f, this.f116711ai.f55275e);
            }
            int a = this.f116452c.mo52890a(this.f116450a.size(), this.f116463n);
            if (a != 0) {
                String str = this.f116458i;
                StringBuilder sb = new StringBuilder("tryRestore ret: ");
                sb.append(a);
                C45372t.m143409d(str, sb.toString());
            } else {
                this.f116456g = (long) C19755c.m65125a(this.f116450a);
            }
            m142789s();
            mo108243a(this.f116689M);
        }
    }

    /* renamed from: a */
    public final void mo108235a(Surface surface) {
        this.f116466q = false;
        C45372t.m143405b(this.f116458i, "surfaceCreated");
        this.f116453d.getHolder().setType(3);
        this.f116460k = new C45271a(this.f116453d.getHolder().getSurface(), true);
        m142787a(this.f116453d != null ? this.f116453d.getHolder() : null);
        this.f116453d.setLayoutParams(this.f116453d.getLayoutParams());
        this.f116453d.requestLayout();
    }

    /* renamed from: a */
    public final void mo108236a(Surface surface, int i, int i2, int i3) {
        if (this.f116726z != null && this.f116726z.f116625f) {
            this.f116452c.mo52893a(surface);
            this.f116452c.mo53007e(2);
        }
    }

    /* renamed from: b */
    public final void mo108264b(Surface surface) {
        mo108297j();
        this.f116466q = true;
    }

    /* renamed from: a */
    public final String mo108226a() {
        if (m142791u()) {
            return this.f116700X.f116753b;
        }
        return null;
    }

    /* renamed from: a */
    public final int mo108218a(String str, long j, long j2, int i) {
        super.mo108218a(str, j, j2, i);
        if (this.f116702Z == VERecordMode.DEFAULT) {
            this.f116452c.mo52919a(str).mo52918a(j, 0).mo52920a(i == 1);
            if (TextUtils.isEmpty(this.f116703aa)) {
                this.f116452c.mo52967b(this.f116725y.getApplicationContext(), 1, (AudioRecorderInterface) this);
            } else {
                this.f116452c.mo52967b(this.f116725y.getApplicationContext(), 5, (AudioRecorderInterface) this);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo108242a(C45256ag agVar) {
        super.mo108242a(agVar);
        if (agVar.f116448a > -1.0f) {
            this.f116452c.mo52916a(agVar.f116448a);
        }
        this.f116452c.mo52976b(agVar.f116449b);
    }

    /* renamed from: a */
    public final int mo108217a(String str, int i, int i2, final boolean z, boolean z2, CompressFormat compressFormat, final C45390b bVar, boolean z3) {
        String str2 = this.f116458i;
        StringBuilder sb = new StringBuilder("shot screen save to ");
        sb.append(str);
        C45372t.m143405b(str2, sb.toString());
        if (i > 720) {
            final C45390b bVar2 = bVar;
            final String str3 = str;
            final CompressFormat compressFormat2 = compressFormat;
            final boolean z4 = z;
            final C452709 r0 = new C19780c() {
                /* renamed from: a */
                public final void mo53072a(Bitmap bitmap, int i) {
                    bVar2.mo55927a(i);
                    if (i == 0 && bitmap != null) {
                        C19705b.m64964a(bitmap, str3, compressFormat2);
                    }
                    if (i != 0 || z4) {
                        C19667g.m64797b().mo52338k();
                    }
                }
            };
            this.f116452c.mo52925a(i, i2, 0, (C19781d) new C19781d() {
                /* renamed from: a */
                public final void mo53074a(Bitmap bitmap) {
                    r0.mo53072a(bitmap, 0);
                }

                /* renamed from: a */
                public final void mo53073a(int i, int i2) {
                    if (i2 < 0) {
                        r0.mo53072a(null, i2);
                    }
                }
            });
            return 0;
        }
        C452581 r5 = new C19704b() {
            /* renamed from: a */
            public final void mo52404a(int i) {
                bVar.mo55927a(i);
            }
        };
        return this.f116452c.mo52909a(str, new int[]{i, i2}, z2, compressFormat, (C19704b) r5);
    }

    /* renamed from: a */
    public final int mo108207a(int i, String str) {
        this.f116710ah.f55267a = i;
        this.f116710ah.f55268b = str;
        this.f116452c.mo52981b(i, str);
        return 0;
    }

    /* renamed from: a */
    public final int mo108205a(int i, float f) {
        switch (i) {
            case 1:
                this.f116710ah.f55270d = f;
                break;
            case 2:
                this.f116710ah.f55269c = f;
                break;
            case 4:
                this.f116713ak.f55291b = f;
                break;
            case 5:
                this.f116713ak.f55292c = f;
                break;
            case 17:
                this.f116714al.f55279b = f;
                break;
            case 18:
                this.f116714al.f55280c = f;
                break;
            case 19:
                this.f116714al.f55281d = f;
                break;
            case 20:
                this.f116714al.f55282e = f;
                break;
        }
        return this.f116452c.mo52887a(i, f);
    }

    /* renamed from: a */
    public final int mo108216a(String str, int i, int i2, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        int a = this.f116452c.mo52904a(str, i, i2, z, str2);
        this.f116711ai.f55271a = str;
        this.f116711ai.f55272b = false;
        this.f116711ai.f55275e = str2;
        this.f116711ai.f55273c = i;
        this.f116711ai.f55274d = i2;
        this.f116711ai.f55276f = z;
        return a;
    }

    /* renamed from: a */
    public final void mo108239a(IStickerRequestCallback iStickerRequestCallback) {
        this.f116694R = iStickerRequestCallback;
    }

    /* renamed from: a */
    public final int mo108213a(String str, float f, float f2) {
        int i;
        if (TextUtils.isEmpty(str)) {
            str = "";
            i = this.f116452c.mo52901a("", 0.0f, 0.0f);
        } else {
            i = this.f116452c.mo52901a(str, f, f2);
        }
        this.f116713ak.f55290a = str;
        this.f116713ak.f55291b = f;
        this.f116713ak.f55292c = f2;
        return i;
    }

    /* renamed from: a */
    public final int mo108211a(String str) {
        this.f116713ak.f55290a = str;
        return this.f116452c.mo52998d(str);
    }

    /* renamed from: a */
    public final int mo108222a(Map<Integer, Float> map) {
        this.f116713ak.mo55135a(map);
        this.f116452c.mo52952a(map);
        return 0;
    }

    /* renamed from: a */
    public final int mo108220a(String str, Map<Integer, Float> map) {
        this.f116713ak.f55290a = str;
        this.f116713ak.mo55135a(map);
        this.f116452c.mo52951a(str, map);
        return 0;
    }

    /* renamed from: b */
    public final boolean mo108266b(boolean z) {
        return this.f116452c.mo53046m(z);
    }

    /* renamed from: a */
    public final int mo108212a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f116452c.mo52984b(str, f);
        this.f116712aj.f55283a = str;
        this.f116712aj.f55284b = str;
        this.f116712aj.f55286d = f;
        this.f116712aj.f55287e = f;
        this.f116712aj.f55288f = false;
        this.f116712aj.f55285c = 1.0f;
        this.f116712aj.f55289g = true;
        return 0;
    }

    /* renamed from: a */
    public final int mo108214a(String str, float f, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f116452c.mo53008e("");
            str = "";
        } else {
            this.f116452c.mo53008e(str);
            if (!z) {
                this.f116452c.mo53039k(f);
            }
        }
        this.f116712aj.f55283a = str;
        this.f116712aj.f55284b = str;
        this.f116712aj.f55286d = f;
        this.f116712aj.f55287e = f;
        this.f116712aj.f55288f = z;
        this.f116712aj.f55285c = 1.0f;
        this.f116712aj.f55289g = false;
        return 0;
    }

    /* renamed from: a */
    public final void mo108249a(String str, String str2, float f) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        this.f116712aj.f55283a = str;
        this.f116712aj.f55284b = str2;
        this.f116712aj.f55285c = f;
        this.f116712aj.f55288f = true;
        this.f116712aj.f55286d = -1.0f;
        this.f116712aj.f55287e = -1.0f;
        this.f116712aj.f55289g = false;
        this.f116452c.mo52948a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo108250a(String str, String str2, float f, float f2, float f3) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String str3 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str4 = str2;
        this.f116712aj.f55283a = str3;
        this.f116712aj.f55284b = str4;
        this.f116712aj.f55285c = f;
        this.f116712aj.f55288f = true;
        this.f116712aj.f55287e = f3;
        this.f116712aj.f55286d = f2;
        this.f116712aj.f55289g = true;
        this.f116452c.mo52949a(str3, str4, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo108233a(int i, int i2, String str) {
        if (this.f116679C != null) {
            this.f116679C.mo55987a(i2);
        }
    }

    /* renamed from: a */
    public final int mo108221a(List<C45254ae> list, String str, int i, int i2) {
        mo108218a(str, (long) i, this.f116705ac, i2);
        this.f116450a.clear();
        this.f116450a.addAll(m142785a(list));
        this.f116456g = (long) C19755c.m65125a(this.f116450a);
        return this.f116452c.mo52890a(list.size(), this.f116463n);
    }

    /* renamed from: a */
    public final void mo108237a(Surface surface, C45210f fVar) {
        C45372t.m143407c(this.f116458i, "startPreviewAsync is now not asynchronous!!!");
        mo108276c(surface);
        if (fVar != null) {
            fVar.mo55926a(0);
        }
    }

    /* renamed from: a */
    public final void mo108241a(C45210f fVar) {
        C45372t.m143407c(this.f116458i, "stopPreviewAsync is now not asynchronous!!!");
        mo108297j();
        if (fVar != null) {
            fVar.mo55926a(0);
        }
    }

    /* renamed from: a */
    public final void mo108230a(float f, C45210f fVar) {
        C45372t.m143407c(this.f116458i, "startRecordAsync is now not asynchronous!!!");
        int a = mo108202a(f);
        if (fVar != null) {
            fVar.mo55926a(a);
        }
    }

    /* renamed from: b */
    public final void mo108265b(C45210f fVar) {
        C45372t.m143407c(this.f116458i, "stopRecordAsync is now not asynchronous!!!");
        int i = mo108295i();
        if (fVar != null) {
            fVar.mo55926a(i);
        }
    }

    /* renamed from: b */
    public final void mo52872b(int i, int i2) {
        C45372t.m143405b(this.f116458i, "previewSize");
        m142789s();
    }

    /* renamed from: a */
    public final void mo108247a(Runnable runnable) {
        if (this.f116452c != null) {
            C19764d.m65155a(runnable);
        }
    }

    /* renamed from: a */
    public final void mo108227a(double d) {
        if (this.f116452c != null) {
            this.f116452c.mo52977b(d);
        }
    }

    /* renamed from: a */
    public final void mo108251a(String str, String str2, String str3) {
        String str4 = this.f116458i;
        StringBuilder sb = new StringBuilder("setCustomVideoBg: videoPath = ");
        sb.append(str2);
        sb.append(", audioPath = ");
        sb.append(str3);
        C45372t.m143403a(str4, sb.toString());
        if (this.f116452c != null) {
            this.f116702Z = !TextUtils.isEmpty(str2) ? VERecordMode.CUSTOM_VIDEO_BG : VERecordMode.DEFAULT;
            this.f116452c.mo52930a(this.f116725y, str, str2, str3);
        }
    }

    /* renamed from: a */
    public final void mo108232a(int i, int i2, int i3, int i4) {
        if (this.f116452c != null) {
            this.f116452c.mo52980b(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final int[] mo108254a(int i, int i2, int i3, int i4, float f) {
        if (this.f116452c != null) {
            return this.f116452c.mo52961a(i, i2, i3, i4, f);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo108219a(String str, String str2, int i, String str3, String str4) {
        return this.f116452c.mo52905a(str, str2, i, str3, str4);
    }

    /* renamed from: a */
    public final void mo108246a(final C45399j jVar) {
        this.f116452c.mo52954a(true, (FaceInfoCallback) new FaceInfoCallback() {
            public final void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo) {
                jVar.mo56381a(C45314b.m143103a(faceAttributeInfo), C45317d.m143104a(faceDetectInfo));
            }
        });
    }

    /* renamed from: a */
    public final void mo108245a(final C45398i iVar) {
        super.mo108245a(iVar);
        this.f116452c.mo52933a((EffectAlgorithmCallback) new EffectAlgorithmCallback() {
            public final void onResult(int[] iArr, long[] jArr, float f) {
                SparseArray sparseArray = new SparseArray();
                for (int i = 0; i < iArr.length; i++) {
                    sparseArray.put(iArr[i], Long.valueOf(jArr[i]));
                }
                iVar.mo56379a(sparseArray, f);
            }
        });
    }

    /* renamed from: a */
    public final void mo108244a(final C45397h hVar) {
        super.mo108244a(hVar);
        this.f116452c.mo52934a((OnCherEffectParmaCallback) new OnCherEffectParmaCallback() {
            public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
                hVar.mo56128a(strArr, dArr, zArr);
            }
        });
    }

    /* renamed from: a */
    public final void mo108240a(VECherEffectParam vECherEffectParam) {
        this.f116452c.mo52958a(vECherEffectParam.getMatrix(), vECherEffectParam.getDuration(), vECherEffectParam.getSegUseCher());
    }

    /* renamed from: a */
    public final void mo108234a(int i, long j, long j2, String str) {
        this.f116452c.mo52926a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo108238a(C1944a aVar) {
        super.mo108238a(aVar);
        FaceBeautyInvoker.setMessageListener(aVar);
    }

    /* renamed from: a */
    public final void mo108253a(float[] fArr) {
        C19721f.m65022a().mo52426a(fArr);
    }

    /* renamed from: a */
    public final void mo108228a(float f, float f2, float f3) {
        this.f116452c.mo52922a(f, f2, f3);
    }

    /* renamed from: a */
    public final int mo108223a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f116452c.mo52910a(false, 0, z, z2, z3, z4, "");
    }

    /* renamed from: a */
    public final int mo108224a(double[] dArr, double d) {
        return this.f116452c.mo52912a(dArr, d);
    }

    /* renamed from: a */
    public final int mo108204a(float f, float f2, float f3, float f4, float f5) {
        return this.f116452c.mo52886a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final int mo108215a(String str, int i, int i2, String str2) {
        return this.f116452c.mo52971b(str, i, i2, str2);
    }

    /* renamed from: a */
    public final int mo108210a(final C45392d dVar) {
        return this.f116452c.mo52897a((OnARTextCountCallback) new OnARTextCountCallback() {
            public final void onResult(int i) {
                if (dVar != null) {
                    dVar.mo56129a(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final int mo108209a(final C45391c cVar) {
        this.f116452c.mo52895a((OnARTextBitmapCallback) new OnARTextBitmapCallback() {
            public final BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
                if (cVar != null) {
                    return cVar.mo38739a(str, befTextLayout);
                }
                return null;
            }
        });
        return 0;
    }

    /* renamed from: a */
    public final void mo108243a(final C45394f fVar) {
        super.mo108243a(fVar);
        if (fVar == null) {
            this.f116452c.mo52943a((C19779b) null);
            return;
        }
        final C45395a a = fVar.mo108751a();
        this.f116452c.mo52944a((C19779b) new C19779b() {
            public final boolean bW_() {
                return a.f116916a;
            }

            /* renamed from: a */
            public final void mo53070a(C19753a aVar) {
                VEFrame vEFrame;
                if (aVar.f53610c == ETEPixelFormat.TEPixFmt_OpenGL_RGBA8.ordinal()) {
                    vEFrame = VEFrame.createTextureFrame(aVar.f53608a, aVar.f53609b, aVar.f53611d, aVar.f53612e, 0, aVar.f53613f, ETEPixelFormat.TEPixFmt_OpenGL_RGBA8);
                } else if (aVar.f53610c == ETEPixelFormat.TEPixFmt_YUV420P.ordinal()) {
                    vEFrame = VEFrame.createByteBufferFrame(aVar.f53615h, aVar.f53611d, aVar.f53612e, 0, aVar.f53613f, ETEPixelFormat.TEPixFmt_YUV420P);
                } else {
                    vEFrame = null;
                }
                if (vEFrame != null) {
                    vEFrame.setFromFrontCamera(aVar.f53616i);
                }
                fVar.mo108752a(vEFrame);
            }
        }, a.f116917b.ordinal());
    }

    /* renamed from: a */
    public final void mo108248a(String str, String str2) {
        this.f116452c.mo52947a(str, str2);
    }

    /* renamed from: a */
    public final int mo108225a(String[] strArr, int i) {
        return this.f116452c.mo52913a(strArr, i);
    }

    /* renamed from: a */
    public final int mo108208a(VEEffectParams vEEffectParams) {
        return this.f116452c.mo52899a(vEEffectParams);
    }

    /* renamed from: b */
    public final int[] mo108267b(String str, String str2) {
        return this.f116452c.mo52985b(str, str2);
    }

    /* renamed from: a */
    public final void mo108229a(float f, float f2, float f3, float f4) {
        this.f116452c.mo52923a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo108252a(boolean z, long j) {
        this.f116452c.mo52953a(z, j);
    }

    /* renamed from: g */
    public final void mo108290g() {
        this.f116452c.mo53051p();
    }

    /* renamed from: h */
    public final void mo108293h() {
        this.f116452c.mo53053q();
    }

    /* renamed from: o */
    public final void mo108307o() {
        this.f116452c.mo53055r();
    }

    /* renamed from: k */
    public final boolean mo108300k() {
        if (this.f116452c != null) {
            return this.f116452c.mo52959a();
        }
        return false;
    }

    /* renamed from: l */
    public final int[] mo108302l() {
        if (this.f116452c != null) {
            return this.f116452c.mo53003d();
        }
        return null;
    }

    /* renamed from: m */
    public final int[] mo108304m() {
        if (this.f116452c != null) {
            return this.f116452c.mo52995c();
        }
        return null;
    }

    /* renamed from: n */
    public final float mo108305n() {
        if (this.f116452c != null) {
            return this.f116452c.mo52963b();
        }
        return 0.0f;
    }

    /* renamed from: p */
    public final void mo108310p() {
        super.mo108310p();
        this.f116452c.mo53059s();
    }

    /* renamed from: u */
    private boolean m142791u() {
        if (this.f116702Z != VERecordMode.DUET || this.f116700X == null || this.f116700X.f116752a == null || this.f116700X.f116753b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m142792v() {
        if (this.f116702Z != VERecordMode.REACTION || this.f116701Y == null || this.f116701Y.f116899b == null || this.f116701Y.f116898a == null) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private void m142789s() {
        float f;
        if (!"landscape".equals(this.f116695S.f116132l)) {
            f = ((float) this.f116451b.mo52328c()) / ((float) this.f116451b.mo52330d());
        } else {
            f = ((float) this.f116451b.mo52330d()) / ((float) this.f116451b.mo52328c());
        }
        this.f116452c.mo52924a(f, this.f116451b.mo52328c(), this.f116451b.mo52330d());
    }

    /* renamed from: t */
    private void m142790t() {
        String str = this.f116458i;
        StringBuilder sb = new StringBuilder("initCamera... thread id = ");
        sb.append(Thread.currentThread().getId());
        C45372t.m143405b(str, sb.toString());
        if (!this.f116464o) {
            C45372t.m143409d(this.f116458i, "No init!!!");
            return;
        }
        C4526112 r0 = new C19662d() {
            /* renamed from: a */
            public final void mo52271a(int i) {
                synchronized (this) {
                    if (C45257b.this.f116451b != null && C45257b.this.f116451b.mo52336i()) {
                        C45257b.this.bV_();
                    }
                }
                if (C45257b.this.f116679C != null) {
                    C45257b.this.f116679C.mo55986a();
                }
            }

            /* renamed from: a */
            public final void mo52272a(int i, int i2, String str) {
                C45257b.this.mo108233a(i, i2, str);
            }
        };
        CAMERA_FACING_ID camera_facing_id = CAMERA_FACING_ID.FACING_BACK;
        if (this.f116695S != null) {
            camera_facing_id = this.f116695S.f116130j;
        }
        this.f116451b.mo52322a(m142784a(camera_facing_id), (C19662d) r0);
    }

    /* renamed from: d */
    public final long mo108281d() {
        return this.f116452c.mo53021g();
    }

    /* renamed from: f */
    public final void mo108288f() {
        if (!this.f116466q) {
            mo108297j();
        }
        this.f116712aj = null;
        this.f116713ak = null;
        this.f116714al = null;
        this.f116710ah = null;
        this.f116711ai = null;
        this.f116451b = null;
        this.f116453d = null;
        this.f116679C = null;
        this.f116678B = null;
        this.f116680D = null;
        this.f116681E = null;
        this.f116454e = null;
        this.f116725y = null;
        this.f116452c = null;
        if (this.f116726z != null) {
            this.f116726z.mo108391b((C45311d) this);
        }
        super.mo108288f();
    }

    /* renamed from: c */
    public final void mo108273c() {
        C19667g.m64797b().mo52339l();
    }

    /* renamed from: i */
    public final int mo108295i() {
        float f;
        if (this.f116461l || !this.f116455f) {
            return 0;
        }
        this.f116455f = false;
        this.f116452c.mo53037j();
        while (this.f116452c.mo53041k()) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException unused) {
            }
        }
        long g = this.f116452c.mo53021g() / 1000;
        this.f116450a.add(new C19755c(g, (double) this.f116462m));
        synchronized (this) {
            this.f116465p = -1;
            f = (float) g;
            this.f116456g = (long) (((float) this.f116456g) + ((1.0f * f) / this.f116462m));
        }
        this.f116461l = true;
        return (int) (f / this.f116462m);
    }

    /* renamed from: j */
    public final void mo108297j() {
        if (this.f116452c != null) {
            mo108295i();
        }
        synchronized (this) {
            if (this.f116451b != null) {
                this.f116451b.mo52340m();
                this.f116451b.f53279c = null;
                this.f116451b.f53280d = null;
                this.f116451b.mo52316a((C19633e) null);
                this.f116451b.mo52315a((C19632d) null);
            }
        }
        if (this.f116452c != null) {
            this.f116452c.mo53049o();
            this.f116452c.mo53045m();
            FaceBeautyInvoker.setNativeInitListener(null);
            this.f116452c.mo52881a((C19703a) null);
            FaceBeautyInvoker.setFaceDetectListener(null);
        }
    }

    public final void bV_() {
        int i;
        int i2;
        boolean z;
        int i3 = this.f116696T.getVideoRes().f116385a;
        int i4 = this.f116696T.getVideoRes().f116386b;
        boolean z2 = !TextUtils.isEmpty(this.f116703aa);
        boolean u = m142791u();
        if (u) {
            i4 /= 2;
        }
        int i5 = i4;
        VESize vESize = this.f116457h.f116885a;
        this.f116452c.mo52993c(1);
        C19764d dVar = this.f116452c;
        if (vESize == null) {
            i = 1280;
        } else {
            i = vESize.f116386b;
        }
        if (vESize == null) {
            i2 = 720;
        } else {
            i2 = vESize.f116385a;
        }
        dVar.mo52889a(i, i2, this.f116463n, i5, i3, this.f116698V, z2 ? 1 : 0, this.f116699W);
        this.f116452c.mo52941a(this.f116694R);
        if (u) {
            this.f116452c.mo52950a(this.f116700X.f116752a, this.f116700X.f116753b, this.f116700X.f116754c, this.f116700X.f116755d, this.f116700X.f116756e, this.f116700X.f116757f);
        } else if (m142792v()) {
            this.f116452c.mo52929a(this.f116453d.getContext(), this.f116701Y.f116898a, this.f116701Y.f116899b);
        }
        this.f116452c.mo53031i(false);
        this.f116452c.mo53052p(this.f116457h.f116888d);
        this.f116451b.mo52331d(this.f116695S.f116133m);
        String str = this.f116458i;
        StringBuilder sb = new StringBuilder("onOpenSuccess... thread id = ");
        sb.append(Thread.currentThread().getId());
        C45372t.m143405b(str, sb.toString());
        this.f116451b.mo52312a(this.f116725y);
        C19764d dVar2 = this.f116452c;
        if (this.f116702Z == VERecordMode.DEFAULT && this.f116706ad == 1) {
            z = true;
        } else {
            z = false;
        }
        dVar2.mo52920a(z);
        this.f116452c.mo52891a(this.f116725y.getApplicationContext(), m142788q(false), (AudioRecorderInterface) this);
        this.f116452c.mo52993c(1);
        this.f116452c.mo53040k(this.f116457h.f116887c);
        this.f116452c.mo52894a(this.f116460k.f116496b, Build.DEVICE);
    }

    /* renamed from: b */
    public final void mo108263b() {
        C45372t.m143403a(this.f116458i, "delete last frag !!!");
        if (this.f116450a.size() > 0) {
            this.f116450a.remove(this.f116450a.size() - 1);
            this.f116456g = (long) C19755c.m65125a(this.f116450a);
            this.f116452c.mo53032i();
        }
    }

    /* renamed from: i_ */
    public final void mo52873i_(int i) {
        this.f116459j = i;
    }

    /* renamed from: b */
    public final int mo108256b(float f) {
        return this.f116452c.mo53036j(f);
    }

    /* renamed from: c */
    public final float mo108269c(String str) {
        return this.f116452c.mo53011f(str);
    }

    /* renamed from: f */
    public final void mo108289f(boolean z) {
        this.f116452c.mo53056r(z);
    }

    /* renamed from: g_ */
    public final void mo108292g_(boolean z) {
        C19667g.m64797b().mo52327b(z);
    }

    /* renamed from: k */
    public final void mo108299k(boolean z) {
        this.f116452c.mo53000d(z ? 1 : 0);
    }

    /* renamed from: l */
    public final int mo108301l(boolean z) {
        return this.f116452c.mo53058s(z);
    }

    /* renamed from: m */
    public final void mo108303m(boolean z) {
        this.f116452c.mo53061t(z);
    }

    /* renamed from: n */
    public final void mo108306n(boolean z) {
        this.f116452c.mo53064v(z);
    }

    /* renamed from: p */
    public final void mo108311p(boolean z) {
        this.f116452c.mo53068z(z);
    }

    /* renamed from: a */
    private static int m142784a(CAMERA_FACING_ID camera_facing_id) {
        if (camera_facing_id == CAMERA_FACING_ID.FACING_WIDE_ANGLE) {
            return 2;
        }
        if (camera_facing_id == CAMERA_FACING_ID.FACING_FRONT) {
            return 1;
        }
        return 0;
    }

    public final int closeWavFile(boolean z) {
        C45372t.m143405b(this.f116458i, "closeWavFile...");
        return 0;
    }

    /* renamed from: d */
    public final int mo108280d(String str) {
        return this.f116452c.mo52989c(str);
    }

    /* renamed from: g */
    public final void mo108291g(boolean z) {
        if (this.f116452c != null) {
            this.f116452c.mo53009e(z);
        }
    }

    /* renamed from: h */
    public final void mo108294h(boolean z) {
        if (this.f116452c != null) {
            this.f116452c.mo52994c(z);
        }
    }

    /* renamed from: i */
    public final void mo108296i(boolean z) {
        if (this.f116452c != null) {
            this.f116452c.mo53002d(z);
        }
    }

    /* renamed from: j */
    public final void mo108298j(boolean z) {
        if (this.f116452c != null) {
            this.f116452c.f53653j = z;
        }
    }

    /* renamed from: o */
    public final void mo108308o(boolean z) {
        if (z) {
            this.f116452c.mo52966b(this.f116725y);
        } else {
            this.f116452c.mo53062u();
        }
    }

    /* renamed from: a */
    private void m142786a(Context context) {
        this.f116725y = context;
        this.f116451b = C19667g.m64797b();
        this.f116452c = new C19764d();
    }

    /* renamed from: d */
    public final int mo108279d(Surface surface) {
        this.f116460k = new C45271a(surface, true);
        int a = this.f116452c.mo52893a(surface);
        this.f116452c.mo53007e(2);
        return a;
    }

    /* renamed from: e */
    public final int mo108286e(String str) {
        return this.f116452c.mo53020g(str);
    }

    /* renamed from: q */
    private int m142788q(boolean z) {
        if (!this.f116457h.f116886b && !z) {
            return 0;
        }
        if (this.f116702Z == VERecordMode.DUET || this.f116702Z == VERecordMode.REACTION || this.f116702Z == VERecordMode.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(this.f116703aa)) {
            return 5;
        }
        return 1;
    }

    /* renamed from: b */
    public final int mo108258b(final C45392d dVar) {
        return this.f116452c.mo52896a((OnARTextContentCallback) new OnARTextContentCallback() {
            public final void onResult(String[] strArr) {
                if (dVar != null) {
                    dVar.mo56130a(strArr);
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo108287e(boolean z) {
        this.f116452c.mo53054q(z);
    }

    /* renamed from: a */
    private static List<C19755c> m142785a(List<C45254ae> list) {
        if (list == null || list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C45254ae aeVar : list) {
            arrayList.add(new C19755c(aeVar.f53617a, aeVar.f53618b));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final int mo108259b(String str) {
        this.f116714al.f55278a = str;
        return this.f116452c.mo52969b(C45376c.m143419a(str));
    }

    /* renamed from: d */
    public final void mo108282d(boolean z) {
        this.f116452c.mo53052p(z);
    }

    /* renamed from: a */
    private void m142787a(SurfaceHolder surfaceHolder) {
        FaceBeautyInvoker.setNativeInitListener(this);
        this.f116451b.mo52318a((C19763c) this.f116452c);
        this.f116451b.f53279c = this;
        this.f116451b.f53280d = this;
        if (this.f116464o) {
            this.f116451b.mo52316a((C19633e) new C19633e() {
                /* renamed from: a */
                public final boolean mo52251a() {
                    if (C45257b.this.f116681E == null || !C45257b.this.f116681E.mo55985a()) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: a */
                public final void mo52249a(int i, float f, boolean z) {
                    if (C45257b.this.f116681E != null) {
                        C45257b.this.f116681E.mo55983a(i, f, z);
                    }
                }

                /* renamed from: a */
                public final void mo52250a(int i, boolean z, boolean z2, float f, List<Integer> list) {
                    if (C45257b.this.f116681E != null) {
                        C45257b.this.f116681E.mo55984a(i, z, z2, f, list);
                    }
                }
            });
            this.f116451b.mo52315a((C19632d) new C19632d() {
            });
        }
        m142790t();
    }

    /* renamed from: c */
    public final void mo108274c(int i) {
        this.f116452c.mo53033i(i);
    }

    /* renamed from: a */
    public final int mo108202a(float f) {
        if (!this.f116461l) {
            return -105;
        }
        this.f116455f = true;
        this.f116462m = f;
        this.f116452c.mo52967b(this.f116725y, m142788q(true), (AudioRecorderInterface) this);
        this.f116452c.mo52918a(this.f116704ab, this.f116456g);
        if (this.f116696T == null || this.f116696T.getBitrateMode() != ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF) {
            this.f116452c.mo52991c(ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal(), this.f116696T.getSwQP());
        } else {
            int swCRF = this.f116696T.getSwCRF();
            C19764d dVar = this.f116452c;
            int ordinal = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
            if (swCRF < 12) {
                swCRF = 12;
            }
            dVar.mo52991c(ordinal, swCRF);
        }
        int a = m142783a(this.f116462m, this.f116696T);
        this.f116461l = false;
        synchronized (this) {
            this.f116465p = 0;
        }
        return a;
    }

    /* renamed from: c */
    public final void mo108276c(Surface surface) {
        this.f116460k = new C45271a(surface, true);
        m142787a((SurfaceHolder) null);
    }

    /* renamed from: d */
    public final int mo108278d(float f, float f2) {
        return this.f116452c.mo53004e(f, f2);
    }

    /* renamed from: e */
    public final int mo108284e(float f, float f2) {
        return this.f116452c.mo53013f(f, f2);
    }

    public final int addPCMData(byte[] bArr, int i) {
        C45372t.m143405b(this.f116458i, "addPCMData...");
        if (this.f116680D != null) {
            Arrays.copyOf(bArr, i);
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo108285e(int i, int i2) {
        return this.f116452c.mo53025h(i, i2);
    }

    /* renamed from: b */
    public final int mo108257b(float f, float f2) {
        return this.f116452c.mo52987c(f, f2);
    }

    /* renamed from: c */
    public final int mo108271c(float f, float f2) {
        return this.f116452c.mo52997d(f, f2);
    }

    /* renamed from: a */
    private int m142783a(float f, VEVideoEncodeSettings vEVideoEncodeSettings) {
        int i;
        float bps = (((float) vEVideoEncodeSettings.getBps()) * 1.0f) / 4194304.0f;
        if (vEVideoEncodeSettings.getEncodeProfile() == ENCODE_PROFILE.ENCODE_PROFILE_MAIN.ordinal()) {
            i = 2;
        } else if (vEVideoEncodeSettings.getEncodeProfile() == ENCODE_PROFILE.ENCODE_PROFILE_HIGH.ordinal()) {
            i = 8;
        } else {
            i = 1;
        }
        return this.f116452c.mo52884a((double) f, !vEVideoEncodeSettings.isSupportHwEnc(), bps, 1, i, false);
    }

    /* renamed from: c */
    public final int mo108272c(String str, String str2) {
        return this.f116452c.mo52990c(str, str2);
    }

    /* renamed from: d */
    public final boolean mo108283d(int i, int i2) {
        if (this.f116452c != null) {
            return this.f116452c.mo53010e(i, i2);
        }
        return false;
    }

    /* renamed from: c */
    public final void mo108275c(int i, int i2) {
        if (this.f116452c != null) {
            this.f116452c.mo53001d(i, i2);
        }
    }

    /* renamed from: b */
    public final int mo108262b(String[] strArr, int i) {
        return this.f116452c.mo52973b(strArr, i);
    }

    /* renamed from: a */
    public final int mo108203a(float f, float f2) {
        this.f116710ah.f55269c = f;
        this.f116710ah.f55270d = f2;
        this.f116452c.mo52921a(f, f2);
        return 0;
    }

    public final int initWavFile(int i, int i2, double d) {
        C45372t.m143405b(this.f116458i, "initWavFile...");
        return 0;
    }

    public C45257b(Context context, C45362d dVar, C45310c cVar) {
        super(context, dVar, cVar);
        if (cVar instanceof C45308a) {
            this.f116453d = ((C45308a) cVar).f116618a;
        } else if (cVar instanceof C45309b) {
            this.f116454e = ((C45309b) cVar).f116619a;
        }
        if (this.f116726z != null) {
            this.f116726z.mo108390a((C45311d) this);
        }
        m142786a(context);
    }

    /* renamed from: b */
    public final int mo108260b(String str, float f, float f2) {
        this.f116714al.f55278a = str;
        this.f116714al.f55279b = f;
        this.f116714al.f55280c = f2;
        if (TextUtils.isEmpty(str)) {
            this.f116714al.f55278a = "";
            return this.f116452c.mo52970b("", 0.0f, 0.0f);
        }
        this.f116714al.f55278a = str;
        return this.f116452c.mo52970b(str, f, f2);
    }

    /* renamed from: b */
    public final int mo108261b(String str, String str2, float f) {
        return this.f116452c.mo52972b(str, str2, f);
    }

    /* renamed from: a */
    public final int mo108206a(int i, float f, float f2, int i2) {
        return this.f116452c.mo52888a(i, f, f2, i2);
    }

    /* renamed from: b */
    public final int mo108255b(double d, double d2, double d3, double d4) {
        return this.f116452c.mo52964b(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final int mo108270c(double d, double d2, double d3, double d4) {
        return this.f116452c.mo52986c(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo108201a(double d, double d2, double d3, double d4) {
        return this.f116452c.mo52883a(d, d2, d3, d4);
    }
}

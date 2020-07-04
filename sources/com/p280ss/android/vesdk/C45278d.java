package com.p280ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.FaceBeautyInvoker.EffectAlgorithmCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.FaceInfoCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextBitmapCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.medialib.camera.C19700k;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.medialib.common.C19702a.C19703a;
import com.p280ss.android.medialib.common.C19702a.C19704b;
import com.p280ss.android.medialib.common.C19705b;
import com.p280ss.android.medialib.model.C19753a;
import com.p280ss.android.medialib.model.C19755c;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.model.FaceAttributeInfo;
import com.p280ss.android.medialib.model.FaceDetectInfo;
import com.p280ss.android.medialib.p880b.C19621a;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.medialib.p880b.C19623c;
import com.p280ss.android.medialib.presenter.C19764d;
import com.p280ss.android.medialib.presenter.C19764d.C19778a;
import com.p280ss.android.medialib.presenter.C19764d.C19779b;
import com.p280ss.android.medialib.presenter.C19764d.C19780c;
import com.p280ss.android.medialib.presenter.C19764d.C19781d;
import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ttve.model.VEFrame;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.ttvecamera.C20573c;
import com.p280ss.android.ttvecamera.C20599e;
import com.p280ss.android.ttvecamera.C20604f;
import com.p280ss.android.ttvecamera.C20632i.C20638f;
import com.p280ss.android.ttvecamera.TECameraFrame;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.vesdk.C45382z.C45390b;
import com.p280ss.android.vesdk.C45382z.C45391c;
import com.p280ss.android.vesdk.C45382z.C45392d;
import com.p280ss.android.vesdk.C45382z.C45394f;
import com.p280ss.android.vesdk.C45382z.C45397h;
import com.p280ss.android.vesdk.C45382z.C45398i;
import com.p280ss.android.vesdk.C45382z.C45399j;
import com.p280ss.android.vesdk.C45382z.C45404o;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_TYPE;
import com.p280ss.android.vesdk.VEListener.C45207c;
import com.p280ss.android.vesdk.VEListener.C45210f;
import com.p280ss.android.vesdk.VEListener.C45225u;
import com.p280ss.android.vesdk.VEListener.C45226v;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import com.p280ss.android.vesdk.faceinfo.C45314b;
import com.p280ss.android.vesdk.faceinfo.C45317d;
import com.p280ss.android.vesdk.model.BefTextLayout;
import com.p280ss.android.vesdk.model.BefTextLayoutResult;
import com.p280ss.android.vesdk.p1773a.C45248a;
import com.p280ss.android.vesdk.p1773a.C45249b;
import com.p280ss.android.vesdk.p1774b.C45272a;
import com.p280ss.android.vesdk.p1774b.C45273b;
import com.p280ss.android.vesdk.p1774b.C45273b.C45274a;
import com.p280ss.android.vesdk.p1774b.C45275c;
import com.p280ss.android.vesdk.p1777e.C45310c;
import com.p280ss.android.vesdk.p1777e.C45311d;
import com.p280ss.android.vesdk.runtime.C45362d;
import com.p280ss.android.vesdk.utils.C45376c;
import com.p280ss.android.vesdk.utils.TEPlanUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.vesdk.d */
public class C45278d extends C45319g implements OnRunningErrorCallback, C19622b, C19623c, C19779b, C45311d, AudioRecorderInterface {

    /* renamed from: a */
    public static final String f116508a = "d";

    /* renamed from: k */
    public static final Object f116509k = new Object();

    /* renamed from: aA */
    private boolean f116510aA;

    /* renamed from: aB */
    private Surface f116511aB;

    /* renamed from: aC */
    private C45378w f116512aC;

    /* renamed from: aD */
    private boolean f116513aD = false;

    /* renamed from: aE */
    private final ExecutorService f116514aE = C45307e.m143093a();

    /* renamed from: aF */
    private Object f116515aF = new Object();

    /* renamed from: aG */
    private FaceInfoCallback f116516aG;

    /* renamed from: aH */
    private C45399j f116517aH = null;

    /* renamed from: aI */
    private boolean f116518aI = false;

    /* renamed from: aJ */
    private boolean f116519aJ = false;

    /* renamed from: aK */
    private boolean f116520aK = false;

    /* renamed from: aL */
    private C19703a f116521aL = new C19703a() {
        /* renamed from: b */
        public final void mo52266b() {
            C45372t.m143410e(C45278d.f116508a, "onOpenGLDestroy");
            C45278d.this.f116538o.mo52400b();
            C45278d.this.f116539p.mo108186b(C45278d.this.f116540q);
            C45226v vVar = C45278d.this.f116678B;
            if (vVar instanceof C45225u) {
                ((C45225u) vVar).mo55870a(10001, 0, "Render Env Destroyed.");
            }
        }

        /* renamed from: c */
        public final int mo52267c() {
            float f;
            int i;
            if (C45278d.this.f116534j) {
                synchronized (C45278d.f116509k) {
                    if (C45278d.this.f116531g.f116385a > 0 && C45278d.this.f116531g.f116386b > 0) {
                        if (!C45278d.this.f116540q.f116503f) {
                            f = (float) C45278d.this.f116531g.f116385a;
                            i = C45278d.this.f116531g.f116386b;
                        } else {
                            f = (float) C45278d.this.f116531g.f116386b;
                            i = C45278d.this.f116531g.f116385a;
                        }
                        C45278d.this.f116527c.mo52924a(f / ((float) i), C45278d.this.f116531g.f116385a, C45278d.this.f116531g.f116386b);
                    }
                    boolean z = true;
                    if (C45278d.this.f116536m != 1) {
                        z = false;
                    }
                    C45278d.this.f116527c.mo52879a(C45278d.this.f116533i, z);
                    C45278d.this.f116534j = false;
                }
            }
            if (C45278d.this.f116695S == null || C45278d.this.f116695S.f116139s != CAMERA_OUTPUT_MODE.FRAME) {
                try {
                    C45278d.this.f116538o.mo52401c();
                    if (C45278d.this.f116535l) {
                        return -1;
                    }
                    if (C45278d.this.f116538o.f53430b != null) {
                        C45278d.this.f116527c.mo52874a(C45278d.this.f116538o.mo52402d());
                    }
                    return 0;
                } catch (Exception e) {
                    String str = C45278d.f116508a;
                    StringBuilder sb = new StringBuilder("onOpenGLRunning error: ");
                    sb.append(e.getMessage());
                    C45372t.m143409d(str, sb.toString());
                }
            } else {
                if (C45278d.this.f116695S.f116129i == CAMERA_TYPE.TYPE1 && C45278d.this.f116695S.f116144x.getBoolean("forceRunUpdateTexImg", false)) {
                    try {
                        C45278d.this.f116538o.mo52401c();
                    } catch (Exception e2) {
                        String str2 = C45278d.f116508a;
                        StringBuilder sb2 = new StringBuilder("onOpenGLRunning error: ");
                        sb2.append(e2.getMessage());
                        C45372t.m143409d(str2, sb2.toString());
                    }
                }
                if (C45278d.this.f116535l) {
                    return -1;
                }
                return 0;
            }
        }

        /* renamed from: a */
        public final void mo52265a() {
            int i;
            C45372t.m143410e(C45278d.f116508a, "onOpenGLCreate");
            C45278d.this.f116538o.mo52399a();
            C45278d.this.f116527c.mo52880a(C45278d.this.f116538o.f53430b);
            if (C45278d.this.f116695S == null || C45278d.this.f116695S.f116139s == CAMERA_OUTPUT_MODE.SURFACE) {
                C45278d dVar = C45278d.this;
                C45275c cVar = new C45275c(new TEFrameSizei(C45278d.this.f116532h.f116385a, C45278d.this.f116532h.f116386b), C45278d.this.f116547x, true, C45278d.this.f116538o.f53429a, C45278d.this.f116538o.f53430b);
                dVar.f116540q = cVar;
            } else if (C45278d.this.f116695S.f116139s != CAMERA_OUTPUT_MODE.SURFACE_FRAME || C45278d.this.f116695S.f116129i == CAMERA_TYPE.TYPE1) {
                C45278d dVar2 = C45278d.this;
                TEFrameSizei tEFrameSizei = new TEFrameSizei(C45278d.this.f116532h.f116385a, C45278d.this.f116532h.f116386b);
                C45274a aVar = C45278d.this.f116547x;
                SurfaceTexture surfaceTexture = C45278d.this.f116538o.f53430b;
                if (C45278d.this.f116695S.f116139s == CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                    i = 1;
                } else {
                    i = 0;
                }
                C45272a aVar2 = new C45272a(tEFrameSizei, aVar, true, surfaceTexture, i);
                dVar2.f116540q = aVar2;
                if (C45278d.this.f116695S.f116129i == CAMERA_TYPE.TYPE1) {
                    C45278d.this.f116527c.mo52875a(0);
                } else {
                    C45278d.this.f116527c.mo52875a(1);
                }
            } else {
                C45278d.this.f116695S.f116139s = CAMERA_OUTPUT_MODE.SURFACE;
                C45278d dVar3 = C45278d.this;
                C45275c cVar2 = new C45275c(new TEFrameSizei(C45278d.this.f116532h.f116385a, C45278d.this.f116532h.f116386b), C45278d.this.f116547x, true, C45278d.this.f116538o.f53429a, C45278d.this.f116538o.f53430b);
                dVar3.f116540q = cVar2;
            }
            C45278d.this.f116539p.mo108184a(C45278d.this.f116540q);
            if (C45278d.this.f116530f != null) {
                C45278d.this.f116530f.mo108194a(C45278d.this.f116539p);
                return;
            }
            if (C45278d.this.f116678B != null && (C45278d.this.f116678B instanceof C45225u)) {
                ((C45225u) C45278d.this.f116678B).mo55870a(1000, 0, "Render Env Created.");
            }
        }
    };

    /* renamed from: aw */
    private boolean f116522aw;

    /* renamed from: ax */
    private final VESize f116523ax = new VESize(1280, 720);

    /* renamed from: ay */
    private float f116524ay = 1.0f;

    /* renamed from: az */
    private long f116525az = -1;

    /* renamed from: b */
    final List<C19755c> f116526b = new ArrayList();

    /* renamed from: c */
    public C19764d f116527c;

    /* renamed from: d */
    public String f116528d;

    /* renamed from: e */
    public long f116529e = 0;

    /* renamed from: f */
    public C45248a f116530f;

    /* renamed from: g */
    public VESize f116531g = new VESize(0, 0);

    /* renamed from: h */
    public VESize f116532h = this.f116523ax;

    /* renamed from: i */
    public int f116533i = -1;

    /* renamed from: j */
    public boolean f116534j;

    /* renamed from: l */
    public boolean f116535l;

    /* renamed from: m */
    public int f116536m = 0;

    /* renamed from: n */
    public int f116537n = 0;

    /* renamed from: o */
    public C19700k f116538o = new C19700k();

    /* renamed from: p */
    public C45247a<C45273b> f116539p = new C45247a<>();

    /* renamed from: q */
    public C45273b f116540q;

    /* renamed from: r */
    public List<C45399j> f116541r;

    /* renamed from: s */
    public int f116542s = 3;

    /* renamed from: t */
    public boolean f116543t = false;

    /* renamed from: u */
    public ConditionVariable f116544u = new ConditionVariable();

    /* renamed from: v */
    public LandMarkFrame f116545v = new LandMarkFrame();

    /* renamed from: w */
    public C45253ad f116546w = C45253ad.m142779a();

    /* renamed from: x */
    C45274a f116547x = new C45274a() {
        /* renamed from: a */
        public final void mo108315a(TEFrameSizei tEFrameSizei) {
            C45278d.this.f116527c.mo53016f(tEFrameSizei.f55535a, tEFrameSizei.f55536b);
        }

        public final void onFrameCaptured(TECameraFrame tECameraFrame) {
            if (!(C45278d.this.f116531g.f116385a == tECameraFrame.mo55512f().f55535a && C45278d.this.f116531g.f116386b == tECameraFrame.mo55512f().f55536b)) {
                C45278d.this.f116531g.f116385a = tECameraFrame.mo55512f().f55535a;
                C45278d.this.f116531g.f116386b = tECameraFrame.mo55512f().f55536b;
            }
            int i = 1;
            if (!(C45278d.this.f116536m == tECameraFrame.mo55515i() && C45278d.this.f116533i == tECameraFrame.mo55510d())) {
                synchronized (C45278d.f116509k) {
                    C45278d.this.f116536m = tECameraFrame.mo55515i();
                    C45278d.this.f116533i = tECameraFrame.mo55510d();
                    C45278d.this.f116534j = true;
                }
            }
            ETEPixelFormat g = tECameraFrame.mo55513g();
            if (g == ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
                if (C45278d.this.f116546w.f116435i) {
                    C45278d.this.f116545v.setInfo(C45278d.this.f116546w.f116427a, C45278d.this.f116546w.f116428b, C45278d.this.f116546w.f116429c, C45278d.this.f116546w.f116430d, C45278d.this.f116546w.f116431e, C45278d.this.f116546w.f116432f, C45278d.this.f116546w.f116433g, C45278d.this.f116546w.f116434h);
                    C45278d.this.f116527c.mo52882A(true);
                    C45278d.this.f116527c.mo52945a(C45278d.this.f116545v);
                } else {
                    C45278d.this.f116527c.mo52882A(false);
                }
                C45278d.this.f116527c.mo52876a(tECameraFrame.mo55508b(), tECameraFrame.mo55511e());
                return;
            }
            if (tECameraFrame.mo55514h() == 3) {
                ImageFrame imageFrame = new ImageFrame(TEPlanUtils.convert(tECameraFrame.mo55509c()), -2, tECameraFrame.mo55512f().f55535a, tECameraFrame.mo55512f().f55536b);
                if (C45278d.this.f116695S == null || C45278d.this.f116695S.f116139s == CAMERA_OUTPUT_MODE.FRAME) {
                    C45278d.this.f116527c.mo52874a((double) (tECameraFrame.f55418a / 1000));
                    C45278d.this.f116527c.mo52877a(imageFrame);
                } else {
                    if (C45278d.this.f116695S.f116139s == CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                        C45278d.this.f116527c.mo52878a(imageFrame, C45278d.this.f116538o.f53429a);
                    }
                }
            } else if (g == ETEPixelFormat.PIXEL_FORMAT_NV21 || g == ETEPixelFormat.PIXEL_FORMAT_JPEG) {
                if (g == ETEPixelFormat.PIXEL_FORMAT_NV21) {
                    i = -3;
                }
                ImageFrame imageFrame2 = new ImageFrame(tECameraFrame.mo55507a(), i, tECameraFrame.mo55512f().f55535a, tECameraFrame.mo55512f().f55536b);
                if (C45278d.this.f116695S == null || C45278d.this.f116695S.f116139s == CAMERA_OUTPUT_MODE.FRAME) {
                    C45278d.this.f116527c.mo52874a((double) (tECameraFrame.f55418a / 1000));
                    C45278d.this.f116527c.mo52877a(imageFrame2);
                } else {
                    if (C45278d.this.f116695S.f116139s == CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                        C45278d.this.f116527c.mo52878a(imageFrame2, C45278d.this.f116538o.f53429a);
                    }
                }
            } else {
                C45372t.m143409d(C45278d.f116508a, "Not support now!!");
            }
        }
    };

    /* renamed from: e */
    public final int mo108356e() {
        return this.f116537n;
    }

    public void lackPermission() {
    }

    public void recordStatus(boolean z) {
    }

    /* renamed from: a */
    public final int mo108344a(C45248a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C45378w wVar, String str, String str2) {
        VECameraSettings vECameraSettings;
        mo108346a(aVar);
        if (aVar == null) {
            vECameraSettings = null;
        } else {
            vECameraSettings = aVar.mo108193i();
        }
        this.f116695S = vECameraSettings;
        if (!(this.f116695S == null || this.f116695S.f116139s != CAMERA_OUTPUT_MODE.SURFACE_FRAME || this.f116695S.f116129i == CAMERA_TYPE.TYPE1)) {
            this.f116695S.f116139s = CAMERA_OUTPUT_MODE.SURFACE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        this.f116528d = sb.toString();
        this.f116696T = vEVideoEncodeSettings;
        this.f116697U = vEAudioEncodeSettings;
        this.f116512aC = wVar;
        this.f116698V = str2;
        return m142938w();
    }

    /* renamed from: a */
    public final int mo108345a(C45362d dVar) {
        if (this.f116537n == 0 || this.f116537n == 1) {
            super.mo108345a(dVar);
            this.f116526b.clear();
            this.f116529e = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.mo56149a());
            sb.append(File.separator);
            this.f116528d = sb.toString();
            if (this.f116537n == 1) {
                mo108362s();
                int w = m142938w();
                if (w != 0) {
                    String str = f116508a;
                    StringBuilder sb2 = new StringBuilder("nativeInitFaceBeautyPlay error: ");
                    sb2.append(w);
                    C45372t.m143409d(str, sb2.toString());
                    return -108;
                }
            }
            return 0;
        }
        C45372t.m143409d(f116508a, "调用时机错误");
        return -105;
    }

    /* renamed from: a */
    public final void mo108346a(C45248a aVar) {
        this.f116530f = aVar;
        if (this.f116530f != null) {
            this.f116532h = this.f116530f.mo108195j();
        }
    }

    /* renamed from: a */
    public final void mo108232a(int i, int i2, int i3, int i4) {
        this.f116527c.mo52980b(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final int[] mo108254a(int i, int i2, int i3, int i4, float f) {
        return this.f116527c.mo52961a(i, i2, i3, i4, f);
    }

    /* renamed from: a */
    public final void mo108227a(final double d) {
        m142935b((Runnable) new Runnable() {
            public final void run() {
                synchronized (C45278d.this) {
                    if (C45278d.this.f116537n == 3) {
                        String str = C45278d.f116508a;
                        StringBuilder sb = new StringBuilder("setVideoBgSpeed could not be executed in state: ");
                        sb.append(C45278d.this.f116537n);
                        C45372t.m143409d(str, sb.toString());
                        return;
                    }
                    C45278d.this.f116527c.mo52977b(d);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo108251a(final String str, final String str2, final String str3) {
        String str4 = f116508a;
        StringBuilder sb = new StringBuilder("setCustomVideoBg: videoPath = ");
        sb.append(str2);
        sb.append(", audioPath = ");
        sb.append(str3);
        sb.append(", mVERecordMode = ");
        sb.append(this.f116702Z);
        C45372t.m143403a(str4, sb.toString());
        if (this.f116702Z == VERecordMode.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(str2)) {
            m142935b((Runnable) new Runnable() {
                public final void run() {
                    VERecordMode vERecordMode;
                    synchronized (C45278d.this) {
                        C45372t.m143403a(C45278d.f116508a, "setCustomVideoBg: doing... ");
                        if (C45278d.this.f116537n == 3) {
                            String str = C45278d.f116508a;
                            StringBuilder sb = new StringBuilder("setCustomVideoBg could not be executed in recording mode: ");
                            sb.append(C45278d.this.f116537n);
                            C45372t.m143409d(str, sb.toString());
                            return;
                        }
                        C45278d dVar = C45278d.this;
                        if (!TextUtils.isEmpty(str2)) {
                            vERecordMode = VERecordMode.CUSTOM_VIDEO_BG;
                        } else {
                            vERecordMode = VERecordMode.DEFAULT;
                        }
                        dVar.f116702Z = vERecordMode;
                        C45278d.this.f116527c.mo52930a(C45278d.this.f116725y, str, str2, str3);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo108235a(Surface surface) {
        this.f116511aB = surface;
        this.f116522aw = false;
        if (!this.f116513aD) {
            mo108237a(surface, (C45210f) null);
        }
    }

    /* renamed from: a */
    public final void mo108236a(final Surface surface, int i, int i2, int i3) {
        if ((this.f116726z != null && this.f116726z.f116625f) || this.f116513aD) {
            this.f116514aE.submit(new Runnable() {
                public final void run() {
                    C45278d.this.mo108279d(surface);
                }
            });
            this.f116513aD = false;
        }
    }

    /* renamed from: b */
    public final void mo108264b(Surface surface) {
        mo108241a((C45210f) null);
        this.f116522aw = true;
        this.f116513aD = false;
    }

    /* renamed from: a */
    public final int mo108218a(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j;
        final long j4 = j2;
        final int i2 = i;
        C4529422 r0 = new Runnable() {
            public final void run() {
                synchronized (C45278d.this) {
                    if (C45278d.this.f116537n == 3) {
                        String str = C45278d.f116508a;
                        StringBuilder sb = new StringBuilder("setRecordBGM could not be executed in state: ");
                        sb.append(C45278d.this.f116537n);
                        C45372t.m143409d(str, sb.toString());
                        return;
                    }
                    C45278d.super.mo108218a(str2, j3, j4, i2);
                    C19764d a = C45278d.this.f116527c.mo52919a(str2);
                    boolean z = true;
                    if (C45278d.this.f116706ad != 1) {
                        z = false;
                    }
                    a.mo52920a(z).mo52918a(C45278d.this.f116704ab, C45278d.this.f116529e);
                    C45278d.this.f116527c.mo52967b(C45278d.this.f116725y, C45278d.this.mo108359q(false), (AudioRecorderInterface) C45278d.this);
                }
            }
        };
        m142935b((Runnable) r0);
        return 0;
    }

    /* renamed from: a */
    public final int mo108221a(List<C45254ae> list, String str, int i, int i2) {
        int a;
        synchronized (this.f116515aF) {
            mo108218a(str, (long) i, this.f116705ac, i2);
            this.f116526b.clear();
            this.f116526b.addAll(list);
            this.f116529e = (long) C19755c.m65125a(this.f116526b);
            a = this.f116527c.mo52890a(list.size(), this.f116528d);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo108350a(final List<C45254ae> list, String str, int i, int i2, final C45210f fVar) {
        this.f116520aK = true;
        this.f116514aE.submit(new Runnable() {
            public final void run() {
                C45278d.this.f116526b.clear();
                C45278d.this.f116526b.addAll(list);
                C45278d.this.f116529e = (long) C19755c.m65125a(C45278d.this.f116526b);
                int a = C45278d.this.f116527c.mo52890a(list.size(), C45278d.this.f116528d);
                if (fVar != null) {
                    fVar.mo55926a(a);
                }
            }
        });
        mo108218a(str, (long) i, this.f116705ac, i2);
    }

    /* renamed from: a */
    public final void mo108237a(final Surface surface, final C45210f fVar) {
        this.f116520aK = true;
        this.f116514aE.submit(new Runnable() {
            public final void run() {
                int e = C45278d.this.mo108357e(surface);
                if (fVar != null) {
                    fVar.mo55926a(e);
                }
            }
        });
        m142940y();
    }

    /* renamed from: a */
    public final void mo108241a(final C45210f fVar) {
        mo108251a((String) null, (String) null, (String) null);
        m142941z();
        final boolean z = this.f116512aC != null && this.f116512aC.f116891g;
        if (z) {
            this.f116544u.close();
        }
        this.f116514aE.submit(new Runnable() {
            public final void run() {
                C45278d.this.mo108364t();
                if (fVar != null) {
                    fVar.mo55926a(0);
                }
                if (z) {
                    C45278d.this.f116544u.open();
                }
            }
        });
        if (z) {
            this.f116544u.block(2000);
        }
    }

    /* renamed from: a */
    public final void mo108231a(int i, float f, VESize vESize, VESize vESize2) {
        this.f116707ae = i;
        this.f116717ao = true;
        if (vESize2.mo108058a()) {
            this.f116719aq.f116385a = vESize2.f116386b;
            this.f116719aq.f116386b = vESize2.f116385a;
        }
        if (this.f116695S != null) {
            if (f <= 0.0f) {
                this.f116527c.mo53015f(i);
                if (this.f116718ap.mo108058a()) {
                    this.f116527c.mo52979b(this.f116718ap.f116385a, this.f116718ap.f116386b);
                    return;
                }
                String str = f116508a;
                StringBuilder sb = new StringBuilder("mVideoOutputSize is not valid: ");
                sb.append(this.f116718ap.toString());
                C45372t.m143409d(str, sb.toString());
                return;
            }
            VESize a = ((C45323k) this.f116530f).mo108502a(f, vESize);
            if (a != null) {
                this.f116532h = a;
            }
        }
    }

    /* renamed from: a */
    public final void mo108230a(final float f, final C45210f fVar) {
        this.f116514aE.submit(new Runnable() {
            public final void run() {
                int a = C45278d.this.mo108202a(f);
                if (fVar != null) {
                    fVar.mo55926a(a);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo108265b(final C45210f fVar) {
        this.f116514aE.submit(new Runnable() {
            public final void run() {
                int i = C45278d.this.mo108295i();
                if (fVar != null) {
                    fVar.mo55926a(i);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo108263b() {
        m142935b((Runnable) new Runnable() {
            public final void run() {
                synchronized (C45278d.this) {
                    if (C45278d.this.f116537n == 3) {
                        String str = C45278d.f116508a;
                        StringBuilder sb = new StringBuilder("deleteLastFrag could not be executed in mode: ");
                        sb.append(C45278d.this.f116537n);
                        C45372t.m143409d(str, sb.toString());
                        return;
                    }
                    int size = C45278d.this.f116526b.size();
                    if (size > 0) {
                        C45278d.this.f116526b.remove(size - 1);
                        C45278d.this.f116529e = (long) C19755c.m65125a(C45278d.this.f116526b);
                    }
                    C45278d.this.f116527c.mo53032i();
                }
            }
        });
    }

    /* renamed from: a */
    public final int mo108219a(String str, String str2, int i, String str3, String str4) {
        if (this.f116537n == 3) {
            mo108295i();
        }
        if (this.f116537n == 0) {
            return -105;
        }
        return this.f116527c.mo52906a(str, str2, i, str3, str4, this.f116696T.isOptRemuxWithCopy());
    }

    /* renamed from: a */
    public final void mo108349a(String str, String str2, int i, String str3, String str4, C45210f fVar) {
        ExecutorService executorService = this.f116514aE;
        final C45210f fVar2 = fVar;
        final String str5 = str;
        final String str6 = str2;
        final int i2 = i;
        final String str7 = str3;
        final String str8 = str4;
        C453026 r0 = new Runnable() {
            public final void run() {
                if (C45278d.this.f116537n == 3 || C45278d.this.f116537n == 0) {
                    if (fVar2 != null) {
                        fVar2.mo55926a(-105);
                    }
                    return;
                }
                int a = C45278d.this.f116527c.mo52906a(str5, str6, i2, str7, str8, C45278d.this.f116696T.isOptRemuxWithCopy());
                if (fVar2 != null) {
                    fVar2.mo55926a(a);
                }
            }
        };
        executorService.submit(r0);
    }

    /* renamed from: a */
    public final void mo108247a(Runnable runnable) {
        C19764d.m65155a(runnable);
    }

    /* renamed from: a */
    public final void mo108243a(C45394f fVar) {
        super.mo108243a(fVar);
        this.f116527c.mo52943a((C19779b) fVar == null ? null : this);
    }

    /* renamed from: a */
    public final void mo108242a(C45256ag agVar) {
        if (agVar.f116448a > -1.0f) {
            this.f116527c.mo52916a(agVar.f116448a);
        }
        this.f116527c.mo52976b(agVar.f116449b);
    }

    /* renamed from: a */
    public final void mo108347a(C45249b bVar) {
        if (bVar != null) {
            VESize j = bVar.mo108195j();
            C45273b bVar2 = null;
            Iterator it = this.f116539p.mo108185b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C45273b bVar3 = (C45273b) it.next();
                if (bVar3.f116502e) {
                    bVar2 = bVar3;
                    break;
                }
            }
            if (!(j == null || bVar2 == null || bVar2.f116500c == null)) {
                bVar2.f116500c.f55535a = j.f116385a;
                bVar2.f116500c.f55536b = j.f116386b;
            }
            bVar.mo108194a(this.f116539p);
        }
    }

    /* renamed from: a */
    public final String mo108226a() {
        if (m142936u()) {
            return this.f116700X.f116753b;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo52204a(int i) {
        if (m142937v()) {
            int i2 = this.f116696T.getVideoRes().f116385a;
            int i3 = this.f116696T.getVideoRes().f116386b;
            float[] fArr = this.f116701Y.f116900c;
            float f = (float) i3;
            float f2 = (float) i2;
            this.f116527c.mo52980b((int) (fArr[0] * f), (int) (fArr[1] * f), (int) (fArr[2] * f2), (int) (fArr[3] * f2));
            this.f116527c.mo53001d(2, 0);
            float[] fArr2 = this.f116701Y.f116901d;
            this.f116527c.mo52960a(0, 0, (int) (fArr2[2] * f2), (int) (fArr2[3] * f));
        }
        if (i == 0) {
            if (!this.f116512aC.f116889e) {
                mo108207a(this.f116710ah.f55267a, this.f116710ah.f55268b);
                mo108203a(this.f116710ah.f55269c, this.f116710ah.f55270d);
                if (this.f116712aj.f55289g) {
                    if (!TextUtils.isEmpty(this.f116712aj.f55283a) && !TextUtils.isEmpty(this.f116712aj.f55284b)) {
                        mo108250a(this.f116712aj.f55283a, this.f116712aj.f55284b, this.f116712aj.f55285c, this.f116712aj.f55286d, this.f116712aj.f55287e);
                    } else if (!TextUtils.isEmpty(this.f116712aj.f55283a)) {
                        this.f116527c.mo52984b(this.f116712aj.f55283a, this.f116712aj.f55286d);
                    }
                } else if (!TextUtils.isEmpty(this.f116712aj.f55283a) && !TextUtils.isEmpty(this.f116712aj.f55284b)) {
                    mo108249a(this.f116712aj.f55283a, this.f116712aj.f55284b, this.f116712aj.f55285c);
                } else if (!TextUtils.isEmpty(this.f116712aj.f55283a)) {
                    this.f116527c.mo53008e(this.f116712aj.f55283a);
                    if (!this.f116712aj.f55288f) {
                        this.f116527c.mo53039k(this.f116712aj.f55286d);
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
            if (this.f116689M == null) {
                this.f116527c.mo52943a((C19779b) null);
            } else {
                this.f116527c.mo52944a((C19779b) this, this.f116689M.mo108751a().f116917b.ordinal());
            }
        } else {
            C45372t.m143409d(f116508a, "Create native GL env failed");
        }
        if (this.f116678B != null) {
            this.f116678B.mo55871a(i, "onNativeInitCallBack");
            if (this.f116678B instanceof C45225u) {
                ((C45225u) this.f116678B).mo55870a(1002, i, "Init onNativeInitCallBack");
            }
        }
    }

    /* renamed from: a */
    public final void mo52205a(int i, int i2) {
        if (this.f116678B != null) {
            int i3 = 1;
            boolean z = i != 0;
            this.f116678B.mo55872a(z);
            if (this.f116678B instanceof C45225u) {
                C45225u uVar = (C45225u) this.f116678B;
                if (!z) {
                    i3 = -1;
                }
                uVar.mo55870a(1003, i3, "Init HardEncode");
            }
        }
    }

    /* renamed from: a */
    public final void mo53070a(C19753a aVar) {
        C45394f fVar = this.f116689M;
        if (fVar != null) {
            VEFrame vEFrame = null;
            if (aVar.f53610c == VEFrame.ETEPixelFormat.TEPixFmt_OpenGL_RGBA8.ordinal()) {
                vEFrame = VEFrame.createTextureFrame(aVar.f53608a, aVar.f53609b, aVar.f53611d, aVar.f53612e, 0, aVar.f53613f, VEFrame.ETEPixelFormat.TEPixFmt_OpenGL_RGBA8);
            } else if (aVar.f53610c == VEFrame.ETEPixelFormat.TEPixFmt_YUV420P.ordinal()) {
                vEFrame = VEFrame.createByteBufferFrame(aVar.f53615h, aVar.f53611d, aVar.f53612e, 0, aVar.f53613f, VEFrame.ETEPixelFormat.TEPixFmt_YUV420P);
            }
            if (vEFrame != null) {
                vEFrame.setFromFrontCamera(aVar.f53616i);
            }
            fVar.mo108752a(vEFrame);
        }
    }

    /* renamed from: a */
    public final int mo108212a(String str, float f) {
        this.f116712aj.f55283a = str;
        this.f116712aj.f55284b = str;
        this.f116712aj.f55286d = f;
        this.f116712aj.f55287e = f;
        this.f116712aj.f55288f = false;
        this.f116712aj.f55285c = 1.0f;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f116527c.mo52984b(str, f);
        return 0;
    }

    /* renamed from: a */
    public final int mo108214a(String str, float f, boolean z) {
        this.f116712aj.f55283a = str;
        this.f116712aj.f55286d = f;
        this.f116712aj.f55287e = f;
        this.f116712aj.f55288f = z;
        if (TextUtils.isEmpty(str)) {
            this.f116527c.mo53008e("");
            return 0;
        }
        this.f116527c.mo53008e(str);
        if (f >= 0.0f && f <= 1.0f && !z) {
            this.f116527c.mo53039k(f);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo108249a(String str, String str2, float f) {
        this.f116712aj.f55283a = str;
        this.f116712aj.f55284b = str2;
        this.f116712aj.f55285c = f;
        this.f116712aj.f55288f = true;
        this.f116527c.mo52948a(C45376c.m143419a(str), C45376c.m143419a(str2), f);
    }

    /* renamed from: a */
    public final void mo108250a(String str, String str2, float f, float f2, float f3) {
        this.f116712aj.f55283a = str;
        this.f116712aj.f55284b = str2;
        this.f116712aj.f55285c = f;
        this.f116712aj.f55286d = f2;
        this.f116712aj.f55287e = f3;
        this.f116712aj.f55288f = true;
        this.f116712aj.f55289g = true;
        this.f116527c.mo52949a(C45376c.m143419a(str), C45376c.m143419a(str2), f, f2, f3);
    }

    /* renamed from: a */
    public final int mo108207a(int i, String str) {
        this.f116710ah.f55267a = i;
        this.f116710ah.f55268b = str;
        this.f116527c.mo52981b(i, str);
        return 0;
    }

    /* renamed from: a */
    public final int mo108213a(String str, float f, float f2) {
        this.f116713ak.f55290a = str;
        this.f116713ak.f55291b = f;
        this.f116713ak.f55292c = f2;
        this.f116527c.mo52901a(C45376c.m143419a(str), f, f2);
        return 0;
    }

    /* renamed from: a */
    public final int mo108211a(String str) {
        this.f116713ak.f55290a = str;
        this.f116527c.mo52998d(str);
        return 0;
    }

    /* renamed from: a */
    public final int mo108222a(Map<Integer, Float> map) {
        this.f116713ak.mo55135a(map);
        this.f116527c.mo52952a(map);
        return 0;
    }

    /* renamed from: a */
    public final int mo108220a(String str, Map<Integer, Float> map) {
        this.f116713ak.f55290a = str;
        this.f116713ak.mo55135a(map);
        this.f116527c.mo52951a(str, map);
        return 0;
    }

    /* renamed from: b */
    public final boolean mo108266b(boolean z) {
        return this.f116527c.mo53046m(z);
    }

    /* renamed from: a */
    public final int mo108216a(String str, int i, int i2, boolean z, String str2) {
        this.f116711ai.f55271a = str;
        this.f116711ai.f55274d = i2;
        this.f116711ai.f55273c = i;
        this.f116711ai.f55275e = str2;
        this.f116711ai.f55276f = z;
        return this.f116527c.mo52904a(C45376c.m143419a(str), i, i2, z, str2);
    }

    /* renamed from: a */
    public final void mo108246a(C45399j jVar) {
        super.mo108246a(jVar);
        if (this.f116541r == null) {
            this.f116541r = new CopyOnWriteArrayList();
        }
        this.f116541r.add(jVar);
        if (this.f116516aG == null) {
            this.f116516aG = new FaceInfoCallback() {
                public final void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo) {
                    for (C45399j a : C45278d.this.f116541r) {
                        a.mo56381a(C45314b.m143103a(faceAttributeInfo), C45317d.m143104a(faceDetectInfo));
                    }
                }
            };
        }
        this.f116527c.mo52954a(true, this.f116516aG);
    }

    /* renamed from: b */
    public final void mo108354b(C45399j jVar) {
        super.mo108354b(jVar);
        if (this.f116541r != null) {
            for (C45399j jVar2 : this.f116541r) {
                if (jVar2.equals(jVar)) {
                    this.f116541r.remove(jVar2);
                }
            }
            if (this.f116541r.isEmpty()) {
                this.f116527c.mo53055r();
            }
        }
    }

    /* renamed from: a */
    public final void mo108245a(final C45398i iVar) {
        super.mo108245a(iVar);
        this.f116527c.mo52933a((EffectAlgorithmCallback) new EffectAlgorithmCallback() {
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
        this.f116527c.mo52934a((OnCherEffectParmaCallback) new OnCherEffectParmaCallback() {
            public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
                hVar.mo56128a(strArr, dArr, zArr);
            }
        });
    }

    /* renamed from: a */
    public final void mo108240a(VECherEffectParam vECherEffectParam) {
        this.f116527c.mo52958a(vECherEffectParam.getMatrix(), vECherEffectParam.getDuration(), vECherEffectParam.getSegUseCher());
    }

    /* renamed from: a */
    public final void mo108234a(int i, long j, long j2, String str) {
        this.f116527c.mo52926a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo108238a(C1944a aVar) {
        this.f116527c.mo52932a(aVar);
    }

    /* renamed from: a */
    public final void mo108253a(float[] fArr) {
        this.f116527c.mo52955a(fArr);
    }

    /* renamed from: a */
    public final void mo108351a(float[] fArr, double d) {
        this.f116527c.mo52956a(fArr, d);
    }

    /* renamed from: a */
    public final void mo108228a(float f, float f2, float f3) {
        this.f116527c.mo52922a(f, f2, f3);
    }

    /* renamed from: a */
    public final int mo108223a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f116527c.mo52911a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final int mo108224a(double[] dArr, double d) {
        return this.f116527c.mo52912a(dArr, d);
    }

    /* renamed from: a */
    public final int mo108206a(int i, float f, float f2, int i2) {
        return this.f116527c.mo52888a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final int mo108215a(String str, int i, int i2, String str2) {
        return this.f116527c.mo52971b(str, i, i2, str2);
    }

    /* renamed from: a */
    public final int mo108210a(final C45392d dVar) {
        return this.f116527c.mo52897a((OnARTextCountCallback) new OnARTextCountCallback() {
            public final void onResult(int i) {
                if (dVar != null) {
                    dVar.mo56129a(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final int mo108209a(final C45391c cVar) {
        this.f116527c.mo52895a((OnARTextBitmapCallback) new OnARTextBitmapCallback() {
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
    public final int mo108343a(Bitmap bitmap) {
        return this.f116527c.mo52892a(bitmap);
    }

    /* renamed from: b */
    public final void mo108352b(int i) {
        this.f116527c.mo53028h(i);
    }

    /* renamed from: a */
    public final void mo108348a(C45336r rVar) {
        this.f116527c.mo52946a(rVar);
    }

    /* renamed from: b */
    public final void mo108353b(C45336r rVar) {
        this.f116527c.mo52983b(rVar);
    }

    /* renamed from: a */
    public final void mo108248a(String str, String str2) {
        this.f116527c.mo52947a(str, str2);
    }

    /* renamed from: a */
    public final int mo108217a(String str, int i, int i2, boolean z, boolean z2, CompressFormat compressFormat, C45390b bVar, boolean z3) {
        return m142933a(str, i, i2, z, z2, compressFormat, bVar);
    }

    /* renamed from: a */
    public final int mo108225a(String[] strArr, int i) {
        return this.f116527c.mo52913a(strArr, i);
    }

    /* renamed from: b */
    public final int[] mo108267b(String str, String str2) {
        return this.f116527c.mo52985b(str, str2);
    }

    /* renamed from: a */
    public final int mo108208a(VEEffectParams vEEffectParams) {
        return this.f116527c.mo52899a(vEEffectParams);
    }

    /* renamed from: a */
    public final void mo52206a(boolean z) {
        for (C45404o oVar : this.f116691O.mo108185b()) {
            if (oVar != null) {
                oVar.mo56377a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo108229a(float f, float f2, float f3, float f4) {
        this.f116527c.mo52923a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo108252a(boolean z, long j) {
        this.f116527c.mo52953a(z, j);
    }

    /* renamed from: g */
    public final void mo108290g() {
        this.f116527c.mo53051p();
    }

    /* renamed from: h */
    public final void mo108293h() {
        this.f116527c.mo53053q();
    }

    /* renamed from: j */
    public final void mo108297j() {
        m142941z();
        mo108364t();
    }

    /* renamed from: k */
    public final boolean mo108300k() {
        return this.f116527c.mo52959a();
    }

    /* renamed from: n */
    public final float mo108305n() {
        return this.f116527c.mo52963b();
    }

    /* renamed from: q */
    public final EnigmaResult mo108312q() {
        return this.f116527c.mo53060t();
    }

    /* renamed from: x */
    private void m142939x() {
        this.f116533i = -1;
        this.f116536m = 0;
        this.f116531g.f116385a = 0;
        this.f116531g.f116386b = 0;
    }

    /* renamed from: y */
    private void m142940y() {
        this.f116527c.mo53038j(false);
        if (this.f116530f != null) {
            this.f116530f.mo108188b();
        }
    }

    /* renamed from: z */
    private void m142941z() {
        this.f116527c.mo53038j(true);
        if (this.f116530f != null) {
            this.f116530f.mo108191e();
        }
    }

    /* renamed from: l */
    public final int[] mo108302l() {
        return this.f116527c.mo53003d();
    }

    /* renamed from: m */
    public final int[] mo108304m() {
        return this.f116527c.mo52995c();
    }

    /* renamed from: o */
    public final void mo108307o() {
        super.mo108307o();
        this.f116541r.clear();
        this.f116527c.mo53055r();
    }

    /* renamed from: p */
    public final void mo108310p() {
        super.mo108310p();
        this.f116527c.mo53059s();
    }

    /* renamed from: r */
    public final long mo108361r() {
        return this.f116527c.mo53027h();
    }

    /* renamed from: s */
    public final void mo108362s() {
        if (this.f116537n != 0) {
            this.f116527c.mo53005e();
            this.f116537n = 0;
        }
    }

    /* renamed from: u */
    private boolean m142936u() {
        if (this.f116702Z != VERecordMode.DUET || this.f116700X == null || this.f116700X.f116752a == null || this.f116700X.f116753b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m142937v() {
        if (this.f116702Z != VERecordMode.REACTION || this.f116701Y == null || this.f116701Y.f116899b == null || this.f116701Y.f116898a == null) {
            return false;
        }
        return true;
    }

    public final boolean bW_() {
        C45394f fVar = this.f116689M;
        if (fVar != null) {
            fVar.mo108751a();
            if (fVar.mo108751a().f116916a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long mo108281d() {
        return this.f116527c.mo53021g();
    }

    /* renamed from: f */
    public final void mo108288f() {
        if (!this.f116522aw) {
            mo108241a((C45210f) null);
        }
        if (this.f116726z != null) {
            this.f116726z.mo108391b((C45311d) this);
        }
        if (this.f116530f != null) {
            this.f116530f.mo108192f();
        }
        this.f116527c.mo52936a((C19621a) null);
        this.f116514aE.submit(new Runnable() {
            public final void run() {
                C45278d.this.mo108362s();
            }
        });
        this.f116514aE.shutdown();
        super.mo108288f();
    }

    /* renamed from: c */
    public final void mo108273c() {
        if (this.f116530f != null) {
            this.f116530f.mo108190d();
        } else {
            C45372t.m143407c(f116508a, "No Camera capture to stopCameraPreview");
        }
    }

    /* renamed from: t */
    public final synchronized void mo108364t() {
        if ((this.f116537n & 2) == 0) {
            String str = f116508a;
            StringBuilder sb = new StringBuilder("stopRecordPreview status error: ");
            sb.append(this.f116537n);
            C45372t.m143407c(str, sb.toString());
            return;
        }
        this.f116527c.mo53043l(false);
        this.f116537n = 1;
        this.f116527c.mo53047n();
        this.f116527c.mo52937a((C19622b) null);
        this.f116527c.mo52935a((OnRunningErrorCallback) null);
        this.f116527c.mo52982b((C19623c) this);
        mo108354b(this.f116517aH);
        this.f116517aH = null;
        if (this.f116717ao) {
            mo108362s();
        } else {
            this.f116537n = 1;
        }
    }

    /* renamed from: w */
    private int m142938w() {
        VESize vESize;
        int i;
        if (this.f116537n != 0) {
            String str = f116508a;
            StringBuilder sb = new StringBuilder("initInternalRecorder called in a invalid state: ");
            sb.append(this.f116537n);
            sb.append("should be : 0");
            C45372t.m143409d(str, sb.toString());
            return -105;
        }
        if (this.f116697U != null) {
            this.f116527c.mo52917a(this.f116697U.f116083c, this.f116697U.f116085e);
        }
        this.f116527c.mo52928a(this.f116725y);
        int i2 = this.f116696T.getVideoRes().f116385a;
        int i3 = this.f116696T.getVideoRes().f116386b;
        boolean z = !TextUtils.isEmpty(this.f116703aa);
        if (this.f116702Z == VERecordMode.DUET) {
            i3 /= 2;
        }
        int i4 = i3;
        if (this.f116717ao) {
            vESize = this.f116719aq;
        } else {
            vESize = new VESize(this.f116512aC.f116885a.f116386b, this.f116512aC.f116885a.f116385a);
        }
        C19764d dVar = this.f116527c;
        int i5 = vESize.f116385a;
        int i6 = vESize.f116386b;
        String str2 = this.f116528d;
        String str3 = this.f116698V;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        int a = dVar.mo52889a(i5, i6, str2, i4, i2, str3, i, this.f116699W);
        if (a == 0) {
            this.f116537n = 1;
        }
        return a;
    }

    /* renamed from: i */
    public final synchronized int mo108295i() {
        float f;
        if (this.f116537n != 3) {
            String str = f116508a;
            StringBuilder sb = new StringBuilder("nativeStopRecord called in a invalid state: ");
            sb.append(this.f116537n);
            C45372t.m143409d(str, sb.toString());
            return -105;
        }
        this.f116518aI = false;
        this.f116519aJ = false;
        this.f116527c.mo53037j();
        this.f116518aI = true;
        this.f116527c.mo53042l();
        if (this.f116519aJ && this.f116678B != null && (this.f116678B instanceof C45225u)) {
            ((C45225u) this.f116678B).mo55870a(1021, 0, "更新分段时长");
        }
        long g = (long) (((float) this.f116527c.mo53021g()) / 1000.0f);
        this.f116526b.add(new C19755c(g, (double) this.f116524ay));
        synchronized (f116509k) {
            this.f116525az = -1;
            f = (float) g;
            this.f116529e = (long) (((float) this.f116529e) + ((1.0f * f) / this.f116524ay));
        }
        this.f116537n = 2;
        return (int) (f / this.f116524ay);
    }

    /* renamed from: a */
    public final void mo108239a(IStickerRequestCallback iStickerRequestCallback) {
        this.f116694R = iStickerRequestCallback;
    }

    /* renamed from: g_ */
    public final void mo108292g_(boolean z) {
        this.f116535l = z;
    }

    /* renamed from: b */
    public final int mo108256b(float f) {
        return this.f116527c.mo53036j(f);
    }

    /* renamed from: c */
    public final float mo108269c(String str) {
        return this.f116527c.mo53011f(str);
    }

    /* renamed from: f */
    public final void mo108358f(String str) {
        this.f116527c.mo53026h(str);
    }

    /* renamed from: i */
    public final void mo108296i(boolean z) {
        this.f116527c.mo53002d(z);
    }

    /* renamed from: l */
    public final int mo108301l(boolean z) {
        return this.f116527c.mo53058s(z);
    }

    /* renamed from: m */
    public final void mo108303m(boolean z) {
        this.f116527c.mo53063u(z);
    }

    /* renamed from: p */
    public final void mo108311p(boolean z) {
        this.f116527c.mo53068z(z);
    }

    /* renamed from: r */
    public final int mo108360r(boolean z) {
        return this.f116527c.mo53066x(z);
    }

    /* renamed from: s */
    public final void mo108363s(boolean z) {
        this.f116527c.f53657n = z;
    }

    /* renamed from: t */
    public final void mo108365t(boolean z) {
        this.f116527c.mo53067y(z);
    }

    /* renamed from: a */
    private void m142934a(final C45207c cVar) {
        this.f116527c.mo52942a((C19778a) new C19778a() {
        });
    }

    /* renamed from: d */
    public final int mo108279d(Surface surface) {
        int a = this.f116527c.mo52893a(surface);
        this.f116527c.mo53007e(2);
        return a;
    }

    /* renamed from: f */
    public final void mo108289f(boolean z) {
        this.f116527c.mo53056r(z);
    }

    /* renamed from: g */
    public final void mo108291g(boolean z) {
        this.f116527c.mo53009e(z);
    }

    /* renamed from: h */
    public final void mo108294h(boolean z) {
        this.f116527c.mo52994c(z);
    }

    /* renamed from: j */
    public final void mo108298j(boolean z) {
        this.f116527c.f53653j = z;
    }

    /* renamed from: k */
    public final void mo108299k(final boolean z) {
        this.f116510aA = z;
        m142935b((Runnable) new Runnable() {
            public final void run() {
                C45278d.this.f116527c.mo53000d(z ? 1 : 0);
            }
        });
    }

    /* renamed from: n */
    public final void mo108306n(boolean z) {
        this.f116527c.mo53064v(z);
    }

    /* renamed from: a */
    public static int m142931a(ETEPixelFormat eTEPixelFormat) {
        switch (eTEPixelFormat) {
            case PIXEL_FORMAT_JPEG:
                return 1;
            case PIXEL_FORMAT_NV21:
                return -3;
            case PIXEL_FORMAT_YUV420:
                return -2;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    private void m142935b(Runnable runnable) {
        if (!this.f116520aK) {
            runnable.run();
        } else if (this.f116514aE.isShutdown()) {
            C45372t.m143409d(f116508a, "EXECUTOR isShutdown");
        } else {
            this.f116514aE.submit(runnable);
        }
    }

    /* renamed from: d */
    public final int mo108280d(String str) {
        return this.f116527c.mo52989c(C45376c.m143419a(str));
    }

    /* renamed from: e */
    public final int mo108286e(String str) {
        return this.f116527c.mo53020g(str);
    }

    /* renamed from: o */
    public final void mo108308o(boolean z) {
        if (z) {
            this.f116527c.mo52966b(this.f116725y);
        } else {
            this.f116527c.mo53062u();
        }
    }

    public int closeWavFile(boolean z) {
        C45372t.m143405b(f116508a, "closeWavFile...");
        this.f116519aJ = true;
        if (this.f116518aI && this.f116678B != null && (this.f116678B instanceof C45225u)) {
            ((C45225u) this.f116678B).mo55870a(1021, 0, "更新分段时长");
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo108287e(boolean z) {
        this.f116527c.mo53054q(z);
    }

    public void onError(int i) {
        String str = f116508a;
        StringBuilder sb = new StringBuilder("running error: ");
        sb.append(i);
        C45372t.m143409d(str, sb.toString());
        int i2 = OnRunningErrorCallback.FRAG_HW_ENCODER_ERR;
        if (i == -602) {
            i2 = OnRunningErrorCallback.INIT_FRAG_OUTPUT_ERR;
        } else if (i != -601) {
            i2 = 0;
        }
        if (this.f116678B instanceof C45225u) {
            ((C45225u) this.f116678B).mo55873b(i2, "");
        }
    }

    /* renamed from: q */
    public final int mo108359q(boolean z) {
        if (!this.f116512aC.f116886b && !z) {
            return 0;
        }
        if (this.f116702Z == VERecordMode.DUET || this.f116702Z == VERecordMode.REACTION || this.f116702Z == VERecordMode.CUSTOM_VIDEO_BG || !TextUtils.isEmpty(this.f116703aa)) {
            return 5;
        }
        return 1;
    }

    /* renamed from: b */
    public final int mo108258b(final C45392d dVar) {
        return this.f116527c.mo52896a((OnARTextContentCallback) new OnARTextContentCallback() {
            public final void onResult(String[] strArr) {
                if (dVar != null) {
                    dVar.mo56130a(strArr);
                }
            }
        });
    }

    /* renamed from: d */
    public final void mo108355d(int i) {
        this.f116527c.mo53022g(i);
    }

    /* renamed from: b */
    public final int mo108259b(String str) {
        this.f116714al.f55278a = str;
        this.f116527c.mo52969b(C45376c.m143419a(str));
        return 0;
    }

    /* renamed from: c */
    public final void mo108274c(int i) {
        this.f116527c.mo53033i(i);
    }

    /* renamed from: d */
    public final void mo108282d(boolean z) {
        this.f116527c.mo53052p(z);
    }

    /* renamed from: a */
    public final synchronized int mo108202a(float f) {
        int i;
        float f2 = f;
        synchronized (this) {
            if (this.f116696T == null) {
                return -108;
            }
            if (this.f116537n != 2) {
                String str = f116508a;
                StringBuilder sb = new StringBuilder("nativeStartRecord called in a invalid state: ");
                sb.append(this.f116537n);
                sb.append("should be : 2");
                C45372t.m143409d(str, sb.toString());
                return -105;
            }
            this.f116537n = 3;
            this.f116527c.mo52967b(this.f116725y, mo108359q(true), (AudioRecorderInterface) this);
            this.f116524ay = f2;
            this.f116527c.mo52918a(this.f116704ab, this.f116529e);
            if (this.f116696T.getBitrateMode() == ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF) {
                int swCRF = this.f116696T.getSwCRF();
                C19764d dVar = this.f116527c;
                int ordinal = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
                if (swCRF < 12) {
                    swCRF = 12;
                }
                dVar.mo52991c(ordinal, swCRF);
            } else {
                this.f116527c.mo52991c(ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal(), this.f116696T.getSwQP());
            }
            float bps = (((float) this.f116696T.getBps()) * 1.0f) / 4194304.0f;
            if (this.f116696T.getEncodeProfile() == ENCODE_PROFILE.ENCODE_PROFILE_MAIN.ordinal()) {
                i = 2;
            } else if (this.f116696T.getEncodeProfile() == ENCODE_PROFILE.ENCODE_PROFILE_HIGH.ordinal()) {
                i = 8;
            } else {
                i = 1;
            }
            this.f116527c.mo53050o(this.f116723au);
            if (this.f116724av != null) {
                if (this.f116724av.waterMarkBitmap == null) {
                    this.f116527c.mo52957a(this.f116724av.images, this.f116724av.width, this.f116724av.height, this.f116724av.xOffset, this.f116724av.yOffset, this.f116724av.position.ordinal(), this.f116724av.interval, this.f116724av.rotation);
                } else {
                    this.f116527c.mo52931a(this.f116724av.waterMarkBitmap, this.f116724av.width, this.f116724av.height, this.f116724av.xOffset, this.f116724av.yOffset, this.f116724av.position.ordinal(), this.f116724av.interval, this.f116724av.rotation);
                }
            }
            m142934a(this.f116693Q);
            int a = this.f116527c.mo52885a((double) f2, !this.f116696T.isSupportHwEnc(), bps, 1, i, false, this.f116696T.getDescription(), this.f116696T.getComment());
            if (a != 0) {
                String str2 = f116508a;
                StringBuilder sb2 = new StringBuilder("nativeStartRecord error: ");
                sb2.append(a);
                C45372t.m143409d(str2, sb2.toString());
            }
            synchronized (f116509k) {
                this.f116525az = 0;
            }
            return a;
        }
    }

    /* renamed from: e */
    public final synchronized int mo108357e(Surface surface) {
        int i;
        int i2;
        boolean z;
        if (this.f116678B != null && (this.f116678B instanceof C45225u)) {
            ((C45225u) this.f116678B).mo55870a(1020, 0, "在这里可以更换ResManager");
        }
        if (this.f116537n == 0) {
            mo108362s();
            int w = m142938w();
            if (w != 0) {
                String str = f116508a;
                StringBuilder sb = new StringBuilder("nativeInitFaceBeautyPlay error: ");
                sb.append(w);
                C45372t.m143409d(str, sb.toString());
                return -108;
            }
        }
        if (this.f116537n != 1) {
            String str2 = f116508a;
            StringBuilder sb2 = new StringBuilder("startRecordPreview statue error: ");
            sb2.append(this.f116537n);
            C45372t.m143409d(str2, sb2.toString());
            if (this.f116511aB != surface) {
                mo108279d(surface);
                this.f116511aB = surface;
            }
            return -105;
        }
        this.f116511aB = surface;
        m142939x();
        this.f116527c.mo52941a(this.f116694R);
        this.f116527c.mo53015f(this.f116707ae);
        this.f116527c.mo52978b(this.f116720ar);
        this.f116527c.mo52992c(this.f116721as);
        this.f116527c.mo53048n(this.f116716an);
        VESize videoRes = this.f116696T.getVideoRes();
        if (this.f116718ap.mo108058a() && !videoRes.equals(this.f116718ap)) {
            this.f116527c.mo52979b(this.f116718ap.f116385a, this.f116718ap.f116386b);
            videoRes.f116385a = this.f116718ap.f116385a;
            videoRes.f116386b = this.f116718ap.f116386b;
        }
        if (this.f116702Z == VERecordMode.DUET) {
            this.f116527c.mo52950a(this.f116700X.f116752a, this.f116700X.f116753b, this.f116700X.f116754c, this.f116700X.f116755d, this.f116700X.f116756e, this.f116700X.f116757f);
        } else if (this.f116702Z == VERecordMode.REACTION) {
            this.f116527c.mo52929a(this.f116725y, this.f116701Y.f116898a, this.f116701Y.f116899b);
        } else {
            C19764d a = this.f116527c.mo52919a(this.f116703aa);
            if (this.f116706ad == 1) {
                z = true;
            } else {
                z = false;
            }
            a.mo52920a(z).mo52918a(this.f116704ab, 0);
        }
        this.f116527c.mo52993c(1);
        this.f116527c.mo53040k(this.f116512aC.f116887c);
        this.f116527c.mo52937a((C19622b) this);
        this.f116527c.mo52935a((OnRunningErrorCallback) this);
        this.f116527c.mo53052p(this.f116512aC.f116888d);
        this.f116527c.mo53046m(this.f116512aC.f116890f);
        this.f116527c.mo53017f(this.f116722at);
        this.f116527c.mo52938a((C19623c) this);
        this.f116527c.mo53023g(this.f116512aC.f116892h);
        this.f116527c.mo53029h(this.f116512aC.f116893i);
        if (surface != null) {
            i = this.f116527c.mo52894a(surface, Build.DEVICE);
        } else {
            int i3 = -1;
            if (this.f116726z != null) {
                i2 = this.f116726z.f116622c;
            } else {
                i2 = -1;
            }
            if (this.f116726z != null) {
                i3 = this.f116726z.f116623d;
            }
            i = this.f116527c.mo53019g(i2, i3);
        }
        if (i != 0) {
            String str3 = f116508a;
            StringBuilder sb3 = new StringBuilder("nativeStartPlay error: ");
            sb3.append(i);
            C45372t.m143409d(str3, sb3.toString());
        }
        if (this.f116682F != null) {
            new StringBuilder("nativeStartPlay error: ").append(i);
        }
        this.f116537n = 2;
        this.f116527c.mo52891a(this.f116725y, mo108359q(false), (AudioRecorderInterface) this);
        synchronized (this.f116515aF) {
            if (!this.f116526b.isEmpty()) {
                int a2 = this.f116527c.mo52890a(this.f116526b.size(), this.f116528d);
                if (a2 != 0) {
                    String str4 = f116508a;
                    StringBuilder sb4 = new StringBuilder("tryRestore ret: ");
                    sb4.append(a2);
                    C45372t.m143409d(str4, sb4.toString());
                } else {
                    this.f116529e = (long) C19755c.m65125a(this.f116526b);
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void mo108276c(Surface surface) {
        this.f116520aK = false;
        m142940y();
        mo108357e(surface);
    }

    /* renamed from: c */
    public final void mo108277c(boolean z) {
        this.f116527c.mo53065w(z);
    }

    /* renamed from: d */
    public final int mo108278d(float f, float f2) {
        return this.f116527c.mo53004e(f, f2);
    }

    /* renamed from: e */
    public final int mo108284e(float f, float f2) {
        return this.f116527c.mo53013f(f, f2);
    }

    public int addPCMData(byte[] bArr, int i) {
        C45372t.m143405b(f116508a, "addPCMData...");
        if (this.f116680D != null) {
            Arrays.copyOf(bArr, i);
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo108285e(int i, int i2) {
        return this.f116527c.mo53025h(i, i2);
    }

    /* renamed from: c */
    public final int mo108271c(float f, float f2) {
        return this.f116527c.mo52997d(f, f2);
    }

    /* renamed from: b */
    public final int mo108257b(float f, float f2) {
        return this.f116527c.mo52987c(f, f2);
    }

    /* renamed from: c */
    public final int mo108272c(String str, String str2) {
        return this.f116527c.mo52990c(str, str2);
    }

    public void onInfo(int i, int i2) {
        String str = f116508a;
        StringBuilder sb = new StringBuilder("onInfo: ");
        sb.append(i);
        sb.append("ext:");
        sb.append(i2);
        C45372t.m143403a(str, sb.toString());
        String str2 = "";
        if (i == 1030) {
            str2 = "shotScreen...";
        }
        if (this.f116678B instanceof C45225u) {
            ((C45225u) this.f116678B).mo55870a(i, i2, str2);
        }
    }

    /* renamed from: a */
    public final int mo108203a(float f, float f2) {
        this.f116710ah.f55269c = f;
        this.f116710ah.f55270d = f2;
        this.f116527c.mo52921a(f, f2);
        return 0;
    }

    /* renamed from: c */
    public final void mo108275c(int i, int i2) {
        this.f116527c.mo53001d(i, i2);
    }

    /* renamed from: d */
    public final boolean mo108283d(int i, int i2) {
        return this.f116527c.mo53010e(i, i2);
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
        this.f116527c.mo52887a(i, f);
        return 0;
    }

    /* renamed from: b */
    public final int mo108262b(String[] strArr, int i) {
        return this.f116527c.mo52973b(strArr, i);
    }

    public int initWavFile(int i, int i2, double d) {
        C45372t.m143405b(f116508a, "initWavFile...");
        return 0;
    }

    public C45278d(Context context, C45362d dVar, C45310c cVar) {
        super(context, dVar, cVar);
        if (this.f116726z != null) {
            this.f116726z.mo108390a((C45311d) this);
        }
        this.f116527c = new C19764d();
        this.f116527c.mo52881a(this.f116521aL);
        C20479f.m67954a("iesve_use_new_record", 1);
    }

    /* renamed from: b */
    public final int mo108260b(String str, float f, float f2) {
        this.f116714al.f55278a = str;
        this.f116714al.f55279b = f;
        this.f116714al.f55280c = f2;
        this.f116527c.mo52970b(C45376c.m143419a(str), f, f2);
        return 0;
    }

    /* renamed from: b */
    public final int mo108261b(String str, String str2, float f) {
        return this.f116527c.mo52972b(str, str2, f);
    }

    /* renamed from: b */
    public final int mo108255b(double d, double d2, double d3, double d4) {
        return this.f116527c.mo52964b(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final int mo108270c(double d, double d2, double d3, double d4) {
        return this.f116527c.mo52986c(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo108201a(double d, double d2, double d3, double d4) {
        return this.f116527c.mo52883a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo108204a(float f, float f2, float f3, float f4, float f5) {
        return this.f116527c.mo52886a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    private int m142933a(String str, final int i, final int i2, final boolean z, boolean z2, CompressFormat compressFormat, final C45390b bVar) {
        if (i <= 720) {
            C4528717 r7 = new C19704b() {
                /* renamed from: a */
                public final void mo52404a(int i) {
                    bVar.mo55927a(i);
                }
            };
            return this.f116527c.mo52909a(str, new int[]{i, i2}, z2, compressFormat, (C19704b) r7);
        } else if (this.f116530f != null) {
            final C45390b bVar2 = bVar;
            final String str2 = str;
            final CompressFormat compressFormat2 = compressFormat;
            final boolean z3 = z;
            final C4528818 r1 = new C19780c() {
                /* renamed from: a */
                public final void mo53072a(Bitmap bitmap, int i) {
                    bVar2.mo55927a(i);
                    if (i == 0 && bitmap != null) {
                        C19705b.m64964a(bitmap, str2, compressFormat2);
                    }
                    if (i != 0 || z3) {
                        C45278d.this.f116530f.mo108189c();
                    }
                }
            };
            this.f116530f.mo108187a(i, i2, new C20638f() {
                /* renamed from: a */
                public final void mo55815a(Exception exc) {
                    r1.mo53072a(null, -1000);
                }

                /* renamed from: a */
                public final void mo55814a(TECameraFrame tECameraFrame, C20604f fVar) {
                    ImageFrame imageFrame = null;
                    if (tECameraFrame == null) {
                        r1.mo53072a(null, -1000);
                        return;
                    }
                    if (fVar instanceof C20573c) {
                        imageFrame = new ImageFrame(tECameraFrame.mo55507a(), C45278d.m142931a(tECameraFrame.mo55513g()), tECameraFrame.mo55512f().f55535a, tECameraFrame.mo55512f().f55536b);
                    } else if (fVar instanceof C20599e) {
                        imageFrame = new ImageFrame(TEPlanUtils.convert(tECameraFrame.mo55509c()), C45278d.m142931a(tECameraFrame.mo55513g()), tECameraFrame.mo55512f().f55535a, tECameraFrame.mo55512f().f55536b);
                    }
                    C45278d.this.f116527c.mo52939a(imageFrame, i, i2, 0, (C19781d) new C19781d() {
                        /* renamed from: a */
                        public final void mo53074a(Bitmap bitmap) {
                            r1.mo53072a(bitmap, 0);
                        }

                        /* renamed from: a */
                        public final void mo53073a(int i, int i2) {
                            if (i2 < 0) {
                                r1.mo53072a(null, i2);
                            }
                        }
                    });
                }
            });
            return 0;
        } else {
            throw new IllegalStateException("No Camera capture to capture");
        }
    }
}

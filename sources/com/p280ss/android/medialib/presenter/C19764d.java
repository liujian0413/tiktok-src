package com.p280ss.android.medialib.presenter;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.C19721f;
import com.p280ss.android.medialib.FaceBeautyInvoker;
import com.p280ss.android.medialib.FaceBeautyInvoker.C19613a;
import com.p280ss.android.medialib.FaceBeautyInvoker.EffectAlgorithmCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.FaceInfoCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextBitmapCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnFrameCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnPictureCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnPictureCallbackV2;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19630b;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.medialib.common.C19702a.C19703a;
import com.p280ss.android.medialib.common.C19702a.C19704b;
import com.p280ss.android.medialib.common.C19705b;
import com.p280ss.android.medialib.log.IMonitor;
import com.p280ss.android.medialib.model.C19753a;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.p879a.C19617a.C19618a;
import com.p280ss.android.medialib.p880b.C19621a;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.medialib.p880b.C19623c;
import com.p280ss.android.medialib.p880b.C19624d;
import com.p280ss.android.medialib.p881c.C19627a;
import com.p280ss.android.medialib.p881c.C19628b;
import com.p280ss.android.medialib.p883d.C19718d;
import com.p280ss.android.medialib.p884qr.ScanSettings;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.vesdk.C45336r;
import com.p280ss.android.vesdk.C45372t;
import com.p280ss.android.vesdk.LandMarkFrame;
import com.p280ss.android.vesdk.VEEffectParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.libsdl.app.AudioRecorderInterface;
import org.libsdl.app.AudioRecorderInterfaceExt;
import org.libsdl.app.BufferedAudioRecorder;

/* renamed from: com.ss.android.medialib.presenter.d */
public class C19764d implements C19618a, C19763c, AudioRecorderInterfaceExt {

    /* renamed from: a */
    public static final String f53636a = "d";

    /* renamed from: A */
    private boolean f53637A = false;

    /* renamed from: B */
    private float f53638B = 1.0f;

    /* renamed from: C */
    private boolean f53639C = false;

    /* renamed from: D */
    private volatile boolean f53640D = false;

    /* renamed from: E */
    private int f53641E = 44100;

    /* renamed from: F */
    private int f53642F = 2;

    /* renamed from: G */
    private double f53643G = -1.0d;

    /* renamed from: H */
    private C19624d f53644H = new C19624d() {
        /* renamed from: a */
        public final long mo52207a(boolean z) {
            final long b = C19764d.m65157b(C19764d.this.f53656m) / 1000;
            if (C19764d.this.f53650g != null && z) {
                C19628b.m64631a("camera_offset", new C19627a() {
                    /* renamed from: a */
                    public final void mo52213a(Map<String, Object> map) {
                        map.put("camera_offset", Long.valueOf(b));
                        map.put("audio_type", Integer.valueOf(C19764d.this.f53647d));
                    }
                });
            }
            return b;
        }
    };

    /* renamed from: b */
    public BufferedAudioRecorder f53645b;

    /* renamed from: c */
    public String f53646c;

    /* renamed from: d */
    public int f53647d = 1;

    /* renamed from: e */
    public int f53648e = 18;

    /* renamed from: f */
    public AudioRecorderInterface f53649f;

    /* renamed from: g */
    public C19628b f53650g;

    /* renamed from: h */
    public C19779b f53651h;

    /* renamed from: i */
    public FaceBeautyInvoker f53652i = new FaceBeautyInvoker();

    /* renamed from: j */
    public boolean f53653j = true;

    /* renamed from: k */
    public int f53654k = 0;

    /* renamed from: l */
    public boolean f53655l = true;

    /* renamed from: m */
    SurfaceTexture f53656m;

    /* renamed from: n */
    public boolean f53657n = false;

    /* renamed from: o */
    public int f53658o = -1;

    /* renamed from: p */
    public float f53659p = -1.0f;

    /* renamed from: q */
    public long f53660q = 0;

    /* renamed from: r */
    public long f53661r = 0;

    /* renamed from: s */
    public OnFrameAvailableListener f53662s = new OnFrameAvailableListener() {
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (C19764d.this.f53658o == -1) {
                C19764d.this.f53660q = System.currentTimeMillis();
            }
            C19764d.this.f53658o++;
            C19764d.this.f53661r = System.currentTimeMillis();
            float f = ((float) (C19764d.this.f53661r - C19764d.this.f53660q)) / 1000.0f;
            if (f >= 1.0f) {
                C19764d.this.f53659p = ((float) C19764d.this.f53658o) / f;
                C19764d.this.f53660q = C19764d.this.f53661r;
                C19764d.this.f53658o = 0;
            }
        }
    };

    /* renamed from: t */
    private long f53663t;

    /* renamed from: u */
    private long f53664u;

    /* renamed from: v */
    private boolean f53665v;

    /* renamed from: w */
    private boolean f53666w;

    /* renamed from: x */
    private AtomicBoolean f53667x = new AtomicBoolean(false);

    /* renamed from: y */
    private int f53668y = -1;

    /* renamed from: z */
    private boolean f53669z = false;

    /* renamed from: com.ss.android.medialib.presenter.d$a */
    public interface C19778a {
    }

    /* renamed from: com.ss.android.medialib.presenter.d$b */
    public interface C19779b {
        /* renamed from: a */
        void mo53070a(C19753a aVar);

        boolean bW_();
    }

    /* renamed from: com.ss.android.medialib.presenter.d$c */
    public interface C19780c {
        /* renamed from: a */
        void mo53072a(Bitmap bitmap, int i);
    }

    /* renamed from: com.ss.android.medialib.presenter.d$d */
    public interface C19781d {
        /* renamed from: a */
        void mo53073a(int i, int i2);

        /* renamed from: a */
        void mo53074a(Bitmap bitmap);
    }

    /* renamed from: a */
    public final C19764d mo52920a(boolean z) {
        this.f53666w = z;
        return this;
    }

    /* renamed from: a */
    public final C19764d mo52917a(int i, int i2) {
        this.f53641E = i;
        this.f53642F = i2;
        return this;
    }

    /* renamed from: a */
    public final C19764d mo52919a(String str) {
        this.f53646c = str;
        this.f53652i.changeMusicPath(str);
        return this;
    }

    /* renamed from: a */
    public final C19764d mo52916a(float f) {
        this.f53638B = f;
        this.f53652i.setBGMVolume(f);
        return this;
    }

    /* renamed from: b */
    public final C19764d mo52976b(boolean z) {
        this.f53639C = z;
        return this;
    }

    /* renamed from: a */
    public final void mo52950a(String str, String str2, float f, float f2, float f3, boolean z) {
        this.f53652i.initDuet(str, f, f2, f3, z);
        mo52918a(0, 0);
        mo52919a(str2);
        this.f53637A = true;
    }

    /* renamed from: a */
    public final boolean mo52959a() {
        if (this.f53652i != null) {
            return this.f53652i.previewDuetVideo();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo52979b(int i, int i2) {
        String str = f53636a;
        StringBuilder sb = new StringBuilder("changeOutputVideoSize: width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        C45372t.m143403a(str, sb.toString());
        this.f53652i.changeOutputVideoSize(i, i2);
    }

    /* renamed from: b */
    public final void mo52978b(float f) {
        this.f53652i.chooseAreaFromRatio34(f);
    }

    /* renamed from: a */
    public final void mo52929a(Context context, String str, String str2) {
        this.f53652i.initReaction(context, str, str2);
        mo52918a(0, 0);
        mo52919a(str2);
    }

    /* renamed from: a */
    public final C19764d mo52918a(long j, long j2) {
        this.f53663t = j;
        this.f53664u = j2;
        this.f53652i.setMusicTime(this.f53663t, this.f53664u);
        return this;
    }

    /* renamed from: a */
    public final void mo52940a(IMonitor iMonitor) {
        if (this.f53650g == null) {
            this.f53650g = new C19628b(iMonitor);
        }
    }

    /* renamed from: a */
    public final synchronized int mo52891a(Context context, int i, AudioRecorderInterface audioRecorderInterface) {
        this.f53649f = audioRecorderInterface;
        if (context == null) {
            String str = f53636a;
            StringBuilder sb = new StringBuilder("file ");
            sb.append(C45372t.m143404b());
            sb.append(",fun ");
            sb.append(C45372t.m143408d());
            sb.append(",line ");
            sb.append(C45372t.m143406c());
            sb.append(": context is null");
            C45372t.m143409d(str, sb.toString());
            return -1000;
        }
        this.f53647d = i;
        if (this.f53645b != null) {
            this.f53645b.unInit();
            C45372t.m143403a(f53636a, "initRecord: mAudioRecorder.unInit()");
        }
        if ((this.f53647d & 1) != 0) {
            this.f53645b = new BufferedAudioRecorder(this, this.f53641E, this.f53642F);
            this.f53645b.init(1);
        }
        final int i2 = 0;
        if ((this.f53647d & 4) != 0 && !TextUtils.isEmpty(this.f53646c)) {
            this.f53652i.setBGMVolume(this.f53638B);
            Context context2 = context;
            i2 = this.f53652i.initAudioPlayer(context2, this.f53646c, this.f53664u + this.f53663t, this.f53666w, this.f53639C);
        }
        if (!(this.f53650g == null || i2 == 0)) {
            C19628b.m64631a("record_init_record", new C19627a() {
                /* renamed from: a */
                public final void mo52213a(Map<String, Object> map) {
                    map.put("ret", Integer.valueOf(i2));
                    map.put("audio_type", Integer.valueOf(C19764d.this.f53647d));
                }
            });
        }
        String str2 = f53636a;
        StringBuilder sb2 = new StringBuilder("initRecord return: ");
        sb2.append(i2);
        C45372t.m143403a(str2, sb2.toString());
        return i2;
    }

    /* renamed from: a */
    public final int mo52889a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        C45372t.m143405b(f53636a, "init enter ");
        C19721f.m65022a().f53486a = this.f53652i;
        C20479f.m67969d(0);
        C20479f.m67968c(0);
        final int initFaceBeautyPlay = this.f53652i.initFaceBeautyPlay(i, i2, str, i3, i4, str2, i5, z);
        this.f53652i.setTextureTimeListener(this.f53644H);
        FaceBeautyInvoker.setRecordStopCallback(new C19613a() {
            /* renamed from: a */
            public final void mo52141a() {
                if (C19764d.this.f53645b != null) {
                    C19764d.this.f53645b.markRecordStop();
                }
            }
        });
        if (!(this.f53650g == null || initFaceBeautyPlay == 0)) {
            C19628b.m64631a("record_init_fb", new C19627a() {
                /* renamed from: a */
                public final void mo52213a(Map<String, Object> map) {
                    map.put("ret", Integer.valueOf(initFaceBeautyPlay));
                }
            });
        }
        String str3 = f53636a;
        StringBuilder sb = new StringBuilder("init ret = ");
        sb.append(initFaceBeautyPlay);
        C45372t.m143405b(str3, sb.toString());
        return initFaceBeautyPlay;
    }

    /* renamed from: a */
    public final int mo52898a(ScanSettings scanSettings) {
        C19721f.m65022a().f53486a = this.f53652i;
        return this.f53652i.initFaceBeautyPlayOnlyPreview(scanSettings);
    }

    /* renamed from: a */
    public final int[] mo52960a(int i, int i2, int i3, int i4) {
        return this.f53652i.updateReactionCameraPos(i, i2, i3, i4);
    }

    /* renamed from: c */
    public final int[] mo52995c() {
        return this.f53652i.getReactionCameraPosInViewPixel();
    }

    /* renamed from: a */
    public final int[] mo52961a(int i, int i2, int i3, int i4, float f) {
        return this.f53652i.updateReactionCameraPosWithRotation(i, i2, i3, i4, f);
    }

    /* renamed from: b */
    public final void mo52980b(int i, int i2, int i3, int i4) {
        this.f53652i.setReactionPosMargin(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void mo52930a(Context context, String str, String str2, String str3) {
        this.f53652i.setCustomVideoBg(context, str, str2, str3, 0, true, this.f53639C);
        if (!TextUtils.isEmpty(str2)) {
            this.f53652i.previewVideoBg();
        }
        if (TextUtils.isEmpty(this.f53646c)) {
            this.f53652i.uninitAudioPlayer();
            mo52919a((String) null);
            mo53000d(0);
        }
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f53646c) && !TextUtils.isEmpty(str3)) {
            int initAudioPlayer = this.f53652i.initAudioPlayer(context, str3, this.f53664u, false, this.f53639C);
            String str4 = f53636a;
            StringBuilder sb = new StringBuilder("setCustomVideoBg, initAudioPlayer ret = ");
            sb.append(initAudioPlayer);
            C45372t.m143403a(str4, sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo52977b(double d) {
        this.f53652i.setVideoBgSpeed(d);
    }

    /* renamed from: a */
    public final synchronized int mo52890a(int i, String str) {
        mo53014f();
        return this.f53652i.tryRestore(i, str);
    }

    /* renamed from: a */
    public final void mo52880a(SurfaceTexture surfaceTexture) {
        this.f53656m = surfaceTexture;
    }

    /* renamed from: a */
    public final int mo52876a(int i, float[] fArr) {
        if (!(this.f53662s == null || this.f53656m == null)) {
            if (fArr != null) {
                boolean z = false;
                if ((fArr[0] * fArr[5]) - (fArr[1] * fArr[4]) >= 0.0f) {
                    z = true;
                }
                this.f53655l = z;
            }
            this.f53662s.onFrameAvailable(this.f53656m);
        }
        return this.f53652i.onDrawFrame(i, fArr);
    }

    /* renamed from: a */
    public final void mo52879a(int i, boolean z) {
        this.f53652i.updateRotation((i + this.f53654k) % 360, z);
    }

    /* renamed from: a */
    public final void mo52922a(float f, float f2, float f3) {
        this.f53652i.updateRotation(f, f2, f3);
    }

    /* renamed from: a */
    public final void mo52955a(float[] fArr) {
        this.f53652i.setDeviceRotation(fArr);
    }

    /* renamed from: a */
    public final void mo52956a(float[] fArr, double d) {
        this.f53652i.setDeviceRotation(fArr, d);
    }

    /* renamed from: a */
    public final void mo52945a(LandMarkFrame landMarkFrame) {
        this.f53652i.setLandMarkInfo(landMarkFrame);
    }

    /* renamed from: a */
    public final void mo52942a(C19778a aVar) {
        if (this.f53645b != null) {
            this.f53645b.setAudioRecordStateCallack(aVar);
        }
    }

    /* renamed from: a */
    public final int mo52907a(String str, String str2, String str3, String str4) {
        return mo52905a(str, str2, 0, str3, str4);
    }

    /* renamed from: a */
    public final int mo52905a(String str, String str2, int i, String str3, String str4) {
        return mo52906a(str, str2, i, str3, str4, false);
    }

    /* renamed from: a */
    public final synchronized int mo52906a(String str, String str2, int i, String str3, String str4, boolean z) {
        mo53042l();
        return this.f53652i.concat(str, str2, i, str3, str4, z);
    }

    /* renamed from: a */
    public final int mo52894a(Surface surface, String str) {
        int i = C19667g.m64797b().f53283g;
        int i2 = 1;
        if (C19667g.m64797b().mo52341n() != 1) {
            i2 = 0;
        }
        return m65154a(surface, str, i, i2);
    }

    /* renamed from: a */
    public final int mo52893a(Surface surface) {
        return this.f53652i.changeSurface(surface);
    }

    /* renamed from: a */
    public final void mo52924a(float f, int i, int i2) {
        this.f53652i.setPreviewSizeRatio(f, i, i2);
    }

    /* renamed from: a */
    public final void mo52927a(int i, String str, float f, float f2) {
        String str2 = f53636a;
        StringBuilder sb = new StringBuilder("nativeSetBeautyFace: ");
        sb.append(i);
        C45372t.m143405b(str2, sb.toString());
        this.f53652i.setBeautyFace(i, str);
        this.f53652i.setBeautyFaceIntensity(f, f2);
    }

    /* renamed from: b */
    public final void mo52981b(int i, String str) {
        String str2 = f53636a;
        StringBuilder sb = new StringBuilder("nativeSetBeautyFace: ");
        sb.append(i);
        C45372t.m143405b(str2, sb.toString());
        this.f53652i.setBeautyFace(i, str);
    }

    /* renamed from: a */
    public final void mo52921a(float f, float f2) {
        this.f53652i.setBeautyFaceIntensity(f, f2);
    }

    /* renamed from: a */
    public final int mo52900a(String str, float f) {
        return mo52901a(str, f, f);
    }

    /* renamed from: a */
    public final int mo52901a(String str, float f, float f2) {
        return this.f53652i.setReshape(str, f, f2);
    }

    /* renamed from: b */
    public final int mo52970b(String str, float f, float f2) {
        return this.f53652i.setFaceMakeUp(str, f, f2);
    }

    /* renamed from: a */
    public final void mo52957a(String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f53652i.setWaterMark(strArr, i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: a */
    public final void mo52931a(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f53652i.setWaterMark(bitmap, i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: a */
    public final void mo52928a(Context context) {
        this.f53652i.setNativeLibraryDir(context.getApplicationInfo().nativeLibraryDir);
    }

    /* renamed from: a */
    public final void mo52952a(Map<Integer, Float> map) {
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                m65156b(((Integer) entry.getKey()).intValue(), ((Float) entry.getValue()).floatValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo52951a(String str, Map<Integer, Float> map) {
        mo52998d(str);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                m65156b(((Integer) entry.getKey()).intValue(), ((Float) entry.getValue()).floatValue());
            }
        }
    }

    /* renamed from: a */
    public final int mo52903a(String str, int i, int i2, boolean z) {
        return mo52902a(str, i, i2, "");
    }

    /* renamed from: a */
    public final int mo52902a(String str, int i, int i2, String str2) {
        return this.f53652i.setStickerPathWithTag(str, i, i2, false, str2);
    }

    /* renamed from: a */
    public final int mo52904a(String str, int i, int i2, boolean z, String str2) {
        return this.f53652i.setStickerPathWithTag(str, i, i2, z, str2);
    }

    /* renamed from: b */
    public final void mo52984b(String str, float f) {
        int filterNew = this.f53652i.setFilterNew(str, f);
        String str2 = f53636a;
        StringBuilder sb = new StringBuilder("ret = ");
        sb.append(filterNew);
        C45372t.m143405b(str2, sb.toString());
    }

    /* renamed from: a */
    public final void mo52948a(String str, String str2, float f) {
        this.f53652i.setFilter(str, str2, f);
    }

    /* renamed from: a */
    public final void mo52949a(String str, String str2, float f, float f2, float f3) {
        this.f53652i.setFilterNew(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo52881a(C19703a aVar) {
        this.f53652i.setOnOpenGLCallback(aVar);
    }

    /* renamed from: a */
    public final int mo52908a(String str, int[] iArr, C19704b bVar) {
        return mo52909a(str, iArr, true, CompressFormat.PNG, bVar);
    }

    /* renamed from: a */
    public final int mo52909a(final String str, int[] iArr, boolean z, final CompressFormat compressFormat, C19704b bVar) {
        int i = compressFormat == CompressFormat.JPEG ? 1 : compressFormat == CompressFormat.PNG ? 0 : -1;
        return this.f53652i.shotScreen(str, iArr, z, i, new OnPictureCallback() {
            public final void onResult(int[] iArr, int i, int i2) {
                Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Config.ARGB_8888);
                C19705b.m64964a(createBitmap, str, compressFormat);
                if (createBitmap != null) {
                    createBitmap.recycle();
                }
            }
        }, bVar);
    }

    /* renamed from: a */
    public final int mo52910a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        return mo52911a(z2, z3, z4, z5);
    }

    /* renamed from: a */
    public final int mo52911a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f53652i.slamDeviceConfig(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final int mo52912a(double[] dArr, double d) {
        return this.f53652i.slamProcessIngestOri(dArr, d);
    }

    /* renamed from: b */
    public final int mo52971b(String str, int i, int i2, String str2) {
        return this.f53652i.slamSetInputText(str, i, i2, str2);
    }

    /* renamed from: a */
    public final int mo52897a(OnARTextCountCallback onARTextCountCallback) {
        return this.f53652i.slamGetTextLimitCount(onARTextCountCallback);
    }

    /* renamed from: a */
    public final int mo52896a(OnARTextContentCallback onARTextContentCallback) {
        return this.f53652i.slamGetTextParagraphContent(onARTextContentCallback);
    }

    /* renamed from: a */
    public final int mo52895a(OnARTextBitmapCallback onARTextBitmapCallback) {
        return this.f53652i.slamGetTextBitmap(onARTextBitmapCallback);
    }

    /* renamed from: a */
    public final void mo52946a(C45336r rVar) {
        this.f53652i.addLandMarkDetectListener(rVar);
    }

    /* renamed from: b */
    public final void mo52983b(C45336r rVar) {
        this.f53652i.removeLandMarkDetectListener(rVar);
    }

    /* renamed from: a */
    public final int mo52892a(Bitmap bitmap) {
        return this.f53652i.setSlamFace(bitmap);
    }

    /* renamed from: a */
    public final int mo52877a(ImageFrame imageFrame) {
        if (!(this.f53662s == null || this.f53656m == null)) {
            this.f53662s.onFrameAvailable(this.f53656m);
        }
        return this.f53652i.onDrawFrame(imageFrame);
    }

    /* renamed from: a */
    public final int mo52878a(ImageFrame imageFrame, int i) {
        return this.f53652i.onDrawFrame(imageFrame, i);
    }

    /* renamed from: a */
    public final void mo52926a(int i, long j, long j2, String str) {
        this.f53652i.sendEffectMsg(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo52932a(C1944a aVar) {
        this.f53652i.setMessageListenerV2(aVar);
    }

    /* renamed from: a */
    public final void mo52925a(int i, int i2, int i3, C19781d dVar) {
        C45372t.m143405b(f53636a, "start ======");
        C19667g b = C19667g.m64797b();
        final C19781d dVar2 = dVar;
        final int i4 = i;
        final int i5 = i2;
        C197714 r0 = new C19630b(0) {
            /* renamed from: a */
            public final void mo52247a(ImageFrame imageFrame) {
                C45372t.m143405b(C19764d.f53636a, "end camera picture ======");
                if (imageFrame == null) {
                    dVar2.mo53073a(0, -1000);
                    return;
                }
                dVar2.mo53073a(0, 0);
                C45372t.m143405b(C19764d.f53636a, "start renderPicture ======");
                int renderPicture = C19764d.this.f53652i.renderPicture(imageFrame, i4, i5, new OnPictureCallbackV2() {
                    public final void onResult(int i, int i2) {
                        dVar2.mo53073a(i, i2);
                    }

                    public final void onImage(int[] iArr, int i, int i2) {
                        if (iArr == null || iArr.length <= 0 || i <= 0 || i2 <= 0) {
                            dVar2.mo53074a(null);
                        } else if (0 % 360 == 0) {
                            dVar2.mo53074a(Bitmap.createBitmap(iArr, i, i2, Config.ARGB_8888));
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Config.ARGB_8888);
                            Matrix matrix = new Matrix();
                            matrix.setRotate((float) 0);
                            dVar2.mo53074a(Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true));
                        }
                    }
                });
                if (renderPicture < 0) {
                    dVar2.mo53073a(1, renderPicture);
                }
            }
        };
        b.mo52311a(i2, i, (C19630b) r0);
    }

    /* renamed from: a */
    public final void mo52939a(ImageFrame imageFrame, int i, int i2, int i3, final C19781d dVar) {
        C45372t.m143405b(f53636a, "start renderPicture ======");
        int renderPicture = this.f53652i.renderPicture(imageFrame, i, i2, new OnPictureCallbackV2(0) {
            public final void onResult(int i, int i2) {
                dVar.mo53073a(i, i2);
            }

            public final void onImage(int[] iArr, int i, int i2) {
                if (iArr == null || iArr.length <= 0 || i <= 0 || i2 <= 0) {
                    dVar.mo53074a(null);
                } else if (0 % 360 == 0) {
                    dVar.mo53074a(Bitmap.createBitmap(iArr, i, i2, Config.ARGB_8888));
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Config.ARGB_8888);
                    Matrix matrix = new Matrix();
                    matrix.setRotate((float) 0);
                    dVar.mo53074a(Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true));
                }
            }
        });
        if (renderPicture < 0) {
            dVar.mo53073a(1, renderPicture);
        }
    }

    /* renamed from: a */
    public final void mo52954a(boolean z, FaceInfoCallback faceInfoCallback) {
        this.f53652i.registerFaceInfoUpload(true, faceInfoCallback);
    }

    /* renamed from: a */
    public final void mo52933a(EffectAlgorithmCallback effectAlgorithmCallback) {
        this.f53652i.registerEffectAlgorithmCallback(effectAlgorithmCallback);
    }

    /* renamed from: a */
    public final void mo52923a(float f, float f2, float f3, float f4) {
        this.f53652i.setScanArea(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo52953a(boolean z, long j) {
        this.f53652i.enableScan(z, j);
    }

    /* renamed from: a */
    public final void mo52934a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        this.f53652i.registerCherEffectParamCallback(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo52958a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f53652i.recoverCherEffect(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo52943a(C19779b bVar) {
        mo52944a(bVar, -1);
    }

    /* renamed from: a */
    public final void mo52944a(C19779b bVar, int i) {
        this.f53651h = bVar;
        this.f53652i.setFrameCallback(this.f53651h == null ? null : new OnFrameCallback() {

            /* renamed from: a */
            C19753a f53690a = new C19753a();

            public final void onFrame(int i, double d) {
                this.f53690a.f53609b = i;
                this.f53690a.f53613f = (long) d;
                this.f53690a.f53616i = C19764d.this.f53655l;
                if (C19764d.this.f53651h != null) {
                    C19764d.this.f53651h.mo53070a(this.f53690a);
                }
            }

            public final void onInit(EGLContext eGLContext, int i, int i2, int i3, long j) {
                this.f53690a.f53608a = eGLContext;
                this.f53690a.f53610c = i;
                this.f53690a.f53611d = i2;
                this.f53690a.f53612e = i3;
                this.f53690a.f53614g = j;
            }

            public final void onFrame(ByteBuffer byteBuffer, int i, int i2, int i3, double d) {
                this.f53690a.f53615h = byteBuffer;
                this.f53690a.f53610c = i;
                this.f53690a.f53611d = i2;
                this.f53690a.f53612e = i3;
                this.f53690a.f53613f = (long) d;
                this.f53690a.f53616i = C19764d.this.f53655l;
                if (C19764d.this.f53651h != null) {
                    C19764d.this.f53651h.mo53070a(this.f53690a);
                }
            }
        }, bVar != null && bVar.bW_(), i);
    }

    /* renamed from: a */
    public final void mo52947a(String str, String str2) {
        this.f53652i.setRenderCacheString(str, str2);
    }

    /* renamed from: a */
    public final void mo52935a(OnRunningErrorCallback onRunningErrorCallback) {
        this.f53652i.setRunningErrorCallback(onRunningErrorCallback);
    }

    /* renamed from: a */
    public final void mo52936a(C19621a aVar) {
        this.f53652i.setFaceDetectListener2(null);
    }

    /* renamed from: a */
    public final void mo52937a(C19622b bVar) {
        this.f53652i.setNativeInitListener2(bVar);
    }

    /* renamed from: a */
    public final void mo52941a(IStickerRequestCallback iStickerRequestCallback) {
        this.f53652i.setStickerRequestCallback(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final int mo52913a(String[] strArr, int i) {
        return this.f53652i.setComposerNodes(strArr, i);
    }

    /* renamed from: b */
    public final int mo52972b(String str, String str2, float f) {
        return this.f53652i.updateComposerNode(str, str2, f);
    }

    /* renamed from: b */
    public final int mo52973b(String[] strArr, int i) {
        return this.f53652i.removeComposerNodes(strArr, i);
    }

    /* renamed from: a */
    public final int mo52914a(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        String str = f53636a;
        StringBuilder sb = new StringBuilder("setComposerNodesWithTag...");
        sb.append(vEEffectParams.toString());
        C45372t.m143407c(str, sb.toString());
        return this.f53652i.setVEEffectParams(vEEffectParams);
    }

    /* renamed from: b */
    public final int mo52974b(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        String str = f53636a;
        StringBuilder sb = new StringBuilder("appendComposerNodes...");
        sb.append(vEEffectParams.toString());
        C45372t.m143407c(str, sb.toString());
        return this.f53652i.setVEEffectParams(vEEffectParams);
    }

    /* renamed from: a */
    public final int mo52915a(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.intValueTwo = i2;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        vEEffectParams.stringArrayThree = new ArrayList<>(Arrays.asList(strArr3));
        String str = f53636a;
        StringBuilder sb = new StringBuilder("replaceComposerNodes...");
        sb.append(vEEffectParams.toString());
        C45372t.m143407c(str, sb.toString());
        return this.f53652i.setVEEffectParams(vEEffectParams);
    }

    /* renamed from: b */
    public final int[] mo52985b(String str, String str2) {
        return this.f53652i.checkComposerNodeExclusion(str, str2);
    }

    /* renamed from: a */
    public final void mo52938a(C19623c cVar) {
        this.f53652i.addSlamDetectListener2(cVar);
    }

    /* renamed from: b */
    public final void mo52982b(C19623c cVar) {
        this.f53652i.removeSlamDetectListener2(cVar);
    }

    /* renamed from: a */
    public final int mo52899a(VEEffectParams vEEffectParams) {
        return this.f53652i.setVEEffectParams(vEEffectParams);
    }

    /* renamed from: v */
    private void m65158v() {
        C19628b.m65121a();
        this.f53650g = null;
    }

    /* renamed from: x */
    private void m65160x() {
        this.f53652i.releaseEncoder();
    }

    public void lackPermission() {
        AudioRecorderInterface audioRecorderInterface = this.f53649f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.lackPermission();
        }
    }

    /* renamed from: m */
    public final void mo53045m() {
        mo53047n();
        mo53005e();
    }

    /* renamed from: o */
    public final void mo53049o() {
        mo53043l(true);
    }

    /* renamed from: r */
    public final void mo53055r() {
        this.f53652i.unRegisterFaceInfoUpload();
    }

    /* renamed from: t */
    public final EnigmaResult mo53060t() {
        return this.f53652i.getEnigmaResult();
    }

    /* renamed from: u */
    public final int mo53062u() {
        return this.f53652i.bindEffectAudioProcessor(0, 0, false);
    }

    /* renamed from: w */
    private boolean m65159w() {
        if (this.f53645b == null || !this.f53645b.isProcessing()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final float mo52963b() {
        return this.f53652i.getReactionCamRotation();
    }

    /* renamed from: e */
    public final void mo53005e() {
        this.f53652i.uninitFaceBeautyPlay();
    }

    /* renamed from: j */
    public final synchronized void mo53037j() {
        m65153B(false);
    }

    /* renamed from: l */
    public final void mo53042l() {
        if (this.f53645b != null && m65159w()) {
            this.f53645b.waitUtilAudioProcessDone();
        }
    }

    /* renamed from: n */
    public final void mo53047n() {
        if (this.f53645b != null) {
            this.f53645b.unInit();
            this.f53645b = null;
        }
        m65158v();
    }

    /* renamed from: q */
    public final void mo53053q() {
        if (this.f53645b != null) {
            this.f53645b.stopRecording();
        }
    }

    /* renamed from: s */
    public final void mo53059s() {
        this.f53652i.unRegisterEffectAlgorithmCallback();
    }

    /* renamed from: k */
    public final boolean mo53041k() {
        return this.f53667x.get();
    }

    /* renamed from: p */
    public final void mo53051p() {
        if ((!this.f53637A || this.f53653j) && this.f53645b != null) {
            this.f53645b.startRecording(1.0d, false);
        }
    }

    /* renamed from: f */
    public final synchronized void mo53014f() {
        this.f53652i.clearFragFile();
    }

    /* renamed from: g */
    public final long mo53021g() {
        return this.f53652i.getEndFrameTime();
    }

    /* renamed from: h */
    public final long mo53027h() {
        return this.f53652i.getLastAudioLength();
    }

    /* renamed from: i */
    public final void mo53032i() {
        synchronized (this) {
            if (m65159w()) {
                C45372t.m143409d(f53636a, "Audio processing, will delete after nativeCloseWavFile");
                this.f53669z = true;
                return;
            }
            C45372t.m143403a(f53636a, "Delete last frag now");
            this.f53652i.deleteLastFrag();
        }
    }

    public C19764d() {
        this.f53652i.resetPerfStats();
    }

    /* renamed from: d */
    public final int[] mo53003d() {
        return this.f53652i.getReactionPosMarginInViewPixel();
    }

    /* renamed from: a */
    public static void m65155a(Runnable runnable) {
        FaceBeautyInvoker.setDuetVideoCompleteCallback(runnable);
    }

    /* renamed from: b */
    public final C19764d mo52975b(int i) {
        this.f53648e = i;
        return this;
    }

    /* renamed from: A */
    public final void mo52882A(boolean z) {
        this.f53652i.enableLandMark(z);
    }

    /* renamed from: a */
    public final int mo52874a(double d) {
        return this.f53652i.onDrawFrameTime(d);
    }

    /* renamed from: f */
    public final float mo53011f(String str) {
        return this.f53652i.getFilterIntensity(str);
    }

    /* renamed from: g */
    public final int mo53018g(float f) {
        return m65156b(5, f);
    }

    /* renamed from: h */
    public final int mo53024h(float f) {
        return m65156b(17, f);
    }

    /* renamed from: i */
    public final int mo53030i(float f) {
        return m65156b(18, f);
    }

    /* renamed from: j */
    public final int mo53036j(float f) {
        return m65156b(10, f);
    }

    /* renamed from: k */
    public final int mo53039k(float f) {
        return m65156b(12, f);
    }

    /* renamed from: n */
    public final void mo53048n(boolean z) {
        this.f53652i.enablePBO(z);
    }

    /* renamed from: p */
    public final void mo53052p(boolean z) {
        this.f53652i.setCameraFirstFrameOptimize(z);
    }

    /* renamed from: q */
    public final void mo53054q(boolean z) {
        this.f53652i.enableSceneRecognition(z);
    }

    public void recordStatus(boolean z) {
        AudioRecorderInterface audioRecorderInterface = this.f53649f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.recordStatus(z);
        }
    }

    /* renamed from: s */
    public final int mo53058s(boolean z) {
        return this.f53652i.slamNotifyHideKeyBoard(z);
    }

    /* renamed from: w */
    public final void mo53065w(boolean z) {
        this.f53652i.enableEffect(z);
    }

    /* renamed from: y */
    public final int mo53067y(boolean z) {
        return this.f53652i.setHandDetectLowpower(z);
    }

    /* renamed from: z */
    public final void mo53068z(boolean z) {
        this.f53652i.useLargeMattingModel(z);
    }

    /* renamed from: d */
    public final int mo52998d(String str) {
        return this.f53652i.setReshapeResource(str);
    }

    /* renamed from: f */
    public final int mo53012f(float f) {
        return m65156b(4, f);
    }

    /* renamed from: i */
    public final int mo53031i(boolean z) {
        return this.f53652i.enableBlindWaterMark(false);
    }

    /* renamed from: k */
    public final void mo53040k(boolean z) {
        if (this.f53652i != null) {
            this.f53652i.setDetectionMode(z);
        }
    }

    /* renamed from: m */
    public final boolean mo53046m(boolean z) {
        return this.f53652i.setSharedTextureStatus(z);
    }

    /* renamed from: o */
    public final void mo53050o(boolean z) {
        this.f53652i.enableWaterMark(z);
    }

    /* renamed from: r */
    public final void mo53056r(boolean z) {
        this.f53652i.enableStickerRecognition(z);
    }

    /* renamed from: t */
    public final void mo53061t(boolean z) {
        this.f53652i.pauseEffectAudio(z);
    }

    /* renamed from: u */
    public final void mo53063u(boolean z) {
        this.f53652i.pauseEffectAudio(z);
    }

    /* renamed from: v */
    public final void mo53064v(boolean z) {
        this.f53652i.enableEffectBGM(z);
    }

    /* renamed from: x */
    public final int mo53066x(boolean z) {
        return this.f53652i.enableLandMarkGps(z);
    }

    /* renamed from: d */
    public final void mo52999d(float f) {
        m65156b(2, f);
    }

    /* renamed from: e */
    public final void mo53006e(float f) {
        m65156b(1, f);
    }

    /* renamed from: g */
    public final int mo53020g(String str) {
        return this.f53652i.slamSetLanguge(str);
    }

    /* renamed from: h */
    public final int mo53026h(String str) {
        return this.f53652i.setMusicNodes(str);
    }

    /* renamed from: i */
    public final void mo53033i(int i) {
        this.f53652i.setForceAlgorithmCnt(i);
    }

    /* renamed from: j */
    public final void mo53038j(boolean z) {
        this.f53652i.setCameraClose(z);
    }

    /* renamed from: l */
    public final void mo53043l(boolean z) {
        if (this.f53645b != null) {
            this.f53652i.markPlayDone();
            this.f53645b.stopRecording();
        }
        this.f53652i.stopPlay();
        mo53042l();
        if (z) {
            m65160x();
        }
    }

    /* renamed from: B */
    private synchronized int m65153B(boolean z) {
        if (this.f53667x.get()) {
            return -1;
        }
        this.f53667x.getAndSet(true);
        int stopRecord = this.f53652i.stopRecord(false);
        if (this.f53645b != null) {
            this.f53645b.stopFeeding();
        }
        this.f53667x.getAndSet(false);
        C20479f.m67966b(0);
        return stopRecord;
    }

    /* renamed from: c */
    public final int mo52989c(String str) {
        return this.f53652i.setSkinTone(str);
    }

    public int closeWavFile(boolean z) {
        int closeWavFile;
        synchronized (this) {
            closeWavFile = this.f53652i.closeWavFile(z);
            AudioRecorderInterface audioRecorderInterface = this.f53649f;
            if (audioRecorderInterface != null) {
                audioRecorderInterface.closeWavFile(z);
            }
            if (this.f53669z) {
                this.f53652i.deleteLastFrag();
            }
            this.f53669z = false;
            C45372t.m143403a(f53636a, "closeWavFile");
        }
        return closeWavFile;
    }

    /* renamed from: d */
    public final void mo53000d(int i) {
        this.f53652i.setUseMusic(i);
    }

    /* renamed from: e */
    public final void mo53007e(int i) {
        this.f53652i.setModeChangeState(2);
    }

    /* renamed from: b */
    public static long m65157b(SurfaceTexture surfaceTexture) {
        long j;
        long abs = Math.abs(System.nanoTime() - surfaceTexture.getTimestamp());
        if (VERSION.SDK_INT >= 17) {
            j = Math.abs(SystemClock.elapsedRealtimeNanos() - surfaceTexture.getTimestamp());
        } else {
            j = Long.MAX_VALUE;
        }
        long abs2 = Math.abs((SystemClock.uptimeMillis() * 1000000) - surfaceTexture.getTimestamp());
        String str = f53636a;
        StringBuilder sb = new StringBuilder("nano_time: ");
        sb.append(abs);
        sb.append(",elapsed: ");
        sb.append(j);
        sb.append(" ,delta_uptime_nano: ");
        sb.append(abs2);
        C45372t.m143405b(str, sb.toString());
        return Math.min(Math.min(abs, j), abs2);
    }

    /* renamed from: e */
    public final void mo53008e(String str) {
        int filter = this.f53652i.setFilter(str);
        String str2 = f53636a;
        StringBuilder sb = new StringBuilder("ret = ");
        sb.append(filter);
        C45372t.m143405b(str2, sb.toString());
    }

    /* renamed from: f */
    public final void mo53015f(int i) {
        this.f53652i.changePreviewRadioMode(i);
    }

    /* renamed from: g */
    public final void mo53022g(int i) {
        this.f53652i.setDetectInterval(i);
    }

    /* renamed from: h */
    public final void mo53028h(int i) {
        this.f53652i.chooseSlamFace(i);
    }

    /* renamed from: b */
    public final int mo52966b(Context context) {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            z = false;
        } else {
            z = packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        String str = f53636a;
        StringBuilder sb = new StringBuilder("has low latency ? ");
        sb.append(z);
        C45372t.m143405b(str, sb.toString());
        Pair a = C19718d.m65016a(context);
        String str2 = f53636a;
        StringBuilder sb2 = new StringBuilder("nativeSampleRate ? ");
        sb2.append(a.first);
        sb2.append(" nativeSamleBufferSize? ");
        sb2.append(a.second);
        C45372t.m143405b(str2, sb2.toString());
        return this.f53652i.bindEffectAudioProcessor(((Integer) a.first).intValue(), ((Integer) a.second).intValue(), true);
    }

    /* renamed from: d */
    public final void mo53002d(boolean z) {
        if (this.f53652i != null) {
            this.f53652i.setSwapReactionRegion(z);
        }
    }

    /* renamed from: e */
    public final void mo53009e(boolean z) {
        if (this.f53652i != null) {
            this.f53652i.setPreviewDuetVideoPaused(z);
        }
    }

    /* renamed from: g */
    public final void mo53023g(boolean z) {
        this.f53652i.enable3buffer(z);
    }

    /* renamed from: h */
    public final void mo53029h(boolean z) {
        this.f53652i.enableEffectRT(z);
    }

    /* renamed from: a */
    public final int mo52875a(int i) {
        return this.f53652i.initImageDrawer(i);
    }

    /* renamed from: c */
    public final void mo52992c(float f) {
        this.f53652i.setPaddingBottomInRatio34(f);
    }

    /* renamed from: f */
    public final void mo53017f(boolean z) {
        this.f53652i.forceFirstFrameHasEffect(z);
    }

    /* renamed from: b */
    public final int mo52968b(Surface surface) {
        int changeSurface = this.f53652i.changeSurface(surface);
        mo53007e(2);
        return changeSurface;
    }

    /* renamed from: c */
    public final void mo52993c(int i) {
        this.f53652i.setEffectBuildChainType(i);
    }

    /* renamed from: b */
    public final int mo52969b(String str) {
        return this.f53652i.setFaceMakeUp(str);
    }

    /* renamed from: c */
    public final void mo52994c(boolean z) {
        if (this.f53652i != null) {
            this.f53652i.setSwapDuetRegion(z);
        }
    }

    /* renamed from: b */
    private int m65156b(int i, float f) {
        return this.f53652i.setIntensityByType(i, f);
    }

    /* renamed from: c */
    public final int mo52987c(float f, float f2) {
        return this.f53652i.processTouchEvent(f, f2);
    }

    /* renamed from: d */
    public final int mo52997d(float f, float f2) {
        return this.f53652i.slamProcessScaleEvent(f, f2);
    }

    /* renamed from: e */
    public final int mo53004e(float f, float f2) {
        return this.f53652i.slamProcessRotationEvent(f, f2);
    }

    /* renamed from: g */
    public final int mo53019g(int i, int i2) {
        return this.f53652i.startPlay(i, i2, Build.DEVICE, -1, -1);
    }

    /* renamed from: h */
    public final int mo53025h(int i, int i2) {
        return this.f53652i.setComposerMode(i, i2);
    }

    public int onProcessData(byte[] bArr, int i) {
        C45372t.m143405b(f53636a, "onProcessData is running");
        return this.f53652i.addPCMData(bArr, i);
    }

    public int addPCMData(byte[] bArr, int i) {
        this.f53652i.onAudioCallback(bArr, i);
        AudioRecorderInterface audioRecorderInterface = this.f53649f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.addPCMData(bArr, i);
            C45372t.m143405b(f53636a, "addPCMData is running");
        }
        return 0;
    }

    /* renamed from: f */
    public final int mo53013f(float f, float f2) {
        return this.f53652i.slamProcessDoubleClickEvent(f, f2);
    }

    /* renamed from: b */
    public final int mo52965b(float f, float f2) {
        return this.f53652i.slamProcessTouchEvent(f, f2);
    }

    /* renamed from: c */
    public final int mo52990c(String str, String str2) {
        if (str2 != null) {
            return this.f53652i.animateImageToPreview(str, str2);
        }
        C45372t.m143409d(f53636a, "Illegal argument. imagePath can't be null. Consider using empty string to cancel.");
        return -100;
    }

    /* renamed from: d */
    public final void mo53001d(int i, int i2) {
        this.f53652i.setReactionBorderParam(i, i2);
    }

    /* renamed from: c */
    public final C19764d mo52991c(int i, int i2) {
        this.f53668y = i;
        this.f53648e = i2;
        return this;
    }

    /* renamed from: f */
    public final void mo53016f(int i, int i2) {
        this.f53652i.setCamPreviewSize(i, i2);
    }

    /* renamed from: e */
    public final boolean mo53010e(int i, int i2) {
        return this.f53652i.posInReactionRegion(i, i2);
    }

    /* renamed from: a */
    public final int mo52887a(int i, float f) {
        return m65156b(i, f);
    }

    /* renamed from: c */
    public final int mo52988c(Context context, int i, AudioRecorderInterface audioRecorderInterface) {
        if (this.f53645b != null) {
            this.f53645b.unInit();
        }
        if ((this.f53647d & 4) != 0) {
            this.f53652i.uninitAudioPlayer();
        }
        return mo52891a(context, 5, audioRecorderInterface);
    }

    public int initWavFile(int i, int i2, double d) {
        int initWavFile = this.f53652i.initWavFile(i, i2, d);
        AudioRecorderInterface audioRecorderInterface = this.f53649f;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.initWavFile(i, i2, d);
            C45372t.m143403a(f53636a, "initWavFile");
        }
        return initWavFile;
    }

    /* renamed from: b */
    public final synchronized int mo52967b(Context context, int i, AudioRecorderInterface audioRecorderInterface) {
        if (this.f53647d == i) {
            C45372t.m143407c(f53636a, "changeAudioRecord: no need");
            return 1;
        } else if (context == null) {
            String str = f53636a;
            StringBuilder sb = new StringBuilder("file ");
            sb.append(C45372t.m143404b());
            sb.append(",fun ");
            sb.append(C45372t.m143408d());
            sb.append(",line ");
            sb.append(C45372t.m143406c());
            sb.append(": context is null");
            C45372t.m143409d(str, sb.toString());
            return -1000;
        } else {
            this.f53649f = audioRecorderInterface;
            int i2 = -2000;
            if ((this.f53647d & 1 & i) == 0 && this.f53645b != null) {
                this.f53645b.unInit();
                this.f53645b = null;
                C45372t.m143403a(f53636a, "changeAudioRecord: mAudioRecorder.unInit()");
            }
            if ((i & 1) != 0 && this.f53645b == null) {
                this.f53645b = new BufferedAudioRecorder(this, this.f53641E, this.f53642F);
                this.f53645b.init(1);
                C45372t.m143403a(f53636a, "changeAudioRecord: mAudioRecorder.init()");
            }
            if ((i & 4) != 0) {
                this.f53652i.setBGMVolume(this.f53638B);
                i2 = this.f53652i.initAudioPlayer(context, this.f53646c, this.f53663t + this.f53664u, this.f53666w, this.f53639C);
                String str2 = f53636a;
                StringBuilder sb2 = new StringBuilder("changeAudioRecord: initAudioPlayer return: ");
                sb2.append(i2);
                C45372t.m143403a(str2, sb2.toString());
            } else {
                this.f53652i.uninitAudioPlayer();
                mo53000d(0);
            }
            this.f53647d = i;
            return i2;
        }
    }

    /* renamed from: a */
    public final int mo52883a(double d, double d2, double d3, double d4) {
        return this.f53652i.slamProcessIngestAcc(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final int mo52986c(double d, double d2, double d3, double d4) {
        return this.f53652i.slamProcessIngestGra(d, d2, d3, d4);
    }

    public int initAudioConfig(int i, int i2, int i3, int i4) {
        C45372t.m143403a(f53636a, "initAudioConfig");
        return this.f53652i.initAudioConfig(i, i2, i3, i4);
    }

    /* renamed from: b */
    public final int mo52964b(double d, double d2, double d3, double d4) {
        return this.f53652i.slamProcessIngestGyr(d, d2, d3, d4);
    }

    /* renamed from: a */
    private int m65154a(Surface surface, String str, int i, int i2) {
        C45372t.m143405b("MediaPresenter", "Start Play >>> ");
        final int startPlay = this.f53652i.startPlay(surface, str, this.f53665v, i, i2);
        if (!(this.f53650g == null || startPlay == 0)) {
            C19628b.m64631a("record_start_play", new C19627a() {
                /* renamed from: a */
                public final void mo52213a(Map<String, Object> map) {
                    map.put("ret", Integer.valueOf(startPlay));
                }
            });
        }
        StringBuilder sb = new StringBuilder("Start Play ret = ");
        sb.append(startPlay);
        C45372t.m143405b("MediaPresenter", sb.toString());
        return startPlay;
    }

    /* renamed from: a */
    public final int mo52888a(int i, float f, float f2, int i2) {
        return this.f53652i.slamProcessTouchEventByType(i, f, f2, i2);
    }

    /* renamed from: a */
    public final int mo52886a(float f, float f2, float f3, float f4, float f5) {
        return this.f53652i.slamProcessPanEvent(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final synchronized int mo52884a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return mo52885a(d, z, f, i, i2, z2, "", "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo52885a(double r18, boolean r20, float r21, int r22, int r23, boolean r24, java.lang.String r25, java.lang.String r26) {
        /*
            r17 = this;
            r7 = r17
            monitor-enter(r17)
            boolean r0 = r17.m65159w()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x000d
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            monitor-exit(r17)
            return r0
        L_0x000d:
            com.ss.android.medialib.FaceBeautyInvoker r0 = r7.f53652i     // Catch:{ all -> 0x005e }
            int r1 = r7.f53668y     // Catch:{ all -> 0x005e }
            int r2 = r7.f53648e     // Catch:{ all -> 0x005e }
            r0.setVideoQuality(r1, r2)     // Catch:{ all -> 0x005e }
            com.ss.android.medialib.FaceBeautyInvoker r8 = r7.f53652i     // Catch:{ all -> 0x005e }
            r9 = r18
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r15 = r25
            r16 = r26
            int r4 = r8.startRecord(r9, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x005e }
            if (r4 != 0) goto L_0x0040
            boolean r0 = r7.f53637A     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0034
            boolean r0 = r7.f53653j     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0040
        L_0x0034:
            org.libsdl.app.BufferedAudioRecorder r0 = r7.f53645b     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0040
            org.libsdl.app.BufferedAudioRecorder r0 = r7.f53645b     // Catch:{ all -> 0x005e }
            r1 = 1
            r2 = r18
            r0.startRecording(r2, r1)     // Catch:{ all -> 0x005e }
        L_0x0040:
            if (r4 != 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = r4
        L_0x0045:
            com.ss.android.medialib.c.b r1 = r7.f53650g     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r0 == 0) goto L_0x005c
            java.lang.String r8 = "record_start_record"
            com.ss.android.medialib.presenter.d$9 r9 = new com.ss.android.medialib.presenter.d$9     // Catch:{ all -> 0x005e }
            r5 = 0
            r1 = r9
            r2 = r17
            r3 = r4
            r6 = r21
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x005e }
            com.p280ss.android.medialib.p881c.C19628b.m64631a(r8, r9)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r17)
            return r0
        L_0x005e:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.presenter.C19764d.mo52885a(double, boolean, float, int, int, boolean, java.lang.String, java.lang.String):int");
    }
}

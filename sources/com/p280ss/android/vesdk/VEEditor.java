package com.p280ss.android.vesdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.C1642a;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.medialib.C19722g;
import com.p280ss.android.medialib.FFMpegInvoker;
import com.p280ss.android.ttve.common.C20445c;
import com.p280ss.android.ttve.common.C20454k;
import com.p280ss.android.ttve.model.C20464d;
import com.p280ss.android.ttve.model.MVInfoBean;
import com.p280ss.android.ttve.model.MVResourceBean;
import com.p280ss.android.ttve.monitor.C20469a;
import com.p280ss.android.ttve.monitor.C20477e;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.ttve.monitor.C20480g;
import com.p280ss.android.ttve.monitor.C20480g.C20481a;
import com.p280ss.android.ttve.nativePort.C20490a;
import com.p280ss.android.ttve.nativePort.C20494b.C20495a;
import com.p280ss.android.ttve.nativePort.C20494b.C20496b;
import com.p280ss.android.ttve.nativePort.C20494b.C20498d;
import com.p280ss.android.ttve.nativePort.TEInterface;
import com.p280ss.android.ttve.nativePort.TEReverseCallback;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ttve.nativePort.TEVideoUtils;
import com.p280ss.android.ttve.nativePort.TEVideoUtils.CompileProbeListener;
import com.p280ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.p280ss.android.ttve.p913a.C20439a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.vesdk.VEListener.C45205a;
import com.p280ss.android.vesdk.VEListener.C45209e;
import com.p280ss.android.vesdk.VEListener.C45213i;
import com.p280ss.android.vesdk.VEListener.C45215k;
import com.p280ss.android.vesdk.VEListener.C45216l;
import com.p280ss.android.vesdk.VEListener.C45217m;
import com.p280ss.android.vesdk.VEListener.C45218n;
import com.p280ss.android.vesdk.VEListener.C45219o;
import com.p280ss.android.vesdk.VEListener.C45220p;
import com.p280ss.android.vesdk.VEListener.VEInfoStickerBufferListener;
import com.p280ss.android.vesdk.VERecordData.VERecordSegmentData;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.C45244a;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import com.p280ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p280ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p280ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p280ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p280ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p280ss.android.vesdk.p1776d.C45306a;
import com.p280ss.android.vesdk.runtime.C45345b;
import com.p280ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.p280ss.android.vesdk.utils.C45374a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.VEEditor */
public final class VEEditor implements OnFrameAvailableListener {

    /* renamed from: K */
    private static boolean f116152K = true;

    /* renamed from: L */
    private static final Object f116153L = new Object();

    /* renamed from: M */
    private static volatile boolean f116154M = false;

    /* renamed from: ap */
    private static boolean f116155ap;

    /* renamed from: A */
    public C45218n f116156A = null;

    /* renamed from: B */
    public C45220p f116157B = null;

    /* renamed from: C */
    private VESize f116158C = new VESize(-1, -1);

    /* renamed from: D */
    private String f116159D = "mp4";

    /* renamed from: E */
    private C20454k f116160E = new C20454k();

    /* renamed from: F */
    private C20439a f116161F = new C20439a();

    /* renamed from: G */
    private String[] f116162G;

    /* renamed from: H */
    private String[] f116163H;

    /* renamed from: I */
    private String f116164I;

    /* renamed from: J */
    private int f116165J;

    /* renamed from: N */
    private C20445c f116166N = new C20445c() {
        /* renamed from: a */
        public final void mo55039a(int i, int i2, float f, String str) {
            if (i == 4101) {
                if (VEEditor.this.f116237v > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - VEEditor.this.f116237v;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("flag", i2);
                        jSONObject.put("time", currentTimeMillis);
                        C20469a.m67906a("vesdk_event_editor_last_seek_finish", jSONObject, "performance");
                    } catch (JSONException e) {
                        StringBuilder sb = new StringBuilder("report seek time json err ");
                        sb.append(e);
                        C45372t.m143409d("VEEditor", sb.toString());
                    }
                }
                if (VEEditor.this.f116218c != null && VEEditor.this.f116217b != null) {
                    C45372t.m143407c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                    VEEditor.this.f116217b.sendEmptyMessage(MessageCenter.MSG_CLIENT_TO_SDK_RESUME_GAME);
                } else if (VEEditor.this.f116221f != null) {
                    C45372t.m143407c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                    VEEditor.this.f116221f.onCallback(i, i2, f, str);
                }
            } else if (i != 4103) {
                if (i != 4105) {
                    if (i != 4129) {
                        if (VEEditor.this.f116221f != null) {
                            StringBuilder sb2 = new StringBuilder("TECommonCallback type:");
                            sb2.append(i);
                            C45372t.m143403a("VEEditor", sb2.toString());
                            VEEditor.this.f116221f.onCallback(i, i2, f, str);
                        }
                    } else if (VEEditor.this.f116238w == 0) {
                        VEEditor.this.f116238w = System.currentTimeMillis();
                        C45372t.m143403a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                    }
                } else if (VEEditor.this.f116219d != null && VEEditor.this.f116217b != null) {
                    Message message = new Message();
                    message.what = i;
                    message.obj = Float.valueOf(f);
                    VEEditor.this.f116217b.sendMessage(message);
                } else if (VEEditor.this.f116221f != null) {
                    VEEditor.this.f116221f.onCallback(i, i2, f, str);
                }
            } else if (VEEditor.this.f116240y) {
                VEEditor.this.f116241z.f116300d = VEEditor.this.f116221f;
                new Thread(VEEditor.this.f116241z).start();
                VEEditor.this.f116240y = false;
            } else {
                if (i2 == 1 || i2 == 0) {
                    VEEditor.this.mo107932b();
                }
                if (VEEditor.this.f116219d != null && VEEditor.this.f116217b != null) {
                    C45372t.m143407c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                    Message message2 = new Message();
                    message2.what = MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME;
                    message2.arg1 = i2;
                    message2.obj = str;
                    VEEditor.this.f116217b.sendMessage(message2);
                } else if (VEEditor.this.f116221f != null) {
                    C45372t.m143407c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                    VEEditor.this.f116221f.onCallback(i, i2, f, str);
                }
            }
        }
    };

    /* renamed from: O */
    private C20445c f116167O = new C20445c() {
        /* renamed from: a */
        public final void mo55039a(int i, int i2, float f, String str) {
            VEEditor.this.mo107941c();
            if (VEEditor.this.f116222g != null) {
                VEEditor.this.f116222g.onCallback(i, i2, f, str);
            }
            if (VEEditor.this.f116219d != null && VEEditor.this.f116217b != null) {
                C45202b bVar = VEEditor.this.f116217b;
                final int i3 = i;
                final int i4 = i2;
                final float f2 = f;
                final String str2 = str;
                C451971 r1 = new Runnable() {
                    public final void run() {
                        if (VEEditor.this.f116219d != null) {
                            VEEditor.this.f116219d.onCompileError(i3, i4, f2, str2);
                        }
                    }
                };
                bVar.post(r1);
            }
        }
    };

    /* renamed from: P */
    private int f116168P = 0;

    /* renamed from: Q */
    private int f116169Q = 0;

    /* renamed from: R */
    private Boolean f116170R = Boolean.valueOf(false);

    /* renamed from: S */
    private int f116171S = -1;

    /* renamed from: T */
    private int f116172T = 0;

    /* renamed from: U */
    private SurfaceView f116173U;

    /* renamed from: V */
    private TextureView f116174V;

    /* renamed from: W */
    private int f116175W = 0;

    /* renamed from: X */
    private int f116176X = -1;

    /* renamed from: Y */
    private VIDEO_RATIO f116177Y;

    /* renamed from: Z */
    private VIDEO_GRAVITY f116178Z = VIDEO_GRAVITY.ALIGN_PARENT_BOTTOM;

    /* renamed from: a */
    public C45345b f116179a;

    /* renamed from: aA */
    private int f116180aA = -16777216;

    /* renamed from: aB */
    private int f116181aB = -16777216;

    /* renamed from: aC */
    private final SurfaceTextureListener f116182aC = new SurfaceTextureListener() {
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            VEEditor.this.mo107908a();
            if (VEEditor.this.f116230o != null) {
                VEEditor.this.f116230o.release();
            }
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            VEEditor.this.f116226k = i;
            VEEditor.this.f116227l = i2;
            VEEditor.this.mo107849C();
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (VEEditor.this.f116229n == surfaceTexture) {
                VEEditor.this.mo107912a(VEEditor.this.f116230o);
            } else {
                VEEditor.this.f116230o = new Surface(surfaceTexture);
                VEEditor.this.mo107912a(VEEditor.this.f116230o);
            }
            VEEditor.this.f116229n = surfaceTexture;
        }
    };

    /* renamed from: aD */
    private Callback2 f116183aD = new Callback2() {
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            VEEditor.this.mo107908a();
        }

        public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            C45372t.m143405b("VEEditor", "surfaceRedrawNeeded...");
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            VEEditor.this.mo107912a(surfaceHolder.getSurface());
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C45372t.m143405b("VEEditor", C1642a.m8035a(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
            VEEditor.this.f116226k = i2;
            VEEditor.this.f116227l = i3;
            VEEditor.this.mo107849C();
            VEEditor.this.mo107910a(i2, i3);
        }
    };

    /* renamed from: aE */
    private C20498d f116184aE = new C20498d() {
        /* renamed from: a */
        public final int mo55472a(int i) {
            StringBuilder sb = new StringBuilder("onOpenGLCreate: ret = ");
            sb.append(i);
            C45372t.m143405b("VEEditor", sb.toString());
            return 0;
        }

        /* renamed from: b */
        public final int mo55474b(int i) {
            StringBuilder sb = new StringBuilder("onOpenGLDestroy: ret = ");
            sb.append(i);
            C45372t.m143405b("VEEditor", sb.toString());
            return 0;
        }

        /* renamed from: a */
        public final int mo55473a(int i, double d) {
            long j;
            long j2;
            StringBuilder sb = new StringBuilder("onOpenGLDrawing: tex = ");
            sb.append(i);
            sb.append(" timeStamp = ");
            sb.append(d);
            C45372t.m143410e("VEEditor", sb.toString());
            if (!VEEditor.this.f116239x) {
                VEEditor.this.f116239x = true;
                long currentTimeMillis = System.currentTimeMillis();
                if (VEEditor.this.f116238w > 0) {
                    j = VEEditor.this.f116238w;
                } else {
                    j = currentTimeMillis;
                }
                if (VEEditor.this.f116236u > 0) {
                    j2 = VEEditor.this.f116236u;
                } else {
                    j2 = VEEditor.this.f116235t;
                }
                if (j2 == 0 || j2 < VEEditor.this.f116234s) {
                    StringBuilder sb2 = new StringBuilder("onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = ");
                    sb2.append(VEEditor.this.f116236u);
                    sb2.append(", mlFirstSeekTimeMS = ");
                    sb2.append(VEEditor.this.f116235t);
                    sb2.append(", mlInitTimeMS = ");
                    sb2.append(VEEditor.this.f116234s);
                    C45372t.m143409d("VEEditor", sb2.toString());
                    j2 = VEEditor.this.f116234s;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("time_init", j2 - VEEditor.this.f116234s);
                    jSONObject.put("time_seek", j - j2);
                    jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                    jSONObject.put("time_total", currentTimeMillis - VEEditor.this.f116234s);
                    C20469a.m67906a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                } catch (JSONException e) {
                    StringBuilder sb3 = new StringBuilder("report first frame json err ");
                    sb3.append(e);
                    C45372t.m143409d("VEEditor", sb3.toString());
                }
                C20479f.m67948a(1, "te_edit_first_frame_time", currentTimeMillis - VEEditor.this.f116234s);
                if (VEEditor.this.f116220e != null) {
                    VEEditor.this.f116220e.mo38884a();
                }
            }
            VEEditor.this.f116231p++;
            if (VEEditor.this.f116231p == 30) {
                VEEditor.this.f116232q = System.currentTimeMillis();
                if (VEEditor.this.f116233r != VEEditor.this.f116232q) {
                    float f = 30000.0f / ((float) (VEEditor.this.f116232q - VEEditor.this.f116233r));
                    if (C45251ab.f116417a) {
                        StringBuilder sb4 = new StringBuilder("Render FPS = ");
                        sb4.append(f);
                        C45372t.m143403a("VEEditor", sb4.toString());
                    }
                    VEEditor.this.f116233r = VEEditor.this.f116232q;
                    VEEditor.this.f116231p = 0;
                    if (VEEditor.this.mo107977o() == VEState.STARTED) {
                        C20479f.m67947a(2, "te_edit_playback_fps", (double) f);
                    }
                }
            }
            return 0;
        }
    };

    /* renamed from: aF */
    private C20495a f116185aF = new C20495a() {
        /* renamed from: a */
        public final int mo55470a(byte[] bArr, int i, int i2, boolean z) {
            if (bArr == null || i < 0 || i2 <= 0) {
                return -1;
            }
            if (VEEditor.this.f116156A == null) {
                return -2;
            }
            VEEditor.this.f116156A.mo102091a(bArr, i, i2, z);
            return 0;
        }
    };

    /* renamed from: aG */
    private C20496b f116186aG = new C20496b() {
        /* renamed from: a */
        public final int mo55471a(byte[] bArr, int i, int i2, int i3, float f) {
            if (VEEditor.this.f116157B == null) {
                return -100;
            }
            if (bArr != null || VEEditor.this.f116217b == null) {
                return VEEditor.this.f116157B.mo96655a(bArr, i, i2, i3, f);
            }
            Message message = new Message();
            message.what = 4117;
            VEEditor.this.f116217b.sendMessage(message);
            return 0;
        }
    };

    /* renamed from: aH */
    private String f116187aH;

    /* renamed from: aI */
    private double f116188aI;

    /* renamed from: aJ */
    private double f116189aJ;

    /* renamed from: aK */
    private double f116190aK;

    /* renamed from: aL */
    private double f116191aL;

    /* renamed from: aa */
    private VIDEO_SCALETYPE f116192aa = VIDEO_SCALETYPE.CENTER;

    /* renamed from: ab */
    private boolean f116193ab = false;

    /* renamed from: ac */
    private boolean f116194ac = false;

    /* renamed from: ad */
    private boolean f116195ad = false;

    /* renamed from: ae */
    private int f116196ae = -1;

    /* renamed from: af */
    private int f116197af = -1;

    /* renamed from: ag */
    private int f116198ag = -1;

    /* renamed from: ah */
    private int f116199ah = -1;

    /* renamed from: ai */
    private int f116200ai = -1;

    /* renamed from: aj */
    private C20464d f116201aj;

    /* renamed from: ak */
    private String f116202ak = null;

    /* renamed from: al */
    private long f116203al = 0;

    /* renamed from: am */
    private boolean f116204am = false;

    /* renamed from: an */
    private C20480g f116205an = new C20480g();

    /* renamed from: ao */
    private MVInfoBean f116206ao;

    /* renamed from: aq */
    private boolean f116207aq = false;

    /* renamed from: ar */
    private boolean f116208ar = true;

    /* renamed from: as */
    private boolean f116209as = false;

    /* renamed from: at */
    private Bitmap f116210at = null;

    /* renamed from: au */
    private float f116211au = 0.0f;

    /* renamed from: av */
    private float f116212av = 1.0f;

    /* renamed from: aw */
    private float f116213aw = 1.0f;

    /* renamed from: ax */
    private int f116214ax = -1;

    /* renamed from: ay */
    private int f116215ay = 3000;

    /* renamed from: az */
    private float f116216az = 30.0f;

    /* renamed from: b */
    public C45202b f116217b = new C45202b(Looper.getMainLooper());

    /* renamed from: c */
    public volatile C45217m f116218c = null;

    /* renamed from: d */
    public volatile C45215k f116219d = null;

    /* renamed from: e */
    public volatile C45219o f116220e = null;

    /* renamed from: f */
    public C45329l f116221f = null;

    /* renamed from: g */
    public C45329l f116222g = null;

    /* renamed from: h */
    public Map<Integer, Boolean> f116223h = new HashMap();

    /* renamed from: i */
    public int f116224i = 0;

    /* renamed from: j */
    public int f116225j = -1;

    /* renamed from: k */
    public int f116226k = 0;

    /* renamed from: l */
    public int f116227l = 0;

    /* renamed from: m */
    public TEInterface f116228m;

    /* renamed from: n */
    public SurfaceTexture f116229n;

    /* renamed from: o */
    public Surface f116230o;

    /* renamed from: p */
    public int f116231p = 0;

    /* renamed from: q */
    public long f116232q = 0;

    /* renamed from: r */
    public long f116233r = 0;

    /* renamed from: s */
    public long f116234s = 0;

    /* renamed from: t */
    public long f116235t = 0;

    /* renamed from: u */
    public long f116236u = 0;

    /* renamed from: v */
    public long f116237v = 0;

    /* renamed from: w */
    public long f116238w = 0;

    /* renamed from: x */
    public boolean f116239x = false;

    /* renamed from: y */
    public boolean f116240y = false;

    /* renamed from: z */
    public C45201a f116241z = null;

    /* renamed from: com.ss.android.vesdk.VEEditor$GET_FRAMES_FLAGS */
    public enum GET_FRAMES_FLAGS {
        GET_FRAMES_MODE_NORMAL(1),
        GET_FRAMES_MODE_NOEFFECT(2),
        GET_FRAMES_MODE_ORIGINAL(4),
        GET_FRAMES_MODE_NORMAL_SCORE(9),
        GET_FRAMES_MODE_NOEFFECT_SCORE(10),
        GET_FRAMES_MODE_ORIGINAL_SCORE(12);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        private GET_FRAMES_FLAGS(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$SCALE_MODE */
    public enum SCALE_MODE {
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE,
        SCALE_MODE_FIT_START_WITH_2DENGINE,
        SCALE_MODE_FIT_END_WITH_2DENGINE,
        SCALE_MODE_CANVAS
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$SEEK_MODE */
    public enum SEEK_MODE {
        EDITOR_SEEK_FLAG_OnGoing(0),
        EDITOR_SEEK_FLAG_LastSeek(1),
        EDITOR_SEEK_FLAG_ToIframe(2),
        EDITOR_SEEK_FLAG_LAST_UpdateIn(EDITOR_SEEK_FLAG_LastSeek.getValue() | 4),
        EDITOR_SEEK_FLAG_LAST_UpdateOut(EDITOR_SEEK_FLAG_LastSeek.getValue() | 8),
        EDITOR_SEEK_FLAG_LAST_UpdateInOut(EDITOR_SEEK_FLAG_LastSeek.getValue() | 16),
        EDITOR_SEEK_FLAG_Forward(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH),
        EDITOR_SEEK_FLAG_LAST_Forward(EDITOR_SEEK_FLAG_Forward.getValue() | EDITOR_SEEK_FLAG_LastSeek.getValue()),
        EDITOR_SEEK_FLAG_LAST_Clear(EDITOR_SEEK_FLAG_LastSeek.getValue() | 256),
        EDITOR_SEEK_FLAG_LAST_Accurate(EDITOR_SEEK_FLAG_LastSeek.getValue() | 640),
        EDITOR_SEEK_FLAG_LAST_Accurate_Clear(EDITOR_SEEK_FLAG_LastSeek.getValue() | 896);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        private SEEK_MODE(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$SET_RANGE_MODE */
    public enum SET_RANGE_MODE {
        EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
        EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        private SET_RANGE_MODE(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$VEState */
    public enum VEState {
        ANY(65535),
        ERROR(0),
        NOTHING(1048576),
        IDLE(1),
        INITIALIZED(2),
        PREPARED(4),
        STARTED(8),
        PAUSED(16),
        SEEKING(32),
        STOPPED(64),
        COMPLETED(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        public static VEState valueOf(int i) {
            if (i == 4) {
                return PREPARED;
            }
            if (i == 8) {
                return STARTED;
            }
            if (i == 16) {
                return PAUSED;
            }
            if (i == 32) {
                return SEEKING;
            }
            if (i == 64) {
                return STOPPED;
            }
            if (i == 128) {
                return COMPLETED;
            }
            if (i == 65535) {
                return ANY;
            }
            if (i == 1048576) {
                return NOTHING;
            }
            switch (i) {
                case 0:
                    return ERROR;
                case 1:
                    return IDLE;
                case 2:
                    return INITIALIZED;
                default:
                    return null;
            }
        }

        private VEState(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$VIDEO_GRAVITY */
    public enum VIDEO_GRAVITY {
        ALIGN_PARENT_LEFT,
        ALIGN_PARENT_TOP,
        ALIGN_PARENT_RIGHT,
        ALIGN_PARENT_BOTTOM,
        CENTER_IN_PARENT,
        CENTER_HORIZONTAL,
        CENTER_VERTICAL
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$VIDEO_RATIO */
    public enum VIDEO_RATIO {
        VIDEO_OUT_RATIO_1_1,
        VIDEO_OUT_RATIO_4_3,
        VIDEO_OUT_RATIO_3_4,
        VIDEO_OUT_RATIO_16_9,
        VIDEO_OUT_RATIO_9_16,
        VIDEO_OUT_RATIO_ORIGINAL
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$VIDEO_SCALETYPE */
    public enum VIDEO_SCALETYPE {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$Video_Rotation */
    public enum Video_Rotation {
        VideoRotation_0,
        VideoRotation_90,
        VideoRotation_180,
        VideoRotation_270
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$a */
    class C45201a implements Runnable {

        /* renamed from: a */
        String f116297a;

        /* renamed from: b */
        public String f116298b;

        /* renamed from: c */
        String f116299c;

        /* renamed from: d */
        public C45329l f116300d;

        /* renamed from: e */
        boolean f116301e;

        /* renamed from: f */
        public String f116302f;

        /* renamed from: g */
        public int f116303g = 50;

        /* renamed from: h */
        public int f116304h = 50;

        /* renamed from: i */
        public int f116305i = 100;

        /* renamed from: j */
        public int f116306j = 100;

        public final void run() {
            String str;
            if (TextUtils.isEmpty(this.f116298b) || TextUtils.isEmpty(this.f116299c) || this.f116301e) {
                if (this.f116300d != null) {
                    this.f116300d.onCallback(MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME, -205, 0.0f, "File is empty or running");
                }
                return;
            }
            this.f116301e = true;
            int executeFFmpegCommand = TEVideoUtils.executeFFmpegCommand(C1642a.m8034a("ffmpeg -y -i %s -vf palettegen %s", new Object[]{this.f116298b, this.f116297a}), null);
            if (executeFFmpegCommand != 0) {
                this.f116301e = false;
                if (this.f116300d != null) {
                    this.f116300d.onCallback(MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME, executeFFmpegCommand, 0.0f, "ffmpeg gen palette");
                }
                return;
            }
            if (this.f116302f != null) {
                str = C1642a.m8035a(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [2:v]scale=w=%d:h=%d[o0];[0:v][o0]overlay=x=%d-w/2:y=%d-h/2[o1];[o1][1:v]paletteuse -f gif %s", new Object[]{this.f116298b, this.f116297a, this.f116302f, Integer.valueOf(this.f116303g), Integer.valueOf(this.f116304h), Integer.valueOf(this.f116305i), Integer.valueOf(this.f116306j), this.f116299c});
            } else {
                str = C1642a.m8035a(Locale.US, "ffmpeg -y -i %s -i %s -lavfi paletteuse -f gif %s", new Object[]{this.f116298b, this.f116297a, this.f116299c});
            }
            int executeFFmpegCommand2 = TEVideoUtils.executeFFmpegCommand(str, null);
            if (this.f116300d != null) {
                this.f116300d.onCallback(MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME, executeFFmpegCommand2, 0.0f, "ffmepg convert to gif");
            }
            this.f116301e = false;
        }

        C45201a() {
        }

        /* renamed from: a */
        public final void mo108014a(String str) {
            this.f116299c = str;
            if (TextUtils.isEmpty(this.f116299c)) {
                this.f116297a = null;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(new File(this.f116299c).getParent());
            sb.append(File.separatorChar);
            sb.append("palette.png");
            this.f116297a = sb.toString();
        }
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$b */
    class C45202b extends Handler {
        public final void handleMessage(Message message) {
            String str;
            int i = message.what;
            if (i != 4101) {
                if (i != 4103) {
                    if (i != 4105) {
                        if (i == 4117 && VEEditor.this.f116157B != null) {
                            VEEditor.this.f116157B.mo96655a(null, -1, -1, -1, 0.0f);
                            VEEditor.this.f116157B = null;
                        }
                    } else if (VEEditor.this.f116219d != null) {
                        VEEditor.this.f116219d.onCompileProgress(((Float) message.obj).floatValue());
                    }
                } else if (VEEditor.this.f116219d != null) {
                    if (message.arg1 < 0) {
                        C45215k kVar = VEEditor.this.f116219d;
                        int i2 = message.arg1;
                        int i3 = message.arg1;
                        if (message.obj == null) {
                            str = "";
                        } else {
                            str = message.obj.toString();
                        }
                        kVar.onCompileError(i2, i3, 0.0f, str);
                    } else {
                        VEEditor.this.f116219d.onCompileDone();
                    }
                    VEEditor.this.f116219d = null;
                }
            } else if (VEEditor.this.f116218c != null) {
                VEEditor.this.f116218c.mo98376a(0);
                VEEditor.this.f116218c = null;
            }
        }

        public C45202b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: A */
    public static void m142462A() {
        TEVideoUtils.nativeCancelCompileProbe();
    }

    /* renamed from: a */
    public final void mo107908a() {
        C45372t.m143407c("VEEditor", "surfaceDestroyed...");
        this.f116228m.releasePreviewSurface();
    }

    /* renamed from: a */
    public final void mo107912a(Surface surface) {
        Rect rect;
        C45372t.m143407c("VEEditor", "surfaceCreated...");
        this.f116208ar = false;
        if (this.f116207aq && this.f116210at != null) {
            Canvas lockCanvas = surface.lockCanvas(null);
            int width = lockCanvas.getWidth();
            int height = lockCanvas.getHeight();
            int width2 = this.f116210at.getWidth();
            int height2 = this.f116210at.getHeight();
            StringBuilder sb = new StringBuilder("width ");
            sb.append(width);
            sb.append(" height ");
            sb.append(height);
            sb.append(" image width ");
            sb.append(width2);
            sb.append(" image height ");
            sb.append(height2);
            C45372t.m143403a("VEEditor", sb.toString());
            float f = (float) width;
            float f2 = (float) height;
            float f3 = ((float) width2) / ((float) height2);
            if (f3 > f / f2) {
                int i = (height - ((int) (f / f3))) / 2;
                rect = new Rect(0, i, width, height - i);
            } else {
                int i2 = (width - ((int) (f2 * f3))) / 2;
                rect = new Rect(i2, 0, width - i2, height);
            }
            lockCanvas.drawBitmap(this.f116210at, null, rect, null);
            surface.unlockCanvasAndPost(lockCanvas);
            if (this.f116209as) {
                if (this.f116210at != null && !this.f116210at.isRecycled()) {
                    this.f116210at.recycle();
                    this.f116210at = null;
                }
                this.f116209as = false;
            }
        }
        this.f116228m.setPreviewSurface(surface);
    }

    /* renamed from: a */
    public final void mo107910a(int i, int i2) {
        C45372t.m143403a("VEEditor", "onSurfaceChanged...");
        if (i != 0 && i2 != 0) {
            this.f116228m.setSurfaceSize(i, i2);
        }
    }

    /* renamed from: b */
    public final void mo107932b() {
        long currentTimeMillis = System.currentTimeMillis() - this.f116203al;
        C20479f.m67954a("te_composition_time", currentTimeMillis);
        C20479f.m67948a(1, "te_composition_time", currentTimeMillis);
        if (C19722g.m65025a(this.f116202ak)) {
            int[] iArr = new int[10];
            if (TEVideoUtils.getVideoFileInfo(this.f116202ak, iArr) == 0) {
                long length = new File(this.f116202ak).length();
                C20479f.m67954a("te_composition_page_mode", (long) this.f116214ax);
                double d = (double) length;
                Double.isNaN(d);
                double d2 = (d / 1024.0d) / 1024.0d;
                C20479f.m67952a("te_composition_file_size", d2);
                C20479f.m67952a("te_composition_file_duration", (double) iArr[3]);
                C20479f.m67952a("te_composition_bit_rate", (double) iArr[6]);
                C20479f.m67952a("te_composition_fps", (double) iArr[7]);
                StringBuilder sb = new StringBuilder();
                sb.append(iArr[0]);
                sb.append("x");
                sb.append(iArr[1]);
                C20479f.m67955a("te_composition_resolution", sb.toString());
                C20479f.m67948a(1, "te_composition_page_mode", (long) this.f116214ax);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iArr[0]);
                sb2.append("x");
                sb2.append(iArr[1]);
                C20479f.m67949a(1, "te_composition_resolution", sb2.toString());
                C20479f.m67947a(1, "te_composition_fps", (double) iArr[7]);
                C20479f.m67947a(1, "te_composition_bit_rate", (double) iArr[6]);
                C20479f.m67947a(1, "te_composition_file_duration", (double) iArr[3]);
                C20479f.m67947a(1, "te_composition_file_size", d2);
                int i = this.f116205an.f55349c;
                if (i != 0) {
                    C20479f.m67948a(1, "te_composition_time_filter_type", (long) i);
                }
            }
        }
        boolean b = this.f116205an.mo55145b();
        long j = 1;
        C20479f.m67948a(1, "te_composition_effect_add", b ? 0 : 1);
        if (!b) {
            C20479f.m67949a(1, "te_composition_effect_json", this.f116205an.mo55141a(0));
        }
        boolean c = this.f116205an.mo55146c();
        String str = "te_composition_info_sticker_add";
        if (c) {
            j = 0;
        }
        C20479f.m67948a(1, str, j);
        if (!c) {
            C20479f.m67949a(1, "te_composition_info_sticker_json", this.f116205an.mo55141a(1));
        }
        this.f116205an.mo55142a();
        C20479f.m67946a(C20479f.f55343b);
        C20479f.m67949a(1, "iesve_veeditor_composition_finish_file", this.f116159D);
        C20479f.m67949a(1, "iesve_veeditor_composition_finish_result", "succ");
        C20479f.m67949a(1, "iesve_veeditor_composition_finish_reason", "");
        C20479f.m67966b(1);
        Map e = C20479f.m67970e(1);
        JSONObject jSONObject = new JSONObject();
        try {
            C20479f.m67958a(e, jSONObject);
        } catch (JSONException unused) {
        }
        C20469a.m67906a("vesdk_event_editor_compile_finish", jSONObject, "performance");
    }

    public VEEditor(String str, TextureView textureView) throws VEException {
        if (!TextUtils.isEmpty(str)) {
            C45372t.m143403a("VEEditor", "VEEditor textureView");
            this.f116228m = TEInterface.createEngine();
            this.f116179a = new C45345b(str);
            this.f116174V = textureView;
            textureView.setSurfaceTextureListener(this.f116182aC);
            this.f116228m.setOpenGLListeners(this.f116184aE);
            this.f116228m.setInfoListener(this.f116166N);
            this.f116228m.setErrorListener(this.f116167O);
            mo107939c(false);
            return;
        }
        StringBuilder sb = new StringBuilder("workspace is: ");
        sb.append(str);
        throw new VEException(-100, sb.toString());
    }

    /* renamed from: a */
    public final void mo107914a(C45329l lVar) {
        this.f116222g = lVar;
        C45372t.m143403a("VEEditor", "setOnErrorListener...");
    }

    /* renamed from: b */
    public final void mo107934b(C45329l lVar) {
        C45372t.m143403a("VEEditor", "setOnInfoListener...");
        this.f116221f = lVar;
    }

    /* renamed from: a */
    public final void mo107911a(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder("setDisplayPos... ");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        sb.append(" ");
        sb.append(i3);
        sb.append(" ");
        sb.append(i4);
        C45372t.m143403a("VEEditor", sb.toString());
        mo107909a(((float) i3) / ((float) this.f116168P), ((float) i4) / ((float) this.f116169Q), 0.0f, -(((this.f116226k / 2) - (i3 / 2)) - i), ((this.f116227l / 2) - (i4 / 2)) - i2);
    }

    /* renamed from: b */
    public final VESize mo107931b(int i, int i2) {
        VESize vESize = new VESize(0, 0);
        float f = (float) i;
        float f2 = (float) i2;
        if (((float) this.f116158C.f116385a) / ((float) this.f116158C.f116386b) > f / f2) {
            vESize.f116385a = i;
            vESize.f116386b = (int) (f / (((float) this.f116158C.f116385a) / ((float) this.f116158C.f116386b)));
        } else {
            vESize.f116386b = i2;
            vESize.f116385a = (int) (f2 / (((float) this.f116158C.f116386b) / ((float) this.f116158C.f116385a)));
        }
        StringBuilder sb = new StringBuilder("getInitSize... surfaceWidth:");
        sb.append(i);
        sb.append(", surfaceHeight:");
        sb.append(i2);
        sb.append(", width:");
        sb.append(vESize.f116385a);
        sb.append(", height:");
        sb.append(vESize.f116386b);
        C45372t.m143403a("VEEditor", sb.toString());
        return vESize;
    }

    /* renamed from: a */
    public final void mo107909a(float f, float f2, float f3, int i, int i2) {
        C45306a aVar = new C45306a();
        aVar.mo108379a("iesve_veeditor_video_scale_width", f).mo108379a("iesve_veeditor_video_scale_heigh", f2);
        C20477e.m67936a("iesve_veeditor_video_scale", 1, aVar);
        this.f116211au = f3;
        this.f116212av = f2;
        this.f116213aw = f2;
        StringBuilder sb = new StringBuilder("setDisplayState... ");
        sb.append(f);
        sb.append(" ");
        sb.append(f2);
        sb.append(" ");
        sb.append(f3);
        sb.append(" ");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        C45372t.m143403a("VEEditor", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scaleW", String.valueOf(f));
            jSONObject.put("scaleH", String.valueOf(f2));
            jSONObject.put("degree", String.valueOf(f3));
            jSONObject.put("transX", String.valueOf(i));
            jSONObject.put("transY", String.valueOf(i2));
            C20469a.m67906a("vesdk_event_editor_scale_rotate_trans", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        this.f116228m.setDisplayState(f, f2, f3, 0.0f, i, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r0 == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r1 = new java.lang.StringBuilder("getDisplayImage failed ");
        r1.append(r0);
        com.p280ss.android.vesdk.C45372t.m143409d("VEEditor", r1.toString());
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[Catch:{ Exception -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo107907a(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrDisplayImage... width:"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r0, r1)
            monitor-enter(r4)
            com.ss.android.vesdk.VESize r0 = r4.m142463H()     // Catch:{ all -> 0x0082 }
            int r1 = r0.f116385a     // Catch:{ all -> 0x0082 }
            r2 = 0
            if (r1 == 0) goto L_0x0080
            int r1 = r0.f116386b     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x0022
            goto L_0x0080
        L_0x0022:
            if (r5 <= 0) goto L_0x0031
            int r1 = r0.f116385a     // Catch:{ all -> 0x0082 }
            if (r5 < r1) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            int r1 = r0.f116386b     // Catch:{ all -> 0x0082 }
            int r1 = r1 * r5
            int r0 = r0.f116385a     // Catch:{ all -> 0x0082 }
            int r1 = r1 / r0
            goto L_0x0035
        L_0x0031:
            int r5 = r0.f116385a     // Catch:{ all -> 0x0082 }
            int r1 = r0.f116386b     // Catch:{ all -> 0x0082 }
        L_0x0035:
            int r0 = r5 % 2
            r3 = 1
            if (r0 != r3) goto L_0x003c
            int r5 = r5 + 1
        L_0x003c:
            int r0 = r1 % 2
            if (r0 != r3) goto L_0x0042
            int r1 = r1 + 1
        L_0x0042:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0066 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r1, r0)     // Catch:{ Exception -> 0x0066 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r4.f116228m     // Catch:{ all -> 0x0082 }
            int r0 = r0.getDisplayImage(r5)     // Catch:{ all -> 0x0082 }
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0065
            java.lang.String r5 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "getDisplayImage failed "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.p280ss.android.vesdk.C45372t.m143409d(r5, r0)
            r5 = r2
        L_0x0065:
            return r5
        L_0x0066:
            r5 = move-exception
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "getDisplayImage createBitmap failed "
            r1.<init>(r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0082 }
            r1.append(r5)     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x0082 }
            com.p280ss.android.vesdk.C45372t.m143409d(r0, r5)     // Catch:{ all -> 0x0082 }
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            return r2
        L_0x0080:
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            return r2
        L_0x0082:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.mo107907a(int):android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final void mo107933b(int i) {
        StringBuilder sb = new StringBuilder("setBackgroundColor... color:");
        sb.append(i);
        C45372t.m143403a("VEEditor", sb.toString());
        this.f116180aA = i;
        this.f116228m.setBackGroundColor(i);
    }

    /* renamed from: a */
    public final int mo107864a(int i, int i2, SET_RANGE_MODE set_range_mode) {
        int prepareEngine;
        synchronized (this) {
            C45306a aVar = new C45306a();
            aVar.mo108380a("iesve_veeditor_cut_duration", i2 - i);
            C20477e.m67936a("iesve_veeditor_cut_duration", 1, aVar);
            StringBuilder sb = new StringBuilder("setInOut... ");
            sb.append(i);
            sb.append(" ");
            sb.append(i2);
            sb.append(" mode ");
            sb.append(set_range_mode.getValue());
            C45372t.m143403a("VEEditor", sb.toString());
            this.f116228m.stop();
            this.f116228m.setTimeRange(i, i2, set_range_mode.getValue());
            prepareEngine = this.f116228m.prepareEngine(0);
        }
        return prepareEngine;
    }

    /* renamed from: a */
    public final int mo107899a(boolean z) {
        return this.f116228m.setDestroyVersion(z);
    }

    /* renamed from: a */
    public final int mo107906a(String[] strArr, String[] strArr2, String[] strArr3, VIDEO_RATIO video_ratio) throws VEException {
        synchronized (this) {
            C20479f.m67969d(1);
            C20479f.m67968c(1);
            this.f116233r = System.currentTimeMillis();
            this.f116234s = System.currentTimeMillis();
            C45372t.m143403a("VEEditor", "init...");
            if (this.f116179a == null) {
                C45372t.m143409d("VEEditor", "init mResManager is null");
                return -112;
            }
            int createScene = this.f116228m.createScene(this.f116179a.f116796a, strArr, strArr3, strArr2, null, video_ratio.ordinal());
            if (createScene != 0) {
                StringBuilder sb = new StringBuilder("Create Scene failed, ret = ");
                sb.append(createScene);
                C45372t.m143409d("VEEditor", sb.toString());
                mo107941c();
                this.f116193ab = false;
                return createScene;
            }
            this.f116193ab = true;
            this.f116179a.f116802g = false;
            this.f116177Y = video_ratio;
            this.f116179a.f116798c = strArr3;
            this.f116179a.f116797b = strArr;
            this.f116179a.f116799d = strArr2;
            this.f116197af = -1;
            this.f116170R = Boolean.valueOf((strArr3 == null || strArr3.length == 0) ? false : true);
            if (this.f116170R.booleanValue()) {
                this.f116179a.f116804i = 1;
            } else {
                this.f116179a.f116804i = 0;
            }
            this.f116179a.f116803h = 0;
            this.f116172T = 0;
            int I = m142464I();
            return I;
        }
    }

    /* renamed from: a */
    public final int mo107883a(VERecordData vERecordData, boolean z) {
        float[] fArr;
        VERecordData vERecordData2 = vERecordData;
        int i = 0;
        if (!z) {
            int size = vERecordData2.f116371b.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            int[] iArr4 = new int[size];
            float[] fArr2 = new float[size];
            for (VERecordSegmentData vERecordSegmentData : vERecordData2.f116371b) {
                if (vERecordSegmentData.f116382h) {
                    strArr[i] = vERecordSegmentData.f116375a;
                    strArr2[i] = vERecordSegmentData.f116376b;
                    iArr[i] = (int) (vERecordSegmentData.f116383i / 1000);
                    iArr2[i] = (int) (vERecordSegmentData.f116384j / 1000);
                    fArr2[i] = vERecordSegmentData.f116379e;
                    iArr3[i] = (int) (((float) iArr[i]) * fArr2[i]);
                    iArr4[i] = (int) (((float) iArr2[i]) * fArr2[i]);
                    i++;
                }
            }
            if (i == 0) {
                C45372t.m143409d("VEEditor", "没有有效片段");
                return -100;
            }
            String[] strArr3 = (String[]) Arrays.copyOf(strArr, i);
            String[] strArr4 = (String[]) Arrays.copyOf(strArr2, i);
            int[] copyOf = Arrays.copyOf(iArr, i);
            int[] copyOf2 = Arrays.copyOf(iArr2, i);
            int[] copyOf3 = Arrays.copyOf(iArr3, i);
            int[] copyOf4 = Arrays.copyOf(iArr4, i);
            float[] copyOf5 = Arrays.copyOf(fArr2, i);
            this.f116201aj = null;
            this.f116228m.clearFilter();
            this.f116160E.mo55061a();
            if (vERecordData2.f116372c) {
                strArr4 = null;
                copyOf3 = null;
                copyOf4 = null;
                fArr = null;
            } else {
                fArr = copyOf5;
            }
            return mo107904a(strArr3, copyOf, copyOf2, null, strArr4, copyOf3, copyOf4, null, fArr, null, VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL);
        } else if (vERecordData2.f116373d.isEmpty()) {
            C45372t.m143409d("VEEditor", "合并的视频文件路径未配置");
            return -100;
        } else {
            this.f116160E.mo55061a();
            this.f116201aj = null;
            this.f116228m.clearFilter();
            return mo107906a(new String[]{vERecordData2.f116373d}, (String[]) null, vERecordData2.f116372c ? null : new String[]{vERecordData2.f116374e}, VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL);
        }
    }

    /* renamed from: a */
    public final int mo107881a(VEEditorModel vEEditorModel, C45255af afVar) {
        synchronized (this) {
            C20479f.m67969d(1);
            C20479f.m67968c(1);
            this.f116233r = System.currentTimeMillis();
            this.f116234s = System.currentTimeMillis();
            C45372t.m143403a("VEEditor", "init with model...");
            mo107909a(1.0f, 1.0f, 0.0f, 0, 0);
            if (this.f116179a == null) {
                C45372t.m143409d("VEEditor", "init mResManager is null");
                return -112;
            }
            this.f116193ab = true;
            this.f116179a.f116802g = vEEditorModel.f116316d;
            this.f116177Y = vEEditorModel.f116317e;
            this.f116179a.f116798c = vEEditorModel.f116326n;
            this.f116179a.f116797b = vEEditorModel.f116325m;
            this.f116179a.f116799d = vEEditorModel.f116327o;
            this.f116197af = -1;
            this.f116170R = Boolean.valueOf(vEEditorModel.f116318f);
            this.f116179a.f116803h = 0;
            this.f116172T = vEEditorModel.f116319g;
            this.f116228m.setHostTrackIndex(vEEditorModel.f116320h);
            if (afVar != null) {
                int updateSenceTime = this.f116228m.updateSenceTime(afVar);
                if (updateSenceTime < 0) {
                    StringBuilder sb = new StringBuilder("updateSceneTime failed, ret = ");
                    sb.append(updateSenceTime);
                    C45372t.m143409d("VEEditor", sb.toString());
                    return updateSenceTime;
                }
                this.f116228m.setTimeRange(0, updateSenceTime, 0);
            }
            int a = m142471a(vEEditorModel);
            return a;
        }
    }

    /* renamed from: a */
    public final int mo107904a(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, String[] strArr3, int[] iArr3, int[] iArr4, float[] fArr, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr, VIDEO_RATIO video_ratio) throws VEException {
        VIDEO_RATIO video_ratio2;
        String str;
        String str2;
        String[] strArr4 = strArr;
        String[] strArr5 = strArr3;
        VIDEO_RATIO video_ratio3 = video_ratio;
        synchronized (this) {
            C20479f.m67969d(1);
            C20479f.m67968c(1);
            this.f116233r = System.currentTimeMillis();
            this.f116234s = System.currentTimeMillis();
            C45372t.m143403a("VEEditor", "init2... width rotate");
            int createScene2 = this.f116228m.createScene2(strArr, iArr, iArr2, strArr3, iArr3, iArr4, strArr2, null, fArr, fArr2, ROTATE_DEGREE.toIntArray(rotate_degreeArr), video_ratio.ordinal());
            JSONObject jSONObject = new JSONObject();
            String str3 = "videoFilePaths";
            if (strArr4 != null) {
                try {
                    str = Arrays.toString(strArr);
                } catch (JSONException unused) {
                    video_ratio2 = video_ratio;
                }
            } else {
                str = "";
            }
            jSONObject.put(str3, str);
            jSONObject.put("audioFilePaths", strArr5 != null ? Arrays.toString(strArr3) : "");
            jSONObject.put("vTrimIn", iArr != null ? Arrays.toString(iArr) : "");
            jSONObject.put("vTrimOut", iArr2 != null ? Arrays.toString(iArr2) : "");
            jSONObject.put("aTrimIn", iArr3 != null ? Arrays.toString(iArr3) : "");
            jSONObject.put("aTrimOut", iArr4 != null ? Arrays.toString(iArr4) : "");
            jSONObject.put("videoSpeed", fArr != null ? Arrays.toString(fArr) : "");
            jSONObject.put("audioSpeed", fArr2 != null ? Arrays.toString(fArr2) : "");
            jSONObject.put("rotate", rotate_degreeArr != null ? Arrays.toString(rotate_degreeArr) : "");
            String str4 = "videoOutRes";
            video_ratio2 = video_ratio;
            if (video_ratio2 != null) {
                try {
                    str2 = video_ratio.name();
                } catch (JSONException unused2) {
                }
            } else {
                str2 = "";
            }
            jSONObject.put(str4, str2);
            C20469a.m67906a("vesdk_event_editor_init_video", jSONObject, "behavior");
            if (createScene2 != 0) {
                String str5 = "VEEditor";
                StringBuilder sb = new StringBuilder("Create Scene failed, ret = ");
                sb.append(createScene2);
                C45372t.m143409d(str5, sb.toString());
                mo107941c();
                this.f116193ab = false;
                return createScene2;
            }
            this.f116193ab = true;
            this.f116179a.f116802g = false;
            this.f116177Y = video_ratio2;
            this.f116179a.f116798c = strArr5;
            this.f116179a.f116797b = strArr4;
            this.f116179a.f116799d = strArr2;
            this.f116197af = -1;
            this.f116170R = Boolean.valueOf((strArr5 == null || strArr5.length == 0) ? false : true);
            if (this.f116170R.booleanValue()) {
                this.f116179a.f116804i = 1;
            } else {
                this.f116179a.f116804i = 0;
            }
            this.f116179a.f116803h = 0;
            this.f116172T = 0;
            int I = m142464I();
            return I;
        }
    }

    /* renamed from: a */
    public final int mo107898a(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        int a;
        synchronized (this) {
            a = m142475a(str, strArr, strArr2, str2, i, i2, false);
        }
        return a;
    }

    /* renamed from: a */
    private List<List<List<MVResourceBean>>> m142480a(MVInfoBean mVInfoBean, List<String> list, List<String> list2) {
        ArrayList<MVResourceBean> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList3.add(arrayList4);
        arrayList3.add(arrayList5);
        ArrayList<MVResourceBean> arrayList6 = mVInfoBean.resources;
        ArrayList arrayList7 = new ArrayList();
        while (arrayList7.size() != arrayList6.size()) {
            ArrayList arrayList8 = new ArrayList();
            double d = 0.0d;
            double d2 = 0.0d;
            for (MVResourceBean mVResourceBean : arrayList6) {
                if (!arrayList7.contains(Integer.valueOf(mVResourceBean.rid))) {
                    if ("video".equals(mVResourceBean.type) || "img".equals(mVResourceBean.type) || "bgimg".equals(mVResourceBean.type)) {
                        List<String> list3 = list2;
                        if (mVResourceBean.seqIn >= d) {
                            MVResourceBean mVResourceBean2 = new MVResourceBean();
                            mVResourceBean2.seqIn = mVResourceBean.seqIn * 1000.0d;
                            mVResourceBean2.seqOut = mVResourceBean.seqOut * 1000.0d;
                            mVResourceBean2.trimIn = mVResourceBean.trimIn * 1000.0d;
                            mVResourceBean2.trimOut = mVResourceBean.trimOut * 1000.0d;
                            if (mVResourceBean2.trimOut != 0.0d || (!"img".equals(mVResourceBean.type) && !"bgimg".equals(mVResourceBean.type))) {
                                arrayList2 = arrayList5;
                                arrayList = arrayList6;
                            } else {
                                arrayList2 = arrayList5;
                                arrayList = arrayList6;
                                mVResourceBean2.trimOut = mVResourceBean2.seqOut - mVResourceBean2.seqIn;
                            }
                            mVResourceBean2.content = mVResourceBean.content;
                            mVResourceBean2.type = mVResourceBean.type;
                            mVResourceBean2.rid = mVResourceBean.rid;
                            arrayList8.add(mVResourceBean2);
                            d = mVResourceBean.seqOut;
                            arrayList7.add(Integer.valueOf(mVResourceBean2.rid));
                            list.add(mVResourceBean2.content);
                            arrayList5 = arrayList2;
                            arrayList6 = arrayList;
                        }
                        arrayList2 = arrayList5;
                        arrayList = arrayList6;
                        List<String> list4 = list;
                        arrayList5 = arrayList2;
                        arrayList6 = arrayList;
                    } else if (!"audio".equals(mVResourceBean.type)) {
                        List<String> list5 = list2;
                        if ("text".equals(mVResourceBean.type)) {
                            arrayList7.add(Integer.valueOf(mVResourceBean.rid));
                        } else {
                            arrayList7.add(Integer.valueOf(mVResourceBean.rid));
                        }
                        arrayList2 = arrayList5;
                        arrayList = arrayList6;
                        List<String> list42 = list;
                        arrayList5 = arrayList2;
                        arrayList6 = arrayList;
                    } else if (mVResourceBean.seqIn >= d2) {
                        ArrayList arrayList9 = new ArrayList();
                        MVResourceBean mVResourceBean3 = new MVResourceBean();
                        mVResourceBean3.seqIn = mVResourceBean.seqIn * 1000.0d;
                        mVResourceBean3.seqOut = mVResourceBean.seqOut * 1000.0d;
                        mVResourceBean3.trimIn = mVResourceBean.trimIn * 1000.0d;
                        mVResourceBean3.trimOut = mVResourceBean.trimOut * 1000.0d;
                        mVResourceBean3.content = mVResourceBean.content;
                        mVResourceBean3.type = mVResourceBean.type;
                        mVResourceBean3.rid = mVResourceBean.rid;
                        if (this.f116224i == 0) {
                            this.f116224i = mVResourceBean3.rid;
                        }
                        arrayList9.add(mVResourceBean3);
                        d2 = mVResourceBean.seqOut;
                        arrayList7.add(Integer.valueOf(mVResourceBean3.rid));
                        list2.add(mVResourceBean3.content);
                        if (arrayList9.size() > 0) {
                            arrayList5.add(arrayList9);
                        }
                    }
                }
                List<String> list6 = list2;
                arrayList2 = arrayList5;
                arrayList = arrayList6;
                List<String> list422 = list;
                arrayList5 = arrayList2;
                arrayList6 = arrayList;
            }
            List<String> list7 = list2;
            ArrayList arrayList10 = arrayList5;
            ArrayList<MVResourceBean> arrayList11 = arrayList6;
            List<String> list8 = list;
            if (arrayList8.size() > 0) {
                arrayList4.add(arrayList8);
            }
            arrayList5 = arrayList10;
            arrayList6 = arrayList11;
        }
        return arrayList3;
    }

    /* renamed from: a */
    private static void m142482a(List<MVResourceBean> list, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5) {
        int i = 0;
        for (MVResourceBean mVResourceBean : list) {
            iArr[i] = (int) mVResourceBean.trimIn;
            iArr2[i] = (int) mVResourceBean.trimOut;
            iArr3[i] = (int) mVResourceBean.seqIn;
            iArr4[i] = (int) mVResourceBean.seqOut;
            strArr[i] = mVResourceBean.content;
            iArr5[i] = mVResourceBean.rid;
            i++;
        }
    }

    /* renamed from: a */
    public final int mo107895a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("setExternalAlgorithmResult. photoPath = ");
        sb.append(str);
        sb.append(", algorithmType = ");
        sb.append(str2);
        sb.append(", filePath = ");
        sb.append(str3);
        C45372t.m143407c("VEEditor", sb.toString());
        if (this.f116164I != null && this.f116162G != null && this.f116163H != null) {
            return this.f116228m.setExternalAlgorithmResult(str, str2, str3);
        }
        C45372t.m143409d("VEEditor", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    /* renamed from: a */
    public final int mo107889a(String str, int i, int i2) {
        C45372t.m143407c("VEEditor", "updateMVBackgroundAudioTrack");
        return m142488b(this.f116164I, this.f116162G, this.f116163H, str, i, i2, false);
    }

    /* renamed from: a */
    public final int mo107897a(String str, String[] strArr, String[] strArr2) {
        C45372t.m143407c("VEEditor", "updateMVResources");
        return m142488b(str, strArr, strArr2, null, 0, 0, true);
    }

    /* renamed from: a */
    public final int mo107884a(C45255af afVar) {
        synchronized (this) {
            this.f116228m.stop();
            int updateSenceTime = this.f116228m.updateSenceTime(afVar);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", String.valueOf(updateSenceTime));
                jSONObject.put("sceneTime", afVar != null ? afVar.toString() : "");
                C20469a.m67906a("vesdk_event_editor_update_scene_time", jSONObject, "behavior");
            } catch (JSONException unused) {
            }
            if (updateSenceTime < 0) {
                String str = "VEEditor";
                StringBuilder sb = new StringBuilder("updateSceneTime failed, ret = ");
                sb.append(updateSenceTime);
                C45372t.m143409d(str, sb.toString());
                return updateSenceTime;
            }
            this.f116172T = 0;
            m142465J();
            this.f116228m.setTimeRange(0, updateSenceTime, 0);
            int prepareEngine = this.f116228m.prepareEngine(0);
            if (prepareEngine == 0) {
                return 0;
            }
            StringBuilder sb2 = new StringBuilder("Prepare Engine failed, ret = ");
            sb2.append(prepareEngine);
            C45372t.m143409d("VEEditor", sb2.toString());
            return prepareEngine;
        }
    }

    /* renamed from: a */
    public final int mo107885a(C45255af afVar, int i, int i2) {
        StringBuilder sb = new StringBuilder("update sence time with start/end time");
        sb.append(afVar.toString());
        sb.append(" startTime: ");
        sb.append(i);
        sb.append(" endTime: ");
        sb.append(i2);
        C45372t.m143407c("VEEditor", sb.toString());
        synchronized (this) {
            this.f116228m.stop();
            int updateSenceTime = this.f116228m.updateSenceTime(afVar);
            if (updateSenceTime < 0) {
                StringBuilder sb2 = new StringBuilder("updateSceneTime failed, ret = ");
                sb2.append(updateSenceTime);
                C45372t.m143409d("VEEditor", sb2.toString());
                return updateSenceTime;
            }
            this.f116172T = 0;
            this.f116228m.setTimeRange(i, i2, 0);
            int prepareEngine = this.f116228m.prepareEngine(0);
            if (prepareEngine == 0) {
                return 0;
            }
            StringBuilder sb3 = new StringBuilder("Prepare Engine failed, ret = ");
            sb3.append(prepareEngine);
            C45372t.m143409d("VEEditor", sb3.toString());
            return prepareEngine;
        }
    }

    /* renamed from: a */
    public final int mo107863a(int i, int i2, ROTATE_DEGREE rotate_degree) {
        StringBuilder sb = new StringBuilder("setFileRotate...");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        sb.append(" ");
        sb.append(rotate_degree);
        C45372t.m143403a("VEEditor", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rotate_degree.ordinal());
        return this.f116228m.setClipAttr(0, i, i2, "clip rotate", sb2.toString());
    }

    /* renamed from: a */
    public final int mo107868a(int i, int i2, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("insertClip, trackType:");
            sb.append(i);
            sb.append("clipIndex:");
            sb.append(i2);
            C45372t.m143407c(str, sb.toString());
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                StringBuilder sb2 = new StringBuilder("index: ");
                sb2.append(i3);
                sb2.append("clipSourceParams: ");
                sb2.append(((VEClipSourceParam) arrayList.get(i3)).toString());
                C45372t.m143407c("VEEditor", sb2.toString());
            }
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                StringBuilder sb3 = new StringBuilder("index: ");
                sb3.append(i4);
                sb3.append("clipTimelineParams: ");
                sb3.append(((VEClipTimelineParam) arrayList2.get(i4)).toString());
                C45372t.m143407c("VEEditor", sb3.toString());
            }
            this.f116228m.stop();
            int i5 = i2;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                int insertClip = this.f116228m.insertClip(i, i5, (VEClipSourceParam) arrayList.get(i6), (VEClipTimelineParam) arrayList2.get(i6));
                if (insertClip < 0) {
                    StringBuilder sb4 = new StringBuilder("insertClip failed, ret = ");
                    sb4.append(insertClip);
                    C45372t.m143409d("VEEditor", sb4.toString());
                    return insertClip;
                }
                i5++;
            }
            this.f116172T = 0;
            this.f116228m.setTimeRange(0, this.f116228m.getDuration(), 1);
            int w = m142494w(0);
            if (w == 0) {
                return 0;
            }
            StringBuilder sb5 = new StringBuilder("Prepare Engine failed, ret = ");
            sb5.append(w);
            C45372t.m143409d("VEEditor", sb5.toString());
            return w;
        }
    }

    /* renamed from: a */
    public final int mo107858a(int i, int i2, int i3) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("moveClip, trackType:");
            sb.append(i);
            sb.append(" from:");
            sb.append(i2);
            sb.append(" to:");
            sb.append(i3);
            C45372t.m143407c(str, sb.toString());
            this.f116228m.stop();
            int moveClip = this.f116228m.moveClip(i, i2, i3);
            if (moveClip < 0) {
                StringBuilder sb2 = new StringBuilder("moveClip failed, ret = ");
                sb2.append(moveClip);
                C45372t.m143409d("VEEditor", sb2.toString());
                return moveClip;
            }
            this.f116172T = 0;
            int w = m142494w(0);
            if (w == 0) {
                return 0;
            }
            StringBuilder sb3 = new StringBuilder("Prepare Engine failed, ret = ");
            sb3.append(w);
            C45372t.m143409d("VEEditor", sb3.toString());
            return w;
        }
    }

    /* renamed from: a */
    public final int mo107865a(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("addTrackFilter trackType:");
            sb.append(i);
            sb.append(",trackIndex:");
            sb.append(i2);
            sb.append(",filterType:");
            sb.append(vEBaseFilterParam.filterType);
            C45372t.m143403a(str, sb.toString());
            if (i == 1) {
                i2 = this.f116160E.mo55063c(1, i2);
            } else if (i == 0) {
                i2 = this.f116160E.mo55063c(2, i2);
            }
            if (i == 0 && vEBaseFilterParam.filterType == 7 && i2 == 0) {
                int i5 = this.f116196ae;
                return i5;
            } else if (i == 0 && vEBaseFilterParam.filterType == 15 && i2 == 0) {
                int i6 = this.f116198ag;
                return i6;
            } else {
                int i7 = this.f116228m.addFilters(new int[]{i2}, new String[]{vEBaseFilterParam.filterName}, new int[]{i3}, new int[]{i4}, new int[]{i}, new int[]{vEBaseFilterParam.filterType}, new int[]{vEBaseFilterParam.filterDurationType})[0];
                return i7;
            }
        }
    }

    /* renamed from: a */
    public final int mo107873a(int i, VEBaseFilterParam vEBaseFilterParam) {
        StringBuilder sb = new StringBuilder("updateTrackFilterParam, filterIndex: ");
        sb.append(i);
        C45372t.m143405b("VEEditor", sb.toString());
        return this.f116228m.updateFilterParam(-1, i, vEBaseFilterParam) < 0 ? -1 : 0;
    }

    /* renamed from: a */
    public final int mo107900a(int[] iArr) {
        int removeFilter;
        synchronized (this) {
            removeFilter = this.f116228m.removeFilter(iArr);
        }
        return removeFilter;
    }

    /* renamed from: a */
    public static VEEditor m142478a(C45345b bVar, C45255af afVar, int i, int i2, C45216l lVar) {
        VEVideoEncodeSettings vEVideoEncodeSettings;
        if (afVar.f116436a == null || afVar.f116436a.length <= 1) {
            vEVideoEncodeSettings = new C45244a(2).mo108149a(-1, -1).mo108148a(30).mo108166b(false).mo108167c(13).mo108173g(1).mo108157a((VEWatermarkParam) null).mo108155a(ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo108154a(ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo108161a(false, false).mo108162a();
        } else {
            vEVideoEncodeSettings = new C45244a(2).mo108149a(-1, -1).mo108172f(1).mo108148a(30).mo108166b(false).mo108167c(13).mo108173g(1).mo108157a((VEWatermarkParam) null).mo108155a(ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo108154a(ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo108161a(false, false).mo108162a();
        }
        return m142479a(bVar, afVar, vEVideoEncodeSettings, i, i2, lVar);
    }

    /* renamed from: a */
    private static VEEditor m142479a(C45345b bVar, C45255af afVar, VEVideoEncodeSettings vEVideoEncodeSettings, int i, int i2, C45216l lVar) {
        boolean z;
        C45216l lVar2;
        VEVideoEncodeSettings vEVideoEncodeSettings2;
        C45345b bVar2 = bVar;
        C45255af afVar2 = afVar;
        int i3 = i;
        int i4 = i2;
        StringBuilder sb = new StringBuilder("genReverseVideo2 with param:startTime:");
        sb.append(i3);
        sb.append("endTime:");
        sb.append(i4);
        C45372t.m143407c("VEEditor", sb.toString());
        float[] fArr = new float[afVar2.f116444i.length];
        for (int i5 = 0; i5 < afVar2.f116444i.length; i5++) {
            fArr[i5] = (float) afVar2.f116444i[i5];
        }
        VEEditor vEEditor = new VEEditor(bVar2.f116796a);
        String[] strArr = afVar2.f116436a;
        int[] iArr = afVar2.f116440e;
        int[] iArr2 = afVar2.f116441f;
        String[] strArr2 = afVar2.f116438c;
        int[] iArr3 = afVar2.f116442g;
        int[] iArr4 = afVar2.f116443h;
        ROTATE_DEGREE[] rotate_degreeArr = afVar2.f116446k;
        VEEditor vEEditor2 = vEEditor;
        vEEditor.mo107904a(strArr, iArr, iArr2, null, strArr2, iArr3, iArr4, fArr, fArr, rotate_degreeArr, VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL);
        vEEditor2.m142485b(i3, i4, SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
        if (!C45251ab.m142756b() || (afVar2.f116438c != null && afVar2.f116438c.length > 0)) {
            vEVideoEncodeSettings2 = vEVideoEncodeSettings;
            lVar2 = lVar;
            z = true;
        } else {
            vEVideoEncodeSettings2 = vEVideoEncodeSettings;
            lVar2 = lVar;
            z = false;
        }
        return m142476a(vEEditor2, bVar2, vEVideoEncodeSettings2, z, lVar2);
    }

    /* renamed from: a */
    public static VEEditor m142477a(C45345b bVar, VERecordData vERecordData, C45216l lVar) {
        VEVideoEncodeSettings a = new C45244a(2).mo108149a(-1, -1).mo108148a(30).mo108166b(false).mo108167c(13).mo108173g(1).mo108157a((VEWatermarkParam) null).mo108155a(ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo108154a(ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo108161a(false, false).mo108162a();
        VEEditor vEEditor = new VEEditor(bVar.f116796a);
        vEEditor.mo107883a(vERecordData, false);
        return m142476a(vEEditor, bVar, a, true, lVar);
    }

    /* renamed from: a */
    private static VEEditor m142476a(VEEditor vEEditor, C45345b bVar, VEVideoEncodeSettings vEVideoEncodeSettings, boolean z, C45216l lVar) {
        VEVideoEncodeSettings vEVideoEncodeSettings2;
        VEEditor vEEditor2 = vEEditor;
        C45345b bVar2 = bVar;
        final C45216l lVar2 = lVar;
        final long currentTimeMillis = System.currentTimeMillis();
        m142462A();
        final TEReverseCallback tEReverseCallback = new TEReverseCallback();
        tEReverseCallback.setListener(lVar2);
        bVar2.f116802g = false;
        if (vEVideoEncodeSettings == null) {
            C45372t.m143407c("VEEditor", "using default video setting for genReverseVideo2");
            vEVideoEncodeSettings2 = new C45244a(2).mo108149a(-1, -1).mo108172f(1).mo108148a(30).mo108166b(false).mo108167c(13).mo108173g(1).mo108157a((VEWatermarkParam) null).mo108155a(ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo108154a(ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo108162a();
        } else {
            vEVideoEncodeSettings2 = vEVideoEncodeSettings;
        }
        String a = bVar2.mo108562a(0);
        final String a2 = bVar2.mo108562a(1);
        String b = bVar2.mo108563b(0);
        final boolean z2 = z;
        final String str = a;
        final String str2 = b;
        final C45345b bVar3 = bVar;
        VEVideoEncodeSettings vEVideoEncodeSettings3 = vEVideoEncodeSettings2;
        C4518612 r13 = r0;
        final C45216l lVar3 = lVar;
        C4518612 r0 = new C45329l(vEEditor) {

            /* renamed from: a */
            final /* synthetic */ VEEditor f116245a;

            public final void onCallback(int i, int i2, float f, String str) {
                if (i != 4103) {
                    if (i == 4105) {
                        TEReverseCallback tEReverseCallback = tEReverseCallback;
                        double d = (double) f;
                        Double.isNaN(d);
                        tEReverseCallback.onProgressChanged(d * 0.5d);
                    }
                } else if (this.f116245a.mo107848B()) {
                    if (z2) {
                        TEVideoUtils.reverseAllIVideo(str, a2, tEReverseCallback);
                    } else {
                        TEVideoUtils.reverseAllIVideoAndMuxAudio(str, str2, a2, tEReverseCallback);
                    }
                    new Thread(new Runnable() {
                        public final void run() {
                            C4518612.this.f116245a.mo107976n();
                            String[] strArr = {str};
                            bVar3.f116797b = strArr;
                            if (z2) {
                                String[] strArr2 = {str2};
                                bVar3.f116801f = strArr2;
                            }
                            String[] strArr3 = {a2};
                            bVar3.f116800e = strArr3;
                            bVar3.f116802g = true;
                            if (lVar3 != null) {
                                lVar3.mo99223a(0);
                            }
                            if (C45251ab.m142756b()) {
                                C20479f.m67948a(1, "te_edit_reverse_time", System.currentTimeMillis() - currentTimeMillis);
                            }
                        }
                    }).start();
                }
            }

            {
                this.f116245a = r1;
            }
        };
        vEEditor2.mo107934b((C45329l) r13);
        vEEditor2.mo107914a((C45329l) new C45329l(vEEditor2) {

            /* renamed from: a */
            final /* synthetic */ VEEditor f116255a;

            {
                this.f116255a = r1;
            }

            public final void onCallback(int i, int i2, float f, String str) {
                new Thread(new Runnable() {
                    public final void run() {
                        C4518813.this.f116255a.mo107976n();
                        if (lVar2 != null) {
                            lVar2.mo99223a(-1);
                        }
                    }
                }).start();
            }
        });
        vEEditor2.mo107916a(a, b, vEVideoEncodeSettings3);
        return vEEditor2;
    }

    /* renamed from: a */
    public final int mo107902a(String[] strArr) {
        C45372t.m143407c("VEEditor", "setReverseVideoPaths");
        if (strArr == null || strArr.length <= 0) {
            C45372t.m143409d("VEEditor", "setReverseVideoPaths error, reverseVideoPaths is null");
            return -100;
        }
        if (this.f116179a != null) {
            this.f116179a.f116800e = strArr;
            this.f116179a.f116802g = true;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo107935b(String[] strArr) {
        C45372t.m143407c("VEEditor", "setVideoPaths");
        this.f116179a.f116797b = strArr;
    }

    /* renamed from: a */
    public final int mo107905a(String[] strArr, String[] strArr2) {
        C45372t.m143407c("VEEditor", "setReverseMediaPaths");
        if (strArr == null || strArr.length <= 0) {
            C45372t.m143409d("VEEditor", "setReverseMediaPaths error, reverseVideoPaths = null");
            return -100;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            C45372t.m143407c("VEEditor", "setReverseMediaPaths with reverseAudioPaths is null");
        }
        if (this.f116179a != null) {
            this.f116179a.f116801f = strArr2;
            this.f116179a.f116800e = strArr;
            this.f116179a.f116802g = true;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo107880a(SCALE_MODE scale_mode) {
        StringBuilder sb = new StringBuilder("setScaleMode... mode:");
        sb.append(scale_mode);
        C45372t.m143407c("VEEditor", sb.toString());
        switch (scale_mode) {
            case SCALE_MODE_CENTER_CROP:
                this.f116228m.setResizer(2, 0.0f, 0.0f);
                break;
            case SCALE_MODE_CENTER_INSIDE:
                this.f116228m.setResizer(1, 0.0f, 0.0f);
                break;
            case SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE:
                this.f116228m.setResizer(3, 0.0f, 0.0f);
                break;
            case SCALE_MODE_CANVAS:
                this.f116228m.setResizer(4, 0.0f, 0.0f);
                break;
            case SCALE_MODE_FIT_START_WITH_2DENGINE:
                this.f116228m.setResizer(5, 0.0f, 0.0f);
                break;
            case SCALE_MODE_FIT_END_WITH_2DENGINE:
                this.f116228m.setResizer(6, 0.0f, 0.0f);
                break;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo107871a(int i, SEEK_MODE seek_mode) {
        int seek;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("seek... ");
            sb.append(i);
            sb.append(" flags ");
            sb.append(seek_mode);
            C45372t.m143407c(str, sb.toString());
            if ((seek_mode.getValue() & SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                this.f116218c = null;
                this.f116237v = System.currentTimeMillis();
                if (this.f116235t == 0) {
                    this.f116235t = this.f116237v;
                }
            }
            seek = this.f116228m.seek(i, this.f116226k, this.f116227l, seek_mode.getValue());
        }
        return seek;
    }

    /* renamed from: a */
    public final int mo107872a(int i, SEEK_MODE seek_mode, C45217m mVar) {
        int seek;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("seek with cb... ");
            sb.append(i);
            sb.append(" flags ");
            sb.append(seek_mode);
            C45372t.m143407c(str, sb.toString());
            if ((seek_mode.getValue() & SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                this.f116218c = mVar;
                this.f116237v = System.currentTimeMillis();
                if (this.f116235t == 0) {
                    this.f116235t = this.f116237v;
                }
            }
            seek = this.f116228m.seek(i, this.f116226k, this.f116227l, seek_mode.getValue());
            if (seek != 0) {
                StringBuilder sb2 = new StringBuilder("seek failed, result = ");
                sb2.append(seek);
                C45372t.m143409d("VEEditor", sb2.toString());
                this.f116218c = null;
            }
        }
        return seek;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007e, code lost:
        return -100;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo107891a(java.lang.String r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "addAudioTrack... "
            r1.<init>(r2)     // Catch:{ all -> 0x007f }
            r1.append(r11)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = " In "
            r1.append(r2)     // Catch:{ all -> 0x007f }
            r1.append(r12)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = " Out "
            r1.append(r2)     // Catch:{ all -> 0x007f }
            r1.append(r13)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ all -> 0x007f }
            r1.append(r14)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007f }
            com.p280ss.android.vesdk.C45372t.m143407c(r0, r1)     // Catch:{ all -> 0x007f }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x007f }
            r1 = -100
            if (r0 == 0) goto L_0x0036
            monitor-exit(r10)     // Catch:{ all -> 0x007f }
            return r1
        L_0x0036:
            if (r13 <= r12) goto L_0x007d
            if (r12 >= 0) goto L_0x003b
            goto L_0x007d
        L_0x003b:
            java.lang.String r0 = "iesve_veeditor_import_music"
            r1 = 0
            r2 = 1
            com.p280ss.android.ttve.monitor.C20477e.m67936a(r0, r2, r1)     // Catch:{ all -> 0x007f }
            com.ss.android.ttve.nativePort.TEInterface r3 = r10.f116228m     // Catch:{ all -> 0x007f }
            r5 = 0
            int r6 = r13 - r12
            r4 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            int r11 = r3.addAudioTrack(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007f }
            java.lang.String r12 = "VEEditor"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            java.lang.String r14 = "trackIndexNative="
            r13.<init>(r14)     // Catch:{ all -> 0x007f }
            r13.append(r11)     // Catch:{ all -> 0x007f }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x007f }
            com.p280ss.android.vesdk.C45372t.m143409d(r12, r13)     // Catch:{ all -> 0x007f }
            com.ss.android.ttve.common.k r12 = r10.f116160E     // Catch:{ all -> 0x007f }
            int r11 = r12.mo55060a(r2, r11)     // Catch:{ all -> 0x007f }
            java.lang.String r12 = "VEEditor"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            java.lang.String r14 = "addAudioTrack... "
            r13.<init>(r14)     // Catch:{ all -> 0x007f }
            r13.append(r11)     // Catch:{ all -> 0x007f }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x007f }
            com.p280ss.android.vesdk.C45372t.m143407c(r12, r13)     // Catch:{ all -> 0x007f }
            monitor-exit(r10)     // Catch:{ all -> 0x007f }
            return r11
        L_0x007d:
            monitor-exit(r10)     // Catch:{ all -> 0x007f }
            return r1
        L_0x007f:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007f }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.mo107891a(java.lang.String, int, int, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        return -100;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo107862a(int r10, int r11, int r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "updateAudioTrack...  Index "
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            r1.append(r10)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = " In "
            r1.append(r2)     // Catch:{ all -> 0x004e }
            r1.append(r11)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = " Out "
            r1.append(r2)     // Catch:{ all -> 0x004e }
            r1.append(r12)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ all -> 0x004e }
            r1.append(r13)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004e }
            com.p280ss.android.vesdk.C45372t.m143407c(r0, r1)     // Catch:{ all -> 0x004e }
            r0 = -100
            if (r10 >= 0) goto L_0x0032
            monitor-exit(r9)     // Catch:{ all -> 0x004e }
            return r0
        L_0x0032:
            if (r12 <= r11) goto L_0x004c
            if (r11 >= 0) goto L_0x0037
            goto L_0x004c
        L_0x0037:
            com.ss.android.ttve.common.k r0 = r9.f116160E     // Catch:{ all -> 0x004e }
            r1 = 1
            int r3 = r0.mo55063c(r1, r10)     // Catch:{ all -> 0x004e }
            com.ss.android.ttve.nativePort.TEInterface r2 = r9.f116228m     // Catch:{ all -> 0x004e }
            r4 = 0
            int r5 = r12 - r11
            r6 = r11
            r7 = r12
            r8 = r13
            int r10 = r2.updateAudioTrack(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004e }
            monitor-exit(r9)     // Catch:{ all -> 0x004e }
            return r10
        L_0x004c:
            monitor-exit(r9)     // Catch:{ all -> 0x004e }
            return r0
        L_0x004e:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.mo107862a(int, int, int, boolean):int");
    }

    /* renamed from: a */
    public final int mo107861a(int i, int i2, int i3, int i4, int i5, boolean z) {
        return m142468a(i, i2, i3, i4, i5, z, false);
    }

    /* renamed from: a */
    public final boolean mo107915a(int i, int i2, float f) {
        boolean trackVolume;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setVolume... index:");
            sb.append(i);
            sb.append(" type:");
            sb.append(i2);
            sb.append(" volume:");
            sb.append(f);
            C45372t.m143407c(str, sb.toString());
            trackVolume = this.f116228m.setTrackVolume(i2, this.f116160E.mo55063c(1, i), f);
        }
        return trackVolume;
    }

    /* renamed from: a */
    public final int mo107896a(String str, String[] strArr) {
        int addInfoSticker;
        C45372t.m143403a("VEEditor", "addInfoSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C20477e.m67936a("iesve_veeditor_import_sticker", 1, (C45306a) null);
        synchronized (this) {
            addInfoSticker = this.f116228m.addInfoSticker(str, strArr);
        }
        C20481a aVar = new C20481a();
        aVar.f55350a = str;
        this.f116205an.mo55144a(1, addInfoSticker, aVar);
        StringBuilder sb = new StringBuilder("addInfoSticker success with index ");
        sb.append(addInfoSticker);
        C45372t.m143403a("VEEditor", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            jSONObject.put("params", strArr != 0 ? strArr : "");
            C20469a.m67906a("vesdk_event_editor_info_sticker", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return addInfoSticker;
    }

    /* renamed from: a */
    public final int mo107882a(VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        C45372t.m143407c("VEEditor", "setInfoStickerBufferCallback...");
        return this.f116228m.setInfoStickerBufferCallback(vEInfoStickerBufferListener);
    }

    /* renamed from: a */
    public final int mo107888a(String str, float f, float f2, float f3, float f4) {
        C45372t.m143403a("VEEditor", "addImageSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C20477e.m67936a("iesve_veeditor_import_sticker", 1, (C45306a) null);
        return this.f116228m.addInfoSticker(str, new String[]{String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), "0"});
    }

    /* renamed from: b */
    public final int mo107929b(String str, float f, float f2, float f3, float f4) {
        C45372t.m143403a("VEEditor", "addImageStickerWithRatio...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C20477e.m67936a("iesve_veeditor_import_sticker", 1, (C45306a) null);
        return this.f116228m.addInfoSticker(str, new String[]{String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), "1"});
    }

    /* renamed from: a */
    public final int mo107857a(int i, float f, float f2) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerPosition... index: ");
            sb.append(i);
            sb.append("offsetX: ");
            sb.append(f);
            sb.append("offsetY: ");
            sb.append(f2);
            C45372t.m143403a(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f116228m.setFilterParam(i, "entity position x", String.valueOf(f)) + this.f116228m.setFilterParam(i, "entity position y", String.valueOf(f2));
            return filterParam;
        }
    }

    /* renamed from: a */
    public final int mo107866a(int i, int i2, String str) {
        synchronized (this) {
            C45372t.m143405b("VEEditor", "setSrtInfo");
            if (i < 0) {
                return -100;
            }
            return this.f116228m.setFilterParam(i, "entity audio start time", String.valueOf(i2)) + this.f116228m.setFilterParam(i, "entity srt info", str) + this.f116228m.setFilterParam(i, "entity srt", "true");
        }
    }

    /* renamed from: a */
    public final int mo107874a(int i, String str) {
        synchronized (this) {
            C45372t.m143405b("VEEditor", "setSrtFont");
            if (i < 0) {
                return -100;
            }
            return this.f116228m.setFilterParam(i, "entity srt font", str);
        }
    }

    /* renamed from: b */
    public final int mo107924b(int i, int i2, int i3, int i4, int i5, boolean z) {
        synchronized (this) {
            C45372t.m143405b("VEEditor", "setSrtAudioInfo");
            if (i < 0) {
                return -100;
            }
            return this.f116228m.setFilterParam(i, "entity srt audio index", String.valueOf(i2)) + this.f116228m.setFilterParam(i, "entity srt audio seqIn", String.valueOf(i3)) + this.f116228m.setFilterParam(i, "entity srt audio trimIn", String.valueOf(i4)) + this.f116228m.setFilterParam(i, "entity srt audio trimOut", String.valueOf(i5)) + this.f116228m.setFilterParam(i, "entity srt audio cycle", String.valueOf(z));
        }
    }

    /* renamed from: a */
    public final int mo107877a(int i, boolean z) {
        synchronized (this) {
            C45372t.m143405b("VEEditor", "setSrtManipulateState");
            if (i < 0) {
                return -100;
            }
            return this.f116228m.setFilterParam(i, "entity srt manipulate state", String.valueOf(z));
        }
    }

    /* renamed from: a */
    public final int mo107856a(int i, float f) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerRotation... index: ");
            sb.append(i);
            sb.append("degree: ");
            sb.append(f);
            C45372t.m143405b(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f116228m.setFilterParam(i, "entity rotation", String.valueOf(f));
            return filterParam;
        }
    }

    /* renamed from: a */
    public final int mo107878a(int i, float[] fArr) {
        synchronized (this) {
            C45372t.m143403a("VEEditor", "getInfoStickerPosition...");
            if (i >= 0) {
                if (fArr.length == 2) {
                    int infoStickerPosition = this.f116228m.getInfoStickerPosition(i, fArr);
                    return infoStickerPosition;
                }
            }
            return -100;
        }
    }

    /* renamed from: b */
    public final int mo107926b(int i, float[] fArr) {
        synchronized (this) {
            C45372t.m143403a("VEEditor", "getSrtInfoStickerInitPosition...");
            if (i >= 0) {
                if (fArr.length == 2) {
                    int srtInfoStickerInitPosition = this.f116228m.getSrtInfoStickerInitPosition(i, fArr);
                    return srtInfoStickerInitPosition;
                }
            }
            return -100;
        }
    }

    /* renamed from: a */
    public final int mo107879a(int i, ByteBuffer[] byteBufferArr) {
        StringBuilder sb = new StringBuilder("infoStickerPin getInfoStickerPinData... index:");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int infoStickerPinData = this.f116228m.getInfoStickerPinData(i, byteBufferArr);
                if (infoStickerPinData >= 0) {
                    return infoStickerPinData;
                }
                C45372t.m143409d("VEEditor", "infoStickerPin getInfoStickerPinData... faild ");
                return infoStickerPinData;
            }
        }
    }

    /* renamed from: a */
    public final int mo107876a(int i, ByteBuffer byteBuffer) {
        StringBuilder sb = new StringBuilder("infoStickerPin setInfoStickerPinWithFile... index:");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int restoreInfoStickerPinWithJson = this.f116228m.restoreInfoStickerPinWithJson(i, byteBuffer);
                if (restoreInfoStickerPinWithJson >= 0) {
                    return restoreInfoStickerPinWithJson;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin setInfoStickerPinWithFile... faild ret:");
                sb2.append(restoreInfoStickerPinWithJson);
                C45372t.m143409d("VEEditor", sb2.toString());
                return restoreInfoStickerPinWithJson;
            }
        }
    }

    /* renamed from: a */
    public final int mo107886a(String str, double d, double d2, double d3, double d4) {
        this.f116187aH = str;
        this.f116188aI = d;
        this.f116189aJ = d2;
        this.f116190aK = d3;
        this.f116191aL = d4;
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:30|(2:32|(1:34))|35|36|37|38|39|40) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00f1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo107928b(java.lang.String r7, float r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f116196ae     // Catch:{ all -> 0x00f3 }
            if (r0 >= 0) goto L_0x0009
            r7 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            return r7
        L_0x0009:
            if (r7 != 0) goto L_0x000f
            r7 = -100
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            return r7
        L_0x000f:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0017
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0017:
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x001e
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x001e:
            com.ss.android.ttve.model.d r1 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            if (r1 != 0) goto L_0x0029
            com.ss.android.ttve.model.d r1 = new com.ss.android.ttve.model.d     // Catch:{ all -> 0x00f3 }
            r1.<init>()     // Catch:{ all -> 0x00f3 }
            r6.f116201aj = r1     // Catch:{ all -> 0x00f3 }
        L_0x0029:
            com.ss.android.ttve.model.d r1 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = r1.f55283a     // Catch:{ all -> 0x00f3 }
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x00f3 }
            r2 = 0
            if (r1 == 0) goto L_0x0050
            com.ss.android.ttve.model.d r1 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = r1.f55284b     // Catch:{ all -> 0x00f3 }
            int r1 = r1.length()     // Catch:{ all -> 0x00f3 }
            if (r1 != 0) goto L_0x0050
            com.ss.android.ttve.model.d r1 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            float r1 = r1.f55286d     // Catch:{ all -> 0x00f3 }
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0050
            com.ss.android.ttve.model.d r1 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            float r1 = r1.f55285c     // Catch:{ all -> 0x00f3 }
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0050
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            return r2
        L_0x0050:
            com.ss.android.ttve.model.d r1 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            r1.f55283a = r7     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.model.d r1 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = ""
            r1.f55284b = r3     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.model.d r1 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            r1.f55285c = r0     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.model.d r0 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            r0.f55286d = r8     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.model.d r0 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            r0.f55287e = r8     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.model.d r0 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            r0.f55288f = r2     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.model.d r0 = r6.f116201aj     // Catch:{ all -> 0x00f3 }
            r1 = 1
            r0.f55289g = r1     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f116228m     // Catch:{ all -> 0x00f3 }
            int r3 = r6.f116196ae     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "left filter"
            r0.setFilterParam(r3, r4, r7)     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f116228m     // Catch:{ all -> 0x00f3 }
            int r3 = r6.f116196ae     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "left filter intensity"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r5.<init>()     // Catch:{ all -> 0x00f3 }
            r5.append(r8)     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f3 }
            r0.setFilterParam(r3, r4, r5)     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f116228m     // Catch:{ all -> 0x00f3 }
            int r3 = r6.f116196ae     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "right filter"
            java.lang.String r5 = ""
            r0.setFilterParam(r3, r4, r5)     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f116228m     // Catch:{ all -> 0x00f3 }
            int r3 = r6.f116196ae     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "filter position"
            java.lang.String r5 = "1.0"
            r0.setFilterParam(r3, r4, r5)     // Catch:{ all -> 0x00f3 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r6.f116228m     // Catch:{ all -> 0x00f3 }
            int r3 = r6.f116196ae     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "filter use v3"
            java.lang.String r5 = "true"
            r0.setFilterParam(r3, r4, r5)     // Catch:{ all -> 0x00f3 }
            com.ss.android.vesdk.d.a r0 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x00f3 }
            r0.<init>()     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = ""
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00f3 }
            if (r4 != 0) goto L_0x00c8
            java.lang.String r4 = java.io.File.separator     // Catch:{ all -> 0x00f3 }
            java.lang.String[] r4 = r7.split(r4)     // Catch:{ all -> 0x00f3 }
            int r5 = r4.length     // Catch:{ all -> 0x00f3 }
            if (r5 <= 0) goto L_0x00c8
            int r3 = r4.length     // Catch:{ all -> 0x00f3 }
            int r3 = r3 - r1
            r3 = r4[r3]     // Catch:{ all -> 0x00f3 }
        L_0x00c8:
            java.lang.String r4 = "iesve_veeditor_set_filter_click_filter_id"
            r0.mo108381a(r4, r3)     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = "iesve_veeditor_set_filter_click"
            com.p280ss.android.ttve.monitor.C20477e.m67936a(r3, r1, r0)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "te_composition_filter_id"
            com.p280ss.android.ttve.monitor.C20479f.m67949a(r1, r0, r7)     // Catch:{ all -> 0x00f3 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f1 }
            r0.<init>()     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r1 = "filterPath"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r7 = "intensity"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ JSONException -> 0x00f1 }
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r7 = "vesdk_event_editor_color_filter_new"
            java.lang.String r8 = "behavior"
            com.p280ss.android.ttve.monitor.C20469a.m67906a(r7, r0, r8)     // Catch:{ JSONException -> 0x00f1 }
        L_0x00f1:
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            return r2
        L_0x00f3:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.mo107928b(java.lang.String, float):int");
    }

    /* renamed from: a */
    public final int mo107893a(String str, String str2, float f) {
        return m142473a(str, str2, f, 0.0f, true);
    }

    /* renamed from: a */
    public final int mo107894a(String str, String str2, float f, float f2, float f3) {
        if (this.f116196ae < 0) {
            return -105;
        }
        if (f < 0.0f || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        m142462A();
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = -1.0f;
        }
        if (f3 < 0.0f) {
            f3 = -1.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (this.f116201aj == null) {
            this.f116201aj = new C20464d();
        }
        if (str.equals(this.f116201aj.f55283a) && str2.equals(this.f116201aj.f55284b) && this.f116201aj.f55286d == f2 && this.f116201aj.f55287e == f3 && this.f116201aj.f55285c == f) {
            return 0;
        }
        this.f116201aj.f55283a = str;
        this.f116201aj.f55284b = str2;
        this.f116201aj.f55285c = f;
        this.f116201aj.f55286d = f2;
        this.f116201aj.f55287e = f3;
        this.f116201aj.f55288f = false;
        this.f116201aj.f55289g = true;
        StringBuilder sb = new StringBuilder("leftFilterPath: ");
        sb.append(str);
        sb.append("\nrightFilterPath: ");
        sb.append(str2);
        sb.append(" position: ");
        sb.append(f);
        sb.append("leftIntensity: ");
        sb.append(f2);
        sb.append("rightIntensity: ");
        sb.append(f3);
        C45372t.m143405b("VEEditor", sb.toString());
        this.f116228m.setFilterParam(this.f116196ae, "left filter", str);
        this.f116228m.setFilterParam(this.f116196ae, "right filter", str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f2);
        this.f116228m.setFilterParam(this.f116196ae, "left filter intensity", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f3);
        this.f116228m.setFilterParam(this.f116196ae, "right filter intensity", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f);
        this.f116228m.setFilterParam(this.f116196ae, "filter position", sb4.toString());
        this.f116228m.setFilterParam(this.f116196ae, "filter use v3", "true");
        C45306a aVar = new C45306a();
        String str3 = "";
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] split2 = str2.split(File.separator);
            if (split2.length > 0) {
                str4 = split2[split2.length - 1];
            }
        }
        aVar.mo108381a("iesve_veeditor_set_filter_slide_left_id", str3);
        aVar.mo108381a("iesve_veeditor_set_filter_slide_right_id", str4);
        C20477e.m67936a("iesve_veeditor_set_filter_slide", 1, aVar);
        return 0;
    }

    /* renamed from: a */
    public final float mo107854a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f116228m.getColorFilterIntensity(str);
    }

    /* renamed from: a */
    public final int mo107875a(int i, String str, int i2, int i3, String str2) {
        int i4 = i;
        String str3 = str;
        String str4 = str2;
        StringBuilder sb = new StringBuilder("enableFilterEffectWithTag... ");
        sb.append(i4);
        sb.append(" ");
        C45372t.m143407c("VEEditor", sb.toString());
        if (i4 < 0 || i4 > this.f116228m.getDuration() || TextUtils.isEmpty(str)) {
            return -100;
        }
        m142462A();
        int duration = this.f116228m.getDuration();
        String str5 = str4 == null ? "" : str4;
        int[] addFilters = this.f116228m.addFilters(new int[]{0}, new String[]{"video effect"}, new int[]{i4}, new int[]{duration}, new int[]{0}, new int[]{8});
        this.f116228m.setFilterParam(addFilters[0], "effect res path", str3);
        this.f116228m.setFilterParam(addFilters[0], "effect sticker tag", str5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i2);
        this.f116228m.setFilterParam(addFilters[0], "effect sticker id", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i3);
        this.f116228m.setFilterParam(addFilters[0], "effect req id", sb3.toString());
        C45306a aVar = new C45306a();
        String str6 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str3.split(File.separator);
            if (split.length > 0) {
                str6 = split[split.length - 1];
            }
        }
        aVar.mo108381a("iesve_veeditor_filter_effect_id", str6);
        C20477e.m67936a("iesve_veeditor_filter_effect", 1, aVar);
        C20481a aVar2 = new C20481a();
        aVar2.f55350a = str3;
        aVar2.f55351b = i4;
        this.f116205an.mo55144a(0, addFilters[0], aVar2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("seqIn", i4);
            jSONObject.put("stickerId", str6);
            jSONObject.put("effectTag", str4);
            jSONObject.put("filterIndex", addFilters[0]);
            C20469a.m67906a("vesdk_event_editor_filter_effect", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return addFilters[0];
    }

    /* renamed from: b */
    public final int mo107925b(int i, String str) {
        return m142470a(i, str, false, 0, 0);
    }

    /* renamed from: a */
    public final int[] mo107919a(int[] iArr, int[] iArr2, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (iArr[i] < 0 || iArr[i] > this.f116228m.getDuration() || TextUtils.isEmpty(strArr[i])) {
                return new int[]{-100};
            }
        }
        boolean[] zArr = new boolean[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = false;
            iArr3[i2] = 0;
            iArr4[i2] = 0;
        }
        return m142484a(iArr, iArr2, strArr, zArr, iArr3, iArr4);
    }

    /* renamed from: a */
    private int[] m142484a(int[] iArr, int[] iArr2, String[] strArr, boolean[] zArr, int[] iArr3, int[] iArr4) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = "";
        }
        return mo107920a(iArr, iArr2, strArr, iArr3, iArr4, strArr2);
    }

    /* renamed from: a */
    public final int[] mo107920a(int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2) {
        if (iArr != null && iArr.length > 0 && iArr2 != null && iArr2.length > 0 && strArr2 != null && strArr2.length > 0 && strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder("addFilterEffectsWithTag: in ");
            sb.append(iArr[0]);
            sb.append(", out ");
            sb.append(iArr2[0]);
            sb.append(", tag ");
            sb.append(strArr2[0]);
            sb.append(", path ");
            sb.append(strArr[0]);
            C45372t.m143407c("VEEditor", sb.toString());
        }
        int i = 0;
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            if ("FreezeFrame".equals(strArr2[i2])) {
                i = Math.max(i, iArr2[i2]);
            }
        }
        m142495x(i);
        int length = iArr.length;
        int[] iArr5 = new int[length];
        int[] iArr6 = new int[length];
        int[] iArr7 = new int[length];
        String[] strArr3 = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr5[i3] = 0;
            iArr6[i3] = 0;
            strArr3[i3] = "filter effect";
            iArr7[i3] = 8;
        }
        int[] addFilters = this.f116228m.addFilters(iArr5, strArr3, iArr, iArr2, iArr6, iArr7);
        if (length != addFilters.length) {
            int[] iArr8 = new int[length];
            Arrays.fill(iArr8, -1);
            return iArr8;
        }
        if (strArr2 == null) {
            strArr2 = new String[length];
            for (int i4 = 0; i4 < length; i4++) {
                strArr2[i4] = "";
            }
        }
        int i5 = 0;
        while (i5 < length) {
            this.f116228m.setFilterParam(addFilters[i5], "effect res path", strArr[i5]);
            this.f116228m.setFilterParam(addFilters[i5], "effect sticker tag", strArr2[i5] == null ? "" : strArr2[i5]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iArr3[i5]);
            this.f116228m.setFilterParam(addFilters[i5], "effect sticker id", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(iArr4[i5]);
            this.f116228m.setFilterParam(addFilters[i5], "effect req id", sb3.toString());
            C20481a aVar = new C20481a();
            aVar.f55350a = strArr[i5];
            aVar.f55351b = iArr[i5];
            aVar.f55352c = iArr2[i5] - iArr[i5];
            this.f116205an.mo55144a(0, addFilters[i5], aVar);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", strArr[i5]);
                jSONObject.put("start", String.valueOf(aVar.f55351b));
                jSONObject.put("duration", String.valueOf(aVar.f55352c));
                jSONObject.put("effectTag", strArr2[i5] == null ? "" : strArr2[i5]);
                C20469a.m67906a("vesdk_event_editor_filter_effect_add", jSONObject, "behavior");
            } catch (JSONException unused) {
            }
            i5++;
        }
        return addFilters;
    }

    /* renamed from: b */
    public final int mo107930b(int[] iArr) {
        for (int a : iArr) {
            this.f116205an.mo55143a(0, a);
        }
        return this.f116228m.removeFilter(iArr);
    }

    /* renamed from: a */
    public final int mo107860a(int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("addRepeatEffect... ");
            sb.append(i6);
            sb.append(" ");
            sb.append(i7);
            sb.append(" ");
            sb.append(i8);
            sb.append(" ");
            sb.append(i9);
            sb.append(" ");
            sb.append(i10);
            C45372t.m143407c(str, sb.toString());
            m142462A();
            boolean z = this.f116228m.getCurState() != -20000;
            int stop = z ? this.f116228m.stop() : 0;
            if (stop == 0 || stop == -101) {
                int[] addFilters = this.f116228m.addFilters(new int[]{i6}, new String[]{"timeEffect repeating"}, new int[]{i8}, new int[]{this.f116228m.getDuration()}, new int[]{i7}, new int[]{6});
                this.f116171S = addFilters[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10);
                this.f116228m.setFilterParam(addFilters[0], "timeEffect repeating duration", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i9);
                this.f116228m.setFilterParam(addFilters[0], "timeEffect repeating times", sb3.toString());
                if (z) {
                    this.f116228m.createTimeline();
                    this.f116228m.prepareEngine(0);
                }
                C45306a aVar = new C45306a();
                aVar.mo108381a("iesve_veeditor_time_effect_id", "repeat");
                C20477e.m67936a("iesve_veeditor_time_effect", 1, aVar);
                this.f116205an.f55349c = 1;
                int i11 = addFilters[0];
                return i11;
            }
            StringBuilder sb4 = new StringBuilder("pauseSync failed in addRepeatEffect, ret ");
            sb4.append(stop);
            C45372t.m143409d("VEEditor", sb4.toString());
            return -1;
        }
    }

    /* renamed from: a */
    public final int mo107855a(float f) {
        StringBuilder sb = new StringBuilder("setSpeedRatioAndUpdate = ");
        sb.append(f);
        C45372t.m143407c("VEEditor", sb.toString());
        this.f116228m.stop();
        if (f > 3.0f) {
            f = 3.0f;
        }
        this.f116228m.setSpeedRatio(f);
        this.f116228m.createTimeline();
        return this.f116228m.prepareEngine(0);
    }

    /* renamed from: a */
    public final int mo107859a(int i, int i2, int i3, int i4, float f, float f2) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        float f3 = f;
        float f4 = f2;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("addSlowMotionEffect... ");
            sb.append(i5);
            sb.append(" ");
            sb.append(i6);
            sb.append(" ");
            sb.append(i7);
            sb.append(" ");
            sb.append(i8);
            sb.append(" ");
            sb.append(f3);
            sb.append(" ");
            sb.append(f4);
            C45372t.m143407c(str, sb.toString());
            m142462A();
            boolean z = this.f116228m.getCurState() != -20000;
            int stop = z ? this.f116228m.stop() : 0;
            if (stop == 0 || stop == -101) {
                int[] addFilters = this.f116228m.addFilters(new int[]{i5}, new String[]{"timeEffect slow motion"}, new int[]{i7}, new int[]{this.f116228m.getDuration()}, new int[]{i6}, new int[]{6});
                this.f116171S = addFilters[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i8);
                this.f116228m.setFilterParam(addFilters[0], "timeEffect slow motion duration", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f3);
                this.f116228m.setFilterParam(addFilters[0], "timeEffect slow motion speed", sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(f4);
                this.f116228m.setFilterParam(addFilters[0], "timeEffect fast motion speed", sb4.toString());
                if (z) {
                    this.f116228m.createTimeline();
                    this.f116228m.prepareEngine(0);
                }
                C45306a aVar = new C45306a();
                aVar.mo108381a("iesve_veeditor_time_effect_id", "slow");
                C20477e.m67936a("iesve_veeditor_time_effect", 1, aVar);
                this.f116205an.f55349c = 2;
                int i9 = addFilters[0];
                return i9;
            }
            StringBuilder sb5 = new StringBuilder("pauseSync failed in addSlowMotionEffect, ret ");
            sb5.append(stop);
            C45372t.m143409d("VEEditor", sb5.toString());
            return -1;
        }
    }

    /* renamed from: a */
    public final int[] mo107918a(int i, int i2, VECherEffectParam vECherEffectParam) {
        int length = vECherEffectParam.getMatrix().length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        String[] strArr = new String[length];
        int[] iArr4 = new int[length];
        int[] iArr5 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = i;
            iArr2[i3] = i2;
            strArr[i3] = "audio chereffect";
            iArr3[i3] = 1;
            int i4 = i3 * 2;
            iArr4[i3] = (int) vECherEffectParam.getDuration()[i4];
            iArr5[i3] = (int) vECherEffectParam.getDuration()[i4 + 1];
        }
        int[] addFilters = this.f116228m.addFilters(iArr, strArr, iArr4, iArr5, iArr2, iArr3);
        for (int i5 = 0; i5 < length; i5++) {
            this.f116228m.setFilterParam(addFilters[i5], "cher_matrix", vECherEffectParam.getMatrix()[i5]);
        }
        return addFilters;
    }

    /* renamed from: a */
    public final int mo107867a(int i, int i2, String str, byte[] bArr, int i3, int i4, C45205a aVar) {
        int i5 = i;
        String str2 = str;
        C45205a aVar2 = aVar;
        if (TextUtils.isEmpty(str)) {
            C45372t.m143409d("VEEditor", "addAudioCommonFilter failed path is null or path not exist");
            return -205;
        }
        m142462A();
        int c = this.f116160E.mo55063c(i5, i2);
        int[] addFilters = this.f116228m.addFilters(new int[]{c}, new String[]{"audio common filter"}, new int[]{i3}, new int[]{i4}, new int[]{i5}, new int[]{1});
        if (addFilters[0] < 0) {
            C45372t.m143409d("VEEditor", "Add filter failed!");
            return -1;
        }
        long[] jArr = new long[1];
        int preprocessAudioTrackForFilter = this.f116228m.preprocessAudioTrackForFilter(i, c, str, bArr, jArr);
        byte[] audioCommonFilterPreprocessResult = this.f116228m.getAudioCommonFilterPreprocessResult(jArr[0]);
        if (aVar2 != null) {
            aVar2.mo108037a(str2, preprocessAudioTrackForFilter, audioCommonFilterPreprocessResult);
        }
        if (preprocessAudioTrackForFilter != 0) {
            C45372t.m143409d("VEEditor", "Add filter preprocess failed!");
            return -1;
        }
        this.f116228m.setFilterParam(addFilters[0], "audio_common_filter_params", str2);
        this.f116228m.setFilterParam(addFilters[0], "audio_common_filter_preresult", audioCommonFilterPreprocessResult);
        return addFilters[0];
    }

    /* renamed from: a */
    public final int mo107892a(String str, String str2) {
        synchronized (this) {
            C45372t.m143407c("VEEditor", "addMetadata...");
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    this.f116228m.addMetaData(str, str2);
                    return 0;
                }
            }
            return -100;
        }
    }

    /* renamed from: a */
    public final int mo107901a(int[] iArr, int i, int i2, GET_FRAMES_FLAGS get_frames_flags, C45220p pVar) {
        int images;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("getImages... width:");
            sb.append(i);
            sb.append(", height:");
            sb.append(i2);
            sb.append(", flags:");
            sb.append(get_frames_flags);
            C45372t.m143403a(str, sb.toString());
            this.f116157B = pVar;
            this.f116228m.setGetImageCallback(this.f116186aG);
            images = this.f116228m.getImages(iArr, i, i2, get_frames_flags.getValue());
        }
        return images;
    }

    /* renamed from: a */
    public final boolean mo107917a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, C45215k kVar) throws VEException {
        this.f116219d = kVar;
        boolean a = m142483a(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.f116081a);
        if (!a) {
            this.f116219d = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo107916a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) throws VEException {
        this.f116219d = null;
        return m142483a(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.f116081a);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(20:10|(2:12|(1:23)(5:16|(1:18)|19|(1:21)|22))|24|25|52|(1:54)(1:55)|56|(3:(1:66)|67|(3:69|70|71))(2:60|(3:62|63|64))|(2:73|(13:75|(1:77)|78|81|82|83|(1:85)(1:86)|87|(1:89)(1:90)|91|92|93|94)(1:79))|80|81|82|83|(0)(0)|87|(0)(0)|91|92|93|94) */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ef, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x02ec */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02cd A[Catch:{ JSONException -> 0x02ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02d2 A[Catch:{ JSONException -> 0x02ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02db A[Catch:{ JSONException -> 0x02ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02e0 A[Catch:{ JSONException -> 0x02ec }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m142483a(java.lang.String r23, java.lang.String r24, com.p280ss.android.vesdk.VEVideoEncodeSettings r25, com.p280ss.android.vesdk.VEAudioEncodeSettings r26) throws com.p280ss.android.vesdk.VEException {
        /*
            r22 = this;
            r1 = r22
            r0 = r25
            r2 = r26
            monitor-enter(r22)
            boolean r3 = r1.f116193ab     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x02f0
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            long r3 = r3.getNativeHandler()     // Catch:{ all -> 0x02fa }
            r5 = 0
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x02ee
            boolean r3 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x0020
            goto L_0x02ee
        L_0x0020:
            com.ss.android.vesdk.runtime.VERuntime r3 = com.p280ss.android.vesdk.runtime.VERuntime.m143285a()     // Catch:{ all -> 0x02fa }
            r3.mo108550a(r0)     // Catch:{ all -> 0x02fa }
            r3 = r23
            r1.f116202ak = r3     // Catch:{ all -> 0x02fa }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02fa }
            r1.f116203al = r8     // Catch:{ all -> 0x02fa }
            boolean r4 = r1.f116207aq     // Catch:{ all -> 0x02fa }
            r8 = 0
            r9 = 2
            r10 = 1
            if (r4 == 0) goto L_0x009b
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.aa r4 = r4.getDisplayRect()     // Catch:{ all -> 0x02fa }
            int r11 = r4.f116415c     // Catch:{ all -> 0x02fa }
            if (r11 == 0) goto L_0x0099
            int r11 = r4.f116416d     // Catch:{ all -> 0x02fa }
            if (r11 == 0) goto L_0x0099
            int r11 = r4.f116415c     // Catch:{ all -> 0x02fa }
            int r11 = r11 % r9
            if (r11 != r10) goto L_0x0050
            int r11 = r4.f116415c     // Catch:{ all -> 0x02fa }
            int r11 = r11 + r10
            r4.f116415c = r11     // Catch:{ all -> 0x02fa }
        L_0x0050:
            int r11 = r4.f116416d     // Catch:{ all -> 0x02fa }
            int r11 = r11 % r9
            if (r11 != r10) goto L_0x005a
            int r11 = r4.f116416d     // Catch:{ all -> 0x02fa }
            int r11 = r11 + r10
            r4.f116416d = r11     // Catch:{ all -> 0x02fa }
        L_0x005a:
            int r11 = r4.f116415c     // Catch:{ all -> 0x02fa }
            int r4 = r4.f116416d     // Catch:{ all -> 0x02fa }
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x02fa }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r11, r4, r12)     // Catch:{ all -> 0x02fa }
            r1.f116210at = r4     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            android.graphics.Bitmap r11 = r1.f116210at     // Catch:{ all -> 0x02fa }
            r4.getDisplayImage(r11)     // Catch:{ all -> 0x02fa }
            android.graphics.Matrix r4 = new android.graphics.Matrix     // Catch:{ all -> 0x02fa }
            r4.<init>()     // Catch:{ all -> 0x02fa }
            float r11 = r1.f116211au     // Catch:{ all -> 0x02fa }
            r4.postRotate(r11)     // Catch:{ all -> 0x02fa }
            float r11 = r1.f116212av     // Catch:{ all -> 0x02fa }
            float r12 = r1.f116213aw     // Catch:{ all -> 0x02fa }
            r4.postScale(r11, r12)     // Catch:{ all -> 0x02fa }
            android.graphics.Bitmap r12 = r1.f116210at     // Catch:{ all -> 0x02fa }
            r13 = 0
            r14 = 0
            android.graphics.Bitmap r11 = r1.f116210at     // Catch:{ all -> 0x02fa }
            int r15 = r11.getWidth()     // Catch:{ all -> 0x02fa }
            android.graphics.Bitmap r11 = r1.f116210at     // Catch:{ all -> 0x02fa }
            int r16 = r11.getHeight()     // Catch:{ all -> 0x02fa }
            r18 = 1
            r17 = r4
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02fa }
            r1.f116210at = r4     // Catch:{ all -> 0x02fa }
            goto L_0x009b
        L_0x0099:
            r1.f116210at = r8     // Catch:{ all -> 0x02fa }
        L_0x009b:
            java.lang.String r4 = "VEEditor"
            java.lang.String r11 = "compile..."
            com.p280ss.android.vesdk.C45372t.m143407c(r4, r11)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r4.stop()     // Catch:{ all -> 0x02fa }
            int[] r4 = com.p280ss.android.vesdk.VEEditor.C451955.f116286b     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEVideoEncodeSettings$COMPILE_TYPE r11 = r25.getCompileType()     // Catch:{ all -> 0x02fa }
            int r11 = r11.ordinal()     // Catch:{ all -> 0x02fa }
            r4 = r4[r11]     // Catch:{ all -> 0x02fa }
            switch(r4) {
                case 1: goto L_0x0166;
                case 2: goto L_0x015c;
                case 3: goto L_0x00ba;
                default: goto L_0x00b6;
            }     // Catch:{ all -> 0x02fa }
        L_0x00b6:
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            goto L_0x0170
        L_0x00ba:
            com.ss.android.vesdk.VEEditor$a r3 = r1.f116241z     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x00c6
            com.ss.android.vesdk.VEEditor$a r3 = r1.f116241z     // Catch:{ all -> 0x02fa }
            boolean r3 = r3.f116301e     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x00c6
            monitor-exit(r22)     // Catch:{ all -> 0x02fa }
            return r7
        L_0x00c6:
            r1.f116240y = r10     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r4 = 4
            r3.setCompileType(r4)     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEEditor$a r3 = r1.f116241z     // Catch:{ all -> 0x02fa }
            if (r3 != 0) goto L_0x00d9
            com.ss.android.vesdk.VEEditor$a r3 = new com.ss.android.vesdk.VEEditor$a     // Catch:{ all -> 0x02fa }
            r3.<init>()     // Catch:{ all -> 0x02fa }
            r1.f116241z = r3     // Catch:{ all -> 0x02fa }
        L_0x00d9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fa }
            r3.<init>()     // Catch:{ all -> 0x02fa }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = r1.f116202ak     // Catch:{ all -> 0x02fa }
            r4.<init>(r11)     // Catch:{ all -> 0x02fa }
            java.lang.String r4 = r4.getParent()     // Catch:{ all -> 0x02fa }
            r3.append(r4)     // Catch:{ all -> 0x02fa }
            char r4 = java.io.File.separatorChar     // Catch:{ all -> 0x02fa }
            r3.append(r4)     // Catch:{ all -> 0x02fa }
            java.lang.String r4 = "gif.mp4"
            r3.append(r4)     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEEditor$a r4 = r1.f116241z     // Catch:{ all -> 0x02fa }
            r4.f116298b = r3     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEEditor$a r4 = r1.f116241z     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = r1.f116202ak     // Catch:{ all -> 0x02fa }
            r4.mo108014a(r11)     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEEditor$a r4 = r1.f116241z     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = r1.f116187aH     // Catch:{ all -> 0x02fa }
            r4.f116302f = r11     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEEditor$a r4 = r1.f116241z     // Catch:{ all -> 0x02fa }
            double r11 = r1.f116188aI     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VESize r13 = r25.getVideoRes()     // Catch:{ all -> 0x02fa }
            int r13 = r13.f116385a     // Catch:{ all -> 0x02fa }
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r11 = r11 * r13
            int r11 = (int) r11
            r4.f116303g = r11     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEEditor$a r4 = r1.f116241z     // Catch:{ all -> 0x02fa }
            double r11 = r1.f116189aJ     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VESize r13 = r25.getVideoRes()     // Catch:{ all -> 0x02fa }
            int r13 = r13.f116386b     // Catch:{ all -> 0x02fa }
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r11 = r11 * r13
            int r11 = (int) r11
            r4.f116304h = r11     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEEditor$a r4 = r1.f116241z     // Catch:{ all -> 0x02fa }
            double r11 = r1.f116190aK     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VESize r13 = r25.getVideoRes()     // Catch:{ all -> 0x02fa }
            int r13 = r13.f116385a     // Catch:{ all -> 0x02fa }
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r11 = r11 * r13
            int r11 = (int) r11
            r4.f116305i = r11     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEEditor$a r4 = r1.f116241z     // Catch:{ all -> 0x02fa }
            double r11 = r1.f116191aL     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VESize r13 = r25.getVideoRes()     // Catch:{ all -> 0x02fa }
            int r13 = r13.f116386b     // Catch:{ all -> 0x02fa }
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r11 = r11 * r13
            int r11 = (int) r11
            r4.f116306j = r11     // Catch:{ all -> 0x02fa }
            java.lang.String r4 = "high_gif"
            r1.f116159D = r4     // Catch:{ all -> 0x02fa }
            goto L_0x0177
        L_0x015c:
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r4.setCompileType(r9)     // Catch:{ all -> 0x02fa }
            java.lang.String r4 = "gif"
            r1.f116159D = r4     // Catch:{ all -> 0x02fa }
            goto L_0x0177
        L_0x0166:
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r4.setCompileType(r10)     // Catch:{ all -> 0x02fa }
            java.lang.String r4 = "mp4"
            r1.f116159D = r4     // Catch:{ all -> 0x02fa }
            goto L_0x0177
        L_0x0170:
            r4.setCompileType(r10)     // Catch:{ all -> 0x02fa }
            java.lang.String r4 = "mp4"
            r1.f116159D = r4     // Catch:{ all -> 0x02fa }
        L_0x0177:
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            int r11 = r25.getFps()     // Catch:{ all -> 0x02fa }
            r4.setCompileFps(r11)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r11 = r24
            r4.setEngineCompilePath(r3, r11)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            int r4 = r25.getResizeMode()     // Catch:{ all -> 0x02fa }
            float r11 = r25.getResizeX()     // Catch:{ all -> 0x02fa }
            float r12 = r25.getResizeY()     // Catch:{ all -> 0x02fa }
            r3.setResizer(r4, r11, r12)     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = "VEEditor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = "compile... resizeMode:"
            r4.<init>(r11)     // Catch:{ all -> 0x02fa }
            int r11 = r25.getResizeMode()     // Catch:{ all -> 0x02fa }
            r4.append(r11)     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = ", resetX:"
            r4.append(r11)     // Catch:{ all -> 0x02fa }
            float r11 = r25.getResizeX()     // Catch:{ all -> 0x02fa }
            r4.append(r11)     // Catch:{ all -> 0x02fa }
            java.lang.String r11 = ", resetY:"
            r4.append(r11)     // Catch:{ all -> 0x02fa }
            float r11 = r25.getResizeY()     // Catch:{ all -> 0x02fa }
            r4.append(r11)     // Catch:{ all -> 0x02fa }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02fa }
            com.p280ss.android.vesdk.C45372t.m143407c(r3, r4)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            int r4 = r25.getRotate()     // Catch:{ all -> 0x02fa }
            r3.setUsrRotate(r4)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            float r4 = r25.getSpeed()     // Catch:{ all -> 0x02fa }
            r3.setSpeedRatio(r4)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            boolean r4 = r25.isEnableRemuxVideo()     // Catch:{ all -> 0x02fa }
            boolean r11 = r25.isEnableRemuxVideoForRotation()     // Catch:{ all -> 0x02fa }
            r3.setEnableRemuxVideo(r4, r11)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            boolean r4 = r25.isEnableInterLeave()     // Catch:{ all -> 0x02fa }
            r3.setEnableInterLeave(r4)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            boolean r4 = r25.isCompileSoftInfo()     // Catch:{ all -> 0x02fa }
            r3.setCompileSoftInfo(r4)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            int r4 = r2.f116083c     // Catch:{ all -> 0x02fa }
            int r11 = r2.f116085e     // Catch:{ all -> 0x02fa }
            int r12 = r2.f116084d     // Catch:{ all -> 0x02fa }
            r3.setAudioCompileSetting(r4, r11, r12)     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEListener$n r3 = r1.f116156A     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x0214
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r3.setEncoderParallel(r10)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.b$a r4 = r1.f116185aF     // Catch:{ all -> 0x02fa }
            r3.setEncoderDataListener(r4)     // Catch:{ all -> 0x02fa }
            goto L_0x021e
        L_0x0214:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r3.setEncoderParallel(r7)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r3.setEncoderDataListener(r8)     // Catch:{ all -> 0x02fa }
        L_0x021e:
            r22.m142467L()     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VESize r4 = r25.getVideoRes()     // Catch:{ all -> 0x02fa }
            int r4 = r4.f116385a     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VESize r8 = r25.getVideoRes()     // Catch:{ all -> 0x02fa }
            int r8 = r8.f116386b     // Catch:{ all -> 0x02fa }
            r3.setWidthHeight(r4, r8)     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEWatermarkParam r3 = r25.getWatermarkParam()     // Catch:{ all -> 0x02fa }
            if (r3 == 0) goto L_0x024e
            boolean r4 = r3.needExtFile     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x024e
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r4.setCompileWatermark(r3)     // Catch:{ all -> 0x02fa }
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            int r4 = r4.prepareEngine(r9)     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x0262
            r22.mo107941c()     // Catch:{ all -> 0x02fa }
            monitor-exit(r22)     // Catch:{ all -> 0x02fa }
            return r7
        L_0x024e:
            if (r3 == 0) goto L_0x0255
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r4.setEnableRemuxVideo(r7, r7)     // Catch:{ all -> 0x02fa }
        L_0x0255:
            com.ss.android.ttve.nativePort.TEInterface r4 = r1.f116228m     // Catch:{ all -> 0x02fa }
            int r4 = r4.prepareEngine(r10)     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x0262
            r22.mo107941c()     // Catch:{ all -> 0x02fa }
            monitor-exit(r22)     // Catch:{ all -> 0x02fa }
            return r7
        L_0x0262:
            if (r3 == 0) goto L_0x02a9
            java.lang.String[] r4 = r3.images     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x02a2
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x02fa }
            r12.<init>()     // Catch:{ all -> 0x02fa }
            java.lang.String[] r4 = r3.images     // Catch:{ all -> 0x02fa }
            r12.add(r4)     // Catch:{ all -> 0x02fa }
            java.lang.String[] r4 = r3.secondHalfImages     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x027b
            java.lang.String[] r4 = r3.secondHalfImages     // Catch:{ all -> 0x02fa }
            r12.add(r4)     // Catch:{ all -> 0x02fa }
        L_0x027b:
            com.ss.android.ttve.nativePort.TEInterface r11 = r1.f116228m     // Catch:{ all -> 0x02fa }
            int r13 = r3.interval     // Catch:{ all -> 0x02fa }
            int r14 = r3.xOffset     // Catch:{ all -> 0x02fa }
            int r15 = r3.yOffset     // Catch:{ all -> 0x02fa }
            int r4 = r3.width     // Catch:{ all -> 0x02fa }
            int r5 = r3.height     // Catch:{ all -> 0x02fa }
            long r6 = r3.duration     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEWaterMarkPosition r8 = r3.position     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.VEWatermarkParam$VEWatermarkMask r3 = r3.mask     // Catch:{ all -> 0x02fa }
            r16 = r4
            r17 = r5
            r18 = r6
            r20 = r8
            r21 = r3
            r11.setWaterMark(r12, r13, r14, r15, r16, r17, r18, r20, r21)     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = "te_composition_watermark_add"
            r4 = 1
            com.p280ss.android.ttve.monitor.C20479f.m67948a(r10, r3, r4)     // Catch:{ all -> 0x02fa }
            goto L_0x02ae
        L_0x02a2:
            java.lang.String r3 = "VEEditor"
            java.lang.String r4 = "watermarkParam.images is null!!!"
            com.p280ss.android.vesdk.C45372t.m143407c(r3, r4)     // Catch:{ all -> 0x02fa }
        L_0x02a9:
            java.lang.String r3 = "te_composition_watermark_add"
            com.p280ss.android.ttve.monitor.C20479f.m67948a(r10, r3, r5)     // Catch:{ all -> 0x02fa }
        L_0x02ae:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x02fa }
            r3.start()     // Catch:{ all -> 0x02fa }
            com.ss.android.vesdk.d.a r3 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x02fa }
            r3.<init>()     // Catch:{ all -> 0x02fa }
            java.lang.String r4 = "iesve_veeditor_composition_start_file"
            java.lang.String r5 = r1.f116159D     // Catch:{ all -> 0x02fa }
            r3.mo108381a(r4, r5)     // Catch:{ all -> 0x02fa }
            java.lang.String r4 = "iesve_veeditor_composition_start"
            com.p280ss.android.ttve.monitor.C20477e.m67936a(r4, r10, r3)     // Catch:{ all -> 0x02fa }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02ec }
            r3.<init>()     // Catch:{ JSONException -> 0x02ec }
            java.lang.String r4 = "videoSettings"
            if (r0 == 0) goto L_0x02d2
            java.lang.String r0 = r25.toString()     // Catch:{ JSONException -> 0x02ec }
            goto L_0x02d4
        L_0x02d2:
            java.lang.String r0 = ""
        L_0x02d4:
            r3.put(r4, r0)     // Catch:{ JSONException -> 0x02ec }
            java.lang.String r0 = "audioSettings"
            if (r2 == 0) goto L_0x02e0
            java.lang.String r2 = r26.toString()     // Catch:{ JSONException -> 0x02ec }
            goto L_0x02e2
        L_0x02e0:
            java.lang.String r2 = ""
        L_0x02e2:
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x02ec }
            java.lang.String r0 = "vesdk_event_editor_compile"
            java.lang.String r2 = "behavior"
            com.p280ss.android.ttve.monitor.C20469a.m67906a(r0, r3, r2)     // Catch:{ JSONException -> 0x02ec }
        L_0x02ec:
            monitor-exit(r22)     // Catch:{ all -> 0x02fa }
            return r10
        L_0x02ee:
            monitor-exit(r22)     // Catch:{ all -> 0x02fa }
            return r7
        L_0x02f0:
            com.ss.android.vesdk.VEException r0 = new com.ss.android.vesdk.VEException     // Catch:{ all -> 0x02fa }
            r2 = -105(0xffffffffffffff97, float:NaN)
            java.lang.String r3 = "编码前需确保初始化成功！！！"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x02fa }
            throw r0     // Catch:{ all -> 0x02fa }
        L_0x02fa:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x02fa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.m142483a(java.lang.String, java.lang.String, com.ss.android.vesdk.VEVideoEncodeSettings, com.ss.android.vesdk.VEAudioEncodeSettings):boolean");
    }

    /* renamed from: a */
    public final int mo107903a(String[] strArr, VIDEO_RATIO video_ratio) throws VEException {
        synchronized (this) {
            C20479f.m67969d(1);
            C20479f.m67968c(1);
            if (strArr.length == 0) {
                return -100;
            }
            StringBuilder sb = new StringBuilder("initWithAlgorithm... ");
            sb.append(video_ratio);
            C45372t.m143407c("VEEditor", sb.toString());
            for (int i = 0; i < strArr.length; i++) {
                StringBuilder sb2 = new StringBuilder("initWithAlgorithm...  i: ");
                sb2.append(i);
                sb2.append(" path: ");
                sb2.append(strArr[i]);
                C45372t.m143407c("VEEditor", sb2.toString());
            }
            this.f116233r = System.currentTimeMillis();
            this.f116234s = System.currentTimeMillis();
            int createSceneWithAlgorithm = this.f116228m.createSceneWithAlgorithm(strArr, video_ratio.ordinal());
            if (createSceneWithAlgorithm != 0) {
                StringBuilder sb3 = new StringBuilder("createSceneWithAlgorithm failed, ret = ");
                sb3.append(createSceneWithAlgorithm);
                C45372t.m143409d("VEEditor", sb3.toString());
                this.f116193ab = false;
                return createSceneWithAlgorithm;
            }
            this.f116193ab = true;
            this.f116179a.f116802g = false;
            this.f116177Y = video_ratio;
            this.f116197af = -1;
            this.f116179a.f116804i = 0;
            this.f116179a.f116803h = 0;
            this.f116172T = 0;
            int I = m142464I();
            return I;
        }
    }

    /* renamed from: a */
    public final int mo107890a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        synchronized (this) {
            this.f116228m.stop();
            StringBuilder sb = new StringBuilder("setMusicAndResult... audioFilePath: ");
            sb.append(str);
            sb.append(" trimIn: ");
            sb.append(i);
            sb.append(" trimOut: ");
            sb.append(i2);
            sb.append(" ");
            sb.append(vEAlgorithmPath.toString());
            C45372t.m143407c("VEEditor", sb.toString());
            if ((vEAlgorithmPath.getVeBeatsPath() == null || C19722g.m65025a(vEAlgorithmPath.getVeBeatsPath())) && ((vEAlgorithmPath.getDownBeatsPath() == null || C19722g.m65025a(vEAlgorithmPath.getDownBeatsPath())) && ((vEAlgorithmPath.getNoStrengthBeatsPath() == null || C19722g.m65025a(vEAlgorithmPath.getNoStrengthBeatsPath())) && ((vEAlgorithmPath.getManMadePath() == null || C19722g.m65025a(vEAlgorithmPath.getManMadePath())) && (vEAlgorithmPath.getOnlineBeatsPath() == null || C19722g.m65025a(vEAlgorithmPath.getOnlineBeatsPath())))))) {
                int musicAndResult = this.f116228m.setMusicAndResult(str, i, i2, vEAlgorithmPath.getVeBeatsPath(), vEAlgorithmPath.getDownBeatsPath(), vEAlgorithmPath.getNoStrengthBeatsPath(), vEAlgorithmPath.getOnlineBeatsPath(), vEAlgorithmPath.getManMadePath(), vEAlgorithmPath.getType(), vEAlgorithmPath.getMode());
                if (musicAndResult < 0) {
                    StringBuilder sb2 = new StringBuilder("setMusicAndResult failed, ret = ");
                    sb2.append(musicAndResult);
                    C45372t.m143409d("VEEditor", sb2.toString());
                    return musicAndResult;
                }
                int prepareEngine = this.f116228m.prepareEngine(0);
                return prepareEngine;
            }
            C45372t.m143409d("VEEditor", "file is not exist !");
            return -100;
        }
    }

    /* renamed from: a */
    public final int mo107869a(int i, int i2, boolean z, C45209e eVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        boolean z2 = z;
        this.f116223h.put(Integer.valueOf(i), Boolean.valueOf(true));
        String clipPath = this.f116228m.getClipPath(i7);
        if (clipPath.equals("")) {
            StringBuilder sb = new StringBuilder("getClipPath wrong index: ");
            sb.append(i7);
            C45372t.m143409d("VEEditor", sb.toString());
            return -100;
        }
        int[] iArr = new int[10];
        TEVideoUtils.getVideoFileInfo(clipPath, iArr);
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            C45372t.m143409d("VEEditor", "beginGenVideoFrames error for invalid video size");
            return -1;
        }
        if (iArr[0] > iArr[1]) {
            double d = (double) iArr[0];
            Double.isNaN(d);
            double d2 = d / 320.0d;
            double d3 = (double) iArr[1];
            Double.isNaN(d3);
            int i9 = (int) (d3 / d2);
            int i10 = i9 % 16;
            if (i10 >= 8) {
                i9 += 16;
            }
            i3 = i9 - i10;
            i4 = 320;
        } else {
            double d4 = (double) iArr[1];
            Double.isNaN(d4);
            double d5 = d4 / 320.0d;
            double d6 = (double) iArr[0];
            Double.isNaN(d6);
            int i11 = (int) (d6 / d5);
            int i12 = i11 % 16;
            if (i12 >= 8) {
                i11 += 16;
            }
            i4 = i11 - i12;
            i3 = 320;
        }
        int i13 = 3;
        int i14 = (iArr[3] / (i8 * 1000)) + 1;
        if (z2) {
            i5 = i14 / 3;
        } else {
            i13 = i14;
            i5 = i13;
        }
        StringBuilder sb2 = new StringBuilder("HwFrameExtractor_");
        sb2.append(i7);
        sb2.append(" second: ");
        sb2.append(i8);
        sb2.append(" hasHWDecode");
        sb2.append(z2);
        sb2.append("beginGenVideoFrames HWSteps: ");
        sb2.append(i5);
        C45372t.m143407c("VEEditor", sb2.toString());
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < i14; i15 += i13) {
            arrayList.add(Integer.valueOf(i15 * 1000));
        }
        if (arrayList.size() > 0 && ((Integer) arrayList.get(arrayList.size() - 1)).intValue() > 1000) {
            arrayList.set(arrayList.size() - 1, Integer.valueOf(((Integer) arrayList.get(arrayList.size() - 1)).intValue() - 1000));
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            iArr2[i16] = ((Integer) arrayList.get(i16)).intValue();
            StringBuilder sb3 = new StringBuilder("HwFrameExtractor_");
            sb3.append(i7);
            sb3.append(" softList value:");
            sb3.append(iArr2[i16]);
            C45372t.m143403a("VEEditor", sb3.toString());
        }
        final long[] jArr = {System.currentTimeMillis()};
        final int i17 = i;
        C451913 r10 = r0;
        final String str = clipPath;
        String str2 = clipPath;
        final C45209e eVar2 = eVar;
        int[] iArr3 = iArr2;
        final int i18 = i14;
        ArrayList arrayList2 = arrayList;
        final int[] iArr4 = iArr3;
        ArrayList arrayList3 = arrayList2;
        int i19 = i5;
        final int i20 = i4;
        int i21 = i4;
        int i22 = i14;
        final int i23 = i3;
        C451913 r0 = new Runnable() {
            public final void run() {
                final ByteBuffer[] byteBufferArr = {null};
                final float[] fArr = {0.0f};
                TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
                tEVideoUtilsCallback.setListener(new C45332o() {
                    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                        long currentTimeMillis = System.currentTimeMillis() - jArr[0];
                        StringBuilder sb = new StringBuilder("frameProcessSoft");
                        sb.append(i17);
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder(" cost time :");
                        sb3.append(currentTimeMillis);
                        sb3.append(" ptsMs: ");
                        sb3.append(i3);
                        C45372t.m143403a(sb2, sb3.toString());
                        jArr[0] = System.currentTimeMillis();
                        if (byteBufferArr[0] == null) {
                            byteBufferArr[0] = byteBuffer;
                            fArr[0] = (float) i3;
                            return ((Boolean) VEEditor.this.f116223h.get(Integer.valueOf(i17))).booleanValue();
                        }
                        VEEditor.this.f116228m.processBingoFrames(byteBufferArr[0], byteBuffer, i, i2, fArr[0], str);
                        byteBufferArr[0] = null;
                        fArr[0] = 0.0f;
                        VEEditor.this.mo107913a(eVar2, i18, i17);
                        return ((Boolean) VEEditor.this.f116223h.get(Integer.valueOf(i17))).booleanValue();
                    }
                });
                TEVideoUtils.getVideoFramesMore(str, iArr4, i20, i23, false, false, 2, true, tEVideoUtilsCallback);
            }
        };
        Thread thread = new Thread(r10);
        thread.start();
        if (z2) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            int i24 = 0;
            while (i24 < i19) {
                int i25 = i24 * 1000;
                ArrayList arrayList7 = arrayList3;
                if (!arrayList7.contains(Integer.valueOf(i25))) {
                    arrayList4.add(Integer.valueOf(i25));
                    StringBuilder sb4 = new StringBuilder("HwFrameExtractor_");
                    sb4.append(i);
                    sb4.append("hwListOne value:");
                    sb4.append(i25);
                    C45372t.m143403a("VEEditor", sb4.toString());
                } else {
                    int i26 = i;
                }
                i24++;
                arrayList3 = arrayList7;
            }
            ArrayList arrayList8 = arrayList3;
            int i27 = i;
            int i28 = i19;
            while (true) {
                i6 = i19 * 2;
                if (i28 >= i6) {
                    break;
                }
                int i29 = i28 * 1000;
                if (!arrayList8.contains(Integer.valueOf(i29))) {
                    arrayList5.add(Integer.valueOf(i29));
                    StringBuilder sb5 = new StringBuilder("HwFrameExtractor_");
                    sb5.append(i27);
                    sb5.append("hwListTwo value:");
                    sb5.append(i29);
                    C45372t.m143403a("VEEditor", sb5.toString());
                }
                i28++;
            }
            while (i6 < i22) {
                int i30 = i6 * 1000;
                if (!arrayList8.contains(Integer.valueOf(i30))) {
                    arrayList6.add(Integer.valueOf(i30));
                    StringBuilder sb6 = new StringBuilder("HwFrameExtractor_");
                    sb6.append(i27);
                    sb6.append("hwListThree value:");
                    sb6.append(i30);
                    C45372t.m143403a("VEEditor", sb6.toString());
                }
                i6++;
            }
            String str3 = str2;
            int i31 = i21;
            int i32 = i3;
            int i33 = i22;
            int i34 = i;
            C45209e eVar3 = eVar;
            m142481a(str3, arrayList4, i31, i32, 2, i33, i34, 1, eVar3);
            m142481a(str3, arrayList5, i31, i32, 2, i33, i34, 2, eVar3);
            m142481a(str3, arrayList6, i31, i32, 2, i33, i34, 3, eVar3);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo107913a(C45209e eVar, int i, int i2) {
        synchronized (this) {
            float f = (float) i;
            float f2 = ((float) (this.f116165J + 1)) / f;
            StringBuilder sb = new StringBuilder("HwFrameExtractor_");
            sb.append(i2);
            sb.append(" count: ");
            sb.append(this.f116165J);
            sb.append(" steps: ");
            sb.append(i);
            sb.append(" progress: ");
            sb.append(f2);
            C45372t.m143407c("VEEditor", sb.toString());
            if (f2 <= 1.0f && ((Boolean) this.f116223h.get(Integer.valueOf(i2))).booleanValue()) {
                StringBuilder sb2 = new StringBuilder("HwFrameExtractor_");
                sb2.append(i2);
                sb2.append("progressBack < 1 count: ");
                sb2.append(this.f116165J);
                sb2.append(" steps: ");
                sb2.append(i);
                sb2.append(" progress: ");
                sb2.append(f2);
                C45372t.m143407c("VEEditor", sb2.toString());
                this.f116165J++;
                eVar.mo97464a(((float) this.f116165J) / f);
            }
            if (f2 == 1.0f) {
                StringBuilder sb3 = new StringBuilder("HwFrameExtractor_");
                sb3.append(i2);
                sb3.append("progressBack == 1  count: ");
                sb3.append(this.f116165J);
                sb3.append(" steps: ");
                sb3.append(i);
                sb3.append(" progress: ");
                sb3.append(f2);
                C45372t.m143407c("VEEditor", sb3.toString());
                this.f116165J = 0;
                this.f116223h.put(Integer.valueOf(i2), Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    private void m142481a(String str, List<Integer> list, int i, int i2, int i3, int i4, int i5, int i6, C45209e eVar) {
        final int[] iArr = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            List<Integer> list2 = list;
            iArr[i7] = ((Integer) list.get(i7)).intValue();
        }
        final String str2 = str;
        final int i8 = i;
        final int i9 = i2;
        final int i10 = i5;
        final int i11 = i6;
        final C45209e eVar2 = eVar;
        final int i12 = i4;
        C451934 r1 = new Runnable(2) {
            public final void run() {
                final ByteBuffer[] byteBufferArr = {null};
                final float[] fArr = {0.0f};
                final long[] jArr = {System.currentTimeMillis()};
                C20490a aVar = new C20490a(str2, iArr, i8, i9, false, 2, i10, new C45332o() {
                    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                        String str;
                        long currentTimeMillis = System.currentTimeMillis() - jArr[0];
                        StringBuilder sb = new StringBuilder("frameProcessHW");
                        sb.append(i10);
                        sb.append("_");
                        sb.append(i11);
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder(" cost time :");
                        sb3.append(currentTimeMillis);
                        sb3.append(" ptsMs: ");
                        sb3.append(i3);
                        sb3.append(" frame is ");
                        if (byteBuffer == null) {
                            str = TEVideoRecorder.FACE_BEAUTY_NULL;
                        } else {
                            str = "not null";
                        }
                        sb3.append(str);
                        C45372t.m143403a(sb2, sb3.toString());
                        jArr[0] = System.currentTimeMillis();
                        if (byteBuffer == null) {
                            byteBufferArr[0] = null;
                            VEEditor.this.mo107913a(eVar2, i12, i10);
                            return ((Boolean) VEEditor.this.f116223h.get(Integer.valueOf(i10))).booleanValue();
                        } else if (byteBufferArr[0] == null) {
                            byteBufferArr[0] = byteBuffer;
                            fArr[0] = (float) i3;
                            return ((Boolean) VEEditor.this.f116223h.get(Integer.valueOf(i10))).booleanValue();
                        } else {
                            VEEditor.this.f116228m.processBingoFrames(byteBufferArr[0], byteBuffer, i, i2, fArr[0], str2);
                            byteBufferArr[0] = null;
                            fArr[0] = 0.0f;
                            VEEditor.this.mo107913a(eVar2, i12, i10);
                            return ((Boolean) VEEditor.this.f116223h.get(Integer.valueOf(i10))).booleanValue();
                        }
                    }
                });
                aVar.mo55460a();
            }
        };
        new Thread(r1).start();
    }

    /* renamed from: a */
    public final int mo107870a(int i, ROTATE_DEGREE rotate_degree) {
        StringBuilder sb = new StringBuilder("setAIRotation index:");
        sb.append(i);
        sb.append(" rotation: ");
        sb.append(rotate_degree);
        C45372t.m143407c("VEEditor", sb.toString());
        int i2 = 0;
        switch (rotate_degree) {
            case ROTATE_90:
                i2 = 90;
                break;
            case ROTATE_180:
                i2 = NormalGiftView.ALPHA_180;
                break;
            case ROTATE_270:
                i2 = 270;
                break;
        }
        int aIRotation = this.f116228m.setAIRotation(i, i2);
        if (aIRotation == 0) {
            return aIRotation;
        }
        StringBuilder sb2 = new StringBuilder("setAIRotation failed, ret = ");
        sb2.append(aIRotation);
        C45372t.m143409d("VEEditor", sb2.toString());
        return aIRotation;
    }

    /* renamed from: d */
    public final long mo107943d() {
        return this.f116228m.getNativeHandler();
    }

    /* renamed from: x */
    public final int mo107994x() {
        return this.f116228m.getCurPosition();
    }

    /* renamed from: K */
    private boolean m142466K() {
        if (this.f116228m.get2DBrushStrokeCount() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Bitmap mo107953f() {
        C45372t.m143403a("VEEditor", "getCurrDisplayImage...");
        return mo107907a(-1);
    }

    /* renamed from: q */
    public final String[] mo107983q() {
        if (this.f116179a.f116802g) {
            return this.f116179a.f116800e;
        }
        return null;
    }

    /* renamed from: r */
    public final String[] mo107985r() {
        if (this.f116179a.f116802g) {
            return this.f116179a.f116801f;
        }
        return null;
    }

    /* renamed from: s */
    public final String[] mo107987s() {
        return this.f116179a.f116797b;
    }

    /* renamed from: u */
    public final int mo107990u() {
        int k;
        synchronized (this) {
            k = m142492k(false);
        }
        return k;
    }

    /* renamed from: w */
    public final int mo107993w() {
        int duration;
        synchronized (this) {
            duration = this.f116228m.getDuration();
        }
        return duration;
    }

    /* renamed from: B */
    public final boolean mo107848B() {
        boolean z;
        synchronized (this) {
            if (this.f116228m.getNativeHandler() != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    public final MVInfoBean mo107957g() {
        if (!f116155ap) {
            throw new VEException(-1, "The MV resource has not been initialized yet, please call the init2 method");
        } else if (this.f116206ao != null) {
            return this.f116206ao;
        } else {
            throw new VEException(-1, "MV资源信息构建失败");
        }
    }

    /* renamed from: l */
    public final void mo107972l() {
        synchronized (this) {
            if (this.f116228m != null) {
                C45372t.m143407c("VEEditor", "onRelease... ");
                this.f116228m.stop();
                this.f116228m.releaseEngine();
            }
        }
    }

    /* renamed from: y */
    public final int mo107995y() {
        int addInfoStickerWithBuffer;
        synchronized (this) {
            C45372t.m143403a("VEEditor", "addInfoStickerWithBuffer...");
            addInfoStickerWithBuffer = this.f116228m.addInfoStickerWithBuffer();
        }
        return addInfoStickerWithBuffer;
    }

    /* renamed from: z */
    public final int mo107996z() {
        int cancelGetImages;
        synchronized (this) {
            C45372t.m143407c("VEEditor", "cancelGetVideoFrames...");
            cancelGetImages = this.f116228m.cancelGetImages();
        }
        return cancelGetImages;
    }

    /* renamed from: H */
    private VESize m142463H() {
        VESize vESize = new VESize(this.f116158C.f116385a, this.f116158C.f116386b);
        StringBuilder sb = new StringBuilder("getVideoResolution... width:");
        sb.append(vESize.f116385a);
        sb.append(", height:");
        sb.append(vESize.f116386b);
        C45372t.m143403a("VEEditor", sb.toString());
        return vESize;
    }

    /* renamed from: J */
    private void m142465J() {
        C45372t.m143409d("VEEditor", "updateFilters");
        int duration = this.f116228m.getDuration();
        if (this.f116196ae >= 0) {
            this.f116228m.adjustFilterInOut(this.f116196ae, 0, duration);
        }
        if (this.f116200ai >= 0) {
            this.f116228m.adjustFilterInOut(this.f116200ai, 0, duration);
        }
    }

    /* renamed from: D */
    public final int mo107850D() {
        synchronized (this) {
            C45372t.m143407c("VEEditor", "genRandomSolve");
            this.f116228m.stop();
            int randomSolve = this.f116228m.getRandomSolve();
            if (randomSolve != 0) {
                StringBuilder sb = new StringBuilder("getRandomSolve failed, ret = ");
                sb.append(randomSolve);
                C45372t.m143409d("VEEditor", sb.toString());
                return randomSolve;
            }
            int prepareEngine = this.f116228m.prepareEngine(0);
            return prepareEngine;
        }
    }

    /* renamed from: E */
    public final int mo107851E() {
        synchronized (this) {
            C45372t.m143407c("VEEditor", "genSmartCutting");
            this.f116228m.stop();
            int genAISolve = this.f116228m.genAISolve();
            if (genAISolve != 0) {
                StringBuilder sb = new StringBuilder("getRandomSolve failed, ret = ");
                sb.append(genAISolve);
                C45372t.m143409d("VEEditor", sb.toString());
                return genAISolve;
            }
            int prepareEngine = this.f116228m.prepareEngine(0);
            return prepareEngine;
        }
    }

    /* renamed from: F */
    public final List<VEClipAlgorithmParam> mo107852F() {
        C45372t.m143407c("VEEditor", "getAllVideoRangeData");
        List<VEClipAlgorithmParam> allVideoRangeData = this.f116228m.getAllVideoRangeData();
        for (int i = 0; i < allVideoRangeData.size(); i++) {
            StringBuilder sb = new StringBuilder("rangData: ");
            sb.append(((VEClipAlgorithmParam) allVideoRangeData.get(i)).toString());
            C45372t.m143407c("VEEditor", sb.toString());
        }
        return allVideoRangeData;
    }

    /* renamed from: G */
    public final int mo107853G() {
        C45372t.m143407c("VEEditor", "updateAlgorithmFromNormal");
        int updateAlgorithmFromNormal = this.f116228m.updateAlgorithmFromNormal();
        if (updateAlgorithmFromNormal == 0) {
            return updateAlgorithmFromNormal;
        }
        StringBuilder sb = new StringBuilder("updateAlgorithmFromNormal failed, ret = ");
        sb.append(updateAlgorithmFromNormal);
        C45372t.m143409d("VEEditor", sb.toString());
        return updateAlgorithmFromNormal;
    }

    /* renamed from: e */
    public final VESize mo107948e() {
        VESize vESize = new VESize(this.f116168P, this.f116169Q);
        StringBuilder sb = new StringBuilder("getInitSize... initWidth:");
        sb.append(vESize.f116385a);
        sb.append(", initHeight:");
        sb.append(vESize.f116386b);
        C45372t.m143403a("VEEditor", sb.toString());
        return vESize;
    }

    /* renamed from: h */
    public final VEMVAudioInfo mo107960h() {
        C45372t.m143407c("VEEditor", "getMVOriginalBackgroundAudio");
        if (this.f116164I != null && this.f116162G != null && this.f116163H != null) {
            return (VEMVAudioInfo) this.f116228m.getMVOriginalBackgroundAudio();
        }
        C45372t.m143409d("VEEditor", "getMVOriginalBackgroundAudio bad input file, please call initMV first");
        return null;
    }

    /* renamed from: o */
    public final VEState mo107977o() {
        synchronized (this) {
            if (this.f116228m == null) {
                C45372t.m143407c("VEEditor", "video editor is created yet");
                VEState vEState = VEState.IDLE;
                return vEState;
            }
            int curState = this.f116228m.getCurState();
            if (curState < 0) {
                C45372t.m143407c("VEEditor", "native video editor is not inited, already released or releasing");
                VEState vEState2 = VEState.IDLE;
                return vEState2;
            }
            VEState valueOf = VEState.valueOf(curState);
            return valueOf;
        }
    }

    /* renamed from: t */
    public final int mo107988t() {
        int start;
        synchronized (this) {
            C45372t.m143407c("VEEditor", "play...");
            this.f116231p = 0;
            this.f116233r = System.currentTimeMillis();
            if (this.f116236u == 0) {
                this.f116236u = this.f116233r;
            }
            start = this.f116228m.start();
        }
        return start;
    }

    /* renamed from: v */
    public final int mo107992v() {
        int refreshCurrentFrame;
        synchronized (this) {
            C45372t.m143405b("VEEditor", "refreshCurrentFrame...");
            refreshCurrentFrame = this.f116228m.refreshCurrentFrame();
        }
        return refreshCurrentFrame;
    }

    /* renamed from: I */
    private int m142464I() {
        try {
            int[] addFilters = this.f116228m.addFilters(new int[]{0, 0}, new String[]{"color filter", "effect hdr filter"}, new int[]{0, 0}, new int[]{this.f116176X, this.f116176X}, new int[]{0, 0}, new int[]{7, 16});
            this.f116196ae = addFilters[0];
            this.f116200ai = addFilters[1];
            return 0;
        } catch (NullPointerException unused) {
            throw new VEException(-1, "init failed: VESDK need to be init");
        }
    }

    /* renamed from: L */
    private void m142467L() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        String a = C45374a.m143414a(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.substring(0, 12));
        sb2.append(Build.MODEL.toLowerCase());
        String a2 = C45374a.m143414a(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a.substring(0, 12));
        sb3.append(a2.substring(12, 32));
        this.f116228m.addMetaData("copyright", sb3.toString());
    }

    /* renamed from: C */
    public final void mo107849C() {
        if (((float) this.f116158C.f116385a) / ((float) this.f116158C.f116386b) > ((float) this.f116226k) / ((float) this.f116227l)) {
            this.f116168P = this.f116226k;
            this.f116169Q = (int) (((float) this.f116226k) / (((float) this.f116158C.f116385a) / ((float) this.f116158C.f116386b)));
            return;
        }
        this.f116169Q = this.f116227l;
        this.f116168P = (int) (((float) this.f116227l) / (((float) this.f116158C.f116386b) / ((float) this.f116158C.f116385a)));
    }

    /* renamed from: i */
    public final VEEditorModel mo107963i() {
        C45372t.m143403a("VEEditor", "saveModel...");
        if (this.f116193ab) {
            VEEditorModel vEEditorModel = new VEEditorModel();
            vEEditorModel.f116316d = this.f116179a.f116802g;
            vEEditorModel.f116317e = this.f116177Y;
            vEEditorModel.f116311C = this.f116178Z;
            vEEditorModel.f116312D = this.f116192aa;
            vEEditorModel.f116318f = this.f116170R.booleanValue();
            vEEditorModel.f116319g = this.f116172T;
            vEEditorModel.f116320h = this.f116228m.getHostTrackIndex();
            vEEditorModel.f116321i = this.f116171S;
            vEEditorModel.f116323k = this.f116196ae;
            vEEditorModel.f116324l = this.f116200ai;
            vEEditorModel.f116325m = this.f116179a.f116797b;
            vEEditorModel.f116326n = this.f116179a.f116798c;
            vEEditorModel.f116327o = this.f116179a.f116799d;
            vEEditorModel.f116328p = this.f116180aA;
            vEEditorModel.f116329q = this.f116181aB;
            return vEEditorModel;
        }
        C45372t.m143409d("VEEditor", "saveModel error, editor is not init...");
        return null;
    }

    /* renamed from: j */
    public final int mo107966j() {
        int prepareEngine;
        synchronized (this) {
            C45372t.m143407c("VEEditor", "prepare...");
            m142493v(this.f116181aB);
            this.f116228m.setEnableRemuxVideo(false);
            this.f116228m.setUsrRotate(0);
            prepareEngine = this.f116228m.prepareEngine(0);
            if (prepareEngine != 0) {
                StringBuilder sb = new StringBuilder("prepare() prepareEngine failed: result: ");
                sb.append(prepareEngine);
                C45372t.m143409d("VEEditor", sb.toString());
                mo107941c();
            }
            int[] initResolution = this.f116228m.getInitResolution();
            this.f116158C.f116385a = initResolution[0];
            this.f116158C.f116386b = initResolution[1];
            if (this.f116226k > 0 && this.f116227l > 0) {
                mo107849C();
            }
            mo107933b(this.f116180aA);
        }
        return prepareEngine;
    }

    /* renamed from: k */
    public final void mo107970k() {
        synchronized (this) {
            if (this.f116228m != null) {
                C45372t.m143407c("VEEditor", "stop... ");
                this.f116228m.stop();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107974m() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.f116193ab = r0     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "onReleaseResource... "
            com.p280ss.android.vesdk.C45372t.m143407c(r0, r1)     // Catch:{ all -> 0x0079 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x0079 }
            long r0 = r0.getNativeHandler()     // Catch:{ all -> 0x0079 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0019
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            return
        L_0x0019:
            int r0 = r5.f116214ax     // Catch:{ all -> 0x0079 }
            r1 = 1
            if (r0 != r1) goto L_0x0022
            r0 = 3
            com.p280ss.android.ttve.monitor.C20479f.m67966b(r0)     // Catch:{ all -> 0x0079 }
        L_0x0022:
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x0079 }
            r0.releasePreviewSurface()     // Catch:{ all -> 0x0079 }
            android.view.SurfaceView r0 = r5.f116173U     // Catch:{ all -> 0x0079 }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            android.view.SurfaceView r0 = r5.f116173U     // Catch:{ all -> 0x0079 }
            android.view.SurfaceHolder r0 = r0.getHolder()     // Catch:{ all -> 0x0079 }
            android.view.SurfaceHolder$Callback2 r2 = r5.f116183aD     // Catch:{ all -> 0x0079 }
            r0.removeCallback(r2)     // Catch:{ all -> 0x0079 }
            goto L_0x004b
        L_0x0038:
            android.view.TextureView r0 = r5.f116174V     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x004b
            android.view.TextureView r0 = r5.f116174V     // Catch:{ all -> 0x0079 }
            android.view.TextureView$SurfaceTextureListener r0 = r0.getSurfaceTextureListener()     // Catch:{ all -> 0x0079 }
            android.view.TextureView$SurfaceTextureListener r2 = r5.f116182aC     // Catch:{ all -> 0x0079 }
            if (r0 != r2) goto L_0x004b
            android.view.TextureView r0 = r5.f116174V     // Catch:{ all -> 0x0079 }
            r0.setSurfaceTextureListener(r1)     // Catch:{ all -> 0x0079 }
        L_0x004b:
            r5.f116173U = r1     // Catch:{ all -> 0x0079 }
            r5.f116174V = r1     // Catch:{ all -> 0x0079 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0062
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x0079 }
            r0.setOpenGLListeners(r1)     // Catch:{ all -> 0x0079 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x0079 }
            r0.setInfoListener(r1)     // Catch:{ all -> 0x0079 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x0079 }
            r0.setErrorListener(r1)     // Catch:{ all -> 0x0079 }
        L_0x0062:
            r5.f116179a = r1     // Catch:{ all -> 0x0079 }
            android.graphics.Bitmap r0 = r5.f116210at     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            android.graphics.Bitmap r0 = r5.f116210at     // Catch:{ all -> 0x0079 }
            boolean r0 = r0.isRecycled()     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x0077
            android.graphics.Bitmap r0 = r5.f116210at     // Catch:{ all -> 0x0079 }
            r0.recycle()     // Catch:{ all -> 0x0079 }
            r5.f116210at = r1     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            return
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.mo107974m():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107976n() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.f116193ab = r0     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "onDestroy... "
            com.p280ss.android.vesdk.C45372t.m143407c(r0, r1)     // Catch:{ all -> 0x007c }
            m142462A()     // Catch:{ all -> 0x007c }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x007c }
            long r0 = r0.getNativeHandler()     // Catch:{ all -> 0x007c }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x001c
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x001c:
            int r0 = r5.f116214ax     // Catch:{ all -> 0x007c }
            r1 = 1
            if (r0 != r1) goto L_0x0025
            r0 = 3
            com.p280ss.android.ttve.monitor.C20479f.m67966b(r0)     // Catch:{ all -> 0x007c }
        L_0x0025:
            android.view.SurfaceView r0 = r5.f116173U     // Catch:{ all -> 0x007c }
            r1 = 0
            if (r0 == 0) goto L_0x0036
            android.view.SurfaceView r0 = r5.f116173U     // Catch:{ all -> 0x007c }
            android.view.SurfaceHolder r0 = r0.getHolder()     // Catch:{ all -> 0x007c }
            android.view.SurfaceHolder$Callback2 r2 = r5.f116183aD     // Catch:{ all -> 0x007c }
            r0.removeCallback(r2)     // Catch:{ all -> 0x007c }
            goto L_0x0049
        L_0x0036:
            android.view.TextureView r0 = r5.f116174V     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0049
            android.view.TextureView r0 = r5.f116174V     // Catch:{ all -> 0x007c }
            android.view.TextureView$SurfaceTextureListener r0 = r0.getSurfaceTextureListener()     // Catch:{ all -> 0x007c }
            android.view.TextureView$SurfaceTextureListener r2 = r5.f116182aC     // Catch:{ all -> 0x007c }
            if (r0 != r2) goto L_0x0049
            android.view.TextureView r0 = r5.f116174V     // Catch:{ all -> 0x007c }
            r0.setSurfaceTextureListener(r1)     // Catch:{ all -> 0x007c }
        L_0x0049:
            r5.f116173U = r1     // Catch:{ all -> 0x007c }
            r5.f116174V = r1     // Catch:{ all -> 0x007c }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0065
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x007c }
            r0.setOpenGLListeners(r1)     // Catch:{ all -> 0x007c }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x007c }
            r0.setInfoListener(r1)     // Catch:{ all -> 0x007c }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x007c }
            r0.setErrorListener(r1)     // Catch:{ all -> 0x007c }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x007c }
            r0.destroyEngine()     // Catch:{ all -> 0x007c }
        L_0x0065:
            r5.f116179a = r1     // Catch:{ all -> 0x007c }
            android.graphics.Bitmap r0 = r5.f116210at     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x007a
            android.graphics.Bitmap r0 = r5.f116210at     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isRecycled()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x007a
            android.graphics.Bitmap r0 = r5.f116210at     // Catch:{ all -> 0x007c }
            r0.recycle()     // Catch:{ all -> 0x007c }
            r5.f116210at = r1     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.mo107976n():void");
    }

    /* renamed from: p */
    public final int mo107980p() throws VEException {
        C45372t.m143407c("VEEditor", "genReverseVideo");
        if (this.f116179a.f116797b == null || this.f116179a.f116797b.length <= 0) {
            C45372t.m143409d("VEEditor", "genReverseVideo error:invalid videoPaths");
            return -100;
        }
        m142462A();
        long currentTimeMillis = System.currentTimeMillis();
        FFMpegInvoker fFMpegInvoker = new FFMpegInvoker();
        this.f116179a.f116800e = new String[this.f116179a.f116797b.length];
        for (int i = 0; i < this.f116179a.f116797b.length; i++) {
            String a = this.f116179a.mo108562a(i);
            int addFastReverseVideo = fFMpegInvoker.addFastReverseVideo(this.f116179a.f116797b[i], a);
            if (this.f116195ad) {
                C45372t.m143407c("VEEditor", "genReverseVideo fail: cancel reverse");
                this.f116195ad = false;
                return -1;
            }
            if (addFastReverseVideo != 0) {
                if (addFastReverseVideo == -4) {
                    C45372t.m143409d("VEEditor", "genReverseVideo fail: not video (-4)");
                } else {
                    StringBuilder sb = new StringBuilder("reverse mResManager.mVideoPaths[i] failed: ");
                    sb.append(addFastReverseVideo);
                    throw new VEException(-1, sb.toString());
                }
            }
            this.f116179a.f116800e[i] = a;
        }
        this.f116179a.f116802g = true;
        C20479f.m67948a(1, "te_edit_reverse_time", System.currentTimeMillis() - currentTimeMillis);
        return 0;
    }

    /* renamed from: c */
    public final void mo107941c() {
        long j;
        long j2;
        boolean b = this.f116205an.mo55145b();
        String str = "te_composition_effect_add";
        long j3 = 1;
        if (b) {
            j = 0;
        } else {
            j = 1;
        }
        C20479f.m67948a(1, str, j);
        if (!b) {
            C20479f.m67949a(1, "te_composition_effect_json", this.f116205an.mo55141a(0));
        }
        boolean c = this.f116205an.mo55146c();
        String str2 = "te_composition_info_sticker_add";
        if (c) {
            j2 = 0;
        } else {
            j2 = 1;
        }
        C20479f.m67948a(1, str2, j2);
        if (!c) {
            C20479f.m67949a(1, "te_composition_info_sticker_json", this.f116205an.mo55141a(1));
        }
        String str3 = "te_composition_brush_add";
        if (m142466K()) {
            j3 = 0;
        }
        C20479f.m67948a(1, str3, j3);
        this.f116205an.mo55142a();
        C20479f.m67949a(1, "iesve_veeditor_composition_finish_file", this.f116159D);
        C20479f.m67949a(1, "iesve_veeditor_composition_finish_result", "fail");
        C20479f.m67949a(1, "iesve_veeditor_composition_finish_reason", "");
        C20479f.m67966b(1);
    }

    /* renamed from: b */
    public final int mo107927b(String str) {
        return m142491c(str, 1.0f);
    }

    /* renamed from: e */
    public final int mo107947e(int i) {
        return m142486b(i, false);
    }

    /* renamed from: h */
    public final void mo107961h(boolean z) {
        this.f116228m.setDleEnabled(z);
    }

    /* renamed from: i */
    public final void mo107964i(boolean z) {
        this.f116228m.setDleEnabledPreview(z);
    }

    /* renamed from: j */
    public final void mo107968j(boolean z) {
        this.f116228m.setDldEnabled(z);
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C45372t.m143410e("VEEditor", "onFrameAvailable...");
    }

    /* renamed from: s */
    public final void mo107986s(int i) {
        this.f116228m.setDldThrVal(i);
    }

    /* renamed from: c */
    public final int mo107939c(boolean z) {
        return this.f116228m.enableEffectAmazing(z);
    }

    /* renamed from: d */
    public final void mo107946d(boolean z) {
        C45372t.m143403a("VEEditor", "setLoopPlay");
        this.f116228m.setLooping(z);
    }

    /* renamed from: g */
    public final void mo107958g(boolean z) {
        C45372t.m143403a("VEEditor", "setSurfaceReDraw...");
        this.f116207aq = z;
        if (!z) {
            this.f116210at = null;
        }
    }

    /* renamed from: a */
    private int m142471a(VEEditorModel vEEditorModel) {
        this.f116196ae = vEEditorModel.f116323k;
        this.f116200ai = vEEditorModel.f116324l;
        this.f116171S = vEEditorModel.f116321i;
        return 0;
    }

    /* renamed from: b */
    public static int m142489b(boolean z) {
        StringBuilder sb = new StringBuilder("setEnableEffectTransition: ");
        sb.append(false);
        C45372t.m143403a("VEEditor", sb.toString());
        return TEInterface.setEnableEffectTransition(false);
    }

    /* renamed from: k */
    private int m142492k(boolean z) {
        int pause;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("pause... refreshFrame:");
            sb.append(false);
            C45372t.m143407c(str, sb.toString());
            pause = this.f116228m.pause();
        }
        return pause;
    }

    /* renamed from: v */
    private void m142493v(int i) {
        StringBuilder sb = new StringBuilder("setVideoBackgroudColor... color:");
        sb.append(i);
        C45372t.m143403a("VEEditor", sb.toString());
        this.f116181aB = i;
        this.f116228m.setVideoBackGroundColor(i);
    }

    /* renamed from: x */
    private int m142495x(int i) {
        StringBuilder sb = new StringBuilder("expandTimeline: ");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        return this.f116228m.expandTimeline(i);
    }

    /* renamed from: d */
    public final void mo107944d(int i) {
        this.f116214ax = i;
        StringBuilder sb = new StringBuilder("setPageMode: ");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        this.f116228m.setPageMode(i);
    }

    /* renamed from: f */
    public final boolean mo107954f(int i) {
        boolean isInfoStickerAnimatable;
        synchronized (this) {
            C45372t.m143403a("VEEditor", "isInfoStickerAnimatable...");
            isInfoStickerAnimatable = this.f116228m.isInfoStickerAnimatable(i);
        }
        return isInfoStickerAnimatable;
    }

    /* renamed from: q */
    public final int mo107982q(int i) {
        StringBuilder sb = new StringBuilder("setPreviewFps = ");
        sb.append(i);
        C45372t.m143403a("VEEditor", sb.toString());
        this.f116228m.setPreviewFps(i);
        return 0;
    }

    /* renamed from: d */
    public final int mo107942d(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        StringBuilder sb = new StringBuilder("checkScoresFile filePath:");
        sb.append(str);
        C45372t.m143407c("VEEditor", sb.toString());
        int checkScoresFile = this.f116228m.checkScoresFile(str);
        if (checkScoresFile == 0) {
            return checkScoresFile;
        }
        StringBuilder sb2 = new StringBuilder("setMusicCropRatio failed, ret = ");
        sb2.append(checkScoresFile);
        C45372t.m143409d("VEEditor", sb2.toString());
        return checkScoresFile;
    }

    /* renamed from: g */
    public final int mo107955g(int i) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("removeInfoSticker... index: ");
            sb.append(i);
            C45372t.m143403a(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            this.f116205an.mo55143a(1, i);
            int removeInfoSticker = this.f116228m.removeInfoSticker(i);
            return removeInfoSticker;
        }
    }

    /* renamed from: i */
    public final float[] mo107965i(int i) throws VEException {
        float[] infoStickerBoundingBox;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("getInfoStickerBoundingBox... index:");
            sb.append(i);
            C45372t.m143405b(str, sb.toString());
            if (i >= 0) {
                infoStickerBoundingBox = this.f116228m.getInfoStickerBoundingBox(i, false);
            } else {
                throw new VEException(-100, "");
            }
        }
        return infoStickerBoundingBox;
    }

    /* renamed from: j */
    public final int mo107967j(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin beginInfoStickerPin... index:");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int beginInfoStickerPin = this.f116228m.beginInfoStickerPin(i);
                if (beginInfoStickerPin >= 0) {
                    return beginInfoStickerPin;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin beginInfoStickerPin... faild ret:");
                sb2.append(beginInfoStickerPin);
                C45372t.m143409d("VEEditor", sb2.toString());
                return beginInfoStickerPin;
            }
        }
    }

    /* renamed from: k */
    public final int mo107969k(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin cancelInfoStickerPin... index:");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int cancelInfoStickerPin = this.f116228m.cancelInfoStickerPin(i);
                if (cancelInfoStickerPin >= 0) {
                    return cancelInfoStickerPin;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin cancelInfoStickerPin... faild ret:");
                sb2.append(cancelInfoStickerPin);
                C45372t.m143409d("VEEditor", sb2.toString());
                return cancelInfoStickerPin;
            }
        }
    }

    /* renamed from: l */
    public final int mo107971l(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin setInfoStickerRestoreMode... index:");
        sb.append(i);
        C45372t.m143403a("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                int infoStickerRestoreMode = this.f116228m.setInfoStickerRestoreMode(i);
                if (infoStickerRestoreMode >= 0) {
                    return infoStickerRestoreMode;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin setInfoStickerRestoreMode... faild ret:");
                sb2.append(infoStickerRestoreMode);
                C45372t.m143407c("VEEditor", sb2.toString());
                return infoStickerRestoreMode;
            }
        }
    }

    /* renamed from: m */
    public final float mo107973m(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin getInfoStickerScale... index:");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100.0f;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                float infoStickerScale = this.f116228m.getInfoStickerScale(i);
                if (infoStickerScale >= 0.0f) {
                    return infoStickerScale;
                }
                StringBuilder sb2 = new StringBuilder("infoStickerPin getInfoStickerScale... faild ret:");
                sb2.append(infoStickerScale);
                C45372t.m143409d("VEEditor", sb2.toString());
                return infoStickerScale;
            }
        }
    }

    /* renamed from: n */
    public final float mo107975n(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin getInfoStickerRotate... index:");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return -100.0f;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                float infoStickerRotate = this.f116228m.getInfoStickerRotate(i);
                StringBuilder sb2 = new StringBuilder("infoStickerPin getInfoStickerRotate... ret:");
                sb2.append(infoStickerRotate);
                C45372t.m143403a("VEEditor", sb2.toString());
                return infoStickerRotate;
            }
        }
    }

    /* renamed from: u */
    public final int mo107991u(int i) {
        StringBuilder sb = new StringBuilder("cancelGenVideoFrame index: ");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        this.f116223h.put(Integer.valueOf(i), Boolean.valueOf(false));
        this.f116165J = 0;
        return 0;
    }

    /* renamed from: c */
    public static int m142490c(int i) {
        StringBuilder sb = new StringBuilder("setOptConfig... ");
        sb.append(i);
        C45372t.m143403a("VEEditor", sb.toString());
        C45251ab.m142753a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("config", i);
            C20469a.m67906a("vesdk_event_editor_opt_config", jSONObject, "performance");
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("report optConfig json err ");
            sb2.append(e);
            C45372t.m143409d("VEEditor", sb2.toString());
        }
        return TEInterface.setEnableOpt(i);
    }

    /* renamed from: o */
    public final boolean mo107978o(int i) {
        StringBuilder sb = new StringBuilder("infoStickerPin getInfoStickerVisible... index:");
        sb.append(i);
        C45372t.m143407c("VEEditor", sb.toString());
        synchronized (this) {
            if (i < 0) {
                try {
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                boolean infoStickerVisible = this.f116228m.getInfoStickerVisible(i);
                StringBuilder sb2 = new StringBuilder("infoStickerPin  getInfoStickerVisible... ret:");
                sb2.append(infoStickerVisible);
                C45372t.m143403a("VEEditor", sb2.toString());
                return infoStickerVisible;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        return r6;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo107981p(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "deleteRepeatEffect... "
            r1.<init>(r2)     // Catch:{ all -> 0x0065 }
            r1.append(r6)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0065 }
            com.p280ss.android.vesdk.C45372t.m143407c(r0, r1)     // Catch:{ all -> 0x0065 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x0065 }
            int r0 = r0.getCurState()     // Catch:{ all -> 0x0065 }
            r1 = -20000(0xffffffffffffb1e0, float:NaN)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x002c
            com.ss.android.ttve.nativePort.TEInterface r1 = r5.f116228m     // Catch:{ all -> 0x0065 }
            int r1 = r1.stop()     // Catch:{ all -> 0x0065 }
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0049
            r4 = -101(0xffffffffffffff9b, float:NaN)
            if (r1 == r4) goto L_0x0049
            java.lang.String r6 = "VEEditor"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "pauseSync failed, ret "
            r0.<init>(r2)     // Catch:{ all -> 0x0065 }
            r0.append(r1)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0065 }
            com.p280ss.android.vesdk.C45372t.m143403a(r6, r0)     // Catch:{ all -> 0x0065 }
            r6 = -1
            monitor-exit(r5)     // Catch:{ all -> 0x0065 }
            return r6
        L_0x0049:
            com.ss.android.ttve.nativePort.TEInterface r1 = r5.f116228m     // Catch:{ all -> 0x0065 }
            int[] r2 = new int[r2]     // Catch:{ all -> 0x0065 }
            r2[r3] = r6     // Catch:{ all -> 0x0065 }
            int r6 = r1.removeFilter(r2)     // Catch:{ all -> 0x0065 }
            com.ss.android.ttve.monitor.g r1 = r5.f116205an     // Catch:{ all -> 0x0065 }
            r1.f55349c = r3     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0063
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x0065 }
            r0.createTimeline()     // Catch:{ all -> 0x0065 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r5.f116228m     // Catch:{ all -> 0x0065 }
            r0.prepareEngine(r3)     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r5)     // Catch:{ all -> 0x0065 }
            return r6
        L_0x0065:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0065 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.mo107981p(int):int");
    }

    /* renamed from: r */
    public final int mo107984r(int i) {
        boolean z;
        int i2;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("deleteSlowEffect... ");
            sb.append(i);
            C45372t.m143407c(str, sb.toString());
            if (this.f116228m.getCurState() != -20000) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = this.f116228m.stop();
            } else {
                i2 = 0;
            }
            if (i2 == 0 || i2 == -101) {
                int removeFilter = this.f116228m.removeFilter(new int[]{i});
                if (z) {
                    this.f116228m.createTimeline();
                    this.f116228m.prepareEngine(0);
                }
                this.f116205an.f55349c = 0;
                return removeFilter;
            }
            StringBuilder sb2 = new StringBuilder("pauseSync failed, ret ");
            sb2.append(i2);
            C45372t.m143407c("VEEditor", sb2.toString());
            return -1;
        }
    }

    /* renamed from: t */
    public final int mo107989t(int i) {
        synchronized (this) {
            this.f116228m.stop();
            StringBuilder sb = new StringBuilder("removeMusic index: ");
            sb.append(i);
            C45372t.m143407c("VEEditor", sb.toString());
            int removeMusic = this.f116228m.removeMusic(i);
            if (removeMusic != 0) {
                StringBuilder sb2 = new StringBuilder("removeMusic failed, ret = ");
                sb2.append(removeMusic);
                C45372t.m143409d("VEEditor", sb2.toString());
                return removeMusic;
            }
            this.f116228m.prepareEngine(0);
            return 0;
        }
    }

    /* renamed from: w */
    private int m142494w(int i) {
        Exception e;
        VEState vEState;
        if (!f116152K) {
            return 0;
        }
        m142493v(this.f116181aB);
        if (this.f116221f == null) {
            return this.f116228m.prepareEngine(0);
        }
        VEState vEState2 = VEState.ERROR;
        try {
            vEState = mo107977o();
            try {
                int x = mo107994x();
                int prepareEngine = this.f116228m.prepareEngine(0);
                if (prepareEngine != 0) {
                    StringBuilder sb = new StringBuilder("prepareEngine error: ");
                    sb.append(prepareEngine);
                    C45372t.m143409d("VEEditor", sb.toString());
                    this.f116221f.onCallback(4120, vEState.ordinal(), (float) x, null);
                    return prepareEngine;
                }
                int[] initResolution = this.f116228m.getInitResolution();
                this.f116158C.f116385a = initResolution[0];
                this.f116158C.f116386b = initResolution[1];
                if (this.f116226k > 0 && this.f116227l > 0) {
                    mo107849C();
                }
                this.f116221f.onCallback(4120, vEState.ordinal(), (float) x, null);
                return 0;
            } catch (Exception e2) {
                e = e2;
                StringBuilder sb2 = new StringBuilder("prepareWithCallback error: ");
                sb2.append(e);
                C45372t.m143409d("VEEditor", sb2.toString());
                this.f116221f.onCallback(4120, vEState.ordinal(), 0.0f, null);
                return -1;
            }
        } catch (Exception e3) {
            vEState = vEState2;
            e = e3;
            StringBuilder sb22 = new StringBuilder("prepareWithCallback error: ");
            sb22.append(e);
            C45372t.m143409d("VEEditor", sb22.toString());
            this.f116221f.onCallback(4120, vEState.ordinal(), 0.0f, null);
            return -1;
        }
    }

    /* renamed from: e */
    public final synchronized void mo107950e(boolean z) {
        String str = "VEEditor";
        StringBuilder sb = new StringBuilder("enableSimpleProcessor: ");
        sb.append(String.valueOf(z));
        C45372t.m143403a(str, sb.toString());
        this.f116228m.enableSimpleProcessor(z);
    }

    /* renamed from: h */
    public final float[] mo107962h(int i) throws VEException {
        float[] infoStickerBoundingBox;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("getInfoStickerBoundingBox... index: ");
            sb.append(i);
            C45372t.m143405b(str, sb.toString());
            if (i >= 0) {
                infoStickerBoundingBox = this.f116228m.getInfoStickerBoundingBox(i);
            } else {
                throw new VEException(-100, "");
            }
        }
        return infoStickerBoundingBox;
    }

    public VEEditor(String str) throws VEException {
        if (!TextUtils.isEmpty(str)) {
            this.f116228m = TEInterface.createEngine();
            this.f116179a = new C45345b(str);
            this.f116228m.setInfoListener(this.f116166N);
            this.f116228m.setErrorListener(this.f116167O);
            C20477e.m67936a("iesve_veeditor_offscreen", 1, (C45306a) null);
            mo107939c(false);
            return;
        }
        StringBuilder sb = new StringBuilder("workspace is: ");
        sb.append(str);
        throw new VEException(-100, sb.toString());
    }

    /* renamed from: c */
    public final int mo107938c(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        StringBuilder sb = new StringBuilder("setInterimScoresToFile filePath:");
        sb.append(str);
        C45372t.m143407c("VEEditor", sb.toString());
        int interimScoresToFile = this.f116228m.setInterimScoresToFile(str);
        if (interimScoresToFile == 0) {
            return interimScoresToFile;
        }
        StringBuilder sb2 = new StringBuilder("setMusicCropRatio failed, ret = ");
        sb2.append(interimScoresToFile);
        C45372t.m143409d("VEEditor", sb2.toString());
        return interimScoresToFile;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        return 0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo107952f(boolean r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            monitor-enter(r18)
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "enableReversePlay:"
            r3.<init>(r4)     // Catch:{ all -> 0x012c }
            r3.append(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012c }
            com.p280ss.android.vesdk.C45372t.m143407c(r2, r3)     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            boolean r2 = r2.f116802g     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x0029
            java.lang.String r0 = "VEEditor"
            java.lang.String r2 = "enableReversePlay error: reverse video is not ready!"
            com.p280ss.android.vesdk.C45372t.m143409d(r0, r2)     // Catch:{ all -> 0x012c }
            r0 = -100
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r0
        L_0x0029:
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0121
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f116800e     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0121
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f116800e     // Catch:{ all -> 0x012c }
            int r2 = r2.length     // Catch:{ all -> 0x012c }
            if (r2 > 0) goto L_0x003c
            goto L_0x0121
        L_0x003c:
            m142462A()     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f116228m     // Catch:{ all -> 0x012c }
            long r7 = r2.getDurationUs()     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f116228m     // Catch:{ all -> 0x012c }
            r2.stop()     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0051
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f116800e     // Catch:{ all -> 0x012c }
            goto L_0x0055
        L_0x0051:
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f116797b     // Catch:{ all -> 0x012c }
        L_0x0055:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x012c }
            r9 = 0
            int r2 = r3.updateTrackClips(r9, r9, r2)     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x0073
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "Create Scene failed, ret = "
            r3.<init>(r4)     // Catch:{ all -> 0x012c }
            r3.append(r2)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012c }
            com.p280ss.android.vesdk.C45372t.m143409d(r0, r3)     // Catch:{ all -> 0x012c }
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r2
        L_0x0073:
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f116801f     // Catch:{ all -> 0x012c }
            r10 = 1
            if (r2 == 0) goto L_0x00cd
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            int r2 = r2.f116804i     // Catch:{ all -> 0x012c }
            if (r2 == r10) goto L_0x00cd
            com.ss.android.ttve.nativePort.TEInterface r11 = r1.f116228m     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            java.lang.String[] r2 = r2.f116801f     // Catch:{ all -> 0x012c }
            r12 = r2[r9]     // Catch:{ all -> 0x012c }
            r13 = 0
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f116228m     // Catch:{ all -> 0x012c }
            int r14 = r2.getDuration()     // Catch:{ all -> 0x012c }
            r15 = 0
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f116228m     // Catch:{ all -> 0x012c }
            int r16 = r2.getDuration()     // Catch:{ all -> 0x012c }
            r17 = 0
            int r2 = r11.addAudioTrack(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r3 = r1.f116179a     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.common.k r4 = r1.f116160E     // Catch:{ all -> 0x012c }
            int r2 = r4.mo55060a(r10, r2)     // Catch:{ all -> 0x012c }
            r3.f116803h = r2     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r2 = r1.f116179a     // Catch:{ all -> 0x012c }
            r2.f116804i = r10     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "add org audio track index "
            r3.<init>(r4)     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r4 = r1.f116179a     // Catch:{ all -> 0x012c }
            int r4 = r4.f116803h     // Catch:{ all -> 0x012c }
            r3.append(r4)     // Catch:{ all -> 0x012c }
            java.lang.String r4 = " type "
            r3.append(r4)     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.runtime.b r4 = r1.f116179a     // Catch:{ all -> 0x012c }
            int r4 = r4.f116804i     // Catch:{ all -> 0x012c }
            r3.append(r4)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012c }
            com.p280ss.android.vesdk.C45372t.m143409d(r2, r3)     // Catch:{ all -> 0x012c }
        L_0x00cd:
            com.ss.android.ttve.nativePort.TEInterface r3 = r1.f116228m     // Catch:{ all -> 0x012c }
            r4 = 0
            r5 = 0
            boolean r2 = r1.f116204am     // Catch:{ all -> 0x012c }
            if (r0 == r2) goto L_0x00d7
            r6 = 1
            goto L_0x00d8
        L_0x00d7:
            r6 = 0
        L_0x00d8:
            r3.updateTrackFilterDuration(r4, r5, r6, r7)     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f116228m     // Catch:{ all -> 0x012c }
            r2.createTimeline()     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.nativePort.TEInterface r2 = r1.f116228m     // Catch:{ all -> 0x012c }
            int r2 = r2.prepareEngine(r9)     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x00fd
            java.lang.String r0 = "VEEditor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "enableReversePlay() prepareEngine failed: result: "
            r3.<init>(r4)     // Catch:{ all -> 0x012c }
            r3.append(r2)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012c }
            com.p280ss.android.vesdk.C45372t.m143409d(r0, r3)     // Catch:{ all -> 0x012c }
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r2
        L_0x00fd:
            r2 = -1
            r1.f116197af = r2     // Catch:{ all -> 0x012c }
            com.ss.android.vesdk.VEEditor$SEEK_MODE r2 = com.p280ss.android.vesdk.VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek     // Catch:{ all -> 0x012c }
            r1.mo107871a(r9, r2)     // Catch:{ all -> 0x012c }
            r1.f116204am = r0     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x011f
            com.ss.android.vesdk.d.a r0 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x012c }
            r0.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "iesve_veeditor_time_effect_id"
            java.lang.String r3 = "reverse"
            r0.mo108381a(r2, r3)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "iesve_veeditor_time_effect"
            com.p280ss.android.ttve.monitor.C20477e.m67936a(r2, r10, r0)     // Catch:{ all -> 0x012c }
            com.ss.android.ttve.monitor.g r0 = r1.f116205an     // Catch:{ all -> 0x012c }
            r2 = 3
            r0.f55349c = r2     // Catch:{ all -> 0x012c }
        L_0x011f:
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r9
        L_0x0121:
            java.lang.String r0 = "VEEditor"
            java.lang.String r2 = "enableReversePlay error: reverse video path is invalid!"
            com.p280ss.android.vesdk.C45372t.m143409d(r0, r2)     // Catch:{ all -> 0x012c }
            r0 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            return r0
        L_0x012c:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x012c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.mo107952f(boolean):int");
    }

    /* renamed from: c */
    public final int mo107940c(int[] iArr) {
        int removeFilter;
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("deleteAudioFilter...");
            sb.append(iArr[0]);
            C45372t.m143407c(str, sb.toString());
            removeFilter = this.f116228m.removeFilter(iArr);
        }
        return removeFilter;
    }

    /* renamed from: c */
    private int m142491c(String str, float f) {
        return m142469a(1, str, 1.0f);
    }

    /* renamed from: a */
    public final int mo107887a(String str, float f) {
        return m142472a(str, f, false, false);
    }

    /* renamed from: b */
    private int m142486b(int i, boolean z) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("deleteAudioTrack... trackIndex:");
            sb.append(i);
            sb.append(" needPrepare:false");
            C45372t.m143407c(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int c = this.f116160E.mo55063c(1, i);
            this.f116160E.mo55062b(1, i);
            int deleteAudioTrack = this.f116228m.deleteAudioTrack(c, false);
            return deleteAudioTrack;
        }
    }

    /* renamed from: c */
    public final int mo107936c(int i, float f) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerAlpha... index: ");
            sb.append(i);
            sb.append("alpha: ");
            sb.append(f);
            C45372t.m143405b(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f116228m.setFilterParam(i, "entity alpha", String.valueOf(f));
            return filterParam;
        }
    }

    /* renamed from: b */
    public final int mo107921b(int i, float f) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerScale... index: ");
            sb.append(i);
            sb.append("scale: ");
            sb.append(f);
            C45372t.m143405b(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f116228m.setFilterParam(i, "entity scale x", String.valueOf(f)) + this.f116228m.setFilterParam(i, "entity scale y", String.valueOf(f));
            return filterParam;
        }
    }

    /* renamed from: d */
    public final void mo107945d(int i, int i2) {
        StringBuilder sb = new StringBuilder("setWidthHeight... width:");
        sb.append(i);
        sb.append(", height:");
        sb.append(i2);
        C45372t.m143403a("VEEditor", sb.toString());
        this.f116228m.setWidthHeight(i, i2);
    }

    /* renamed from: e */
    public final void mo107949e(int i, int i2) {
        StringBuilder sb = new StringBuilder("setMaxWidthHeight... width:");
        sb.append(i);
        sb.append(", height:");
        sb.append(i2);
        C45372t.m143403a("VEEditor", sb.toString());
        this.f116228m.setMaxWidthHeight(i, i2);
    }

    /* renamed from: g */
    public final int mo107956g(int i, int i2) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerLayer... index: ");
            sb.append(i);
            sb.append("layer: ");
            sb.append(i2);
            C45372t.m143405b(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            int filterParam = this.f116228m.setFilterParam(i, "entity layer", String.valueOf(i2));
            return filterParam;
        }
    }

    /* renamed from: h */
    public final int mo107959h(int i, int i2) {
        StringBuilder sb = new StringBuilder("disableFilterEffect... ");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        C45372t.m143407c("VEEditor", sb.toString());
        if (i < 0 || i2 < 0) {
            return -100;
        }
        C20481a aVar = (C20481a) this.f116205an.f55347a.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.f55352c = i2 - aVar.f55351b;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("outPoint", i2);
            jSONObject.put("effectIndex", i);
            C20469a.m67906a("vesdk_event_editor_filter_effect_end", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116228m.adjustFilterInOut(i, -1, i2);
    }

    /* renamed from: c */
    public final int mo107937c(int i, int i2) {
        int prepareEngine;
        synchronized (this) {
            C45306a aVar = new C45306a();
            aVar.mo108380a("iesve_veeditor_cut_duration", i2 - i);
            C20477e.m67936a("iesve_veeditor_cut_duration", 1, aVar);
            StringBuilder sb = new StringBuilder("setInOut... ");
            sb.append(i);
            sb.append(" ");
            sb.append(i2);
            C45372t.m143403a("VEEditor", sb.toString());
            this.f116228m.stop();
            this.f116228m.setTimeRange(i, i2, 0);
            prepareEngine = this.f116228m.prepareEngine(0);
        }
        return prepareEngine;
    }

    /* renamed from: f */
    public final int mo107951f(int i, int i2) {
        synchronized (this) {
            C45372t.m143405b("VEEditor", "setSrtColor");
            if (i < 0) {
                return -100;
            }
            C45372t.m143409d("VEEditor", "");
            int i3 = (i2 >>> 24) & NormalGiftView.ALPHA_255;
            int i4 = (i2 >>> 16) & NormalGiftView.ALPHA_255;
            int i5 = (i2 >>> 8) & NormalGiftView.ALPHA_255;
            int i6 = i2 & NormalGiftView.ALPHA_255;
            StringBuilder sb = new StringBuilder("aa=");
            sb.append(i3);
            sb.append(", rr=");
            sb.append(i4);
            sb.append(", gg=");
            sb.append(i5);
            sb.append(", bb=");
            sb.append(i6);
            C45372t.m143409d("VEEditor", sb.toString());
            float f = ((float) i3) * 0.003921569f;
            float f2 = ((float) i4) * 0.003921569f;
            float f3 = ((float) i5) * 0.003921569f;
            float f4 = ((float) i6) * 0.003921569f;
            StringBuilder sb2 = new StringBuilder("a=");
            sb2.append(f);
            sb2.append(", r=");
            sb2.append(f2);
            sb2.append(", g=");
            sb2.append(f3);
            sb2.append(", b=");
            sb2.append(f4);
            C45372t.m143409d("VEEditor", sb2.toString());
            return this.f116228m.setFilterParam(i, "entity srt color a", String.valueOf(f)) + this.f116228m.setFilterParam(i, "entity srt color r", String.valueOf(f2)) + this.f116228m.setFilterParam(i, "entity srt color g", String.valueOf(f3)) + this.f116228m.setFilterParam(i, "entity srt color b", String.valueOf(f4));
        }
    }

    public VEEditor(String str, SurfaceView surfaceView) {
        if (!TextUtils.isEmpty(str)) {
            C45372t.m143403a("VEEditor", "VEEditor surfaceView");
            this.f116228m = TEInterface.createEngine();
            this.f116179a = new C45345b(str);
            this.f116173U = surfaceView;
            surfaceView.getHolder().addCallback(this.f116183aD);
            this.f116228m.setOpenGLListeners(this.f116184aE);
            this.f116228m.setInfoListener(this.f116166N);
            this.f116228m.setErrorListener(this.f116167O);
            mo107939c(false);
            return;
        }
        StringBuilder sb = new StringBuilder("workspace is: ");
        sb.append(str);
        throw new VEException(-100, sb.toString());
    }

    /* renamed from: b */
    private int m142485b(int i, int i2, SET_RANGE_MODE set_range_mode) {
        int timeRange;
        synchronized (this) {
            timeRange = this.f116228m.setTimeRange(i, i2, set_range_mode.getValue());
        }
        return timeRange;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m142469a(int r5, java.lang.String r6, float r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r5 = r4.f116200ai     // Catch:{ all -> 0x0062 }
            if (r5 >= 0) goto L_0x0009
            r5 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            return r5
        L_0x0009:
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0013
            if (r6 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r7
            goto L_0x0015
        L_0x0013:
            java.lang.String r6 = ""
        L_0x0015:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x001d:
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f116228m     // Catch:{ all -> 0x0062 }
            int r0 = r4.f116200ai     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "effect hdr type"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r2.<init>()     // Catch:{ all -> 0x0062 }
            r3 = 1
            r2.append(r3)     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0062 }
            r7.setFilterParam(r0, r1, r2)     // Catch:{ all -> 0x0062 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f116228m     // Catch:{ all -> 0x0062 }
            int r0 = r4.f116200ai     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "effect res path"
            r7.setFilterParam(r0, r1, r6)     // Catch:{ all -> 0x0062 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f116228m     // Catch:{ all -> 0x0062 }
            int r0 = r4.f116200ai     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "effect hdr intensity"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r2.<init>()     // Catch:{ all -> 0x0062 }
            r2.append(r5)     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0062 }
            r7.setFilterParam(r0, r1, r5)     // Catch:{ all -> 0x0062 }
            int r5 = r6.length()     // Catch:{ all -> 0x0062 }
            r6 = 0
            if (r5 <= 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            java.lang.String r5 = "iesve_veeditor_set_effect_hdr"
            r7 = 0
            com.p280ss.android.ttve.monitor.C20477e.m67936a(r5, r3, r7)     // Catch:{ all -> 0x0062 }
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            return r6
        L_0x0062:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.m142469a(int, java.lang.String, float):int");
    }

    /* renamed from: b */
    public final int mo107922b(int i, float f, float f2) {
        synchronized (this) {
            C45372t.m143405b("VEEditor", "setSrtInitialPosition");
            if (i < 0) {
                return -100;
            }
            return this.f116228m.setFilterParam(i, "entity srt initial position x", String.valueOf(f)) + this.f116228m.setFilterParam(i, "entity srt initial position y", String.valueOf(f2));
        }
    }

    public VEEditor(String str, SurfaceView surfaceView, long j) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("VEEditor surfaceView with handler:");
            sb.append(j);
            C45372t.m143403a("VEEditor", sb.toString());
            this.f116228m = TEInterface.createEngine(j);
            this.f116179a = new C45345b(str);
            this.f116173U = surfaceView;
            surfaceView.getHolder().addCallback(this.f116183aD);
            this.f116228m.setOpenGLListeners(this.f116184aE);
            this.f116228m.setInfoListener(this.f116166N);
            this.f116228m.setErrorListener(this.f116167O);
            mo107939c(false);
            return;
        }
        StringBuilder sb2 = new StringBuilder("workspace is: ");
        sb2.append(str);
        throw new VEException(-100, sb2.toString());
    }

    /* renamed from: b */
    public final int mo107923b(int i, int i2, int i3) {
        synchronized (this) {
            String str = "VEEditor";
            StringBuilder sb = new StringBuilder("setInfoStickerTime... index: ");
            sb.append(i);
            sb.append("startTime: ");
            sb.append(i2);
            sb.append("endTime: ");
            sb.append(i3);
            C45372t.m143403a(str, sb.toString());
            if (i < 0) {
                return -100;
            }
            C20481a aVar = (C20481a) this.f116205an.f55348b.get(Integer.valueOf(i));
            if (aVar != null) {
                aVar.f55351b = i2;
                aVar.f55352c = i3 - i2;
            }
            int filterParam = this.f116228m.setFilterParam(i, "entity start time", String.valueOf(i2)) + this.f116228m.setFilterParam(i, "entity end time", String.valueOf(i3));
            return filterParam;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:31|(2:33|(1:35))|36|37|38|39|40|41) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00fc */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m142472a(java.lang.String r5, float r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r7 = r4.f116196ae     // Catch:{ all -> 0x0102 }
            if (r7 >= 0) goto L_0x0009
            r5 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            return r5
        L_0x0009:
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x00fe
            if (r5 != 0) goto L_0x0012
            goto L_0x00fe
        L_0x0012:
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x001a:
            com.ss.android.ttve.model.d r0 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            if (r0 != 0) goto L_0x0025
            com.ss.android.ttve.model.d r0 = new com.ss.android.ttve.model.d     // Catch:{ all -> 0x0102 }
            r0.<init>()     // Catch:{ all -> 0x0102 }
            r4.f116201aj = r0     // Catch:{ all -> 0x0102 }
        L_0x0025:
            r0 = 0
            if (r8 != 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = r8.f55283a     // Catch:{ all -> 0x0102 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0102 }
            if (r8 == 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = r8.f55284b     // Catch:{ all -> 0x0102 }
            int r8 = r8.length()     // Catch:{ all -> 0x0102 }
            if (r8 != 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            float r8 = r8.f55286d     // Catch:{ all -> 0x0102 }
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            float r8 = r8.f55285c     // Catch:{ all -> 0x0102 }
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto L_0x0054
            com.ss.android.ttve.model.d r8 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            boolean r8 = r8.f55288f     // Catch:{ all -> 0x0102 }
            if (r8 != 0) goto L_0x0054
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            return r0
        L_0x0054:
            com.ss.android.ttve.model.d r8 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            r8.f55283a = r5     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r8 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = ""
            r8.f55284b = r1     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r8 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            r8.f55285c = r7     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r7 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            r7.f55286d = r6     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r7 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            r7.f55287e = r6     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r7 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            r7.f55288f = r0     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.model.d r7 = r4.f116201aj     // Catch:{ all -> 0x0102 }
            r7.f55289g = r0     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f116228m     // Catch:{ all -> 0x0102 }
            int r8 = r4.f116196ae     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "left filter"
            r7.setFilterParam(r8, r1, r5)     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f116228m     // Catch:{ all -> 0x0102 }
            int r8 = r4.f116196ae     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "use filter res intensity"
            java.lang.String r2 = "false"
            r7.setFilterParam(r8, r1, r2)     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f116228m     // Catch:{ all -> 0x0102 }
            int r8 = r4.f116196ae     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "left filter intensity"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r2.<init>()     // Catch:{ all -> 0x0102 }
            r2.append(r6)     // Catch:{ all -> 0x0102 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0102 }
            r7.setFilterParam(r8, r1, r2)     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f116228m     // Catch:{ all -> 0x0102 }
            int r8 = r4.f116196ae     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "right filter"
            java.lang.String r2 = ""
            r7.setFilterParam(r8, r1, r2)     // Catch:{ all -> 0x0102 }
            com.ss.android.ttve.nativePort.TEInterface r7 = r4.f116228m     // Catch:{ all -> 0x0102 }
            int r8 = r4.f116196ae     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "filter position"
            java.lang.String r2 = "1.0"
            r7.setFilterParam(r8, r1, r2)     // Catch:{ all -> 0x0102 }
            com.ss.android.vesdk.d.a r7 = new com.ss.android.vesdk.d.a     // Catch:{ all -> 0x0102 }
            r7.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0102 }
            r2 = 1
            if (r1 != 0) goto L_0x00cc
            java.lang.String r1 = java.io.File.separator     // Catch:{ all -> 0x0102 }
            java.lang.String[] r1 = r5.split(r1)     // Catch:{ all -> 0x0102 }
            int r3 = r1.length     // Catch:{ all -> 0x0102 }
            if (r3 <= 0) goto L_0x00cc
            int r8 = r1.length     // Catch:{ all -> 0x0102 }
            int r8 = r8 - r2
            r8 = r1[r8]     // Catch:{ all -> 0x0102 }
        L_0x00cc:
            java.lang.String r1 = "iesve_veeditor_set_filter_click_filter_id"
            r7.mo108381a(r1, r8)     // Catch:{ all -> 0x0102 }
            java.lang.String r8 = "iesve_veeditor_set_filter_click"
            com.p280ss.android.ttve.monitor.C20477e.m67936a(r8, r2, r7)     // Catch:{ all -> 0x0102 }
            java.lang.String r7 = "te_composition_filter_id"
            com.p280ss.android.ttve.monitor.C20479f.m67949a(r2, r7, r5)     // Catch:{ all -> 0x0102 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fc }
            r7.<init>()     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r8 = "filterPath"
            r7.put(r8, r5)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r5 = "intensity"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ JSONException -> 0x00fc }
            r7.put(r5, r6)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r5 = "useFilterResIntensity"
            java.lang.String r6 = "false"
            r7.put(r5, r6)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r5 = "vesdk_event_editor_color_filter"
            java.lang.String r6 = "behavior"
            com.p280ss.android.ttve.monitor.C20469a.m67906a(r5, r7, r6)     // Catch:{ JSONException -> 0x00fc }
        L_0x00fc:
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            return r0
        L_0x00fe:
            r5 = -100
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            return r5
        L_0x0102:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.m142472a(java.lang.String, float, boolean, boolean):int");
    }

    /* renamed from: a */
    private int m142470a(int i, String str, boolean z, int i2, int i3) {
        return mo107875a(i, str, 0, 0, "");
    }

    /* renamed from: a */
    private int m142473a(String str, String str2, float f, float f2, boolean z) {
        if (this.f116196ae < 0) {
            return -105;
        }
        if (f < 0.0f || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        m142462A();
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (this.f116201aj == null) {
            this.f116201aj = new C20464d();
        }
        if (str.equals(this.f116201aj.f55283a) && str2.equals(this.f116201aj.f55284b) && this.f116201aj.f55286d == 0.0f && this.f116201aj.f55285c == f && this.f116201aj.f55288f) {
            return 0;
        }
        this.f116201aj.f55283a = str;
        this.f116201aj.f55284b = str2;
        this.f116201aj.f55285c = f;
        this.f116201aj.f55286d = 0.0f;
        this.f116201aj.f55287e = 0.0f;
        this.f116201aj.f55288f = true;
        this.f116201aj.f55289g = false;
        StringBuilder sb = new StringBuilder("leftFilterPath: ");
        sb.append(str);
        sb.append("\nrightFilterPath: ");
        sb.append(str2);
        sb.append(" position: ");
        sb.append(f);
        sb.append(" intensity: 0.0");
        C45372t.m143405b("VEEditor", sb.toString());
        this.f116228m.setFilterParam(this.f116196ae, "left filter", str);
        this.f116228m.setFilterParam(this.f116196ae, "use filter res intensity", "true");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(0.0f);
        this.f116228m.setFilterParam(this.f116196ae, "left filter intensity", sb2.toString());
        this.f116228m.setFilterParam(this.f116196ae, "right filter", str2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f);
        this.f116228m.setFilterParam(this.f116196ae, "filter position", sb3.toString());
        C45306a aVar = new C45306a();
        String str3 = "";
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] split2 = str2.split(File.separator);
            if (split2.length > 0) {
                str4 = split2[split2.length - 1];
            }
        }
        aVar.mo108381a("iesve_veeditor_set_filter_slide_left_id", str3);
        aVar.mo108381a("iesve_veeditor_set_filter_slide_right_id", str4);
        C20477e.m67936a("iesve_veeditor_set_filter_slide", 1, aVar);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        return -100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return -100;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m142468a(int r9, int r10, int r11, int r12, int r13, boolean r14, boolean r15) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r15 = "VEEditor"
            java.lang.String r0 = "updateAudioTrack..."
            com.p280ss.android.vesdk.C45372t.m143403a(r15, r0)     // Catch:{ all -> 0x0030 }
            r15 = -100
            if (r9 >= 0) goto L_0x000e
            monitor-exit(r8)     // Catch:{ all -> 0x0030 }
            return r15
        L_0x000e:
            if (r11 <= r10) goto L_0x002e
            if (r10 >= 0) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            if (r13 <= r12) goto L_0x002c
            if (r12 >= 0) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            com.ss.android.ttve.common.k r15 = r8.f116160E     // Catch:{ all -> 0x0030 }
            r0 = 1
            int r2 = r15.mo55063c(r0, r9)     // Catch:{ all -> 0x0030 }
            com.ss.android.ttve.nativePort.TEInterface r1 = r8.f116228m     // Catch:{ all -> 0x0030 }
            r3 = r12
            r4 = r13
            r5 = r10
            r6 = r11
            r7 = r14
            int r9 = r1.updateAudioTrack(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0030 }
            monitor-exit(r8)     // Catch:{ all -> 0x0030 }
            return r9
        L_0x002c:
            monitor-exit(r8)     // Catch:{ all -> 0x0030 }
            return r15
        L_0x002e:
            monitor-exit(r8)     // Catch:{ all -> 0x0030 }
            return r15
        L_0x0030:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0030 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.m142468a(int, int, int, int, int, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        return r5;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m142488b(java.lang.String r5, java.lang.String[] r6, java.lang.String[] r7, java.lang.String r8, int r9, int r10, boolean r11) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "VEEditor"
            java.lang.String r1 = "reinitMV..."
            com.p280ss.android.vesdk.C45372t.m143403a(r0, r1)     // Catch:{ all -> 0x0089 }
            if (r5 == 0) goto L_0x007e
            if (r6 == 0) goto L_0x007e
            if (r7 != 0) goto L_0x000f
            goto L_0x007e
        L_0x000f:
            com.ss.android.vesdk.VEEditor$SEEK_MODE r0 = com.p280ss.android.vesdk.VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek     // Catch:{ all -> 0x0089 }
            r1 = 0
            r4.mo107871a(r1, r0)     // Catch:{ all -> 0x0089 }
            com.ss.android.ttve.nativePort.TEInterface r0 = r4.f116228m     // Catch:{ all -> 0x0089 }
            int r0 = r0.stop()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0033
            java.lang.String r5 = "VEEditor"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r7 = "stop in reinitMV failed, ret = "
            r6.<init>(r7)     // Catch:{ all -> 0x0089 }
            r6.append(r0)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0089 }
            com.p280ss.android.vesdk.C45372t.m143403a(r5, r6)     // Catch:{ all -> 0x0089 }
            r5 = -1
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return r5
        L_0x0033:
            r4.f116224i = r1     // Catch:{ all -> 0x0089 }
            r0 = 2
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0089 }
            int r2 = r4.f116196ae     // Catch:{ all -> 0x0089 }
            r0[r1] = r2     // Catch:{ all -> 0x0089 }
            int r2 = r4.f116200ai     // Catch:{ all -> 0x0089 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x0089 }
            r4.mo107930b(r0)     // Catch:{ all -> 0x0089 }
            int r5 = r4.m142475a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0089 }
            if (r5 == 0) goto L_0x005f
            java.lang.String r6 = "VEEditor"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r8 = "init2 in reinitMV failed, ret = "
            r7.<init>(r8)     // Catch:{ all -> 0x0089 }
            r7.append(r5)     // Catch:{ all -> 0x0089 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0089 }
            com.p280ss.android.vesdk.C45372t.m143409d(r6, r7)     // Catch:{ all -> 0x0089 }
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return r5
        L_0x005f:
            com.ss.android.ttve.nativePort.TEInterface r5 = r4.f116228m     // Catch:{ all -> 0x0089 }
            r5.createTimeline()     // Catch:{ all -> 0x0089 }
            com.ss.android.ttve.nativePort.TEInterface r5 = r4.f116228m     // Catch:{ all -> 0x0089 }
            int r5 = r5.prepareEngine(r1)     // Catch:{ all -> 0x0089 }
            com.ss.android.ttve.nativePort.TEInterface r6 = r4.f116228m     // Catch:{ all -> 0x0089 }
            r6.updateTrackFilter(r1, r1, r1)     // Catch:{ all -> 0x0089 }
            com.ss.android.ttve.model.d r6 = r4.f116201aj     // Catch:{ all -> 0x0089 }
            if (r6 == 0) goto L_0x007c
            com.ss.android.ttve.model.d r6 = r4.f116201aj     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r6.f55283a     // Catch:{ all -> 0x0089 }
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.m142472a(r6, r7, r1, r3)     // Catch:{ all -> 0x0089 }
        L_0x007c:
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return r5
        L_0x007e:
            java.lang.String r5 = "VEEditor"
            java.lang.String r6 = "reinitMV bad input file, please call init2 first"
            com.p280ss.android.vesdk.C45372t.m143403a(r5, r6)     // Catch:{ all -> 0x0089 }
            r5 = -205(0xffffffffffffff33, float:NaN)
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return r5
        L_0x0089:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.VEEditor.m142488b(java.lang.String, java.lang.String[], java.lang.String[], java.lang.String, int, int, boolean):int");
    }

    /* renamed from: a */
    private int m142475a(String str, String[] strArr, String[] strArr2, String str2, int i, int i2, boolean z) {
        boolean z2;
        String str3 = str;
        C20479f.m67969d(1);
        C20479f.m67968c(1);
        this.f116233r = System.currentTimeMillis();
        this.f116234s = System.currentTimeMillis();
        C45372t.m143403a("VEEditor", "initMVInternal...");
        this.f116164I = str3;
        this.f116162G = strArr;
        this.f116163H = strArr2;
        TEInterface tEInterface = this.f116228m;
        if (this.f116173U != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f116206ao = (MVInfoBean) tEInterface.initMVResources(str, strArr, strArr2, str2, i, i2, z2, z);
        if (this.f116206ao == null) {
            C45372t.m143409d("VEEditor", "initMVInternal failed");
            return -1;
        }
        f116155ap = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List a = m142480a(this.f116206ao, (List<String>) arrayList, (List<String>) arrayList2);
        if (a.size() != 0) {
            List<List> list = (List) a.get(0);
            if (list.size() != 0) {
                int size = ((List) list.get(0)).size();
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                int[] iArr3 = new int[size];
                int[] iArr4 = new int[size];
                String[] strArr3 = new String[size];
                int[] iArr5 = new int[size];
                int[] iArr6 = iArr4;
                m142482a((List) list.get(0), iArr, iArr2, iArr3, iArr6, strArr3, iArr5);
                List<List> list2 = (List) a.get(1);
                VIDEO_RATIO video_ratio = VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL;
                float f = ((((float) this.f116206ao.width) * 1.0f) / ((float) this.f116206ao.height)) * 1.0f;
                if (f == 1.0f) {
                    video_ratio = VIDEO_RATIO.VIDEO_OUT_RATIO_1_1;
                } else if (f == 0.75f) {
                    video_ratio = VIDEO_RATIO.VIDEO_OUT_RATIO_3_4;
                } else if (f == 1.3333334f) {
                    video_ratio = VIDEO_RATIO.VIDEO_OUT_RATIO_4_3;
                } else if (f == 1.7777778f) {
                    video_ratio = VIDEO_RATIO.VIDEO_OUT_RATIO_16_9;
                } else if (f == 0.5625f) {
                    video_ratio = VIDEO_RATIO.VIDEO_OUT_RATIO_9_16;
                }
                VIDEO_RATIO video_ratio2 = video_ratio;
                int createScene2 = this.f116228m.createScene2(strArr3, iArr, iArr2, iArr3, iArr6, null, null, null, null, null, iArr5, null, null, null, video_ratio2.ordinal());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mvPath", str3);
                    jSONObject.put("resourcesFilePaths", Arrays.toString(strArr));
                    jSONObject.put("resourcesTypes", Arrays.toString(strArr2));
                    jSONObject.put("bgmPath", str2);
                    jSONObject.put("bgmTrimIn", i);
                    jSONObject.put("bgmTrimOut", i2);
                    jSONObject.put("resultCode", createScene2);
                    C20469a.m67906a("vesdk_event_editor_init_mv", jSONObject, "behavior");
                } catch (JSONException unused) {
                }
                if (createScene2 != 0) {
                    StringBuilder sb = new StringBuilder("Create Scene failed, ret = ");
                    sb.append(createScene2);
                    C45372t.m143409d("VEEditor", sb.toString());
                    mo107941c();
                    this.f116193ab = false;
                    return createScene2;
                }
                this.f116228m.getDuration();
                boolean z3 = true;
                for (List list3 : list) {
                    if (z3) {
                        z3 = false;
                    } else {
                        int size2 = list3.size();
                        int[] iArr7 = new int[size2];
                        int[] iArr8 = new int[size2];
                        int[] iArr9 = new int[size2];
                        int[] iArr10 = new int[size2];
                        String[] strArr4 = new String[size2];
                        int[] iArr11 = new int[size2];
                        m142482a(list3, iArr7, iArr8, iArr9, iArr10, strArr4, iArr11);
                        this.f116228m.addVideoTrackForMV(strArr4, null, iArr9, iArr10, iArr7, iArr8, iArr11);
                    }
                }
                for (List list4 : list2) {
                    if (list4.size() != 0) {
                        int i3 = (int) ((MVResourceBean) list4.get(0)).trimIn;
                        int i4 = (int) ((MVResourceBean) list4.get(0)).trimOut;
                        int i5 = (int) ((MVResourceBean) list4.get(0)).seqIn;
                        int i6 = (int) ((MVResourceBean) list4.get(0)).seqOut;
                        String str4 = ((MVResourceBean) list4.get(0)).content;
                        int i7 = ((MVResourceBean) list4.get(0)).rid;
                        int addAudioTrackForMV = this.f116228m.addAudioTrackForMV(str4, i5, i6, i3, i4, i7, true);
                        if (i7 == this.f116224i) {
                            this.f116225j = addAudioTrackForMV;
                        }
                    }
                }
                this.f116193ab = true;
                this.f116194ac = false;
                this.f116177Y = video_ratio2;
                this.f116179a.f116798c = new String[arrayList2.size()];
                this.f116179a.f116797b = new String[arrayList2.size()];
                arrayList2.toArray(this.f116179a.f116798c);
                arrayList.toArray(this.f116179a.f116797b);
                this.f116179a.f116799d = null;
                this.f116197af = -1;
                this.f116170R = Boolean.valueOf(false);
                this.f116179a.f116804i = 0;
                this.f116179a.f116803h = 0;
                this.f116172T = 0;
                this.f116228m.setWidthHeight(this.f116206ao.width, this.f116206ao.height);
                return m142464I();
            }
            throw new VEException(-1, "没有MV视频信息");
        }
        throw new VEException(-1, "没有MV信息");
    }

    /* renamed from: a */
    public static int m142474a(String str, String str2, int i, int i2, long j, long j2, String str3, C45213i iVar) {
        synchronized (f116153L) {
            if (f116154M) {
                return -2;
            }
            f116154M = true;
            int b = m142487b(str, str2, i, i2, j, j2, str3, iVar);
            f116154M = false;
            return b;
        }
    }

    /* renamed from: b */
    private static int m142487b(String str, String str2, int i, int i2, long j, long j2, String str3, C45213i iVar) {
        String str4 = str2;
        final C45213i iVar2 = iVar;
        C451902 r13 = new CompileProbeListener() {
            public final void onCompileProbeResult(int i, int i2, float f) {
                if (iVar2 != null) {
                    iVar2.mo106502a(i, i2, f);
                }
            }
        };
        VEVideoCompileEncodeSettings videoCompileEncodeSetting = new C45244a(2).mo108158a(str3).mo108162a().getVideoCompileEncodeSetting();
        if (videoCompileEncodeSetting.useHWEncoder) {
            C45372t.m143407c("VEEditor", "compile use hard encode, not soft encode");
            return -100;
        } else if (str4 == null || str2.isEmpty()) {
            C45372t.m143407c("VEEditor", "savepath is null or savepath is empty");
            return -100;
        } else {
            File file = new File(str4);
            if (!file.exists() || !file.isDirectory()) {
                StringBuilder sb = new StringBuilder("savepath is not exist, savepath: ");
                sb.append(str4);
                C45372t.m143407c("VEEditor", sb.toString());
                return -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append("/probe/");
            String sb3 = sb2.toString();
            if (new File(sb3).exists() || C45331n.m143273b(sb3)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append("compile_probe");
                String sb5 = sb4.toString();
                TEVideoUtils.nativeCompileProbe(str, sb5, i, i2, j, j2, videoCompileEncodeSetting.mSWEncodeSetting.mPreset, videoCompileEncodeSetting.mSWEncodeSetting.mCrf, videoCompileEncodeSetting.mSWEncodeSetting.mGop, videoCompileEncodeSetting.mSWEncodeSetting.mMaxRate, r13);
                File file2 = new File(sb5);
                if (file2.exists()) {
                    StringBuilder sb6 = new StringBuilder("delete file: ");
                    sb6.append(sb5);
                    C45372t.m143407c("VEEditor", sb6.toString());
                    file2.delete();
                }
                return 0;
            }
            C45372t.m143407c("VEEditor", "create probeDir failed");
            return -1;
        }
    }
}

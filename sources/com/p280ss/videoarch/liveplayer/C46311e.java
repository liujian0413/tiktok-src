package com.p280ss.videoarch.liveplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.p532i.C10284c;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.optimizer.live.sdk.dns.C45912b;
import com.p280ss.optimizer.live.sdk.dns.C45914d;
import com.p280ss.ttm.player.MediaPlayer;
import com.p280ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p280ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p280ss.ttm.player.MediaPlayer.OnExternInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p280ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p280ss.ttm.player.TTPlayerConfiger;
import com.p280ss.videoarch.liveplayer.log.C46334a;
import com.p280ss.videoarch.liveplayer.log.C46337b;
import com.p280ss.videoarch.liveplayer.log.LiveError;
import com.p280ss.videoarch.liveplayer.p1834a.C46282b;
import com.p280ss.videoarch.liveplayer.p1834a.C46283c;
import com.p280ss.videoarch.liveplayer.p1834a.C46284d;
import com.p280ss.videoarch.liveplayer.p1835b.C46286a;
import com.p280ss.videoarch.liveplayer.p1835b.C46286a.C46290a;
import com.p280ss.videoarch.liveplayer.p1835b.C46293c;
import com.p280ss.videoarch.liveplayer.p1835b.C46293c.C46296a;
import com.p280ss.videoarch.liveplayer.p1836c.C46304a;
import com.p280ss.videoarch.liveplayer.p1836c.C46305b;
import com.p280ss.videoarch.liveplayer.p1836c.C46306c;
import com.p280ss.videoarch.liveplayer.p1837d.C46308a;
import com.p280ss.videoarch.liveplayer.p1837d.C46308a.C46310a;
import com.p280ss.videoarch.liveplayer.p1838e.C46332a;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.e */
public final class C46311e {

    /* renamed from: C */
    public static boolean f118989C;

    /* renamed from: D */
    public static JSONObject f118990D;

    /* renamed from: E */
    public static Context f118991E;

    /* renamed from: A */
    public long f118992A;

    /* renamed from: B */
    public int f118993B;

    /* renamed from: F */
    public boolean f118994F;

    /* renamed from: G */
    public boolean f118995G;

    /* renamed from: H */
    public long f118996H;

    /* renamed from: I */
    public int f118997I;

    /* renamed from: J */
    private final ExecutorService f118998J;

    /* renamed from: K */
    private final Context f118999K;

    /* renamed from: L */
    private final C46300c f119000L;

    /* renamed from: M */
    private final boolean f119001M;

    /* renamed from: N */
    private final C46285b f119002N;

    /* renamed from: O */
    private final int f119003O;

    /* renamed from: P */
    private final C46306c f119004P;

    /* renamed from: Q */
    private C46304a f119005Q;

    /* renamed from: R */
    private SurfaceHolder f119006R;

    /* renamed from: S */
    private Surface f119007S;

    /* renamed from: T */
    private C46318b f119008T;

    /* renamed from: U */
    private int f119009U;

    /* renamed from: V */
    private int f119010V;

    /* renamed from: W */
    private int f119011W;

    /* renamed from: X */
    private int f119012X;

    /* renamed from: Y */
    private int f119013Y;

    /* renamed from: Z */
    private int f119014Z;

    /* renamed from: a */
    public final Handler f119015a;

    /* renamed from: aA */
    private int f119016aA;

    /* renamed from: aB */
    private int f119017aB;

    /* renamed from: aC */
    private int f119018aC;

    /* renamed from: aD */
    private int f119019aD;

    /* renamed from: aE */
    private int f119020aE;

    /* renamed from: aF */
    private int f119021aF;

    /* renamed from: aG */
    private long f119022aG;

    /* renamed from: aH */
    private long f119023aH;

    /* renamed from: aI */
    private int f119024aI;

    /* renamed from: aJ */
    private int f119025aJ;

    /* renamed from: aK */
    private int f119026aK;

    /* renamed from: aL */
    private String f119027aL;

    /* renamed from: aM */
    private int f119028aM;

    /* renamed from: aa */
    private int f119029aa;

    /* renamed from: ab */
    private int f119030ab;

    /* renamed from: ac */
    private int f119031ac;

    /* renamed from: ad */
    private int f119032ad;

    /* renamed from: ae */
    private int f119033ae;

    /* renamed from: af */
    private int f119034af;

    /* renamed from: ag */
    private int f119035ag;

    /* renamed from: ah */
    private int f119036ah;

    /* renamed from: ai */
    private int f119037ai;

    /* renamed from: aj */
    private int f119038aj;

    /* renamed from: ak */
    private int f119039ak;

    /* renamed from: al */
    private int f119040al;

    /* renamed from: am */
    private int f119041am;

    /* renamed from: an */
    private float f119042an;

    /* renamed from: ao */
    private int f119043ao;

    /* renamed from: ap */
    private float f119044ap;

    /* renamed from: aq */
    private String f119045aq;

    /* renamed from: ar */
    private String f119046ar;

    /* renamed from: as */
    private String f119047as;

    /* renamed from: at */
    private int f119048at;

    /* renamed from: au */
    private int f119049au;

    /* renamed from: av */
    private C45914d f119050av;

    /* renamed from: aw */
    private int f119051aw;

    /* renamed from: ax */
    private boolean f119052ax;

    /* renamed from: ay */
    private boolean f119053ay;

    /* renamed from: az */
    private int f119054az;

    /* renamed from: b */
    public C46334a f119055b;

    /* renamed from: c */
    public final C46280a f119056c;

    /* renamed from: d */
    public final C46286a f119057d;

    /* renamed from: e */
    public final C46308a f119058e;

    /* renamed from: f */
    public final C46282b f119059f;

    /* renamed from: g */
    public MediaPlayer f119060g;

    /* renamed from: h */
    public C46293c f119061h;

    /* renamed from: i */
    public C46331m f119062i;

    /* renamed from: j */
    public boolean f119063j;

    /* renamed from: k */
    public boolean f119064k;

    /* renamed from: l */
    public boolean f119065l;

    /* renamed from: m */
    public int f119066m;

    /* renamed from: n */
    public String f119067n;

    /* renamed from: o */
    public boolean f119068o;

    /* renamed from: p */
    public String f119069p;

    /* renamed from: q */
    public int f119070q;

    /* renamed from: r */
    public boolean f119071r;

    /* renamed from: s */
    public boolean f119072s;

    /* renamed from: t */
    public int f119073t;

    /* renamed from: u */
    public boolean f119074u;

    /* renamed from: v */
    public boolean f119075v;

    /* renamed from: w */
    public String f119076w;

    /* renamed from: x */
    public String f119077x;

    /* renamed from: y */
    public String f119078y;

    /* renamed from: z */
    public long f119079z;

    /* renamed from: com.ss.videoarch.liveplayer.e$a */
    public static final class C46317a {

        /* renamed from: a */
        final Context f119093a;

        /* renamed from: b */
        C46280a f119094b;

        /* renamed from: c */
        String f119095c;

        /* renamed from: d */
        C46300c f119096d;

        /* renamed from: e */
        C46285b f119097e;

        /* renamed from: f */
        boolean f119098f;

        /* renamed from: g */
        boolean f119099g;

        /* renamed from: h */
        int f119100h;

        /* renamed from: i */
        int f119101i;

        /* renamed from: j */
        String f119102j;

        /* renamed from: k */
        String f119103k;

        /* renamed from: l */
        boolean f119104l;

        /* renamed from: m */
        boolean f119105m;

        /* renamed from: n */
        public long f119106n;

        /* renamed from: o */
        public long f119107o;

        /* renamed from: p */
        public long f119108p;

        /* renamed from: a */
        public final C46311e mo115119a() {
            if (this.f119093a == null) {
                throw new IllegalArgumentException("mContext should not be null");
            } else if (this.f119094b == null) {
                throw new IllegalArgumentException("mListener should not be null");
            } else if (this.f119096d != null) {
                return new C46311e(this);
            } else {
                throw new IllegalArgumentException("mNetworkClient should not be null");
            }
        }

        /* renamed from: a */
        public final C46317a mo115114a(int i) {
            this.f119101i = i;
            return this;
        }

        /* renamed from: b */
        public final C46317a mo115121b(boolean z) {
            this.f119099g = false;
            return this;
        }

        /* renamed from: a */
        public final C46317a mo115115a(C46280a aVar) {
            this.f119094b = aVar;
            return this;
        }

        /* renamed from: b */
        public final C46317a mo115120b(int i) {
            this.f119100h = 300000;
            return this;
        }

        /* renamed from: a */
        public final C46317a mo115116a(C46285b bVar) {
            this.f119097e = bVar;
            return this;
        }

        /* renamed from: a */
        public final C46317a mo115117a(C46300c cVar) {
            this.f119096d = cVar;
            return this;
        }

        private C46317a(Context context) {
            this.f119100h = 60000;
            this.f119101i = 1;
            this.f119102j = "origin";
            this.f119103k = "flv";
            this.f119105m = true;
            this.f119106n = 10000;
            this.f119107o = 60000;
            this.f119108p = 8000;
            this.f119093a = context;
        }

        /* renamed from: a */
        public final C46317a mo115118a(boolean z) {
            this.f119098f = false;
            return this;
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$b */
    enum C46318b {
        IDLE,
        PLAYED,
        STOPPED
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$c */
    static final class C46319c implements OnCompletionListener {

        /* renamed from: a */
        private final WeakReference<C46311e> f119113a;

        public C46319c(C46311e eVar) {
            this.f119113a = new WeakReference<>(eVar);
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            C46311e eVar = (C46311e) this.f119113a.get();
            if (eVar != null && eVar.f119060g != null) {
                eVar.f119056c.mo21839c();
                if (!eVar.f119075v) {
                    if (eVar.f119074u && eVar.f119059f.f118912a == 2 && eVar.mo115086a(-109)) {
                        return;
                    }
                    if (eVar.f119059f.f118912a == 1 && eVar.mo115092b(-109)) {
                        return;
                    }
                    if (eVar.f119066m == 1) {
                        eVar.f119068o = true;
                        if (eVar.f119065l && !TextUtils.isEmpty(eVar.f119067n)) {
                            eVar.mo115094c(eVar.f119067n);
                            eVar.mo115084a(true);
                            eVar.mo115099e(eVar.f119067n);
                            return;
                        }
                        return;
                    }
                    eVar.f119058e.mo115061a(new LiveError(-109, "live stream dry up, push stream may occur error", new HashMap()));
                }
            }
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$d */
    static final class C46320d implements OnErrorListener {

        /* renamed from: a */
        private final WeakReference<C46311e> f119114a;

        public C46320d(C46311e eVar) {
            this.f119114a = new WeakReference<>(eVar);
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C46311e eVar = (C46311e) this.f119114a.get();
            if (eVar == null || eVar.f119060g == null) {
                return false;
            }
            if (i != 0) {
                eVar.f119055b.mo115145c(i);
            }
            eVar.f119056c.mo21834a(new LiveError(i, "player on error", null));
            if (eVar.f119075v) {
                return true;
            }
            if (eVar.f118993B == 1 && eVar.mo115095c(i)) {
                return true;
            }
            if (eVar.f119074u && eVar.f119059f.f118912a == 2 && eVar.mo115086a(i)) {
                return true;
            }
            if (eVar.f119059f.f118912a == 1 && eVar.mo115092b(i)) {
                return true;
            }
            new StringBuilder("onError ").append(i);
            HashMap hashMap = new HashMap();
            hashMap.put("internalCode", Integer.valueOf(i));
            hashMap.put("internalExtra", Integer.valueOf(i2));
            hashMap.put("playerType", Integer.valueOf(mediaPlayer.getPlayerType()));
            eVar.f119058e.mo115061a(new LiveError(-103, "player on error", hashMap));
            return false;
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$e */
    static final class C46321e implements OnExternInfoListener {

        /* renamed from: a */
        private final WeakReference<C46311e> f119115a;

        public C46321e(C46311e eVar) {
            this.f119115a = new WeakReference<>(eVar);
        }

        public final void onExternInfo(MediaPlayer mediaPlayer, int i, String str) {
            StringBuilder sb = new StringBuilder("onExternInfo, what:");
            sb.append(i);
            sb.append(",message:");
            sb.append(str);
            C46311e eVar = (C46311e) this.f119115a.get();
            if (!(eVar == null || eVar.f119060g == null || 19 != i)) {
                if (eVar.f118994F && !eVar.f118995G) {
                    eVar.f118995G = true;
                    eVar.f119015a.sendEmptyMessageDelayed(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 3000);
                }
                eVar.f118996H = System.currentTimeMillis();
                eVar.f119055b.mo115146c(str);
                eVar.f119056c.mo21835a(str);
            }
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$f */
    static final class C46322f implements C46296a {

        /* renamed from: a */
        public final String f119116a;

        /* renamed from: b */
        private final WeakReference<C46311e> f119117b;

        /* renamed from: a */
        public final void mo115049a(final C46283c cVar) {
            final C46311e eVar = (C46311e) this.f119117b.get();
            if (eVar != null) {
                eVar.mo115081a((Runnable) new Runnable() {
                    public final void run() {
                        if (eVar.f119060g != null && eVar.f119058e != null) {
                            if (cVar == null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("liveAPI", C46322f.this.f119116a);
                                eVar.f119058e.mo115061a(new LiveError(-105, "live data is null", hashMap));
                                return;
                            }
                            eVar.f119059f.mo115017a(cVar);
                            String a = eVar.f119059f.mo115016a(eVar.f119076w, eVar.f119078y, eVar.f119077x);
                            if (a == null) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("liveAPI", C46322f.this.f119116a);
                                eVar.f119058e.mo115061a(new LiveError(-105, "play url is null", hashMap2));
                                return;
                            }
                            eVar.mo115099e(a);
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        public final void mo115050a(final LiveError liveError) {
            final C46311e eVar = (C46311e) this.f119117b.get();
            if (eVar != null) {
                eVar.mo115081a((Runnable) new Runnable() {
                    public final void run() {
                        if (eVar.f119060g != null && eVar.f119058e != null) {
                            eVar.f119058e.mo115061a(liveError);
                        }
                    }
                });
            }
        }

        public C46322f(C46311e eVar, String str) {
            this.f119117b = new WeakReference<>(eVar);
            this.f119116a = str;
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$g */
    static final class C46325g implements OnInfoListener {

        /* renamed from: a */
        private final WeakReference<C46311e> f119124a;

        public C46325g(C46311e eVar) {
            this.f119124a = new WeakReference<>(eVar);
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            C46311e eVar = (C46311e) this.f119124a.get();
            if (eVar == null || eVar.f119060g == null) {
                return false;
            }
            if (i == 3) {
                eVar.f119055b.mo115143b(eVar.f119060g.getStringOption(142));
                int intOption = eVar.f119060g.getIntOption(141, -1);
                if (intOption == 0) {
                    eVar.f119055b.f119212f = "h264";
                } else if (intOption == 1) {
                    eVar.f119055b.f119212f = "h265";
                }
                int intOption2 = eVar.f119060g.getIntOption(157, -1);
                eVar.f119055b.f119214h = C46311e.m145371d(intOption2);
                eVar.f119055b.mo115145c(0);
                eVar.f119071r = false;
                String stringOption = eVar.f119060g.getStringOption(71);
                if (stringOption != null && !stringOption.equals(eVar.f119069p)) {
                    eVar.f119055b.mo115138a(stringOption, true);
                    eVar.f119069p = stringOption;
                }
                if (!eVar.f119064k) {
                    eVar.f119055b.mo115134a(0, eVar.f118992A);
                    eVar.f119055b.mo115129a();
                    eVar.f119064k = true;
                    eVar.f119056c.mo21837a(true);
                } else {
                    eVar.f119055b.mo115142b(0);
                    eVar.f119056c.mo21837a(false);
                    if (eVar.f119055b.f119227u) {
                        eVar.f119056c.mo21838b();
                        eVar.f119055b.mo115139a(true);
                    }
                }
                eVar.f119058e.mo115065d();
            } else if (i != 251658247) {
                switch (i) {
                    case 701:
                        eVar.f119070q++;
                        eVar.f119071r = true;
                        eVar.f119056c.mo21832a();
                        if (!eVar.f119064k) {
                            eVar.f119079z = System.currentTimeMillis();
                            eVar.f119055b.mo115133a(i2, false);
                        } else {
                            eVar.f119055b.mo115133a(i2, true);
                        }
                        if ((!eVar.f119072s || eVar.f119059f.f118912a != 2 || eVar.f119070q < eVar.f119073t || !eVar.mo115111q()) && !eVar.f119075v) {
                            eVar.f119058e.mo115062a(true);
                            break;
                        }
                    case 702:
                        eVar.f119071r = false;
                        eVar.f119056c.mo21838b();
                        eVar.f119058e.mo115062a(false);
                        if (!eVar.f119064k || !eVar.f119055b.f119227u) {
                            if (!eVar.f119064k && eVar.f119079z != 0) {
                                eVar.f118992A = System.currentTimeMillis() - eVar.f119079z;
                                break;
                            }
                        } else {
                            eVar.f119055b.mo115139a(false);
                            break;
                        }
                        break;
                }
            } else {
                eVar.f119055b.f119220n++;
                StringBuilder sb = new StringBuilder();
                C46334a aVar = eVar.f119055b;
                sb.append(aVar.f119221o);
                sb.append(",");
                double d = (double) i2;
                Double.isNaN(d);
                sb.append(d / 1000.0d);
                sb.append(":");
                sb.append(System.currentTimeMillis());
                aVar.f119221o = sb.toString();
            }
            return false;
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$h */
    static class C46326h implements OnVideoSizeChangedListener {

        /* renamed from: a */
        private final WeakReference<C46311e> f119125a;

        public C46326h(C46311e eVar) {
            this.f119125a = new WeakReference<>(eVar);
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            C46311e eVar = (C46311e) this.f119125a.get();
            if (!(eVar == null || eVar.f119060g == null || eVar.f119056c == null)) {
                eVar.f119056c.mo21833a(i, i2);
                eVar.f119055b.mo115131a(i, i2);
            }
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$i */
    static final class C46327i implements OnPreparedListener {

        /* renamed from: a */
        private final WeakReference<C46311e> f119126a;

        public C46327i(C46311e eVar) {
            this.f119126a = new WeakReference<>(eVar);
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            C46311e eVar = (C46311e) this.f119126a.get();
            if (eVar != null && eVar.f119062i == C46331m.PREPARING && eVar.f119060g != null) {
                eVar.f119055b.mo115144c();
                eVar.f119062i = C46331m.PREPARED;
                if (eVar.f118997I == 0) {
                    eVar.f119060g.start();
                }
                eVar.f119056c.mo21840d();
            }
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$j */
    static class C46328j implements Runnable {

        /* renamed from: a */
        private MediaPlayer f119127a;

        public final void run() {
            if (this.f119127a != null) {
                try {
                    this.f119127a.release();
                    this.f119127a = null;
                } catch (Exception unused) {
                }
            }
        }

        public C46328j(MediaPlayer mediaPlayer) {
            this.f119127a = mediaPlayer;
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$k */
    static final class C46329k implements C46310a {

        /* renamed from: a */
        private final WeakReference<C46311e> f119128a;

        /* renamed from: a */
        public final void mo115067a() {
            C46311e eVar = (C46311e) this.f119128a.get();
            if (eVar != null && eVar.f119060g != null) {
                if (eVar.f119060g.isPlaying()) {
                    eVar.f119060g.stop();
                }
                eVar.mo115088b();
            }
        }

        /* renamed from: b */
        public final void mo115070b() {
            C46311e eVar = (C46311e) this.f119128a.get();
            if (eVar != null && eVar.f119060g != null) {
                String str = null;
                if (eVar.f119059f.f118912a == 1) {
                    str = eVar.f119059f.mo115021b();
                } else if (eVar.f119059f.f118912a == 2) {
                    str = eVar.f119059f.mo115016a(eVar.f119076w, eVar.f119078y, eVar.f119077x);
                }
                eVar.f119055b.f119208b = str;
                eVar.mo115100f();
                if (eVar.f119062i == C46331m.PREPARED) {
                    eVar.mo115099e(str);
                    return;
                }
                eVar.mo115102h();
                eVar.mo115099e(str);
            }
        }

        public C46329k(C46311e eVar) {
            this.f119128a = new WeakReference<>(eVar);
        }

        /* renamed from: a */
        public final void mo115068a(LiveError liveError) {
            C46311e eVar = (C46311e) this.f119128a.get();
            if (eVar != null && eVar.f119060g != null) {
                eVar.f119056c.mo21834a(liveError);
                eVar.f119061h.mo115046a();
                eVar.f119058e.mo115065d();
            }
        }

        /* renamed from: a */
        public final void mo115069a(boolean z) {
            C46311e eVar = (C46311e) this.f119128a.get();
            if (eVar != null && eVar.f119060g != null) {
                new StringBuilder("onRetryResetPlayer ").append(false);
                eVar.mo115100f();
                String str = null;
                if (eVar.f119059f.f118912a == 1) {
                    if (eVar.f119059f.mo115014a() != null) {
                        str = eVar.f119059f.mo115014a().f118919a;
                    }
                } else if (eVar.f119059f.f118912a == 2) {
                    str = eVar.f119059f.mo115016a(eVar.f119076w, eVar.f119078y, eVar.f119077x);
                }
                eVar.f119055b.f119208b = str;
                if (eVar.f119062i == C46331m.PREPARED) {
                    eVar.mo115099e(str);
                    return;
                }
                eVar.mo115102h();
                eVar.mo115099e(str);
            }
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$l */
    static class C46330l implements ThreadFactory {
        private C46330l() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "VideoLiveManager");
            thread.setPriority(10);
            return thread;
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.e$m */
    enum C46331m {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED
    }

    /* renamed from: d */
    public static String m145371d(int i) {
        switch (i) {
            case 1:
                return "IOSHWCodec";
            case 2:
                return "hardware_codec";
            case 3:
                return "ff_H264_codec";
            case 4:
                return "ff_H265_codec";
            case 5:
                return "KS_H265_codec";
            case 6:
                return "JX_H265_codec";
            default:
                return "none_codec";
        }
    }

    /* renamed from: a */
    public final void mo115081a(Runnable runnable) {
        this.f119015a.post(runnable);
    }

    /* renamed from: a */
    public final void mo115077a(SurfaceHolder surfaceHolder) {
        m145375i("setSurfaceHolder");
        this.f119006R = surfaceHolder;
        if (this.f119060g != null) {
            this.f119060g.setDisplay(surfaceHolder);
        }
    }

    /* renamed from: a */
    public final void mo115078a(C45914d dVar) {
        m145375i("setDns");
        this.f119050av = dVar;
        this.f119055b.mo115153g();
    }

    /* renamed from: a */
    public final void mo115085a(C46284d[] dVarArr) {
        new StringBuilder("setPlayUrls, sdkParam:").append(dVarArr[0].f118921c);
        m145375i("setPlayURLS");
        this.f119059f.mo115018a(dVarArr);
        if (this.f119046ar != null && this.f119059f.mo115014a().f118919a != this.f119046ar) {
            m145374h("setPlayURLs");
        }
    }

    /* renamed from: a */
    public final boolean mo115087a(String str) {
        new StringBuilder("playResolution:").append(str);
        m145375i("playResolution");
        if (!this.f119059f.mo115019a(str)) {
            return false;
        }
        String a = this.f119059f.mo115016a(str, this.f119078y, "main");
        C46334a aVar = this.f119055b;
        String str2 = this.f119046ar;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119076w);
        sb.append("_to_");
        sb.append(str);
        aVar.mo115137a(str2, a, sb.toString(), 0);
        if (this.f119076w != str) {
            mo115100f();
            mo115102h();
            this.f119076w = str;
            this.f119077x = "main";
            this.f119055b.f119208b = a;
            m145372f(a);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo115084a(boolean z) {
        this.f119065l = true;
        if (this.f119060g != null && this.f119075v && !TextUtils.isEmpty(this.f119047as)) {
            this.f119060g.setLooping(this.f119065l);
        }
    }

    /* renamed from: a */
    public final void mo115082a(String str, String str2, String str3) {
        this.f119061h.mo115047a(str, str2, new C46322f(this, str3));
    }

    /* renamed from: a */
    public final void mo115080a(Boolean bool) {
        this.f119004P.mo115058a(bool.booleanValue());
    }

    /* renamed from: a */
    public final void mo115079a(C46337b bVar, int i) {
        C46337b bVar2 = bVar;
        int i2 = i;
        if (bVar2 != null && this.f119060g != null) {
            if (i2 == 0 || i2 == 2) {
                bVar2.f119248d = this.f119060g.getLongOption(68, -1);
                bVar2.f119249e = this.f119060g.getLongOption(69, -1);
                bVar2.f119250f = this.f119060g.getLongOption(70, -1);
                bVar2.f119251g = this.f119060g.getLongOption(75, -1);
                bVar2.f119252h = this.f119060g.getLongOption(76, -1);
                bVar2.f119253i = this.f119060g.getLongOption(77, -1);
                bVar2.f119254j = this.f119060g.getLongOption(78, -1);
                bVar2.f119258n = this.f119060g.getLongOption(155, -1);
                bVar2.f119259o = this.f119060g.getLongOption(162, -1);
                bVar2.f119260p = this.f119060g.getLongOption(156, -1);
                bVar2.f119261q = this.f119060g.getLongOption(163, -1);
                bVar2.f119267w = (this.f119060g.getLongOption(63, 0) * 8) / 1000;
                bVar2.f119269y = this.f119060g.getLongOption(73, 0);
                bVar2.f119268x = this.f119060g.getLongOption(72, 0);
                if (i2 == 0) {
                    bVar2.f119270z = bVar2.f119267w;
                    bVar2.f119237A = bVar2.f119268x;
                    bVar2.f119238B = bVar2.f119269y;
                    bVar2.f119244H = this.f119057d.mo115035c();
                    bVar2.f119256l = this.f119060g.getLongOption(210, -1);
                    bVar2.f119255k = System.currentTimeMillis();
                }
                if (i2 == 2) {
                    bVar2.f119239C = this.f119060g.getLongOption(314, 0);
                }
            } else if (i2 == 1) {
                bVar2.f119262r = this.f119060g.getLongOption(45, 0);
                bVar2.f119263s = this.f119060g.getLongOption(46, 0);
                bVar2.f119266v = this.f119060g.getFloatOption(NormalGiftView.MASK_TRANSLATE_VALUE, 0.0f);
                bVar2.f119267w = (this.f119060g.getLongOption(63, 0) * 8) / 1000;
                bVar2.f119269y = this.f119060g.getLongOption(73, 0);
                bVar2.f119268x = this.f119060g.getLongOption(72, 0);
                bVar2.f119265u = (long) this.f119060g.getCurrentPosition();
                bVar2.f119264t = System.currentTimeMillis();
                bVar2.f119244H = this.f119057d.mo115035c();
            } else if (i2 == 3) {
                bVar2.f119266v = this.f119060g.getFloatOption(NormalGiftView.MASK_TRANSLATE_VALUE, 0.0f);
                bVar2.f119267w = (this.f119060g.getLongOption(63, 0) * 8) / 1000;
                bVar2.f119269y = this.f119060g.getLongOption(73, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115083a(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "prepareToPlay:"
            r0.<init>(r1)
            r0.append(r5)
            if (r5 == 0) goto L_0x00e4
            com.ss.ttm.player.MediaPlayer r0 = r4.f119060g
            if (r0 != 0) goto L_0x0012
            goto L_0x00e4
        L_0x0012:
            com.ss.videoarch.liveplayer.e$m r0 = r4.f119062i
            com.ss.videoarch.liveplayer.e$m r1 = com.p280ss.videoarch.liveplayer.C46311e.C46331m.PREPARED
            r2 = 1
            if (r0 != r1) goto L_0x0051
            com.ss.videoarch.liveplayer.e$m r0 = com.p280ss.videoarch.liveplayer.C46311e.C46331m.INITIALIZED
            r4.f119062i = r0
            com.ss.ttm.player.MediaPlayer r0 = r4.f119060g
            r0.reset()
            int r0 = r4.f119066m
            if (r0 != r2) goto L_0x0051
            java.lang.String r0 = r4.f119067n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = r4.f119045aq
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0051
            boolean r0 = r4.f119068o
            if (r0 != 0) goto L_0x0051
            com.ss.ttm.player.MediaPlayer r0 = r4.f119060g
            r1 = 17
            java.lang.String r3 = r4.f119045aq
            r0.setStringOption(r1, r3)
            com.ss.ttm.player.MediaPlayer r0 = r4.f119060g
            r1 = 14
            r0.setIntOption(r1, r2)
            com.ss.ttm.player.MediaPlayer r0 = r4.f119060g
            java.lang.String r1 = r4.f119067n
            r0.setCacheFile(r1, r2)
        L_0x0051:
            int r0 = r4.f119026aK     // Catch:{ Exception -> 0x00bc }
            int r0 = r0 + r2
            r4.f119026aK = r0     // Catch:{ Exception -> 0x00bc }
            int r0 = r4.f119026aK     // Catch:{ Exception -> 0x00bc }
            java.lang.String r0 = r4.m145369a(r5, r0)     // Catch:{ Exception -> 0x00bc }
            com.ss.ttm.player.MediaPlayer r5 = r4.f119060g     // Catch:{ Exception -> 0x00ba }
            android.content.Context r1 = r4.f118999K     // Catch:{ Exception -> 0x00ba }
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x00ba }
            r5.setDataSource(r1, r3, r6)     // Catch:{ Exception -> 0x00ba }
            android.view.SurfaceHolder r5 = r4.f119006R
            if (r5 == 0) goto L_0x0073
            com.ss.ttm.player.MediaPlayer r5 = r4.f119060g
            android.view.SurfaceHolder r6 = r4.f119006R
            r5.setDisplay(r6)
            goto L_0x007e
        L_0x0073:
            android.view.Surface r5 = r4.f119007S
            if (r5 == 0) goto L_0x007e
            com.ss.ttm.player.MediaPlayer r5 = r4.f119060g
            android.view.Surface r6 = r4.f119007S
            r5.setSurface(r6)
        L_0x007e:
            com.ss.ttm.player.MediaPlayer r5 = r4.f119060g
            r5.setScreenOnWhilePlaying(r2)
            com.ss.videoarch.liveplayer.e$m r5 = r4.f119062i
            com.ss.videoarch.liveplayer.e$m r6 = com.p280ss.videoarch.liveplayer.C46311e.C46331m.INITIALIZED
            if (r5 == r6) goto L_0x008a
            return
        L_0x008a:
            com.ss.ttm.player.MediaPlayer r5 = r4.f119060g     // Catch:{ Exception -> 0x0094 }
            r5.prepareAsync()     // Catch:{ Exception -> 0x0094 }
            com.ss.videoarch.liveplayer.e$m r5 = com.p280ss.videoarch.liveplayer.C46311e.C46331m.PREPARING     // Catch:{ Exception -> 0x0094 }
            r4.f119062i = r5     // Catch:{ Exception -> 0x0094 }
            return
        L_0x0094:
            r5 = move-exception
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r1 = "url"
            r6.put(r1, r0)
            com.ss.videoarch.liveplayer.log.LiveError r0 = new com.ss.videoarch.liveplayer.log.LiveError
            r1 = -101(0xffffffffffffff9b, float:NaN)
            java.lang.String r5 = r5.getMessage()
            r0.<init>(r1, r5, r6)
            boolean r5 = r4.f119075v
            if (r5 == 0) goto L_0x00b4
            com.ss.videoarch.liveplayer.a r5 = r4.f119056c
            r5.mo21834a(r0)
            return
        L_0x00b4:
            com.ss.videoarch.liveplayer.d.a r5 = r4.f119058e
            r5.mo115061a(r0)
            return
        L_0x00ba:
            r5 = move-exception
            goto L_0x00bf
        L_0x00bc:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L_0x00bf:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r1 = "url"
            r6.put(r1, r0)
            com.ss.videoarch.liveplayer.log.LiveError r0 = new com.ss.videoarch.liveplayer.log.LiveError
            r1 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.String r5 = r5.getMessage()
            r0.<init>(r1, r5, r6)
            boolean r5 = r4.f119075v
            if (r5 == 0) goto L_0x00de
            com.ss.videoarch.liveplayer.a r5 = r4.f119056c
            r5.mo21834a(r0)
            return
        L_0x00de:
            com.ss.videoarch.liveplayer.d.a r5 = r4.f119058e
            r5.mo115061a(r0)
            return
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.videoarch.liveplayer.C46311e.mo115083a(java.lang.String, java.util.Map):void");
    }

    /* renamed from: a */
    public final boolean mo115086a(int i) {
        if (this.f119077x.equals("main")) {
            String a = this.f119059f.mo115016a(this.f119076w, this.f119078y, "backup");
            if (a != null) {
                this.f119055b.mo115137a(this.f119046ar, a, "main_to_backup", i);
                this.f119055b.f119208b = a;
                this.f119046ar = a;
                this.f119077x = "backup";
                mo115102h();
                mo115099e(a);
                this.f119070q = 0;
                return true;
            }
        } else if (this.f119077x.equals("backup")) {
            String a2 = this.f119059f.mo115016a(this.f119076w, this.f119078y, "main");
            if (a2 != null) {
                this.f119055b.mo115137a(this.f119046ar, a2, "backup_to_main", i);
                this.f119055b.f119208b = a2;
                this.f119046ar = a2;
                this.f119077x = "main";
                mo115102h();
                mo115099e(a2);
                this.f119070q = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo115071a() {
        this.f119053ay = true;
        this.f119055b.f119142E = true;
    }

    /* renamed from: h */
    public final void mo115102h() {
        if (this.f119060g != null) {
            this.f119060g.reset();
        }
        this.f119062i = C46331m.INITIALIZED;
    }

    /* renamed from: k */
    public final boolean mo115105k() {
        if (this.f119060g == null || !this.f119060g.isOSPlayer()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo115106l() {
        if (this.f119060g == null || !this.f119060g.isPlaying()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final int mo115107m() {
        if (this.f119060g != null) {
            return this.f119060g.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: n */
    public final int mo115108n() {
        if (this.f119060g != null) {
            return this.f119060g.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: o */
    public final String mo115109o() {
        return this.f119060g.getStringOption(5002);
    }

    /* renamed from: p */
    public final JSONObject mo115110p() {
        if (this.f119055b == null) {
            return null;
        }
        return this.f119055b.mo115156i();
    }

    /* renamed from: c */
    public final void mo115093c() {
        m145375i("pause");
        if (this.f119060g != null && this.f119060g.isPlaying()) {
            this.f119060g.pause();
        }
    }

    /* renamed from: e */
    public final void mo115098e() {
        m145375i("stop");
        m145370a(true, "stop");
        this.f119058e.mo115064c();
    }

    /* renamed from: r */
    private void m145376r() {
        this.f119060g.setOnPreparedListener(new C46327i(this));
        this.f119060g.setOnErrorListener(new C46320d(this));
        this.f119060g.setOnInfoListener(new C46325g(this));
        this.f119060g.setOnCompletionListener(new C46319c(this));
        this.f119060g.setOnExternInfoListener(new C46321e(this));
        this.f119060g.setOnVideoSizeChangedListener(new C46326h(this));
    }

    /* renamed from: b */
    public final void mo115088b() {
        final String a = this.f119005Q.mo115056a();
        try {
            final String host = new URL(a).getHost();
            this.f119057d.mo115030a(host, new C46290a() {
                /* renamed from: a */
                public final void mo115041a(String str, final String str2, final LiveError liveError, boolean z) {
                    if (host != null && str != null && host.equals(str)) {
                        C46311e.this.mo115081a((Runnable) new Runnable() {
                            public final void run() {
                                if (liveError != null) {
                                    liveError.code = -113;
                                    C46311e.this.f119058e.mo115061a(liveError);
                                    return;
                                }
                                C46311e.this.mo115082a(C46311e.this.f119057d.mo115027a(a, str2, null), host, a);
                            }
                        });
                    }
                }
            });
        } catch (MalformedURLException unused) {
            HashMap hashMap = new HashMap();
            hashMap.put("liveInfoAPI", a);
            this.f119058e.mo115061a(new LiveError(-106, "live info api invalid", hashMap));
        }
    }

    /* renamed from: f */
    public final void mo115100f() {
        if (this.f119060g != null && (this.f119062i == C46331m.PREPARED || this.f119062i == C46331m.PREPARING)) {
            this.f119060g.stop();
        }
        this.f119062i = C46331m.INITIALIZED;
        new StringBuilder("prepareState: ").append(this.f119062i);
    }

    /* renamed from: g */
    public final void mo115101g() {
        m145375i("reset");
        if (this.f119060g != null) {
            m145374h("reset");
            this.f119055b.mo115147d();
            this.f119045aq = null;
            this.f119067n = null;
            this.f119072s = false;
            this.f119074u = true;
            this.f119076w = "origin";
            this.f119048at = -1;
            this.f119078y = "flv";
            this.f119077x = "main";
            this.f119047as = null;
            this.f119075v = false;
            this.f119064k = false;
        }
    }

    /* renamed from: i */
    public final void mo115103i() {
        m145375i("release");
        if (this.f119008T == C46318b.PLAYED) {
            m145370a(true, "release");
        }
        this.f118998J.shutdown();
        this.f119015a.removeCallbacksAndMessages(null);
        if (this.f119060g != null) {
            this.f119060g.prevClose();
            this.f119060g.release();
            this.f119060g = null;
            this.f119055b.mo115147d();
            this.f119062i = C46331m.IDLE;
            this.f119008T = C46318b.IDLE;
        }
    }

    /* renamed from: d */
    public final void mo115096d() {
        String str;
        m145375i("play");
        if (this.f119008T == C46318b.PLAYED) {
            this.f119055b.mo115148d("play");
            return;
        }
        this.f119008T = C46318b.PLAYED;
        String str2 = null;
        if (this.f119059f != null) {
            if (this.f119059f.f118912a == 1 && this.f119059f.mo115014a() != null) {
                str2 = this.f119059f.mo115014a().f118919a;
            } else if (this.f119059f.f118912a == 2) {
                str2 = this.f119059f.mo115016a(this.f119076w, this.f119078y, this.f119077x);
            }
        }
        if (str2 != null) {
            this.f119026aK = -1;
            this.f119027aL = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            C46334a aVar = this.f119055b;
            if (this.f119075v) {
                str = this.f119047as;
            } else {
                str = str2;
            }
            aVar.mo115136a(str, this.f119057d.mo115035c());
            m145372f(str2);
            this.f119058e.mo115063b();
        }
    }

    /* renamed from: j */
    public final void mo115104j() {
        m145375i("releaseAsync");
        if (this.f119008T == C46318b.PLAYED) {
            m145370a(false, "releaseAsync");
        }
        this.f118998J.shutdown();
        this.f119015a.removeCallbacksAndMessages(null);
        if (this.f119060g != null) {
            if (this.f119006R != null) {
                this.f119060g.setDisplay(null);
            }
            MediaPlayer mediaPlayer = this.f119060g;
            this.f119060g = null;
            this.f119055b.mo115147d();
            this.f119062i = C46331m.IDLE;
            this.f119008T = C46318b.IDLE;
            C46332a.m145438a((Runnable) new C46328j(mediaPlayer));
        }
    }

    /* renamed from: t */
    private void m145378t() {
        if (this.f119002N != null) {
            this.f119023aH = ((Long) this.f119002N.mo21831a("live_start_play_buffer_thres", Long.valueOf(0))).longValue();
            this.f119024aI = ((Integer) this.f119002N.mo21831a("live_check_buffering_end_ignore_video", Integer.valueOf(0))).intValue();
            this.f118997I = ((Integer) this.f119002N.mo21831a("live_direct_start_after_prepared", Integer.valueOf(0))).intValue();
            this.f119025aJ = ((Integer) this.f119002N.mo21831a("live_check_buffering_end_advance", Integer.valueOf(0))).intValue();
            this.f119072s = ((Boolean) this.f119002N.mo21831a("live_enable_resolution_degrade", Boolean.FALSE)).booleanValue();
            this.f119073t = ((Integer) this.f119002N.mo21831a("live_stall_count_thres_for_degrade", Integer.valueOf(4))).intValue();
            StringBuilder sb = new StringBuilder("mEnableResolutionAutoDegrade:");
            sb.append(this.f119072s);
            sb.append(" mStallCountThresOfResolutionDegrade:");
            sb.append(this.f119073t);
        }
    }

    /* renamed from: v */
    private void m145380v() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f119003O != 0) {
            z = true;
        } else {
            z = false;
        }
        TTPlayerConfiger.setValue(1, z);
        if (this.f119003O == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        TTPlayerConfiger.setValue(2, z2);
        TTPlayerConfiger.setValue(6, false);
        TTPlayerConfiger.setValue(11, true);
        if (this.f119060g != null) {
            boolean isOSPlayer = this.f119060g.isOSPlayer();
            if (this.f119003O == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (isOSPlayer ^ z3) {
                this.f119060g.releaseAsync();
                this.f119060g = null;
            }
        }
        if (this.f119060g == null) {
            this.f119060g = C46305b.m145350a(this.f118999K, this.f119036ah);
            if (!(this.f119060g.getPlayerType() == 1 || this.f119060g.getPlayerType() == 2)) {
                this.f119014Z = 0;
                this.f119054az = 0;
                this.f119016aA = 0;
            }
            m145377s();
            m145376r();
        }
        if (this.f119060g.isOSPlayer()) {
            this.f119055b.f119209c = "-1";
        } else {
            this.f119055b.f119209c = TTPlayerConfiger.getValue(14, "0");
        }
        this.f119057d.mo115031a(this.f119001M);
        if (this.f119061h == null) {
            this.f119061h = new C46293c(this.f118998J, this.f119000L);
        }
        this.f119004P.f118967a = this.f119060g;
    }

    /* renamed from: q */
    public final boolean mo115111q() {
        if (this.f119076w == "ld") {
            return false;
        }
        if (this.f119048at == -1) {
            int i = 0;
            while (true) {
                if (i >= C46307d.f118970a.length) {
                    break;
                } else if (C46307d.f118970a[i].equals(this.f119076w)) {
                    this.f119048at = i;
                    break;
                } else {
                    i++;
                }
            }
        }
        int i2 = this.f119048at + 1;
        while (i2 < C46307d.f118970a.length && !this.f119059f.mo115019a(C46307d.f118970a[i2])) {
            i2++;
        }
        if (i2 >= C46307d.f118970a.length) {
            return false;
        }
        String a = this.f119059f.mo115016a(C46307d.f118970a[i2], this.f119078y, "main");
        if (a == null) {
            return false;
        }
        C46334a aVar = this.f119055b;
        String str = this.f119046ar;
        StringBuilder sb = new StringBuilder("auto_");
        sb.append(this.f119076w);
        sb.append("_to_");
        sb.append(C46307d.f118970a[i2]);
        aVar.mo115137a(str, a, sb.toString(), -115);
        this.f119046ar = a;
        this.f119048at = i2;
        this.f119076w = C46307d.f118970a[i2];
        this.f119055b.f119208b = this.f119046ar;
        this.f119077x = "main";
        this.f119070q = 0;
        mo115099e(a);
        return true;
    }

    /* renamed from: u */
    private void m145379u() {
        if (f118991E != null) {
            if (!f118989C || f118990D == null) {
                try {
                    f118990D = C10284c.m30450a(f118991E).f27933a;
                } catch (JSONException unused) {
                    f118990D = null;
                }
            }
            if (f118990D != null) {
                long optLong = f118990D.optLong("live_settings_state", 0);
                if (optLong != 0) {
                    if ((optLong & 1) == 1) {
                        this.f119040al = f118990D.optInt("live_hurry_type", -1);
                        if (this.f119040al != -1) {
                            if (((optLong >> 1) & 1) == 1) {
                                this.f119041am = f118990D.optInt("live_hurry_time", -1);
                            }
                            if (((optLong >> 2) & 1) == 1) {
                                this.f119042an = (float) f118990D.optDouble("live_hurry_speed", -1.0d);
                            }
                            if (((optLong >> 3) & 1) == 1) {
                                this.f119043ao = f118990D.optInt("live_slow_play_time", -1);
                            }
                            if (((optLong >> 4) & 1) == 1) {
                                this.f119044ap = (float) f118990D.optDouble("live_slow_play_speed", -1.0d);
                            }
                        }
                    }
                    if (((optLong >> 5) & 1) == 1) {
                        this.f119054az = f118990D.optInt("live_h264_hardware_decode_enable", -1);
                    }
                    if (((optLong >> 6) & 1) == 1) {
                        this.f119016aA = f118990D.optInt("live_h265_hardware_decode_enable", -1);
                    }
                    if (((optLong >> 7) & 1) == 1) {
                        this.f119017aB = f118990D.optInt("live_max_cache_seconds", -1);
                    }
                    if (((optLong >> 8) & 1) == 1) {
                        this.f119033ae = f118990D.optInt("live_buffering_end_seconds", -1);
                    }
                    if (((optLong >> 9) & 1) == 1) {
                        this.f119034af = f118990D.optInt("live_buffering_time_out", -1);
                    }
                    if (((optLong >> 10) & 1) == 1) {
                        this.f119035ag = f118990D.optInt("live_network_time_out", -1);
                    }
                    if (((optLong >> 11) & 1) == 1) {
                        this.f119037ai = f118990D.optInt("live_sharp_enable", -1);
                    }
                    if (((optLong >> 12) & 1) == 1) {
                        this.f119039ak = f118990D.optInt("live_async_init_codec_enable", -1);
                    }
                    if (((optLong >> 13) & 1) == 1) {
                        this.f119053ay = f118990D.optBoolean("live_upload_session_series_enable", false);
                        this.f119055b.f119142E = this.f119053ay;
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private void m145377s() {
        this.f119060g.setIntOption(36, this.f119012X);
        this.f119060g.setIntOption(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 5000);
        if (this.f119021aF == 1) {
            this.f119060g.setIntOption(52, 1);
        }
        boolean z = false;
        this.f119060g.setIntOption(64, 0);
        this.f119060g.setIntOption(220, this.f119020aE);
        this.f119055b.f119146I = this.f119020aE;
        m145379u();
        m145378t();
        if (this.f119037ai == 1) {
            this.f119060g.setIntOption(189, this.f119037ai);
            if (this.f119055b != null) {
                this.f119055b.mo115154h();
            }
        }
        String str = null;
        if (this.f119059f.f118912a == 2) {
            str = this.f119059f.mo115015a(this.f119076w, this.f119077x);
        } else if (this.f119059f.f118912a == 1) {
            C46284d a = this.f119059f.mo115014a();
            if (a != null) {
                str = a.mo115026a();
            }
        }
        if (str != null) {
            if (str != null && str.equals("h264")) {
                this.f119014Z = this.f119054az;
                this.f119038aj = 0;
            } else if (str == null || !str.equals("h265")) {
                this.f119014Z = 0;
            } else {
                this.f119014Z = this.f119016aA;
                this.f119038aj = 1;
            }
            C46334a aVar = this.f119055b;
            if (str == null) {
                str = "";
            }
            aVar.f119141D = str;
        } else {
            this.f119014Z = 0;
        }
        if (this.f119014Z == 1) {
            this.f119060g.setIntOption(59, this.f119014Z);
            C46334a aVar2 = this.f119055b;
            if (this.f119014Z == 1) {
                z = true;
            }
            aVar2.f119213g = z;
            if (this.f119038aj != -1) {
                this.f119060g.setIntOption(181, this.f119039ak);
                this.f119060g.setIntOption(182, this.f119038aj);
                this.f119055b.f119139B = this.f119039ak;
                this.f119055b.f119140C = this.f119038aj;
            }
        }
        if (!(this.f119032ad == -1 || this.f119016aA == 1)) {
            this.f119060g.setIntOption(67, this.f119032ad);
        }
        if (this.f119034af != -1) {
            this.f119060g.setIntOption(81, this.f119034af);
        }
        if (this.f119042an > 0.0f) {
            this.f119060g.setFloatOption(80, this.f119042an);
            this.f119055b.f119217k = this.f119042an;
        }
        if (this.f119066m == -1 && this.f119067n != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            this.f119045aq = sb.toString();
            this.f119060g.setStringOption(17, this.f119045aq);
            this.f119060g.setIntOption(14, 1);
            this.f119060g.setCacheFile(this.f119067n, 1);
        }
        if (this.f119040al != -1) {
            this.f119060g.setIntOption(84, this.f119040al);
            this.f119055b.f119215i = true;
        }
        if (this.f119040al == 0 && this.f119041am != 0) {
            this.f119060g.setIntOption(15, this.f119041am);
            this.f119055b.f119216j = this.f119041am;
        }
        if (this.f119075v && !TextUtils.isEmpty(this.f119047as) && this.f119065l) {
            this.f119060g.setLooping(this.f119065l);
        }
        if (this.f119033ae != -1) {
            this.f119060g.setIntOption(86, this.f119033ae);
        }
        if (this.f119043ao != -1) {
            this.f119060g.setIntOption(190, this.f119043ao);
            this.f119055b.f119218l = this.f119043ao;
        }
        if (this.f119044ap > 0.0f) {
            this.f119060g.setFloatOption(191, this.f119044ap);
            this.f119055b.f119219m = this.f119044ap;
        }
        if (this.f119017aB != -1) {
            this.f119060g.setIntOption(198, this.f119017aB);
            this.f119055b.f119143F = this.f119017aB;
        }
        if (this.f119018aC != 0) {
            this.f119060g.setIntOption(87, this.f119018aC);
            this.f119055b.f119144G = this.f119018aC;
        }
        if (this.f119023aH > 0) {
            this.f119060g.setLongOption(309, this.f119023aH);
            this.f119055b.f119222p = this.f119023aH;
        }
        if (this.f119024aI == 1) {
            this.f119060g.setIntOption(310, this.f119024aI);
            this.f119055b.f119223q = this.f119024aI;
        }
        if (this.f118997I == 1) {
            this.f119060g.setIntOption(311, this.f118997I);
            this.f119055b.f119224r = this.f118997I;
        }
        if (this.f119025aJ == 1) {
            this.f119060g.setIntOption(313, this.f119025aJ);
            this.f119055b.f119225s = this.f119025aJ;
        }
        if (this.f119019aD == 1) {
            this.f119060g.setIntOption(132, this.f119019aD);
        }
        this.f119055b.f119142E = this.f119053ay;
        if (this.f119051aw == 1) {
            this.f119055b.mo115149e();
        }
        this.f119055b.f119147J = this.f119028aM;
    }

    /* renamed from: a */
    public static C46317a m145368a(Context context) {
        return new C46317a(context);
    }

    /* renamed from: b */
    public final void mo115089b(Runnable runnable) {
        this.f119015a.postAtFrontOfQueue(runnable);
    }

    /* renamed from: d */
    public final void mo115097d(String str) {
        this.f119055b.f119164a = str;
    }

    /* renamed from: b */
    public final void mo115091b(boolean z) {
        if (this.f119055b != null) {
            this.f119055b.f119210d = z;
        }
    }

    /* renamed from: h */
    private void m145374h(String str) {
        mo115100f();
        mo115102h();
        m145373g(str);
        this.f119076w = "origin";
        this.f119048at = -1;
        this.f119008T = C46318b.IDLE;
    }

    /* renamed from: i */
    private void m145375i(String str) {
        if (this.f119028aM == 1 && Looper.myLooper() != Looper.getMainLooper() && this.f119055b != null) {
            this.f119055b.mo115150e(str);
        }
    }

    /* renamed from: a */
    public final void mo115072a(float f) {
        this.f119004P.mo115057a(f);
    }

    /* renamed from: c */
    public final void mo115094c(String str) {
        m145375i("setLocalURL");
        if (!(str == null || str.equals(this.f119047as) || this.f119047as == null)) {
            mo115101g();
        }
        this.f119047as = str;
        this.f119075v = true;
    }

    /* renamed from: f */
    private void m145372f(String str) {
        if (this.f119062i == C46331m.PREPARED && this.f119060g != null) {
            if (this.f119069p != null) {
                this.f119055b.mo115138a(this.f119069p, false);
            }
            this.f119060g.start();
        } else if (this.f119062i == C46331m.IDLE || this.f119060g == null) {
            m145380v();
            this.f119062i = C46331m.INITIALIZED;
            if (!this.f119075v || TextUtils.isEmpty(this.f119047as)) {
                mo115099e(str);
            } else {
                this.f119055b.mo115141b();
                mo115083a(this.f119047as, null);
            }
        } else {
            m145377s();
            if (!this.f119075v || TextUtils.isEmpty(this.f119047as)) {
                mo115099e(str);
            } else {
                mo115083a(this.f119047as, null);
            }
        }
        this.f119063j = false;
    }

    /* renamed from: g */
    private void m145373g(String str) {
        if (this.f119061h != null) {
            this.f119061h.mo115046a();
        }
        if (this.f119057d != null) {
            this.f119057d.mo115028a();
        }
        if (!str.equals("reset") && this.f119008T == C46318b.PLAYED) {
            this.f119055b.mo115135a(str);
        }
        this.f119055b.mo115147d();
        this.f119058e.mo115065d();
        if (str.equals("reset")) {
            this.f119059f.mo115022c();
        }
        this.f119064k = false;
        this.f119079z = 0;
        this.f118992A = 0;
        this.f119070q = 0;
        this.f119063j = true;
        this.f119008T = C46318b.STOPPED;
        this.f118995G = false;
        this.f118996H = 0;
        this.f119071r = false;
        this.f119015a.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    public final void mo115090b(String str) {
        JSONObject jSONObject;
        new StringBuilder("setStreamInfo:").append(str);
        m145375i("setStreamInfo");
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            m145374h("setStreamInfo");
            this.f119059f.mo115017a(new C46283c(jSONObject));
        }
    }

    /* renamed from: c */
    public final boolean mo115095c(int i) {
        if (this.f119046ar != null && this.f119046ar.startsWith("httpk")) {
            String replaceAll = this.f119046ar.replaceAll("httpk", WebKitApi.SCHEME_HTTP).replaceAll(":(\\d+)/", "/");
            if (replaceAll != null) {
                this.f119055b.f119208b = replaceAll;
                this.f119055b.mo115137a(this.f119046ar, replaceAll, "httpk_to_http", i);
                this.f119046ar = replaceAll;
                mo115100f();
                mo115102h();
                mo115099e(this.f119046ar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo115092b(int i) {
        boolean z = false;
        if (this.f119049au != 2) {
            return false;
        }
        String str = this.f119059f.mo115020b("h264").f118919a;
        if (str == null) {
            return false;
        }
        this.f119055b.f119208b = str;
        this.f119055b.mo115137a(this.f119046ar, str, "h265_to_h264", i);
        this.f119046ar = str;
        this.f119049au = 1;
        this.f119055b.f119141D = "h264";
        if (this.f119014Z != 1 && this.f119054az == 1) {
            this.f119014Z = 1;
            this.f119038aj = 0;
            this.f119060g.setIntOption(59, this.f119014Z);
            C46334a aVar = this.f119055b;
            if (this.f119014Z == 1) {
                z = true;
            }
            aVar.f119213g = z;
        }
        mo115102h();
        mo115099e(str);
        return true;
    }

    /* renamed from: e */
    public final void mo115099e(final String str) {
        if (str != null && str.length() != 0) {
            this.f119046ar = str;
            final String c = this.f119057d.mo115036c(str);
            if (C46286a.m145308d(c) || !this.f119052ax) {
                this.f119055b.mo115140a(false, false);
                this.f119055b.mo115141b();
                this.f119055b.mo115138a(c, false);
                mo115083a(str, null);
                this.f119069p = c;
                return;
            }
            this.f119058e.f118978d = c;
            if (this.f119050av != null && this.f119058e.mo115059a() <= 3) {
                String a = C45912b.m144016a(c, this.f119050av);
                if (!TextUtils.isEmpty(a)) {
                    this.f119055b.mo115140a(false, true);
                    String a2 = this.f119050av.mo111181a(c, a);
                    if (a2 != null) {
                        this.f119055b.mo115152f(a2);
                    } else {
                        this.f119055b.mo115152f("sdk_previous_dns");
                    }
                    boolean b = this.f119050av.mo111188b(c);
                    if (b) {
                        this.f119055b.f119211e = b;
                    }
                    this.f119069p = a;
                    this.f119055b.mo115141b();
                    this.f119055b.mo115138a(a, false);
                    HashMap hashMap = new HashMap();
                    String a3 = this.f119057d.mo115027a(str, a, hashMap);
                    if (hashMap.isEmpty()) {
                        hashMap = null;
                    }
                    mo115083a(a3, (Map<String, String>) hashMap);
                    return;
                }
            }
            this.f119057d.mo115030a(c, new C46290a() {
                /* renamed from: a */
                public final void mo115041a(String str, final String str2, final LiveError liveError, boolean z) {
                    if (c != null && str != null && c.equals(str)) {
                        C46311e.this.f119055b.mo115140a(!z, false);
                        if (!z) {
                            HashMap hashMap = new HashMap();
                            String str3 = str;
                            if (str2 == null || str2.length() == 0) {
                                str2 = c;
                            } else {
                                str3 = C46311e.this.f119057d.mo115027a(str, str2, hashMap);
                            }
                            C46311e.this.f119055b.mo115141b();
                            C46311e.this.f119055b.mo115138a(str2, false);
                            C46311e eVar = C46311e.this;
                            if (hashMap.isEmpty()) {
                                hashMap = null;
                            }
                            eVar.mo115083a(str3, (Map<String, String>) hashMap);
                            C46311e.this.f119069p = str2;
                            return;
                        }
                        C46311e.this.mo115089b((Runnable) new Runnable() {
                            public final void run() {
                                if (liveError != null) {
                                    C46311e.this.f119058e.mo115061a(liveError);
                                    LiveError liveError = liveError;
                                } else if (!C46311e.this.f119063j) {
                                    String str = str2;
                                    if (str2 == null || str2.length() == 0) {
                                        str = c;
                                    }
                                    HashMap hashMap = new HashMap();
                                    String a = C46311e.this.f119057d.mo115027a(str, str, hashMap);
                                    C46311e.this.f119055b.mo115141b();
                                    C46311e.this.f119055b.mo115138a(str, false);
                                    C46311e eVar = C46311e.this;
                                    if (hashMap.isEmpty()) {
                                        hashMap = null;
                                    }
                                    eVar.mo115083a(a, (Map<String, String>) hashMap);
                                    C46311e.this.f119069p = str;
                                }
                            }
                        });
                    }
                }
            });
        } else if (this.f119059f.f118912a == 1 && mo115092b(-117)) {
        } else {
            if (!this.f119074u || this.f119059f.f118912a != 2 || !mo115086a(-102)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url", "try out all urls");
                this.f119058e.mo115061a(new LiveError(-102, "try out all urls", hashMap2));
            }
        }
    }

    private C46311e(C46317a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new C46330l() {
        });
        this.f118998J = threadPoolExecutor;
        this.f119015a = new Handler(Looper.myLooper());
        this.f119059f = new C46282b();
        this.f119062i = C46331m.IDLE;
        this.f119008T = C46318b.IDLE;
        this.f119063j = false;
        this.f119064k = false;
        this.f119065l = false;
        this.f119009U = 0;
        this.f119010V = 0;
        this.f119011W = 0;
        this.f119012X = 0;
        this.f119013Y = 3;
        this.f119014Z = 0;
        this.f119066m = -1;
        this.f119029aa = -1;
        this.f119030ab = -1;
        this.f119031ac = -1;
        this.f119032ad = 1;
        this.f119033ae = -1;
        this.f119034af = -1;
        this.f119035ag = -1;
        this.f119036ah = 0;
        this.f119037ai = 0;
        this.f119038aj = -1;
        this.f119039ak = 0;
        this.f119040al = -1;
        this.f119041am = 0;
        this.f119042an = -1.0f;
        this.f119043ao = -1;
        this.f119044ap = -1.0f;
        this.f119067n = null;
        this.f119045aq = null;
        this.f119068o = false;
        this.f119046ar = null;
        this.f119069p = null;
        this.f119070q = 0;
        this.f119071r = false;
        this.f119072s = false;
        this.f119073t = 4;
        this.f119074u = true;
        this.f119047as = null;
        this.f119075v = false;
        this.f119076w = "origin";
        this.f119048at = -1;
        this.f119077x = "main";
        this.f119078y = "flv";
        this.f119049au = 1;
        this.f119050av = null;
        this.f119079z = 0;
        this.f118992A = 0;
        this.f119051aw = 0;
        this.f119052ax = true;
        this.f119053ay = false;
        this.f119054az = 0;
        this.f119016aA = 0;
        this.f119017aB = -1;
        this.f119018aC = 0;
        this.f119019aD = 1;
        this.f118993B = 0;
        this.f119020aE = 1;
        this.f119021aF = 1;
        this.f119022aG = 8000;
        this.f118994F = false;
        this.f118995G = false;
        this.f118996H = 0;
        this.f119023aH = 0;
        this.f119024aI = 0;
        this.f118997I = 0;
        this.f119025aJ = 0;
        this.f119026aK = -1;
        this.f119028aM = 1;
        this.f118999K = aVar.f119093a;
        this.f119056c = aVar.f119094b;
        this.f119002N = aVar.f119097e;
        C46334a aVar2 = new C46334a(this, this.f119056c, aVar.f119107o, this.f118999K);
        this.f119055b = aVar2;
        this.f119055b.f119164a = aVar.f119095c;
        C46308a aVar3 = new C46308a(new C46329k(this), aVar.f119100h, aVar.f119106n, this.f119055b);
        this.f119058e = aVar3;
        this.f119004P = new C46306c(this.f118999K, null);
        this.f119001M = aVar.f119098f;
        this.f119055b.f119138A = this.f119001M;
        this.f119000L = aVar.f119096d;
        this.f119057d = new C46286a(this.f118999K, this.f118998J, this.f119000L);
        this.f119057d.mo115033b();
        this.f119003O = aVar.f119101i;
        this.f119078y = aVar.f119103k;
        this.f119076w = aVar.f119102j;
        this.f119070q = 0;
        this.f119072s = aVar.f119104l;
        this.f119074u = aVar.f119105m;
        this.f119022aG = aVar.f119108p;
    }

    /* renamed from: a */
    public final void mo115076a(Surface surface) {
        long currentTimeMillis = System.currentTimeMillis();
        m145375i("setSurface");
        this.f119007S = surface;
        if (this.f119060g != null) {
            this.f119060g.setSurface(surface);
        }
        this.f119055b.f119148K = System.currentTimeMillis() - currentTimeMillis;
    }

    /* renamed from: a */
    private void m145370a(boolean z, String str) {
        if (this.f119008T != C46318b.PLAYED) {
            this.f119055b.mo115148d(str);
            return;
        }
        if (z) {
            mo115100f();
        } else {
            this.f119062i = C46331m.INITIALIZED;
        }
        m145373g(str);
        this.f119008T = C46318b.STOPPED;
    }

    /* renamed from: a */
    public final void mo115073a(int i, float f) {
        String str = "";
        switch (i) {
            case 19:
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("catch_speed:");
                sb.append(f);
                str = sb.toString();
                this.f119042an = f;
                if (this.f119060g != null) {
                    this.f119060g.setFloatOption(80, f);
                    this.f119055b.f119217k = f;
                    break;
                }
                break;
            case 20:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("slow_speed:");
                sb2.append(f);
                str = sb2.toString();
                this.f119044ap = f;
                if (this.f119060g != null) {
                    this.f119060g.setFloatOption(191, f);
                    this.f119055b.f119219m = f;
                    break;
                }
                break;
        }
        new StringBuilder("setFloatOption ").append(str);
    }

    /* renamed from: a */
    private String m145369a(String str, int i) {
        if (str == null || str.length() == 0 || this.f119027aL == null || this.f119027aL.length() == 0) {
            return null;
        }
        C46334a aVar = this.f119055b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119027aL);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(i);
        aVar.f119226t = sb.toString();
        StringBuilder sb2 = new StringBuilder("_session_id=");
        sb2.append(this.f119027aL);
        sb2.append(ClassUtils.PACKAGE_SEPARATOR);
        sb2.append(i);
        String sb3 = sb2.toString();
        int indexOf = str.indexOf("?");
        if (indexOf == -1) {
            StringBuilder sb4 = new StringBuilder("?");
            sb4.append(sb3);
            sb3 = sb4.toString();
        } else if (indexOf != str.length() - 1) {
            StringBuilder sb5 = new StringBuilder("&_session_id=");
            sb5.append(this.f119027aL);
            sb5.append(ClassUtils.PACKAGE_SEPARATOR);
            sb5.append(i);
            sb3 = sb5.toString();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(sb3);
        return sb6.toString();
    }

    /* renamed from: a */
    public final void mo115075a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("set resolution:");
        sb.append(str);
        String sb2 = sb.toString();
        this.f119076w = str;
        new StringBuilder("setStringOption ").append(sb2);
    }

    /* renamed from: a */
    public final void mo115074a(int i, int i2) {
        String str = "";
        boolean z = true;
        switch (i) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("image_enhancement:");
                sb.append(i2);
                str = sb.toString();
                this.f119010V = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(37, i2);
                    break;
                }
                break;
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("image_scale:");
                sb2.append(i2);
                str = sb2.toString();
                this.f119011W = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(38, i2);
                    break;
                }
                break;
            case 3:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("forbid_os_player:");
                sb3.append(i2);
                str = sb3.toString();
                TTPlayerConfiger.setValue(11, i2);
                break;
            case 4:
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append("image_layout:");
                sb4.append(i2);
                str = sb4.toString();
                this.f119012X = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(36, i2);
                    break;
                }
                break;
            case 5:
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append("render_type:");
                sb5.append(i2);
                str = sb5.toString();
                this.f119013Y = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(56, i2);
                    break;
                }
                break;
            case 7:
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append("hard_decode:");
                sb6.append(i2);
                str = sb6.toString();
                this.f119014Z = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(59, i2);
                    break;
                }
                break;
            case 8:
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append("enable_cache_file:");
                sb7.append(i2);
                str = sb7.toString();
                this.f119066m = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(14, 1);
                    break;
                }
                break;
            case 9:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append("h265_decoder_type:");
                sb8.append(i2);
                str = sb8.toString();
                this.f119032ad = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(67, i2);
                    break;
                }
                break;
            case 10:
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append("buffering_millSeconds:");
                sb9.append(i2);
                str = sb9.toString();
                this.f119033ae = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(86, i2);
                    break;
                }
                break;
            case 11:
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append("buffering_timeout:");
                sb10.append(i2);
                str = sb10.toString();
                this.f119034af = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(81, i2);
                    break;
                }
                break;
            case 12:
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append("network_timeout:");
                sb11.append(i2);
                str = sb11.toString();
                this.f119035ag = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(9, i2 * C28539a.f75176k);
                    break;
                }
                break;
            case 15:
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append("use_external_dir:");
                sb12.append(i2);
                str = sb12.toString();
                this.f119030ab = i2;
                break;
            case 16:
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append("use_test_action:");
                sb13.append(i2);
                str = sb13.toString();
                this.f119029aa = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(83, this.f119029aa);
                    break;
                }
                break;
            case 17:
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append("hurry_time:");
                sb14.append(i2);
                str = sb14.toString();
                this.f119041am = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(15, i2);
                    this.f119055b.f119216j = i2;
                    break;
                }
                break;
            case 18:
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append("hurry_type:");
                sb15.append(i2);
                str = sb15.toString();
                this.f119040al = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(84, i2);
                    break;
                }
                break;
            case 21:
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append("slow_play_time:");
                sb16.append(i2);
                str = sb16.toString();
                this.f119043ao = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(190, i2);
                    this.f119055b.f119218l = i2;
                    break;
                }
                break;
            case 22:
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append("check side data");
                sb17.append(i2);
                str = sb17.toString();
                this.f119019aD = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(132, i2);
                    break;
                }
                break;
            case 25:
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append("player_degrade_mode:");
                sb18.append(i2);
                str = sb18.toString();
                this.f119036ah = i2;
                break;
            case 31:
                StringBuilder sb19 = new StringBuilder();
                sb19.append(str);
                sb19.append("url_ability:");
                sb19.append(i2);
                str = sb19.toString();
                this.f119049au = i2;
                if (i2 != 1) {
                    if (i2 == 2) {
                        this.f119055b.f119141D = "h265";
                        break;
                    }
                } else {
                    this.f119055b.f119141D = "h264";
                    break;
                }
                break;
            case 32:
                StringBuilder sb20 = new StringBuilder();
                sb20.append(str);
                sb20.append("enable_sharp:");
                sb20.append(i2);
                str = sb20.toString();
                this.f119037ai = i2;
                break;
            case 33:
                StringBuilder sb21 = new StringBuilder();
                sb21.append(str);
                sb21.append("asyncInit:");
                sb21.append(i2);
                str = sb21.toString();
                this.f119039ak = i2;
                if (this.f119060g != null && this.f119014Z == 1) {
                    this.f119060g.setIntOption(181, i2);
                    this.f119055b.f119139B = i2;
                    break;
                }
            case BaseNotice.CHALLENGE /*34*/:
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str);
                sb22.append("defaultCodecID:");
                sb22.append(i2);
                str = sb22.toString();
                this.f119038aj = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(182, i2);
                    this.f119055b.f119140C = i2;
                    break;
                }
                break;
            case 35:
                StringBuilder sb23 = new StringBuilder();
                sb23.append(str);
                sb23.append("enable 264 hardware decode ");
                sb23.append(i2);
                str = sb23.toString();
                this.f119054az = i2;
                break;
            case 36:
                StringBuilder sb24 = new StringBuilder();
                sb24.append(str);
                sb24.append("enable 265 hardware decode ");
                sb24.append(i2);
                str = sb24.toString();
                this.f119016aA = i2;
                break;
            case 37:
                StringBuilder sb25 = new StringBuilder();
                sb25.append(str);
                sb25.append("set max cache");
                sb25.append(i2);
                str = sb25.toString();
                this.f119017aB = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(198, i2);
                    this.f119055b.f119143F = i2;
                    break;
                }
                break;
            case 38:
                StringBuilder sb26 = new StringBuilder();
                sb26.append(str);
                sb26.append("enable test split ");
                sb26.append(i2);
                str = sb26.toString();
                this.f119018aC = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(87, i2);
                    this.f119055b.f119144G = i2;
                    break;
                }
                break;
            case 39:
                StringBuilder sb27 = new StringBuilder();
                sb27.append(str);
                sb27.append("enable httpk degrade:");
                sb27.append(i2);
                str = sb27.toString();
                this.f118993B = i2;
                break;
            case 40:
                StringBuilder sb28 = new StringBuilder();
                sb28.append(str);
                sb28.append("enable fast open:");
                sb28.append(i2);
                str = sb28.toString();
                this.f119020aE = i2;
                break;
            case BaseNotice.LIKE /*41*/:
                StringBuilder sb29 = new StringBuilder();
                sb29.append(str);
                sb29.append("enable upload sei:");
                sb29.append(i2);
                str = sb29.toString();
                this.f119021aF = i2;
                break;
            case 42:
                StringBuilder sb30 = new StringBuilder();
                sb30.append(str);
                sb30.append("enable NTP:");
                sb30.append(i2);
                str = sb30.toString();
                this.f119051aw = i2;
                break;
            case 44:
                StringBuilder sb31 = new StringBuilder();
                sb31.append(str);
                sb31.append("set in main looper:");
                sb31.append(i2);
                str = sb31.toString();
                this.f119028aM = i2;
                break;
            case 46:
                StringBuilder sb32 = new StringBuilder();
                sb32.append(str);
                sb32.append("buffering end ignore video:");
                sb32.append(i2);
                str = sb32.toString();
                this.f119024aI = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(310, i2);
                    this.f119055b.f119223q = i2;
                    break;
                }
                break;
            case 47:
                StringBuilder sb33 = new StringBuilder();
                sb33.append(str);
                sb33.append("start direct:");
                sb33.append(i2);
                str = sb33.toString();
                this.f118997I = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(311, i2);
                    this.f119055b.f119224r = i2;
                    break;
                }
                break;
            case 48:
                StringBuilder sb34 = new StringBuilder();
                sb34.append(str);
                sb34.append("check buffering end advance:");
                sb34.append(i2);
                str = sb34.toString();
                this.f119025aJ = i2;
                if (this.f119060g != null) {
                    this.f119060g.setIntOption(313, i2);
                    this.f119055b.f119225s = i2;
                    break;
                }
                break;
            case 49:
                StringBuilder sb35 = new StringBuilder();
                sb35.append(str);
                sb35.append("set stall count thre:");
                sb35.append(i2);
                str = sb35.toString();
                this.f119073t = i2;
                break;
            case 50:
                StringBuilder sb36 = new StringBuilder();
                sb36.append(str);
                sb36.append("enable resolution degrade:");
                sb36.append(i2);
                str = sb36.toString();
                if (i2 != 1) {
                    z = false;
                }
                this.f119072s = z;
                break;
        }
        new StringBuilder("setIntOption ").append(str);
    }
}

package com.p280ss.android.p817ad.splash.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.p817ad.splash.C19141h;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p828c.C19002c.C19003a;
import com.p280ss.android.p817ad.splash.core.p828c.C19012k;
import com.p280ss.android.p817ad.splash.core.video.C19076b.C19077a;
import com.p280ss.android.p817ad.splash.core.video.C19088e;
import com.p280ss.android.p817ad.splash.core.video.C19088e.C19090a;
import com.p280ss.android.p817ad.splash.core.video.C19091f;
import com.p280ss.android.p817ad.splash.core.video2.BDASplashVideoView;
import com.p280ss.android.p817ad.splash.core.video2.C19097a;
import com.p280ss.android.p817ad.splash.core.video2.C19099b;
import com.p280ss.android.p817ad.splash.core.video2.C19100c;
import com.p280ss.android.p817ad.splash.core.video2.C19103d;
import com.p280ss.android.p817ad.splash.p836g.C19125d;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import com.p280ss.android.p817ad.splash.p836g.C19133k;
import com.p280ss.android.p817ad.splash.p836g.C19137n;
import com.p280ss.android.p817ad.splash.p836g.C19139p;
import com.p280ss.android.p817ad.splash.p836g.C19139p.C19140a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.b */
public final class C18968b extends RelativeLayout implements C19041g, C19140a {

    /* renamed from: A */
    private TextView f51139A;

    /* renamed from: B */
    private BDASplashVideoView f51140B;

    /* renamed from: C */
    private Timer f51141C;

    /* renamed from: D */
    private int f51142D = -1;

    /* renamed from: E */
    private boolean f51143E = false;

    /* renamed from: a */
    public C19001b f51144a;

    /* renamed from: b */
    public BDASplashImageView f51145b;

    /* renamed from: c */
    public View f51146c;

    /* renamed from: d */
    public C19091f f51147d;

    /* renamed from: e */
    public C19049n f51148e;

    /* renamed from: f */
    public C19139p f51149f = new C19139p(this);

    /* renamed from: g */
    public boolean f51150g = false;

    /* renamed from: h */
    public C19103d f51151h;

    /* renamed from: i */
    public int f51152i = -1;

    /* renamed from: j */
    private ImageView f51153j;

    /* renamed from: k */
    private Space f51154k;

    /* renamed from: l */
    private ViewGroup f51155l;

    /* renamed from: m */
    private TextView f51156m;

    /* renamed from: n */
    private ImageView f51157n;

    /* renamed from: o */
    private RotateAnimation f51158o;

    /* renamed from: p */
    private ViewGroup f51159p;

    /* renamed from: q */
    private FrameLayout f51160q;

    /* renamed from: r */
    private TextView f51161r;

    /* renamed from: s */
    private TextView f51162s;

    /* renamed from: t */
    private boolean f51163t = false;

    /* renamed from: u */
    private long f51164u = 0;

    /* renamed from: v */
    private long f51165v = 0;

    /* renamed from: w */
    private FrameLayout f51166w;

    /* renamed from: x */
    private TextView f51167x;

    /* renamed from: y */
    private Space f51168y;

    /* renamed from: z */
    private TextView f51169z;

    /* renamed from: a */
    public final boolean mo50407a(C19001b bVar) {
        boolean z;
        int r = bVar.mo50377r();
        if (r != 0) {
            switch (r) {
                case 2:
                    z = m61937c(bVar);
                    break;
                case 3:
                    z = m61939d(bVar);
                    break;
                case 4:
                    setImageTouchListener(bVar);
                    z = m61943f(bVar);
                    break;
                default:
                    z = false;
                    break;
            }
        } else {
            setImageTouchListener(bVar);
            z = m61941e(bVar);
        }
        if (!z) {
            return false;
        }
        this.f51144a = bVar;
        this.f51163t = true;
        this.f51164u = bVar.mo50478c();
        this.f51143E = bVar.f51264C;
        if (this.f51143E) {
            m61942f();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m61948i();
    }

    public final boolean performClick() {
        return super.performClick();
    }

    /* renamed from: g */
    private void m61944g() {
        C19048m.m62245a().f51473a = System.currentTimeMillis();
        this.f51148e.mo50552c();
    }

    /* renamed from: j */
    private void m61949j() {
        getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                C18968b.this.getViewTreeObserver().removeOnPreDrawListener(this);
                C18968b.this.mo50408b();
                C18968b.this.f51148e.mo50550b(C18968b.this.f51144a);
                return true;
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m61949j();
        if (this.f51143E) {
            m61950k();
        }
    }

    /* renamed from: f */
    private void m61942f() {
        this.f51142D = (int) (this.f51164u / 1000);
        this.f51156m.setText(m61934a(this.f51142D));
        this.f51167x.setText(m61934a(this.f51142D));
    }

    /* renamed from: k */
    private void m61950k() {
        if (this.f51141C == null) {
            this.f51141C = new Timer();
            this.f51141C.scheduleAtFixedRate(new TimerTask() {
                public final void run() {
                    Message obtainMessage = C18968b.this.f51149f.obtainMessage();
                    obtainMessage.what = 2;
                    C18968b.this.f51149f.sendMessage(obtainMessage);
                }
            }, (this.f51164u % 1000) + 1000, 1000);
        }
    }

    /* renamed from: l */
    private void m61951l() {
        if (this.f51145b != null && C19025f.m62105S() == 1) {
            this.f51145b.setScaleType(ScaleType.CENTER_CROP);
        }
    }

    /* renamed from: b */
    public final void mo50408b() {
        if (this.f51163t) {
            this.f51149f.removeMessages(1);
            this.f51149f.sendEmptyMessageDelayed(1, this.f51164u);
            m61944g();
        }
    }

    /* renamed from: c */
    public final void mo50410c() {
        if (this.f51147d != null) {
            this.f51147d.mo50752a(true);
        }
        if (this.f51151h != null && this.f51151h.mo50790b()) {
            this.f51151h.mo50788a(true);
        }
    }

    /* renamed from: d */
    private void m61938d() {
        inflate(getContext(), R.layout.ajj, this);
        if (C19025f.m62186q() != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), C19025f.m62186q()).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        m61940e();
    }

    /* renamed from: h */
    private void m61947h() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        int a = (int) C19137n.m62745a(getContext(), 9.0f);
        layoutParams.setMargins(0, (int) C19137n.m62745a(getContext(), 14.0f), a, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams.addRule(21);
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(a);
        } else {
            layoutParams.addRule(11);
        }
        this.f51161r.setLayoutParams(layoutParams);
    }

    /* renamed from: i */
    private void m61948i() {
        if (this.f51147d != null) {
            this.f51147d.mo50755c();
            this.f51147d = null;
        }
        if (this.f51158o != null) {
            this.f51158o.cancel();
            this.f51158o = null;
        }
        if (this.f51145b != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) this.f51145b.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.f51145b.setImageBitmap(null);
                }
            } catch (Exception unused) {
            }
        }
        C19100c.m62610a().mo50808b();
        if (this.f51151h != null) {
            this.f51151h.mo50792d();
            this.f51151h = null;
            this.f51140B = null;
        }
        if (this.f51141C != null) {
            this.f51141C.cancel();
            this.f51141C = null;
        }
    }

    /* renamed from: e */
    private void m61940e() {
        if (C19137n.m62752c(getContext())) {
            findViewById(R.id.d97).setVisibility(0);
        }
        try {
            this.f51145b = (BDASplashImageView) findViewById(R.id.d9h);
            try {
                this.f51140B = (BDASplashVideoView) findViewById(R.id.d9g);
                this.f51154k = (Space) findViewById(R.id.kg);
                this.f51161r = (TextView) findViewById(R.id.dc);
                this.f51146c = findViewById(R.id.d9a);
                this.f51162s = (TextView) findViewById(R.id.d9c);
                this.f51155l = (ViewGroup) findViewById(R.id.c6);
                this.f51156m = (TextView) findViewById(R.id.da);
                this.f51153j = (ImageView) findViewById(R.id.df);
                this.f51166w = (FrameLayout) findViewById(R.id.b4);
                this.f51167x = (TextView) findViewById(R.id.b5);
                this.f51168y = (Space) findViewById(R.id.b3);
                this.f51169z = (TextView) findViewById(R.id.b7);
                this.f51139A = (TextView) findViewById(R.id.b6);
                if (C19025f.m62185p() != 0) {
                    this.f51153j.setImageResource(C19025f.m62185p());
                }
                if (C19025f.m62177l() != 0) {
                    this.f51161r.setText(C19025f.m62177l());
                    this.f51169z.setText(C19025f.m62177l());
                } else {
                    this.f51161r.setText(R.string.dwi);
                    this.f51169z.setText(R.string.dwi);
                }
                if (C19025f.m62181n() != 0) {
                    this.f51156m.setText(C19025f.m62181n());
                } else {
                    this.f51156m.setText(R.string.dw4);
                }
                if (C19025f.m62179m() != 0) {
                    this.f51156m.setBackgroundResource(C19025f.m62179m());
                    this.f51167x.setBackgroundResource(C19025f.m62179m());
                }
                this.f51157n = (ImageView) findViewById(R.id.d_);
                if (C19025f.m62183o() != 0) {
                    this.f51157n.setImageResource(C19025f.m62183o());
                } else {
                    this.f51157n.setImageResource(R.drawable.bjp);
                }
                this.f51159p = (ViewGroup) findViewById(R.id.d9f);
                this.f51160q = (FrameLayout) findViewById(R.id.d9e);
                m61951l();
            } catch (ClassCastException e) {
                StringBuilder sb = new StringBuilder("curClassLoader: ");
                sb.append(BDASplashImageView.class.getClassLoader());
                sb.append("; objClassLoader:");
                sb.append(findViewById(R.id.d9g).getClass().getClassLoader());
                throw new RuntimeException(sb.toString(), e);
            }
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder("curClassLoader: ");
            sb2.append(BDASplashImageView.class.getClassLoader());
            sb2.append("; objClassLoader:");
            sb2.append(findViewById(R.id.d9h).getClass().getClassLoader());
            throw new RuntimeException(sb2.toString(), e2);
        }
    }

    /* renamed from: a */
    public final void mo50405a() {
        this.f51156m.setVisibility(4);
        this.f51157n.setVisibility(0);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f51158o = rotateAnimation;
        this.f51158o.setDuration(800);
        this.f51158o.setRepeatCount(-1);
        this.f51158o.setRepeatMode(1);
        this.f51158o.setInterpolator(new LinearInterpolator());
        this.f51157n.startAnimation(this.f51158o);
    }

    public final void setSplashAdInteraction(C19049n nVar) {
        this.f51148e = nVar;
    }

    /* renamed from: h */
    private C19099b m61946h(final C19001b bVar) {
        return new C19099b() {
            /* renamed from: b */
            public final void mo50432b() {
                C18968b.this.f51148e.mo50549b();
            }

            /* renamed from: a */
            public final void mo50429a() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("show_expected", bVar.f51290b);
                    String str = "not_real_time";
                    if (bVar.mo50486i()) {
                        str = "real_time";
                    }
                    jSONObject.put("show_type", str);
                    if (C19025f.m62109W() != -1) {
                        int i = 1;
                        if (C19025f.m62109W() != 1) {
                            i = 2;
                        }
                        jSONObject.put("awemelaunch", i);
                    }
                    jSONObject.put("ad_sequence", C19062u.m62368a().mo50637r());
                    jSONObject2.putOpt("ad_extra_data", jSONObject);
                    jSONObject2.putOpt("is_ad_event", "1");
                    if (!C19132j.m62736a(bVar.mo50376p())) {
                        jSONObject2.put("log_extra", bVar.mo50376p());
                    }
                    jSONObject2.put("ad_fetch_time", bVar.mo50374f());
                } catch (JSONException unused) {
                    jSONObject2 = null;
                }
                C19025f.m62115a(bVar.mo50375n(), "splash_ad", "play", jSONObject2);
                if (bVar.f51302n != null) {
                    C19025f.m62093G().mo50525c(C18968b.this.f51145b, bVar.mo50375n(), bVar.f51302n.f51349a, bVar.mo50376p(), true, -1, null);
                }
            }

            /* renamed from: a */
            public final void mo50430a(int i) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", Long.toString((long) i));
                    jSONObject.put("percent", Integer.toString(100));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.mo50374f());
                    if (!C19132j.m62736a(bVar.mo50376p())) {
                        jSONObject.put("log_extra", bVar.mo50376p());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                C19025f.m62115a(bVar.mo50375n(), "splash_ad", "play_over", jSONObject);
                if (bVar.f51302n != null) {
                    C19025f.m62093G().mo50526d(C18968b.this.f51145b, bVar.mo50375n(), bVar.f51302n.f51350b, bVar.mo50376p(), true, -1, null);
                }
                C18968b.this.f51148e.mo50546a();
            }

            /* renamed from: a */
            public final void mo50431a(int i, int i2) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j = (long) i;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", C19133k.m62737a(j, (long) i2));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("category", "umeng");
                    jSONObject.put("ad_fetch_time", bVar.mo50374f());
                    jSONObject.put("break_reason", C18968b.this.f51152i);
                    if (!C19132j.m62736a(bVar.mo50376p())) {
                        jSONObject.put("log_extra", bVar.mo50376p());
                    }
                    jSONObject2.put("break_reason", C18968b.this.f51152i);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                C19025f.m62115a(bVar.mo50375n(), "splash_ad", "play_break", jSONObject);
            }
        };
    }

    private void setImageTouchListener(final C19001b bVar) {
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                String str;
                if ((C18968b.this.getTouchDelegate() == null || !C18968b.this.getTouchDelegate().onTouchEvent(motionEvent)) && motionEvent.getAction() == 1) {
                    if (C18968b.this.f51150g) {
                        str = "click_normal_area";
                    } else {
                        str = "";
                    }
                    C18968b.this.f51148e.mo50548a(bVar, new C19003a().mo50499a(0).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50504b(C18968b.this.f51150g).mo50501a(str).mo50503a());
                }
                return true;
            }
        });
    }

    private void setSplashAdListener(final C19001b bVar) {
        this.f51147d.mo50751a((C19077a) new C19077a() {
            /* renamed from: a */
            public final void mo50421a() {
                C18968b.this.f51148e.mo50546a();
            }

            /* renamed from: b */
            public final void mo50424b(long j, int i) {
                C18968b.this.f51148e.mo50549b();
            }

            /* renamed from: c */
            public final void mo50425c(long j, int i) {
                C18968b.this.f51148e.mo50547a(bVar);
            }

            /* renamed from: a */
            public final void mo50422a(long j, int i) {
                new StringBuilder("Video play Complete ").append(j);
                C18968b.this.f51148e.mo50546a();
            }

            /* renamed from: a */
            public final void mo50423a(long j, int i, int i2, int i3) {
                C18968b.this.f51148e.mo50551b(bVar, new C19003a().mo50502a(true).mo50500a(i2, i3).mo50503a());
            }
        });
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m61948i();
        }
    }

    public C18968b(Context context) {
        super(context);
        m61938d();
    }

    private void setSkipClickListener(final C19001b bVar) {
        this.f51166w.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C18968b.this.f51147d != null) {
                    C18968b.this.f51147d.mo50754b();
                }
                if (C18968b.this.f51151h != null) {
                    C18968b.this.f51152i = 2;
                    C18968b.this.f51151h.mo50784a();
                }
                C18968b.this.f51148e.mo50547a(bVar);
            }
        });
        this.f51155l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C18968b.this.f51147d != null) {
                    C18968b.this.f51147d.mo50754b();
                }
                if (C18968b.this.f51151h != null) {
                    C18968b.this.f51152i = 2;
                    C18968b.this.f51151h.mo50784a();
                }
                C18968b.this.mo50405a();
                C18968b.this.f51148e.mo50547a(bVar);
            }
        });
    }

    /* renamed from: f */
    private boolean m61943f(C19001b bVar) {
        if (!m61945g(bVar)) {
            return false;
        }
        if (bVar.f51299k != 1) {
            this.f51155l.setVisibility(8);
        } else if (bVar.mo50498z()) {
            this.f51166w.setVisibility(0);
            setSkipClickListener(bVar);
        } else {
            this.f51155l.setVisibility(0);
            setSkipClickListener(bVar);
        }
        setSplashInfoStyle(bVar);
        m61944g();
        return true;
    }

    /* renamed from: a */
    private static String m61934a(int i) {
        if (i < 0) {
            i = 0;
        }
        if (C19025f.m62181n() != 0) {
            return C1642a.m8034a("%ds %s", new Object[]{Integer.valueOf(i), C19025f.m62096J().getResources().getString(C19025f.m62181n())});
        }
        return C1642a.m8034a("%ds %s", new Object[]{Integer.valueOf(i), C19025f.m62096J().getResources().getString(R.string.dw4)});
    }

    private void setSkipAndWifiPreloadLayout(C19001b bVar) {
        if (bVar.mo50498z()) {
            if (bVar.f51299k == 1) {
                this.f51166w.setVisibility(0);
            } else {
                this.f51166w.setVisibility(8);
            }
            if (C19025f.m62148c()) {
                this.f51169z.setVisibility(0);
            }
            this.f51139A.setVisibility(0);
            m61936a(bVar.mo50498z(), bVar.mo50484h());
            return;
        }
        if (bVar.f51299k == 1) {
            this.f51155l.setVisibility(0);
        } else {
            this.f51155l.setVisibility(8);
            m61947h();
        }
        if (C19025f.m62148c()) {
            this.f51161r.setVisibility(0);
        }
    }

    private void setSplashInfoStyle(C19001b bVar) {
        if (!bVar.mo50498z()) {
            if (bVar.mo50484h() || C19025f.m62167h() != 1) {
                if (!(bVar == null || bVar.f51299k == 1)) {
                    m61947h();
                }
                return;
            }
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.addRule(12);
            int a = (int) C19137n.m62745a(getContext(), 10.0f);
            layoutParams.setMargins(0, 0, a, (int) C19137n.m62745a(getContext(), 10.0f));
            if (VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21);
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(a);
            } else {
                layoutParams.addRule(11);
            }
            this.f51155l.setLayoutParams(layoutParams);
            m61947h();
        }
    }

    /* renamed from: b */
    public final void mo50409b(C19001b bVar) {
        float a = C19137n.m62745a(getContext(), (float) (bVar.f51294f / 2));
        if (a > C19137n.m62745a(getContext(), 40.0f)) {
            a = C19137n.m62745a(getContext(), 40.0f);
        }
        setTouchDelegate(new C19125d(new Rect(this.f51146c.getLeft(), (int) (((float) this.f51146c.getTop()) - a), this.f51146c.getRight(), (int) (((float) this.f51146c.getBottom()) + a)), this.f51146c));
    }

    /* renamed from: e */
    private boolean m61941e(final C19001b bVar) {
        if (!m61945g(bVar)) {
            return false;
        }
        if (bVar.f51298j == 3 && bVar.mo50484h()) {
            this.f51150g = true;
            this.f51146c.setVisibility(0);
            this.f51146c.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        C18968b.this.f51148e.mo50548a(bVar, new C19003a().mo50499a(-1).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50504b(C18968b.this.f51150g).mo50501a("click_open_app_area").mo50503a());
                    }
                    return true;
                }
            });
            if (!C19132j.m62736a(bVar.f51293e)) {
                this.f51162s.setText(bVar.f51293e);
            } else if (C19025f.m62175k() != 0) {
                this.f51162s.setText(C19025f.m62175k());
            } else {
                this.f51162s.setText(R.string.dw0);
            }
            this.f51146c.post(new Runnable() {
                public final void run() {
                    if (C18968b.this.f51146c != null) {
                        C18968b.this.mo50409b(bVar);
                    }
                }
            });
        }
        if (bVar.f51299k != 1) {
            this.f51166w.setVisibility(8);
            this.f51155l.setVisibility(8);
        } else {
            if (bVar.mo50498z()) {
                this.f51166w.setVisibility(0);
            } else {
                this.f51155l.setVisibility(0);
            }
            setSkipClickListener(bVar);
        }
        setSplashInfoStyle(bVar);
        m61944g();
        return true;
    }

    /* renamed from: c */
    private boolean m61937c(final C19001b bVar) {
        boolean z;
        if (bVar.f51302n == null) {
            return false;
        }
        this.f51159p.setVisibility(0);
        this.f51147d = new C19091f(C19025f.m62096J(), this.f51160q);
        setSplashAdListener(bVar);
        C19012k kVar = bVar.f51302n;
        if (bVar.f51299k == 1) {
            z = true;
        } else {
            z = false;
        }
        String b = C19129h.m62716b(kVar);
        if (C19132j.m62736a(b)) {
            return false;
        }
        if (C19025f.m62111Y()) {
            this.f51154k.setVisibility(8);
            this.f51153j.setVisibility(0);
            setSkipAndWifiPreloadLayout(bVar);
            setSkipClickListener(bVar);
            m61936a(bVar.mo50498z(), bVar.mo50484h());
            setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b = C18968b.this.f51148e.mo50551b(bVar, new C19003a().mo50502a(true).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50503a());
                        if (C18968b.this.f51151h != null && b) {
                            C18968b.this.f51152i = 1;
                            C18968b.this.f51151h.mo50784a();
                        }
                    }
                    return true;
                }
            });
            this.f51140B.setVisibility(0);
            this.f51151h = new C19097a(this.f51140B);
            this.f51151h.mo50787a(m61946h(bVar));
            this.f51140B.setSurfaceLayoutParams(m61933a(bVar.f51302n.f51356h, bVar.f51302n.f51355g));
            boolean a = this.f51151h.mo50789a(b);
            if (a) {
                C19100c.m62610a().mo50806a(bVar, C19025f.m62096J());
                C19100c.m62610a().mo50807a(this.f51151h, bVar.mo50471C(), bVar.mo50478c());
            }
            return a;
        }
        C19090a b2 = new C19090a().mo50737a(b).mo50743b(kVar.f51352d).mo50736a(bVar.mo50375n()).mo50735a(this.f51159p.getWidth()).mo50741b(this.f51159p.getHeight()).mo50738a(kVar.f51349a).mo50746c(bVar.mo50376p()).mo50745c(0).mo50739a(true).mo50744b(z).mo50748d(bVar.f51290b).mo50747c(bVar.mo50498z()).mo50742b(bVar.mo50374f());
        this.f51147d.f51618f = bVar.mo50486i();
        m61935a(kVar.f51356h, kVar.f51355g, b2);
        return this.f51147d.mo50753a(b2.mo50740a());
    }

    /* renamed from: g */
    private boolean m61945g(C19001b bVar) {
        int i;
        C19001b bVar2 = bVar;
        try {
            boolean h = bVar.mo50484h();
            m61936a(bVar.mo50498z(), h);
            if (h) {
                ViewGroup.LayoutParams layoutParams = this.f51154k.getLayoutParams();
                layoutParams.height = C19129h.m62714b();
                this.f51154k.setLayoutParams(layoutParams);
                this.f51154k.setVisibility(4);
                this.f51153j.setVisibility(8);
            } else {
                this.f51154k.setVisibility(8);
                this.f51153j.setVisibility(0);
            }
            if (C19025f.m62148c() && bVar2.f51297i == 1) {
                if (bVar.mo50498z()) {
                    this.f51169z.setVisibility(0);
                } else {
                    this.f51161r.setVisibility(0);
                }
            }
            String b = C19129h.m62715b(bVar2.f51287a);
            if (C19132j.m62736a(b) || C19025f.m62194y() == null) {
                return false;
            }
            C19025f.m62194y().mo50855a(this.f51145b, b, bVar2.f51297i, new C19141h() {
                /* renamed from: a */
                public final void mo50428a() {
                    C18968b.this.f51148e.mo50546a();
                }
            });
            if (bVar.mo50377r() == 0 || bVar.mo50377r() == 4) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("show_expected", Integer.valueOf(bVar2.f51290b));
                String str = "not_real_time";
                if (bVar.mo50486i()) {
                    str = "real_time";
                }
                jSONObject.putOpt("show_type", str);
                if (C19025f.m62109W() != -1) {
                    if (C19025f.m62109W() == 1) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    jSONObject.put("awemelaunch", i);
                }
                jSONObject.put("ad_sequence", C19062u.m62368a().mo50637r());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("ad_extra_data", jSONObject);
                jSONObject2.put("is_ad_event", "1");
                if (!C19132j.m62736a(bVar.mo50376p())) {
                    jSONObject2.put("log_extra", bVar.mo50376p());
                }
                jSONObject2.put("ad_fetch_time", bVar.mo50374f());
                C19025f.m62115a(bVar.mo50375n(), "splash_ad", "show", jSONObject2);
                C19025f.m62093G().mo50523a(this.f51145b, bVar.mo50375n(), bVar.mo50496u(), bVar.mo50376p(), true, -1, null);
            }
            this.f51145b.f51125a = bVar2;
            this.f51145b.setInteraction(this.f51148e);
            this.f51145b.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.f51148e.mo50549b();
            return false;
        }
    }

    /* renamed from: d */
    private boolean m61939d(final C19001b bVar) {
        boolean z = false;
        if (bVar.f51302n == null || bVar.f51287a == null) {
            return false;
        }
        JSONObject jSONObject = null;
        if (C19025f.m62111Y()) {
            this.f51140B.setVisibility(0);
            int i = getResources().getDisplayMetrics().heightPixels;
            if (bVar.mo50484h()) {
                i -= C19129h.m62714b();
                this.f51153j.setVisibility(8);
            } else {
                this.f51153j.setVisibility(0);
            }
            C19012k kVar = bVar.f51302n;
            int i2 = bVar.f51287a.f51329c;
            int i3 = kVar.f51355g;
            if (i2 == 0 || i3 == 0) {
                return false;
            }
            boolean g = m61945g(bVar);
            int i4 = (int) (((float) i3) * (((float) i) / ((float) i2)));
            this.f51151h = new C19097a(this.f51140B);
            this.f51151h.mo50787a(m61946h(bVar));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i5 = (i - i4) / 2;
            layoutParams.topMargin = i5;
            layoutParams.bottomMargin = i5;
            this.f51140B.setSurfaceLayoutParams(layoutParams);
            String b = C19129h.m62716b(kVar);
            if (C19132j.m62736a(b)) {
                return false;
            }
            if (this.f51151h.mo50789a(b) && g) {
                z = true;
            }
            setSkipAndWifiPreloadLayout(bVar);
            setSkipClickListener(bVar);
            setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b = C18968b.this.f51148e.mo50551b(bVar, new C19003a().mo50502a(false).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50503a());
                        if (C18968b.this.f51151h != null && b) {
                            C18968b.this.f51152i = 1;
                            C18968b.this.f51151h.mo50784a();
                        }
                    }
                    return true;
                }
            });
            this.f51140B.setTextureViewOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b = C18968b.this.f51148e.mo50551b(bVar, new C19003a().mo50502a(true).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50503a());
                        if (C18968b.this.f51151h != null && b) {
                            C18968b.this.f51152i = 1;
                            C18968b.this.f51151h.mo50784a();
                        }
                    }
                    return true;
                }
            });
            if (z) {
                C19100c.m62610a().mo50806a(bVar, C19025f.m62096J());
                C19100c.m62610a().mo50807a(this.f51151h, bVar.mo50471C(), bVar.mo50478c());
                m61944g();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str = "not_real_time";
                try {
                    if (bVar.mo50486i()) {
                        str = "real_time";
                    }
                    jSONObject2.putOpt("show_type", str);
                    jSONObject2.putOpt("show_expected", Integer.valueOf(bVar.f51290b));
                    jSONObject3.putOpt("ad_extra_data", jSONObject2);
                    jSONObject3.putOpt("is_ad_event", "1");
                    jSONObject3.putOpt("log_extra", bVar.mo50376p());
                    jSONObject3.putOpt("ad_fetch_time", Long.valueOf(bVar.mo50374f()));
                    jSONObject = jSONObject3;
                } catch (JSONException unused) {
                }
                C19025f.m62115a(bVar.mo50375n(), "splash_ad", "banner_show", jSONObject);
            }
            return z;
        }
        this.f51159p.setVisibility(0);
        LayoutParams layoutParams2 = (LayoutParams) this.f51159p.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        this.f51159p.setLayoutParams(layoutParams2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i6 = displayMetrics.heightPixels;
        if (bVar.mo50484h()) {
            i6 -= C19129h.m62714b();
            this.f51153j.setVisibility(8);
        } else {
            this.f51153j.setVisibility(0);
        }
        C19012k kVar2 = bVar.f51302n;
        int i7 = bVar.f51287a.f51329c;
        int i8 = kVar2.f51355g;
        if (i7 == 0 || i8 == 0) {
            return false;
        }
        boolean g2 = m61945g(bVar);
        int i9 = (int) (((float) i8) * (((float) i6) / ((float) i7)));
        this.f51147d = new C19091f(C19025f.m62096J(), this.f51160q);
        setSplashAdListener(bVar);
        String b2 = C19129h.m62716b(kVar2);
        if (C19132j.m62736a(b2)) {
            return false;
        }
        C19088e a = new C19090a().mo50737a(b2).mo50743b(kVar2.f51352d).mo50736a(bVar.mo50375n()).mo50735a(displayMetrics.widthPixels).mo50741b(i9).mo50738a(kVar2.f51349a).mo50746c(bVar.mo50376p()).mo50745c((i6 - i9) / 2).mo50748d(bVar.f51290b).mo50739a(false).mo50744b(false).mo50747c(bVar.mo50498z()).mo50740a();
        this.f51147d.f51618f = bVar.mo50486i();
        if (this.f51147d.mo50753a(a) && g2) {
            z = true;
        }
        setSkipAndWifiPreloadLayout(bVar);
        setSkipClickListener(bVar);
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (C18968b.this.f51147d != null) {
                        C18968b.this.f51147d.mo50754b();
                    }
                    C18968b.this.f51148e.mo50551b(bVar, new C19003a().mo50502a(false).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50503a());
                }
                return true;
            }
        });
        if (z) {
            m61944g();
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            String str2 = "not_real_time";
            try {
                if (bVar.mo50486i()) {
                    str2 = "real_time";
                }
                jSONObject4.putOpt("show_type", str2);
                jSONObject4.putOpt("show_expected", Integer.valueOf(bVar.f51290b));
                jSONObject5.putOpt("ad_extra_data", jSONObject4);
                jSONObject5.putOpt("is_ad_event", "1");
                jSONObject5.putOpt("log_extra", bVar.mo50376p());
                jSONObject5.putOpt("ad_fetch_time", Long.valueOf(bVar.mo50374f()));
                jSONObject = jSONObject5;
            } catch (JSONException unused2) {
            }
            C19025f.m62115a(bVar.mo50375n(), "splash_ad", "banner_show", jSONObject);
        }
        return z;
    }

    /* renamed from: a */
    public final void mo50406a(Message message) {
        if (message.what == 1) {
            if (this.f51141C != null) {
                this.f51141C.cancel();
                this.f51141C = null;
            }
            this.f51148e.mo50546a();
            return;
        }
        if (message.what == 2) {
            int i = this.f51142D - 1;
            this.f51142D = i;
            new StringBuilder("splash count down. display seconds left: ").append(i);
            if (i == 0) {
                if (this.f51141C != null) {
                    this.f51141C.cancel();
                    this.f51141C = null;
                }
                return;
            }
            String a = m61934a(i);
            this.f51156m.setText(a);
            this.f51167x.setText(a);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case 24:
                C19100c.m62610a().mo50809c();
                break;
            case 25:
                C19100c.m62610a().mo50809c();
                break;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    private FrameLayout.LayoutParams m61933a(int i, int i2) {
        int i3;
        int i4;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i5 = displayMetrics.widthPixels;
        int i6 = displayMetrics.heightPixels;
        float f = ((float) i5) / ((float) i6);
        float f2 = ((float) i) / ((float) i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (f2 > f) {
            i4 = (i * i6) / i2;
            i3 = i6;
        } else if (f2 >= f) {
            return layoutParams;
        } else {
            i3 = (i2 * i5) / i;
            i4 = i5;
        }
        int i7 = (-Math.abs(i4 - i5)) / 2;
        int i8 = (-Math.abs(i3 - i6)) / 2;
        layoutParams.setMargins(i7, i8, i7, i8);
        return layoutParams;
    }

    /* renamed from: a */
    private void m61936a(boolean z, boolean z2) {
        if (z) {
            LayoutParams layoutParams = (LayoutParams) this.f51168y.getLayoutParams();
            layoutParams.height = C19129h.m62726h() - 4;
            this.f51168y.setLayoutParams(layoutParams);
            if (VERSION.SDK_INT >= 17) {
                this.f51166w.setPaddingRelative(4, 4, 0, 4);
            } else {
                this.f51166w.setPadding(4, 4, 0, 4);
            }
            if (!z2) {
                this.f51167x.setBackgroundResource(R.drawable.bjl);
                this.f51167x.setTextColor(getResources().getColor(R.color.a9q));
            } else {
                this.f51167x.setBackgroundResource(R.drawable.bjk);
                this.f51167x.setTextColor(getResources().getColor(R.color.a9r));
            }
            this.f51139A.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m61935a(int i, int i2, C19090a aVar) {
        if (C19025f.m62104R() == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            float f = ((float) i3) / ((float) i4);
            float f2 = ((float) i) / ((float) i2);
            if (f2 > f) {
                i = (i * i4) / i2;
                i2 = i4;
            } else if (f2 < f) {
                i2 = (i2 * i3) / i;
                i = i3;
            } else if (f2 == f) {
                return;
            }
            int i5 = (-Math.abs(i2 - i4)) / 2;
            aVar.mo50749e((-Math.abs(i - i3)) / 2).mo50750f(i5);
        }
    }
}

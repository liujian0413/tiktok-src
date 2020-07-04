package com.p280ss.android.p817ad.splash.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Message;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.p817ad.splash.C19141h;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p828c.C19002c.C19003a;
import com.p280ss.android.p817ad.splash.core.p828c.C19007f;
import com.p280ss.android.p817ad.splash.core.p828c.C19011j;
import com.p280ss.android.p817ad.splash.core.p828c.C19012k;
import com.p280ss.android.p817ad.splash.core.video2.BDASplashVideoView;
import com.p280ss.android.p817ad.splash.core.video2.C19097a;
import com.p280ss.android.p817ad.splash.core.video2.C19099b;
import com.p280ss.android.p817ad.splash.core.video2.C19100c;
import com.p280ss.android.p817ad.splash.core.video2.C19103d;
import com.p280ss.android.p817ad.splash.p836g.C19123b;
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

/* renamed from: com.ss.android.ad.splash.core.c */
public final class C18986c extends RelativeLayout implements C19041g, C19140a {

    /* renamed from: A */
    private String f51205A;

    /* renamed from: B */
    private int f51206B = 0;

    /* renamed from: C */
    private Timer f51207C;

    /* renamed from: D */
    private Space f51208D;

    /* renamed from: a */
    public BDASplashVideoView f51209a;

    /* renamed from: b */
    public RelativeLayout f51210b;

    /* renamed from: c */
    public LinearLayout f51211c;

    /* renamed from: d */
    public boolean f51212d;

    /* renamed from: e */
    public int f51213e = -1;

    /* renamed from: f */
    public C19001b f51214f;

    /* renamed from: g */
    public C19049n f51215g;

    /* renamed from: h */
    public C19139p f51216h = new C19139p(this);

    /* renamed from: i */
    public C19103d f51217i;

    /* renamed from: j */
    private LinearLayout f51218j;

    /* renamed from: k */
    private ViewStub f51219k;

    /* renamed from: l */
    private RelativeLayout f51220l;

    /* renamed from: m */
    private FrameLayout f51221m;

    /* renamed from: n */
    private Space f51222n;

    /* renamed from: o */
    private ImageView f51223o;

    /* renamed from: p */
    private TextView f51224p;

    /* renamed from: q */
    private BDASplashImageView f51225q;

    /* renamed from: r */
    private RelativeLayout f51226r;

    /* renamed from: s */
    private TextView f51227s;

    /* renamed from: t */
    private ImageView f51228t;

    /* renamed from: u */
    private FrameLayout f51229u;

    /* renamed from: v */
    private TextView f51230v;

    /* renamed from: w */
    private TextView f51231w;

    /* renamed from: x */
    private boolean f51232x;

    /* renamed from: y */
    private long f51233y;

    /* renamed from: z */
    private String f51234z;

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m61997g();
    }

    public final boolean performClick() {
        return super.performClick();
    }

    /* renamed from: d */
    private void m61991d() {
        this.f51211c.addOnLayoutChangeListener(new OnLayoutChangeListener() {

            /* renamed from: b */
            private int f51240b;

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (C18986c.this.f51211c != null) {
                    this.f51240b++;
                    int[] iArr = {0, 0};
                    C18986c.this.f51211c.getLocationOnScreen(iArr);
                    int i9 = iArr[1];
                    int paddingTop = C18986c.this.f51211c.getPaddingTop();
                    int a = C19123b.m62658a(C18986c.this.f51211c, i9);
                    StringBuilder sb = new StringBuilder("screenY:");
                    sb.append(i9);
                    sb.append(" paddingTop:");
                    sb.append(paddingTop);
                    sb.append(" safeInsetTop:");
                    sb.append(a);
                    if (i9 + paddingTop < a) {
                        int i10 = (a - i9) - paddingTop;
                        StringBuilder sb2 = new StringBuilder("adjust translationY:");
                        sb2.append(i10);
                        sb2.append(". triedTimes:");
                        sb2.append(this.f51240b);
                        C18986c.this.f51211c.setTranslationY(C18986c.this.f51211c.getTranslationY() + ((float) i10));
                        C18986c.this.f51211c.removeOnLayoutChangeListener(this);
                    } else {
                        new StringBuilder("no need to adjust translationY. triedTimes:").append(this.f51240b);
                    }
                    if (this.f51240b >= 3) {
                        C18986c.this.f51211c.removeOnLayoutChangeListener(this);
                    }
                }
            }
        });
    }

    /* renamed from: e */
    private void m61993e() {
        C19048m.m62245a().f51473a = System.currentTimeMillis();
        this.f51215g.mo50552c();
    }

    /* renamed from: a */
    public final void mo50448a() {
        this.f51216h.removeMessages(1);
        this.f51216h.sendEmptyMessageDelayed(1, this.f51233y);
    }

    /* renamed from: c */
    public final void mo50410c() {
        if (this.f51217i != null) {
            this.f51217i.mo50788a(true);
        }
    }

    /* renamed from: f */
    private void m61995f() {
        if (this.f51207C == null) {
            this.f51207C = new Timer();
            this.f51207C.scheduleAtFixedRate(new TimerTask() {
                public final void run() {
                    Message obtainMessage = C18986c.this.f51216h.obtainMessage();
                    obtainMessage.what = 2;
                    C18986c.this.f51216h.sendMessage(obtainMessage);
                }
            }, (this.f51233y % 1000) + 1000, 1000);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m61995f();
        m61993e();
        getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                C18986c.this.getViewTreeObserver().removeOnPreDrawListener(this);
                C18986c.this.mo50448a();
                C18986c.this.f51215g.mo50550b(C18986c.this.f51214f);
                return true;
            }
        });
    }

    /* renamed from: b */
    private void m61989b() {
        if (C19025f.m62185p() != 0) {
            this.f51223o.setImageResource(C19025f.m62185p());
        }
        if (C19025f.m62177l() != 0) {
            this.f51224p.setText(C19025f.m62177l());
        } else {
            this.f51224p.setText(R.string.dwi);
        }
        if (C19025f.m62181n() != 0) {
            this.f51230v.setText(C19025f.m62181n());
        } else {
            this.f51230v.setText(R.string.dw4);
        }
        if (C19025f.m62179m() != 0) {
            this.f51230v.setBackgroundResource(C19025f.m62179m());
        }
        if (C19025f.m62105S() == 1) {
            this.f51225q.setScaleType(ScaleType.CENTER_CROP);
        }
    }

    /* renamed from: g */
    private void m61997g() {
        if (this.f51225q != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) this.f51225q.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.f51225q.setImageBitmap(null);
                }
            } catch (Exception unused) {
            }
        }
        C19100c.m62610a().mo50808b();
        if (this.f51217i != null) {
            this.f51217i.mo50792d();
            this.f51217i = null;
            this.f51209a = null;
        }
        if (this.f51207C != null) {
            this.f51207C.cancel();
            this.f51207C = null;
        }
    }

    public final void setSplashAdInteraction(C19049n nVar) {
        this.f51215g = nVar;
    }

    /* renamed from: k */
    private C19099b m62002k(final C19001b bVar) {
        return new C19099b() {
            /* renamed from: b */
            public final void mo50432b() {
                C18986c.this.f51215g.mo50549b();
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
                    C19025f.m62093G().mo50525c(null, bVar.mo50375n(), bVar.f51302n.f51349a, bVar.mo50376p(), true, -1, null);
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
                    C19025f.m62093G().mo50526d(null, bVar.mo50375n(), bVar.f51302n.f51350b, bVar.mo50376p(), true, -1, null);
                }
                C18986c.this.f51215g.mo50546a();
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
                    jSONObject.put("break_reason", C18986c.this.f51213e);
                    if (!C19132j.m62736a(bVar.mo50376p())) {
                        jSONObject.put("log_extra", bVar.mo50376p());
                    }
                    jSONObject2.put("break_reason", C18986c.this.f51213e);
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
                if ((C18986c.this.getTouchDelegate() == null || !C18986c.this.getTouchDelegate().onTouchEvent(motionEvent)) && motionEvent.getAction() == 1) {
                    if (C18986c.this.f51212d) {
                        str = "click_normal_area";
                    } else {
                        str = "";
                    }
                    C18986c.this.f51215g.mo50548a(bVar, new C19003a().mo50499a(0).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50504b(C18986c.this.f51212d).mo50501a(str).mo50503a());
                }
                return true;
            }
        });
    }

    private void setSkipClickListener(final C19001b bVar) {
        this.f51229u.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C18986c.this.f51217i != null) {
                    C18986c.this.f51213e = 2;
                    C18986c.this.f51217i.mo50784a();
                }
                C18986c.this.f51215g.mo50547a(bVar);
            }
        });
    }

    private void setupUIWidgets(C19001b bVar) {
        setupSkipLayout(bVar);
        setupWifiPreloadHindLayout(bVar);
        setupAdLabelLayout(bVar);
        m61999h(bVar);
        setupSkipButtonHitArea(bVar);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m61997g();
        }
    }

    public C18986c(Context context) {
        super(context);
        m61988a(context);
    }

    /* renamed from: d */
    private boolean m61992d(C19001b bVar) {
        if (!m62000i(bVar)) {
            return false;
        }
        m61991d();
        return true;
    }

    private void setupWifiPreloadHindLayout(C19001b bVar) {
        String str = bVar.f51263B;
        if (!TextUtils.isEmpty(str)) {
            this.f51224p.setVisibility(0);
            this.f51224p.setText(str);
        }
    }

    /* renamed from: a */
    private String m61987a(int i) {
        if (i < 0) {
            i = 0;
        }
        if (!this.f51232x) {
            return this.f51234z;
        }
        return C1642a.m8034a("%d%s %s", new Object[]{Integer.valueOf(i), this.f51205A, this.f51234z});
    }

    private void setupSkipButtonHitArea(C19001b bVar) {
        C19011j jVar = bVar.f51262A;
        if (jVar != null && this.f51229u.getVisibility() == 0 && this.f51229u.getParent() != null) {
            C19129h.m62706a(this.f51229u, jVar.f51343b, jVar.f51343b, jVar.f51344c, jVar.f51344c);
        }
    }

    /* renamed from: c */
    private boolean m61990c(final C19001b bVar) {
        if (!m62000i(bVar)) {
            return false;
        }
        if (bVar.f51298j == 3 && bVar.mo50484h()) {
            this.f51212d = true;
            this.f51210b.setVisibility(0);
            this.f51210b.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        C18986c.this.f51215g.mo50548a(bVar, new C19003a().mo50499a(-1).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50504b(C18986c.this.f51212d).mo50501a("click_open_app_area").mo50503a());
                    }
                    return true;
                }
            });
            if (!C19132j.m62736a(bVar.f51293e)) {
                this.f51227s.setText(bVar.f51293e);
            } else if (C19025f.m62175k() != 0) {
                this.f51227s.setText(C19025f.m62175k());
            } else {
                this.f51227s.setText(R.string.dw1);
            }
            this.f51210b.post(new Runnable() {
                public final void run() {
                    if (C18986c.this.f51210b != null) {
                        C18986c.this.mo50450b(bVar);
                    }
                }
            });
        }
        m61991d();
        return true;
    }

    /* renamed from: f */
    private static void m61996f(C19001b bVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = "not_real_time";
        try {
            if (bVar.mo50486i()) {
                str = "real_time";
            }
            jSONObject.putOpt("show_type", str);
            jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f51290b));
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            jSONObject2.putOpt("log_extra", bVar.mo50376p());
            jSONObject2.putOpt("ad_fetch_time", Long.valueOf(bVar.mo50374f()));
        } catch (JSONException unused) {
            jSONObject2 = null;
        }
        C19025f.m62115a(bVar.mo50375n(), "splash_ad", "banner_show", jSONObject2);
    }

    /* renamed from: i */
    private boolean m62000i(C19001b bVar) {
        if (bVar.mo50484h()) {
            LayoutParams layoutParams = this.f51222n.getLayoutParams();
            layoutParams.height = C19129h.m62714b();
            this.f51222n.setLayoutParams(layoutParams);
            this.f51222n.setVisibility(4);
            this.f51223o.setVisibility(8);
        } else {
            this.f51222n.setVisibility(8);
            this.f51223o.setVisibility(0);
        }
        String b = C19129h.m62715b(bVar.f51287a);
        if (C19132j.m62736a(b) || C19025f.m62194y() == null) {
            return false;
        }
        C19025f.m62194y().mo50855a(this.f51225q, b, bVar.f51297i, new C19141h() {
            /* renamed from: a */
            public final void mo50428a() {
                C18986c.this.f51215g.mo50546a();
            }
        });
        try {
            if (bVar.mo50377r() == 0 || bVar.mo50377r() == 4) {
                m62001j(bVar);
            }
            this.f51225q.f51125a = bVar;
            this.f51225q.setInteraction(this.f51215g);
            this.f51225q.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.f51215g.mo50549b();
            return false;
        }
    }

    /* renamed from: e */
    private boolean m61994e(final C19001b bVar) {
        boolean z = false;
        if (bVar.f51302n == null || bVar.f51287a == null) {
            return false;
        }
        this.f51209a.setVisibility(0);
        this.f51217i = new C19097a(this.f51209a);
        this.f51217i.mo50787a(m62002k(bVar));
        C19012k kVar = bVar.f51302n;
        int i = bVar.f51287a.f51329c;
        int i2 = kVar.f51355g;
        int i3 = kVar.f51356h;
        if (i == 0 || i2 == 0 || i3 <= 0) {
            return false;
        }
        boolean i4 = m62000i(bVar);
        String b = C19129h.m62716b(kVar);
        if (C19132j.m62736a(b)) {
            return false;
        }
        if (i4 && this.f51217i.mo50789a(b)) {
            z = true;
        }
        if (z) {
            C19100c.m62610a().mo50806a(bVar, C19025f.m62096J());
            C19100c.m62610a().mo50807a(this.f51217i, bVar.mo50471C(), bVar.mo50478c());
        }
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    boolean b = C18986c.this.f51215g.mo50551b(bVar, new C19003a().mo50502a(false).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50503a());
                    if (C18986c.this.f51217i != null && b) {
                        C18986c.this.f51213e = 1;
                        C18986c.this.f51217i.mo50784a();
                    }
                }
                return true;
            }
        });
        this.f51209a.setTextureViewOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    boolean b = C18986c.this.f51215g.mo50551b(bVar, new C19003a().mo50502a(true).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50503a());
                    if (C18986c.this.f51217i != null && b) {
                        C18986c.this.f51213e = 1;
                        C18986c.this.f51217i.mo50784a();
                    }
                }
                return true;
            }
        });
        if (z) {
            int i5 = this.f51209a.getResources().getDisplayMetrics().widthPixels;
            int i6 = (int) ((((float) i2) * ((float) i5)) / ((float) i3));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51209a.getLayoutParams();
            layoutParams.height = i6;
            layoutParams.width = i5;
            layoutParams.gravity = 17;
            this.f51209a.setLayoutParams(layoutParams);
            m61991d();
            m61996f(bVar);
        }
        return z;
    }

    /* renamed from: g */
    private boolean m61998g(final C19001b bVar) {
        if (bVar.f51302n == null) {
            return false;
        }
        String b = C19129h.m62716b(bVar.f51302n);
        if (C19132j.m62736a(b)) {
            return false;
        }
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    boolean b = C18986c.this.f51215g.mo50551b(bVar, new C19003a().mo50502a(true).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50503a());
                    if (C18986c.this.f51217i != null && b) {
                        C18986c.this.f51213e = 1;
                        C18986c.this.f51217i.mo50784a();
                    }
                }
                return true;
            }
        });
        this.f51222n.setVisibility(8);
        this.f51223o.setVisibility(0);
        this.f51209a.setVisibility(0);
        this.f51217i = new C19097a(this.f51209a);
        this.f51217i.mo50787a(m62002k(bVar));
        boolean a = this.f51217i.mo50789a(b);
        if (a) {
            C19100c.m62610a().mo50806a(bVar, C19025f.m62096J());
            C19100c.m62610a().mo50807a(this.f51217i, bVar.mo50471C(), bVar.mo50478c());
            this.f51209a.post(new Runnable() {
                public final void run() {
                    if (C18986c.this.f51209a != null) {
                        FrameLayout.LayoutParams a = C18986c.this.mo50447a(bVar.f51302n.f51356h, bVar.f51302n.f51355g);
                        if (a != null) {
                            C18986c.this.f51209a.setSurfaceLayoutParams(a);
                        }
                    }
                }
            });
            m61991d();
        }
        return a;
    }

    /* renamed from: j */
    private static void m62001j(C19001b bVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f51290b));
        String str = "not_real_time";
        if (bVar.mo50486i()) {
            str = "real_time";
        }
        jSONObject.putOpt("show_type", str);
        if (C19025f.m62109W() != -1) {
            int i = 1;
            if (C19025f.m62109W() != 1) {
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
        C19025f.m62093G().mo50523a(null, bVar.mo50375n(), bVar.mo50496u(), bVar.mo50376p(), true, -1, null);
    }

    private void setupAdLabelLayout(C19001b bVar) {
        C19007f fVar = bVar.f51314z;
        if (fVar != null) {
            if (!TextUtils.isEmpty(fVar.f51334d)) {
                this.f51231w.setText(fVar.f51334d);
            }
            if (!TextUtils.isEmpty(fVar.f51334d)) {
                this.f51231w.setTextColor(Color.parseColor(fVar.f51333c));
            }
            if (!TextUtils.isEmpty(fVar.f51331a)) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadii(new float[]{C19137n.m62745a(getContext(), 2.0f), C19137n.m62745a(getContext(), 2.0f), C19137n.m62745a(getContext(), 2.0f), C19137n.m62745a(getContext(), 2.0f), C19137n.m62745a(getContext(), 2.0f), C19137n.m62745a(getContext(), 2.0f), C19137n.m62745a(getContext(), 2.0f), C19137n.m62745a(getContext(), 2.0f)});
                gradientDrawable.setColor(Color.parseColor(fVar.f51331a));
                if (VERSION.SDK_INT >= 16) {
                    this.f51231w.setBackground(gradientDrawable);
                    return;
                }
                this.f51231w.setBackgroundDrawable(gradientDrawable);
            }
        }
    }

    /* renamed from: a */
    public final void mo50406a(Message message) {
        if (message.what == 1) {
            if (this.f51207C != null) {
                this.f51207C.cancel();
                this.f51207C = null;
            }
            this.f51215g.mo50546a();
            return;
        }
        if (message.what == 2) {
            int i = this.f51206B - 1;
            this.f51206B = i;
            new StringBuilder("splash count down. display seconds left: ").append(this.f51206B);
            if (i == 0) {
                if (this.f51207C != null) {
                    this.f51207C.cancel();
                    this.f51207C = null;
                }
            } else if (this.f51230v.getVisibility() == 0 && this.f51232x) {
                this.f51230v.setText(m61987a(i));
            }
        }
    }

    /* renamed from: b */
    public final void mo50450b(C19001b bVar) {
        float a = C19137n.m62745a(getContext(), (float) (bVar.f51294f / 2));
        if (a > C19137n.m62745a(getContext(), 40.0f)) {
            a = C19137n.m62745a(getContext(), 40.0f);
        }
        setTouchDelegate(new C19125d(new Rect(this.f51210b.getLeft(), (int) (((float) this.f51210b.getTop()) - a), this.f51210b.getRight(), (int) (((float) this.f51210b.getBottom()) + a)), this.f51210b));
    }

    /* renamed from: h */
    private void m61999h(C19001b bVar) {
        int i;
        C19007f fVar = bVar.f51314z;
        if (fVar != null) {
            C19137n.m62747a((View) this.f51224p);
            C19137n.m62747a((View) this.f51231w);
            C19137n.m62747a((View) this.f51229u);
            switch (fVar.f51332b) {
                case 1:
                    C19137n.m62749a((View) this.f51224p, (ViewGroup) this.f51211c);
                    C19137n.m62749a((View) this.f51229u, (ViewGroup) this.f51211c);
                    this.f51231w.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388693;
                    if (bVar.f51298j == 3 && this.f51210b.getVisibility() == 0) {
                        i = this.f51210b.getLayoutParams().height;
                    } else {
                        i = 0;
                    }
                    int a = (int) C19137n.m62745a(getContext(), 16.0f);
                    layoutParams.setMargins(0, 0, a, ((int) C19137n.m62745a(getContext(), 20.0f)) + i);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginStart(0);
                        layoutParams.setMarginEnd(a);
                    }
                    this.f51231w.setLayoutParams(layoutParams);
                    C19137n.m62749a((View) this.f51231w, (ViewGroup) this.f51221m);
                    return;
                case 2:
                    if (this.f51224p.getVisibility() == 0) {
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        int a2 = (int) C19137n.m62745a(getContext(), 5.0f);
                        layoutParams2.setMargins(0, (int) C19137n.m62745a(getContext(), 15.0f), a2, 0);
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams2.setMarginStart(0);
                            layoutParams2.setMarginEnd(a2);
                        }
                        this.f51224p.setLayoutParams(layoutParams2);
                        this.f51224p.setTextSize(1, 10.0f);
                        C19137n.m62749a((View) this.f51224p, (ViewGroup) this.f51211c);
                    }
                    if (!TextUtils.isEmpty(this.f51231w.getText())) {
                        this.f51231w.setVisibility(0);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        int a3 = (int) C19137n.m62745a(getContext(), 16.0f);
                        layoutParams3.setMargins(0, (int) C19137n.m62745a(getContext(), 15.0f), a3, 0);
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams3.setMarginStart(0);
                            layoutParams3.setMarginEnd(a3);
                        }
                        this.f51231w.setLayoutParams(layoutParams3);
                        C19137n.m62749a((View) this.f51231w, (ViewGroup) this.f51211c);
                    }
                    if (this.f51229u.getVisibility() == 0) {
                        C19137n.m62749a((View) this.f51229u, (ViewGroup) this.f51220l);
                        int h = C19129h.m62726h();
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, (int) C19137n.m62745a(getContext(), 36.0f));
                        layoutParams4.addRule(12, -1);
                        int a4 = (int) C19137n.m62745a(getContext(), 16.0f);
                        layoutParams4.setMargins(0, 0, a4, h);
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams4.addRule(21, -1);
                            layoutParams4.setMarginStart(0);
                            layoutParams4.setMarginEnd(a4);
                        } else {
                            layoutParams4.addRule(11, -1);
                        }
                        this.f51229u.setLayoutParams(layoutParams4);
                        this.f51230v.setTextSize(1, 14.0f);
                        return;
                    }
                    break;
                default:
                    C19137n.m62749a((View) this.f51224p, (ViewGroup) this.f51211c);
                    C19137n.m62749a((View) this.f51229u, (ViewGroup) this.f51211c);
                    if (fVar.f51332b != 0) {
                        this.f51231w.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
    }

    private void setupSkipLayout(C19001b bVar) {
        this.f51206B = (int) (this.f51233y / 1000);
        C19011j jVar = bVar.f51262A;
        if (jVar == null || TextUtils.isEmpty(jVar.f51347f)) {
            this.f51229u.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10, -1);
            int a = (int) C19137n.m62745a(getContext(), 9.0f);
            layoutParams.setMargins(0, (int) C19137n.m62745a(getContext(), 16.0f), a, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21, -1);
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(a);
            } else {
                layoutParams.addRule(11, -1);
            }
            this.f51224p.setLayoutParams(layoutParams);
            return;
        }
        this.f51229u.setVisibility(0);
        this.f51234z = jVar.f51347f;
        this.f51232x = jVar.f51348g;
        this.f51205A = jVar.f51342a;
        this.f51230v.setText(m61987a(this.f51206B));
        if (!TextUtils.isEmpty(jVar.f51345d)) {
            this.f51230v.setTextColor(Color.parseColor(jVar.f51345d));
        }
        if (!TextUtils.isEmpty(jVar.f51346e)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{C19137n.m62745a(getContext(), 12.0f), C19137n.m62745a(getContext(), 12.0f), C19137n.m62745a(getContext(), 12.0f), C19137n.m62745a(getContext(), 12.0f), C19137n.m62745a(getContext(), 12.0f), C19137n.m62745a(getContext(), 12.0f), C19137n.m62745a(getContext(), 12.0f), C19137n.m62745a(getContext(), 12.0f)});
            gradientDrawable.setColor(Color.parseColor(jVar.f51346e));
            if (VERSION.SDK_INT >= 16) {
                this.f51230v.setBackground(gradientDrawable);
            } else {
                this.f51230v.setBackgroundDrawable(gradientDrawable);
            }
        }
        setSkipClickListener(bVar);
    }

    /* renamed from: a */
    public final boolean mo50449a(C19001b bVar) {
        boolean z;
        int r = bVar.mo50377r();
        if (r != 0) {
            switch (r) {
                case 2:
                    z = m61998g(bVar);
                    break;
                case 3:
                    z = m61994e(bVar);
                    break;
                case 4:
                    setImageTouchListener(bVar);
                    z = m61992d(bVar);
                    break;
                default:
                    z = false;
                    break;
            }
        } else {
            setImageTouchListener(bVar);
            z = m61990c(bVar);
        }
        if (!z) {
            return false;
        }
        this.f51214f = bVar;
        this.f51233y = bVar.mo50478c();
        setupUIWidgets(bVar);
        return true;
    }

    /* renamed from: a */
    private void m61988a(Context context) {
        if (C19025f.m62186q() != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), C19025f.m62186q()).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.f51218j = linearLayout;
        addView(linearLayout);
        this.f51219k = new ViewStub(context);
        this.f51219k.setLayoutParams(new LinearLayout.LayoutParams(-1, 27));
        this.f51219k.setLayoutResource(R.layout.ajh);
        this.f51219k.setVisibility(8);
        this.f51218j.addView(this.f51219k);
        this.f51220l = new RelativeLayout(context);
        this.f51220l.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f51222n = new Space(context);
        this.f51222n.setId(R.id.d98);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f51222n.setLayoutParams(layoutParams);
        this.f51222n.setBackgroundColor(getResources().getColor(R.color.a9z));
        this.f51222n.setVisibility(4);
        this.f51221m = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, this.f51222n.getId());
        this.f51221m.setLayoutParams(layoutParams2);
        this.f51225q = new BDASplashImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        this.f51225q.setScaleType(ScaleType.FIT_XY);
        this.f51225q.setVisibility(8);
        this.f51225q.setLayoutParams(layoutParams3);
        this.f51209a = new BDASplashVideoView(context);
        this.f51209a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f51209a.setVisibility(8);
        this.f51210b = new RelativeLayout(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) C19137n.m62745a(context, 60.0f));
        layoutParams4.gravity = 80;
        this.f51210b.setLayoutParams(layoutParams4);
        this.f51210b.setBackgroundColor(getResources().getColor(R.color.a9t));
        this.f51210b.setVisibility(8);
        this.f51226r = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(13, -1);
        this.f51226r.setLayoutParams(layoutParams5);
        this.f51227s = new TextView(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15, -1);
        this.f51227s.setEllipsize(TruncateAt.END);
        this.f51227s.setLines(1);
        this.f51227s.setMaxWidth((int) C19137n.m62745a(context, 200.0f));
        this.f51227s.setText(R.string.dw1);
        this.f51227s.setTextColor(getResources().getColor(R.color.a9z));
        this.f51227s.setTextSize(1, 20.0f);
        this.f51227s.setLayoutParams(layoutParams6);
        this.f51227s.setId(R.id.d9b);
        this.f51226r.addView(this.f51227s);
        this.f51228t = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15, -1);
        layoutParams7.addRule(1, this.f51227s.getId());
        layoutParams7.setMargins((int) C19137n.m62745a(context, 4.0f), 0, 0, 0);
        this.f51228t.setPadding(0, (int) C19137n.m62745a(context, 1.0f), 0, 0);
        this.f51228t.setImageDrawable(getResources().getDrawable(R.drawable.bjn));
        this.f51228t.setLayoutParams(layoutParams7);
        this.f51226r.addView(this.f51228t);
        this.f51210b.addView(this.f51226r);
        this.f51223o = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        if (VERSION.SDK_INT >= 17) {
            layoutParams8.addRule(20, -1);
        } else {
            layoutParams8.addRule(9, -1);
        }
        layoutParams8.addRule(10, -1);
        int a = (int) C19137n.m62745a(context, 14.0f);
        layoutParams8.setMargins(a, (int) C19137n.m62745a(context, 14.0f), 0, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart(a);
            layoutParams8.setMarginEnd(0);
        }
        this.f51223o.setVisibility(8);
        this.f51223o.setLayoutParams(layoutParams8);
        this.f51211c = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        this.f51211c.setOrientation(0);
        this.f51211c.setLayoutParams(layoutParams9);
        this.f51211c.setFitsSystemWindows(true);
        this.f51208D = new Space(context);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(0, 1);
        layoutParams10.weight = 1.0f;
        this.f51208D.setLayoutParams(layoutParams10);
        this.f51229u = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, (int) C19137n.m62745a(context, 36.0f));
        if (VERSION.SDK_INT >= 17) {
            layoutParams11.addRule(21, -1);
        } else {
            layoutParams11.addRule(11, -1);
        }
        layoutParams11.addRule(10, -1);
        int a2 = (int) C19137n.m62745a(context, 16.0f);
        layoutParams11.setMargins(0, (int) C19137n.m62745a(context, 8.0f), a2, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams11.setMarginStart(0);
            layoutParams11.setMarginEnd(a2);
        }
        this.f51229u.setLayoutParams(layoutParams11);
        this.f51229u.setVisibility(8);
        this.f51229u.setId(R.id.d9d);
        this.f51230v = new TextView(context);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-2, (int) C19137n.m62745a(context, 24.0f));
        this.f51230v.setBackgroundResource(R.drawable.bjo);
        if (VERSION.SDK_INT >= 16) {
            this.f51230v.setPaddingRelative((int) C19137n.m62745a(context, 10.0f), 0, (int) C19137n.m62745a(context, 10.0f), 0);
        } else {
            this.f51230v.setPadding((int) C19137n.m62745a(context, 10.0f), 0, (int) C19137n.m62745a(context, 10.0f), 0);
        }
        layoutParams12.gravity = 17;
        this.f51230v.setGravity(17);
        this.f51230v.setTextSize(1, 12.0f);
        this.f51230v.setLayoutParams(layoutParams12);
        this.f51229u.addView(this.f51230v);
        this.f51224p = new TextView(context);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        int a3 = (int) C19137n.m62745a(context, 9.0f);
        layoutParams13.setMargins(0, (int) C19137n.m62745a(context, 16.0f), a3, 0);
        if (VERSION.SDK_INT >= 17) {
            layoutParams13.setMarginStart(0);
            layoutParams13.setMarginEnd(a3);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f51224p.setPaddingRelative(3, 3, 3, 3);
        } else {
            this.f51224p.setPadding(3, 3, 3, 3);
        }
        this.f51224p.setTextColor(Color.parseColor("#ffffff"));
        this.f51224p.setShadowLayer(12.0f, 0.0f, 0.0f, Color.parseColor("#7f000000"));
        this.f51224p.setTextSize(1, 12.0f);
        this.f51224p.setVisibility(8);
        this.f51224p.setLayoutParams(layoutParams13);
        this.f51231w = new TextView(context);
        if (VERSION.SDK_INT >= 16) {
            this.f51231w.setPaddingRelative((int) C19137n.m62745a(context, 4.0f), (int) C19137n.m62745a(context, 2.0f), (int) C19137n.m62745a(context, 4.0f), (int) C19137n.m62745a(context, 2.0f));
        } else {
            this.f51231w.setPadding((int) C19137n.m62745a(context, 4.0f), (int) C19137n.m62745a(context, 2.0f), (int) C19137n.m62745a(context, 4.0f), (int) C19137n.m62745a(context, 2.0f));
        }
        this.f51231w.setTextSize(1, 10.0f);
        this.f51231w.setVisibility(8);
        this.f51218j.addView(this.f51220l);
        this.f51221m.addView(this.f51225q);
        this.f51221m.addView(this.f51209a);
        this.f51221m.addView(this.f51210b);
        this.f51220l.addView(this.f51221m);
        this.f51220l.addView(this.f51222n);
        this.f51211c.addView(this.f51223o);
        this.f51211c.addView(this.f51208D);
        this.f51220l.addView(this.f51211c);
        m61989b();
        setFocusable(true);
        setFocusableInTouchMode(true);
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
    public final FrameLayout.LayoutParams mo50447a(int i, int i2) {
        int i3;
        int i4;
        int width = this.f51209a.getWidth();
        int height = this.f51209a.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        float f = (float) width;
        float f2 = (float) height;
        float f3 = f / f2;
        float f4 = (float) i;
        float f5 = (float) i2;
        float f6 = f4 / f5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (f6 > f3) {
            i4 = (int) ((f4 * f2) / f5);
            i3 = height;
        } else if (f6 >= f3) {
            return layoutParams;
        } else {
            i3 = (int) ((f * f5) / f4);
            i4 = width;
        }
        int i5 = (-Math.abs(i4 - width)) / 2;
        int i6 = (-Math.abs(i3 - height)) / 2;
        layoutParams.setMargins(i5, i6, i5, i6);
        return layoutParams;
    }
}

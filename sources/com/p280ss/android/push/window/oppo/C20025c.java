package com.p280ss.android.push.window.oppo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.p280ss.android.push.window.oppo.C20035d.C20036a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.push.window.oppo.c */
public final class C20025c {

    /* renamed from: a */
    public static C20023a f54185a;

    /* renamed from: p */
    private static C20025c f54186p;

    /* renamed from: b */
    public WindowManager f54187b;

    /* renamed from: c */
    public LayoutParams f54188c;

    /* renamed from: d */
    public View f54189d;

    /* renamed from: e */
    public Context f54190e;

    /* renamed from: f */
    public Handler f54191f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public boolean f54192g = false;

    /* renamed from: h */
    public int f54193h = 2005;

    /* renamed from: i */
    public int f54194i;

    /* renamed from: j */
    public int f54195j = 2;

    /* renamed from: k */
    public boolean f54196k;

    /* renamed from: l */
    public boolean f54197l = false;

    /* renamed from: m */
    public boolean f54198m = false;

    /* renamed from: n */
    public boolean f54199n = false;

    /* renamed from: o */
    public int f54200o = 0;

    /* renamed from: q */
    private String f54201q;

    /* renamed from: r */
    private int f54202r;

    /* renamed from: s */
    private boolean f54203s = true;

    /* renamed from: t */
    private Runnable f54204t = new Runnable() {
        public final void run() {
            C20025c.this.mo53620c();
        }
    };

    /* renamed from: e */
    public static C20023a m65972e() {
        return f54185a;
    }

    /* renamed from: a */
    public final boolean mo53618a(JSONObject jSONObject) {
        String optString = jSONObject.optString("tt_push_pop_window_rule", "");
        if (optString == null || optString.equals(this.f54201q)) {
            return false;
        }
        this.f54201q = optString;
        return true;
    }

    /* renamed from: b */
    public final void mo53619b() {
        try {
            this.f54199n = false;
            this.f54197l = false;
            this.f54191f.removeCallbacks(this.f54204t);
            this.f54187b.removeViewImmediate(this.f54189d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public final C20036a mo53621d() {
        List a = C20035d.m65985a(this.f54190e).mo53634a();
        if (!a.isEmpty()) {
            return (C20036a) a.get(0);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo53620c() {
        this.f54199n = true;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f54189d, "translationY", new float[]{(float) this.f54200o, (float) (-this.f54189d.getMeasuredHeight())});
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                try {
                    C20025c.this.f54199n = false;
                    C20025c.this.f54197l = false;
                    C20025c.this.f54187b.removeViewImmediate(C20025c.this.f54189d);
                } catch (Exception unused) {
                }
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                try {
                    C20025c.this.f54199n = false;
                    C20025c.this.f54197l = false;
                    C20025c.this.f54187b.removeViewImmediate(C20025c.this.f54189d);
                } catch (Exception unused) {
                }
            }
        });
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    /* renamed from: f */
    private void m65973f() {
        boolean z;
        boolean z2;
        if (!TextUtils.isEmpty(this.f54201q)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f54201q);
                boolean z3 = false;
                if (jSONObject.optInt("is_show", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f54192g = z;
                if (jSONObject.optInt("is_cache_message", 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f54196k = z2;
                this.f54202r = jSONObject.optInt("show_time_mill", 5000);
                if (jSONObject.optInt("is_auto_dismiss", 1) == 1) {
                    z3 = true;
                }
                this.f54203s = z3;
                this.f54195j = jSONObject.optInt("cache_size", 2);
                this.f54193h = jSONObject.optInt("type", 2005);
                this.f54194i = jSONObject.optInt("flag", 1160);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo53617a() {
        if (!this.f54192g || C20037e.m65993a(this.f54190e) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static synchronized C20025c m65968a(Context context) {
        C20025c cVar;
        synchronized (C20025c.class) {
            if (f54185a != null) {
                if (f54186p == null) {
                    f54186p = new C20025c(context);
                }
                cVar = f54186p;
            } else {
                throw new RuntimeException("should call init(context, pushWindowDepend) in Application");
            }
        }
        return cVar;
    }

    private C20025c(Context context) {
        this.f54190e = context.getApplicationContext();
        this.f54187b = (WindowManager) context.getSystemService("window");
        this.f54191f.postDelayed(new Runnable() {
            public final void run() {
                if (C20025c.this.mo53617a() && C20025c.this.f54196k) {
                    C20025c.m65968a(C20025c.this.f54190e).mo53621d();
                }
            }
        }, 10000);
    }

    /* renamed from: a */
    public final void mo53614a(Editor editor) {
        editor.putString("tt_push_pop_window_rule", this.f54201q);
        m65973f();
    }

    /* renamed from: a */
    public final void mo53615a(SharedPreferences sharedPreferences) {
        this.f54201q = sharedPreferences.getString("tt_push_pop_window_rule", "");
        m65973f();
    }

    /* renamed from: a */
    public static synchronized C20025c m65969a(Context context, C20023a aVar) {
        C20025c a;
        synchronized (C20025c.class) {
            f54185a = aVar;
            a = m65968a(context);
        }
        return a;
    }

    /* renamed from: a */
    private void m65971a(String str, int i, String str2) {
        C20035d.m65985a(this.f54190e).mo53636a(1, str, i, str2);
    }

    /* renamed from: a */
    public static void m65970a(Context context, String str, long j, long j2, boolean z, JSONObject... jSONObjectArr) {
        JSONObject[] jSONObjectArr2 = jSONObjectArr;
        if (z) {
            if (jSONObjectArr2.length > 0) {
                f54185a.mo53607a(context, "umeng", "client_apn", str, j, -1, jSONObjectArr2[0]);
                return;
            }
            f54185a.mo53607a(context, "umeng", "client_apn", str, j, -1, null);
        } else if (jSONObjectArr2.length > 0) {
            f54185a.mo53607a(context, "umeng", "apn", str, j, -1, jSONObjectArr2[0]);
        } else {
            f54185a.mo53607a(context, "umeng", "apn", str, j, -1, null);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:15|(1:17)|18|19|20|21|22|(1:24)|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x012b */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0147 A[Catch:{ Exception -> 0x015f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53616a(org.json.JSONObject r17, java.lang.String r18, java.lang.String r19, int r20, int r21, java.lang.String r22, boolean r23, android.view.View.OnClickListener r24) {
        /*
            r16 = this;
            r1 = r16
            r2 = r20
            r0 = r21
            r3 = r22
            boolean r4 = r16.mo53617a()
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            boolean r4 = r1.f54197l
            if (r4 == 0) goto L_0x001b
            java.lang.String r2 = r17.toString()
            r1.m65971a(r2, r0, r3)
            return
        L_0x001b:
            r4 = 1
            r5 = 0
            android.content.Context r6 = r1.f54190e     // Catch:{ Exception -> 0x015f }
            java.lang.String r7 = "power"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch:{ Exception -> 0x015f }
            android.os.PowerManager r6 = (android.os.PowerManager) r6     // Catch:{ Exception -> 0x015f }
            boolean r7 = r6.isScreenOn()     // Catch:{ Exception -> 0x015f }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x015f }
            r9 = 20
            if (r8 < r9) goto L_0x0035
            boolean r7 = r6.isInteractive()     // Catch:{ Exception -> 0x015f }
        L_0x0035:
            if (r7 != 0) goto L_0x003f
            java.lang.String r6 = r17.toString()     // Catch:{ Exception -> 0x015f }
            r1.m65971a(r6, r0, r3)     // Catch:{ Exception -> 0x015f }
            return
        L_0x003f:
            android.view.View r0 = r1.f54189d     // Catch:{ Exception -> 0x015f }
            if (r0 != 0) goto L_0x0053
            android.content.Context r0 = r1.f54190e     // Catch:{ Exception -> 0x015f }
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch:{ Exception -> 0x015f }
            r3 = 2131494412(0x7f0c060c, float:1.8612332E38)
            r6 = 0
            android.view.View r0 = r0.inflate(r3, r6)     // Catch:{ Exception -> 0x015f }
            r1.f54189d = r0     // Catch:{ Exception -> 0x015f }
        L_0x0053:
            android.view.View r0 = r1.f54189d     // Catch:{ Exception -> 0x015f }
            r3 = 2131299914(0x7f090e4a, float:1.8217843E38)
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x015f }
            android.view.View r3 = r1.f54189d     // Catch:{ Exception -> 0x015f }
            r6 = 2131301231(0x7f09136f, float:1.8220514E38)
            android.view.View r3 = r3.findViewById(r6)     // Catch:{ Exception -> 0x015f }
            com.ss.android.push.window.oppo.PushWindowScrollView r3 = (com.p280ss.android.push.window.oppo.PushWindowScrollView) r3     // Catch:{ Exception -> 0x015f }
            android.view.View r6 = r1.f54189d     // Catch:{ Exception -> 0x015f }
            r7 = 2131302154(0x7f09170a, float:1.8222386E38)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ Exception -> 0x015f }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ Exception -> 0x015f }
            android.view.View r7 = r1.f54189d     // Catch:{ Exception -> 0x015f }
            r8 = 2131297334(0x7f090436, float:1.821261E38)
            android.view.View r7 = r7.findViewById(r8)     // Catch:{ Exception -> 0x015f }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x015f }
            android.view.View r8 = r1.f54189d     // Catch:{ Exception -> 0x015f }
            r9 = 2131302109(0x7f0916dd, float:1.8222295E38)
            android.view.View r8 = r8.findViewById(r9)     // Catch:{ Exception -> 0x015f }
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch:{ Exception -> 0x015f }
            android.view.View r9 = r1.f54189d     // Catch:{ Exception -> 0x015f }
            r10 = 2131298526(0x7f0908de, float:1.8215028E38)
            android.view.View r9 = r9.findViewById(r10)     // Catch:{ Exception -> 0x015f }
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ Exception -> 0x015f }
            android.content.Context r10 = r1.f54190e     // Catch:{ Exception -> 0x015f }
            r11 = 2131820918(0x7f110176, float:1.9274565E38)
            java.lang.String r10 = r10.getString(r11)     // Catch:{ Exception -> 0x015f }
            r6.setText(r10)     // Catch:{ Exception -> 0x015f }
            r6 = r18
            r7.setText(r6)     // Catch:{ Exception -> 0x015f }
            r6 = 2131233873(0x7f080c51, float:1.8083896E38)
            r9.setImageResource(r6)     // Catch:{ Exception -> 0x015f }
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x015f }
            java.lang.String r7 = "HH:mm"
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x015f }
            r6.<init>(r7, r9)     // Catch:{ Exception -> 0x015f }
            java.util.Date r7 = new java.util.Date     // Catch:{ Exception -> 0x015f }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x015f }
            r7.<init>(r9)     // Catch:{ Exception -> 0x015f }
            java.lang.String r6 = r6.format(r7)     // Catch:{ Exception -> 0x015f }
            r8.setText(r6)     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = new android.view.WindowManager$LayoutParams     // Catch:{ Exception -> 0x015f }
            r6.<init>()     // Catch:{ Exception -> 0x015f }
            r1.f54188c = r6     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = r1.f54188c     // Catch:{ Exception -> 0x015f }
            r7 = -2
            r6.height = r7     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = r1.f54188c     // Catch:{ Exception -> 0x015f }
            r7 = -1
            r6.width = r7     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = r1.f54188c     // Catch:{ Exception -> 0x015f }
            r7 = -3
            r6.format = r7     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = r1.f54188c     // Catch:{ Exception -> 0x015f }
            r7 = 16973828(0x1030004, float:2.406091E-38)
            r6.windowAnimations = r7     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = r1.f54188c     // Catch:{ Exception -> 0x015f }
            int r7 = r1.f54193h     // Catch:{ Exception -> 0x015f }
            r6.type = r7     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = r1.f54188c     // Catch:{ Exception -> 0x015f }
            int r7 = r1.f54194i     // Catch:{ Exception -> 0x015f }
            r6.flags = r7     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = r1.f54188c     // Catch:{ Exception -> 0x015f }
            java.lang.String r7 = "Toast"
            r6.setTitle(r7)     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = r1.f54188c     // Catch:{ Exception -> 0x015f }
            r7 = 49
            r6.gravity = r7     // Catch:{ Exception -> 0x015f }
            r1.f54200o = r5     // Catch:{ Exception -> 0x015f }
            com.ss.android.push.window.oppo.c$2 r6 = new com.ss.android.push.window.oppo.c$2     // Catch:{ Exception -> 0x015f }
            r6.<init>()     // Catch:{ Exception -> 0x015f }
            r3.setOnScrollListener(r6)     // Catch:{ Exception -> 0x015f }
            android.view.GestureDetector r3 = new android.view.GestureDetector     // Catch:{ Exception -> 0x015f }
            android.content.Context r6 = r1.f54190e     // Catch:{ Exception -> 0x015f }
            com.ss.android.push.window.oppo.c$3 r7 = new com.ss.android.push.window.oppo.c$3     // Catch:{ Exception -> 0x015f }
            r8 = r24
            r7.<init>(r2, r5, r8)     // Catch:{ Exception -> 0x015f }
            r3.<init>(r6, r7)     // Catch:{ Exception -> 0x015f }
            com.ss.android.push.window.oppo.c$4 r6 = new com.ss.android.push.window.oppo.c$4     // Catch:{ Exception -> 0x015f }
            r6.<init>(r3)     // Catch:{ Exception -> 0x015f }
            r0.setOnTouchListener(r6)     // Catch:{ Exception -> 0x015f }
            android.content.Context r0 = r1.f54190e     // Catch:{ Exception -> 0x015f }
            com.ss.android.push.window.oppo.d r0 = com.p280ss.android.push.window.oppo.C20035d.m65985a(r0)     // Catch:{ Exception -> 0x015f }
            r0.mo53635a(r2)     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager r0 = r1.f54187b     // Catch:{ Exception -> 0x012b }
            android.view.View r3 = r1.f54189d     // Catch:{ Exception -> 0x012b }
            r0.removeView(r3)     // Catch:{ Exception -> 0x012b }
        L_0x012b:
            android.view.View r0 = r1.f54189d     // Catch:{ Exception -> 0x015f }
            r3 = 0
            r0.setTranslationY(r3)     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager r0 = r1.f54187b     // Catch:{ Exception -> 0x015f }
            android.view.View r3 = r1.f54189d     // Catch:{ Exception -> 0x015f }
            android.view.WindowManager$LayoutParams r6 = r1.f54188c     // Catch:{ Exception -> 0x015f }
            r0.addView(r3, r6)     // Catch:{ Exception -> 0x015f }
            r1.f54197l = r4     // Catch:{ Exception -> 0x015f }
            android.os.Handler r0 = r1.f54191f     // Catch:{ Exception -> 0x015f }
            java.lang.Runnable r3 = r1.f54204t     // Catch:{ Exception -> 0x015f }
            r0.removeCallbacks(r3)     // Catch:{ Exception -> 0x015f }
            boolean r0 = r1.f54203s     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x0151
            android.os.Handler r0 = r1.f54191f     // Catch:{ Exception -> 0x015f }
            java.lang.Runnable r3 = r1.f54204t     // Catch:{ Exception -> 0x015f }
            int r6 = r1.f54202r     // Catch:{ Exception -> 0x015f }
            long r6 = (long) r6     // Catch:{ Exception -> 0x015f }
            r0.postDelayed(r3, r6)     // Catch:{ Exception -> 0x015f }
        L_0x0151:
            android.content.Context r8 = r1.f54190e     // Catch:{ Exception -> 0x015f }
            java.lang.String r9 = "pop_window_show"
            long r10 = (long) r2     // Catch:{ Exception -> 0x015f }
            r12 = -1
            r14 = 0
            org.json.JSONObject[] r15 = new org.json.JSONObject[r5]     // Catch:{ Exception -> 0x015f }
            m65970a(r8, r9, r10, r12, r14, r15)     // Catch:{ Exception -> 0x015f }
            return
        L_0x015f:
            r0 = move-exception
            r1.f54197l = r5
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x018f }
            r3.<init>()     // Catch:{ JSONException -> 0x018f }
            java.lang.String r6 = "error"
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x018f }
            r3.put(r6, r0)     // Catch:{ JSONException -> 0x018f }
            android.content.Context r0 = r1.f54190e     // Catch:{ JSONException -> 0x018f }
            java.lang.String r6 = "pop_window_show_fail"
            long r7 = (long) r2     // Catch:{ JSONException -> 0x018f }
            r9 = -1
            r2 = 0
            org.json.JSONObject[] r4 = new org.json.JSONObject[r4]     // Catch:{ JSONException -> 0x018f }
            r4[r5] = r3     // Catch:{ JSONException -> 0x018f }
            r17 = r0
            r18 = r6
            r19 = r7
            r21 = r9
            r23 = r2
            r24 = r4
            m65970a(r17, r18, r19, r21, r23, r24)     // Catch:{ JSONException -> 0x018f }
            r16.mo53619b()     // Catch:{ JSONException -> 0x018f }
            return
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.push.window.oppo.C20025c.mo53616a(org.json.JSONObject, java.lang.String, java.lang.String, int, int, java.lang.String, boolean, android.view.View$OnClickListener):void");
    }
}

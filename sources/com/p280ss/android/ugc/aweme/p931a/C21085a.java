package com.p280ss.android.ugc.aweme.p931a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.experiment.FullScreenReadAdaptionExperiment;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.story.api.model.C41976a;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43045c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.a.a */
public final class C21085a {

    /* renamed from: a */
    public static final int f56610a = C23486n.m77122a(11.0d);

    /* renamed from: b */
    public static final int f56611b = C23486n.m77122a(8.0d);

    /* renamed from: m */
    private static boolean f56612m = C6384b.m19835a().mo15292a(FullScreenReadAdaptionExperiment.class, true, "enable_full_screen_read_adaption", C6384b.m19835a().mo15295d().enable_full_screen_read_adaption, true);

    /* renamed from: n */
    private static int f56613n = -1;

    /* renamed from: o */
    private static int f56614o;

    /* renamed from: p */
    private static int f56615p;

    /* renamed from: c */
    public int f56616c;

    /* renamed from: d */
    public int f56617d;

    /* renamed from: e */
    public int f56618e;

    /* renamed from: f */
    public int f56619f;

    /* renamed from: g */
    public boolean f56620g;

    /* renamed from: h */
    public C41976a f56621h;

    /* renamed from: i */
    public boolean f56622i;

    /* renamed from: j */
    public boolean f56623j;

    /* renamed from: k */
    public boolean f56624k;

    /* renamed from: l */
    public boolean f56625l;

    /* renamed from: com.ss.android.ugc.aweme.a.a$a */
    static class C21087a {

        /* renamed from: a */
        public static C21085a f56637a = new C21085a();
    }

    /* renamed from: com.ss.android.ugc.aweme.a.a$b */
    public interface C21088b {
        /* renamed from: d */
        void mo56928d();
    }

    /* renamed from: com.ss.android.ugc.aweme.a.a$c */
    public interface C21089c {
        /* renamed from: a */
        void mo56929a();
    }

    /* renamed from: com.ss.android.ugc.aweme.a.a$d */
    public interface C21090d {
        /* renamed from: a */
        void mo56930a();
    }

    /* renamed from: a */
    public static C21085a m71117a() {
        return C21087a.f56637a;
    }

    /* renamed from: c */
    public static boolean m71129c() {
        return f56612m;
    }

    /* renamed from: d */
    public static int m71131d() {
        return f56614o;
    }

    /* renamed from: e */
    public static int m71133e() {
        return f56615p;
    }

    /* renamed from: a */
    public final void mo56925a(int i, View view, View view2, View view3, C21089c cVar) {
        if (m71129c() && view != null && view2 != null) {
            C21093d dVar = new C21093d(view2, i, view, view3, cVar);
            C6726a.m20844b(dVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r5.bottom != r2.y) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r2.x != r1.findViewById(16908290).getWidth()) goto L_0x003f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m71125a(android.app.Activity r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0056
            boolean r1 = m71135f()
            if (r1 != 0) goto L_0x000a
            goto L_0x0056
        L_0x000a:
            android.view.WindowManager r1 = r5.getWindowManager()     // Catch:{ Exception -> 0x0051 }
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ Exception -> 0x0051 }
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ Exception -> 0x0051 }
            r2.<init>()     // Catch:{ Exception -> 0x0051 }
            r1.getRealSize(r2)     // Catch:{ Exception -> 0x0051 }
            android.view.Window r1 = r5.getWindow()     // Catch:{ Exception -> 0x0051 }
            android.view.View r1 = r1.getDecorView()     // Catch:{ Exception -> 0x0051 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ Exception -> 0x0051 }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ Exception -> 0x0051 }
            r3 = 2
            int r5 = r5.orientation     // Catch:{ Exception -> 0x0051 }
            r4 = 1
            if (r3 != r5) goto L_0x0041
            r5 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r5 = r1.findViewById(r5)     // Catch:{ Exception -> 0x0051 }
            int r1 = r2.x     // Catch:{ Exception -> 0x0051 }
            int r5 = r5.getWidth()     // Catch:{ Exception -> 0x0051 }
            if (r1 == r5) goto L_0x0050
        L_0x003f:
            r0 = 1
            goto L_0x0050
        L_0x0041:
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0051 }
            r5.<init>()     // Catch:{ Exception -> 0x0051 }
            r1.getWindowVisibleDisplayFrame(r5)     // Catch:{ Exception -> 0x0051 }
            int r5 = r5.bottom     // Catch:{ Exception -> 0x0051 }
            int r1 = r2.y     // Catch:{ Exception -> 0x0051 }
            if (r5 == r1) goto L_0x0050
            goto L_0x003f
        L_0x0050:
            return r0
        L_0x0051:
            r5 = move-exception
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r5)
            return r0
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p931a.C21085a.m71125a(android.app.Activity):boolean");
    }

    /* renamed from: a */
    public static boolean m71126a(MotionEvent motionEvent, Context context) {
        if (C6399b.m19944t()) {
            return false;
        }
        int i = 47;
        if (m71129c()) {
            i = 58;
        }
        if (f56613n < 0) {
            f56613n = C23482j.m77095a(context) - C23482j.m77104e(context);
        }
        if (((float) (f56613n - C23486n.m77122a((double) (i + 28)))) < motionEvent.getRawY()) {
            return true;
        }
        return false;
    }

    private C21085a() {
        this.f56621h = new C41976a();
    }

    /* renamed from: f */
    private static boolean m71135f() {
        if (VERSION.SDK_INT >= 17) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int mo56926b() {
        double d;
        if (m71129c()) {
            d = 58.0d;
        } else {
            d = 47.0d;
        }
        return C23486n.m77122a(d);
    }

    /* renamed from: a */
    public static int m71116a(Context context) {
        if (C6776h.m20942a()) {
            return m71134e(context);
        }
        return C9738o.m28717e(context);
    }

    /* renamed from: c */
    private static boolean m71130c(Context context) {
        int i;
        if (context == null || !m71135f()) {
            i = 0;
        } else {
            i = Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m71132d(Context context) {
        int i;
        if (!C6776h.m20942a()) {
            return false;
        }
        if (context == null) {
            i = 0;
        } else {
            i = Secure.getInt(context.getContentResolver(), "display_notch_status", 0);
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m71128b(Context context) {
        if (m71135f() && Global.getInt(context.getContentResolver(), "navigationbar_trigger_mode", 0) == 0 && Global.getInt(context.getContentResolver(), "nav_fixed_mode", 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static int m71134e(Context context) {
        if (!C6776h.m20942a()) {
            return 0;
        }
        int[] iArr = {0, 0};
        try {
            Class loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]))[1];
        } catch (Throwable unused) {
            return iArr[1];
        }
    }

    /* renamed from: b */
    private static int m71127b(Activity activity) {
        int i;
        WindowManager windowManager = (WindowManager) C6399b.m19921a().getSystemService("window");
        int i2 = 0;
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            int i3 = displayMetrics.heightPixels;
            if (activity == null || !TextUtils.equals("OnePlus", Build.BRAND)) {
                i = defaultDisplay.getHeight();
            } else {
                View decorView = activity.getWindow().getDecorView();
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                i = rect.bottom;
            }
            i2 = i3 - i;
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
        return i2;
    }

    /* renamed from: a */
    private static void m71122a(ViewGroup viewGroup, View view, Activity activity, int i, C21090d dVar) {
        C21091b bVar = new C21091b(activity, viewGroup, view, 47, dVar);
        C6726a.m20842a(bVar);
    }

    /* renamed from: a */
    static final /* synthetic */ void m71119a(Activity activity, ViewGroup viewGroup, View view, int i, C21090d dVar) {
        final boolean z;
        final int i2;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (m71135f()) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception unused) {
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            final int i3 = displayMetrics.heightPixels;
            final int i4 = displayMetrics.widthPixels;
            if (!C6776h.m20950c() || !m71130c(activity)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = m71127b(activity);
            }
            final boolean d = m71132d(activity);
            final int e = m71134e(activity);
            final Activity activity2 = activity;
            final ViewGroup viewGroup2 = viewGroup;
            final View view2 = view;
            final int i5 = i;
            final C21090d dVar2 = dVar;
            C210861 r0 = new Runnable() {
                public final void run() {
                    boolean z;
                    int i;
                    if (activity2 != null && !activity2.isFinishing() && viewGroup2 != null && view2 != null) {
                        C21085a.m71117a().f56619f = viewGroup2.getHeight();
                        C21085a.m71117a().f56620g = d;
                        double d = (double) i3;
                        Double.isNaN(d);
                        double d2 = d * 0.05263157894736842d;
                        double d3 = (double) i4;
                        double d4 = (double) i3;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        double d5 = d3 / d4;
                        C21085a.m71117a().f56616c = i2;
                        boolean z2 = true;
                        if (e != C21085a.m71117a().f56617d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C21085a.m71117a().f56617d = e;
                        if (i2 > 0 && ((double) i2) < d2) {
                            i = (int) C9738o.m28708b(C6399b.m19921a(), (float) i5);
                            C21085a.m71117a().f56618e = i2;
                        } else if ((i2 == 0 || z) && d5 <= 0.5d) {
                            i = (int) C9738o.m28708b(C6399b.m19921a(), (float) i5);
                            C21085a.m71117a().f56618e = 0;
                        } else {
                            C21085a.m71117a().f56618e = 0;
                            i = 0;
                            z2 = false;
                        }
                        C21085a.m71117a().f56621h.f109044a = false;
                        C21085a.m71117a().f56621h.f109047d = i2;
                        if (view2 != null) {
                            LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                            if (layoutParams.height != i) {
                                layoutParams.height = i;
                                view2.setLayoutParams(layoutParams);
                            }
                            if (C21085a.m71117a().f56622i != z2 || z) {
                                C21085a.m71117a().f56622i = z2;
                                for (int i2 = 0; i2 < viewGroup2.getChildCount(); i2++) {
                                    ((C21088b) viewGroup2.getChildAt(i2).getTag(R.id.aje)).mo56928d();
                                }
                            }
                        }
                        if (dVar2 != null) {
                            dVar2.mo56930a();
                        }
                    }
                }
            };
            C6726a.m20844b(r0);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m71121a(View view, int i, View view2, View view3, C21089c cVar) {
        int a = C23486n.m77122a(58.0d);
        if (C6399b.m19945u()) {
            C23487o.m77140a(view, 8);
        } else if (i == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.bottomMargin != a) {
                layoutParams.bottomMargin = a;
                view.setLayoutParams(layoutParams);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2.height != a) {
            layoutParams2.height = a;
            view2.setLayoutParams(layoutParams2);
        }
        if (view3 != null) {
            LayoutParams layoutParams3 = (LayoutParams) view3.getLayoutParams();
            if (layoutParams3.height != a) {
                layoutParams3.height = a;
                layoutParams3.topMargin = -a;
                view3.setLayoutParams(layoutParams3);
            }
        }
        if (cVar != null) {
            cVar.mo56929a();
        }
    }

    /* renamed from: a */
    public static void m71124a(ViewGroup viewGroup, View view, View view2, Activity activity, C21090d dVar) {
        if (m71129c()) {
            m71123a(viewGroup, view, view2, activity, 58, dVar);
        } else {
            m71122a(viewGroup, view2, activity, 47, dVar);
        }
    }

    /* renamed from: a */
    private static void m71123a(ViewGroup viewGroup, View view, View view2, Activity activity, int i, C21090d dVar) {
        C21092c cVar = new C21092c(activity, 58, viewGroup, view2, view, dVar);
        C6726a.m20842a(cVar);
    }

    /* renamed from: a */
    static final /* synthetic */ void m71118a(Activity activity, int i, ViewGroup viewGroup, View view, View view2, C21090d dVar) {
        boolean z;
        boolean z2;
        int i2;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (m71135f()) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception unused) {
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            boolean z3 = true;
            if (!C6776h.m20950c() || !m71130c(activity)) {
                z = false;
            } else {
                z = true;
            }
            if (!C6776h.m20950c() || VERSION.SDK_INT < 28 || m71130c(activity)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = m71127b(activity);
            }
            if (!C43045c.m136576f() || VERSION.SDK_INT < 28 || !m71128b((Context) activity)) {
                z3 = false;
            }
            boolean d = m71132d(activity);
            int e = m71134e(activity);
            int d2 = C23482j.m77101d();
            if ((d && e > 0) || z2 || z3) {
                i2 -= d2;
            }
            C21094e eVar = new C21094e(activity, viewGroup, view, view2, displayMetrics, d, i2, d2, C23486n.m77122a((double) i), e, dVar);
            C6726a.m20844b(eVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x027a A[LOOP:0: B:94:0x0274->B:96:0x027a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x028f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m71120a(android.app.Activity r27, android.view.ViewGroup r28, android.view.View r29, android.view.View r30, android.util.DisplayMetrics r31, boolean r32, int r33, int r34, int r35, int r36, com.p280ss.android.ugc.aweme.p931a.C21085a.C21090d r37) {
        /*
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r33
            r5 = r34
            r6 = r35
            boolean r7 = r27.isFinishing()
            if (r7 != 0) goto L_0x0293
            if (r0 == 0) goto L_0x0293
            if (r1 == 0) goto L_0x0293
            if (r2 != 0) goto L_0x001c
            goto L_0x0293
        L_0x001c:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            r9 = 0
            if (r7 < r8) goto L_0x0028
            android.view.WindowInsets r7 = r28.getRootWindowInsets()
            goto L_0x0029
        L_0x0028:
            r7 = r9
        L_0x0029:
            r8 = 1
            r10 = 0
            if (r7 == 0) goto L_0x004a
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 20
            if (r11 < r12) goto L_0x003f
            java.lang.Class<android.view.WindowInsets> r9 = android.view.WindowInsets.class
            java.lang.String r11 = "getDisplayCutout"
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r10] = r7
            java.lang.Object r9 = com.bytedance.common.utility.reflect.C9743c.m28722a(r9, r11, r12)
        L_0x003f:
            com.ss.android.ugc.aweme.a.a r7 = m71117a()
            if (r9 == 0) goto L_0x0047
            r9 = 1
            goto L_0x0048
        L_0x0047:
            r9 = 0
        L_0x0048:
            r7.f56623j = r9
        L_0x004a:
            int r7 = r3.heightPixels
            com.ss.android.ugc.aweme.a.a r9 = m71117a()
            boolean r9 = r9.f56623j
            if (r9 == 0) goto L_0x0065
            boolean r9 = com.p280ss.android.common.util.C6776h.m20950c()
            if (r9 != 0) goto L_0x0065
            boolean r9 = com.p280ss.android.common.util.C6776h.m20942a()
            if (r9 != 0) goto L_0x0065
            int r9 = com.p280ss.android.ugc.aweme.base.utils.C23482j.m77101d()
            goto L_0x0066
        L_0x0065:
            r9 = 0
        L_0x0066:
            int r7 = r7 + r9
            int r9 = r3.widthPixels
            com.ss.android.ugc.aweme.a.a r11 = m71117a()
            int r12 = r28.getHeight()
            r11.f56619f = r12
            com.ss.android.ugc.aweme.a.a r11 = m71117a()
            r12 = r32
            r11.f56620g = r12
            com.ss.android.ugc.aweme.a.a r11 = m71117a()
            r11.f56616c = r4
            int r11 = r7 - r4
            double r11 = (double) r11
            double r13 = (double) r5
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r13)
            double r13 = r11 - r13
            r16 = r11
            double r10 = (double) r6
            java.lang.Double.isNaN(r10)
            double r18 = r13 - r10
            double r8 = (double) r9
            java.lang.Double.isNaN(r8)
            r20 = r7
            double r6 = r18 / r8
            java.lang.Double.isNaN(r8)
            double r13 = r13 / r8
            java.lang.Double.isNaN(r16)
            java.lang.Double.isNaN(r10)
            double r11 = r16 - r10
            java.lang.Double.isNaN(r8)
            double r11 = r11 / r8
            com.ss.android.ugc.aweme.a.a r10 = m71117a()
            r15 = r36
            r10.f56617d = r15
            r18 = 0
            r21 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            if (r4 <= 0) goto L_0x00fa
            java.lang.Double.isNaN(r16)
            java.lang.Double.isNaN(r8)
            double r8 = r16 / r8
            int r10 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d1
            java.lang.String r8 = "G"
        L_0x00cc:
            r9 = r8
            r8 = 0
        L_0x00ce:
            r10 = 0
            goto L_0x012c
        L_0x00d1:
            int r8 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d8
            java.lang.String r8 = "D"
            goto L_0x0100
        L_0x00d8:
            int r8 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r8 >= 0) goto L_0x00e3
            int r8 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r8 >= 0) goto L_0x00e3
            java.lang.String r8 = "G"
            goto L_0x00cc
        L_0x00e3:
            r8 = 0
            double r8 = r11 - r21
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f7
            double r21 = r13 - r21
            int r10 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r10 < 0) goto L_0x00f4
            int r10 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r10 >= 0) goto L_0x00f7
        L_0x00f4:
            java.lang.String r8 = "E"
            goto L_0x0123
        L_0x00f7:
            java.lang.String r8 = "F"
            goto L_0x0129
        L_0x00fa:
            int r8 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r8 < 0) goto L_0x0105
            java.lang.String r8 = "A"
        L_0x0100:
            r10 = r5
            r9 = r8
            r8 = r35
            goto L_0x012c
        L_0x0105:
            int r8 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r8 >= 0) goto L_0x0110
            int r8 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r8 >= 0) goto L_0x0110
            java.lang.String r8 = "默认"
            goto L_0x00cc
        L_0x0110:
            r8 = 0
            double r8 = r11 - r21
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 <= 0) goto L_0x0127
            double r21 = r13 - r21
            int r10 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r10 < 0) goto L_0x0121
            int r10 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r10 >= 0) goto L_0x0127
        L_0x0121:
            java.lang.String r8 = "B"
        L_0x0123:
            r9 = r8
            r8 = r35
            goto L_0x00ce
        L_0x0127:
            java.lang.String r8 = "C"
        L_0x0129:
            r10 = r5
            r9 = r8
            r8 = 0
        L_0x012c:
            f56614o = r10
            f56615p = r8
            int r15 = r30.getVisibility()
            r23 = r6
            r6 = 8
            if (r15 != r6) goto L_0x013b
            r10 = 0
        L_0x013b:
            int r7 = r29.getVisibility()
            if (r7 != r6) goto L_0x0142
            r8 = 0
        L_0x0142:
            com.ss.android.ugc.aweme.a.a r6 = m71117a()
            if (r10 == 0) goto L_0x014a
            r7 = 1
            goto L_0x014b
        L_0x014a:
            r7 = 0
        L_0x014b:
            r6.f56624k = r7
            com.ss.android.ugc.aweme.a.a r6 = m71117a()
            if (r8 == 0) goto L_0x0155
            r7 = 1
            goto L_0x0156
        L_0x0155:
            r7 = 0
        L_0x0156:
            r6.f56625l = r7
            com.ss.android.ugc.aweme.a.a r6 = m71117a()
            if (r8 == 0) goto L_0x0160
            r7 = 1
            goto L_0x0161
        L_0x0160:
            r7 = 0
        L_0x0161:
            r6.f56622i = r7
            com.ss.android.ugc.aweme.a.a r6 = m71117a()
            r25 = r11
            r11 = r16
            int r7 = (int) r11
            int r7 = r7 - r10
            int r7 = r7 - r8
            r6.f56619f = r7
            com.ss.android.ugc.aweme.a.a r6 = m71117a()
            com.ss.android.ugc.aweme.story.api.model.a r6 = r6.f56621h
            r7 = 1
            r6.f109044a = r7
            com.ss.android.ugc.aweme.a.a r6 = m71117a()
            com.ss.android.ugc.aweme.story.api.model.a r6 = r6.f56621h
            r6.f109045b = r5
            com.ss.android.ugc.aweme.a.a r6 = m71117a()
            com.ss.android.ugc.aweme.story.api.model.a r6 = r6.f56621h
            r6.f109046c = r8
            com.ss.android.ugc.aweme.a.a r6 = m71117a()
            com.ss.android.ugc.aweme.story.api.model.a r6 = r6.f56621h
            r6.f109047d = r4
            android.view.ViewGroup$LayoutParams r6 = r30.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r7 = r6.height
            if (r7 == r10) goto L_0x01a0
            r6.height = r10
            r2.setLayoutParams(r6)
        L_0x01a0:
            android.view.ViewGroup$LayoutParams r2 = r29.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r6 = r2.height
            if (r6 == r8) goto L_0x01af
            r2.height = r8
            r1.setLayoutParams(r2)
        L_0x01af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "doAdaptationV2: , realDisplayMetrics.heightPixels:"
            r1.<init>(r2)
            int r2 = r3.heightPixels
            r1.append(r2)
            java.lang.String r2 = ", isAndroidPHasNotch():"
            r1.append(r2)
            com.ss.android.ugc.aweme.a.a r2 = m71117a()
            boolean r2 = r2.f56623j
            r1.append(r2)
            java.lang.String r2 = ", statusBarHeight:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ", realScreenHeight:"
            r1.append(r2)
            r7 = r20
            r1.append(r7)
            java.lang.String r2 = ", virtualBarHeight:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", appNavHeight:"
            r1.append(r2)
            r3 = r23
            r2 = r35
            r1.append(r2)
            java.lang.String r2 = ", screenHeightWithoutVirtualBar:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ", ViewPagerHeight:"
            r1.append(r2)
            com.ss.android.ugc.aweme.a.a r2 = m71117a()
            int r2 = r2.f56619f
            r1.append(r2)
            java.lang.String r2 = ", topSpaceHeight:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", bottomSpaceHeight:"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ", desiredTopSpaceHeight:"
            r1.append(r2)
            int r2 = f56614o
            r1.append(r2)
            java.lang.String r2 = ", desiredBottomSpaceHeight:"
            r1.append(r2)
            int r2 = f56615p
            r1.append(r2)
            java.lang.String r2 = ", showTopCorner:"
            r1.append(r2)
            com.ss.android.ugc.aweme.a.a r2 = m71117a()
            boolean r2 = r2.f56624k
            r1.append(r2)
            java.lang.String r2 = ", showBottomCorner:"
            r1.append(r2)
            com.ss.android.ugc.aweme.a.a r2 = m71117a()
            boolean r2 = r2.f56625l
            r1.append(r2)
            java.lang.String r2 = ", 方案"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ", 减去两个栏的比例:"
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = ", 只减状态栏的比例:"
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = ", 只减DMT菜单栏的比例:"
            r2.append(r1)
            r11 = r25
            r2.append(r11)
            r1 = 0
        L_0x0274:
            int r2 = r28.getChildCount()
            if (r1 >= r2) goto L_0x028d
            android.view.View r2 = r0.getChildAt(r1)
            r3 = 2131297999(0x7f0906cf, float:1.8213959E38)
            java.lang.Object r2 = r2.getTag(r3)
            com.ss.android.ugc.aweme.a.a$b r2 = (com.p280ss.android.ugc.aweme.p931a.C21085a.C21088b) r2
            r2.mo56928d()
            int r1 = r1 + 1
            goto L_0x0274
        L_0x028d:
            if (r37 == 0) goto L_0x0292
            r37.mo56930a()
        L_0x0292:
            return
        L_0x0293:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p931a.C21085a.m71120a(android.app.Activity, android.view.ViewGroup, android.view.View, android.view.View, android.util.DisplayMetrics, boolean, int, int, int, int, com.ss.android.ugc.aweme.a.a$d):void");
    }
}

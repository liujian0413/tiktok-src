package com.p280ss.android.ugc.aweme.video;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.player.p1457b.C34960a;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import com.p280ss.android.ugc.aweme.utils.C43053de;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;

/* renamed from: com.ss.android.ugc.aweme.video.l */
public final class C43240l extends PhoneStateListener {

    /* renamed from: d */
    public static volatile C43240l f111938d;

    /* renamed from: e */
    public static final C43241a f111939e = new C43241a(null);

    /* renamed from: a */
    public final Context f111940a;

    /* renamed from: b */
    public TelephonyManager f111941b;

    /* renamed from: c */
    public C34960a f111942c;

    /* renamed from: f */
    private Object f111943f;

    /* renamed from: g */
    private boolean f111944g;

    /* renamed from: h */
    private TelephonyManager f111945h;

    /* renamed from: i */
    private Method f111946i;

    /* renamed from: j */
    private Method f111947j;

    /* renamed from: k */
    private Method f111948k;

    /* renamed from: l */
    private C43242b f111949l;

    /* renamed from: m */
    private ExecutorService f111950m;

    /* renamed from: com.ss.android.ugc.aweme.video.l$a */
    public static final class C43241a {
        private C43241a() {
        }

        public /* synthetic */ C43241a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final synchronized C43240l mo104988a(Context context) {
            C43240l lVar;
            C7573i.m23587b(context, "context");
            if (C43240l.f111938d == null) {
                synchronized (C7575l.m23595a(C43240l.class)) {
                    if (C43240l.f111938d == null) {
                        C43240l.f111938d = new C43240l(context, null);
                    }
                }
            }
            lVar = C43240l.f111938d;
            if (lVar == null) {
                C7573i.m23580a();
            }
            return lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.l$b */
    public final class C43242b extends PhoneStateListener {
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            C7573i.m23587b(signalStrength, "signalStrength");
            try {
                super.onSignalStrengthsChanged(signalStrength);
                C43240l.this.mo104984a(signalStrength);
            } catch (Exception unused) {
            }
        }

        public C43242b(int i) {
            try {
                if (VERSION.SDK_INT >= 22) {
                    C43053de.m136585a(PhoneStateListener.class, "mSubId", (Object) this, (Object) Integer.valueOf(C43053de.m136588b(i)));
                    return;
                }
                if (VERSION.SDK_INT > 19 && VERSION.SDK_INT < 22) {
                    C43053de.m136585a(PhoneStateListener.class, "mSubId", (Object) this, (Object) Long.valueOf(C43053de.m136583a(i)));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.l$c */
    static final class C43243c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C43240l f111952a;

        /* renamed from: b */
        final /* synthetic */ SignalStrength f111953b;

        C43243c(C43240l lVar, SignalStrength signalStrength) {
            this.f111952a = lVar;
            this.f111953b = signalStrength;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            this.f111952a.mo104986b(this.f111953b);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.l$d */
    public static final class C43244d {

        /* renamed from: a */
        final /* synthetic */ C43240l f111954a;

        C43244d(C43240l lVar) {
            this.f111954a = lVar;
        }

        /* renamed from: a */
        public final void mo104991a(C43240l lVar, int i) {
            C7573i.m23587b(lVar, "phoneSignalService");
            try {
                Field declaredField = Class.forName("android.telephony.PhoneStateListener").getDeclaredField("mSubscription");
                C7573i.m23582a((Object) declaredField, "filed");
                declaredField.setAccessible(true);
                declaredField.setInt(lVar, i);
            } catch (Exception unused) {
            }
            C43240l lVar2 = this.f111954a;
            Object systemService = this.f111954a.f111940a.getSystemService("phone_msim");
            if (systemService != null) {
                lVar2.f111941b = (TelephonyManager) systemService;
                TelephonyManager telephonyManager = this.f111954a.f111941b;
                if (telephonyManager != null) {
                    telephonyManager.listen(lVar, 256);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
    }

    /* renamed from: a */
    public static final synchronized C43240l m137186a(Context context) {
        C43240l a;
        synchronized (C43240l.class) {
            a = f111939e.mo104988a(context);
        }
        return a;
    }

    /* renamed from: b */
    public final void mo104985b() {
        TelephonyManager telephonyManager = this.f111941b;
        if (telephonyManager != null) {
            telephonyManager.listen(f111938d, 0);
            telephonyManager.listen(this.f111949l, 0);
        }
        TelephonyManager telephonyManager2 = this.f111945h;
        if (telephonyManager2 != null) {
            telephonyManager2.listen(this, 0);
        }
        this.f111944g = false;
    }

    /* renamed from: c */
    private final void m137187c() {
        try {
            Class cls = Class.forName("android.telephony.SignalStrength");
            if (cls != null) {
                this.f111946i = cls.getMethod("getDbm", new Class[0]);
                this.f111947j = cls.getMethod("getLteDbm", new Class[0]);
                this.f111948k = cls.getMethod("getLteRssnr", new Class[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|(4:13|(1:15)|36|38)(2:16|17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002e */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[Catch:{ Exception -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047 A[Catch:{ Exception -> 0x00a5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104983a() {
        /*
            r4 = this;
            boolean r0 = r4.f111944g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.ugc.aweme.player.b.a r0 = new com.ss.android.ugc.aweme.player.b.a     // Catch:{ Exception -> 0x00a5 }
            r0.<init>()     // Catch:{ Exception -> 0x00a5 }
            r4.f111942c = r0     // Catch:{ Exception -> 0x00a5 }
            com.ss.android.ugc.aweme.utils.de r0 = com.p280ss.android.ugc.aweme.utils.C43053de.f111651a     // Catch:{ Exception -> 0x00a5 }
            android.content.Context r1 = r4.f111940a     // Catch:{ Exception -> 0x00a5 }
            int r0 = r0.mo104721b(r1)     // Catch:{ Exception -> 0x00a5 }
            android.content.Context r1 = r4.f111940a     // Catch:{ Exception -> 0x00a5 }
            boolean r1 = com.p280ss.android.ugc.aweme.utils.C43053de.m136587a(r1)     // Catch:{ Exception -> 0x00a5 }
            r2 = 21
            r3 = 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a5 }
            if (r1 >= r2) goto L_0x004f
            com.ss.android.ugc.aweme.video.l$d r1 = new com.ss.android.ugc.aweme.video.l$d     // Catch:{ Throwable -> 0x002e }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x002e }
            r1.mo104991a(r4, r0)     // Catch:{ Throwable -> 0x002e }
            goto L_0x00a5
        L_0x002e:
            android.content.Context r0 = r4.f111940a     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x0047
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x00a5 }
            r4.f111945h = r0     // Catch:{ Exception -> 0x00a5 }
            android.telephony.TelephonyManager r0 = r4.f111945h     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x00a5
            r1 = r4
            android.telephony.PhoneStateListener r1 = (android.telephony.PhoneStateListener) r1     // Catch:{ Exception -> 0x00a5 }
            r0.listen(r1, r3)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a5
        L_0x0047:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00a5 }
            throw r0     // Catch:{ Exception -> 0x00a5 }
        L_0x004f:
            android.content.Context r1 = r4.f111940a     // Catch:{ Exception -> 0x00a5 }
            boolean r1 = com.p280ss.android.ugc.aweme.utils.C43053de.m136587a(r1)     // Catch:{ Exception -> 0x00a5 }
            if (r1 == 0) goto L_0x0084
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a5 }
            if (r1 < r2) goto L_0x0084
            com.ss.android.ugc.aweme.video.l$b r1 = new com.ss.android.ugc.aweme.video.l$b     // Catch:{ Exception -> 0x00a5 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00a5 }
            r4.f111949l = r1     // Catch:{ Exception -> 0x00a5 }
            android.content.Context r0 = r4.f111940a     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x007c
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x00a5 }
            r4.f111941b = r0     // Catch:{ Exception -> 0x00a5 }
            android.telephony.TelephonyManager r0 = r4.f111941b     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.video.l$b r1 = r4.f111949l     // Catch:{ Exception -> 0x00a5 }
            android.telephony.PhoneStateListener r1 = (android.telephony.PhoneStateListener) r1     // Catch:{ Exception -> 0x00a5 }
            r0.listen(r1, r3)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a5
        L_0x007c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00a5 }
            throw r0     // Catch:{ Exception -> 0x00a5 }
        L_0x0084:
            android.content.Context r0 = r4.f111940a     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x009d
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x00a5 }
            r4.f111945h = r0     // Catch:{ Exception -> 0x00a5 }
            android.telephony.TelephonyManager r0 = r4.f111945h     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x00a5
            r1 = r4
            android.telephony.PhoneStateListener r1 = (android.telephony.PhoneStateListener) r1     // Catch:{ Exception -> 0x00a5 }
            r0.listen(r1, r3)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a5
        L_0x009d:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r1 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00a5 }
            throw r0     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            r0 = 1
            r4.f111944g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.video.C43240l.mo104983a():void");
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        C7573i.m23587b(signalStrength, "signalStrength");
        try {
            super.onSignalStrengthsChanged(signalStrength);
            mo104984a(signalStrength);
        } catch (Exception unused) {
        }
    }

    private C43240l(Context context) {
        this.f111940a = context;
        Object systemService = context.getSystemService("phone");
        if (systemService != null) {
            try {
                this.f111943f = TelephonyManager.class.getMethod("getDefault", new Class[0]).invoke((TelephonyManager) systemService, new Object[0]);
                Object obj = this.f111943f;
                if (obj == null) {
                    C7573i.m23580a();
                }
                C43053de.m136586a(obj);
            } catch (Exception unused) {
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
    }

    /* renamed from: a */
    public final void mo104984a(SignalStrength signalStrength) {
        C7573i.m23587b(signalStrength, "signalStrength");
        if (this.f111950m == null) {
            synchronized (C43240l.class) {
                if (this.f111950m == null) {
                    this.f111950m = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18994a("signal_service").mo18996a());
                }
            }
        }
        C1592h.m7855a((Callable<TResult>) new C43243c<TResult>(this, signalStrength), (Executor) this.f111950m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x019c A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104986b(android.telephony.SignalStrength r12) {
        /*
            r11 = this;
            java.lang.String r0 = "signalStrength"
            kotlin.jvm.internal.C7573i.m23587b(r12, r0)
            com.ss.android.ugc.aweme.player.b.a r0 = r11.f111942c
            if (r0 != 0) goto L_0x0010
            com.ss.android.ugc.aweme.player.b.a r0 = new com.ss.android.ugc.aweme.player.b.a
            r0.<init>()
            r11.f111942c = r0
        L_0x0010:
            android.content.Context r0 = r11.f111940a
            int r0 = com.p280ss.android.ugc.aweme.utils.C43053de.m136591c(r0)
            java.lang.reflect.Method r1 = r11.f111946i
            if (r1 != 0) goto L_0x001d
            r11.m137187c()
        L_0x001d:
            java.lang.reflect.Method r1 = r11.f111946i
            r2 = -1
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r1 == 0) goto L_0x018b
            r1 = 13
            r4 = 0
            r5 = 0
            if (r0 == r1) goto L_0x0052
            r1 = 19
            if (r0 == r1) goto L_0x0052
            r1 = 139(0x8b, float:1.95E-43)
            if (r0 != r1) goto L_0x0034
            goto L_0x0052
        L_0x0034:
            java.lang.reflect.Method r0 = r11.f111946i     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0182 }
            java.lang.Object r0 = r0.invoke(r12, r1)     // Catch:{ Exception -> 0x0182 }
            goto L_0x0040
        L_0x003f:
            r0 = r4
        L_0x0040:
            if (r0 == 0) goto L_0x004a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0182 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0182 }
            goto L_0x010a
        L_0x004a:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            r12.<init>(r0)     // Catch:{ Exception -> 0x0182 }
            throw r12     // Catch:{ Exception -> 0x0182 }
        L_0x0052:
            java.lang.reflect.Method r0 = r11.f111947j     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x0073
            java.lang.reflect.Method r0 = r11.f111947j     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x0061
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0182 }
            java.lang.Object r0 = r0.invoke(r12, r1)     // Catch:{ Exception -> 0x0182 }
            goto L_0x0062
        L_0x0061:
            r0 = r4
        L_0x0062:
            if (r0 == 0) goto L_0x006b
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0182 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0182 }
            goto L_0x0076
        L_0x006b:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            r12.<init>(r0)     // Catch:{ Exception -> 0x0182 }
            throw r12     // Catch:{ Exception -> 0x0182 }
        L_0x0073:
            r0 = 65535(0xffff, float:9.1834E-41)
        L_0x0076:
            java.lang.reflect.Method r1 = r11.f111948k     // Catch:{ Exception -> 0x0181 }
            if (r1 == 0) goto L_0x0097
            java.lang.reflect.Method r1 = r11.f111948k     // Catch:{ Exception -> 0x0181 }
            if (r1 == 0) goto L_0x0085
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0181 }
            java.lang.Object r1 = r1.invoke(r12, r6)     // Catch:{ Exception -> 0x0181 }
            goto L_0x0086
        L_0x0085:
            r1 = r4
        L_0x0086:
            if (r1 == 0) goto L_0x008f
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0181 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0181 }
            goto L_0x009a
        L_0x008f:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x0181 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r12.<init>(r1)     // Catch:{ Exception -> 0x0181 }
            throw r12     // Catch:{ Exception -> 0x0181 }
        L_0x0097:
            r1 = 65535(0xffff, float:9.1834E-41)
        L_0x009a:
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Exception -> 0x017e }
            if (r6 == 0) goto L_0x00ef
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Exception -> 0x017e }
            java.lang.String r7 = "Build.BRAND"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)     // Catch:{ Exception -> 0x017e }
            if (r6 == 0) goto L_0x00e7
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ Exception -> 0x017e }
            java.lang.String r7 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)     // Catch:{ Exception -> 0x017e }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x017e }
            java.lang.String r7 = "huawei"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x017e }
            r8 = 2
            boolean r6 = kotlin.text.C7634n.m23776c(r6, r7, false)     // Catch:{ Exception -> 0x017e }
            if (r6 != 0) goto L_0x00ef
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Exception -> 0x017e }
            java.lang.String r7 = "Build.BRAND"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)     // Catch:{ Exception -> 0x017e }
            if (r6 == 0) goto L_0x00df
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ Exception -> 0x017e }
            java.lang.String r7 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)     // Catch:{ Exception -> 0x017e }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x017e }
            java.lang.String r7 = "honor"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x017e }
            boolean r6 = kotlin.text.C7634n.m23776c(r6, r7, false)     // Catch:{ Exception -> 0x017e }
            if (r6 != 0) goto L_0x00ef
            int r6 = r1 / 10
            r1 = r6
            goto L_0x00ef
        L_0x00df:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r3)     // Catch:{ Exception -> 0x017e }
            throw r12     // Catch:{ Exception -> 0x017e }
        L_0x00e7:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r3)     // Catch:{ Exception -> 0x017e }
            throw r12     // Catch:{ Exception -> 0x017e }
        L_0x00ef:
            r6 = -20
            r7 = 50
            if (r1 > r7) goto L_0x00fa
            if (r1 >= r6) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r3 = r1
            goto L_0x010a
        L_0x00fa:
            int r8 = r1 / 10
            r9 = 1
            if (r6 > r8) goto L_0x0105
            int r6 = r1 / 10
            if (r6 > r7) goto L_0x0105
            r6 = 1
            goto L_0x0106
        L_0x0105:
            r6 = 0
        L_0x0106:
            if (r6 != r9) goto L_0x010a
            int r3 = r1 / 10
        L_0x010a:
            r1 = -120(0xffffffffffffff88, float:NaN)
            if (r0 < r1) goto L_0x0115
            r1 = -44
            if (r0 <= r1) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r12 = r0
            goto L_0x0127
        L_0x0115:
            java.lang.reflect.Method r1 = r11.f111946i     // Catch:{ Exception -> 0x017a }
            if (r1 == 0) goto L_0x011f
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x017a }
            java.lang.Object r4 = r1.invoke(r12, r4)     // Catch:{ Exception -> 0x017a }
        L_0x011f:
            if (r4 == 0) goto L_0x0172
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x017a }
            int r12 = r4.intValue()     // Catch:{ Exception -> 0x017a }
        L_0x0127:
            android.content.Context r0 = r11.f111940a     // Catch:{ Exception -> 0x016f }
            if (r0 != 0) goto L_0x012e
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x016f }
        L_0x012e:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = android.support.p022v4.app.ActivityCompat.m2909b(r0, r1)     // Catch:{ Exception -> 0x016f }
            if (r0 != 0) goto L_0x018e
            android.content.Context r0 = r11.f111940a     // Catch:{ Exception -> 0x016f }
            java.util.Map r0 = com.p280ss.android.ugc.aweme.utils.C43053de.m136593d(r0)     // Catch:{ Exception -> 0x016f }
            java.lang.String r1 = "cellId"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x016f }
            if (r1 == 0) goto L_0x0167
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x016f }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x016f }
            java.lang.String r4 = "lac"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x015a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0162 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0162 }
            r2 = r1
            goto L_0x018f
        L_0x015a:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x0162 }
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r4)     // Catch:{ Exception -> 0x0162 }
            throw r0     // Catch:{ Exception -> 0x0162 }
        L_0x0162:
            r10 = r3
            r3 = r12
            r12 = r1
            r1 = r10
            goto L_0x0186
        L_0x0167:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x016f }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)     // Catch:{ Exception -> 0x016f }
            throw r0     // Catch:{ Exception -> 0x016f }
        L_0x016f:
            r1 = r3
            r3 = r12
            goto L_0x017f
        L_0x0172:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x017a }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r12.<init>(r1)     // Catch:{ Exception -> 0x017a }
            throw r12     // Catch:{ Exception -> 0x017a }
        L_0x017a:
            r1 = r3
            r12 = -1
            r3 = r0
            goto L_0x0186
        L_0x017e:
            r3 = r0
        L_0x017f:
            r12 = -1
            goto L_0x0186
        L_0x0181:
            r3 = r0
        L_0x0182:
            r12 = -1
            r1 = 65535(0xffff, float:9.1834E-41)
        L_0x0186:
            r2 = r12
            r12 = r3
            r0 = -1
            r3 = r1
            goto L_0x018f
        L_0x018b:
            r12 = 65535(0xffff, float:9.1834E-41)
        L_0x018e:
            r0 = -1
        L_0x018f:
            com.ss.android.ugc.aweme.player.b.a r1 = r11.f111942c
            if (r1 == 0) goto L_0x019c
            r1.f91247b = r12
            r1.f91248c = r3
            r1.f91246a = r2
            r1.f91249d = r0
            return
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.video.C43240l.mo104986b(android.telephony.SignalStrength):void");
    }

    public /* synthetic */ C43240l(Context context, C7571f fVar) {
        this(context);
    }
}

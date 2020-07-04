package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15326i;
import com.google.android.gms.common.util.C15333p;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.xi */
public final class C16165xi {

    /* renamed from: A */
    private int f45368A;

    /* renamed from: B */
    private String f45369B;

    /* renamed from: C */
    private boolean f45370C;

    /* renamed from: a */
    private int f45371a;

    /* renamed from: b */
    private boolean f45372b;

    /* renamed from: c */
    private boolean f45373c;

    /* renamed from: d */
    private int f45374d;

    /* renamed from: e */
    private int f45375e;

    /* renamed from: f */
    private int f45376f;

    /* renamed from: g */
    private String f45377g;

    /* renamed from: h */
    private int f45378h;

    /* renamed from: i */
    private int f45379i;

    /* renamed from: j */
    private int f45380j;

    /* renamed from: k */
    private boolean f45381k;

    /* renamed from: l */
    private int f45382l;

    /* renamed from: m */
    private double f45383m;

    /* renamed from: n */
    private boolean f45384n;

    /* renamed from: o */
    private String f45385o;

    /* renamed from: p */
    private String f45386p;

    /* renamed from: q */
    private boolean f45387q;

    /* renamed from: r */
    private boolean f45388r;

    /* renamed from: s */
    private String f45389s;

    /* renamed from: t */
    private boolean f45390t;

    /* renamed from: u */
    private final boolean f45391u;

    /* renamed from: v */
    private boolean f45392v;

    /* renamed from: w */
    private String f45393w;

    /* renamed from: x */
    private String f45394x;

    /* renamed from: y */
    private float f45395y;

    /* renamed from: z */
    private int f45396z;

    public C16165xi(Context context) {
        PackageManager packageManager = context.getPackageManager();
        m52376a(context);
        m52377b(context);
        m52378c(context);
        Locale locale = Locale.getDefault();
        boolean z = false;
        this.f45387q = m52374a(packageManager, "geo:0,0?q=donuts") != null;
        if (m52374a(packageManager, "http://www.google.com") != null) {
            z = true;
        }
        this.f45388r = z;
        this.f45389s = locale.getCountry();
        this.f45390t = afb.m45730a();
        this.f45391u = C15326i.m44582d(context);
        this.f45392v = C15326i.m44581c(context);
        this.f45393w = locale.getLanguage();
        this.f45394x = m52375a(context, packageManager);
        this.f45369B = m52379d(context);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.f45395y = displayMetrics.density;
                this.f45396z = displayMetrics.widthPixels;
                this.f45368A = displayMetrics.heightPixels;
            }
        }
    }

    public C16165xi(Context context, C16164xh xhVar) {
        m52376a(context);
        m52377b(context);
        m52378c(context);
        this.f45385o = Build.FINGERPRINT;
        this.f45386p = Build.DEVICE;
        this.f45370C = C15333p.m44594a() && C15610cu.m50382a(context);
        this.f45387q = xhVar.f45343b;
        this.f45388r = xhVar.f45344c;
        this.f45389s = xhVar.f45346e;
        this.f45390t = xhVar.f45347f;
        this.f45391u = xhVar.f45348g;
        this.f45392v = xhVar.f45349h;
        this.f45393w = xhVar.f45352k;
        this.f45394x = xhVar.f45353l;
        this.f45369B = xhVar.f45354m;
        this.f45395y = xhVar.f45361t;
        this.f45396z = xhVar.f45362u;
        this.f45368A = xhVar.f45363v;
    }

    /* renamed from: a */
    private final void m52376a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f45371a = audioManager.getMode();
                this.f45372b = audioManager.isMusicActive();
                this.f45373c = audioManager.isSpeakerphoneOn();
                this.f45374d = audioManager.getStreamVolume(3);
                this.f45375e = audioManager.getRingerMode();
                this.f45376f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C14793ay.m42898d().mo39089a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f45371a = -2;
        this.f45372b = false;
        this.f45373c = false;
        this.f45374d = 0;
        this.f45375e = 2;
        this.f45376f = 0;
    }

    /* renamed from: b */
    private final void m52377b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f45377g = telephonyManager.getNetworkOperator();
        this.f45379i = telephonyManager.getNetworkType();
        this.f45380j = telephonyManager.getPhoneType();
        this.f45378h = -2;
        this.f45381k = false;
        this.f45382l = -1;
        if (acl.m45535a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f45378h = activeNetworkInfo.getType();
                this.f45382l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f45378h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.f45381k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: c */
    private final void m52378c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f45383m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f45384n = z;
            return;
        }
        this.f45383m = -1.0d;
        this.f45384n = false;
    }

    /* renamed from: d */
    private static String m52379d(Context context) {
        try {
            PackageInfo b = C15176d.m44159a(context).mo38467b("com.android.vending", PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (b == null) {
                return null;
            }
            int i = b.versionCode;
            String str = b.packageName;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(i);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str);
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m52375a(Context context, PackageManager packageManager) {
        ResolveInfo a = m52374a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null) {
            return null;
        }
        ActivityInfo activityInfo = a.activityInfo;
        if (activityInfo == null) {
            return null;
        }
        try {
            PackageInfo b = C15176d.m44159a(context).mo38467b(activityInfo.packageName, 0);
            if (b == null) {
                return null;
            }
            int i = b.versionCode;
            String str = activityInfo.packageName;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(i);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str);
            return sb.toString();
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static ResolveInfo m52374a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C14793ay.m42898d().mo39089a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: a */
    public final C16164xh mo42063a() {
        C16164xh xhVar = new C16164xh(this.f45371a, this.f45387q, this.f45388r, this.f45377g, this.f45389s, this.f45390t, this.f45391u, this.f45392v, this.f45372b, this.f45373c, this.f45393w, this.f45394x, this.f45369B, this.f45374d, this.f45378h, this.f45379i, this.f45380j, this.f45375e, this.f45376f, this.f45395y, this.f45396z, this.f45368A, this.f45383m, this.f45384n, this.f45381k, this.f45382l, this.f45385o, this.f45370C, this.f45386p);
        return xhVar;
    }
}

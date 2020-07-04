package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.ads.C14739c;
import com.google.android.gms.ads.C14746f;
import com.google.android.gms.ads.C14767i;
import com.google.android.gms.ads.p741a.C14729d;
import com.google.android.gms.ads.p741a.C14730e;
import com.google.android.gms.ads.p743c.C14742b;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.util.C15333p;
import com.taobao.android.dexposed.ClassUtils;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@C6505uv
public final class afb {

    /* renamed from: a */
    public static final Handler f40136a = new apn(Looper.getMainLooper());

    /* renamed from: b */
    private static final String f40137b = C14746f.class.getName();

    /* renamed from: c */
    private static final String f40138c = C14767i.class.getName();

    /* renamed from: d */
    private static final String f40139d = C14729d.class.getName();

    /* renamed from: e */
    private static final String f40140e = C14730e.class.getName();

    /* renamed from: f */
    private static final String f40141f = C14742b.class.getName();

    /* renamed from: g */
    private static final String f40142g = C14739c.class.getName();

    /* renamed from: a */
    public static void m45729a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            afc.m45745a(httpURLConnection, "User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static int m45721a(Context context, int i) {
        return m45722a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m45722a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: b */
    public static int m45731b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m45732b(displayMetrics, i);
    }

    /* renamed from: b */
    public static int m45732b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    public final void mo39275a(ViewGroup viewGroup, zzyz zzyz, String str, String str2) {
        afm.m45783e(str2);
        m45728a(viewGroup, zzyz, str, -65536, -16777216);
    }

    /* renamed from: a */
    public final void mo39274a(ViewGroup viewGroup, zzyz zzyz, String str) {
        m45728a(viewGroup, zzyz, str, -16777216, -1);
    }

    /* renamed from: a */
    private static void m45728a(ViewGroup viewGroup, zzyz zzyz, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m45721a(context, 3);
            frameLayout.addView(textView, new LayoutParams(zzyz.f45803f - a, zzyz.f45800c - a, 17));
            viewGroup.addView(frameLayout, zzyz.f45803f, zzyz.f45800c);
        }
    }

    /* renamed from: a */
    public static String m45723a(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Secure.getString(contentResolver, "android_id");
        }
        if (str == null || m45730a()) {
            str = "emulator";
        }
        return m45724a(str);
    }

    /* renamed from: b */
    public static String m45733b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Secure.getString(contentResolver, "android_id");
    }

    /* renamed from: a */
    public static boolean m45730a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public static boolean m45734b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static String m45724a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return C1642a.m8035a(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m45738c(Context context, int i) {
        return C15167c.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    /* renamed from: c */
    public static boolean m45737c(Context context) {
        int isGooglePlayServicesAvailable = C15167c.getInstance().isGooglePlayServicesAvailable(context, C15181e.f39276b);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    /* renamed from: d */
    public static boolean m45739d(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m45740e(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (C15333p.m44596c()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
                return false;
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (i3 == i2 && i4 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static int m45741f(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static String m45725a(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f40137b.equalsIgnoreCase(className) && !f40138c.equalsIgnoreCase(className) && !f40139d.equalsIgnoreCase(className) && !f40140e.equalsIgnoreCase(className) && !f40141f.equalsIgnoreCase(className) && !f40142g.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ClassUtils.PACKAGE_SEPARATOR);
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo39273a(Context context, String str, String str2, Bundle bundle, boolean z) {
        m45727a(context, str, str2, bundle, true, new afd(this));
    }

    /* renamed from: a */
    public static void m45727a(Context context, String str, String str2, Bundle bundle, boolean z, aff aff) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                int apkVersion = C15167c.getInstance().getApkVersion(context);
                StringBuilder sb = new StringBuilder(20);
                sb.append(apkVersion);
                sb.append(".15302000");
                str = sb.toString();
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme(WebKitApi.SCHEME_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        aff.mo39188a(appendQueryParameter.toString());
    }

    /* renamed from: c */
    public static String m45736c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: a */
    public static Throwable m45726a(Throwable th) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f44017g)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m45735b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: b */
    public static boolean m45735b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) bym.m50299d().mo41272a(C15585bw.f44018h))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(C6505uv.class);
        } catch (Exception e) {
            String str2 = "Fail to check class type for class ";
            String valueOf = String.valueOf(str);
            afm.m45775a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return false;
        }
    }
}

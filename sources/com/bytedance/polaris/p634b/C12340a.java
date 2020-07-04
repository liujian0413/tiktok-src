package com.bytedance.polaris.p634b;

import android.content.Context;
import android.os.Environment;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.util.C6776h;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;

/* renamed from: com.bytedance.polaris.b.a */
public final class C12340a {

    /* renamed from: a */
    public static String f32753a = "/funnygallery";

    /* renamed from: b */
    protected final String f32754b;

    /* renamed from: c */
    protected final String f32755c;

    /* renamed from: d */
    protected final String f32756d;

    /* renamed from: e */
    protected final String f32757e;

    /* renamed from: f */
    protected final String f32758f;

    /* renamed from: g */
    protected final int f32759g;

    /* renamed from: h */
    protected final int f32760h;

    /* renamed from: i */
    protected final Context f32761i;

    /* renamed from: j */
    protected String f32762j;

    /* renamed from: k */
    protected String f32763k;

    /* renamed from: l */
    private final String f32764l;

    /* renamed from: a */
    public static boolean m35834a() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public C12340a(Context context) {
        this(context, 5);
    }

    /* renamed from: b */
    public static String m35835b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo30184c(String str) {
        StringBuilder sb = new StringBuilder(this.f32756d);
        sb.append(m35836d(str));
        sb.append("/");
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* renamed from: d */
    private static String m35836d(String str) {
        if (str == null || str.length() < 2) {
            return "__";
        }
        String substring = str.substring(0, 2);
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        if (!Character.isLetterOrDigit(charAt) || !Character.isLetterOrDigit(charAt2)) {
            return "__";
        }
        return substring;
    }

    /* renamed from: a */
    public final String mo30182a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32756d);
        sb.append(m35836d(str));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m35833a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo30183b(String str, String str2) {
        StringBuilder sb = new StringBuilder(this.f32756d);
        sb.append(m35836d(str));
        sb.append("/");
        sb.append(str);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    private C12340a(Context context, int i) {
        this.f32759g = 5;
        this.f32760h = 1;
        this.f32761i = context.getApplicationContext();
        this.f32754b = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(this.f32754b);
        sb.append("/cache/");
        this.f32755c = sb.toString();
        try {
            this.f32762j = C6776h.m20956f(context);
        } catch (Exception unused) {
            this.f32762j = null;
        }
        if (!C6319n.m19593a(this.f32762j)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f32762j);
            sb2.append("/hashedimages/");
            this.f32763k = sb2.toString();
        } else {
            this.f32763k = null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f32755c);
        sb3.append("hashedimages/");
        this.f32756d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f32755c);
        sb4.append("tmpimages/");
        this.f32757e = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(Environment.getExternalStorageDirectory().getPath());
        sb5.append("/Android/data/com.ss.spipe/cache/avatar");
        this.f32764l = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Environment.getExternalStorageDirectory().getPath());
        sb6.append(f32753a);
        this.f32758f = sb6.toString();
        if (m35834a()) {
            File file = new File(this.f32755c);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(this.f32756d);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(this.f32757e);
            if (!file3.exists()) {
                file3.mkdirs();
            }
        }
        try {
            if (!C6319n.m19593a(this.f32763k)) {
                File file4 = new File(this.f32763k);
                if (!file4.exists()) {
                    file4.mkdirs();
                }
            }
        } catch (Exception unused2) {
        }
    }
}

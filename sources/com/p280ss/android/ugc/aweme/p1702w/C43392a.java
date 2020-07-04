package com.p280ss.android.ugc.aweme.p1702w;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.w.a */
public final class C43392a {

    /* renamed from: a */
    private static boolean f112393a;

    /* renamed from: b */
    private static Boolean f112394b;

    /* renamed from: a */
    public static String m137709a() {
        if (C6399b.m19946v()) {
            return "tt_muse";
        }
        if (C6399b.m19947w()) {
            return "tt_tiktok";
        }
        return "tt_douyin";
    }

    /* renamed from: b */
    private static boolean m137712b() {
        String q = C6399b.m19941q();
        if (TextUtils.equals(q, "local_test") || TextUtils.equals(q, "daily_monkey_test")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m137710a(final Context context) {
        if (!f112393a) {
            f112393a = true;
            if (f112394b == null) {
                if (!m137712b()) {
                    f112394b = Boolean.FALSE;
                } else {
                    try {
                        Class.forName("com.bytedance.test.codecoverage.codeCoverage");
                        f112394b = Boolean.TRUE;
                    } catch (Throwable unused) {
                        f112394b = Boolean.FALSE;
                    }
                }
            }
            if (f112394b.booleanValue()) {
                new Thread("upload_coverage_data") {
                    public final void run() {
                        try {
                            File c = C43392a.m137713c(context);
                            if (c != null) {
                                String a = C43392a.m137709a();
                                String valueOf = String.valueOf(C6399b.m19933i());
                                String l = C6399b.m19936l();
                                String trim = C6399b.m19937m().trim();
                                if (trim.length() > 7) {
                                    trim = trim.substring(0, 7);
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(AppLog.getServerDeviceId());
                                String sb2 = sb.toString();
                                if (l.equals("")) {
                                    l = "test_branch";
                                }
                                Class cls = Class.forName("com.bytedance.test.codecoverage.codeCoverage");
                                Object newInstance = cls.newInstance();
                                Method method = cls.getMethod("covDataUpload", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class});
                                while (true) {
                                    if (TextUtils.isEmpty(sb2)) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(AppLog.getServerDeviceId());
                                        sb2 = sb3.toString();
                                    }
                                    method.invoke(newInstance, new Object[]{c.getAbsolutePath(), a, valueOf, l, trim, sb2});
                                    try {
                                        sleep(60000);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                }.start();
            }
        }
    }

    /* renamed from: b */
    public static void m137711b(final Context context) {
        if (f112394b == null) {
            if (!m137712b()) {
                f112394b = Boolean.FALSE;
            } else {
                try {
                    Class.forName("com.bytedance.test.codecoverage.codeCoverage");
                    f112394b = Boolean.TRUE;
                } catch (Throwable unused) {
                    f112394b = Boolean.FALSE;
                }
            }
        }
        if (f112394b.booleanValue()) {
            new Thread("upload_coverage_data") {
                public final void run() {
                    try {
                        File c = C43392a.m137713c(context);
                        if (c != null) {
                            String a = C43392a.m137709a();
                            String valueOf = String.valueOf(C6399b.m19933i());
                            String l = C6399b.m19936l();
                            String trim = C6399b.m19937m().trim();
                            if (trim.length() > 7) {
                                trim = trim.substring(0, 7);
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(AppLog.getServerDeviceId());
                            String sb2 = sb.toString();
                            if (l.equals("")) {
                                l = "test_branch";
                            }
                            Class cls = Class.forName("com.bytedance.test.codecoverage.codeCoverage");
                            Object newInstance = cls.newInstance();
                            Method method = cls.getMethod("covDataUpload", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class});
                            if (TextUtils.isEmpty(sb2)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(AppLog.getServerDeviceId());
                                sb2 = sb3.toString();
                            }
                            method.invoke(newInstance, new Object[]{c.getAbsolutePath(), a, valueOf, l, trim, sb2});
                        }
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }.start();
        }
    }

    /* renamed from: c */
    public static File m137713c(Context context) {
        File b = C7276d.m22809b(context);
        if (!C7276d.m22826g()) {
            b = context.getCacheDir();
        }
        if (b == null) {
            return null;
        }
        File file = new File(b, "jacoco");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.support.p022v4.util.C0904k;
import android.text.TextUtils;
import com.C1642a;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15326i;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.google.android.gms.common.internal.f */
public final class C15247f {

    /* renamed from: a */
    private static final C0904k<String, String> f39438a = new C0904k<>();

    /* renamed from: a */
    public static String m44335a(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 20) {
            return m44336a(context, "common_google_play_services_restricted_profile_title");
        }
        switch (i) {
            case 1:
                return resources.getString(R.string.aa2);
            case 2:
                return resources.getString(R.string.aa9);
            case 3:
                return resources.getString(R.string.a_z);
            case 4:
            case 6:
                break;
            case 5:
                return m44336a(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m44336a(context, "common_google_play_services_network_error_title");
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            default:
                switch (i) {
                    case 16:
                        return null;
                    case 17:
                        return m44336a(context, "common_google_play_services_sign_in_failed_title");
                    case 18:
                        break;
                    default:
                        return null;
                }
        }
        return null;
    }

    /* renamed from: b */
    public static String m44339b(Context context, int i) {
        String str;
        if (i == 6) {
            str = m44336a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m44335a(context, i);
        }
        return str == null ? context.getResources().getString(R.string.aa4) : str;
    }

    /* renamed from: c */
    public static String m44340c(Context context, int i) {
        Resources resources = context.getResources();
        String b = m44338b(context);
        if (i == 5) {
            return m44337a(context, "common_google_play_services_invalid_account_text", b);
        }
        if (i == 7) {
            return m44337a(context, "common_google_play_services_network_error_text", b);
        }
        if (i == 9) {
            return resources.getString(R.string.aa6, new Object[]{b});
        } else if (i == 20) {
            return m44337a(context, "common_google_play_services_restricted_profile_text", b);
        } else {
            switch (i) {
                case 1:
                    return resources.getString(R.string.aa1, new Object[]{b});
                case 2:
                    if (C15326i.m44580b(context)) {
                        return resources.getString(R.string.aaa);
                    }
                    return resources.getString(R.string.aa8, new Object[]{b});
                case 3:
                    return resources.getString(R.string.a_y, new Object[]{b});
                default:
                    switch (i) {
                        case 16:
                            return m44337a(context, "common_google_play_services_api_unavailable_text", b);
                        case 17:
                            return m44337a(context, "common_google_play_services_sign_in_failed_text", b);
                        case 18:
                            return resources.getString(R.string.aa_, new Object[]{b});
                        default:
                            return resources.getString(R.string.aa5, new Object[]{b});
                    }
            }
        }
    }

    /* renamed from: d */
    public static String m44341d(Context context, int i) {
        if (i == 6) {
            return m44337a(context, "common_google_play_services_resolution_required_text", m44338b(context));
        }
        return m44340c(context, i);
    }

    /* renamed from: e */
    public static String m44342e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.aa0);
            case 2:
                return resources.getString(R.string.aa7);
            case 3:
                return resources.getString(R.string.a_x);
            default:
                return resources.getString(17039370);
        }
    }

    /* renamed from: b */
    private static String m44338b(Context context) {
        String packageName = context.getPackageName();
        try {
            return C15176d.m44159a(context).mo38468b(packageName).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    private static String m44337a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m44336a(context, str);
        if (a == null) {
            a = resources.getString(R.string.aa5);
        }
        return C1642a.m8035a(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m44336a(android.content.Context r4, java.lang.String r5) {
        /*
            android.support.v4.util.k<java.lang.String, java.lang.String> r0 = f39438a
            monitor-enter(r0)
            android.support.v4.util.k<java.lang.String, java.lang.String> r1 = f39438a     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x000f:
            android.content.res.Resources r4 = com.google.android.gms.common.C15172d.m44146a(r4)     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r4 != 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0018:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x0039
            java.lang.String r4 = "Missing resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0032
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x0032:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0039:
            java.lang.String r4 = r4.getString(r2)     // Catch:{ all -> 0x0061 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005a
            java.lang.String r4 = "Got empty resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0053
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0058
        L_0x0053:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x005a:
            android.support.v4.util.k<java.lang.String, java.lang.String> r1 = f39438a     // Catch:{ all -> 0x0061 }
            r1.put(r5, r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r4
        L_0x0061:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C15247f.m44336a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m44334a(Context context) {
        return context.getResources().getString(R.string.aa3);
    }
}

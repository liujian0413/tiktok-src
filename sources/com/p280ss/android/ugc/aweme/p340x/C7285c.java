package com.p280ss.android.ugc.aweme.p340x;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.bytedance.keva.adapter.KevaSpFastAdapter;
import com.p280ss.android.ugc.aweme.global.config.settings.C6925d;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p339sp.C7240g;
import com.p280ss.android.ugc.aweme.p339sp.SharedPreferencesManager;
import com.twitter.sdk.android.core.C7312p;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.x.c */
public final class C7285c {

    /* renamed from: a */
    private static boolean f20362a;

    /* renamed from: b */
    private static int f20363b;

    /* renamed from: c */
    private static HashSet<String> f20364c = new HashSet<>();

    /* renamed from: d */
    private static final String[] f20365d;

    /* renamed from: e */
    private static HashSet<String> f20366e = new HashSet<>();

    /* renamed from: f */
    private static final String[] f20367f = {"Agoo_AppStore", "ACCS_SDK", "mipush_extra", "mipush", "umeng_general_config", "is_allow_oppo_push", "push_multi_process_config", "traffic_monitor_info", "applog_stats", "umeng_general_config", "wschannel_multi_process_config", "rec_user", "ab_test_mock_config", "ACCS_COOKIE", "ACCS_LOAD_SO", "ACCS_SDK_CHANNEL", "anr_monitor_table", "app_setting", "aweme-abtest-hooker", "gaid_sp_name", "google_ads_flags", "image_opt_table", "KEY_NEED_UPLOAD_LAUNCHLOG", "mipush_account", "mipush_app_info", "plugin_meta_data", "pref_registered_pkg_names", "push_setting", "ss_app_config", "ss_location", "test_setting", "update_params", "use_https", "XMPushServiceConfig", "MiniAppCookiePersistence", "tma_jssdk_info", "mini_app_storage", "appbrand_file", "mipush_oc", "push_switch", "sync", "httpdns_config_cache", "sp_client_report_status", "effect_setting", "d_permit", "pushservice_umeng_common_config", "umeng_message_state", "Alvin2", "ContextData", "pushConfig", "MainTabPreferences"};

    /* renamed from: g */
    private static List<Class> f20368g = Arrays.asList(m22847b());

    /* renamed from: h */
    private static File f20369h;

    /* renamed from: i */
    private static HashMap<String, Boolean> f20370i = new HashMap<>();

    /* renamed from: a */
    public static C6925d m22839a() {
        return C7286d.f20371a;
    }

    /* renamed from: b */
    private static Class[] m22847b() {
        Class[] clsArr = new Class[2];
        clsArr[0] = C7312p.class;
        clsArr[0] = C7240g.class;
        return clsArr;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C6399b.m19921a().getPackageName());
        sb.append("_preferences");
        f20365d = new String[]{"default_config", "awesome_splash", "splash_ad_sp", "sp_symphony", "ttnetCookieStore", "key_language_sp_key", "applog_stats", "aweme-app", "av_settings.xml", "ab_test_config", "aweme_user", "com.ss.spipe_setting", "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", "CLIENT_EXPERIMENT_CACHE_TAG", sb.toString(), "rhea.sp"};
    }

    /* renamed from: a */
    private static boolean m22843a(String str) {
        if ((str.length() & 7) <= f20363b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static void m22840a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("keva_switch_repo", 0);
        f20362a = sharedPreferences.getBoolean("keva_switch", true);
        f20364c.addAll(Arrays.asList(f20365d));
        f20364c.addAll(sharedPreferences.getStringSet("keva_blacklist", Collections.emptySet()));
        f20366e.addAll(Arrays.asList(f20367f));
        if (!f20362a) {
            m22845b(context);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m22841a(IESSettingsProxy iESSettingsProxy) {
        boolean z = false;
        Editor edit = C6399b.m19921a().getSharedPreferences("keva_switch_repo", 0).edit();
        String str = "keva_switch";
        if (iESSettingsProxy.getKevaSwitch().intValue() == 1) {
            z = true;
        }
        edit.putBoolean(str, z).putStringSet("keva_blacklist", new HashSet(iESSettingsProxy.getKevaBlacklist())).apply();
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r7v4, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v10, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v13, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1
      assigns: []
      uses: []
      mth insns count: 74
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0079 A[SYNTHETIC, Splitter:B:48:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0080 A[SYNTHETIC, Splitter:B:52:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x008b A[SYNTHETIC, Splitter:B:61:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0092 A[SYNTHETIC, Splitter:B:65:0x0092] */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m22845b(android.content.Context r7) {
        /*
            java.io.File r0 = r7.getFilesDir()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x000d
            r0.mkdirs()
        L_0x000d:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r7.getFilesDir()
            java.lang.String r2 = "keva_port_batch_master"
            r0.<init>(r1, r2)
            r1 = 0
            r2 = 0
            boolean r3 = r0.exists()     // Catch:{ IOException -> 0x0073, all -> 0x0070 }
            if (r3 == 0) goto L_0x003e
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0073, all -> 0x0070 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0073, all -> 0x0070 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0073, all -> 0x0070 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0073, all -> 0x0070 }
            int r3 = r1.readInt()     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r3 >> 2
            f20363b = r4     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r6 = r3
            r3 = r1
            r1 = r6
            goto L_0x003f
        L_0x0038:
            r7 = move-exception
            r3 = r1
            goto L_0x0089
        L_0x003b:
            r7 = r2
            r2 = r1
            goto L_0x0074
        L_0x003e:
            r3 = r2
        L_0x003f:
            int r4 = f20363b     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            r5 = 8
            if (r4 >= r5) goto L_0x005d
            boolean r7 = com.p280ss.android.common.util.C6776h.m20947b(r7)     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            if (r7 == 0) goto L_0x005d
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            r4.<init>(r0)     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            r7.<init>(r4)     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            int r1 = r1 + 1
            r7.writeInt(r1)     // Catch:{ IOException -> 0x006e, all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            goto L_0x0087
        L_0x005d:
            r7 = r2
        L_0x005e:
            if (r3 == 0) goto L_0x0065
            r3.close()     // Catch:{ Throwable -> 0x0064 }
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            if (r7 == 0) goto L_0x0084
            r7.close()     // Catch:{ Throwable -> 0x006a }
        L_0x006a:
            return
        L_0x006b:
            r7 = move-exception
            goto L_0x0089
        L_0x006d:
            r7 = r2
        L_0x006e:
            r2 = r3
            goto L_0x0074
        L_0x0070:
            r7 = move-exception
            r3 = r2
            goto L_0x0089
        L_0x0073:
            r7 = r2
        L_0x0074:
            r0.delete()     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ Throwable -> 0x007d }
            goto L_0x007e
        L_0x007d:
        L_0x007e:
            if (r7 == 0) goto L_0x0084
            r7.close()     // Catch:{ Throwable -> 0x0083 }
        L_0x0083:
            return
        L_0x0084:
            return
        L_0x0085:
            r0 = move-exception
            r3 = r2
        L_0x0087:
            r2 = r7
            r7 = r0
        L_0x0089:
            if (r3 == 0) goto L_0x0090
            r3.close()     // Catch:{ Throwable -> 0x008f }
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            if (r2 == 0) goto L_0x0095
            r2.close()     // Catch:{ Throwable -> 0x0095 }
        L_0x0095:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p340x.C7285c.m22845b(android.content.Context):void");
    }

    /* renamed from: c */
    private static SharedPreferences m22848c(Context context, String str) {
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = SharedPreferencesManager.getInstance().getSharedPreferences(context, str);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m22846b(Context context, String str) {
        if (!f20362a || f20368g.contains(context.getClass()) || f20364c.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m22842a(Context context, String str) {
        synchronized (f20370i) {
            Boolean bool = (Boolean) f20370i.get(str);
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                return booleanValue;
            }
            if (f20369h == null) {
                File filesDir = context.getFilesDir();
                if (!filesDir.exists()) {
                    filesDir.mkdir();
                }
                f20369h = new File(filesDir.getParent(), "shared_prefs");
            }
            File file = f20369h;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".xml");
            boolean exists = new File(file, sb.toString()).exists();
            f20370i.put(str, Boolean.valueOf(exists));
            return exists;
        }
    }

    /* renamed from: a */
    public static SharedPreferences m22838a(Context context, String str, int i) {
        if (m22846b(context, str)) {
            return m22844b(context, str, i);
        }
        if (!m22843a(str) && !Keva.isRepoPorted(str) && m22842a(context, str)) {
            return m22844b(context, str, i);
        }
        if (i != 4) {
            if (f20366e.contains(str)) {
                i = 4;
            } else {
                File filesDir = context.getFilesDir();
                StringBuilder sb = new StringBuilder("keva/repo/");
                sb.append(str);
                sb.append("/");
                sb.append(str);
                sb.append(".lxi");
                if (new File(filesDir, sb.toString()).exists()) {
                    C7283a.m22837a(str);
                }
            }
        }
        return KevaSpFastAdapter.getSharedPreferences(context, str, i, true);
    }

    /* renamed from: b */
    private static SharedPreferences m22844b(Context context, String str, int i) {
        if (!TextUtils.equals("plugin_meta_data", str) && !TextUtils.equals("bmd_monitor", str) && !TextUtils.equals("multidex.version", str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C6399b.m19921a().getPackageName());
            sb.append("_preferences");
            if (!TextUtils.equals(sb.toString(), str)) {
                SharedPreferences c = m22848c(context, str);
                if (c != null) {
                    return c;
                }
                return context.getSharedPreferences(str, i);
            }
        }
        return context.getSharedPreferences(str, i);
    }
}

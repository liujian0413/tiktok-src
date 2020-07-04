package com.p280ss.android.common.applog;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.C6317k;
import com.bytedance.common.utility.C6317k.C6318a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.core.encrypt.TTEncryptUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.C6730a;
import com.p280ss.android.ugc.aweme.app.p1029d.C22914a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ss.android.common.applog.NetUtil */
public class NetUtil {
    private static volatile String APP_LOG_ENCRYPT_COUNT = "app_log_encrypt_switch_count";
    private static Object mLock = new Object();
    private static IAliYunHandler sAliYunHandler;
    private static C6730a sAppContext;
    public static IAppParam sAppParam;
    private static final ConcurrentHashMap<String, String> sCustomParam = new ConcurrentHashMap<>();
    private static volatile int sEncryptFaildCount;
    private static volatile IExtraParams sExtraparams;
    private static volatile boolean sIsReadConfigFromSP;
    private static volatile boolean sIsWriteConfigSP;

    /* renamed from: com.ss.android.common.applog.NetUtil$IAppParam */
    public interface IAppParam {
        void getSSIDs(Context context, Map<String, String> map);
    }

    /* renamed from: com.ss.android.common.applog.NetUtil$IExtraParams */
    public interface IExtraParams {
        HashMap<String, String> getExtrparams();
    }

    /* renamed from: com.ss.android.common.applog.NetUtil$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_I18nLancet_putCommonParams(Map map, boolean z) {
            if (map != null) {
                NetUtil.putCommonParams$___twin___(map, z);
                if (C6399b.m19946v()) {
                    map.put("version_code", String.valueOf(C22914a.f60646a));
                }
            }
        }
    }

    public static int checkHttpRequestException(Throwable th, String[] strArr) {
        return 1;
    }

    public static void putCommonParams(Map map, boolean z) {
        _lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_putCommonParams(map, z);
    }

    public static String getAliyunUuid() {
        if (sAliYunHandler != null) {
            return sAliYunHandler.getCloudUUID();
        }
        return null;
    }

    public static void setAliYunHanlder(IAliYunHandler iAliYunHandler) {
        sAliYunHandler = iAliYunHandler;
    }

    public static void setAppContext(C6730a aVar) {
        sAppContext = aVar;
    }

    public static void setAppParam(IAppParam iAppParam) {
        sAppParam = iAppParam;
    }

    public static void setEncryptSPName(String str) {
        if (!C6319n.m19593a(str)) {
            APP_LOG_ENCRYPT_COUNT = str;
        }
    }

    public static void setExtraparams(IExtraParams iExtraParams) {
        if (sExtraparams == null && iExtraParams != null) {
            sExtraparams = iExtraParams;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void addFailedCount(android.content.Context r4) {
        /*
            boolean r0 = sIsReadConfigFromSP
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = mLock
            monitor-enter(r0)
            java.lang.String r1 = APP_LOG_ENCRYPT_COUNT     // Catch:{ Throwable -> 0x002c }
            r2 = 0
            android.content.SharedPreferences r4 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r4, r1, r2)     // Catch:{ Throwable -> 0x002c }
            java.lang.String r1 = "app_log_encrypt_faild_count"
            int r1 = r4.getInt(r1, r2)     // Catch:{ Throwable -> 0x002c }
            sEncryptFaildCount = r1     // Catch:{ Throwable -> 0x002c }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Throwable -> 0x002c }
            java.lang.String r1 = "app_log_encrypt_faild_count"
            int r2 = sEncryptFaildCount     // Catch:{ Throwable -> 0x002c }
            r3 = 1
            int r2 = r2 + r3
            r4.putInt(r1, r2)     // Catch:{ Throwable -> 0x002c }
            r4.apply()     // Catch:{ Throwable -> 0x002c }
            sIsReadConfigFromSP = r3     // Catch:{ Throwable -> 0x002c }
            goto L_0x002c
        L_0x002a:
            r4 = move-exception
            goto L_0x002e
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.NetUtil.addFailedCount(android.content.Context):void");
    }

    public static boolean isBadId(String str) {
        if (C6319n.m19593a(str) || str.equalsIgnoreCase("unknown") || str.equalsIgnoreCase("None")) {
            return true;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            } else if (str.charAt(i) != '0') {
                break;
            } else {
                i++;
            }
        }
        return z;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void minusFailedCount(android.content.Context r4) {
        /*
            boolean r0 = sIsWriteConfigSP
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = mLock
            monitor-enter(r0)
            java.lang.String r1 = APP_LOG_ENCRYPT_COUNT     // Catch:{ Throwable -> 0x0030 }
            r2 = 0
            android.content.SharedPreferences r4 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r4, r1, r2)     // Catch:{ Throwable -> 0x0030 }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Throwable -> 0x0030 }
            int r1 = sEncryptFaildCount     // Catch:{ Throwable -> 0x0030 }
            r3 = 2
            if (r1 <= r3) goto L_0x001e
            int r1 = sEncryptFaildCount     // Catch:{ Throwable -> 0x0030 }
            int r1 = r1 - r3
            sEncryptFaildCount = r1     // Catch:{ Throwable -> 0x0030 }
            goto L_0x0020
        L_0x001e:
            sEncryptFaildCount = r2     // Catch:{ Throwable -> 0x0030 }
        L_0x0020:
            java.lang.String r1 = "app_log_encrypt_faild_count"
            int r2 = sEncryptFaildCount     // Catch:{ Throwable -> 0x0030 }
            r4.putInt(r1, r2)     // Catch:{ Throwable -> 0x0030 }
            r4.apply()     // Catch:{ Throwable -> 0x0030 }
            r4 = 1
            sIsWriteConfigSP = r4     // Catch:{ Throwable -> 0x0030 }
            goto L_0x0030
        L_0x002e:
            r4 = move-exception
            goto L_0x0032
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.NetUtil.minusFailedCount(android.content.Context):void");
    }

    public static String addCommonParams(String str, boolean z) {
        C6730a aVar = sAppContext;
        if (C6319n.m19593a(str) || aVar == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        appendCommonParams(sb, z);
        return sb.toString();
    }

    public static void addCustomParams(String str, String str2) {
        if (!C6319n.m19593a(str) && !C6319n.m19593a(str2)) {
            sCustomParam.put(str, str2);
        }
    }

    public static void appendCommonParams(StringBuilder sb, boolean z) {
        if (sAppContext != null && sb != null) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            putCommonParams(linkedHashMap, z);
            ArrayList arrayList = new ArrayList();
            for (Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            sb.append(NetworkUtils.m19541a((List<Pair<String, String>>) arrayList, "UTF-8"));
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01e1 */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e5 A[Catch:{ Throwable -> 0x022c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void putCommonParams$___twin___(java.util.Map<java.lang.String, java.lang.String> r4, boolean r5) {
        /*
            com.ss.android.common.a r0 = sAppContext
            if (r4 == 0) goto L_0x022d
            if (r0 != 0) goto L_0x0008
            goto L_0x022d
        L_0x0008:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.Context r2 = r0.mo16337d()     // Catch:{ Exception -> 0x002d }
            boolean r2 = com.p280ss.android.common.util.C6776h.m20943a(r2)     // Catch:{ Exception -> 0x002d }
            if (r2 == 0) goto L_0x0029
            com.ss.android.common.applog.NetUtil$IAppParam r2 = sAppParam     // Catch:{ Exception -> 0x002d }
            if (r2 == 0) goto L_0x0024
            com.ss.android.common.applog.NetUtil$IAppParam r2 = sAppParam     // Catch:{ Exception -> 0x002d }
            android.content.Context r3 = r0.mo16337d()     // Catch:{ Exception -> 0x002d }
            r2.getSSIDs(r3, r1)     // Catch:{ Exception -> 0x002d }
        L_0x0024:
            boolean r2 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ Exception -> 0x002d }
            goto L_0x0030
        L_0x0029:
            com.p280ss.android.deviceregister.C6789d.m21066a(r1)     // Catch:{ Exception -> 0x002d }
            goto L_0x0030
        L_0x002d:
            com.p280ss.android.deviceregister.C6789d.m21066a(r1)
        L_0x0030:
            java.lang.String r2 = "install_id"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = "iid"
            r4.put(r3, r2)
        L_0x0043:
            java.lang.String r2 = "device_id"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 != 0) goto L_0x0056
            java.lang.String r3 = "device_id"
            r4.put(r3, r2)
        L_0x0056:
            android.content.Context r2 = r0.mo16337d()
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = com.bytedance.common.utility.NetworkUtils.m19552f(r2)
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 != 0) goto L_0x006b
            java.lang.String r3 = "ac"
            r4.put(r3, r2)
        L_0x006b:
            java.lang.String r2 = r0.mo16334a()
            if (r2 == 0) goto L_0x0076
            java.lang.String r3 = "channel"
            r4.put(r3, r2)
        L_0x0076:
            java.lang.String r2 = "aid"
            int r3 = r0.mo16335b()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4.put(r2, r3)
            java.lang.String r2 = r0.mo16343j()
            if (r2 == 0) goto L_0x008e
            java.lang.String r3 = "app_name"
            r4.put(r3, r2)
        L_0x008e:
            java.lang.String r2 = "version_code"
            int r3 = r0.mo16344k()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4.put(r2, r3)
            java.lang.String r2 = "version_name"
            java.lang.String r3 = r0.mo16342i()
            r4.put(r2, r3)
            java.lang.String r2 = "device_platform"
            java.lang.String r3 = "android"
            r4.put(r2, r3)
            java.lang.String r2 = r0.mo16339f()
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 != 0) goto L_0x00ba
            java.lang.String r3 = "ab_version"
            r4.put(r3, r2)
        L_0x00ba:
            r2 = 0
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 != 0) goto L_0x00c6
            java.lang.String r3 = "ab_client"
            r4.put(r3, r2)
        L_0x00c6:
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 != 0) goto L_0x00d1
            java.lang.String r3 = "ab_group"
            r4.put(r3, r2)
        L_0x00d1:
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 != 0) goto L_0x00dc
            java.lang.String r3 = "ab_feature"
            r4.put(r3, r2)
        L_0x00dc:
            if (r5 == 0) goto L_0x00e5
            java.lang.String r5 = "ssmix"
            java.lang.String r2 = "a"
            r4.put(r5, r2)
        L_0x00e5:
            java.lang.String r5 = "device_type"
            java.lang.String r2 = android.os.Build.MODEL
            r4.put(r5, r2)
            java.lang.String r5 = "device_brand"
            java.lang.String r2 = android.os.Build.BRAND
            r4.put(r5, r2)
            java.lang.String r5 = "language"
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getLanguage()
            r4.put(r5, r2)
            java.lang.String r5 = "os_api"
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.put(r5, r2)
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0121 }
            if (r5 == 0) goto L_0x011c
            int r2 = r5.length()     // Catch:{ Exception -> 0x0121 }
            r3 = 10
            if (r2 <= r3) goto L_0x011c
            r2 = 0
            java.lang.String r5 = r5.substring(r2, r3)     // Catch:{ Exception -> 0x0121 }
        L_0x011c:
            java.lang.String r2 = "os_version"
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0121 }
        L_0x0121:
            java.lang.String r5 = r0.mo16341h()
            boolean r2 = isBadId(r5)
            if (r2 != 0) goto L_0x0130
            java.lang.String r2 = "uuid"
            r4.put(r2, r5)
        L_0x0130:
            java.lang.String r5 = "openudid"
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r5)
            if (r1 != 0) goto L_0x0143
            java.lang.String r1 = "openudid"
            r4.put(r1, r5)
        L_0x0143:
            com.ss.android.common.applog.IAliYunHandler r5 = sAliYunHandler
            if (r5 == 0) goto L_0x0158
            com.ss.android.common.applog.IAliYunHandler r5 = sAliYunHandler
            java.lang.String r5 = r5.getCloudUUID()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0158
            java.lang.String r1 = "aliyun_uuid"
            r4.put(r1, r5)
        L_0x0158:
            java.lang.String r5 = "manifest_version_code"
            int r1 = r0.mo16338e()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.put(r5, r1)
            android.content.Context r5 = r0.mo16337d()
            java.lang.String r5 = com.bytedance.common.utility.C9738o.m28715c(r5)
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r5)
            if (r1 != 0) goto L_0x0178
            java.lang.String r1 = "resolution"
            r4.put(r1, r5)
        L_0x0178:
            android.content.Context r5 = r0.mo16337d()
            int r5 = com.bytedance.common.utility.C9738o.m28716d(r5)
            if (r5 <= 0) goto L_0x018b
            java.lang.String r1 = "dpi"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.put(r1, r5)
        L_0x018b:
            java.lang.String r5 = "update_version_code"
            int r0 = r0.mo16340g()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r5, r0)
            java.lang.String r5 = "_rticket"
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r5, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r5 = sCustomParam     // Catch:{ Exception -> 0x01e1 }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x01e1 }
            if (r5 != 0) goto L_0x01e1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r5 = sCustomParam     // Catch:{ Exception -> 0x01e1 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ Exception -> 0x01e1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x01e1 }
        L_0x01b7:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x01e1 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r1 = r0.getKey()     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x01e1 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01e1 }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Exception -> 0x01e1 }
            if (r2 != 0) goto L_0x01b7
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x01e1 }
            if (r2 != 0) goto L_0x01b7
            r4.put(r1, r0)     // Catch:{ Exception -> 0x01e1 }
            goto L_0x01b7
        L_0x01e1:
            com.ss.android.common.applog.NetUtil$IExtraParams r5 = sExtraparams     // Catch:{ Throwable -> 0x022c }
            if (r5 == 0) goto L_0x022b
            com.ss.android.common.applog.NetUtil$IExtraParams r5 = sExtraparams     // Catch:{ Throwable -> 0x022c }
            java.util.HashMap r5 = r5.getExtrparams()     // Catch:{ Throwable -> 0x022c }
            if (r5 == 0) goto L_0x022b
            boolean r0 = r5.isEmpty()     // Catch:{ Throwable -> 0x022c }
            if (r0 != 0) goto L_0x022b
            java.util.Set r5 = r5.entrySet()     // Catch:{ Throwable -> 0x022c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Throwable -> 0x022c }
        L_0x01fb:
            boolean r0 = r5.hasNext()     // Catch:{ Throwable -> 0x022c }
            if (r0 == 0) goto L_0x022b
            java.lang.Object r0 = r5.next()     // Catch:{ Throwable -> 0x022c }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Throwable -> 0x022c }
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r1 = r0.getKey()     // Catch:{ Throwable -> 0x022c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x022c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Throwable -> 0x022c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x022c }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x022c }
            if (r2 != 0) goto L_0x01fb
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x022c }
            if (r2 != 0) goto L_0x01fb
            boolean r2 = r4.containsKey(r1)     // Catch:{ Throwable -> 0x022c }
            if (r2 != 0) goto L_0x01fb
            r4.put(r1, r0)     // Catch:{ Throwable -> 0x022c }
            goto L_0x01fb
        L_0x022b:
            return
        L_0x022c:
            return
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.NetUtil.putCommonParams$___twin___(java.util.Map, boolean):void");
    }

    public static String sendEncryptLog(String str, byte[] bArr, Context context, boolean z) throws Exception {
        if (C6319n.m19593a(str) || bArr == null || bArr.length <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            addFailedCount(context);
            boolean z2 = false;
            if (sEncryptFaildCount < 3) {
                z2 = true;
                byteArray = TTEncryptUtils.m19789a(byteArray, byteArray.length);
                minusFailedCount(context);
            }
            if (byteArray == null || !z2) {
                throw new RuntimeException("encrypt failed");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&tt_data=a");
            String sb2 = sb.toString();
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("&config_retry=b");
                sb2 = sb3.toString();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
            return C6317k.m19580a().mo15154a(sb2, byteArray, (Map<String, String>) hashMap, (C6318a) null);
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }
}

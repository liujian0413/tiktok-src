package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.ChannelUploadHelper */
public class ChannelUploadHelper {
    private static String mChannel;

    public static String getChannel() {
        return mChannel;
    }

    public static int getMaxPostTime() {
        return 5;
    }

    public static void parseFile() {
        StringBuilder sb = new StringBuilder("/data/etc/appchannel");
        sb.append(File.separator);
        sb.append("oppo_aweme_156_pre_install.config");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("/system/etc/appchannel");
        sb3.append(File.separator);
        sb3.append("oppo_aweme_156_pre_install.config");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder("/system/etc");
        sb5.append(File.separator);
        sb5.append("oneplus_aweme_156_pre_install.config");
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder("/system/etc");
        sb7.append(File.separator);
        sb7.append("meizu_aweme_156_pre_install.config");
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder("/system/etc");
        sb9.append(File.separator);
        sb9.append("vivo_aweme_183_pre_install.config");
        String sb10 = sb9.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(getChannelPath("ro.preinstall.path"));
        sb11.append(File.separator);
        sb11.append("vivo_aweme_183_pre_install.config");
        String sb12 = sb11.toString();
        String miuiChannelPath = getMiuiChannelPath("com.ss.android.ugc.aweme");
        StringBuilder sb13 = new StringBuilder("/system/etc");
        sb13.append(File.separator);
        sb13.append("lenovo_aweme_183_pre_install.config");
        String sb14 = sb13.toString();
        StringBuilder sb15 = new StringBuilder("/system/etc");
        sb15.append(File.separator);
        sb15.append("chuizi_aweme_400_pre_install.config");
        String sb16 = sb15.toString();
        StringBuilder sb17 = new StringBuilder("/system/etc");
        sb17.append(File.separator);
        sb17.append("aweme_400_pre_install.config");
        String sb18 = sb17.toString();
        String channelPath = getChannelPath("ro.com.ss.android.ugc.aweme");
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb2);
        arrayList.add(sb4);
        arrayList.add(channelPath);
        arrayList.add(sb6);
        arrayList.add(sb8);
        arrayList.add(sb12);
        arrayList.add(sb10);
        arrayList.add(sb14);
        arrayList.add(sb16);
        arrayList.add(sb18);
        if (!TextUtils.isEmpty(miuiChannelPath)) {
            arrayList.add(miuiChannelPath);
        }
        String readTextFile = readTextFile(arrayList);
        if (!TextUtils.isEmpty(readTextFile)) {
            try {
                JSONObject jSONObject = new JSONObject(readTextFile);
                String optString = jSONObject.optString("channel");
                jSONObject.optString(C38347c.f99551f);
                jSONObject.optInt("update_version_code");
                jSONObject.optString("product_name");
                mChannel = optString;
                StringBuilder sb19 = new StringBuilder();
                sb19.append(C6399b.m19935k());
                C6907h.m21519a((Context) AwemeApplication.m21341a(), "pre_install_check", "app_start", "0", 0, C6869c.m21381a().mo16887a("package", AwemeApplication.m21341a().getPackageName()).mo16887a("app_id", sb19.toString()).mo16887a("app_name", C6399b.m19929e()).mo16887a("device_id", AppLog.getServerDeviceId()).mo16887a("system_record_channel", optString).mo16887a("channel", C6399b.m19941q()).mo16888b());
                C6887b.m21436b().mo16901a((Context) AwemeApplication.m21341a(), "pre_install_channel", optString);
            } catch (Exception unused) {
            }
        }
    }

    private static String getChannelPath(String str) {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getMiuiChannelPath(String str) {
        try {
            return (String) Class.forName("miui.os.MiuiInit").getMethod("getMiuiChannelPath", new Class[]{String.class}).invoke(null, new Object[]{str});
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c A[SYNTHETIC, Splitter:B:47:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0091 A[Catch:{ IOException -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0096 A[Catch:{ IOException -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009f A[SYNTHETIC, Splitter:B:60:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a4 A[Catch:{ IOException -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a9 A[Catch:{ IOException -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00af A[Catch:{ IOException -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00b4 A[Catch:{ IOException -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0014 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0014 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readTextFile(java.util.List<java.lang.String> r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x00bf
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x000b
            goto L_0x00bf
        L_0x000b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0014:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00ba
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0014
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L_0x0014
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L_0x0014
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00aa, IOException -> 0x009a, all -> 0x0087 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00aa, IOException -> 0x009a, all -> 0x0087 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0083, all -> 0x0080 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0083, all -> 0x0080 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x007c, all -> 0x007a }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x007c, all -> 0x007a }
        L_0x004b:
            java.lang.String r5 = r4.readLine()     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x009d, all -> 0x0077 }
            if (r5 == 0) goto L_0x005a
            r1.append(r5)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x009d, all -> 0x0077 }
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x009d, all -> 0x0077 }
            goto L_0x004b
        L_0x005a:
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ FileNotFoundException -> 0x00ad, IOException -> 0x009d, all -> 0x0077 }
            if (r5 != 0) goto L_0x006b
            r2.close()     // Catch:{ IOException -> 0x00ba }
            r3.close()     // Catch:{ IOException -> 0x00ba }
            r4.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00ba
        L_0x006b:
            r2.close()     // Catch:{ IOException -> 0x0075 }
            r3.close()     // Catch:{ IOException -> 0x0075 }
        L_0x0071:
            r4.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0014
        L_0x0075:
            goto L_0x0014
        L_0x0077:
            r6 = move-exception
            r0 = r4
            goto L_0x008a
        L_0x007a:
            r6 = move-exception
            goto L_0x008a
        L_0x007c:
            r4 = r0
            goto L_0x009d
        L_0x007e:
            r4 = r0
            goto L_0x00ad
        L_0x0080:
            r6 = move-exception
            r3 = r0
            goto L_0x008a
        L_0x0083:
            r3 = r0
            goto L_0x009c
        L_0x0085:
            r3 = r0
            goto L_0x00ac
        L_0x0087:
            r6 = move-exception
            r2 = r0
            r3 = r2
        L_0x008a:
            if (r2 == 0) goto L_0x008f
            r2.close()     // Catch:{ IOException -> 0x0099 }
        L_0x008f:
            if (r3 == 0) goto L_0x0094
            r3.close()     // Catch:{ IOException -> 0x0099 }
        L_0x0094:
            if (r0 == 0) goto L_0x0099
            r0.close()     // Catch:{ IOException -> 0x0099 }
        L_0x0099:
            throw r6
        L_0x009a:
            r2 = r0
            r3 = r2
        L_0x009c:
            r4 = r3
        L_0x009d:
            if (r2 == 0) goto L_0x00a2
            r2.close()     // Catch:{ IOException -> 0x0075 }
        L_0x00a2:
            if (r3 == 0) goto L_0x00a7
            r3.close()     // Catch:{ IOException -> 0x0075 }
        L_0x00a7:
            if (r4 == 0) goto L_0x0014
            goto L_0x0071
        L_0x00aa:
            r2 = r0
            r3 = r2
        L_0x00ac:
            r4 = r3
        L_0x00ad:
            if (r2 == 0) goto L_0x00b2
            r2.close()     // Catch:{ IOException -> 0x0075 }
        L_0x00b2:
            if (r3 == 0) goto L_0x00b7
            r3.close()     // Catch:{ IOException -> 0x0075 }
        L_0x00b7:
            if (r4 == 0) goto L_0x0014
            goto L_0x0071
        L_0x00ba:
            java.lang.String r6 = r1.toString()
            return r6
        L_0x00bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.ChannelUploadHelper.readTextFile(java.util.List):java.lang.String");
    }
}

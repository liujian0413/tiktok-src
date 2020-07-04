package com.bytedance.router.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtils {
    private static final String SECONDARY_FOLDER_NAME;

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m36451x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    static {
        StringBuilder sb = new StringBuilder("code_cache");
        sb.append(File.separator);
        sb.append("secondary-dexes");
        SECONDARY_FOLDER_NAME = sb.toString();
    }

    private static boolean isYunOS() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            if ((property2 == null || !property2.toLowerCase().contains("lemur")) && (property == null || property.trim().length() <= 0)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r3 <= 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (java.lang.Integer.valueOf(java.lang.System.getProperty("ro.build.version.sdk")).intValue() >= 21) goto L_0x001c;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isVMMultidexCapable() {
        /*
            r0 = 0
            boolean r1 = isYunOS()     // Catch:{ Exception -> 0x0052 }
            r2 = 1
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = "'YunOS'"
            java.lang.String r3 = "ro.build.version.sdk"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch:{  }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{  }
            int r3 = r3.intValue()     // Catch:{  }
            r4 = 21
            if (r3 < r4) goto L_0x0053
        L_0x001c:
            r0 = 1
            goto L_0x0053
        L_0x001e:
            goto L_0x0053
        L_0x0020:
            java.lang.String r1 = "'Android'"
            java.lang.String r3 = "java.vm.version"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch:{  }
            if (r3 == 0) goto L_0x0053
            java.lang.String r4 = "(\\d+)\\.(\\d+)(\\.\\d+)?"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{  }
            java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch:{  }
            boolean r4 = r3.matches()     // Catch:{  }
            if (r4 == 0) goto L_0x0053
            java.lang.String r4 = r3.group(r2)     // Catch:{ Exception -> 0x001e }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x001e }
            r5 = 2
            java.lang.String r3 = r3.group(r5)     // Catch:{ Exception -> 0x001e }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x001e }
            if (r4 > r5) goto L_0x001c
            if (r4 != r5) goto L_0x0053
            if (r3 <= 0) goto L_0x0053
            goto L_0x001c
        L_0x0052:
            r1 = 0
        L_0x0053:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "VM with name "
            r2.<init>(r3)
            r2.append(r1)
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = " has multidex support"
            goto L_0x0064
        L_0x0062:
            java.lang.String r1 = " does not have multidex support"
        L_0x0064:
            r2.append(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.util.ClassUtils.isVMMultidexCapable():boolean");
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        int i;
        String str = "multidex.version";
        if (VERSION.SDK_INT < 11) {
            i = 0;
        } else {
            i = 4;
        }
        return C7285c.m22838a(context, str, i);
    }

    public static List<String> getSourcePaths(Context context) throws NameNotFoundException, IOException {
        ApplicationInfo com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo = _lancet.m36451x89c42dc8(context.getPackageManager(), context.getPackageName(), 0);
        File file = new File(com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.sourceDir);
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        if (!isVMMultidexCapable()) {
            int i = getMultiDexPreferences(context).getInt("dex.number", 1);
            File file2 = new File(com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.dataDir, SECONDARY_FOLDER_NAME);
            int i2 = 2;
            while (i2 <= i) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(i2);
                sb3.append(".zip");
                File file3 = new File(file2, sb3.toString());
                if (file3.isFile()) {
                    arrayList.add(file3.getAbsolutePath());
                    i2++;
                } else {
                    StringBuilder sb4 = new StringBuilder("Missing extracted secondary dex file '");
                    sb4.append(file3.getPath());
                    sb4.append("'");
                    throw new IOException(sb4.toString());
                }
            }
        }
        return arrayList;
    }

    public static List<String> getFileNameByPackageName(Context context, String str) throws NameNotFoundException, IOException {
        DexFile dexFile;
        ArrayList arrayList = new ArrayList();
        for (String str2 : getSourcePaths(context)) {
            if (str2.endsWith(".zip")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(".tmp");
                dexFile = DexFile.loadDex(str2, sb.toString(), 0);
            } else {
                dexFile = new DexFile(str2);
            }
            Enumeration entries = dexFile.entries();
            while (entries.hasMoreElements()) {
                String str3 = (String) entries.nextElement();
                if (str3.contains(str)) {
                    arrayList.add(str3);
                }
            }
        }
        return arrayList;
    }
}

package com.android.vending.expansion.zipfile;

import android.content.Context;
import android.os.Environment;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/* renamed from: com.android.vending.expansion.zipfile.a */
public final class C1854a {
    /* renamed from: a */
    private static C1855b m8624a(String[] strArr) throws IOException {
        C1855b bVar = null;
        for (String str : strArr) {
            if (bVar == null) {
                bVar = new C1855b(str);
            } else {
                bVar.mo7376b(str);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static C1855b m8623a(Context context, int i, int i2) throws IOException {
        return m8624a(m8625b(context, i, i2));
    }

    /* renamed from: b */
    private static String[] m8625b(Context context, int i, int i2) {
        String packageName = context.getPackageName();
        Vector vector = new Vector();
        if (Environment.getExternalStorageState().equals("mounted")) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            StringBuilder sb = new StringBuilder();
            sb.append(externalStorageDirectory.toString());
            sb.append("/Android/obb/");
            sb.append(packageName);
            File file = new File(sb.toString());
            if (file.exists()) {
                if (i > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file);
                    sb2.append(File.separator);
                    sb2.append("main.");
                    sb2.append(i);
                    sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb2.append(packageName);
                    sb2.append(".obb");
                    String sb3 = sb2.toString();
                    if (new File(sb3).isFile()) {
                        vector.add(sb3);
                    }
                }
                if (i2 > 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(file);
                    sb4.append(File.separator);
                    sb4.append("patch.");
                    sb4.append(i2);
                    sb4.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb4.append(packageName);
                    sb4.append(".obb");
                    String sb5 = sb4.toString();
                    if (new File(sb5).isFile()) {
                        vector.add(sb5);
                    }
                }
            }
        }
        String[] strArr = new String[vector.size()];
        vector.toArray(strArr);
        return strArr;
    }
}

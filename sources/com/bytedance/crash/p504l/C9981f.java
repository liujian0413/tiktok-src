package com.bytedance.crash.p504l;

import android.os.Process;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.upload.C10025f;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.l.f */
public final class C9981f {
    /* renamed from: b */
    public static int m29534b() {
        int myPid = Process.myPid();
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(myPid);
            sb.append("/fd");
            return new File(sb.toString()).listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m29535c() {
        StringBuilder sb = new StringBuilder("/proc/");
        sb.append(String.valueOf(Process.myPid()));
        sb.append("/maps");
        File file = new File(sb.toString());
        String format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
        File g = C9992m.m29609g(C9918j.m29342g());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(format);
        sb2.append('_');
        sb2.append(file.getName());
        C9982g.m29541a(file, new File(g, sb2.toString()));
    }

    /* renamed from: d */
    public static void m29536d() {
        File g = C9992m.m29609g(C9918j.m29342g());
        File[] listFiles = g.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (File absolutePath : listFiles) {
                arrayList.add(absolutePath.getAbsolutePath());
            }
            if (m29533a(C9918j.m29332a().mo24528d(), C9918j.m29338c().mo24593a(), "externalFiles", arrayList, "npth", C9972a.m29507c(C9918j.m29342g()))) {
                C9982g.m29547a(g);
            }
        }
    }

    /* renamed from: a */
    public static List<String> m29532a() {
        ArrayList arrayList = new ArrayList();
        int myPid = Process.myPid();
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(myPid);
            sb.append("/fd");
            File[] listFiles = new File(sb.toString()).listFiles();
            if (listFiles != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File name : listFiles) {
                    try {
                        arrayList2.add(Integer.valueOf(Integer.decode(name.getName()).intValue()));
                    } catch (Throwable unused) {
                    }
                }
                int[] iArr = new int[arrayList2.size()];
                for (int i = 0; i < iArr.length; i++) {
                    iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                }
                String[] a = NativeImpl.m29685a(myPid, iArr, new String[iArr.length]);
                if (a == null) {
                    for (File file : listFiles) {
                        StringBuilder sb2 = new StringBuilder("fd ");
                        sb2.append(file.getName());
                        sb2.append(": ");
                        sb2.append(file.getCanonicalPath());
                        arrayList.add(sb2.toString());
                    }
                } else {
                    arrayList.addAll(Arrays.asList(a));
                }
            }
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m29533a(String str, String str2, String str3, List<String> list, String str4, String str5) {
        try {
            C10025f fVar = new C10025f(C9912i.m29317b().f27119e, "UTF-8", false);
            fVar.mo24651a("aid", str);
            fVar.mo24651a("device_id", str2);
            fVar.mo24651a("os", "Android");
            fVar.mo24651a("process_name", "main");
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", str3);
                    hashMap.put("scene", str4);
                    hashMap.put("env", "params.txt");
                    fVar.mo24650a(file2.getName(), file2, hashMap);
                }
            }
            try {
                if (new JSONObject(fVar.mo24648a()).optInt("errno", -1) == 200) {
                    return true;
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }
}

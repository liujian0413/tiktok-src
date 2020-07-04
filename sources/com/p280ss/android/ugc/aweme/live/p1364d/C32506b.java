package com.p280ss.android.ugc.aweme.live.p1364d;

import android.util.Pair;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.d.b */
public final class C32506b {
    /* renamed from: a */
    private static String m105294a(String str) {
        File[] listFiles;
        File[] listFiles2;
        if (str == null || str.isEmpty()) {
            return "";
        }
        File file = new File(str);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    for (File file3 : file2.listFiles()) {
                        if (file3.getName().endsWith(".png")) {
                            return file3.getAbsolutePath();
                        }
                    }
                    continue;
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static List<C29296g> m105295a(List<Pair<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) ((Pair) list.get(i)).first;
            String str2 = (String) ((Pair) list.get(i)).second;
            C29296g gVar = new C29296g();
            gVar.f77270e = i;
            gVar.f77267b = str;
            gVar.f77273h = m105294a(str2);
            gVar.mo74977a(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("/thumbnail.jpg");
            gVar.f77272g = sb.toString();
            arrayList.add(gVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m105296a(int i, int i2) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().setDefaultFilterForCamera(i, i2);
    }
}

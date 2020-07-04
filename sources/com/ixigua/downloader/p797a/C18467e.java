package com.ixigua.downloader.p797a;

import com.ixigua.downloader.C18462a;
import com.ixigua.downloader.pojo.Task;
import java.io.File;

/* renamed from: com.ixigua.downloader.a.e */
public final class C18467e {
    /* renamed from: a */
    public static boolean m60827a(Task task) {
        int a = C18466d.m60822a(C18462a.m60789a().f50054a);
        if (task == null || (!C18466d.m60824b(a) && (!C18466d.m60823a(a) || task.isOnlyWifi))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m60828b(Task task) {
        if (task == null) {
            return false;
        }
        File file = new File(task.getMetaPath());
        StringBuilder sb = new StringBuilder();
        sb.append(task.path);
        sb.append(".temp");
        File file2 = new File(sb.toString());
        File file3 = new File(task.path);
        C18464b.m60812d(file);
        C18464b.m60812d(file2);
        C18464b.m60812d(file3);
        if (file.exists() || file2.exists() || file3.exists()) {
            return false;
        }
        return true;
    }
}

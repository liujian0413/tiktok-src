package com.p280ss.android.ugc.aweme.i18n.draftcompat;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41564p;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.i18n.draftcompat.CleanUpHelper */
public final class CleanUpHelper {

    /* renamed from: com.ss.android.ugc.aweme.i18n.draftcompat.CleanUpHelper$CompatEnums */
    public enum CompatEnums {
        COMPAT_DRAFT
    }

    /* renamed from: a */
    public static boolean m99458a() {
        boolean z;
        C30450a aVar = (C30450a) C23336d.m76560a(C6399b.m19921a(), C30450a.class);
        if (aVar == null) {
            return false;
        }
        int a = aVar.mo60437a(0);
        boolean z2 = true;
        for (CompatEnums ordinal : CompatEnums.values()) {
            if (((a >> ordinal.ordinal()) & 1) > 0) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        if (!z2 || aVar.mo60438a(false)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m99459b() {
        C30450a aVar = (C30450a) C23336d.m76560a(C6399b.m19921a(), C30450a.class);
        if (aVar == null || ((aVar.mo60437a(0) >> CompatEnums.COMPAT_DRAFT.ordinal()) & 1) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m99460c() {
        File file = new File(((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().shortVideoRootDir());
        if (file.exists()) {
            try {
                for (String contains : file.list()) {
                    if (contains.contains("localvideos")) {
                        C41564p.m132369a(true);
                        return;
                    }
                }
                C6726a.m20842a(new Runnable() {
                    public final void run() {
                        CleanUpHelper.m99457a(CleanUpHelper.m99455a((String) null), C41564p.m132362a());
                    }
                });
                ((C30450a) C23336d.m76560a(C6399b.m19921a(), C30450a.class)).mo60440b(true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m99456a(CompatEnums compatEnums) {
        C30450a aVar = (C30450a) C23336d.m76560a(C6399b.m19921a(), C30450a.class);
        if (aVar != null) {
            aVar.mo60439b((1 << compatEnums.ordinal()) | aVar.mo60437a(0));
        }
    }

    /* renamed from: a */
    public static File m99455a(String str) {
        File file;
        File file2;
        if (C7276d.m22826g()) {
            try {
                if (TextUtils.isEmpty(null)) {
                    file2 = C19025f.m62096J().getExternalFilesDir(null);
                } else {
                    file2 = new File(C19025f.m62096J().getExternalFilesDir(null), null);
                }
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                return file2;
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(null)) {
            file = C19025f.m62096J().getFilesDir();
        } else {
            file = new File(C19025f.m62096J().getFilesDir(), null);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static void m99457a(File file, Set<String> set) {
        if (file != null && file.isDirectory() && file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists()) {
                        String path = file2.getPath();
                        if (!TextUtils.isEmpty(path)) {
                            if (file2.isFile()) {
                                if (!set.contains(path) && !set.contains(file2.getAbsolutePath())) {
                                    C7276d.m22816c(path);
                                }
                            } else if (!set.contains(file2.getName()) && !set.contains(file2.getPath())) {
                                m99457a(file2, set);
                                if (file2.length() == 0) {
                                    file2.delete();
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}

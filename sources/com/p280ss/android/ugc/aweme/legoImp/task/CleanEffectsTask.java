package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import bolts.C1592h;
import com.aweme.storage.C1921e;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.effect.EffectCompatJobService;
import com.p280ss.android.ugc.aweme.effect.EffectJobService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask */
public class CleanEffectsTask implements LegoTask {
    private static volatile boolean checked;
    private static volatile boolean started;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public static boolean enableEffectDiskCache() {
        AbTestModel d = C7213d.m22500a().mo18803bo();
        if (d == null || !d.enableEffectDiskCache) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ Object lambda$startCleanEffect$0$CleanEffectsTask(Context context) throws Exception {
        if (context != null) {
            startCleanJob(context.getApplicationContext());
        }
        return null;
    }

    public void run(Context context) {
        if (enableEffectDiskCache()) {
            try {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getDraftEffectList();
            } catch (Exception unused) {
            }
        }
    }

    public static void startCleanEffect(Context context) {
        if (enableEffectDiskCache() && context != null && !started && C6405d.m19984g() == null) {
            C1592h.m7855a((Callable<TResult>) new C32398c<TResult>(context), (Executor) C7258h.m22732e());
        }
    }

    public static void startCleanJob(Context context) {
        if (!started && context != null && !checked) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException unused) {
            }
            if (effectNeedClean(context)) {
                started = true;
                if (VERSION.SDK_INT >= 26) {
                    try {
                        EffectCompatJobService.m89611a(context);
                    } catch (Exception unused2) {
                    }
                    return;
                }
                context.startService(new Intent(context, EffectJobService.class));
            }
        }
    }

    public static boolean effectNeedClean(Context context) {
        checked = true;
        C32961dd ddVar = (C32961dd) C23336d.m76560a(context, C32961dd.class);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ddVar.mo60454a(0) < 259200000) {
            return false;
        }
        String cacheDir = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getCacheDir();
        if (TextUtils.isEmpty(cacheDir) || new File(cacheDir).list() == null || new File(cacheDir).list().length == 0) {
            return false;
        }
        File file = new File(cacheDir, "journal");
        if (!file.exists() || file.isDirectory()) {
            if (ddVar.mo60466d(true)) {
                return true;
            }
        } else if (currentTimeMillis - file.lastModified() > 259200000) {
            return true;
        }
        ddVar.mo60458b(currentTimeMillis);
        return false;
    }

    public static void cleanCache(File file, ArrayList<String> arrayList) {
        if (file != null && file.exists() && file.isDirectory()) {
            if (arrayList.isEmpty()) {
                C1921e.m8895b(file);
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (!file2.isDirectory()) {
                        file2.delete();
                    } else if (!arrayList.contains(file2.getName())) {
                        C1921e.m8895b(file2);
                    }
                }
            }
        }
    }
}

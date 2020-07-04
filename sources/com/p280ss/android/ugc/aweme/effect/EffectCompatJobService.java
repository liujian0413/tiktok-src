package com.p280ss.android.ugc.aweme.effect;

import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectCompatJobService */
public class EffectCompatJobService extends JobService {

    /* renamed from: a */
    private static volatile int f72114a = 190806;

    /* renamed from: b */
    private static volatile boolean f72115b;

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m89610a(String str) throws Exception {
        try {
            CleanEffectsTask.cleanCache(new File(str), ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getDraftEffectList());
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m89611a(Context context) {
        if (!f72115b) {
            f72115b = true;
            Builder builder = new Builder(f72114a, new ComponentName(context, EffectCompatJobService.class));
            builder.setMinimumLatency(0);
            builder.setOverrideDeadline(3000);
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String cacheDir = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getCacheDir();
        if (TextUtils.isEmpty(cacheDir) || new File(cacheDir).list() == null || new File(cacheDir).list().length == 0) {
            return false;
        }
        C1592h.m7855a((Callable<TResult>) new C27426e<TResult>(cacheDir), (Executor) C7258h.m22730c()).mo6886c(new C27427f(this, jobParameters), C1592h.f5958b);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo70344a(JobParameters jobParameters, C1592h hVar) throws Exception {
        C32961dd ddVar = (C32961dd) C23336d.m76560a(this, C32961dd.class);
        ddVar.mo60458b(System.currentTimeMillis());
        ddVar.mo60468e(false);
        jobFinished(jobParameters, false);
        f72115b = false;
        return null;
    }
}

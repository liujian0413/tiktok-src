package com.aweme.storage;

import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class CompatJobService extends JobService {

    /* renamed from: a */
    public static volatile boolean f6890a;

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        C1592h.m7855a((Callable<TResult>) new Callable<String>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public String call() throws Exception {
                C1913c.m8864e(CompatJobService.this);
                return null;
            }
        }, (Executor) C7258h.m22730c()).mo6886c(new C1591g<String, String>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public String then(C1592h<String> hVar) throws Exception {
                C1913c.m8865f(CompatJobService.this);
                CompatJobService.this.jobFinished(jobParameters, false);
                CompatJobService.f6890a = false;
                return null;
            }
        }, C1592h.f5958b);
        return true;
    }

    /* renamed from: a */
    static void m8834a(Context context) {
        if (!f6890a) {
            f6890a = true;
            Builder builder = new Builder(0, new ComponentName(context, CompatJobService.class));
            builder.setMinimumLatency(0);
            builder.setOverrideDeadline(3000);
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
        }
    }
}

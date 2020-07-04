package com.p280ss.android.socialbase.downloader.impls;

import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;

/* renamed from: com.ss.android.socialbase.downloader.impls.RetryJobSchedulerService */
public class RetryJobSchedulerService extends JobService {
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public void onCreate() {
        super.onCreate();
        C20269b.m66725a((Context) this);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters != null) {
            C20327r.m67371a().mo54527a(jobParameters.getJobId());
        }
        return false;
    }

    /* renamed from: a */
    static void m67069a(DownloadInfo downloadInfo, int i, boolean z, boolean z2, boolean z3) {
        long j;
        int i2;
        if (downloadInfo != null && i > 0) {
            Context x = C20269b.m66765x();
            if (x != null) {
                try {
                    JobScheduler jobScheduler = (JobScheduler) x.getSystemService("jobscheduler");
                    if (jobScheduler != null) {
                        try {
                            jobScheduler.cancel(downloadInfo.getId());
                        } catch (Throwable unused) {
                        }
                        long j2 = 1000;
                        if (!z || (z3 && !z2)) {
                            j = 0;
                        } else {
                            j2 = 1000 * ((long) (i * 60));
                            j = 60000 + j2;
                        }
                        Builder minimumLatency = new Builder(downloadInfo.getId(), new ComponentName(x.getPackageName(), RetryJobSchedulerService.class.getName())).setMinimumLatency(j2);
                        if (z3) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        Builder requiresDeviceIdle = minimumLatency.setRequiredNetworkType(i2).setRequiresCharging(false).setRequiresDeviceIdle(false);
                        if (j > 0) {
                            requiresDeviceIdle.setOverrideDeadline(j);
                        }
                        int schedule = jobScheduler.schedule(requiresDeviceIdle.build());
                        if (schedule <= 0) {
                            StringBuilder sb = new StringBuilder("schedule err errCode = ");
                            sb.append(schedule);
                            C20190a.m66502b("RetryJobScheduler", sb.toString());
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }
}

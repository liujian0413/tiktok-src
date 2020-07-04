package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.text.TextUtils;
import androidx.work.impl.C1466a;
import androidx.work.impl.C1544f;
import com.C1642a;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements C1466a {

    /* renamed from: a */
    private C1544f f5820a;

    /* renamed from: b */
    private final Map<String, JobParameters> f5821b = new HashMap();

    public void onDestroy() {
        super.onDestroy();
        if (this.f5820a != null) {
            this.f5820a.f5839f.mo6741b((C1466a) this);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f5820a = C1544f.m7577c();
        if (this.f5820a != null) {
            this.f5820a.f5839f.mo6738a((C1466a) this);
        } else if (!Application.class.equals(getApplication().getClass())) {
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f5820a == null) {
            return true;
        }
        String string = jobParameters.getExtras().getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        C1642a.m8034a("onStopJob for %s", new Object[]{string});
        synchronized (this.f5821b) {
            this.f5821b.remove(string);
        }
        this.f5820a.mo6803b(string);
        if (!this.f5820a.f5839f.mo6743c(string)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r2 = new androidx.work.WorkerParameters.C1450a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r7.getTriggeredContentUris() == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r2.f5642b = java.util.Arrays.asList(r7.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r7.getTriggeredContentAuthorities() == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        r2.f5641a = java.util.Arrays.asList(r7.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        r2.f5643c = r7.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        r6.f5820a.mo6802a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            androidx.work.impl.f r0 = r6.f5820a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6.jobFinished(r7, r1)
            return r2
        L_0x000a:
            android.os.PersistableBundle r0 = r7.getExtras()
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r0 = r0.getString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x001b
            return r2
        L_0x001b:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r6.f5821b
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r6.f5821b     // Catch:{ all -> 0x007e }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x0031
            java.lang.String r7 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x007e }
            r1[r2] = r0     // Catch:{ all -> 0x007e }
            com.C1642a.m8034a(r7, r1)     // Catch:{ all -> 0x007e }
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            return r2
        L_0x0031:
            java.lang.String r4 = "onStartJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x007e }
            r5[r2] = r0     // Catch:{ all -> 0x007e }
            com.C1642a.m8034a(r4, r5)     // Catch:{ all -> 0x007e }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r6.f5821b     // Catch:{ all -> 0x007e }
            r2.put(r0, r7)     // Catch:{ all -> 0x007e }
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0078
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r3 = r7.getTriggeredContentUris()
            if (r3 == 0) goto L_0x005c
            android.net.Uri[] r3 = r7.getTriggeredContentUris()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.f5642b = r3
        L_0x005c:
            java.lang.String[] r3 = r7.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x006c
            java.lang.String[] r3 = r7.getTriggeredContentAuthorities()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.f5641a = r3
        L_0x006c:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x0078
            android.net.Network r7 = r7.getNetwork()
            r2.f5643c = r7
        L_0x0078:
            androidx.work.impl.f r7 = r6.f5820a
            r7.mo6802a(r0, r2)
            return r1
        L_0x007e:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* renamed from: a */
    public final void mo6707a(String str, boolean z) {
        JobParameters jobParameters;
        C1642a.m8034a("%s executed on JobScheduler", new Object[]{str});
        synchronized (this.f5821b) {
            jobParameters = (JobParameters) this.f5821b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }
}

package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.WorkInfo.State;
import androidx.work.impl.C1538c;
import androidx.work.impl.C1544f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p036b.C1496d;
import androidx.work.impl.p036b.C1501g;
import androidx.work.impl.utils.C1551a;
import com.C1642a;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemjob.b */
public final class C1537b implements C1538c {

    /* renamed from: a */
    private final JobScheduler f5824a;

    /* renamed from: b */
    private final C1544f f5825b;

    /* renamed from: c */
    private final C1551a f5826c;

    /* renamed from: d */
    private final C1535a f5827d;

    /* renamed from: a */
    public static void m7562a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (allPendingJobs != null) {
                for (JobInfo jobInfo : allPendingJobs) {
                    if (jobInfo.getExtras().containsKey("EXTRA_WORK_SPEC_ID")) {
                        jobScheduler.cancel(jobInfo.getId());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6773a(String str) {
        List<JobInfo> allPendingJobs = this.f5824a.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (str.equals(jobInfo.getExtras().getString("EXTRA_WORK_SPEC_ID"))) {
                    this.f5825b.f5836c.mo6700l().mo6752b(str);
                    this.f5824a.cancel(jobInfo.getId());
                    if (VERSION.SDK_INT != 23) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6774a(C1501g... gVarArr) {
        int i;
        WorkDatabase workDatabase = this.f5825b.f5836c;
        int length = gVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            C1501g gVar = gVarArr[i2];
            workDatabase.mo313d();
            try {
                C1501g a = workDatabase.mo6697i().mo6761a(gVar.f5734a);
                if (a == null) {
                    StringBuilder sb = new StringBuilder("Skipping scheduling ");
                    sb.append(gVar.f5734a);
                    sb.append(" because it's no longer in the DB");
                } else if (a.f5735b != State.ENQUEUED) {
                    StringBuilder sb2 = new StringBuilder("Skipping scheduling ");
                    sb2.append(gVar.f5734a);
                    sb2.append(" because it is no longer enqueued");
                } else {
                    C1496d a2 = workDatabase.mo6700l().mo6750a(gVar.f5734a);
                    if (a2 != null) {
                        i = a2.f5727b;
                    } else {
                        i = this.f5826c.mo6817a(this.f5825b.f5835b.f5647d, this.f5825b.f5835b.f5648e);
                    }
                    if (a2 == null) {
                        this.f5825b.f5836c.mo6700l().mo6751a(new C1496d(gVar.f5734a, i));
                    }
                    m7563a(gVar, i);
                    if (VERSION.SDK_INT == 23) {
                        m7563a(gVar, this.f5826c.mo6817a(this.f5825b.f5835b.f5647d, this.f5825b.f5835b.f5648e));
                    }
                    workDatabase.mo315f();
                }
                i2++;
            } finally {
                workDatabase.mo314e();
            }
        }
    }

    public C1537b(Context context, C1544f fVar) {
        this(context, fVar, (JobScheduler) context.getSystemService("jobscheduler"), new C1535a(context));
    }

    /* renamed from: a */
    private void m7563a(C1501g gVar, int i) {
        JobInfo a = this.f5827d.mo6799a(gVar, i);
        C1642a.m8034a("Scheduling work ID %s Job ID %s", new Object[]{gVar.f5734a, Integer.valueOf(i)});
        this.f5824a.schedule(a);
    }

    private C1537b(Context context, C1544f fVar, JobScheduler jobScheduler, C1535a aVar) {
        this.f5825b = fVar;
        this.f5824a = jobScheduler;
        this.f5826c = new C1551a(context);
        this.f5827d = aVar;
    }
}

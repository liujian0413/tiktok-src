package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.C1454c;
import androidx.work.C1456d.C1457a;
import androidx.work.NetworkType;
import androidx.work.impl.p036b.C1501g;
import com.C1642a;

/* renamed from: androidx.work.impl.background.systemjob.a */
final class C1535a {

    /* renamed from: a */
    private final ComponentName f5822a;

    /* renamed from: a */
    private static TriggerContentUri m7560a(C1457a aVar) {
        return new TriggerContentUri(aVar.f5670a, aVar.f5671b ? 1 : 0);
    }

    C1535a(Context context) {
        this.f5822a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: a */
    private static int m7559a(NetworkType networkType) {
        switch (networkType) {
            case NOT_REQUIRED:
                return 0;
            case CONNECTED:
                return 1;
            case UNMETERED:
                return 2;
            case NOT_ROAMING:
                if (VERSION.SDK_INT >= 24) {
                    return 3;
                }
                break;
            case METERED:
                if (VERSION.SDK_INT >= 26) {
                    return 4;
                }
                break;
        }
        C1642a.m8034a("API version too low. Cannot convert network type value %s", new Object[]{networkType});
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final JobInfo mo6799a(C1501g gVar, int i) {
        int i2;
        C1454c cVar = gVar.f5743j;
        int a = m7559a(cVar.f5657b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", gVar.f5734a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", gVar.mo6753a());
        Builder extras = new Builder(i, this.f5822a).setRequiredNetworkType(a).setRequiresCharging(cVar.f5658c).setRequiresDeviceIdle(cVar.f5659d).setExtras(persistableBundle);
        if (!cVar.f5659d) {
            if (gVar.f5745l == BackoffPolicy.LINEAR) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            extras.setBackoffCriteria(gVar.f5746m, i2);
        }
        if (!gVar.mo6753a()) {
            extras.setMinimumLatency(gVar.f5740g);
        } else if (VERSION.SDK_INT >= 24) {
            extras.setPeriodic(gVar.f5741h, gVar.f5742i);
        } else {
            extras.setPeriodic(gVar.f5741h);
        }
        if (VERSION.SDK_INT >= 24 && cVar.mo6681a()) {
            for (C1457a a2 : cVar.f5662g.f5669a) {
                extras.addTriggerContentUri(m7560a(a2));
            }
        }
        extras.setPersisted(false);
        if (VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f5660e);
            extras.setRequiresStorageNotLow(cVar.f5661f);
        }
        return extras.build();
    }
}

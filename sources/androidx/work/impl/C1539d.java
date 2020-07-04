package androidx.work.impl;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1451a;
import androidx.work.impl.background.systemalarm.C1530f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.C1537b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.p036b.C1501g;
import androidx.work.impl.p036b.C1503h;
import androidx.work.impl.utils.C1565b;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: androidx.work.impl.d */
public final class C1539d {
    /* renamed from: a */
    private static C1538c m7568a(Context context) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        return (C1538c) Class.forName("androidx.work.impl.background.firebase.FirebaseJobScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
    }

    /* renamed from: a */
    static C1538c m7569a(Context context, C1544f fVar) {
        C1538c cVar;
        boolean z = false;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 23) {
            cVar = new C1537b(context, fVar);
            C1565b.m7652a(context, SystemJobService.class, true);
        } else {
            try {
                cVar = m7568a(context);
                z = true;
            } catch (Exception unused) {
                cVar = new C1530f(context);
            }
        }
        z2 = false;
        try {
            C1565b.m7652a(context, Class.forName("androidx.work.impl.background.firebase.FirebaseJobService"), z);
        } catch (ClassNotFoundException unused2) {
        }
        C1565b.m7652a(context, SystemAlarmService.class, z2);
        return cVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m7570a(C1451a aVar, WorkDatabase workDatabase, List<C1538c> list) {
        if (list != null && list.size() != 0) {
            C1503h i = workDatabase.mo6697i();
            workDatabase.mo313d();
            try {
                List<C1501g> a = i.mo6763a(aVar.mo6679a());
                if (a.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C1501g gVar : a) {
                        i.mo6768b(gVar.f5734a, currentTimeMillis);
                    }
                }
                workDatabase.mo315f();
                workDatabase.mo314e();
                if (a.size() > 0) {
                    C1501g[] gVarArr = (C1501g[]) a.toArray(new C1501g[0]);
                    for (C1538c a2 : list) {
                        a2.mo6774a(gVarArr);
                    }
                }
            } catch (Throwable th) {
                workDatabase.mo314e();
                throw th;
            }
        }
    }
}

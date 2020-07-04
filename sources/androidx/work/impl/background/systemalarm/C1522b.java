package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.WorkInfo.State;
import androidx.work.impl.C1466a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p036b.C1501g;
import com.C1642a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.background.systemalarm.b */
public final class C1522b implements C1466a {

    /* renamed from: a */
    private final Context f5783a;

    /* renamed from: b */
    private final Map<String, C1466a> f5784b = new HashMap();

    /* renamed from: c */
    private final Object f5785c = new Object();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6780a() {
        boolean z;
        synchronized (this.f5785c) {
            z = !this.f5784b.isEmpty();
        }
        return z;
    }

    /* renamed from: a */
    static Intent m7517a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    static Intent m7521b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    C1522b(Context context) {
        this.f5783a = context;
    }

    /* renamed from: a */
    static Intent m7518a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    static Intent m7522b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    static Intent m7524c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: a */
    private static boolean m7520a(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (int i = 0; i <= 0; i++) {
            if (bundle.get(strArr[0]) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo6707a(String str, boolean z) {
        synchronized (this.f5785c) {
            C1466a aVar = (C1466a) this.f5784b.remove(str);
            if (aVar != null) {
                aVar.mo6707a(str, z);
            }
        }
    }

    /* renamed from: e */
    private void m7527e(Intent intent, int i, C1525e eVar) {
        C1642a.m8034a("Handling constraints changed %s", new Object[]{intent});
        new C1523c(this.f5783a, i, eVar).mo6781a();
    }

    /* renamed from: f */
    private static void m7528f(Intent intent, int i, C1525e eVar) {
        C1642a.m8034a("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)});
        eVar.f5802d.mo6804e();
    }

    /* renamed from: a */
    static Intent m7519a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: c */
    private void m7525c(Intent intent, int i, C1525e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f5785c) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            C1642a.m8034a("Handing delay met for %s", new Object[]{string});
            C1524d dVar = new C1524d(this.f5783a, i, string, eVar);
            this.f5784b.put(string, dVar);
            dVar.mo6782a();
        }
    }

    /* renamed from: d */
    private void m7526d(Intent intent, int i, C1525e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C1642a.m8034a("Handing stopWork work for %s", new Object[]{string});
        eVar.f5802d.mo6803b(string);
        C1521a.m7513a(this.f5783a, eVar.f5802d, string);
        eVar.mo6707a(string, false);
    }

    /* renamed from: g */
    private void m7529g(Intent intent, int i, C1525e eVar) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        C1642a.m8034a("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)});
        mo6707a(string, z);
    }

    /* renamed from: b */
    private void m7523b(Intent intent, int i, C1525e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C1642a.m8034a("Handling schedule work for %s", new Object[]{string});
        WorkDatabase workDatabase = eVar.f5802d.f5836c;
        workDatabase.mo313d();
        try {
            C1501g a = workDatabase.mo6697i().mo6761a(string);
            if (a == null) {
                StringBuilder sb = new StringBuilder("Skipping scheduling ");
                sb.append(string);
                sb.append(" because it's no longer in the DB");
            } else if (a.f5735b != State.ENQUEUED) {
                StringBuilder sb2 = new StringBuilder("Skipping scheduling ");
                sb2.append(string);
                sb2.append(" because it is no longer enqueued");
                workDatabase.mo314e();
            } else {
                long c = a.mo6755c();
                if (!a.mo6756d()) {
                    C1642a.m8034a("Setting up Alarms for %s", new Object[]{string});
                    C1521a.m7514a(this.f5783a, eVar.f5802d, string, c);
                } else {
                    C1642a.m8034a("Opportunistically setting an alarm for %s", new Object[]{string});
                    C1521a.m7514a(this.f5783a, eVar.f5802d, string, c);
                    eVar.mo6786a((Runnable) new C1527a(eVar, m7517a(this.f5783a), i));
                }
                workDatabase.mo315f();
                workDatabase.mo314e();
            }
        } finally {
            workDatabase.mo314e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6779a(Intent intent, int i, C1525e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m7527e(intent, i, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m7528f(intent, i, eVar);
        } else {
            if (!m7520a(intent.getExtras(), "KEY_WORKSPEC_ID")) {
                C1642a.m8034a("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"});
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                m7523b(intent, i, eVar);
            } else if ("ACTION_DELAY_MET".equals(action)) {
                m7525c(intent, i, eVar);
            } else if ("ACTION_STOP_WORK".equals(action)) {
                m7526d(intent, i, eVar);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                m7529g(intent, i, eVar);
            } else {
                C1642a.m8034a("Ignoring intent %s", new Object[]{intent});
            }
        }
    }
}

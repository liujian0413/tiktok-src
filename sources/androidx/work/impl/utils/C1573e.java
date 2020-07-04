package androidx.work.impl.utils;

import androidx.work.WorkInfo.State;
import androidx.work.impl.C1544f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p036b.C1503h;
import com.C1642a;

/* renamed from: androidx.work.impl.utils.e */
public final class C1573e implements Runnable {

    /* renamed from: a */
    private C1544f f5922a;

    /* renamed from: b */
    private String f5923b;

    public final void run() {
        WorkDatabase workDatabase = this.f5922a.f5836c;
        C1503h i = workDatabase.mo6697i();
        workDatabase.mo313d();
        try {
            if (i.mo6770d(this.f5923b) == State.RUNNING) {
                i.mo6760a(State.ENQUEUED, this.f5923b);
            }
            C1642a.m8034a("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f5923b, Boolean.valueOf(this.f5922a.f5839f.mo6742b(this.f5923b))});
            workDatabase.mo315f();
        } finally {
            workDatabase.mo314e();
        }
    }

    public C1573e(C1544f fVar, String str) {
        this.f5922a = fVar;
        this.f5923b = str;
    }
}

package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import androidx.work.impl.C1466a;
import androidx.work.impl.p033a.C1488c;
import androidx.work.impl.p033a.C1489d;
import androidx.work.impl.p036b.C1501g;
import androidx.work.impl.utils.C1574f;
import com.C1642a;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.d */
public final class C1524d implements C1466a, C1488c, C1532a {

    /* renamed from: a */
    private final Context f5790a;

    /* renamed from: b */
    private final int f5791b;

    /* renamed from: c */
    private final String f5792c;

    /* renamed from: d */
    private final C1525e f5793d;

    /* renamed from: e */
    private final C1489d f5794e = new C1489d(this.f5790a, this);

    /* renamed from: f */
    private final Object f5795f = new Object();

    /* renamed from: g */
    private boolean f5796g = false;

    /* renamed from: h */
    private WakeLock f5797h;

    /* renamed from: i */
    private boolean f5798i = false;

    /* renamed from: c */
    private void m7535c() {
        synchronized (this.f5795f) {
            this.f5793d.f5800b.mo6792a(this.f5792c);
            if (this.f5797h != null && this.f5797h.isHeld()) {
                C1642a.m8034a("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f5797h, this.f5792c});
                this.f5797h.release();
            }
        }
    }

    /* renamed from: b */
    private void m7534b() {
        synchronized (this.f5795f) {
            if (!this.f5796g) {
                C1642a.m8034a("Stopping work for workspec %s", new Object[]{this.f5792c});
                this.f5793d.mo6786a((Runnable) new C1527a(this.f5793d, C1522b.m7524c(this.f5790a, this.f5792c), this.f5791b));
                if (this.f5793d.f5801c.mo6744d(this.f5792c)) {
                    C1642a.m8034a("WorkSpec %s needs to be rescheduled", new Object[]{this.f5792c});
                    this.f5793d.mo6786a((Runnable) new C1527a(this.f5793d, C1522b.m7518a(this.f5790a, this.f5792c), this.f5791b));
                } else {
                    C1642a.m8034a("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f5792c});
                }
                this.f5796g = true;
            } else {
                C1642a.m8034a("Already stopped work for %s", new Object[]{this.f5792c});
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6782a() {
        this.f5797h = C1574f.m7666a(this.f5790a, C1642a.m8034a("%s (%s)", new Object[]{this.f5792c, Integer.valueOf(this.f5791b)}));
        C1642a.m8034a("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f5797h, this.f5792c});
        this.f5797h.acquire();
        C1501g a = this.f5793d.f5802d.f5836c.mo6697i().mo6761a(this.f5792c);
        if (a == null) {
            m7534b();
            return;
        }
        this.f5798i = a.mo6756d();
        if (!this.f5798i) {
            C1642a.m8034a("No constraints for %s", new Object[]{this.f5792c});
            mo6733a(Collections.singletonList(this.f5792c));
            return;
        }
        this.f5794e.mo6736a(Collections.singletonList(a));
    }

    /* renamed from: b */
    public final void mo6734b(List<String> list) {
        m7534b();
    }

    /* renamed from: a */
    public final void mo6783a(String str) {
        C1642a.m8034a("Exceeded time limits on execution for %s", new Object[]{str});
        m7534b();
    }

    /* renamed from: a */
    public final void mo6733a(List<String> list) {
        C1642a.m8034a("onAllConstraintsMet for %s", new Object[]{this.f5792c});
        if (this.f5793d.f5801c.mo6739a(this.f5792c)) {
            this.f5793d.f5800b.mo6793a(this.f5792c, 600000, this);
        } else {
            m7535c();
        }
    }

    /* renamed from: a */
    public final void mo6707a(String str, boolean z) {
        C1642a.m8034a("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)});
        m7535c();
        if (this.f5798i) {
            this.f5793d.mo6786a((Runnable) new C1527a(this.f5793d, C1522b.m7517a(this.f5790a), this.f5791b));
        }
    }

    C1524d(Context context, int i, String str, C1525e eVar) {
        this.f5790a = context;
        this.f5791b = i;
        this.f5793d = eVar;
        this.f5792c = str;
    }
}

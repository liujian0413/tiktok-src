package kotlinx.coroutines.scheduling;

import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48059ag;

/* renamed from: kotlinx.coroutines.scheduling.j */
public final class C48210j extends C48208h {

    /* renamed from: a */
    public final Runnable f123103a;

    public final void run() {
        try {
            this.f123103a.run();
        } finally {
            this.f123102g.mo120437a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        sb.append(C48059ag.m149023b(this.f123103a));
        sb.append('@');
        sb.append(C48059ag.m149021a((Object) this.f123103a));
        sb.append(", ");
        sb.append(this.f123101f);
        sb.append(", ");
        sb.append(this.f123102g);
        sb.append(']');
        return sb.toString();
    }

    public C48210j(Runnable runnable, long j, C48209i iVar) {
        C7573i.m23587b(runnable, "block");
        C7573i.m23587b(iVar, "taskContext");
        super(j, iVar);
        this.f123103a = runnable;
    }
}

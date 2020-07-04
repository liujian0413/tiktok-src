package p346io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;

/* renamed from: io.reactivex.internal.schedulers.h */
public final class C47811h extends C7499z {

    /* renamed from: c */
    private static final RxThreadFactory f122574c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f122575b;

    public C47811h() {
        this(f122574c);
    }

    /* renamed from: a */
    public final C7502c mo19338a() {
        return new C47812i(this.f122575b);
    }

    private C47811h(ThreadFactory threadFactory) {
        this.f122575b = threadFactory;
    }
}

package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState;

/* renamed from: kotlinx.coroutines.scheduling.a */
public final /* synthetic */ class C48201a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f123085a;

    static {
        int[] iArr = new int[WorkerState.values().length];
        f123085a = iArr;
        iArr[WorkerState.PARKING.ordinal()] = 1;
        f123085a[WorkerState.BLOCKING.ordinal()] = 2;
        f123085a[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
        f123085a[WorkerState.RETIRING.ordinal()] = 4;
        f123085a[WorkerState.TERMINATED.ordinal()] = 5;
    }
}

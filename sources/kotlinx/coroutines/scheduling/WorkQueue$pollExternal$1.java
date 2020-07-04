package kotlinx.coroutines.scheduling;

import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class WorkQueue$pollExternal$1 extends Lambda implements C7562b<C48208h, Boolean> {
    public static final WorkQueue$pollExternal$1 INSTANCE = new WorkQueue$pollExternal$1();

    public WorkQueue$pollExternal$1() {
        super(1);
    }

    public final boolean invoke(C48208h hVar) {
        C7573i.m23587b(hVar, "it");
        return true;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((C48208h) obj));
    }
}

package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48294d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper */
public final class FlowableInternalHelper {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax */
    public enum RequestMax implements C7326g<C48294d> {
        INSTANCE;

        public final void accept(C48294d dVar) throws Exception {
            dVar.request(Long.MAX_VALUE);
        }
    }
}

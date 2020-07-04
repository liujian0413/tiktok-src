package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48100bi;

/* renamed from: kotlinx.coroutines.bn */
public abstract class C48107bn<J extends C48100bi> extends C48220w implements C48081at, C48095bd {

    /* renamed from: b */
    public final J f122966b;

    /* renamed from: b */
    public final boolean mo120293b() {
        return true;
    }

    public final C48117bt cd_() {
        return null;
    }

    /* renamed from: a */
    public final void mo120281a() {
        J j = this.f122966b;
        if (j != null) {
            ((C48108bo) j).mo120336a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }

    public C48107bn(J j) {
        C7573i.m23587b(j, "job");
        this.f122966b = j;
    }
}

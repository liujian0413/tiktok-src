package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47923d;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.p1885a.C48049a;
import kotlinx.coroutines.p1885a.C48050b;

public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    public final <T> void invoke(C7562b<? super C47919b<? super T>, ? extends Object> bVar, C47919b<? super T> bVar2) {
        C7573i.m23587b(bVar, "block");
        C7573i.m23587b(bVar2, "completion");
        switch (C48058af.f122904a[ordinal()]) {
            case 1:
                C48049a.m149005a(bVar, bVar2);
                return;
            case 2:
                C47923d.m148865a(bVar, bVar2);
                return;
            case 3:
                C48050b.m149008a(bVar, bVar2);
                return;
            case 4:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final <R, T> void invoke(C7563m<? super R, ? super C47919b<? super T>, ? extends Object> mVar, R r, C47919b<? super T> bVar) {
        C7573i.m23587b(mVar, "block");
        C7573i.m23587b(bVar, "completion");
        switch (C48058af.f122905b[ordinal()]) {
            case 1:
                C48049a.m149006a(mVar, r, bVar);
                return;
            case 2:
                C47923d.m148866a(mVar, r, bVar);
                return;
            case 3:
                C48050b.m149009a(mVar, r, bVar);
                return;
            case 4:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

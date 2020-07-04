package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchOperationInfo */
public final class SearchOperationInfo implements Serializable {
    @C6593c(mo15949a = "activity")
    private SearchOperation operation;

    public static /* synthetic */ SearchOperationInfo copy$default(SearchOperationInfo searchOperationInfo, SearchOperation searchOperation, int i, Object obj) {
        if ((i & 1) != 0) {
            searchOperation = searchOperationInfo.operation;
        }
        return searchOperationInfo.copy(searchOperation);
    }

    public final SearchOperation component1() {
        return this.operation;
    }

    public final SearchOperationInfo copy(SearchOperation searchOperation) {
        C7573i.m23587b(searchOperation, "operation");
        return new SearchOperationInfo(searchOperation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.operation, (java.lang.Object) ((com.p280ss.android.ugc.aweme.discover.model.SearchOperationInfo) r2).operation) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.discover.model.SearchOperationInfo
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.model.SearchOperationInfo r2 = (com.p280ss.android.ugc.aweme.discover.model.SearchOperationInfo) r2
            com.ss.android.ugc.aweme.discover.model.SearchOperation r0 = r1.operation
            com.ss.android.ugc.aweme.discover.model.SearchOperation r2 = r2.operation
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.SearchOperationInfo.equals(java.lang.Object):boolean");
    }

    public final SearchOperation getOperation() {
        return this.operation;
    }

    public final int hashCode() {
        SearchOperation searchOperation = this.operation;
        if (searchOperation != null) {
            return searchOperation.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchOperationInfo(operation=");
        sb.append(this.operation);
        sb.append(")");
        return sb.toString();
    }

    public final void setOperation(SearchOperation searchOperation) {
        C7573i.m23587b(searchOperation, "<set-?>");
        this.operation = searchOperation;
    }

    public SearchOperationInfo(SearchOperation searchOperation) {
        C7573i.m23587b(searchOperation, "operation");
        this.operation = searchOperation;
    }
}

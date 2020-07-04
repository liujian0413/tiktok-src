package com.p280ss.android.ugc.aweme.discover.model;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import kotlin.TypeCastException;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateData */
public final class SearchStateData extends C0063u {
    private C0052o<Integer> searchStateData;

    public final C0052o<Integer> getSearchState() {
        if (this.searchStateData == null) {
            this.searchStateData = new C0052o<>();
        }
        C0052o<Integer> oVar = this.searchStateData;
        if (oVar != null) {
            return oVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.MutableLiveData<kotlin.Int>");
    }
}

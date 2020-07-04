package com.p280ss.android.ugc.aweme.commercialize.search;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView_LifecycleAdapter */
public class SearchAdDownloadItemView_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final SearchAdDownloadItemView f66085a;

    SearchAdDownloadItemView_LifecycleAdapter(SearchAdDownloadItemView searchAdDownloadItemView) {
        this.f66085a = searchAdDownloadItemView;
    }

    /* renamed from: a */
    public final void mo108a(C0043i iVar, Event event, boolean z, C0051n nVar) {
        boolean z2;
        if (nVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && event == Event.ON_RESUME) {
            if (!z2 || nVar.mo124a("onResume", 1)) {
                this.f66085a.onResume();
            }
        }
    }
}

package com.p280ss.android.ugc.aweme.utils.p1693b;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.p280ss.android.ugc.aweme.utils.p1693b.C42964a.C42965a;

/* renamed from: com.ss.android.ugc.aweme.utils.b.b */
public final class C42966b extends Fragment {

    /* renamed from: a */
    private SparseArray<C42965a> f111528a = new SparseArray<>();

    public final void onDestroy() {
        super.onDestroy();
        if (this.f111528a != null) {
            this.f111528a.clear();
            this.f111528a = null;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    /* renamed from: a */
    public final void mo104675a(Intent intent, int i, C42965a aVar) {
        this.f111528a.put(i, aVar);
        startActivityForResult(intent, i);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f111528a != null) {
            C42965a aVar = (C42965a) this.f111528a.get(i);
            if (aVar != null) {
                aVar.mo57302a(i, i2, intent);
                this.f111528a.remove(i);
            }
        }
    }
}

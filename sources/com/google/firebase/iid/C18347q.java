package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.q */
final class C18347q extends C18346p<Bundle> {
    C18347q(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo47263a() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47262a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo47265a(bundle2);
    }
}

package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.o */
final class C18345o extends C18346p<Void> {
    C18345o(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo47263a() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47262a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo47265a(null);
        } else {
            mo47264a(new zzal(4, "Invalid response to one way request"));
        }
    }
}

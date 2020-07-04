package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class azw extends azv<FieldDescriptorType, Object> {
    azw(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo40361a() {
        if (!this.f41286a) {
            for (int i = 0; i < mo40362b(); i++) {
                Entry b = mo40363b(i);
                if (((axo) b.getKey()).mo40272d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : mo40364c()) {
                if (((axo) entry.getKey()).mo40272d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo40361a();
    }
}

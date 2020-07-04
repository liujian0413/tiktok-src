package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.je */
final class C16637je extends C16636jd<FieldDescriptorType, Object> {
    C16637je(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo43007a() {
        if (!this.f46498a) {
            for (int i = 0; i < mo43008b(); i++) {
                Entry b = mo43009b(i);
                if (((C16572gz) b.getKey()).mo42918d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : mo43010c()) {
                if (((C16572gz) entry.getKey()).mo42918d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo43007a();
    }
}

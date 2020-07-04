package com.facebook.keyframes.model;

import com.facebook.keyframes.model.keyframedmodels.KeyFramedGradient;
import com.facebook.keyframes.model.keyframedmodels.KeyFramedGradient.Position;
import com.facebook.keyframes.p733b.C14011c;

/* renamed from: com.facebook.keyframes.model.h */
public final class C14048h {

    /* renamed from: a */
    public final KeyFramedGradient f37108a;

    /* renamed from: b */
    public final KeyFramedGradient f37109b;

    /* renamed from: com.facebook.keyframes.model.h$a */
    public static class C14049a {

        /* renamed from: a */
        public C14050i f37110a;

        /* renamed from: b */
        public C14050i f37111b;

        /* renamed from: a */
        public final C14048h mo33700a() {
            return new C14048h(this.f37110a, this.f37111b);
        }
    }

    public C14048h(C14050i iVar, C14050i iVar2) {
        boolean z;
        boolean z2 = false;
        if (iVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.f37108a = KeyFramedGradient.m41431a((C14050i) C14011c.m41368a(iVar, z, "color_start"), Position.START);
        if (iVar2 != null) {
            z2 = true;
        }
        this.f37109b = KeyFramedGradient.m41431a((C14050i) C14011c.m41368a(iVar2, z2, "color_end"), Position.END);
    }
}

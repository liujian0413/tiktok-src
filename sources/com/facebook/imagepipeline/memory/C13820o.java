package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.C13318c;
import com.facebook.common.references.C13326a;
import com.facebook.common.references.C13329c;

/* renamed from: com.facebook.imagepipeline.memory.o */
public final class C13820o {

    /* renamed from: a */
    final C13822a f36667a;

    /* renamed from: b */
    private final C13329c<byte[]> f36668b;

    /* renamed from: com.facebook.imagepipeline.memory.o$a */
    static class C13822a extends C13823p {
        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final C13808e<byte[]> mo33397e(int i) {
            return new C13833z(mo33395d(i), this.f36590b.f36645g, 0);
        }

        public C13822a(C13318c cVar, C13803ad adVar, C13804ae aeVar) {
            super(cVar, adVar, aeVar);
        }
    }

    /* renamed from: a */
    public final void mo33448a(byte[] bArr) {
        this.f36667a.mo32582a(bArr);
    }

    /* renamed from: a */
    public final C13326a<byte[]> mo33447a(int i) {
        return C13326a.m38996a(this.f36667a.mo32581a(i), this.f36668b);
    }

    public C13820o(C13318c cVar, C13803ad adVar) {
        boolean z;
        if (adVar.f36645g > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        this.f36667a = new C13822a(cVar, adVar, C13832y.m40855a());
        this.f36668b = new C13329c<byte[]>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo32582a(byte[] bArr) {
                C13820o.this.mo33448a(bArr);
            }
        };
    }
}

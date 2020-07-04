package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C15267r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.bm */
final class C16420bm {

    /* renamed from: a */
    public int f45970a;

    /* renamed from: b */
    private ByteArrayOutputStream f45971b = new ByteArrayOutputStream();

    /* renamed from: c */
    private final /* synthetic */ C16418bk f45972c;

    public C16420bm(C16418bk bkVar) {
        this.f45972c = bkVar;
    }

    /* renamed from: a */
    public final boolean mo42548a(C16412be beVar) {
        C15267r.m44384a(beVar);
        if (this.f45970a + 1 > C16398ar.m53435g()) {
            return false;
        }
        String a = this.f45972c.mo42545a(beVar, false);
        if (a == null) {
            this.f45972c.mo43205i().mo42538a(beVar, "Error formatting hit");
            return true;
        }
        byte[] bytes = a.getBytes();
        int length = bytes.length;
        if (length > C16398ar.m53431c()) {
            this.f45972c.mo43205i().mo42538a(beVar, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.f45971b.size() > 0) {
            length++;
        }
        if (this.f45971b.size() + length > ((Integer) C16406az.f45937t.f45945a).intValue()) {
            return false;
        }
        try {
            if (this.f45971b.size() > 0) {
                this.f45971b.write(C16418bk.f45967d);
            }
            this.f45971b.write(bytes);
            this.f45970a++;
            return true;
        } catch (IOException e) {
            this.f45972c.mo43201e("Failed to write payload when batching hits", e);
            return true;
        }
    }

    /* renamed from: a */
    public final byte[] mo42549a() {
        return this.f45971b.toByteArray();
    }
}

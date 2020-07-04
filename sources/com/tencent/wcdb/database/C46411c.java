package com.tencent.wcdb.database;

import java.io.Closeable;

/* renamed from: com.tencent.wcdb.database.c */
public abstract class C46411c implements Closeable {

    /* renamed from: a */
    private int f119530a = 1;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo115353c();

    public void close() {
        mo115484e();
    }

    /* renamed from: e */
    public final void mo115484e() {
        boolean z;
        synchronized (this) {
            z = true;
            int i = this.f119530a - 1;
            this.f119530a = i;
            if (i != 0) {
                z = false;
            }
        }
        if (z) {
            mo115353c();
        }
    }

    /* renamed from: d */
    public final void mo115483d() {
        synchronized (this) {
            if (this.f119530a > 0) {
                this.f119530a++;
            } else {
                StringBuilder sb = new StringBuilder("attempt to re-open an already-closed object: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}

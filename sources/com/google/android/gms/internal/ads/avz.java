package com.google.android.gms.internal.ads;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

final class avz extends avw {

    /* renamed from: a */
    private final avx f41120a = new avx();

    avz() {
    }

    /* renamed from: a */
    public final void mo40074a(Throwable th) {
        List a = this.f41120a.mo40076a(th, false);
        if (a != null) {
            synchronized (a) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    it.next();
                    System.err.print("Suppressed: ");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40075a(Throwable th, PrintWriter printWriter) {
        C6497a.m20180a(th, printWriter);
        List<Throwable> a = this.f41120a.mo40076a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printWriter.print("Suppressed: ");
                    C6497a.m20180a(th2, printWriter);
                }
            }
        }
    }
}

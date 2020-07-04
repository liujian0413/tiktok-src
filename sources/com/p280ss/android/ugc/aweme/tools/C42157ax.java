package com.p280ss.android.ugc.aweme.tools;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.ax */
public final class C42157ax {

    /* renamed from: a */
    private final List<C42161ba> f109691a = new ArrayList();

    /* renamed from: b */
    private boolean f109692b;

    /* renamed from: c */
    private PrintWriter f109693c;

    /* renamed from: a */
    public final C42156aw mo103595a() {
        PrintWriter printWriter;
        Collections.reverse(this.f109691a);
        List<C42161ba> list = this.f109691a;
        boolean z = this.f109692b;
        if (!this.f109692b) {
            printWriter = null;
        } else if (this.f109693c == null) {
            printWriter = new PrintWriter(System.out);
        } else {
            printWriter = this.f109693c;
        }
        return new C42156aw(list, z, printWriter);
    }

    /* renamed from: a */
    public final C42157ax mo103597a(PrintWriter printWriter) {
        this.f109693c = printWriter;
        return this;
    }

    /* renamed from: a */
    public final C42157ax mo103596a(C42161ba baVar) {
        this.f109691a.add(baVar);
        return this;
    }

    /* renamed from: a */
    public final C42157ax mo103598a(boolean z) {
        this.f109692b = z;
        return this;
    }
}

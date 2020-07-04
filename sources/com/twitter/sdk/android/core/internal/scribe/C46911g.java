package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.C1642a;
import com.twitter.sdk.android.core.internal.C46869g;
import com.twitter.sdk.android.core.internal.C46870h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.g */
public abstract class C46911g<T> {

    /* renamed from: a */
    protected final Context f120292a;

    /* renamed from: b */
    protected final C46910f<T> f120293b;

    /* renamed from: c */
    protected final C46870h f120294c;

    /* renamed from: d */
    protected final C46918m f120295d;

    /* renamed from: e */
    public final int f120296e;

    /* renamed from: f */
    public volatile long f120297f;

    /* renamed from: g */
    protected final List<C46919n> f120298g = new CopyOnWriteArrayList();

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.g$a */
    static class C46912a {

        /* renamed from: a */
        final File f120299a;

        /* renamed from: b */
        final long f120300b;

        C46912a(File file, long j) {
            this.f120299a = file;
            this.f120300b = j;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo118046b();

    /* renamed from: c */
    public final List<File> mo118047c() {
        return this.f120295d.mo118057a(1);
    }

    /* renamed from: d */
    public final void mo118048d() {
        List<File> c = this.f120295d.mo118063c();
        int i = this.f120296e;
        if (c.size() > i) {
            int size = c.size() - i;
            C46869g.m146602a(this.f120292a, C1642a.m8035a(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(c.size()), Integer.valueOf(i), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(C46913h.f120301a);
            for (File file : c) {
                treeSet.add(new C46912a(file, m146732b(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C46912a) it.next()).f120299a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.f120295d.mo118059a((List<File>) arrayList);
        }
    }

    /* renamed from: a */
    public final boolean mo118045a() throws IOException {
        String str;
        boolean z = true;
        if (!this.f120295d.mo118062b()) {
            str = mo118046b();
            this.f120295d.mo118058a(str);
            C46869g.m146601a(this.f120292a, 4, "Twitter", C1642a.m8035a(Locale.US, "generated new file %s", new Object[]{str}));
            this.f120297f = this.f120294c.mo117970a();
        } else {
            str = null;
            z = false;
        }
        m146731a(str);
        return z;
    }

    /* renamed from: a */
    public final void mo118042a(C46919n nVar) {
        this.f120298g.add(nVar);
    }

    /* renamed from: a */
    private void m146731a(String str) {
        for (C46919n a : this.f120298g) {
            try {
                a.mo118052a(str);
            } catch (Exception e) {
                C46869g.m146603a(this.f120292a, "One of the roll over listeners threw an exception", (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    private static long m146732b(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private void m146730a(int i) throws IOException {
        if (!this.f120295d.mo118061a(i, 8000)) {
            C46869g.m146601a(this.f120292a, 4, "Twitter", C1642a.m8035a(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.f120295d.mo118056a()), Integer.valueOf(i), Integer.valueOf(8000)}));
            mo118045a();
        }
    }

    /* renamed from: a */
    public final void mo118043a(T t) throws IOException {
        byte[] a = this.f120293b.mo118041a(t);
        m146730a(a.length);
        this.f120295d.mo118060a(a);
    }

    /* renamed from: a */
    public final void mo118044a(List<File> list) {
        this.f120295d.mo118059a(list);
    }

    /* renamed from: a */
    static final /* synthetic */ int m146729a(C46912a aVar, C46912a aVar2) {
        return (int) (aVar.f120300b - aVar2.f120300b);
    }

    C46911g(Context context, C46910f<T> fVar, C46870h hVar, C46918m mVar, int i) throws IOException {
        this.f120292a = context.getApplicationContext();
        this.f120293b = fVar;
        this.f120295d = mVar;
        this.f120294c = hVar;
        this.f120297f = this.f120294c.mo117970a();
        this.f120296e = i;
    }
}

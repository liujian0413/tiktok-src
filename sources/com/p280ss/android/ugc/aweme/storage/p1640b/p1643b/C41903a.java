package com.p280ss.android.ugc.aweme.storage.p1640b.p1643b;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.b.b.a */
public final class C41903a {

    /* renamed from: a */
    private final AtomicBoolean f108978a = new AtomicBoolean(false);

    /* renamed from: b */
    private final List<C41908c> f108979b = new ArrayList();

    /* renamed from: a */
    private boolean m133265a() {
        return this.f108978a.get();
    }

    /* renamed from: b */
    private final void m133266b() {
        this.f108978a.set(true);
    }

    /* renamed from: c */
    private final void m133267c() {
        this.f108978a.set(false);
    }

    /* renamed from: a */
    public final void mo102941a(C41908c cVar) {
        C7573i.m23587b(cVar, "pipeline");
        if (!this.f108979b.contains(cVar)) {
            this.f108979b.add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo102943a(String str) {
        if (str != null) {
            mo102942a(C35574k.m114859a().mo70094i().mo102932c().mo102928a(str));
        }
    }

    /* renamed from: a */
    public final void mo102942a(File file) {
        boolean z;
        if (!m133265a() && file != null && file.exists()) {
            m133266b();
            for (C41908c a : this.f108979b) {
                a.mo102944a(file, true);
            }
            if (!file.isDirectory()) {
                m133267c();
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (!linkedList.isEmpty() && m133265a()) {
                File file2 = (File) linkedList.remove();
                if (file2.exists()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            for (File file3 : listFiles) {
                                if (file3 != null && file3.exists()) {
                                    for (C41908c a2 : this.f108979b) {
                                        a2.mo102944a(file3, false);
                                    }
                                    if (file3.isDirectory()) {
                                        linkedList.add(file3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            m133267c();
        }
    }
}

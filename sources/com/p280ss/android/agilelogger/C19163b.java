package com.p280ss.android.agilelogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.agilelogger.ALog.C6727a;
import com.p280ss.android.agilelogger.p839c.C19169a;
import com.p280ss.android.agilelogger.p839c.C19169a.C19170a;
import com.p280ss.android.agilelogger.p839c.C19171b;
import com.p280ss.android.agilelogger.p839c.C19172c;
import com.p280ss.android.agilelogger.p840d.C19174a;
import com.p280ss.android.agilelogger.p840d.C19174a.C19175a;
import com.p280ss.android.agilelogger.utils.C19195a;
import com.p280ss.android.agilelogger.utils.C19206j;
import com.p280ss.android.agilelogger.utils.C19207k;
import com.p280ss.android.agilelogger.utils.C19210n;
import com.p280ss.android.agilelogger.utils.FormatUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.agilelogger.b */
public final class C19163b extends Thread {

    /* renamed from: a */
    public volatile C19159a f51808a;

    /* renamed from: b */
    public volatile C19174a f51809b;

    /* renamed from: c */
    public ConcurrentLinkedQueue<C19178e> f51810c;

    /* renamed from: d */
    private final Object f51811d = new Object();

    /* renamed from: e */
    private volatile boolean f51812e = true;

    /* renamed from: f */
    private volatile boolean f51813f;

    /* renamed from: g */
    private volatile Set<String> f51814g = null;

    /* renamed from: h */
    private C6727a f51815h;

    /* renamed from: a */
    public final void mo50876a() {
        if (!this.f51813f) {
            synchronized (this.f51811d) {
                this.f51811d.notify();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f51813f = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            super.run()
        L_0x0003:
            boolean r0 = r4.f51812e
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r4.f51811d
            monitor-enter(r0)
            r1 = 1
            r4.f51813f = r1     // Catch:{ all -> 0x002a }
            r2 = 0
            java.util.concurrent.ConcurrentLinkedQueue<com.ss.android.agilelogger.e> r3 = r4.f51810c     // Catch:{ InterruptedException -> 0x0026 }
            java.lang.Object r3 = r3.poll()     // Catch:{ InterruptedException -> 0x0026 }
            com.ss.android.agilelogger.e r3 = (com.p280ss.android.agilelogger.C19178e) r3     // Catch:{ InterruptedException -> 0x0026 }
            if (r3 != 0) goto L_0x0022
            r4.f51813f = r2     // Catch:{ InterruptedException -> 0x0026 }
            java.lang.Object r3 = r4.f51811d     // Catch:{ InterruptedException -> 0x0026 }
            r3.wait()     // Catch:{ InterruptedException -> 0x0026 }
            r4.f51813f = r1     // Catch:{ InterruptedException -> 0x0026 }
            goto L_0x0028
        L_0x0022:
            r4.m62837e(r3)     // Catch:{ InterruptedException -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r4.f51813f = r2     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            goto L_0x0003
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.agilelogger.C19163b.run():void");
    }

    /* renamed from: b */
    private void m62833b() {
        if (TextUtils.isEmpty(this.f51808a.f51789c)) {
            ALog.m20870e();
            return;
        }
        Context a = ALog.m20846a();
        m62831a(a, new File(this.f51808a.f51790d));
        C19169a a2 = new C19170a(a).mo50895b(this.f51808a.f51790d).mo50894b(this.f51808a.f51793g).mo50891a(new File(this.f51808a.f51789c, C19195a.m62911b(a)).getAbsolutePath()).mo50892a(this.f51808a.f51791e).mo50896b(this.f51808a.f51792f).mo50890a(this.f51808a.f51794h).mo50897c(this.f51808a.f51795i).mo50898d(this.f51808a.f51787a).mo50893a();
        this.f51809b = new C19175a().mo50908a(a2).f51839a;
        if (this.f51815h != null) {
            a2.mo50889f();
        }
        if (this.f51814g != null) {
            this.f51809b.mo50906a(this.f51814g);
        }
        if (ALog.m20866c().size() != 0) {
            for (C19172c cVar : this.f51809b.f51837a) {
                if (cVar instanceof C19169a) {
                    for (C19173d dVar : ALog.m20866c()) {
                        if (dVar != null) {
                            dVar.mo50902a(((C19169a) cVar).mo50886c());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m62834b(C19178e eVar) {
        if (this.f51809b != null) {
            this.f51809b.mo50903a();
        }
    }

    /* renamed from: a */
    public final void mo50877a(Queue<C19178e> queue) {
        if (queue != null && queue.size() != 0) {
            this.f51810c.addAll(queue);
        }
    }

    /* renamed from: c */
    private void m62835c(C19178e eVar) {
        if (this.f51808a != null) {
            this.f51808a.f51793g = ((Integer) eVar.f51853h).intValue();
        }
        if (this.f51809b != null) {
            List<C19172c> list = this.f51809b.f51837a;
            if (list != null) {
                for (C19172c cVar : list) {
                    if (cVar instanceof C19171b) {
                        ((C19171b) cVar).mo50899a(((Integer) eVar.f51853h).intValue());
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m62836d(C19178e eVar) {
        C19206j.m62943a();
        List<C19172c> list = this.f51809b.f51837a;
        if (list != null) {
            for (C19172c cVar : list) {
                if (cVar instanceof C19169a) {
                    ((C19169a) cVar).mo50884a(false);
                }
            }
        }
    }

    /* renamed from: e */
    private void m62837e(C19178e eVar) {
        switch (eVar.f51846a) {
            case 0:
                m62833b();
                break;
            case 1:
                m62832a(eVar);
                break;
            case 2:
                m62834b(eVar);
                break;
            case 3:
                m62835c(eVar);
                break;
            case 4:
                m62836d(eVar);
                break;
        }
        eVar.mo50909b();
    }

    /* renamed from: a */
    private void m62832a(C19178e eVar) {
        if ((eVar instanceof C19178e) && this.f51809b != null) {
            String str = "";
            switch (eVar.f51852g) {
                case MSG:
                    str = (String) eVar.f51853h;
                    break;
                case STACKTRACE_STR:
                    if (eVar.f51854i != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(eVar.f51854i);
                        sb.append(C19207k.m62944a((Throwable) eVar.f51853h));
                        str = sb.toString();
                        break;
                    } else {
                        str = C19207k.m62944a((Throwable) eVar.f51853h);
                        break;
                    }
                case BORDER:
                    str = FormatUtils.m62906a(eVar.f51852g, (String) eVar.f51853h);
                    break;
                case JSON:
                    str = FormatUtils.m62906a(eVar.f51852g, (String) eVar.f51853h);
                    break;
                case BUNDLE:
                    str = FormatUtils.m62905a(eVar.f51852g, (Bundle) eVar.f51853h);
                    break;
                case INTENT:
                    str = FormatUtils.m62904a(eVar.f51852g, (Intent) eVar.f51853h);
                    break;
                case THROWABLE:
                    str = FormatUtils.m62908a(eVar.f51852g, (Throwable) eVar.f51853h);
                    break;
                case THREAD:
                    str = FormatUtils.m62907a(eVar.f51852g, (Thread) eVar.f51853h);
                    break;
                case STACKTRACE:
                    str = FormatUtils.m62909a(eVar.f51852g, (StackTraceElement[]) eVar.f51853h);
                    break;
            }
            eVar.f51849d = str;
            this.f51809b.mo50905a(eVar);
        }
    }

    /* renamed from: a */
    private void m62831a(Context context, File file) {
        final int a = C19210n.m62946a(context);
        if (file.exists()) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    boolean z;
                    if (str.endsWith(".hot") || str.endsWith(".hoting")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int a = C19210n.m62947a(str);
                    if (!z || a <= a) {
                        return false;
                    }
                    return true;
                }
            });
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        file2.delete();
                    }
                }
            }
        }
    }

    public C19163b(String str, C19159a aVar, C6727a aVar2) {
        super(str);
        this.f51808a = aVar;
        this.f51810c = new ConcurrentLinkedQueue<>();
        C19178e eVar = new C19178e();
        eVar.f51846a = 0;
        this.f51810c.add(eVar);
        this.f51815h = aVar2;
    }
}

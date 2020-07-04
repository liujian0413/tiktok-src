package com.bytedance.apm.p244g;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.frameworks.core.thread.C6370a;
import com.bytedance.frameworks.core.thread.C6371c;
import java.util.LinkedList;

/* renamed from: com.bytedance.apm.g.a */
public final class C6205a {

    /* renamed from: a */
    public final LinkedList<C6211d> f18271a = new LinkedList<>();

    /* renamed from: b */
    private volatile boolean f18272b = false;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14939a() {
        if (!this.f18272b) {
            if (ApmDelegate.getInstance().isConfigReady()) {
                this.f18272b = true;
            }
            C6370a.m19801a();
            C6370a.m19802a(new C6371c() {
                public final void run() {
                    try {
                        if (ApmDelegate.getInstance().isConfigReady()) {
                            LinkedList linkedList = new LinkedList();
                            synchronized (C6205a.this.f18271a) {
                                linkedList.addAll(C6205a.this.f18271a);
                                C6205a.this.f18271a.clear();
                            }
                            while (!linkedList.isEmpty()) {
                                C6211d dVar = (C6211d) linkedList.poll();
                                if (dVar != null) {
                                    C6207b.m19278a().mo14943a(dVar.f18286a, dVar.f18287b, null, false);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14940a(String str, String str2) {
        if (!this.f18272b) {
            synchronized (this.f18271a) {
                if (this.f18271a.size() > 40) {
                    this.f18271a.poll();
                }
                this.f18271a.add(new C6211d(str, str2));
            }
        }
    }
}

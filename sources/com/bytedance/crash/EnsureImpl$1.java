package com.bytedance.crash;

import com.bytedance.crash.p496e.C9882a;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Collection;
import java.util.Map;

class EnsureImpl$1 implements IEnsure {
    final /* synthetic */ C9881e this$0;

    public void ensureNotReachHere() {
        C9881e.m29150a((String) null, "EnsureNotReachHere", null);
    }

    public void reportLogException(Throwable th) {
        ensureNotReachHere(th);
    }

    EnsureImpl$1(C9881e eVar) {
        this.this$0 = eVar;
    }

    public boolean ensureFalse(boolean z) {
        if (z) {
            C9881e.m29150a((String) null, "EnsureFalse", null);
        }
        return z;
    }

    public boolean ensureNotNull(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C9881e.m29150a((String) null, "EnsureNotNull", null);
        }
        return z;
    }

    public void ensureNotReachHere(String str) {
        C9881e.m29150a(str, "EnsureNotReachHere", null);
    }

    public boolean ensureTrue(boolean z) {
        if (!z) {
            C9881e.m29150a((String) null, "EnsureTrue", null);
        }
        return z;
    }

    public boolean ensureNotEmpty(Collection collection) {
        boolean z;
        if (collection == null || collection.size() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C9881e.m29150a((String) null, "EnsureNotEmpty", null);
        }
        return z;
    }

    public void ensureNotReachHere(Throwable th) {
        if (C9881e.m29151a(th)) {
            C9882a.m29161a(Thread.currentThread().getStackTrace(), 5, th, (String) null, true);
        }
    }

    public void reportLogException(Throwable th, String str) {
        ensureNotReachHere(th, str);
    }

    public boolean ensureFalse(boolean z, String str) {
        if (z) {
            C9881e.m29150a(str, "EnsureFalse", null);
        }
        return z;
    }

    public boolean ensureNotNull(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C9881e.m29150a(str, "EnsureNotNull", null);
        }
        return z;
    }

    public void ensureNotReachHere(String str, Map<String, String> map) {
        C9881e.m29150a(str, "EnsureNotReachHere", map);
    }

    public boolean ensureTrue(boolean z, String str) {
        if (!z) {
            C9881e.m29150a(str, "EnsureTrue", null);
        }
        return z;
    }

    public void ensureNotReachHere(Throwable th, String str) {
        if (C9881e.m29151a(th)) {
            C9882a.m29161a(Thread.currentThread().getStackTrace(), 5, th, str, true);
        }
    }

    public boolean ensureFalse(boolean z, String str, Map<String, String> map) {
        if (z) {
            C9881e.m29150a(str, "EnsureFalse", map);
        }
        return z;
    }

    public boolean ensureTrue(boolean z, String str, Map<String, String> map) {
        if (!z) {
            C9881e.m29150a(str, "EnsureTrue", map);
        }
        return z;
    }

    public void reportLogException(int i, Throwable th, String str) {
        this.this$0.mo24451a(i, th, str);
    }

    public void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        if (C9881e.m29151a(th)) {
            C9882a.m29162a(Thread.currentThread().getStackTrace(), 5, th, str, true, map);
        }
    }
}

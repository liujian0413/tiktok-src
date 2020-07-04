package org.chromium;

import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;

/* renamed from: org.chromium.f */
public class C48317f implements ICronetDepend {

    /* renamed from: a */
    private static C48317f f123369a;

    /* renamed from: b */
    private ICronetDepend f123370b;

    private C48317f() {
    }

    public String getSsCookieKey() {
        if (this.f123370b != null) {
            return this.f123370b.getSsCookieKey();
        }
        return "X-SS-Cookie";
    }

    public boolean loggerDebug() {
        if (this.f123370b != null) {
            return this.f123370b.loggerDebug();
        }
        return false;
    }

    /* renamed from: a */
    public static C48317f m149883a() {
        if (f123369a == null) {
            synchronized (C48317f.class) {
                if (f123369a == null) {
                    f123369a = new C48317f();
                }
            }
        }
        return f123369a;
    }

    public void setAdapter(ICronetDepend iCronetDepend) {
        this.f123370b = iCronetDepend;
    }

    public void loggerD(String str, String str2) {
        if (this.f123370b != null) {
            this.f123370b.loggerD(str, str2);
        }
    }
}

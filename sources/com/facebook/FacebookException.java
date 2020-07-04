package com.facebook;

import com.C1642a;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.C13860a;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.p729a.p731b.C13872b;
import java.util.Random;

public class FacebookException extends RuntimeException {
    static final long serialVersionUID = 1;

    public FacebookException() {
    }

    public String toString() {
        return getMessage();
    }

    public FacebookException(Throwable th) {
        super(th);
    }

    public FacebookException(final String str) {
        super(str);
        Random random = new Random();
        if (str != null && C13499h.m39710a() && random.nextInt(100) > 50) {
            FeatureManager.m40932a(Feature.ErrorReport, new C13860a() {
                /* renamed from: a */
                public final void mo31778a(boolean z) {
                    if (z) {
                        try {
                            C13872b.m40970a(str);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(String str, Object... objArr) {
        this(C1642a.m8034a(str, objArr));
    }
}

package com.twitter.sdk.android.core.internal.p1846b;

import android.content.Context;
import java.io.File;

/* renamed from: com.twitter.sdk.android.core.internal.b.a */
public final class C46860a {

    /* renamed from: a */
    private final Context f120168a;

    /* renamed from: a */
    public final File mo117959a() {
        return m146572a(this.f120168a.getFilesDir());
    }

    public C46860a(Context context) {
        if (context != null) {
            this.f120168a = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    /* renamed from: a */
    private static File m146572a(File file) {
        if (file == null || (!file.exists() && !file.mkdirs())) {
            return null;
        }
        return file;
    }
}

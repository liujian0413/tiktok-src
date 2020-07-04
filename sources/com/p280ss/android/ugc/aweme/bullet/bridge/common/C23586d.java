package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.d */
final /* synthetic */ class C23586d implements Callable {

    /* renamed from: a */
    private final UploadFileMethod f62236a;

    /* renamed from: b */
    private final File f62237b;

    C23586d(UploadFileMethod uploadFileMethod, File file) {
        this.f62236a = uploadFileMethod;
        this.f62237b = file;
    }

    public final Object call() {
        return this.f62236a.mo61502a(this.f62237b);
    }
}

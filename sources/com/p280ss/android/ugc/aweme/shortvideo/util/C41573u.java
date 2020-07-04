package com.p280ss.android.ugc.aweme.shortvideo.util;

import com.p280ss.android.ugc.aweme.services.IShortVideoConfig;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.u */
final /* synthetic */ class C41573u implements FileFilter {

    /* renamed from: a */
    private final IShortVideoConfig f108043a;

    C41573u(IShortVideoConfig iShortVideoConfig) {
        this.f108043a = iShortVideoConfig;
    }

    public final boolean accept(File file) {
        return C41564p.m132371a(this.f108043a, file);
    }
}

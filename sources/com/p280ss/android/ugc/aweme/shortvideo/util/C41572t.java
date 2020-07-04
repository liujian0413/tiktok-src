package com.p280ss.android.ugc.aweme.shortvideo.util;

import com.p280ss.android.ugc.aweme.services.IShortVideoConfig;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.t */
final /* synthetic */ class C41572t implements FileFilter {

    /* renamed from: a */
    private final IShortVideoConfig f108042a;

    C41572t(IShortVideoConfig iShortVideoConfig) {
        this.f108042a = iShortVideoConfig;
    }

    public final boolean accept(File file) {
        return C41564p.m132380b(this.f108042a, file);
    }
}

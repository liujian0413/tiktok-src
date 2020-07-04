package com.p280ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "new_download_ux")
/* renamed from: com.ss.android.ugc.aweme.share.libra.LongVideoDownloadOptimize */
public final class LongVideoDownloadOptimize {
    @C6382b(mo15285a = true)
    private static final boolean DISABLE_NEW_STYLE = false;
    @C6382b
    private static final boolean ENABLE_NEW_STYLE = true;
    public static final LongVideoDownloadOptimize INSTANCE = new LongVideoDownloadOptimize();

    private LongVideoDownloadOptimize() {
    }

    public final boolean getDISABLE_NEW_STYLE() {
        return DISABLE_NEW_STYLE;
    }

    public final boolean getENABLE_NEW_STYLE() {
        return ENABLE_NEW_STYLE;
    }

    public final boolean enable() {
        return C6384b.m19835a().mo15292a(LongVideoDownloadOptimize.class, true, "new_download_ux", C6384b.m19835a().mo15295d().new_download_ux, false);
    }
}

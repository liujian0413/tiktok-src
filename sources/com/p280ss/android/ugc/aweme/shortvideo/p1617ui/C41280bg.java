package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionDataRepo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bg */
final /* synthetic */ class C41280bg implements C0053p {

    /* renamed from: a */
    private final VideoPublishFragment f107532a;

    /* renamed from: b */
    private final ExtensionDataRepo f107533b;

    C41280bg(VideoPublishFragment videoPublishFragment, ExtensionDataRepo extensionDataRepo) {
        this.f107532a = videoPublishFragment;
        this.f107533b = extensionDataRepo;
    }

    public final void onChanged(Object obj) {
        this.f107532a.mo101765a(this.f107533b, (Integer) obj);
    }
}

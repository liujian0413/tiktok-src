package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ci */
final /* synthetic */ class C41310ci implements Runnable {

    /* renamed from: a */
    private final VideoRecordNewActivity f107566a;

    /* renamed from: b */
    private final File f107567b;

    /* renamed from: c */
    private final int f107568c;

    C41310ci(VideoRecordNewActivity videoRecordNewActivity, File file, int i) {
        this.f107566a = videoRecordNewActivity;
        this.f107567b = file;
        this.f107568c = i;
    }

    public final void run() {
        this.f107566a.mo101825a(this.f107567b, this.f107568c);
    }
}

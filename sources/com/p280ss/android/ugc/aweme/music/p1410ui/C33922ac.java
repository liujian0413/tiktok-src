package com.p280ss.android.ugc.aweme.music.p1410ui;

import com.p280ss.android.ugc.aweme.services.IAVService.MusicWaveDataListener;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ac */
final /* synthetic */ class C33922ac implements MusicWaveDataListener {

    /* renamed from: a */
    private final C34018y f88520a;

    /* renamed from: b */
    private final MusicModel f88521b;

    /* renamed from: c */
    private final String f88522c;

    /* renamed from: d */
    private final String f88523d;

    C33922ac(C34018y yVar, MusicModel musicModel, String str, String str2) {
        this.f88520a = yVar;
        this.f88521b = musicModel;
        this.f88522c = str;
        this.f88523d = str2;
    }

    public final void onFinish(Object obj) {
        this.f88520a.mo86675a(this.f88521b, this.f88522c, this.f88523d, obj);
    }
}

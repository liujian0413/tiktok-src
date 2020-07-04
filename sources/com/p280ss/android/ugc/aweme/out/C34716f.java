package com.p280ss.android.ugc.aweme.out;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.services.IAVService.MusicWaveDataListener;

/* renamed from: com.ss.android.ugc.aweme.out.f */
final /* synthetic */ class C34716f implements C1591g {

    /* renamed from: a */
    private final MusicWaveDataListener f90515a;

    C34716f(MusicWaveDataListener musicWaveDataListener) {
        this.f90515a = musicWaveDataListener;
    }

    public final Object then(C1592h hVar) {
        return AVServiceImpl.lambda$getAvMusicWaveBean$5$AVServiceImpl(this.f90515a, hVar);
    }
}

package com.p280ss.android.ugc.aweme.out;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.services.IAVService.MusicWaveDataListener;

/* renamed from: com.ss.android.ugc.aweme.out.d */
final /* synthetic */ class C34714d implements C1591g {

    /* renamed from: a */
    private final MusicWaveDataListener f90512a;

    C34714d(MusicWaveDataListener musicWaveDataListener) {
        this.f90512a = musicWaveDataListener;
    }

    public final Object then(C1592h hVar) {
        return AVServiceImpl.lambda$getMusicWaveBean$3$AVServiceImpl(this.f90512a, hVar);
    }
}

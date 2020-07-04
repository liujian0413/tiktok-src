package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C14882a;
import com.google.android.gms.ads.mediation.C14883b;

public interface MediationRewardedVideoAdAdapter extends C14883b {
    void initialize(Context context, C14882a aVar, String str, C14918a aVar2, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(C14882a aVar, Bundle bundle, Bundle bundle2);

    void showVideo();
}

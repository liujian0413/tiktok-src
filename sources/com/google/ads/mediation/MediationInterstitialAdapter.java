package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.C14721e;
import com.google.ads.mediation.MediationServerParameters;

public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends C14721e, SERVER_PARAMETERS extends MediationServerParameters> extends C14711b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(C14720d dVar, Activity activity, SERVER_PARAMETERS server_parameters, C14710a aVar, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}

package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.C14703a;
import com.google.ads.mediation.C14721e;
import com.google.ads.mediation.MediationServerParameters;

public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends C14721e, SERVER_PARAMETERS extends MediationServerParameters> extends C14711b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(C14712c cVar, Activity activity, SERVER_PARAMETERS server_parameters, C14703a aVar, C14710a aVar2, ADDITIONAL_PARAMETERS additional_parameters);
}

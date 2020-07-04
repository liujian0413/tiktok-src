package com.google.ads.mediation;

import com.google.ads.mediation.MediationServerParameters;

/* renamed from: com.google.ads.mediation.b */
public interface C14711b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends MediationServerParameters> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}

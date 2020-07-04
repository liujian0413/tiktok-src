package com.p280ss.android.ugc.aweme.framework.services;

import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IVideoLegalCheckerAndToastService */
public interface IVideoLegalCheckerAndToastService {
    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, C7561a<C7581n> aVar);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, C7562b<? super Integer, C7581n> bVar);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, C7562b<? super Integer, C7581n> bVar);
}

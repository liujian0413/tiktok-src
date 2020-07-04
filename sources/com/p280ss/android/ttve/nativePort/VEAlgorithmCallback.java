package com.p280ss.android.ttve.nativePort;

import com.p280ss.android.ttve.model.VEAlgorithmResult;

/* renamed from: com.ss.android.ttve.nativePort.VEAlgorithmCallback */
public interface VEAlgorithmCallback {
    void onFailed(int i);

    void onResult(VEAlgorithmResult vEAlgorithmResult);
}

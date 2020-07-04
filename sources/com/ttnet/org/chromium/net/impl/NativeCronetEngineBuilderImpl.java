package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;

public class NativeCronetEngineBuilderImpl extends CronetEngineBuilderImpl {
    public ExperimentalCronetEngine build() {
        if (getUserAgent() == null) {
            setUserAgent(getDefaultUserAgent());
        }
        CronetUrlRequestContext cronetUrlRequestContext = new CronetUrlRequestContext(this);
        this.mMockCertVerifier = 0;
        return cronetUrlRequestContext;
    }

    public NativeCronetEngineBuilderImpl(Context context) {
        super(context);
    }
}

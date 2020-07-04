package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;

public class JavaCronetEngineBuilderImpl extends CronetEngineBuilderImpl {
    public ExperimentalCronetEngine build() {
        if (getUserAgent() == null) {
            setUserAgent(getDefaultUserAgent());
        }
        return new JavaCronetEngine(this);
    }

    public JavaCronetEngineBuilderImpl(Context context) {
        super(context);
    }
}

package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.CronetEngine.Builder;
import com.ttnet.org.chromium.net.CronetProvider;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;
import com.ttnet.org.chromium.net.ICronetEngineBuilder;
import java.util.Arrays;

public class JavaCronetProvider extends CronetProvider {
    public String getName() {
        return "Fallback-Cronet-Provider";
    }

    public boolean isEnabled() {
        return true;
    }

    public String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    public Builder createBuilder() {
        return new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) new JavaCronetEngineBuilderImpl(this.mContext));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    public JavaCronetProvider(Context context) {
        super(context);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider) obj).mContext))) {
            return true;
        }
        return false;
    }
}

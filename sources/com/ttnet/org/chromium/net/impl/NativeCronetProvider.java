package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.CronetEngine.Builder;
import com.ttnet.org.chromium.net.CronetProvider;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;
import com.ttnet.org.chromium.net.ICronetEngineBuilder;
import java.util.Arrays;

public class NativeCronetProvider extends CronetProvider {
    public String getName() {
        return "App-Packaged-Cronet-Provider";
    }

    public boolean isEnabled() {
        return true;
    }

    public String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    public Builder createBuilder() {
        return new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) new NativeCronetEngineBuilderWithLibraryLoaderImpl(this.mContext));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    public NativeCronetProvider(Context context) {
        super(context);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext))) {
            return true;
        }
        return false;
    }
}

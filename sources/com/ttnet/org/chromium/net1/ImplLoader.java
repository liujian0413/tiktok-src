package com.ttnet.org.chromium.net1;

import android.content.Context;

final class ImplLoader {
    ImplLoader() {
    }

    static ICronetEngineBuilder load(Context context) {
        try {
            return (ICronetEngineBuilder) Class.forName("com.ttnet.org.chromium.net1.impl.CronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
        } catch (Exception e) {
            throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: com.ttnet.org.chromium.net1.impl.CronetEngineBuilderImpl", e);
        }
    }
}

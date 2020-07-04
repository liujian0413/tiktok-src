package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public class CronetURLStreamHandlerFactory implements URLStreamHandlerFactory {
    private final ExperimentalCronetEngine mCronetEngine;

    public CronetURLStreamHandlerFactory(ExperimentalCronetEngine experimentalCronetEngine) {
        if (experimentalCronetEngine != null) {
            this.mCronetEngine = experimentalCronetEngine;
            return;
        }
        throw new NullPointerException("CronetEngine is null.");
    }

    public URLStreamHandler createURLStreamHandler(String str) {
        if (WebKitApi.SCHEME_HTTP.equals(str) || WebKitApi.SCHEME_HTTPS.equals(str)) {
            return new CronetHttpURLStreamHandler(this.mCronetEngine);
        }
        return null;
    }
}

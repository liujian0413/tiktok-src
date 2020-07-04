package com.ttnet.org.chromium.net1.urlconnection;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.ttnet.org.chromium.net1.impl.CronetEngineBase;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public class CronetURLStreamHandlerFactory implements URLStreamHandlerFactory {
    private final CronetEngineBase mCronetEngine;

    public CronetURLStreamHandlerFactory(CronetEngineBase cronetEngineBase) {
        if (cronetEngineBase != null) {
            this.mCronetEngine = cronetEngineBase;
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

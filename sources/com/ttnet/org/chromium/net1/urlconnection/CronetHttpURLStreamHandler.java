package com.ttnet.org.chromium.net1.urlconnection;

import com.ttnet.org.chromium.net1.impl.CronetEngineBase;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

class CronetHttpURLStreamHandler extends URLStreamHandler {
    private final CronetEngineBase mCronetEngine;

    public CronetHttpURLStreamHandler(CronetEngineBase cronetEngineBase) {
        this.mCronetEngine = cronetEngineBase;
    }

    public URLConnection openConnection(URL url) throws IOException {
        return this.mCronetEngine.openConnection(url);
    }

    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return this.mCronetEngine.openConnection(url, proxy);
    }
}

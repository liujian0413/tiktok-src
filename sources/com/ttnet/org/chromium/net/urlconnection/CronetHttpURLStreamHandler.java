package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.ExperimentalCronetEngine;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

class CronetHttpURLStreamHandler extends URLStreamHandler {
    private final ExperimentalCronetEngine mCronetEngine;

    public CronetHttpURLStreamHandler(ExperimentalCronetEngine experimentalCronetEngine) {
        this.mCronetEngine = experimentalCronetEngine;
    }

    public URLConnection openConnection(URL url) throws IOException {
        return this.mCronetEngine.openConnection(url);
    }

    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return this.mCronetEngine.openConnection(url, proxy);
    }
}

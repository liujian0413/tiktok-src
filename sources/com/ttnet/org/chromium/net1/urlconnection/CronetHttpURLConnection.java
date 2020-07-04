package com.ttnet.org.chromium.net1.urlconnection;

import android.text.TextUtils;
import android.util.Pair;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.Logger;
import com.ttnet.org.chromium.base1.Reflect;
import com.ttnet.org.chromium.net1.CronetEngine;
import com.ttnet.org.chromium.net1.CronetException;
import com.ttnet.org.chromium.net1.RequestFinishedInfo;
import com.ttnet.org.chromium.net1.UrlRequest;
import com.ttnet.org.chromium.net1.UrlRequest.Builder;
import com.ttnet.org.chromium.net1.UrlRequest.Callback;
import com.ttnet.org.chromium.net1.UrlResponseInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CronetHttpURLConnection extends HttpURLConnection {
    public CookieHandler mCookieHandler = CookieHandler.getDefault();
    private final CronetEngine mCronetEngine;
    public IOException mException;
    public boolean mHasResponse;
    public CronetInputStream mInputStream = new CronetInputStream(this);
    private int mInputStreamBufferSize;
    public final MessageLoop mMessageLoop = new MessageLoop();
    public boolean mOnRedirectCalled;
    public CronetOutputStream mOutputStream;
    public UrlRequest mRequest;
    public RequestFinishedInfo mRequestFinishedInfo;
    private int mRequestFlag = 0;
    private final List<Pair<String, String>> mRequestHeaders = new ArrayList();
    public String mRequestLog;
    private int mRequestTimeout;
    private List<Entry<String, String>> mResponseHeadersList;
    private Map<String, List<String>> mResponseHeadersMap;
    public UrlResponseInfo mResponseInfo;
    private int mSocketConnectTimeout;
    private int mSocketReadTimeout;
    private int mSocketWriteTimeout;

    class CronetUrlRequestCallback extends Callback {
        private void setRequestEnd() {
            CronetHttpURLConnection.this.mRequestLog = CronetHttpURLConnection.this.mRequest.getRequestLog();
            try {
                if (CronetHttpURLConnection.this.mResponseInfo != null) {
                    Map allHeaders = CronetHttpURLConnection.this.getAllHeaders();
                    if (CronetHttpURLConnection.this.mCookieHandler == null) {
                        CronetHttpURLConnection.this.mCookieHandler = CookieHandler.getDefault();
                    }
                    if (CronetHttpURLConnection.this.mCookieHandler != null) {
                        CronetHttpURLConnection.this.mCookieHandler.put(CronetHttpURLConnection.this.uri(CronetHttpURLConnection.this.getURL()), allHeaders);
                    }
                }
            } catch (Exception e) {
                if (Logger.debug()) {
                    String str = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                    StringBuilder sb = new StringBuilder("Saving cookies failed for ");
                    sb.append(CronetHttpURLConnection.this.getURL().toString());
                    sb.append(" e = ");
                    sb.append(e.getMessage());
                    Logger.m146431d(str, sb.toString());
                }
            }
            try {
                if (CronetHttpURLConnection.this.mException != null) {
                    String str2 = null;
                    if (!(CronetHttpURLConnection.this.mRequestFinishedInfo == null || CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics() == null || CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics().getPeerAddr() == null)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics().getPeerAddr());
                        sb2.append(":");
                        sb2.append(CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics().getPeerPort());
                        str2 = sb2.toString();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        String message = CronetHttpURLConnection.this.mException.getMessage();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append("|");
                        if (message == null) {
                            message = TEVideoRecorder.FACE_BEAUTY_NULL;
                        }
                        sb3.append(message);
                        Reflect.m146447on((Object) CronetHttpURLConnection.this.mException).set("detailMessage", sb3.toString());
                    }
                }
            } catch (Throwable unused) {
            }
            CronetHttpURLConnection.this.mHasResponse = true;
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        public CronetUrlRequestCallback() {
        }

        private void setResponseDataCompleted(IOException iOException, boolean z) {
            if (CronetHttpURLConnection.this.mInputStream != null) {
                CronetHttpURLConnection.this.mInputStream.setResponseDataCompleted(iOException);
            }
            if (CronetHttpURLConnection.this.mOutputStream != null) {
                CronetHttpURLConnection.this.mOutputStream.setRequestCompleted(iOException);
            }
            CronetHttpURLConnection.this.mHasResponse = true;
            if (!z) {
                setRequestEnd();
            }
        }

        public void onMetricsCollected(UrlRequest urlRequest, RequestFinishedInfo requestFinishedInfo) {
            CronetHttpURLConnection.this.mRequestFinishedInfo = requestFinishedInfo;
            if (Logger.debug()) {
                String str = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                StringBuilder sb = new StringBuilder("onMetricsCollected loop quit url = ");
                sb.append(CronetHttpURLConnection.this.getURL().toString());
                Logger.m146431d(str, sb.toString());
            }
            setRequestEnd();
        }

        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                String str = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                StringBuilder sb = new StringBuilder("onResponseStarted loop quit url = ");
                sb.append(CronetHttpURLConnection.this.getURL().toString());
                Logger.m146431d(str, sb.toString());
            }
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                String str = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                StringBuilder sb = new StringBuilder("onSucceeded url = ");
                sb.append(CronetHttpURLConnection.this.getURL().toString());
                Logger.m146431d(str, sb.toString());
            }
            setResponseDataCompleted(null, true);
        }

        public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                String str = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                StringBuilder sb = new StringBuilder("onCanceled loop quit url = ");
                sb.append(CronetHttpURLConnection.this.getURL().toString());
                Logger.m146431d(str, sb.toString());
            }
            if (CronetHttpURLConnection.this.mException == null) {
                CronetHttpURLConnection.this.mException = new IOException("request canceled");
            }
            setResponseDataCompleted(CronetHttpURLConnection.this.mException, false);
        }

        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                String str = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                StringBuilder sb = new StringBuilder("onReadCompleted loop quit url = ");
                sb.append(CronetHttpURLConnection.this.getURL().toString());
                Logger.m146431d(str, sb.toString());
            }
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            if (cronetException != null) {
                CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
                CronetHttpURLConnection.this.mException = CronetHttpURLConnection.this.tryConvertCronetException(cronetException);
                if (Logger.debug()) {
                    String str = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                    StringBuilder sb = new StringBuilder("onFailed url = ");
                    sb.append(CronetHttpURLConnection.this.getURL().toString());
                    Logger.m146431d(str, sb.toString());
                }
                setResponseDataCompleted(CronetHttpURLConnection.this.mException, true);
                return;
            }
            throw new IllegalStateException("Exception cannot be null in onFailed.");
        }

        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            CronetHttpURLConnection.this.mOnRedirectCalled = true;
            try {
                URL url = new URL(str);
                if (CronetHttpURLConnection.this.instanceFollowRedirects) {
                    CronetHttpURLConnection.this.url = url;
                    if (CronetHttpURLConnection.this.mRequest != null) {
                        CronetHttpURLConnection.this.mRequest.followRedirect();
                    }
                    return;
                }
            } catch (MalformedURLException unused) {
            }
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (CronetHttpURLConnection.this.mRequest != null) {
                CronetHttpURLConnection.this.mRequest.stopRedirect();
            }
            if (Logger.debug()) {
                String str2 = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                StringBuilder sb = new StringBuilder("onRedirectReceived loop quit url = ");
                sb.append(CronetHttpURLConnection.this.getURL().toString());
                Logger.m146431d(str2, sb.toString());
            }
        }
    }

    public int getInputStreamBufferSize() {
        return this.mInputStreamBufferSize;
    }

    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.mRequestFinishedInfo;
    }

    public boolean usingProxy() {
        return false;
    }

    private boolean isChunkedUpload() {
        if (this.chunkLength > 0) {
            return true;
        }
        return false;
    }

    public void connect() throws IOException {
        getOutputStream();
        startRequest();
    }

    public void disconnect() {
        if (this.connected && this.mRequest != null) {
            this.mRequest.cancel();
        }
    }

    public Map<String, List<String>> getHeaderFields() {
        try {
            getResponse();
            return getAllHeaders();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    public String getRequestLog() {
        if (this.mRequestLog != null) {
            return this.mRequestLog;
        }
        return "";
    }

    public int getResponseCode() throws IOException {
        getResponse();
        return this.mResponseInfo.getHttpStatusCode();
    }

    public String getResponseMessage() throws IOException {
        getResponse();
        return this.mResponseInfo.getHttpStatusText();
    }

    public void onUploadTimeout() {
        if (this.mRequest != null) {
            this.mRequest.appTimeout();
        }
    }

    private void checkHasResponse() throws IOException {
        if (!this.mHasResponse) {
            throw new IllegalStateException("No response.");
        } else if (this.mException != null) {
            throw this.mException;
        } else if (this.mResponseInfo == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    private long getStreamingModeContentLength() {
        long j = (long) this.fixedContentLength;
        try {
            long j2 = getClass().getField("fixedContentLengthLong").getLong(this);
            if (j2 != -1) {
                return j2;
            }
            return j;
        } catch (Exception unused) {
            return j;
        }
    }

    public InputStream getErrorStream() {
        try {
            getResponse();
            if (this.mResponseInfo.getHttpStatusCode() >= 400) {
                return this.mInputStream;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    private List<Entry<String, String>> getAllHeadersAsList() {
        if (this.mResponseHeadersList != null) {
            return this.mResponseHeadersList;
        }
        this.mResponseHeadersList = new ArrayList();
        for (Entry simpleImmutableEntry : this.mResponseInfo.getAllHeadersAsList()) {
            this.mResponseHeadersList.add(new SimpleImmutableEntry(simpleImmutableEntry));
        }
        this.mResponseHeadersList = Collections.unmodifiableList(this.mResponseHeadersList);
        return this.mResponseHeadersList;
    }

    public InputStream getInputStream() throws IOException {
        getResponse();
        if (!this.instanceFollowRedirects && this.mOnRedirectCalled) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.mResponseInfo.getHttpStatusCode() < 400) {
            return this.mInputStream;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    private void getResponse() throws IOException {
        if (this.mOutputStream != null) {
            this.mOutputStream.checkReceivedEnoughContent();
            if (isChunkedUpload()) {
                this.mOutputStream.close();
            }
        }
        if (!this.mHasResponse) {
            startRequest();
            if (Logger.debug()) {
                String str = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                StringBuilder sb = new StringBuilder("getResponse loop url = ");
                sb.append(getURL().toString());
                Logger.m146431d(str, sb.toString());
            }
            cronet_loop(getConnectTimeout() + getReadTimeout());
            this.mHasResponse = true;
        }
        checkHasResponse();
    }

    public Map<String, List<String>> getAllHeaders() {
        if (this.mResponseHeadersMap != null) {
            return this.mResponseHeadersMap;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Entry entry : getAllHeadersAsList()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        this.mResponseHeadersMap = Collections.unmodifiableMap(treeMap);
        return this.mResponseHeadersMap;
    }

    public Map<String, List<String>> getRequestProperties() {
        if (!this.connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Pair pair : this.mRequestHeaders) {
                if (!treeMap.containsKey(pair.first)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pair.second);
                    treeMap.put(pair.first, Collections.unmodifiableList(arrayList));
                } else {
                    throw new IllegalStateException("Should not have multiple values.");
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    public OutputStream getOutputStream() throws IOException {
        if (this.mOutputStream == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (isChunkedUpload()) {
                this.mOutputStream = new CronetChunkedOutputStream(this, this.chunkLength, this.mMessageLoop);
                startRequest();
            } else {
                long streamingModeContentLength = getStreamingModeContentLength();
                if (streamingModeContentLength != -1) {
                    this.mOutputStream = new CronetFixedModeOutputStream(this, streamingModeContentLength, this.mMessageLoop);
                    if (streamingModeContentLength == 0) {
                        setFixedLengthStreamingMode((int) this.mOutputStream.getUploadDataProvider().getLength());
                        if (getRequestProperty("Content-Length") == null) {
                            addRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                        } else {
                            setRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                        }
                    }
                    startRequest();
                } else {
                    Log.m22883d(com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG, "Outputstream is being buffered in memory.");
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.mOutputStream = new CronetBufferedOutputStream(this);
                    } else {
                        this.mOutputStream = new CronetBufferedOutputStream(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.mOutputStream;
    }

    private void startRequest() throws IOException {
        if (!this.connected) {
            if (Logger.debug()) {
                String str = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                StringBuilder sb = new StringBuilder("start request url = ");
                sb.append(getURL().toString());
                Logger.m146431d(str, sb.toString());
            }
            Builder newUrlRequestBuilder = this.mCronetEngine.newUrlRequestBuilder(getURL().toString(), new CronetUrlRequestCallback(), this.mMessageLoop);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = "POST";
                }
                if (this.mOutputStream != null) {
                    newUrlRequestBuilder.setUploadDataProvider(this.mOutputStream.getUploadDataProvider(), this.mMessageLoop);
                    if (getRequestProperty("Content-Length") == null && !isChunkedUpload()) {
                        addRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                    }
                    this.mOutputStream.setConnected();
                } else if (getRequestProperty("Content-Length") == null) {
                    addRequestProperty("Content-Length", "0");
                }
                if (getRequestProperty("Content-Type") == null) {
                    addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
            }
            HashMap hashMap = new HashMap();
            if (this.mRequestHeaders != null) {
                for (Pair pair : this.mRequestHeaders) {
                    String str2 = (String) pair.first;
                    String str3 = (String) pair.second;
                    List list = (List) hashMap.get(str2);
                    if (list == null) {
                        list = new LinkedList();
                    }
                    list.add(str3);
                    hashMap.put(str2, list);
                }
            }
            Map map = null;
            try {
                if (this.mCookieHandler == null) {
                    this.mCookieHandler = CookieHandler.getDefault();
                }
                if (this.mCookieHandler != null) {
                    map = this.mCookieHandler.get(uri(getURL()), hashMap);
                }
            } catch (Exception e) {
                if (Logger.debug()) {
                    String str4 = com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection.TAG;
                    StringBuilder sb2 = new StringBuilder("Loading cookies failed for ");
                    sb2.append(getURL().toString());
                    sb2.append(" e = ");
                    sb2.append(e.getMessage());
                    Logger.m146431d(str4, sb2.toString());
                }
            }
            if (map != null && map.size() > 0) {
                for (Entry entry : map.entrySet()) {
                    String str5 = (String) entry.getKey();
                    StringBuilder sb3 = new StringBuilder();
                    if (("X-SS-Cookie".equalsIgnoreCase(str5) || "Cookie".equalsIgnoreCase(str5) || "Cookie2".equalsIgnoreCase(str5)) && !((List) entry.getValue()).isEmpty()) {
                        int i = 0;
                        for (String str6 : (List) entry.getValue()) {
                            if (i > 0) {
                                sb3.append("; ");
                            }
                            sb3.append(str6);
                            i++;
                        }
                        newUrlRequestBuilder.addHeader(str5, sb3.toString());
                    }
                }
            }
            for (Pair pair2 : this.mRequestHeaders) {
                newUrlRequestBuilder.addHeader((String) pair2.first, (String) pair2.second);
            }
            if (!getUseCaches()) {
                newUrlRequestBuilder.disableCache();
            }
            newUrlRequestBuilder.setHttpMethod(this.method);
            newUrlRequestBuilder.setSocketConnectTimeout(this.mSocketConnectTimeout);
            newUrlRequestBuilder.setSocketReadTimeout(this.mSocketReadTimeout);
            newUrlRequestBuilder.setSocketWriteTimeout(this.mSocketWriteTimeout);
            newUrlRequestBuilder.setRequestTimeout(this.mRequestTimeout);
            this.connected = true;
            this.mRequest = newUrlRequestBuilder.build();
            if (this.mRequestFlag != 0) {
                this.mRequest.setRequestFlag(this.mRequestFlag);
            }
            this.mRequest.start();
        }
    }

    public void setConnectTimeout(int i) {
        super.setConnectTimeout(i);
    }

    public void setInputStreamBufferSize(int i) {
        this.mInputStreamBufferSize = i;
    }

    public void setRequestFlag(int i) {
        this.mRequestFlag = i;
    }

    public void setRequestTimeout(int i) {
        this.mRequestTimeout = i;
    }

    public void setSocketConnectTimeout(int i) {
        this.mSocketConnectTimeout = i;
    }

    public void setSocketReadTimeout(int i) {
        this.mSocketReadTimeout = i;
    }

    public void setSocketWriteTimeout(int i) {
        this.mSocketWriteTimeout = i;
    }

    public final String getHeaderField(int i) {
        Entry headerFieldEntry = getHeaderFieldEntry(i);
        if (headerFieldEntry == null) {
            return null;
        }
        return (String) headerFieldEntry.getValue();
    }

    public final String getHeaderFieldKey(int i) {
        Entry headerFieldEntry = getHeaderFieldEntry(i);
        if (headerFieldEntry == null) {
            return null;
        }
        return (String) headerFieldEntry.getKey();
    }

    private Entry<String, String> getHeaderFieldEntry(int i) {
        try {
            getResponse();
            List allHeadersAsList = getAllHeadersAsList();
            if (i >= allHeadersAsList.size()) {
                return null;
            }
            return (Entry) allHeadersAsList.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void getMoreData(ByteBuffer byteBuffer) throws IOException {
        if (this.mRequest != null) {
            this.mRequest.read(byteBuffer);
            cronet_loop(getReadTimeout());
        }
    }

    public String getRequestProperty(String str) {
        int findRequestProperty = findRequestProperty(str);
        if (findRequestProperty >= 0) {
            return (String) ((Pair) this.mRequestHeaders.get(findRequestProperty)).second;
        }
        return null;
    }

    private int findRequestProperty(String str) {
        for (int i = 0; i < this.mRequestHeaders.size(); i++) {
            if (((String) ((Pair) this.mRequestHeaders.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    public final String getHeaderField(String str) {
        try {
            getResponse();
            Map allHeaders = getAllHeaders();
            if (!allHeaders.containsKey(str)) {
                return null;
            }
            List list = (List) allHeaders.get(str);
            return (String) list.get(list.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }

    public void setException(IOException iOException) {
        if (this.mInputStream != null) {
            this.mInputStream.setResponseDataCompleted(iOException);
        }
        if (this.mOutputStream != null) {
            this.mOutputStream.setRequestCompleted(iOException);
        }
        this.mHasResponse = true;
        this.mException = iOException;
        if (this.mRequest != null) {
            this.mRequest.cancel();
        }
    }

    public URI uri(URL url) {
        if (url == null) {
            return null;
        }
        String url2 = url.toString();
        try {
            return new URI(url2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(url2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                try {
                    return URI.create(url2.substring(0, url2.indexOf("?")));
                } catch (Exception unused2) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void cronet_loop(int i) throws IOException {
        try {
            this.mMessageLoop.loop(i);
        } catch (SocketTimeoutException unused) {
            if (this.mRequest != null) {
                this.mRequest.appTimeout();
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Unexpected request usage, caught in CronetHttpURLConnection, caused by ");
            sb.append(e);
            setException(new IOException(sb.toString()));
            if (this.mRequest != null) {
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.net.UnknownHostException] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.net.ConnectException] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.net.SocketTimeoutException] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.net.ConnectException] */
    /* JADX WARNING: type inference failed for: r0v9, types: [org.apache.http.conn.ConnectTimeoutException] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.net.SocketException] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.net.NoRouteToHostException] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException tryConvertCronetException(com.ttnet.org.chromium.net1.CronetException r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.ttnet.org.chromium.net1.NetworkException
            if (r0 != 0) goto L_0x0005
            return r4
        L_0x0005:
            r0 = r4
            com.ttnet.org.chromium.net1.NetworkException r0 = (com.ttnet.org.chromium.net1.NetworkException) r0
            int r0 = r0.getErrorCode()
            switch(r0) {
                case 1: goto L_0x005b;
                case 2: goto L_0x0051;
                case 3: goto L_0x0051;
                case 4: goto L_0x0047;
                case 5: goto L_0x003d;
                case 6: goto L_0x0033;
                case 7: goto L_0x003d;
                case 8: goto L_0x001b;
                case 9: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = r4
            goto L_0x0064
        L_0x0011:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException
            java.lang.String r4 = r4.getMessage()
            r0.<init>(r4)
            goto L_0x0064
        L_0x001b:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "reset by peer "
            r1.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            goto L_0x0064
        L_0x0033:
            org.apache.http.conn.ConnectTimeoutException r0 = new org.apache.http.conn.ConnectTimeoutException
            java.lang.String r4 = r4.getMessage()
            r0.<init>(r4)
            goto L_0x0064
        L_0x003d:
            java.net.ConnectException r0 = new java.net.ConnectException
            java.lang.String r4 = r4.getMessage()
            r0.<init>(r4)
            goto L_0x0064
        L_0x0047:
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r4 = r4.getMessage()
            r0.<init>(r4)
            goto L_0x0064
        L_0x0051:
            java.net.ConnectException r0 = new java.net.ConnectException
            java.lang.String r4 = r4.getMessage()
            r0.<init>(r4)
            goto L_0x0064
        L_0x005b:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r4 = r4.getMessage()
            r0.<init>(r4)
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net1.urlconnection.CronetHttpURLConnection.tryConvertCronetException(com.ttnet.org.chromium.net1.CronetException):java.io.IOException");
    }

    public final void addRequestProperty(String str, String str2) {
        setRequestPropertyInternal(str, str2, false);
    }

    public final void setRequestProperty(String str, String str2) {
        setRequestPropertyInternal(str, str2, true);
    }

    public CronetHttpURLConnection(URL url, CronetEngine cronetEngine) {
        super(url);
        this.mCronetEngine = cronetEngine;
    }

    private final void setRequestPropertyInternal(String str, String str2, boolean z) {
        if (!this.connected) {
            int findRequestProperty = findRequestProperty(str);
            if (findRequestProperty >= 0) {
                if (z) {
                    this.mRequestHeaders.remove(findRequestProperty);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot add multiple headers of the same key, ");
                    sb.append(str);
                    sb.append(". crbug.com/432719.");
                    throw new UnsupportedOperationException(sb.toString());
                }
            }
            this.mRequestHeaders.add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }
}

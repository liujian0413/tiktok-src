package com.facebook.react.modules.network;

import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.StandardCharsets;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;

@ReactModule(name = "Networking")
public final class NetworkingModule extends ReactContextBaseJavaModule {
    public final OkHttpClient mClient;
    private final ForwardingCookieHandler mCookieHandler;
    private final CookieJarContainer mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<RequestBodyHandler> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    public final List<ResponseHandler> mResponseHandlers;
    public boolean mShuttingDown;
    private final List<UriHandler> mUriHandlers;

    public interface RequestBodyHandler {
        boolean supports(ReadableMap readableMap);

        RequestBody toRequestBody(ReadableMap readableMap, String str);
    }

    public interface ResponseHandler {
        boolean supports(String str);

        WritableMap toResponseData(ResponseBody responseBody) throws IOException;
    }

    public interface UriHandler {
        WritableMap fetch(Uri uri) throws IOException;

        boolean supports(Uri uri, String str);
    }

    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    public final String getName() {
        return "Networking";
    }

    private RCTDeviceEventEmitter getEventEmitter() {
        return (RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class);
    }

    public final void initialize() {
        this.mCookieJarContainer.setCookieJar(new JavaNetCookieJar(this.mCookieHandler));
    }

    public final void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.destroy();
        this.mCookieJarContainer.removeCookieJar();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    private synchronized void cancelAllRequests() {
        for (Integer intValue : this.mRequestIds) {
            cancelRequest(intValue.intValue());
        }
        this.mRequestIds.clear();
    }

    @ReactMethod
    public final void abortRequest(int i) {
        cancelRequest(i);
        removeRequest(i);
    }

    public final void addRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.add(requestBodyHandler);
    }

    public final void addResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.add(responseHandler);
    }

    public final void addUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.add(uriHandler);
    }

    @ReactMethod
    public final void clearCookies(Callback callback) {
        this.mCookieHandler.clearCookies(callback);
    }

    public final void removeRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.remove(requestBodyHandler);
    }

    public final void removeResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.remove(responseHandler);
    }

    public final void removeUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.remove(uriHandler);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(), null);
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    private void cancelRequest(final int i) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                OkHttpCallUtil.cancelTag(NetworkingModule.this.mClient, Integer.valueOf(i));
            }
        }.execute(new Void[0]);
    }

    public final synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    public static WritableMap translateHeaders(Headers headers) {
        WritableMap createMap = Arguments.createMap();
        for (int i = 0; i < headers.size(); i++) {
            String name = headers.name(i);
            if (createMap.hasKey(name)) {
                StringBuilder sb = new StringBuilder();
                sb.append(createMap.getString(name));
                sb.append(", ");
                sb.append(headers.value(i));
                createMap.putString(name, sb.toString());
            } else {
                createMap.putString(name, headers.value(i));
            }
        }
        return createMap;
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, OkHttpClientProvider.createClient(), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<NetworkInterceptorCreator> list) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(), list);
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        if (readableArray == null) {
            return null;
        }
        Builder builder = new Builder();
        int size = readableArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array == null || array.size() != 2) {
                return null;
            }
            String string = array.getString(0);
            String string2 = array.getString(1);
            if (string == null || string2 == null) {
                return null;
            }
            builder.add(string, string2);
        }
        if (builder.get("user-agent") == null && this.mDefaultUserAgent != null) {
            builder.add("user-agent", this.mDefaultUserAgent);
        }
        if (readableMap != null && readableMap.hasKey("string")) {
            z = true;
        }
        if (!z) {
            builder.removeAll("content-encoding");
        }
        return builder.build();
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, final RCTDeviceEventEmitter rCTDeviceEventEmitter, final int i) {
        if (requestBody == null) {
            return null;
        }
        return RequestBodyUtil.createProgressRequest(requestBody, new ProgressListener() {
            long last = System.nanoTime();

            public void onProgress(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if (z || NetworkingModule.shouldDispatch(nanoTime, this.last)) {
                    ResponseUtil.onDataSend(rCTDeviceEventEmitter, i, j, j2);
                    this.last = nanoTime;
                }
            }
        });
    }

    public final void readWithProgress(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) throws IOException {
        long j;
        Charset charset;
        long j2 = -1;
        try {
            ProgressResponseBody progressResponseBody = (ProgressResponseBody) responseBody;
            j = progressResponseBody.totalBytesRead();
            try {
                j2 = progressResponseBody.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        if (responseBody.contentType() == null) {
            charset = StandardCharsets.UTF_8;
        } else {
            charset = responseBody.contentType().charset(StandardCharsets.UTF_8);
        }
        ProgressiveStringDecoder progressiveStringDecoder = new ProgressiveStringDecoder(charset);
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    ResponseUtil.onIncrementalDataReceived(rCTDeviceEventEmitter, i, progressiveStringDecoder.decodeNext(bArr, read), j, j2);
                } else {
                    return;
                }
            }
        } finally {
            byteStream.close();
        }
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i) {
        MediaType mediaType;
        RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = readableArray.getMap(i2);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                ResponseUtil.onRequestError(eventEmitter, i, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String str2 = extractHeaders.get("content-type");
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                extractHeaders = extractHeaders.newBuilder().removeAll("content-type").build();
            } else {
                mediaType = null;
            }
            if (map.hasKey("string")) {
                builder.addPart(extractHeaders, RequestBody.create(mediaType, map.getString("string")));
            } else if (!map.hasKey("uri")) {
                ResponseUtil.onRequestError(eventEmitter, i, "Unrecognized FormData part.", null);
            } else if (mediaType == null) {
                ResponseUtil.onRequestError(eventEmitter, i, "Binary FormData part needs a content-type header.", null);
                return null;
            } else {
                String string = map.getString("uri");
                InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string);
                if (fileInputStream == null) {
                    StringBuilder sb = new StringBuilder("Could not retrieve file for uri ");
                    sb.append(string);
                    ResponseUtil.onRequestError(eventEmitter, i, sb.toString(), null);
                    return null;
                }
                builder.addPart(extractHeaders, RequestBodyUtil.create(mediaType, fileInputStream));
            }
        }
        return builder;
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<NetworkInterceptorCreator> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            for (NetworkInterceptorCreator create : list) {
                newBuilder.addNetworkInterceptor(create.create());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
        this.mCookieJarContainer = (CookieJarContainer) this.mClient.cookieJar;
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    @ReactMethod
    public final void sendRequest(String str, String str2, final int i, ReadableArray readableArray, ReadableMap readableMap, final String str3, boolean z, int i2, boolean z2) {
        RequestBodyHandler requestBodyHandler;
        RequestBody requestBody;
        final RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        try {
            Uri parse = Uri.parse(str2);
            for (UriHandler uriHandler : this.mUriHandlers) {
                if (uriHandler.supports(parse, str3)) {
                    ResponseUtil.onDataReceived(eventEmitter, i, uriHandler.fetch(parse));
                    ResponseUtil.onRequestSuccess(eventEmitter, i);
                    return;
                }
            }
            try {
                Request.Builder url = new Request.Builder().url(str2);
                if (i != 0) {
                    url.tag(Integer.valueOf(i));
                }
                OkHttpClient.Builder newBuilder = this.mClient.newBuilder();
                if (!z2) {
                    newBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z) {
                    newBuilder.addNetworkInterceptor(new Interceptor() {
                        public Response intercept(Chain chain) throws IOException {
                            Response proceed = chain.proceed(chain.request());
                            return proceed.newBuilder().body(new ProgressResponseBody(proceed.body, new ProgressListener() {
                                long last = System.nanoTime();

                                public void onProgress(long j, long j2, boolean z) {
                                    long nanoTime = System.nanoTime();
                                    if ((z || NetworkingModule.shouldDispatch(nanoTime, this.last)) && !str3.equals("text")) {
                                        ResponseUtil.onDataReceivedProgress(eventEmitter, i, j, j2);
                                        this.last = nanoTime;
                                    }
                                }
                            })).build();
                        }
                    });
                }
                if (i2 != this.mClient.connectTimeout) {
                    newBuilder.readTimeout((long) i2, TimeUnit.MILLISECONDS);
                }
                OkHttpClient build = newBuilder.build();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    ResponseUtil.onRequestError(eventEmitter, i, "Unrecognized headers format", null);
                    return;
                }
                String str4 = extractHeaders.get("content-type");
                String str5 = extractHeaders.get("content-encoding");
                url.headers(extractHeaders);
                if (readableMap != null) {
                    Iterator it = this.mRequestBodyHandlers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        requestBodyHandler = (RequestBodyHandler) it.next();
                        if (requestBodyHandler.supports(readableMap)) {
                            break;
                        }
                    }
                }
                requestBodyHandler = null;
                if (readableMap == null || str.toLowerCase().equals("get") || str.toLowerCase().equals("head")) {
                    requestBody = RequestBodyUtil.getEmptyBody(str);
                } else if (requestBodyHandler != null) {
                    requestBody = requestBodyHandler.toRequestBody(readableMap, str4);
                } else if (readableMap.hasKey("string")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string = readableMap.getString("string");
                    MediaType parse2 = MediaType.parse(str4);
                    if (RequestBodyUtil.isGzipEncoding(str5)) {
                        requestBody = RequestBodyUtil.createGzip(parse2, string);
                        if (requestBody == null) {
                            ResponseUtil.onRequestError(eventEmitter, i, "Failed to gzip request body", null);
                            return;
                        }
                    } else {
                        requestBody = RequestBody.create(parse2, string);
                    }
                } else if (readableMap.hasKey("base64")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    } else {
                        requestBody = RequestBody.create(MediaType.parse(str4), ByteString.decodeBase64(readableMap.getString("base64")));
                    }
                } else if (readableMap.hasKey("uri")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string2 = readableMap.getString("uri");
                    InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string2);
                    if (fileInputStream == null) {
                        StringBuilder sb = new StringBuilder("Could not retrieve file for uri ");
                        sb.append(string2);
                        ResponseUtil.onRequestError(eventEmitter, i, sb.toString(), null);
                        return;
                    }
                    requestBody = RequestBodyUtil.create(MediaType.parse(str4), fileInputStream);
                } else if (readableMap.hasKey("formData")) {
                    if (str4 == null) {
                        str4 = "multipart/form-data";
                    }
                    MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray("formData"), str4, i);
                    if (constructMultipartBody != null) {
                        requestBody = constructMultipartBody.build();
                    } else {
                        return;
                    }
                } else {
                    requestBody = RequestBodyUtil.getEmptyBody(str);
                }
                url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                addRequest(i);
                Call newCall = build.newCall(url.build());
                final int i3 = i;
                final String str6 = str3;
                final boolean z3 = z;
                C143612 r0 = new okhttp3.Callback() {
                    public void onFailure(Call call, IOException iOException) {
                        String str;
                        if (!NetworkingModule.this.mShuttingDown) {
                            NetworkingModule.this.removeRequest(i3);
                            if (iOException.getMessage() != null) {
                                str = iOException.getMessage();
                            } else {
                                StringBuilder sb = new StringBuilder("Error while executing request: ");
                                sb.append(iOException.getClass().getSimpleName());
                                str = sb.toString();
                            }
                            ResponseUtil.onRequestError(eventEmitter, i3, str, iOException);
                        }
                    }

                    public void onResponse(Call call, Response response) throws IOException {
                        if (!NetworkingModule.this.mShuttingDown) {
                            NetworkingModule.this.removeRequest(i3);
                            ResponseUtil.onResponseReceived(eventEmitter, i3, response.code, NetworkingModule.translateHeaders(response.headers), response.request.url.toString());
                            ResponseBody responseBody = response.body;
                            try {
                                for (ResponseHandler responseHandler : NetworkingModule.this.mResponseHandlers) {
                                    if (responseHandler.supports(str6)) {
                                        ResponseUtil.onDataReceived(eventEmitter, i3, responseHandler.toResponseData(responseBody));
                                        ResponseUtil.onRequestSuccess(eventEmitter, i3);
                                        return;
                                    }
                                }
                                if (!z3 || !str6.equals("text")) {
                                    String str = "";
                                    if (str6.equals("text")) {
                                        try {
                                            str = responseBody.string();
                                        } catch (IOException e) {
                                            if (!response.request.method.equalsIgnoreCase("HEAD")) {
                                                ResponseUtil.onRequestError(eventEmitter, i3, e.getMessage(), e);
                                            }
                                        }
                                    } else if (str6.equals("base64")) {
                                        str = Base64.encodeToString(responseBody.bytes(), 2);
                                    }
                                    ResponseUtil.onDataReceived(eventEmitter, i3, str);
                                    ResponseUtil.onRequestSuccess(eventEmitter, i3);
                                    return;
                                }
                                NetworkingModule.this.readWithProgress(eventEmitter, i3, responseBody);
                                ResponseUtil.onRequestSuccess(eventEmitter, i3);
                            } catch (IOException e2) {
                                ResponseUtil.onRequestError(eventEmitter, i3, e2.getMessage(), e2);
                            }
                        }
                    }
                };
                newCall.enqueue(r0);
            } catch (Exception e) {
                ResponseUtil.onRequestError(eventEmitter, i, e.getMessage(), null);
            }
        } catch (IOException e2) {
            ResponseUtil.onRequestError(eventEmitter, i, e2.getMessage(), e2);
        }
    }
}

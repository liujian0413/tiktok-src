package com.facebook.react.modules.websocket;

import com.C1642a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

@ReactModule(hasConstants = false, name = "WebSocketModule")
public final class WebSocketModule extends ReactContextBaseJavaModule {
    public final Map<Integer, ContentHandler> mContentHandlers = new ConcurrentHashMap();
    private ForwardingCookieHandler mCookieHandler;
    private ReactContext mReactContext;
    public final Map<Integer, WebSocket> mWebSocketConnections = new ConcurrentHashMap();

    public interface ContentHandler {
        void onMessage(String str, WritableMap writableMap);

        void onMessage(ByteString byteString, WritableMap writableMap);
    }

    public final String getName() {
        return "WebSocketModule";
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List list = (List) this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null) {
                if (!list.isEmpty()) {
                    return (String) list.get(0);
                }
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            StringBuilder sb = new StringBuilder("Unable to get cookie from ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @ReactMethod
    public final void ping(int i) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(ByteString.EMPTY);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    private static String getDefaultOrigin(String str) {
        String str2 = "";
        try {
            URI uri = new URI(str);
            if (uri.getScheme().equals("wss")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(WebKitApi.SCHEME_HTTPS);
                str2 = sb.toString();
            } else if (uri.getScheme().equals("ws")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(WebKitApi.SCHEME_HTTP);
                str2 = sb2.toString();
            } else if (uri.getScheme().equals(WebKitApi.SCHEME_HTTP) || uri.getScheme().equals(WebKitApi.SCHEME_HTTPS)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(uri.getScheme());
                str2 = sb3.toString();
            }
            if (uri.getPort() != -1) {
                return C1642a.m8034a("%s://%s:%s", new Object[]{str2, uri.getHost(), Integer.valueOf(uri.getPort())});
            }
            return C1642a.m8034a("%s://%s/", new Object[]{str2, uri.getHost()});
        } catch (URISyntaxException unused) {
            StringBuilder sb4 = new StringBuilder("Unable to set ");
            sb4.append(str);
            sb4.append(" as default origin header");
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final void sendEvent(String str, WritableMap writableMap) {
        ((RCTDeviceEventEmitter) this.mReactContext.getJSModule(RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    public final void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    public final void setContentHandler(int i, ContentHandler contentHandler) {
        if (contentHandler != null) {
            this.mContentHandlers.put(Integer.valueOf(i), contentHandler);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    @ReactMethod
    public final void send(String str, int i) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @ReactMethod
    public final void sendBinary(String str, int i) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(ByteString.decodeBase64(str));
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    public final void sendBinary(ByteString byteString, int i) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(byteString);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @ReactMethod
    public final void close(int i, String str, int i2) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket != null) {
            try {
                webSocket.close(i, str);
                this.mWebSocketConnections.remove(Integer.valueOf(i2));
                this.mContentHandlers.remove(Integer.valueOf(i2));
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Could not close WebSocket connection for id ");
                sb.append(i2);
                C13286a.m38861c("ReactNative", sb.toString(), (Throwable) e);
            }
        }
    }

    @ReactMethod
    public final void connect(String str, ReadableArray readableArray, ReadableMap readableMap, final int i) {
        try {
            OkHttpClient build = new Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(0, TimeUnit.MINUTES).build();
            Request.Builder url = new Request.Builder().tag(Integer.valueOf(i)).url(str);
            String cookie = getCookie(str);
            if (cookie != null) {
                url.addHeader("Cookie", cookie);
            }
            if (readableMap == null || !readableMap.hasKey("headers") || !readableMap.getType("headers").equals(ReadableType.Map)) {
                url.addHeader("origin", getDefaultOrigin(str));
            } else {
                ReadableMap map = readableMap.getMap("headers");
                ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                if (!map.hasKey("origin")) {
                    url.addHeader("origin", getDefaultOrigin(str));
                }
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    if (ReadableType.String.equals(map.getType(nextKey))) {
                        url.addHeader(nextKey, map.getString(nextKey));
                    } else {
                        StringBuilder sb = new StringBuilder("Ignoring: requested ");
                        sb.append(nextKey);
                        sb.append(", value not a string");
                        C13286a.m38860c("ReactNative", sb.toString());
                    }
                }
            }
            if (readableArray != null && readableArray.size() > 0) {
                StringBuilder sb2 = new StringBuilder("");
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    String trim = readableArray.getString(i2).trim();
                    if (!trim.isEmpty() && !trim.contains(",")) {
                        sb2.append(trim);
                        sb2.append(",");
                    }
                }
                if (sb2.length() > 0) {
                    sb2.replace(sb2.length() - 1, sb2.length(), "");
                    url.addHeader("Sec-WebSocket-Protocol", sb2.toString());
                }
            }
            build.newWebSocket(url.build(), new WebSocketListener() {
                public void onOpen(WebSocket webSocket, Response response) {
                    WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i), webSocket);
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("id", i);
                    WebSocketModule.this.sendEvent("websocketOpen", createMap);
                }

                public void onMessage(WebSocket webSocket, String str) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("id", i);
                    createMap.putString("type", "text");
                    ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                    if (contentHandler != null) {
                        contentHandler.onMessage(str, createMap);
                    } else {
                        createMap.putString("data", str);
                    }
                    WebSocketModule.this.sendEvent("websocketMessage", createMap);
                }

                public void onMessage(WebSocket webSocket, ByteString byteString) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("id", i);
                    createMap.putString("type", "binary");
                    ContentHandler contentHandler = (ContentHandler) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                    if (contentHandler != null) {
                        contentHandler.onMessage(byteString, createMap);
                    } else {
                        createMap.putString("data", byteString.base64());
                    }
                    WebSocketModule.this.sendEvent("websocketMessage", createMap);
                }

                public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                    WebSocketModule.this.notifyWebSocketFailed(i, th.getMessage());
                }

                public void onClosed(WebSocket webSocket, int i, String str) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("id", i);
                    createMap.putInt("code", i);
                    createMap.putString("reason", str);
                    WebSocketModule.this.sendEvent("websocketClosed", createMap);
                }
            });
            build.dispatcher.executorService().shutdown();
        } catch (Exception unused) {
        }
    }
}

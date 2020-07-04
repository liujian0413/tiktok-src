package com.facebook.react.packagerconnection;

import android.net.Uri.Builder;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback;
import com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.Map;
import okio.ByteString;
import org.json.JSONObject;

public final class JSPackagerClient implements MessageCallback {
    public static final String TAG = "JSPackagerClient";
    private Map<String, RequestHandler> mRequestHandlers;
    public ReconnectingWebSocket mWebSocket;

    class ResponderImpl implements Responder {
        private Object mId;

        public void error(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C38347c.f99551f, 2);
                jSONObject.put("id", this.mId);
                jSONObject.put("error", obj);
                JSPackagerClient.this.mWebSocket.sendMessage(jSONObject.toString());
            } catch (Exception e) {
                C13286a.m38861c(JSPackagerClient.TAG, "Responding with error failed", (Throwable) e);
            }
        }

        public void respond(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C38347c.f99551f, 2);
                jSONObject.put("id", this.mId);
                jSONObject.put("result", obj);
                JSPackagerClient.this.mWebSocket.sendMessage(jSONObject.toString());
            } catch (Exception e) {
                C13286a.m38861c(JSPackagerClient.TAG, "Responding failed", (Throwable) e);
            }
        }

        public ResponderImpl(Object obj) {
            this.mId = obj;
        }
    }

    public final void close() {
        this.mWebSocket.closeQuietly();
    }

    public final void init() {
        this.mWebSocket.connect();
    }

    public final void onMessage(ByteString byteString) {
        C13286a.m38860c(TAG, "Websocket received message with payload of unexpected type binary");
    }

    public final void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt(C38347c.f99551f);
            String optString = jSONObject.optString("method");
            Object opt = jSONObject.opt("id");
            Object opt2 = jSONObject.opt("params");
            if (optInt != 2) {
                String str2 = TAG;
                StringBuilder sb = new StringBuilder("Message with incompatible or missing version of protocol received: ");
                sb.append(optInt);
                C13286a.m38863d(str2, sb.toString());
            } else if (optString == null) {
                abortOnMessage(opt, "No method provided");
            } else {
                RequestHandler requestHandler = (RequestHandler) this.mRequestHandlers.get(optString);
                if (requestHandler == null) {
                    StringBuilder sb2 = new StringBuilder("No request handler for method: ");
                    sb2.append(optString);
                    abortOnMessage(opt, sb2.toString());
                } else if (opt == null) {
                    requestHandler.onNotification(opt2);
                } else {
                    requestHandler.onRequest(opt2, new ResponderImpl(opt));
                }
            }
        } catch (Exception e) {
            C13286a.m38861c(TAG, "Handling the message failed", (Throwable) e);
        }
    }

    private void abortOnMessage(Object obj, String str) {
        if (obj != null) {
            new ResponderImpl(obj).error(str);
        }
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("Handling the message failed with reason: ");
        sb.append(str);
        C13286a.m38863d(str2, sb.toString());
    }

    public JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map<String, RequestHandler> map) {
        this(str, packagerConnectionSettings, map, null);
    }

    public JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map<String, RequestHandler> map, ConnectionCallback connectionCallback) {
        Builder builder = new Builder();
        builder.scheme("ws").encodedAuthority(packagerConnectionSettings.getDebugServerHost()).appendPath("message").appendQueryParameter("device", AndroidInfoHelpers.getFriendlyDeviceName()).appendQueryParameter("app", packagerConnectionSettings.getPackageName()).appendQueryParameter("clientid", str);
        this.mWebSocket = new ReconnectingWebSocket(builder.build().toString(), this, connectionCallback);
        this.mRequestHandlers = map;
    }
}

package com.facebook.react.packagerconnection;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.p686c.C13286a;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

public final class ReconnectingWebSocket extends WebSocketListener {
    private static final String TAG = "ReconnectingWebSocket";
    private boolean mClosed;
    private ConnectionCallback mConnectionCallback;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private MessageCallback mMessageCallback;
    private boolean mSuppressConnectionErrors;
    private final String mUrl;
    private WebSocket mWebSocket;

    public interface ConnectionCallback {
        void onConnected();

        void onDisconnected();
    }

    public interface MessageCallback {
        void onMessage(String str);

        void onMessage(ByteString byteString);
    }

    public final synchronized void delayedReconnect() {
        if (!this.mClosed) {
            connect();
        }
    }

    private void closeWebSocketQuietly() {
        if (this.mWebSocket != null) {
            try {
                this.mWebSocket.close(1000, "End of session");
            } catch (Exception unused) {
            }
            this.mWebSocket = null;
        }
    }

    public final void closeQuietly() {
        this.mClosed = true;
        closeWebSocketQuietly();
        this.mMessageCallback = null;
        if (this.mConnectionCallback != null) {
            this.mConnectionCallback.onDisconnected();
        }
    }

    private void reconnect() {
        if (!this.mClosed) {
            if (!this.mSuppressConnectionErrors) {
                String str = TAG;
                StringBuilder sb = new StringBuilder("Couldn't connect to \"");
                sb.append(this.mUrl);
                sb.append("\", will silently retry");
                C13286a.m38860c(str, sb.toString());
                this.mSuppressConnectionErrors = true;
            }
            this.mHandler.postDelayed(new Runnable() {
                public void run() {
                    ReconnectingWebSocket.this.delayedReconnect();
                }
            }, 2000);
            return;
        }
        throw new IllegalStateException("Can't reconnect closed client");
    }

    public final void connect() {
        if (!this.mClosed) {
            new Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(0, TimeUnit.MINUTES).build().newWebSocket(new Request.Builder().url(this.mUrl).build(), this);
            return;
        }
        throw new IllegalStateException("Can't connect closed client");
    }

    public final synchronized void sendMessage(String str) throws IOException {
        if (this.mWebSocket != null) {
            this.mWebSocket.send(str);
        } else {
            throw new ClosedChannelException();
        }
    }

    public final synchronized void sendMessage(ByteString byteString) throws IOException {
        if (this.mWebSocket != null) {
            this.mWebSocket.send(byteString);
        } else {
            throw new ClosedChannelException();
        }
    }

    public final synchronized void onMessage(WebSocket webSocket, String str) {
        if (this.mMessageCallback != null) {
            this.mMessageCallback.onMessage(str);
        }
    }

    private void abort(String str, Throwable th) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("Error occurred, shutting down websocket connection: ");
        sb.append(str);
        C13286a.m38861c(str2, sb.toString(), th);
        closeWebSocketQuietly();
    }

    public final synchronized void onMessage(WebSocket webSocket, ByteString byteString) {
        if (this.mMessageCallback != null) {
            this.mMessageCallback.onMessage(byteString);
        }
    }

    public final synchronized void onOpen(WebSocket webSocket, Response response) {
        this.mWebSocket = webSocket;
        this.mSuppressConnectionErrors = false;
        if (this.mConnectionCallback != null) {
            this.mConnectionCallback.onConnected();
        }
    }

    public ReconnectingWebSocket(String str, MessageCallback messageCallback, ConnectionCallback connectionCallback) {
        this.mUrl = str;
        this.mMessageCallback = messageCallback;
        this.mConnectionCallback = connectionCallback;
    }

    public final synchronized void onClosed(WebSocket webSocket, int i, String str) {
        this.mWebSocket = null;
        if (!this.mClosed) {
            if (this.mConnectionCallback != null) {
                this.mConnectionCallback.onDisconnected();
            }
            reconnect();
        }
    }

    public final synchronized void onFailure(WebSocket webSocket, Throwable th, Response response) {
        if (this.mWebSocket != null) {
            abort("Websocket exception", th);
        }
        if (!this.mClosed) {
            if (this.mConnectionCallback != null) {
                this.mConnectionCallback.onDisconnected();
            }
            reconnect();
        }
    }
}

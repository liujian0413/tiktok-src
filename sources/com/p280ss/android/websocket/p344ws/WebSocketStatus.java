package com.p280ss.android.websocket.p344ws;

/* renamed from: com.ss.android.websocket.ws.WebSocketStatus */
public final class WebSocketStatus {

    /* renamed from: a */
    public ConnectState f117029a;

    /* renamed from: b */
    public long f117030b;

    /* renamed from: com.ss.android.websocket.ws.WebSocketStatus$ConnectState */
    public enum ConnectState {
        OPENING,
        CONNECTED,
        CLOSING,
        RETRY_WAITING,
        CLOSED
    }

    /* renamed from: a */
    public final WebSocketStatus mo108833a(ConnectState connectState) {
        this.f117029a = connectState;
        return this;
    }

    public WebSocketStatus(ConnectState connectState, long j) {
        this.f117029a = connectState;
        this.f117030b = j;
    }
}

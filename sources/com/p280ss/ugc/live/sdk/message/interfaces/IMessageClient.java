package com.p280ss.ugc.live.sdk.message.interfaces;

import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.data.JsonApiResult;
import com.p280ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMessageClient */
public interface IMessageClient {

    /* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMessageClient$Callback */
    public interface Callback {
        void onApiError(Exception exc);

        void onApiSuccess(JsonApiResult jsonApiResult);

        void onApiSuccess(ProtoApiResult protoApiResult);

        void onWebSocketMessage(IMessage iMessage);
    }

    void apiCall(Map<String, String> map);

    void connectToWebSocket();

    void disconnectFromWebSocket();

    long getUserId();

    void setCallback(Callback callback);
}

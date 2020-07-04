package com.bytedance.common.wschannel.channel;

import android.content.Context;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface IWsChannelClient {
    void destroy();

    void init(Context context, IWsChannelClient iWsChannelClient);

    boolean isConnected();

    void onAppStateChanged(int i);

    void onConnection(JSONObject jSONObject);

    void onMessage(byte[] bArr);

    void onNetworkStateChanged(int i);

    void onParameterChange(Map<String, Object> map, List<String> list);

    void openConnection(Map<String, Object> map, List<String> list);

    boolean sendMessage(byte[] bArr);

    void stopConnection();
}

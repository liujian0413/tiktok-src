package com.bytedance.common.wschannel.channel;

import android.content.Context;

public interface IWsChannelDepend {
    int getNetworkType(Context context);

    void loadLibrary(Context context, String str);

    void loggerD(String str, String str2);

    boolean loggerDebug();

    void setAdapter(IWsChannelDepend iWsChannelDepend);
}

package com.p280ss.avframework.livestreamv2.interact.callback;

/* renamed from: com.ss.avframework.livestreamv2.interact.callback.StateCallback */
public interface StateCallback {
    void onEndFailed(int i, String str);

    void onEndSuccess();

    void onError(String str);

    void onStartFailed(int i, String str);

    void onStartSuccess();

    void onWarn(String str);
}

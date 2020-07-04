package com.p280ss.android.common.applog;

/* renamed from: com.ss.android.common.applog.IClient */
public interface IClient {
    void getEstrFromAPI();

    String readEstrFromSharedPreference();

    void writeEstrToSharedPreference(String str);
}

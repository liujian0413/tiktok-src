package com.p280ss.android.common.applog;

/* renamed from: com.ss.android.common.applog.IAnticheat */
public interface IAnticheat {
    void onUpdateEstrFromApiFail(Exception exc);

    void onUpdateEstrFromApiSuccess(EstrBean estrBean);

    void updateEstr(String str);
}

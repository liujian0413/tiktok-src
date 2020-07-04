package com.p280ss.android.mobilelib.view;

/* renamed from: com.ss.android.mobilelib.view.CommonView */
public interface CommonView {
    void afterHandleRequest();

    void beforeHandleRequest();

    void showCaptchaView(String str, String str2, int i);

    void showErrorMessage(String str, int i, boolean z);
}

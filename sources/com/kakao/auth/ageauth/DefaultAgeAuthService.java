package com.kakao.auth.ageauth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.kakao.auth.AgeAuthParamBuilder;
import com.kakao.auth.AuthService.AgeAuthStatus;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.authorization.authcode.KakaoWebViewActivity;
import com.kakao.network.ServerProtocol;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.Utility;
import com.kakao.util.helper.log.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class DefaultAgeAuthService implements AgeAuthService {
    private static DefaultAgeAuthService instance;
    public Handler sHandler;

    static class AgeAuthResult {
        private KakaoException exception;
        private AtomicInteger result = new AtomicInteger();

        public KakaoException getException() {
            return this.exception;
        }

        public AtomicInteger getResult() {
            return this.result;
        }

        public void setException(KakaoException kakaoException) {
            this.exception = kakaoException;
        }

        public void setResult(AtomicInteger atomicInteger) {
            this.result = atomicInteger;
        }
    }

    public static DefaultAgeAuthService getInstance() {
        if (instance == null) {
            instance = new DefaultAgeAuthService(new Handler(Looper.getMainLooper()));
        }
        return instance;
    }

    DefaultAgeAuthService(Handler handler) {
        this.sHandler = handler;
    }

    public int requestShowAgeAuthDialog(Context context) {
        return requestShowAgeAuthDialog(context, new Bundle());
    }

    public int requestShowAgeAuthDialog(Context context, Bundle bundle) {
        return requestAgeAuth(bundle, KakaoSDK.getCurrentActivity(), Utility.isUsablePermission(context, "android.permission.RECEIVE_SMS"));
    }

    public int requestShowAgeAuthDialog(Context context, AgeAuthParamBuilder ageAuthParamBuilder) {
        return requestShowAgeAuthDialog(ageAuthParamBuilder, Utility.isUsablePermission(context, "android.permission.RECEIVE_SMS"));
    }

    public int requestShowAgeAuthDialog(AgeAuthParamBuilder ageAuthParamBuilder, boolean z) {
        return requestAgeAuth(ageAuthParamBuilder.build(), KakaoSDK.getCurrentActivity(), z);
    }

    public int requestAgeAuth(Bundle bundle, Activity activity, boolean z) {
        AgeAuthResult ageAuthResult = new AgeAuthResult();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Handler handler = this.sHandler;
        final AgeAuthResult ageAuthResult2 = ageAuthResult;
        final CountDownLatch countDownLatch2 = countDownLatch;
        final Activity activity2 = activity;
        final Bundle bundle2 = bundle;
        final boolean z2 = z;
        C185051 r0 = new Runnable() {
            public void run() {
                try {
                    DefaultAgeAuthService.this.requestWebviewAuth(activity2, bundle2, z2, new ResultReceiver(DefaultAgeAuthService.this.sHandler) {
                        /* access modifiers changed from: protected */
                        public void onReceiveResult(int i, Bundle bundle) {
                            int value = AgeAuthStatus.CLIENT_ERROR.getValue();
                            if (i == 0) {
                                String string = bundle.getString("key.redirect.url");
                                if (!(string == null || Uri.parse(string).getQueryParameter("status") == null)) {
                                    value = Integer.valueOf(Uri.parse(string).getQueryParameter("status")).intValue();
                                }
                            } else if (i == 1) {
                                ageAuthResult2.setException((KakaoException) bundle.getSerializable("key.exception"));
                            }
                            ageAuthResult2.getResult().set(value);
                            countDownLatch2.countDown();
                        }
                    });
                } catch (Exception e) {
                    ageAuthResult2.getResult().set(AgeAuthStatus.CLIENT_ERROR.getValue());
                    ageAuthResult2.setException(new KakaoException((Throwable) e));
                    countDownLatch2.countDown();
                }
            }
        };
        handler.post(r0);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Logger.m60933e(e.toString());
        }
        if (ageAuthResult.getException() == null) {
            return ageAuthResult.getResult().get();
        }
        throw ageAuthResult.getException();
    }

    public boolean requestWebviewAuth(Context context, Bundle bundle, boolean z, ResultReceiver resultReceiver) {
        boolean isUsingWebviewTimer = KakaoSDK.getAdapter().getSessionConfig().isUsingWebviewTimer();
        Uri buildUri = Utility.buildUri(ServerProtocol.AGE_AUTH_AUTHORITY, "ageauths/main.html", bundle);
        StringBuilder sb = new StringBuilder("AgeAuth request Url : ");
        sb.append(buildUri);
        Logger.m60925d(sb.toString());
        Intent newIntent = KakaoWebViewActivity.newIntent(context);
        newIntent.putExtra("key.url", buildUri.toString());
        newIntent.putExtra("key.use.webview.timers", isUsingWebviewTimer);
        newIntent.putExtra("key.use.sms.receiver", z);
        newIntent.putExtra("key.result.receiver", resultReceiver);
        context.startActivity(newIntent);
        return true;
    }
}

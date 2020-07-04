package com.kakao.auth;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.kakao.util.IConfiguration.Factory;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.exception.KakaoException.ErrorType;

public class KakaoSDK {
    private static volatile KakaoAdapter adapter;
    public static volatile Activity currentActivity;

    public static class AlreadyInitializedException extends RuntimeException {
        private static final long serialVersionUID = 1;
    }

    public static KakaoAdapter getAdapter() {
        return adapter;
    }

    public static Activity getCurrentActivity() {
        return currentActivity;
    }

    public static synchronized void init(KakaoAdapter kakaoAdapter) {
        synchronized (KakaoSDK.class) {
            if (adapter != null) {
                throw new AlreadyInitializedException();
            } else if (kakaoAdapter != null) {
                adapter = kakaoAdapter;
                Context applicationContext = kakaoAdapter.getApplicationConfig().getApplicationContext();
                Application application = (Application) applicationContext;
                application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                    private int numActivities;

                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityDestroyed(Activity activity) {
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityStarted(Activity activity) {
                    }

                    public final void onActivityStopped(Activity activity) {
                        this.numActivities--;
                    }

                    public final void onActivityPaused(Activity activity) {
                        if (activity != null && activity.equals(KakaoSDK.currentActivity)) {
                            KakaoSDK.currentActivity = null;
                        }
                    }

                    public final void onActivityResumed(Activity activity) {
                        KakaoSDK.currentActivity = activity;
                        if (this.numActivities == 0 && KakaoSDK.needsToResetSession(activity, Session.getCurrentSession())) {
                            Session.getCurrentSession().internalClose(new KakaoException(ErrorType.CANCELED_OPERATION, "App restarted during Kakao login procedure. Restarting from the start."));
                        }
                        this.numActivities++;
                    }
                });
                ApprovalType approvalType = kakaoAdapter.getSessionConfig().getApprovalType();
                Factory.createConfiguration(applicationContext);
                Session.initialize(application, approvalType);
            } else {
                throw new KakaoException(ErrorType.MISS_CONFIGURATION, "adapter is null");
            }
        }
    }

    public static boolean needsToResetSession(Activity activity, Session session) {
        if ("android.intent.action.MAIN".equals(activity.getIntent().getAction()) && session.isClosed() && session.getRequestType() != null) {
            return true;
        }
        return false;
    }
}

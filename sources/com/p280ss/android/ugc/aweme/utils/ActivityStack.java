package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.collection.C6308d;
import com.p280ss.android.common.applog.TeaAgent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.utils.ActivityStack */
public final class ActivityStack {
    public static ActivityLifecycleCallbacks lifecycleCallbacks = new ActivityLifecycleCallbacks() {
        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            synchronized (ActivityStack.class) {
                ActivityStack.sActivityStack.remove(activity);
            }
        }

        public final void onActivityStarted(Activity activity) {
            synchronized (ActivityStack.class) {
                ActivityStack.sStartedActivities.mo15143a(activity);
            }
        }

        public final void onActivityResumed(Activity activity) {
            synchronized (ActivityStack.class) {
                if (ActivityStack.sAppBackGround) {
                    ActivityStack.sAppBackGround = false;
                    if (!ActivityStack.sAppBackgroundListeners.mo15145b()) {
                        Iterator it = ActivityStack.sAppBackgroundListeners.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
            }
        }

        public final void onActivityStopped(Activity activity) {
            synchronized (ActivityStack.class) {
                ActivityStack.sStartedActivities.mo15144b(activity);
                if (!ActivityStack.sAppBackGround && ActivityStack.sStartedActivities.mo15145b()) {
                    ActivityStack.sAppBackGround = true;
                    if (!ActivityStack.sAppBackgroundListeners.mo15145b()) {
                        Iterator it = ActivityStack.sAppBackgroundListeners.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            synchronized (ActivityStack.class) {
                ActivityStack.sActivityStack.remove(activity);
                ActivityStack.sActivityStack.add(activity);
            }
            TeaAgent.onActivityCreate((Context) activity);
        }
    };
    static LinkedList<Activity> sActivityStack = new LinkedList<>();
    static boolean sAppBackGround = true;
    static C6308d<C42900b> sAppBackgroundListeners = new C6308d<>();
    static C6308d<Activity> sStartedActivities = new C6308d<>();

    /* renamed from: com.ss.android.ugc.aweme.utils.ActivityStack$a */
    public interface C42899a {
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ActivityStack$b */
    public interface C42900b {
    }

    public static boolean isAppBackGround() {
        return sAppBackGround;
    }

    public static synchronized Activity[] getActivityStack() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            activityArr = (Activity[]) sActivityStack.toArray(new Activity[sActivityStack.size()]);
        }
        return activityArr;
    }

    public static synchronized Activity getTopActivity() {
        synchronized (ActivityStack.class) {
            if (sActivityStack.isEmpty()) {
                return null;
            }
            Activity activity = (Activity) sActivityStack.getLast();
            return activity;
        }
    }

    public static synchronized Activity getValidTopActivity() {
        Activity topActivity;
        synchronized (ActivityStack.class) {
            topActivity = getTopActivity();
            if (topActivity != null && topActivity.isFinishing()) {
                sActivityStack.removeLast();
                topActivity = getValidTopActivity();
            }
        }
        return topActivity;
    }

    public static synchronized Activity getPreviousActivity() {
        synchronized (ActivityStack.class) {
            if (sActivityStack.size() < 2) {
                return null;
            }
            LinkedList<Activity> linkedList = sActivityStack;
            Activity activity = (Activity) linkedList.get(linkedList.size() - 2);
            return activity;
        }
    }

    public static synchronized Activity[] getStartedActivitys() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            ArrayList arrayList = new ArrayList();
            Iterator it = sStartedActivities.iterator();
            while (it != null && it.hasNext()) {
                Activity activity = (Activity) it.next();
                if (activity != null) {
                    arrayList.add(activity);
                }
            }
            activityArr = (Activity[]) arrayList.toArray(new Activity[arrayList.size()]);
        }
        return activityArr;
    }

    public static synchronized void removeAppBackGroundListener(C42900b bVar) {
        synchronized (ActivityStack.class) {
            if (bVar != null) {
                sAppBackgroundListeners.mo15144b(bVar);
            }
        }
    }

    public static synchronized void addAppBackGroundListener(C42900b bVar) {
        synchronized (ActivityStack.class) {
            if (bVar != null) {
                if (!sAppBackgroundListeners.mo15147c(bVar)) {
                    sAppBackgroundListeners.mo15143a(bVar);
                }
            }
        }
    }

    public static void finishAllFlipChatActivity(Class<?> cls) {
        Iterator it = sActivityStack.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (cls.isInstance(activity) && !(activity instanceof C42899a)) {
                activity.finish();
            }
        }
    }

    public static synchronized Activity getPreviousActivity(Activity activity) {
        Activity activity2;
        synchronized (ActivityStack.class) {
            LinkedList<Activity> linkedList = sActivityStack;
            activity2 = null;
            int size = linkedList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Activity activity3 = (Activity) linkedList.get(size);
                if (activity3 == activity || activity3.getTaskId() != activity.getTaskId()) {
                    int i = size - 1;
                    if (i >= 0) {
                        activity2 = (Activity) linkedList.get(i);
                        break;
                    }
                }
                size--;
            }
        }
        return activity2;
    }
}

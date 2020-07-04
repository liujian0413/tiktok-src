package com.p280ss.ttm.utils.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* renamed from: com.ss.ttm.utils.app.ServiceUtil */
public class ServiceUtil {
    private static int getUserId() {
        int intValue;
        int i = -1;
        try {
            Class cls = Class.forName("android.os.Process");
            if (cls == null) {
                return -1;
            }
            Method declaredMethod = RefUtil.getDeclaredMethod(cls, "myUserHandle", (Class<?>[]) new Class[0]);
            if (declaredMethod != null) {
                intValue = ((Integer) RefUtil.invokeMethod((UserHandle) declaredMethod.invoke(null, new Object[0]), "getIdentifier")).intValue();
            } else {
                Class cls2 = Class.forName("android.os.UserId");
                if (cls2 != null) {
                    Method declaredMethod2 = RefUtil.getDeclaredMethod(cls2, "getUserId", (Class<?>[]) new Class[]{Integer.TYPE});
                    if (declaredMethod2 != null) {
                        Integer num = (Integer) declaredMethod2.invoke(null, new Object[]{Integer.valueOf(Process.myUid())});
                        if (num != null) {
                            intValue = num.intValue();
                        }
                    }
                }
                return i;
            }
            i = intValue;
            return i;
        } catch (Exception unused) {
        }
    }

    static IBinder getActivityToken(Object obj) {
        return (IBinder) RefUtil.invokeMethod(obj, "getActivityToken");
    }

    static Object getApplicatonThread(Object obj) {
        return RefUtil.invokeMethod(RefUtil.getFieldValue(obj, "mMainThread"), "getApplicationThread");
    }

    static String getOpPackageName(Object obj) {
        return (String) RefUtil.invokeMethod(obj, "getOpPackageName");
    }

    static Object getServiceDispatcher(Object obj, ServiceConnection serviceConnection, Context context, Handler handler, int i) {
        Object[] objArr = {serviceConnection, context, handler, Integer.valueOf(i)};
        return RefUtil.invokeMethod(obj, "getServiceDispatcher", new Class[]{ServiceConnection.class, Context.class, Handler.class, Integer.TYPE}, objArr);
    }

    public static boolean bindService(ContextWrapper contextWrapper, Intent intent, ServiceConnection serviceConnection, int i, Handler handler) {
        Method method;
        Integer num;
        Intent intent2 = intent;
        ServiceConnection serviceConnection2 = serviceConnection;
        Context baseContext = contextWrapper.getBaseContext();
        if (serviceConnection2 != null) {
            Object fieldValue = RefUtil.getFieldValue(baseContext, "mPackageInfo");
            if (fieldValue != null) {
                Object serviceDispatcher = getServiceDispatcher(fieldValue, serviceConnection2, contextWrapper, handler, i);
                try {
                    IBinder activityToken = getActivityToken(baseContext);
                    if (VERSION.SDK_INT < 18) {
                        if (RefUtil.getDeclaredMethod((Object) intent2, "setAllowFds", (Class<?>[]) new Class[]{Boolean.class}) != null) {
                            RefUtil.invokeMethod(intent2, "setAllowFds", new Class[]{Boolean.class}, new Object[]{Boolean.valueOf(false)});
                        }
                    } else if (RefUtil.getDeclaredMethod(intent.getClass(), "prepareToLeaveProcess", (Class<?>[]) new Class[0]) != null) {
                        RefUtil.invokeMethod(intent2, "prepareToLeaveProcess");
                    }
                    Class[] clsArr = null;
                    Object invoke = RefUtil.getDeclaredMethod(Class.forName("android.app.ActivityManagerNative"), "getDefault", (Class<?>[]) new Class[0]).invoke(null, new Object[0]);
                    if (invoke != null) {
                        Method[] declaredMethods = invoke.getClass().getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                method = null;
                                break;
                            }
                            method = declaredMethods[i2];
                            if (method.getName().equals("bindService")) {
                                clsArr = method.getParameterTypes();
                                break;
                            }
                            i2++;
                        }
                        if (method != null) {
                            Integer.valueOf(-1);
                            if (clsArr.length == 6) {
                                num = (Integer) method.invoke(invoke, new Object[]{getApplicatonThread(baseContext), activityToken, intent2, intent2.resolveTypeIfNeeded(baseContext.getContentResolver()), serviceDispatcher, Integer.valueOf(i)});
                            } else if (clsArr.length == 7) {
                                num = (Integer) method.invoke(invoke, new Object[]{getApplicatonThread(baseContext), activityToken, intent2, intent2.resolveTypeIfNeeded(baseContext.getContentResolver()), serviceDispatcher, Integer.valueOf(i), Integer.valueOf(getUserId())});
                            } else if (clsArr.length == 8) {
                                ContentResolver contentResolver = baseContext.getContentResolver();
                                num = (Integer) method.invoke(invoke, new Object[]{getApplicatonThread(baseContext), activityToken, intent2, intent2.resolveTypeIfNeeded(contentResolver), serviceDispatcher, Integer.valueOf(i), getOpPackageName(baseContext), Integer.valueOf(getUserId())});
                            } else {
                                throw new RuntimeException("bindService parameter is error.");
                            }
                            if (num.intValue() < 0) {
                                StringBuilder sb = new StringBuilder("bindService is error.ret:");
                                sb.append(num);
                                throw new RuntimeException(sb.toString());
                            } else if (num.intValue() != 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else {
                            throw new RuntimeException("bindService method is null.");
                        }
                    } else {
                        throw new RuntimeException("avtivityManager object is null");
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                }
            } else {
                throw new RuntimeException("Not supported in system context");
            }
        } else {
            throw new IllegalArgumentException("connection is null");
        }
    }
}

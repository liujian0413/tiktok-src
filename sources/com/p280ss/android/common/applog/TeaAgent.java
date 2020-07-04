package com.p280ss.android.common.applog;

import android.accounts.Account;
import android.content.Context;
import com.p280ss.android.common.applog.AppLog.ConfigUpdateListenerEnhanced;
import com.p280ss.android.common.applog.AppLog.ICrashCallback;
import com.p280ss.android.common.applog.AppLog.ILogSessionHook;
import com.p280ss.android.common.applog.p286a.C6747c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.TeaAgent */
public class TeaAgent {
    public static void onAppQuit() {
        AppLog.onAppQuit();
    }

    public static void onQuit() {
        AppLog.onQuit();
    }

    public static void tryEnableANRMonitor() {
        AppLog.tryEnableANRMonitor();
    }

    public static void tryWaitDeviceInit() {
        AppLog.tryWaitDeviceInit();
    }

    public static String getAbSDKVersion() {
        return AppLog.getAbSDKVersion();
    }

    public static String getClientUDID() {
        return AppLog.getClientId();
    }

    public static JSONObject getHeaderCopy() {
        return AppLog.getHeaderCopy();
    }

    public static String getInstallId() {
        return AppLog.getInstallId();
    }

    public static String getServerDeviceId() {
        return AppLog.getServerDeviceId();
    }

    public static void activeUser(Context context) {
        AppLog.activeUser(context);
    }

    public static void addSessionHook(ILogSessionHook iLogSessionHook) {
        AppLog.addSessionHook(iLogSessionHook);
    }

    public static void getSSIDs(Map<String, String> map) {
        AppLog.getSSIDs(map);
    }

    public static void init(TeaConfig teaConfig) {
        TeaAgentHelper.init(teaConfig);
    }

    public static void onActivityCreate(Context context) {
        AppLog.onActivityCreate(context);
    }

    public static void onPause(Context context) {
        AppLog.onPause(context);
    }

    public static void onResume(Context context) {
        AppLog.onResume(context);
    }

    public static void registerCrashCallBackHandler(ICrashCallback iCrashCallback) {
        AppLog.registerCrashCallBackHandler(iCrashCallback);
    }

    public static void registerCrashHandler(Context context) {
        AppLog.registerCrashHandler(context);
    }

    public static void registerGlobalEventCallback(GlobalEventCallback globalEventCallback) {
        AppLog.registerGlobalEventCallback(globalEventCallback);
    }

    public static void removeSessionHook(ILogSessionHook iLogSessionHook) {
        AppLog.removeSessionHook(iLogSessionHook);
    }

    public static void sendANRLog(String str) {
        AppLog.sendANRLog(str);
    }

    public static void setAbSDKVersion(String str) {
        AppLog.setAbSDKVersion(str);
    }

    public static void setConfigUpdateListener(ConfigUpdateListenerEnhanced configUpdateListenerEnhanced) {
        AppLog.setConfigUpdateListener(configUpdateListenerEnhanced);
    }

    public static void setDefaultUserAgent(String str) {
        AppLog.setDefaultUserAgent(str);
    }

    public static void setSessionHook(ILogSessionHook iLogSessionHook) {
        AppLog.setSessionHook(iLogSessionHook);
    }

    public static void tryEnableTrafficGuard(int i) {
        AppLog.tryEnableTrafficGuard(i);
    }

    public static void unRegisterCrashCallBackHandler(ICrashCallback iCrashCallback) {
        AppLog.unRegisterCrashCallBackHandler(iCrashCallback);
    }

    public static String getSigHash(Context context) {
        return AppLog.getSigHash(context);
    }

    public static void onActivityCreate(String str) {
        AppLog.onActivityCreate(str);
    }

    public static void onTaskPause(Context context) {
        C6747c.m20890a(context).mo16510b();
    }

    public static void onTaskResume(Context context) {
        C6747c.m20890a(context).mo16514e();
    }

    public static void clearDidAndIid(Context context, String str) {
        AppLog.clearDidAndIid(context, str);
    }

    public static void recordMonLog(String str, String str2) {
        AppLog.recordMonLog(str, str2);
    }

    public static void setAccount(Context context, Account account) {
        AppLog.setAccount(context, account);
    }

    public static void onEvent(Context context, String str) {
        onEvent(context, "umeng", str, null, 0, 0, false, null);
    }

    public static void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        AppLog.recordMiscLog(context, str, jSONObject);
    }

    public static void onPause(Context context, String str, int i) {
        AppLog.onPause(context, str, i);
    }

    public static void onResume(Context context, String str, int i) {
        AppLog.onResume(context, str, i);
    }

    public static void onEvent(Context context, String str, String str2) {
        onEvent(context, "umeng", str, str2, 0, 0, false, null);
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2) {
        onEvent(context, str, str2, str3, j, j2, false, null);
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        onEvent(context, str, str2, str3, j, j2, false, jSONObject);
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z) {
        onEvent(context, str, str2, str3, j, j2, z, null);
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        AppLog.onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }
}

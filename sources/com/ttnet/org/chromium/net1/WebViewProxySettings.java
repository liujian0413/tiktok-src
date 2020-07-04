package com.ttnet.org.chromium.net1;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import java.lang.reflect.Field;
import java.util.Properties;

public class WebViewProxySettings {
    private static volatile WebViewProxySettings mInstance;
    private static volatile boolean mIsProxyEnabled;
    private static volatile boolean mIsProxyServerStarted;
    private String mProxyHost = "127.0.0.1";
    private int mProxyPort = 8143;

    public String getProxyHost() {
        return this.mProxyHost;
    }

    public int getProxyPort() {
        return this.mProxyPort;
    }

    public static boolean isWebViewProxyEnabled() {
        if (!mIsProxyServerStarted || !mIsProxyEnabled) {
            return false;
        }
        return true;
    }

    public static WebViewProxySettings inst() {
        if (mInstance == null) {
            synchronized (WebViewProxySettings.class) {
                if (mInstance == null) {
                    mInstance = new WebViewProxySettings();
                }
            }
        }
        return mInstance;
    }

    public void removeSystemProperties() {
        Properties properties = System.getProperties();
        properties.remove("http.proxyHost");
        properties.remove("http.proxyPort");
        properties.remove("https.proxyHost");
        properties.remove("https.proxyPort");
    }

    public void setProxyServerStarted(Boolean bool) {
        mIsProxyServerStarted = bool.booleanValue();
    }

    public boolean revertBackProxy(Context context) {
        if (VERSION.SDK_INT < 19 || !mIsProxyServerStarted || !mIsProxyEnabled || !revertProxyKKPlus(context)) {
            return false;
        }
        mIsProxyEnabled = false;
        return true;
    }

    public boolean setProxy(Context context) {
        if (VERSION.SDK_INT < 19 || !mIsProxyServerStarted || mIsProxyEnabled || !setProxyKKPlus(context)) {
            return false;
        }
        mIsProxyEnabled = true;
        return true;
    }

    private boolean revertProxyKKPlus(Context context) {
        Context applicationContext = context.getApplicationContext();
        try {
            Field field = applicationContext.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationContext);
            Field declaredField = Class.forName("android.app.LoadedApk").getDeclaredField("mReceivers");
            declaredField.setAccessible(true);
            for (ArrayMap keySet : ((ArrayMap) declaredField.get(obj)).values()) {
                for (Object next : keySet.keySet()) {
                    Class cls = next.getClass();
                    if (cls.getName().contains("ProxyChangeListener")) {
                        cls.getDeclaredMethod("onReceive", new Class[]{Context.class, Intent.class}).invoke(next, new Object[]{applicationContext, new Intent("android.intent.action.PROXY_CHANGE")});
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean setProxyKKPlus(Context context) {
        setSystemProperties(this.mProxyHost, this.mProxyPort);
        Context applicationContext = context.getApplicationContext();
        try {
            Field field = applicationContext.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationContext);
            Field declaredField = Class.forName("android.app.LoadedApk").getDeclaredField("mReceivers");
            declaredField.setAccessible(true);
            for (ArrayMap keySet : ((ArrayMap) declaredField.get(obj)).values()) {
                for (Object next : keySet.keySet()) {
                    Class cls = next.getClass();
                    if (cls.getName().contains("ProxyChangeListener")) {
                        cls.getDeclaredMethod("onReceive", new Class[]{Context.class, Intent.class}).invoke(next, new Object[]{applicationContext, new Intent("android.intent.action.PROXY_CHANGE")});
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        } finally {
            postDelayedTaskToMainThread(new Runnable() {
                public void run() {
                    WebViewProxySettings.this.removeSystemProperties();
                }
            }, 2000);
        }
    }

    public void setProxyHostAndPort(String str, int i) {
        this.mProxyHost = str;
        this.mProxyPort = i;
    }

    private void postDelayedTaskToMainThread(Runnable runnable, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
    }

    private void setSystemProperties(String str, int i) {
        System.setProperty("http.proxyHost", str);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        System.setProperty("http.proxyPort", sb.toString());
        System.setProperty("http.nonProxyHosts", "g.cn.miaozhen.com|amfr.snssdk.com");
        System.setProperty("https.proxyHost", str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        System.setProperty("https.proxyPort", sb2.toString());
    }
}

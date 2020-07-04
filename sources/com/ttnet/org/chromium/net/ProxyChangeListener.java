package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ttnet.org.chromium.base.BuildConfig;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@JNINamespace("net")
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static boolean sEnabled = true;
    private Delegate mDelegate;
    private final Handler mHandler = new Handler(this.mLooper);
    private final Looper mLooper = Looper.myLooper();
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    public interface Delegate {
        void proxySettingsChanged();
    }

    static class ProxyConfig {
        public static final ProxyConfig DIRECT = new ProxyConfig("", 0, "", new String[0]);
        public final String[] mExclusionList;
        public final String mHost;
        public final String mPacUrl;
        public final int mPort;

        public static ProxyConfig fromProxyInfo(ProxyInfo proxyInfo) {
            String str = null;
            if (proxyInfo == null) {
                return null;
            }
            Uri pacFileUrl = proxyInfo.getPacFileUrl();
            String host = proxyInfo.getHost();
            int port = proxyInfo.getPort();
            if (!Uri.EMPTY.equals(pacFileUrl)) {
                str = pacFileUrl.toString();
            }
            return new ProxyConfig(host, port, str, proxyInfo.getExclusionList());
        }

        public ProxyConfig(String str, int i, String str2, String[] strArr) {
            this.mHost = str;
            this.mPort = i;
            this.mPacUrl = str2;
            this.mExclusionList = strArr;
        }
    }

    class ProxyReceiver extends BroadcastReceiver {
        private ProxyReceiver() {
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void lambda$onReceive$0$ProxyChangeListener$ProxyReceiver(Intent intent) {
            ProxyChangeListener.this.proxySettingsChanged(extractNewProxy(intent));
        }

        private ProxyConfig extractNewProxy(Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            if (VERSION.SDK_INT >= 21) {
                return ProxyConfig.fromProxyInfo((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
            }
            try {
                Object obj = extras.get("proxy");
                if (obj == null) {
                    return null;
                }
                Class cls = Class.forName("android.net.ProxyProperties");
                Method declaredMethod = cls.getDeclaredMethod("getHost", new Class[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("getPort", new Class[0]);
                Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new Class[0]);
                String str = (String) declaredMethod.invoke(obj, new Object[0]);
                int intValue = ((Integer) declaredMethod2.invoke(obj, new Object[0])).intValue();
                String[] split = ((String) declaredMethod3.invoke(obj, new Object[0])).split(",");
                if (VERSION.SDK_INT >= 19) {
                    String str2 = (String) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj, new Object[0]);
                    if (!TextUtils.isEmpty(str2)) {
                        return new ProxyConfig(str, intValue, str2, split);
                    }
                }
                return new ProxyConfig(str, intValue, null, split);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
                return null;
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.runOnThread(new ProxyChangeListener$ProxyReceiver$$Lambda$0(this, intent));
            }
        }
    }

    @NativeClassQualifiedName("ProxyConfigServiceAndroid::JNIDelegate")
    private native void nativeProxySettingsChanged(long j);

    @NativeClassQualifiedName("ProxyConfigServiceAndroid::JNIDelegate")
    private native void nativeProxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: lambda$updateProxyConfigFromConnectivityManager$0$ProxyChangeListener */
    public final /* synthetic */ void mo116757x81efdc3c() {
        proxySettingsChanged(getProxyConfig());
    }

    private boolean onThread() {
        if (this.mLooper == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public void stop() {
        assertOnThread();
        this.mNativePtr = 0;
        unregisterReceiver();
    }

    /* access modifiers changed from: 0000 */
    public void updateProxyConfigFromConnectivityManager() {
        runOnThread(new ProxyChangeListener$$Lambda$0(this));
    }

    private ProxyChangeListener() {
    }

    private void assertOnThread() {
        if (BuildConfig.DCHECK_IS_ON && !onThread()) {
            throw new IllegalStateException("Must be called on ProxyChangeListener thread.");
        }
    }

    private ProxyConfig getProxyConfig() {
        ProxyInfo defaultProxy = ((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")).getDefaultProxy();
        if (defaultProxy == null) {
            return ProxyConfig.DIRECT;
        }
        return ProxyConfig.fromProxyInfo(defaultProxy);
    }

    private void unregisterReceiver() {
        assertOnThread();
        ContextUtils.getApplicationContext().unregisterReceiver(this.mProxyReceiver);
        if (this.mRealProxyReceiver != null) {
            ContextUtils.getApplicationContext().unregisterReceiver(this.mRealProxyReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    private void registerReceiver() {
        assertOnThread();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new ProxyReceiver();
        if (VERSION.SDK_INT < 23) {
            ContextUtils.getApplicationContext().registerReceiver(this.mProxyReceiver, intentFilter);
            return;
        }
        ContextUtils.getApplicationContext().registerReceiver(this.mProxyReceiver, new IntentFilter());
        this.mRealProxyReceiver = new ProxyBroadcastReceiver(this);
        ContextUtils.getApplicationContext().registerReceiver(this.mRealProxyReceiver, intentFilter);
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    public void start(long j) {
        assertOnThread();
        this.mNativePtr = j;
        registerReceiver();
    }

    public void proxySettingsChanged(ProxyConfig proxyConfig) {
        assertOnThread();
        if (sEnabled) {
            if (this.mDelegate != null) {
                this.mDelegate.proxySettingsChanged();
            }
            if (this.mNativePtr != 0) {
                if (proxyConfig != null) {
                    nativeProxySettingsChangedTo(this.mNativePtr, proxyConfig.mHost, proxyConfig.mPort, proxyConfig.mPacUrl, proxyConfig.mExclusionList);
                    return;
                }
                nativeProxySettingsChanged(this.mNativePtr);
            }
        }
    }
}

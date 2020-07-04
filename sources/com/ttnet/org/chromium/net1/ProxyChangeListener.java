package com.ttnet.org.chromium.net1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import com.ttnet.org.chromium.base1.annotations.NativeClassQualifiedName;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@JNINamespace("net")
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static boolean sEnabled = true;
    private Context mContext;
    private Delegate mDelegate;
    private final Handler mHandler = new Handler(this.mLooper);
    private final Looper mLooper = Looper.myLooper();
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;

    public interface Delegate {
        void proxySettingsChanged();
    }

    static class ProxyConfig {
        public final String[] mExclusionList;
        public final String mHost;
        public final String mPacUrl;
        public final int mPort;

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

        public ProxyConfig extractNewProxy(Intent intent) {
            String str;
            String str2;
            String[] strArr;
            try {
                if (VERSION.SDK_INT < 21) {
                    str2 = "android.net.ProxyProperties";
                    str = "proxy";
                } else {
                    str2 = "android.net.ProxyInfo";
                    str = "android.intent.extra.PROXY_INFO";
                }
                Object obj = intent.getExtras().get(str);
                if (obj == null) {
                    return null;
                }
                Class cls = Class.forName(str2);
                Method declaredMethod = cls.getDeclaredMethod("getHost", new Class[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("getPort", new Class[0]);
                Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new Class[0]);
                String str3 = (String) declaredMethod.invoke(obj, new Object[0]);
                int intValue = ((Integer) declaredMethod2.invoke(obj, new Object[0])).intValue();
                if (!TextUtils.isEmpty(str3)) {
                    if (intValue > 0) {
                        if (WebViewProxySettings.inst().getProxyHost().equals(str3) && WebViewProxySettings.inst().getProxyPort() == intValue) {
                            return null;
                        }
                        if (VERSION.SDK_INT < 21) {
                            strArr = ((String) declaredMethod3.invoke(obj, new Object[0])).split(",");
                        } else {
                            strArr = (String[]) declaredMethod3.invoke(obj, new Object[0]);
                        }
                        if (VERSION.SDK_INT >= 19 && VERSION.SDK_INT < 21) {
                            String str4 = (String) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj, new Object[0]);
                            if (!TextUtils.isEmpty(str4)) {
                                return new ProxyConfig(str3, intValue, str4, strArr);
                            }
                        } else if (VERSION.SDK_INT >= 21) {
                            Uri uri = (Uri) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj, new Object[0]);
                            if (!Uri.EMPTY.equals(uri)) {
                                return new ProxyConfig(str3, intValue, uri.toString(), strArr);
                            }
                        }
                        return new ProxyConfig(str3, intValue, null, strArr);
                    }
                }
                return null;
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (NoSuchMethodException unused2) {
                return null;
            } catch (IllegalAccessException unused3) {
                return null;
            } catch (InvocationTargetException unused4) {
                return null;
            } catch (NullPointerException unused5) {
                return null;
            }
        }

        public void onReceive(Context context, final Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.runOnThread(new Runnable() {
                    public void run() {
                        ProxyChangeListener.this.proxySettingsChanged(ProxyReceiver.this, ProxyReceiver.this.extractNewProxy(intent));
                    }
                });
            }
        }
    }

    private void assertOnThread() {
    }

    @NativeClassQualifiedName("ProxyConfigServiceAndroid::JNIDelegate")
    private native void nativeProxySettingsChanged(long j);

    @NativeClassQualifiedName("ProxyConfigServiceAndroid::JNIDelegate")
    private native void nativeProxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);

    private boolean onThread() {
        if (this.mLooper == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    private void unregisterReceiver() {
        if (this.mProxyReceiver != null) {
            this.mContext.unregisterReceiver(this.mProxyReceiver);
            this.mProxyReceiver = null;
        }
    }

    public void stop() {
        assertOnThread();
        this.mNativePtr = 0;
        unregisterReceiver();
    }

    private void registerReceiver() {
        if (this.mProxyReceiver == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            this.mProxyReceiver = new ProxyReceiver();
            this.mContext.getApplicationContext().registerReceiver(this.mProxyReceiver, intentFilter);
        }
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public static ProxyChangeListener create(Context context) {
        return new ProxyChangeListener(context);
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

    private ProxyChangeListener(Context context) {
        this.mContext = context;
    }

    public void proxySettingsChanged(ProxyReceiver proxyReceiver, ProxyConfig proxyConfig) {
        if (sEnabled && proxyReceiver == this.mProxyReceiver) {
            if (this.mDelegate != null) {
                this.mDelegate.proxySettingsChanged();
            }
            if (this.mNativePtr != 0) {
                if (proxyConfig != null) {
                    nativeProxySettingsChangedTo(this.mNativePtr, proxyConfig.mHost, proxyConfig.mPort, proxyConfig.mPacUrl, proxyConfig.mExclusionList);
                    return;
                }
                String property = System.getProperty("http.proxyHost");
                String property2 = System.getProperty("http.proxyPort");
                if (!TextUtils.isEmpty(property) && !TextUtils.isEmpty(property2)) {
                    int parseInt = Integer.parseInt(property2);
                    if (WebViewProxySettings.inst().getProxyHost().equals(property) && WebViewProxySettings.inst().getProxyPort() == parseInt) {
                        return;
                    }
                }
                nativeProxySettingsChanged(this.mNativePtr);
            }
        }
    }
}

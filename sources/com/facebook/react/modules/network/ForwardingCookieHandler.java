package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ForwardingCookieHandler extends CookieHandler {
    public static final boolean USES_LEGACY_STORE;
    private final ReactContext mContext;
    private CookieManager mCookieManager;
    public final CookieSaver mCookieSaver = new CookieSaver();

    class CookieSaver {
        private final Handler mHandler;

        public void flush() {
            ForwardingCookieHandler.this.getCookieManager().flush();
        }

        public void onCookiesModified() {
            if (ForwardingCookieHandler.USES_LEGACY_STORE) {
                this.mHandler.sendEmptyMessageDelayed(1, 30000);
            }
        }

        public void persistCookies() {
            this.mHandler.removeMessages(1);
            ForwardingCookieHandler.this.runInBackground(new Runnable() {
                public void run() {
                    if (ForwardingCookieHandler.USES_LEGACY_STORE) {
                        CookieSyncManager.getInstance().sync();
                    } else {
                        CookieSaver.this.flush();
                    }
                }
            });
        }

        public CookieSaver() {
            this.mHandler = new Handler(Looper.getMainLooper(), new Callback(ForwardingCookieHandler.this) {
                public boolean handleMessage(Message message) {
                    if (message.what != 1) {
                        return false;
                    }
                    CookieSaver.this.persistCookies();
                    return true;
                }
            });
        }
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        USES_LEGACY_STORE = z;
    }

    public void destroy() {
        if (USES_LEGACY_STORE) {
            getCookieManager().removeExpiredCookie();
            this.mCookieSaver.persistCookies();
        }
    }

    public CookieManager getCookieManager() {
        if (this.mCookieManager == null) {
            possiblyWorkaroundSyncManager(this.mContext);
            this.mCookieManager = CookieManager.getInstance();
            if (USES_LEGACY_STORE) {
                this.mCookieManager.removeExpiredCookie();
            }
        }
        return this.mCookieManager;
    }

    public ForwardingCookieHandler(ReactContext reactContext) {
        this.mContext = reactContext;
    }

    private void clearCookiesAsync(final com.facebook.react.bridge.Callback callback) {
        getCookieManager().removeAllCookies(new ValueCallback<Boolean>() {
            public void onReceiveValue(Boolean bool) {
                ForwardingCookieHandler.this.mCookieSaver.onCookiesModified();
                callback.invoke(bool);
            }
        });
    }

    private static void possiblyWorkaroundSyncManager(Context context) {
        if (USES_LEGACY_STORE) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    public void runInBackground(final Runnable runnable) {
        new GuardedAsyncTask<Void, Void>(this.mContext) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                runnable.run();
            }
        }.execute(new Void[0]);
    }

    private static boolean isCookieHeader(String str) {
        if (str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2")) {
            return true;
        }
        return false;
    }

    public void clearCookies(final com.facebook.react.bridge.Callback callback) {
        if (USES_LEGACY_STORE) {
            new GuardedResultAsyncTask<Boolean>(this.mContext) {
                /* access modifiers changed from: protected */
                public Boolean doInBackgroundGuarded() {
                    ForwardingCookieHandler.this.getCookieManager().removeAllCookie();
                    ForwardingCookieHandler.this.mCookieSaver.onCookiesModified();
                    return Boolean.valueOf(true);
                }

                /* access modifiers changed from: protected */
                public void onPostExecuteGuarded(Boolean bool) {
                    callback.invoke(bool);
                }
            }.execute(new Void[0]);
        } else {
            clearCookiesAsync(callback);
        }
    }

    private void addCookieAsync(String str, String str2) {
        getCookieManager().setCookie(str, str2, null);
    }

    private void addCookies(final String str, final List<String> list) {
        if (USES_LEGACY_STORE) {
            runInBackground(new Runnable() {
                public void run() {
                    for (String cookie : list) {
                        ForwardingCookieHandler.this.getCookieManager().setCookie(str, cookie);
                    }
                    ForwardingCookieHandler.this.mCookieSaver.onCookiesModified();
                }
            });
            return;
        }
        for (String addCookieAsync : list) {
            addCookieAsync(str, addCookieAsync);
        }
        this.mCookieSaver.onCookiesModified();
    }

    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        String cookie = getCookieManager().getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        String uri2 = uri.toString();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null && isCookieHeader(str)) {
                addCookies(uri2, (List) entry.getValue());
            }
        }
    }
}

package com.facebook.react.devsupport;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.LayoutInflater;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.C1642a;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

public class DevLoadingViewController {
    private static final int COLOR_DARK_GREEN = Color.parseColor("#035900");
    private static boolean sEnabled = true;
    private final Context mContext;
    private PopupWindow mDevLoadingPopup;
    public final TextView mDevLoadingView = ((TextView) ((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(R.layout.jr, null));
    private final ReactInstanceManagerDevHelper mReactInstanceManagerHelper;

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_DebugCheckLancet_popupWindowDismiss */
        static void m41795x9b22650(PopupWindow popupWindow) {
            if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                popupWindow.dismiss();
                return;
            }
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    public void hide() {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    DevLoadingViewController.this.hideInternal();
                }
            });
        }
    }

    public void show() {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    DevLoadingViewController.this.showInternal();
                }
            });
        }
    }

    public void showForRemoteJSEnabled() {
        showMessage(this.mContext.getString(R.string.xq), -1, COLOR_DARK_GREEN);
    }

    public void hideInternal() {
        if (this.mDevLoadingPopup != null && this.mDevLoadingPopup.isShowing()) {
            _lancet.m41795x9b22650(this.mDevLoadingPopup);
            this.mDevLoadingPopup = null;
        }
    }

    public void showInternal() {
        int i;
        if (this.mDevLoadingPopup == null || !this.mDevLoadingPopup.isShowing()) {
            Activity currentActivity = this.mReactInstanceManagerHelper.getCurrentActivity();
            if (currentActivity == null) {
                C13286a.m38863d("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            if (VERSION.SDK_INT <= 19) {
                Rect rect = new Rect();
                currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                i = rect.top;
            } else {
                i = 0;
            }
            this.mDevLoadingPopup = new PopupWindow(this.mDevLoadingView, -1, -2);
            this.mDevLoadingPopup.setTouchable(false);
            this.mDevLoadingPopup.showAtLocation(currentActivity.getWindow().getDecorView(), 0, 0, i);
        }
    }

    public static void setDevLoadingEnabled(boolean z) {
        sEnabled = z;
    }

    public void showForUrl(String str) {
        try {
            URL url = new URL(str);
            Context context = this.mContext;
            StringBuilder sb = new StringBuilder();
            sb.append(url.getHost());
            sb.append(":");
            sb.append(url.getPort());
            showMessage(context.getString(R.string.xj, new Object[]{sb.toString()}), -1, COLOR_DARK_GREEN);
        } catch (MalformedURLException e) {
            StringBuilder sb2 = new StringBuilder("Bundle url format is invalid. \n\n");
            sb2.append(e.toString());
            C13286a.m38863d("ReactNative", sb2.toString());
        }
    }

    public DevLoadingViewController(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper) {
        this.mContext = context;
        this.mReactInstanceManagerHelper = reactInstanceManagerDevHelper;
    }

    public void showMessage(final String str, final int i, final int i2) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    DevLoadingViewController.this.mDevLoadingView.setBackgroundColor(i2);
                    DevLoadingViewController.this.mDevLoadingView.setText(str);
                    DevLoadingViewController.this.mDevLoadingView.setTextColor(i);
                    DevLoadingViewController.this.showInternal();
                }
            });
        }
    }

    public void updateProgress(final String str, final Integer num, final Integer num2) {
        if (sEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    String str;
                    StringBuilder sb = new StringBuilder();
                    if (str != null) {
                        str = str;
                    } else {
                        str = "Loading";
                    }
                    sb.append(str);
                    if (!(num == null || num2 == null || num2.intValue() <= 0)) {
                        sb.append(C1642a.m8035a(Locale.getDefault(), " %.1f%% (%d/%d)", new Object[]{Float.valueOf((((float) num.intValue()) / ((float) num2.intValue())) * 100.0f), num, num2}));
                    }
                    sb.append("…");
                    DevLoadingViewController.this.mDevLoadingView.setText(sb);
                }
            });
        }
    }
}

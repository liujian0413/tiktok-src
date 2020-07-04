package com.bytedance.ies.uikit.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.content.C0688e;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.common.utility.collection.C6308d;
import com.bytedance.ies.uikit.base.C11008b.C11009a;
import com.bytedance.ies.uikit.base.C11008b.C11010b;
import com.bytedance.ies.uikit.base.C11008b.C11011c;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.ies.uikit.p576a.C10995b;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class AbsActivity extends AppCompatActivity {
    public static int mStartNum = 0;
    private static volatile int sActivityId;
    private static Set<String> sActivitySet = new HashSet();
    private static C6308d<AbsActivity> sFinishedActivityContainer = new C6308d<>();
    private boolean mDisableOptimizeViewHierarchy;
    private BroadcastReceiver mExitAppReceiver;
    private String mKey;
    private C6308d<C11013c> mMonitors = new C6308d<>();
    public boolean mStatusActive;
    public boolean mStatusDestroyed;
    public C10995b mTintManager;

    /* access modifiers changed from: protected */
    public boolean enableInitHook() {
        return true;
    }

    public boolean enableMobClick() {
        return true;
    }

    public int getRootViewId() {
        return 0;
    }

    public int getStatusBarBgColor() {
        return -16777216;
    }

    public int getWindowsFlags() {
        return 0;
    }

    public boolean isActive() {
        return this.mStatusActive;
    }

    /* access modifiers changed from: protected */
    public void requestDisableOptimizeViewHierarchy() {
        this.mDisableOptimizeViewHierarchy = true;
    }

    /* access modifiers changed from: protected */
    public boolean useImmerseMode() {
        return true;
    }

    public boolean isViewValid() {
        if (!this.mStatusDestroyed) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int getStatusBarColor() {
        return getResources().getColor(R.color.hn);
    }

    public void onStart() {
        super.onStart();
        if (mStartNum == 0) {
            C11011c d = C11008b.m32272d();
            if (d != null) {
                d.mo26595a(false);
            }
        }
        mStartNum++;
    }

    /* access modifiers changed from: protected */
    public void setStatusBarColor() {
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(getStatusBarColor());
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C10994a.m32206a(this, getStatusBarColor());
        }
    }

    public void onDestroy() {
        C0688e.m2941a((Context) this).mo2837a(this.mExitAppReceiver);
        super.onDestroy();
        this.mStatusDestroyed = true;
        if (!this.mMonitors.mo15145b()) {
            Iterator it = this.mMonitors.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.bb_();
                }
            }
            this.mMonitors.mo15142a();
        }
        onActivityDestroy(this);
    }

    public void onPause() {
        super.onPause();
        this.mStatusActive = false;
        C11009a b = C11008b.m32270b();
        if (b != null) {
            b.mo26593b(this);
        }
        if (!this.mMonitors.mo15145b()) {
            Iterator it = this.mMonitors.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.mStatusActive = true;
        C11009a b = C11008b.m32270b();
        if (b != null) {
            b.mo26592a(this);
        }
        if (!this.mMonitors.mo15145b()) {
            Iterator it = this.mMonitors.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.mo26596a();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        int i = mStartNum - 1;
        mStartNum = i;
        if (i == 0) {
            C11011c d = C11008b.m32272d();
            if (d != null) {
                d.mo26595a(true);
            }
        }
        this.mStatusActive = false;
        if (!this.mMonitors.mo15145b()) {
            Iterator it = this.mMonitors.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.bc_();
                }
            }
        }
    }

    public static String getAliveActivitiesString() {
        if (sActivitySet == null || sActivitySet.isEmpty()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str : sActivitySet) {
                if (i < sActivitySet.size() - 1) {
                    sb.append(str);
                    sb.append("|");
                } else {
                    sb.append(str);
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getFinishedActivitiesString() {
        if (sFinishedActivityContainer == null || sFinishedActivityContainer.mo15145b()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            Iterator it = sFinishedActivityContainer.iterator();
            while (it.hasNext()) {
                AbsActivity absActivity = (AbsActivity) it.next();
                if (absActivity != null && !sActivitySet.contains(absActivity.mKey) && absActivity.isFinishing()) {
                    if (i < sFinishedActivityContainer.mo15146c() - 1) {
                        sb.append(absActivity.mKey);
                        sb.append("|");
                    } else {
                        sb.append(absActivity.mKey);
                    }
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void onSupportContentChanged() {
        super.onSupportContentChanged();
        if (!this.mDisableOptimizeViewHierarchy) {
            View findViewById = findViewById(R.id.a7);
            if (findViewById != null) {
                ViewParent parent = findViewById.getParent();
                if (FrameLayout.class.isInstance(parent)) {
                    View findViewById2 = findViewById(16908290);
                    if (FrameLayout.class.isInstance(findViewById2)) {
                        FrameLayout frameLayout = (FrameLayout) findViewById2;
                        if (frameLayout.getChildCount() == 1) {
                            View childAt = frameLayout.getChildAt(0);
                            frameLayout.removeAllViews();
                            FrameLayout frameLayout2 = (FrameLayout) parent;
                            frameLayout2.addView(childAt);
                            findViewById2.setId(-1);
                            frameLayout2.setId(16908290);
                        }
                    }
                }
            }
        }
    }

    public void registerLifeCycleMonitor(C11013c cVar) {
        this.mMonitors.mo15143a(cVar);
    }

    public void setStatusBarBgColor(int i) {
        this.mTintManager.mo26548b(i);
    }

    public void unregisterLifeCycleMonitor(C11013c cVar) {
        this.mMonitors.mo15144b(cVar);
    }

    public static void onActivityCreate(AbsActivity absActivity) {
        if (absActivity != null) {
            try {
                sFinishedActivityContainer.mo15143a(absActivity);
                sActivitySet.add(absActivity.mKey);
            } catch (Throwable unused) {
            }
        }
    }

    public static void onActivityDestroy(AbsActivity absActivity) {
        if (absActivity != null) {
            try {
                sActivitySet.remove(absActivity.mKey);
            } catch (Throwable unused) {
            }
        }
    }

    public void setContentView(int i) {
        super.setContentView(i);
        if (useImmerseMode()) {
            setStatusBarColor();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.containsKey("abs_Activity_Key")) {
            this.mKey = bundle.getString("abs_Activity_Key");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putString("abs_Activity_Key", this.mKey);
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
    }

    public void setContentView(View view) {
        super.setContentView(view);
        if (useImmerseMode()) {
            setStatusBarColor();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || !bundle.containsKey("abs_Activity_Key")) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getCanonicalName());
            sb.append("@");
            int i = sActivityId;
            sActivityId = i + 1;
            sb.append(i);
            this.mKey = sb.toString();
        } else {
            this.mKey = bundle.getString("abs_Activity_Key");
        }
        if (C11008b.m32267a() != null) {
            enableInitHook();
        }
        this.mExitAppReceiver = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (!AbsActivity.this.isFinishing()) {
                    AbsActivity.this.finish();
                }
            }
        };
        C0688e.m2941a((Context) this).mo2838a(this.mExitAppReceiver, new IntentFilter("com.ss.android.common.app.action.exit_app"));
        onActivityCreate(this);
    }

    public void initImmersion(View view, boolean z) {
        if (view == null && getRootViewId() > 0) {
            view = findViewById(getRootViewId());
        }
        if (view == null || getRootViewId() < 0) {
            if (getRootViewId() == -1 && VERSION.SDK_INT > 19) {
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(getStatusBarBgColor());
            }
            return;
        }
        immersionWindow(view, z);
    }

    public void immersionWindow(View view, boolean z) {
        int i;
        if (VERSION.SDK_INT >= 19) {
            Window window = getWindow();
            window.clearFlags(67108864);
            int windowsFlags = getWindowsFlags();
            int statusBarBgColor = getStatusBarBgColor();
            if (VERSION.SDK_INT >= 21) {
                View decorView = window.getDecorView();
                if (z) {
                    i = 0;
                } else {
                    i = VideoCacheReadBuffersizeExperiment.DEFAULT;
                }
                decorView.setSystemUiVisibility(i | 1280);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(getResources().getColor(17170445));
            } else {
                window.getDecorView().setSystemUiVisibility(1280);
                window.addFlags(67108864);
            }
            this.mTintManager = new C10995b(this, view, windowsFlags);
            this.mTintManager.mo26546a(statusBarBgColor);
            this.mTintManager.mo26547a(true);
            this.mTintManager.mo26549b(false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C11010b c = C11008b.m32271c();
        if (c == null || !c.mo26594a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }
}

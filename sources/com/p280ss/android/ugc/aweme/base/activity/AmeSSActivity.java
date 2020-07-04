package com.p280ss.android.ugc.aweme.base.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.common.utility.C9729e;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29962c;
import com.p280ss.android.ugc.aweme.utils.C43051dc;
import com.p280ss.android.ugc.aweme.utils.C43148o;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeSSActivity */
public class AmeSSActivity extends AmeActivity implements C9729e {
    protected int mActivityAnimType;
    private C43148o mAudioManagerHelper;
    private int mCurTheme = -1;
    private C29962c mCustomToast;
    private boolean mFocused = false;
    private boolean mHideCustomToastStatusBar;
    private SparseArray<C23247a> mIOnActivityResultListenerSparseArray = new SparseArray<>();
    private boolean mIsFirstStart = true;
    private int mOriginTheme = -1;

    /* renamed from: com.ss.android.ugc.aweme.base.activity.AmeSSActivity$a */
    public interface C23247a {
        /* renamed from: a */
        void mo60510a(int i, int i2, Intent intent);
    }

    private boolean isBackgroundSwitch() {
        if (mStartNum == 0) {
            return true;
        }
        return false;
    }

    public void onStart() {
        super.onStart();
        this.mIsFirstStart = false;
    }

    public void dismissCustomToast() {
        if (this.mCustomToast != null) {
            this.mCustomToast.mo76126d();
        }
    }

    public void finish() {
        super.finish();
        if (this.mActivityAnimType != 0) {
            C23256c.m76348b(this, this.mActivityAnimType);
        }
    }

    public void hideCustomToastStatusBar() {
        this.mHideCustomToastStatusBar = true;
        if (this.mCustomToast != null) {
            this.mCustomToast.f78760g = true;
        }
    }

    public void onStop() {
        super.onStop();
        C43148o audioManagerHelper = getAudioManagerHelper(false);
        if (audioManagerHelper != null) {
            audioManagerHelper.mo104770b(this);
        }
    }

    public void showCustomToastStatusBar() {
        this.mHideCustomToastStatusBar = false;
        if (this.mCustomToast != null) {
            this.mCustomToast.f78760g = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkIfCanShowToast() {
        if (!isViewValid()) {
            return false;
        }
        if (this.mCustomToast == null) {
            this.mCustomToast = new C29962c(this);
            this.mCustomToast.f78760g = this.mHideCustomToastStatusBar;
        }
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mCustomToast != null) {
            this.mCustomToast.mo76117a();
        }
        this.mIOnActivityResultListenerSparseArray.clear();
        this.mIOnActivityResultListenerSparseArray = null;
    }

    public void onPause() {
        super.onPause();
        if (this.mCustomToast != null) {
            this.mCustomToast.mo76122b();
        }
        if (C6399b.m19944t()) {
            C43051dc.f111647a = getClass();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.mCustomToast != null) {
            this.mCustomToast.mo76125c();
        }
        C43148o audioManagerHelper = getAudioManagerHelper(true);
        if (audioManagerHelper != null) {
            audioManagerHelper.mo104769a(this);
        }
    }

    public Resources getResources() {
        if (this.mFirstResumed || !C23346d.m76602a(this)) {
            return super.getResources();
        }
        return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
    }

    public void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }

    private C43148o getAudioManagerHelper(boolean z) {
        if (this.mAudioManagerHelper == null) {
            this.mAudioManagerHelper = new C43148o(this);
        }
        return this.mAudioManagerHelper;
    }

    public void setOnActivityResultListener(C23247a aVar) {
        this.mIOnActivityResultListenerSparseArray.append(1001, aVar);
    }

    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            this.mHideCustomToastStatusBar = false;
            if (this.mActivityAnimType != 0) {
                C23256c.m76347a(this, this.mActivityAnimType);
            }
        } catch (NotFoundException unused) {
        }
        if (this.mIOnActivityResultListenerSparseArray == null) {
            this.mIOnActivityResultListenerSparseArray = new SparseArray<>();
        }
    }

    /* access modifiers changed from: protected */
    public void showImeOnce(final View view) {
        if (!this.mFocused) {
            final OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new OnFocusChangeListener() {
                public final void onFocusChange(View view, boolean z) {
                    view.post(new Runnable() {
                        public final void run() {
                            if (AmeSSActivity.this.isViewValid()) {
                                InputMethodManager inputMethodManager = (InputMethodManager) AmeSSActivity.this.getSystemService("input_method");
                                if (inputMethodManager != null) {
                                    inputMethodManager.showSoftInput(view, 1);
                                }
                            }
                        }
                    });
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(view, z);
                    }
                }
            });
            view.post(new Runnable() {
                public final void run() {
                    view.requestFocus();
                }
            });
            this.mFocused = true;
        }
    }

    public void showCustomToast(String str) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo76120a(str);
        }
    }

    public void superOverridePendingTransition(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public void setOnActivityResultListener(int i, C23247a aVar) {
        this.mIOnActivityResultListenerSparseArray.append(i, aVar);
    }

    public void showCustomLongToast(int i, String str) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo76118a(i, str);
        }
    }

    public void showCustomToast(int i, String str) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo76123b(i, str);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C23247a aVar = (C23247a) this.mIOnActivityResultListenerSparseArray.get(1001);
        if (aVar != null) {
            aVar.mo60510a(i, i2, intent);
        }
    }

    public void showCustomToast(String str, int i, int i2) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo76121a(str, i, i2);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (checkIfCanShowToast()) {
            this.mCustomToast.mo76119a(i, str, i2, i3);
        }
    }
}

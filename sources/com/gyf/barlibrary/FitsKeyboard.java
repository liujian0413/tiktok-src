package com.gyf.barlibrary;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;

public class FitsKeyboard implements OnGlobalLayoutListener {
    private final int mActionBarHeight;
    private Activity mActivity;
    private View mChildView;
    private View mContentView;
    private View mDecorView = this.mWindow.getDecorView();
    private ImmersionBar mImmersionBar;
    private boolean mIsAddListener;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private final int mStatusBarHeight;
    private int mTempKeyboardHeight;
    private Window mWindow;

    /* access modifiers changed from: 0000 */
    public void cancel() {
        if (VERSION.SDK_INT >= 19 && this.mIsAddListener) {
            this.mDecorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.mIsAddListener = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void disable() {
        if (VERSION.SDK_INT >= 19 && this.mIsAddListener) {
            if (this.mChildView != null) {
                this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
                return;
            }
            this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), this.mImmersionBar.getPaddingBottom());
        }
    }

    public void onGlobalLayout() {
        int i;
        if (this.mImmersionBar != null && this.mImmersionBar.getBarParams() != null && this.mImmersionBar.getBarParams().keyboardEnable) {
            int navigationBarHeight = ImmersionBar.getNavigationBarHeight(this.mActivity);
            Rect rect = new Rect();
            this.mDecorView.getWindowVisibleDisplayFrame(rect);
            int height = this.mContentView.getHeight() - rect.bottom;
            if (height != this.mTempKeyboardHeight) {
                this.mTempKeyboardHeight = height;
                boolean z = true;
                if (ImmersionBar.checkFitsSystemWindows(this.mWindow.getDecorView().findViewById(16908290))) {
                    height -= navigationBarHeight;
                    if (height <= navigationBarHeight) {
                        z = false;
                    }
                } else if (this.mChildView != null) {
                    if (this.mImmersionBar.getBarParams().isSupportActionBar) {
                        height += this.mActionBarHeight + this.mStatusBarHeight;
                    }
                    if (this.mImmersionBar.getBarParams().fits) {
                        height += this.mStatusBarHeight;
                    }
                    if (height > navigationBarHeight) {
                        i = this.mPaddingBottom + height;
                    } else {
                        i = 0;
                        z = false;
                    }
                    this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, i);
                } else {
                    int paddingBottom = this.mImmersionBar.getPaddingBottom();
                    height -= navigationBarHeight;
                    if (height > navigationBarHeight) {
                        paddingBottom = height + navigationBarHeight;
                    } else {
                        z = false;
                    }
                    this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), paddingBottom);
                }
                if (height < 0) {
                    height = 0;
                }
                if (this.mImmersionBar.getBarParams().onKeyboardListener != null) {
                    this.mImmersionBar.getBarParams().onKeyboardListener.onKeyboardChange(z, height);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void enable(int i) {
        if (VERSION.SDK_INT >= 19) {
            this.mWindow.setSoftInputMode(i);
            if (!this.mIsAddListener) {
                this.mDecorView.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.mIsAddListener = true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FitsKeyboard(com.gyf.barlibrary.ImmersionBar r1, android.app.Activity r2, android.view.Window r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.mImmersionBar = r1
            r0.mActivity = r2
            r0.mWindow = r3
            android.view.Window r1 = r0.mWindow
            android.view.View r1 = r1.getDecorView()
            r0.mDecorView = r1
            android.view.View r1 = r0.mDecorView
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r2 = 0
            android.view.View r3 = r1.getChildAt(r2)
            r0.mChildView = r3
            android.view.View r3 = r0.mChildView
            if (r3 == 0) goto L_0x005b
            android.view.View r3 = r0.mChildView
            boolean r3 = r3 instanceof android.support.p022v4.widget.DrawerLayout
            if (r3 == 0) goto L_0x0037
            android.view.View r3 = r0.mChildView
            android.support.v4.widget.DrawerLayout r3 = (android.support.p022v4.widget.DrawerLayout) r3
            android.view.View r2 = r3.getChildAt(r2)
            r0.mChildView = r2
        L_0x0037:
            android.view.View r2 = r0.mChildView
            if (r2 == 0) goto L_0x005b
            android.view.View r2 = r0.mChildView
            int r2 = r2.getPaddingLeft()
            r0.mPaddingLeft = r2
            android.view.View r2 = r0.mChildView
            int r2 = r2.getPaddingTop()
            r0.mPaddingTop = r2
            android.view.View r2 = r0.mChildView
            int r2 = r2.getPaddingRight()
            r0.mPaddingRight = r2
            android.view.View r2 = r0.mChildView
            int r2 = r2.getPaddingBottom()
            r0.mPaddingBottom = r2
        L_0x005b:
            android.view.View r2 = r0.mChildView
            if (r2 == 0) goto L_0x0061
            android.view.View r1 = r0.mChildView
        L_0x0061:
            r0.mContentView = r1
            com.gyf.barlibrary.BarConfig r1 = new com.gyf.barlibrary.BarConfig
            android.app.Activity r2 = r0.mActivity
            r1.<init>(r2)
            int r2 = r1.getStatusBarHeight()
            r0.mStatusBarHeight = r2
            int r1 = r1.getActionBarHeight()
            r0.mActionBarHeight = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.barlibrary.FitsKeyboard.<init>(com.gyf.barlibrary.ImmersionBar, android.app.Activity, android.view.Window):void");
    }
}

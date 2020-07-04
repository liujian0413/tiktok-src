package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;

public abstract class ReactActivity extends Activity implements DefaultHardwareBackBtnHandler, PermissionAwareActivity {
    private final ReactActivityDelegate mDelegate = createReactActivityDelegate();

    /* access modifiers changed from: protected */
    public String getMainComponentName() {
        return null;
    }

    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final ReactInstanceManager getReactInstanceManager() {
        return this.mDelegate.getReactInstanceManager();
    }

    /* access modifiers changed from: protected */
    public final ReactNativeHost getReactNativeHost() {
        return this.mDelegate.getReactNativeHost();
    }

    protected ReactActivity() {
    }

    /* access modifiers changed from: protected */
    public ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate((Activity) this, getMainComponentName());
    }

    public void onBackPressed() {
        if (!this.mDelegate.onBackPressed()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mDelegate.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mDelegate.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mDelegate.onResume();
    }

    /* access modifiers changed from: protected */
    public final void loadApp(String str) {
        this.mDelegate.loadApp(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mDelegate.onCreate(bundle);
    }

    public void onNewIntent(Intent intent) {
        if (!this.mDelegate.onNewIntent(intent)) {
            super.onNewIntent(intent);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mDelegate.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (this.mDelegate.onKeyLongPress(i, keyEvent) || super.onKeyLongPress(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.mDelegate.onKeyUp(i, keyEvent) || super.onKeyUp(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mDelegate.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mDelegate.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void requestPermissions(String[] strArr, int i, PermissionListener permissionListener) {
        this.mDelegate.requestPermissions(strArr, i, permissionListener);
    }
}

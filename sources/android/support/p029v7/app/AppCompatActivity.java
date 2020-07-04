package android.support.p029v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.C0595ah;
import android.support.p022v4.app.C0595ah.C0596a;
import android.support.p022v4.app.C0652w;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.ActionBarDrawerToggle.C1068a;
import android.support.p029v7.view.C1153b;
import android.support.p029v7.view.C1153b.C1154a;
import android.support.p029v7.widget.C1371az;
import android.support.p029v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* renamed from: android.support.v7.app.AppCompatActivity */
public class AppCompatActivity extends FragmentActivity implements C0596a, C1106b {
    private C1107c mDelegate;
    private Resources mResources;
    private int mThemeId;

    public Resources getResources() {
        return C1105a.m4896a(this);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onPrepareSupportNavigateUpTaskStack(C0595ah ahVar) {
    }

    public void onSupportActionModeFinished(C1153b bVar) {
    }

    public void onSupportActionModeStarted(C1153b bVar) {
    }

    public void onSupportContentChanged() {
    }

    public C1153b onWindowStartingSupportActionMode(C1154a aVar) {
        return null;
    }

    public void setSupportProgress(int i) {
    }

    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setSupportProgressBarVisibility(boolean z) {
    }

    public Intent getSupportParentActivityIntent() {
        return C0652w.m2819a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo4308f();
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo4308f();
    }

    public C1107c getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C1107c.m4897a((Activity) this, (C1106b) this);
        }
        return this.mDelegate;
    }

    public C1068a getDrawerToggleDelegate() {
        return getDelegate().mo4312h();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo4297b();
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo4282a();
    }

    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo4310g();
    }

    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo4306e();
    }

    public void onStart() {
        super.onStart();
        getDelegate().mo4302c();
    }

    public void onStop() {
        super.onStop();
        getDelegate().mo4305d();
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo4179d()) {
            super.closeOptionsMenu();
        }
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo4177c()) {
            super.openOptionsMenu();
        }
    }

    public Resources getResources$___twin___() {
        if (this.mResources == null && C1371az.m6778a()) {
            this.mResources = new C1371az(this, super.getResources());
        }
        if (this.mResources == null) {
            return super.getResources();
        }
        return this.mResources;
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C0595ah a = C0595ah.m2477a((Context) this);
            onCreateSupportNavigateUpTaskStack(a);
            onPrepareSupportNavigateUpTaskStack(a);
            a.mo2577a();
            try {
                ActivityCompat.m2237a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    public void onCreateSupportNavigateUpTaskStack(C0595ah ahVar) {
        ahVar.mo2576a((Activity) this);
    }

    public void supportNavigateUpTo(Intent intent) {
        C0652w.m2824b((Activity) this, intent);
    }

    public void setContentView(int i) {
        getDelegate().mo4298b(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo4291a(toolbar);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.mThemeId = i;
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0652w.m2821a((Activity) this, intent);
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo4286a(i);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo4299b(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo4303c(bundle);
    }

    public void setContentView(View view) {
        getDelegate().mo4292a(view);
    }

    public C1153b startSupportActionMode(C1154a aVar) {
        return getDelegate().mo4285a(aVar);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo4304c(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo4173a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo4288a(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onCreate(Bundle bundle) {
        C1107c delegate = getDelegate();
        delegate.mo4315i();
        delegate.mo4289a(bundle);
        if (delegate.mo4316j() && this.mThemeId != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.mThemeId, false);
            } else {
                setTheme(this.mThemeId);
            }
        }
        super.onCreate(bundle);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo4301b(view, layoutParams);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo4294a(charSequence);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo4293a(view, layoutParams);
    }

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo4165a() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }
}

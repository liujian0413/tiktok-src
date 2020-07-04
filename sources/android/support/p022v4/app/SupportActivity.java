package android.support.p022v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0059s;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.os.Bundle;
import android.support.p022v4.util.C0904k;
import android.support.p022v4.view.C0973f;
import android.support.p022v4.view.C0973f.C0974a;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v4.app.SupportActivity */
public class SupportActivity extends Activity implements C0043i, C0974a {
    private C0904k<Class<? extends C0577a>, C0577a> mExtraDataMap = new C0904k<>();
    private C0044j mLifecycleRegistry = new C0044j(this);

    /* renamed from: android.support.v4.app.SupportActivity$a */
    public static class C0577a {
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0594ag.m2475a(this, bundle);
    }

    public void setRequestedOrientation(int i) {
        C0594ag.m2474a(this, i);
    }

    public void setRequestedOrientation$___twin___(int i) {
        super.setRequestedOrientation(i);
    }

    /* access modifiers changed from: private */
    public void onCreate$___twin___(Bundle bundle) {
        super.onCreate(bundle);
        C0059s.m137a((Activity) this);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends C0577a> T getExtraData(Class<T> cls) {
        return (C0577a) this.mExtraDataMap.get(cls);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo117a(State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(C0577a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0973f.m4116a(decorView, keyEvent)) {
            return C0973f.m4115a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0973f.m4116a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }
}

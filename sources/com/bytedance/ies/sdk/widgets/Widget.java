package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

public abstract class Widget implements C0042h, C0043i {
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public boolean isDestroyed;
    public boolean isViewValid;
    public C0044j lifecycleRegistry = new C0044j(this);
    public WidgetManager subWidgetManager;
    public WidgetCallback widgetCallback;

    public interface WidgetCallback {
        Fragment getFragment();

        <T extends C0063u> T getViewModel(Class<T> cls);

        <T extends C0063u> T getViewModel(Class<T> cls, C0067b bVar);

        void startActivity(Intent intent);

        void startActivity(Intent intent, Bundle bundle);

        void startActivityForResult(Intent intent, int i);

        void startActivityForResult(Intent intent, int i, Bundle bundle);
    }

    public int getLayoutId() {
        return 0;
    }

    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public boolean isViewValid() {
        return this.isViewValid;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        this.lifecycleRegistry.mo116a(Event.ON_PAUSE);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        this.lifecycleRegistry.mo116a(Event.ON_RESUME);
    }

    @C0054q(mo125a = Event.ON_START)
    public void onStart() {
        this.lifecycleRegistry.mo116a(Event.ON_START);
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        this.lifecycleRegistry.mo116a(Event.ON_STOP);
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        this.isViewValid = true;
        this.isDestroyed = false;
        this.lifecycleRegistry.mo116a(Event.ON_CREATE);
    }

    public void enableSubWidgetManager() {
        if (this.subWidgetManager == null) {
            this.subWidgetManager = WidgetManager.m32095of(this.widgetCallback.getFragment(), this.contentView);
            this.subWidgetManager.setDataCenter(this.dataCenter);
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.mo116a(Event.ON_DESTROY);
        if (this.subWidgetManager != null) {
            this.widgetCallback.getFragment().getChildFragmentManager().mo2645a().mo2587a((Fragment) this.subWidgetManager).mo2610f();
        }
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    public void setWidgetCallback(WidgetCallback widgetCallback2) {
        this.widgetCallback = widgetCallback2;
    }

    public <T extends C0063u> T getViewModel(Class<T> cls) {
        return this.widgetCallback.getViewModel(cls);
    }

    public void startActivity(Intent intent) {
        this.widgetCallback.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.widgetCallback.startActivityForResult(intent, i);
    }

    public <T extends C0063u> T getViewModel(Class<T> cls, C0067b bVar) {
        return this.widgetCallback.getViewModel(cls, bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        this.widgetCallback.startActivity(intent, bundle);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.widgetCallback.startActivityForResult(intent, i, bundle);
    }
}

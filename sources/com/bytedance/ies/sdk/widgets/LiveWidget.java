package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.rxutils.C3231a;
import com.bytedance.android.live.core.rxutils.C3296e;
import com.bytedance.android.live.core.rxutils.C3297f;
import com.bytedance.android.live.core.rxutils.autodispose.C3233a;
import com.bytedance.android.live.core.rxutils.autodispose.C3246ae;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.rxutils.autodispose.C3274m;
import com.bytedance.android.livesdk.C3850ab;
import p346io.reactivex.p347b.C47562b;

public abstract class LiveWidget extends Widget {
    private C47562b compositeDisposable;
    private C3231a lifecycleTransformer;
    private C3297f transformer;

    public final <T> C3231a<T> getAutoUnbindTransformer() {
        return this.lifecycleTransformer;
    }

    public Context getContext() {
        return this.context;
    }

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    public final <T> C3274m<T> autoDispose() {
        return C3255e.m12293a((C0043i) this);
    }

    public final <T> C3274m<T> activityAutoDispose() {
        return C3255e.m12293a((C0043i) this.context);
    }

    public void onDestroy() {
        super.onDestroy();
        this.compositeDisposable.dispose();
        this.subWidgetManager = null;
    }

    public final <T> C3274m<T> activityAutoDisposeWithTransformer() {
        if (this.transformer == null) {
            this.transformer = new C3297f();
        }
        return C3255e.m12298a((C3246ae) C3233a.m12259a((C0043i) this.context, Event.ON_DESTROY), (C3296e<T>) this.transformer);
    }

    public final <T> C3274m<T> autoDisposeWithTransformer() {
        if (this.transformer == null) {
            this.transformer = new C3297f();
        }
        return C3255e.m12298a((C3246ae) C3233a.m12259a((C0043i) this, Event.ON_DESTROY), (C3296e<T>) this.transformer);
    }

    public void onCreate() {
        if (this.compositeDisposable != null) {
            this.compositeDisposable.dispose();
        }
        this.compositeDisposable = new C47562b();
        this.lifecycleTransformer = new C3231a(this.compositeDisposable);
        super.onCreate();
    }

    public void enableSubWidgetManager() {
        if (this.subWidgetManager == null) {
            this.subWidgetManager = RecyclableWidgetManager.m32093of(this.widgetCallback.getFragment(), this.contentView);
            ((RecyclableWidgetManager) this.subWidgetManager).setWidgetProvider(C3850ab.m13691a());
            this.subWidgetManager.setDataCenter(this.dataCenter);
        }
    }

    public final <T extends View> T findViewById(int i) {
        return this.contentView.findViewById(i);
    }
}

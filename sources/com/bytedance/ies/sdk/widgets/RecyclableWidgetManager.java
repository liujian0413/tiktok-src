package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.Lifecycle.State;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import java.util.List;

public class RecyclableWidgetManager extends WidgetManager {
    private static final IWidgetProvider DEFAULT_WIDGET_PROVIDER = new IWidgetProvider() {
        public final <T extends IRecyclableWidget> T provide(Class<T> cls) {
            try {
                return (IRecyclableWidget) cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        }
    };
    private IWidgetProvider mWidgetProvider = DEFAULT_WIDGET_PROVIDER;

    public List<Widget> getWidgetList() {
        return this.widgets;
    }

    public void setWidgetProvider(IWidgetProvider iWidgetProvider) {
        this.mWidgetProvider = iWidgetProvider;
    }

    public <T extends LiveRecyclableWidget> T load(Class<T> cls) {
        T t = (LiveRecyclableWidget) this.mWidgetProvider.provide(cls);
        t.setWidgetCallback(this.widgetCallback);
        t.context = this.context;
        t.dataCenter = this.dataCenter;
        this.widgets.add(t);
        getLifecycle().mo55a(t);
        return t;
    }

    /* renamed from: of */
    public static RecyclableWidgetManager m32093of(Fragment fragment, View view) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager();
        recyclableWidgetManager.config(null, fragment, view, fragment.getContext());
        return recyclableWidgetManager;
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls) {
        return load(i, cls, true);
    }

    private void continueLoadForMergeTag(Widget widget, View view) {
        if (widget.containerView != null) {
            widget.contentView = view;
            this.widgets.add(widget);
            getLifecycle().mo55a(widget);
        }
    }

    /* renamed from: of */
    public static RecyclableWidgetManager m32094of(FragmentActivity fragmentActivity, View view) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager();
        recyclableWidgetManager.config(fragmentActivity, null, view, fragmentActivity);
        return recyclableWidgetManager;
    }

    public <T extends LiveRecyclableWidget> T load(ViewGroup viewGroup, Class<T> cls) {
        return load(viewGroup, cls, true);
    }

    private <T extends LiveRecyclableWidget> T load(ViewGroup viewGroup, Class<T> cls, boolean z) {
        return load(viewGroup, cls, z, (Object[]) null);
    }

    public void continueLoad(Widget widget, ViewGroup viewGroup, View view) {
        if (widget.containerView != null) {
            if (view != null) {
                C9738o.m28699a(view);
            }
            super.continueLoad(widget, viewGroup, view);
        }
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
        return load(i, cls, z, (Object[]) null);
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z, Object[] objArr) {
        return load((ViewGroup) this.contentView.findViewById(i), cls, z, objArr);
    }

    public <T extends LiveRecyclableWidget> T load(ViewGroup viewGroup, Class<T> cls, boolean z, Object[] objArr) {
        T t = (LiveRecyclableWidget) this.mWidgetProvider.provide(cls);
        t.setArgs(objArr);
        t.setWidgetCallback(this.widgetCallback);
        t.context = this.context;
        t.dataCenter = this.dataCenter;
        t.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(t, viewGroup);
        if (t.isInitialized()) {
            if (t.startWithMergeTag()) {
                continueLoadForMergeTag(t, t.contentView);
            } else {
                try {
                    continueLoad(t, viewGroup, t.contentView);
                } catch (Exception e) {
                    throw new RuntimeException(this.syncLayoutInflater.getContext().getResources().getClass().getName(), e);
                }
            }
            return t;
        } else if (t.getLayoutId() == 0) {
            continueLoad(t, viewGroup, null);
            return t;
        } else if (z) {
            this.asyncLayoutInflater.mo3741a(t.getLayoutId(), viewGroup, new RecyclableWidgetManager$$Lambda$0(this, t, viewGroup));
            return t;
        } else if (t.startWithMergeTag()) {
            continueLoadForMergeTag(t, this.syncLayoutInflater.inflate(t.getLayoutId(), viewGroup, true));
            return t;
        } else {
            continueLoad(t, viewGroup, this.syncLayoutInflater.inflate(t.getLayoutId(), viewGroup, false));
            return t;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$load$0$RecyclableWidgetManager(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (!this.mRemoving && !this.mDetached && getLifecycle().mo54a() != State.DESTROYED) {
            continueLoad(liveRecyclableWidget, viewGroup, view);
        }
    }
}

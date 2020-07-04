package com.bytedance.scene.ktx;

import android.app.Activity;
import android.arch.lifecycle.C0070y;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.scene.C12629j;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

public final class SceneViewModelExtensionsKt$activityViewModels$1 extends Lambda implements C7561a<C0070y> {
    final /* synthetic */ C12629j $this_activityViewModels;

    public SceneViewModelExtensionsKt$activityViewModels$1(C12629j jVar) {
        this.$this_activityViewModels = jVar;
        super(0);
    }

    public final C0070y invoke() {
        Activity activity = this.$this_activityViewModels.f33526d_;
        if (activity != null) {
            C7573i.m23582a((Object) activity, "activity ?: throw Illega…ne is attached\"\n        )");
            if (!(activity instanceof FragmentActivity)) {
                activity = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            if (fragmentActivity != null) {
                C0070y viewModelStore = fragmentActivity.getViewModelStore();
                C7573i.m23582a((Object) viewModelStore, "fragmentActivity.viewModelStore");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Activity should be FragmentActivity subclass");
        }
        throw new IllegalArgumentException("ViewModel can be accessed only when Scene is attached");
    }
}

package com.p280ss.android.ugc.aweme.following.p1265ui.view;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.a */
public final class C29777a extends View implements C29778b {
    /* renamed from: a */
    public final void mo75747a(int i, int i2) {
    }

    public final void setFollowStatus(int i) {
    }

    public final C0043i getLifeCycleOwner() {
        Context context = getContext();
        if (context != null) {
            return (C0043i) context;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public C29777a(Context context) {
        super(context);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        C7573i.m23587b(onClickListener, "listener");
        onClickListener.onClick(this);
    }
}

package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager */
public class SSGridLayoutManager extends GridLayoutManager {
    /* renamed from: c */
    public final void mo5385c(C1284o oVar, C1290s sVar) {
        try {
            super.mo5385c(oVar, sVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final int mo5361a(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5361a(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final int mo5381b(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5381b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public SSGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }

    public SSGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import com.p280ss.p1783b.p1784a.C45771a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager */
public class SSLinearLayoutManager extends LinearLayoutManager {
    public SSLinearLayoutManager(Context context) {
        super(context);
    }

    /* renamed from: c */
    public final void mo5385c(C1284o oVar, C1290s sVar) {
        try {
            super.mo5385c(oVar, sVar);
        } catch (Exception e) {
            C45771a.m143709b("SSLinearLayoutManager", (Throwable) e);
        }
    }

    public SSLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, false);
    }

    /* renamed from: a */
    public final int mo5361a(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5361a(i, oVar, sVar);
        } catch (Exception e) {
            C45771a.m143709b("SSLinearLayoutManager", (Throwable) e);
            return 0;
        }
    }

    /* renamed from: b */
    public final int mo5381b(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5381b(i, oVar, sVar);
        } catch (Exception e) {
            C45771a.m143709b("SSLinearLayoutManager", (Throwable) e);
            return 0;
        }
    }

    public SSLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

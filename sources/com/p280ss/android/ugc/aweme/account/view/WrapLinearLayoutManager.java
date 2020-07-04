package com.p280ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.account.view.WrapLinearLayoutManager */
public class WrapLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    C1262a f59636a;

    /* renamed from: a */
    private IllegalArgumentException m74036a(IllegalArgumentException illegalArgumentException) {
        if (this.f59636a != null) {
            return new IllegalArgumentException(this.f59636a.getClass().getName(), illegalArgumentException);
        }
        return illegalArgumentException;
    }

    /* renamed from: a */
    private IndexOutOfBoundsException m74037a(IndexOutOfBoundsException indexOutOfBoundsException) {
        if (this.f59636a == null) {
            return indexOutOfBoundsException;
        }
        IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.f59636a.getClass().getName());
        indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
        return indexOutOfBoundsException2;
    }

    /* renamed from: a */
    public final void mo5752a(C1262a aVar, C1262a aVar2) {
        super.mo5752a(aVar, aVar2);
        this.f59636a = aVar2;
    }

    /* renamed from: c */
    public final void mo5385c(C1284o oVar, C1290s sVar) {
        try {
            super.mo5385c(oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f59636a != null) {
                C6921a.m21556a(this.f59636a.getClass().getName(), (Exception) m74037a(e));
            }
        } catch (IllegalArgumentException e2) {
            if (this.f59636a != null) {
                C6921a.m21556a(this.f59636a.getClass().getName(), (Exception) m74036a(e2));
            }
        }
    }

    /* renamed from: b */
    public final int mo5381b(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5381b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f59636a != null) {
                C6921a.m21556a(this.f59636a.getClass().getName(), (Exception) m74037a(e));
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final int mo5361a(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5361a(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f59636a != null) {
                C6921a.m21556a(this.f59636a.getClass().getName(), (Exception) m74037a(e));
            }
            return 0;
        }
    }

    public WrapLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final View mo5367a(View view, int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5367a(view, i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f59636a != null) {
                C6921a.m21556a(this.f59636a.getClass().getName(), (Exception) m74037a(e));
            }
            return null;
        }
    }
}

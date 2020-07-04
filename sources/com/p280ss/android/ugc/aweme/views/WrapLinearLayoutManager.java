package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.view.View;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.views.WrapLinearLayoutManager */
public class WrapLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: b */
    C1262a f112323b;

    public WrapLinearLayoutManager(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static void m137637a(final C1262a aVar) {
        if (aVar != null) {
            C1592h.m7855a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    try {
                        aVar.notifyDataSetChanged();
                    } catch (Exception e) {
                        C6921a.m21556a(aVar.getClass().getName(), e);
                    }
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: a */
    private IllegalArgumentException m137635a(IllegalArgumentException illegalArgumentException) {
        if (this.f112323b != null) {
            return new IllegalArgumentException(this.f112323b.getClass().getName(), illegalArgumentException);
        }
        return illegalArgumentException;
    }

    /* renamed from: a */
    private IndexOutOfBoundsException m137636a(IndexOutOfBoundsException indexOutOfBoundsException) {
        if (this.f112323b == null) {
            return indexOutOfBoundsException;
        }
        IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.f112323b.getClass().getName());
        indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
        return indexOutOfBoundsException2;
    }

    /* renamed from: a */
    public final void mo5752a(C1262a aVar, C1262a aVar2) {
        super.mo5752a(aVar, aVar2);
        this.f112323b = aVar2;
    }

    /* renamed from: c */
    public final void mo5385c(C1284o oVar, C1290s sVar) {
        try {
            super.mo5385c(oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f112323b != null) {
                C6921a.m21556a(this.f112323b.getClass().getName(), (Exception) m137636a(e));
            }
        } catch (IllegalArgumentException e2) {
            if (this.f112323b != null) {
                C6921a.m21556a(this.f112323b.getClass().getName(), (Exception) m137635a(e2));
            }
        } catch (NullPointerException e3) {
            if (this.f112323b != null) {
                C6921a.m21556a(this.f112323b.getClass().getName(), (Exception) e3);
                m137637a(this.f112323b);
            }
        }
    }

    public WrapLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: b */
    public final int mo5381b(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5381b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f112323b != null) {
                C6921a.m21556a(this.f112323b.getClass().getName(), (Exception) m137636a(e));
            }
            return 0;
        } catch (NullPointerException e2) {
            if (this.f112323b != null) {
                C6921a.m21556a(this.f112323b.getClass().getName(), (Exception) e2);
                m137637a(this.f112323b);
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final int mo5361a(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5361a(i, oVar, sVar);
        } catch (IndexOutOfBoundsException e) {
            if (this.f112323b != null) {
                C6921a.m21556a(this.f112323b.getClass().getName(), (Exception) m137636a(e));
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
            if (this.f112323b != null) {
                C6921a.m21556a(this.f112323b.getClass().getName(), (Exception) m137636a(e));
            }
            return null;
        }
    }
}

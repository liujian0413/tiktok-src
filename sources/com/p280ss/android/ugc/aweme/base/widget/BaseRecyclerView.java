package com.p280ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.widget.BaseRecyclerView */
public class BaseRecyclerView extends RecyclerView {

    /* renamed from: M */
    private List<Object> f61971M;

    public int getEndItemIndex() {
        if (!m77167t()) {
            return getAdapter().getItemCount() - 1;
        }
        return 0;
    }

    public int getFirstPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return m5892f(getChildAt(0));
    }

    public int getLastPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return m5892f(getChildAt(getChildCount() - 1));
    }

    public int getStartItemIndex() {
        if (!m77167t()) {
            return 0;
        }
        return getAdapter().getItemCount() - 1;
    }

    /* renamed from: o */
    public final void mo61103o() {
        if (getChildCount() > 0) {
            mo5541b(getAdapter().getItemCount() - 1);
        }
    }

    /* renamed from: t */
    private boolean m77167t() {
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) getLayoutManager()).f5128f;
        }
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).f4749k;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo61102n() {
        if (((LinearLayoutManager) getLayoutManager()).f4747i != 0) {
            if (!m77167t()) {
                return m77166s();
            }
            return m77163p();
        } else if (!m77167t()) {
            return m77165r();
        } else {
            return m77164q();
        }
    }

    /* renamed from: p */
    private boolean m77163p() {
        int i;
        if (getChildCount() == 0) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager.f4747i != 1) {
            return false;
        }
        if (!m77167t()) {
            i = linearLayoutManager.mo5446k();
        } else {
            i = linearLayoutManager.mo5448m();
        }
        if (i == -1) {
            return false;
        }
        View c = getLayoutManager().mo5432c(i);
        if (c == null) {
            return false;
        }
        int top = c.getTop();
        int i2 = ((MarginLayoutParams) c.getLayoutParams()).topMargin;
        if (i != getStartItemIndex() || top - i2 < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private boolean m77164q() {
        int i;
        if (getChildCount() == 0) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager.f4747i != 0) {
            return false;
        }
        if (!m77167t()) {
            i = linearLayoutManager.mo5446k();
        } else {
            i = linearLayoutManager.mo5448m();
        }
        if (i == -1) {
            return false;
        }
        View c = getLayoutManager().mo5432c(i);
        if (c == null) {
            return false;
        }
        int left = c.getLeft();
        int i2 = ((MarginLayoutParams) c.getLayoutParams()).leftMargin;
        if (i != getStartItemIndex() || left - i2 < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private boolean m77165r() {
        int i;
        if (getChildCount() == 0) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager.f4747i != 0) {
            return false;
        }
        if (!m77167t()) {
            i = linearLayoutManager.mo5448m();
        } else {
            i = linearLayoutManager.mo5446k();
        }
        if (i == -1) {
            return false;
        }
        View c = getLayoutManager().mo5432c(i);
        if (c == null) {
            return false;
        }
        int width = (getWidth() - getPaddingRight()) - c.getRight();
        int i2 = ((MarginLayoutParams) c.getLayoutParams()).rightMargin;
        if (i != getEndItemIndex() || width - i2 < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private boolean m77166s() {
        int i;
        if (getChildCount() == 0) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager.f4747i != 1) {
            return false;
        }
        if (!m77167t()) {
            i = linearLayoutManager.mo5448m();
        } else {
            i = linearLayoutManager.mo5446k();
        }
        if (i == -1) {
            return false;
        }
        View c = getLayoutManager().mo5432c(i);
        if (c == null) {
            return false;
        }
        int height = (getHeight() - getPaddingBottom()) - c.getBottom();
        int i2 = ((MarginLayoutParams) c.getLayoutParams()).bottomMargin;
        if (i != getEndItemIndex() || height - i2 < 0) {
            return false;
        }
        return true;
    }

    public BaseRecyclerView(Context context) {
        super(context);
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.f61971M != null) {
            Iterator it = this.f61971M.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p280ss.android.ugc.aweme.arch.widgets;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.WidgetListAdapter */
public abstract class WidgetListAdapter extends BaseAdapter {

    /* renamed from: a */
    protected WidgetManager f60903a;

    /* renamed from: b */
    protected DataCenter f60904b;

    /* renamed from: c */
    protected RecyclerView f60905c;

    /* renamed from: d */
    private ArrayList<ListItemWidget> f60906d = new ArrayList<>();

    /* renamed from: a */
    public C1293v mo58032a(ViewGroup viewGroup, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ListItemWidget mo60129b(int i);

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f60905c = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f60905c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b_ */
    public final ListItemWidget mo60130b_(int i) {
        if (i < this.f60906d.size()) {
            return (ListItemWidget) this.f60906d.get(i);
        }
        ListItemWidget b = mo60129b(i);
        this.f60903a.mo60154a((Widget) b);
        this.f60906d.add(b);
        return b;
    }

    public WidgetListAdapter(WidgetManager widgetManager, DataCenter dataCenter) {
        this.f60903a = widgetManager;
        this.f60904b = dataCenter;
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof ItemWidgetViewHolder) {
            ItemWidgetViewHolder itemWidgetViewHolder = (ItemWidgetViewHolder) vVar;
            ListItemWidget listItemWidget = itemWidgetViewHolder.f60901a;
            if (listItemWidget != null) {
                listItemWidget.mo60127a();
            }
            itemWidgetViewHolder.mo60126a(mo60130b_(i));
        }
    }
}

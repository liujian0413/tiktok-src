package com.p280ss.android.ugc.aweme.shortvideo.widget.baseadapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.SparseArray;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.baseadapter.ViewHolder */
public class ViewHolder extends C1293v {

    /* renamed from: a */
    public View f108513a;

    /* renamed from: b */
    private SparseArray<View> f108514b = new SparseArray<>();

    /* renamed from: c */
    private Context f108515c;

    /* renamed from: a */
    public static ViewHolder m132788a(Context context, View view) {
        return new ViewHolder(context, view);
    }

    private ViewHolder(Context context, View view) {
        super(view);
        this.f108515c = context;
        this.f108513a = view;
    }
}

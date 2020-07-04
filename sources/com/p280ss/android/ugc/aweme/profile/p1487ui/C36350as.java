package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.as */
public final class C36350as extends BaseAdapter {

    /* renamed from: a */
    private Context f95490a;

    /* renamed from: b */
    private List<C36351a> f95491b;

    /* renamed from: c */
    private SparseArray f95492c;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.as$a */
    public static class C36351a {

        /* renamed from: a */
        public String f95493a;

        /* renamed from: b */
        boolean f95494b;

        public C36351a(String str, boolean z) {
            this.f95493a = str;
            this.f95494b = z;
        }
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        return this.f95491b.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C36351a getItem(int i) {
        return (C36351a) this.f95491b.get(i);
    }

    /* renamed from: a */
    public final String mo92458a(int i) {
        return (String) this.f95492c.get(i);
    }

    public C36350as(Context context, List<C36351a> list) {
        this.f95490a = context;
        this.f95491b = list;
        this.f95492c = new SparseArray(list.size());
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = View.inflate(this.f95490a, R.layout.ks, null);
        }
        C36351a b = getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.dwe);
        this.f95492c.put(i, b.f95493a);
        View findViewById = view.findViewById(R.id.c09);
        textView.setText(b.f95493a);
        if (b.f95494b) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        return view;
    }
}

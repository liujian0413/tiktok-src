package com.bytedance.jirafast.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.TextView;
import com.bytedance.jirafast.models.JIRAUser;
import com.bytedance.jirafast.utils.C12069b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.jirafast.adapters.a */
public final class C12001a extends ArrayAdapter<JIRAUser> implements Filterable {

    /* renamed from: a */
    public List<JIRAUser> f31897a = new ArrayList();

    /* renamed from: b */
    public List<JIRAUser> f31898b;

    /* renamed from: c */
    private int f31899c = R.layout.a4_;

    /* renamed from: com.bytedance.jirafast.adapters.a$a */
    static class C12003a {

        /* renamed from: a */
        TextView f31901a;

        /* renamed from: b */
        TextView f31902b;

        /* renamed from: c */
        TextView f31903c;

        public C12003a(View view) {
            this.f31901a = (TextView) view.findViewById(R.id.bf7);
            this.f31902b = (TextView) view.findViewById(R.id.bf6);
            this.f31903c = (TextView) view.findViewById(R.id.bec);
        }
    }

    public final Filter getFilter() {
        return new Filter() {
            /* access modifiers changed from: protected */
            public final FilterResults performFiltering(CharSequence charSequence) {
                FilterResults filterResults = new FilterResults();
                List arrayList = new ArrayList();
                if (charSequence != null && charSequence.length() != 0) {
                    arrayList = C12069b.m35206a().mo29750a(charSequence.toString());
                } else if (C12001a.this.f31898b != null) {
                    arrayList = C12001a.this.f31898b;
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
                if (filterResults == null || filterResults.count <= 0) {
                    C12001a.this.notifyDataSetInvalidated();
                    return;
                }
                C12001a.this.f31897a.clear();
                C12001a.this.f31897a.addAll((Collection) filterResults.values);
                C12001a.this.notifyDataSetChanged();
            }
        };
    }

    public final int getCount() {
        if (this.f31897a == null) {
            return 0;
        }
        return this.f31897a.size();
    }

    /* renamed from: a */
    public final JIRAUser getItem(int i) {
        return (JIRAUser) this.f31897a.get(i);
    }

    public C12001a(Context context, int i) {
        super(context, R.layout.a4_);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C12003a aVar;
        JIRAUser a = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.f31899c, viewGroup, false);
            aVar = new C12003a(view);
            view.setTag(aVar);
        } else {
            aVar = (C12003a) view.getTag();
        }
        if (a != null) {
            aVar.f31901a.setText(a.getName());
            aVar.f31902b.setText(a.getEmailAddress());
            if (!a.getName().equals(a.getDisplayName())) {
                aVar.f31903c.setText(a.getDisplayName());
            } else {
                aVar.f31903c.setText("");
            }
        }
        return view;
    }
}

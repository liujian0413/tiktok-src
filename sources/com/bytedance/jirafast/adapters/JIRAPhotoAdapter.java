package com.bytedance.jirafast.adapters;

import android.net.Uri;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.jirafast.utils.C12075f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JIRAPhotoAdapter extends C1262a<C12000a> {

    /* renamed from: a */
    public List<String> f31894a = new ArrayList();

    /* renamed from: com.bytedance.jirafast.adapters.JIRAPhotoAdapter$a */
    static class C12000a extends C1293v {

        /* renamed from: a */
        ImageView f31895a;

        /* renamed from: b */
        TextView f31896b;

        public C12000a(View view) {
            super(view);
            this.f31895a = (ImageView) view.findViewById(R.id.be1);
            this.f31896b = (TextView) view.findViewById(R.id.be2);
        }
    }

    public int getItemCount() {
        return this.f31894a.size();
    }

    /* renamed from: a */
    public final void mo29609a(List<String> list) {
        this.f31894a = list;
        notifyDataSetChanged();
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m35072a(viewGroup, i);
    }

    /* renamed from: a */
    private static C12000a m35072a(ViewGroup viewGroup, int i) {
        return new C12000a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a49, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C12000a aVar, int i) {
        File file = new File((String) this.f31894a.get(i));
        if (file.exists()) {
            aVar.f31895a.setImageURI(Uri.fromFile(file));
            aVar.f31896b.setText(C12075f.m35226a(file.length()));
        }
    }
}

package com.p280ss.android.ugc.aweme.colortemplate;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.colortemplate.ColorAdapter */
public final class ColorAdapter extends C1262a<ColorVH> {

    /* renamed from: a */
    private final ArrayList<String> f63514a = new ArrayList<>();

    /* renamed from: b */
    private boolean f63515b = true;

    public final int getItemCount() {
        return this.f63514a.size();
    }

    /* renamed from: a */
    public final void mo62286a() {
        this.f63515b = !this.f63515b;
        notifyDataSetChanged();
    }

    public ColorAdapter(Context context) {
        C7573i.m23587b(context, "context");
        String[] stringArray = context.getResources().getStringArray(R.array.j);
        Collection collection = this.f63514a;
        C7573i.m23582a((Object) stringArray, "colors");
        C7525m.m23479a(collection, (T[]) stringArray);
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m78832a(viewGroup, i);
    }

    /* renamed from: a */
    private static ColorVH m78832a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "p0");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tw, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(p0.c…olor_template, p0, false)");
        return new ColorVH(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ColorVH colorVH, int i) {
        C7573i.m23587b(colorVH, "p0");
        Object obj = this.f63514a.get(i);
        C7573i.m23582a(obj, "mData[p1]");
        colorVH.mo62289a((String) obj, this.f63515b);
    }
}

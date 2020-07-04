package com.bytedance.android.livesdk.gift.impl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.model.C8151f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.impl.a */
public final class C8114a extends BaseAdapter {

    /* renamed from: a */
    private final List<C8151f> f22142a;

    /* renamed from: b */
    private final C8115a f22143b;

    /* renamed from: com.bytedance.android.livesdk.gift.impl.a$a */
    public interface C8115a {
        /* renamed from: a */
        void mo21235a(int i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.f22142a.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C8151f getItem(int i) {
        return (C8151f) this.f22142a.get(i);
    }

    public C8114a(List<C8151f> list, C8115a aVar) {
        this.f22143b = aVar;
        if (list == null) {
            this.f22142a = new ArrayList();
        } else {
            this.f22142a = list;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21230a(C8151f fVar, View view) {
        if (this.f22143b != null) {
            this.f22143b.mo21235a(fVar.f22261a);
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.as4, viewGroup, false);
        }
        C8151f a = getItem(i);
        ((TextView) view).setText(String.valueOf(a.f22261a));
        view.setOnClickListener(new C8116b(this, a));
        return view;
    }
}

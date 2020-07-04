package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover;

import android.graphics.Bitmap;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.Adapter.ViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverAdapter */
public class MvChooseCoverAdapter extends C1262a<ViewHolder> {

    /* renamed from: a */
    private int f104361a;

    /* renamed from: b */
    private int f104362b;

    /* renamed from: c */
    private List<Bitmap> f104363c = new ArrayList(7);

    public int getItemCount() {
        return this.f104363c.size();
    }

    /* renamed from: a */
    public final void mo99897a(List<Bitmap> list) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            this.f104363c.clear();
            this.f104363c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public MvChooseCoverAdapter(int i, int i2) {
        this.f104361a = i;
        this.f104362b = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Bitmap bitmap = (Bitmap) this.f104363c.get(i);
        if (bitmap != null) {
            viewHolder.f108280a.setImageBitmap(bitmap);
        }
        if (i != 0) {
            getItemCount();
        }
        viewHolder.f108280a.setPadding(0, 0, 0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ImageView imageView = (ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.akj, viewGroup, false);
        LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.f104362b;
        layoutParams.width = this.f104361a;
        imageView.setScaleType(ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams);
        return new ViewHolder(imageView);
    }
}

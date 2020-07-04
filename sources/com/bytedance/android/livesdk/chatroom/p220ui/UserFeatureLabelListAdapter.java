package com.bytedance.android.livesdk.chatroom.p220ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.UserFeatureLabelListAdapter */
public class UserFeatureLabelListAdapter extends C1262a<LabelViewHolder> {

    /* renamed from: a */
    public OnClickListener f15198a;

    /* renamed from: b */
    private List<ImageModel> f15199b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.UserFeatureLabelListAdapter$LabelViewHolder */
    public static class LabelViewHolder extends C1293v {

        /* renamed from: a */
        final int f15200a = C3358ac.m12510a(10.0f);

        /* renamed from: b */
        ImageView f15201b = ((ImageView) this.itemView.findViewById(R.id.dpm));

        public LabelViewHolder(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo13426a(ImageModel imageModel, OnClickListener onClickListener) {
            if (imageModel != null) {
                if (imageModel.getImageType() == 7 || imageModel.getImageType() == 5 || imageModel.getImageType() == 6) {
                    C9738o.m28712b((View) this.f15201b, 8);
                    return;
                }
                C3404s.m12655a(this.f15201b, imageModel, -1, -1, true, 0, new C3405a() {
                    /* renamed from: a */
                    public final void mo10308a(ImageModel imageModel) {
                    }

                    /* renamed from: a */
                    public final void mo10310a(ImageModel imageModel, Exception exc) {
                    }

                    /* renamed from: a */
                    public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                        if (i2 > 0 && i > 0) {
                            LayoutParams layoutParams = LabelViewHolder.this.f15201b.getLayoutParams();
                            int i3 = LabelViewHolder.this.f15200a;
                            layoutParams.height = i3;
                            layoutParams.width = (i * i3) / i2;
                            LabelViewHolder.this.f15201b.setLayoutParams(layoutParams);
                        }
                    }
                });
                C9738o.m28705a(true, this.itemView, onClickListener);
                this.itemView.setTag(imageModel);
            }
        }
    }

    public int getItemCount() {
        if (this.f15199b == null) {
            return 0;
        }
        return this.f15199b.size();
    }

    /* renamed from: a */
    public final void mo13425a(List<ImageModel> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (this.f15199b == null) {
                this.f15199b = new ArrayList();
            }
            this.f15199b.clear();
            this.f15199b.addAll(list);
            notifyDataSetChanged();
        }
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m16781a(viewGroup, i);
    }

    /* renamed from: a */
    private static LabelViewHolder m16781a(ViewGroup viewGroup, int i) {
        return new LabelViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.avq, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(LabelViewHolder labelViewHolder, int i) {
        if (!C6307b.m19566a((Collection<T>) this.f15199b) && i < this.f15199b.size()) {
            labelViewHolder.mo13426a((ImageModel) this.f15199b.get(i), this.f15198a);
        }
    }
}

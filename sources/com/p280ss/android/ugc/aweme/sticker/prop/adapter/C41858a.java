package com.p280ss.android.ugc.aweme.sticker.prop.adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.adapter.a */
public final class C41858a extends BaseAdapter {

    /* renamed from: a */
    public List<NewFaceStickerBean> f108885a = new ArrayList();

    /* renamed from: b */
    public int f108886b;

    /* renamed from: c */
    private Context f108887c;

    /* renamed from: com.ss.android.ugc.aweme.sticker.prop.adapter.a$a */
    static class C41859a {

        /* renamed from: a */
        public View f108888a;

        /* renamed from: b */
        public RemoteImageView f108889b;

        C41859a() {
        }
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        if (this.f108885a == null) {
            return 0;
        }
        return this.f108885a.size();
    }

    public C41858a(Context context) {
        this.f108887c = context;
    }

    /* renamed from: a */
    public final void mo102892a(List<NewFaceStickerBean> list) {
        if (list != null && list.size() != 0) {
            this.f108885a.clear();
            this.f108885a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo102891a(int i) {
        if (this.f108885a != null && i < this.f108885a.size()) {
            for (NewFaceStickerBean newFaceStickerBean : this.f108885a) {
                newFaceStickerBean.mIsSelect = false;
            }
            ((NewFaceStickerBean) this.f108885a.get(i)).mIsSelect = true;
            this.f108886b = i;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private static void m133135a(View view, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C41859a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f108887c).inflate(R.layout.a3k, null);
            aVar = new C41859a();
            aVar.f108888a = view.findViewById(R.id.ayv);
            aVar.f108889b = (RemoteImageView) view.findViewById(R.id.db_);
            view.setTag(aVar);
        } else {
            aVar = (C41859a) view.getTag();
        }
        C23323e.m76524b(aVar.f108889b, ((NewFaceStickerBean) this.f108885a.get(i)).iconUrl);
        if (((NewFaceStickerBean) this.f108885a.get(i)).mIsSelect) {
            aVar.f108888a.setVisibility(0);
            m133135a(aVar.f108888a, true);
        } else {
            aVar.f108888a.setVisibility(4);
        }
        return view;
    }
}

package com.p280ss.android.ugc.aweme.profile.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c.C10791a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.profile.adapter.ProfileCoverAdapter.C35706a;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.ProfileCoverViewHolder */
public class ProfileCoverViewHolder extends C1293v {
    RemoteImageView mCoverImage;
    View mSelectBtn;
    ImageView mSelectedImage;
    TextView mUnselectedText;

    public ProfileCoverViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    private void m115402a(boolean z) {
        int i;
        ImageView imageView = this.mSelectedImage;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        TextView textView = this.mUnselectedText;
        if (!z) {
            i2 = 0;
        }
        textView.setVisibility(i2);
    }

    /* renamed from: a */
    public final void mo90555a(UrlModel urlModel, boolean z, C35706a aVar) {
        C23323e.m76524b(this.mCoverImage, urlModel);
        m115402a(z);
        this.mSelectBtn.setOnTouchListener(C10791a.m31505a());
        this.mSelectBtn.setOnClickListener(new C35720k(aVar, urlModel));
    }
}

package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.graphics.Bitmap;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.newfollow.model.C34148e;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.C34167a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.UpLoadItemViewHolder */
public class UpLoadItemViewHolder extends C1293v {
    ImageView mCoverImage;
    ProgressBar mProgressBar;
    TextView mTextView;

    public UpLoadItemViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo87022a(final int i) {
        this.mProgressBar.post(new Runnable() {
            public final void run() {
                UpLoadItemViewHolder.this.mProgressBar.setProgress(i);
                UpLoadItemViewHolder.this.mProgressBar.setMax(100);
                UpLoadItemViewHolder.this.mProgressBar.invalidate();
            }
        });
    }

    /* renamed from: a */
    public final void mo87023a(FollowFeed followFeed) {
        if (followFeed instanceof C34148e) {
            C34148e eVar = (C34148e) followFeed;
            this.mProgressBar.setProgress(eVar.f88988a);
            this.mProgressBar.setMax(100);
            this.mProgressBar.invalidate();
            if (eVar.f88990c) {
                this.mTextView.setText(R.string.d03);
            } else {
                this.mTextView.setText(R.string.fl0);
            }
            Bitmap bitmap = eVar.f88989b;
            if (bitmap != null) {
                this.mCoverImage.setImageDrawable(new C34167a(bitmap));
            }
            eVar.f88991d = this;
        }
    }
}

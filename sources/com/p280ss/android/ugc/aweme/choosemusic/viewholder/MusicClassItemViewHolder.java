package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23845c;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassItemViewHolder */
public class MusicClassItemViewHolder extends C1293v implements OnClickListener {

    /* renamed from: a */
    private MusicCollectionItem f63360a;

    /* renamed from: b */
    private int f63361b;

    /* renamed from: c */
    private C23845c f63362c;
    RemoteImageView mIvClassCover;
    TextView mTvClassName;

    /* renamed from: a */
    public final void mo62204a(MusicCollectionItem musicCollectionItem) {
        this.f63360a = musicCollectionItem;
        if (this.f63360a != null) {
            this.mTvClassName.setText(this.f63360a.mcName);
            C23323e.m76524b(this.mIvClassCover, this.f63360a.awemeCover);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!(C27326a.m89578a(view) || this.f63360a == null || this.itemView == null || this.f63362c == null)) {
            this.f63362c.mo61924a(this.f63360a, this.f63361b);
        }
    }

    public MusicClassItemViewHolder(View view, int i, C23845c cVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f63361b = i;
        this.itemView.setOnClickListener(this);
        this.f63362c = cVar;
    }
}

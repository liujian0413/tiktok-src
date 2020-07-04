package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23845c;
import com.p280ss.android.ugc.aweme.music.adapter.C33744d;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder */
public class MusicClassViewHolder extends ItemWidgetViewHolder {

    /* renamed from: b */
    public C33744d f63364b;

    /* renamed from: c */
    public C23845c f63365c;
    RecyclerView mRvClassContainer;
    TextView mTvTitleLeft;
    TextView mTvTitleRight;

    public MusicClassViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.mTvTitleLeft.setText(view.getContext().getText(R.string.cho));
        final int b = (int) C9738o.m28708b(view.getContext(), 16.0f);
        this.mRvClassContainer.mo5525a((C1272h) new C1272h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                rect.bottom = b;
            }
        });
        this.mTvTitleRight.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view) && MusicClassViewHolder.this.f63364b != null) {
                    MusicClassViewHolder.this.f63364b.mo62273a(null, view, null);
                }
            }
        });
        this.mRvClassContainer.setLayoutManager(new WrapGridLayoutManager(view.getContext(), 2));
    }

    /* renamed from: a */
    public final void mo62206a(final List<MusicCollectionItem> list, final int i) {
        this.mRvClassContainer.setAdapter(new C1262a() {
            public final int getItemCount() {
                if (list == null) {
                    return 0;
                }
                return list.size();
            }

            public final void onBindViewHolder(C1293v vVar, int i) {
                ((MusicClassItemViewHolder) vVar).mo62204a((MusicCollectionItem) list.get(i));
            }

            public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new MusicClassItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zf, viewGroup, false), i, MusicClassViewHolder.this.f63365c);
            }
        });
    }
}

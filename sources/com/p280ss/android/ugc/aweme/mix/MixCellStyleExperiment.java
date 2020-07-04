package com.p280ss.android.ugc.aweme.mix;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

@C6381a(mo15284a = "awe_mix_cell_style")
/* renamed from: com.ss.android.ugc.aweme.mix.MixCellStyleExperiment */
public final class MixCellStyleExperiment {
    @C6382b(mo15285a = true)
    private static final int DOUBLE_ROW = 1;
    public static final MixCellStyleExperiment INSTANCE = new MixCellStyleExperiment();
    @C6382b
    private static final int SINGLE_ROW = 0;
    private static final boolean doubleRow;
    private static final boolean singleRow;

    /* renamed from: com.ss.android.ugc.aweme.mix.MixCellStyleExperiment$a */
    static final class C33477a implements OnClickListener {

        /* renamed from: a */
        public static final C33477a f87431a = new C33477a();

        C33477a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    private MixCellStyleExperiment() {
    }

    public final boolean getDoubleRow() {
        return doubleRow;
    }

    public final boolean getSingleRow() {
        return singleRow;
    }

    static {
        boolean z;
        boolean z2 = true;
        if (C6384b.m19835a().mo15287a(MixCellStyleExperiment.class, true, "awe_mix_cell_style", C6384b.m19835a().mo15295d().awe_mix_cell_style, 1) == SINGLE_ROW) {
            z = true;
        } else {
            z = false;
        }
        singleRow = z;
        if (C6384b.m19835a().mo15287a(MixCellStyleExperiment.class, true, "awe_mix_cell_style", C6384b.m19835a().mo15295d().awe_mix_cell_style, 1) != DOUBLE_ROW) {
            z2 = false;
        }
        doubleRow = z2;
    }

    public final C1272h getDecoration(Context context) {
        C7573i.m23587b(context, "context");
        if (singleRow) {
            return null;
        }
        return new MixItemDecoration(context);
    }

    public final C1273i createLayoutManager(Activity activity, RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "mRecyclerView");
        if (!singleRow) {
            return new MixCellStyleExperiment$createLayoutManager$1(recyclerView, 2, 1);
        }
        if (activity == null) {
            C7573i.m23580a();
        }
        return new WrapLinearLayoutManager(activity, 1, false);
    }

    public final long getFirstEpisodeNum(Long l, long j) {
        if (l == null) {
            return j;
        }
        l.longValue();
        long longValue = (l.longValue() - j) + 1;
        if (singleRow && longValue <= 4) {
            return l.longValue() - 4;
        }
        if (!doubleRow || longValue > 3) {
            return j;
        }
        return l.longValue() - 3;
    }

    public final JediViewHolder<? extends C11501d, Aweme> createViewHolder(ViewGroup viewGroup, C23685d dVar) {
        int i;
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(dVar, "onItemClickListener");
        if (singleRow) {
            i = R.layout.adu;
        } else {
            i = R.layout.adt;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        inflate.setOnClickListener(C33477a.f87431a);
        if (singleRow) {
            C7573i.m23582a((Object) inflate, "itemView");
            return new MixListViewHolder<>(inflate, dVar);
        }
        C7573i.m23582a((Object) inflate, "itemView");
        return new MixDoubleRowListViewHolder<>(inflate, dVar);
    }
}

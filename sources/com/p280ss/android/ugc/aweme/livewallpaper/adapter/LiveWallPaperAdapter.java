package com.p280ss.android.ugc.aweme.livewallpaper.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.adapter.LiveWallPaperAdapter */
public class LiveWallPaperAdapter extends C1262a<ViewHolder> implements OnClickListener {

    /* renamed from: c */
    private static final int f84915c = (C23482j.m77096a()[0] / 3);

    /* renamed from: d */
    private static final int f84916d = ((int) (((float) C23482j.m77096a()[0]) * 0.44f));

    /* renamed from: a */
    public C32568a f84917a;

    /* renamed from: b */
    private List<LiveWallPaperBean> f84918b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.adapter.LiveWallPaperAdapter$ViewHolder */
    public class ViewHolder extends C1293v {

        /* renamed from: a */
        public RemoteImageView f84919a;

        public ViewHolder(View view) {
            super(view);
            this.f84919a = (RemoteImageView) view.findViewById(R.id.diy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.adapter.LiveWallPaperAdapter$a */
    public interface C32568a {
        /* renamed from: a */
        void mo83851a(LiveWallPaperBean liveWallPaperBean);
    }

    public int getItemCount() {
        return this.f84918b.size();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f84917a != null) {
            this.f84917a.mo83851a((LiveWallPaperBean) view.getTag());
        }
    }

    /* renamed from: a */
    private LiveWallPaperBean m105453a(int i) {
        if (i >= this.f84918b.size() || i < 0) {
            return null;
        }
        return (LiveWallPaperBean) this.f84918b.get(i);
    }

    /* renamed from: a */
    public final void mo83849a(List<LiveWallPaperBean> list) {
        this.f84918b.clear();
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f84918b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x8, viewGroup, false);
        inflate.setOnClickListener(this);
        return new ViewHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        LiveWallPaperBean a = m105453a(i);
        if (a != null) {
            RemoteImageView remoteImageView = viewHolder.f84919a;
            StringBuilder sb = new StringBuilder("file://");
            sb.append(a.getThumbnailPath());
            C23323e.m76525b(remoteImageView, sb.toString(), f84915c, f84916d);
            viewHolder.itemView.setTag(a);
        }
    }
}

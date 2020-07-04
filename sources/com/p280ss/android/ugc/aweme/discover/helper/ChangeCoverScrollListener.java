package com.p280ss.android.ugc.aweme.discover.helper;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.C26375a;
import com.p280ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.ChangeCoverScrollListener */
public class ChangeCoverScrollListener extends C1281m {

    /* renamed from: a */
    private boolean f70226a;

    /* renamed from: a */
    private static boolean m87529a(RecyclerView recyclerView) {
        ImageView imageView = (ImageView) recyclerView.findViewById(R.id.b_9);
        if (imageView != null) {
            int[] iArr = new int[2];
            imageView.getLocationOnScreen(iArr);
            if (iArr[1] * 2 > C9738o.m28709b(C6399b.m19921a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m87528a(RecyclerView recyclerView, boolean z) {
        if (recyclerView != null) {
            C1293v f = recyclerView.mo5575f(2);
            if ((f instanceof HotVideoViewHolder) && f.mItemViewType == C26375a.m86757c()) {
                this.f70226a = z;
                ((HotVideoViewHolder) f).mo67978a(z);
            }
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean a = m87529a(recyclerView);
        if (a != this.f70226a) {
            m87528a(recyclerView, a);
        }
    }
}

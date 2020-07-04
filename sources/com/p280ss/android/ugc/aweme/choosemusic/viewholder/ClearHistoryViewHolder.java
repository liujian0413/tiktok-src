package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23851c;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23852d;
import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.ClearHistoryViewHolder */
public final class ClearHistoryViewHolder extends C1293v {

    /* renamed from: a */
    public DmtTextView f63334a;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.ClearHistoryViewHolder$a */
    static final class C23974a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f63335a;

        C23974a(boolean z) {
            this.f63335a = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f63335a) {
                C23851c.m78120c().mo61927a();
            } else {
                C23852d.m78123c().mo61927a();
            }
        }
    }

    public ClearHistoryViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.drv);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_clear_all)");
        this.f63334a = (DmtTextView) findViewById;
    }

    /* renamed from: a */
    public final void mo62187a(MusicSearchHistory musicSearchHistory, boolean z) {
        C7573i.m23587b(musicSearchHistory, "history");
        this.f63334a.setOnClickListener(new C23974a(z));
    }
}

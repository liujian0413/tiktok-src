package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23821b;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23851c;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23852d;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23876v;
import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.SearchHistoryViewHolder */
public final class SearchHistoryViewHolder extends C1293v {

    /* renamed from: a */
    public DmtTextView f63443a;

    /* renamed from: b */
    public ImageView f63444b;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.SearchHistoryViewHolder$a */
    static final class C24000a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f63445a;

        /* renamed from: b */
        final /* synthetic */ MusicSearchHistory f63446b;

        C24000a(boolean z, MusicSearchHistory musicSearchHistory) {
            this.f63445a = z;
            this.f63446b = musicSearchHistory;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f63445a) {
                C23851c.m78120c().mo61929a(this.f63446b);
            } else {
                C23852d.m78123c().mo61929a(this.f63446b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.SearchHistoryViewHolder$b */
    static final class C24001b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusicSearchHistory f63447a;

        C24001b(MusicSearchHistory musicSearchHistory) {
            this.f63447a = musicSearchHistory;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C23876v a = new C23876v().mo61964a(2).mo61967b("search_history").mo61965a(this.f63447a.keyword);
            C7573i.m23582a((Object) a, "param");
            C42961az.m136380a(new C23821b(a));
        }
    }

    public SearchHistoryViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.dvm);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_history)");
        this.f63443a = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.b7c);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.iv_clear)");
        this.f63444b = (ImageView) findViewById2;
    }

    /* renamed from: a */
    public final void mo62247a(MusicSearchHistory musicSearchHistory, boolean z) {
        C7573i.m23587b(musicSearchHistory, "history");
        this.f63443a.setText(musicSearchHistory.keyword);
        this.f63444b.setOnClickListener(new C24000a(z, musicSearchHistory));
        this.f63443a.setOnClickListener(new C24001b(musicSearchHistory));
    }
}

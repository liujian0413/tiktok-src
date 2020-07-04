package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.choosemusic.view.SugCompletionView;
import com.p280ss.android.ugc.aweme.choosemusic.view.SugCompletionView.C23955a;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26776a;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26778c;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26779d;
import com.p280ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26582i;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27015d;
import com.p280ss.android.ugc.aweme.music.experiment.SearchSugCompletionExperiment;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSugViewHolder */
public class SearchSugViewHolder extends C1293v {

    /* renamed from: a */
    public long f69811a;

    /* renamed from: b */
    public C27015d f69812b;

    /* renamed from: c */
    private C23955a f69813c;

    /* renamed from: d */
    private SearchSugEntity f69814d;

    /* renamed from: e */
    private int f69815e;
    View mBottomDivider;
    ImageView mIvSearchIcon;
    SugCompletionView mIvSugCompletion;
    TextView mSugView;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo68091a(View view) {
        if (this.f69814d != null) {
            C42961az.m136380a(new C26582i(this.f69814d.content));
            m87098c(this.f69815e, this.f69814d);
        }
    }

    /* renamed from: a */
    public static void m87096a(int i, SearchSugEntity searchSugEntity) {
        new C26778c().mo68556a(searchSugEntity.mWord).mo68558a("sug").mo68559b(searchSugEntity.content).mo68557a(Integer.valueOf(i)).mo85246a(searchSugEntity.extraParam).mo85252e();
    }

    /* renamed from: b */
    private static void m87097b(int i, SearchSugEntity searchSugEntity) {
        if (!searchSugEntity.isMobShow) {
            searchSugEntity.isMobShow = true;
            new C26779d().mo68556a(searchSugEntity.mWord).mo68558a("sug").mo68559b(searchSugEntity.content).mo68557a(Integer.valueOf(i)).mo85246a(searchSugEntity.extraParam).mo85252e();
        }
    }

    /* renamed from: c */
    private static void m87098c(int i, SearchSugEntity searchSugEntity) {
        new C26776a().mo68556a(searchSugEntity.mWord).mo68558a("sug").mo68557a(Integer.valueOf(i)).mo68559b(searchSugEntity.content).mo85246a(searchSugEntity.extraParam).mo85252e();
    }

    public SearchSugViewHolder(View view, C27015d dVar, C23955a aVar) {
        super(view);
        this.f69812b = dVar;
        this.f69813c = aVar;
        ButterKnife.bind((Object) this, view);
        this.mIvSugCompletion.setOnClickListener(new C26480ae(this));
        if (C6384b.m19835a().mo15292a(SearchSugCompletionExperiment.class, true, "search_sug_completion", C6384b.m19835a().mo15295d().search_sug_completion, false)) {
            this.mIvSugCompletion.setVisibility(0);
            this.mIvSearchIcon.setImageResource(R.drawable.ahn);
            this.mBottomDivider.setVisibility(0);
            this.mIvSugCompletion.setKeyboardDismissHandler(this.f69813c);
            return;
        }
        this.mIvSearchIcon.setImageResource(R.drawable.ah3);
        this.mIvSugCompletion.setVisibility(8);
        this.mBottomDivider.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo68092a(final SearchSugEntity searchSugEntity, final String str, final int i) {
        if (searchSugEntity != null) {
            this.f69814d = searchSugEntity;
            this.f69815e = i;
            this.mSugView.setText(C23472a.m77059a(this.itemView.getContext(), searchSugEntity.content, searchSugEntity.position));
            this.itemView.setOnTouchListener(new C27009an() {
                /* renamed from: b */
                public final void mo67959b(View view, MotionEvent motionEvent) {
                    if (System.currentTimeMillis() - SearchSugViewHolder.this.f69811a >= 500) {
                        SearchSugViewHolder.m87096a(i, searchSugEntity);
                        SearchSugViewHolder.this.f69811a = System.currentTimeMillis();
                        if (SearchSugViewHolder.this.f69812b != null && !searchSugEntity.isUserType()) {
                            SearchSugViewHolder.this.f69812b.mo69714a(searchSugEntity, str, i);
                        }
                    }
                }
            });
            m87097b(i, searchSugEntity);
        }
    }
}

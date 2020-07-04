package com.p280ss.android.ugc.aweme.discover.alading;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.alading.AwemeCardListAdapter.C26539a;
import com.p280ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.p280ss.android.ugc.aweme.discover.mob.C26775a;
import com.p280ss.android.ugc.aweme.discover.mob.C26804x.C26805a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.profile.presenter.C36018b;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardViewHolder */
public class SearchAwemeCardViewHolder extends SearchAbsAladingCard<Aweme> implements C26553b {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f70035e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchAwemeCardViewHolder.class), "awemeListAdapter", "getAwemeListAdapter()Lcom/ss/android/ugc/aweme/discover/alading/AwemeCardListAdapter;"))};

    /* renamed from: h */
    public static final C26550a f70036h = new C26550a(null);

    /* renamed from: c */
    private final C7541d f70037c;

    /* renamed from: f */
    protected HeaderAndFooterWrapper f70038f;

    /* renamed from: g */
    public List<? extends Aweme> f70039g;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardViewHolder$a */
    public static final class C26550a {
        private C26550a() {
        }

        public /* synthetic */ C26550a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardViewHolder$b */
    static final class C26551b extends Lambda implements C7561a<AwemeCardListAdapter> {

        /* renamed from: a */
        final /* synthetic */ SearchAwemeCardViewHolder f70042a;

        /* renamed from: b */
        final /* synthetic */ View f70043b;

        C26551b(SearchAwemeCardViewHolder searchAwemeCardViewHolder, View view) {
            this.f70042a = searchAwemeCardViewHolder;
            this.f70043b = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AwemeCardListAdapter invoke() {
            Context context = this.f70043b.getContext();
            C7573i.m23582a((Object) context, "itemView.context");
            return new AwemeCardListAdapter(context, this.f70042a, this.f70042a);
        }
    }

    /* renamed from: g */
    private AwemeCardListAdapter m87287g() {
        return (AwemeCardListAdapter) this.f70037c.getValue();
    }

    /* renamed from: d */
    public void mo68179d() {
    }

    /* renamed from: e */
    public String mo68180e() {
        return "";
    }

    /* renamed from: f */
    public int mo68181f() {
        return -1;
    }

    /* renamed from: a */
    private void m87286a(List<? extends Aweme> list) {
        C7573i.m23587b(list, "data");
        this.f70039g = list;
        m87287g().mo68163a(this.f70039g);
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        C7573i.m23587b(anVar, "event");
        if (C0991u.m4170G(this.itemView) && anVar.f74631a == 21) {
            Object obj = anVar.f74632b;
            if (obj != null) {
                Aweme aweme = (Aweme) obj;
                if (aweme != null && !TextUtils.equals(C26539a.m87249a(), aweme.getAid())) {
                    Iterator it = this.f70039g.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (TextUtils.equals(((Aweme) it.next()).getAid(), aweme.getAid())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        C1273i layoutManager = this.f70028b.getLayoutManager();
                        if (layoutManager != null) {
                            ((LinearLayoutManager) layoutManager).mo5417a(i, 0);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                        }
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    public SearchAwemeCardViewHolder(View view, List<? extends Aweme> list) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(list, "cardlist");
        super(view, list);
        this.f70039g = list;
        this.f70037c = C7546e.m23569a(new C26551b(this, view));
        AwemeCardListAdapter g = m87287g();
        if (g != null) {
            this.f70038f = new HeaderAndFooterWrapper(g);
            View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.ti, null, false);
            C7573i.m23582a((Object) inflate, "footerView");
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.width = (int) C9738o.m28708b(view.getContext(), 96.0f);
            layoutParams.setMargins(0, 0, (int) C9738o.m28708b(view.getContext(), 8.0f), 0);
            inflate.setLayoutParams(layoutParams);
            HeaderAndFooterWrapper headerAndFooterWrapper = this.f70038f;
            if (headerAndFooterWrapper == null) {
                C7573i.m23583a("mHeaderAndFooterWrapper");
            }
            headerAndFooterWrapper.mo68261b(inflate);
            inflate.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ SearchAwemeCardViewHolder f70040a;

                {
                    this.f70040a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f70040a.mo68179d();
                }
            });
            RecyclerView recyclerView = this.f70028b;
            HeaderAndFooterWrapper headerAndFooterWrapper2 = this.f70038f;
            if (headerAndFooterWrapper2 == null) {
                C7573i.m23583a("mHeaderAndFooterWrapper");
            }
            recyclerView.setAdapter(headerAndFooterWrapper2);
            view.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {

                /* renamed from: a */
                final /* synthetic */ SearchAwemeCardViewHolder f70041a;

                {
                    this.f70041a = r1;
                }

                public final void onViewAttachedToWindow(View view) {
                    C42961az.m136382c(this.f70041a);
                }

                public final void onViewDetachedFromWindow(View view) {
                    C42961az.m136383d(this.f70041a);
                }
            });
            m87286a(this.f70039g);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.Adapter<android.support.v7.widget.RecyclerView.ViewHolder>");
    }

    /* renamed from: a */
    public final void mo68182a(int i, View view, Aweme aweme, List<? extends Aweme> list) {
        C7573i.m23587b(view, "it");
        C7573i.m23587b(aweme, "item");
        C7573i.m23587b(list, "awemeList");
        C36018b bVar = new C36018b();
        bVar.setItems(list);
        C28503s.m93679a((C25673a) bVar);
        C26501r a = C26805a.m88001a(view);
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_no_request");
        bundle.putString("enter_from", "general_search");
        bundle.putString("search_keyword", a.mo68129b());
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", mo68181f());
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        Context context = view2.getContext();
        if (context != null) {
            DetailActivity.m86049a((Activity) (FragmentActivity) context, bundle, view);
            C28229b.m92772a(aweme);
            C22984d dVar = new C22984d();
            dVar.mo59973a("enter_from", "general_search").mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("search_keyword", a.mo68129b()).mo59973a("enter_method", "aladdin_card").mo59973a("log_pb", a.mo68131d());
            C6907h.m21525a("feed_enter", C33230ac.m107211a(dVar.f60753a));
            C26775a.m87934a(C38347c.f99553h, aweme.getAuthorUid(), view);
            Map c = mo68178c();
            if (c != null) {
                String desc = aweme.getDesc();
                C7573i.m23582a((Object) desc, "item.desc");
                c.put("aladdin_words", desc);
                String aid = aweme.getAid();
                C7573i.m23582a((Object) aid, "item.aid");
                c.put("list_item_id", aid);
                c.put("aladin_rank", String.valueOf(i));
                c.put("rank", "0");
            } else {
                c = null;
            }
            mo68177b(c);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}

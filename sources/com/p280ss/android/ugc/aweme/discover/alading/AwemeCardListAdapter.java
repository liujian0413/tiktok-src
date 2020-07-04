package com.p280ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a.C26743b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.AwemeCardListAdapter */
public final class AwemeCardListAdapter extends C1262a<AwemeCardViewHolder> {

    /* renamed from: e */
    public static String f70005e;

    /* renamed from: f */
    public static final C26539a f70006f = new C26539a(null);

    /* renamed from: a */
    public List<? extends Aweme> f70007a = new ArrayList();

    /* renamed from: b */
    public final Context f70008b;

    /* renamed from: c */
    public final C26743b f70009c;

    /* renamed from: d */
    public final C26553b f70010d;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.AwemeCardListAdapter$a */
    public static final class C26539a {
        private C26539a() {
        }

        /* renamed from: a */
        public static String m87249a() {
            return AwemeCardListAdapter.f70005e;
        }

        public /* synthetic */ C26539a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m87250a(String str) {
            AwemeCardListAdapter.f70005e = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.AwemeCardListAdapter$b */
    static final class C26540b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AwemeCardListAdapter f70011a;

        /* renamed from: b */
        final /* synthetic */ Aweme f70012b;

        /* renamed from: c */
        final /* synthetic */ int f70013c;

        C26540b(AwemeCardListAdapter awemeCardListAdapter, Aweme aweme, int i) {
            this.f70011a = awemeCardListAdapter;
            this.f70012b = aweme;
            this.f70013c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f70011a.f70008b == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            } else if (!C26552a.m87293a(this.f70011a.f70008b)) {
                C10761a.m31399c(this.f70011a.f70008b, (int) R.string.cjs).mo25750a();
            } else {
                C26539a.m87250a(this.f70012b.getAid());
                C26553b bVar = this.f70011a.f70010d;
                int i = this.f70013c;
                C7573i.m23582a((Object) view, "it");
                bVar.mo68182a(i, view, this.f70012b, this.f70011a.f70007a);
            }
        }
    }

    public final int getItemCount() {
        return this.f70007a.size();
    }

    /* renamed from: a */
    public final void mo68163a(List<? extends Aweme> list) {
        C7573i.m23587b(list, "value");
        this.f70007a = list;
        notifyDataSetChanged();
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m87246a(viewGroup, i);
    }

    /* renamed from: a */
    private static AwemeCardViewHolder m87246a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "p0");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.th, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        return new AwemeCardViewHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(AwemeCardViewHolder awemeCardViewHolder, int i) {
        UrlModel urlModel;
        Map map;
        C7573i.m23587b(awemeCardViewHolder, "p0");
        Aweme aweme = (Aweme) this.f70007a.get(i);
        awemeCardViewHolder.f70016c.setText(C30537o.m99738a((long) aweme.getStatistics().getDiggCount()));
        Drawable drawable = this.f70008b.getResources().getDrawable(R.drawable.a_x);
        drawable.setBounds(0, (int) C9738o.m28708b(this.f70008b, 0.5f), (int) C9738o.m28708b(this.f70008b, 15.0f), (int) C9738o.m28708b(this.f70008b, 15.5f));
        awemeCardViewHolder.f70016c.setCompoundDrawables(drawable, null, null, null);
        Video video = aweme.getVideo();
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        C12133n.m35299a(C23400r.m76741a(urlModel)).mo29845a("AwemeCardListAdapter").mo29844a((C12128i) awemeCardViewHolder.f70015b).mo29848a();
        awemeCardViewHolder.f70014a.setOnClickListener(new C26540b(this, aweme, i));
        C26743b bVar = this.f70009c;
        if (bVar != null) {
            C26743b bVar2 = this.f70009c;
            if (bVar2 != null) {
                map = bVar2.mo68176b();
                if (map != null) {
                    String desc = aweme.getDesc();
                    C7573i.m23582a((Object) desc, "item.desc");
                    map.put("aladdin_words", desc);
                    String aid = aweme.getAid();
                    C7573i.m23582a((Object) aid, "item.aid");
                    map.put("list_item_id", aid);
                    map.put("aladin_rank", String.valueOf(i));
                    map.put("rank", "0");
                    bVar.mo68175a(map);
                }
            }
            map = null;
            bVar.mo68175a(map);
        }
    }

    public AwemeCardListAdapter(Context context, C26743b bVar, C26553b bVar2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bVar, "searchMobOperator");
        C7573i.m23587b(bVar2, "listener");
        this.f70008b = context;
        this.f70009c = bVar;
        this.f70010d = bVar2;
    }
}

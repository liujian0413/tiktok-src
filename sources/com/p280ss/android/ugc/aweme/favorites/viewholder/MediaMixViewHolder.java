package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.MixStatisStruct;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.mix.MixDetailActivity;
import com.p280ss.android.ugc.aweme.mix.MixDetailActivity.C33478a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder */
public final class MediaMixViewHolder extends JediSimpleViewHolder<MixStruct> {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f73340f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaMixViewHolder.class), "mMediaMixListViewModel", "getMMediaMixListViewModel()Lcom/ss/android/ugc/aweme/favorites/viewmodel/MediaMixListViewModel;"))};

    /* renamed from: g */
    public static final C27817a f73341g = new C27817a(null);

    /* renamed from: j */
    private final C7541d f73342j;

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder$a */
    public static final class C27817a {
        private C27817a() {
        }

        public /* synthetic */ C27817a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder$b */
    static final class C27818b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaMixViewHolder f73343a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f73344b;

        /* renamed from: c */
        final /* synthetic */ TextView f73345c;

        C27818b(MediaMixViewHolder mediaMixViewHolder, MixStruct mixStruct, TextView textView) {
            this.f73343a = mediaMixViewHolder;
            this.f73344b = mixStruct;
            this.f73345c = textView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            MixStatisStruct mixStatisStruct = this.f73344b.statis;
            if (mixStatisStruct != null) {
                mixStatisStruct.hasUpdatedEpisode = 0;
            }
            TextView textView = this.f73345c;
            C7573i.m23582a((Object) textView, "statTv");
            View view2 = textView;
            TextView textView2 = this.f73345c;
            C7573i.m23582a((Object) textView2, "statTv");
            MediaMixViewHolder.m91218a(view2, (int) C9738o.m28708b(textView2.getContext(), 0.0f));
            TextView textView3 = this.f73345c;
            C7573i.m23582a((Object) textView3, "statTv");
            textView3.setVisibility(4);
            TextView textView4 = this.f73345c;
            C7573i.m23582a((Object) textView4, "statTv");
            textView4.setText("");
            this.f73343a.mo29066a(this.f73343a.mo62390p(), (C7562b<? super S1, ? extends R>) new C7562b<MediaMixState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C27818b f73346a;

                {
                    this.f73346a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m91223a((MediaMixState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m91223a(MediaMixState mediaMixState) {
                    boolean z;
                    String str;
                    String str2;
                    Long l;
                    C7573i.m23587b(mediaMixState, "it");
                    if (!C7573i.m23585a((Object) "general_search", (Object) mediaMixState.getEnterFrom()) || !C7573i.m23585a((Object) "general_search_aladdin_more", (Object) mediaMixState.getEnterMethod())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    C33478a aVar = MixDetailActivity.f87435a;
                    View view = this.f73346a.f73343a.itemView;
                    C7573i.m23582a((Object) view, "itemView");
                    Context context = view.getContext();
                    C7573i.m23582a((Object) context, "itemView.context");
                    String str3 = this.f73346a.f73344b.mixId;
                    C7573i.m23582a((Object) str3, "item.mixId");
                    User user = this.f73346a.f73344b.author;
                    C7573i.m23582a((Object) user, "item.author");
                    String uid = user.getUid();
                    C7573i.m23582a((Object) uid, "item.author.uid");
                    User user2 = this.f73346a.f73344b.author;
                    C7573i.m23582a((Object) user2, "item.author");
                    String secUid = user2.getSecUid();
                    C7573i.m23582a((Object) secUid, "item.author.secUid");
                    if (z) {
                        str = mediaMixState.getEnterFrom();
                    } else {
                        str = "favourite";
                    }
                    if (C7573i.m23585a((Object) "general_search", (Object) mediaMixState.getEnterFrom())) {
                        str2 = "general_search_aladdin_more";
                    } else {
                        str2 = "favourite";
                    }
                    MixStatisStruct mixStatisStruct = this.f73346a.f73344b.statis;
                    if (mixStatisStruct != null) {
                        l = Long.valueOf(mixStatisStruct.currentEpisode);
                    } else {
                        l = null;
                    }
                    C33478a.m108256a(aVar, context, str3, uid, secUid, str, str2, null, null, l, 192, null);
                    if (z) {
                        String a = SearchContext.m87922a(3);
                        C6907h.m21524a("search_result_click", (Map) new C22984d().mo59973a("enter_from", "search_compilation_page").mo59973a("token_type", "video_compilation").mo59973a("search_id", a).mo59973a("search_keyword", mediaMixState.getSearchKeyword()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(a)).mo59973a("is_aladdin", "1").f60753a);
                    }
                }
            });
        }
    }

    /* renamed from: p */
    public final MediaMixListViewModel mo62390p() {
        return (MediaMixListViewModel) this.f73342j.getValue();
    }

    public MediaMixViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v8, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…media_mix, parent, false)");
        super(inflate);
        C7584c a = C7575l.m23595a(MediaMixListViewModel.class);
        this.f73342j = C7546e.m23569a(new MediaMixViewHolder$$special$$inlined$hostViewModel$1(this, a, a));
    }

    /* renamed from: b */
    private final String m91220b(MixStruct mixStruct) {
        MixStatisStruct mixStatisStruct = mixStruct.statis;
        if (mixStatisStruct == null) {
            return "";
        }
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        String string = view.getResources().getString(R.string.c95, new Object[]{C30537o.m99738a(mixStatisStruct.playVV), C30537o.m99738a(mixStatisStruct.updatedToEpisode)});
        C7573i.m23582a((Object) string, "itemView.resources.getSt…statis.updatedToEpisode))");
        return string;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(MixStruct mixStruct) {
        long j;
        boolean z;
        String str;
        C7573i.m23587b(mixStruct, "item");
        C23323e.m76524b((RemoteImageView) this.itemView.findViewById(R.id.a4g), mixStruct.cover);
        TextView textView = (TextView) this.itemView.findViewById(R.id.e84);
        if (mixStruct.status.getStatus() == 4) {
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            Resources resources = view.getResources();
            Object[] objArr = new Object[1];
            User user = mixStruct.author;
            C7573i.m23582a((Object) user, "item.author");
            CharSequence remarkName = user.getRemarkName();
            if (remarkName == null || remarkName.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                User user2 = mixStruct.author;
                C7573i.m23582a((Object) user2, "item.author");
                str = user2.getRemarkName();
            } else {
                User user3 = mixStruct.author;
                C7573i.m23582a((Object) user3, "item.author");
                str = user3.getNickname();
            }
            objArr[0] = str;
            resources.getString(R.string.af2, objArr);
        }
        View findViewById = this.itemView.findViewById(R.id.c33);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById<TextView>(R.id.name)");
        ((TextView) findViewById).setText(mixStruct.mixName);
        MixStatisStruct mixStatisStruct = mixStruct.statis;
        if (mixStatisStruct != null) {
            j = mixStatisStruct.hasUpdatedEpisode;
        } else {
            j = 0;
        }
        if (j > 0) {
            C7573i.m23582a((Object) textView, "statTv");
            m91218a(textView, (int) C9738o.m28708b(textView.getContext(), 16.0f));
            textView.setVisibility(0);
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            textView.setText(view2.getResources().getString(R.string.c96, new Object[]{Long.valueOf(mixStruct.statis.hasUpdatedEpisode)}));
        } else {
            C7573i.m23582a((Object) textView, "statTv");
            m91218a(textView, (int) C9738o.m28708b(textView.getContext(), 0.0f));
            textView.setVisibility(4);
            textView.setText("");
        }
        View findViewById2 = this.itemView.findViewById(R.id.dad);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById<TextView>(R.id.stat)");
        ((TextView) findViewById2).setText(m91220b(mixStruct));
        this.itemView.setOnClickListener(new C27818b(this, mixStruct, textView));
        mo62390p().mo71318a(mixStruct);
    }

    /* renamed from: a */
    public static void m91218a(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (VERSION.SDK_INT >= 17) {
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(i);
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = i;
        }
    }
}

package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11554a.C11555a;
import com.bytedance.jedi.arch.ext.list.differ.C11561b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicClusterViewHolder.C26449a;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicClusterViewHolder.C26450b;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder.C26456a;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicianCard.C26461a;
import com.p280ss.android.ugc.aweme.discover.adapter.music.NewSearchMusicViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.music.NewSearchMusicViewHolder.C26494a;
import com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p280ss.android.ugc.aweme.discover.model.CardType;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter */
public final class SearchMusicAdapter extends SearchBaseAdapter<SearchMusic> implements C11554a<SearchMusic>, C26450b, C26499p {

    /* renamed from: g */
    public static final C26445a f69710g = new C26445a(null);

    /* renamed from: h */
    private final C26537z f69711h = new C26537z();

    /* renamed from: i */
    private final C11561b<SearchMusic> f69712i;

    /* renamed from: j */
    private final MusicPlayHelper f69713j;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter$a */
    public static final class C26445a {
        private C26445a() {
        }

        public /* synthetic */ C26445a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter$b */
    static final class C26446b implements Runnable {

        /* renamed from: a */
        public static final C26446b f69714a = new C26446b();

        C26446b() {
        }

        public final void run() {
            C26612d.m87397c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter$c */
    public static final class C26447c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f69715a;

        C26447c(ObjectRef objectRef) {
            this.f69715a = objectRef;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C7573i.m23587b(view, "textView");
            C33787a a = C33786f.m108941a((String) this.f69715a.element);
            a.mo86195a("enter_from", "music_search_result");
            C7195s.m22438a().mo18682a(a.mo86194a().toString());
            C6907h.m21524a("music_search_feedback_click", (Map) C22984d.m75611a().mo59973a("enter_from", "music_search_result").f60753a);
        }
    }

    /* renamed from: a */
    public final void mo29136a(List<? extends SearchMusic> list, C7561a<C7581n> aVar) {
        C7573i.m23587b(list, "list");
    }

    public final C11561b<SearchMusic> aC_() {
        return this.f69712i;
    }

    public final int getItemCount() {
        return super.getItemCount();
    }

    public final void ah_() {
        super.ah_();
        C6907h.m21524a("music_search_feedback_show", (Map) C22984d.m75611a().mo59973a("enter_from", "music_search_result").f60753a);
    }

    /* renamed from: b */
    public final void mo61577b(List<? extends SearchMusic> list) {
        super.mo61577b(this.f69711h.mo68160a(this.f67539l, list));
    }

    /* renamed from: a */
    public final void mo58045a(List<? extends SearchMusic> list) {
        MusicPlayHelper musicPlayHelper = this.f69713j;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo68326a();
        }
        super.mo58045a(this.f69711h.mo68159a(list));
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        Object obj = this.f67539l.get(i);
        C7573i.m23582a(obj, "mItems[position]");
        if (C26537z.m87236a((SearchMusic) obj)) {
            return 17;
        }
        if (((SearchMusic) this.f67539l.get(i)).getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
            return 18;
        }
        return 16;
    }

    /* renamed from: a */
    public final void mo68041a(ClusterButtonData clusterButtonData) {
        C7573i.m23587b(clusterButtonData, "cluster");
        List list = this.f67539l;
        List a = C26537z.m87235a(clusterButtonData);
        int indexOf = list.indexOf(clusterButtonData);
        if (indexOf >= 0) {
            list.remove(clusterButtonData);
            notifyItemRemoved(indexOf);
            list.addAll(indexOf, a);
            notifyItemRangeInserted(indexOf, a.size());
        }
    }

    /* renamed from: a */
    public final int mo68040a(Music music) {
        C7573i.m23587b(music, "music");
        if (C6307b.m19566a((Collection<T>) this.f67539l)) {
            return -1;
        }
        if (this.f69665e.f69901e >= 0) {
            return this.f69665e.f69901e;
        }
        int i = -1;
        for (SearchMusic searchMusic : this.f67539l) {
            if (music == searchMusic.getMusic()) {
                return i + 1;
            }
            if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue() && !C6307b.m19566a((Collection<T>) searchMusic.getMusicList())) {
                List musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    C7573i.m23580a();
                }
                if (music == ((Music) C7525m.m23511f(musicList))) {
                    return i + 1;
                }
            }
            C7573i.m23582a((Object) searchMusic, "searchMusic");
            if (!C26537z.m87236a(searchMusic)) {
                if (searchMusic.getCardType() == CardType.TYPE_MUSICIAN.getValue()) {
                    if (!C6307b.m19566a((Collection<T>) searchMusic.getMusicList())) {
                        List musicList2 = searchMusic.getMusicList();
                        if (musicList2 == null) {
                            C7573i.m23580a();
                        }
                        i += musicList2.size();
                    }
                    if (searchMusic.getHasMore()) {
                        i++;
                    }
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        boolean z;
        C7573i.m23587b(viewGroup, "parent");
        C1293v a_ = super.mo61886a_(viewGroup);
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean showMusicFeedbackEntrance = a.getShowMusicFeedbackEntrance();
            C7573i.m23582a((Object) showMusicFeedbackEntrance, "SettingsReader.get().showMusicFeedbackEntrance");
            z = showMusicFeedbackEntrance.booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = "";
            try {
                IESSettingsProxy a2 = C30199h.m98861a();
                C7573i.m23582a((Object) a2, "SettingsReader.get()");
                FeConfigCollection feConfigCollection = a2.getFeConfigCollection();
                C7573i.m23582a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
                FEConfig musicFaq = feConfigCollection.getMusicFaq();
                C7573i.m23582a((Object) musicFaq, "SettingsReader.get().feConfigCollection.musicFaq");
                T schema = musicFaq.getSchema();
                C7573i.m23582a((Object) schema, "SettingsReader.get().feC…ollection.musicFaq.schema");
                objectRef.element = schema;
            } catch (Exception unused2) {
            }
            SpannableString spannableString = new SpannableString(viewGroup.getContext().getString(R.string.dka));
            spannableString.setSpan(new C26447c(objectRef), 9, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(C0683b.m2912c(viewGroup.getContext(), R.color.a4p)), 9, spannableString.length(), 33);
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2x, null);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                textView.setText(spannableString, BufferType.SPANNABLE);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setTextColor(C0683b.m2912c(viewGroup.getContext(), R.color.a53));
                textView.setPadding(0, 20, 0, 0);
                View view = a_.itemView;
                if (view != null) {
                    DmtStatusView dmtStatusView = (DmtStatusView) view;
                    dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) textView));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
        }
        C7573i.m23582a((Object) a_, "superFooterHolder");
        return a_;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public SearchMusic mo29135a(int i, boolean z) {
        return (SearchMusic) C11555a.m34005a((C11554a<T>) this, i, z);
    }

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        switch (i) {
            case 17:
                return C26449a.m87017a(viewGroup, this);
            case 18:
                return C26461a.m87050a(viewGroup, this);
            default:
                if (C6399b.m19945u()) {
                    String str = this.f69666f;
                    C7573i.m23582a((Object) str, "mKeyword");
                    NewSearchMusicViewHolder a = C26494a.m87161a(viewGroup, str, this);
                    a.mo68117a("search_result");
                    a.mo67899b(this.f69665e);
                    return a;
                }
                String str2 = this.f69666f;
                C7573i.m23582a((Object) str2, "mKeyword");
                SearchMusicViewHolder a2 = C26456a.m87041a(viewGroup, str2, null, this);
                a2.mo68054a("search_result");
                a2.mo67899b(this.f69665e);
                return a2;
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        try {
            if (vVar instanceof SearchMusicViewHolder) {
                SearchMusicViewHolder searchMusicViewHolder = (SearchMusicViewHolder) vVar;
                Music music = ((SearchMusic) this.f67539l.get(i)).getMusic();
                String str = this.f69666f;
                C7573i.m23582a((Object) str, "mKeyword");
                searchMusicViewHolder.mo68053a(music, str);
            } else if (vVar instanceof NewSearchMusicViewHolder) {
                NewSearchMusicViewHolder newSearchMusicViewHolder = (NewSearchMusicViewHolder) vVar;
                Music music2 = ((SearchMusic) this.f67539l.get(i)).getMusic();
                String str2 = this.f69666f;
                C7573i.m23582a((Object) str2, "mKeyword");
                newSearchMusicViewHolder.mo68116a(music2, str2);
            } else if (vVar instanceof SearchMusicClusterViewHolder) {
                SearchMusicClusterViewHolder searchMusicClusterViewHolder = (SearchMusicClusterViewHolder) vVar;
                SearchMusic searchMusic = (SearchMusic) this.f67539l.get(i);
                String str3 = this.f69666f;
                C7573i.m23582a((Object) str3, "mKeyword");
                searchMusicClusterViewHolder.mo68045a(searchMusic, str3);
            } else if (vVar instanceof SearchMusicianCard) {
                SearchMusicianCard searchMusicianCard = (SearchMusicianCard) vVar;
                SearchMusic searchMusic2 = (SearchMusic) this.f67539l.get(i);
                String str4 = this.f69666f;
                C7573i.m23582a((Object) str4, "mKeyword");
                searchMusicianCard.mo68063a(searchMusic2, str4);
            } else {
                super.mo58033a(vVar, i);
            }
        } finally {
            vVar.itemView.post(C26446b.f69714a);
        }
    }

    public SearchMusicAdapter(MusicPlayHelper musicPlayHelper, C26501r rVar, String str) {
        C7573i.m23587b(rVar, "mobParam");
        C7573i.m23587b(str, "mKeyword");
        super(rVar, str);
        this.f69713j = musicPlayHelper;
        C11561b bVar = new C11561b(this, new SearchMusicAdapter$mDiffer$1(), null, 4, null);
        this.f69712i = bVar;
    }
}

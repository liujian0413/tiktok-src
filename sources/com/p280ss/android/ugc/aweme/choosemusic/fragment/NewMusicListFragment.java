package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p280ss.android.ugc.aweme.choosemusic.abtest.RefreshSearchViewHolderExperiment;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicSearchHistoryAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23851c;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23852d;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23880a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23969n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.music.adapter.C33743c;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.music.p1408b.C33768c;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33783c;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33951d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y.C34026a;
import com.p280ss.android.ugc.aweme.music.presenter.C33801c;
import com.p280ss.android.ugc.aweme.music.presenter.C33812l;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment */
public class NewMusicListFragment extends AmeBaseFragment implements C23844b, C6905a, C33743c, C33746f<C23822c>, C33801c, C33951d {

    /* renamed from: n */
    private static final String f63123n = "com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment";

    /* renamed from: e */
    public MusicAdapter f63124e;

    /* renamed from: f */
    protected C23880a f63125f;

    /* renamed from: g */
    public C23904b f63126g;

    /* renamed from: h */
    public int f63127h;

    /* renamed from: i */
    boolean f63128i = false;

    /* renamed from: j */
    String f63129j = "";

    /* renamed from: k */
    public C23905c f63130k;

    /* renamed from: l */
    public C23903a f63131l;

    /* renamed from: m */
    public OnClickListener f63132m;
    View mBackgroundView;
    public RecyclerView mListView;
    DmtStatusView mStatusView;

    /* renamed from: o */
    private String f63133o = "popular_song";

    /* renamed from: p */
    private String f63134p;

    /* renamed from: q */
    private int f63135q;

    /* renamed from: r */
    private C33812l f63136r;

    /* renamed from: s */
    private MusicSearchHistoryAdapter f63137s;

    /* renamed from: t */
    private MusicSearchStateViewModel f63138t;

    /* renamed from: u */
    private C23969n f63139u;

    /* renamed from: v */
    private boolean f63140v = true;

    /* renamed from: w */
    private List<MusicModel> f63141w = new ArrayList();

    /* renamed from: x */
    private boolean f63142x = false;

    /* renamed from: y */
    private MusicModel f63143y;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment$a */
    public interface C23903a {
        /* renamed from: a */
        void mo62061a();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment$b */
    public interface C23904b {
        /* renamed from: a */
        void mo62009a(int i, String str, MusicModel musicModel, String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment$c */
    public interface C23905c {
        /* renamed from: a */
        void mo62062a();
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo62046a(MusicCollectionItem musicCollectionItem) {
    }

    /* renamed from: a */
    public final void mo61994a(MusicModel musicModel, Exception exc) {
    }

    /* renamed from: f */
    public final MusicModel mo61999f() {
        return this.f63143y;
    }

    /* renamed from: a */
    public final void mo62048a(List<MusicModel> list, int i, boolean z) {
        if (this.f63124e != null && !z) {
            this.f63124e.al_();
        }
        if (isViewValid() && this.f63124e != null) {
            if (z) {
                this.f63124e.mo61577b(list);
            } else {
                this.f63124e.mo58045a(list);
            }
            if (this.mListView.getAdapter() != this.f63124e) {
                this.mListView.setAdapter(this.f63124e);
            }
            this.f63141w = list;
            this.f63127h = 2;
            if (C6311g.m19573a(list)) {
                mo62051e();
            } else {
                m78411r();
            }
            m78412s();
        }
    }

    /* renamed from: a */
    public final void mo61996a(String str, MusicModel musicModel, String str2) {
        if (this.f63131l != null) {
            this.f63126g.mo62009a(this.f63135q, str, musicModel, str2);
        }
    }

    /* renamed from: a */
    public final void mo62047a(Exception exc) {
        C6921a.m21559a((Throwable) exc);
    }

    /* renamed from: k */
    public final Activity mo62001k() {
        return getActivity();
    }

    /* renamed from: l */
    public final boolean mo62002l() {
        return isViewValid();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo62056o() {
        this.f63124e.mo61885a(false);
    }

    /* renamed from: s */
    private void m78412s() {
        if (this.f63139u != null) {
            this.f63139u.f63325d = true;
        }
    }

    /* renamed from: t */
    private void m78413t() {
        if (this.f63139u != null) {
            this.f63139u.f63325d = false;
        }
    }

    public final void bd_() {
        if (this.f63131l != null) {
            this.f63131l.mo62061a();
        }
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_library_list");
    }

    /* renamed from: m */
    public final void mo62054m() {
        if (this.f63124e != null) {
            this.f63124e.al_();
        }
    }

    /* renamed from: n */
    public final void mo62055n() {
        if (this.f63125f != null) {
            this.f63125f.mo61971a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mListView != null) {
            this.mListView.setAdapter(null);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo62055n();
        this.f63125f.mo61976d();
    }

    public void onResume() {
        super.onResume();
        if (this.f63125f != null) {
            this.f63125f.f88733m = false;
        }
    }

    /* renamed from: r */
    private void m78411r() {
        if (isViewValid()) {
            this.mStatusView.mo25939d();
            this.mListView.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo62050d() {
        if (isViewValid()) {
            this.mStatusView.mo25942f();
            this.mListView.setVisibility(4);
        }
    }

    /* renamed from: g */
    public final void mo62052g() {
        if (isViewValid()) {
            this.mStatusView.mo25944h();
            this.mListView.setVisibility(4);
        }
    }

    /* renamed from: j */
    public final void mo62053j() {
        if (isViewValid() && this.f63124e != null && this.mListView.getAdapter() == this.f63124e) {
            this.f63124e.ag_();
        }
    }

    /* renamed from: e */
    public final void mo62051e() {
        if (isViewValid()) {
            C6907h.m21524a("music_search_feedback_show", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").f60753a);
            this.mStatusView.mo25943g();
            this.mListView.setVisibility(4);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f63124e != null) {
            this.f63124e.al_();
        }
        if (this.f63125f != null) {
            this.f63125f.mo61971a();
            this.f63125f.f88733m = true;
        }
        C33783c.m108916a().pause();
    }

    /* renamed from: a */
    public final void mo62043a() {
        List list;
        this.mStatusView.mo25939d();
        mo62054m();
        m78413t();
        if (this.f63142x) {
            list = C23851c.m78120c().mo61933b();
        } else {
            list = C23852d.m78123c().mo61933b();
        }
        if (list == null || list.size() <= 0) {
            this.mListView.setVisibility(8);
            return;
        }
        this.mListView.setVisibility(0);
        if (this.f63137s == null) {
            this.f63137s = new MusicSearchHistoryAdapter(this.f63142x);
        }
        this.mListView.setAdapter(this.f63137s);
        this.f63137s.mo61897a(list);
    }

    /* renamed from: p */
    private void m78409p() {
        String str;
        this.f63124e = new MusicAdapter(this, this, true, this.f63142x);
        this.f63124e.f62925h = this.f63135q;
        this.mListView.setVisibility(8);
        this.f63124e.mo66516d(true);
        this.f63124e.f67550q = getResources().getColor(R.color.lz);
        this.f63124e.f67552s = "music_list";
        MusicAdapter musicAdapter = this.f63124e;
        if (this.f63142x) {
            str = "lyricsticker_song_search";
        } else {
            str = "search_music";
        }
        musicAdapter.f62922e = new C23819a(str, "", "", C23888c.m78180a());
        this.f63124e.f62918a = this;
        this.f63125f.mo61975c();
        this.f63125f.f88729i = new C23939o(this);
        this.f63125f.mo86672a(this.f63135q);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f63124e.mo66504a((C6905a) this);
        this.f63139u = new C23969n(new C23940p(this), 10);
        this.f63139u.f63325d = false;
        this.f63139u.mo62184a(this.mListView);
        this.f63136r = new C33812l(getActivity());
        this.f63136r.mo66537a(this);
        this.mStatusView.setBuilder(C10803a.m31631a(getContext()).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C23941q(this)).mo25963b(m78410q()).mo25965c(this.f63142x ? 1 : 0));
        this.mBackgroundView.setOnClickListener(new C23942r(this));
        mo62043a();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m78410q() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Exception -> 0x000e }
            java.lang.Boolean r0 = r0.getShowMusicFeedbackEntrance()     // Catch:{ Exception -> 0x000e }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x000e }
            r9.f63128i = r0     // Catch:{ Exception -> 0x000e }
        L_0x000e:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r1 = 2131824962(0x7f111142, float:1.9282767E38)
            r2 = 2131829151(0x7f11219f, float:1.9291263E38)
            if (r0 == 0) goto L_0x0040
            android.content.Context r0 = r9.getContext()
            com.bytedance.ies.dmt.ui.widget.MtEmptyView r0 = com.bytedance.ies.dmt.p262ui.widget.MtEmptyView.m31657a(r0)
            com.bytedance.ies.dmt.ui.widget.b$a r3 = new com.bytedance.ies.dmt.ui.widget.b$a
            android.content.Context r4 = r9.getContext()
            r3.<init>(r4)
            com.bytedance.ies.dmt.ui.widget.b$a r2 = r3.mo25990b(r2)
            com.bytedance.ies.dmt.ui.widget.b$a r1 = r2.mo25993c(r1)
            r2 = 2131232974(0x7f0808ce, float:1.8082072E38)
            com.bytedance.ies.dmt.ui.widget.b$a r1 = r1.mo25985a(r2)
            com.bytedance.ies.dmt.ui.widget.b r1 = r1.f29135a
            r0.setStatus(r1)
            return r0
        L_0x0040:
            boolean r0 = r9.f63128i
            r3 = 0
            r4 = 2131822313(0x7f1106e9, float:1.9277394E38)
            r5 = 33
            if (r0 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Exception -> 0x005c }
            com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection r0 = r0.getFeConfigCollection()     // Catch:{ Exception -> 0x005c }
            com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig r0 = r0.getMusicFaq()     // Catch:{ Exception -> 0x005c }
            java.lang.String r0 = r0.getSchema()     // Catch:{ Exception -> 0x005c }
            r9.f63129j = r0     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            android.text.SpannableString r0 = new android.text.SpannableString
            android.content.Context r1 = r9.getContext()
            r6 = 2131826431(0x7f1116ff, float:1.9285746E38)
            java.lang.String r1 = r1.getString(r6)
            r0.<init>(r1)
            com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment$2 r1 = new com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment$2
            r1.<init>()
            int r6 = r0.length()
            r7 = 8
            r0.setSpan(r1, r7, r6, r5)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            android.content.Context r6 = r9.getContext()
            r8 = 2131100811(0x7f06048b, float:1.7814014E38)
            int r6 = android.support.p022v4.content.C0683b.m2912c(r6, r8)
            r1.<init>(r6)
            int r6 = r0.length()
            r0.setSpan(r1, r7, r6, r5)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            android.content.Context r6 = r9.getContext()
            r7 = 2131100366(0x7f0602ce, float:1.7813111E38)
            int r6 = android.support.p022v4.content.C0683b.m2912c(r6, r7)
            r1.<init>(r6)
            r6 = 9
            r0.setSpan(r1, r3, r6, r5)
            com.bytedance.ies.dmt.ui.widget.DmtDefaultView r1 = new com.bytedance.ies.dmt.ui.widget.DmtDefaultView
            android.content.Context r3 = r9.getContext()
            r1.<init>(r3)
            com.bytedance.ies.dmt.ui.widget.b$a r3 = new com.bytedance.ies.dmt.ui.widget.b$a
            android.content.Context r5 = r9.getContext()
            r3.<init>(r5)
            com.bytedance.ies.dmt.ui.widget.b$a r2 = r3.mo25990b(r2)
            boolean r3 = r9.f63142x
            r3 = r3 ^ 1
            com.bytedance.ies.dmt.ui.widget.b$a r2 = r2.mo25989a(r3)
            boolean r3 = r9.f63142x
            if (r3 == 0) goto L_0x00d0
            android.content.Context r0 = r9.getContext()
            java.lang.String r0 = r0.getString(r4)
        L_0x00d0:
            com.bytedance.ies.dmt.ui.widget.b$a r0 = r2.mo25987a(r0)
            com.bytedance.ies.dmt.ui.widget.b r0 = r0.f29135a
            r1.setStatus(r0)
            return r1
        L_0x00da:
            android.content.Context r0 = r9.getContext()
            java.lang.String r0 = r0.getString(r4)
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            android.content.Context r6 = r9.getContext()
            r7 = 2131100824(0x7f060498, float:1.781404E38)
            int r6 = android.support.p022v4.content.C0683b.m2912c(r6, r7)
            r0.<init>(r6)
            int r6 = r4.length()
            r4.setSpan(r0, r3, r6, r5)
            com.bytedance.ies.dmt.ui.widget.DmtDefaultView r0 = new com.bytedance.ies.dmt.ui.widget.DmtDefaultView
            android.content.Context r3 = r9.getContext()
            r0.<init>(r3)
            com.bytedance.ies.dmt.ui.widget.b$a r3 = new com.bytedance.ies.dmt.ui.widget.b$a
            android.content.Context r5 = r9.getContext()
            r3.<init>(r5)
            com.bytedance.ies.dmt.ui.widget.b$a r2 = r3.mo25990b(r2)
            boolean r3 = r9.f63142x
            if (r3 == 0) goto L_0x0119
            goto L_0x0121
        L_0x0119:
            android.content.Context r3 = r9.getContext()
            java.lang.String r4 = r3.getString(r1)
        L_0x0121:
            com.bytedance.ies.dmt.ui.widget.b$a r1 = r2.mo25987a(r4)
            com.bytedance.ies.dmt.ui.widget.b r1 = r1.f29135a
            r0.setStatus(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment.m78410q():android.view.View");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62045a(View view) {
        if (!this.mStatusView.mo25945i()) {
            this.f63132m.onClick(view);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo62049b(View view) {
        if (this.f63130k != null) {
            this.f63130k.mo62062a();
        }
    }

    /* renamed from: b */
    public final void mo61923b(MusicModel musicModel) {
        this.f63125f.f88730j = this.f63133o;
        this.f63125f.mo86680b(musicModel, this.f63127h);
    }

    @C7709l(mo20401b = true)
    public void onMobMusicTypeEvent(C33768c cVar) {
        String str = cVar.f88123a;
        if (str == null) {
            this.f63133o = this.f63134p;
        } else if (this.f63134p == null) {
            this.f63133o = str;
            this.f63134p = this.f63133o;
        } else {
            this.f63134p = this.f63133o;
            this.f63133o = str;
        }
    }

    /* renamed from: a */
    public final void mo61920a(C34026a aVar) {
        this.f63125f.f88729i = aVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63138t = (MusicSearchStateViewModel) C0069x.m159a(getActivity()).mo147a(MusicSearchStateViewModel.class);
        this.f63138t.mo61861a().observe(this, new C0053p<Integer>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Integer num) {
                if (num != null) {
                    switch (num.intValue()) {
                        case 0:
                        case 2:
                            return;
                        case 1:
                            NewMusicListFragment.this.mo62043a();
                            break;
                    }
                }
            }
        });
    }

    @C7709l(mo20401b = true)
    public void onMusicCollectEvent(C33769d dVar) {
        CollectionType collectionType;
        if (C6384b.m19835a().mo15292a(RefreshSearchViewHolderExperiment.class, true, "refresh_music_search_view_holder", C6384b.m19835a().mo15295d().refresh_music_search_view_holder, false)) {
            MusicModel musicModel = dVar.f88125b;
            if (musicModel != null && !C6307b.m19566a((Collection<T>) this.f63141w)) {
                MusicModel a = C23889d.m78216a(this.f63141w, musicModel.getMusicId());
                if (a != null) {
                    if (dVar.f88124a == 1) {
                        collectionType = CollectionType.COLLECTED;
                    } else {
                        collectionType = CollectionType.NOT_COLLECTED;
                    }
                    a.setCollectionType(collectionType);
                    int indexOf = this.f63141w.indexOf(a);
                    MusicAdapter musicAdapter = this.f63124e;
                    if (musicAdapter != null && indexOf >= 0 && indexOf < this.f63141w.size()) {
                        musicAdapter.notifyItemChanged(indexOf);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo61995a(C23822c cVar) {
        String str;
        String str2;
        String str3 = cVar.f62885b;
        MusicModel musicModel = cVar.f62884a;
        if (musicModel != null) {
            FragmentActivity activity = getActivity();
            if (activity != null && "upload_local_music".equals(str3)) {
                Intent intent = new Intent();
                String str4 = "local_music_name";
                if (cVar.f62884a == null) {
                    str = "";
                } else {
                    str = cVar.f62884a.getName();
                }
                intent.putExtra(str4, str);
                String str5 = "local_music_path";
                if (cVar.f62884a == null) {
                    str2 = "";
                } else {
                    str2 = cVar.f62884a.getPath();
                }
                intent.putExtra(str5, str2);
                activity.setResult(-1, intent);
                activity.finish();
            } else if ("follow_type".equals(str3)) {
                this.f63136r.mo56976a(Integer.valueOf(1), musicModel.getMusicId(), Integer.valueOf(1));
            } else {
                if ("unfollow_type".equals(str3)) {
                    this.f63136r.mo56976a(Integer.valueOf(1), musicModel.getMusicId(), Integer.valueOf(0));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61921a(MusicModel musicModel) {
        mo62055n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62044a(int i, int i2) {
        bd_();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m78409p();
    }

    /* renamed from: a */
    public final void mo61922a(MusicModel musicModel, C23819a aVar) {
        this.f63143y = musicModel;
        if (this.f63140v) {
            this.f63125f.f63023c = aVar;
            this.f63125f.mo86674a(musicModel, this.f63127h);
            return;
        }
        this.f63125f.mo86680b(musicModel, this.f63127h);
    }

    /* renamed from: a */
    public static NewMusicListFragment m78407a(int i, Style style, boolean z) {
        NewMusicListFragment newMusicListFragment = new NewMusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle.putSerializable("music_style", style);
        bundle.putBoolean("has_lyric", z);
        newMusicListFragment.setArguments(bundle);
        return newMusicListFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.p6, viewGroup, false);
        this.f63125f = new C23880a(this);
        if (getArguments() != null) {
            this.f63135q = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.f63142x = getArguments().getBoolean("has_lyric", false);
        } else {
            this.f63135q = 0;
        }
        return inflate;
    }
}

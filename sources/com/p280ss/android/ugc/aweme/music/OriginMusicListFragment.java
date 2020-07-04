package com.p280ss.android.ugc.aweme.music;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.view.C1156d;
import android.support.p029v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27748e;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.adapter.OriginMusicAdapter;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1408b.C33771f;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33951d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1412b.C33944a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36342b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.music.OriginMusicListFragment */
public class OriginMusicListFragment extends ProfileListFragment implements C6905a, C25675c<Music>, C25766a, C27746c, C27748e, C33951d {

    /* renamed from: e */
    public C36342b f87866e;

    /* renamed from: f */
    protected C34018y f87867f;

    /* renamed from: g */
    public boolean f87868g = true;

    /* renamed from: h */
    public C25674b f87869h;

    /* renamed from: i */
    public String f87870i;

    /* renamed from: j */
    public String f87871j = "";

    /* renamed from: k */
    protected ViewStub f87872k;

    /* renamed from: l */
    protected View f87873l;

    /* renamed from: m */
    protected boolean f87874m;
    public RecyclerView mListView;
    DmtStatusView mStatusView;

    /* renamed from: n */
    private String f87875n = "popular_song";

    /* renamed from: o */
    private OriginMusicAdapter f87876o;

    /* renamed from: p */
    private MusicModel f87877p;

    /* renamed from: q */
    private C27743a f87878q;

    /* renamed from: r */
    private int f87879r = 7;

    /* renamed from: s */
    private boolean f87880s = true;

    /* renamed from: t */
    private boolean f87881t;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo61803a(BaseResponse baseResponse) {
    }

    /* renamed from: a */
    public final void mo61994a(MusicModel musicModel, Exception exc) {
    }

    public final void aE_() {
    }

    public final boolean aO_() {
        return this.f87880s;
    }

    public final void aT_() {
    }

    public final void bd_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<Music> list, boolean z) {
    }

    /* renamed from: f */
    public final MusicModel mo61999f() {
        return this.f87877p;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo59099a(List<Music> list, boolean z) {
        if (isViewValid()) {
            this.mStatusView.mo25939d();
            this.mStatusView.mo25950n();
            this.f87876o.ai_();
            m108625a(list);
            this.f87876o.mo66516d(true);
        }
    }

    /* renamed from: a */
    public final void mo65501a(String str, String str2) {
        this.f87870i = str;
    }

    /* renamed from: k */
    public final Activity mo62001k() {
        return getActivity();
    }

    /* renamed from: l */
    public final boolean mo62002l() {
        return isViewValid();
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo86065g();
    }

    public void onPause() {
        super.onPause();
        m108630o();
    }

    public final void aD_() {
        if (isViewValid()) {
            this.f87876o.ag_();
        }
    }

    /* renamed from: g */
    public final void mo86065g() {
        if (this.f87867f != null) {
            this.f87867f.mo61971a();
        }
    }

    /* renamed from: j */
    public final View mo61750j() {
        if (!isViewValid()) {
            return null;
        }
        return this.mListView;
    }

    public void onResume() {
        super.onResume();
        this.f87867f.f88733m = false;
    }

    /* renamed from: o */
    private void m108630o() {
        if (this.f87876o != null) {
            this.f87876o.mo86155a();
        }
        if (this.f87867f != null) {
            this.f87867f.mo61971a();
            this.f87867f.f88733m = true;
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid()) {
            this.f87873l.setVisibility(4);
            this.mStatusView.mo25942f();
        }
    }

    public final void aQ_() {
        if (this.mStatusView == null || (!this.f87874m && !TimeLockRuler.isTeenModeON())) {
            m108629n();
            return;
        }
        this.mStatusView.setVisibility(4);
        this.f87873l.setVisibility(0);
    }

    public final void aS_() {
        if (isViewValid() && this.mListView.getChildCount() > 0) {
            this.mListView.mo5561d(0);
        }
    }

    public final void ae_() {
        if (isViewValid()) {
            this.f87873l.setVisibility(4);
            this.mStatusView.mo25943g();
            if (this.f87866e != null && C6399b.m19944t()) {
                this.f87866e.bC_();
            }
        }
    }

    /* renamed from: n */
    private void m108629n() {
        if (isViewValid() && !TimeLockRuler.isTeenModeON() && getActivity() != null) {
            if (!C33792f.m108955a(getActivity())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                this.mStatusView.mo25944h();
                this.f87880s = true;
                return;
            }
            if (this.f87869h != null && !TextUtils.isEmpty(this.f87870i)) {
                this.f87869h.mo56976a(Integer.valueOf(1), this.f87870i);
                this.f87880s = false;
            }
        }
    }

    /* renamed from: p */
    private void m108631p() {
        int i;
        if (getContext() != null) {
            C10803a a = C10803a.m31631a(getContext());
            try {
                DmtTextView b = m108626b((int) R.string.c48);
                b.setOnClickListener(new C33791e(this));
                if (!C6399b.m19944t()) {
                    if (this.f87881t) {
                        i = R.string.cmn;
                    } else {
                        i = R.string.cmm;
                    }
                    a.mo25963b((View) m108626b(i)).mo25966c((View) b);
                } else {
                    a.mo25963b((View) m108627d(this.f87881t)).mo25966c((View) b);
                    int b2 = (int) C9738o.m28708b(getContext(), 24.0f);
                    this.mStatusView.setPadding(b2, 0, b2, 0);
                }
            } catch (Exception unused) {
            }
            this.mStatusView.setBuilder(a);
        }
    }

    /* renamed from: m */
    private void m108628m() {
        Bundle arguments = getArguments();
        this.f87870i = arguments.getString("user_id");
        this.f87881t = arguments.getBoolean("is_me", false);
        m108631p();
        this.f87869h = new C25674b();
        this.f87869h.mo66536a(new C33944a());
        this.f87869h.mo66537a(this);
        this.f87878q = new C27743a();
        this.f87878q.mo66537a(this);
        this.f87876o = new OriginMusicAdapter(this, this.f87870i, this.f95165P);
        this.f87876o.mo66516d(true);
        this.f87867f.mo61975c();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f87876o.mo66504a((C6905a) this);
        this.mListView.setAdapter(this.f87876o);
        this.f87876o.mo86156a((List<MusicModel>) new ArrayList<MusicModel>());
        if (!C33792f.m108955a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
        } else if (this.f95163N) {
            m108629n();
        }
        this.f87876o.mo66516d(true);
        this.f87876o.mo66504a((C6905a) new C6905a() {
            public final void bd_() {
                if (OriginMusicListFragment.this.f87869h != null && !TextUtils.isEmpty(OriginMusicListFragment.this.f87870i)) {
                    OriginMusicListFragment.this.f87869h.mo56976a(Integer.valueOf(4), OriginMusicListFragment.this.f87870i);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86062a(View view) {
        m108629n();
    }

    /* renamed from: c_ */
    public final void mo86064c_(boolean z) {
        this.f87874m = z;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @C7709l
    public void onEvent(C33771f fVar) {
        mo86065g();
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.f87880s = true;
            this.mStatusView.mo25944h();
        }
    }

    /* renamed from: b */
    public final void mo71229b(MusicModel musicModel) {
        super.onPause();
        if (this.f87867f != null) {
            this.f87867f.mo61971a();
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            m108630o();
        } else {
            this.f87867f.f88733m = false;
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            this.f87876o.mo66508i();
        }
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v1/original/music/list/?")) {
            C42961az.m136385f(aVar);
            m108629n();
        }
    }

    /* renamed from: a */
    private void m108625a(List<Music> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Music music : list) {
                if (music != null) {
                    arrayList.add(music.convertToMusicModel());
                }
            }
            this.mListView.setVisibility(0);
            this.f87876o.mo86156a((List<MusicModel>) arrayList);
        }
    }

    /* renamed from: b */
    private DmtTextView m108626b(int i) {
        DmtTextView dmtTextView = new DmtTextView(new C1156d(getContext(), R.style.ss));
        dmtTextView.setTextColor(getContext().getResources().getColor(R.color.a51));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    /* renamed from: a */
    public final void mo71227a(MusicModel musicModel) {
        if (musicModel != null) {
            this.f87877p = musicModel;
            if (this.f87868g) {
                this.f87867f.mo86674a(musicModel, this.f87879r);
            } else {
                this.f87867f.mo86680b(musicModel, this.f87879r);
            }
        }
    }

    @C7709l
    public void onMusicCollect(C33769d dVar) {
        if (dVar != null && dVar.f88125b != null) {
            if (1 == dVar.f88124a) {
                this.f87878q.mo56976a(Integer.valueOf(1), dVar.f88125b.getMusicId(), Integer.valueOf(1));
                return;
            }
            if (dVar.f88124a == 0) {
                this.f87878q.mo56976a(Integer.valueOf(1), dVar.f88125b.getMusicId(), Integer.valueOf(0));
            }
        }
    }

    /* renamed from: d */
    private DmtTextView m108627d(boolean z) {
        int i;
        String str;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        DmtTextView dmtTextView = new DmtTextView(new C1156d(context, R.style.ss));
        if (z) {
            i = R.string.cj5;
        } else {
            i = R.string.crv;
        }
        String string = getString(i);
        if (z) {
            str = getString(R.string.cj4);
        } else {
            StringBuilder sb = new StringBuilder("@");
            sb.append(this.f87871j);
            str = getString(R.string.cru, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("\n");
        sb2.append(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, string.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.a4z)), 0, string.length(), 18);
        dmtTextView.setTextColor(context.getResources().getColor(R.color.a51));
        dmtTextView.setGravity(17);
        dmtTextView.setText(spannableStringBuilder);
        dmtTextView.setLineSpacing(C9738o.m28708b(context, 12.0f), 1.0f);
        return dmtTextView;
    }

    /* renamed from: a */
    public final void mo61805a(Exception exc) {
        C6921a.m21559a((Throwable) exc);
    }

    /* renamed from: a */
    public final void mo86063a(String str) {
        this.f87870i = str;
        m108629n();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m108628m();
    }

    /* renamed from: a */
    public static OriginMusicListFragment m108624a(String str, boolean z) {
        OriginMusicListFragment originMusicListFragment = new OriginMusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putBoolean("is_me", z);
        originMusicListFragment.setArguments(bundle);
        return originMusicListFragment;
    }

    /* renamed from: b */
    public final void mo59108b(List<Music> list, boolean z) {
        if (isViewValid()) {
            if (z) {
                this.f87876o.ai_();
            } else {
                this.f87876o.ah_();
            }
            if (!C7213d.m22500a().mo18803bo().useRecyclerPartialUpdate) {
                m108625a(list);
            } else if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Music music : list) {
                    if (music != null) {
                        arrayList.add(music.convertToMusicModel());
                    }
                }
                this.mListView.setVisibility(0);
                this.f87876o.mo86157b(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo71228a(MusicModel musicModel, int i) {
        this.f87867f.f88730j = this.f87875n;
        this.f87867f.f88732l = i;
        this.f87867f.mo86680b(musicModel, this.f87879r);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ag_, viewGroup, false);
        this.f87867f = new C34018y(this);
        this.f87872k = (ViewStub) inflate.findViewById(R.id.dcm);
        this.f87873l = this.f87872k.inflate();
        if (TimeLockRuler.isTeenModeON()) {
            ((TextView) this.f87873l.findViewById(R.id.title)).setText(R.string.e6j);
            ((TextView) this.f87873l.findViewById(R.id.a1q)).setText(R.string.e69);
        }
        this.f87873l.setVisibility(4);
        return inflate;
    }

    /* renamed from: a */
    public final void mo61996a(String str, MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(musicModel.getMusic().getChallenge());
        }
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
    }
}

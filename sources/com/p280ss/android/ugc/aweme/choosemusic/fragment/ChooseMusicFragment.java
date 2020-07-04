package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0610b;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p280ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.p280ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment.C23904b;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23821b;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23823d;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23851c;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23852d;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23876v;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.view.ChooseMusicFragmentView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.experiment.SearchSugCompletionExperiment;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33767b;
import com.p280ss.android.ugc.aweme.music.p1408b.C33768c;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicRecommendActivity;
import com.p280ss.android.ugc.aweme.music.presenter.C33804f;
import com.p280ss.android.ugc.aweme.music.presenter.C33829s;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment */
public class ChooseMusicFragment extends AmeBaseFragment implements C0610b, OnClickListener, OnEditorActionListener, C6310a, C23904b, C33804f {

    /* renamed from: A */
    private boolean f63058A;

    /* renamed from: B */
    private boolean f63059B;

    /* renamed from: C */
    private boolean f63060C;

    /* renamed from: D */
    private C23876v f63061D;

    /* renamed from: e */
    public NewMusicTabFragment f63062e;

    /* renamed from: f */
    public boolean f63063f;

    /* renamed from: g */
    ChooseMusicFragmentView f63064g;

    /* renamed from: h */
    public View f63065h;

    /* renamed from: i */
    public C6309f f63066i = new C6309f(this);

    /* renamed from: j */
    public String f63067j;

    /* renamed from: k */
    public String f63068k;

    /* renamed from: l */
    public MusicSearchStateViewModel f63069l;

    /* renamed from: m */
    public String f63070m;

    /* renamed from: n */
    public String f63071n;

    /* renamed from: o */
    TextWatcher f63072o = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            ChooseMusicFragment.this.f63070m = obj;
            if (!TextUtils.equals(ChooseMusicFragment.this.f63071n, obj)) {
                ChooseMusicFragment.this.f63071n = obj;
                if (TextUtils.isEmpty(obj)) {
                    ChooseMusicFragment.this.f63064g.mo62130d();
                    ChooseMusicFragment.this.mo62014e();
                } else if (ChooseMusicFragment.this.f63069l.mo61865e() != 0) {
                    if (C6399b.m19944t()) {
                        ChooseMusicFragment.this.f63064g.mo62129c();
                    }
                    if (!C6399b.m19944t() || !C33703a.m108719c()) {
                        ChooseMusicFragment.this.mo62015f();
                        return;
                    }
                    ChooseMusicFragment.this.f63066i.removeMessages(1);
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = obj;
                    ChooseMusicFragment.this.f63066i.sendMessageDelayed(obtain, 200);
                }
            }
        }
    };

    /* renamed from: p */
    private C33829s f63073p;

    /* renamed from: q */
    private int f63074q;

    /* renamed from: r */
    private String f63075r;

    /* renamed from: s */
    private Style f63076s;

    /* renamed from: t */
    private TextView f63077t;

    /* renamed from: u */
    private View f63078u;

    /* renamed from: v */
    private Music f63079v;

    /* renamed from: w */
    private String f63080w;

    /* renamed from: x */
    private String f63081x;

    /* renamed from: y */
    private boolean f63082y;

    /* renamed from: z */
    private MusicModel f63083z;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: j */
    private void m78263j() {
        this.f63073p = new C33829s(this);
    }

    /* renamed from: m */
    private NewMusicListFragment m78266m() {
        return (NewMusicListFragment) getChildFragmentManager().mo2642a((int) R.id.a25);
    }

    /* renamed from: n */
    private void m78267n() {
        if (this.f63073p != null) {
            this.f63073p.mo86443b();
        }
    }

    /* renamed from: e */
    public final void mo62014e() {
        this.f63069l.mo61861a().setValue(Integer.valueOf(1));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo62017i() {
        m78260a(this.f63064g.mo62132f());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f63066i.removeCallbacksAndMessages(null);
    }

    public void onDestroyView() {
        getChildFragmentManager().mo2653b(this);
        super.onDestroyView();
        m78267n();
    }

    public void dismiss() {
        this.f63063f = false;
        this.f63064g.mo62133g();
        C42961az.m136380a(new C33767b(true));
        NewMusicListFragment newMusicListFragment = (NewMusicListFragment) getChildFragmentManager().mo2642a((int) R.id.a25);
        if (newMusicListFragment != null) {
            newMusicListFragment.mo62055n();
        }
        try {
            getChildFragmentManager().mo2656d();
        } catch (Exception unused) {
        }
        C42961az.m136381b(new C33768c(null));
    }

    /* renamed from: f */
    public final void mo62015f() {
        if (!this.f63059B && !C6399b.m19944t() && C6384b.m19835a().mo15292a(SearchSugCompletionExperiment.class, true, "search_sug_completion", C6384b.m19835a().mo15295d().search_sug_completion, false)) {
            this.f63069l.mo61862b().setValue(this.f63070m);
            this.f63069l.mo61861a().setValue(Integer.valueOf(2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo62016g() {
        if (isViewValid() && this.f63073p.mo86442a()) {
            NewMusicListFragment m = m78266m();
            if (m != null) {
                m.mo62053j();
            }
            this.f63073p.mo86440a("video_music", this.f63059B);
        }
    }

    /* renamed from: k */
    private void m78264k() {
        C0608j childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo2642a((int) R.id.a26);
        if (a != null) {
            this.f63062e = (NewMusicTabFragment) a;
            return;
        }
        this.f63062e = NewMusicTabFragment.m78448a(this.f63074q, this.f63075r, this.f63079v, this.f63080w, this.f63081x, this.f63082y, this.f63059B, this.f63060C);
        this.f63062e.mo62064a(0);
        if (this.f63083z != null && this.f63083z.isMvThemeMusic()) {
            this.f63062e.mo62069a(true);
        }
        C0633q a2 = childFragmentManager.mo2645a();
        a2.mo2585a((int) R.id.a26, (Fragment) this.f63062e);
        a2.mo2606d();
    }

    /* renamed from: l */
    private void m78265l() {
        this.f63063f = true;
        C0608j childFragmentManager = getChildFragmentManager();
        NewMusicListFragment newMusicListFragment = (NewMusicListFragment) childFragmentManager.mo2642a((int) R.id.a25);
        if (newMusicListFragment == null) {
            newMusicListFragment = NewMusicListFragment.m78407a(this.f63074q, this.f63076s, this.f63059B);
            newMusicListFragment.f63127h = 2;
            newMusicListFragment.f63132m = new C23925a(this);
            newMusicListFragment.f63130k = new C23926b(this);
            C0633q a = childFragmentManager.mo2645a();
            a.mo2586a(R.id.a25, newMusicListFragment, "search_result_list_tag");
            a.mo2589a((String) null);
            a.mo2606d();
        }
        newMusicListFragment.f63131l = new C23927c(this);
        newMusicListFragment.f63126g = this;
    }

    /* renamed from: d */
    public final void mo62012d() {
        if (getActivity() != null && this.f63058A) {
            final AVMusic curMusic = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic();
            if (curMusic != null) {
                this.f63065h.setVisibility(0);
                this.f63077t.setText(getActivity().getString(R.string.a3t, new Object[]{curMusic.getMusicName()}));
                this.f63078u.setOnClickListener(new OnClickListener() {
                    /* renamed from: a */
                    private void m78278a() {
                        FragmentActivity activity = ChooseMusicFragment.this.getActivity();
                        if (activity instanceof ChooseMusicActivity) {
                            ((ChooseMusicActivity) activity).f62890b = true;
                        }
                    }

                    /* renamed from: b */
                    private void m78279b() {
                        ChooseMusicFragment.this.f63065h.setClickable(false);
                        Animation loadAnimation = AnimationUtils.loadAnimation(ChooseMusicFragment.this.getContext(), R.anim.ah);
                        loadAnimation.setAnimationListener(new AnimationListener() {
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                ChooseMusicFragment.this.f63065h.setVisibility(8);
                            }
                        });
                        ChooseMusicFragment.this.f63065h.startAnimation(loadAnimation);
                    }

                    /* renamed from: c */
                    private void m78280c() {
                        C6907h.m21524a("unselect_music", (Map) C22984d.m75611a().mo59973a("creation_id", ChooseMusicFragment.this.f63067j).mo59973a("enter_from", "change_music_page").mo59973a("shoot_way", ChooseMusicFragment.this.f63068k).mo59973a("music_id", curMusic.getMusicId()).f60753a);
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        m78278a();
                        m78279b();
                        m78280c();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo2671a() {
        this.f63064g.mo62122a(getChildFragmentManager().mo2642a((int) R.id.a25));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62010a(View view) {
        dismiss();
    }

    /* renamed from: a */
    private void m78260a(String str) {
        KeyboardUtils.m77057c(this.f63078u);
        m78261a(str, false);
    }

    @C7709l
    public void onSugCompletionEvent(C23823d dVar) {
        if (!(!isViewValid() || dVar == null || this.f63064g == null)) {
            this.f63064g.mo62125a((CharSequence) dVar.f62888a);
            this.f63064g.mo62131e();
        }
    }

    /* renamed from: b */
    private void m78262b(View view) {
        if (this.f63058A) {
            this.f63065h = view.findViewById(R.id.su);
            this.f63077t = (TextView) view.findViewById(R.id.a5g);
            this.f63078u = view.findViewById(R.id.sv);
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 1) {
            m78259a(new C23876v().mo61964a(1).mo61967b("normal_search").mo61965a((String) message.obj).mo61966a(true));
        }
    }

    @C7709l
    public void onInnerMusicSearchEvent(C23821b bVar) {
        if (isViewValid() && bVar != null) {
            m78259a(bVar.f62883a);
            if (this.f63059B && bVar.f62883a.f63014b == 2) {
                C23888c.m78190a(bVar.f62883a.f63015c, "history");
            }
        }
    }

    /* renamed from: a */
    private void m78259a(C23876v vVar) {
        if (isViewValid() && vVar != null && !TextUtils.isEmpty(vVar.f63015c)) {
            this.f63061D = vVar;
            this.f63069l.mo61863c().setValue(vVar);
            this.f63069l.mo61861a().setValue(Integer.valueOf(0));
            if (this.f63064g != null) {
                this.f63064g.mo62125a((CharSequence) vVar.f63015c);
            }
            NewMusicListFragment m = m78266m();
            if (!vVar.f63016d) {
                KeyboardUtils.m77057c(this.f63078u);
                if (m != null) {
                    m.mo62050d();
                }
                if (this.f63059B) {
                    C23851c.m78120c().mo61932b(new MusicSearchHistory(vVar.f63015c));
                } else {
                    C23852d.m78123c().mo61932b(new MusicSearchHistory(vVar.f63015c));
                }
            }
            if (m != null) {
                m.mo62054m();
            }
            this.f63073p.mo86439a(vVar.f63015c, "video_music", this.f63059B);
            C42961az.m136381b(new C33768c("search_result"));
            C23888c.m78203c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f63074q = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.f63075r = getArguments().getString("challenge");
            this.f63067j = getArguments().getString("creation_id");
            this.f63068k = getArguments().getString("shoot_way");
            this.f63076s = (Style) getArguments().getSerializable("music_style");
            this.f63079v = (Music) getArguments().getSerializable("sticker_music");
            this.f63080w = getArguments().getString("first_sticker_music_ids", null);
            this.f63082y = getArguments().getBoolean("is_busi_sticker", false);
            this.f63081x = getArguments().getString("first_sticker_id", null);
            this.f63083z = (MusicModel) getArguments().getSerializable("music_model");
            this.f63058A = getArguments().getBoolean("music_allow_clear", false);
            this.f63059B = getArguments().getBoolean("has_lyric", false);
            this.f63060C = getArguments().getBoolean("show_lyric_tip", false);
        }
        this.f63069l = (MusicSearchStateViewModel) C0069x.m159a(getActivity()).mo147a(MusicSearchStateViewModel.class);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.cux) {
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isChildrenMode()) {
                C10761a.m31409e(getContext(), (int) R.string.a3c).mo25750a();
                return;
            }
            m78265l();
            this.f63064g.mo62131e();
            this.f63064g.mo62128b();
            this.f63062e.mo62075m();
        } else if (view.getId() == R.id.e1a) {
            m78259a(new C23876v().mo61965a(this.f63070m).mo61967b("normal_search").mo61964a(1));
            if (this.f63059B) {
                C23888c.m78190a(this.f63064g.mo62132f(), "new");
            }
        } else if (view.getId() == R.id.e1c) {
            dismiss();
        } else {
            if (view.getId() != R.id.cuz) {
                if (view.getId() == R.id.jo) {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                } else if (view.getId() == R.id.d7k) {
                    FragmentActivity activity2 = getActivity();
                    if (this.f63074q == 0) {
                        activity2.onBackPressed();
                        return;
                    }
                    C19282c.m63182a(getActivity(), "music_skip", "music_library");
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
                    if (activity2 != null) {
                        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity2, new Intent());
                    }
                } else if (view.getId() == R.id.x0) {
                    FragmentActivity activity3 = getActivity();
                    if (activity3 != null) {
                        C22477b.m74364a(activity3, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23928d(activity3));
                    }
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m78263j();
        m78264k();
        m78262b(view);
        getChildFragmentManager().mo2650a((C0610b) this);
        this.f63064g.mo62121a();
    }

    /* renamed from: a */
    private void m78261a(String str, boolean z) {
        if (getActivity() != null && !C6319n.m19593a(str)) {
            this.f63069l.mo61861a().setValue(Integer.valueOf(0));
            NewMusicListFragment m = m78266m();
            if (m != null) {
                m78266m().mo62050d();
            }
            if (this.f63059B) {
                C23851c.m78120c().mo61932b(new MusicSearchHistory(str));
            } else {
                C23852d.m78123c().mo61932b(new MusicSearchHistory(str));
            }
            if (m != null) {
                m.mo62054m();
            }
            this.f63073p.mo86439a(str, "video_music", this.f63059B);
            C42961az.m136381b(new C33768c("search_result"));
            C23888c.m78203c();
        }
    }

    /* renamed from: a */
    public final void mo62011a(List<MusicModel> list, boolean z) {
        String str;
        String str2;
        Object obj;
        if (isViewValid() && !TextUtils.isEmpty(this.f63064g.mo62132f()) && this.f63069l.mo61865e() == 0) {
            NewMusicListFragment m = m78266m();
            if (list != null) {
                if (!z) {
                    String str3 = "search_music";
                    C22984d a = C22984d.m75611a().mo59973a("search_type", "music");
                    String str4 = "enter_method";
                    if (this.f63061D != null) {
                        str = this.f63061D.f63013a;
                    } else {
                        str = "normal_search";
                    }
                    C22984d a2 = a.mo59973a(str4, str).mo59973a("search_keyword", this.f63064g.mo62135i()).mo59973a("creation_id", this.f63067j);
                    String str5 = "enter_from";
                    if (this.f63074q == 0) {
                        str2 = "video_edit_page";
                    } else {
                        str2 = "video_shoot_page";
                    }
                    C22984d a3 = a2.mo59973a(str5, str2).mo59973a("trigger_reason", "cold_launch");
                    String str6 = "log_pb";
                    if (C6307b.m19566a((Collection<T>) list)) {
                        obj = "";
                    } else {
                        obj = ((MusicModel) list.get(0)).getLogPb();
                    }
                    C6907h.m21524a(str3, (Map) a3.mo59972a(str6, obj).f60753a);
                }
                if (list.size() > 0) {
                    for (MusicModel musicModel : list) {
                        musicModel.setDataType(1);
                        if (musicModel.getMusic() == null) {
                            musicModel.setMusic(musicModel.convertToMusic());
                        }
                    }
                    if (!(m == null || m.f63124e == null)) {
                        m.f63124e.f62921d = this.f63064g.mo62132f();
                        m.mo62048a(list, 2, z);
                        C23888c.m78213e(this.f63064g.mo62132f());
                        if (this.f63073p.mo86442a()) {
                            m.f63124e.ai_();
                        } else {
                            m.f63124e.ah_();
                        }
                    }
                } else if (getActivity() != null) {
                    if (!C33703a.m108719c()) {
                        this.f63064g.mo62134h();
                    }
                    if (m != null) {
                        if (C23929e.m78561a(getContext())) {
                            m.mo62051e();
                            if (this.f63059B) {
                                C23888c.m78215f(this.f63064g.mo62132f());
                            }
                        } else {
                            m.mo62052g();
                        }
                    }
                }
            } else if (m != null) {
                m.mo62052g();
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m78258a(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
            activity.startActivity(new Intent(activity, MusicRecommendActivity.class));
        }
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        m78259a(new C23876v().mo61964a(1).mo61967b("normal_search").mo61965a(this.f63070m));
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.pn, viewGroup, false);
        if (this.f63059B) {
            inflate.findViewById(R.id.cux).setBackgroundResource(R.drawable.p3);
            ((ImageView) inflate.findViewById(R.id.bbw)).setImageResource(R.drawable.ahq);
            ((TextView) inflate.findViewById(R.id.d1b)).setTextColor(Color.parseColor("#57ffffff"));
            inflate.findViewById(R.id.bsa).setBackgroundResource(R.color.ac4);
            inflate.findViewById(R.id.cuz).setBackgroundResource(R.drawable.p3);
            ((ImageView) inflate.findViewById(R.id.bbx)).setImageResource(R.drawable.ahq);
            EditText editText = (EditText) inflate.findViewById(R.id.e1_);
            editText.setTextColor(Color.parseColor("#ffffff"));
            editText.setHintTextColor(Color.parseColor("#57ffffff"));
            ((ImageView) inflate.findViewById(R.id.b7c)).setImageResource(R.drawable.ahp);
            ((TextView) inflate.findViewById(R.id.e1c)).setTextColor(Color.parseColor("#ffffff"));
        }
        C23888c.m78204c(this.f63068k);
        C23888c.m78198b(this.f63067j);
        this.f63064g = new ChooseMusicFragmentView(inflate, this, this.f63074q, this.f63072o);
        return inflate;
    }

    /* renamed from: a */
    public final void mo62009a(int i, String str, MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            if (i == 0 || i == 2) {
                activity.setResult(-1, intent);
                activity.finish();
                return;
            }
            if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
            } else {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(musicModel.getMusic().getChallenge());
            }
            C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("shoot_way", "search_result").f60753a);
            intent.putExtra("shoot_way", "search_result");
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
        }
    }

    /* renamed from: a */
    public static ChooseMusicFragment m78257a(int i, String str, MusicModel musicModel, Style style, boolean z, Bundle bundle, String str2, String str3) {
        ChooseMusicFragment chooseMusicFragment = new ChooseMusicFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle2.putSerializable("challenge", str);
        bundle2.putSerializable("music_model", musicModel);
        bundle2.putSerializable("music_style", style);
        bundle2.putBoolean("music_allow_clear", z);
        bundle2.putString("creation_id", str3);
        bundle2.putString("shoot_way", str2);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        chooseMusicFragment.setArguments(bundle2);
        return chooseMusicFragment;
    }
}

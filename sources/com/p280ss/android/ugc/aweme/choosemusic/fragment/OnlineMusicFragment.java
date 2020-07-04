package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0610b;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity;
import com.p280ss.android.ugc.aweme.choosemusic.view.StarTcmItem;
import com.p280ss.android.ugc.aweme.common.C25705n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33022h;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33767b;
import com.p280ss.android.ugc.aweme.music.p1408b.C33768c;
import com.p280ss.android.ugc.aweme.music.p1409c.C33781b;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33933ai;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicListFragment;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicListFragment.C33867a;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicListFragment.C33868b;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicRecommendActivity;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicTabListFragment;
import com.p280ss.android.ugc.aweme.music.presenter.C33804f;
import com.p280ss.android.ugc.aweme.music.presenter.C33829s;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.OnlineMusicFragment */
public class OnlineMusicFragment extends AmeBaseFragment implements C0610b, OnClickListener, C33804f, C33868b {
    View cancelChooseMusicContainer;
    View cancelCurrentChooseMusicTv;
    TextView currentChooseMusicNameTv;

    /* renamed from: e */
    public C33829s f63211e;

    /* renamed from: f */
    public MusicTabListFragment f63212f;

    /* renamed from: g */
    public boolean f63213g;

    /* renamed from: h */
    public String f63214h;

    /* renamed from: i */
    public String f63215i;

    /* renamed from: j */
    private int f63216j;

    /* renamed from: k */
    private String f63217k;

    /* renamed from: l */
    private Style f63218l;
    View llRecommendMusic;

    /* renamed from: m */
    private Music f63219m;
    View mBackView;
    TextView mCancelSearch;
    LinearLayout mLinearSearch;
    View mListViewBackground;
    FrameLayout mMainLayout;
    LinearLayout mRelativeSearch;
    RelativeLayout mSearchBg;
    LinearLayout mSearchEditTextContainer;
    EditText mSearchEditView;
    LinearLayout mSearchLayout;
    TextView mSearchTextView;
    View mSkipView;
    DmtStatusView mStatusView;
    StarTcmItem starTcmItem;
    TextView txtClickRecommend;

    public void onResume() {
        super.onResume();
    }

    /* renamed from: i */
    private void m78542i() {
        this.mRelativeSearch.setOnClickListener(this);
    }

    /* renamed from: k */
    private void m78544k() {
        this.f63211e.mo86443b();
    }

    public void onDestroyView() {
        getChildFragmentManager().mo2653b(this);
        super.onDestroyView();
        m78544k();
    }

    /* renamed from: f */
    private static boolean m78540f() {
        boolean z;
        boolean z2 = false;
        try {
            z = C30199h.m98861a().getEnableLocalMusicEntrance().booleanValue();
        } catch (NullValueException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (C33703a.m108720d() != 0) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: j */
    private void m78543j() {
        if (getActivity() != null) {
            this.mSearchEditView.post(new Runnable() {
                public final void run() {
                    if (OnlineMusicFragment.this.mSearchEditView != null) {
                        OnlineMusicFragment.this.mSearchEditView.requestFocus();
                        C6907h.m21517a(OnlineMusicFragment.this.getContext(), "enter_search", "popular_song", 0, 0);
                        KeyboardUtils.m77055a(OnlineMusicFragment.this.mSearchEditView);
                        C42961az.m136380a(new C33767b(false));
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private void m78539e() {
        C0608j childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo2642a((int) R.id.a26);
        if (a != null) {
            this.f63212f = (MusicTabListFragment) a;
        } else {
            this.f63212f = MusicTabListFragment.m109218a(this.f63216j, this.f63217k, this.f63219m, this.f63218l, m78540f());
            C0633q a2 = childFragmentManager.mo2645a();
            a2.mo2585a((int) R.id.a26, (Fragment) this.f63212f);
            a2.mo2606d();
        }
        this.f63212f.f88365f.observe(this, new C0053p<RecyclerView>() {

            /* renamed from: b */
            private ArrayList<RecyclerView> f63223b = new ArrayList<>();

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(RecyclerView recyclerView) {
                if (recyclerView != null && !this.f63223b.contains(recyclerView)) {
                    this.f63223b.add(recyclerView);
                    recyclerView.mo5528a((C1281m) new C1281m() {
                        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                            super.onScrolled(recyclerView, i, i2);
                            if (recyclerView.computeVerticalScrollOffset() != 0) {
                                OnlineMusicFragment.this.starTcmItem.mo62143a();
                            } else {
                                OnlineMusicFragment.this.starTcmItem.mo62144b();
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: g */
    private void m78541g() {
        this.f63213g = true;
        C0608j childFragmentManager = getChildFragmentManager();
        final MusicListFragment musicListFragment = (MusicListFragment) childFragmentManager.mo2642a((int) R.id.a25);
        if (musicListFragment == null) {
            musicListFragment = MusicListFragment.m109171a(this.f63216j, this.f63218l, m78540f());
            musicListFragment.f88369j = 2;
            C0633q a = childFragmentManager.mo2645a();
            a.mo2586a(R.id.a25, musicListFragment, "search_result_list_tag");
            a.mo2589a((String) null);
            a.mo2606d();
        }
        musicListFragment.f88372m = new C33867a() {
            /* renamed from: a */
            public final void mo62095a() {
                if (OnlineMusicFragment.this.f63211e.mo86442a()) {
                    if (musicListFragment.f88366g != null) {
                        musicListFragment.f88366g.ag_();
                    }
                    OnlineMusicFragment.this.f63211e.mo86437a("video_music");
                }
            }
        };
        musicListFragment.f88368i = this;
    }

    /* renamed from: d */
    public final void mo62088d() {
        if (this.mSearchLayout != null) {
            this.mSearchLayout.setVisibility(8);
            this.mMainLayout.setVisibility(0);
            this.mCancelSearch.setVisibility(0);
            this.mSearchTextView.setVisibility(4);
            this.f63212f.mo86517j();
        }
    }

    /* renamed from: l */
    private void m78545l() {
        if (getActivity() != null) {
            final AVMusic curMusic = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic();
            if (curMusic == null) {
                this.cancelChooseMusicContainer.setVisibility(8);
                return;
            }
            this.cancelChooseMusicContainer.setVisibility(0);
            this.currentChooseMusicNameTv.setText(getActivity().getString(R.string.a3t, new Object[]{curMusic.getMusicName()}));
            this.cancelCurrentChooseMusicTv.setOnClickListener(new OnClickListener() {
                /* renamed from: a */
                private void m78555a() {
                    FragmentActivity activity = OnlineMusicFragment.this.getActivity();
                    if (activity instanceof OnlineMusicFragmentActivity) {
                        ((OnlineMusicFragmentActivity) activity).f62898d = true;
                    }
                }

                /* renamed from: b */
                private void m78556b() {
                    OnlineMusicFragment.this.cancelChooseMusicContainer.setClickable(false);
                    Animation loadAnimation = AnimationUtils.loadAnimation(OnlineMusicFragment.this.getContext(), R.anim.ah);
                    loadAnimation.setAnimationListener(new AnimationListener() {
                        public final void onAnimationRepeat(Animation animation) {
                        }

                        public final void onAnimationStart(Animation animation) {
                        }

                        public final void onAnimationEnd(Animation animation) {
                            OnlineMusicFragment.this.cancelChooseMusicContainer.setVisibility(8);
                        }
                    });
                    OnlineMusicFragment.this.cancelChooseMusicContainer.startAnimation(loadAnimation);
                }

                /* renamed from: c */
                private void m78557c() {
                    C6907h.m21524a("unselect_music", (Map) C22984d.m75611a().mo59973a("creation_id", OnlineMusicFragment.this.f63214h).mo59973a("enter_from", "change_music_page").mo59973a("shoot_way", OnlineMusicFragment.this.f63215i).mo59973a("music_id", curMusic.getMusicId()).f60753a);
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    m78555a();
                    m78556b();
                    m78557c();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo2671a() {
        ViewGroup b = m78538b(getView());
        Fragment a = getChildFragmentManager().mo2642a((int) R.id.a25);
        if (a != null) {
            this.mLinearSearch.setVisibility(0);
            this.mRelativeSearch.setVisibility(8);
            if (b != null) {
                ViewPagerBottomSheetBehavior.m76628a(b).mo60684b(a.getView());
            }
        } else {
            this.mLinearSearch.setVisibility(8);
            this.llRecommendMusic.setVisibility(8);
            this.mRelativeSearch.setVisibility(0);
            if (b != null) {
                ViewPagerBottomSheetBehavior.m76628a(b).mo60684b((View) null);
            }
        }
    }

    public void dismiss() {
        this.f63213g = false;
        this.mSearchEditView.setText("");
        this.mSearchTextView.setVisibility(0);
        this.mCancelSearch.setVisibility(4);
        KeyboardUtils.m77057c(this.mSearchEditView);
        C42961az.m136380a(new C33767b(true));
        MusicListFragment musicListFragment = (MusicListFragment) getChildFragmentManager().mo2642a((int) R.id.a25);
        if (musicListFragment != null) {
            musicListFragment.mo86517j();
        }
        try {
            getChildFragmentManager().mo2656d();
        } catch (Exception unused) {
        }
        C42961az.m136381b(new C33768c(null));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62085a(View view) {
        mo62087a(this.mSearchEditView.getText().toString());
    }

    /* renamed from: b */
    private ViewGroup m78538b(View view) {
        while (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            if ((layoutParams instanceof C0355d) && (((C0355d) layoutParams).f1407a instanceof ViewPagerBottomSheetBehavior)) {
                return viewGroup;
            }
            view = (View) parent;
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f63216j = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
            this.f63217k = getArguments().getString("challenge");
            this.f63219m = (Music) getArguments().getSerializable("sticker_music");
            this.f63218l = (Style) getArguments().getSerializable("music_style");
            this.f63214h = getArguments().getString("creation_id");
            this.f63215i = getArguments().getString("shoot_way");
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.cux) {
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isChildrenMode()) {
                C10761a.m31409e(getContext(), (int) R.string.a3c).mo25750a();
                return;
            }
            m78541g();
            m78543j();
            mo62088d();
            this.f63212f.mo86517j();
        } else if (view.getId() == R.id.brs) {
            dismiss();
        } else if (view.getId() == R.id.e1a) {
            mo62087a(this.mSearchEditView.getText().toString());
        } else if (view.getId() == R.id.e1c) {
            dismiss();
        } else if (view.getId() == R.id.cuz) {
            m78543j();
        } else if (view.getId() == R.id.jo) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else if (view.getId() == R.id.d7k) {
            FragmentActivity activity2 = getActivity();
            if (this.f63216j == 0) {
                activity2.onBackPressed();
                return;
            }
            C19282c.m63182a(getActivity(), "music_skip", "music_library");
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
            if (activity2 != null) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity2, new Intent());
            }
        } else {
            if (view.getId() == R.id.x0) {
                final FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    C22477b.m74364a(activity3, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
                        /* renamed from: a */
                        public final void mo53549a(String[] strArr, int[] iArr) {
                            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                                activity3.startActivity(new Intent(activity3, MusicRecommendActivity.class));
                                C6907h.onEvent(MobClick.obtain().setEventName("recommend_music").setLabelName("music_library_search"));
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62087a(String str) {
        if (getActivity() != null) {
            if (C6319n.m19593a(str)) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.b0w).mo25750a();
                return;
            }
            this.mSearchLayout.setVisibility(0);
            this.mMainLayout.setVisibility(8);
            this.mSearchTextView.setVisibility(0);
            this.mCancelSearch.setVisibility(4);
            KeyboardUtils.m77057c(this.mSearchEditView);
            this.mStatusView.mo25942f();
            this.f63211e.mo86438a(str, "video_music");
            this.f63212f.mo86517j();
            MusicListFragment musicListFragment = (MusicListFragment) getChildFragmentManager().mo2642a((int) R.id.a25);
            if (musicListFragment != null) {
                musicListFragment.mo86516g();
                musicListFragment.mo86514b(new ArrayList(), 2);
            }
            C42961az.m136381b(new C33768c("search_result"));
            C6907h.onEvent(MobClick.obtain().setEventName("search").setLabelName("popular_song").setJsonObject(new C6869c().mo16887a(POIService.KEY_KEYWORD, str).mo16888b()));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m78539e();
        getChildFragmentManager().mo2650a((C0610b) this);
        this.f63211e = new C33829s(this);
        m78542i();
        m78545l();
        if (this.f63216j == 0) {
            this.mSkipView.setVisibility(8);
        }
        this.mSearchEditView.setFilters(new InputFilter[]{new C25705n()});
        this.mSearchEditView.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return false;
                }
                OnlineMusicFragment.this.mo62087a(OnlineMusicFragment.this.mSearchEditView.getText().toString());
                return true;
            }
        });
        this.mSearchEditView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (C6319n.m19593a(editable.toString())) {
                    OnlineMusicFragment.this.mo62088d();
                    return;
                }
                OnlineMusicFragment.this.mCancelSearch.setVisibility(4);
                OnlineMusicFragment.this.mSearchTextView.setVisibility(0);
            }
        });
        this.mListViewBackground.setOnClickListener(this);
        this.mSearchEditTextContainer.setOnClickListener(this);
        this.mSearchTextView.setOnClickListener(this);
        this.mCancelSearch.setOnClickListener(this);
        this.mBackView.setOnClickListener(this);
        this.mSkipView.setOnClickListener(this);
        this.txtClickRecommend.setOnClickListener(this);
        this.mStatusView.setBuilder(C10803a.m31631a((Context) getActivity()).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C23945u(this)).mo25955a((int) R.string.fic, (int) R.string.chl).mo25965c(0));
        if (!C33781b.m108911a("show_tcm_info", Boolean.valueOf(true), "music_sp") || ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60018b() || !C6399b.m19944t()) {
            this.starTcmItem.setVisibility(8);
        } else {
            this.starTcmItem.setVisibility(0);
        }
        this.starTcmItem.setUnderView(this.mMainLayout);
    }

    /* renamed from: a */
    public final void mo62011a(List<MusicModel> list, boolean z) {
        String str;
        LogPbBean logPbBean;
        if (list == null) {
            this.mStatusView.mo25944h();
        } else if (isViewValid()) {
            C22984d a = C22984d.m75611a().mo59973a("search_type", "music").mo59973a("enter_method", "creation").mo59973a("search_keyword", this.mSearchEditView.getText().toString());
            String str2 = "enter_from";
            if (this.f63216j == 0) {
                str = "video_edit_page";
            } else {
                str = "video_shoot_page";
            }
            C22984d a2 = a.mo59973a(str2, str).mo59973a("trigger_reason", "cold_launch");
            String str3 = "log_pb";
            if (C6307b.m19566a((Collection<T>) list)) {
                logPbBean = null;
            } else {
                logPbBean = ((MusicModel) list.get(0)).getLogPb();
            }
            C6907h.m21528b("search_music", C33933ai.m109379a(a2.mo59972a(str3, (Object) logPbBean).f60753a));
            if (list.size() > 0) {
                for (MusicModel musicModel : list) {
                    musicModel.setDataType(1);
                    if (musicModel.getMusic() == null) {
                        musicModel.setMusic(musicModel.convertToMusic());
                    }
                }
                MusicListFragment musicListFragment = (MusicListFragment) getChildFragmentManager().mo2642a((int) R.id.a25);
                if (!(musicListFragment == null || musicListFragment.f88366g == null)) {
                    musicListFragment.f88366g.mo86132a(this.mSearchEditView.getText().toString());
                    musicListFragment.mo86514b(list, 2);
                    C33784d.m108934b(this.mSearchEditView.getText().toString());
                    if (this.f63211e.mo86442a()) {
                        musicListFragment.f88366g.ai_();
                    } else {
                        musicListFragment.f88366g.ah_();
                    }
                }
                this.mStatusView.mo25939d();
            } else {
                if (getActivity() != null) {
                    C25713b.m84474a((Activity) getActivity(), (View) this.mSearchEditView);
                    if (C23946v.m78575a(getContext())) {
                        this.mStatusView.mo25943g();
                    } else {
                        this.mStatusView.mo25944h();
                    }
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pn, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo62086a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        if (musicListFragment.mo86519n() == 0 || musicListFragment.mo86519n() == 2) {
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

    /* renamed from: a */
    public static OnlineMusicFragment m78537a(int i, String str, MusicModel musicModel, Style style, boolean z, Bundle bundle, String str2, String str3, String str4) {
        OnlineMusicFragment onlineMusicFragment = new OnlineMusicFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle2.putSerializable("challenge", str);
        bundle2.putSerializable("music_model", musicModel);
        bundle2.putSerializable("music_style", style);
        bundle2.putSerializable("music_allow_clear", Boolean.valueOf(z));
        bundle2.putSerializable("enter_from", str2);
        bundle2.putString("creation_id", str4);
        bundle2.putString("shoot_way", str3);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        onlineMusicFragment.setArguments(bundle2);
        return onlineMusicFragment;
    }
}

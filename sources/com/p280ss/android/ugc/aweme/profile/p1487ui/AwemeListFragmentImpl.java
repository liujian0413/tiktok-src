package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p022v4.app.C0598c;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.facebook.ads.AdError;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23660c;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.OnAnimatedScrollListener;
import com.p280ss.android.ugc.aweme.commercialize.log.C24945an;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.C25650d;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1142c.C25657a;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.metrics.C33246ar;
import com.p280ss.android.ugc.aweme.p1052b.C23147b;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.adapter.AmeDecoration;
import com.p280ss.android.ugc.aweme.profile.adapter.AwemeAdapter;
import com.p280ss.android.ugc.aweme.profile.adapter.AwemeViewHolder;
import com.p280ss.android.ugc.aweme.profile.experiment.C35778a;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragment.C36120b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36341a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36343c;
import com.p280ss.android.ugc.aweme.profile.presenter.C36018b;
import com.p280ss.android.ugc.aweme.profile.presenter.C36053z;
import com.p280ss.android.ugc.aweme.profile.service.C36065a;
import com.p280ss.android.ugc.aweme.profile.service.C36067c;
import com.p280ss.android.ugc.aweme.profile.service.C36073i;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.profile.service.C36075k;
import com.p280ss.android.ugc.aweme.profile.util.C36729b;
import com.p280ss.android.ugc.aweme.profile.util.C36743n;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter;
import com.p280ss.android.ugc.aweme.setting.C37656k;
import com.p280ss.android.ugc.aweme.setting.p337ui.C37897ax;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39328f;
import com.p280ss.android.ugc.aweme.store.C41959a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42980bm;
import com.p280ss.android.ugc.aweme.utils.C43105eq;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.C43371g;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl */
public class AwemeListFragmentImpl extends AwemeListFragment implements C23685d, C6905a, C25663d<AwemeViewHolder>, C25675c<Aweme>, C25676d, C25766a, C28532n, C36346ao {

    /* renamed from: A */
    protected C25657a f94439A;

    /* renamed from: B */
    private DmtTextView f94440B;

    /* renamed from: C */
    private String f94441C;

    /* renamed from: D */
    private String f94442D;

    /* renamed from: E */
    private String f94443E;

    /* renamed from: F */
    private C7321c f94444F;

    /* renamed from: G */
    private int f94445G;

    /* renamed from: H */
    private boolean f94446H;

    /* renamed from: J */
    private boolean f94447J;

    /* renamed from: K */
    private boolean f94448K;

    /* renamed from: L */
    private boolean f94449L;

    /* renamed from: Q */
    private Aweme f94450Q;

    /* renamed from: R */
    private String f94451R;

    /* renamed from: S */
    private boolean f94452S;

    /* renamed from: T */
    private boolean f94453T;

    /* renamed from: U */
    private ViewStub f94454U;

    /* renamed from: V */
    private String f94455V;

    /* renamed from: W */
    private String f94456W;

    /* renamed from: X */
    private String f94457X;

    /* renamed from: Y */
    private boolean f94458Y;

    /* renamed from: Z */
    private boolean f94459Z;

    /* renamed from: aa */
    private DraftListener f94460aa = new DraftListenerAdapter() {
        public final void onDraftClean() {
            if (AwemeListFragmentImpl.this.f94467i && AwemeListFragmentImpl.this.f94466h == 0) {
                AwemeListFragmentImpl.this.mo91900o();
                if (AwemeListFragmentImpl.this.f94471m.getItemCount() == 0) {
                    AwemeListFragmentImpl.this.f94474p.setVisibility(4);
                    if (AwemeListFragmentImpl.this.f94475q != null) {
                        AwemeListFragmentImpl.this.f94475q.mo91881a(AwemeListFragmentImpl.this.f94467i, AwemeListFragmentImpl.this.f94466h);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo91913a(IDraftService iDraftService) throws Exception {
            final List queryList = iDraftService.queryList();
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    if (queryList == null || queryList.isEmpty()) {
                        AwemeListFragmentImpl.this.mo91900o();
                        if (AwemeListFragmentImpl.this.f94471m.getItemCount() == 0) {
                            AwemeListFragmentImpl.this.f94474p.setVisibility(4);
                            if (AwemeListFragmentImpl.this.f94475q != null) {
                                AwemeListFragmentImpl.this.f94475q.mo91881a(AwemeListFragmentImpl.this.f94467i, AwemeListFragmentImpl.this.f94466h);
                            }
                        }
                    } else {
                        AwemeListFragmentImpl.this.mo91891a((C27311c) queryList.get(queryList.size() - 1));
                    }
                }
            });
            return null;
        }

        public final void onDraftDelete(C27311c cVar) {
            if (AwemeListFragmentImpl.this.f94467i && AwemeListFragmentImpl.this.f94466h == 0) {
                IDraftService draftService = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService();
                C1592h.m7855a((Callable<TResult>) new C36563m<TResult>(this, draftService), (Executor) draftService.getDraftExecutor());
            }
        }

        public final void onDraftUpdate(C27311c cVar) {
            if (AwemeListFragmentImpl.this.f94467i && AwemeListFragmentImpl.this.f94466h == 0) {
                AwemeListFragmentImpl.this.mo91891a(cVar);
                if (AwemeListFragmentImpl.this.f94475q != null) {
                    AwemeListFragmentImpl.this.f94475q.mo91882b(AwemeListFragmentImpl.this.f94467i, AwemeListFragmentImpl.this.f94466h);
                }
                AwemeListFragmentImpl.this.f94474p.setVisibility(4);
            }
        }
    };

    /* renamed from: ab */
    private boolean f94461ab = false;

    /* renamed from: ac */
    private C36343c f94462ac;

    /* renamed from: e */
    protected User f94463e;

    /* renamed from: f */
    protected String f94464f;

    /* renamed from: g */
    protected String f94465g;

    /* renamed from: h */
    protected int f94466h;

    /* renamed from: i */
    protected boolean f94467i;

    /* renamed from: j */
    protected boolean f94468j;

    /* renamed from: k */
    protected int f94469k = -1;

    /* renamed from: l */
    protected RecyclerView f94470l;

    /* renamed from: m */
    protected AwemeAdapter f94471m;

    /* renamed from: n */
    protected WrapGridLayoutManager f94472n;

    /* renamed from: o */
    public C25674b<C25673a> f94473o;

    /* renamed from: p */
    protected DmtStatusView f94474p;

    /* renamed from: q */
    protected C36341a f94475q;

    /* renamed from: r */
    protected boolean f94476r = true;

    /* renamed from: s */
    protected C10803a f94477s;

    /* renamed from: t */
    protected boolean f94478t;

    /* renamed from: u */
    protected boolean f94479u = true;

    /* renamed from: v */
    protected ViewStub f94480v;

    /* renamed from: w */
    protected View f94481w;

    /* renamed from: x */
    protected boolean f94482x;

    /* renamed from: y */
    View f94483y;

    /* renamed from: z */
    public View f94484z;

    /* renamed from: c */
    public static boolean m116370c(int i) {
        return i == 4;
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    public final void aE_() {
    }

    public final void aP_() {
        bd_();
    }

    public final boolean aR_() {
        return this.f94459Z;
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<Aweme> list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo91897l() {
        return R.layout.fragment_aweme_list;
    }

    /* renamed from: w */
    public final int mo90851w() {
        return this.f94466h;
    }

    /* renamed from: a */
    public final void mo91883a(DmtStatusView dmtStatusView) {
        this.f94458Y = true;
        this.f94474p = dmtStatusView;
    }

    /* renamed from: a */
    public final void mo90819a(String str) {
        if (this.f94471m != null) {
            this.f94471m.f93527x = str;
        }
    }

    /* renamed from: a */
    public final void mo91891a(C27311c cVar) {
        if (this.f94471m != null) {
            this.f94471m.mo90514a(cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91892a(FeedItemList feedItemList) throws Exception {
        if (C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
            mo90811A();
            return;
        }
        ((C36018b) this.f94473o.mo66539h()).mo91655a(feedItemList);
        if (C36564n.m117981a(getActivity())) {
            mo90811A();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91894a(Throwable th) throws Exception {
        mo90811A();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo91889a(IDraftService iDraftService) throws Exception {
        try {
            C36065a.f94305a.mo91792a();
            final List queryListWithFilter = iDraftService.queryListWithFilter(new C36413d(((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getPublishingDraftKey()));
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    if (C6307b.m19566a((Collection<T>) queryListWithFilter)) {
                        AwemeListFragmentImpl.this.mo91900o();
                    } else {
                        AwemeListFragmentImpl.this.mo91891a((C27311c) queryListWithFilter.get(queryListWithFilter.size() - 1));
                    }
                }
            });
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo65501a(String str, String str2) {
        if (!TextUtils.equals(this.f94464f, str) && !TextUtils.equals(this.f94465g, str2)) {
            this.f94476r = true;
        }
        this.f94464f = str;
        this.f94465g = str2;
        if (this.f94466h == 0 && !this.f94467i && this.f94473o != null) {
            ((C36053z) this.f94473o).f94289a = this.f94464f;
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<Aweme> list, boolean z) {
        if (isViewValid()) {
            if (C6399b.m19944t()) {
                this.f94471m.mo66516d(true);
            }
            if (this.mTag != null && this.f94464f != null && this.f94464f.equals(C36120b.m116333b()) && this.mTag.endsWith(Integer.toString(0)) && C36120b.m116329a() > 0) {
                C1592h.m7853a((Callable<TResult>) new C36471g<TResult>(C36120b.m116335c(), C36120b.m116329a()));
                C36120b.m116330a(0);
                C36120b.m116331a((String) null);
                C36120b.m116334b("");
            }
            this.f94479u = true;
            this.f94474p.mo25938c(true);
            this.f94471m.ai_();
            this.f94471m.f93526w = z;
            m116362a(list);
            this.f94471m.mo58045a(list);
            if (C6399b.m19944t() && this.f94467i && TextUtils.equals(this.f95164O, C43105eq.m136725a(1)) && !((Boolean) C23060u.m75742a().mo60076f().mo59877d()).booleanValue() && !((Boolean) C23060u.m75742a().mo60072b().mo59877d()).booleanValue() && this.f94483y != null && this.f94471m.mo60557c() != 0 && !this.f94448K) {
                this.f94483y.setVisibility(0);
            }
            if (!(list == null || list.isEmpty() || this.f94475q == null)) {
                this.f94475q.mo91882b(this.f94467i, this.f94466h);
            }
            this.f94459Z = z;
            mo59100a(z);
        }
    }

    /* renamed from: a */
    private void m116362a(List<Aweme> list) {
        if (!(this.f94450Q == null || this.f94450Q.getVideo() == null)) {
            for (Aweme aweme : list) {
                if (aweme.getAid() != null && aweme.getAid().equals(this.f94450Q.getAid()) && aweme.getVideo() != null) {
                    aweme.getVideo().setCover(this.f94450Q.getVideo().getCover());
                    aweme.getVideo().setDynamicCover(this.f94450Q.getVideo().getDynamicCover());
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        if (!z) {
            this.f94471m.mo66504a((C6905a) null);
            if (C6399b.m19944t()) {
                this.f94471m.mo66516d(false);
                return;
            }
            if (C36743n.f96432a.mo93063a(this.f94473o, this.f94466h, this.f94467i)) {
                String d = ((C36018b) this.f94473o.mo66539h()).mo91667d();
                if (!TextUtils.isEmpty(d)) {
                    this.f94471m.mo66505c(d);
                }
            }
            this.f94471m.ah_();
            this.f94471m.mo66516d(true);
        }
    }

    /* renamed from: a */
    public final void mo90821a(boolean z, boolean z2) {
        if (C23487o.m77156c(getView()) && this.f94439A != null) {
            this.f94439A.mo66545a(z, z2);
        }
    }

    /* renamed from: a */
    public final void mo61615a(View view, Aweme aweme, String str) {
        if (!(C27326a.m89578a(view) || aweme == null || getActivity() == null)) {
            if (!this.f94446H) {
                C28503s.m93679a((C25673a) this.f94473o.mo66539h());
                if (!C36564n.m117981a(getContext())) {
                    C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
                } else if (!C36743n.m118431b(this.f94466h, this.f94467i) || !aweme.isDelete()) {
                    if (m116370c(this.f94466h)) {
                        str = "collection_video";
                    } else if (this.f94466h == 14) {
                        str = "privacy_album";
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("id", aweme.getAid());
                    bundle.putString("video_from", this.f94467i ? "from_profile_self" : "from_profile_other");
                    bundle.putInt("video_type", this.f94466h);
                    bundle.putString("userid", this.f94464f);
                    bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                    bundle.putString("enter_method", this.f94441C);
                    bundle.putString("like_enter_method", this.f94442D);
                    bundle.putString("content_source", this.f94443E);
                    bundle.putString("refer", str);
                    bundle.putString("previous_page", this.f94456W);
                    bundle.putString("extra_previous_page_position", this.f94457X);
                    bundle.putString("tab_name", this.f95164O);
                    bundle.putString("enter_from_request_id", this.f94455V);
                    bundle.putString("feeds_aweme_id", this.f94451R);
                    bundle.putInt("from_post_list", this.f94466h == 0 ? 1 : 0);
                    if (view == null) {
                        SmartRouter.buildRoute((Context) getActivity(), "aweme://aweme/detail/").withParam(bundle).open();
                    } else {
                        SmartRouter.buildRoute((Context) getActivity(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(C0598c.m2487b(view, 0, 0, view.getWidth(), view.getHeight()).mo2580a()).open();
                    }
                    C28229b.m92772a(aweme);
                    if (m116370c(this.f94466h)) {
                        C6907h.m21524a("click_personal_collection", (Map) C22984d.m75611a().mo59973a("enter_from", "collection_video").mo59973a(C38347c.f99553h, "video").mo59973a("video_id", aweme.getAid()).f60753a);
                    }
                } else {
                    C36743n.m118428a(getContext(), aweme, (C7561a<C7581n>) new C36472h<C7581n>(this, aweme));
                }
            } else if (aweme.isInReviewing() || aweme.isSelfSee()) {
                C10761a.m31383a((Context) getActivity(), (int) R.string.d6c).mo25750a();
            } else {
                C36074j.f94315a.launchProfileCoverCropActivity(getActivity(), aweme);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo91890a(Aweme aweme) {
        this.f94471m.mo90518d(aweme.getAid());
        return null;
    }

    /* renamed from: a */
    public final void mo61742a(List list, int i) {
        if (isViewValid() && !C6307b.m19566a((Collection<T>) list)) {
            if (this.f94471m.f93519e) {
                i++;
            }
            if (this.f94471m.mo90520j() == 0) {
                this.f94471m.mo58045a(list);
                this.f94474p.setVisibility(4);
            } else {
                if (C36074j.f94315a.shouldUseRecyclerPartialUpdate()) {
                    this.f94471m.notifyItemInserted(i);
                } else {
                    this.f94471m.mo58045a(list);
                }
                if (this.f94470l != null) {
                    this.f94470l.post(new Runnable() {
                        public final void run() {
                            AwemeListFragmentImpl.this.f94470l.mo5541b(0);
                            if (AwemeListFragmentImpl.this.f94439A != null) {
                                AwemeListFragmentImpl.this.f94439A.mo66545a(false, false);
                            }
                        }
                    });
                }
            }
            if (this.f94475q != null) {
                this.f94475q.mo91882b(this.f94467i, this.f94466h);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo61737a(final AwemeViewHolder awemeViewHolder) {
        if (awemeViewHolder.mo66487d() != null) {
            if (this.f94479u && this.f94439A != null) {
                this.f94479u = false;
                mo90821a(false, false);
            }
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    String str;
                    int i;
                    if (AwemeListFragmentImpl.this.f94467i) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    if (AwemeListFragmentImpl.this.f94467i) {
                        i = 1000;
                    } else {
                        i = AdError.SERVER_ERROR_CODE;
                    }
                    int i2 = i + AwemeListFragmentImpl.this.f94466h;
                    if (awemeViewHolder.getAdapterPosition() != -1) {
                        try {
                            if (AwemeListFragmentImpl.m116364a(awemeViewHolder.itemView)) {
                                new C33246ar().mo85126a(str).mo85128c(awemeViewHolder.mo66487d(), i2).mo85252e();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }, C34943c.f91128x);
        }
    }

    /* renamed from: a */
    public static final boolean m116364a(View view) throws Exception {
        Point point = new Point();
        ((Activity) view.getContext()).getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect(0, 0, point.x, point.y);
        view.getLocationInWindow(new int[2]);
        return view.getLocalVisibleRect(rect);
    }

    /* renamed from: a */
    private void m116360a(C28308ad adVar) {
        C25673a aVar = (C25673a) this.f94473o.mo66539h();
        if (aVar instanceof C36018b) {
            Aweme aweme = adVar.f74617b;
            AwemeStatus status = aweme.getStatus();
            if (this.f94466h == 14) {
                if (status.getPrivateStatus() == 1) {
                    ((C36018b) aVar).mo91665b(aweme);
                }
            } else if (this.f94466h == 0 && status.getPrivateStatus() != 1) {
                ((C36018b) aVar).mo91665b(aweme);
            }
        }
    }

    /* renamed from: a */
    public static boolean m116363a(RecyclerView recyclerView, int i) {
        View c = recyclerView.getLayoutManager().mo5432c(i);
        if (c == null) {
            return true;
        }
        int[] iArr = new int[2];
        c.getLocationOnScreen(iArr);
        int a = m116349a((Activity) recyclerView.getContext()) - iArr[1];
        if (c.getHeight() <= 0 || (((float) a) * 1.0f) / ((float) c.getHeight()) <= 0.4f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo90818a(C36343c cVar) {
        this.f94462ac = cVar;
    }

    /* renamed from: a */
    public final void mo90816a(User user) {
        this.f94463e = user;
        if (C6399b.m19944t() && !this.f94467i && !C43122ff.m136767b() && this.f94466h == 1) {
            m116368c(getContext(), this.f94461ab);
        }
        m116337I();
    }

    /* renamed from: a */
    public final void mo90815a(RoomStruct roomStruct) {
        if (this.f94471m != null) {
            boolean z = this.f94471m.mo90521k() && roomStruct == null;
            this.f94471m.mo90515a(roomStruct);
            if (this.f94474p.f29075b && z && mo90847r()) {
                ae_();
            }
        }
    }

    /* renamed from: a */
    public static void m116356a(Context context, DmtStatusView dmtStatusView, C10803a aVar, int i) {
        if (dmtStatusView != null) {
            LayoutParams layoutParams = (LayoutParams) dmtStatusView.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.width = -1;
            layoutParams.height = -1;
            dmtStatusView.setLayoutParams(layoutParams);
            if (C6399b.m19944t()) {
                MtEmptyView a = MtEmptyView.m31657a(context);
                a.setStatus(new C10806a(context).mo25990b((int) R.string.b4t).mo25993c(R.string.b4s).mo25985a((int) R.drawable.ax0).f29135a);
                aVar.mo25963b((View) a);
                return;
            }
            DmtDefaultView dmtDefaultView = new DmtDefaultView(context);
            dmtDefaultView.setStatus(new C10806a(context).mo25993c(i).f29135a);
            aVar.mo25963b((View) dmtDefaultView);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DmtTextView mo91888a(final Context context, boolean z) {
        String str;
        String str2;
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.ss));
        if (z) {
            str = getString(R.string.d7h);
        } else {
            str = getString(R.string.d7a);
        }
        if (z) {
            str2 = getString(R.string.d7g);
        } else {
            str2 = getString(R.string.d7j);
        }
        if (z) {
            str2 = C1642a.m8034a(str2, new Object[]{getString(R.string.d7f)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        sb.append(str2);
        String sb2 = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
        if (context != null) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, str.length(), 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.a4z)), 0, str.length(), 18);
            String string = getString(R.string.d7f);
            if (z) {
                int indexOf = sb2.indexOf(string);
                int length = string.length() + indexOf;
                if (indexOf >= 0 && length >= 0) {
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }

                        public final void onClick(View view) {
                            SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
                        }
                    }, indexOf, length, 18);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.lo)), indexOf, length, 18);
                }
                dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            dmtTextView.setTextColor(context.getResources().getColor(R.color.a51));
        }
        dmtTextView.setGravity(17);
        dmtTextView.setText(spannableStringBuilder);
        dmtTextView.setLineSpacing(C9738o.m28708b(context, 12.0f), 1.0f);
        return dmtTextView;
    }

    /* renamed from: a */
    static final /* synthetic */ void m116359a(View view, View view2) {
        C23060u.m75742a().mo60072b().mo59871a(Boolean.valueOf(true));
        view.setVisibility(8);
    }

    /* renamed from: a */
    public static void m116357a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1293v f = recyclerView.mo5575f(i);
                if (f instanceof AwemeViewHolder) {
                    AwemeViewHolder.m115305a(recyclerView.getContext(), ((AwemeViewHolder) f).mo66487d());
                } else if (f instanceof JediAwemeVideoViewHolder) {
                    AwemeViewHolder.m115305a(recyclerView.getContext(), ((JediAwemeVideoViewHolder) f).mo69909u());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m116358a(RecyclerView recyclerView, List list) {
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null && !C6307b.m19566a((Collection<T>) list)) {
                int l = linearLayoutManager.mo5447l();
                for (int j = linearLayoutManager.mo5445j(); j <= l; j++) {
                    if (j >= 0 && j < list.size()) {
                        Object obj = list.get(j);
                        if (obj instanceof Aweme) {
                            C36067c.f94307a.mo91797a((Aweme) obj);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo91893a(MediaMixList mediaMixList) throws Exception {
        if (C6307b.m19566a((Collection<T>) mediaMixList.mixInfos)) {
            this.f94471m.mo90516a(false, (MediaMixList) null);
        } else {
            this.f94471m.mo90516a(true, mediaMixList);
        }
    }

    /* renamed from: J */
    private int m116338J() {
        return m116350a(this.f94447J, this.f94449L, this.f94467i, this.f94466h);
    }

    /* renamed from: K */
    private void m116339K() {
        if (this.f94481w != null) {
            mo91898m().setVisibility(4);
        }
    }

    /* renamed from: N */
    private void m116342N() {
        if (m116344P()) {
            this.f94474p.mo25942f();
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid()) {
            m116339K();
            m116342N();
        }
    }

    public final boolean aO_() {
        if (!this.f94476r || this.f94449L || this.f94447J) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final View mo61750j() {
        if (!isViewValid()) {
            return null;
        }
        return this.f94470l;
    }

    /* renamed from: o */
    public final void mo91900o() {
        if (this.f94471m != null) {
            this.f94471m.mo90519f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo91909q() {
        this.f94472n = new WrapGridLayoutManager((Context) getActivity(), 3, 1, false);
    }

    /* renamed from: v */
    public final void mo90850v() {
        if (this.f94439A != null) {
            this.f94439A.mo66544a();
        }
    }

    /* renamed from: O */
    private boolean m116343O() {
        if (!this.f94467i || this.f94466h != 0 || !this.f94471m.f93519e) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private boolean m116344P() {
        if (this.f94471m.getItemCount() != 0 || this.f94471m.f93519e) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final C1272h mo91884D() {
        return new AmeDecoration((int) C9738o.m28708b(getContext(), 1.0f));
    }

    public final void aS_() {
        if (isViewValid() && this.f94470l.getChildCount() > 0) {
            this.f94470l.mo5561d(0);
        }
    }

    /* renamed from: k */
    public final void mo90837k() {
        if (!this.f94447J && !this.f94449L && isViewValid()) {
            this.f94474p.setVisibility(4);
            mo91898m().setVisibility(0);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.mUserVisibleHint) {
            mo90850v();
        }
        try {
            if (isViewValid()) {
                m116366b(this.f94470l);
            }
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    public void onStart() {
        super.onStart();
        try {
            if (this.f94471m != null) {
                this.f94471m.notifyDataSetChanged();
                if (m116370c(this.f94466h)) {
                    m116369c(this.f94470l);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void onStop() {
        if (this.mUserVisibleHint) {
            mo90850v();
        }
        try {
            if (isViewValid()) {
                m116366b(this.f94470l);
            }
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
        super.onStop();
    }

    /* renamed from: r */
    public final boolean mo90847r() {
        if (!isViewValid() || this.f94471m == null || this.f94471m.getItemCount() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void mo90848s() {
        if (this.f94474p != null && !this.f94474p.mo25945i()) {
            this.f94474p.setVisibility(0);
        }
    }

    /* renamed from: u */
    public final void mo90849u() {
        if (this.f94474p != null && this.f94474p.mo25945i()) {
            this.f94474p.setVisibility(4);
        }
    }

    /* renamed from: M */
    private void m116341M() {
        if (this.f94467i && this.f94466h == 0) {
            IDraftService draftService = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService();
            C1592h.m7855a((Callable<TResult>) new C36470f<TResult>(this, draftService), (Executor) draftService.getDraftExecutor());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo91886F() {
        if (this.f94466h != 0 || this.f94467i) {
            this.f94473o = new C25674b<>();
        } else {
            this.f94473o = new C36053z();
            ((C36053z) this.f94473o).f94289a = this.f94464f;
        }
        this.f94473o.mo66537a(this);
        this.f94473o.mo66568a((C25676d) this);
        C36018b bVar = new C36018b();
        bVar.f94231f = this.f94446H;
        this.f94473o.mo66536a(bVar);
    }

    public final void aD_() {
        if (isViewValid()) {
            if (this.f94473o == null || !C36743n.f96432a.mo93063a(this.f94473o, this.f94466h, this.f94467i)) {
                this.f94471m.ag_();
                return;
            }
            this.f94471m.mo90517b(((C36018b) this.f94473o.mo66539h()).mo91667d());
        }
    }

    public void aQ_() {
        if (isViewValid()) {
            if (this.f94447J || this.f94449L) {
                ae_();
            } else if (this.f94474p == null || (!this.f94482x && !C36075k.f94317a.mo59240a())) {
                mo91887G();
            } else {
                this.f94474p.setVisibility(4);
                mo91898m().setVisibility(0);
            }
        }
    }

    /* renamed from: g */
    public final int mo90835g() {
        if (this.f94473o == null || this.f94473o.mo66539h() == null || ((C25673a) this.f94473o.mo66539h()).getItems() == null) {
            return 0;
        }
        return ((C25673a) this.f94473o.mo66539h()).getItems().size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final View mo91898m() {
        if (this.f94481w == null) {
            this.f94481w = this.f94480v.inflate();
            if (C36075k.f94317a.mo59240a()) {
                ((TextView) this.f94481w.findViewById(R.id.title)).setText(R.string.e6j);
                ((TextView) this.f94481w.findViewById(R.id.a1q)).setText(R.string.e69);
            }
        }
        return this.f94481w;
    }

    /* renamed from: y */
    public final void mo90853y() {
        if (this.f94471m != null) {
            this.f94471m.ai_();
            this.f94471m.mo66502g();
            this.f94476r = true;
            if (this.f94473o.mo66539h() != null) {
                FeedItemList feedItemList = (FeedItemList) ((C36018b) this.f94473o.mo66539h()).getData();
                if (feedItemList != null) {
                    feedItemList.maxCursor = 0;
                    feedItemList.items = null;
                    feedItemList.hasMore = 0;
                }
            }
        }
    }

    /* renamed from: z */
    public final void mo90854z() {
        if (isViewValid() && this.f94470l != null && this.f94471m != null && !this.f94471m.f93521g) {
            this.f94471m.f93521g = true;
            int childCount = this.f94470l.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1293v f = this.f94470l.mo5575f(i);
                if (f instanceof AwemeViewHolder) {
                    AwemeViewHolder awemeViewHolder = (AwemeViewHolder) f;
                    awemeViewHolder.mo90525c();
                    mo61737a(awemeViewHolder);
                }
            }
        }
    }

    /* renamed from: L */
    private void m116340L() {
        Bundle arguments = getArguments();
        this.f94466h = arguments.getInt("type");
        String string = arguments.getString("uid");
        String string2 = arguments.getString("sec_user_id");
        if (!TextUtils.isEmpty(string)) {
            this.f94464f = string;
        }
        if (!TextUtils.isEmpty(string2)) {
            this.f94465g = string2;
        }
        this.f94446H = arguments.getBoolean("is_choose_video_cover", false);
        this.f94467i = arguments.getBoolean("is_my_profile");
        this.f94469k = arguments.getInt("bottom_bar_height");
        this.f94478t = arguments.getBoolean("should_refresh_on_init_data", false);
    }

    /* renamed from: S */
    private void m116347S() {
        int i;
        if (!(this.f94473o == null || this.f94473o.mo66539h() == null || ((C25673a) this.f94473o.mo66539h()).getItems() == null)) {
            List items = ((C25673a) this.f94473o.mo66539h()).getItems();
            if (items != null) {
                Iterator it = items.iterator();
                i = 0;
                while (it.hasNext() && ((Aweme) it.next()).isTop()) {
                    i++;
                }
                if (this.f94450Q == null && this.f94473o.mo66570a((Object) this.f94450Q, i)) {
                    ((C36018b) this.f94473o.mo66539h()).mo91661b(this.f94450Q, this.f94464f);
                    mo90821a(false, true);
                    this.f94474p.setVisibility(4);
                    if (this.f94475q != null) {
                        this.f94475q.mo91882b(this.f94467i, this.f94466h);
                    }
                    return;
                }
            }
        }
        i = 0;
        if (this.f94450Q == null) {
        }
    }

    /* renamed from: T */
    private void m116348T() {
        if (this.f94466h != 0) {
            return;
        }
        if ((this.f94467i || !this.f94482x || this.f94445G == 1 || this.f94445G == 2) && C36073i.f94313a.mo85873b()) {
            if (this.f94444F != null) {
                this.f94444F.dispose();
            }
            this.f94444F = MediaMixListViewModel.m118538a(this.f94464f, this.f94465g).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C36561k<Object>(this), C36562l.f95955a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo91885E() {
        String str;
        FragmentActivity activity = getActivity();
        if (this.f94467i || this.f94466h == 4) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        AwemeAdapter awemeAdapter = new AwemeAdapter(activity, str, this.f94467i, this.f94466h, this, this, this.f94464f, this.f94465g);
        this.f94471m = awemeAdapter;
        this.f94471m.mo66504a((C6905a) this);
        this.f94471m.f93521g = this.f94468j;
        this.f94471m.f93528y = this.f94446H;
        if (this.f94466h == 0 && C36073i.f94313a.mo85873b()) {
            this.f94471m.f67554u = new C1241a() {
                /* renamed from: a */
                public final int mo5386a(int i) {
                    if (AwemeListFragmentImpl.this.f94471m.mo58029a(i) == 4) {
                        return AwemeListFragmentImpl.this.f94472n.f4716b;
                    }
                    return 1;
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo91887G() {
        if (!this.f94467i || this.f94466h != 0 || !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getContext())) {
            mo90811A();
        } else {
            if (TextUtils.isEmpty(this.f94464f)) {
                this.f94464f = C6861a.m21337f().getCurUserId();
            }
            if (TextUtils.isEmpty(this.f94465g)) {
                this.f94465g = C6861a.m21337f().getCurUser().getSecUid();
            }
            ((C36018b) this.f94473o.mo66539h()).mo91653a(this.f94464f).mo19280a((C7326g<? super T>) new C36386c<Object>(this), (C7326g<? super Throwable>) new C36445e<Object>(this));
        }
        m116341M();
    }

    public final void aT_() {
        if (isViewValid()) {
            if (!this.mUserVisibleHint || !C37656k.m120485a(getContext()) || !C36564n.m117981a(getActivity())) {
                mo90850v();
            } else {
                mo90821a(false, false);
            }
            if (this.mUserVisibleHint) {
                m116357a(this.f94470l);
                if (m116370c(this.f94466h)) {
                    m116358a(this.f94470l, this.f94471m.mo62312a());
                }
            }
        }
    }

    public final void bd_() {
        int i;
        int i2;
        if (this.f94467i) {
            int i3 = this.f94466h;
            if (this.f94471m == null || this.f94471m.mo62312a() == null) {
                i2 = 0;
            } else {
                i2 = this.f94471m.mo62312a().size();
            }
            C36729b.m118408a(i3, true, i2);
        }
        C25674b<C25673a> bVar = this.f94473o;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(4);
        objArr[1] = Boolean.valueOf(true);
        objArr[2] = this.f94464f;
        objArr[3] = Integer.valueOf(this.f94466h);
        if (this.f94467i) {
            i = 1000;
        } else {
            i = AdError.SERVER_ERROR_CODE;
        }
        objArr[4] = Integer.valueOf(i);
        objArr[5] = this.f94465g;
        bVar.mo56976a(objArr);
    }

    public void onDestroyView() {
        if (this.f94467i && this.f94466h == 0) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().unregisterDraftListener(this.f94460aa);
        }
        super.onDestroyView();
        if (this.f94473o != null) {
            this.f94473o.mo59134U_();
        }
        C24945an.m81853a().mo65223b();
        C24945an.m81853a().f65782a = false;
        if (this.f94471m != null) {
            this.f94471m.mo66502g();
        }
        if (this.f94444F != null) {
            this.f94444F.dispose();
        }
    }

    /* renamed from: t */
    public final void mo71270t() {
        if (this.f94473o != null && this.f94473o.mo66539h() != null && !C36075k.f94317a.mo59240a()) {
            boolean z = false;
            List items = ((C25673a) this.f94473o.mo66539h()).getItems();
            if (items != null && items.size() > 0) {
                Iterator it = items.iterator();
                while (it.hasNext()) {
                    Aweme aweme = (Aweme) it.next();
                    int i = this.f94466h;
                    if (i != 1) {
                        if (i == 4 && (aweme == null || !aweme.isCollected())) {
                            it.remove();
                        }
                    } else if (aweme == null || !aweme.isLike()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            if (z && this.f94471m != null) {
                this.f94471m.notifyDataSetChanged();
            }
            if (!this.f94474p.mo25947k()) {
                if (mo90847r()) {
                    ae_();
                }
                this.f94473o.mo56977b();
            }
        }
    }

    /* renamed from: x */
    public final ArrayList<Aweme> mo90852x() {
        if (this.f94471m == null || this.f94471m.f67539l == null || this.f94471m.f67539l.size() < 3) {
            return null;
        }
        ArrayList<Aweme> arrayList = new ArrayList<>();
        for (Aweme aweme : this.f94471m.f67539l) {
            if (aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 0) {
                arrayList.add(aweme);
                if (arrayList.size() >= 3) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    private void m116337I() {
        if (!C6399b.m19944t() && this.f94467i && C35778a.m115539a() && this.f94466h == 0 && C6861a.m21337f().getCurUser().getPrivateAwemeCount() > 0 && PrivateAlbumActivity.m117031a(getContext()) && this.f94484z == null) {
            this.f94484z = this.f94454U.inflate();
            TextView textView = (TextView) this.f94484z.findViewById(R.id.e54);
            ImageView imageView = (ImageView) this.f94484z.findViewById(R.id.b7g);
            String string = getString(R.string.cx9);
            String string2 = getString(R.string.cxc);
            String replace = string.replace(string2, "");
            SpannableString spannableString = new SpannableString(string2.replaceAll("(.)", "$1⁠"));
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a4p)), 0, spannableString.length(), 18);
            textView.setText(new SpannableStringBuilder(replace).append(spannableString));
            textView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    PrivateAlbumActivity.m117030a(view.getContext(), true);
                    ScrollSwitchStateManager.m98918a(AwemeListFragmentImpl.this.getActivity()).mo79736f("page_setting");
                    AwemeListFragmentImpl.this.f94484z.setVisibility(8);
                }
            });
            imageView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    AwemeListFragmentImpl.this.f94484z.setVisibility(8);
                    PrivateAlbumActivity.m117032b(view.getContext());
                }
            });
            this.f94484z.setVisibility(0);
        }
    }

    /* renamed from: Q */
    private void m116345Q() {
        if (!this.f94458Y) {
            int J = m116338J();
            if (!(J == 0 || this.f94477s == null || this.f94474p == null)) {
                this.f94474p.mo25939d();
                if (!C6399b.m19944t() || !this.f94467i || this.f94466h != 1) {
                    if (!C6399b.m19944t() || this.f94467i || this.f94466h != 1) {
                        if (C36743n.f96432a.mo93063a(this.f94473o, this.f94466h, this.f94467i)) {
                            String d = ((C36018b) this.f94473o.mo66539h()).mo91667d();
                            if (!TextUtils.isEmpty(d)) {
                                this.f94477s.mo25963b((View) m116353a(getContext(), d));
                            } else {
                                this.f94477s.mo25963b((View) m116352a(getContext(), J));
                            }
                        } else {
                            this.f94477s.mo25963b((View) m116352a(getContext(), J));
                        }
                    } else if (C43122ff.m136767b()) {
                        this.f94477s.mo25963b((View) m116352a(getContext(), J));
                    } else {
                        this.f94477s.mo25963b((View) mo91895b(getContext(), false));
                    }
                } else if (C43122ff.m136767b()) {
                    this.f94477s.mo25963b((View) m116352a(getContext(), J));
                } else if (((Integer) C23060u.m75742a().mo60075e().mo59877d()).intValue() == 0) {
                    this.f94477s.mo25963b((View) mo91888a(getContext(), false));
                } else {
                    this.f94477s.mo25963b((View) mo91888a(getContext(), true));
                }
                this.f94474p.setBuilder(this.f94477s);
            }
        }
    }

    /* renamed from: R */
    private void m116346R() {
        int i = 0;
        this.f94453T = false;
        C25673a aVar = (C25673a) this.f94473o.mo66539h();
        if (aVar instanceof C36018b) {
            List items = ((C36018b) aVar).getItems();
            if (items != null) {
                i = items.size();
            }
            if (this.f94466h == 14) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (((Aweme) items.get(i2)).getStatus().getPrivateStatus() != 1) {
                        this.f94473o.mo66569a(items.get(i2));
                    }
                }
            } else if (this.f94466h == 0) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    Aweme aweme = (Aweme) items.get(i3);
                    if (!aweme.isTop() && aweme.getStatus().getPrivateStatus() == 1) {
                        this.f94473o.mo66569a((Object) aweme);
                        arrayList.add(aweme);
                    }
                }
                ((C36018b) this.f94473o.mo66539h()).mo91660a((Collection<Aweme>) arrayList, this.f94464f);
            }
            this.f94471m.notifyDataSetChanged();
        }
    }

    /* renamed from: A */
    public final boolean mo90811A() {
        int i;
        if (!isViewValid() || C36075k.f94317a.mo59240a()) {
            return false;
        }
        if (!C36564n.m117981a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            if (m116343O()) {
                this.f94474p.mo25944h();
            } else {
                this.f94474p.mo25939d();
            }
            this.f94476r = true;
            return false;
        }
        m116342N();
        boolean z = !this.f94473o.mo66540i();
        if (this.f94467i && TextUtils.isEmpty(this.f94464f)) {
            this.f94464f = C6861a.m21337f().getCurUserId();
        }
        if (this.f94467i && TextUtils.isEmpty(this.f94465g)) {
            this.f94465g = C6861a.m21337f().getCurUser().getSecUid();
        }
        if (!TextUtils.isEmpty(this.f94464f)) {
            if (this.f94467i) {
                C36729b.m118408a(this.f94466h, false, 0);
            }
            C36729b.m118406a(this.f94466h, this.f94464f);
            C25674b<C25673a> bVar = this.f94473o;
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(1);
            objArr[1] = Boolean.valueOf(true);
            objArr[2] = this.f94464f;
            objArr[3] = Integer.valueOf(this.f94466h);
            if (this.f94467i) {
                i = 1000;
            } else {
                i = AdError.SERVER_ERROR_CODE;
            }
            objArr[4] = Integer.valueOf(i);
            objArr[5] = this.f94465g;
            bVar.mo56976a(objArr);
            this.f94476r = false;
            m116348T();
        }
        return z;
    }

    public void ae_() {
        if (isViewValid()) {
            if (((C25673a) this.f94473o.mo66539h()).isHasMore() && !this.f94449L && !this.f94447J) {
                bd_();
            }
            this.f94474p.mo25950n();
            if (this.f94467i && this.f94466h == 0) {
                if (!C6307b.m19566a((Collection<T>) this.f94471m.mo62312a())) {
                    this.f94471m.mo66502g();
                }
                if (this.f94471m.getItemCount() != 0 || this.f94471m.f93519e) {
                    if (this.f94475q != null) {
                        this.f94475q.mo91882b(this.f94467i, this.f94466h);
                    }
                } else if (this.f94475q != null) {
                    this.f94475q.mo91881a(this.f94467i, this.f94466h);
                }
                this.f94474p.setVisibility(4);
            } else if (this.f94471m.mo90521k()) {
                this.f94474p.setVisibility(4);
            } else {
                m116339K();
                if (!((C25673a) this.f94473o.mo66539h()).isHasMore()) {
                    if (C36743n.f96432a.mo93063a(this.f94473o, this.f94466h, this.f94467i)) {
                        m116345Q();
                    }
                    this.f94474p.mo25943g();
                    if (this.f94483y != null) {
                        this.f94483y.setVisibility(8);
                    }
                }
                if (this.f94475q != null) {
                    this.f94475q.mo91881a(this.f94467i, this.f94466h);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo91899n() {
        int J = m116338J();
        this.f94477s = C10803a.m31631a(getContext());
        DmtTextView a = m116352a(getContext(), (int) R.string.c48);
        a.setOnClickListener(new C36359b(this));
        this.f94477s.mo25966c((View) a);
        if (this.f94466h == 4) {
            m116356a(getContext(), this.f94474p, this.f94477s, J);
        } else {
            try {
                if (!C6399b.m19944t() || !this.f94467i || this.f94466h != 1) {
                    if (!C6399b.m19944t() || this.f94467i || this.f94466h != 1) {
                        this.f94477s.mo25963b((View) m116352a(getContext(), J));
                    } else if (C43122ff.m136767b()) {
                        this.f94477s.mo25963b((View) m116352a(getContext(), J));
                    } else {
                        this.f94477s.mo25963b((View) mo91895b(getContext(), false));
                    }
                } else if (C43122ff.m136767b()) {
                    this.f94477s.mo25963b((View) m116352a(getContext(), J));
                } else if (((Integer) C23060u.m75742a().mo60075e().mo59877d()).intValue() == 0) {
                    this.f94477s.mo25963b((View) mo91888a(getContext(), false));
                } else {
                    this.f94477s.mo25963b((View) mo91888a(getContext(), true));
                }
            } catch (Exception unused) {
            }
        }
        this.f94474p.setBuilder(this.f94477s);
    }

    public void onResume() {
        super.onResume();
        if (C6399b.m19944t() && this.f94467i && TextUtils.equals(this.f95164O, C43105eq.m136725a(1)) && ((((Boolean) C23060u.m75742a().mo60076f().mo59877d()).booleanValue() || this.f94471m.mo60557c() == 0 || ((Boolean) C23060u.m75742a().mo60072b().mo59877d()).booleanValue()) && this.f94483y != null && this.f94483y.getVisibility() == 0)) {
            this.f94483y.setVisibility(8);
            this.f94448K = true;
        }
        if (C35778a.m115539a() && this.f94466h == 0 && !PrivateAlbumActivity.m117031a(getContext()) && this.f94484z != null && this.f94484z.getVisibility() == 0) {
            this.f94484z.setVisibility(8);
        }
        if (this.mUserVisibleHint && !C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            mo90821a(false, true);
        }
        if (this.f94453T) {
            m116346R();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo91908p() {
        OnAnimatedScrollListener onAnimatedScrollListener;
        String str;
        this.f94470l.setOverScrollMode(2);
        mo91909q();
        this.f94470l.setLayoutManager(this.f94472n);
        this.f94470l.mo5525a(mo91884D());
        if (!C7188c.m22428a()) {
            onAnimatedScrollListener = new OnAnimatedScrollListener();
            this.f94470l.mo5528a((C1281m) onAnimatedScrollListener);
        } else {
            onAnimatedScrollListener = null;
        }
        this.f94439A = new C25657a(this.f94470l, onAnimatedScrollListener);
        this.f94470l = C36074j.f94315a.buildBaseRecyclerView(this.f94470l, this);
        if (this.f94467i) {
            str = "my_profile";
        } else {
            str = "user_profile";
        }
        C42980bm.m136450a(str).mo104686a(this.f94470l);
        mo91885E();
        this.f94470l.setAdapter(this.f94471m);
        mo91886F();
        if (((this.f94467i && this.f94466h == 0) || this.f94478t || this.f95163N) && !C36075k.f94317a.mo59240a()) {
            mo91887G();
        }
        if (this.f94469k > 0) {
            this.f94470l.setPadding(0, 0, 0, this.f94469k);
        }
        if (this.f94452S) {
            m116347S();
        }
        m116337I();
    }

    /* renamed from: a */
    public final void mo90817a(C36341a aVar) {
        this.f94475q = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo91896b(View view) {
        mo90811A();
    }

    /* renamed from: c_ */
    public final void mo86064c_(boolean z) {
        this.f94482x = z;
    }

    /* renamed from: d */
    public final void mo90828d(String str) {
        this.f94443E = str;
    }

    /* renamed from: d_ */
    public final void mo90830d_(int i) {
        this.f94445G = i;
    }

    /* renamed from: e */
    public final void mo90831e(String str) {
        this.f94456W = str;
    }

    /* renamed from: f */
    public final void mo90833f(String str) {
        this.f94457X = str;
    }

    /* renamed from: g */
    public final void mo90836g(String str) {
        this.f94451R = str;
    }

    /* renamed from: b */
    public final void mo90825b(String str) {
        this.f94441C = str;
    }

    /* renamed from: e */
    public final void mo90832e(boolean z) {
        this.f94468j = z;
    }

    /* renamed from: f */
    public final void mo90834f(boolean z) {
        this.f94478t = z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m116340L();
    }

    /* renamed from: c */
    public static void m116369c(RecyclerView recyclerView) {
        if (recyclerView != null) {
            C36067c.f94307a.mo91798a(true);
            recyclerView.post(C36560j.f95953a);
        }
    }

    /* renamed from: d */
    public final void mo90829d(boolean z) {
        if (this.f94471m != null) {
            this.f94471m.f93520f = z;
        }
    }

    @C7709l
    public void onDynamicEvent(C23660c cVar) {
        if (cVar.f62378a == 0) {
            mo90821a(true, false);
        } else {
            mo90850v();
        }
    }

    /* renamed from: d */
    private static boolean m116371d(Exception exc) {
        if (!(exc instanceof ApiServerException) || ((ApiServerException) exc).getErrorCode() != 7) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo90824b(int i) {
        if (this.f94470l != null) {
            this.f94470l.getRecycledViewPool().mo5821a(0, 12);
        }
    }

    /* renamed from: c */
    public final void mo90827c(String str) {
        this.f94442D = str;
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        if (C36074j.f94315a.onAntiCrawlerEvent(aVar.f61317a)) {
            C42961az.m136385f(aVar);
            mo90811A();
        }
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (isViewValid() && this.f94471m != null) {
            this.f94471m.mo66490a(followStatus);
        }
    }

    /* renamed from: a */
    private static int m116349a(Activity activity) {
        if (VERSION.SDK_INT < 17 || activity == null) {
            return C9738o.m28709b(C6399b.m19921a());
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: b */
    public static void m116366b(RecyclerView recyclerView) throws Exception {
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    C1293v b = recyclerView.mo5539b(childAt);
                    if (b != null && b.mItemViewType == 0) {
                        ((C25650d) b).mo66499j();
                    }
                }
            }
        }
    }

    @C7709l
    public void onPublishStatusUpdate(C39328f fVar) {
        if (fVar.f102148b == 9 && !C36075k.f94317a.mo59240a()) {
            m116341M();
        }
        if (C36074j.f94315a.isEnableSettingDiskManager() && fVar.f102148b == 2 && !C36075k.f94317a.mo59240a()) {
            m116341M();
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(C37897ax axVar) {
        if (this.f94467i && TextUtils.equals(this.f95164O, C43105eq.m136725a(1))) {
            m116345Q();
            if (this.f94471m.getItemCount() != 0 || C36075k.f94317a.mo59240a()) {
                this.f94474p.setVisibility(4);
            } else {
                this.f94474p.mo25943g();
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2;
        super.setUserVisibleHint(z);
        if (z) {
            mo90854z();
        } else {
            mo90850v();
        }
        C24945an a = C24945an.m81853a();
        if (mo90851w() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a.f65782a = z2;
        if (m116370c(this.f94466h) && this.f94471m != null) {
            this.f94471m.f93525k = z;
        }
    }

    /* renamed from: b */
    private boolean m116367b(Aweme aweme) {
        List<Aweme> list = this.f94471m.f67539l;
        if (list != null) {
            for (Aweme aweme2 : list) {
                if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c_ */
    public final void mo61747c_(int i) {
        if (isViewValid()) {
            if (this.f94471m.f93519e) {
                i++;
            }
            if (i <= this.f94471m.getItemCount() || i == 0) {
                this.f94471m.notifyItemRemoved(i);
                if (this.f94471m.mo60557c() == 0) {
                    if (this.f94466h == 1) {
                        m116345Q();
                        this.f94474p.mo25943g();
                    } else {
                        this.f94474p.setVisibility(4);
                    }
                    if (this.f94475q != null) {
                        this.f94475q.mo91881a(this.f94467i, this.f94466h);
                    }
                }
            }
        }
    }

    @C7709l
    public void onPrivateModelEvent(C28308ad adVar) {
        if (adVar.f74617b != null && this.f94471m != null) {
            if (!this.f94467i || !C35778a.m115539a() || !(this.f94466h == 14 || this.f94466h == 0)) {
                for (int i = 0; i < this.f94471m.mo62312a().size(); i++) {
                    Aweme aweme = (Aweme) this.f94471m.mo62312a().get(i);
                    if (aweme.getAid().equals(adVar.f74617b.getAid())) {
                        aweme.setStatus(adVar.f74617b.getStatus());
                        this.f94471m.notifyItemChanged(i);
                        return;
                    }
                }
                return;
            }
            this.f94453T = true;
            m116360a(adVar);
        }
    }

    /* renamed from: h */
    private SpannableStringBuilder m116372h(boolean z) {
        String str;
        String str2;
        if (getContext() == null) {
            return null;
        }
        if (z) {
            str = getContext().getString(R.string.d79);
        } else {
            str = getContext().getString(R.string.d7a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        String sb2 = sb.toString();
        if (z) {
            str2 = getContext().getString(R.string.d78);
        } else {
            str2 = getContext().getString(R.string.d7_);
        }
        if (!C6399b.m19947w()) {
            StringBuilder sb3 = new StringBuilder("@");
            sb3.append(C43122ff.m136777h(this.f94463e));
            str2 = C1642a.m8034a(str2, new Object[]{sb3.toString()});
        } else if (!(this.f94463e == null || this.f94463e.getNickname() == null)) {
            StringBuilder sb4 = new StringBuilder("@");
            sb4.append(this.f94463e.getNickname());
            str2 = C1642a.m8034a(str2, new Object[]{sb4.toString()});
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb5.toString());
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, sb2.length() - 1, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, sb2.length() - 1, 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a4z)), 0, sb2.length(), 18);
        return spannableStringBuilder;
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            if (!m116343O()) {
                if (!this.f94467i && 1 == this.f94466h && this.f94462ac != null) {
                    this.f94462ac.mo92455a(false);
                }
                this.f94474p.mo25939d();
            } else if (this.f94467i || 1 != this.f94466h) {
                this.f94474p.mo25944h();
            } else if (m116371d(exc)) {
                this.f94474p.setBuilder(this.f94474p.mo25937c().mo25963b((View) mo91895b(getContext(), true)));
                this.f94474p.mo25943g();
                if (this.f94462ac != null) {
                    this.f94462ac.mo92455a(true);
                }
            } else {
                this.f94474p.mo25944h();
                if (this.f94462ac != null) {
                    this.f94462ac.mo92455a(false);
                }
            }
            if (!C6307b.m19566a((Collection<T>) this.f94471m.mo62312a())) {
                this.f94471m.mo66502g();
            }
            this.f94476r = true;
            C36729b.m118410a(this.f94466h, false, exc);
        }
    }

    /* renamed from: c */
    public void mo86904c(boolean z) {
        if (this.f94449L != z) {
            this.f94449L = z;
            m116345Q();
            this.f94474p.mo25943g();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            this.f94471m.mo66508i();
            C36729b.m118410a(this.f94466h, true, exc);
        }
    }

    @C7709l(mo20401b = true)
    public void onVideoEvent(C28318an anVar) {
        if (isViewValid() && !C36075k.f94317a.mo59240a()) {
            int i = anVar.f74631a;
            if (i != 2) {
                if (i != 13) {
                    if (i != 15) {
                        if (i == 21) {
                            Aweme aweme = (Aweme) anVar.f74632b;
                            if (aweme != null && this.f94466h == anVar.f74637g) {
                                int a = this.f94471m.mo66489a(aweme.getAid());
                                if (a != -1 && (this.f94470l.getLayoutManager() instanceof C43371g) && m116363a(this.f94470l, a)) {
                                    C42961az.m136380a(new C36435dv(this.f94467i));
                                    ((C43371g) this.f94470l.getLayoutManager()).mo105243a(a, 0);
                                }
                            }
                        }
                    } else if (this.f94467i) {
                        if (this.f94466h == 0) {
                            Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) anVar.f74632b);
                            if (updateAweme != null) {
                                if (!C35778a.m115539a() || updateAweme.getStatus().getPrivateStatus() != 1) {
                                    this.f94450Q = updateAweme;
                                    C7705c.m23799a().mo20397g(anVar);
                                    if (this.f94473o == null) {
                                        this.f94452S = true;
                                    } else {
                                        m116347S();
                                    }
                                }
                            }
                        } else if (this.f94466h == 14 && C35778a.m115539a()) {
                            Aweme updateAweme2 = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) anVar.f74632b);
                            if (updateAweme2 != null && updateAweme2.getStatus().getPrivateStatus() == 1) {
                                C25673a aVar = (C25673a) this.f94473o.mo66539h();
                                if (aVar instanceof C36018b) {
                                    this.f94453T = true;
                                    ((C36018b) aVar).mo91665b(updateAweme2);
                                }
                            }
                        }
                    }
                } else if (this.f94467i && this.f94466h == 1) {
                    String str = (String) anVar.f74632b;
                    Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
                    if (awemeById == null) {
                        awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getProfileSelfSeeAweme(str, this.f94466h);
                    }
                    if (awemeById != null && awemeById.getAwemeType() != 13 && awemeById.getUserDigg() != 0 && !m116367b(awemeById) && this.f94473o.mo66570a((Object) awemeById, 0)) {
                    }
                }
            } else if (this.f94467i && this.f94466h == 0) {
                String str2 = (String) anVar.f74632b;
                if (isViewValid() && !TextUtils.isEmpty(str2)) {
                    Aweme a2 = C28482e.m93605a(str2);
                    ((C36018b) this.f94473o.mo66539h()).mo91654a(a2, this.f94464f);
                    if (this.f94473o.mo66569a((Object) a2)) {
                        this.f94471m.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo86903b(boolean z) {
        if (this.f94447J != z) {
            if (this.f94482x) {
                m116339K();
            }
            this.f94447J = z;
            m116345Q();
            this.f94474p.mo25943g();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m116365a(String str, C27311c cVar) {
        if (!TextUtils.equals(cVar.mo70221aj(), str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo90826b(String str, String str2) {
        this.f94455V = str;
        this.f94456W = str2;
    }

    /* renamed from: a */
    public static DmtTextView m116352a(Context context, int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.ss));
        dmtTextView.setTextColor(context.getResources().getColor(R.color.a51));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    /* renamed from: c */
    private void m116368c(Context context, boolean z) {
        if (this.f94440B != null) {
            this.f94440B.setGravity(17);
            this.f94440B.setText(m116372h(z));
            this.f94440B.setLineSpacing(C9738o.m28708b(context, 12.0f), 1.0f);
            if (context != null) {
                this.f94440B.setTextColor(context.getResources().getColor(R.color.a51));
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f94467i && this.f94466h == 0) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().registerDraftListener(this.f94460aa);
        }
        mo91908p();
    }

    /* renamed from: a */
    private static DmtTextView m116353a(Context context, String str) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.ss));
        dmtTextView.setTextColor(context.getResources().getColor(R.color.a51));
        dmtTextView.setText(str);
        return dmtTextView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final DmtTextView mo91895b(Context context, boolean z) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.ss));
        this.f94461ab = z;
        dmtTextView.setGravity(17);
        dmtTextView.setText(m116372h(z));
        dmtTextView.setLineSpacing(C9738o.m28708b(context, 12.0f), 1.0f);
        if (context != null) {
            dmtTextView.setTextColor(context.getResources().getColor(R.color.a51));
        }
        this.f94440B = dmtTextView;
        return dmtTextView;
    }

    /* renamed from: b */
    public final void mo59108b(List<Aweme> list, boolean z) {
        if (isViewValid()) {
            this.f94471m.ai_();
            this.f94471m.f93526w = z;
            if (C36074j.f94315a.shouldUseRecyclerPartialUpdate()) {
                this.f94471m.mo61577b(list);
            } else {
                this.f94471m.mo58045a(list);
            }
            this.f94459Z = z;
            if (this.f94471m.mo60557c() == 0 && !z && this.f94474p.mo25945i()) {
                m116345Q();
                this.f94474p.mo25943g();
            } else if (C6307b.m19566a((Collection<T>) list) && z && !this.f94449L && !this.f94447J) {
                bd_();
            } else if (!C6307b.m19566a((Collection<T>) list)) {
                this.f94474p.mo25938c(true);
            }
            mo59100a(z);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m116355a(String str, long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        String str2 = "group_id";
        if (str == null) {
            str = "";
        }
        try {
            jSONObject.put(str2, str);
            C41959a.f109023a = SystemClock.uptimeMillis() - j;
            jSONObject.put("duration", String.valueOf(C41959a.f109023a));
        } catch (JSONException unused) {
        }
        C6759a.m20910a("post_list", jSONObject);
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C23147b.f61094a.mo60289a((Activity) getActivity(), mo91897l(), layoutInflater, viewGroup);
        this.f94470l = (RecyclerView) a.findViewById(R.id.ajd);
        this.f94454U = (ViewStub) a.findViewById(R.id.dco);
        this.f94480v = (ViewStub) a.findViewById(R.id.dcm);
        if (this.f94470l instanceof FpsRecyclerView) {
            ((FpsRecyclerView) this.f94470l).setLabel("profile_list");
        }
        if (C36074j.f94315a.shouldUseRecyclerPartialUpdate() && this.f94470l.getItemAnimator() != null) {
            this.f94470l.getItemAnimator().f4940i = 0;
        }
        if (C6399b.m19944t()) {
            if (((Integer) C23060u.m75742a().mo60075e().mo59877d()).intValue() == 0) {
                this.f94483y = m116351a(a, this.f94467i, this.f95164O, false);
            } else {
                this.f94483y = m116351a(a, this.f94467i, this.f95164O, true);
            }
        }
        if (!this.f94458Y) {
            this.f94474p = (DmtStatusView) a.findViewById(R.id.dav);
            mo91899n();
        }
        return a;
    }

    /* renamed from: a */
    public static int m116350a(boolean z, boolean z2, boolean z3, int i) {
        int i2;
        int i3;
        if (C6399b.m19944t() || ((!z && !z2) || z3)) {
            if (z3) {
                if (i == 0) {
                    return R.string.b13;
                }
                if (i != 1 || C43122ff.m136767b()) {
                    return R.string.cj0;
                }
                if (((Integer) C23060u.m75742a().mo60075e().mo59877d()).intValue() == 0) {
                    return R.string.bz7;
                }
                return R.string.bz8;
            } else if (i == 0) {
                return R.string.flx;
            } else {
                if (i == 4) {
                    return R.string.b0n;
                }
                return R.string.fls;
            }
        } else if (i == 0) {
            if (z2) {
                i3 = R.string.ty;
            } else {
                i3 = 0;
            }
            if (z) {
                return R.string.tk;
            }
            return i3;
        } else if (i != 1) {
            return 0;
        } else {
            if (z2) {
                i2 = R.string.u0;
            } else {
                i2 = 0;
            }
            if (z) {
                return R.string.tn;
            }
            return i2;
        }
    }

    /* renamed from: a */
    public static View m116351a(View view, boolean z, String str, boolean z2) {
        int i;
        int i2;
        final Context context = view.getContext();
        if (!z || !TextUtils.equals(str, C43105eq.m136725a(1)) || C43122ff.m136767b() || !((Boolean) C23060u.m75742a().mo60074d().mo59877d()).booleanValue() || ((Boolean) C23060u.m75742a().mo60076f().mo59877d()).booleanValue() || ((Boolean) C23060u.m75742a().mo60072b().mo59877d()).booleanValue() || C36075k.f94317a.mo59240a() || !z2) {
            return null;
        }
        final View findViewById = view.findViewById(R.id.atq);
        TextView textView = (TextView) view.findViewById(R.id.bly);
        ImageView imageView = (ImageView) view.findViewById(R.id.b7g);
        if (C6399b.m19947w()) {
            imageView.setImageResource(R.drawable.a4t);
            textView.setTextColor(context.getResources().getColor(R.color.ab0));
            findViewById.setBackgroundColor(context.getResources().getColor(R.color.el));
        } else if (C6399b.m19946v()) {
            textView.setTextColor(context.getResources().getColor(R.color.a5r));
        }
        if (C6399b.m19944t()) {
            i = R.string.d7i;
        } else {
            i = R.string.bd3;
        }
        String string = context.getString(i);
        if (C6399b.m19944t()) {
            i2 = R.string.d7f;
        } else {
            i2 = R.string.doe;
        }
        String string2 = context.getString(i2);
        if (C6399b.m19944t()) {
            string = C1642a.m8034a(string, new Object[]{context.getString(R.string.d7f)});
        }
        SpannableString spannableString = new SpannableString(string);
        int indexOf = string.indexOf(string2);
        int length = string2.length() + indexOf;
        if (indexOf >= 0 && length >= 0) {
            spannableString.setSpan(new ClickableSpan() {
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }

                public final void onClick(View view) {
                    C23060u.m75742a().mo60072b().mo59871a(Boolean.valueOf(true));
                    findViewById.setVisibility(8);
                    SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
                }
            }, indexOf, length, 18);
            spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.lo)), indexOf, length, 18);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        imageView.setOnClickListener(new C36559i(findViewById));
        return findViewById;
    }

    /* renamed from: a */
    public static AwemeListFragment m116354a(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle) {
        AwemeListFragmentImpl awemeListFragmentImpl = new AwemeListFragmentImpl();
        bundle.putInt("type", i2);
        bundle.putString("uid", str);
        bundle.putString("sec_user_id", str2);
        bundle.putBoolean("is_my_profile", z);
        bundle.putInt("bottom_bar_height", i);
        bundle.putBoolean("should_refresh_on_init_data", z2);
        awemeListFragmentImpl.setArguments(bundle);
        return awemeListFragmentImpl;
    }
}

package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0688e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFragment;
import com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29359f;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.C29400c;
import com.p280ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p280ss.android.ugc.aweme.follow.presenter.C29452a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.forward.p1271e.C29903d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.data.C30245a;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.live.model.C32532b;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.newfollow.model.C34147d;
import com.p280ss.android.ugc.aweme.newfollow.p1421d.C34125a;
import com.p280ss.android.ugc.aweme.newfollow.p1421d.C34126b;
import com.p280ss.android.ugc.aweme.newfollow.p1421d.C34127c;
import com.p280ss.android.ugc.aweme.newfollow.p1421d.C34134g;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.C34271f;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p994af.C22471a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService.OnPublishCallback;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40232d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1609b.C40717a;
import com.p280ss.android.ugc.aweme.story.p1652a.C41966a;
import com.p280ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43076dy;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment */
public class FollowFeedFragment extends FeedFragment {

    /* renamed from: A */
    private String f89018A;

    /* renamed from: B */
    private String f89019B;

    /* renamed from: C */
    private String f89020C;

    /* renamed from: D */
    private Integer f89021D;

    /* renamed from: e */
    public C34271f f89022e;

    /* renamed from: f */
    public boolean f89023f;

    /* renamed from: g */
    public View f89024g;

    /* renamed from: h */
    public View f89025h;

    /* renamed from: i */
    public boolean f89026i;

    /* renamed from: j */
    public long f89027j;

    /* renamed from: k */
    private C34126b f89028k;

    /* renamed from: l */
    private C34127c f89029l;

    /* renamed from: s */
    private C29452a f89030s;

    /* renamed from: t */
    private C34125a f89031t;

    /* renamed from: u */
    private C29359f f89032u;

    /* renamed from: v */
    private BroadcastReceiver f89033v;

    /* renamed from: w */
    private C34134g f89034w;

    /* renamed from: x */
    private View f89035x;

    /* renamed from: y */
    private String f89036y;

    /* renamed from: z */
    private String f89037z;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    public void onDetach() {
        super.onDetach();
    }

    @C7709l
    public void onLiveRoomScrollEvent(C32532b bVar) {
    }

    @C7709l
    public void onStoryPublishAnimEnd(C41966a aVar) {
    }

    /* renamed from: p */
    public final void mo73821p() {
    }

    /* renamed from: w */
    public final int mo73844w() {
        return this.f75686o;
    }

    /* renamed from: a */
    public final List<FollowFeed> mo86856a() {
        return this.f89030s.f77666g;
    }

    /* renamed from: d */
    private C34126b m110096d() {
        if (this.f89028k == null) {
            this.f89028k = new C34126b(this);
        }
        return this.f89028k;
    }

    /* renamed from: f */
    private C34125a m110098f() {
        if (this.f89031t == null) {
            this.f89031t = new C34125a();
        }
        return this.f89031t;
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("homepage_follow");
    }

    public void onStop() {
        super.onStop();
        if (this.f89022e != null) {
            this.f89022e.mo75169g();
        }
        this.f89023f = false;
    }

    /* renamed from: e */
    private C34127c m110097e() {
        if (this.f89029l == null) {
            this.f89029l = new C34127c(getContext(), this.f75685n);
        }
        return this.f89029l;
    }

    public void onResume() {
        super.onResume();
        if (this.mUserVisibleHint && !C43076dy.m136656a()) {
            if (this.f89022e != null) {
                this.f89022e.mo75168f();
            }
            mo73841t();
            this.f89023f = true;
        }
    }

    /* renamed from: g */
    private boolean m110099g() {
        if (C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false) && (getActivity() instanceof MainActivity)) {
            return FollowEnterDetailViewModel.m96850a("FollowFeedFragment", getActivity()).f77626a;
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.f18760c_ = false;
        if (this.f89022e != null) {
            this.f89022e.mo75171h();
        }
        if (getActivity() != null) {
            if ((getActivity() instanceof MainActivity) && ((MainActivity) getActivity()).isUnderSecondTab()) {
                mo73842u();
            }
            this.f89023f = false;
            C34202f.m110435a().mo86951d();
        }
    }

    /* renamed from: t */
    public final void mo73841t() {
        if (getActivity() != null && (getActivity() instanceof MainActivity) && ((MainActivity) getActivity()).isUnderSecondTab() && !C43076dy.m136656a()) {
            C34138b.m109963a();
        }
    }

    /* renamed from: u */
    public final void mo73842u() {
        if (C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false)) {
            if (!m110099g()) {
                C34138b.m109987a(mo73843v(), "list");
            }
        } else if (!C29371f.m96475a().mo75105b()) {
            C34138b.m109987a(mo73843v(), "list");
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f89028k != null) {
            this.f89028k.mo59134U_();
            this.f89028k.mo66535W_();
            this.f89028k.mo75070g();
            this.f89028k.mo75069f();
        }
        if (this.f89031t != null) {
            this.f89031t.mo59134U_();
            this.f89031t.mo66535W_();
            this.f89031t.mo86792f();
        }
        if (this.f89032u != null) {
            this.f89032u.mo59134U_();
            this.f89032u.mo66535W_();
            this.f89032u.mo75087g();
        }
        if (this.f89022e != null) {
            this.f89022e.mo75173j();
        }
        C0688e.m2941a(getContext()).mo2837a(this.f89033v);
        C29371f.m96475a().mo75101a("key_container_follow");
        C29903d.m97930a().mo75967b();
    }

    @C7709l
    public void onVoteEvent(C40717a aVar) {
        this.f89022e.mo87036a(aVar);
    }

    /* renamed from: b */
    public final void mo73838b(long j) {
        if (this.f89030s != null) {
            this.f89030s.f77664e = j;
        }
    }

    /* renamed from: d_ */
    public final boolean mo73772d_(boolean z) {
        if (z && this.f89022e != null) {
            this.f89022e.mo87044l();
        }
        this.f89028k.mo86794b(z);
        if (this.f89022e != null) {
            this.f89022e.mo87040b(this.f89021D);
        }
        return false;
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v2/follow/feed/?")) {
            C42961az.m136385f(aVar);
            mo73772d_(false);
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f89022e != null) {
            this.f89022e.mo75546f_(!z);
        }
        if (z) {
            this.f89030s.mo75449c();
            this.f89027j = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo73837a(Bundle bundle) {
        super.mo73837a(bundle);
        this.f89026i = bundle.getBoolean("extra_follow_lazy_refresh", false);
        this.f89019B = bundle.getString("extra_story_insert_uid");
        this.f89020C = bundle.getString("extra_insert_aweme_id");
        m110097e().f88923a = this.f75685n;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(activity)) {
            if (activity instanceof MainActivity) {
                MainActivity mainActivity = (MainActivity) activity;
                mo86857a(mainActivity.getBinder(), mainActivity.getProcessedCallback());
            }
        } else if (activity instanceof MainActivity) {
            this.f89029l = m110097e();
            this.f89029l.mo86803a(false);
        }
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if ((TextUtils.equals("aweme", shareCompleteEvent.itemType) && TextUtils.equals("homepage_follow", shareCompleteEvent.enterFrom) && TextUtils.equals("extra_follow_type_follow", this.f75688q)) || (TextUtils.equals("homepage_friends", shareCompleteEvent.enterFrom) && TextUtils.equals("extra_follow_type_friend", this.f75688q))) {
            C43091ed.m136696a(getActivity(), this.f89035x, shareCompleteEvent);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C22471a.m74350a();
        C22471a.m74351a(TextUtils.equals(this.f75688q, "extra_follow_type_follow"));
        if (this.f89022e != null) {
            this.f89022e.mo75165c(z);
        }
        if (z) {
            mo73841t();
            if (getActivity() != null) {
                FriendTabViewModel.m110119a(getActivity()).f89047b.setValue(new C34171e(this.f75685n, true));
            }
        } else {
            mo73842u();
        }
    }

    /* renamed from: a */
    public final void mo86857a(C40232d dVar, OnPublishCallback onPublishCallback) {
        this.f89029l = m110097e();
        this.f89029l.f88924b = onPublishCallback;
        this.f89029l.mo86802a(dVar);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f89024g = view.findViewById(R.id.bjh);
        this.f89025h = view.findViewById(R.id.bgr);
        this.f89031t = m110098f();
        this.f89031t.mo86791e();
        this.f89032u = new C29359f(this.f75685n, this.f75686o);
        this.f89032u.mo75086f();
        this.f89022e = new C34271f();
        this.f89022e.f89402l = this.f75688q;
        this.f89022e.f89403m = this.f75685n;
        this.f89032u.mo66536a(new C28471v());
        this.f89032u.mo66537a((C29400c) this.f89022e);
        this.f89033v = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && FollowFeedFragment.this.mUserVisibleHint && FollowFeedFragment.this.f18760c_ && !FollowFeedFragment.this.f89023f) {
                    if (FollowFeedFragment.this.f89022e != null) {
                        FollowFeedFragment.this.f89022e.mo75168f();
                    }
                    FollowFeedFragment.this.mo73841t();
                    FollowFeedFragment.this.f89023f = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0688e.m2941a(getContext()).mo2838a(this.f89033v, intentFilter);
        this.f89028k = m110096d();
        this.f89028k.mo75055a((Fragment) this, mo73844w());
        this.f89028k.mo66537a(this.f89022e);
        this.f89022e.f89406p = this.f89019B;
        this.f89022e.mo87043f(this.f89026i);
        this.f89022e.mo87034a(this, view, this.f89028k, this.f89032u);
        m110097e().mo86801a(this.f89022e);
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(getContext())) {
            m110097e().mo86800a();
        }
        this.f89034w = new C34134g();
        this.f89034w.mo86814a(this.f89022e);
        this.f89030s = new C29452a();
        this.f89030s.f77661b = this.f75685n;
        this.f89030s.f77662c = this.f75688q;
        this.f89028k.mo66536a(this.f89030s);
        this.f89030s.f77664e = System.currentTimeMillis();
        if (getActivity() instanceof MainActivity) {
            C30245a aVar = HomePageDataViewModel.m98904a(getActivity()).f79563b;
            this.f89036y = aVar.mo79697a();
            this.f89037z = aVar.mo79698b();
            this.f89018A = aVar.mo79699c();
        }
        if (TextUtils.isEmpty(this.f89036y)) {
            this.f89036y = this.f89020C;
        }
        if (!this.f89026i) {
            if (TextUtils.equals(this.f75685n, "homepage_follow")) {
                FollowPageFirstFrameViewModel.m136066a(getActivity()).mo104571a();
            }
            this.f89022e.mo87037a(this.f89036y, this.f89037z, this.f89018A);
        }
        this.f89031t.mo66537a(this.f89022e);
        this.f89031t.mo66536a(new C34147d());
        if (!C6399b.m19944t() || TextUtils.equals(this.f75685n, "rec_follow")) {
            view.findViewById(R.id.dal).setVisibility(8);
        }
        this.f89035x = view.findViewById(R.id.d8i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            mo73772d_(false);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.pj, viewGroup, false);
        C25713b.m84475a(inflate.findViewById(R.id.dal));
        return inflate;
    }
}

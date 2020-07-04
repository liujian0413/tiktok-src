package com.p280ss.android.ugc.aweme.notification;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.facebook.common.util.C13337d;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.ILegacyService;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide.C34161a;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide.EnterFrom;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.p1426ab.MTTutorialVideoExperiment;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34318a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34325e;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.bridgeservice.C34408a;
import com.p280ss.android.ugc.aweme.notification.bridgeservice.INoticeBridgeService;
import com.p280ss.android.ugc.aweme.notification.followrequest.p1439a.C34445a;
import com.p280ss.android.ugc.aweme.notification.followrequest.p1439a.C34447b;
import com.p280ss.android.ugc.aweme.notification.followrequest.p1439a.C34448c;
import com.p280ss.android.ugc.aweme.notification.p1434c.C34415a;
import com.p280ss.android.ugc.aweme.notification.p1436e.C34439a;
import com.p280ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.C34637f;
import com.p280ss.android.ugc.aweme.notification.view.C34641a;
import com.p280ss.android.ugc.aweme.notification.view.C34641a.C34642a;
import com.p280ss.android.ugc.aweme.notification.view.C34643b;
import com.p280ss.android.ugc.aweme.notification.view.NoticeView;
import com.p280ss.android.ugc.aweme.notification.view.copy.C34647a;
import com.p280ss.android.ugc.aweme.p1355k.p1356a.C32263a;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.p324d.C32008b;
import com.p280ss.android.ugc.aweme.p313im.service.p324d.C7095a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.notification.NewsFragment */
public class NewsFragment extends AmeBaseFragment implements C0053p<TutorialVideoResp>, C34318a, C34448c, C34641a {

    /* renamed from: q */
    public static String f89575q = "";

    /* renamed from: A */
    private NotificationPushGuide f89576A;

    /* renamed from: B */
    private DmtStatusView f89577B;

    /* renamed from: C */
    private boolean f89578C = true;

    /* renamed from: D */
    private Fragment f89579D;

    /* renamed from: e */
    public DmtTextView f89580e;

    /* renamed from: f */
    public View f89581f;

    /* renamed from: g */
    public View f89582g;

    /* renamed from: h */
    public View f89583h;

    /* renamed from: i */
    public AvatarImageView f89584i;

    /* renamed from: j */
    public DmtTextView f89585j;

    /* renamed from: k */
    public DmtButton f89586k;

    /* renamed from: l */
    public C34409c f89587l;

    /* renamed from: m */
    public TutorialVideoViewModel f89588m;

    /* renamed from: n */
    public C34408a f89589n;

    /* renamed from: o */
    public RecyclerView f89590o;

    /* renamed from: p */
    public BaseAdapter<BaseNotice> f89591p;

    /* renamed from: r */
    public String f89592r;

    /* renamed from: s */
    private NoticeView f89593s;

    /* renamed from: t */
    private View f89594t;

    /* renamed from: u */
    private com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView f89595u;

    /* renamed from: v */
    private boolean f89596v;

    /* renamed from: w */
    private C34415a f89597w;

    /* renamed from: x */
    private C34447b f89598x;

    /* renamed from: y */
    private C34374a f89599y;

    /* renamed from: z */
    private C34643b f89600z;

    /* renamed from: com.ss.android.ugc.aweme.notification.NewsFragment$a */
    class C34374a implements OnClickListener {
        C34374a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (NewsFragment.this.f89583h.getVisibility() == 0 && NewsFragment.this.f89588m != null) {
                NewsFragment.this.f89588m.mo87893a(2);
                if (!TextUtils.isEmpty(NewsFragment.this.f89592r)) {
                    C7195s a = C7195s.m22438a();
                    StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                    sb.append(NewsFragment.this.f89592r);
                    a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "fans").mo18695a());
                    NewsFragment.m111069a("enter_teach_video", NewsFragment.this.f89592r);
                }
            }
        }
    }

    /* renamed from: a */
    public final Fragment mo87143a() {
        return this;
    }

    /* renamed from: j */
    private void m111071j() {
        if (this.f89597w == null) {
            this.f89597w = new C34415a();
        }
    }

    /* renamed from: r */
    private void m111079r() {
        if (this.f89579D instanceof C7095a) {
            ((C7095a) this.f89579D).mo18103a(f89575q);
        }
    }

    /* renamed from: e */
    public final void mo87625e() {
        this.f89582g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                NewsFragment.this.mo87628i();
            }
        });
    }

    /* renamed from: m */
    private void m111074m() {
        if (this.f89596v && (this.f89579D instanceof C7095a)) {
            this.f89596v = false;
            ((C7095a) this.f89579D).mo18102a((C32008b) new C32008b() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ C7581n mo87630a() {
                    NewsFragment.this.f89590o.setVisibility(8);
                    return null;
                }

                /* renamed from: a */
                public final void mo82978a(RecyclerView recyclerView, View view, View view2, ViewStub viewStub) {
                    if (recyclerView != null) {
                        NewsFragment.this.f89587l.mo87729a(recyclerView, NewsFragment.this.getContext());
                        NewsFragment.this.f89587l.mo87731b();
                    }
                    NewsFragment.this.f89582g = view;
                    if (NewsFragment.this.f89582g != null) {
                        NewsFragment.this.mo87625e();
                        NewsFragment.this.f89580e = (DmtTextView) NewsFragment.this.f89582g.findViewWithTag("tag_msg_follow_request_count");
                        NewsFragment.this.f89581f = NewsFragment.this.f89582g.findViewWithTag("tag_msg_follow_request_unread_dot");
                    }
                    NewsFragment.this.f89583h = view2;
                    if (NewsFragment.this.f89583h != null) {
                        NewsFragment.this.f89584i = (AvatarImageView) NewsFragment.this.f89583h.findViewWithTag("tag_msg_tutorial_video_head");
                        NewsFragment.this.f89585j = (DmtTextView) NewsFragment.this.f89583h.findViewWithTag("tag_msg_tutorial_video_content");
                        NewsFragment.this.f89586k = (DmtButton) NewsFragment.this.f89583h.findViewWithTag("tag_msg_tutorial_video_watch");
                        NewsFragment.this.mo87626f();
                    }
                    if (C6399b.m19946v() && viewStub != null) {
                        viewStub.setLayoutResource(R.layout.a9g);
                        NewsFragment.this.f89590o = (RecyclerView) viewStub.inflate();
                        NewsFragment.this.f89590o.setLayoutManager(new WrapLinearLayoutManager(NewsFragment.this.getContext()) {
                            /* renamed from: f */
                            public final boolean mo5441f() {
                                return false;
                            }
                        });
                        NewsFragment.this.f89591p = ((INoticeBridgeService) ServiceManager.get().getService(INoticeBridgeService.class)).getMsgHeadExtraAdapter(NewsFragment.this, new C34438e(this));
                        if (NewsFragment.this.f89591p != null) {
                            NewsFragment.this.f89591p.mo66516d(false);
                            NewsFragment.this.f89590o.setAdapter(NewsFragment.this.f89591p);
                            NewsFragment.this.f89590o.setFocusable(false);
                            if (NewsFragment.this.f89589n != null) {
                                NewsFragment.this.f89589n.mo87725a(NewsFragment.this.f89591p);
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo87144b() {
        if (C32263a.m104776b()) {
            Fragment a = getChildFragmentManager().mo2644a("session");
            if (a instanceof C7095a) {
                ((C7095a) a).mo18108g();
            }
        }
    }

    /* renamed from: d */
    public final void mo87146d() {
        if (this.f89579D != null) {
            this.f89579D.onPause();
            if (this.f89579D instanceof C7095a) {
                ((C7095a) this.f89579D).mo18104a(true);
            }
        }
    }

    /* renamed from: g */
    public final void mo87627g() {
        if (isViewValid()) {
            m111078q();
            if (this.f89582g.getVisibility() == 0) {
                this.f89581f.setVisibility(0);
            }
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f89597w != null) {
            this.f89597w.mo87736a();
        }
        if (this.f89587l != null) {
            this.f89587l.mo87726a();
        }
    }

    public void onStart() {
        super.onStart();
        ((ILegacyService) ServiceManager.get().getService(ILegacyService.class)).getUgAllService().mo57945d(getContext());
    }

    /* renamed from: q */
    private void m111078q() {
        if (this.f89598x == null) {
            this.f89598x = new C34447b();
            this.f89598x.mo66536a(new C34445a());
            this.f89598x.mo66537a(this);
            this.f89598x.mo56976a(new Object[0]);
            return;
        }
        this.f89598x.mo56976a(new Object[0]);
    }

    /* renamed from: f */
    public final void mo87626f() {
        C34626j.m111876a(this.f89584i);
        C34626j.m111876a(this.f89586k);
        this.f89599y = new C34374a();
        this.f89583h.setOnClickListener(this.f89599y);
        this.f89584i.setOnClickListener(this.f89599y);
        this.f89586k.setOnClickListener(this.f89599y);
    }

    /* renamed from: i */
    public final void mo87628i() {
        this.f89581f.setVisibility(8);
        if (getActivity() != null) {
            startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://follow_request").buildIntent(), PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: k */
    private void m111072k() {
        Intent intent = getActivity().getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("label");
            String stringExtra2 = intent.getStringExtra("uid");
            intent.putExtra("label", "");
            if (TextUtils.equals(stringExtra, "follow_request")) {
                startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://follow_request").withParam("label", stringExtra).withParam("uid", stringExtra2).buildIntent(), PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
    }

    /* renamed from: l */
    private void m111073l() {
        IIMService a = C32263a.m104774a();
        if (a != null) {
            this.f89579D = getChildFragmentManager().mo2644a("session");
            if (this.f89579D == null && a.getSessionListFragment() != null) {
                this.f89579D = a.getSessionListFragment().mo18105d();
                m111079r();
            }
            if (this.f89579D == null) {
                m111076o();
                return;
            }
            m111074m();
            if (!this.f89579D.isAdded()) {
                C0633q a2 = getChildFragmentManager().mo2645a();
                a2.mo2586a(R.id.c43, this.f89579D, "session");
                a2.mo2606d();
                return;
            }
            C0633q a3 = getChildFragmentManager().mo2645a();
            a3.mo2605c(this.f89579D);
            a3.mo2606d();
            return;
        }
        m111076o();
    }

    /* renamed from: o */
    private void m111076o() {
        Fragment a = getChildFragmentManager().mo2644a("notice");
        if (a == null) {
            a = new NotificationDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("from_where", 10);
            a.setArguments(bundle);
        }
        if (!a.isAdded()) {
            C0633q a2 = getChildFragmentManager().mo2645a();
            a2.mo2586a(R.id.c43, a, "session");
            a2.mo2606d();
        } else {
            C0633q a3 = getChildFragmentManager().mo2645a();
            a3.mo2605c(a);
            a3.mo2606d();
        }
        m111077p();
    }

    /* renamed from: c */
    public final void mo87145c() {
        onResume();
        if (this.f89579D != null) {
            this.f89579D.onResume();
            if (this.f89579D instanceof C7095a) {
                ((C7095a) this.f89579D).mo18104a(false);
            }
        }
        if (!C6399b.m19944t() && this.f89600z != null) {
            this.f89600z.mo87937a();
        }
        if (this.f89587l != null) {
            this.f89587l.mo87731b();
        }
        m111079r();
        if (C6399b.m19944t() && C34439a.f89873b.getEnablePushGuide() != 0 && this.f89576A != null) {
            this.f89576A.mo86880a();
        }
    }

    public void onResume() {
        super.onResume();
        m111072k();
        m111078q();
        if (C6399b.m19944t() && !C34637f.m111897a() && C6384b.m19835a().mo15292a(MTTutorialVideoExperiment.class, true, "mt_tutorial_video", C6384b.m19835a().mo15295d().mt_tutorial_video, false)) {
            this.f89588m.mo87893a(1);
        }
        if (C6399b.m19946v() && C27688b.m90838b() && this.f89589n != null) {
            this.f89589n.mo87723a();
        }
        C6726a.m20843a(new Runnable() {
            public final void run() {
                if (NewsFragment.this.isAdded()) {
                    C34315c.m110984c(0, 1000);
                }
            }
        }, 1000);
        if (!this.f89578C && this.f89587l != null) {
            this.f89587l.mo87731b();
        }
        this.f89578C = false;
    }

    /* renamed from: n */
    private void m111075n() {
        this.f89595u.setIconImage((int) R.drawable.adu);
        SpannableString spannableString = new SpannableString(C23481i.m77091b(R.string.btg));
        String b = C23481i.m77091b(R.string.bth);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(" ");
        String sb2 = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString2 = new SpannableString(sb2);
        spannableString2.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.a1f)), 0, spannableString2.length(), 34);
        spannableStringBuilder.append(spannableString2);
        if (getContext() != null) {
            spannableString.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.a1g)), 0, spannableString.length(), 34);
            spannableStringBuilder.append(spannableString);
        }
        this.f89595u.setTitleText((CharSequence) spannableStringBuilder);
    }

    /* renamed from: p */
    private void m111077p() {
        if (this.f89596v && this.f89594t != null) {
            this.f89596v = false;
            this.f89594t.findViewById(R.id.u).setVisibility(0);
            this.f89582g = this.f89594t.findViewById(R.id.bio);
            this.f89580e = (DmtTextView) this.f89594t.findViewById(R.id.dys);
            this.f89581f = this.f89594t.findViewById(R.id.c5g);
            RecyclerView recyclerView = (RecyclerView) this.f89594t.findViewById(R.id.cxm);
            mo87625e();
            this.f89587l.mo87729a(recyclerView, getContext());
            this.f89583h = this.f89594t.findViewById(R.id.dpt);
            this.f89583h.setVisibility(8);
            this.f89584i = (AvatarImageView) this.f89594t.findViewById(R.id.c6v);
            this.f89585j = (DmtTextView) this.f89594t.findViewById(R.id.c60);
            this.f89586k = (DmtButton) this.f89594t.findViewById(R.id.c5q);
            mo87626f();
        }
    }

    /* renamed from: a */
    public final void mo87623a(Exception exc) {
        C34647a.m111928a(getContext(), exc);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(TutorialVideoResp tutorialVideoResp) {
        if (isViewValid() && this.f89583h != null) {
            try {
                this.f89592r = ((C34325e) C34323d.m111009a(C34325e.class)).mo60348a("");
            } catch (Exception unused) {
                this.f89592r = "";
            }
            if (!TextUtils.isEmpty(this.f89592r)) {
                m111070b(tutorialVideoResp);
                m111069a("show_teach_video", this.f89592r);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C34637f.m111897a()) {
            this.f89577B.setVisibility(0);
            this.f89577B.mo25943g();
            return;
        }
        if (C32263a.m104776b()) {
            m111073l();
        } else {
            m111076o();
        }
        m111071j();
        this.f89597w.mo87739a((C34641a) this);
    }

    /* renamed from: a */
    public final void mo87621a(int i) {
        String str;
        if (isViewValid() && this.f89582g != null) {
            if (this.f89598x == null || i <= 0) {
                this.f89582g.setVisibility(8);
                return;
            }
            if (this.f89582g.getVisibility() == 8) {
                this.f89581f.setVisibility(0);
            }
            this.f89582g.setVisibility(0);
            if (i > 99) {
                str = "99+";
            } else {
                str = String.valueOf(i);
            }
            this.f89580e.setFontType(C10834d.f29337g);
            this.f89580e.setText(getString(R.string.b8u, str));
        }
    }

    /* renamed from: b */
    private void m111070b(TutorialVideoResp tutorialVideoResp) {
        String str;
        String str2;
        String str3;
        try {
            C34325e eVar = (C34325e) C34323d.m111009a(C34325e.class);
            str2 = eVar.mo60350c(getString(R.string.cjv));
            str = eVar.mo60352e(getString(R.string.cjw));
            str3 = eVar.mo60354g(getString(R.string.cjx));
        } catch (Exception unused) {
            str2 = getString(R.string.cjv);
            str = getString(R.string.cjw);
            str3 = getString(R.string.cjx);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C6399b.m19921a().getResources().getColor(R.color.a5d)) {
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setFakeBoldText(true);
            }
        }, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.append(str);
        this.f89585j.setText(spannableStringBuilder);
        this.f89585j.setTextColor(getResources().getColor(R.color.a8f));
        this.f89584i.setImageURI(C13337d.m39030a((int) R.drawable.bi_));
        this.f89586k.setText(str3);
        this.f89583h.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo87624a(List<C34642a> list) {
        if (isViewValid()) {
            this.f89587l.mo87730a(list);
        }
    }

    /* renamed from: a */
    public final void mo87622a(int i, int i2) {
        if (isViewValid()) {
            this.f89587l.mo87728a(i, i2);
        }
    }

    /* renamed from: a */
    public static void m111069a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("group_id", str2).f60753a);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f89596v = true;
        this.f89587l = new C34409c(view.getContext());
        if (!C6399b.m19944t()) {
            this.f89600z = new C34643b(this.f89593s);
            this.f89600z.mo87937a();
        } else if (C34439a.f89873b.getEnablePushGuide() != 0) {
            m111075n();
            this.f89576A = new NotificationPushGuide(this.f89595u, new C34161a() {
                /* renamed from: a */
                public final void mo75676a(Context context) {
                    C6903bc.m21505x().mo57947e(context);
                }

                /* renamed from: b */
                public final boolean mo75677b(Context context) {
                    return C6903bc.m21505x().mo57949f(context);
                }
            });
            this.f89576A.f89060c = EnterFrom.Message;
            this.f89576A.mo86880a();
        }
        this.f89588m = (TutorialVideoViewModel) C0069x.m157a((Fragment) this).mo147a(TutorialVideoViewModel.class);
        this.f89588m.f90327a.observe(this, this);
        if (C6399b.m19946v() && C27688b.m90838b()) {
            this.f89589n = ((INoticeBridgeService) ServiceManager.get().getService(INoticeBridgeService.class)).getViewModelHelper();
            if (this.f89589n != null) {
                this.f89589n.mo87724a((Fragment) this);
            }
        }
        this.f89577B.setBuilder(C10803a.m31631a((Context) getActivity()).mo25961a(new C10806a(getActivity()).mo25990b((int) R.string.bxe).mo25991b("").f29135a));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024) {
            m111078q();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f89594t = layoutInflater.inflate(R.layout.pk, viewGroup, false);
        this.f89593s = (NoticeView) this.f89594t.findViewById(R.id.c5h);
        this.f89595u = (com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView) this.f89594t.findViewById(R.id.asi);
        this.f89577B = (DmtStatusView) this.f89594t.findViewById(R.id.dav);
        return this.f89594t;
    }
}

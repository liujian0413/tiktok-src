package com.p280ss.android.ugc.aweme.message;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.C21084a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble;
import com.p280ss.android.ugc.aweme.main.p1385g.C33026l;
import com.p280ss.android.ugc.aweme.message.adapter.MessagePagerAdapter;
import com.p280ss.android.ugc.aweme.message.widget.PagerIndicator;
import com.p280ss.android.ugc.aweme.message.widget.PagerIndicator.C33219a;
import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34318a;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.p324d.C7095a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.message.MessagesFragment */
public class MessagesFragment extends AmeBaseFragment implements C33219a {

    /* renamed from: e */
    MessagePagerAdapter f86402e;

    /* renamed from: f */
    private View f86403f;

    /* renamed from: g */
    private int f86404g = 1;

    /* renamed from: h */
    private AnalysisStayTimeFragmentComponent f86405h;

    /* renamed from: i */
    private C10751a f86406i;
    ImageView mAddFriendIv;
    View mStatusBarView;
    TextView mTvNoticeAdd;
    RtlViewPager mViewPager;
    PagerIndicator pagerIndicator;

    /* renamed from: d */
    public final Fragment mo84991d() {
        if (this.f86402e != null) {
            return this.f86402e.mo85010a();
        }
        return null;
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("message");
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f86406i != null) {
            this.f86406i.mo25722b();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f86406i != null) {
            this.f86406i.dismiss();
        }
    }

    /* renamed from: e */
    private void m107116e() {
        if (this.f86402e != null && this.f86402e.getCount() != 0 && this.pagerIndicator != null) {
            this.pagerIndicator.mo85034a(this.f86402e.getCount());
            Fragment c = this.f86402e.mo85011c(0);
            if (c instanceof C34318a) {
                ((C34318a) c).mo87145c();
            }
        }
    }

    /* renamed from: f */
    private void m107117f() {
        if (this.f86402e != null && this.f86402e.getCount() != 0 && this.pagerIndicator != null) {
            Fragment c = this.f86402e.mo85011c(0);
            if (c instanceof C34318a) {
                ((C34318a) c).mo87146d();
            }
            if (this.f86406i != null) {
                this.f86406i.dismiss();
            }
        }
    }

    public void noticeViewClick() {
        IIMService a = C30553b.m99808a(false);
        if (a != null) {
            a.enterChooseContact(getActivity(), null, null);
            if (C7213d.m22500a().mo18754aQ()) {
                C30560g.m99824d();
            } else {
                C30560g.m99820b();
                C30560g.m99814a();
            }
        }
    }

    /* renamed from: a */
    public final void mo84987a() {
        if (getActivity() != null) {
            if (this.f86406i == null) {
                this.f86406i = new C10752a(getActivity()).mo25738b((int) R.string.bqc).mo25731a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo25736a(false).mo25737a();
            }
            if (!this.f86406i.isShowing()) {
                this.f86406i.mo25716a();
                int[] iArr = new int[2];
                this.mTvNoticeAdd.getLocationOnScreen(iArr);
                this.f86406i.mo25718a(this.mTvNoticeAdd, 80, (iArr[0] + this.mTvNoticeAdd.getMeasuredWidth()) - this.f86406i.mo25724d(), (iArr[1] + this.mTvNoticeAdd.getMeasuredHeight()) - C23486n.m77122a(12.0d), (float) (this.f86406i.mo25724d() - C23486n.m77122a(30.0d)));
            }
        }
    }

    public void addFriendViewClick() {
        String str;
        String str2;
        String str3 = "find_friends";
        C22984d a = C22984d.m75611a();
        String str4 = "enter_from";
        if (this.f86404g == 1) {
            str = "message_tab";
        } else {
            str = "contact_tab";
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str).f60753a);
        if (getContext() != null) {
            Context context = getContext();
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            Context context2 = getContext();
            String str5 = "";
            if (this.f86404g == 1) {
                str2 = "message_tab";
            } else {
                str2 = "contact_tab";
            }
            context.startActivity(iBridgeService.getAddFriendsActivityIntent(context2, -1, 4, str5, str2));
        }
    }

    /* renamed from: g */
    private void m107118g() {
        boolean z;
        boolean z2;
        int i;
        if (C6399b.m19944t()) {
            C34626j.m111876a(this.mTvNoticeAdd);
        }
        if (!C30553b.m99785a() || !C30553b.m99788d() || C30553b.m99808a(false) == null) {
            z = false;
        } else {
            z = true;
        }
        this.f86402e = new MessagePagerAdapter(getChildFragmentManager(), z);
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getContext().getResources().getString(R.string.bi_));
            this.pagerIndicator.setSelectCallBack(this);
            this.mAddFriendIv.setVisibility(0);
        } else {
            this.mAddFriendIv.setVisibility(8);
            if (C6399b.m19944t() || !C7213d.m22500a().mo18754aQ()) {
                this.mTvNoticeAdd.setText(R.string.bi_);
            } else {
                if (C30553b.m99810g().getExperimentService() == null || !C30553b.m99810g().getExperimentService().mo18365a()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                TextView textView = this.mTvNoticeAdd;
                if (z2) {
                    i = R.string.a11;
                } else {
                    i = R.string.bk4;
                }
                textView.setText(i);
                this.mTvNoticeAdd.setTextSize(1, 15.0f);
                this.mTvNoticeAdd.postDelayed(new Runnable() {
                    public final void run() {
                        try {
                            ImCreateChatBubble imCreateChatBubble = C30199h.m98861a().getImCreateChatBubble();
                            if (C30553b.m99785a() && imCreateChatBubble.getShowFlag().intValue() == 1 && C30553b.m99810g().checkGroupChatGuide(imCreateChatBubble.getTimeInterval().intValue())) {
                                MessagesFragment.this.mo84987a();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }, 500);
            }
            IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
            if (iIMService == null || !iIMService.isImReduction()) {
                this.mTvNoticeAdd.setVisibility(0);
            } else {
                this.mTvNoticeAdd.setVisibility(8);
            }
        }
        if (C43122ff.m136767b()) {
            this.mTvNoticeAdd.setVisibility(8);
        }
        arrayList.add(C6399b.m19921a().getResources().getString(R.string.co4));
        this.mViewPager.setAdapter(this.f86402e);
        this.pagerIndicator.setTabItems(arrayList);
        this.pagerIndicator.mo85036a((ViewPager) this.mViewPager, this.f86402e.getCount() - 1);
    }

    public void onCreate(Bundle bundle) {
        C30553b.m99810g();
        super.onCreate(bundle);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m107118g();
        this.f86405h = new AnalysisStayTimeFragmentComponent(this, true);
    }

    /* renamed from: a */
    public final void mo84988a(int i) {
        if (i == 0) {
            C7095a aVar = (C7095a) this.f86402e.mo85011c(1);
            if (aVar != null && this.f86404g == 0) {
                aVar.mo18106e();
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            m107117f();
        } else {
            m107116e();
        }
        if (this.f86405h != null) {
            this.f86405h.mo60573a(z);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            ((C33026l) C21084a.m71113a(C33026l.class)).mo60023b("NOTICE");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C10994a.m32204a((Context) getActivity());
        }
    }

    /* renamed from: a */
    public final void mo84989a(int i, boolean z) {
        String str;
        String str2;
        String str3;
        C22984d dVar;
        String str4;
        C7095a aVar = (C7095a) this.f86402e.mo85011c(1);
        this.f86404g = i;
        if (aVar != null) {
            if (i == 0) {
                str2 = "enter_contact_list";
                C22984d a = C22984d.m75611a();
                String str5 = "enter_method";
                if (z) {
                    str4 = "slide_right";
                } else {
                    str4 = "click_contact_tab";
                }
                dVar = a.mo59973a(str5, str4);
                str = "message";
                str3 = "enter_from";
            } else {
                aVar.mo18107f();
                str2 = "enter_message_tab";
                dVar = C22984d.m75611a();
                str3 = "enter_method";
                if (z) {
                    str = "slide_right";
                } else {
                    str = "click_message_tab";
                }
            }
            C6907h.m21524a(str2, (Map) dVar.mo59973a(str3, str).f60753a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f86403f = layoutInflater.inflate(R.layout.oy, viewGroup, false);
        return this.f86403f;
    }
}

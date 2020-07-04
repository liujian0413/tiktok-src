package com.p280ss.android.ugc.aweme.recommend.viewholder;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.feed.adapter.C28128aa;
import com.p280ss.android.ugc.aweme.feed.adapter.C28155b;
import com.p280ss.android.ugc.aweme.feed.event.C28306ab;
import com.p280ss.android.ugc.aweme.feed.event.C28322e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21750a;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C33063a;
import com.p280ss.android.ugc.aweme.metrics.C33238ak;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.recommend.C37129b;
import com.p280ss.android.ugc.aweme.recommend.FeedRecommendUserViewStyle;
import com.p280ss.android.ugc.aweme.recommend.widget.AutoFillFeedRecommendUserView;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C47913z;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.b */
public final class C37165b extends C28155b {

    /* renamed from: b */
    public static final C37167a f97258b = new C37167a(null);

    /* renamed from: a */
    public final C37164a f97259a = new C37164a();

    /* renamed from: c */
    private Aweme f97260c;

    /* renamed from: d */
    private int f97261d = -1;

    /* renamed from: e */
    private int f97262e = 3;

    /* renamed from: f */
    private final List<User> f97263f = new ArrayList();

    /* renamed from: g */
    private int f97264g;

    /* renamed from: k */
    private final Map<String, Integer> f97265k = new LinkedHashMap();

    /* renamed from: l */
    private final View f97266l;

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.b$a */
    public static final class C37167a {
        private C37167a() {
        }

        public /* synthetic */ C37167a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: d */
    public final void mo56928d() {
    }

    /* renamed from: f */
    public final int mo65709f() {
        return 4000;
    }

    /* renamed from: g */
    public final int mo65710g() {
        return 5;
    }

    /* renamed from: h */
    public final Aweme mo65711h() {
        return this.f97260c;
    }

    /* renamed from: m */
    public final C28128aa mo65716m() {
        return null;
    }

    /* renamed from: i */
    public final void mo65712i() {
        this.f97259a.mo93650c();
    }

    /* renamed from: k */
    public final void mo65714k() {
        this.f97259a.mo93649b();
    }

    /* renamed from: s */
    private final AutoFillFeedRecommendUserView m119471s() {
        View view = this.f97266l;
        if (view != null) {
            return (AutoFillFeedRecommendUserView) view;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.recommend.widget.AutoFillFeedRecommendUserView");
    }

    /* renamed from: j */
    public final void mo65713j() {
        C42961az.m136383d(this);
        DataCenter dataCenter = this.f74252h;
        if (dataCenter != null) {
            dataCenter.mo60131a((C0053p<C23083a>) this);
        }
    }

    /* renamed from: n */
    private final FragmentActivity m119470n() {
        Context context = this.f97266l.getContext();
        if (context != null) {
            return (FragmentActivity) context;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: v */
    private final User m119474v() {
        int size = this.f97263f.size();
        int i = this.f97264g;
        if (i < 0 || size <= i) {
            return null;
        }
        User user = (User) this.f97263f.get(this.f97264g);
        this.f97264g++;
        return user;
    }

    /* renamed from: l */
    public final void mo65715l() {
        this.f97259a.mo93651d();
        m119471s().getImpressionMap().clear();
    }

    /* renamed from: t */
    private final void m119472t() {
        int recyclerViewItemHeight = FeedRecommendUserViewStyle.getRecyclerViewItemHeight();
        Context a = C6399b.m19921a();
        int b = C9738o.m28709b(a) - (C23486n.m77122a(137.0d) + C21085a.m71116a(a));
        this.f97262e = 3;
        while (this.f97262e > 1 && b < this.f97262e * recyclerViewItemHeight) {
            this.f97262e--;
        }
        m119471s().setRemainHeight(b - (this.f97262e * recyclerViewItemHeight));
    }

    /* renamed from: u */
    private final void m119473u() {
        List arrayList = new ArrayList();
        int min = this.f97264g + Math.min(this.f97263f.size() - this.f97264g, this.f97262e);
        arrayList.addAll(this.f97263f.subList(this.f97264g, min));
        this.f97264g = min;
        DataCenter dataCenter = this.f74252h;
        if (dataCenter != null) {
            dataCenter.mo60134a("action_list_bind_user", (Object) arrayList);
        }
    }

    /* renamed from: a */
    public final void mo65707a(int i) {
        this.f97259a.mo93648a();
        C42961az.m136380a(new C28306ab(this.f97260c));
    }

    /* renamed from: b */
    public final void mo71528b(int i) {
        super.mo71528b(i);
        this.f97259a.mo93650c();
    }

    /* renamed from: c */
    public final void mo71530c(int i) {
        super.mo71530c(i);
        this.f97259a.mo93649b();
    }

    @C7709l
    public final void onDislikeRecommendUserEvent(C37129b bVar) {
        C7573i.m23587b(bVar, "event");
        DataCenter dataCenter = this.f74252h;
        if (dataCenter != null) {
            dataCenter.mo60134a("action_list_replace_user", (Object) bVar.f97162a);
        }
    }

    @C7709l
    public final void onFollowStatusEvent(FollowStatus followStatus) {
        C7573i.m23587b(followStatus, "event");
        if (!this.f97259a.f97255c && followStatus.followStatus != 0) {
            DataCenter dataCenter = this.f74252h;
            if (dataCenter != null) {
                dataCenter.mo60134a("action_list_replace_user", (Object) followStatus.userId);
            }
        }
    }

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        m119469b(aweme);
        DataCenter dataCenter = this.f74252h;
        if (dataCenter != null) {
            C0053p pVar = this;
            dataCenter.mo60132a("action_click_dislike", pVar);
            dataCenter.mo60132a("action_dislike_all", pVar);
            dataCenter.mo60132a("key_recommend_user_event", pVar);
            dataCenter.mo60132a("action_list_remove_user", pVar);
            dataCenter.mo60132a("action_list_replace_user", pVar);
            dataCenter.mo60132a("action_auto_fill_holder_did_action", pVar);
        }
    }

    public C37165b(View view) {
        C7573i.m23587b(view, "view");
        this.f97266l = view;
        C0065w a = C0069x.m159a(m119470n());
        FragmentActivity n = m119470n();
        if (n != null) {
            this.f74252h = DataCenter.m75849a(a, (C0043i) n);
            AwemeChangeCallBack.m106764a(m119470n(), m119470n(), new C33063a(this) {

                /* renamed from: a */
                final /* synthetic */ C37165b f97267a;

                {
                    this.f97267a = r1;
                }

                /* renamed from: a */
                public final void mo67730a(Aweme aweme) {
                    if (aweme != null) {
                        if (aweme.getAwemeType() != 4001 || !C7573i.m23585a((Object) aweme.getAid(), (Object) "feed_recommend_user")) {
                            this.f97267a.f97259a.mo93650c();
                        } else {
                            this.f97267a.f97259a.mo93649b();
                            DataCenter dataCenter = this.f97267a.f74252h;
                            if (dataCenter != null) {
                                dataCenter.mo60134a("action_list_impression", (Object) Boolean.valueOf(true));
                            }
                        }
                    }
                }
            });
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* renamed from: b */
    private final void m119469b(Aweme aweme) {
        List list;
        boolean z;
        m119472t();
        if (aweme != null) {
            List familiarRecommendUser = aweme.getFamiliarRecommendUser();
            if (familiarRecommendUser != null) {
                Iterable iterable = familiarRecommendUser;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    User user = (User) next;
                    C7573i.m23582a((Object) user, "it");
                    if (user.getFollowStatus() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            aweme.setFamiliarRecommendUser(list);
            List familiarRecommendUser2 = aweme.getFamiliarRecommendUser();
            if (familiarRecommendUser2 != null) {
                for (C47913z zVar : C7525m.m23521k(familiarRecommendUser2)) {
                    Map<String, Integer> map = this.f97265k;
                    T t = zVar.f122771b;
                    C7573i.m23582a((Object) t, "it.value");
                    String uid = ((User) t).getUid();
                    C7573i.m23582a((Object) uid, "it.value.uid");
                    map.put(uid, Integer.valueOf(zVar.f122770a));
                }
                this.f97263f.addAll(familiarRecommendUser2);
                DataCenter dataCenter = this.f74252h;
                if (dataCenter != null) {
                    dataCenter.mo60134a("key_enter_from", (Object) "homepage_hot");
                    dataCenter.mo60134a("key_previous_page", (Object) "homepage_hot");
                }
                m119473u();
            }
            AutoFillFeedRecommendUserView s = m119471s();
            String requestId = aweme.getRequestId();
            if (requestId == null) {
                requestId = "";
            }
            s.setRequestId(requestId);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        Object obj;
        String str2 = null;
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1772397388:
                    if (str.equals("action_auto_fill_holder_did_action")) {
                        this.f97259a.f97254b = true;
                        break;
                    }
                    break;
                case -1620059355:
                    if (str.equals("action_click_dislike")) {
                        this.f97259a.f97254b = true;
                        String str3 = (String) aVar.mo60161a();
                        if (str3 != null) {
                            m119471s().mo93681a(str3, m119474v(), true);
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -1078807959:
                    if (str.equals("key_recommend_user_event")) {
                        C33238ak akVar = (C33238ak) aVar.mo60161a();
                        if (akVar != null) {
                            String str4 = akVar.f86543b;
                            int hashCode = str4.hashCode();
                            if (hashCode == -1335458389 ? str4.equals("delete") : !(hashCode == -1268958287 ? !str4.equals("follow") : hashCode != -1053237438 || !str4.equals("enter_profile"))) {
                                this.f97259a.f97254b = true;
                            }
                            String str5 = akVar.f86542a;
                            Iterator it = this.f97263f.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                } else if (!C7573i.m23585a((Object) ((User) it.next()).getUid(), (Object) str5)) {
                                    i++;
                                }
                            }
                            if (i != -1) {
                                C33238ak f = akVar.mo85097b("homepage_hot").mo85093a(this.f97261d).mo85101f("card");
                                Aweme aweme = this.f97260c;
                                if (aweme != null) {
                                    str2 = aweme.getRequestId();
                                }
                                C33238ak d = f.mo85099d(str2);
                                Integer num = (Integer) this.f97265k.get(str5);
                                if (num == null) {
                                    num = Integer.valueOf(0);
                                }
                                d.mo85094a(num).mo85102g("nonempty").mo85252e();
                                break;
                            }
                        } else {
                            return;
                        }
                    }
                    break;
                case -1010710674:
                    if (str.equals("action_list_remove_user")) {
                        String str6 = (String) aVar.mo60161a();
                        if (str6 != null) {
                            m119471s().mo93681a(str6, m119474v(), false);
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -297192786:
                    if (str.equals("action_list_replace_user")) {
                        this.f97259a.f97254b = true;
                        String str7 = (String) aVar.mo60161a();
                        if (str7 != null) {
                            m119471s().mo93681a(str7, m119474v(), false);
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 1013253886:
                    if (str.equals("action_dislike_all")) {
                        DataCenter dataCenter = this.f74252h;
                        if (dataCenter != null) {
                            String str8 = "action_remove_recommend_user_card";
                            Aweme aweme2 = this.f97260c;
                            if (aweme2 != null) {
                                obj = aweme2.getAid();
                            } else {
                                obj = null;
                            }
                            dataCenter.mo60134a(str8, obj);
                        }
                        C42961az.m136380a(new C28322e(this.f97260c));
                        C21750a aVar2 = new C21750a();
                        aVar2.f58255a = 4;
                        Aweme aweme3 = this.f97260c;
                        if (aweme3 != null) {
                            str2 = aweme3.getAid();
                        }
                        aVar2.f58258d = str2;
                        C42961az.m136380a(aVar2);
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo71548a(Aweme aweme, int i) {
        C42961az.m136382c(this);
        this.f97260c = aweme;
        this.f97261d = i;
        mo65708a(aweme);
    }
}

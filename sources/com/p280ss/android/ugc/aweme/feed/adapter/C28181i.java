package com.p280ss.android.ugc.aweme.feed.adapter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.feed.event.C28325h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21750a;
import com.p280ss.android.ugc.aweme.metrics.C33238ak;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.i */
public final class C28181i extends C28155b {

    /* renamed from: a */
    public final View f74279a;

    /* renamed from: b */
    private Aweme f74280b;

    /* renamed from: c */
    private int f74281c;

    /* renamed from: d */
    private Map<String, Integer> f74282d = new LinkedHashMap();

    /* renamed from: e */
    private int f74283e = -1;

    /* renamed from: a */
    public final void mo65707a(int i) {
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
        return 4;
    }

    /* renamed from: h */
    public final Aweme mo65711h() {
        return this.f74280b;
    }

    /* renamed from: i */
    public final void mo65712i() {
    }

    /* renamed from: k */
    public final void mo65714k() {
    }

    /* renamed from: l */
    public final void mo65715l() {
    }

    /* renamed from: m */
    public final C28128aa mo65716m() {
        return null;
    }

    /* renamed from: j */
    public final void mo65713j() {
        DataCenter dataCenter = this.f74252h;
        if (dataCenter != null) {
            dataCenter.mo60131a((C0053p<C23083a>) this);
        }
    }

    /* renamed from: n */
    private final FragmentActivity m92557n() {
        Context context = this.f74279a.getContext();
        if (context != null) {
            return (FragmentActivity) context;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    private final boolean m92555a(String str) {
        if (m92556b(str) != -1) {
            return true;
        }
        return false;
    }

    public C28181i(View view) {
        C7573i.m23587b(view, "view");
        this.f74279a = view;
        C0065w a = C0069x.m159a(m92557n());
        FragmentActivity n = m92557n();
        if (n != null) {
            this.f74252h = DataCenter.m75849a(a, (C0043i) n);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* renamed from: b */
    private final int m92556b(String str) {
        Aweme aweme = this.f74280b;
        if (aweme != null) {
            List<User> familiarRecommendUser = aweme.getFamiliarRecommendUser();
            if (familiarRecommendUser != null) {
                int i = 0;
                for (User user : familiarRecommendUser) {
                    CharSequence charSequence = str;
                    C7573i.m23582a((Object) user, "it");
                    if (TextUtils.equals(charSequence, user.getUid())) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        this.f74280b = aweme;
        Aweme aweme2 = this.f74280b;
        if (aweme2 != null) {
            List familiarRecommendUser = aweme2.getFamiliarRecommendUser();
            if (familiarRecommendUser != null) {
                int i = 0;
                for (Object next : familiarRecommendUser) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C7525m.m23465b();
                    }
                    User user = (User) next;
                    Map<String, Integer> map = this.f74282d;
                    C7573i.m23582a((Object) user, "user");
                    String uid = user.getUid();
                    C7573i.m23582a((Object) uid, "user.uid");
                    map.put(uid, Integer.valueOf(i));
                    i = i2;
                }
            }
        }
        DataCenter dataCenter = this.f74252h;
        if (dataCenter != null) {
            C0053p pVar = this;
            dataCenter.mo60132a("action_click_dislike", pVar);
            dataCenter.mo60132a("action_dislike_all", pVar);
            dataCenter.mo60132a("key_recommend_user_event", pVar);
            dataCenter.mo60132a("action_list_remove_user", pVar);
            Aweme aweme3 = this.f74280b;
            if (aweme3 != null) {
                List familiarRecommendUser2 = aweme3.getFamiliarRecommendUser();
                if (familiarRecommendUser2 != null) {
                    dataCenter.mo60134a("action_list_bind_user", (Object) C7525m.m23509d((Collection<? extends T>) familiarRecommendUser2));
                    dataCenter.mo60134a("key_enter_from", (Object) "homepage_familiar");
                    dataCenter.mo60134a("key_previous_page", (Object) "homepage_familiar");
                }
            }
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
            int hashCode = str.hashCode();
            if (hashCode != -1620059355) {
                if (hashCode != -1078807959) {
                    if (hashCode != -1010710674) {
                        if (hashCode == 1013253886 && str.equals("action_dislike_all")) {
                            DataCenter dataCenter = this.f74252h;
                            if (dataCenter != null) {
                                String str3 = "action_remove_recommend_user_card";
                                Aweme aweme = this.f74280b;
                                if (aweme != null) {
                                    obj = aweme.getAid();
                                } else {
                                    obj = null;
                                }
                                dataCenter.mo60134a(str3, obj);
                            }
                            C21750a aVar2 = new C21750a();
                            aVar2.f58255a = 4;
                            Aweme aweme2 = this.f74280b;
                            if (aweme2 != null) {
                                str2 = aweme2.getAid();
                            }
                            aVar2.f58258d = str2;
                            C42961az.m136380a(aVar2);
                        }
                    } else if (str.equals("action_list_remove_user")) {
                        String str4 = (String) aVar.mo60161a();
                        if (str4 != null) {
                            int b = m92556b(str4);
                            if (b != -1) {
                                Aweme aweme3 = this.f74280b;
                                if (aweme3 != null) {
                                    List familiarRecommendUser = aweme3.getFamiliarRecommendUser();
                                    if (familiarRecommendUser != null) {
                                        familiarRecommendUser.remove(b);
                                    }
                                }
                            }
                        }
                    }
                } else if (str.equals("key_recommend_user_event")) {
                    C33238ak akVar = (C33238ak) aVar.mo60161a();
                    if (akVar != null && m92555a(akVar.f86542a)) {
                        C33238ak f = akVar.mo85097b("homepage_familiar").mo85093a(this.f74283e).mo85101f("card");
                        Aweme aweme4 = this.f74280b;
                        if (aweme4 != null) {
                            str2 = aweme4.getRequestId();
                        }
                        C33238ak d = f.mo85099d(str2);
                        Integer num = (Integer) this.f74282d.get(akVar.f86542a);
                        if (num == null) {
                            num = Integer.valueOf(0);
                        }
                        d.mo85094a(num).mo85102g("nonempty").mo85252e();
                    }
                }
            } else if (str.equals("action_click_dislike")) {
                String str5 = (String) aVar.mo60161a();
                if (str5 != null) {
                    int b2 = m92556b(str5);
                    if (b2 != -1) {
                        Aweme aweme5 = this.f74280b;
                        if (aweme5 != null) {
                            List familiarRecommendUser2 = aweme5.getFamiliarRecommendUser();
                            if (familiarRecommendUser2 != null) {
                                User user = (User) familiarRecommendUser2.get(b2);
                                if (user != null) {
                                    C42961az.m136380a(new C28325h(user));
                                }
                            }
                        }
                        Aweme aweme6 = this.f74280b;
                        if (aweme6 != null) {
                            List familiarRecommendUser3 = aweme6.getFamiliarRecommendUser();
                            if (familiarRecommendUser3 != null) {
                                familiarRecommendUser3.remove(b2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo71548a(Aweme aweme, int i) {
        this.f74281c = i;
        if (this.f74283e == -1) {
            this.f74283e = this.f74281c;
        }
        mo65708a(aweme);
    }
}

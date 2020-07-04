package com.p280ss.android.ugc.aweme.p313im.sdk.p317j;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.bytedance.p255e.C6326a;
import com.bytedance.p263im.core.internal.queue.p597a.C11380a;
import com.bytedance.p263im.core.internal.queue.p597a.C11381b;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11193a;
import com.bytedance.p263im.core.p584a.C11197b;
import com.bytedance.p263im.core.proto.MessageBody;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.UserStruct;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6967g;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31865ak;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31917q;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31918r;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.j.e */
public final class C31337e implements C11193a {

    /* renamed from: a */
    private static volatile boolean f82121a;

    /* renamed from: b */
    private C11197b f82122b = new C11197b() {
        /* renamed from: a */
        public final int mo27243a(Message message) {
            if (message.getMsgType() == 15) {
                C7093b abInterface = ((IIMService) C6993a.m21773a(IIMService.class)).getAbInterface();
                if (abInterface != null && !abInterface.mo18354b()) {
                    return 1;
                }
            }
            return 0;
        }

        /* renamed from: a */
        public final MessageBody mo27244a(MessageBody messageBody, int i) {
            if (messageBody == null || messageBody.message_type.intValue() == 50010 || messageBody.message_type.intValue() == 60001) {
                return null;
            }
            if (messageBody.message_type.intValue() > 50000) {
                return messageBody;
            }
            if (messageBody.message_type.intValue() < 0 || messageBody.message_type.intValue() > 1999) {
                return null;
            }
            if (messageBody.message_type.intValue() == 1002) {
                try {
                    if (TextUtils.isEmpty(messageBody.content) || ((SayHelloContent) C31913m.m103667a(messageBody.content, SayHelloContent.class)).getType() != 100200) {
                        return messageBody;
                    }
                    return null;
                } catch (Exception unused) {
                    return messageBody;
                }
            }
            return messageBody;
        }
    };

    /* renamed from: e */
    public final C11197b mo27238e() {
        return this.f82122b;
    }

    /* renamed from: a */
    public final long mo27230a() {
        return C7074e.m22072d();
    }

    /* renamed from: b */
    public final String mo27235b() {
        return C7076p.m22077a().mo18330n();
    }

    /* renamed from: c */
    public final String mo27236c() {
        return C7074e.m22073e().toString();
    }

    /* renamed from: d */
    public final boolean mo27237d() {
        return C31335c.m102021a().mo81904b();
    }

    /* renamed from: g */
    public final void mo27240g() {
        if (!f82121a) {
            C6326a.m19641a("wcdb");
            f82121a = true;
        }
    }

    /* renamed from: h */
    public final String mo27241h() {
        return C31085i.m101389b(String.valueOf(C7074e.m22072d()));
    }

    /* renamed from: f */
    public final Map<String, String> mo27239f() {
        HashMap hashMap = new HashMap();
        String b = C10981a.m32170b();
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("iid", b);
        }
        hashMap.put("aid", String.valueOf(C6399b.m19935k()));
        String g = C7074e.m22075g();
        if (!TextUtils.isEmpty(g)) {
            hashMap.put("sim_mcc_mnc", g);
        }
        String f = C7074e.m22074f();
        if (!TextUtils.isEmpty(f)) {
            hashMap.put("net_mcc_mnc", f);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo27231a(int i) {
        C6967g.m21701d().mo18041c();
    }

    /* renamed from: a */
    public final void mo27234a(List<Message> list) {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && iUserService.isLogin() && list != null && !list.isEmpty()) {
            final Message message = (Message) list.get(list.size() - 1);
            C31865ak.m103547a(new C31918r<Pair<IMUser, BaseContent>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Pair<IMUser, BaseContent> mo81913a() {
                    try {
                        String valueOf = String.valueOf(message.getSender());
                        IMUser b = C6961d.m21657a().mo18029b(valueOf);
                        if (b == null) {
                            UserStruct userStruct = (UserStruct) C7077s.m22142a().queryUser(valueOf, C31085i.m101389b(valueOf)).get();
                            if (userStruct != null) {
                                b = IMUser.fromUser(userStruct.getUser());
                                C6961d.m21657a().mo18026a(b);
                            }
                        }
                        if (b != null) {
                            BaseContent content = MessageViewType.content(message);
                            if (content != null && !TextUtils.isEmpty(content.getMsgHint())) {
                                return new Pair<>(b, content);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return null;
                }
            }, new C31917q<Pair<IMUser, BaseContent>>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo81914a(Object obj) {
                    m102045a((Pair) obj);
                }

                /* renamed from: a */
                private static void m102045a(Pair<IMUser, BaseContent> pair) {
                    if (pair != null) {
                        C6956a.m21632a().mo18009f().showNotification(((IMUser) pair.first).getNickName(), ((BaseContent) pair.second).getMsgHint());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo27233a(C11381b bVar, C11380a aVar) {
        C7077s.m22152a(bVar, aVar);
    }

    /* renamed from: a */
    public final void mo27232a(int i, long j, String str, byte[] bArr) {
        C31335c.m102021a().mo81903a(i, j, str, bArr);
    }
}

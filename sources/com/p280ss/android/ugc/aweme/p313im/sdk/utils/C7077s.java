package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.os.Handler;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.p263im.core.internal.queue.p597a.C11380a;
import com.bytedance.p263im.core.internal.queue.p597a.C11381b;
import com.bytedance.p263im.core.internal.queue.p597a.C11384c;
import com.bytedance.p263im.core.internal.queue.p597a.C11384c.C11386a;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.proto.Response;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.C6711m;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1317a.C30853a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1319c.p1320a.C30857a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1319c.p1320a.C30859c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.UploadAuthKeyConfig;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupShareInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupVerifyResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.C31268a;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31479j;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.GreetEmojiList;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.ShareStateResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerMessage;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerMessageList;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerMsgSession;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerSessionList;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.UserStruct;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p316h.C7003c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p316h.p1326a.C31329a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.s */
public final class C7077s {

    /* renamed from: a */
    public static ImApi f19914a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.s$a */
    public interface C7090a {
        /* renamed from: a */
        void mo18350a(int i, Exception exc);

        /* renamed from: a */
        void mo18351a(int i, Object obj);
    }

    /* renamed from: a */
    public static ImApi m22142a() {
        return f19914a;
    }

    /* renamed from: a */
    public static void m22150a(Handler handler, final CharSequence charSequence, final String str, int i) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    if (IMUser.isInvalidUser(charSequence.toString())) {
                        return null;
                    }
                    return C7077s.f19914a.queryUser(charSequence.toString(), str).get();
                } catch (ExecutionException e) {
                    throw C31868an.m103554a(e);
                }
            }
        }, i);
    }

    /* renamed from: a */
    public static void m22151a(Handler handler, final CharSequence charSequence, final String str, final int i, int i2) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    return C7077s.f19914a.block(charSequence.toString(), str, i).get();
                } catch (ExecutionException e) {
                    throw C31868an.m103554a(e);
                }
            }
        }, i2);
    }

    /* renamed from: a */
    public static void m22153a(final Message message, C6892b<Object> bVar) {
        C6726a.m20842a(new Runnable(null) {
            public final void run() {
                try {
                    e = C7077s.f19914a.deleteStrangerSingleMsg(message.getSender(), C31863ai.m103536d(message)).get();
                } catch (InterruptedException | ExecutionException e) {
                    e = e;
                }
                if (null != null) {
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            null.run(e);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public static void m22149a(Handler handler, final long j, final String str, int i) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    StrangerMessageList strangerMessageList = (StrangerMessageList) C7077s.f19914a.fetchStrangerMsgList(j, str).get();
                    if (strangerMessageList != null) {
                        C7077s.m22160a(strangerMessageList.getmDatas());
                    }
                    return strangerMessageList;
                } catch (ExecutionException e) {
                    throw C31868an.m103554a(e);
                }
            }
        }, 0);
    }

    /* renamed from: a */
    public static void m22160a(List<StrangerMessage> list) {
        if (list != null && !list.isEmpty()) {
            for (StrangerMessage a : list) {
                m22155a(a);
            }
        }
    }

    /* renamed from: a */
    private static void m22156a(StrangerSessionList strangerSessionList) {
        if (strangerSessionList != null) {
            List<StrangerMsgSession> lastMsg = strangerSessionList.getLastMsg();
            if (lastMsg != null && !lastMsg.isEmpty()) {
                for (StrangerMsgSession strangerMsgSession : lastMsg) {
                    if (strangerMsgSession != null) {
                        m22155a(strangerMsgSession.getLastMsg());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m22155a(StrangerMessage strangerMessage) {
        if (strangerMessage != null) {
            IMUser toUser = strangerMessage.getToUser();
            IMUser fromUser = strangerMessage.getFromUser();
            C31085i.m101388a(toUser);
            C31085i.m101388a(fromUser);
        }
    }

    /* renamed from: a */
    public static void m22148a(Handler handler, final long j, int i) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    return C7077s.f19914a.deleteStrangerSingleSession(j).get();
                } catch (ExecutionException e) {
                    throw C31868an.m103554a(e);
                }
            }
        }, 6);
    }

    /* renamed from: a */
    public static void m22158a(String str, int i, String str2, String str3, C30853a<C30859c> aVar) {
        f19914a.searchEmojis(str, i, str2, str3).mo6876a((C1591g<TResult, TContinuationResult>) new C31919t<TResult,TContinuationResult>(aVar, i), C1592h.f5958b);
    }

    /* renamed from: a */
    public static void m22147a(int i, int i2, String str, C1591g<GroupShareInfo, Void> gVar) {
        f19914a.getGroupShareInfo(12, 2, str).mo6876a(gVar, C1592h.f5958b);
    }

    /* renamed from: a */
    public static void m22157a(String str, int i, String str2, C1591g<GroupVerifyResponse, Void> gVar) {
        f19914a.groupShareVerification(str, i, str2).mo6876a(gVar, C1592h.f5958b);
    }

    /* renamed from: a */
    public static void m22154a(final C6892b<List<Emoji>> bVar) {
        C1592h.m7852a((Collection<? extends C1592h<?>>) Arrays.asList(new C1592h[]{f19914a.fetchGreetEmoji().mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<GreetEmojiList, List<Emoji>>() {
            public final /* synthetic */ Object then(C1592h hVar) throws Exception {
                return m22165a(hVar);
            }

            /* renamed from: a */
            private static List<Emoji> m22165a(C1592h<GreetEmojiList> hVar) {
                if (!hVar.mo6882b() || hVar.mo6890e() == null) {
                    return C7076p.m22077a().mo18339w();
                }
                List<Emoji> emojiList = ((GreetEmojiList) hVar.mo6890e()).getEmojiList();
                if (emojiList != null && !emojiList.isEmpty()) {
                    C7076p.m22077a().mo18295a(emojiList);
                }
                return emojiList;
            }
        }), C1592h.m7848a(1000).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<Void, List<Emoji>>() {
            public final /* synthetic */ Object then(C1592h hVar) throws Exception {
                return m22166a(hVar);
            }

            /* renamed from: a */
            private static List<Emoji> m22166a(C1592h<Void> hVar) {
                return C7076p.m22077a().mo18339w();
            }
        })})).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<C1592h<?>, Object>() {
            public final Object then(C1592h<C1592h<?>> hVar) {
                if (hVar.mo6890e() != null) {
                    try {
                        List list = (List) ((C1592h) hVar.mo6890e()).mo6890e();
                        if (bVar != null) {
                            bVar.run(list);
                        }
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
        }, C1592h.f5958b);
    }

    /* renamed from: a */
    public static void m22152a(C11381b bVar, final C11380a aVar) {
        C7319aa.m22929a((C7496w<? extends T>) f19914a.postIMSDK(bVar.f30833a, bVar.f30836d, bVar.f30834b)).mo19135b(C7333a.m23044b()).mo19137b((C47557ad<? super T>) new C47557ad<Response>() {
            public final void onSubscribe(C7321c cVar) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(Response response) {
                aVar.mo27405a(C7077s.m22140a(response), "", "", (int) C34943c.f91127w);
            }

            public final void onError(Throwable th) {
                Exception exc;
                if (th instanceof Exception) {
                    exc = (Exception) th;
                } else {
                    exc = new Exception(th);
                }
                aVar.mo27406a(exc, "", "", -1000);
            }
        });
    }

    /* renamed from: a */
    public static void m22159a(String str, String str2, C7090a aVar) {
        f19914a.queryAweme(str, str2).mo6876a((C1591g<TResult, TContinuationResult>) new C31920u<TResult,TContinuationResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    static final /* synthetic */ Void m22145a(C7090a aVar, C1592h hVar) throws Exception {
        Object obj;
        try {
            obj = (Aweme) C31913m.m103666a().mo15974a(((C6711m) hVar.mo6890e()).mo16152e("aweme_detail").toString(), Aweme.class);
        } catch (Exception e) {
            if (aVar != null) {
                aVar.mo18350a(-1, e);
            }
            obj = null;
        }
        if (aVar != null) {
            if (obj != null) {
                aVar.mo18351a(0, obj);
            } else {
                aVar.mo18350a(-1, (Exception) null);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C18253l<UploadAuthKeyConfig> m22161b() {
        return f19914a.getUploadAuthKeyConfig();
    }

    static {
        C7073c.m22061a(C7075h.f19903b);
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            f19914a = (ImApi) iRetrofitService.createNewRetrofit(C7075h.f19903b).create(ImApi.class);
        }
    }

    /* renamed from: a */
    public static void m22146a(int i) {
        f19914a.updateRCellState(i);
    }

    /* renamed from: a */
    public static C1592h<Boolean> m22139a(final boolean z) {
        return C1592h.m7859b((Callable<TResult>) new Callable<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() {
                return Boolean.valueOf(z);
            }
        });
    }

    /* renamed from: a */
    public static C11384c m22140a(Response response) {
        return new C11386a().mo27412a((int) C34943c.f91127w).mo27414a("").mo27413a(response).f30842a;
    }

    /* renamed from: a */
    public static C1592h<List<IMUser>> m22136a(String str, C1591g<C31479j, List<IMUser>> gVar) {
        return f19914a.fetchUserInfo(str).mo6876a(gVar, (Executor) C1592h.f5957a);
    }

    /* renamed from: b */
    public static void m22162b(String str, C1591g<ShareStateResponse, C1592h<Object>> gVar) {
        f19914a.getShareUserCanSendMsg(str).mo6879b(gVar);
    }

    /* renamed from: a */
    public static C1592h<Boolean> m22137a(String str, final Message message) {
        return f19914a.getStoryDetail(str).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C1591g<C31329a, C1592h<Boolean>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1592h<Boolean> then(C1592h<C31329a> hVar) {
                if (hVar == null || !hVar.mo6882b() || hVar.mo6890e() == null) {
                    message.setTag(220224, "story_state_net_error");
                    return C7077s.m22139a(false);
                }
                message.setTag(220224, "story_state_checked");
                if (((C31329a) hVar.mo6890e()).f82101c != null) {
                    return C7077s.m22139a(false);
                }
                C7003c.m21797a(message);
                return C7077s.m22139a(true);
            }
        });
    }

    /* renamed from: a */
    public static C7492s<C31268a> m22143a(String str, int i) {
        return f19914a.searchFollowers(str, i, 15, "");
    }

    /* renamed from: a */
    public static C1592h<Boolean> m22138a(String str, String str2, C1591g<UserStruct, Boolean> gVar) {
        return f19914a.fetchUser(str, str2).mo6876a(gVar, (Executor) C1592h.f5957a);
    }

    /* renamed from: a */
    public static StrangerSessionList m22141a(long j, long j2, boolean z) throws Exception {
        StrangerSessionList strangerSessionList = (StrangerSessionList) f19914a.fetchStrangerSessionList(j, j2, z).get();
        m22156a(strangerSessionList);
        return strangerSessionList;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m22144a(C30853a aVar, int i, C1592h hVar) throws Exception {
        if (hVar == null || hVar.mo6889d() || hVar.mo6890e() == null) {
            aVar.mo80673a();
            return null;
        }
        C30857a aVar2 = (C30857a) hVar.mo6890e();
        if (aVar2.status_code != 0 || aVar2.f80800a == null) {
            aVar.mo80673a();
        } else {
            C30859c cVar = aVar2.f80800a;
            if (i <= 0) {
                aVar.mo80675b(cVar);
            } else {
                aVar.mo80674a(cVar);
            }
        }
        return null;
    }
}

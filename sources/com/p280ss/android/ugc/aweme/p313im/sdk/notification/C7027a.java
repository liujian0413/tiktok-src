package com.p280ss.android.ugc.aweme.p313im.sdk.notification;

import android.app.Activity;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.model.ConversationSettingInfo;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.LivePushMessage;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.LivePushResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31856ab;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.service.C32014g;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a */
public final class C7027a {

    /* renamed from: b */
    public static final C7027a f19815b = C7029b.m21873a();

    /* renamed from: c */
    public static final C7028a f19816c = new C7028a(null);

    /* renamed from: a */
    public C31594c f19817a;

    /* renamed from: d */
    private final C7093b f19818d;

    /* renamed from: e */
    private final HashSet<String> f19819e;

    /* renamed from: f */
    private final Queue<Message> f19820f;

    /* renamed from: g */
    private final Map<String, Integer> f19821g;

    /* renamed from: h */
    private int f19822h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$a */
    public static final class C7028a {
        private C7028a() {
        }

        public /* synthetic */ C7028a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$b */
    static final class C7029b {

        /* renamed from: a */
        public static final C7029b f19823a = new C7029b();

        /* renamed from: b */
        private static final C7027a f19824b = new C7027a(null);

        private C7029b() {
        }

        /* renamed from: a */
        public static C7027a m21873a() {
            return f19824b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$c */
    static final class C7030c<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7027a f19825a;

        C7030c(C7027a aVar) {
            this.f19825a = aVar;
        }

        /* renamed from: a */
        private void m21874a(C1592h<Void> hVar) {
            this.f19825a.mo18131c();
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m21874a(hVar);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$d */
    static final class C7031d<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7027a f19826a;

        C7031d(C7027a aVar) {
            this.f19826a = aVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m21875a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m21875a(C1592h<Void> hVar) {
            C31593b k = this.f19826a.mo18137k();
            if (k != null) {
                C31594c cVar = this.f19826a.f19817a;
                if (cVar == null || !cVar.f82710a) {
                    this.f19826a.f19817a = null;
                    Activity j = C7027a.m21855j();
                    if (j != null) {
                        C7027a aVar = this.f19826a;
                        C31594c cVar2 = new C31594c(j);
                        cVar2.mo82337a(k);
                        aVar.f19817a = cVar2;
                    }
                } else {
                    C31594c cVar3 = this.f19826a.f19817a;
                    if (cVar3 != null) {
                        cVar3.mo82337a(k);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$e */
    static final class C7032e<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7027a f19827a;

        C7032e(C7027a aVar) {
            this.f19827a = aVar;
        }

        /* renamed from: a */
        private void m21876a(C1592h<Void> hVar) {
            this.f19827a.mo18132d();
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m21876a(hVar);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$f */
    static final class C7033f<TTaskResult, TContinuationResult> implements C1591g<LivePushResponse, Void> {

        /* renamed from: a */
        final /* synthetic */ C7027a f19828a;

        C7033f(C7027a aVar) {
            this.f19828a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<LivePushResponse> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (hVar.mo6882b() && hVar.mo6890e() != null) {
                LivePushMessage data = ((LivePushResponse) hVar.mo6890e()).getData();
                if (data != null && !TextUtils.isEmpty(data.getSchema()) && !TextUtils.isEmpty(data.getNickname()) && !TextUtils.isEmpty(data.getText())) {
                    if (C7027a.m21856l()) {
                        C31593b a = this.f19828a.mo18126a(data);
                        this.f19828a.f19817a = null;
                        Activity j = C7027a.m21855j();
                        if (j != null) {
                            C7027a aVar = this.f19828a;
                            C31594c cVar = new C31594c(j);
                            cVar.mo82337a(a);
                            C31858ad.m103411a(data.getAnchorId(), data.getRoomId(), C7027a.m21857m(), data.getAnchorType(), data.getRequestId(), data.getLogPb());
                            aVar.f19817a = cVar;
                        }
                    } else {
                        C31858ad.m103410a(data.getAnchorId(), data.getRoomId(), data.getAnchorType());
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$g */
    static final class C7034g<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7027a f19829a;

        C7034g(C7027a aVar) {
            this.f19829a = aVar;
        }

        /* renamed from: a */
        private void m21878a(C1592h<Void> hVar) {
            this.f19829a.mo18130b();
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m21878a(hVar);
            return C7581n.f20898a;
        }
    }

    /* renamed from: h */
    public final void mo18135h() {
        this.f19820f.clear();
    }

    /* renamed from: e */
    public final void mo18133e() {
        C31594c cVar = this.f19817a;
        if (cVar != null && cVar.f82710a) {
            cVar.dismiss(null);
        }
        this.f19817a = null;
    }

    /* renamed from: i */
    public final void mo18136i() {
        this.f19820f.clear();
        this.f19819e.clear();
        this.f19821g.clear();
    }

    /* renamed from: g */
    public static boolean m21854g() {
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        if (f == null || !f.isInMainFeed()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static Activity m21855j() {
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        if (f != null) {
            return f.getCurrentActivity();
        }
        return null;
    }

    /* renamed from: l */
    public static boolean m21856l() {
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        if (f != null) {
            C32014g liveProxy = f.getLiveProxy();
            if (liveProxy != null && !liveProxy.mo82986a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo18134f() {
        C31594c cVar = this.f19817a;
        if (cVar != null && cVar.f82710a) {
            C31594c cVar2 = this.f19817a;
            if (cVar2 != null && cVar2.mo82339a()) {
                cVar.dismiss(null);
                this.f19817a = null;
            }
        }
    }

    /* renamed from: n */
    public final boolean mo18138n() {
        if (C31915n.m103671a()) {
            C7093b bVar = this.f19818d;
            if (bVar != null && bVar.mo18364l() == 2) {
                return true;
            }
        }
        return false;
    }

    private C7027a() {
        Object a = C6993a.m21773a(IIMService.class);
        C7573i.m23582a(a, "IMServiceManager.getServ…e(IIMService::class.java)");
        this.f19818d = ((IIMService) a).getAbInterface();
        this.f19819e = new HashSet<>();
        this.f19820f = new LinkedBlockingDeque();
        this.f19821g = new LinkedHashMap();
        mo18127a();
    }

    /* renamed from: m */
    public static String m21857m() {
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
        C32014g liveProxy = f.getLiveProxy();
        C7573i.m23582a((Object) liveProxy, "AwemeImManager.instance().proxy.liveProxy");
        String b = liveProxy.mo82987b();
        C7573i.m23582a((Object) b, "AwemeImManager.instance(…veProxy.innerLivePushPage");
        return b;
    }

    /* renamed from: a */
    public final void mo18127a() {
        C7076p a = C7076p.m22077a();
        C7573i.m23582a((Object) a, "IMSPUtils.get()");
        this.f19822h = a.mo18340x();
        C7076p a2 = C7076p.m22077a();
        C7573i.m23582a((Object) a2, "IMSPUtils.get()");
        Set y = a2.mo18341y();
        if (y != null) {
            this.f19819e.addAll(y);
        }
    }

    /* renamed from: c */
    public final void mo18131c() {
        C31594c cVar = this.f19817a;
        if (cVar != null && cVar.f82710a) {
            C31594c cVar2 = this.f19817a;
            if (cVar2 != null && cVar2.mo82339a()) {
                C1592h.m7848a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo6876a((C1591g<TResult, TContinuationResult>) new C7030c<TResult,TContinuationResult>(this), C1592h.f5958b);
                return;
            }
        }
        C1592h.m7848a(500).mo6876a((C1591g<TResult, TContinuationResult>) new C7031d<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: d */
    public final void mo18132d() {
        C31594c cVar = this.f19817a;
        if (cVar == null || !cVar.f82710a) {
            C31856ab.m103401a(new C7033f(this));
        } else {
            C1592h.m7848a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo6876a((C1591g<TResult, TContinuationResult>) new C7032e<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: p */
    private final boolean m21859p() {
        Activity j = m21855j();
        if (j == null || TextUtils.equals(j.getLocalClassName(), "live.LivePlayActivity")) {
            return false;
        }
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        if (f != null && !f.canShowInnerNotification()) {
            return false;
        }
        C6956a a2 = C6956a.m21632a();
        C7573i.m23582a((Object) a2, "AwemeImManager.instance()");
        C7103h f2 = a2.mo18009f();
        if (f2 == null || !f2.isInPublishPage()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo18130b() {
        C31594c cVar = this.f19817a;
        if (cVar != null && cVar.f82710a) {
            C31594c cVar2 = this.f19817a;
            if (cVar2 != null && cVar2.mo82339a()) {
                C1592h.m7848a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo6876a((C1591g<TResult, TContinuationResult>) new C7034g<TResult,TContinuationResult>(this), C1592h.f5958b);
                return;
            }
        }
        if (m21859p()) {
            C31593b o = m21858o();
            if (o != null) {
                C31594c cVar3 = this.f19817a;
                if (cVar3 == null || !cVar3.f82710a) {
                    this.f19817a = null;
                    Activity j = m21855j();
                    if (j != null) {
                        C31594c cVar4 = new C31594c(j);
                        cVar4.mo82337a(o);
                        this.f19817a = cVar4;
                    }
                } else {
                    C31594c cVar5 = this.f19817a;
                    if (cVar5 != null) {
                        cVar5.mo82337a(o);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final C31593b mo18137k() {
        boolean z;
        String string;
        if (this.f19820f.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        HashSet hashSet = new HashSet();
        while (!this.f19820f.isEmpty()) {
            Message message = (Message) this.f19820f.poll();
            C7573i.m23582a((Object) message, "message");
            if (hashSet.add(message.getConversationId()) && hashSet.size() < 3) {
                if (message.getConversationType() == C11203a.f30380a) {
                    IMUser b = C6961d.m21657a().mo18029b(String.valueOf(message.getSender()));
                    if (b != null) {
                        sb.append(b.getDisplayName());
                        sb.append("、");
                    }
                } else if (message.getConversationType() == C11203a.f30381b) {
                    Conversation a = C6417a.m20015a().mo15530a(message.getConversationId());
                    if (a != null) {
                        ConversationCoreInfo coreInfo = a.getCoreInfo();
                        if (coreInfo != null) {
                            String name = coreInfo.getName();
                            if (name != null) {
                                sb.append(name);
                                sb.append("、");
                            }
                        }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.setLength(sb.length() - 1);
        }
        if (hashSet.size() > 1) {
            string = C6399b.m19921a().getResources().getString(R.string.bho, new Object[]{sb.toString()});
        } else {
            string = C6399b.m19921a().getResources().getString(R.string.a1n, new Object[]{sb.toString()});
        }
        C31593b bVar = new C31593b(1, null, null, null, null, C6399b.m19921a().getResources().getString(R.string.bgm), string, null, null, null, 926, null);
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ef  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p280ss.android.ugc.aweme.p313im.sdk.notification.C31593b m21858o() {
        /*
            r18 = this;
            r0 = r18
            java.util.Queue<com.bytedance.im.core.model.Message> r1 = r0.f19820f
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x0104
            java.util.Queue<com.bytedance.im.core.model.Message> r1 = r0.f19820f
            java.lang.Object r1 = r1.poll()
            com.bytedance.im.core.model.Message r1 = (com.bytedance.p263im.core.model.Message) r1
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r3 = com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType.content(r1)
            java.lang.String r4 = "MessageViewType.content(message)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            java.lang.String r4 = "message"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            int r6 = r0.m21853b(r1)
            int r4 = r1.getConversationType()
            int r5 = com.bytedance.p263im.core.p584a.C11202d.C11203a.f30380a
            if (r4 != r5) goto L_0x006c
            com.ss.android.ugc.aweme.im.sdk.d.d r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            long r7 = r1.getSender()
            java.lang.String r5 = java.lang.String.valueOf(r7)
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r4.mo18019a(r5)
            if (r4 == 0) goto L_0x0104
            com.ss.android.ugc.aweme.im.sdk.notification.b r2 = new com.ss.android.ugc.aweme.im.sdk.notification.b
            int r5 = r1.getMsgType()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            int r5 = com.bytedance.p263im.core.p584a.C11202d.C11203a.f30380a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.String r8 = r1.getConversationId()
            com.ss.android.ugc.aweme.base.model.UrlModel r10 = r4.getAvatarThumb()
            java.lang.String r11 = r4.getDisplayName()
            java.lang.String r12 = com.p280ss.android.ugc.aweme.p313im.sdk.module.session.C31482a.m102380a(r3, r1)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 896(0x380, float:1.256E-42)
            r17 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0104
        L_0x006c:
            int r4 = r1.getConversationType()
            int r5 = com.bytedance.p263im.core.p584a.C11202d.C11203a.f30381b
            if (r4 != r5) goto L_0x0104
            com.bytedance.im.core.model.a r4 = com.bytedance.p263im.core.model.C6417a.m20015a()
            java.lang.String r5 = r1.getConversationId()
            com.bytedance.im.core.model.Conversation r4 = r4.mo15530a(r5)
            if (r4 == 0) goto L_0x0104
            com.bytedance.im.core.model.ConversationCoreInfo r5 = r4.getCoreInfo()
            if (r5 == 0) goto L_0x00a8
            java.lang.String r5 = r5.getIcon()
            if (r5 == 0) goto L_0x00a8
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r7.<init>()
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]
            r9 = 0
            r8[r9] = r5
            r9 = 1
            r8[r9] = r5
            r9 = 2
            r8[r9] = r5
            java.util.List r5 = kotlin.collections.C7525m.m23464b(r8)
            r7.setUrlList(r5)
            r10 = r7
            goto L_0x00a9
        L_0x00a8:
            r10 = r2
        L_0x00a9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.ss.android.ugc.aweme.im.sdk.d.d r7 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            long r8 = r1.getSender()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r7.mo18019a(r8)
            if (r7 == 0) goto L_0x00ce
            java.lang.String r7 = r7.getDisplayName()
            if (r7 == 0) goto L_0x00ce
            r5.append(r7)
            java.lang.String r7 = ": "
            r5.append(r7)
        L_0x00ce:
            java.lang.String r3 = com.p280ss.android.ugc.aweme.p313im.sdk.module.session.C31482a.m102380a(r3, r1)
            r5.append(r3)
            com.ss.android.ugc.aweme.im.sdk.notification.b r3 = new com.ss.android.ugc.aweme.im.sdk.notification.b
            int r7 = r1.getMsgType()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            int r7 = com.bytedance.p263im.core.p584a.C11202d.C11203a.f30381b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = r1.getConversationId()
            com.bytedance.im.core.model.ConversationCoreInfo r1 = r4.getCoreInfo()
            if (r1 == 0) goto L_0x00f3
            java.lang.String r2 = r1.getName()
        L_0x00f3:
            r11 = r2
            java.lang.String r12 = r5.toString()
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 896(0x380, float:1.256E-42)
            r17 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = r3
        L_0x0104:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.notification.C7027a.m21858o():com.ss.android.ugc.aweme.im.sdk.notification.b");
    }

    public /* synthetic */ C7027a(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final void mo18128a(String str) {
        if (str != null && this.f19821g.containsKey(str)) {
            this.f19821g.remove(str);
        }
    }

    /* renamed from: a */
    public final C31593b mo18126a(LivePushMessage livePushMessage) {
        String str;
        String nickname = livePushMessage.getNickname();
        String text = livePushMessage.getText();
        UrlModel avatar = livePushMessage.getAvatar();
        StringBuilder sb = new StringBuilder();
        sb.append(livePushMessage.getSchema());
        sb.append("&request_page=");
        sb.append(m21857m());
        sb.append("&anchor_type=");
        if (livePushMessage.getAnchorType() == 0) {
            str = "old";
        } else {
            str = "new";
        }
        sb.append(str);
        C31593b bVar = new C31593b(4, null, null, null, avatar, nickname, text, sb.toString(), Long.valueOf(livePushMessage.getAnchorId()), Integer.valueOf(livePushMessage.getAnchorType()), 14, null);
        return bVar;
    }

    /* renamed from: a */
    private final boolean m21852a(Message message) {
        String str;
        C7093b bVar = this.f19818d;
        if (bVar == null || !bVar.mo18359g() || bVar.mo18358f() <= 0) {
            return false;
        }
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        if (f == null || !f.canShowInnerNotification()) {
            return false;
        }
        IIMService inst = IMService.inst();
        C7573i.m23582a((Object) inst, "IMService.inst()");
        if (inst.isImReduction() || message.getMsgType() == 15) {
            return false;
        }
        if (message.getMsgType() == 7) {
            BaseContent content = MessageViewType.content(message);
            C7573i.m23582a((Object) content, C38347c.f99553h);
            if (content.getType() == 701) {
                return false;
            }
        }
        Conversation a2 = C6417a.m20015a().mo15530a(message.getConversationId());
        if (a2 != null) {
            if (!a2.isMute()) {
                ConversationSettingInfo settingInfo = a2.getSettingInfo();
                if (settingInfo != null) {
                    Map ext = settingInfo.getExt();
                    if (ext != null) {
                        str = (String) ext.get("a:s_awe_push_close");
                        if (TextUtils.equals(str, "1")) {
                            return true;
                        }
                    }
                }
                str = null;
                if (TextUtils.equals(str, "1")) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final int m21853b(Message message) {
        int i;
        CharSequence charSequence;
        C7093b bVar = this.f19818d;
        if (bVar != null && bVar.mo18360h()) {
            Integer num = (Integer) this.f19821g.get(message.getConversationId());
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Conversation a = C6417a.m20015a().mo15530a(message.getConversationId());
            if (a != null) {
                Map localExt = a.getLocalExt();
                if (localExt != null) {
                    charSequence = (String) localExt.get("a:s_awe_show_close_notification");
                } else {
                    charSequence = null;
                }
                if (!TextUtils.equals(charSequence, "1") && i > 0 && i % 5 == 0) {
                    this.f19821g.remove(message.getConversationId());
                    Map localExt2 = a.getLocalExt();
                    if (localExt2 == null) {
                        localExt2 = new LinkedHashMap();
                    }
                    localExt2.put("a:s_awe_show_close_notification", "1");
                    a.setLocalExt(localExt2);
                    C6425b.m20077a(a.getConversationId(), localExt2, (Runnable) null);
                    return 2;
                }
            }
            Map<String, Integer> map = this.f19821g;
            String conversationId = message.getConversationId();
            C7573i.m23582a((Object) conversationId, "message.conversationId");
            map.put(conversationId, Integer.valueOf(i + 1));
            if (this.f19822h < 2) {
                int size = this.f19819e.size();
                if (size <= 5 || size % 5 != 0) {
                    this.f19819e.add(message.getConversationId());
                    C7076p a2 = C7076p.m22077a();
                    C7573i.m23582a((Object) a2, "IMSPUtils.get()");
                    a2.mo18296a((Set<String>) this.f19819e);
                } else {
                    this.f19822h++;
                    C7076p a3 = C7076p.m22077a();
                    C7573i.m23582a((Object) a3, "IMSPUtils.get()");
                    a3.mo18323h(this.f19822h);
                    return 3;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo18129a(List<Message> list) {
        C7573i.m23587b(list, "list");
        if (list.size() == 1) {
            Message message = (Message) list.get(0);
            if (!message.isSelf()) {
                if (m21852a(message)) {
                    this.f19820f.offer(message);
                }
                if (!this.f19820f.isEmpty() && m21859p()) {
                    mo18130b();
                }
            }
        }
    }
}

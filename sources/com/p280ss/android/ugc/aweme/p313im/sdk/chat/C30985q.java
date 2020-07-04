package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.text.TextUtils;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C11439h;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.C6433e;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.PropertyMsg;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseExtra;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30946p;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30950q;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30733a;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C7007f;
import com.p280ss.android.ugc.aweme.p313im.sdk.p1327i.C31331a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31080b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.q */
public class C30985q extends C31080b implements C11439h {

    /* renamed from: e */
    private static String f81110e = "q";

    /* renamed from: a */
    public CharSequence f81111a;

    /* renamed from: b */
    public C11443k f81112b;

    /* renamed from: c */
    public Runnable f81113c;

    /* renamed from: d */
    public Runnable f81114d;

    /* renamed from: f */
    private boolean f81115f;

    /* renamed from: g */
    private int f81116g;

    /* renamed from: h */
    private int f81117h;

    /* renamed from: i */
    private int f81118i;

    /* renamed from: j */
    private int f81119j;

    /* renamed from: k */
    private int f81120k;

    /* renamed from: l */
    private int f81121l;

    /* renamed from: m */
    private int f81122m;

    /* renamed from: n */
    private int f81123n;

    /* renamed from: o */
    private int f81124o;

    /* renamed from: p */
    private int f81125p;

    /* renamed from: q */
    private int f81126q;

    /* renamed from: r */
    private int f81127r;

    /* renamed from: s */
    private int f81128s;

    /* renamed from: t */
    private int f81129t;

    /* renamed from: u */
    private int f81130u;

    /* renamed from: v */
    private int f81131v;

    /* renamed from: w */
    private int f81132w;

    /* renamed from: x */
    private MessageAdapter f81133x;

    /* renamed from: y */
    private C6425b f81134y;

    /* renamed from: a */
    public final void mo27446a(int i, PropertyMsg propertyMsg) {
    }

    /* renamed from: g */
    public final void mo27467g(List<PropertyMsg> list) {
    }

    public final void bb_() {
        super.bb_();
        this.f81112b.mo27661a();
        this.f81134y.mo15572b();
    }

    /* renamed from: a */
    public final void mo26596a() {
        super.mo26596a();
        m100819d();
        this.f81112b.mo27667b();
        if (this.f81115f) {
            this.f81133x.notifyDataSetChanged();
            this.f81115f = false;
        }
    }

    /* renamed from: d */
    private void m100819d() {
        Conversation a = C6417a.m20015a().mo15530a(this.f81111a.toString());
        long a2 = C6425b.m20074a(this.f81111a.toString());
        if (a == null || a.isTemp()) {
            C6417a.m20015a().mo15533a(a2, (C11195b<Conversation>) new C11195b<Conversation>() {
                /* renamed from: a */
                public final void mo18088a(C11438g gVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo18089a(Conversation conversation) {
                    C6417a.m20015a();
                    C6417a.m20026d(C30985q.this.f81111a.toString());
                }
            });
        }
    }

    public final void bc_() {
        String str;
        this.f81112b.mo27668c();
        this.f81126q += C30950q.f81048a;
        this.f81130u += C30946p.f81038b;
        C30950q.f81048a = 0;
        C30946p.f81038b = 0;
        C31858ad.m103406a();
        C31858ad.m103422a(this.f81111a.toString(), this.f81116g, this.f81117h, this.f81119j, this.f81120k, this.f81121l, this.f81122m, this.f81123n, this.f81124o, this.f81125p, this.f81126q, this.f81127r, this.f81128s, this.f81129t, this.f81130u, this.f81131v, this.f81132w);
        String charSequence = this.f81111a.toString();
        if (this.f81133x.mo80441i()) {
            str = "stranger";
        } else {
            str = "no_stranger";
        }
        C31858ad.m103426a(charSequence, str, this.f81116g, this.f81118i);
        this.f81116g = 0;
        this.f81117h = 0;
        this.f81118i = 0;
        this.f81120k = 0;
        this.f81119j = 0;
        this.f81121l = 0;
        this.f81122m = 0;
        this.f81123n = 0;
        this.f81124o = 0;
        this.f81125p = 0;
        this.f81126q = 0;
        this.f81127r = 0;
        this.f81128s = 0;
        this.f81129t = 0;
        this.f81130u = 0;
        this.f81131v = 0;
        this.f81132w = 0;
        this.f81115f = true;
    }

    /* renamed from: a */
    public final void mo15534a(Conversation conversation) {
        this.f81112b.mo27454a(true);
    }

    /* renamed from: c */
    public final void mo27462c(List<Message> list) {
        this.f81133x.mo80431a(list, 2);
    }

    /* renamed from: d */
    public final void mo27463d(List<Message> list) {
        this.f81133x.mo80431a(list, 4);
    }

    /* renamed from: e */
    public final void mo27464e(List<Message> list) {
        this.f81133x.mo80431a(list, 5);
    }

    /* renamed from: f */
    public final void mo27466f(List<Message> list) {
        this.f81133x.mo80431a(list, 6);
    }

    /* renamed from: c */
    public final void mo15545c(Conversation conversation) {
        super.mo15545c(conversation);
        C30733a.m100112a(conversation);
        if (this.f81113c != null) {
            this.f81113c.run();
        }
    }

    /* renamed from: b */
    public final void mo15540b(Conversation conversation) {
        super.mo15540b(conversation);
        if (this.f81114d != null) {
            this.f81114d.run();
        }
    }

    /* renamed from: a */
    private static void m100816a(BaseExtra baseExtra) {
        if (baseExtra != null) {
            int statusCode = baseExtra.getStatusCode();
            if (!(statusCode == 7178 || statusCode == 7181 || statusCode == 7284 || statusCode == 7523 || statusCode == 7530)) {
                switch (statusCode) {
                    case 7274:
                    case 7275:
                        break;
                }
            }
            m100817a("message_self_visiable", String.valueOf(statusCode));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r3 != 4) goto L_0x0031;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m100822f(com.bytedance.p263im.core.model.Message r3) {
        /*
            r2 = this;
            int r0 = r3.getMsgStatus()
            r1 = 3
            if (r0 == r1) goto L_0x0008
            return
        L_0x0008:
            java.util.Map r3 = r3.getLocalExt()     // Catch:{ Exception -> 0x001d }
            java.lang.String r0 = "s:send_response_check_msg"
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x001d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x001d }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra> r0 = com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseExtra.class
            java.lang.Object r3 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m.m103667a(r3, r0)     // Catch:{ Exception -> 0x001d }
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseExtra) r3     // Catch:{ Exception -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            r0 = 1
            if (r3 == 0) goto L_0x002c
            int r3 = r3.getStatusCode()
            if (r3 < 0) goto L_0x002c
            if (r3 == r0) goto L_0x002c
            r1 = 4
            if (r3 != r1) goto L_0x0031
        L_0x002c:
            int r3 = r2.f81118i
            int r3 = r3 + r0
            r2.f81118i = r3
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30985q.m100822f(com.bytedance.im.core.model.Message):void");
    }

    /* renamed from: b */
    public final void mo27456b(Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(message);
        this.f81133x.mo80431a((List<Message>) arrayList, 7);
    }

    /* renamed from: c */
    public static void m100818c(Message message) {
        int i;
        if (message != null) {
            Map localExt = message.getLocalExt();
            if (localExt != null && !localExt.isEmpty()) {
                int msgStatus = message.getMsgStatus();
                BaseExtra baseExtra = null;
                if (localExt.containsKey("s:send_response_check_msg")) {
                    try {
                        baseExtra = (BaseExtra) C31913m.m103667a((String) localExt.get("s:send_response_check_msg"), BaseExtra.class);
                    } catch (Exception unused) {
                    }
                    if (msgStatus == 3 && C31331a.m102016a(baseExtra)) {
                        C31331a.m102015a().mo81899a(message, baseExtra.getStatusCode());
                    }
                    if (msgStatus == 2) {
                        m100816a(baseExtra);
                    }
                }
                if (msgStatus == 3) {
                    String str = (String) localExt.get("s:err_code");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            i = Integer.parseInt(str);
                        } catch (Exception unused2) {
                        }
                        if (i == 0 && baseExtra != null) {
                            i = baseExtra.getStatusCode();
                        }
                        C6944i.f19642b.mo17974a(i);
                        m100817a("message_send_fail", String.valueOf(i));
                    }
                    i = 0;
                    i = baseExtra.getStatusCode();
                    C6944i.f19642b.mo17974a(i);
                    m100817a("message_send_fail", String.valueOf(i));
                }
            }
        }
    }

    /* renamed from: d */
    public static void m100820d(Message message) {
        if (message.getMsgStatus() == 1) {
            SessionInfo b = C31858ad.m103442b();
            String str = "click";
            if (b != null && b.getEnterFrom() == 11) {
                str = "click_push";
            }
            C31858ad.m103406a();
            C31858ad.m103412a(message, str);
            return;
        }
        if (message.getMsgStatus() == 2 || message.getMsgStatus() == 3) {
            C31858ad.m103406a();
            C31858ad.m103444b(message);
        }
    }

    /* renamed from: e */
    private void m100821e(Message message) {
        if (message.getMsgStatus() == 3) {
            this.f81117h++;
            m100822f(message);
            if (message.getMsgType() == 5) {
                BaseContent content = MessageViewType.content(message);
                if (content != null) {
                    if (content.getType() == 501) {
                        this.f81122m++;
                    } else if (content.getType() == 502) {
                        this.f81124o++;
                    } else {
                        this.f81120k++;
                    }
                }
            } else if (message.getMsgType() == 2 || message.getMsgType() == 27) {
                this.f81126q++;
            } else if (message.getMsgType() == 7) {
                this.f81128s++;
            } else if (message.getMsgType() == 17) {
                this.f81130u++;
            } else if (message.getMsgType() == 30) {
                this.f81132w++;
            }
        } else if (message.getMsgStatus() == 2) {
            this.f81116g++;
            if (message.getMsgType() == 5) {
                BaseContent content2 = MessageViewType.content(message);
                if (content2 != null) {
                    if (content2.getType() == 501) {
                        this.f81121l++;
                    } else if (content2.getType() == 502) {
                        this.f81123n++;
                    } else {
                        this.f81119j++;
                    }
                }
            } else if (message.getMsgType() == 2 || message.getMsgType() == 27) {
                this.f81125p++;
            } else if (message.getMsgType() == 7) {
                this.f81127r++;
            } else if (message.getMsgType() == 17) {
                this.f81129t++;
            } else if (message.getMsgType() == 30) {
                this.f81131v++;
            }
        }
    }

    /* renamed from: a */
    public final void mo27447a(Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(message);
        this.f81133x.mo80431a((List<Message>) arrayList, 3);
    }

    /* renamed from: a */
    public final void mo27454a(boolean z) {
        this.f81133x.mo80438f();
    }

    /* renamed from: a */
    private static void m100817a(String str, String str2) {
        C7103h f = C6956a.m21632a().mo18009f();
        if (f != null) {
            f.feedbackIm(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo27455b(int i, Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(message);
        this.f81133x.mo80431a((List<Message>) arrayList, 1);
    }

    public C30985q(String str, MessageAdapter messageAdapter) {
        this.f81111a = str;
        this.f81133x = messageAdapter;
        if (ReadStateViewModel.m100070d()) {
            this.f81112b = new C11443k(str, true, true);
        } else {
            this.f81112b = new C11443k(str);
        }
        this.f81112b.mo27663a((C11439h) this);
        messageAdapter.f80391c = this.f81112b;
        this.f81134y = new C6425b(str);
        this.f81134y.mo15565a((C6433e) this);
    }

    /* renamed from: a */
    public final void mo27445a(int i, Message message) {
        if (this.f81133x.mo80441i() && message.getMsgStatus() == 2) {
            C7705c.m23799a().mo20394d(new C7007f(this.f81111a.toString()));
        }
        m100821e(message);
        ArrayList arrayList = new ArrayList();
        arrayList.add(message);
        this.f81133x.mo80431a((List<Message>) arrayList, 0);
        if (message.getMsgStatus() == 3) {
            m100819d();
        }
    }
}

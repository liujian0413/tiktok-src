package com.p280ss.android.ugc.aweme.p313im.sdk.share;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.C31269b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6959c;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.C31823a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b */
public final class C31814b {

    /* renamed from: b */
    public static final C31816a f83232b = new C31816a(null);

    /* renamed from: a */
    public boolean f83233a;

    /* renamed from: c */
    private int f83234c;

    /* renamed from: d */
    private final C31823a f83235d;

    /* renamed from: e */
    private final C31806a f83236e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b$a */
    public static final class C31816a {
        private C31816a() {
        }

        public /* synthetic */ C31816a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b$b */
    static final class C31817b extends Lambda implements C7562b<Conversation, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31814b f83238a;

        /* renamed from: b */
        final /* synthetic */ String f83239b;

        /* renamed from: c */
        final /* synthetic */ SharePackage f83240c;

        /* renamed from: d */
        final /* synthetic */ BaseContent f83241d;

        /* renamed from: e */
        final /* synthetic */ C7562b f83242e;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b$b$a */
        static final class C31818a implements C6943d {

            /* renamed from: a */
            final /* synthetic */ Conversation f83243a;

            /* renamed from: b */
            final /* synthetic */ C31817b f83244b;

            C31818a(Conversation conversation, C31817b bVar) {
                this.f83243a = conversation;
                this.f83244b = bVar;
            }

            public final void sendMsg() {
                C7052b.m21958a(C7525m.m23457a(C6959c.m21648a(this.f83243a)), this.f83244b.f83239b, this.f83244b.f83240c, this.f83244b.f83241d);
                this.f83244b.f83242e.invoke(Boolean.valueOf(true));
            }
        }

        C31817b(C31814b bVar, String str, SharePackage sharePackage, BaseContent baseContent, C7562b bVar2) {
            this.f83238a = bVar;
            this.f83239b = str;
            this.f83240c = sharePackage;
            this.f83241d = baseContent;
            this.f83242e = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m103265a((Conversation) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103265a(Conversation conversation) {
            if (conversation != null) {
                new C6928b(C6399b.m19921a(), new C31818a(conversation, this)).sendMsg();
            } else {
                this.f83242e.invoke(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b$c */
    static final class C31819c extends Lambda implements C7563m<Conversation, C11438g, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31814b f83245a;

        /* renamed from: b */
        final /* synthetic */ C7562b f83246b;

        C31819c(C31814b bVar, C7562b bVar2) {
            this.f83245a = bVar;
            this.f83246b = bVar2;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m103266a((Conversation) obj, (C11438g) obj2);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
            if (r6 == null) goto L_0x003e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
            if (r5 == null) goto L_0x000f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m103266a(com.bytedance.p263im.core.model.Conversation r5, com.bytedance.p263im.core.model.C11438g r6) {
            /*
                r4 = this;
                if (r5 == 0) goto L_0x000f
                java.lang.String r0 = r5.getConversationId()
                java.lang.String r1 = "success"
                java.lang.String r2 = "share"
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103484h(r0, r1, r2)
                if (r5 != 0) goto L_0x0058
            L_0x000f:
                r0 = 0
                if (r6 == 0) goto L_0x0015
                java.lang.String r6 = r6.f30960e
                goto L_0x0016
            L_0x0015:
                r6 = r0
            L_0x0016:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.GroupCheckMsg> r1 = com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg.class
                java.lang.Object r6 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m.m103667a(r6, r1)
                com.ss.android.ugc.aweme.im.sdk.group.model.GroupCheckMsg r6 = (com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg) r6
                r1 = 2131823687(0x7f110c47, float:1.928018E38)
                if (r6 == 0) goto L_0x003e
                android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                java.lang.String r3 = r6.getStatusMsg()
                if (r3 != 0) goto L_0x0035
                android.content.Context r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                java.lang.String r3 = r3.getString(r1)
            L_0x0035:
                com.bytedance.ies.dmt.ui.c.a r2 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31387a(r2, r3)
                r2.mo25750a()
                if (r6 != 0) goto L_0x0051
            L_0x003e:
                android.content.Context r6 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                java.lang.String r1 = r2.getString(r1)
                com.bytedance.ies.dmt.ui.c.a r6 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31387a(r6, r1)
                r6.mo25750a()
            L_0x0051:
                java.lang.String r6 = "failure"
                java.lang.String r1 = "share"
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103484h(r0, r6, r1)
            L_0x0058:
                kotlin.jvm.a.b r6 = r4.f83246b
                r6.invoke(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.share.C31814b.C31819c.m103266a(com.bytedance.im.core.model.Conversation, com.bytedance.im.core.model.g):void");
        }
    }

    /* renamed from: a */
    private final boolean m103257a() {
        Context a = C6399b.m19921a();
        switch (this.f83234c) {
            case 1:
                C10761a.m31403c(a, a.getString(R.string.br3, new Object[]{Integer.valueOf(10)})).mo25750a();
                return true;
            case 2:
                C10761a.m31399c(a, (int) R.string.a2m).mo25750a();
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private static boolean m103259a(IMContact iMContact) {
        int i = C11203a.f30381b;
        if (!(iMContact instanceof IMConversation)) {
            iMContact = null;
        }
        IMConversation iMConversation = (IMConversation) iMContact;
        if (iMConversation == null || i != iMConversation.getConversationType()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m103261b(IMContact iMContact) {
        if (!(iMContact instanceof IMUser)) {
            iMContact = null;
        }
        IMUser iMUser = (IMUser) iMContact;
        if (iMUser == null || iMUser.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo82629a(Set<IMContact> set) {
        boolean z;
        Collection collection = set;
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || set.size() <= 1) {
            this.f83235d.f83248a.setVisibility(4);
            m103260a(false, false);
            return true;
        } else if (set.size() <= 10) {
            this.f83235d.f83248a.setVisibility(0);
            Set linkedHashSet = new LinkedHashSet();
            Set linkedHashSet2 = new LinkedHashSet();
            Set linkedHashSet3 = new LinkedHashSet();
            for (IMContact iMContact : set) {
                if (m103259a(iMContact)) {
                    linkedHashSet.add(iMContact);
                } else if (m103261b(iMContact)) {
                    linkedHashSet2.add(iMContact);
                } else {
                    linkedHashSet3.add(iMContact);
                }
            }
            if ((!linkedHashSet.isEmpty()) || (!linkedHashSet3.isEmpty())) {
                m103260a(false, false);
                i = 2;
            }
            this.f83234c = i;
            return true;
        } else if (this.f83233a) {
            return false;
        } else {
            m103260a(false, false);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m103260a(boolean z, boolean z2) {
        int i;
        if (!z2 && (this.f83233a == z || (z && m103257a()))) {
            return false;
        }
        this.f83233a = z;
        ImageView imageView = this.f83235d.f83249b;
        if (z) {
            i = R.drawable.ai4;
        } else if (this.f83235d.f83250c) {
            i = R.drawable.ai6;
        } else {
            i = R.drawable.ai5;
        }
        imageView.setImageResource(i);
        this.f83236e.mo82536a(z);
        return true;
    }

    /* renamed from: a */
    public final void mo82627a(List<IMContact> list, C7562b<? super Conversation, C7581n> bVar) {
        C7573i.m23587b(list, "list");
        C7573i.m23587b(bVar, "callback");
        Iterable<IMContact> iterable = list;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((IMContact) next) instanceof IMUser) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        if (list2 != null) {
            C6921a.m21555a("ShareCreateGroupDelegate list contain group");
            bVar.invoke(null);
            return;
        }
        C31858ad.m103505s("share");
        C31244a.m101818a();
        Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
        for (IMContact iMContact : iterable) {
            if (iMContact != null) {
                arrayList2.add((IMUser) iMContact);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
        C31243a.m101798a((List) arrayList2, (Map<String, String>) C31269b.m101891a(6), (C7563m<? super Conversation, ? super C11438g, C7581n>) new C31819c<Object,Object,C7581n>(this, bVar));
    }

    public C31814b(C31823a aVar, C31806a aVar2, boolean z) {
        C7573i.m23587b(aVar, "createGroupPayload");
        C7573i.m23587b(aVar2, "callback");
        this.f83235d = aVar;
        this.f83236e = aVar2;
        this.f83235d.f83248a.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C31814b f83237a;

            {
                this.f83237a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                if (!this.f83237a.m103260a(!this.f83237a.f83233a, false)) {
                    str = "disabled";
                } else if (this.f83237a.f83233a) {
                    str = "on";
                } else {
                    str = "off";
                }
                C31858ad.m103506t(str);
            }
        });
        this.f83235d.f83248a.setVisibility(4);
        m103260a(z, true);
    }

    public /* synthetic */ C31814b(C31823a aVar, C31806a aVar2, boolean z, int i, C7571f fVar) {
        this(aVar, aVar2, false);
    }

    /* renamed from: a */
    public final void mo82628a(Set<IMContact> set, SharePackage sharePackage, BaseContent baseContent, String str, C7562b<? super Boolean, C7581n> bVar) {
        boolean z;
        C31814b bVar2;
        C7573i.m23587b(bVar, "callback");
        Collection collection = set;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bVar2 = this;
        } else {
            bVar2 = null;
        }
        if (bVar2 != null) {
            bVar.invoke(Boolean.valueOf(false));
            return;
        }
        if (set == null) {
            C7573i.m23580a();
        }
        List d = C7525m.m23509d(collection);
        C31817b bVar3 = new C31817b(this, str, sharePackage, baseContent, bVar);
        mo82627a(d, (C7562b<? super Conversation, C7581n>) bVar3);
    }
}

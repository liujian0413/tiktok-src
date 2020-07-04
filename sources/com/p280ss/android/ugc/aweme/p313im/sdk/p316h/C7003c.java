package com.p280ss.android.ugc.aweme.p313im.sdk.p316h;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.h.c */
public final class C7003c {

    /* renamed from: a */
    public static final C7004a f19762a = new C7004a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.h.c$a */
    public static final class C7004a {

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.h.c$a$a */
        public static final class C7005a implements C6943d {

            /* renamed from: a */
            final /* synthetic */ SharePackage f19763a;

            /* renamed from: b */
            final /* synthetic */ Context f19764b;

            /* renamed from: c */
            final /* synthetic */ Runnable f19765c;

            /* renamed from: d */
            final /* synthetic */ Runnable f19766d;

            public final void sendMsg() {
                BaseContent b = C7052b.m21961b(this.f19763a);
                if (b != null) {
                    IMUser iMUser = new IMUser();
                    iMUser.setUid(this.f19763a.f20186l.getString("uid_for_share"));
                    C7004a.m21798a(this.f19764b, iMUser, b, this.f19765c, this.f19766d);
                }
            }

            C7005a(SharePackage sharePackage, Context context, Runnable runnable, Runnable runnable2) {
                this.f19763a = sharePackage;
                this.f19764b = context;
                this.f19765c = runnable;
                this.f19766d = runnable2;
            }
        }

        private C7004a() {
        }

        public /* synthetic */ C7004a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m21800a(Message message) {
            C7573i.m23587b(message, "storyMessage");
            Map localExt = message.getLocalExt();
            C7573i.m23582a((Object) localExt, "storyMessage.localExt");
            localExt.put("story_state_unexpected", "story_state_unexpected");
            C11443k.m33755e(message);
        }

        /* renamed from: a */
        public static void m21799a(Context context, SharePackage sharePackage, Runnable runnable, Runnable runnable2) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(sharePackage, "sharePackage");
            new C6928b(context, new C7005a(sharePackage, context, runnable, runnable2)).sendMsg();
        }

        /* renamed from: a */
        public static void m21798a(Context context, IMUser iMUser, BaseContent baseContent, Runnable runnable, Runnable runnable2) {
            C7058be.m21980a().mo18263a(iMUser.getUid(), baseContent);
            C10761a.m31384a(context, (int) R.string.bpe, 0).mo25750a();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public static final void m21796a(Context context, SharePackage sharePackage, Runnable runnable, Runnable runnable2) {
        C7004a.m21799a(context, sharePackage, runnable, runnable2);
    }

    /* renamed from: a */
    public static final void m21797a(Message message) {
        C7004a.m21800a(message);
    }
}

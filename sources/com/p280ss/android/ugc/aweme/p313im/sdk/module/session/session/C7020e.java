package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerMessage;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.C7023c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31891bc;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C32013b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.e */
public class C7020e extends ChatSession {

    /* renamed from: d */
    public IMUser f19804d;

    /* renamed from: b */
    public int mo18115b() {
        return 1;
    }

    /* renamed from: c */
    public final IMUser mo18116c() {
        return this.f19804d;
    }

    /* renamed from: a */
    public C32013b mo18114a() {
        return new C32013b() {
            /* renamed from: a */
            public final void mo18117a(Context context, final C7102a aVar, int i) {
                if (i == 1) {
                    IMUser c = C7020e.this.mo18116c();
                    c.setType(4);
                    ChatRoomActivity.m21589a(context, c, 2);
                    C31858ad.m103406a();
                    C31858ad.m103449b(aVar.bf_(), "stranger");
                } else if (i == 2) {
                    C31085i.f81578a.mo81571c(C7020e.this.mo18116c().getUid());
                    C31891bc.m103605a(C7020e.this.bf_());
                } else {
                    if (i == 0) {
                        C25712a aVar2 = new C25712a(context);
                        aVar2.mo66614a((CharSequence[]) new String[]{context.getResources().getString(R.string.bik)}, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                if (i == 0) {
                                    C7023c.m21847a().mo18123a(aVar.bf_());
                                    C31858ad.m103406a();
                                    C31858ad.m103482h(aVar.bf_());
                                }
                            }
                        });
                        aVar2.mo66615b();
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public static C7020e m21842a(StrangerMessage strangerMessage, int i) {
        C7020e eVar = new C7020e();
        eVar.f19942f = strangerMessage.getFromUser().getAvatarThumb();
        eVar.f19944h = MessageViewType.content(strangerMessage.getMsgType(), strangerMessage.getContent(), strangerMessage.isRecalled(), Long.valueOf(strangerMessage.getFromUser().getUid()).longValue()).getMsgHint();
        eVar.f19943g = strangerMessage.getFromUser().getNickName();
        String uid = strangerMessage.getFromUser().getUid();
        if (TextUtils.isEmpty(uid)) {
            StringBuilder sb = new StringBuilder("StrangerSession convert strangerSessionId:");
            sb.append(uid);
            C6921a.m21555a(sb.toString());
        }
        eVar.f19941e = uid;
        eVar.mo18368a(strangerMessage.getCreateTime());
        eVar.f19804d = strangerMessage.getFromUser();
        eVar.f19946j = i;
        return eVar;
    }
}

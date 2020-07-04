package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30733a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31891bc;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C32013b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.ChatSession */
public class ChatSession extends IMBaseSession {

    /* renamed from: a */
    public VerifyType f19793a = VerifyType.NONE;

    /* renamed from: b */
    public boolean f19794b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.ChatSession$VerifyType */
    public enum VerifyType {
        NONE,
        MUSICIAN,
        ENTERPRISE,
        OTHER
    }

    /* renamed from: b */
    public int mo18115b() {
        return 0;
    }

    /* renamed from: a */
    public C32013b mo18114a() {
        return new C32013b() {
            /* renamed from: a */
            public final void mo18117a(Context context, C7102a aVar, int i) {
                final boolean z;
                int i2;
                String valueOf = String.valueOf(C6425b.m20074a(aVar.bf_()));
                if (i == 1) {
                    if (valueOf.equals(C7074e.m22069b())) {
                        C31858ad.m103406a();
                        C31858ad.m103449b("", "to_myself");
                    } else {
                        C31858ad.m103406a();
                        C31858ad.m103449b(valueOf, "no_stranger");
                        C31858ad.m103406a();
                        C31858ad.m103432a(ChatSession.this.f19941e, valueOf, "private", "click_message", "message");
                    }
                    C31858ad.m103406a();
                    C31858ad.m103448b("chat_notice_click", aVar.f19946j);
                    IMUser b = C6961d.m21657a().mo18029b(valueOf);
                    if (b == null) {
                        b = new IMUser();
                        b.setUid(valueOf);
                        if (ChatSession.this.f19942f instanceof UrlModel) {
                            b.setAvatarThumb((UrlModel) ChatSession.this.f19942f);
                        }
                        b.setNickName(ChatSession.this.f19943g);
                    }
                    b.setType(-1);
                    ChatRoomActivity.m21589a(context, b, 3);
                } else if (i != 2) {
                    if (i == 0) {
                        final C6425b bVar = new C6425b(aVar.bf_());
                        if (bVar.mo15562a() == null || !bVar.mo15562a().isStickTop()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C25712a aVar2 = new C25712a(context);
                        String[] strArr = new String[2];
                        if (z) {
                            i2 = R.string.bhf;
                        } else {
                            i2 = R.string.bqe;
                        }
                        strArr[0] = context.getString(i2);
                        strArr[1] = context.getString(R.string.bik);
                        final Context context2 = context;
                        final C7102a aVar3 = aVar;
                        C70161 r1 = new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                switch (i) {
                                    case 0:
                                        bVar.mo15571a(!z, (C11195b<Conversation>) new C11195b<Conversation>() {
                                            /* renamed from: a */
                                            public final /* bridge */ /* synthetic */ void mo18089a(Object obj) {
                                            }

                                            /* renamed from: a */
                                            public final void mo18088a(C11438g gVar) {
                                                int i;
                                                if (z) {
                                                    i = R.string.bhg;
                                                } else {
                                                    i = R.string.bqf;
                                                }
                                                C10761a.m31399c(context2, i).mo25750a();
                                            }
                                        });
                                        return;
                                    case 1:
                                        C6417a.m20015a();
                                        C6417a.m20023b(aVar3.bf_());
                                        C31858ad.m103406a();
                                        C31858ad.m103482h(aVar3.bf_());
                                        break;
                                }
                            }
                        };
                        aVar2.mo66614a((CharSequence[]) strArr, (OnClickListener) r1);
                        aVar2.mo66615b();
                    }
                } else if (!ChatSession.this.f19794b || C30733a.m100122f()) {
                    C31085i.f81578a.mo81571c(valueOf);
                    C31891bc.m103605a(valueOf);
                    C31858ad.m103406a();
                    C31858ad.m103473f(ChatSession.this.bf_(), "message");
                    C31858ad.m103406a();
                    C31858ad.m103469e(valueOf, "message", "click_head");
                }
            }
        };
    }

    /* renamed from: c */
    public IMUser mo18116c() {
        return C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(bf_())));
    }
}

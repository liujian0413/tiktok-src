package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C32013b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.b */
public final class C31517b extends IMBaseSession {

    /* renamed from: a */
    public int f82514a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.b$a */
    static final class C31518a implements C32013b {

        /* renamed from: a */
        final /* synthetic */ C31517b f82515a;

        C31518a(C31517b bVar) {
            this.f82515a = bVar;
        }

        /* renamed from: a */
        public final void mo18117a(final Context context, final C7102a aVar, int i) {
            final boolean z;
            String str;
            if (i == 1 || i == 2) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_enter_from", 3);
                ChatRoomActivity.m21596a(context, this.f82515a.bf_(), 3, bundle);
                C31858ad.m103406a();
                C31858ad.m103432a(this.f82515a.bf_(), "", "group", "click_message", "message");
                return;
            }
            if (i == 0) {
                C7573i.m23582a((Object) aVar, "session");
                final C6425b bVar = new C6425b(aVar.bf_());
                Conversation a = bVar.mo15562a();
                if (a != null) {
                    z = a.isStickTop();
                } else {
                    z = false;
                }
                C25712a aVar2 = new C25712a(context);
                String[] strArr = new String[2];
                if (z) {
                    str = context.getString(R.string.bhf);
                } else {
                    str = context.getString(R.string.bqe);
                }
                strArr[0] = str;
                strArr[1] = context.getString(R.string.bik);
                aVar2.mo66614a((CharSequence[]) strArr, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        switch (i) {
                            case 0:
                                bVar.mo15571a(!z, (C11195b<Conversation>) new C11195b<Conversation>(this) {

                                    /* renamed from: a */
                                    final /* synthetic */ C315191 f82520a;

                                    /* renamed from: a */
                                    private static void m102483a(Conversation conversation) {
                                        C7573i.m23587b(conversation, "result");
                                    }

                                    {
                                        this.f82520a = r1;
                                    }

                                    /* renamed from: a */
                                    public final /* bridge */ /* synthetic */ void mo18089a(Object obj) {
                                        m102483a((Conversation) obj);
                                    }

                                    /* renamed from: a */
                                    public final void mo18088a(C11438g gVar) {
                                        int i;
                                        C7573i.m23587b(gVar, "error");
                                        if (z) {
                                            i = R.string.bhg;
                                        } else {
                                            i = R.string.bqf;
                                        }
                                        C10761a.m31399c(context, i).mo25750a();
                                    }
                                });
                                break;
                            case 1:
                                C6417a.m20015a();
                                C7102a aVar = aVar;
                                C7573i.m23582a((Object) aVar, "session");
                                C6417a.m20023b(aVar.bf_());
                                C31858ad.m103406a();
                                C7102a aVar2 = aVar;
                                C7573i.m23582a((Object) aVar2, "session");
                                C31858ad.m103482h(aVar2.bf_());
                                break;
                        }
                        dialogInterface.dismiss();
                    }
                });
                aVar2.mo66615b();
            }
        }
    }

    /* renamed from: b */
    public final int mo18115b() {
        return 20;
    }

    /* renamed from: a */
    public final C32013b mo18114a() {
        return new C31518a(this);
    }

    /* renamed from: e */
    public final SpannableStringBuilder mo82227e() {
        boolean z;
        boolean z2;
        List list;
        boolean z3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Conversation a = C6417a.m20015a().mo15530a(this.f19941e);
        if (a == null) {
            return spannableStringBuilder;
        }
        if (!mo18371h() || !a.isMute()) {
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f19944h)) {
            String str = this.f19944h;
            C7573i.m23582a((Object) str, C38347c.f99553h);
            this.f19944h = C7634n.m23709a(str, 10, ' ', false);
            CharSequence b = C31244a.m101818a().mo81798b(a);
            if (b == null || b.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(C6399b.m19921a().getResources().getString(R.string.a0g));
                sb.append(']');
                spannableStringBuilder.append(sb.toString());
            }
            Message lastMessage = a.getLastMessage();
            if (lastMessage == null || lastMessage.getMsgType() != 1004) {
                List mentionMessages = a.getMentionMessages();
                if (mentionMessages != null) {
                    Iterable iterable = mentionMessages;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        Message message = (Message) next;
                        C7573i.m23582a((Object) message, "it");
                        if (!message.isRecalled()) {
                            arrayList.add(next);
                        }
                    }
                    list = (List) arrayList;
                } else {
                    list = null;
                }
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    String string = C6399b.m19921a().getResources().getString(R.string.bli);
                    spannableStringBuilder.append(string);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C6399b.m19921a().getResources().getColor(R.color.axf)), 0, string.length(), 33);
                } else if (a.getUnreadCount() > 1 && z) {
                    Message lastMessage2 = a.getLastMessage();
                    if (lastMessage2 != null && !lastMessage2.isSelf()) {
                        if (a.getUnreadCount() > 999) {
                            spannableStringBuilder.append(C6399b.m19921a().getResources().getString(R.string.blj, new Object[]{Integer.valueOf(999)}));
                        } else {
                            spannableStringBuilder.append(C6399b.m19921a().getResources().getString(R.string.blj, new Object[]{Integer.valueOf(this.f19946j)}));
                        }
                    }
                }
                spannableStringBuilder.append(this.f19944h);
            } else {
                spannableStringBuilder.append(this.f19944h);
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }
}

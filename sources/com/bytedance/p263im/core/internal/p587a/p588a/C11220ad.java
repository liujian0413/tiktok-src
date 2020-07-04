package com.bytedance.p263im.core.internal.p587a.p588a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.p263im.core.internal.p589b.C11314a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11400a;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11202d.C11204b;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11208c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.SendMessageRequestBody.Builder;
import com.bytedance.p263im.core.proto.SendMessageResponseBody;
import com.bytedance.p263im.core.proto.SendMessageStatus;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.a.ad */
final class C11220ad extends C11280o<Message> {
    C11220ad() {
        super(IMCMD.SEND_MESSAGE.getValue());
    }

    C11220ad(C11195b<Message> bVar) {
        super(IMCMD.SEND_MESSAGE.getValue(), bVar);
    }

    /* renamed from: c */
    private void m32881c(final Message message) {
        C11319e.m33192a(new C11318d<Pair<Conversation, Message>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Pair<Conversation, Message> mo15560a() {
                boolean a = C11375q.m33429a().mo27396a(message);
                C11368l.m33375a();
                Conversation a2 = C11368l.m33377a(message.getConversationId());
                if (a2 != null) {
                    a2.setUpdatedTime(Math.max(a2.getUpdatedTime(), message.getCreatedAt()));
                    a2.setLastMessageIndex(Math.max(a2.getLastMessageIndex(), message.getIndex()));
                    C11368l.m33375a();
                    C11368l.m33384b(a2);
                }
                if (a) {
                    return new Pair<>(a2, message);
                }
                return null;
            }
        }, new C11317c<Pair<Conversation, Message>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Pair<Conversation, Message> pair) {
                int i = -3001;
                if (pair == null || pair.first == null) {
                    message.setMsgStatus(3);
                    C11220ad.this.mo27305b(C11391e.m33515a(-3001));
                } else {
                    C6417a.m20015a().mo15540b((Conversation) pair.first);
                    C11220ad.this.mo27270b((Message) pair.second);
                }
                C11407f a = C11407f.m33601a();
                if (pair != null) {
                    i = C11204b.f30383a;
                }
                a.mo27445a(i, message);
            }
        }, C11314a.m33182b());
    }

    /* renamed from: a */
    public final void mo27269a(Message message) {
        if (message == null) {
            mo27305b(C11391e.m33515a(-1015));
            return;
        }
        message.setMsgStatus(1);
        m32881c(message);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.send_message_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo27270b(Message message) {
        Conversation a = C6417a.m20015a().mo15530a(message.getConversationId());
        if (C11198c.m32777a().mo27248b().f30422v) {
            message = C11400a.m33562a(message);
        }
        Builder builder = new Builder();
        List mentionIds = message.getMentionIds();
        if (mentionIds != null) {
            builder.mentioned_users(mentionIds);
        }
        RequestBody build = new RequestBody.Builder().send_message_body(builder.conversation_id(message.getConversationId()).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).content(message.getContent()).ext(message.getExt()).message_type(Integer.valueOf(message.getMsgType())).ticket(a.getTicket()).client_message_id(message.getUuid()).build()).build();
        mo27301a(a.getInboxType(), build, null, message);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(final C11391e eVar, Runnable runnable) {
        final boolean z;
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            z = false;
        } else {
            z = true;
        }
        final Message message = (Message) eVar.f30856e[0];
        C11319e.m33192a(new C11318d<Pair<Conversation, Message>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Pair<Conversation, Message> mo15560a() {
                if (z) {
                    SendMessageResponseBody sendMessageResponseBody = eVar.f30858g.body.send_message_body;
                    if (sendMessageResponseBody.status != null) {
                        message.addLocalExt("s:send_response_extra_code", String.valueOf(sendMessageResponseBody.status));
                    }
                    if (sendMessageResponseBody.extra_info != null) {
                        message.addLocalExt("s:send_response_extra_msg", sendMessageResponseBody.extra_info);
                    } else {
                        message.clearLocalExt("s:send_response_extra_msg");
                    }
                    if (sendMessageResponseBody.check_code != null) {
                        message.addLocalExt("s:send_response_check_code", String.valueOf(sendMessageResponseBody.check_code));
                    } else {
                        message.clearLocalExt("s:send_response_check_code");
                    }
                    if (sendMessageResponseBody.check_message != null) {
                        message.addLocalExt("s:send_response_check_msg", sendMessageResponseBody.check_message);
                    } else {
                        message.clearLocalExt("s:send_response_check_msg");
                    }
                    if (sendMessageResponseBody.status == null || !(sendMessageResponseBody.status.intValue() == SendMessageStatus.SEND_SUCCEED.getValue() || sendMessageResponseBody.status.intValue() == SendMessageStatus.CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE.getValue())) {
                        message.setMsgStatus(3);
                        StringBuilder sb = new StringBuilder();
                        sb.append(eVar.f30860i);
                        message.addLocalExt("s:err_code", sb.toString());
                        message.addLocalExt("s:err_msg", eVar.mo27432h());
                    } else {
                        message.setMsgStatus(2);
                        if (sendMessageResponseBody.server_message_id != null) {
                            message.setMsgId(sendMessageResponseBody.server_message_id.longValue());
                        }
                        message.clearLocalExt("s:err_code");
                        message.clearLocalExt("s:err_msg");
                    }
                } else {
                    message.setMsgStatus(3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(eVar.f30860i);
                    message.addLocalExt("s:err_code", sb2.toString());
                    message.addLocalExt("s:err_msg", eVar.mo27432h());
                }
                C11375q.m33429a();
                if (!C11375q.m33448e(message.getUuid())) {
                    StringBuilder sb3 = new StringBuilder("msg has already been deleted: ");
                    sb3.append(message.getUuid());
                    C11404d.m33589c(sb3.toString());
                    return null;
                }
                C11375q.m33429a().mo27396a(message);
                C11208c.m32815a().mo27256a("core").mo27258b("send_insert").mo27257a("duration", Long.valueOf(SystemClock.uptimeMillis() - eVar.f30861j)).mo27257a("create_time", Long.valueOf(message.getCreatedAt())).mo27257a("conversation_id", message.getConversationId()).mo27257a("message_type", Integer.valueOf(message.getMsgType())).mo27257a("message_uuid", message.getUuid()).mo27260b();
                C11368l.m33375a();
                Conversation a = C11368l.m33377a(message.getConversationId());
                C11375q.m33429a();
                return new Pair<>(a, C11375q.m33447d(message.getUuid()));
            }
        }, new C11317c<Pair<Conversation, Message>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Pair<Conversation, Message> pair) {
                if (pair != null) {
                    if (pair.first != null) {
                        C6417a.m20015a().mo15540b((Conversation) pair.first);
                    }
                    if (pair.second != null) {
                        C11407f.m33601a().mo27445a(C11204b.f30383a, (Message) pair.second);
                        if (((Message) pair.second).getMsgStatus() == 2 || ((Message) pair.second).getMsgStatus() == 5) {
                            C11220ad.this.mo27302a(pair.second);
                        } else {
                            C11220ad.this.mo27305b(eVar);
                        }
                    } else {
                        C11220ad.this.mo27305b(C11391e.m33515a(-3001));
                    }
                } else {
                    C11220ad.this.mo27305b(C11391e.m33515a(-1015));
                }
                C11209d.m32821a(eVar, z).mo27257a("conversation_id", message.getConversationId()).mo27257a("message_type", Integer.valueOf(message.getMsgType())).mo27257a("message_uuid", message.getUuid()).mo27260b();
            }
        }, C11314a.m33182b());
    }
}

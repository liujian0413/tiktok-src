package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11373o;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationOperationStatus;
import com.bytedance.p263im.core.proto.ConversationSettingInfo;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import com.bytedance.p263im.core.proto.SetConversationSettingInfoRequestBody;

/* renamed from: com.bytedance.im.core.internal.a.a.ai */
final class C11233ai extends C11280o<Conversation> {
    C11233ai() {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue());
    }

    C11233ai(C11195b<Conversation> bVar) {
        super(IMCMD.SET_CONVERSATION_SETTING_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.set_conversation_setting_info_body == null || eVar.f30858g.body.set_conversation_setting_info_body.status == null || eVar.f30858g.body.set_conversation_setting_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || eVar.f30858g.body.set_conversation_setting_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        final String str = (String) eVar.f30856e[0];
        final boolean booleanValue = ((Boolean) eVar.f30856e[1]).booleanValue();
        final String str2 = (String) eVar.f30856e[2];
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            mo27305b(eVar);
            runnable.run();
            C11209d.m32821a(eVar, false).mo27257a("conversation_id", str).mo27257a("keys", str2).mo27260b();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = eVar.f30858g.body.set_conversation_setting_info_body.setting_info;
        C112341 r8 = new C11318d<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Conversation mo15560a() {
                C11373o.m33414a();
                com.bytedance.p263im.core.model.ConversationSettingInfo a = C11401b.m33566a(C11373o.m33416a(conversationSettingInfo.conversation_id), conversationSettingInfo);
                C11373o.m33414a();
                boolean a2 = C11373o.m33418a(a);
                if (booleanValue) {
                    C11368l.m33375a();
                    C11368l.m33381a(conversationSettingInfo.conversation_id, System.currentTimeMillis());
                }
                if (!a2) {
                    return null;
                }
                C11368l.m33375a();
                return C11368l.m33377a(conversationSettingInfo.conversation_id);
            }
        };
        final C11391e eVar2 = eVar;
        final Runnable runnable2 = runnable;
        C112352 r2 = new C11317c<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Conversation conversation) {
                if (conversation != null) {
                    C6417a.m20015a().mo15540b(conversation);
                    C11233ai.this.mo27302a(conversation);
                    C11209d.m32821a(eVar2, true).mo27257a("conversation_id", str).mo27257a("keys", str2).mo27260b();
                } else {
                    C11233ai.this.mo27305b(C11391e.m33515a(-3001));
                    C11209d.m32821a(eVar2, false).mo27257a("conversation_id", str).mo27257a("keys", str2).mo27260b();
                }
                runnable2.run();
            }
        };
        C11319e.m33191a(r8, r2);
    }

    /* renamed from: a */
    public final long mo27273a(String str, boolean z, C11390d dVar) {
        Conversation a = C6417a.m20015a().mo15530a(str);
        RequestBody build = new Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).set_stick_on_top(Boolean.valueOf(z)).build()).build();
        int inboxType = a.getInboxType();
        Object[] objArr = new Object[3];
        boolean z2 = false;
        objArr[0] = str;
        if (C11198c.m32777a().mo27248b().f30426z && z) {
            z2 = true;
        }
        objArr[1] = Boolean.valueOf(z2);
        objArr[2] = "s:stick_on_top";
        return mo27301a(inboxType, build, null, objArr);
    }

    /* renamed from: b */
    public final long mo27274b(String str, boolean z, C11390d dVar) {
        Conversation a = C6417a.m20015a().mo15530a(str);
        RequestBody build = new Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).set_mute(Boolean.valueOf(z)).build()).build();
        return mo27301a(a.getInboxType(), build, null, str, Boolean.valueOf(false), "s:mute");
    }
}

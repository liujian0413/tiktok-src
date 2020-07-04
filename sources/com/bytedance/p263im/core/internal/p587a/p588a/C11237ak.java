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
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationOperationStatus;
import com.bytedance.p263im.core.proto.ConversationSettingInfo;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import com.bytedance.p263im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.a.ak */
final class C11237ak extends C11280o<Conversation> {
    C11237ak() {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue());
    }

    C11237ak(C11195b<Conversation> bVar) {
        super(IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.upsert_conversation_setting_ext_info_body == null || eVar.f30858g.body.upsert_conversation_setting_ext_info_body.status == null || eVar.f30858g.body.upsert_conversation_setting_ext_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || eVar.f30858g.body.upsert_conversation_setting_ext_info_body.setting_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(final C11391e eVar, final Runnable runnable) {
        final String str = (String) eVar.f30856e[0];
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            mo27305b(eVar);
            runnable.run();
            C11209d.m32821a(eVar, false).mo27257a("conversation_id", str).mo27260b();
            return;
        }
        final ConversationSettingInfo conversationSettingInfo = eVar.f30858g.body.upsert_conversation_setting_ext_info_body.setting_info;
        C11319e.m33191a(new C11318d<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Conversation mo15560a() {
                C11368l.m33375a();
                Conversation a = C11368l.m33377a(str);
                com.bytedance.p263im.core.model.ConversationSettingInfo a2 = C11401b.m33566a((com.bytedance.p263im.core.model.ConversationSettingInfo) null, conversationSettingInfo);
                if (a != null) {
                    a.setSettingInfo(a2);
                }
                C11373o.m33414a();
                C11373o.m33418a(a2);
                return a;
            }
        }, new C11317c<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Conversation conversation) {
                if (conversation != null) {
                    C6417a.m20015a().mo15540b(conversation);
                    C11237ak.this.mo27302a(conversation);
                    C11209d.m32821a(eVar, true).mo27257a("conversation_id", str).mo27260b();
                } else {
                    C11237ak.this.mo27305b(C11391e.m33515a(-1015));
                }
                runnable.run();
            }
        });
    }

    /* renamed from: a */
    public final long mo27276a(String str, Map<String, String> map, C11390d dVar) {
        if (map == null) {
            return -1;
        }
        Conversation a = C6417a.m20015a().mo15530a(str);
        RequestBody build = new Builder().upsert_conversation_setting_ext_info_body(new UpsertConversationSettingExtInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).ext(map).build()).build();
        return mo27301a(a.getInboxType(), build, null, str);
    }
}

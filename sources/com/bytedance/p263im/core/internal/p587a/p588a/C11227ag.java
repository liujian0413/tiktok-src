package com.bytedance.p263im.core.internal.p587a.p588a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p589b.C11314a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11376r;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.PropertyMsg;
import com.bytedance.p263im.core.p584a.C11202d.C11204b;
import com.bytedance.p263im.core.p586b.C11208c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.SendMessageStatus;
import com.bytedance.p263im.core.proto.SyncMessageResponseBody;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.a.ag */
final class C11227ag extends C11280o<PropertyMsg> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.sync_message_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m32900a(MessageBody messageBody) {
        Map<String, String> map = messageBody.ext;
        String str = "";
        if (map != null && map.containsKey("s:client_message_id") && !TextUtils.isEmpty((CharSequence) map.get("s:client_message_id"))) {
            str = (String) map.get("s:client_message_id");
        }
        PropertyMsg a = C11401b.m33571a(str, messageBody);
        if (C11376r.m33458a().mo27398a(a)) {
            C11407f.m33601a().mo27467g(Collections.singletonList(a));
        }
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
        final PropertyMsg propertyMsg = (PropertyMsg) eVar.f30856e[0];
        C11319e.m33192a(new C11318d<PropertyMsg>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public PropertyMsg mo15560a() {
                if (z) {
                    SyncMessageResponseBody syncMessageResponseBody = eVar.f30858g.body.sync_message_body;
                    if (syncMessageResponseBody.status != null) {
                        propertyMsg.addLocalExt("s:send_response_extra_code", String.valueOf(syncMessageResponseBody.status));
                    }
                    if (syncMessageResponseBody.status == null || !(syncMessageResponseBody.status.getValue() == SendMessageStatus.SEND_SUCCEED.getValue() || syncMessageResponseBody.status.getValue() == SendMessageStatus.CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE.getValue())) {
                        propertyMsg.setStatus(3);
                        StringBuilder sb = new StringBuilder();
                        sb.append(eVar.f30860i);
                        propertyMsg.addLocalExt("s:err_code", sb.toString());
                        propertyMsg.addLocalExt("s:err_msg", eVar.mo27432h());
                    } else {
                        propertyMsg.setStatus(2);
                        if (syncMessageResponseBody.server_message_id != null) {
                            propertyMsg.setServerId(syncMessageResponseBody.server_message_id.longValue());
                        }
                        propertyMsg.clearLocalExt("s:err_code");
                        propertyMsg.clearLocalExt("s:err_msg");
                    }
                } else {
                    propertyMsg.setStatus(3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(eVar.f30860i);
                    propertyMsg.addLocalExt("s:err_code", sb2.toString());
                    propertyMsg.addLocalExt("s:err_msg", eVar.mo27432h());
                }
                boolean a = C11376r.m33458a().mo27398a(propertyMsg);
                C11208c.m32815a().mo27256a("core").mo27258b("property_send_insert").mo27257a("duration", Long.valueOf(SystemClock.uptimeMillis() - eVar.f30861j)).mo27257a("create_time", Long.valueOf(propertyMsg.getCreatedTime())).mo27257a("conversation_id", propertyMsg.getConversationId()).mo27257a("target_message_uuid", propertyMsg.getTargetUuid()).mo27257a("message_type", Integer.valueOf(propertyMsg.getMsgType())).mo27257a("message_uuid", propertyMsg.getUuid()).mo27260b();
                if (a) {
                    return propertyMsg;
                }
                return null;
            }
        }, new C11317c<PropertyMsg>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(PropertyMsg propertyMsg) {
                if (propertyMsg == null) {
                    C11227ag.this.mo27305b(C11391e.m33515a(-3001));
                } else if (propertyMsg.getStatus() == 2 || propertyMsg.getStatus() == 5) {
                    C11227ag.this.mo27302a(propertyMsg);
                    C11407f.m33601a().mo27446a(C11204b.f30383a, propertyMsg);
                } else {
                    C11227ag.this.mo27305b(eVar);
                }
                C11209d.m32821a(eVar, z).mo27257a("conversation_id", propertyMsg.getConversationId()).mo27257a("target_message_uuid", propertyMsg.getTargetUuid()).mo27257a("message_type", Integer.valueOf(propertyMsg.getMsgType())).mo27257a("message_uuid", propertyMsg.getUuid()).mo27260b();
            }
        }, C11314a.m33181a());
    }
}

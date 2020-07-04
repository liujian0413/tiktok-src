package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.C6306c;
import com.bytedance.p263im.core.model.Attachment;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.Message.C6416a;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.SessionInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.AudioContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31870ap;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be.C7059a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.b */
public final class C30927b extends C30929c {

    /* renamed from: g */
    private static C31870ap<C30927b> f81002g = new C31870ap<C30927b>() {
        /* renamed from: c */
        private static C30927b m100671c() {
            return new C30927b();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18004a() {
            return m100671c();
        }
    };

    /* renamed from: f */
    private Message f81003f;

    private C30927b() {
    }

    /* renamed from: b */
    public final void mo81282b() {
        C11443k.m33752c(this.f81003f);
    }

    /* renamed from: a */
    public static C30927b m100665a() {
        return (C30927b) f81002g.mo82721b();
    }

    /* renamed from: a */
    public final void mo81280a(Message message) {
        mo81284b(message);
    }

    /* renamed from: a */
    public final Message mo81278a(SessionInfo sessionInfo) {
        int i;
        Conversation a = C6417a.m20015a().mo15530a(sessionInfo.getConversationId());
        Message lastMessage = a.getLastMessage();
        long j = 1;
        if (lastMessage != null) {
            j = 1 + lastMessage.getOrderIndex();
        }
        Message a2 = new C6416a().mo15526a(a).mo15525a(17).mo15527a("FakeVoiceMessage").mo15528a();
        a2.setOrderIndex(j);
        a2.setSender(C7074e.m22072d());
        if (sessionInfo.getChatType() == 3) {
            i = C11203a.f30381b;
        } else {
            i = C11203a.f30380a;
        }
        a2.setConversationType(i);
        this.f81003f = a2;
        C31863ai.m103533b(a2);
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C30926ac mo81279a(Message message, BaseContent baseContent) {
        if (baseContent instanceof AudioContent) {
            return new C30946p(this.f19650e, this.f19649d, (AudioContent) baseContent, message);
        }
        return null;
    }

    /* renamed from: a */
    private Message m100664a(AudioContent audioContent, String str) {
        this.f81003f.setContent(JSON.toJSONString(audioContent));
        Attachment attachment = new Attachment();
        attachment.setMsgUuid(this.f81003f.getUuid());
        attachment.setLocalPath(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(attachment);
        this.f81003f.setMsgStatus(0);
        this.f81003f.setAttachments(arrayList);
        StringBuilder sb = new StringBuilder();
        sb.append(audioContent.getSendStartTime());
        this.f81003f.addLocalExt("send_time", sb.toString());
        return this.f81003f;
    }

    /* renamed from: a */
    public final void mo81281a(String str, long j, C7059a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("tag", "AudioMsgSender");
            C7074e.m22065a("audio_message_send", hashMap);
            AudioContent audioContent = new AudioContent();
            audioContent.setMd5(C6306c.m19561a(str));
            audioContent.setDuration(j);
            audioContent.setSendStartTime(Long.valueOf(currentTimeMillis));
            Message a = m100664a(audioContent, str);
            C31863ai.m103533b(a);
            mo81284b(a);
        }
    }
}

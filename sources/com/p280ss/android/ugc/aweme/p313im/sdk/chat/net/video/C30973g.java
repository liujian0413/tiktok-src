package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video;

import bolts.C1592h;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent.Companion;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30926ac;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30929c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be.C7059a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.video.g */
public final class C30973g extends C30929c {

    /* renamed from: f */
    public static final C30973g f81089f = new C30973g();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.video.g$a */
    public static final class C30974a implements C7059a {
        C30974a() {
        }

        public final void onSendFailure(C11438g gVar) {
        }

        public final void onSendSuccess(Message message) {
        }

        public final void onSend(Conversation conversation, List<Message> list) {
            if (list != null && list.size() > 0) {
                for (Message message : list) {
                    if (message.getMsgType() == 30) {
                        C30973g.f81089f.mo81284b(message);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.video.g$b */
    static final class C30975b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VideoParam f81090a;

        /* renamed from: b */
        final /* synthetic */ String f81091b;

        C30975b(VideoParam videoParam, String str) {
            this.f81090a = videoParam;
            this.f81091b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            Companion companion = StoryVideoContent.Companion;
            VideoParam videoParam = this.f81090a;
            if (videoParam == null) {
                C7573i.m23580a();
            }
            C30973g.m100788a(this.f81091b, companion.obtain(videoParam));
            return null;
        }
    }

    private C30973g() {
    }

    /* renamed from: c */
    public final void mo81364c(Message message) {
        C7573i.m23587b(message, "chatMessage");
        Object obj = this.f81004a.get(C30967b.m100663a(message));
        if (!(obj instanceof C30967b)) {
            obj = null;
        }
        C30967b bVar = (C30967b) obj;
        if (bVar != null) {
            bVar.f81081b = null;
        }
    }

    /* renamed from: a */
    public final void mo81362a(Message message) {
        C7573i.m23587b(message, "chatMessage");
        if (message.getMsgType() == 30) {
            StoryVideoContent storyVideoContent = (StoryVideoContent) C31913m.m103667a(message.getContent(), StoryVideoContent.class);
            message.setMsgStatus(0);
            if (storyVideoContent.getVideo() != null) {
                C31863ai.m103535c(message);
            } else {
                C31863ai.m103533b(message);
                mo81284b(message);
            }
        }
    }

    /* renamed from: a */
    public static void m100789a(String str, VideoParam videoParam) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C1592h.m7853a((Callable<TResult>) new C30975b<TResult>(videoParam, str));
        }
    }

    /* renamed from: a */
    public static void m100788a(String str, StoryVideoContent storyVideoContent) {
        C7573i.m23587b(str, "sessionId");
        C7573i.m23587b(storyVideoContent, "storyVideoContent");
        storyVideoContent.setSendStartTime(Long.valueOf(System.currentTimeMillis()));
        C7058be.m21980a().mo18266a(Collections.singletonList(str), Collections.singletonList(storyVideoContent), (C7059a) new C30974a(), StoryVideoContent.Companion.obtainAttachmentList(storyVideoContent));
    }

    /* renamed from: a */
    public final C30926ac mo81279a(Message message, BaseContent baseContent) {
        if (baseContent instanceof StoryVideoContent) {
            return new C30967b(this.f19649d, (StoryVideoContent) baseContent, message);
        }
        C30926ac a = super.mo81279a(message, baseContent);
        C7573i.m23582a((Object) a, "super.obtainUploadItem(chatMessage, content)");
        return a;
    }

    /* renamed from: a */
    public final void mo81363a(Message message, C30966a aVar) {
        C7573i.m23587b(message, "chatMessage");
        C7573i.m23587b(aVar, "uploadCallback");
        Object obj = this.f81004a.get(C30967b.m100663a(message));
        if (!(obj instanceof C30967b)) {
            obj = null;
        }
        C30967b bVar = (C30967b) obj;
        if (bVar != null) {
            bVar.f81081b = aVar;
        }
    }
}

package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.livesdk.chatroom.model.C4904f;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdkapi.C9294d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9499a;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.e */
public final class C4323e implements C6310a {

    /* renamed from: a */
    public final Queue<C9499a> f12550a = new LinkedList();

    /* renamed from: b */
    public boolean f12551b = false;

    /* renamed from: c */
    public C4904f f12552c;

    /* renamed from: d */
    private final C6309f f12553d;

    /* renamed from: e */
    private final C4325a f12554e;

    /* renamed from: f */
    private final long f12555f;

    /* renamed from: g */
    private final String f12556g;

    /* renamed from: h */
    private final String f12557h;

    /* renamed from: i */
    private final String f12558i;

    /* renamed from: j */
    private final String f12559j;

    /* renamed from: k */
    private final String f12560k;

    /* renamed from: l */
    private final C9294d f12561l = new C9294d() {
    };

    /* renamed from: m */
    private boolean f12562m = false;

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.e$a */
    public interface C4325a {
        /* renamed from: a */
        void mo12008a(int i, String str, String str2);

        /* renamed from: a */
        void mo12009a(C4904f fVar);
    }

    /* renamed from: d */
    public final void mo12007d() {
        C4275g.m14437a((Handler) this.f12553d);
    }

    /* renamed from: b */
    public final void mo12005b() {
        this.f12551b = false;
        this.f12562m = true;
        this.f12552c = null;
        this.f12553d.removeCallbacksAndMessages(null);
        this.f12550a.clear();
    }

    /* renamed from: c */
    public final void mo12006c() {
        while (!this.f12550a.isEmpty() && C9038ag.m26996a() != null) {
            C9038ag.m26996a().insertMessage((IMessage) this.f12550a.poll());
        }
    }

    /* renamed from: a */
    public final void mo12004a() {
        if (!this.f12551b) {
            this.f12562m = false;
            this.f12551b = true;
            C4275g.m14434a().mo11964a((Handler) this.f12553d, this.f12555f, this.f12556g, this.f12557h, this.f12558i, this.f12560k);
            this.f12550a.clear();
        }
    }

    /* renamed from: a */
    private void m14532a(C4904f fVar) {
        this.f12552c = fVar;
        this.f12551b = false;
        this.f12554e.mo12009a(fVar);
    }

    public final void handleMsg(Message message) {
        if (message.what == 32 && !this.f12562m) {
            mo12004a();
        } else if (message.what == 4 && this.f12551b) {
            if (message.obj instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) message.obj;
                m14531a(apiServerException.getErrorCode(), apiServerException.getErrorMsg(), apiServerException.getPrompt());
            } else if (message.obj instanceof Exception) {
                m14531a(0, message.obj.toString(), null);
            } else if (!(message.obj instanceof C4904f) || ((C4904f) message.obj).f14022a == null || !Room.isValid(((C4904f) message.obj).f14022a)) {
                String str = "invalid room data";
                if (!(message.obj instanceof C4904f)) {
                    str = "response unexpected";
                } else if (((C4904f) message.obj).f14022a == null) {
                    str = "room is null";
                }
                m14531a(0, str, null);
            } else {
                m14532a((C4904f) message.obj);
            }
        }
    }

    /* renamed from: a */
    private void m14531a(int i, String str, String str2) {
        this.f12551b = false;
        this.f12554e.mo12008a(i, str, str2);
    }

    public C4323e(C4325a aVar, long j, String str, String str2, String str3, String str4, String str5) {
        this.f12554e = aVar;
        this.f12555f = j;
        this.f12556g = str;
        this.f12557h = str2;
        this.f12553d = new C6309f(Looper.getMainLooper(), this);
        this.f12558i = str3;
        this.f12559j = str4;
        this.f12560k = str5;
    }
}

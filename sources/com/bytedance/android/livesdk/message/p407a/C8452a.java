package com.bytedance.android.livesdk.message.p407a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.api.MessageApi;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdkapi.C9294d;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.message.C9503e;
import com.bytedance.android.livesdkapi.message.C9503e.C9504a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2267d;
import com.bytedance.android.p109c.p110a.p111a.C2267d.C2269b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12534t;
import com.p280ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.message.a.a */
public class C8452a implements C9294d, IMessageClient {

    /* renamed from: a */
    private static final String f23112a = "a";

    /* renamed from: b */
    private Callback f23113b;

    /* renamed from: c */
    private long f23114c;

    /* renamed from: d */
    private long f23115d;

    /* renamed from: e */
    private Context f23116e;

    /* renamed from: f */
    private MessageApi f23117f = ((MessageApi) C3458e.m12798a().mo10440a(MessageApi.class));

    /* renamed from: g */
    private long f23118g;

    /* renamed from: h */
    private String f23119h;

    /* renamed from: i */
    private String f23120i;

    /* renamed from: j */
    private long f23121j;

    /* renamed from: k */
    private boolean f23122k;

    /* renamed from: l */
    private boolean f23123l;

    /* renamed from: m */
    private C2272g f23124m = new C2272g();

    public void connectToWebSocket() {
    }

    public void disconnectFromWebSocket() {
    }

    public long getUserId() {
        if (this.f23115d > 0) {
            return this.f23115d;
        }
        this.f23115d = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b();
        return this.f23115d;
    }

    public void setCallback(Callback callback) {
        this.f23113b = callback;
    }

    public void apiCall(Map<String, String> map) {
        if (!this.f23122k) {
            map.put("get_history", "1");
            this.f23122k = true;
        }
        m25698a(map, this.f23117f.fetchMessagePbByteArraySource(this.f23114c, map, null));
    }

    public C8452a(boolean z) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.f23119h = str;
    }

    /* renamed from: a */
    private void m25697a(Map<String, String> map) {
        if (C9290a.f25466a) {
            map.put("app_language", this.f23116e.getResources().getConfiguration().locale.getLanguage());
        }
        map.put("live_id", String.valueOf(((IHostContext) C3596c.m13172a(IHostContext.class)).liveId()));
        map.remove("fetch_time");
        map.remove("ack_ids");
        map.put("identity", this.f23119h);
        map.put("last_rtt", String.valueOf(this.f23121j));
        if (!TextUtils.isEmpty(this.f23120i)) {
            map.put("internal_ext", this.f23120i);
        }
    }

    /* renamed from: a */
    private ProtoApiResult m25696a(C2269b bVar) throws Exception {
        C2265b protoDecoder = ((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(C9503e.class);
        if (protoDecoder != null) {
            C9503e eVar = (C9503e) protoDecoder.decode(this.f23124m.mo8057a(bVar));
            ProtoApiResult protoApiResult = new ProtoApiResult();
            protoApiResult.cursor = eVar.f26007b;
            protoApiResult.fetchInterval = eVar.f26008c;
            protoApiResult.now = eVar.f26009d;
            protoApiResult.messages = new LinkedList();
            this.f23120i = eVar.f26010e;
            if (!this.f23123l) {
                protoApiResult.cursor = "1";
                this.f23123l = true;
            } else {
                protoApiResult.cursor = eVar.f26007b;
            }
            protoApiResult.fetchInterval = eVar.f26008c;
            protoApiResult.now = eVar.f26009d;
            this.f23120i = eVar.f26010e;
            long currentTimeMillis = System.currentTimeMillis();
            this.f23121j = currentTimeMillis - this.f23118g;
            C9048ao.m27020c((protoApiResult.now + ((currentTimeMillis - this.f23118g) / 2)) - currentTimeMillis);
            protoApiResult.messages = new ArrayList();
            if (eVar.f26006a == null || eVar.f26006a.isEmpty()) {
                return protoApiResult;
            }
            for (C9504a aVar : eVar.f26006a) {
                if (!TextUtils.isEmpty(aVar.f26011a) && aVar.f26012b != null && aVar.f26012b.length > 0) {
                    C8538c cVar = null;
                    try {
                        Class messageClass = ((IMessageService) C3596c.m13172a(IMessageService.class)).getMessageClass(aVar.f26011a);
                        if (messageClass != null) {
                            C2265b protoDecoder2 = ((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(messageClass);
                            if (protoDecoder2 != null) {
                                cVar = (C8538c) protoDecoder2.decode(this.f23124m.mo8057a(C2267d.m9756a(aVar.f26012b)));
                            }
                            if (cVar != null) {
                                protoApiResult.messages.add(cVar);
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            return protoApiResult;
        }
        throw new AssertionError("No ProtoDecoder found for ProtoMessageFetchResult??!");
    }

    /* renamed from: a */
    public final void mo21620a(long j, Context context) {
        this.f23114c = j;
        this.f23116e = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m25698a(Map<String, String> map, C12466b<C2269b> bVar) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("resp_content_type", "protobuf");
        m25697a(map);
        if (this.f23117f == null) {
            this.f23117f = (MessageApi) C3458e.m12798a().mo10440a(MessageApi.class);
        }
        try {
            this.f23118g = System.currentTimeMillis();
            C12534t execute = bVar.execute();
            if (!execute.mo30512c()) {
                this.f23121j = -1;
                if (this.f23113b != null) {
                    this.f23113b.onApiError(new Exception(String.valueOf(execute.mo30510a())));
                }
            } else if (this.f23113b != null) {
                try {
                    this.f23113b.onApiSuccess(m25696a((C2269b) execute.f33302b));
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            this.f23121j = -1;
            if (this.f23113b != null) {
                this.f23113b.onApiError(e);
            }
        }
    }
}

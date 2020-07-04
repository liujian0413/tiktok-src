package com.bytedance.android.livesdk.message.p407a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.C3464i;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.api.MessageApi;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.C8469d;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdkapi.C9294d;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.message.C9501c;
import com.bytedance.android.livesdkapi.message.C9503e;
import com.bytedance.android.livesdkapi.message.C9503e.C9504a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2267d;
import com.bytedance.android.p109c.p110a.p111a.C2267d.C2269b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.common.utility.C6311g;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12534t;
import com.google.gson.C6709k;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.message.a.b */
public final class C8453b implements C9294d, IMessageClient {

    /* renamed from: b */
    private static final int f23125b = ((Integer) LiveSettingKeys.HOT_LIVE_MESSAGE_SIZE.mo10240a()).intValue();

    /* renamed from: a */
    public String f23126a;

    /* renamed from: c */
    private Callback f23127c;

    /* renamed from: d */
    private long f23128d;

    /* renamed from: e */
    private long f23129e;

    /* renamed from: f */
    private Context f23130f;

    /* renamed from: g */
    private MessageApi f23131g = ((MessageApi) C3458e.m12798a().mo10440a(MessageApi.class));

    /* renamed from: h */
    private long f23132h;

    /* renamed from: i */
    private String f23133i;

    /* renamed from: j */
    private String f23134j;

    /* renamed from: k */
    private long f23135k;

    /* renamed from: l */
    private long f23136l;

    /* renamed from: m */
    private long f23137m;

    /* renamed from: n */
    private boolean f23138n = true;

    /* renamed from: o */
    private boolean f23139o = true;

    /* renamed from: p */
    private C2272g f23140p = new C2272g();

    public final void connectToWebSocket() {
    }

    public final void disconnectFromWebSocket() {
    }

    /* renamed from: a */
    private void m25702a() {
        this.f23135k = -1;
        this.f23136l = 0;
        this.f23137m = 0;
    }

    public final long getUserId() {
        if (this.f23129e > 0) {
            return this.f23129e;
        }
        this.f23129e = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b();
        return this.f23129e;
    }

    public final void setCallback(Callback callback) {
        this.f23127c = callback;
    }

    public C8453b(boolean z) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.f23133i = str;
    }

    public final void apiCall(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("resp_content_type", "protobuf");
        m25703a(map);
        if (this.f23131g == null) {
            this.f23131g = (MessageApi) C3458e.m12798a().mo10440a(MessageApi.class);
        }
        this.f23126a = this.f23126a;
        m25704a(map, this.f23126a);
    }

    /* renamed from: a */
    private void m25703a(Map<String, String> map) {
        if (C9290a.f25466a) {
            map.put("app_language", this.f23130f.getResources().getConfiguration().locale.getLanguage());
        }
        map.put("live_id", String.valueOf(((IHostContext) C3596c.m13172a(IHostContext.class)).liveId()));
        map.remove("fetch_time");
        map.remove("ack_ids");
        map.put("identity", this.f23133i);
        map.put("last_rtt", String.valueOf(this.f23135k));
        map.put("recv_cnt", String.valueOf(this.f23136l));
        map.put("parse_cnt", String.valueOf(this.f23137m));
        if (!TextUtils.isEmpty(this.f23134j)) {
            map.put("internal_ext", this.f23134j);
        }
    }

    /* renamed from: a */
    private ProtoApiResult m25701a(C2269b bVar) throws Exception {
        boolean z;
        C2265b protoDecoder = ((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(C9503e.class);
        if (protoDecoder != null) {
            C9503e eVar = (C9503e) protoDecoder.decode(this.f23140p.mo8057a(bVar));
            ProtoApiResult protoApiResult = new ProtoApiResult();
            protoApiResult.cursor = eVar.f26007b;
            protoApiResult.fetchInterval = eVar.f26008c;
            protoApiResult.now = eVar.f26009d;
            protoApiResult.messages = new LinkedList();
            this.f23134j = eVar.f26010e;
            long currentTimeMillis = System.currentTimeMillis();
            this.f23135k = currentTimeMillis - this.f23132h;
            C9048ao.m27020c((eVar.f26009d + ((currentTimeMillis - this.f23132h) / 2)) - currentTimeMillis);
            if (C6311g.m19573a(eVar.f26006a)) {
                return protoApiResult;
            }
            if (eVar.f26006a.size() > f23125b) {
                z = true;
            } else {
                z = false;
            }
            for (C9504a aVar : eVar.f26006a) {
                if (!TextUtils.isEmpty(aVar.f26011a) && aVar.f26012b != null && aVar.f26012b.length > 0) {
                    C8538c cVar = null;
                    try {
                        Class messageClass = ((IMessageService) C3596c.m13172a(IMessageService.class)).getMessageClass(aVar.f26011a);
                        if (messageClass != null) {
                            C2265b protoDecoder2 = ((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(messageClass);
                            if (protoDecoder2 != null) {
                                cVar = (C8538c) protoDecoder2.decode(this.f23140p.mo8057a(C2267d.m9756a(aVar.f26012b)));
                            } else {
                                C8469d.m25734a(new Throwable("Failed to decode, message decoder is null!"), aVar.f26011a);
                            }
                            if (((Boolean) C3464i.f10285b.mo10240a()).booleanValue()) {
                                cVar = m25700a(cVar, aVar.f26011a);
                            }
                            if (cVar != null) {
                                cVar.timestamp = eVar.f26009d;
                                cVar.isTooMuchMsg = z;
                                ((C9439a) C3596c.m13172a(C9439a.class)).mo23189a().mo23111a();
                                if (this.f23138n) {
                                    this.f23138n = false;
                                    C8469d.m25732a("ON_FIRST_MSG_RECEIVED", aVar.f26011a, cVar.getMessageId());
                                }
                                if (this.f23139o && (cVar instanceof C8514bj) && ((C8514bj) cVar).f23390b != null && ((C8514bj) cVar).f23390b.getId() == ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) {
                                    this.f23139o = false;
                                    C8469d.m25732a("ON_SELF_ENTER_MSG_RECEIVED", "WebcastMemberMessage", cVar.getMessageId());
                                }
                            }
                            if (cVar != null) {
                                protoApiResult.messages.add(cVar);
                            }
                        }
                    } catch (Throwable th) {
                        C8444d.m25673b();
                        C8444d.m11969a(6, th.getStackTrace());
                        C8469d.m25734a(th, aVar.f26011a);
                    }
                }
            }
            this.f23136l = (long) eVar.f26006a.size();
            this.f23137m = (long) protoApiResult.messages.size();
            return protoApiResult;
        }
        throw new AssertionError("No ProtoDecoder found for ProtoMessageFetchResult??!");
    }

    /* renamed from: a */
    public final void mo21626a(long j, Context context) {
        this.f23128d = j;
        this.f23130f = context.getApplicationContext();
    }

    /* renamed from: a */
    private static C8538c m25700a(C8538c cVar, String str) throws Exception {
        C9501c cVar2 = new C9501c(str, C2317a.m9932a().mo15963a((Object) cVar).mo16136m());
        INetworkService iNetworkService = (INetworkService) C3596c.m13172a(INetworkService.class);
        StringBuilder sb = new StringBuilder("https://board.bytedance.net/api/json/message/");
        sb.append(cVar.baseMessage.f25995e);
        C9501c cVar3 = (C9501c) C2317a.m9932a().mo15974a(new String(((C9477e) iNetworkService.post(sb.toString(), new ArrayList(), "application/json", C2317a.m9932a().mo15979b((Object) cVar2).getBytes()).mo23512a()).f25947e), C9501c.class);
        return (C8538c) C2317a.m9932a().mo15970a((C6709k) cVar3.f26003b, ((IMessageService) C3596c.m13172a(IMessageService.class)).getMessageClass(cVar3.f26002a));
    }

    /* renamed from: a */
    private void m25704a(Map<String, String> map, String str) {
        C12466b fetchMessagePbByteArraySource = this.f23131g.fetchMessagePbByteArraySource(this.f23128d, map, str);
        try {
            this.f23132h = System.currentTimeMillis();
            C12534t execute = fetchMessagePbByteArraySource.execute();
            if (execute.mo30512c()) {
                try {
                    if (this.f23127c != null) {
                        this.f23127c.onApiSuccess(m25701a((C2269b) execute.f33302b));
                    }
                } catch (Exception e) {
                    m25702a();
                    if (this.f23127c != null) {
                        this.f23127c.onApiError(e);
                    }
                    StringBuilder sb = new StringBuilder("Parse error, message:");
                    sb.append(e.getMessage());
                    C8469d.m25731a(sb.toString(), Log.getStackTraceString(e));
                }
            } else {
                m25702a();
                if (this.f23127c != null) {
                    this.f23127c.onApiError(new Exception(String.valueOf(execute.mo30510a())));
                }
                StringBuilder sb2 = new StringBuilder("Api error, error_code:");
                sb2.append(execute.mo30510a());
                C8469d.m25731a(sb2.toString(), (String) null);
            }
        } catch (Exception e2) {
            m25702a();
            if (this.f23127c != null) {
                this.f23127c.onApiError(e2);
            }
            StringWriter stringWriter = new StringWriter();
            C6497a.m20180a((Throwable) e2, new PrintWriter(stringWriter));
            C8469d.m25731a(e2.getMessage(), stringWriter.toString());
        }
    }
}

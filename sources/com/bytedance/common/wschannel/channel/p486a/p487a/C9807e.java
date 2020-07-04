package com.bytedance.common.wschannel.channel.p486a.p487a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.p484b.C9757a;
import java.io.UnsupportedEncodingException;
import okhttp3.Response;
import okio.ByteString;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.e */
final class C9807e implements C9805d {

    /* renamed from: a */
    private final IWsChannelClient f26697a;

    /* renamed from: b */
    private final C9790c f26698b;

    /* renamed from: c */
    private final Context f26699c;

    /* renamed from: a */
    public final void mo24264a(ByteString byteString) {
        if (this.f26697a != null) {
            this.f26697a.onMessage(byteString.toByteArray());
        }
    }

    /* renamed from: b */
    public final void mo24265b(String str) {
        if (this.f26697a != null) {
            try {
                this.f26697a.onMessage(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo24261a(String str) {
        if (this.f26697a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put("state", 1);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.f26697a.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo24263a(Response response) {
        Bundle bundle = new Bundle();
        bundle.putString("response", response.toString());
        bundle.putString("method", "onOpen");
        C9757a.m28773a(this.f26699c, "WsChannelSdk_ok", bundle);
        if (this.f26697a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put("state", 4);
                jSONObject.put("url", response.request.url.toString());
                jSONObject.put("channel_type", 2);
                this.f26697a.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    C9807e(Context context, C9790c cVar, IWsChannelClient iWsChannelClient) {
        this.f26698b = cVar;
        this.f26697a = iWsChannelClient;
        this.f26699c = context;
    }

    /* renamed from: a */
    public final void mo24262a(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putInt("error_code", i);
        bundle.putString("error_msg", str2);
        bundle.putString("method", "onFailure");
        C9757a.m28773a(this.f26699c, "WsChannelSdk_ok", bundle);
        if (this.f26697a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 0);
                jSONObject.put("state", 2);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                jSONObject.put("error", str2);
                jSONObject.put("error_code", i);
                this.f26697a.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo24266b(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putInt("error_code", i);
        bundle.putString("error_msg", str2);
        bundle.putString("method", "onClosed");
        C9757a.m28773a(this.f26699c, "WsChannelSdk_ok", bundle);
        if (this.f26697a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 0);
                jSONObject.put("state", 3);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.f26697a.onConnection(jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}

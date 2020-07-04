package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.wschannel.event.ChannelType;
import org.json.JSONException;
import org.json.JSONObject;

public class SocketState implements Parcelable {
    public static final Creator<SocketState> CREATOR = new Creator<SocketState>() {
        /* renamed from: a */
        private static SocketState[] m28965a(int i) {
            return new SocketState[i];
        }

        /* renamed from: a */
        private static SocketState m28964a(Parcel parcel) {
            return new SocketState(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m28964a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m28965a(i);
        }
    };

    /* renamed from: a */
    public int f26737a;

    /* renamed from: b */
    public int f26738b;

    /* renamed from: c */
    public String f26739c;

    /* renamed from: d */
    public int f26740d;

    /* renamed from: e */
    public int f26741e;

    /* renamed from: f */
    public String f26742f;

    /* renamed from: g */
    public int f26743g;

    public SocketState() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public final ChannelType mo24329b() {
        return ChannelType.m28958of(this.f26741e);
    }

    /* renamed from: a */
    public final JSONObject mo24328a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("channel_id", this.f26740d);
            jSONObject.put("type", this.f26737a);
            jSONObject.put("state", this.f26738b);
            jSONObject.put("url", this.f26739c);
            jSONObject.put("channel_type", this.f26741e);
            jSONObject.put("error", this.f26742f);
            jSONObject.put("error_code", this.f26743g);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocketState{connectionType=");
        sb.append(this.f26737a);
        sb.append(", connectionState=");
        sb.append(this.f26738b);
        sb.append(", connectionUrl='");
        sb.append(this.f26739c);
        sb.append('\'');
        sb.append(", channelId=");
        sb.append(this.f26740d);
        sb.append(", channelType=");
        sb.append(this.f26741e);
        sb.append(", error='");
        sb.append(this.f26742f);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    protected SocketState(Parcel parcel) {
        this.f26737a = parcel.readInt();
        this.f26738b = parcel.readInt();
        this.f26739c = parcel.readString();
        this.f26740d = parcel.readInt();
        this.f26741e = parcel.readInt();
        this.f26742f = parcel.readString();
        this.f26743g = parcel.readInt();
    }

    /* renamed from: a */
    public static SocketState m28961a(JSONObject jSONObject) {
        SocketState socketState = new SocketState();
        socketState.f26740d = jSONObject.optInt("channel_id", Integer.MIN_VALUE);
        socketState.f26737a = jSONObject.optInt("type", -1);
        socketState.f26738b = jSONObject.optInt("state", -1);
        socketState.f26739c = jSONObject.optString("url", "");
        socketState.f26741e = jSONObject.optInt("channel_type");
        socketState.f26742f = jSONObject.optString("error", "");
        socketState.f26743g = jSONObject.optInt("error_code");
        return socketState;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26737a);
        parcel.writeInt(this.f26738b);
        parcel.writeString(this.f26739c);
        parcel.writeInt(this.f26740d);
        parcel.writeInt(this.f26741e);
        parcel.writeString(this.f26742f);
        parcel.writeInt(this.f26743g);
    }
}

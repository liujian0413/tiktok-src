package com.bytedance.ies.geckoclient.debug;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.LinkedList;
import java.util.List;

public final class NetWorkAnalyze {

    /* renamed from: a */
    private static NetWorkAnalyze f29378a = new NetWorkAnalyze();

    /* renamed from: b */
    private final List<Session> f29379b = new LinkedList();

    /* renamed from: c */
    private Session f29380c = new Session() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Session mo26184a(long j) {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Session mo26185a(RequestMethod requestMethod) {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Session mo26186a(String str) {
            return this;
        }

        /* renamed from: a */
        public final Session mo26187a(Throwable th) {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Session mo26188b(String str) {
            return this;
        }

        /* renamed from: c */
        public final Session mo26189c(String str) {
            return this;
        }
    };

    public enum RequestMethod {
        POST,
        GET
    }

    public static class Session implements Parcelable {
        public static final Creator<Session> CREATOR = new Creator<Session>() {
            /* renamed from: a */
            private static Session[] m31864a(int i) {
                return new Session[i];
            }

            /* renamed from: a */
            private static Session m31863a(Parcel parcel) {
                return new Session(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m31863a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m31864a(i);
            }
        };

        /* renamed from: b */
        public long f29382b;

        /* renamed from: c */
        long f29383c;

        /* renamed from: d */
        public RequestMethod f29384d;

        /* renamed from: e */
        public String f29385e;

        /* renamed from: f */
        public String f29386f;

        /* renamed from: g */
        public String f29387g;

        /* renamed from: h */
        public Throwable f29388h;

        public Session() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Session mo26184a(long j) {
            this.f29382b = j;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Session mo26188b(String str) {
            this.f29386f = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Session mo26185a(RequestMethod requestMethod) {
            this.f29384d = requestMethod;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Session mo26186a(String str) {
            this.f29385e = str;
            return this;
        }

        /* renamed from: c */
        public Session mo26189c(String str) {
            this.f29387g = str;
            this.f29383c = System.currentTimeMillis();
            return this;
        }

        /* renamed from: a */
        public Session mo26187a(Throwable th) {
            this.f29388h = th;
            this.f29383c = System.currentTimeMillis();
            return this;
        }

        protected Session(Parcel parcel) {
            RequestMethod requestMethod;
            this.f29382b = parcel.readLong();
            this.f29383c = parcel.readLong();
            int readInt = parcel.readInt();
            if (readInt == -1) {
                requestMethod = null;
            } else {
                requestMethod = RequestMethod.values()[readInt];
            }
            this.f29384d = requestMethod;
            this.f29385e = parcel.readString();
            this.f29386f = parcel.readString();
            this.f29387g = parcel.readString();
            this.f29388h = (Throwable) parcel.readSerializable();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            parcel.writeLong(this.f29382b);
            parcel.writeLong(this.f29383c);
            if (this.f29384d == null) {
                i2 = -1;
            } else {
                i2 = this.f29384d.ordinal();
            }
            parcel.writeInt(i2);
            parcel.writeString(this.f29385e);
            parcel.writeString(this.f29386f);
            parcel.writeString(this.f29387g);
            parcel.writeSerializable(this.f29388h);
        }
    }

    /* renamed from: a */
    public static NetWorkAnalyze m31847a() {
        return f29378a;
    }

    /* renamed from: a */
    private void m31848a(Session session) {
        synchronized (this.f29379b) {
            this.f29379b.add(session);
        }
    }

    /* renamed from: a */
    public final Session mo26182a(String str) {
        if (!C10858a.m31865a()) {
            return this.f29380c;
        }
        Session session = new Session();
        m31848a(session);
        session.mo26184a(System.currentTimeMillis()).mo26185a(RequestMethod.GET).mo26186a(str);
        return session;
    }

    /* renamed from: a */
    public final Session mo26183a(String str, String str2) {
        if (!C10858a.m31865a()) {
            return this.f29380c;
        }
        Session session = new Session();
        m31848a(session);
        session.mo26184a(System.currentTimeMillis()).mo26185a(RequestMethod.POST).mo26186a(str).mo26188b(str2);
        return session;
    }
}

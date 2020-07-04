package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Creator<DeviceAuthMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        private static DeviceAuthMethodHandler[] m41511a(int i) {
            return new DeviceAuthMethodHandler[i];
        }

        /* renamed from: a */
        private static DeviceAuthMethodHandler m41510a(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41510a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m41511a(i);
        }
    };

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f37183c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo33721a() {
        return "device_auth";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    private static DeviceAuthDialog m41504e() {
        return new DeviceAuthDialog();
    }

    /* renamed from: t_ */
    public final void mo33755t_() {
        this.f37240b.mo33773a(Result.m41564a(this.f37240b.f37196g, "User canceled log in."));
    }

    /* renamed from: c */
    public static synchronized ScheduledThreadPoolExecutor m41503c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f37183c == null) {
                f37183c = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f37183c;
        }
        return scheduledThreadPoolExecutor;
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33724a(Request request) {
        m41502b(request);
        return true;
    }

    /* renamed from: a */
    public final void mo33752a(Exception exc) {
        this.f37240b.mo33773a(Result.m41565a(this.f37240b.f37196g, null, exc.getMessage()));
    }

    /* renamed from: b */
    private void m41502b(Request request) {
        FragmentActivity a = this.f37240b.mo33770a();
        if (a != null && !a.isFinishing()) {
            DeviceAuthDialog e = m41504e();
            e.show(a.getSupportFragmentManager(), "login_with_facebook");
            e.mo33736a(request);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public final void mo33753a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        AccessToken accessToken = new AccessToken(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, null, date3);
        this.f37240b.mo33773a(Result.m41563a(this.f37240b.f37196g, accessToken));
    }
}

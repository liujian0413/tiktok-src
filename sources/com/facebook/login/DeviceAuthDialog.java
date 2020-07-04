package com.facebook.login;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.DialogFragment;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.C13499h;
import com.facebook.C13980k;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.C13187j;
import com.facebook.devicerequests.p690a.C13358a;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13926o;
import com.facebook.internal.C13967z;
import com.facebook.internal.C13967z.C13972c;
import com.facebook.internal.SmartLoginOption;
import com.facebook.login.LoginClient.Request;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceAuthDialog extends DialogFragment {

    /* renamed from: a */
    public AtomicBoolean f37151a = new AtomicBoolean();

    /* renamed from: b */
    public volatile RequestState f37152b;

    /* renamed from: c */
    public Dialog f37153c;

    /* renamed from: d */
    public boolean f37154d = false;

    /* renamed from: e */
    public boolean f37155e = false;

    /* renamed from: f */
    public Request f37156f = null;

    /* renamed from: g */
    private View f37157g;

    /* renamed from: h */
    private TextView f37158h;

    /* renamed from: i */
    private TextView f37159i;

    /* renamed from: j */
    private DeviceAuthMethodHandler f37160j;

    /* renamed from: k */
    private volatile C13980k f37161k;

    /* renamed from: l */
    private volatile ScheduledFuture f37162l;

    static class RequestState implements Parcelable {
        public static final Creator<RequestState> CREATOR = new Creator<RequestState>() {
            /* renamed from: a */
            private static RequestState[] m41501a(int i) {
                return new RequestState[i];
            }

            /* renamed from: a */
            private static RequestState m41500a(Parcel parcel) {
                return new RequestState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m41500a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m41501a(i);
            }
        };

        /* renamed from: a */
        public String f37178a;

        /* renamed from: b */
        public String f37179b;

        /* renamed from: c */
        public String f37180c;

        /* renamed from: d */
        public long f37181d;

        /* renamed from: e */
        public long f37182e;

        RequestState() {
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public final boolean mo33747a() {
            if (this.f37182e != 0 && (new Date().getTime() - this.f37182e) - (this.f37181d * 1000) < 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo33746a(String str) {
            this.f37179b = str;
            this.f37178a = C1642a.m8035a(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        protected RequestState(Parcel parcel) {
            this.f37178a = parcel.readString();
            this.f37179b = parcel.readString();
            this.f37180c = parcel.readString();
            this.f37181d = parcel.readLong();
            this.f37182e = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f37178a);
            parcel.writeString(this.f37179b);
            parcel.writeString(this.f37180c);
            parcel.writeLong(this.f37181d);
            parcel.writeLong(this.f37182e);
        }
    }

    /* renamed from: b */
    private static int m41483b(boolean z) {
        return z ? R.layout.ii : R.layout.ig;
    }

    /* renamed from: a */
    public final void mo33739a(String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = l.longValue() != 0 ? new Date(new Date().getTime() + (l.longValue() * 1000)) : null;
        if (!(l2.longValue() == 0 || l2 == null)) {
            date = new Date(l2.longValue() * 1000);
        }
        AccessToken accessToken = new AccessToken(str, C13499h.m39725k(), "0", null, null, null, null, date2, null, date);
        final String str2 = str;
        GraphRequest graphRequest = new GraphRequest(accessToken, "me", bundle, HttpMethod.GET, new C13090b() {
            /* renamed from: a */
            public final void mo31792a(GraphResponse graphResponse) {
                if (!DeviceAuthDialog.this.f37151a.get()) {
                    if (graphResponse.f34704d != null) {
                        DeviceAuthDialog.this.mo33734a(graphResponse.f34704d.f34664n);
                        return;
                    }
                    try {
                        JSONObject jSONObject = graphResponse.f34702b;
                        String string = jSONObject.getString("id");
                        C13972c b = C13967z.m41251b(jSONObject);
                        String string2 = jSONObject.getString("name");
                        C13358a.m39120c(DeviceAuthDialog.this.f37152b.f37179b);
                        if (!C13926o.m41097a(C13499h.m39725k()).f36841e.contains(SmartLoginOption.RequireConfirm) || DeviceAuthDialog.this.f37155e) {
                            DeviceAuthDialog.this.mo33738a(string, b, str2, date2, date);
                            return;
                        }
                        DeviceAuthDialog.this.f37155e = true;
                        DeviceAuthDialog.this.mo33737a(string, b, str2, string2, date2, date);
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.mo33734a(new FacebookException((Throwable) e));
                    }
                }
            }
        });
        graphRequest.mo31790b();
    }

    /* renamed from: d */
    private GraphRequest m41484d() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f37152b.f37180c);
        GraphRequest graphRequest = new GraphRequest(null, "device/login_status", bundle, HttpMethod.POST, new C13090b() {
            /* renamed from: a */
            public final void mo31792a(GraphResponse graphResponse) {
                if (!DeviceAuthDialog.this.f37151a.get()) {
                    FacebookRequestError facebookRequestError = graphResponse.f34704d;
                    if (facebookRequestError != null) {
                        int i = facebookRequestError.f34655e;
                        if (i != 1349152) {
                            switch (i) {
                                case 1349172:
                                case 1349174:
                                    DeviceAuthDialog.this.mo33740b();
                                    return;
                                case 1349173:
                                    DeviceAuthDialog.this.mo33741c();
                                    return;
                                default:
                                    DeviceAuthDialog.this.mo33734a(graphResponse.f34704d.f34664n);
                                    return;
                            }
                        } else {
                            if (DeviceAuthDialog.this.f37152b != null) {
                                C13358a.m39120c(DeviceAuthDialog.this.f37152b.f37179b);
                            }
                            if (DeviceAuthDialog.this.f37156f != null) {
                                DeviceAuthDialog.this.mo33736a(DeviceAuthDialog.this.f37156f);
                            } else {
                                DeviceAuthDialog.this.mo33741c();
                            }
                        }
                    } else {
                        try {
                            JSONObject jSONObject = graphResponse.f34702b;
                            DeviceAuthDialog.this.mo33739a(jSONObject.getString("access_token"), Long.valueOf(jSONObject.getLong("expires_in")), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        } catch (JSONException e) {
                            DeviceAuthDialog.this.mo33734a(new FacebookException((Throwable) e));
                        }
                    }
                }
            }
        });
        return graphRequest;
    }

    /* renamed from: a */
    public final void mo33733a() {
        this.f37152b.f37182e = new Date().getTime();
        this.f37161k = m41484d().mo31790b();
    }

    /* renamed from: b */
    public final void mo33740b() {
        this.f37162l = DeviceAuthMethodHandler.m41503c().schedule(new Runnable() {
            public final void run() {
                DeviceAuthDialog.this.mo33733a();
            }
        }, this.f37152b.f37181d, TimeUnit.SECONDS);
    }

    public void onDestroy() {
        this.f37154d = true;
        this.f37151a.set(true);
        super.onDestroy();
        if (this.f37161k != null) {
            this.f37161k.cancel(true);
        }
        if (this.f37162l != null) {
            this.f37162l.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo33741c() {
        if (this.f37151a.compareAndSet(false, true)) {
            if (this.f37152b != null) {
                C13358a.m39120c(this.f37152b.f37179b);
            }
            if (this.f37160j != null) {
                this.f37160j.mo33755t_();
            }
            C14099a.m41651a(this.f37153c);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f37154d) {
            mo33741c();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f37152b != null) {
            bundle.putParcelable("request_state", this.f37152b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33734a(FacebookException facebookException) {
        if (this.f37151a.compareAndSet(false, true)) {
            if (this.f37152b != null) {
                C13358a.m39120c(this.f37152b.f37179b);
            }
            this.f37160j.mo33752a((Exception) facebookException);
            C14099a.m41651a(this.f37153c);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        this.f37153c = new Dialog(getActivity(), R.style.s3);
        if (!C13358a.m39119b() || this.f37155e) {
            z = false;
        } else {
            z = true;
        }
        this.f37153c.setContentView(mo33732a(z));
        return this.f37153c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo33732a(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(m41483b(z), null);
        this.f37157g = inflate.findViewById(R.id.cl2);
        this.f37158h = (TextView) inflate.findViewById(R.id.a13);
        ((Button) inflate.findViewById(R.id.st)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DeviceAuthDialog.this.mo33741c();
            }
        });
        this.f37159i = (TextView) inflate.findViewById(R.id.yc);
        this.f37159i.setText(Html.fromHtml(getString(R.string.a6a)));
        return inflate;
    }

    /* renamed from: a */
    public final void mo33735a(RequestState requestState) {
        this.f37152b = requestState;
        this.f37158h.setText(requestState.f37179b);
        this.f37159i.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(getResources(), C13358a.m39118b(requestState.f37178a)), null, null);
        this.f37158h.setVisibility(0);
        this.f37157g.setVisibility(8);
        if (!this.f37155e && C13358a.m39117a(requestState.f37179b)) {
            new C13187j(getContext()).mo32364a("fb_smart_login_service");
        }
        if (requestState.mo33747a()) {
            mo33740b();
        } else {
            mo33733a();
        }
    }

    /* renamed from: a */
    public final void mo33736a(Request request) {
        this.f37156f = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f37201b));
        String str = request.f37206g;
        if (str != null) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.f37208i;
        if (str2 != null) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C13876aa.m40981b());
        sb.append("|");
        sb.append(C13876aa.m40985c());
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", C13358a.m39116a());
        GraphRequest graphRequest = new GraphRequest(null, "device/login", bundle, HttpMethod.POST, new C13090b() {
            /* renamed from: a */
            public final void mo31792a(GraphResponse graphResponse) {
                if (!DeviceAuthDialog.this.f37154d) {
                    if (graphResponse.f34704d != null) {
                        DeviceAuthDialog.this.mo33734a(graphResponse.f34704d.f34664n);
                        return;
                    }
                    JSONObject jSONObject = graphResponse.f34702b;
                    RequestState requestState = new RequestState();
                    try {
                        requestState.mo33746a(jSONObject.getString("user_code"));
                        requestState.f37180c = jSONObject.getString("code");
                        requestState.f37181d = jSONObject.getLong("interval");
                        DeviceAuthDialog.this.mo33735a(requestState);
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.mo33734a(new FacebookException((Throwable) e));
                    }
                }
            }
        });
        graphRequest.mo31790b();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f37160j = (DeviceAuthMethodHandler) ((LoginFragment) ((FacebookActivity) getActivity()).f34647b).f37221a.mo33777d();
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                mo33735a(requestState);
            }
        }
        return onCreateView;
    }

    /* renamed from: a */
    public final void mo33738a(String str, C13972c cVar, String str2, Date date, Date date2) {
        C13972c cVar2 = cVar;
        this.f37160j.mo33753a(str2, C13499h.m39725k(), str, cVar2.f36953a, cVar2.f36954b, cVar2.f36955c, AccessTokenSource.DEVICE_AUTH, date, null, date2);
        C14099a.m41651a(this.f37153c);
    }

    /* renamed from: a */
    public final void mo33737a(String str, C13972c cVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(R.string.a6v);
        String string2 = getResources().getString(R.string.a6u);
        String string3 = getResources().getString(R.string.a6t);
        String a = C1642a.m8034a(string2, new Object[]{str3});
        Builder builder = new Builder(getContext());
        Builder cancelable = builder.setMessage(string).setCancelable(true);
        final String str4 = str;
        final C13972c cVar2 = cVar;
        final String str5 = str2;
        final Date date3 = date;
        final Date date4 = date2;
        C140736 r5 = new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.this.mo33738a(str4, cVar2, str5, date3, date4);
            }
        };
        cancelable.setNegativeButton(a, r5).setPositiveButton(string3, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.this.f37153c.setContentView(DeviceAuthDialog.this.mo33732a(false));
                DeviceAuthDialog.this.mo33736a(DeviceAuthDialog.this.f37156f);
            }
        });
        builder.create().show();
    }
}

package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.devicerequests.p690a.C13358a;
import com.facebook.internal.C13876aa;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceShareDialogFragment extends DialogFragment {

    /* renamed from: g */
    private static ScheduledThreadPoolExecutor f37433g;

    /* renamed from: a */
    public Dialog f37434a;

    /* renamed from: b */
    public ShareContent f37435b;

    /* renamed from: c */
    private ProgressBar f37436c;

    /* renamed from: d */
    private TextView f37437d;

    /* renamed from: e */
    private volatile RequestState f37438e;

    /* renamed from: f */
    private volatile ScheduledFuture f37439f;

    static class RequestState implements Parcelable {
        public static final Creator<RequestState> CREATOR = new Creator<RequestState>() {
            /* renamed from: a */
            private static RequestState[] m41819a(int i) {
                return new RequestState[i];
            }

            /* renamed from: a */
            private static RequestState m41818a(Parcel parcel) {
                return new RequestState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m41818a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m41819a(i);
            }
        };

        /* renamed from: a */
        public String f37443a;

        /* renamed from: b */
        public long f37444b;

        RequestState() {
        }

        public int describeContents() {
            return 0;
        }

        protected RequestState(Parcel parcel) {
            this.f37443a = parcel.readString();
            this.f37444b = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f37443a);
            parcel.writeLong(this.f37444b);
        }
    }

    /* renamed from: a */
    private void m41810a() {
        if (isAdded()) {
            this.mFragmentManager.mo2645a().mo2587a((Fragment) this).mo2604c();
        }
    }

    /* renamed from: b */
    private Bundle m41812b() {
        ShareContent shareContent = this.f37435b;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return C14551o.m42063a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return C14551o.m42064a((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* renamed from: d */
    private static synchronized ScheduledThreadPoolExecutor m41814d() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f37433g == null) {
                f37433g = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f37433g;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: c */
    private void m41813c() {
        Bundle b = m41812b();
        if (b == null || b.size() == 0) {
            mo36650a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C13876aa.m40981b());
        sb.append("|");
        sb.append(C13876aa.m40985c());
        b.putString("access_token", sb.toString());
        b.putString("device_info", C13358a.m39116a());
        GraphRequest graphRequest = new GraphRequest(null, "device/share", b, HttpMethod.POST, new C13090b() {
            /* renamed from: a */
            public final void mo31792a(GraphResponse graphResponse) {
                FacebookRequestError facebookRequestError = graphResponse.f34704d;
                if (facebookRequestError != null) {
                    DeviceShareDialogFragment.this.mo36650a(facebookRequestError);
                    return;
                }
                JSONObject jSONObject = graphResponse.f34702b;
                RequestState requestState = new RequestState();
                try {
                    requestState.f37443a = jSONObject.getString("user_code");
                    requestState.f37444b = jSONObject.getLong("expires_in");
                    DeviceShareDialogFragment.this.mo36651a(requestState);
                } catch (JSONException unused) {
                    DeviceShareDialogFragment.this.mo36650a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        });
        graphRequest.mo31790b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f37438e != null) {
            bundle.putParcelable("request_state", this.f37438e);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f37439f != null) {
            this.f37439f.cancel(true);
        }
        m41811a(-1, new Intent());
    }

    /* renamed from: a */
    public final void mo36650a(FacebookRequestError facebookRequestError) {
        m41810a();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m41811a(-1, intent);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        this.f37434a = new Dialog(getActivity(), R.style.s3);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.ig, null);
        this.f37436c = (ProgressBar) inflate.findViewById(R.id.cl2);
        this.f37437d = (TextView) inflate.findViewById(R.id.a13);
        ((Button) inflate.findViewById(R.id.st)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C14492b.m41831a(DeviceShareDialogFragment.this.f37434a);
            }
        });
        ((TextView) inflate.findViewById(R.id.yc)).setText(Html.fromHtml(getString(R.string.a6a)));
        this.f37434a.setContentView(inflate);
        m41813c();
        return this.f37434a;
    }

    /* renamed from: a */
    public final void mo36651a(RequestState requestState) {
        this.f37438e = requestState;
        this.f37437d.setText(requestState.f37443a);
        this.f37437d.setVisibility(0);
        this.f37436c.setVisibility(8);
        this.f37439f = m41814d().schedule(new Runnable() {
            public final void run() {
                C14493c.m41832a(DeviceShareDialogFragment.this.f37434a);
            }
        }, requestState.f37444b, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    private void m41811a(int i, Intent intent) {
        if (this.f37438e != null) {
            C13358a.m39120c(this.f37438e.f37443a);
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            C14494d.m41833a(Toast.makeText(getContext(), facebookRequestError.mo31780a(), 0));
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                mo36651a(requestState);
            }
        }
        return onCreateView;
    }
}

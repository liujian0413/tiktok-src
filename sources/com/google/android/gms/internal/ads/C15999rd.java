package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.rd */
public final class C15999rd extends C16014rs {

    /* renamed from: a */
    private final Map<String, String> f44898a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f44899b;

    /* renamed from: c */
    private String f44900c = m52034d("description");

    /* renamed from: d */
    private long f44901d = m52035e("start_ticks");

    /* renamed from: e */
    private long f44902e = m52035e("end_ticks");

    /* renamed from: f */
    private String f44903f = m52034d("summary");

    /* renamed from: g */
    private String f44904g = m52034d("location");

    public C15999rd(ami ami, Map<String, String> map) {
        super(ami, "createCalendarEvent");
        this.f44898a = map;
        this.f44899b = ami.mo39466d();
    }

    /* renamed from: d */
    private final String m52034d(String str) {
        return TextUtils.isEmpty((CharSequence) this.f44898a.get(str)) ? "" : (String) this.f44898a.get(str);
    }

    /* renamed from: e */
    private final long m52035e(String str) {
        String str2 = (String) this.f44898a.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo41927a() {
        if (this.f44899b == null) {
            mo41951a("Activity context is not available.");
        } else if (!acl.m45559f(this.f44899b).mo40683d()) {
            mo41951a("This feature is not available on the device.");
        } else {
            Builder e = acl.m45555e(this.f44899b);
            Resources f = C14793ay.m42898d().mo39096f();
            e.setTitle(f != null ? f.getString(R.string.dhu) : "Create calendar event");
            e.setMessage(f != null ? f.getString(R.string.dhv) : "Allow Ad to create a calendar event?");
            e.setPositiveButton(f != null ? f.getString(R.string.dhs) : "Accept", new C16000re(this));
            e.setNegativeButton(f != null ? f.getString(R.string.dht) : "Decline", new C16001rf(this));
            e.create().show();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Intent mo41928b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.f44900c);
        data.putExtra("eventLocation", this.f44904g);
        data.putExtra("description", this.f44903f);
        if (this.f44901d > -1) {
            data.putExtra("beginTime", this.f44901d);
        }
        if (this.f44902e > -1) {
            data.putExtra("endTime", this.f44902e);
        }
        data.setFlags(268435456);
        return data;
    }
}

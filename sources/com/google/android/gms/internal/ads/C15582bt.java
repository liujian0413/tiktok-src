package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.p749d.C15176d;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.bt */
public final class C15582bt implements OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final Object f43489a = new Object();

    /* renamed from: b */
    private final ConditionVariable f43490b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f43491c = false;

    /* renamed from: d */
    private volatile boolean f43492d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SharedPreferences f43493e = null;

    /* renamed from: f */
    private Bundle f43494f = new Bundle();

    /* renamed from: g */
    private Context f43495g;

    /* renamed from: h */
    private JSONObject f43496h = new JSONObject();

    /* renamed from: a */
    public final void mo41274a(Context context) {
        if (!this.f43491c) {
            synchronized (this.f43489a) {
                if (!this.f43491c) {
                    if (!this.f43492d) {
                        this.f43492d = true;
                    }
                    this.f43495g = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        this.f43494f = C15176d.m44159a(this.f43495g).mo38462a(this.f43495g.getPackageName(), (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData;
                    } catch (NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context f = C15181e.m44177f(context);
                        if (f == null && context != null) {
                            f = context.getApplicationContext();
                            if (f == null) {
                                f = context;
                            }
                        }
                        if (f != null) {
                            this.f43493e = C7285c.m22838a(f, "google_ads_flags", 0);
                            if (this.f43493e != null) {
                                this.f43493e.registerOnSharedPreferenceChangeListener(this);
                            }
                            m50007b();
                            this.f43491c = true;
                            this.f43492d = false;
                            this.f43490b.open();
                        }
                    } finally {
                        this.f43492d = false;
                        this.f43490b.open();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo41272a(C15573bl<T> blVar) {
        if (!this.f43490b.block(DouPlusShareGuideExperiment.MIN_VALID_DURATION)) {
            synchronized (this.f43489a) {
                if (!this.f43492d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f43491c || this.f43493e == null) {
            synchronized (this.f43489a) {
                if (this.f43491c) {
                    if (this.f43493e == null) {
                    }
                }
                T t = blVar.f42435c;
                return t;
            }
        }
        if (blVar.f42433a == 2) {
            if (this.f43494f == null) {
                return blVar.f42435c;
            }
            return blVar.mo40869a(this.f43494f);
        } else if (blVar.f42433a != 1 || !this.f43496h.has(blVar.f42434b)) {
            return aet.m45702a(this.f43495g, new C15584bv(this, blVar));
        } else {
            return blVar.mo40870a(this.f43496h);
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m50007b();
        }
    }

    /* renamed from: b */
    private final void m50007b() {
        if (this.f43493e != null) {
            try {
                this.f43496h = new JSONObject((String) aet.m45702a(this.f43495g, new C15583bu(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ String mo41273a() throws Exception {
        return this.f43493e.getString("flag_configuration", "{}");
    }
}

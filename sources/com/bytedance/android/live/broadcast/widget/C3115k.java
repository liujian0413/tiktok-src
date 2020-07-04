package com.bytedance.android.live.broadcast.widget;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.C2375g;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.C2749a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3484c;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8297f;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47559ag;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.broadcast.widget.k */
public final class C3115k implements OnClickListener {

    /* renamed from: b */
    private static int f9607b = 1;

    /* renamed from: c */
    private static int f9608c = 1;

    /* renamed from: d */
    private static int f9609d = 750;

    /* renamed from: e */
    private static int f9610e = 750;

    /* renamed from: a */
    public final C47562b f9611a;

    /* renamed from: f */
    private HSImageView f9612f;

    /* renamed from: g */
    private View f9613g;

    /* renamed from: h */
    private TextView f9614h;

    /* renamed from: i */
    private BaseFragment f9615i;

    /* renamed from: j */
    private C3484c f9616j;

    /* renamed from: k */
    private String f9617k;

    /* renamed from: l */
    private LiveMode f9618l;

    /* renamed from: m */
    private C2375g f9619m;

    /* renamed from: n */
    private User f9620n;

    /* renamed from: a */
    public final String mo9925a() {
        if (this.f9619m == null) {
            return null;
        }
        return this.f9619m.f7820a;
    }

    /* renamed from: b */
    public final void mo9932b() {
        if (this.f9616j != null) {
            this.f9616j.mo10472b();
            this.f9616j = null;
        }
        this.f9617k = null;
    }

    /* renamed from: c */
    public final void mo9933c() {
        if (this.f9617k == null) {
            this.f9616j.mo10473c();
        }
    }

    /* renamed from: d */
    private static User m11817d() {
        C8984e eVar;
        IUser iUser;
        C3592a aVar = (C3592a) C3596c.m13172a(C3592a.class);
        if (aVar != null) {
            eVar = aVar.user();
        } else {
            eVar = null;
        }
        if (eVar != null) {
            iUser = eVar.mo22165a();
        } else {
            iUser = null;
        }
        if (iUser instanceof User) {
            return (User) iUser;
        }
        return null;
    }

    /* renamed from: e */
    private void m11818e() {
        if (this.f9615i.mo8989l()) {
            this.f9614h.setText(this.f9615i.getString(R.string.eq3));
            this.f9614h.setAlpha(0.64f);
            this.f9611a.mo119661a(C2515f.m10417f().mo9076c().mo9171f().anchorCoverStatus().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3118m<Object>(this), C3119n.f9625a));
        }
    }

    /* renamed from: a */
    public final void mo9926a(int i) {
        m11814a((View) this.f9614h, 8);
        m11814a((View) this.f9612f, 8);
        m11814a(this.f9613g, 8);
    }

    /* renamed from: a */
    public final void mo9930a(Throwable th) {
        String str;
        if (th instanceof ApiServerException) {
            str = ((ApiServerException) th).getErrorMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f9615i.getString(R.string.f_c);
        }
        this.f9617k = null;
        if (this.f9615i.mo8989l()) {
            this.f9616j.mo10472b();
            C3517a.m12962a(this.f9615i.getContext(), str);
        }
    }

    /* renamed from: a */
    private static void m11815a(LiveMode liveMode) {
        String str;
        Object obj;
        User user = (User) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        HashMap hashMap = new HashMap();
        String str2 = "live_type";
        if (liveMode == LiveMode.AUDIO) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put(str2, str);
        String str3 = "anchor_id";
        if (user == null) {
            obj = "0";
        } else {
            obj = Long.valueOf(user.getId());
        }
        hashMap.put(str3, String.valueOf(obj));
        C8443c.m25663a().mo21606a("pm_live_photo_upload", hashMap, new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_take_page"));
    }

    public final void onClick(View view) {
        String str;
        if (view.getId() == R.id.bo2) {
            mo9933c();
            HashMap hashMap = new HashMap();
            String str2 = "live_type";
            if (this.f9618l == LiveMode.AUDIO) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            hashMap.put(str2, str);
            if (this.f9620n != null) {
                hashMap.put("anchor_id", String.valueOf(this.f9620n.getId()));
            }
            C3172e.m12002a("ttlive_upload_cover_start", 0, (JSONObject) null);
            C8443c.m25663a().mo21606a("livesdk_cover_modify_click", hashMap, new C8438j().mo21603f("click").mo21599b("live").mo21598a("live_take_page"));
        }
    }

    /* renamed from: a */
    public final void mo9927a(C2375g gVar) {
        String str;
        if (!this.f9615i.mo8989l()) {
            this.f9617k = null;
            return;
        }
        C3393m.m12634b(this.f9612f, gVar.f7822c);
        this.f9614h.setText(this.f9615i.getString(R.string.cvt));
        this.f9614h.setAlpha(1.0f);
        this.f9616j.mo10472b();
        if (!TextUtils.isEmpty(gVar.f7820a)) {
            this.f9619m = gVar;
        }
        HashMap hashMap = new HashMap();
        String str2 = "live_type";
        if (this.f9618l == LiveMode.AUDIO) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put(str2, str);
        hashMap.put("shooting_date", this.f9617k);
        hashMap.put("current_date", String.valueOf(System.currentTimeMillis()));
        hashMap.put("cover_url", this.f9619m.f7820a);
        if (this.f9620n != null) {
            hashMap.put("anchor_id", String.valueOf(this.f9620n.getId()));
        }
        C8443c.m25663a().mo21606a("livesdk_cover_modify_over", hashMap, new C8438j().mo21603f("click").mo21599b("live").mo21598a("cover_edit"));
        this.f9617k = null;
        m11815a(this.f9618l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9928a(C3479d dVar) throws Exception {
        if (dVar != null && dVar.data != null) {
            boolean z = true;
            switch (((C2749a) dVar.data).f8706a) {
                case 0:
                    this.f9614h.setText(this.f9615i.getString(R.string.eq5));
                    this.f9614h.setAlpha(1.0f);
                    C3393m.m12633b(this.f9612f, ((C2749a) dVar.data).f8708c);
                    break;
                case 1:
                    this.f9614h.setText(this.f9615i.getString(R.string.cvt));
                    this.f9614h.setAlpha(1.0f);
                    C3393m.m12633b(this.f9612f, ((C2749a) dVar.data).f8707b);
                    break;
                default:
                    z = false;
                    this.f9614h.setText(this.f9615i.getString(R.string.eq3));
                    this.f9614h.setAlpha(0.64f);
                    break;
            }
            C8297f fVar = new C8297f();
            fVar.f22779a = 2;
            fVar.f22780b = z;
            C9097a.m27146a().mo22267a((Object) fVar);
        }
    }

    public C3115k(View view, BaseFragment baseFragment) {
        this(view, baseFragment, f9607b, f9608c);
    }

    /* renamed from: a */
    private static void m11814a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9929a(final String str, String str2) {
        this.f9616j.mo10470a();
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("avatar file don't exists in path ");
            sb.append(str);
            mo9930a((Throwable) new Exception(sb.toString()));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C2515f.m10417f().mo9076c().mo9170e().uploadAvatar(multipartTypedOutput).mo19124a((C47559ag<? super T, ? extends R>) C3303k.m12366a()).mo19137b((C47557ad<? super T>) new C47557ad<C3479d<C2375g>>() {
            public final void onSubscribe(C7321c cVar) {
                C3115k.this.f9611a.mo119661a(cVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C3479d<C2375g> dVar) {
                ((C2375g) dVar.data).f7822c = str;
                C3115k.this.mo9927a((C2375g) dVar.data);
                C3172e.m12002a("ttlive_upload_cover_all", 0, (JSONObject) null);
            }

            public final void onError(Throwable th) {
                C3115k.this.mo9930a(th);
                JSONObject jSONObject = new JSONObject();
                C3168a.m11984a(jSONObject, "error_code", "1");
                C3168a.m11984a(jSONObject, "error_msg", th.toString());
                C3172e.m12002a("ttlive_upload_cover_all", 1, jSONObject);
                C3172e.m12002a("ttlive_upload_cover_error", 1, jSONObject);
            }
        });
        this.f9617k = str2;
    }

    /* renamed from: a */
    public final boolean mo9931a(int i, int i2, Intent intent) {
        return this.f9616j.mo10471a(i, i2, intent);
    }

    private C3115k(View view, BaseFragment baseFragment, int i, int i2) {
        this.f9611a = new C47562b();
        this.f9620n = m11817d();
        f9607b = i;
        f9608c = i2;
        if (i > i2) {
            f9609d = 480;
            f9610e = 270;
        } else if (i < i2) {
            f9609d = 270;
            f9610e = 480;
        }
        int i3 = 250;
        if (LiveSettingKeys.LIVE_COVER_MIN_SIZE.mo10240a() != null) {
            i3 = ((Integer) LiveSettingKeys.LIVE_COVER_MIN_SIZE.mo10240a()).intValue();
        }
        f9609d = i3;
        f9610e = i3;
        this.f9615i = baseFragment;
        this.f9612f = (HSImageView) view.findViewById(R.id.bo2);
        this.f9612f.setImageResource(R.drawable.bxn);
        this.f9612f.setOnClickListener(this);
        this.f9614h = (TextView) view.findViewById(R.id.dwz);
        this.f9613g = view.findViewById(R.id.bo3);
        this.f9616j = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).createImagePicker(this.f9615i.getActivity(), this.f9615i, "cover", f9607b, f9608c, f9609d, f9610e, new C3117l(this));
        m11818e();
    }
}

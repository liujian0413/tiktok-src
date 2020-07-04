package com.bytedance.android.live.broadcast.widget;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C2375g;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.p134e.C2567e.C2568a;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
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
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8297f;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47559ag;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.live.broadcast.widget.s */
public final class C3131s implements OnClickListener {

    /* renamed from: b */
    private static int f9655b = 1;

    /* renamed from: c */
    private static int f9656c = 1;

    /* renamed from: d */
    private static int f9657d = 750;

    /* renamed from: e */
    private static int f9658e = 750;

    /* renamed from: a */
    public final C47562b f9659a;

    /* renamed from: f */
    private HSImageView f9660f;

    /* renamed from: g */
    private View f9661g;

    /* renamed from: h */
    private TextView f9662h;

    /* renamed from: i */
    private BaseFragment f9663i;

    /* renamed from: j */
    private C3484c f9664j;

    /* renamed from: k */
    private String f9665k;

    /* renamed from: l */
    private LiveMode f9666l;

    /* renamed from: m */
    private C2375g f9667m;

    /* renamed from: n */
    private StartLiveViewModel f9668n;

    /* renamed from: b */
    public final void mo9958b() {
        if (this.f9664j != null) {
            this.f9664j.mo10472b();
            this.f9664j = null;
        }
        this.f9665k = null;
    }

    /* renamed from: c */
    public final void mo9959c() {
        if (this.f9665k == null) {
            this.f9664j.mo10473c();
        }
    }

    /* renamed from: d */
    private void m11860d() {
        if (this.f9663i.mo8989l()) {
            this.f9662h.setText(this.f9663i.getString(R.string.eq4));
            this.f9662h.setAlpha(0.64f);
        }
    }

    /* renamed from: a */
    public final String mo9951a() {
        if (this.f9667m != null) {
            if (this.f9667m.f7820a != null) {
                return this.f9667m.f7820a;
            }
            if (!C6307b.m19566a((Collection<T>) this.f9667m.f7821b)) {
                return Uri.parse((String) this.f9667m.f7821b.get(0)).toString();
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo9954a(LiveMode liveMode) {
        if (liveMode != this.f9666l) {
            this.f9666l = liveMode;
        }
    }

    /* renamed from: a */
    private static C2375g m11858a(ImageModel imageModel) {
        if (imageModel == null) {
            return null;
        }
        C2375g gVar = new C2375g();
        gVar.f7820a = imageModel.mUri;
        gVar.f7821b = imageModel.mUrls;
        return gVar;
    }

    /* renamed from: b */
    private static void m11859b(LiveMode liveMode) {
        String str;
        IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        if (a instanceof User) {
            User user = (User) a;
            HashMap hashMap = new HashMap();
            String str2 = "live_type";
            if (liveMode == LiveMode.AUDIO) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            hashMap.put(str2, str);
            hashMap.put("anchor_id", String.valueOf(user.getId()));
            C8443c.m25663a().mo21606a("pm_live_photo_upload", hashMap, new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_take_page"));
        }
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.bo2) {
            mo9959c();
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", C2568a.m10552a(this.f9666l));
            C8443c.m25663a().mo21606a("cover_modify_click", hashMap, new C8438j().mo21603f("click").mo21599b("live").mo21598a("live_take_page"));
        }
    }

    /* renamed from: a */
    public final void mo9953a(C2375g gVar) {
        String str;
        if (!this.f9663i.mo8989l()) {
            this.f9665k = null;
            return;
        }
        C13438a aVar = (C13438a) this.f9660f.getHierarchy();
        if (aVar != null) {
            aVar.mo32896a(C13423b.f35599g);
            this.f9660f.setHierarchy(aVar);
        }
        C3393m.m12634b(this.f9660f, gVar.f7822c);
        this.f9662h.setText(this.f9663i.getString(R.string.eq4));
        this.f9662h.setAlpha(1.0f);
        this.f9664j.mo10472b();
        if (!TextUtils.isEmpty(gVar.f7820a)) {
            this.f9667m = gVar;
        }
        if (this.f9668n != null) {
            this.f9668n.mo9602i().postValue(mo9951a());
        }
        HashMap hashMap = new HashMap();
        String str2 = "live_type";
        if (this.f9666l == LiveMode.AUDIO) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put(str2, str);
        hashMap.put("shooting_date", this.f9665k);
        hashMap.put("current_date", String.valueOf(System.currentTimeMillis()));
        hashMap.put("cover_url", this.f9667m.f7820a);
        C8443c.m25663a().mo21606a("cover_modify_over", hashMap, new C8438j().mo21603f("click").mo21599b("live").mo21598a("cover_edit"));
        this.f9665k = null;
        m11859b(this.f9666l);
    }

    /* renamed from: a */
    public final void mo9956a(Throwable th) {
        String str;
        if (th instanceof ApiServerException) {
            str = ((ApiServerException) th).getErrorMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f9663i.getString(R.string.f_c);
        }
        this.f9665k = null;
        if (this.f9663i.mo8989l()) {
            this.f9664j.mo10472b();
            C3517a.m12962a(this.f9663i.getContext(), str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9955a(final String str, String str2) {
        this.f9664j.mo10470a();
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("avatar file don't exists in path ");
            sb.append(str);
            mo9956a((Throwable) new Exception(sb.toString()));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C2515f.m10417f().mo9076c().mo9170e().uploadAvatar(multipartTypedOutput).mo19124a((C47559ag<? super T, ? extends R>) C3303k.m12366a()).mo19137b((C47557ad<? super T>) new C47557ad<C3479d<C2375g>>() {
            public final void onSubscribe(C7321c cVar) {
                C3131s.this.f9659a.mo119661a(cVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C3479d<C2375g> dVar) {
                ((C2375g) dVar.data).f7822c = str;
                C3131s.this.mo9953a((C2375g) dVar.data);
                C3172e.m12002a("ttlive_upload_cover_all", 0, (JSONObject) null);
            }

            public final void onError(Throwable th) {
                C3131s.this.mo9956a(th);
                JSONObject jSONObject = new JSONObject();
                C3168a.m11984a(jSONObject, "error_code", "1");
                C3168a.m11984a(jSONObject, "error_msg", th.toString());
                C3172e.m12002a("ttlive_upload_cover_all", 1, jSONObject);
                C3172e.m12002a("ttlive_upload_cover_error", 1, jSONObject);
            }
        });
        this.f9665k = str2;
    }

    public C3131s(View view, BaseFragment baseFragment, StartLiveViewModel startLiveViewModel) {
        this(view, baseFragment, startLiveViewModel, f9655b, f9656c);
    }

    /* renamed from: a */
    public final boolean mo9957a(int i, int i2, Intent intent) {
        return this.f9664j.mo10471a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo9952a(int i, ImageModel imageModel, boolean z) {
        boolean z2;
        switch (i) {
            case 0:
                this.f9662h.setText(this.f9663i.getString(R.string.eq5));
                this.f9662h.setAlpha(1.0f);
                C3393m.m12633b(this.f9660f, imageModel);
                break;
            case 1:
                this.f9662h.setText(this.f9663i.getString(R.string.eq4));
                this.f9662h.setAlpha(1.0f);
                C3393m.m12633b(this.f9660f, imageModel);
                break;
            default:
                z2 = false;
                this.f9662h.setText(this.f9663i.getString(R.string.eq3));
                this.f9662h.setAlpha(0.64f);
                break;
        }
        z2 = true;
        if (imageModel != null) {
            this.f9667m = m11858a(imageModel);
        }
        if (z) {
            IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
            if (a instanceof User) {
                this.f9662h.setText(this.f9663i.getString(R.string.eq4));
                C3393m.m12633b(this.f9660f, a.getAvatarThumb());
                this.f9667m = m11858a(a.getAvatarThumb());
            }
        } else if (imageModel == null) {
            this.f9662h.setText(this.f9663i.getString(R.string.eq3));
            this.f9660f.setScaleType(ScaleType.FIT_XY);
            C13438a aVar = (C13438a) this.f9660f.getHierarchy();
            if (aVar != null) {
                aVar.mo32896a(C13423b.f35593a);
                this.f9660f.setHierarchy(aVar);
            }
            this.f9660f.setBackgroundResource(R.drawable.bz9);
        }
        if (!(this.f9668n == null || i == 1)) {
            this.f9668n.mo9602i().postValue(mo9951a());
        }
        C8297f fVar = new C8297f();
        fVar.f22779a = 2;
        fVar.f22780b = z2;
        C9097a.m27146a().mo22267a((Object) fVar);
    }

    private C3131s(View view, BaseFragment baseFragment, StartLiveViewModel startLiveViewModel, int i, int i2) {
        this.f9659a = new C47562b();
        f9655b = i;
        f9656c = i2;
        if (i > i2) {
            f9657d = 480;
            f9658e = 270;
        } else if (i < i2) {
            f9657d = 270;
            f9658e = 480;
        }
        this.f9663i = baseFragment;
        this.f9668n = startLiveViewModel;
        this.f9660f = (HSImageView) view.findViewById(R.id.bo2);
        this.f9660f.setImageResource(R.drawable.bxn);
        this.f9660f.setOnClickListener(this);
        this.f9662h = (TextView) view.findViewById(R.id.dwz);
        this.f9661g = view.findViewById(R.id.bo3);
        this.f9664j = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).createImagePicker(this.f9663i.getActivity(), this.f9663i, "cover", f9655b, f9656c, f9657d, f9658e, new C3133t(this));
        m11860d();
    }
}

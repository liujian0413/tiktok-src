package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.text.Spannable;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.C2375g;
import com.bytedance.android.live.broadcast.api.p128d.C2435d;
import com.bytedance.android.live.broadcast.model.C2756f;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3484c;
import com.bytedance.android.live.room.C3484c.C3485a;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.message.model.C8540cb;
import com.bytedance.android.livesdk.widget.C9252i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47559ag;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.live.broadcast.widget.o */
public final class C3120o implements C2435d, C3485a {

    /* renamed from: b */
    private static int f9626b = 1;

    /* renamed from: c */
    private static int f9627c = 1;

    /* renamed from: d */
    private static int f9628d = 750;

    /* renamed from: e */
    private static int f9629e = 750;

    /* renamed from: a */
    public final C47562b f9630a = new C47562b();

    /* renamed from: f */
    private Room f9631f;

    /* renamed from: g */
    private long f9632g;

    /* renamed from: h */
    private long f9633h;

    /* renamed from: i */
    private Context f9634i;

    /* renamed from: j */
    private C3484c f9635j;

    /* renamed from: k */
    private int f9636k;

    /* renamed from: l */
    private OnClickListener f9637l = new C3123p(this);

    /* renamed from: m */
    private OnClickListener f9638m = new C3124q(this);

    /* renamed from: a */
    public final void mo8939a() {
        this.f9630a.dispose();
        if (this.f9635j != null) {
            this.f9635j.mo10472b();
        }
    }

    /* renamed from: f_ */
    public final void mo9628f_() {
        this.f9635j.mo10472b();
        this.f9630a.dispose();
    }

    /* renamed from: b */
    private HashMap<String, String> m11832b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("room_id", String.valueOf(this.f9632g));
        hashMap.put("anchor_id", String.valueOf(this.f9633h));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo9937a(C3479d<C2756f> dVar) {
        if (dVar != null) {
            try {
                if (dVar.data != null && ((C2756f) dVar.data).f8735a.booleanValue()) {
                    C8443c.m25663a().mo21606a("livesdk_cover_pass_audit", m11832b(), new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m11831a(final String str) {
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("avatar file don't exists in path");
            sb.append(str);
            mo9938a((Throwable) new FileNotFoundException(sb.toString()));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C2515f.m10417f().mo9076c().mo9170e().uploadAvatar(multipartTypedOutput).mo19124a((C47559ag<? super T, ? extends R>) C3303k.m12366a()).mo19137b((C47557ad<? super T>) new C47557ad<C3479d<C2375g>>() {
            public final void onSubscribe(C7321c cVar) {
                C3120o.this.f9630a.mo119661a(cVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C3479d<C2375g> dVar) {
                ((C2375g) dVar.data).f7822c = str;
                C3120o.this.mo9936a((C2375g) dVar.data);
                C3172e.m12002a("ttlive_upload_cover_all", 0, (JSONObject) null);
            }

            public final void onError(Throwable th) {
                C3120o.this.mo9938a(th);
                JSONObject jSONObject = new JSONObject();
                C3168a.m11984a(jSONObject, "error_code", "1");
                C3168a.m11984a(jSONObject, "error_msg", th.toString());
                C3172e.m12002a("ttlive_upload_cover_all", 1, jSONObject);
                C3172e.m12002a("ttlive_upload_cover_error", 1, jSONObject);
            }
        });
    }

    /* renamed from: a */
    public final void mo9936a(C2375g gVar) {
        C8443c.m25663a().mo21606a("livesdk_upload_cover_success", m11832b(), new Object[0]);
        this.f9635j.mo10472b();
        C3517a.m12962a(this.f9634i, this.f9634i.getString(R.string.f0x));
        C2515f.m10417f().mo9076c().mo9169d().updateRoomInfo(this.f9632g, gVar.f7820a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19189a((C7498y<? super T>) new C7498y<C3479d<C2756f>>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNext(C3479d<C2756f> dVar) {
                C3120o.this.mo9937a(dVar);
            }

            public final void onSubscribe(C7321c cVar) {
                C3120o.this.f9630a.mo119661a(cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo8941a(C8540cb cbVar) {
        if (this.f9636k <= 0) {
            Spannable a = C4374z.m14749a(cbVar.f23497d, cbVar.f23497d.f26014b);
            Spannable a2 = C4374z.m14749a(cbVar.f23499f, cbVar.f23499f.f26014b);
            C9252i.m27529a();
            C9252i.m27528a(this.f9634i).mo22731d((CharSequence) a).mo22727c((CharSequence) a2).mo22723b(0, (CharSequence) this.f9634i.getString(R.string.ecy), this.f9637l).mo22723b(1, (CharSequence) this.f9634i.getString(R.string.epq), this.f9638m).mo22728c(false).mo22729d();
            this.f9636k++;
            C8443c.m25663a().mo21606a("livesdk_change_cover_window_show", m11832b(), new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo9938a(Throwable th) {
        String str;
        if (th instanceof FileNotFoundException) {
            str = this.f9634i.getString(R.string.f_c);
        } else if (th instanceof ApiServerException) {
            str = ((ApiServerException) th).getErrorMsg();
        } else {
            str = this.f9634i.getString(R.string.fer);
        }
        this.f9635j.mo10472b();
        C3517a.m12962a(this.f9634i, str);
    }

    /* renamed from: a */
    public final void mo9627a(String str, String str2) {
        m11831a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9935a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        HashMap b = m11832b();
        b.put("result", "live");
        C8443c.m25663a().mo21606a("livesdk_change_cover_window_click", b, new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9939b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f9635j.mo10470a();
        this.f9635j.mo10473c();
        HashMap b = m11832b();
        b.put("result", "confirm");
        C8443c.m25663a().mo21606a("livesdk_change_cover_window_click", b, new Object[0]);
    }

    public C3120o(Fragment fragment, Room room) {
        this.f9631f = room;
        this.f9634i = fragment.getContext();
        this.f9636k = 0;
        this.f9632g = this.f9631f.getId();
        this.f9633h = this.f9631f.getOwnerUserId();
        this.f9635j = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).createImagePicker(fragment.getActivity(), fragment, "cover", f9626b, f9627c, f9628d, f9629e, this);
    }

    /* renamed from: a */
    public final void mo8940a(int i, int i2, Intent intent) {
        this.f9635j.mo10471a(i, i2, intent);
    }
}

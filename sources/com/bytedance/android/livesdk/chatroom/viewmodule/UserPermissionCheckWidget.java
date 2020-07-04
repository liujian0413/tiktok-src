package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.TextUtils;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.C2379k;
import com.bytedance.android.live.base.model.user.IUser.Status;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.detail.C4329h;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;

public class UserPermissionCheckWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    private Room f16536a;

    /* renamed from: b */
    private String f16537b;

    /* renamed from: c */
    private String f16538c;

    /* renamed from: d */
    private String f16539d;

    /* renamed from: e */
    private C4329h f16540e;

    /* renamed from: f */
    private C7321c f16541f;

    public void onInit(Object[] objArr) {
    }

    public void onUnload() {
        if (this.f16541f != null && !this.f16541f.isDisposed()) {
            this.f16541f.dispose();
        }
    }

    /* renamed from: a */
    private void m17917a() {
        if (this.f16536a != null && this.f16536a.getId() > 0) {
            ((C3245ad) C4275g.m14435a(this.f16536a.getId(), this.f16536a.getRequestId(), this.f16537b, this.f16538c, this.f16539d).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10183a(C5712ez.f16806a, new C5716fa(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14031a(Throwable th) throws Exception {
        m17918b(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14030a(C2379k kVar) throws Exception {
        if (kVar != null && kVar.f7832a == Status.Login) {
            m17917a();
        }
    }

    /* renamed from: b */
    private static void m17918b(Throwable th) {
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            int errorCode = apiServerException.getErrorCode();
            String prompt = apiServerException.getPrompt();
            if (errorCode >= 30001 && errorCode <= 30006) {
                if (!TextUtils.isEmpty(prompt)) {
                    C9049ap.m27029a(prompt, 1);
                }
                C9097a.m27146a().mo22267a((Object) new C4452v(35));
                return;
            }
        }
        C8444d.m25673b();
        C8444d.m11969a(6, th.getStackTrace());
    }

    public void onLoad(Object[] objArr) {
        this.f16536a = (Room) this.dataCenter.get("data_room");
        this.f16540e = (C4329h) this.dataCenter.get("data_room_logger");
        if (this.f16540e != null) {
            this.f16537b = this.f16540e.f12611h;
            this.f16538c = this.f16540e.f12607d;
            this.f16539d = this.f16540e.f12612i;
        }
        this.f16541f = TTLiveSDKContext.getHostService().mo22367h().mo22183d().mo19163d(new C5711ey(this));
    }
}

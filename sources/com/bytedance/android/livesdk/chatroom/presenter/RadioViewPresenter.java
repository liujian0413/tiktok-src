package com.bytedance.android.livesdk.chatroom.presenter;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8542cd;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.io.File;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7494t;

public final class RadioViewPresenter extends C5017ci<C4933a> implements OnMessageListener {

    /* renamed from: a */
    private Context f14141a;

    /* renamed from: b */
    private C0053p<KVData> f14142b = new C4995bu(this);

    interface UploadCoverApi {
        @C6468s(mo15750a = "/webcast/room/upload/image_with_risk/")
        C7319aa<C3479d<Object>> upload(@C6451b TypedOutput typedOutput, @C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "user_id") long j2);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter$a */
    public interface C4933a extends C5595at {
        /* renamed from: a */
        Room mo12908a();

        /* renamed from: a */
        void mo12909a(String str);

        /* renamed from: b */
        void mo12910b();

        /* renamed from: c */
        void mo12911c();

        /* renamed from: d */
        void mo12912d();

        /* renamed from: f */
        void mo12913f();

        /* renamed from: g */
        void mo12914g();
    }

    /* renamed from: a */
    public final void mo8963a() {
        this.f14275g.removeObserver(this.f14142b);
        super.mo8963a();
    }

    /* renamed from: b */
    public final void mo12904b() throws Exception {
        ((C3245ad) ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).removeRoomBackgroundImg(((C4933a) mo9140c()).mo12908a().getId(), ((C4933a) mo9140c()).mo12908a().getOwner().getId()).mo19297a((C7494t<T, ? extends R>) mo13033u())).mo10183a(C4996bv.f14224a, new C4997bw(this));
    }

    /* renamed from: d */
    public final void mo12906d() {
        if (TextUtils.isEmpty(((C4933a) mo9140c()).mo12908a().getOwner().getBackgroundImgUrl())) {
            ((C4933a) mo9140c()).mo12910b();
        } else {
            ((C4933a) mo9140c()).mo12911c();
        }
        C8443c.m25663a().mo21607a("background_pic_select", new C8438j().mo21598a("live_take_detail").mo21599b("live_take"), Room.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12901a(KVData kVData) {
        mo12906d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12905b(Throwable th) throws Exception {
        C9076n.m27095a(this.f14141a, th);
    }

    public RadioViewPresenter(Context context) {
        this.f14141a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12899a(C3479d dVar) throws Exception {
        if (mo9140c() != null) {
            if (dVar.statusCode == 0) {
                ((C4933a) mo9140c()).mo12912d();
                return;
            }
            ((C4933a) mo9140c()).mo12913f();
        }
    }

    /* renamed from: a */
    public final void mo9142a(C4933a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.ROOM_IMG_MESSAGE.getIntType(), this);
        }
        this.f14275g.observeForever("cmd_change_radio_cover", this.f14142b);
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C8542cd) {
            C8542cd cdVar = (C8542cd) iMessage;
            switch ((int) cdVar.f23513a) {
                case 1:
                    ((C4933a) mo9140c()).mo12909a(cdVar.f23514b);
                    return;
                case 2:
                    ((C4933a) mo9140c()).mo12914g();
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo12902a(String str) {
        long j;
        File file = new File(str);
        if (file.exists()) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("file", new TypedFile("image/jpeg", file));
            long longValue = ((Long) this.f14275g.get("data_room_id")).longValue();
            User user = (User) this.f14275g.get("data_user_in_room");
            UploadCoverApi uploadCoverApi = (UploadCoverApi) C9178j.m27302j().mo22373b().mo10440a(UploadCoverApi.class);
            if (user != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            ((C3247af) uploadCoverApi.upload(multipartTypedOutput, longValue, j).mo19131a((C47555ab<T, ? extends R>) mo13033u())).mo10187a(new C4998bx(this), new C4999by(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12903a(Throwable th) throws Exception {
        if (mo9140c() != null) {
            ((C4933a) mo9140c()).mo12913f();
        }
    }
}

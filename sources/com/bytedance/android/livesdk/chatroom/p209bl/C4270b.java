package com.bytedance.android.livesdk.chatroom.p209bl;

import android.util.Base64;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.gift.effect.p376b.C7964b;
import com.bytedance.android.livesdk.message.model.C8543ce;
import com.bytedance.android.livesdk.message.model.C8545cg;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.message.model.C8550cl;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.message.model.C8688t;
import com.bytedance.android.livesdkapi.message.C9500b;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2267d;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.b */
public final class C4270b {
    /* renamed from: a */
    public static C8548cj m14423a(Barrage barrage) {
        try {
            C2265b protoDecoder = ((INetworkService) C3596c.m13172a(INetworkService.class)).getProtoDecoder(C8548cj.class);
            if (protoDecoder == null) {
                return null;
            }
            return (C8548cj) protoDecoder.decode(new C2272g().mo8057a(C2267d.m9756a(Base64.decode(barrage.getScreenChatMsg(), 0))));
        } catch (Exception e) {
            C3166a.m11966e("ttlive_msg", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m14427a(User user, long j) {
        if (user.getId() == j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C8543ce m14421a(long j, String str) {
        C8543ce ceVar = new C8543ce();
        C9500b bVar = new C9500b();
        bVar.f25993c = j;
        bVar.f25997g = true;
        ceVar.baseMessage = bVar;
        ceVar.f23516a = str;
        return ceVar;
    }

    /* renamed from: a */
    public static C8688t m14426a(long j, boolean z) {
        C8688t tVar = new C8688t();
        C9500b bVar = new C9500b();
        bVar.f25993c = j;
        bVar.f25994d = -1;
        bVar.f25997g = true;
        tVar.baseMessage = bVar;
        tVar.f23670a = 1;
        return tVar;
    }

    /* renamed from: a */
    public static C8550cl m14424a(long j, C9505f fVar, User user) {
        if (fVar == null) {
            return null;
        }
        C9500b bVar = new C9500b();
        bVar.f25993c = j;
        bVar.f25997g = true;
        bVar.f26000j = fVar;
        C8550cl clVar = new C8550cl();
        clVar.baseMessage = bVar;
        clVar.f23552b = user;
        return clVar;
    }

    /* renamed from: a */
    public static C8680m m14425a(long j, ChatResult chatResult, User user) {
        User user2;
        C8680m mVar = new C8680m();
        mVar.f23624a = chatResult.getMsgId();
        C9500b bVar = new C9500b();
        bVar.f25993c = j;
        bVar.f25994d = chatResult.getMsgId();
        bVar.f25997g = true;
        bVar.f26000j = chatResult.getDisplayText();
        mVar.baseMessage = bVar;
        C9505f displayText = chatResult.getDisplayText();
        if (displayText != null && !C6307b.m19566a((Collection<T>) displayText.f26016d)) {
            Iterator it = displayText.f26016d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9507h hVar = (C9507h) it.next();
                if (hVar.f26023d != null && hVar.f26023d.f26032a != null && m14427a(hVar.f26023d.f26032a, TTLiveSDKContext.getHostService().mo22367h().mo22179b())) {
                    user2 = hVar.f26023d.f26032a;
                    break;
                }
            }
        }
        user2 = null;
        mVar.f23628e = chatResult.getBackground();
        mVar.f23625b = chatResult.getContent();
        mVar.f23629f = chatResult.getFullScreenTextColor();
        if (user2 != null) {
            mVar.f23626c = user2;
        } else if (user != null) {
            mVar.f23626c = user;
        } else {
            mVar.f23626c = User.from(TTLiveSDKContext.getHostService().mo22367h().mo22165a());
        }
        return mVar;
    }

    /* renamed from: a */
    public static C7964b m14420a(int i, boolean z, int i2, boolean z2) {
        long j = (long) i;
        String assetsPath = ((IGiftService) C3596c.m13172a(IGiftService.class)).getAssetsPath("effects", j);
        if (C6319n.m19593a(assetsPath)) {
            return null;
        }
        return (C7964b) new C7964b().mo20842d(false).mo20841d((long) i2).mo20826a(System.currentTimeMillis()).mo20833b(j).mo20830a(assetsPath).mo20831a(true);
    }

    /* renamed from: a */
    public static C8545cg m14422a(long j, ImageModel imageModel, String str, int i, String str2, String str3, String str4, String str5) {
        C8545cg cgVar = new C8545cg();
        C9500b bVar = new C9500b();
        bVar.f25993c = j;
        cgVar.baseMessage = bVar;
        cgVar.f23526d = null;
        cgVar.f23525c = str;
        cgVar.f23529g = (long) i;
        cgVar.f23523a = str2;
        cgVar.f23524b = str3;
        cgVar.f23528f = str4;
        cgVar.f23527e = str5;
        return cgVar;
    }
}

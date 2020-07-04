package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.interact.model.C4818c;
import com.bytedance.android.livesdkapi.depend.model.live._BattleScorePair_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.ey */
public final class C8621ey implements C2265b<C8508bd> {
    /* renamed from: b */
    private static C8508bd m25895b(C2272g gVar) throws Exception {
        return m25894a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25895b(gVar);
    }

    /* renamed from: a */
    private static C8508bd m25894a(C2272g gVar) throws Exception {
        C8508bd bdVar = new C8508bd();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bdVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bdVar.f23319a = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        bdVar.f23322d = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        bdVar.f23323e = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        bdVar.f23324f = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        bdVar.f23325g = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        bdVar.f23326h = C2273h.m9785c(gVar);
                        break;
                    case 8:
                        bdVar.f23327i = C2273h.m9785c(gVar);
                        break;
                    case 9:
                        bdVar.f23328j = (int) C2273h.m9785c(gVar);
                        break;
                    case 10:
                        bdVar.f23329k = (int) C2273h.m9785c(gVar);
                        break;
                    case 11:
                        bdVar.f23330l = (int) C2273h.m9785c(gVar);
                        break;
                    case 12:
                        bdVar.f23331m = C2273h.m9787e(gVar);
                        break;
                    case 13:
                        bdVar.f23332n = C2273h.m9785c(gVar);
                        break;
                    case 14:
                        bdVar.f23333o = (int) C2273h.m9785c(gVar);
                        break;
                    case 16:
                        bdVar.f23335q = (int) C2273h.m9785c(gVar);
                        break;
                    case 17:
                        if (bdVar.f23336r == null) {
                            bdVar.f23336r = new ArrayList();
                        }
                        bdVar.f23336r.add(_BattleScorePair_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 18:
                        bdVar.f23337s = (int) C2273h.m9785c(gVar);
                        break;
                    case 19:
                        bdVar.f23338t = C2273h.m9783a(gVar);
                        break;
                    case 20:
                        bdVar.f23339u = C2273h.m9787e(gVar);
                        break;
                    case 21:
                        bdVar.f23340v = C2273h.m9785c(gVar);
                        break;
                    case 25:
                        bdVar.f23342x = C2273h.m9787e(gVar);
                        break;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        bdVar.f23334p = C2273h.m9785c(gVar);
                        break;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        bdVar.f23317A = C2273h.m9784b(gVar);
                        break;
                    case 28:
                        bdVar.f23341w = C2273h.m9785c(gVar);
                        break;
                    case 29:
                        bdVar.f23343y = (int) C2273h.m9785c(gVar);
                        break;
                    case 30:
                        bdVar.f23344z = C2273h.m9785c(gVar);
                        break;
                    case 31:
                        bdVar.f23318B = C4818c.m15845a(gVar);
                        break;
                    case BaseNotice.CHALLENGE /*34*/:
                        bdVar.f23320b = C2273h.m9787e(gVar);
                        break;
                    case 35:
                        bdVar.f23321c = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bdVar;
            }
        }
    }
}

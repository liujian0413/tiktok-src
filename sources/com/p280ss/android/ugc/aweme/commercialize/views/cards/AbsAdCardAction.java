package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24952c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction */
public abstract class AbsAdCardAction extends AbsHalfWebPageAction {

    /* renamed from: a */
    protected int f67263a;

    /* renamed from: h */
    private int f67264h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a */
    public static class C25539a {

        /* renamed from: a */
        int f67265a;

        public C25539a(int i) {
            this.f67265a = i;
        }
    }

    /* renamed from: a */
    public void mo66281a(C25548b bVar) {
    }

    /* renamed from: c */
    public final boolean mo66282c() {
        if (this.f67264h == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
    }

    /* access modifiers changed from: 0000 */
    public void onCreate() {
        super.onCreate();
        C42961az.m136382c(this);
        if (m83935a(C25352e.m83240w(this.f67267c))) {
            this.f67263a = R.drawable.aoa;
        }
        this.f67268d.mo66299a(this.f67263a);
    }

    /* renamed from: a */
    private static boolean m83935a(CardStruct cardStruct) {
        boolean z;
        if (cardStruct == null) {
            return false;
        }
        if (C6399b.m19944t() || 2 != cardStruct.getCardStyle()) {
            z = false;
        } else {
            z = true;
        }
        if ((z || C6399b.m19944t()) && 4 != cardStruct.getCardType()) {
            return true;
        }
        return false;
    }

    @C7709l
    public void onEvent(C25548b bVar) {
        if (this.f67268d.mo66306e().hashCode() == bVar.f67302d) {
            this.f67264h = bVar.f67299a;
            StringBuilder sb = new StringBuilder("render success: ");
            sb.append(mo66282c());
            mo66291c(sb.toString());
            mo66281a(bVar);
            if (bVar.f67301c == 1) {
                if (mo66282c()) {
                    C24952c.m81881a(this.f67267c, 0);
                    return;
                }
                C24952c.m81881a(this.f67267c, 1);
            }
        }
    }

    public AbsAdCardAction(Context context, Aweme aweme, C25568n nVar) {
        super(context, aweme, nVar);
    }
}

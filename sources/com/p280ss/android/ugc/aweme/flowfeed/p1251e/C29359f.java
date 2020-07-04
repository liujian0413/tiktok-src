package com.p280ss.android.ugc.aweme.flowfeed.p1251e;

import android.support.p022v4.util.C0902i;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.p938b.C21116a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.C29400c;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21751b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.e.f */
public final class C29359f extends C21116a<C28471v, C29400c> implements C21743a {

    /* renamed from: a */
    public String f77385a;

    /* renamed from: d */
    protected String f77386d;

    /* renamed from: e */
    protected Aweme f77387e;

    /* renamed from: f */
    private int f77388f;

    /* renamed from: g */
    private Map<String, Aweme> f77389g;

    /* renamed from: f */
    public final void mo75086f() {
        C42961az.m136382c(this);
    }

    /* renamed from: g */
    public final void mo75087g() {
        C42961az.m136383d(this);
    }

    /* renamed from: e */
    public final int mo75085e() {
        if (this.f67571b == null) {
            return 0;
        }
        return ((C28471v) this.f67571b).f75069a;
    }

    /* renamed from: b */
    public final void mo56977b() {
        C0902i iVar;
        if (this.f67572c != null && ((C29400c) this.f67572c).isViewValid()) {
            if (this.f67571b == null) {
                iVar = null;
            } else {
                iVar = (C0902i) ((C28471v) this.f67571b).getData();
            }
            if (iVar != null) {
                if (this.f77389g.containsKey(iVar.f3154a)) {
                    Aweme aweme = (Aweme) this.f77389g.get(iVar.f3154a);
                    if (!(aweme == null || aweme.getForwardItem() == null)) {
                        m96407a(aweme.getForwardItem().getAid(), ((Integer) iVar.f3155b).intValue());
                        this.f77389g.remove(iVar.f3154a);
                    }
                }
                m96407a((String) iVar.f3154a, ((Integer) iVar.f3155b).intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo66537a(C29400c cVar) {
        super.mo66537a(cVar);
        cVar.mo75143a(this);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null && ((C29400c) this.f67572c).isViewValid()) {
            ((C29400c) this.f67572c).mo75144a(exc, this.f77387e);
        }
    }

    @C7709l
    public final void onFollowFeedDetailEvent(C21751b bVar) {
        if (this.f67572c != null && ((C29400c) this.f67572c).isViewValid() && bVar.f58259a == 0) {
            ((C29400c) this.f67572c).mo75138a(bVar.f58260b);
        }
    }

    public C29359f(String str, int i) {
        this(str, null, i);
    }

    /* renamed from: a */
    private void m96407a(String str, int i) {
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateUserDigg(str, i);
        C28318an anVar = new C28318an(13, str);
        anVar.f74634d = this.f77385a;
        anVar.f74635e = this.f77385a;
        C42961az.m136380a(anVar);
    }

    public C29359f(String str, String str2, int i) {
        this.f77385a = str;
        this.f77386d = str2;
        this.f77388f = i;
        this.f77389g = new HashMap();
    }

    /* renamed from: a */
    public final void mo58070a(Aweme aweme, int i, String str, long j) {
        if (this.f67572c != null && ((C29400c) this.f67572c).isViewValid()) {
            if (!C6900g.m21454b().mo16943d()) {
                if (((C29400c) this.f67572c).getContext() != null) {
                    C10761a.m31399c(((C29400c) this.f67572c).getContext(), (int) R.string.cjs).mo25750a();
                }
                return;
            }
            this.f77387e = aweme;
            JSONObject requestIdAndOrderJsonObject = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(this.f77387e, this.f77388f);
            if (i == 1) {
                C6903bc.m21486e().mo75363a(this.f77387e, this.f77385a, this.f77386d, this.f77388f, str, j);
            } else {
                C6907h.m21519a(C6399b.m19921a(), "like_cancel", this.f77385a, this.f77387e.getAid(), 0, requestIdAndOrderJsonObject);
                C6903bc.m21486e().mo75361a(this.f77387e, this.f77385a, this.f77388f);
            }
            mo56976a(this.f77387e.getAid(), Integer.valueOf(i), this.f77385a);
        }
    }

    /* renamed from: b */
    public final void mo58071b(Aweme aweme, int i, String str, long j) {
        if (this.f67572c != null && ((C29400c) this.f67572c).isViewValid()) {
            if (!C6900g.m21454b().mo16943d()) {
                if (((C29400c) this.f67572c).getContext() != null) {
                    C10761a.m31399c(((C29400c) this.f67572c).getContext(), (int) R.string.cjs).mo25750a();
                }
            } else if (aweme.getForwardItem() != null) {
                this.f77387e = aweme;
                C6903bc.m21486e().mo75363a(this.f77387e, this.f77385a, this.f77386d, this.f77388f, str, j);
                mo56976a(this.f77387e.getAid(), this.f77387e.getForwardItem().getAid(), Integer.valueOf(1), this.f77385a);
                this.f77389g.put(this.f77387e.getAid(), this.f77387e);
            }
        }
    }
}

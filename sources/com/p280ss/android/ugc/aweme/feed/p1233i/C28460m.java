package com.p280ss.android.ugc.aweme.feed.p1233i;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.i.m */
public class C28460m extends C28463p {

    /* renamed from: d */
    private Aweme f75055d;

    /* renamed from: e */
    private int f75056e;

    /* renamed from: f */
    private int f75057f;

    /* renamed from: g */
    private Context f75058g;

    /* renamed from: b */
    public final void mo56977b() {
        int i;
        super.mo56977b();
        if (this.f75055d != null) {
            this.f75055d.getStatus().setPrivateStatus(this.f75056e);
            int i2 = 0;
            switch (this.f75056e) {
                case 0:
                    i = 0;
                    i2 = R.string.d9g;
                    break;
                case 1:
                    i2 = R.string.d5e;
                    i = 1;
                    break;
                case 2:
                    i2 = R.string.dmv;
                    i = 11;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i2 != 0) {
                C10761a.m31383a(this.f75058g, i2).mo25750a();
            }
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(this.f75055d);
            C42961az.m136380a(new C28308ad((PrivateUrlModel) this.f67571b.getData(), this.f75055d, i, this.f75057f));
        }
    }

    public C28460m(Context context) {
        this.f75058g = context;
    }

    /* renamed from: a */
    public void mo57296a(Exception exc) {
        Throwable a = C22814a.m75241a((Throwable) exc);
        if (a instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) a;
            if (!TextUtils.isEmpty(apiServerException.getErrorMsg())) {
                C10761a.m31403c(this.f75058g, apiServerException.getErrorMsg()).mo25750a();
                return;
            }
        }
        super.mo57296a(exc);
    }

    /* renamed from: a */
    public final void mo72198a(Aweme aweme, int i) {
        this.f75055d = aweme;
        this.f75057f = this.f75055d.getStatus().getPrivateStatus();
        this.f75056e = i;
    }
}

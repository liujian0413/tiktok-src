package com.p280ss.android.ugc.aweme.favorites.p1212c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35670h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.a */
public final class C27743a extends C25652b<C25640a<BaseResponse>, C27746c> {

    /* renamed from: a */
    public int f73178a;

    /* renamed from: d */
    public int f73179d;

    /* renamed from: e */
    public String f73180e = "";

    public C27743a() {
        mo66536a(new C25640a<BaseResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Void mo71226a(C1592h hVar) throws Exception {
                if (hVar.mo6889d() || hVar.mo6887c()) {
                    C27743a.this.mo57296a(hVar.mo6891f());
                } else {
                    C27743a.this.mo56977b();
                }
                return null;
            }

            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean sendRequest(java.lang.Object... r6) {
                /*
                    r5 = this;
                    com.ss.android.ugc.aweme.favorites.c.a r0 = com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.this
                    r1 = 0
                    r2 = r6[r1]
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    int r2 = r2.intValue()
                    r0.f73179d = r2
                    r0 = 1
                    r2 = r6[r0]
                    java.lang.String r2 = (java.lang.String) r2
                    com.ss.android.ugc.aweme.favorites.c.a r3 = com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.this
                    r4 = 2
                    r4 = r6[r4]
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r4 = r4.intValue()
                    r3.f73178a = r4
                    com.ss.android.ugc.aweme.favorites.c.a r3 = com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.this
                    int r3 = r3.f73179d
                    switch(r3) {
                        case 1: goto L_0x0067;
                        case 2: goto L_0x005c;
                        case 3: goto L_0x0051;
                        case 4: goto L_0x0046;
                        case 5: goto L_0x003b;
                        case 6: goto L_0x0027;
                        default: goto L_0x0026;
                    }
                L_0x0026:
                    goto L_0x0072
                L_0x0027:
                    int r3 = r6.length
                    r4 = 4
                    if (r3 < r4) goto L_0x0072
                    r3 = 3
                    r6 = r6[r3]
                    java.lang.String r6 = (java.lang.String) r6
                    com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi$RetrofitApi r3 = com.p280ss.android.ugc.aweme.favorites.api.UserFavoritesApi.f73170a
                    com.ss.android.ugc.aweme.favorites.c.a r4 = com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.this
                    int r4 = r4.f73178a
                    bolts.h r6 = r3.collectSeeding(r2, r4, r6)
                    goto L_0x0073
                L_0x003b:
                    com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi$RetrofitApi r6 = com.p280ss.android.ugc.aweme.favorites.api.UserFavoritesApi.f73170a
                    com.ss.android.ugc.aweme.favorites.c.a r3 = com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.this
                    int r3 = r3.f73178a
                    bolts.h r6 = r6.collectMix(r2, r3)
                    goto L_0x0073
                L_0x0046:
                    com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi$RetrofitApi r6 = com.p280ss.android.ugc.aweme.favorites.api.UserFavoritesApi.f73170a
                    com.ss.android.ugc.aweme.favorites.c.a r3 = com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.this
                    int r3 = r3.f73178a
                    bolts.h r6 = r6.collectPoi(r2, r3)
                    goto L_0x0073
                L_0x0051:
                    com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi$RetrofitApi r6 = com.p280ss.android.ugc.aweme.favorites.api.UserFavoritesApi.f73170a
                    com.ss.android.ugc.aweme.favorites.c.a r3 = com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.this
                    int r3 = r3.f73178a
                    bolts.h r6 = r6.collectChallenge(r2, r3)
                    goto L_0x0073
                L_0x005c:
                    com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi$RetrofitApi r6 = com.p280ss.android.ugc.aweme.favorites.api.UserFavoritesApi.f73170a
                    com.ss.android.ugc.aweme.favorites.c.a r3 = com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.this
                    int r3 = r3.f73178a
                    bolts.h r6 = r6.collectAweme(r2, r3)
                    goto L_0x0073
                L_0x0067:
                    com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi$RetrofitApi r6 = com.p280ss.android.ugc.aweme.favorites.api.UserFavoritesApi.f73170a
                    com.ss.android.ugc.aweme.favorites.c.a r3 = com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.this
                    int r3 = r3.f73178a
                    bolts.h r6 = r6.collectMusic(r2, r3)
                    goto L_0x0073
                L_0x0072:
                    r6 = 0
                L_0x0073:
                    if (r6 == 0) goto L_0x0080
                    com.ss.android.ugc.aweme.favorites.c.b r1 = new com.ss.android.ugc.aweme.favorites.c.b
                    r1.<init>(r5)
                    java.util.concurrent.Executor r2 = bolts.C1592h.f5958b
                    r6.mo6876a(r1, r2)
                    return r0
                L_0x0080:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a.C277441.sendRequest(java.lang.Object[]):boolean");
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        BaseResponse baseResponse;
        int i;
        C42961az.m136380a(new C35670h());
        int i2 = this.f73179d;
        int i3 = R.string.ir;
        if (i2 == 4) {
            if (this.f73178a == 0) {
                if (C6399b.m19944t()) {
                    C10761a.m31383a((Context) C6405d.m19984g(), (int) R.string.ir).mo25750a();
                } else {
                    C10761a.m31383a((Context) C6405d.m19984g(), (int) R.string.wf).mo25750a();
                }
            }
        } else if (this.f73179d == 6) {
            if (this.f73178a == 2) {
                if (C6399b.m19944t()) {
                    C10761a.m31383a((Context) C6405d.m19984g(), (int) R.string.ir).mo25750a();
                } else {
                    C10761a.m31383a((Context) C6405d.m19984g(), (int) R.string.wf).mo25750a();
                }
            }
        } else if ((this.f73179d == 1 && !TextUtils.equals(this.f73180e, "single_song") && !TextUtils.equals(this.f73180e, "similar_song")) || !C6399b.m19944t() || this.f73179d == 2) {
            if (C6399b.m19944t()) {
                Activity g = C6405d.m19984g();
                if (this.f73178a == 1) {
                    i3 = R.string.is;
                }
                C10761a.m31383a((Context) g, i3).mo25750a();
            } else {
                if (!(this.f73179d == 3 || this.f73179d == 5 || (this.f73179d == 1 && TextUtils.equals(this.f73180e, "single_song")))) {
                    Activity g2 = C6405d.m19984g();
                    if (this.f73178a == 1) {
                        i = R.string.a63;
                    } else {
                        i = R.string.wf;
                    }
                    C10761a.m31383a((Context) g2, i).mo25750a();
                }
                if (this.f73178a == 0) {
                    C10761a.m31383a((Context) C6405d.m19984g(), (int) R.string.wf).mo25750a();
                }
            }
        }
        if (this.f67572c != null) {
            if (this.f67571b == null) {
                baseResponse = null;
            } else {
                baseResponse = (BaseResponse) this.f67571b.getData();
            }
            ((C27746c) this.f67572c).mo61803a(baseResponse);
        }
        if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && this.f73178a == 1) {
            Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        int i = this.f73179d;
        int i2 = R.string.we;
        if (i == 5) {
            ApiServerException apiServerException = (ApiServerException) exc;
            if (apiServerException.getErrorCode() == 4) {
                C10761a.m31403c((Context) C6405d.m19984g(), apiServerException.getErrorMsg()).mo25750a();
            } else {
                Activity g = C6405d.m19984g();
                if (this.f73178a == 1) {
                    i2 = R.string.a5x;
                }
                C10761a.m31399c((Context) g, i2).mo25750a();
            }
        } else {
            Activity g2 = C6405d.m19984g();
            if (this.f73178a == 1) {
                i2 = R.string.a5x;
            }
            C10761a.m31399c((Context) g2, i2).mo25750a();
        }
        if (this.f67572c != null) {
            ((C27746c) this.f67572c).mo61805a(exc);
        }
    }
}

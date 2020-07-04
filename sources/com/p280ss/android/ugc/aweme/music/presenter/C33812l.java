package com.p280ss.android.ugc.aweme.music.presenter;

import android.content.Context;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.l */
public final class C33812l extends C25652b<C25640a<BaseResponse>, C33801c> {

    /* renamed from: a */
    public int f88190a;

    /* renamed from: d */
    public int f88191d;

    /* renamed from: e */
    private Context f88192e;

    /* renamed from: b */
    public final void mo56977b() {
        int e = C33703a.m108721e();
        int i = this.f88191d;
        int i2 = R.string.in;
        int i3 = R.string.wf;
        if (i == 4) {
            if (this.f88190a == 0 && this.f88192e != null) {
                Context context = this.f88192e;
                if (e != 2) {
                    i2 = R.string.wf;
                }
                C10761a.m31383a(context, i2).mo25750a();
            }
        } else if ((this.f88191d == 1 || !C6399b.m19944t() || this.f88191d == 2) && this.f88192e != null) {
            if (e != 2) {
                Context context2 = this.f88192e;
                if (this.f88190a == 1) {
                    i3 = R.string.a63;
                }
                C10761a.m31383a(context2, i3).mo25750a();
            } else {
                Context context3 = this.f88192e;
                if (this.f88190a == 1) {
                    i2 = R.string.io;
                }
                C10761a.m31383a(context3, i2).mo25750a();
            }
        }
        if (!(this.f67572c == null || this.f67571b == null)) {
            this.f67571b.getData();
        }
        if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && this.f88190a == 1) {
            Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
        }
    }

    public C33812l(Context context) {
        this.f88192e = context;
        mo66536a(new C25640a<BaseResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                C1592h hVar;
                C33812l.this.f88191d = objArr[0].intValue();
                String str = objArr[1];
                C33812l.this.f88190a = objArr[2].intValue();
                if (C33812l.this.f88191d != 1) {
                    hVar = null;
                } else {
                    hVar = ChooseMusicApi.m78099a().collectMusic(str, C33812l.this.f88190a);
                }
                if (hVar == null) {
                    return false;
                }
                hVar.mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<BaseResponse, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C1592h<BaseResponse> hVar) {
                        if (hVar.mo6889d() || hVar.mo6887c()) {
                            C33812l.this.mo57296a(hVar.mo6891f());
                        } else {
                            C33812l.this.mo56977b();
                        }
                        return null;
                    }
                }, C1592h.f5958b);
                return true;
            }
        });
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        int i;
        int i2;
        if (this.f88192e != null) {
            if (C33703a.m108721e() != 2) {
                Context context = this.f88192e;
                if (this.f88190a == 1) {
                    i2 = R.string.a5x;
                } else {
                    i2 = R.string.we;
                }
                C10761a.m31399c(context, i2).mo25750a();
            } else {
                Context context2 = this.f88192e;
                if (this.f88190a == 1) {
                    i = R.string.it;
                } else {
                    i = R.string.im;
                }
                C10761a.m31399c(context2, i).mo25750a();
            }
        }
        if (this.f67572c != null) {
            ((C33801c) this.f67572c).mo62047a(exc);
        }
    }
}

package com.p280ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.p280ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23847e;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y.C34026a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget */
public class ChallengeMusicWidget extends ListItemWidget<ChallengeMusicView> implements C0053p<C23083a> {

    /* renamed from: i */
    Challenge f63456i;

    /* renamed from: j */
    int f63457j;

    /* renamed from: k */
    C33746f<C23822c> f63458k;

    /* renamed from: l */
    C23847e f63459l;

    /* renamed from: m */
    private C23844b f63460m;

    /* renamed from: n */
    private int f63461n = -1;

    /* renamed from: o */
    private int f63462o;

    /* renamed from: p */
    private int f63463p;

    /* renamed from: q */
    private C23819a f63464q;

    /* renamed from: f */
    private void m78764f() {
        this.f63460m.mo61921a((MusicModel) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo62261d() {
        this.f60922e.mo60134a("music_loading", (Object) Boolean.valueOf(false));
    }

    /* renamed from: e */
    private void m78763e() {
        if (this.f63456i == null) {
            ((ChallengeMusicView) this.f60902a).itemView.setVisibility(8);
            return;
        }
        ((ChallengeMusicView) this.f60902a).itemView.setVisibility(0);
        ((ChallengeMusicView) this.f60902a).mo62118a(this.f63456i, C23889d.m78220b(this.f63456i.getConnectMusics()), ((Integer) this.f60922e.mo60136b("music_position", Integer.valueOf(-1))).intValue(), this.f63461n, (String) this.f60922e.mo60136b("challenge_id", null), new C24012a(this), this.f63458k);
    }

    public void onCreate() {
        this.f60922e.mo60132a("data_challenge", (C0053p<C23083a>) this).mo60132a("music_index", (C0053p<C23083a>) this).mo60132a("music_collect_status", (C0053p<C23083a>) this).mo60132a("music_loading", (C0053p<C23083a>) this);
        this.f63462o = ((Integer) this.f60922e.mo60135a("key_choose_music_type")).intValue();
        super.onCreate();
        this.f63464q = new C23819a("change_music_page", "attached_song", "", C23888c.m78180a());
        this.f63464q.f62876g = (String) this.f60922e.mo60136b("challenge_id", null);
    }

    /* renamed from: a */
    public final ChallengeMusicWidget mo62257a(C23844b bVar) {
        this.f63460m = bVar;
        return this;
    }

    /* renamed from: a */
    public final ChallengeMusicWidget mo62258a(C23847e eVar) {
        this.f63459l = eVar;
        return this;
    }

    /* renamed from: a */
    private void m78762a(C23820a aVar) {
        if (this.f60902a != null) {
            ((ChallengeMusicView) this.f60902a).mo62117a(aVar);
        }
    }

    /* renamed from: a */
    public final ChallengeMusicWidget mo62256a(int i) {
        this.f63457j = -2;
        this.f63463p = this.f63457j + 10086;
        return this;
    }

    /* renamed from: a */
    public final ChallengeMusicWidget mo62259a(C33746f<C23822c> fVar) {
        this.f63458k = fVar;
        return this;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f60948a
            int r1 = r0.hashCode()
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            r3 = 1
            r4 = -1
            if (r1 == r2) goto L_0x003b
            r2 = 502104354(0x1ded8122, float:6.2866898E-21)
            if (r1 == r2) goto L_0x0031
            r2 = 1579846200(0x5e2a8a38, float:3.07217403E18)
            if (r1 == r2) goto L_0x0027
            r2 = 2085247502(0x7c4a5a0e, float:4.202682E36)
            if (r1 == r2) goto L_0x001d
            goto L_0x0045
        L_0x001d:
            java.lang.String r1 = "data_challenge"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 0
            goto L_0x0046
        L_0x0027:
            java.lang.String r1 = "music_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 2
            goto L_0x0046
        L_0x0031:
            java.lang.String r1 = "music_loading"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 3
            goto L_0x0046
        L_0x003b:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = -1
        L_0x0046:
            switch(r0) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00b0;
                case 2: goto L_0x0088;
                case 3: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x00d4
        L_0x004b:
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r6 = r5.f60902a
            if (r6 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r6 = r5.f60922e
            java.lang.String r0 = "music_position"
            java.lang.Object r6 = r6.mo60135a(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            int r4 = r6.intValue()
        L_0x0060:
            int r6 = r5.f63457j
            if (r6 != r4) goto L_0x00d4
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r6 = r5.f60902a
            com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView r6 = (com.p280ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView) r6
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r5.f60922e
            java.lang.String r1 = "music_index"
            java.lang.Object r0 = r0.mo60135a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r5.f60922e
            java.lang.String r2 = "music_loading"
            java.lang.Object r1 = r1.mo60135a(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r6.mo62116a(r0, r1)
            goto L_0x00d4
        L_0x0088:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r6 = r5.f60922e
            java.lang.String r0 = "music_position"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r6.mo60136b(r0, r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r5.f60922e
            java.lang.String r1 = "music_index"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.m78760a(r6, r0)
            return
        L_0x00b0:
            java.lang.Object r6 = r6.mo60161a()
            com.ss.android.ugc.aweme.choosemusic.a.a r6 = (com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a) r6
            int r0 = r6.f62878a
            if (r0 != r3) goto L_0x00c0
            int r0 = r5.f63457j
            int r1 = r6.f62879b
            if (r0 == r1) goto L_0x00c4
        L_0x00c0:
            int r0 = r6.f62878a
            if (r0 != 0) goto L_0x00d4
        L_0x00c4:
            r5.m78762a(r6)
            return
        L_0x00c8:
            java.lang.Object r6 = r6.mo60161a()
            com.ss.android.ugc.aweme.discover.model.Challenge r6 = (com.p280ss.android.ugc.aweme.discover.model.Challenge) r6
            r5.f63456i = r6
            r5.m78763e()
            return
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* renamed from: a */
    public final void mo60128a(ItemWidgetViewHolder itemWidgetViewHolder) {
        super.mo60128a(itemWidgetViewHolder);
        this.f63456i = (Challenge) this.f60922e.mo60135a("data_challenge");
        m78763e();
    }

    /* renamed from: a */
    private void m78760a(int i, int i2) {
        int i3;
        if (this.f60924g) {
            ChallengeMusicView challengeMusicView = (ChallengeMusicView) this.f60902a;
            int i4 = this.f63461n;
            if (i == -2) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            challengeMusicView.mo62115a(i4, i3);
            if (i != -2) {
                this.f63461n = -1;
            } else if (this.f63461n == i2) {
                this.f63460m.mo61921a((MusicModel) null);
            } else {
                this.f63461n = i2;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62260a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
        String str;
        int id = view.getId();
        Bundle bundle = null;
        if (id == R.id.bae) {
            Activity g = C6405d.m19984g();
            if (g == null) {
                str = "";
            } else {
                str = g.getString(R.string.b4m);
            }
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                Activity g2 = C6405d.m19984g();
                String a = C23889d.m78217a(i);
                String str2 = "click_favorite_music";
                if (!C30538p.m99745a() && !TextUtils.isEmpty(str)) {
                    bundle = C42914ab.m136242a().mo104633a("login_title", str).f111445a;
                }
                C32656f.m105743a(g2, a, str2, bundle);
                return;
            }
            musicItemViewHolder.mo62218e();
            C23888c.m78194a(musicItemViewHolder.f63380a, musicModel.getMusicId(), this.f63464q, musicItemViewHolder.f63383d, musicModel.getLogPb());
            return;
        }
        if (id == R.id.bag) {
            if (musicModel != null && musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.chd);
                }
                C10761a.m31410e(view.getContext(), offlineDesc).mo25750a();
            } else if (musicModel != null && C33784d.m108931a(musicModel, view.getContext(), true)) {
                C7195s a2 = C7195s.m22438a();
                StringBuilder sb = new StringBuilder("aweme://music/detail/");
                sb.append(musicModel.getMusicId());
                a2.mo18682a(sb.toString());
                C23819a aVar = new C23819a("change_music_page", "attached_song", "click_button", C23888c.m78180a());
                aVar.f62876g = (String) this.f60922e.mo60136b("challenge_id", null);
                C23888c.m78186a(aVar, musicModel.getMusicId(), false);
            }
        } else if (id == R.id.bs2) {
            if (this.f63461n == musicItemViewHolder.f63383d && ((Integer) this.f60922e.mo60136b("music_position", Integer.valueOf(-1))).intValue() == -2) {
                this.f60922e.mo60134a("music_position", (Object) Integer.valueOf(-1));
                this.f60922e.mo60134a("music_index", (Object) Integer.valueOf(-1));
                musicItemViewHolder.mo62214a(false, false);
                m78764f();
                return;
            }
            if (this.f63460m != null) {
                m78764f();
                C23888c.m78181a(musicItemViewHolder.f63383d);
                C23819a aVar2 = new C23819a("change_music_page", "attached_song", "", C23888c.m78180a());
                aVar2.f62876g = (String) this.f60922e.mo60136b("challenge_id", null);
                this.f63460m.mo61922a(musicModel, aVar2);
                this.f63460m.mo61920a((C34026a) new C24013b(this));
            }
            this.f60922e.mo60134a("music_position", (Object) Integer.valueOf(-2));
            this.f60922e.mo60134a("music_index", (Object) Integer.valueOf(musicItemViewHolder.f63383d));
            this.f60922e.mo60134a("music_loading", (Object) Boolean.valueOf(true));
        } else if (id == R.id.bsu) {
            if (this.f63459l != null) {
                this.f63459l.mo61926c(10);
            }
            if (this.f63460m != null) {
                this.f63460m.mo61923b(musicModel);
                C23888c.m78184a(this.f63464q, musicModel.getMusicId(), musicItemViewHolder.f63383d, musicModel.getLogPb());
            }
        }
    }
}

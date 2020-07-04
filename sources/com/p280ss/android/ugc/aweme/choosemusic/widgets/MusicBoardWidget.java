package com.p280ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Intent;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.p280ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23870p;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23963h;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y.C34026a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget */
public class MusicBoardWidget extends ListItemWidget<MusicBoardViewHolder> implements C0053p<C23083a> {

    /* renamed from: i */
    public int f63467i;

    /* renamed from: j */
    C23819a f63468j;

    /* renamed from: k */
    List<MusicModel> f63469k;

    /* renamed from: l */
    C33746f<C23822c> f63470l;

    /* renamed from: m */
    boolean[] f63471m = new boolean[3];

    /* renamed from: n */
    boolean[] f63472n = new boolean[3];

    /* renamed from: o */
    public C34026a f63473o = new C24014c(this);

    /* renamed from: p */
    private C23844b f63474p;

    /* renamed from: q */
    private int f63475q = -1;

    /* renamed from: r */
    private int f63476r = -1;

    /* renamed from: s */
    private int f63477s;

    /* renamed from: t */
    private int f63478t;

    /* renamed from: u */
    private C0935e f63479u = new C0935e() {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            MusicBoardWidget.this.f63467i = i;
            for (int i2 = 0; i2 < MusicBoardWidget.this.f63472n.length; i2++) {
                MusicBoardWidget.this.f63472n[i2] = MusicBoardWidget.this.f63471m[i2];
            }
            MusicBoardWidget.this.mo62268e();
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62266a(MusicCollectionItem musicCollectionItem, MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
        String str;
        int id = view.getId();
        if (id == R.id.bae) {
            Activity g = C6405d.m19984g();
            if (g == null) {
                str = "";
            } else {
                str = g.getString(R.string.b4m);
            }
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                C32656f.m105743a(C6405d.m19984g(), C23889d.m78217a(i), "click_favorite_music", (C30538p.m99745a() || TextUtils.isEmpty(str)) ? null : C42914ab.m136242a().mo104633a("login_title", str).f111445a);
                return;
            }
            musicItemViewHolder.mo62218e();
            C23888c.m78194a(musicItemViewHolder.f63380a, musicModel.getMusicId(), this.f63468j, musicItemViewHolder.f63383d, musicModel.getLogPb());
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
                C7195s a = C7195s.m22438a();
                StringBuilder sb = new StringBuilder("aweme://music/detail/");
                sb.append(musicModel.getMusicId());
                a.mo18682a(sb.toString());
                C23888c.m78186a(this.f63468j, musicModel.getMusicId(), false);
            }
        } else if (id == R.id.e3m) {
            Intent intent = new Intent(this.f60919b, MusicDetailListActivity.class);
            if (this.f63476r == 0) {
                intent.putExtra("music_type", 1);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f63478t);
            } else {
                intent.putExtra("music_class_id", musicCollectionItem.mcId);
                intent.putExtra("music_class_name", musicCollectionItem.mcName);
                intent.putExtra("music_type", 2);
                intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                intent.putExtra("music_class_enter_method", "click_more");
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f63478t);
            }
            mo60145a(intent, this.f63477s);
            C23888c.m78193a(musicCollectionItem.mcName, "click_more", "", "change_music_page", musicCollectionItem.mcId);
        } else if (id == R.id.bs2) {
            if (musicItemViewHolder != null && musicModel != null) {
                if (this.f63475q == musicItemViewHolder.f63383d && ((Integer) this.f60922e.mo60136b("music_position", Integer.valueOf(-1))).intValue() == this.f63476r) {
                    this.f60922e.mo60134a("music_position", (Object) Integer.valueOf(-1));
                    this.f60922e.mo60134a("music_index", (Object) Integer.valueOf(-1));
                    musicItemViewHolder.mo62214a(false, false);
                    m78780h();
                    return;
                }
                if (this.f63474p != null) {
                    m78780h();
                    this.f63474p.mo61920a((C34026a) new C24016e(this));
                    this.f63474p.mo61922a(musicModel, this.f63468j);
                    C23888c.m78181a(musicItemViewHolder.f63383d);
                }
                this.f60922e.mo60134a("music_position", (Object) Integer.valueOf(this.f63476r));
                this.f60922e.mo60134a("music_index", (Object) Integer.valueOf(musicItemViewHolder.f63383d));
                this.f60922e.mo60134a("music_loading", (Object) Boolean.valueOf(true));
            }
        } else if (!(id != R.id.bsu || this.f63474p == null || musicModel == null)) {
            this.f63474p.mo61923b(musicModel);
            C23888c.m78184a(this.f63468j, musicModel.getMusicId(), this.f63476r, musicModel.getLogPb());
        }
    }

    /* renamed from: h */
    private void m78780h() {
        this.f63474p.mo61921a((MusicModel) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo62269f() {
        this.f60922e.mo60134a("music_loading", (Object) Boolean.valueOf(false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo62270g() {
        this.f60922e.mo60134a("music_loading", (Object) Boolean.valueOf(false));
    }

    /* renamed from: d */
    public final void mo62267d() {
        for (int i = 0; i < this.f63472n.length; i++) {
            this.f63471m[i] = false;
            this.f63472n[i] = false;
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f60922e.mo60132a("list", (C0053p<C23083a>) this).mo60132a("music_index", (C0053p<C23083a>) this).mo60132a("music_collect_status", (C0053p<C23083a>) this).mo60132a("play_compeleted", (C0053p<C23083a>) this).mo60132a("music_loading", (C0053p<C23083a>) this);
        this.f63478t = ((Integer) this.f60922e.mo60135a("key_choose_music_type")).intValue();
    }

    /* renamed from: e */
    public final void mo62268e() {
        int i;
        if (!C6307b.m19566a((Collection<T>) this.f63469k)) {
            if (this.f63467i * 3 < 0) {
                i = 0;
            } else {
                i = this.f63467i * 3;
            }
            int min = Math.min(i + 3, this.f63469k.size());
            for (int i2 = i; i2 < min; i2++) {
                int i3 = i2 - i;
                if (this.f63472n[i3]) {
                    this.f63472n[i3] = false;
                    MusicModel musicModel = (MusicModel) this.f63469k.get(i2);
                    if (musicModel != null) {
                        C23888c.m78185a(this.f63468j, musicModel.getMusicId(), i2, true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final MusicBoardWidget mo62263a(C23844b bVar) {
        this.f63474p = bVar;
        return this;
    }

    /* renamed from: a */
    public final MusicBoardWidget mo62264a(C33746f<C23822c> fVar) {
        this.f63470l = fVar;
        return this;
    }

    /* renamed from: a */
    private void m78776a(C23820a aVar) {
        if (this.f60902a != null) {
            ((MusicBoardViewHolder) this.f60902a).mo62200a(aVar);
        }
    }

    /* renamed from: a */
    public final MusicBoardWidget mo62262a(int i) {
        this.f63476r = i;
        this.f63477s = this.f63476r + 10086;
        return this;
    }

    /* renamed from: a */
    private void m78777a(List<Object> list) {
        if (list != null && this.f63476r < list.size()) {
            m78778a(((C23870p) list.get(this.f63476r)).f62997b, ((C23870p) list.get(this.f63476r)).f62996a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.f60948a
            int r1 = r0.hashCode()
            r2 = 1
            r3 = -1
            switch(r1) {
                case -1635157503: goto L_0x0034;
                case -1322093457: goto L_0x002a;
                case 3322014: goto L_0x0020;
                case 502104354: goto L_0x0016;
                case 1579846200: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r1 = "music_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x0016:
            java.lang.String r1 = "music_loading"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 2
            goto L_0x003f
        L_0x0020:
            java.lang.String r1 = "list"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x002a:
            java.lang.String r1 = "play_compeleted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x0034:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 3
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            switch(r0) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00b9;
                case 2: goto L_0x009d;
                case 3: goto L_0x0085;
                case 4: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x00e8
        L_0x0044:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r5 = r4.f60922e
            java.lang.String r0 = "music_position"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r5.mo60136b(r0, r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r4.f60922e
            java.lang.String r1 = "music_index"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.mo60136b(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.m78779b(r5, r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r5 = r4.f60922e
            java.lang.String r0 = "music_position"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r5.mo60134a(r0, r1)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r5 = r4.f60922e
            java.lang.String r0 = "music_index"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r5.mo60134a(r0, r1)
            r4.m78780h()
            goto L_0x00e8
        L_0x0085:
            java.lang.Object r5 = r5.mo60161a()
            com.ss.android.ugc.aweme.choosemusic.a.a r5 = (com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a) r5
            int r0 = r5.f62878a
            if (r0 != r2) goto L_0x0095
            int r0 = r4.f63476r
            int r1 = r5.f62879b
            if (r0 == r1) goto L_0x0099
        L_0x0095:
            int r0 = r5.f62878a
            if (r0 != 0) goto L_0x00e8
        L_0x0099:
            r4.m78776a(r5)
            return
        L_0x009d:
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r5 = r4.f60902a
            if (r5 == 0) goto L_0x00e8
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r5 = r4.f60902a
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder r5 = (com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder) r5
            int r0 = r4.f63475q
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r4.f60922e
            java.lang.String r2 = "music_loading"
            java.lang.Object r1 = r1.mo60135a(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5.mo62197a(r0, r1)
            return
        L_0x00b9:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r5 = r4.f60922e
            java.lang.String r0 = "music_position"
            java.lang.Object r5 = r5.mo60135a(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r4.f60922e
            java.lang.String r1 = "music_index"
            java.lang.Object r0 = r0.mo60135a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.m78779b(r5, r0)
            return
        L_0x00d9:
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r4.f60902a
            if (r0 != 0) goto L_0x00de
            return
        L_0x00de:
            java.lang.Object r5 = r5.mo60161a()
            java.util.List r5 = (java.util.List) r5
            r4.m78777a(r5)
            return
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* renamed from: a */
    public final void mo60128a(ItemWidgetViewHolder itemWidgetViewHolder) {
        super.mo60128a(itemWidgetViewHolder);
        m78777a((List) this.f60922e.mo60135a("list"));
    }

    /* renamed from: b */
    private void m78779b(int i, int i2) {
        int i3;
        if (this.f60902a != null) {
            MusicBoardViewHolder musicBoardViewHolder = (MusicBoardViewHolder) this.f60902a;
            int i4 = this.f63475q;
            if (i == this.f63476r) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            musicBoardViewHolder.mo62195a(i4, i3);
        }
        if (i != this.f63476r) {
            this.f63475q = -1;
        } else if (this.f63475q == i2) {
            this.f63474p.mo61921a((MusicModel) null);
        } else {
            this.f63475q = i2;
        }
    }

    /* renamed from: a */
    private void m78778a(List<MusicModel> list, MusicCollectionItem musicCollectionItem) {
        if (list != null && musicCollectionItem != null) {
            if (this.f63476r == 0) {
                ((MusicBoardViewHolder) this.f60902a).mo62203b();
            } else {
                ((MusicBoardViewHolder) this.f60902a).mo62194a();
            }
            this.f63469k = list;
            this.f63468j = new C23819a("change_music_page", musicCollectionItem.mcName, "", C23888c.m78180a());
            this.f63468j.f62874e = musicCollectionItem.mcId;
            ((MusicBoardViewHolder) this.f60902a).mo62198a(this.f63479u);
            ((MusicBoardViewHolder) this.f60902a).mo62202a(musicCollectionItem, list, this.f63467i, this.f63475q, this.f63476r, this.f63468j, musicCollectionItem.isHot);
            ((MusicBoardViewHolder) this.f60902a).mo62201a((C23963h) new C24015d(this, musicCollectionItem), this.f63470l);
        }
    }

    /* renamed from: a */
    public final void mo62265a(int i, int i2) {
        if (this.f60902a != null) {
            ((MusicBoardViewHolder) this.f60902a).mo62196a(i, i2, this.f63471m, this.f63472n);
            mo62268e();
        }
    }

    /* renamed from: a */
    public final void mo60144a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.f63477s) {
            mo60148c().setResult(-1, intent);
            mo60148c().finish();
        }
    }
}

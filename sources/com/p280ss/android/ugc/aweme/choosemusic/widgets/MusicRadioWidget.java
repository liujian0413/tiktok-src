package com.p280ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.p280ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23847e;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23870p;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder.C23997b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.adapter.C33744d;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y.C34026a;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget */
public final class MusicRadioWidget extends ListItemWidget<MusicRadioViewHolder> implements C0053p<C23083a> {

    /* renamed from: i */
    public C23819a f63485i;

    /* renamed from: j */
    public int f63486j = -1;

    /* renamed from: k */
    public C23844b f63487k;

    /* renamed from: l */
    public C23847e f63488l;

    /* renamed from: m */
    private int f63489m = -1;

    /* renamed from: n */
    private boolean f63490n;

    /* renamed from: o */
    private C33746f<C23822c> f63491o;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget$a */
    static final class C24009a implements C33744d {

        /* renamed from: a */
        final /* synthetic */ MusicRadioWidget f63492a;

        /* renamed from: b */
        final /* synthetic */ List f63493b;

        C24009a(MusicRadioWidget musicRadioWidget, List list) {
            this.f63492a = musicRadioWidget;
            this.f63493b = list;
        }

        /* renamed from: a */
        public final void mo62273a(C1293v vVar, View view, MusicModel musicModel) {
            String str;
            String str2;
            Bundle bundle;
            if (vVar instanceof MusicRadioViewHolder) {
                boolean z = false;
                if (musicModel == null) {
                    Collection collection = this.f63493b;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    }
                    if (z) {
                        this.f63492a.mo62278d();
                    }
                    return;
                }
                C7573i.m23582a((Object) view, "view");
                int id = view.getId();
                if (id == R.id.bae) {
                    Activity g = C6405d.m19984g();
                    if (g == null) {
                        str2 = "";
                    } else {
                        str2 = g.getString(R.string.b4m);
                    }
                    IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
                    C7573i.m23582a((Object) userService, "ServiceManager.get().get…class.java).userService()");
                    if (!userService.isLogin()) {
                        Activity g2 = C6405d.m19984g();
                        String a = C23889d.m78217a(0);
                        String str3 = "click_favorite_music";
                        if (C30538p.m99745a() || TextUtils.isEmpty(str2)) {
                            bundle = null;
                        } else {
                            bundle = C42914ab.m136242a().mo104633a("login_title", str2).f111445a;
                        }
                        C32656f.m105743a(g2, a, str3, bundle);
                        return;
                    }
                    MusicRadioViewHolder musicRadioViewHolder = (MusicRadioViewHolder) vVar;
                    musicRadioViewHolder.mo62230b();
                    C23819a aVar = this.f63492a.f63485i;
                    if (aVar != null) {
                        aVar.f62872c = "click_button";
                    }
                    C23888c.m78194a(musicRadioViewHolder.f63426q, musicModel.getMusicId(), this.f63492a.f63485i, musicRadioViewHolder.f63425p, musicModel.getLogPb());
                } else if (id == R.id.bs2 || id == R.id.br5 || id == R.id.bst) {
                    Integer num = (Integer) this.f63492a.f60922e.mo60136b("music_position", Integer.valueOf(-1));
                    int i = this.f63492a.f63486j;
                    if (num != null && num.intValue() == i) {
                        Integer num2 = (Integer) this.f63492a.f60922e.mo60136b("music_index", Integer.valueOf(-1));
                        int i2 = ((MusicRadioViewHolder) vVar).f63425p;
                        if (num2 != null && num2.intValue() == i2) {
                            this.f63492a.f60922e.mo60134a("music_position", (Object) Integer.valueOf(-1));
                            this.f63492a.f60922e.mo60134a("music_index", (Object) Integer.valueOf(-1));
                            this.f63492a.mo62279e();
                            return;
                        }
                    }
                    MusicRadioViewHolder musicRadioViewHolder2 = (MusicRadioViewHolder) vVar;
                    C23888c.m78181a(musicRadioViewHolder2.f63425p);
                    C23819a aVar2 = this.f63492a.f63485i;
                    if (aVar2 != null) {
                        if (view.getId() == R.id.br5) {
                            str = "click_start_your_fm";
                        } else {
                            str = "click_play_icon";
                        }
                        aVar2.f62872c = str;
                    }
                    if (view.getId() == R.id.bst) {
                        C23888c.m78191a(musicModel.getMusicId(), (String) this.f63492a.f60922e.mo60136b("last_play_music_id", ""), this.f63492a.f63485i);
                    }
                    this.f63492a.mo62279e();
                    musicRadioViewHolder2.mo62229a(true, true);
                    C23844b bVar = this.f63492a.f63487k;
                    if (bVar != null) {
                        bVar.mo61920a((C34026a) new C34026a(this) {

                            /* renamed from: a */
                            final /* synthetic */ C24009a f63494a;

                            {
                                this.f63494a = r1;
                            }

                            /* renamed from: a */
                            public final void mo61905a() {
                                this.f63494a.f63492a.f60922e.mo60134a("music_loading", (Object) Boolean.valueOf(false));
                            }
                        });
                    }
                    C23844b bVar2 = this.f63492a.f63487k;
                    if (bVar2 != null) {
                        bVar2.mo61922a(musicModel, this.f63492a.f63485i);
                    }
                    this.f63492a.f60922e.mo60134a("music_position", (Object) Integer.valueOf(this.f63492a.f63486j));
                    this.f63492a.f60922e.mo60134a("music_index", (Object) Integer.valueOf(musicRadioViewHolder2.f63425p));
                    this.f63492a.f60922e.mo60134a("music_loading", (Object) Boolean.valueOf(true));
                } else {
                    if (id == R.id.bsu) {
                        C23819a aVar3 = this.f63492a.f63485i;
                        if (aVar3 != null) {
                            aVar3.f62872c = "";
                        }
                        C23847e eVar = this.f63492a.f63488l;
                        if (eVar != null) {
                            eVar.mo61926c(8);
                        }
                        C23844b bVar3 = this.f63492a.f63487k;
                        if (bVar3 != null) {
                            bVar3.mo61923b(musicModel);
                        }
                        C23888c.m78184a(this.f63492a.f63485i, musicModel.getMusicId(), this.f63492a.f63486j, musicModel.getLogPb());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget$b */
    public static final class C24011b implements C23997b {

        /* renamed from: a */
        final /* synthetic */ MusicRadioWidget f63495a;

        /* renamed from: a */
        public final void mo62244a() {
            this.f63495a.mo62278d();
        }

        C24011b(MusicRadioWidget musicRadioWidget) {
            this.f63495a = musicRadioWidget;
        }
    }

    /* renamed from: e */
    public final void mo62279e() {
        C23844b bVar = this.f63487k;
        if (bVar != null) {
            bVar.mo61921a((MusicModel) null);
        }
    }

    /* renamed from: d */
    public final void mo62278d() {
        if (!this.f63490n) {
            this.f63490n = true;
            this.f60922e.mo60134a("should_load_more_pick", (Object) Boolean.valueOf(true));
        }
    }

    public final void onCreate() {
        super.onCreate();
        C0053p pVar = this;
        this.f60922e.mo60132a("music_index", pVar).mo60132a("music_collect_status", pVar).mo60132a("status_pick_load_more", pVar).mo60132a("pick_list_more", pVar).mo60132a("play_compeleted", pVar).mo60132a("play_error", pVar).mo60132a("music_loading", pVar);
    }

    /* renamed from: a */
    public final MusicRadioWidget mo62274a(int i) {
        this.f63486j = i;
        return this;
    }

    /* renamed from: a */
    public final MusicRadioWidget mo62275a(C23844b bVar) {
        C7573i.m23587b(bVar, "ISelectMusic");
        this.f63487k = bVar;
        return this;
    }

    /* renamed from: a */
    public final MusicRadioWidget mo62276a(C23847e eVar) {
        C7573i.m23587b(eVar, "postSelectMusicListener");
        this.f63488l = eVar;
        return this;
    }

    /* renamed from: b */
    private final void m78801b(List<MusicModel> list) {
        ((MusicRadioViewHolder) this.f60902a).mo62228a(list);
        ((MusicRadioViewHolder) this.f60902a).mo62227a((C33744d) new C24009a(this, list));
    }

    /* renamed from: a */
    public final MusicRadioWidget mo62277a(C33746f<C23822c> fVar) {
        this.f63491o = fVar;
        return this;
    }

    /* renamed from: a */
    private final void m78800a(List<? extends Object> list) {
        if (list != null && this.f63486j < list.size()) {
            Object obj = list.get(this.f63486j);
            if (obj != null) {
                m78801b(((C23870p) obj).f62997b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.model.MusicBlockItem");
        }
    }

    /* renamed from: a */
    public final void mo60128a(ItemWidgetViewHolder itemWidgetViewHolder) {
        C7573i.m23587b(itemWidgetViewHolder, "view");
        super.mo60128a(itemWidgetViewHolder);
        List list = (List) this.f60922e.mo60135a("list");
        this.f63485i = new C23819a("change_music_page", "my_fm", "click_start_your_fm", C23888c.m78180a());
        C23819a aVar = this.f63485i;
        if (aVar != null) {
            aVar.f62877h = true;
        }
        m78800a(list);
        ((MusicRadioViewHolder) this.f60902a).f63424o = this.f63491o;
        ((MusicRadioViewHolder) this.f60902a).f63423n = new C24011b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (this.f60902a != null) {
            if (aVar == null) {
                C7573i.m23580a();
            }
            String str = aVar.f60948a;
            String str2 = null;
            int i = -1;
            switch (str.hashCode()) {
                case -1322093457:
                    if (str.equals("play_compeleted")) {
                        String str3 = (String) aVar.mo60161a();
                        MusicModel f = ((MusicRadioViewHolder) this.f60902a).mo62235f();
                        if (f != null) {
                            str2 = f.getMusicId();
                        }
                        if (C7573i.m23585a((Object) str3, (Object) str2)) {
                            this.f60922e.mo60134a("music_position", (Object) Integer.valueOf(-1));
                            this.f60922e.mo60134a("music_index", (Object) Integer.valueOf(-1));
                            return;
                        }
                    }
                    break;
                case -60075939:
                    if (str.equals("status_pick_load_more")) {
                        this.f63490n = false;
                        ((MusicRadioViewHolder) this.f60902a).mo62231b(null);
                        return;
                    }
                    break;
                case 502104354:
                    if (str.equals("music_loading")) {
                        Integer num = (Integer) this.f60922e.mo60135a("music_position");
                        if (num != null) {
                            i = num.intValue();
                        }
                        if (this.f63486j == i) {
                            MusicRadioViewHolder musicRadioViewHolder = (MusicRadioViewHolder) this.f60902a;
                            Object a = this.f60922e.mo60135a("music_loading");
                            C7573i.m23582a(a, "mDataCenter[WidgetConstants.KEY_MUSIC_LOADING]");
                            musicRadioViewHolder.mo62229a(true, ((Boolean) a).booleanValue());
                            break;
                        }
                    }
                    break;
                case 945257400:
                    if (str.equals("pick_list_more")) {
                        this.f63490n = false;
                        ((MusicRadioViewHolder) this.f60902a).mo62231b((List) aVar.mo60161a());
                        return;
                    }
                    break;
                case 1579846200:
                    if (str.equals("music_index")) {
                        Integer num2 = (Integer) this.f60922e.mo60136b("music_position", Integer.valueOf(-1));
                        Integer num3 = (Integer) this.f60922e.mo60136b("music_index", Integer.valueOf(-1));
                        int i2 = this.f63486j;
                        if (num2 != null && num2.intValue() == i2) {
                            int i3 = this.f63489m;
                            if (num3 != null && i3 == num3.intValue()) {
                                ((MusicRadioViewHolder) this.f60902a).mo62229a(false, false);
                                C23844b bVar = this.f63487k;
                                if (bVar != null) {
                                    bVar.mo61921a((MusicModel) null);
                                    return;
                                }
                                return;
                            }
                            C7573i.m23582a((Object) num3, "musicIndex");
                            this.f63489m = num3.intValue();
                            return;
                        }
                        ((MusicRadioViewHolder) this.f60902a).mo62229a(false, false);
                        this.f63489m = -1;
                        return;
                    }
                    break;
                case 1912965437:
                    if (str.equals("play_error")) {
                        String str4 = (String) aVar.mo60161a();
                        MusicModel f2 = ((MusicRadioViewHolder) this.f60902a).mo62235f();
                        if (f2 != null) {
                            str2 = f2.getMusicId();
                        }
                        if (C7573i.m23585a((Object) str4, (Object) str2)) {
                            this.f60922e.mo60134a("music_position", (Object) Integer.valueOf(-1));
                            this.f60922e.mo60134a("music_index", (Object) Integer.valueOf(-1));
                            return;
                        }
                    }
                    break;
            }
        }
    }
}

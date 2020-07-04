package com.p280ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.C0053p;
import android.content.Intent;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.p280ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23873s;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.C33744d;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget */
public class MusicClassWidget extends ListItemWidget<MusicClassViewHolder> implements C0053p<C23083a> {

    /* renamed from: i */
    int f63481i;

    /* renamed from: j */
    public int f63482j;

    /* renamed from: k */
    public int f63483k;

    public void onCreate() {
        super.onCreate();
        this.f60922e.mo60132a("list", (C0053p<C23083a>) this);
        this.f63483k = ((Integer) this.f60922e.mo60135a("key_choose_music_type")).intValue();
    }

    /* renamed from: a */
    public final MusicClassWidget mo62271a(int i) {
        this.f63481i = i;
        this.f63482j = this.f63481i + 10086;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (this.f60902a != null) {
            String str = aVar.f60948a;
            char c = 65535;
            if (str.hashCode() == 3322014 && str.equals("list")) {
                c = 0;
            }
            if (c == 0) {
                m78793a((List) aVar.mo60161a());
            }
        }
    }

    /* renamed from: a */
    private void m78793a(List<Object> list) {
        if (list != null && list.size() > 0) {
            ((MusicClassViewHolder) this.f60902a).mo62206a(((C23873s) list.get(this.f63481i)).f63004a, this.f63483k);
            ((MusicClassViewHolder) this.f60902a).f63364b = new C33744d() {
                /* renamed from: a */
                public final void mo62273a(C1293v vVar, View view, MusicModel musicModel) {
                    if (view.getId() == R.id.e3m) {
                        Intent intent = new Intent(MusicClassWidget.this.f60919b, MusicDetailListActivity.class);
                        intent.putExtra("music_type", 4);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", MusicClassWidget.this.f63483k);
                        MusicClassWidget.this.mo60145a(intent, MusicClassWidget.this.f63482j);
                    }
                }
            };
            ((MusicClassViewHolder) this.f60902a).f63365c = new C24017f(this);
        }
    }

    /* renamed from: a */
    public final void mo60128a(ItemWidgetViewHolder itemWidgetViewHolder) {
        super.mo60128a(itemWidgetViewHolder);
        m78793a((List) this.f60922e.mo60135a("list"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62272a(MusicCollectionItem musicCollectionItem, int i) {
        Intent intent = new Intent(this.f60919b, MusicDetailListActivity.class);
        intent.putExtra("music_type", 2);
        intent.putExtra("music_class_id", musicCollectionItem.mcId);
        intent.putExtra("music_class_name", musicCollectionItem.mcName);
        intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f63483k);
        intent.putExtra("music_class_enter_method", "click_category_list");
        mo60145a(intent, this.f63482j);
        C23888c.m78193a(musicCollectionItem.mcName, "click_category_list", "", "change_music_page", musicCollectionItem.mcId);
    }

    /* renamed from: a */
    public final void mo60144a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.f63482j) {
            mo60148c().setResult(-1, intent);
            mo60148c().finish();
        }
    }
}

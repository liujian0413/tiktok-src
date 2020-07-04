package com.p280ss.android.ugc.aweme.choosemusic.adapter;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p280ss.android.ugc.aweme.arch.widgets.WidgetListAdapter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23847e;
import com.p280ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView;
import com.p280ss.android.ugc.aweme.choosemusic.view.StickerMusicView;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicClassViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder.C23996a;
import com.p280ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget;
import com.p280ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget;
import com.p280ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;
import com.p280ss.android.ugc.aweme.choosemusic.widgets.MusicRadioWidget;
import com.p280ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter */
public class DiscoverWidgetAdapter extends WidgetListAdapter {

    /* renamed from: d */
    public C23844b f62906d;

    /* renamed from: e */
    public C23847e f62907e;

    /* renamed from: f */
    public int f62908f;

    /* renamed from: g */
    public boolean f62909g;

    /* renamed from: h */
    public C33746f<C23822c> f62910h;

    /* renamed from: i */
    private int f62911i;

    /* renamed from: j */
    private RecyclerView f62912j;

    /* renamed from: k */
    private int f62913k;

    /* renamed from: w */
    private boolean f62914w;

    /* renamed from: x */
    private int f62915x;

    /* renamed from: c */
    public final int mo60557c() {
        if (this.f62914w) {
            return this.f62908f + 1;
        }
        return this.f62908f;
    }

    public final void ak_() {
        if (((Integer) this.f60904b.mo60136b("music_position", Integer.valueOf(-1))).intValue() != -1) {
            if (this.f62906d != null) {
                this.f62906d.mo61921a((MusicModel) null);
            }
            this.f60904b.mo60134a("music_position", (Object) Integer.valueOf(-1));
            this.f60904b.mo60134a("music_index", (Object) Integer.valueOf(-1));
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f62912j = recyclerView;
        this.f62912j.mo5528a((C1281m) new C1281m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                DiscoverWidgetAdapter.this.mo61881a(false);
            }
        });
    }

    /* renamed from: c */
    public final void mo61884c(int i) {
        if (this.f62913k != i) {
            this.f62913k = i;
            mo61881a(false);
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (this.f62914w) {
            if (i == 0) {
                return this.f62915x;
            }
            if (i == 1 && this.f62909g) {
                return 3;
            }
            if (i == 2) {
                return 1;
            }
            return 2;
        } else if (i == 0 && this.f62909g) {
            return 3;
        } else {
            if (i == 1) {
                return 1;
            }
            return 2;
        }
    }

    /* renamed from: b */
    public final ListItemWidget mo60129b(int i) {
        switch (getItemViewType(i)) {
            case 1:
                MusicClassWidget musicClassWidget = new MusicClassWidget();
                if (this.f62914w) {
                    i--;
                }
                return musicClassWidget.mo62271a(i);
            case 2:
                MusicBoardWidget a = new MusicBoardWidget().mo62263a(this.f62906d).mo62264a(this.f62910h);
                if (this.f62914w) {
                    i--;
                }
                return a.mo62262a(i);
            case 3:
                MusicRadioWidget a2 = new MusicRadioWidget().mo62275a(this.f62906d).mo62277a(this.f62910h).mo62276a(this.f62907e);
                if (this.f62914w) {
                    i--;
                }
                return a2.mo62274a(i);
            case 4:
                return new StickerMusicWidget().mo62281a(this.f62906d).mo62283a(this.f62910h).mo62282a(this.f62907e).mo62280a(-2);
            case 5:
                return new ChallengeMusicWidget().mo62257a(this.f62906d).mo62259a(this.f62910h).mo62258a(this.f62907e).mo62256a(-2);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo61881a(boolean z) {
        int i;
        int i2;
        C1273i layoutManager = this.f62912j.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int j = linearLayoutManager.mo5445j();
            int l = linearLayoutManager.mo5447l();
            int i3 = j;
            while (i3 <= l) {
                View childAt = this.f62912j.getChildAt(i3 - j);
                if (childAt != null) {
                    if (!this.f67566v || i3 != mo60557c()) {
                        ListItemWidget b_ = mo60130b_(i3);
                        if (b_ instanceof MusicBoardWidget) {
                            if (z) {
                                ((MusicBoardWidget) b_).mo62267d();
                            }
                            if (childAt.getTop() > 0) {
                                i = 0;
                            } else {
                                i = -childAt.getTop();
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            if (childAt.getBottom() > this.f62913k) {
                                i2 = (measuredHeight + this.f62913k) - childAt.getBottom();
                            } else {
                                i2 = childAt.getMeasuredHeight();
                            }
                            ((MusicBoardWidget) b_).mo62265a(i, i2);
                        }
                        i3++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61882a(boolean z, int i) {
        this.f62914w = true;
        this.f62915x = i;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new MusicClassViewHolder(mo61880a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i));
        }
        switch (i) {
            case 3:
                return new MusicRadioViewHolder(C23996a.m78744a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 4:
                StickerMusicView stickerMusicView = new StickerMusicView(mo61880a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f62911i);
                stickerMusicView.f63294b = ((Boolean) this.f60904b.mo60135a("mvtheme_music_type")).booleanValue();
                return stickerMusicView;
            case 5:
                return new ChallengeMusicView(mo61880a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f62911i);
            default:
                return new MusicBoardViewHolder(mo61880a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f62911i);
        }
    }

    /* renamed from: a */
    public final View mo61880a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        if (i == 1) {
            return layoutInflater.inflate(R.layout.a98, viewGroup, false);
        }
        if (i == 5 || i == 4) {
            return layoutInflater.inflate(R.layout.a4q, viewGroup, false);
        }
        return layoutInflater.inflate(R.layout.a97, viewGroup, false);
    }

    public DiscoverWidgetAdapter(WidgetManager widgetManager, DataCenter dataCenter, C23844b bVar, C23847e eVar, C33746f<C23822c> fVar, int i) {
        super(widgetManager, dataCenter);
        this.f62906d = bVar;
        this.f62907e = eVar;
        this.f62910h = fVar;
        this.f62911i = i;
    }
}

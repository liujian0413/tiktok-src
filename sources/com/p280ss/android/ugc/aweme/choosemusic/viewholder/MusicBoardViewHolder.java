package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23963h;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23965j;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder */
public class MusicBoardViewHolder extends ItemWidgetViewHolder {

    /* renamed from: b */
    public C23963h f63346b;

    /* renamed from: c */
    C33746f<C23822c> f63347c;

    /* renamed from: d */
    public int f63348d = -1;

    /* renamed from: e */
    public int f63349e;

    /* renamed from: f */
    public C23819a f63350f;

    /* renamed from: g */
    C23978a f63351g;

    /* renamed from: h */
    public int f63352h;

    /* renamed from: i */
    public int f63353i;

    /* renamed from: j */
    public boolean f63354j;

    /* renamed from: k */
    private C0935e f63355k;
    TextView mTvTitleLeft;
    TextView mTvTitleRight;
    ViewPager mVpMusicContainer;
    View mVwLine;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder$a */
    class C23978a extends PagerAdapter {

        /* renamed from: a */
        public List<MusicModel> f63356a = null;

        /* renamed from: b */
        LinkedList<C23965j> f63357b = new LinkedList<>();

        public final int getItemPosition(Object obj) {
            return -2;
        }

        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public final int getCount() {
            int i = 0;
            if (this.f63356a == null) {
                return 0;
            }
            int size = this.f63356a.size() / 3;
            if (this.f63356a.size() % 3 != 0) {
                i = 1;
            }
            return size + i;
        }

        C23978a(List<MusicModel> list) {
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            C23965j jVar = (C23965j) this.f63357b.poll();
            if (jVar == null) {
                jVar = new C23965j(viewGroup.getContext(), MusicBoardViewHolder.this.f63353i);
            }
            jVar.mo62171a(MusicBoardViewHolder.this.f63346b, MusicBoardViewHolder.this.f63347c);
            jVar.mo62172a(this.f63356a, i * 3, MusicBoardViewHolder.this.f63348d, MusicBoardViewHolder.this.f63349e, MusicBoardViewHolder.this.f63350f, MusicBoardViewHolder.this.f63354j);
            viewGroup.addView(jVar);
            return jVar;
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            this.f63357b.offer((C23965j) obj);
        }
    }

    /* renamed from: a */
    public final void mo62202a(MusicCollectionItem musicCollectionItem, List<MusicModel> list, int i, int i2, int i3, C23819a aVar, boolean z) {
        this.mTvTitleLeft.setText(musicCollectionItem.mcName);
        if (list != null) {
            this.mVpMusicContainer.getLayoutParams().height = this.f63352h * Math.min(3, list.size());
        }
        this.f63354j = z;
        this.f63349e = i3;
        this.f63348d = i2;
        this.f63351g.f63356a = list;
        this.f63351g.notifyDataSetChanged();
        this.mVpMusicContainer.setCurrentItem(i);
        this.mVpMusicContainer.addOnPageChangeListener(this.f63355k);
        this.f63350f = aVar;
    }

    /* renamed from: a */
    public final void mo62194a() {
        this.mVwLine.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo62203b() {
        this.mVwLine.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo62198a(C0935e eVar) {
        if (!(this.f63347c == null || this.mVpMusicContainer == null)) {
            this.mVpMusicContainer.removeOnPageChangeListener(this.f63355k);
        }
        this.f63355k = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62199a(View view) {
        if (!C27326a.m89578a(view) && this.f63346b != null) {
            this.f63346b.mo61894a(null, view, null, 0);
        }
    }

    /* renamed from: a */
    public final void mo62200a(C23820a aVar) {
        CollectionType collectionType;
        int i = 0;
        while (i < this.mVpMusicContainer.getChildCount()) {
            C23965j jVar = (C23965j) this.mVpMusicContainer.getChildAt(i);
            if (jVar != null) {
                ArrayList musicItemViews = jVar.getMusicItemViews();
                if (musicItemViews != null && aVar != null) {
                    Iterator it = musicItemViews.iterator();
                    while (it.hasNext()) {
                        MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) it.next();
                        if (m78676a(musicItemViewHolder, aVar.f62882e)) {
                            MusicModel musicModel = musicItemViewHolder.f63382c;
                            if (aVar.f62881d == 1) {
                                collectionType = CollectionType.COLLECTED;
                            } else {
                                collectionType = CollectionType.NOT_COLLECTED;
                            }
                            musicModel.setCollectionType(collectionType);
                            musicItemViewHolder.mo62217d();
                            return;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo62201a(C23963h hVar, C33746f<C23822c> fVar) {
        this.f63346b = hVar;
        this.f63347c = fVar;
    }

    public MusicBoardViewHolder(View view, int i) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f63352h = (int) C9738o.m28708b(C6399b.m19921a(), 84.0f);
        this.f63351g = new C23978a(null);
        this.mVpMusicContainer.setAdapter(this.f63351g);
        this.f63353i = i;
        this.mTvTitleRight.setOnClickListener(new C24002a(this));
    }

    /* renamed from: a */
    private static boolean m78676a(MusicItemViewHolder musicItemViewHolder, MusicModel musicModel) {
        if (musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || musicItemViewHolder.f63382c == null || !musicModel.getMusicId().equals(musicItemViewHolder.f63382c.getMusicId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo62195a(int i, int i2) {
        this.f63348d = i2;
        if (i >= 0) {
            int i3 = 0;
            while (i3 < this.mVpMusicContainer.getChildCount()) {
                C23965j jVar = (C23965j) this.mVpMusicContainer.getChildAt(i3);
                if (jVar != null) {
                    ArrayList musicItemViews = jVar.getMusicItemViews();
                    if (musicItemViews != null) {
                        Iterator it = musicItemViews.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) it.next();
                            if (musicItemViewHolder.f63383d == i) {
                                musicItemViewHolder.mo62214a(false, false);
                                break;
                            }
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
    public final void mo62197a(int i, boolean z) {
        if (i >= 0) {
            int i2 = 0;
            while (i2 < this.mVpMusicContainer.getChildCount()) {
                C23965j jVar = (C23965j) this.mVpMusicContainer.getChildAt(i2);
                if (jVar != null) {
                    ArrayList musicItemViews = jVar.getMusicItemViews();
                    if (musicItemViews != null) {
                        Iterator it = musicItemViews.iterator();
                        while (it.hasNext()) {
                            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) it.next();
                            if (musicItemViewHolder.f63383d == i) {
                                musicItemViewHolder.mo62214a(z, true);
                                return;
                            }
                        }
                        i2++;
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
    public final void mo62196a(int i, int i2, boolean[] zArr, boolean[] zArr2) {
        for (int i3 = 0; i3 < zArr2.length; i3++) {
            if (this.mVpMusicContainer.getTop() + (this.f63352h * i3) > i2 || this.mVpMusicContainer.getTop() + ((i3 + 1) * this.f63352h) < i) {
                zArr[i3] = false;
                zArr2[i3] = false;
            } else if (!zArr[i3]) {
                zArr[i3] = true;
                zArr2[i3] = true;
            }
        }
    }
}

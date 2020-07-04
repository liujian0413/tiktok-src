package com.p280ss.android.ugc.aweme.choosemusic.p1090d;

import android.content.Context;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.arch.C23073b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p280ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi.API;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.p1385g.C33020g;
import com.p280ss.android.ugc.aweme.main.p1385g.C33020g.C33021a;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicCollection;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.music.model.MusicList;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.a */
public final class C23853a {

    /* renamed from: a */
    public DataCenter f62962a;

    /* renamed from: b */
    private API f62963b = ChooseMusicApi.m78099a();

    /* renamed from: c */
    private boolean f62964c;

    /* renamed from: d */
    private Context f62965d;

    /* renamed from: e */
    private boolean f62966e;

    /* renamed from: f */
    private boolean f62967f;

    /* renamed from: g */
    private boolean f62968g;

    /* renamed from: a */
    public final void mo61941a(boolean z, String str, final Music music, boolean z2) {
        this.f62963b.musicPick((Integer) this.f62962a.mo60136b("radio_cursor", Integer.valueOf(0)), str, Boolean.valueOf(z2)).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<C23874t, C23874t>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C23874t then(C1592h<C23874t> hVar) throws Exception {
                if (music != null) {
                    try {
                        Music music = MusicApi.m108887a(music.getMid(), 0).music;
                        if (music != null) {
                            music.setCollectStatus(music.getCollectStatus());
                        }
                    } catch (Exception unused) {
                    }
                }
                return (C23874t) hVar.mo6890e();
            }
        }, (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C23856b<TResult,TContinuationResult>(this, z, str, music), C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo61934a(C1592h hVar) throws Exception {
        this.f62968g = false;
        if (hVar.mo6889d()) {
            this.f62962a.mo60134a("loadmore_status_hot_music_list", (Object) Integer.valueOf(1));
        } else if (hVar.mo6882b()) {
            MusicList musicList = (MusicList) hVar.mo6890e();
            List list = (List) ((C23073b) this.f62962a.mo60135a("hot_music_list_data")).mo60119a("list_data");
            list.addAll(C23889d.m78218a(musicList.items));
            C23073b bVar = new C23073b();
            bVar.mo60118a("loadmore_status_hot_music_list", Integer.valueOf(0)).mo60118a("list_cursor", Integer.valueOf(musicList.getCursor())).mo60118a("list_hasmore", Integer.valueOf(musicList.hasMore)).mo60118a("action_type", Integer.valueOf(2)).mo60118a("list_data", list);
            this.f62962a.mo60134a("hot_music_list_data", (Object) bVar);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo61942b(C1592h hVar) throws Exception {
        this.f62968g = false;
        if (hVar.mo6889d()) {
            this.f62962a.mo60134a("refresh_status_hot_music_list", (Object) Integer.valueOf(1));
        } else if (hVar.mo6882b()) {
            MusicList musicList = (MusicList) hVar.mo6890e();
            C23073b bVar = new C23073b();
            bVar.mo60118a("refresh_status_hot_music_list", Integer.valueOf(0)).mo60118a("list_cursor", Integer.valueOf(musicList.getCursor())).mo60118a("list_hasmore", Integer.valueOf(musicList.hasMore)).mo60118a("action_type", Integer.valueOf(1)).mo60118a("list_data", C23889d.m78218a(musicList.items));
            this.f62962a.mo60134a("hot_music_list_data", (Object) bVar);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo61945c(C1592h hVar) throws Exception {
        this.f62967f = false;
        if (hVar.mo6889d()) {
            this.f62962a.mo60134a("loadmore_status_user_collected_music", (Object) Integer.valueOf(1));
        } else if (hVar.mo6882b()) {
            CollectedMusicList collectedMusicList = (CollectedMusicList) hVar.mo6890e();
            List list = (List) ((C23073b) this.f62962a.mo60135a("user_collected_music_list")).mo60119a("list_data");
            list.addAll(C23889d.m78218a(collectedMusicList.items));
            C23073b bVar = new C23073b();
            bVar.mo60118a("loadmore_status_user_collected_music", Integer.valueOf(0)).mo60118a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).mo60118a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).mo60118a("action_type", Integer.valueOf(2)).mo60118a("list_data", list);
            this.f62962a.mo60134a("user_collected_music_list", (Object) bVar);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ Object mo61947d(C1592h hVar) throws Exception {
        this.f62967f = false;
        if (hVar.mo6889d()) {
            this.f62962a.mo60134a("refresh_status_user_collected_music", (Object) Integer.valueOf(1));
        } else if (hVar.mo6882b()) {
            CollectedMusicList collectedMusicList = (CollectedMusicList) hVar.mo6890e();
            C23073b bVar = new C23073b();
            bVar.mo60118a("refresh_status_user_collected_music", Integer.valueOf(0)).mo60118a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).mo60118a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).mo60118a("action_type", Integer.valueOf(1)).mo60118a("list_data", C23889d.m78218a(collectedMusicList.items));
            this.f62962a.mo60134a("user_collected_music_list", (Object) bVar);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ Object mo61949e(C1592h hVar) throws Exception {
        this.f62966e = false;
        if (hVar.mo6889d()) {
            this.f62962a.mo60134a("loadmore_status_music_list", (Object) Integer.valueOf(1));
        } else if (hVar.mo6882b()) {
            this.f62962a.mo60134a("loadmore_status_music_list", (Object) Integer.valueOf(0));
            MusicList musicList = (MusicList) hVar.mo6890e();
            List list = (List) ((C23073b) this.f62962a.mo60135a("music_list")).mo60119a("list_data");
            list.addAll(C23889d.m78218a(musicList.items));
            C23073b bVar = new C23073b();
            bVar.mo60118a("list_cursor", Integer.valueOf(musicList.getCursor())).mo60118a("list_hasmore", Integer.valueOf(musicList.hasMore)).mo60118a("action_type", Integer.valueOf(2)).mo60118a("list_data", list);
            this.f62962a.mo60134a("music_list", (Object) bVar);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ Object mo61951f(C1592h hVar) throws Exception {
        this.f62966e = false;
        if (hVar.mo6889d()) {
            this.f62962a.mo60134a("refresh_status_music_list", (Object) Integer.valueOf(1));
        } else if (hVar.mo6882b()) {
            this.f62962a.mo60134a("refresh_status_music_list", (Object) Integer.valueOf(0));
            MusicList musicList = (MusicList) hVar.mo6890e();
            C23073b bVar = new C23073b();
            bVar.mo60118a("list_cursor", Integer.valueOf(musicList.getCursor())).mo60118a("list_hasmore", Integer.valueOf(musicList.hasMore)).mo60118a("action_type", Integer.valueOf(1)).mo60118a("list_data", C23889d.m78218a(musicList.items));
            this.f62962a.mo60134a("music_list", (Object) bVar);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ Object mo61953g(C1592h hVar) throws Exception {
        if (hVar.mo6889d()) {
            this.f62962a.mo60134a("loadmore_status_music_sheet", (Object) Integer.valueOf(1));
        } else if (hVar.mo6882b()) {
            this.f62962a.mo60134a("loadmore_status_music_sheet", (Object) Integer.valueOf(0));
            MusicCollection musicCollection = (MusicCollection) hVar.mo6890e();
            List list = (List) ((C23073b) this.f62962a.mo60135a("music_sheet_list")).mo60119a("list_data");
            list.addAll(musicCollection.getItems());
            C23073b bVar = new C23073b();
            bVar.mo60118a("list_cursor", Long.valueOf(musicCollection.cursor)).mo60118a("list_hasmore", Boolean.valueOf(musicCollection.hasMore)).mo60118a("action_type", Integer.valueOf(2)).mo60118a("list_data", list);
            this.f62962a.mo60134a("music_sheet_list", (Object) bVar);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ Object mo61955h(C1592h hVar) throws Exception {
        if (hVar.mo6889d()) {
            this.f62962a.mo60134a("refresh_status_music_sheet", (Object) Integer.valueOf(1));
        } else if (hVar.mo6882b()) {
            this.f62962a.mo60134a("refresh_status_music_sheet", (Object) Integer.valueOf(0));
            MusicCollection musicCollection = (MusicCollection) hVar.mo6890e();
            C23073b bVar = new C23073b();
            bVar.mo60118a("list_cursor", Long.valueOf(musicCollection.cursor)).mo60118a("list_hasmore", Boolean.valueOf(musicCollection.hasMore)).mo60118a("action_type", Integer.valueOf(1)).mo60118a("list_data", musicCollection.getItems());
            this.f62962a.mo60134a("music_sheet_list", (Object) bVar);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ Object mo61957i(C1592h hVar) throws Exception {
        this.f62964c = false;
        if (hVar.mo6887c()) {
            return null;
        }
        if (hVar.mo6889d()) {
            this.f62962a.mo60134a("collection_feed_status", (Object) Integer.valueOf(1));
        } else if (hVar.mo6882b()) {
            C23872r rVar = (C23872r) hVar.mo6890e();
            this.f62962a.mo60134a("collection_feed_cursor", (Object) Integer.valueOf(rVar.f63002b));
            this.f62962a.mo60134a("collection_feed_has_more", (Object) Integer.valueOf(rVar.f63003c));
            List list = (List) this.f62962a.mo60135a("list");
            if (list == null) {
                this.f62962a.mo60134a("collection_feed_status", (Object) Integer.valueOf(1));
                return null;
            }
            for (C23871q qVar : ((C23872r) hVar.mo6890e()).f63001a) {
                list.add(new C23870p(C23889d.m78218a(qVar.f63000b), qVar.f62999a, 2));
            }
            this.f62962a.mo60134a("list", (Object) list);
            this.f62962a.mo60134a("collection_feed_status", (Object) Integer.valueOf(0));
        }
        return null;
    }

    public C23853a(Context context, DataCenter dataCenter) {
        this.f62962a = dataCenter;
        this.f62965d = context;
    }

    /* renamed from: b */
    public final void mo61943b(int i, int i2) {
        this.f62963b.getMusicSheet(0, PreloadTask.BYTE_UNIT_NUMBER).mo6876a((C1591g<TResult, TContinuationResult>) new C23859e<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: c */
    public final void mo61946c(int i, int i2) {
        this.f62963b.getMusicSheet(i, PreloadTask.BYTE_UNIT_NUMBER).mo6876a((C1591g<TResult, TContinuationResult>) new C23860f<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: d */
    public final void mo61948d(int i, int i2) {
        if (!this.f62967f) {
            this.f62967f = true;
            this.f62963b.userCollectedMusicList(0, 20).mo6876a((C1591g<TResult, TContinuationResult>) new C23863i<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: e */
    public final void mo61950e(int i, int i2) {
        if (!this.f62967f) {
            this.f62967f = true;
            this.f62963b.userCollectedMusicList(i, 20).mo6876a((C1591g<TResult, TContinuationResult>) new C23864j<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: f */
    public final void mo61952f(int i, int i2) {
        if (!this.f62968g) {
            this.f62968g = true;
            this.f62963b.getHotMusicList(0, 20).mo6876a((C1591g<TResult, TContinuationResult>) new C23865k<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: h */
    public final void mo61956h(int i, int i2) {
        if (!this.f62968g) {
            this.f62968g = true;
            this.f62963b.getHotMusicList(i, 20).mo6876a((C1591g<TResult, TContinuationResult>) new C23866l<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo61937a(int i, int i2) {
        if (!this.f62964c) {
            this.f62964c = true;
            this.f62963b.musicCollectionFeed(Integer.valueOf(i), Integer.valueOf(10)).mo6876a((C1591g<TResult, TContinuationResult>) new C23857c<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: g */
    public final void mo61954g(int i, int i2) {
        if (!this.f62968g) {
            this.f62968g = true;
            List recommendLyricMusicList = ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecommendLyricMusicList();
            this.f62968g = false;
            if (recommendLyricMusicList == null) {
                this.f62962a.mo60134a("refresh_status_hot_music_list", (Object) Integer.valueOf(1));
                return;
            }
            ArrayList arrayList = new ArrayList(recommendLyricMusicList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (TextUtils.isEmpty(((MusicModel) it.next()).getLrcUrl())) {
                    it.remove();
                }
            }
            if (arrayList.size() > 50) {
                Iterator it2 = arrayList.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    it2.next();
                    if (i3 == 50) {
                        it2.remove();
                    } else {
                        i3++;
                    }
                }
            }
            C23073b bVar = new C23073b();
            bVar.mo60118a("refresh_status_hot_music_list", Integer.valueOf(0)).mo60118a("list_cursor", Integer.valueOf(0)).mo60118a("list_hasmore", Boolean.valueOf(false)).mo60118a("action_type", Integer.valueOf(1)).mo60118a("list_data", arrayList);
            this.f62962a.mo60134a("hot_music_list_data", (Object) bVar);
        }
    }

    /* renamed from: b */
    public final void mo61944b(String str, int i, int i2) {
        if (!this.f62966e) {
            this.f62966e = true;
            this.f62963b.musicList(str, i, 16).mo6876a((C1591g<TResult, TContinuationResult>) new C23862h<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo61939a(String str, int i, int i2) {
        if (!this.f62966e) {
            this.f62966e = true;
            this.f62963b.musicList(str, 0, 30).mo6876a((C1591g<TResult, TContinuationResult>) new C23861g<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo61936a(boolean z, String str, Music music, C1592h hVar) throws Exception {
        if (hVar.mo6887c()) {
            return null;
        }
        if (hVar.mo6889d()) {
            if (!z) {
                this.f62962a.mo60134a("pick_status", (Object) Integer.valueOf(1));
            } else {
                this.f62962a.mo60134a("status_pick_load_more", (Object) Integer.valueOf(1));
            }
        } else if (hVar.mo6882b()) {
            if (!z) {
                ArrayList arrayList = new ArrayList();
                C23874t tVar = (C23874t) hVar.mo6890e();
                this.f62962a.mo60134a("data_banner", (Object) tVar.f63005a);
                MusicCollectionItem musicCollectionItem = new MusicCollectionItem();
                musicCollectionItem.mcName = this.f62965d.getString(R.string.dc2);
                arrayList.add(new C23870p(C23889d.m78218a(tVar.f63007c), musicCollectionItem, 1));
                arrayList.add(new C23873s(tVar.f63006b));
                this.f62962a.mo60134a("radio_cursor", (Object) Integer.valueOf(tVar.f63010f));
                this.f62962a.mo60134a("show_music_radio", (Object) Boolean.valueOf(tVar.mo61963a()));
                if (str != null && tVar.f63008d != null && tVar.f63008d.size() > 0) {
                    this.f62962a.mo60134a("data_sticker_music_from_video", (Object) Boolean.valueOf(false));
                    this.f62962a.mo60134a("data_sticker", (Object) tVar.f63008d);
                } else if (music != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(music);
                    this.f62962a.mo60134a("data_sticker_music_from_video", (Object) Boolean.valueOf(true));
                    this.f62962a.mo60134a("data_sticker", (Object) arrayList2);
                }
                this.f62962a.mo60134a("list", (Object) arrayList);
                this.f62962a.mo60134a("pick_status", (Object) Integer.valueOf(0));
            } else {
                C23874t tVar2 = (C23874t) hVar.mo6890e();
                this.f62962a.mo60134a("pick_list_more", (Object) C23889d.m78218a(tVar2.f63007c));
                this.f62962a.mo60134a("radio_cursor", (Object) Integer.valueOf(tVar2.f63010f));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo61940a(String str, boolean z, String str2, Music music) {
        ((C33020g) ServiceManager.get().getService(C33020g.class)).mo60014a("data_challenge", str, str2, music, new C33021a(false) {
            /* renamed from: a */
            public final boolean mo61959a(String str, Challenge challenge) {
                C23853a.this.f62962a.mo60134a(str, (Object) challenge);
                return ((Boolean) C23853a.this.f62962a.mo60136b("is_busi_sticker", Boolean.valueOf(false))).booleanValue();
            }

            /* renamed from: a */
            public final void mo61958a(String str, Music music, boolean z) {
                C23853a.this.mo61941a(false, str, music, z);
            }
        });
    }

    /* renamed from: a */
    public final void mo61938a(MusicModel musicModel, String str, int i, int i2, int i3) {
        C1592h collectMusic = this.f62963b.collectMusic(str, i);
        C23858d dVar = new C23858d(this, musicModel, i, i2, i3);
        collectMusic.mo6876a((C1591g<TResult, TContinuationResult>) dVar, C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo61935a(MusicModel musicModel, int i, int i2, int i3, C1592h hVar) throws Exception {
        CollectionType collectionType;
        CollectionType collectionType2;
        if (hVar.mo6887c()) {
            return null;
        }
        if (hVar.mo6889d()) {
            if (i == 1) {
                collectionType2 = CollectionType.NOT_COLLECTED;
            } else {
                collectionType2 = CollectionType.COLLECTED;
            }
            musicModel.setCollectionType(collectionType2);
            C23820a aVar = new C23820a(1, i, i2, i3, musicModel);
            this.f62962a.mo60134a("music_collect_status", (Object) aVar);
        } else if (hVar.mo6882b()) {
            if (i == 1) {
                collectionType = CollectionType.COLLECTED;
            } else {
                collectionType = CollectionType.NOT_COLLECTED;
            }
            musicModel.setCollectionType(collectionType);
            C23820a aVar2 = new C23820a(0, i, i2, i3, musicModel);
            this.f62962a.mo60134a("music_collect_status", (Object) aVar2);
        }
        return null;
    }
}

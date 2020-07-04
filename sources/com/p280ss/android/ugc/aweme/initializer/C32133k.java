package com.p280ss.android.ugc.aweme.initializer;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.C33788d;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicDetail;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33785e;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33929af;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34017x;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y;
import com.p280ss.android.ugc.aweme.music.presenter.C33820o;
import com.p280ss.android.ugc.aweme.music.presenter.C33823p;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.port.p1479in.C35526aa;
import com.p280ss.android.ugc.aweme.port.p1479in.C35527ab;
import com.p280ss.android.ugc.aweme.port.p1479in.C35527ab.C35528a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35527ab.C35529b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35527ab.C35530c;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40250c;
import com.p280ss.android.ugc.aweme.shortvideo.presenter.C40216d;
import com.p280ss.android.ugc.aweme.shortvideo.presenter.C40217e;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.p280ss.android.ugc.p1716b.C43656b;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;
import com.p280ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.initializer.k */
public final class C32133k implements C35527ab {
    /* renamed from: a */
    public final String mo83261a(String str) {
        return C33785e.m108939a(str);
    }

    /* renamed from: a */
    public final UrlModel mo83258a(Object obj) {
        if (obj != null) {
            MusicModel musicModel = (MusicModel) obj;
            if (musicModel.getMusic() != null) {
                return musicModel.getMusic().getAudioTrack();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C35528a mo83259a(final C35529b bVar) {
        final C40217e eVar = new C40217e();
        eVar.mo66536a(new MusicListModel());
        eVar.mo66537a(new C40216d() {
            /* renamed from: a */
            public final void mo83271a(Exception exc, String str) {
                if (bVar != null) {
                    bVar.mo90341a(exc, str);
                }
            }

            /* renamed from: a */
            public final void mo83270a(MusicList musicList, String str) {
                if (bVar != null) {
                    ArrayList arrayList = null;
                    if (!(musicList == null || musicList.musicList == null)) {
                        arrayList = new ArrayList(musicList.musicList.size());
                        for (Music music : musicList.musicList) {
                            new C40250c();
                            arrayList.add(C40250c.m128598a(music.convertToMusicModel()));
                        }
                    }
                    bVar.mo90342a((List<AVMusic>) arrayList, str);
                }
            }
        });
        return new C35528a() {
            /* renamed from: a */
            public final boolean mo83272a(Object... objArr) {
                return eVar.mo56976a(objArr);
            }
        };
    }

    /* renamed from: b */
    public final int mo83267b(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            i = iArr[3];
        } else {
            StringBuilder sb = new StringBuilder("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ");
            sb.append(audioFileInfo);
            C42880h.m136156a(sb.toString());
            i = (int) C33784d.m108918a(str);
        }
        return i;
    }

    /* renamed from: a */
    public final boolean mo83265a(int i) {
        if (MusicType.LOCAL.ordinal() == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C44849d mo83260a(String str, String str2) {
        return new C34017x(str, str2);
    }

    /* renamed from: a */
    public final void mo83263a(AVMusic aVMusic, final C35530c cVar) {
        C43657a aVar = new C43657a();
        C43656b bVar = new C43656b();
        if (C6399b.m19944t()) {
            bVar.f112966a = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).isUseDownloader();
        }
        C33929af afVar = new C33929af(null, C34018y.f88721o);
        afVar.mo86590a(new C33788d() {
            /* renamed from: a */
            public final void mo67058a(String str, int i, String str2, int i2) {
                cVar.mo90343a(str, i, str2, i2);
            }

            /* renamed from: a */
            public final void mo67059a(String str, int i, String str2, Exception exc) {
                cVar.mo90344a(str, i, str2, exc);
            }

            /* renamed from: a */
            public final void mo67060a(String str, int i, String str2, float[] fArr) {
                cVar.mo90345a(str, i, str2, fArr);
            }
        });
        bVar.mo105599a((C43651a) afVar);
        bVar.mo105606a(((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getMusicService().mo83260a(aVMusic.getMusicId(), "draft_page"));
        if (aVMusic.getMusicType() == MusicType.ONLINE.ordinal()) {
            aVar.f112969b = 4;
            aVar.f112968a = aVMusic.getPath();
            bVar.mo105609b(aVar);
            return;
        }
        aVar.f112969b = 3;
        aVar.f112968a = aVMusic.getPath();
        bVar.mo105609b(aVar);
    }

    /* renamed from: a */
    public final void mo83264a(String str, final C35526aa aaVar) {
        C33820o oVar = new C33820o();
        oVar.mo66537a(new C33823p() {
            /* renamed from: b_ */
            public final void mo83269b_(Exception exc) {
                if (aaVar != null) {
                    aaVar.mo90340a(exc);
                }
            }

            /* renamed from: a */
            public final void mo83268a(MusicDetail musicDetail) {
                AVMusic aVMusic;
                if (aaVar != null) {
                    C35526aa aaVar = aaVar;
                    if (musicDetail.music != null) {
                        new C40250c();
                        aVMusic = C40250c.m128598a(musicDetail.music.convertToMusicModel());
                    } else {
                        aVMusic = null;
                    }
                    aaVar.mo90339a(aVMusic);
                }
            }
        });
        oVar.mo56976a(str, Integer.valueOf(0));
    }

    /* renamed from: a */
    public final boolean mo83266a(AVMusic aVMusic, Context context, boolean z) {
        return C33784d.m108930a(aVMusic, context, z);
    }

    /* renamed from: a */
    public final void mo83262a(Fragment fragment, int i, String str, int i2, Object obj, boolean z, Bundle bundle, String str2, String str3) {
        C33784d.m108928a(fragment, i, str, i2, null, z, bundle, str2, str3);
    }
}

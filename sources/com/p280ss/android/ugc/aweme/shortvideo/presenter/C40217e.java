package com.p280ss.android.ugc.aweme.shortvideo.presenter;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.legacy.download.C32331a;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44854e;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.p280ss.android.ugc.p1716b.C43650a;
import com.p280ss.android.ugc.p1716b.C43659c;
import java.io.File;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.e */
public final class C40217e extends C25652b<MusicListModel, C40216d> {
    /* renamed from: b */
    public final void mo56977b() {
        String str;
        super.mo56977b();
        if (((MusicListModel) this.f67571b).getData() == null) {
            mo57296a(new Exception());
            return;
        }
        List<Music> list = ((MusicList) ((MusicListModel) this.f67571b).getData()).musicList;
        if (C6307b.m19566a((Collection<T>) list)) {
            mo57296a(new IllegalArgumentException("empty music list."));
            return;
        }
        Music music = (Music) list.get(0);
        if (music.getPlayUrl() == null || C6307b.m19566a((Collection<T>) music.getPlayUrl().getUrlList())) {
            mo57296a(new IllegalArgumentException("music exists but no valid play url."));
            return;
        }
        String str2 = (String) music.getPlayUrl().getUrlList().get(0);
        String b = C43659c.m138324a().mo105614b();
        if (!C43650a.m138299a(b)) {
            new File(b).mkdirs();
        }
        if (b.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(C43650a.m138300b(str2));
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b);
            sb2.append(File.separator);
            sb2.append(C43650a.m138300b(str2));
            str = sb2.toString();
        }
        if (C7276d.m22812b(str)) {
            if (this.f67572c != null) {
                ((C40216d) this.f67572c).mo83270a((MusicList) ((MusicListModel) this.f67571b).getData(), str);
            }
            return;
        }
        final C44854e a = new C44856a().mo107294a(str2).mo107298b(str).mo107297a();
        C6726a.m20842a(new Runnable() {
            public final void run() {
                C32331a.m104891a(a, new C44849d() {
                    /* renamed from: a */
                    public final void mo59407a(int i) {
                    }

                    /* renamed from: a */
                    public final void mo59408a(int i, long j, long j2) {
                    }

                    /* renamed from: f */
                    public final void mo59418f() {
                    }

                    /* renamed from: g */
                    public final void mo59419g() {
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                if (C40217e.this.f67572c != null) {
                                    ((C40216d) C40217e.this.f67572c).mo83271a(new Exception("cancelled"), "task is cancelled");
                                }
                            }
                        });
                    }

                    /* renamed from: a */
                    public final void mo59411a(final C44850c cVar) {
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                if (C40217e.this.f67572c != null) {
                                    ((C40216d) C40217e.this.f67572c).mo83271a(new Exception(cVar.f115335b), cVar.f115335b);
                                }
                            }
                        });
                    }

                    /* renamed from: a */
                    public final void mo59412a(final String str) {
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                if (C40217e.this.f67572c != null) {
                                    ((C40216d) C40217e.this.f67572c).mo83270a((MusicList) ((MusicListModel) C40217e.this.f67571b).getData(), str);
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        if (this.f67572c != null) {
            ((C40216d) this.f67572c).mo83271a(exc, "");
        }
    }
}

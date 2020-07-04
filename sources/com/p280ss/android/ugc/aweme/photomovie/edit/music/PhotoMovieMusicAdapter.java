package com.p280ss.android.ugc.aweme.photomovie.edit.music;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.p1141b.C25653a;
import com.p280ss.android.ugc.aweme.common.p1141b.C25653a.C25655a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.iesdownload.C44854e;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.p1716b.C43650a;
import com.p280ss.android.ugc.p1716b.C43659c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicAdapter */
public class PhotoMovieMusicAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public volatile int f91026a;

    /* renamed from: b */
    public CopyOnWriteArrayList<C34908b> f91027b;

    /* renamed from: c */
    public C34903c f91028c;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicAdapter$a */
    class C34897a extends C1293v {
        C34897a(View view) {
            super(view);
            view.findViewById(R.id.b3n).setOnClickListener(new OnClickListener(PhotoMovieMusicAdapter.this) {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (PhotoMovieMusicAdapter.this.f91028c != null) {
                        PhotoMovieMusicAdapter.this.f91028c.mo88451a(null, null);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicAdapter$b */
    class C34899b extends C1293v {

        /* renamed from: a */
        public int f91032a;

        /* renamed from: c */
        private AVDmtImageTextView f91034c;

        /* renamed from: c */
        private void m112493c() {
            if (this.f91034c != null) {
                mo88449b();
                this.f91034c.mo103501a(((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(this.f91032a)).f91059e);
            }
        }

        /* renamed from: a */
        public final void mo88445a() {
            PhotoMovieMusicAdapter.this.notifyDataSetChanged();
            if (PhotoMovieMusicAdapter.this.f91028c != null) {
                PhotoMovieMusicAdapter.this.f91028c.mo88451a(((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(PhotoMovieMusicAdapter.this.f91026a)).f91057c, ((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(PhotoMovieMusicAdapter.this.f91026a)).f91055a);
            }
        }

        /* renamed from: b */
        public final void mo88449b() {
            switch (((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(this.f91032a)).f91058d) {
                case 0:
                    this.f91034c.mo103508c(true);
                    return;
                case 1:
                case 2:
                    this.f91034c.mo103508c(false);
                    break;
            }
        }

        /* renamed from: a */
        public final void mo88446a(final int i) {
            this.f91032a = i;
            m112493c();
            this.f91034c.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (PhotoMovieMusicAdapter.this.f91026a != i) {
                        if (((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(C34899b.this.f91032a)).f91058d == 1) {
                            PhotoMovieMusicAdapter.this.mo88441a(C34899b.this.f91032a);
                            C34899b.this.mo88445a();
                        } else if (((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(C34899b.this.f91032a)).f91058d != 0) {
                            String str = ((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(C34899b.this.f91032a)).f91056b;
                            if (!TextUtils.isEmpty(str)) {
                                ((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(C34899b.this.f91032a)).f91058d = 0;
                                C34899b.this.mo88449b();
                                if (C35574k.m114859a().mo70110y().mo83121f()) {
                                    C34899b.this.mo88448a(str, C34899b.this.f91032a);
                                    return;
                                }
                                C34899b.this.mo88447a(str);
                            }
                        }
                    }
                }
            });
            this.f91034c.mo103498a(((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(this.f91032a)).f91057c.getCoverMedium());
        }

        /* renamed from: a */
        public final void mo88447a(String str) {
            m112492a(new C44856a().mo107294a(str).mo107298b(((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(this.f91032a)).f91055a).mo107297a(), this.f91032a);
        }

        C34899b(View view) {
            super(view);
            this.f91034c = (AVDmtImageTextView) view.findViewById(R.id.b3n);
        }

        /* renamed from: a */
        private void m112492a(C44854e eVar, final int i) {
            C25653a.m84370a(eVar.f115342b, ((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(i)).f91055a, (C25655a) new C25655a() {
                /* renamed from: a */
                public final void mo66542a(String str, int i) {
                }

                /* renamed from: a */
                public final void mo66541a(String str) {
                    ((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(i)).f91058d = 1;
                    PhotoMovieMusicAdapter.this.mo88441a(i);
                    C6726a.m20844b(new C34911e(C34899b.this));
                    C6893q.m21444a("photomovie_edit_music_download_error_rate", 0, C6869c.m21381a().mo16882a("tools_use_downloader", Boolean.valueOf(false)).mo16887a("url", str).mo16888b());
                }

                /* renamed from: a */
                public final void mo66543a(String str, Exception exc) {
                    ((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(i)).f91058d = 2;
                    C6726a.m20844b(new C34912f(PhotoMovieMusicAdapter.this));
                    C6893q.m21444a("photomovie_edit_music_download_error_rate", 1, C6869c.m21381a().mo16882a("tools_use_downloader", Boolean.valueOf(false)).mo16887a("url", str).mo16888b());
                }
            });
        }

        /* renamed from: a */
        public final void mo88448a(String str, final int i) {
            Downloader.with(C35574k.m114861b()).url(str).name(C43650a.m138300b(((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(this.f91032a)).f91056b)).savePath(C43659c.m138324a().mo105614b()).subThreadListener(new AbsDownloadListener() {
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    super.onSuccessed(downloadInfo);
                    ((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(i)).f91058d = 1;
                    PhotoMovieMusicAdapter.this.mo88441a(i);
                    C6726a.m20844b(new C34909c(C34899b.this));
                    C6893q.m21444a("photomovie_edit_music_download_error_rate", 0, C6869c.m21381a().mo16882a("tools_use_downloader", Boolean.valueOf(true)).mo16887a("url", downloadInfo.getUrl()).mo16888b());
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    super.onFailed(downloadInfo, baseException);
                    ((C34908b) PhotoMovieMusicAdapter.this.f91027b.get(i)).f91058d = 2;
                    C6726a.m20844b(new C34910d(PhotoMovieMusicAdapter.this));
                    C6893q.m21444a("photomovie_edit_music_download_error_rate", 1, C6869c.m21381a().mo16882a("tools_use_downloader", Boolean.valueOf(true)).mo16887a("url", downloadInfo.getUrl()).mo16888b());
                }
            }).download();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicAdapter$c */
    public interface C34903c {
        /* renamed from: a */
        void mo88451a(AVMusic aVMusic, String str);
    }

    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    public int getItemCount() {
        return this.f91027b.size();
    }

    /* renamed from: b */
    private void m112488b(int i) {
        if (this.f91027b.size() > i) {
            ((C34908b) this.f91027b.get(i)).f91058d = 1;
            mo88441a(i);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo88441a(int i) {
        if (this.f91026a >= 0) {
            ((C34908b) this.f91027b.get(this.f91026a)).f91059e = false;
        }
        ((C34908b) this.f91027b.get(i)).f91059e = true;
        this.f91026a = i;
    }

    /* renamed from: a */
    private void m112487a(List<AVMusic> list) {
        this.f91027b = new CopyOnWriteArrayList<>();
        this.f91027b.add(new C34908b(new AVMusic()));
        for (AVMusic bVar : list) {
            this.f91027b.add(new C34908b(bVar));
        }
    }

    /* renamed from: a */
    public final void mo88443a(AVMusic aVMusic) {
        for (int i = 1; i < this.f91027b.size(); i++) {
            if (((C34908b) this.f91027b.get(i)).f91057c.getMid().equals(aVMusic.getMid())) {
                m112488b(i);
                return;
            }
        }
    }

    PhotoMovieMusicAdapter(List<AVMusic> list, AVMusic aVMusic) {
        m112487a(list);
        this.f91026a = m112486a((List<C34908b>) this.f91027b, aVMusic);
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (getItemViewType(i) == 2) {
            ((C34899b) vVar).mo88446a(i);
        }
    }

    /* renamed from: a */
    private static int m112486a(List<C34908b> list, AVMusic aVMusic) {
        if (aVMusic == null) {
            return -1;
        }
        for (int i = 1; i < list.size(); i++) {
            C34908b bVar = (C34908b) list.get(i);
            if (bVar.f91057c.getMusicName().equals(aVMusic.getMusicName())) {
                bVar.f91059e = true;
                return i;
            }
        }
        return 0;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C34897a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.akw, viewGroup, false));
        }
        return new C34899b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.akv, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo88442a(int i, AVMusic aVMusic) {
        if (!C6307b.m19566a((Collection<T>) this.f91027b) && this.f91027b.size() > 0) {
            this.f91027b.set(0, new C34908b(aVMusic));
            m112488b(0);
        }
    }
}

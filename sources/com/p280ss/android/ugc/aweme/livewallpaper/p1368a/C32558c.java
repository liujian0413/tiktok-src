package com.p280ss.android.ugc.aweme.livewallpaper.p1368a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity.C23247a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32569a;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32571c;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32577e;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.a.c */
public final class C32558c extends C32554a {
    /* renamed from: a */
    public final void mo59407a(int i) {
    }

    /* renamed from: f */
    public final void mo59418f() {
    }

    /* renamed from: g */
    public final void mo59419g() {
    }

    /* renamed from: j */
    private void m105431j() {
        mo83828a();
        C6726a.m20844b(new Runnable() {
            public final void run() {
                C32558c.this.mo83830b();
                C32558c.this.mo83841c(C32558c.this.f84895h);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo83835e() {
        mo83841c(this.f84895h);
        C32577e.m105498b(0, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo83836h() {
        mo83828a();
        C6726a.m20844b(new Runnable() {
            public final void run() {
                if (C32558c.this.f84889b != null && !C32558c.this.f84889b.isFinishing()) {
                    C32558c.this.mo83830b();
                    C10761a.m31399c((Context) C32558c.this.f84889b, (int) R.string.avg).mo25750a();
                }
            }
        });
    }

    /* renamed from: i */
    public final void mo83843i() {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                C32558c.this.mo83830b();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo83834d() {
        if (this.f84889b == null || this.f84889b.isFinishing()) {
            return "";
        }
        return this.f84889b.getString(R.string.c37);
    }

    /* renamed from: k */
    private void m105432k() {
        if (C32577e.m105495a((Context) this.f84889b, this.f84889b.getPackageName())) {
            C32571c.m105458a().mo83856a("video_share", new C32569a(this.f84888a.getAid()));
            return;
        }
        if (this.f84889b instanceof AmeSSActivity) {
            ((AmeSSActivity) this.f84889b).setOnActivityResultListener(new C23247a() {
                /* renamed from: a */
                public final void mo60510a(int i, int i2, Intent intent) {
                    if (i == 100 && C32577e.m105495a((Context) C32558c.this.f84889b, C32558c.this.f84889b.getPackageName())) {
                        C10761a.m31383a(C6399b.m19921a(), (int) R.string.dmg).mo25750a();
                        C32577e.m105491a(C32558c.this.f84888a.getAid(), "paper_set", true);
                        C32577e.m105486a(0, "");
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo83833c() {
        this.f84892e = C32577e.m105497b();
        this.f84893f = C6306c.m19561a(this.f84888a.getVideo().getPlayAddrH264().getUri());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f84892e);
        sb.append(this.f84893f);
        sb.append(".mp4");
        this.f84895h = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f84892e);
        sb2.append("temp/");
        sb2.append(this.f84893f);
        sb2.append(".mp4");
        this.f84894g = sb2.toString();
        if (!C7276d.m22812b(this.f84894g)) {
            C7276d.m22803a(this.f84894g, true);
        }
    }

    public C32558c(Activity activity) {
        super(activity);
        this.f84889b = activity;
    }

    /* renamed from: d */
    private boolean m105430d(String str) {
        String trim = str.trim();
        String substring = trim.substring(trim.lastIndexOf("/") + 1);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f84892e);
        sb.append(substring);
        this.f84895h = sb.toString();
        return C7276d.m22820d(str, this.f84895h);
    }

    /* renamed from: a */
    public final void mo59412a(String str) {
        if (str != null) {
            this.f84894g = str;
            if (str.length() == 0) {
                StringBuilder sb = new StringBuilder("LiveWallPaperHelper download file size == 0: ");
                sb.append(this.f84891d);
                C6921a.m21559a((Throwable) new Exception(sb.toString()));
                mo83836h();
                C32577e.m105498b(1, "file size == 0");
                return;
            }
            m105430d(str);
            m105431j();
            C32577e.m105498b(0, "");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo83832b(Aweme aweme) {
        String str;
        Video video = aweme.getVideo();
        if (video == null) {
            return false;
        }
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrH264 == null) {
            return false;
        }
        List urlList = playAddrH264.getUrlList();
        if (C6307b.m19566a((Collection<T>) urlList)) {
            return false;
        }
        if (urlList.size() > 2) {
            str = (String) urlList.get(2);
        } else {
            str = (String) urlList.get(0);
        }
        this.f84891d = C6806b.m21144a().mo16627a(str);
        if (!TextUtils.isEmpty(this.f84891d)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo83842d(final Aweme aweme) {
        if (aweme == null || aweme.getVideo() == null) {
            mo83843i();
            C32577e.m105498b(1, "aweme is empty");
            return;
        }
        final UrlModel cover = aweme.getVideo().getCover();
        if (cover == null) {
            mo83843i();
            C32577e.m105498b(1, "cover is empty");
            return;
        }
        C1592h.m7853a((Callable<TResult>) new Callable<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() throws Exception {
                List<String> urlList = cover.getUrlList();
                if (C6307b.m19566a((Collection<T>) urlList)) {
                    C32558c.this.mo83843i();
                    C32577e.m105498b(1, "urlList is empty");
                    return Boolean.valueOf(false);
                }
                for (String str : urlList) {
                    if (str != null) {
                        String a = C23323e.m76500a(str);
                        if (C7276d.m22812b(a)) {
                            int lastIndexOf = a.lastIndexOf("/") + 1;
                            if (lastIndexOf >= 0 && lastIndexOf < a.length()) {
                                String substring = a.substring(lastIndexOf);
                                if (!TextUtils.isEmpty(substring)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(C32577e.m105497b());
                                    sb.append(substring);
                                    String sb2 = sb.toString();
                                    if (C7276d.m22812b(sb2) || C7276d.m22820d(a, sb2)) {
                                        C32558c.this.mo83839a(aweme, sb2);
                                        return Boolean.valueOf(true);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return Boolean.valueOf(false);
            }
        }).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<Boolean, Object>() {
            public final Object then(C1592h<Boolean> hVar) throws Exception {
                if (hVar == null || !((Boolean) hVar.mo6890e()).booleanValue()) {
                    C32558c.this.mo83843i();
                    C32577e.m105498b(1, "copy video thumbnail fail");
                }
                return null;
            }
        });
    }

    /* renamed from: c */
    public final void mo83840c(final Aweme aweme) {
        if (aweme == null || C32577e.m105494a(this.f84889b, aweme.getAid())) {
            return;
        }
        if (this.f84889b == null || this.f84889b.isFinishing() || C32567d.m105451a(this.f84889b)) {
            Video video = aweme.getVideo();
            if (video != null) {
                UrlModel cover = video.getCover();
                if (cover != null) {
                    mo83831b(mo83834d());
                    C23323e.m76502a(cover, (C23328a) new C23328a() {
                        /* renamed from: a */
                        public final void mo60609a(C13346c<C13326a<C13645c>> cVar) {
                            C32558c.this.mo83842d(aweme);
                        }

                        /* renamed from: a */
                        public final void mo60610a(Exception exc) {
                            if (C32558c.this.f84889b != null && !C32558c.this.f84889b.isFinishing()) {
                                C10761a.m31399c((Context) C32558c.this.f84889b, (int) R.string.avg).mo25750a();
                                C32558c.this.mo83830b();
                                StringBuilder sb = new StringBuilder("request image fail ");
                                sb.append(exc.getMessage());
                                C32577e.m105498b(1, sb.toString());
                            }
                        }
                    });
                } else {
                    return;
                }
            }
            return;
        }
        C10761a.m31403c((Context) this.f84889b, this.f84889b.getString(R.string.dkd)).mo25750a();
    }

    /* renamed from: c */
    public final void mo83841c(String str) {
        int i;
        if (this.f84889b != null && !this.f84889b.isFinishing() && C7276d.m22812b(str) && this.f84888a != null) {
            Video video = this.f84888a.getVideo();
            int i2 = 0;
            if (video != null) {
                i2 = video.getWidth();
                i = video.getHeight();
            } else {
                i = 0;
            }
            C32571c.m105458a().f84924a.setId(this.f84888a.getAid());
            C32571c.m105458a().f84924a.setVideoPath(str);
            C32571c.m105458a().f84924a.setWidth(i2);
            C32571c.m105458a().f84924a.setHeight(i);
            C32571c.m105458a().f84924a.setSource("video_share");
            m105432k();
            C32571c.m105458a().mo83858b();
            C32571c.m105458a().mo83853a(this.f84889b);
        }
    }

    /* renamed from: a */
    public final void mo83839a(final Aweme aweme, final String str) {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                C32571c.m105458a().f84924a.setThumbnailPath(str);
                C32558c.this.mo83829a(aweme);
            }
        });
    }
}

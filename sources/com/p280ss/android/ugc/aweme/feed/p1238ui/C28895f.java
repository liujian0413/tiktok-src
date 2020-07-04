package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.p1378a.C32858a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33273o;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.f */
public abstract class C28895f extends C28894e {

    /* renamed from: a */
    protected C24723e f76180a;

    /* renamed from: b */
    protected OnClickListener f76181b = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickInstrumentation.onClick(view);
            if (C6399b.m19944t()) {
                if (C28895f.this.f76169g.getMusic() != null) {
                    str3 = String.valueOf(C28895f.this.f76169g.getMusic().getId());
                } else {
                    str3 = "";
                }
                C6907h.m21524a("homepage_hot_click_cover", (Map) C22984d.m75611a().mo59973a("music_id", str3).mo59973a("author_id", C28895f.this.f76169g.getAuthorUid()).mo59973a("group_id", C28895f.this.f76169g.getAid()).f60753a);
            }
            if (!C43122ff.m136767b()) {
                if (C25329c.m83221d(C28895f.this.f76169g) && C28895f.this.f76169g.getCommerceVideoAuthInfo() != null && C28895f.this.f76169g.getCommerceVideoAuthInfo().getAdSource() == 1) {
                    return;
                }
                if (C28895f.this.mo74167d()) {
                    if (!C28895f.this.mo74170i() && C28895f.this.f76180a != null) {
                        C28895f.this.f76180a.mo64715j();
                    }
                } else if (!C27326a.m89578a(view)) {
                    if (C43168s.m136909a(C28895f.this.f76169g)) {
                        C10761a.m31399c(C28895f.this.f76175m, (int) R.string.fsr).mo25750a();
                    } else if (C28895f.this.f76169g.isCanPlay() || !C28895f.m95073b(C28895f.this.f76169g)) {
                        if (C28895f.this.f76169g.getMusic() != null && C28895f.this.f76180a != null && C28895f.this.f76180a.mo64710e() && !C28895f.this.f76169g.getMusic().isAuthorDeleted()) {
                            C28895f.this.f76180a.mo64715j();
                            if (C28895f.this.f76169g.getMusic() == null || ((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(C28895f.this.f76169g.getMusic().convertToMusicModel(), C28895f.this.f76175m, true, C28895f.this.mo74169a(C28895f.this.f76169g))) {
                                SmartRouter.buildRoute(C28895f.this.f76175m, "aweme://music/detail/").withParam("id", C28895f.this.f76169g.getMusic().getMid()).withParam("aweme_id", C28895f.this.f76169g.getAid()).withParam("extra_music_from", C28895f.this.f76170h).withParam("sticker_id", C28895f.this.f76169g.getStickerIDs()).open(10086);
                                if (C28895f.this.f76169g.getMusic() == null || C28895f.this.f76169g.getMusic().getMid() == null) {
                                    str = "";
                                } else {
                                    str = String.valueOf(C28895f.this.f76169g.getMusic().getMid());
                                }
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("music_id", str);
                                    jSONObject.put("enter_method", "click_cover");
                                    jSONObject.put("group_id", C28895f.this.f76169g.getAid());
                                    String str4 = "is_photo";
                                    if (C28895f.this.f76169g.isImage()) {
                                        str2 = "1";
                                    } else {
                                        str2 = "0";
                                    }
                                    jSONObject.put(str4, str2);
                                    jSONObject.put("request_id", C33230ac.m107206a(C28895f.this.f76169g, C28895f.this.f76173k));
                                    if (!TextUtils.isEmpty(C33230ac.m107223e(C28895f.this.f76169g))) {
                                        jSONObject.put("poi_id", C33230ac.m107223e(C28895f.this.f76169g));
                                    }
                                    if (C33230ac.m107220c(C28895f.this.f76170h)) {
                                        jSONObject.put("poi_type", C33230ac.m107229h(C28895f.this.f76169g));
                                        jSONObject.put("poi_channel", C33230ac.m107214b());
                                        jSONObject.put("city_info", C33230ac.m107204a());
                                        jSONObject.put("distance_info", C33230ac.m107231i(C28895f.this.f76169g));
                                    }
                                } catch (JSONException unused) {
                                }
                                if (C28895f.this.f76174l != null) {
                                    C28895f.this.f76174l.mo60134a("feed_internal_event", (Object) new C28318an(35, C28895f.this.f76169g));
                                }
                                C6907h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName(C28895f.this.f76170h).setValue(C28895f.this.f76169g.getAid()).setExtValueString(str).setJsonObject(jSONObject));
                                String str5 = "click_cover";
                                if (view.getId() == R.id.c24) {
                                    str5 = "click_name";
                                }
                                ((C33273o) ((C33273o) ((C33273o) ((C33273o) ((C33273o) new C33273o().mo85071g(C28895f.this.f76169g).mo85047a(C28895f.this.f76175m)).mo85298f(C28895f.this.f76170h).mo85048a(str5)).mo85282a(Boolean.valueOf(C28482e.m93609b(C28895f.this.f76169g)))).mo85299g(C28895f.this.f76169g.getAid()).mo85301j(str).mo85293b(FeedParamProvider.m94273a(C28895f.this.f76175m).getPreviousPage()).mo85294c((String) C28895f.this.f76174l.mo60136b("playlist_type", "")).mo85296e((String) C28895f.this.f76174l.mo60136b("playlist_id", "")).mo85295d((String) C28895f.this.f76174l.mo60136b("playlist_id_key", "")).mo85283l((String) C28895f.this.f76174l.mo60136b("tab_name", ""))).mo85284m(C33230ac.m107216b(C28895f.this.f76169g, C28895f.this.f76173k))).mo85302k(C33230ac.m107206a(C28895f.this.f76169g, C28895f.this.f76173k)).mo85252e();
                                C28580o.m93830a(PAGE.MUSICAL);
                            } else {
                                return;
                            }
                        } else if (C28895f.this.f76169g.isAd() && !C28895f.this.f76180a.mo64710e()) {
                            C10761a.m31399c(C28895f.this.f76175m, (int) R.string.e3).mo25750a();
                        }
                        C42961az.m136380a(new C32858a());
                    } else if (C28895f.this.f76169g.isImage()) {
                        C10761a.m31399c(C28895f.this.f76175m, (int) R.string.bsx).mo25750a();
                    } else {
                        C10761a.m31399c(C28895f.this.f76175m, (int) R.string.fp_).mo25750a();
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo72018a() {
        mo74136j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo72019a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo72022b(DataCenter dataCenter) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo74136j();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo74098e() {
        if (super.mo74098e() || (C6399b.m19944t() && this.f76169g != null && this.f76169g.isWithPromotionalMusic())) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo74170i() {
        if (C6399b.m19944t() && this.f76169g.isAd() && this.f76169g.isWithPromotionalMusic()) {
            return TextUtils.equals(this.f76170h, "homepage_hot");
        }
        return false;
    }

    public C28895f(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo73803b(VideoItemParams videoItemParams) {
        super.mo73803b(videoItemParams);
        if (videoItemParams != null) {
            this.f76180a = videoItemParams.mAdViewController;
        }
    }

    /* renamed from: b */
    protected static boolean m95073b(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        Music music = aweme.getMusic();
        User author = aweme.getAuthor();
        if (!aweme.isLawCriticalCountry() || music == null || author == null || TextUtils.isEmpty(music.getOwnerId()) || !TextUtils.equals(music.getOwnerId(), author.getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo74169a(Aweme aweme) {
        if (!C25329c.m83221d(aweme) || this.f76180a == null || !this.f76180a.mo64710e()) {
            return false;
        }
        if (C25329c.m83223f(aweme) || C25329c.m83225h(aweme)) {
            return true;
        }
        return false;
    }
}

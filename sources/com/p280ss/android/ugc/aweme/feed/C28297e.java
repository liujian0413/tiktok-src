package com.p280ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.comment.abtest.C24033a;
import com.p280ss.android.ugc.aweme.comment.list.C24181g;
import com.p280ss.android.ugc.aweme.comment.param.C24201b;
import com.p280ss.android.ugc.aweme.comment.param.VideoCommentPageParam;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27754b;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.UnFavouritesDialog;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28458l;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28460m;
import com.p280ss.android.ugc.aweme.feed.p1238ui.DeleteDialog;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.setting.C37579ay;
import com.p280ss.android.ugc.aweme.setting.C37649i;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37637c;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37639e;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.e */
public final class C28297e extends C28230c implements C37637c, C37639e {

    /* renamed from: a */
    public C28460m f74581a;

    /* renamed from: i */
    private UnFavouritesDialog f74582i;

    /* renamed from: j */
    private C28343z<C28318an> f74583j;

    /* renamed from: k */
    private C28519d f74584k;

    /* renamed from: l */
    private Dialog f74585l;

    /* renamed from: m */
    private String f74586m;

    /* renamed from: n */
    private String f74587n;

    /* renamed from: o */
    private String f74588o;

    /* renamed from: p */
    private String f74589p;

    /* renamed from: q */
    private String f74590q = "";

    /* renamed from: r */
    private C38275x f74591r;

    /* renamed from: d */
    public final Activity mo71837d() {
        return this.f74355b;
    }

    /* renamed from: e */
    public final Context mo71838e() {
        return this.f74355b;
    }

    /* renamed from: f */
    public final Fragment mo71839f() {
        return this.f74356c;
    }

    /* renamed from: g */
    public final String mo71840g() {
        return this.f74359f;
    }

    /* renamed from: c */
    public final void mo71836c() {
        super.mo71836c();
        if (this.f74581a != null) {
            this.f74581a.mo66535W_();
        }
    }

    /* renamed from: h */
    public final void mo71987h() {
        C10761a.m31383a(mo71838e(), (int) R.string.dgt).mo25750a();
    }

    /* renamed from: i */
    public final void mo71988i() {
        C10761a.m31383a(mo71838e(), (int) R.string.tg).mo25750a();
    }

    /* renamed from: j */
    public final boolean mo71989j() {
        if (this.f74585l == null || !this.f74585l.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo71990k() {
        if (mo71989j()) {
            C28354g.m93169a(this.f74585l);
        }
    }

    /* renamed from: o */
    private void m93074o() {
        try {
            C0608j m = mo71842m();
            Fragment a = m.mo2644a("comment");
            if (a != null) {
                C0633q a2 = m.mo2645a();
                a2.mo2587a(a);
                a2.mo2604c();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo71830a() {
        this.f74581a = new C28460m(mo71838e());
        this.f74581a.mo66536a(new C28458l());
        m93074o();
    }

    /* renamed from: b */
    public final void mo71833b() {
        if (this.f74591r != null) {
            this.f74591r.mo95912a();
        }
    }

    /* renamed from: a */
    public final void mo71831a(String str) {
        this.f74590q = str;
    }

    /* renamed from: a_ */
    public final void mo71835a_(String str) {
        this.f74359f = str;
    }

    /* renamed from: a */
    public final void mo71985a(Exception exc) {
        C22814a.m75244a(mo71838e(), (Throwable) exc);
    }

    /* renamed from: b */
    public final void mo71986b(Exception exc) {
        C22814a.m75244a(mo71838e(), (Throwable) exc);
    }

    /* renamed from: b */
    private static boolean m93067b(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m93070d(Aweme aweme) {
        if (!C33230ac.m107241p(aweme) || !aweme.isProhibited()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private JSONObject m93072f(Aweme aweme) {
        return m93065a(((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(aweme, this.f74358e), aweme);
    }

    /* renamed from: g */
    private void m93073g(Aweme aweme) {
        if (mo71837d() != null && !mo71837d().isFinishing()) {
            if (this.f74582i == null) {
                this.f74582i = new UnFavouritesDialog(mo71837d(), aweme, this.f74357d);
            }
            try {
                if (!this.f74582i.isShowing()) {
                    this.f74582i.show();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private void m93071e(final Aweme aweme) {
        if ((aweme.getStatus() == null || aweme.getStatus().isPrivate()) && m92777a(aweme)) {
            new C10741a(mo71838e()).mo25657b((int) R.string.d55).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C6907h.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(aweme.getAid()));
                }
            }).mo25650a((int) R.string.bxq, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C28297e.this.f74581a.mo56976a(aweme.getAid(), Integer.valueOf(1));
                    C6907h.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(aweme.getAid()));
                }
            }).mo25656a().mo25637a();
        }
    }

    /* renamed from: c */
    private static boolean m93069c(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean booleanValue = ((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo59877d()).booleanValue();
        if (C43168s.m136912d(aweme) || C43168s.m136911c(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (aweme.getAuthor() == null || !C6319n.m19594a(C21115b.m71197a().getCurUserId(), aweme.getAuthor().getUid())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!booleanValue || !z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo62620a(C24201b bVar) {
        String str;
        CommentStruct commentStruct;
        Aweme aweme = bVar.f63881a;
        if (aweme != null) {
            if (mo71837d() == null) {
                C24033a.m78868b("getActivity() is null");
            } else if (m93070d(aweme)) {
                C10761a.m31399c((Context) mo71837d(), (int) R.string.w5).mo25750a();
            } else {
                VideoCommentPageParam requestId = new VideoCommentPageParam(aweme.getAid()).setRequestId(m93072f(aweme).optString("request_id"));
                if (aweme.getAuthor() != null) {
                    str = aweme.getAuthor().getUid();
                } else {
                    str = "";
                }
                VideoCommentPageParam eventType = ((VideoCommentPageParam) requestId.setAuthorUid(str)).setEventType(this.f74357d);
                boolean z = false;
                VideoCommentPageParam enableComment = eventType.setSource(0).setMyProfile(this.f74361h).setPlayListId(this.f74588o).setPlayListIdKey(this.f74587n).setPlayListType(this.f74586m).setPageType(this.f74358e).setTabName(this.f74589p).setEnableComment(!aweme.isCmtSwt());
                if (aweme.getAdCommentStruct() == null) {
                    commentStruct = null;
                } else {
                    commentStruct = aweme.getAdCommentStruct().setAid(aweme.getAid());
                }
                VideoCommentPageParam commentClose = enableComment.setAdCommentStruct(commentStruct).setCommentClose(C37649i.m120472b(aweme));
                if (!C37649i.m120472b(aweme) && !C37649i.m120471a(aweme)) {
                    z = true;
                }
                VideoCommentPageParam isLongItem = commentClose.setCommentLimited(z).forceRefresh(bVar.f63887g).setPoiId(bVar.f63886f).setScrollToTop(bVar.f63883c).setCreationId(bVar.f63896p).setIsLongItem(C32718a.m105909a(this.f74355b));
                if (!TextUtils.isEmpty(bVar.f63882b)) {
                    isLongItem.setInsertCids(bVar.f63882b, bVar.f63884d, bVar.f63885e);
                }
                C24181g showCommentList = C24217a.m79549a().showCommentList(mo71837d(), aweme, isLongItem);
                if (showCommentList != null) {
                    if (!showCommentList.isAdded() && aweme.getAuthor() != null && aweme.isCmtSwt()) {
                        if (aweme.getAuthor().isAdFake() || aweme.isAd()) {
                            StringBuilder sb = new StringBuilder(" aweme id = ");
                            sb.append(aweme.getAid());
                            sb.append(" author id = ");
                            sb.append(aweme.getAuthorUid());
                            sb.append(" current uid = ");
                            sb.append(C21115b.m71197a().getCurUserId());
                            C6921a.m21562b("CommentForbidRight", sb.toString());
                        } else {
                            StringBuilder sb2 = new StringBuilder(" aweme id = ");
                            sb2.append(aweme.getAid());
                            sb2.append(" author id = ");
                            sb2.append(aweme.getAuthorUid());
                            sb2.append(" current uid = ");
                            sb2.append(C21115b.m71197a().getCurUserId());
                            C6921a.m21562b("CommentForbidError", sb2.toString());
                        }
                    }
                    showCommentList.mo62627a(new C28347f(this, aweme));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71984a(Aweme aweme, C28318an anVar) {
        if (anVar.f74631a == 20) {
            this.f74581a.mo72198a(aweme, 0);
            m93071e(aweme);
        }
        if (!TextUtils.equals("homepage_follow", this.f74357d)) {
            C24217a.m79549a().sendCommentEvent(this.f74357d, aweme, m93072f(aweme), false, C29893a.m97882a());
        }
    }

    /* renamed from: b */
    private void m93066b(Activity activity, Aweme aweme) {
        Bundle bundle = new Bundle();
        bundle.putString("play_list_type", this.f74586m);
        bundle.putString("play_list_id_key", this.f74587n);
        bundle.putString("play_list_id_value", this.f74588o);
        bundle.putString("play_list_id", this.f74588o);
        bundle.putString("play_list_type", this.f74586m);
        bundle.putString("play_list_id_key", this.f74587n);
        bundle.putString("tab_name", this.f74589p);
        bundle.putString("event_type", this.f74584k.mo64928a(true));
        bundle.putString("enter_method", this.f74360g);
        this.f74585l = C37984ap.m121301a().sharePrivateAweme(activity, this.f74356c, aweme, this.f74583j, bundle);
    }

    /* renamed from: c */
    private void m93068c(Activity activity, Aweme aweme) {
        Bundle bundle = new Bundle();
        bundle.putString("play_list_type", this.f74586m);
        bundle.putString("play_list_id_key", this.f74587n);
        bundle.putString("play_list_id_value", this.f74588o);
        bundle.putString("play_list_id", this.f74588o);
        bundle.putString("play_list_type", this.f74586m);
        bundle.putString("play_list_id_key", this.f74587n);
        bundle.putString("tab_name", this.f74589p);
        bundle.putString("event_type", this.f74584k.mo64928a(true));
        bundle.putString("enter_method", this.f74360g);
        bundle.putString("creation_id", this.f74590q);
        this.f74585l = C37984ap.m121301a().shareAweme(activity, this.f74356c, aweme, this.f74583j, bundle);
    }

    /* renamed from: a */
    public final void mo71983a(Activity activity, Aweme aweme) {
        if (activity == null) {
            activity = mo71837d();
        }
        if (activity != null && !activity.isFinishing()) {
            if (C27754b.m90999a(aweme, this.f74357d)) {
                m93073g(aweme);
            } else if ((C33230ac.m107241p(aweme) && aweme.isProhibited()) || C32698a.m105819b(aweme)) {
                DeleteDialog deleteDialog = new DeleteDialog(activity, this.f74583j, this.f74357d, this.f74358e);
                deleteDialog.f75598b = aweme;
                deleteDialog.show();
            } else if (m93069c(aweme)) {
                m93066b(activity, aweme);
            } else {
                m93068c(activity, aweme);
            }
        }
    }

    /* renamed from: a */
    private JSONObject m93065a(JSONObject jSONObject, Aweme aweme) {
        if (this.f74360g != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("enter_from", this.f74357d);
                if ("like_banner".equals(this.f74360g)) {
                    jSONObject.put("previous_page", this.f74360g);
                } else {
                    jSONObject.put("enter_method", this.f74360g);
                }
                if (m93067b(aweme)) {
                    jSONObject.put("is_photo", 1);
                } else {
                    jSONObject.put("is_photo", 0);
                }
                jSONObject.put("author_id", aweme.getAuthorUid());
                if (!TextUtils.isEmpty(C33230ac.m107223e(aweme))) {
                    jSONObject.put("poi_id", C33230ac.m107223e(aweme));
                }
                if (C33230ac.m107220c(this.f74357d)) {
                    jSONObject.put("poi_type", C33230ac.m107229h(aweme));
                    jSONObject.put("city_info", C33230ac.m107204a());
                    jSONObject.put("distance_info", C33230ac.m107231i(aweme));
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
        throw new IllegalArgumentException();
    }

    public C28297e(String str, int i, C28343z<C28318an> zVar, C28519d dVar) {
        super(str, i);
        this.f74583j = zVar;
        this.f74584k = dVar;
        C37579ay.m120349a();
    }

    /* renamed from: a */
    public final void mo71832a(String str, String str2, String str3, String str4) {
        this.f74588o = str3;
        this.f74586m = str;
        this.f74587n = str2;
        this.f74589p = str4;
    }
}

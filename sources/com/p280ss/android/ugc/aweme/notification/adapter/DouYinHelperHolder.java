package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.content.C0683b;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.facebook.drawee.generic.C13438a;
import com.google.gson.C6600e;
import com.google.gson.JsonSyntaxException;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.application.C22863b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteRoundImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p280ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34351a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34366n;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.ChallengeNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p280ss.android.ugc.aweme.notification.adapter.C34392b.C34393a;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.C34586c;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.C34632a;
import com.p280ss.android.ugc.aweme.notification.utils.C34633b;
import com.p280ss.android.ugc.aweme.notification.utils.C34638g;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32266b;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32267c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C43011cf;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.DouYinHelperHolder */
public class DouYinHelperHolder extends BaseNotificationHolder implements OnClickListener {

    /* renamed from: A */
    private boolean f89681A;

    /* renamed from: B */
    private String f89682B;

    /* renamed from: C */
    private BaseNotice f89683C;

    /* renamed from: D */
    private boolean f89684D;

    /* renamed from: c */
    public TextView f89685c;

    /* renamed from: d */
    private AvatarImageView f89686d;

    /* renamed from: e */
    private ImageView f89687e;

    /* renamed from: f */
    private View f89688f;

    /* renamed from: g */
    private View f89689g;

    /* renamed from: h */
    private TextView f89690h;

    /* renamed from: i */
    private TextView f89691i;

    /* renamed from: j */
    private TextView f89692j;

    /* renamed from: k */
    private TextView f89693k;

    /* renamed from: l */
    private RemoteRoundImageView f89694l;

    /* renamed from: m */
    private Button f89695m;

    /* renamed from: n */
    private ConstraintLayout f89696n;

    /* renamed from: o */
    private View f89697o;

    /* renamed from: p */
    private Activity f89698p;

    /* renamed from: q */
    private String f89699q;

    /* renamed from: r */
    private boolean f89700r;

    /* renamed from: s */
    private User f89701s;

    /* renamed from: t */
    private String f89702t;

    /* renamed from: u */
    private String f89703u;

    /* renamed from: v */
    private String f89704v;

    /* renamed from: w */
    private String f89705w = "";

    /* renamed from: x */
    private int f89706x;

    /* renamed from: y */
    private boolean f89707y;

    /* renamed from: z */
    private boolean f89708z;

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.DouYinHelperHolder$a */
    public class C34385a extends ClickableSpan {
        public C34385a() {
        }

        public final void onClick(View view) {
            if (DouYinHelperHolder.this.f89685c.isEnabled()) {
                DouYinHelperHolder.this.mo87655c();
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
            textPaint.setColor(C0683b.m2912c(DouYinHelperHolder.this.itemView.getContext(), R.color.a4z));
            textPaint.setFakeBoldText(true);
        }
    }

    /* renamed from: a */
    public final void mo87654a(UserTextNotice userTextNotice) {
        String str;
        String schemaUrl = userTextNotice.getSchemaUrl();
        if (!TextUtils.isEmpty(schemaUrl)) {
            Uri parse = Uri.parse(schemaUrl);
            try {
                str = URLDecoder.decode(parse.getQueryParameter("android_pkg_name"), "UTF-8");
            } catch (Exception unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(parse.getScheme().toLowerCase())) {
                try {
                    C34632a.m111888a(this.f89698p, str, C6861a.m21337f().getCurUserId());
                    C6907h.onEvent(MobClick.obtain().setEventName("app_awake_from_fans_power").setLabelName("message_add"));
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87641a(BaseNotice baseNotice, boolean z, String str) {
        if (baseNotice != null) {
            this.f89683C = baseNotice;
            super.mo87641a(baseNotice, z, str);
            mo87642a(z);
            this.f89693k.setText(C43110ev.m136732a(this.f89698p, baseNotice.getCreateTime() * 1000));
            this.f89702t = null;
            if (baseNotice.getChallengeNotice() != null) {
                m111162a(baseNotice.getChallengeNotice());
            } else if (baseNotice.getAnnouncement() != null && baseNotice.getAnnouncement().getChallenge() != null) {
                m111166b(baseNotice.getAnnouncement());
            } else if (baseNotice.getAnnouncement() != null) {
                m111160a(baseNotice.getAnnouncement());
            } else if (baseNotice.getTextNotice() != null) {
                m111170c(baseNotice.getTextNotice());
            } else if (baseNotice.getAdHelperNotice() != null) {
                m111163a(baseNotice.getAdHelperNotice());
            } else if (baseNotice.getTcmNotice() != null) {
                m111164a(baseNotice.getTcmNotice());
            }
            m111180k();
            if (m111175f()) {
                C6907h.onEvent(MobClick.obtain().setEventName("toutiao_message_show").setLabelName("message_add"));
            }
            m111161a(baseNotice, "show");
        }
    }

    /* renamed from: f */
    private boolean m111175f() {
        if (this.f89683C != null && this.f89683C.getType() == 2) {
            UserTextNotice textNotice = this.f89683C.getTextNotice();
            if (textNotice != null && textNotice.getSubType() == 4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m111176g() {
        if (this.f89694l.getVisibility() == 0 || this.f89695m.getVisibility() == 0) {
            this.f89697o.setVisibility(0);
        } else {
            this.f89697o.setVisibility(8);
        }
    }

    /* renamed from: i */
    private String m111178i() {
        String str = "";
        if (this.f89706x == 5) {
            return "official_info";
        }
        if (this.f89706x == 9) {
            return "subscribe_account";
        }
        if (this.f89706x == 4) {
            return "douyin_assistant";
        }
        if (this.f89706x == 16) {
            return "starmap_assisstant";
        }
        if (this.f89706x == 17) {
            return "live_assistant";
        }
        if (this.f89706x == 10) {
            return "official_info";
        }
        if (this.f89706x == 62) {
            return "tcm";
        }
        return str;
    }

    /* renamed from: d */
    private void m111173d() {
        if (this.f89698p != null && this.f89683C != null) {
            C34351a adHelperNotice = this.f89683C.getAdHelperNotice();
            if (adHelperNotice != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("notice_id", this.f89683C.getNid());
                hashMap.put("aid", C22863b.f60589a);
                hashMap.put("channel", ((SchemaPageHelper) ServiceManager.get().getService(SchemaPageHelper.class)).getChannel());
                ((SchemaPageHelper) ServiceManager.get().getService(SchemaPageHelper.class)).openAdWebUrl(this.f89698p, adHelperNotice.f89520d, this.f89698p.getString(R.string.bpf), true, hashMap);
            }
        }
    }

    /* renamed from: h */
    private void m111177h() {
        if (this.f89706x == 10) {
            int type = this.f89683C.getType();
            if (type == 2 || type == 5) {
                C23323e.m76503a((RemoteImageView) this.f89686d, (int) R.drawable.bid);
            } else {
                C23323e.m76503a((RemoteImageView) this.f89686d, (int) R.drawable.bi_);
            }
        } else if (this.f89706x == 4) {
            C23323e.m76503a((RemoteImageView) this.f89686d, (int) R.drawable.bi_);
        } else if (this.f89706x == 5) {
            C23323e.m76503a((RemoteImageView) this.f89686d, (int) R.drawable.bid);
        } else if (this.f89706x == 7) {
            C23323e.m76503a((RemoteImageView) this.f89686d, (int) R.drawable.bi3);
        } else if (this.f89706x == 62) {
            C23323e.m76503a((RemoteImageView) this.f89686d, (int) R.drawable.bie);
        }
    }

    /* renamed from: c */
    public final void mo87655c() {
        if (this.f89706x != 7) {
            if (this.f89700r) {
                C7195s.m22438a().mo18679a(this.f89698p, this.f89699q);
                return;
            }
            if (this.f89701s != null) {
                C7195s a = C7195s.m22438a();
                Activity activity = this.f89698p;
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                sb.append(this.f89701s.getUid());
                a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", this.f89701s.getSecUid()).mo18695a());
            }
        }
    }

    /* renamed from: j */
    private void m111179j() {
        if (this.f89683C != null) {
            UserTextNotice textNotice = this.f89683C.getTextNotice();
            AnnouncementNotice announcement = this.f89683C.getAnnouncement();
            int type = this.f89683C.getType();
            String str = "";
            if (type == 1 || type == 12) {
                str = "douyin_assistant";
            } else if (type == 2 || type == 11) {
                str = "official_info";
            } else if (type == 61 || type == 62) {
                str = "starmap_assistant";
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.f89683C.getTcmNotice() != null) {
                    HashMap hashMap = new HashMap();
                    try {
                        hashMap = (HashMap) new C6600e().mo15974a(this.f89683C.getTcmNotice().f89567d, HashMap.class);
                    } catch (JsonSyntaxException unused) {
                    }
                    C6907h.m21524a("official_message_inner_message", (Map) C22984d.m75611a().mo59973a("account_type", str).mo59973a("action_type", "click").mo59974a(hashMap).f60753a);
                }
                if (textNotice != null) {
                    String objectId = textNotice.getObjectId();
                    int subType = textNotice.getSubType();
                    if (subType == 22) {
                        m111168b(objectId, str);
                    } else if (subType == 23) {
                        m111165a(objectId, str);
                    } else {
                        if (subType == 21) {
                            m111171c(objectId, str);
                        }
                    }
                } else if (announcement != null) {
                    String objectId2 = announcement.getObjectId();
                    int type2 = announcement.getType();
                    if (type2 == 3) {
                        m111168b(objectId2, str);
                    } else if (type2 == 4) {
                        m111165a(objectId2, str);
                    } else if (type2 == 1) {
                        m111171c(objectId2, str);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m111174e() {
        if (this.f89683C != null && this.f89683C.getType() == 2) {
            UserTextNotice textNotice = this.f89683C.getTextNotice();
            if (textNotice != null) {
                int subType = textNotice.getSubType();
                if (subType == 4) {
                    C6907h.onEvent(MobClick.obtain().setEventName("toutiao_message_click").setLabelName("message_add"));
                    m111167b(textNotice);
                    return;
                } else if (subType == 24) {
                    C6907h.m21524a("enter_violation_record", (Map) C22984d.m75611a().mo59973a("enter_from", "notification_page").mo59973a("enter_method", "message").f60753a);
                }
            }
        }
        m111179j();
        if (!((NotificationClickHelper) ServiceManager.get().getService(NotificationClickHelper.class)).handleClick(this.f89698p, this.f89707y, this.f89708z, this.f89681A, this.f89682B)) {
            Uri parse = Uri.parse(this.f89699q);
            if (TextUtils.equals(C22912d.f60641a, parse.getHost())) {
                if (!TextUtils.isEmpty(parse.getQueryParameter("rn_schema"))) {
                    C7195s.m22438a().mo18679a(this.f89698p, C32267c.m104784a(this.f89699q.replace(C34638g.m111900a(), "aweme")).mo83488a().toString());
                } else {
                    Intent handleAmeWebViewBrowserForDeeplink = ((SchemaPageHelper) ServiceManager.get().getService(SchemaPageHelper.class)).handleAmeWebViewBrowserForDeeplink((Context) this.f89698p, parse);
                    if (handleAmeWebViewBrowserForDeeplink != null) {
                        handleAmeWebViewBrowserForDeeplink.putExtra("hide_more", false);
                        handleAmeWebViewBrowserForDeeplink.putExtra("enter_from", "notification");
                        handleAmeWebViewBrowserForDeeplink.putExtra("bundle_user_webview_title", true);
                        this.f89698p.startActivity(handleAmeWebViewBrowserForDeeplink);
                    } else {
                        C7195s.m22438a().mo18679a(this.f89698p, this.f89699q);
                    }
                }
            } else if (m111169b(this.f89699q)) {
                Intent intent = new Intent();
                intent.putExtra("shoot_way", "direct_shoot");
                intent.putExtra("to_live", true);
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(this.f89698p, intent, true, true, ((IAVService) ServiceManager.get().getService(IAVService.class)).isRecording());
            } else if (m111172c(this.f89699q)) {
                ((SchemaPageHelper) ServiceManager.get().getService(SchemaPageHelper.class)).startAdsAppActivity(this.f89698p, this.f89699q.replace("aweme://stickers/detail/", "sslocal://stickers/detail/"));
            } else {
                if (TextUtils.isEmpty(this.f89705w)) {
                    this.f89705w = UUID.randomUUID().toString();
                }
                C7195s.m22438a().mo18679a(this.f89698p, C7203u.m22460a(this.f89699q).mo18694a("process_id", this.f89705w).mo18695a());
            }
        }
        if (!TextUtils.isEmpty(this.f89702t)) {
            C6909j jVar = new C6909j();
            jVar.mo16966a("user_type", this.f89702t);
            C6907h.onEvent(new MobClick().setEventName("challenge_click").setLabelName("message_add").setValue(this.f89703u).setExtValueString(this.f89704v).setJsonObject(jVar.mo16967a()));
        }
        m111161a(this.f89683C, "click");
    }

    /* renamed from: k */
    private void m111180k() {
        boolean z;
        if (this.f89684D) {
            float a = ((float) C9738o.m28691a((Context) this.f89698p)) - C9738o.m28708b((Context) this.f89698p, 92.0f);
            if (this.f89694l.getVisibility() == 0) {
                this.f89689g.setVisibility(8);
                a -= C9738o.m28708b((Context) this.f89698p, 54.0f);
            } else if (this.f89694l.getVisibility() == 4) {
                this.f89694l.setVisibility(8);
            }
            if (this.f89695m.getVisibility() == 0) {
                if (TextUtils.equals(this.f89695m.getText(), this.f89695m.getContext().getString(R.string.brl))) {
                    this.f89695m.setVisibility(8);
                    this.f89689g.setVisibility(0);
                    a -= C9738o.m28708b((Context) this.f89698p, 32.0f);
                } else {
                    this.f89689g.setVisibility(8);
                    a -= C9738o.m28708b((Context) this.f89698p, 100.0f);
                }
            } else if (this.f89695m.getVisibility() == 4) {
                this.f89695m.setVisibility(8);
            }
            if (this.f89693k.getVisibility() == 0) {
                this.f89693k.setVisibility(8);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f89662b) {
                spannableStringBuilder.append(8296);
            }
            if (this.f89685c.getVisibility() != 0 || TextUtils.isEmpty(this.f89685c.getText())) {
                z = false;
            } else {
                spannableStringBuilder.append(this.f89685c.getText());
                this.f89685c.setVisibility(8);
                z = true;
            }
            if (this.f89691i.getVisibility() == 0 && !TextUtils.isEmpty(this.f89691i.getText())) {
                spannableStringBuilder.append("#");
                spannableStringBuilder.append(this.f89691i.getText());
                this.f89691i.setVisibility(8);
                z = true;
            }
            if (this.f89692j.getVisibility() == 0 && !TextUtils.isEmpty(this.f89692j.getText())) {
                if (z) {
                    spannableStringBuilder.append(": ").setSpan(new C34385a(), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder.append(this.f89692j.getText());
            } else if (z) {
                spannableStringBuilder.setSpan(new C34385a(), 0, spannableStringBuilder.length(), 33);
            }
            if (this.f89662b) {
                spannableStringBuilder.append(8297);
            }
            C34586c.m111818a(this.f89692j, spannableStringBuilder, this.f89683C, 10, (int) a);
            this.f89692j.setVisibility(0);
        }
    }

    /* renamed from: b */
    private static boolean m111169b(String str) {
        return C43011cf.m136512a(str);
    }

    /* renamed from: c */
    private static boolean m111172c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("aweme://stickers/detail/")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo87642a(boolean z) {
        super.mo87642a(z);
        if (z) {
            this.f89688f.setVisibility(8);
            C32266b.m104782a(this.f89696n);
            return;
        }
        this.f89688f.setVisibility(0);
        C32266b.m104783a(this.f89696n, R.drawable.cny, R.color.ato);
    }

    /* renamed from: b */
    private void m111167b(final UserTextNotice userTextNotice) {
        new C11030a(this.f89698p).mo26647b((CharSequence) this.f89698p.getString(R.string.bt4, new Object[]{this.f89698p.getString(R.string.bw2)})).mo26635a((int) R.string.bt3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DouYinHelperHolder.this.mo87654a(userTextNotice);
            }
        }).mo26646b((int) R.string.w_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).mo26642a(false).mo26649b();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!mo87652b() && !C27326a.m89578a(view)) {
            super.onClick(view);
            int id = view.getId();
            if (id == R.id.c68 || id == R.id.c6a) {
                mo87655c();
            } else if (id != R.id.c6c && id != R.id.c69 && id != R.id.c5o) {
                if (id == R.id.c6f) {
                    m111174e();
                }
            } else if (this.f89706x == 7) {
                m111173d();
            } else {
                m111174e();
            }
        }
    }

    /* renamed from: a */
    private void m111160a(AnnouncementNotice announcementNotice) {
        this.f89700r = true;
        this.f89690h.setVisibility(8);
        if (announcementNotice.getType() == 1) {
            this.f89685c.setVisibility(8);
            this.f89691i.setText(announcementNotice.getTitle());
            this.f89691i.setVisibility(0);
        } else {
            this.f89685c.setText(announcementNotice.getTitle());
            this.f89685c.setVisibility(0);
            this.f89691i.setVisibility(8);
        }
        this.f89687e.setVisibility(8);
        this.f89692j.setVisibility(0);
        m111177h();
        this.f89685c.setText(announcementNotice.getTitle());
        this.f89692j.setText(announcementNotice.getContent());
        this.f89699q = announcementNotice.getSchemaUrl();
        if (announcementNotice.getType() == 3) {
            this.f89695m.setText(R.string.bq_);
        } else if (announcementNotice.getType() == 4) {
            this.f89695m.setText(R.string.bqa);
        } else if (announcementNotice.getType() == 1) {
            this.f89695m.setText(R.string.bm0);
        } else {
            this.f89695m.setText(R.string.brl);
        }
        if (C6319n.m19593a(this.f89699q)) {
            this.f89695m.setVisibility(8);
            this.f89694l.setVisibility(4);
            this.f89696n.setEnabled(false);
            this.f89685c.setEnabled(false);
            this.f89686d.setEnabled(false);
        } else {
            if (announcementNotice.getImageUrl() != null) {
                this.f89695m.setVisibility(4);
                this.f89694l.setVisibility(0);
                C23323e.m76524b(this.f89694l, announcementNotice.getImageUrl());
            } else {
                this.f89695m.setVisibility(0);
                this.f89694l.setVisibility(4);
            }
            this.f89696n.setEnabled(true);
            this.f89685c.setEnabled(true);
            this.f89686d.setEnabled(true);
        }
        m111176g();
    }

    /* renamed from: b */
    private void m111166b(AnnouncementNotice announcementNotice) {
        String str;
        String str2;
        this.f89700r = true;
        Challenge challenge = announcementNotice.getChallenge();
        this.f89685c.setVisibility(8);
        this.f89690h.setVisibility(8);
        this.f89691i.setVisibility(0);
        this.f89687e.setVisibility(8);
        this.f89694l.setVisibility(4);
        this.f89695m.setVisibility(0);
        this.f89692j.setVisibility(0);
        this.f89695m.setText(R.string.bm0);
        m111177h();
        this.f89701s = challenge.getAuthor();
        this.f89691i.setText(challenge.getChallengeName());
        this.f89692j.setText(announcementNotice.getContent());
        StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
        sb.append(challenge.getCid());
        C7203u a = C7203u.m22460a(sb.toString());
        String str3 = "is_commerce";
        if (((NoticeChallengePropertyUtil) ServiceManager.get().getService(NoticeChallengePropertyUtil.class)).isCommerce(challenge)) {
            str = "1";
        } else {
            str = "0";
        }
        this.f89699q = a.mo18694a(str3, str).mo18695a();
        this.f89702t = "official";
        this.f89703u = challenge.getCid();
        if (this.f89701s == null) {
            str2 = "";
        } else {
            str2 = this.f89701s.getUid();
        }
        this.f89704v = str2;
        m111176g();
    }

    /* renamed from: a */
    private void m111162a(ChallengeNotice challengeNotice) {
        String str;
        String str2;
        if (challengeNotice.getChallenge() != null) {
            this.f89700r = false;
            Challenge challenge = challengeNotice.getChallenge();
            this.f89685c.setVisibility(0);
            this.f89690h.setVisibility(0);
            this.f89691i.setVisibility(0);
            this.f89687e.setVisibility(8);
            this.f89694l.setVisibility(4);
            this.f89695m.setVisibility(0);
            this.f89692j.setVisibility(8);
            User author = challenge.getAuthor();
            if (author != null) {
                C23323e.m76524b(this.f89686d, author.getAvatarThumb());
                this.f89685c.setText(author.getNickname());
            }
            this.f89691i.setText(challenge.getChallengeName());
            this.f89701s = challenge.getAuthor();
            StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
            sb.append(challenge.getCid());
            C7203u a = C7203u.m22460a(sb.toString());
            String str3 = "is_commerce";
            if (((NoticeChallengePropertyUtil) ServiceManager.get().getService(NoticeChallengePropertyUtil.class)).isCommerce(challenge)) {
                str = "1";
            } else {
                str = "0";
            }
            this.f89699q = a.mo18694a(str3, str).mo18695a();
            this.f89702t = "peer";
            this.f89703u = challenge.getCid();
            if (this.f89701s == null) {
                str2 = "";
            } else {
                str2 = this.f89701s.getUid();
            }
            this.f89704v = str2;
            m111176g();
        }
    }

    /* renamed from: c */
    private void m111170c(UserTextNotice userTextNotice) {
        this.f89700r = true;
        this.f89690h.setVisibility(8);
        if (userTextNotice.getSubType() == 21) {
            this.f89685c.setVisibility(8);
            this.f89691i.setText(userTextNotice.getTitle());
            this.f89691i.setVisibility(0);
        } else {
            this.f89685c.setText(userTextNotice.getTitle());
            this.f89685c.setVisibility(0);
            this.f89691i.setVisibility(8);
        }
        this.f89687e.setVisibility(8);
        this.f89692j.setVisibility(0);
        m111177h();
        this.f89685c.setText(userTextNotice.getTitle());
        this.f89692j.setText(userTextNotice.getContent());
        this.f89699q = userTextNotice.getSchemaUrl();
        if (this.f89699q.startsWith(WebKitApi.SCHEME_HTTP)) {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            sb.append(Uri.encode(this.f89699q));
            this.f89699q = sb.toString();
        }
        Uri parse = Uri.parse(this.f89699q);
        this.f89708z = parse.getBooleanQueryParameter("effects", false);
        this.f89707y = parse.getBooleanQueryParameter("blur", false);
        this.f89681A = parse.getBooleanQueryParameter("duet", false);
        this.f89682B = parse.getQueryParameter("aweme_id");
        if (this.f89681A && !TextUtils.isEmpty(this.f89682B)) {
            this.f89695m.setText(R.string.d_2);
        } else if (m111169b(this.f89699q)) {
            this.f89695m.setText(R.string.bqd);
        } else if (userTextNotice.getSubType() == 22) {
            this.f89695m.setText(R.string.bq_);
        } else if (userTextNotice.getSubType() == 23) {
            this.f89695m.setText(R.string.bqa);
        } else if (userTextNotice.getSubType() == 21) {
            this.f89695m.setText(R.string.bm0);
        } else {
            this.f89695m.setText(R.string.brl);
        }
        if (C6319n.m19593a(userTextNotice.getTitle())) {
            this.f89685c.setVisibility(8);
            this.f89691i.setVisibility(8);
        }
        if (C6319n.m19593a(this.f89699q)) {
            this.f89695m.setVisibility(8);
            this.f89694l.setVisibility(4);
            this.f89696n.setEnabled(false);
            this.f89685c.setEnabled(false);
            this.f89686d.setEnabled(false);
        } else {
            if (userTextNotice.getImageUrl() == null || this.f89681A) {
                if (this.f89708z) {
                    this.f89695m.setVisibility(4);
                } else {
                    this.f89695m.setVisibility(0);
                }
                this.f89694l.setVisibility(4);
            } else {
                this.f89695m.setVisibility(4);
                this.f89694l.setVisibility(0);
                C23323e.m76524b(this.f89694l, userTextNotice.getImageUrl());
            }
            this.f89696n.setEnabled(true);
            this.f89685c.setEnabled(true);
            this.f89686d.setEnabled(true);
        }
        m111176g();
    }

    /* renamed from: a */
    private void m111163a(C34351a aVar) {
        this.f89700r = true;
        this.f89685c.setVisibility(0);
        this.f89690h.setVisibility(8);
        this.f89691i.setVisibility(8);
        this.f89687e.setVisibility(8);
        this.f89692j.setVisibility(0);
        m111177h();
        this.f89685c.setText(aVar.f89518b);
        this.f89692j.setText(aVar.f89517a);
        this.f89699q = aVar.f89519c;
        if (this.f89699q.startsWith(WebKitApi.SCHEME_HTTP)) {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            sb.append(this.f89699q);
            this.f89699q = sb.toString();
        }
        this.f89695m.setText(R.string.bgh);
        if (C6319n.m19593a(aVar.f89518b)) {
            this.f89685c.setVisibility(8);
        }
        if (C6319n.m19593a(this.f89699q)) {
            this.f89695m.setVisibility(8);
            this.f89694l.setVisibility(4);
            this.f89696n.setEnabled(false);
            this.f89685c.setEnabled(false);
            this.f89686d.setEnabled(false);
        } else {
            if (aVar.f89522f != null) {
                this.f89695m.setVisibility(4);
                this.f89694l.setVisibility(0);
                C23323e.m76524b(this.f89694l, aVar.f89522f);
            } else {
                this.f89695m.setVisibility(0);
                this.f89694l.setVisibility(4);
            }
            this.f89696n.setEnabled(true);
            this.f89685c.setEnabled(true);
            this.f89686d.setEnabled(true);
        }
        m111176g();
    }

    /* renamed from: a */
    private void m111164a(C34366n nVar) {
        HashMap hashMap;
        this.f89700r = true;
        this.f89690h.setVisibility(8);
        this.f89685c.setText(nVar.f89564a);
        this.f89685c.setVisibility(0);
        this.f89691i.setVisibility(8);
        this.f89687e.setVisibility(8);
        this.f89692j.setVisibility(0);
        m111177h();
        this.f89685c.setText(nVar.f89564a);
        this.f89692j.setText(nVar.f89565b);
        this.f89699q = nVar.f89566c;
        if (this.f89699q.startsWith(WebKitApi.SCHEME_HTTP)) {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            sb.append(Uri.encode(this.f89699q));
            this.f89699q = sb.toString();
        }
        Uri parse = Uri.parse(this.f89699q);
        this.f89708z = parse.getBooleanQueryParameter("effects", false);
        this.f89707y = parse.getBooleanQueryParameter("blur", false);
        this.f89681A = parse.getBooleanQueryParameter("duet", false);
        this.f89682B = parse.getQueryParameter("aweme_id");
        if (!this.f89681A || TextUtils.isEmpty(this.f89682B)) {
            this.f89695m.setText(R.string.brl);
        } else {
            this.f89695m.setText(R.string.d_2);
        }
        if (C6319n.m19593a(nVar.f89564a)) {
            this.f89685c.setVisibility(8);
            this.f89691i.setVisibility(8);
        }
        if (C6319n.m19593a(this.f89699q)) {
            this.f89695m.setVisibility(8);
            this.f89694l.setVisibility(4);
            this.f89696n.setEnabled(false);
            this.f89685c.setEnabled(false);
            this.f89686d.setEnabled(false);
        } else {
            if (this.f89708z) {
                this.f89695m.setVisibility(4);
            } else {
                this.f89695m.setVisibility(0);
            }
            this.f89694l.setVisibility(4);
            this.f89696n.setEnabled(true);
            this.f89685c.setEnabled(true);
            this.f89686d.setEnabled(true);
        }
        m111176g();
        try {
            hashMap = (HashMap) new C6600e().mo15974a(nVar.f89567d, HashMap.class);
        } catch (JsonSyntaxException unused) {
            hashMap = new HashMap();
        }
        C6907h.m21524a("official_message_inner_message", (Map) C22984d.m75611a().mo59973a("account_type", "starmap_assistant").mo59973a("action_type", "show").mo59974a(hashMap).f60753a);
    }

    /* renamed from: a */
    private static void m111165a(String str, String str2) {
        C6907h.m21524a("enter_prop_detail", (Map) C22984d.m75611a().mo59973a("previous_page", "message").mo59973a("account_type", str2).mo59973a("prop_id", str).f60753a);
    }

    /* renamed from: b */
    private static void m111168b(String str, String str2) {
        C6907h.m21524a("enter_music_detail", (Map) C22984d.m75611a().mo59973a("previous_page", "message").mo59973a("account_type", str2).mo59973a("music_id", str).f60753a);
    }

    /* renamed from: c */
    private void m111171c(String str, String str2) {
        this.f89705w = UUID.randomUUID().toString();
        C6907h.m21524a("enter_tag_detail", (Map) C22984d.m75611a().mo59973a("previous_page", "message").mo59973a("account_type", str2).mo59973a("process_id", this.f89705w).mo59973a("tag_id", str).f60753a);
    }

    /* renamed from: a */
    private void m111161a(BaseNotice baseNotice, String str) {
        long taskId = baseNotice.getTaskId();
        String i = m111178i();
        if (!TextUtils.isEmpty(i)) {
            C22984d a = C22984d.m75611a().mo59973a("action_type", str).mo59973a("account_type", i).mo59973a("content_id", baseNotice.getNid());
            if (this.f89706x == 5) {
                if (C34633b.m111889a(this.f89683C)) {
                    a.mo59973a("content_type", "online_contract");
                } else {
                    a.mo59973a("content_type", "");
                }
            }
            a.mo59971a("task_id", taskId);
            C6907h.m21524a("official_message_inner_message", (Map) a.f60753a);
        }
    }

    public DouYinHelperHolder(View view, Activity activity, int i, boolean z) {
        super(view);
        this.f89698p = activity;
        this.f89706x = i;
        this.f89684D = z;
        this.f89686d = (AvatarImageView) view.findViewById(R.id.c68);
        ((C13438a) this.f89686d.getHierarchy()).mo32898b((int) R.color.g);
        this.f89687e = (ImageView) view.findViewById(R.id.c6b);
        this.f89688f = view.findViewById(R.id.c6e);
        this.f89685c = (TextView) view.findViewById(R.id.c6a);
        this.f89690h = (TextView) view.findViewById(R.id.c67);
        this.f89691i = (TextView) view.findViewById(R.id.c65);
        this.f89692j = (TextView) view.findViewById(R.id.c66);
        this.f89693k = (TextView) view.findViewById(R.id.c6d);
        this.f89694l = (RemoteRoundImageView) view.findViewById(R.id.c6f);
        this.f89695m = (Button) view.findViewById(R.id.c69);
        this.f89696n = (ConstraintLayout) view.findViewById(R.id.c6c);
        this.f89697o = view.findViewById(R.id.c6_);
        C34626j.m111876a(this.f89685c);
        C34626j.m111876a(this.f89695m);
        this.f89686d.setOnClickListener(this);
        this.f89685c.setOnClickListener(this);
        this.f89696n.setOnClickListener(this);
        this.f89695m.setOnClickListener(this);
        this.f89694l.setOnClickListener(this);
        if (z) {
            this.f89692j.setMovementMethod(C34393a.m111245a());
            this.f89692j.setClickable(false);
            this.f89692j.setLongClickable(false);
            this.f89689g = view.findViewById(R.id.c5o);
            this.f89689g.setOnClickListener(this);
        }
        this.f89662b = C43057di.m136601a(this.f89692j.getContext());
    }
}

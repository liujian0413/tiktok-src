package com.p280ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22596c;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p1029d.C22915b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity.C23247a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23480h;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.comment.abtest.DouyinDirectShowCommentMentionList;
import com.p280ss.android.ugc.aweme.comment.api.C24084a;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24031c;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24088b;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24091b;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24115l;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24125t;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24126u;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24130a;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24131b;
import com.p280ss.android.ugc.aweme.comment.p1100g.C24135a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.p1102i.C24171a;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentListFragment;
import com.p280ss.android.ugc.aweme.comment.p1103ui.KeyboardDialogFragment;
import com.p280ss.android.ugc.aweme.comment.p1103ui.KeyboardDialogFragment.C24298a;
import com.p280ss.android.ugc.aweme.comment.p1103ui.KeyboardDialogFragment.C24299b;
import com.p280ss.android.ugc.aweme.comment.p1103ui.KeyboardDialogFragment.C24300c;
import com.p280ss.android.ugc.aweme.comment.param.C24199a;
import com.p280ss.android.ugc.aweme.comment.param.C24203c.C24204a;
import com.p280ss.android.ugc.aweme.comment.param.C24205d.C24206a;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.comment.share.C24239a;
import com.p280ss.android.ugc.aweme.comment.share.C24242c;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24655d;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26682g;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27508b;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p280ss.android.ugc.aweme.forward.p1268b.C29876a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C37649i;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43167r;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.comment.d */
public final class C24093d implements C23247a, C24088b, C24126u, C24171a, C24298a, C24299b, C24300c {

    /* renamed from: a */
    public Fragment f63698a;

    /* renamed from: b */
    public HashSet<User> f63699b = new HashSet<>();

    /* renamed from: c */
    public C24115l f63700c;

    /* renamed from: d */
    public C24125t f63701d;

    /* renamed from: e */
    public int f63702e;

    /* renamed from: f */
    public C24098a f63703f;

    /* renamed from: g */
    public DataCenter f63704g;

    /* renamed from: h */
    private MentionEditText f63705h;

    /* renamed from: i */
    private C24222c f63706i;

    /* renamed from: j */
    private String f63707j;

    /* renamed from: k */
    private boolean f63708k;

    /* renamed from: l */
    private boolean f63709l;

    /* renamed from: m */
    private boolean f63710m = C24148e.m79342a();

    /* renamed from: n */
    private int f63711n;

    /* renamed from: o */
    private String f63712o;

    /* renamed from: p */
    private Emoji f63713p;

    /* renamed from: q */
    private int f63714q = 0;

    /* renamed from: r */
    private OnClickListener f63715r;

    /* renamed from: s */
    private View f63716s;

    /* renamed from: t */
    private boolean f63717t = false;

    /* renamed from: u */
    private List<EditText> f63718u = new CopyOnWriteArrayList();

    /* renamed from: v */
    private C24021a f63719v;

    /* renamed from: com.ss.android.ugc.aweme.comment.d$a */
    public interface C24098a {
        /* renamed from: a */
        int mo62508a();
    }

    /* renamed from: a */
    public final void mo62470a(EditText editText) {
        if (editText != null && this.f63718u.contains(editText) && !this.f63717t) {
            this.f63717t = true;
            for (EditText editText2 : this.f63718u) {
                if (editText2 != editText && !C23480h.m77087a(editText2.getText(), editText.getText())) {
                    editText2.setText(editText.getText());
                }
            }
            this.f63717t = false;
        }
    }

    /* renamed from: a */
    public final void mo62431a(MentionEditText mentionEditText, View view, View view2, String str, String str2) {
        this.f63712o = str2;
        this.f63705h = mentionEditText;
        mo62487b((EditText) this.f63705h);
        if (this.f63698a != null && this.f63705h != null) {
            if (this.f63698a.getContext() != null) {
                this.f63705h.setMentionTextColor(C0683b.m2912c(this.f63698a.getContext(), R.color.a4q));
            }
            this.f63715r = new C24100e(this, str2, str);
            this.f63705h.setOnClickListener(this.f63715r);
            this.f63705h.setFocusable(false);
            this.f63705h.setFocusableInTouchMode(false);
            this.f63705h.setInputType(0);
            if (view != null) {
                if (C22596c.m74673a().mo59240a()) {
                    view.setVisibility(8);
                }
                view.setOnClickListener(new C24129f(this, str2, str, mentionEditText));
            }
            if (view2 != null) {
                if (C22596c.m74673a().mo59240a()) {
                    view2.setVisibility(8);
                }
                view2.setOnClickListener(new C24134g(this, str2, str, mentionEditText));
            }
            mo62465a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62482a(String str, String str2, View view) {
        Context context = this.f63698a != null ? this.f63698a.getContext() : null;
        if (context == null) {
            context = C6399b.m19921a();
        }
        if (!m79107y() || C27326a.m89578a(view)) {
            return;
        }
        if (C22596c.m74673a().mo59240a()) {
            C10761a.m31409e(context, (int) R.string.e5m).mo25750a();
        } else if (!m79103u()) {
            if (!C6861a.m21337f().isLogin()) {
                C32656f.m105743a((Activity) this.f63698a.getActivity(), str, "click_type_comment", C42914ab.m136242a().mo104633a("login_title", this.f63698a.getString(R.string.a7i)).mo104633a("group_id", str2).mo104633a("log_pb", C33230ac.m107234j(str2)).f111445a);
            } else if (C43122ff.m136767b()) {
                C10761a.m31409e(context, (int) R.string.a3c).mo25750a();
            } else if (!mo62500e()) {
                if (!m79104v()) {
                    C10761a.m31409e(context, (int) R.string.foh).mo25750a();
                } else if (this.f63714q == 1) {
                    C10761a.m31409e(context, (int) R.string.a9b).mo25750a();
                } else {
                    if (this.f63706i.mo63004j() != null && !C43168s.m136912d(this.f63706i.mo63004j())) {
                        this.f63709l = true;
                        if (view instanceof MentionEditText) {
                            mo62477a(((MentionEditText) view).getHint(), false);
                            return;
                        }
                        mo62436f();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62483a(String str, String str2, MentionEditText mentionEditText, View view) {
        if (m79107y()) {
            if (!C6861a.m21337f().isLogin()) {
                C32656f.m105743a((Activity) this.f63698a.getActivity(), str, "click_comment_emotion", C42914ab.m136242a().mo104633a("login_title", this.f63698a.getString(R.string.a7i)).mo104633a("group_id", str2).mo104633a("log_pb", C33230ac.m107234j(str2)).f111445a);
            } else if (!mo62500e()) {
                mo62477a(mentionEditText.getHint(), true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62469a(View view) {
        Resources resources = this.f63716s.getResources();
        CharSequence[] charSequenceArr = {resources.getString(R.string.dfp), resources.getString(R.string.w_)};
        C25712a aVar = new C25712a(view.getContext());
        aVar.mo66614a(charSequenceArr, (DialogInterface.OnClickListener) new C24173k(this));
        aVar.mo66615b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62468a(DialogInterface dialogInterface, int i) {
        String str;
        if (i == 0) {
            Aweme j = this.f63706i.mo63004j();
            FragmentActivity activity = this.f63698a.getActivity();
            if (activity != null) {
                String str2 = null;
                if (j != null) {
                    str2 = j.getAid();
                    str = j.getAuthorUid();
                } else {
                    str = null;
                }
                C24220a.m79551a().report(activity, j, str2, str);
                C10761a.m31410e(this.f63716s.getContext(), "举报了").mo25750a();
            }
        }
    }

    /* renamed from: a */
    public final void mo62427a(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Comment comment, C24091b bVar) {
        final C24091b bVar2 = bVar;
        if (m79107y() && this.f63706i.mo63004j() != null) {
            boolean shouldReplyDirectly = C24220a.m79551a().shouldReplyDirectly();
            C28482e.m93615h(this.f63706i.mo63004j());
            final ArrayList arrayList = new ArrayList();
            if (C24220a.m79551a().isCommentShareable() && (this.f63698a instanceof CommentListFragment) && comment != null && comment.getEmoji() == null && m79099q() && m79100r() && C24242c.m79619a(this.f63698a.getActivity(), this.f63706i.mo63004j()) && C24239a.m79614a(this.f63698a.getActivity())) {
                arrayList.add(this.f63698a.getString(R.string.a96));
            }
            if (!shouldReplyDirectly) {
                arrayList.add(this.f63698a.getString(R.string.del));
            }
            if (!z3) {
                IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
                if (SharePrefCache.inst().getImCommentForwardEnabled() && iIMService != null && !iIMService.isImReduction()) {
                    arrayList.add(this.f63698a.getString(R.string.apj));
                }
                m79088a(i, z, (List<String>) arrayList, z4, z2);
                arrayList.add(this.f63698a.getString(R.string.ahb));
                if (C6399b.m19944t()) {
                    if (z5) {
                        arrayList.add(this.f63698a.getString(R.string.a9j));
                    } else {
                        arrayList.add(this.f63698a.getString(R.string.a93));
                    }
                }
                arrayList.add(this.f63698a.getString(R.string.des));
            } else {
                arrayList.add(this.f63698a.getString(R.string.ahb));
                m79088a(i, z, (List<String>) arrayList, z4, z2);
            }
            if (z4 || z3) {
                arrayList.add(this.f63698a.getString(R.string.anl));
            }
            C25712a aVar = new C25712a(this.f63698a.getActivity());
            aVar.mo66614a((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (C24093d.this.f63698a != null) {
                        dialogInterface.dismiss();
                        String str = (String) arrayList.get(i);
                        if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.a96))) {
                            bVar2.mo62452a();
                        } else if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.del))) {
                            if (C22596c.m74673a().mo59240a()) {
                                C10761a.m31409e(C6399b.m19921a(), (int) R.string.e5r).mo25750a();
                            } else {
                                bVar2.mo62454c();
                            }
                        } else if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.des))) {
                            bVar2.mo62456e();
                        } else if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.anl))) {
                            bVar2.mo62453b();
                        } else if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.b9u))) {
                            if (C22596c.m74673a().mo59240a()) {
                                C10761a.m31409e(C6399b.m19921a(), (int) R.string.e5s).mo25750a();
                            } else {
                                bVar2.mo62455d();
                            }
                        } else if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.apj))) {
                            if (C22596c.m74673a().mo59240a()) {
                                C10761a.m31409e(C6399b.m19921a(), (int) R.string.e5o).mo25750a();
                            } else {
                                bVar2.mo62458g();
                            }
                        } else if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.ahb))) {
                            bVar2.mo62457f();
                        } else if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.a9j))) {
                            bVar2.mo62460i();
                        } else if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.a93))) {
                            bVar2.mo62461j();
                        } else if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.eaa))) {
                            bVar2.mo62462k();
                        } else {
                            if (TextUtils.equals(str, C24093d.this.f63698a.getString(R.string.cn3))) {
                                bVar2.mo62463l();
                            }
                        }
                    }
                }
            });
            aVar.mo66611a((OnCancelListener) new OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    bVar2.mo62459h();
                }
            });
            aVar.mo66615b();
        }
    }

    /* renamed from: a */
    public final void mo62429a(Comment comment, String str) {
        UrlModel s = m79101s();
        if (s != null) {
            C24220a.m79551a().commentReplyToIM(this.f63698a.getContext(), comment, s, this.f63706i.mo63004j().getAid(), this.f63706i.mo63004j().getAwemeType(), this.f63706i.mo63004j().getAuthorUid(), str);
        }
    }

    /* renamed from: a */
    public final void mo62428a(Comment comment) {
        StringBuilder sb = new StringBuilder();
        sb.append(C6399b.m19921a().getResources().getString(R.string.ahc, new Object[]{C43122ff.m136753A(comment.getUser())}));
        sb.append(comment.getText());
        String sb2 = sb.toString();
        ClipboardManager clipboardManager = (ClipboardManager) C6399b.m19921a().getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("copy_label", sb2));
        }
    }

    /* renamed from: a */
    public final void mo62477a(CharSequence charSequence, boolean z) {
        if (m79107y()) {
            m79089a(KeyboardDialogFragment.m79914a(charSequence, m79081A(), true, this.f63706i.mo63007m(), m79105w(), z), true);
            m79102t();
        }
    }

    /* renamed from: a */
    public final void mo62430a(User user) {
        if (m79107y()) {
            m79089a(KeyboardDialogFragment.m79913a(user, m79081A(), true, this.f63706i.mo63007m(), m79105w()), true);
        }
    }

    /* renamed from: a */
    public final void mo62484a(HashSet<User> hashSet) {
        if (m79107y()) {
            m79089a(KeyboardDialogFragment.m79916a(hashSet, m79081A(), this.f63706i.mo63007m(), m79105w()), true);
        }
    }

    /* renamed from: a */
    public final void mo62475a(CharSequence charSequence) {
        if (this.f63705h != null) {
            this.f63705h.setHint(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo62476a(CharSequence charSequence, List<TextExtraStruct> list, Emoji emoji, boolean z) {
        int i;
        String str;
        String str2;
        String str3;
        C24125t tVar;
        if (m79107y()) {
            if (!C24174l.m79403a(this.f63698a.getContext())) {
                C9738o.m28693a(this.f63698a.getContext(), (int) R.string.cjs);
            } else if (C37649i.m120472b(this.f63706i.mo63004j())) {
                C37649i.m120469a(this.f63698a.getContext(), R.string.a7q, this.f63698a.getString(R.string.a9l));
            } else if (!C37649i.m120471a(this.f63706i.mo63004j())) {
                C37649i.m120469a(this.f63698a.getContext(), R.string.a8p, this.f63698a.getString(R.string.a8o));
            } else if (charSequence.length() > m79092b(z)) {
                C10761a.m31409e(this.f63698a.getContext(), (int) R.string.ru).mo25750a();
            } else {
                if (emoji != null) {
                    C27508b.m90167a(emoji);
                }
                int i2 = 2;
                if (z) {
                    this.f63702e = 3;
                } else if (this.f63706i.mo63005k() != null) {
                    this.f63702e = 2;
                } else {
                    this.f63702e = 1;
                }
                this.f63706i.mo62994a(this.f63702e, C27608b.m90500a(charSequence.toString()), charSequence.toString());
                if (z) {
                    Aweme j = this.f63706i.mo63004j();
                    String z2 = m79108z();
                    if (j == null || j.getAwemeType() != 13) {
                        str = null;
                        i = 1;
                    } else {
                        str = j.getAid();
                        z2 = j.getForwardItem() != null ? j.getForwardItem().getAid() : j.getForwardItemId();
                        i = 2;
                    }
                    Comment k = this.f63706i.mo63005k();
                    if (k == null) {
                        this.f63701d.f63776a = this.f63710m ? 1 : 0;
                        str3 = null;
                        str2 = null;
                    } else {
                        if (k.getCommentType() == 2) {
                            String replyId = k.getReplyId();
                            String cid = k.getCid();
                            tVar = this.f63701d;
                            String str4 = cid;
                            str2 = replyId;
                            str3 = str4;
                        } else {
                            str2 = k.getCid();
                            tVar = this.f63701d;
                            if (this.f63710m) {
                                str3 = null;
                            } else {
                                str3 = null;
                                i2 = 0;
                            }
                        }
                        tVar.f63776a = i2;
                    }
                    this.f63701d.mo62539a(((C24204a) ((C24204a) ((C24204a) ((C24204a) ((C24204a) ((C24204a) ((C24204a) ((C24204a) new C24204a().mo62919f(str).mo62917b(i).mo62893a(z2)).mo62895b(charSequence.toString())).mo62896c(str2)).mo62894a(list)).mo62897d(str3)).mo62892a(emoji)).mo62891a(C22915b.m75418a(this.f63706i == null ? "" : this.f63706i.mo63006l()))).mo62898e(C28290d.m93044e())).mo62918b());
                } else {
                    C24206a aVar = (C24206a) ((C24206a) ((C24206a) ((C24206a) ((C24206a) ((C24206a) new C24206a().mo62893a(m79108z())).mo62895b(charSequence.toString())).mo62894a(list)).mo62892a(emoji)).mo62891a(C22915b.m75418a(this.f63706i == null ? "" : this.f63706i.mo63006l()))).mo62898e(C28290d.m93044e());
                    if (this.f63706i == null || this.f63706i.mo63005k() == null) {
                        this.f63700c.f63755a = this.f63710m ? 1 : 0;
                    } else {
                        Comment k2 = this.f63706i.mo63005k();
                        if (k2.getCommentType() == 2) {
                            this.f63700c.f63755a = 2;
                            aVar = (C24206a) ((C24206a) aVar.mo62896c(k2.getReplyId())).mo62897d(k2.getCid());
                        } else {
                            C24115l lVar = this.f63700c;
                            if (!this.f63710m) {
                                i2 = 0;
                            }
                            lVar.f63755a = i2;
                            aVar = (C24206a) aVar.mo62896c(k2.getCid());
                        }
                    }
                    this.f63700c.mo62531a(aVar.mo62920b());
                }
                if (list != null && list.size() > 0 && m79096n()) {
                    ArrayList arrayList = new ArrayList();
                    for (TextExtraStruct userId : list) {
                        arrayList.add(userId.getUserId());
                    }
                    C24130a.m79272a((List) arrayList, this.f63706i.mo63004j(), this.f63712o);
                    this.f63719v.mo62303f();
                }
                this.f63713p = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo62485a(boolean z) {
        this.f63706i.mo63003g(z);
    }

    /* renamed from: a */
    public final void mo62480a(String str, int i) {
        if (this.f63706i != null) {
            this.f63706i.mo62996a(str, i);
        }
    }

    /* renamed from: a */
    public final void mo62479a(String str) {
        if (this.f63706i != null) {
            this.f63706i.mo62999d(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62472a(Aweme aweme, IIMService iIMService, IMContact iMContact, Boolean bool) {
        Map<String, String> map = C22984d.m75611a().mo59973a("enter_from", this.f63712o).mo59973a("platform", "chat").mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("conversation_id", iIMService.getIMContactConversationId(iMContact)).mo59973a("to_user_id", iIMService.getIMContactUserId(iMContact)).mo59973a("chat_type", m79087a(iMContact)).mo59970a("chat_cnt", 1).mo59970a("is_with_text", 0).mo59973a("enter_method", "comment_at").f60753a;
        C6907h.m21524a("share_video_to_chat", (Map) map);
        C6907h.m21524a("share_video_success", (Map) map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62471a(com.p280ss.android.ugc.aweme.emoji.model.Emoji r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r4.f63705h
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r4.f63705h
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r3 = r4.f63708k
            if (r3 != 0) goto L_0x0020
            if (r0 == 0) goto L_0x0020
            if (r5 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            com.ss.android.ugc.aweme.comment.services.c r0 = r4.f63706i
            r0.mo63001e(r1)
            r4.m79106x()
            if (r1 == 0) goto L_0x0032
            r4.mo62438j()
            r5 = 0
            r4.f63713p = r5
            return
        L_0x0032:
            r4.f63713p = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24093d.mo62471a(com.ss.android.ugc.aweme.emoji.model.Emoji):void");
    }

    /* renamed from: a */
    public final void mo62478a(final Exception exc, Comment comment) {
        if (m79107y() && C6903bc.m21483b().mo61553a(exc)) {
            C6903bc.m21483b().mo61552a(this.f63698a.getChildFragmentManager(), (ApiServerException) exc, new C23637b() {
                /* renamed from: a */
                public final void mo57592a() {
                    if (C24093d.this.f63702e == 3) {
                        C24093d.this.f63701d.mo62540e();
                    } else {
                        C24093d.this.f63700c.mo62532e();
                    }
                }

                /* renamed from: b */
                public final void mo57593b() {
                    int i;
                    Context context = C24093d.this.f63698a.getContext();
                    Exception exc = exc;
                    if (C24093d.this.f63702e == 3) {
                        i = R.string.b_3;
                    } else {
                        i = R.string.a8d;
                    }
                    C24084a.m79026a(context, exc, i);
                }
            });
        }
        if (this.f63706i != null) {
            this.f63706i.mo62995a(exc, this.f63702e, comment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62467a(DialogInterface dialogInterface) {
        if (this.f63698a instanceof CommentListFragment) {
            ((CommentListFragment) this.f63698a).mo63095s();
        }
    }

    /* renamed from: a */
    public final void mo62473a(ForwardDetail forwardDetail) {
        C29876a aVar = new C29876a(1);
        aVar.f78472a = forwardDetail;
        aVar.f78476e = this.f63711n;
        if (this.f63706i != null) {
            aVar.mo75921a(this.f63706i.mo63004j());
            C26682g.f70355a.mo68414a(this.f63706i.mo63004j(), 3);
        }
        if (this.f63706i == null || this.f63706i.mo63011p()) {
            C42961az.m136380a(aVar);
        } else {
            this.f63706i.onEvent(aVar);
        }
        if (forwardDetail.getComment() != null) {
            C42961az.m136380a(new C24031c(forwardDetail.getLabelInfo(), forwardDetail.getComment().getAwemeId()));
        }
    }

    /* renamed from: a */
    public final void mo60510a(int i, int i2, Intent intent) {
        if (m79107y() && i == 111) {
            this.f63708k = false;
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) this.f63698a.getChildFragmentManager().mo2644a("input");
            if (keyboardDialogFragment != null) {
                keyboardDialogFragment.f64166h = true;
            }
            final User user = intent != null ? (User) intent.getSerializableExtra("extra_data") : null;
            if (user != null) {
                this.f63699b.add(user);
                if (keyboardDialogFragment == null) {
                    new Handler().post(new Runnable() {
                        public final void run() {
                            if (C24093d.this.f63699b.isEmpty()) {
                                C24093d.this.mo62488b(user);
                            } else {
                                C24093d.this.mo62484a(C24093d.this.f63699b);
                            }
                        }
                    });
                } else if (!keyboardDialogFragment.mo63158a(C43122ff.m136773d(user), user.getUid()) && this.f63698a.getContext() != null) {
                    C9738o.m28693a(this.f63698a.getContext(), (int) R.string.ib);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62481a(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean) {
        m79091a(false, str, charSequence, str2, i, logPbBean);
    }

    /* renamed from: c */
    public final void mo62434c() {
        m79093d(0);
    }

    /* renamed from: k */
    public final void mo62503k() {
        mo62438j();
        this.f63713p = null;
    }

    /* renamed from: l */
    public final void mo62504l() {
        this.f63719v = new C24021a();
    }

    /* renamed from: F */
    private Aweme m79086F() {
        if (this.f63706i == null) {
            return null;
        }
        return this.f63706i.mo63004j();
    }

    /* renamed from: q */
    private boolean m79099q() {
        return C24220a.m79551a().isOnFeedPage(this.f63698a.getContext());
    }

    /* renamed from: r */
    private boolean m79100r() {
        return C24220a.m79551a().isMainPageFragmentVisible(this.f63698a);
    }

    /* renamed from: y */
    private boolean m79107y() {
        if (this.f63698a == null || !this.f63698a.isAdded()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo62435d() {
        m79093d(1);
    }

    /* renamed from: h */
    public final int mo62501h() {
        if (this.f63703f != null) {
            return this.f63703f.mo62508a();
        }
        return 0;
    }

    /* renamed from: i */
    public final void mo62502i() {
        this.f63706i.mo63000d(this.f63709l);
        this.f63709l = false;
    }

    /* renamed from: m */
    public final void mo62439m() {
        this.f63698a = null;
        this.f63700c.mo66535W_();
        this.f63700c.mo59134U_();
    }

    /* renamed from: A */
    private int m79081A() {
        boolean z;
        if (this.f63706i.mo63007m() == 4) {
            z = true;
        } else {
            z = false;
        }
        return m79092b(z);
    }

    /* renamed from: B */
    private boolean m79082B() {
        Aweme j = this.f63706i.mo63004j();
        if (j == null || !j.getAwemeControl().canForward()) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private boolean m79083C() {
        Aweme j = this.f63706i.mo63004j();
        if (j == null || !j.getAwemeControl().canComment()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    private boolean m79085E() {
        if (this.f63706i == null) {
            return false;
        }
        return C43167r.m136907d(this.f63706i.mo63004j());
    }

    /* renamed from: n */
    public static boolean m79096n() {
        if (C6399b.m19944t() || DouyinDirectShowCommentMentionList.isEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private void m79102t() {
        if (this.f63704g != null) {
            this.f63704g.mo60134a("comment_dialog_state", (Object) Integer.valueOf(6));
        }
    }

    /* renamed from: u */
    private boolean m79103u() {
        Aweme j = this.f63706i.mo63004j();
        if (j == null || (!j.isAwemeFromXiGua() && !j.isAwemeFromDongCheDi())) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m79104v() {
        Aweme j = this.f63706i.mo63004j();
        if (j == null || j.getVideoControl() == null || j.getVideoControl().timerStatus == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private boolean m79105w() {
        if (this.f63706i.mo63004j() == null || !C28482e.m93615h(this.f63706i.mo63004j())) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private String m79108z() {
        if (this.f63706i == null || this.f63706i.mo63004j() == null) {
            return "";
        }
        return this.f63706i.mo63004j().getAid();
    }

    /* renamed from: f */
    public final void mo62436f() {
        if (m79107y()) {
            mo62465a();
            mo62477a((CharSequence) this.f63707j, false);
        }
    }

    /* renamed from: g */
    public final void mo62437g() {
        if (m79107y()) {
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) this.f63698a.getChildFragmentManager().mo2644a("input");
            if (keyboardDialogFragment != null) {
                try {
                    keyboardDialogFragment.dismiss();
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo62438j() {
        if (this.f63705h != null) {
            this.f63705h.setText("");
            this.f63705h.setHint(this.f63707j);
            mo62470a((EditText) this.f63705h);
        }
        this.f63699b.clear();
    }

    /* renamed from: D */
    private boolean m79084D() {
        if (this.f63706i == null) {
            return false;
        }
        Aweme j = this.f63706i.mo63004j();
        if (j == null) {
            return false;
        }
        List<AwemeLabelModel> videoLabels = j.getVideoLabels();
        if (videoLabels == null) {
            return false;
        }
        for (AwemeLabelModel awemeLabelModel : videoLabels) {
            if (awemeLabelModel != null && awemeLabelModel.getLabelType() == 100) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private void m79098p() {
        if (!m79103u() || this.f63716s == null) {
            if (this.f63716s != null) {
                this.f63716s.setVisibility(8);
            }
            return;
        }
        this.f63716s.setVisibility(0);
        this.f63716s.setOnClickListener(new C24140h(this));
    }

    /* renamed from: s */
    private UrlModel m79101s() {
        if (this.f63706i.mo63004j().getAwemeType() != 2) {
            return this.f63706i.mo63004j().getVideo().getCover();
        }
        List imageInfos = this.f63706i.mo63004j().getImageInfos();
        if (!C6307b.m19566a((Collection<T>) imageInfos)) {
            return ((ImageInfo) imageInfos.get(0)).getLabelThumb();
        }
        return null;
    }

    /* renamed from: o */
    private String m79097o() {
        String str;
        if (this.f63706i == null || this.f63706i.mo63004j() == null || !this.f63706i.getClass().equals(CommentListFragment.class)) {
            return null;
        }
        String aid = this.f63706i.mo63004j().getAid();
        if (C6399b.m19944t()) {
            str = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage();
            if ("in".equals(str)) {
                str = "id";
            }
        } else {
            str = "zh-Hans";
        }
        if (C24671f.m80869s().booleanValue()) {
            return C24655d.m80822b(str);
        }
        return C6903bc.m21495n().mo62440a(aid, str);
    }

    /* renamed from: x */
    private void m79106x() {
        if (m79107y()) {
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) this.f63698a.getChildFragmentManager().mo2644a("input");
            if (keyboardDialogFragment != null) {
                MentionSpan[] d = keyboardDialogFragment.mo63170d();
                if (d == null || d.length == 0) {
                    this.f63699b.clear();
                    return;
                }
                Iterator it = this.f63699b.iterator();
                while (it.hasNext()) {
                    User user = (User) it.next();
                    boolean z = false;
                    for (MentionSpan mentionSpan : d) {
                        if (TextUtils.equals(user.getUid(), mentionSpan.f112362a)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo62500e() {
        if (C25329c.m83228k(this.f63706i.mo63004j())) {
            C10761a.m31409e(C6399b.m19921a(), (int) R.string.dq).mo25750a();
            return true;
        } else if (!this.f63706i.mo63008n() || C37649i.m120472b(this.f63706i.mo63004j()) || !C37649i.m120471a(this.f63706i.mo63004j()) || C43168s.m136912d(this.f63706i.mo63004j()) || C22596c.m74673a().mo59240a()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo62465a() {
        if (m79107y()) {
            if (this.f63706i != null) {
                String o = m79097o();
                if (!C6399b.m19944t() && C22596c.m74673a().mo59240a()) {
                    this.f63707j = this.f63698a.getResources().getString(R.string.e5m);
                } else if (C37649i.m120472b(this.f63706i.mo63004j())) {
                    this.f63707j = this.f63698a.getResources().getString(R.string.a9l);
                } else if (!C37649i.m120471a(this.f63706i.mo63004j())) {
                    this.f63707j = this.f63698a.getResources().getString(R.string.a8o);
                } else if (o != null) {
                    this.f63707j = o;
                } else {
                    int m = this.f63706i.mo63007m();
                    if (m != 2) {
                        switch (m) {
                            case 4:
                                this.f63707j = this.f63698a.getResources().getString(R.string.b9v);
                                break;
                            case 5:
                            case 6:
                                this.f63707j = this.f63698a.getResources().getString(R.string.cnr);
                                break;
                            case 7:
                                this.f63707j = this.f63698a.getResources().getString(R.string.el);
                                break;
                            default:
                                this.f63707j = this.f63698a.getResources().getString(R.string.a8k);
                                break;
                        }
                    } else {
                        this.f63707j = this.f63698a.getResources().getString(R.string.a8k);
                    }
                }
            } else {
                this.f63707j = this.f63698a.getResources().getString(R.string.a8k);
            }
            if (this.f63705h != null) {
                this.f63705h.setHint(this.f63707j);
            }
            m79098p();
        }
    }

    /* renamed from: b */
    public final boolean mo62433b() {
        if (this.f63714q == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo62486b(int i) {
        m79094e(i);
    }

    /* renamed from: c */
    public final void mo62493c(int i) {
        m79094e(i);
    }

    /* renamed from: e */
    public final void mo62499e(Comment comment) {
        mo62495c(comment);
    }

    /* renamed from: d */
    private void m79093d(int i) {
        this.f63714q = i;
        if (this.f63705h != null) {
        }
    }

    /* renamed from: a */
    public final void mo62426a(int i) {
        boolean z;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f63710m = z;
    }

    /* renamed from: b */
    public final void mo62490b(String str) {
        C24130a.m79255a(str, this.f63706i.mo63004j(), this.f63712o);
    }

    /* renamed from: c */
    public final void mo62495c(Comment comment) {
        this.f63713p = null;
        mo62437g();
        if (this.f63706i != null) {
            this.f63706i.mo62998c(comment);
        }
    }

    /* renamed from: b */
    private static int m79092b(boolean z) {
        if (z) {
            return 60;
        }
        if (C6399b.m19944t()) {
            return NormalGiftView.MASK_TRANSLATE_VALUE;
        }
        return 100;
    }

    /* renamed from: c */
    public final void mo62494c(EditText editText) {
        if (editText != null && this.f63718u.contains(editText)) {
            this.f63718u.remove(editText);
        }
    }

    /* renamed from: d */
    public final void mo62498d(User user) {
        this.f63699b.add(user);
    }

    /* renamed from: a */
    private static String m79087a(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return "private";
        }
        if (!(iMContact instanceof IMConversation)) {
            return "";
        }
        switch (((IMConversation) iMContact).getConversationType()) {
            case 1:
                return "private";
            case 2:
                return "group";
            default:
                return "";
        }
    }

    /* renamed from: b */
    public final void mo62487b(EditText editText) {
        if (editText != null && !this.f63718u.contains(editText)) {
            if (this.f63705h != null) {
                editText.setText(this.f63705h.getText());
            }
            this.f63718u.add(editText);
        }
    }

    /* renamed from: c */
    public final void mo62496c(User user) {
        Context context;
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
        IMUser fromUser = IMUser.fromUser(user);
        if (this.f63698a != null) {
            context = this.f63698a.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            context = C6399b.m19921a();
        }
        Aweme F = m79086F();
        if (F != null) {
            iIMService.shareSingleMsg(context, fromUser, C37984ap.m121301a().parseAweme(context, F, 0, this.f63712o, "comment_at"), new C24170i(this, F, iIMService, fromUser));
        }
    }

    /* renamed from: e */
    private void m79094e(int i) {
        boolean z;
        if (m79107y() && this.f63706i.mo63009o()) {
            if (i < 5) {
                z = true;
            } else {
                z = false;
            }
            this.f63708k = z;
            if (this.f63708k) {
                if (this.f63698a.getActivity() != null && (this.f63698a.getActivity() instanceof AmeSSActivity)) {
                    ((AmeSSActivity) this.f63698a.getActivity()).setOnActivityResultListener(this);
                }
                C24220a.m79551a().startSummonFriendActivityForResult(this.f63698a.getActivity(), m79108z(), 1, 111);
            } else if (this.f63698a.getContext() != null) {
                C9738o.m28693a(this.f63698a.getContext(), (int) R.string.c8n);
            }
            this.f63706i.mo63002f(this.f63708k);
        }
    }

    /* renamed from: f */
    private static void m79095f(Comment comment) {
        if (comment != null) {
            C24135a a = C24135a.m79312a();
            Comment b = a.mo62562b(comment.getCid());
            if (b != null) {
                comment.setText(C24148e.m79351e(b));
                comment.setTextExtra(b.getTextExtra());
            }
            List<Comment> replyComments = comment.getReplyComments();
            if (!C6307b.m19566a((Collection<T>) replyComments)) {
                for (Comment comment2 : replyComments) {
                    Comment b2 = a.mo62562b(comment2.getCid());
                    if (b2 != null) {
                        comment2.setText(C24148e.m79351e(b2));
                        comment2.setTextExtra(b2.getTextExtra());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo62432b(Comment comment) {
        C24191m.m79483f(comment);
        C24199a j = C24191m.m79484j(comment);
        if (j == null) {
            C24191m.f63849a.mo62633c(comment);
        } else if (C24191m.f63849a.mo62639k(comment) == 3) {
            this.f63701d.mo56976a(j);
        } else {
            this.f63700c.mo56976a(j);
        }
    }

    /* renamed from: d */
    public final void mo62497d(Comment comment) {
        if (this.f63706i != null) {
            m79095f(comment);
            this.f63706i.mo62997b(comment);
            C26682g.f70355a.mo68414a(this.f63706i.mo63004j(), 2);
        }
        if (comment != null) {
            C42961az.m136380a(new C24031c(comment.getLabelInfo(), comment.getAwemeId()));
        }
        if (this.f63698a.getActivity() != null) {
            C36102u.f94392a.showRemindUserCompleteProfileDialog(this.f63698a.getActivity(), this.f63712o, "comment", new C24172j(this));
        }
    }

    /* renamed from: b */
    public final void mo62488b(User user) {
        if (m79107y()) {
            m79089a(KeyboardDialogFragment.m79912a(user, m79081A(), this.f63706i.mo63007m(), m79105w()), true);
        }
    }

    /* renamed from: b */
    public final void mo62489b(Exception exc, Comment comment) {
        mo62478a(exc, comment);
    }

    /* renamed from: a */
    private void m79089a(KeyboardDialogFragment keyboardDialogFragment, boolean z) {
        if (z) {
            keyboardDialogFragment.f64172n = m79084D();
        }
        keyboardDialogFragment.f64160b = this;
        keyboardDialogFragment.f64159a = this;
        keyboardDialogFragment.f64161c = this;
        keyboardDialogFragment.mo63156a(m79082B());
        keyboardDialogFragment.mo63162b(m79083C());
        keyboardDialogFragment.mo63167c(m79085E());
        keyboardDialogFragment.f64169k = m79086F();
        keyboardDialogFragment.mo63152a(this);
        if (C6399b.m19944t()) {
            mo62504l();
        }
        keyboardDialogFragment.f64173o = this.f63719v;
        keyboardDialogFragment.f64171m = this.f63713p;
        try {
            keyboardDialogFragment.show(this.f63698a.getChildFragmentManager(), "input");
        } catch (IllegalStateException unused) {
        }
    }

    public C24093d(Fragment fragment, int i, C24222c cVar) {
        if (fragment == null || cVar == null) {
            throw new RuntimeException("CommentInputManager 传一个空fragment/service，脑子有问题！");
        }
        this.f63698a = fragment;
        this.f63706i = cVar;
        this.f63700c = new C24115l();
        this.f63700c.mo66537a(this);
        this.f63701d = new C24125t();
        this.f63701d.mo66537a(this);
        this.f63711n = i;
        this.f63707j = this.f63698a.getResources().getString(R.string.a8k);
        this.f63719v = new C24021a();
    }

    /* renamed from: a */
    private void m79090a(CharSequence charSequence, boolean z, boolean z2) {
        if (m79107y()) {
            m79089a(KeyboardDialogFragment.m79915a(charSequence, m79081A(), true, this.f63706i.mo63007m(), m79105w(), false, true), false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo62492b(String str, String str2, MentionEditText mentionEditText, View view) {
        if (m79107y()) {
            if (!C6861a.m21337f().isLogin()) {
                C32656f.m105743a((Activity) this.f63698a.getActivity(), str, "click_comment_at", C42914ab.m136242a().mo104633a("login_title", this.f63698a.getString(R.string.a7i)).mo104633a("group_id", str2).mo104633a("log_pb", C33230ac.m107234j(str2)).f111445a);
            } else if (!mo62500e()) {
                if (!m79096n()) {
                    mo62486b(this.f63699b.size());
                    m79102t();
                } else if (this.f63706i.mo63004j() != null && !C43168s.m136912d(this.f63706i.mo63004j())) {
                    this.f63709l = true;
                    m79090a(mentionEditText.getHint(), false, true);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62466a(int i, int i2, int i3, String str, String str2) {
        C24130a.m79249a(i, i2, i3, str, str2, this.f63706i.mo63004j(), this.f63712o);
    }

    /* renamed from: a */
    private void m79088a(int i, boolean z, List<String> list, boolean z2, boolean z3) {
        int i2;
        if (z && i != 2 && !C6399b.m19944t() && z2 && C43122ff.m136783n(C6861a.m21337f().getCurUser())) {
            Fragment fragment = this.f63698a;
            if (z3) {
                i2 = R.string.cn3;
            } else {
                i2 = R.string.eaa;
            }
            list.add(fragment.getString(i2));
        }
    }

    /* renamed from: b */
    public final void mo62491b(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean) {
        if (TextUtils.equals(str, "recommend") || TextUtils.equals(str, "search")) {
            m79091a(true, str, charSequence, str2, i, logPbBean);
        }
    }

    /* renamed from: a */
    public final void mo62474a(MentionEditText mentionEditText, View view, View view2, String str, String str2, View view3) {
        this.f63716s = view3;
        mo62431a(mentionEditText, view, view2, str, str2);
    }

    /* renamed from: a */
    private void m79091a(boolean z, String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean) {
        String str3 = "";
        String str4 = "";
        String str5 = "";
        if (charSequence != null) {
            str5 = charSequence.toString();
        }
        String str6 = str5;
        Aweme j = this.f63706i.mo63004j();
        if (j != null) {
            str4 = j.getAuthorUid();
            str3 = j.getAid();
        }
        String str7 = str3;
        String str8 = str4;
        if (z) {
            C24131b.m79285b(str, str7, str8, str6, str2, i, logPbBean);
        } else {
            C24131b.m79284a(str, str7, str8, str6, str2, i, logPbBean);
        }
    }
}

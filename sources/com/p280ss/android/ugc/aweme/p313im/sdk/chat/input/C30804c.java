package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.animation.C0957c;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtRadioButton;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.p263im.core.internal.utils.C11433k;
import com.bytedance.p263im.core.internal.utils.C11433k.C11434a;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C11472n.C11474a;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.sugar.input.C11476a.C11477a;
import com.bytedance.p263im.sugar.input.SoftInputResizeFuncLayoutView;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27508b;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27554a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27606a;
import com.p280ss.android.ugc.aweme.emoji.utils.C27633d;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C30570e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C31055x;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.SessionInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.SingleSessionInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.adapter.SearchGifAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.adapter.SearchGifAdapter.C30764c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji.C30834a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji.C30834a.C30837a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji.C30839c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.C30850a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.C30860a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30863a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30864b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30865c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30869g;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1317a.C30853a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1317a.C30854b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1318b.C30855a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1318b.C30856b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1319c.p1320a.C30858b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1319c.p1320a.C30859c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.p1316a.C30760b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30898i;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30913u;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EmojiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30954u;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1314a.C30731a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30733a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.view.MentionEditText.C31007e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.view.SearchableEditText;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.p1313c.C30596a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31088l;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31864aj;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31873as;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be.C7059a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.HorizontalSpaceItemDecoration;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p323b.C7094a;
import com.p280ss.android.ugc.aweme.story.api.IAVStoryService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.c */
public class C30804c extends C31088l implements C11434a, C11477a, C30803b {

    /* renamed from: a */
    public static final String f80648a = "c";

    /* renamed from: A */
    private int f80649A = 4;

    /* renamed from: B */
    private boolean f80650B;

    /* renamed from: C */
    private boolean f80651C;

    /* renamed from: D */
    private boolean f80652D;

    /* renamed from: E */
    private boolean f80653E;

    /* renamed from: F */
    private boolean f80654F = true;

    /* renamed from: G */
    private int f80655G;

    /* renamed from: H */
    private int f80656H;

    /* renamed from: I */
    private int f80657I;

    /* renamed from: J */
    private int f80658J;

    /* renamed from: K */
    private int f80659K;

    /* renamed from: L */
    private boolean f80660L;

    /* renamed from: M */
    private OnClickListener f80661M;

    /* renamed from: N */
    private OnKeyListener f80662N;

    /* renamed from: O */
    private TextWatcher f80663O;

    /* renamed from: P */
    private C30853a<C30865c> f80664P;

    /* renamed from: Q */
    private C30853a<C30859c> f80665Q;

    /* renamed from: b */
    public SearchableEditText f80666b;

    /* renamed from: c */
    public ImageView f80667c;

    /* renamed from: d */
    public ImageView f80668d;

    /* renamed from: e */
    public ImageView f80669e;

    /* renamed from: f */
    public LinearLayout f80670f;

    /* renamed from: g */
    public ViewGroup f80671g;

    /* renamed from: h */
    public LinearLayout f80672h;

    /* renamed from: i */
    public RadioGroup f80673i;

    /* renamed from: j */
    public RecyclerView f80674j;

    /* renamed from: k */
    public TextView f80675k;

    /* renamed from: l */
    public SearchGifAdapter f80676l;

    /* renamed from: m */
    public C30834a f80677m;

    /* renamed from: n */
    public SessionInfo f80678n;

    /* renamed from: o */
    public int f80679o = -1;

    /* renamed from: p */
    public List<C30864b> f80680p;

    /* renamed from: q */
    public C30820c f80681q;

    /* renamed from: r */
    public C11433k f80682r = new C11433k(this);

    /* renamed from: s */
    private C30803b f80683s;

    /* renamed from: t */
    private AudioRecordBar f80684t;

    /* renamed from: u */
    private C30839c f80685u;

    /* renamed from: v */
    private ImageView f80686v;

    /* renamed from: w */
    private ImageView f80687w;

    /* renamed from: x */
    private SoftInputResizeFuncLayoutView f80688x;

    /* renamed from: y */
    private C30819b f80689y;

    /* renamed from: z */
    private C30760b f80690z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.c$a */
    public interface C30818a {
        /* renamed from: c */
        void mo80477c();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.c$b */
    public interface C30819b {
        /* renamed from: a */
        void mo80400a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.c$c */
    class C30820c implements Runnable {

        /* renamed from: b */
        private long f80710b;

        /* renamed from: c */
        private boolean f80711c;

        /* renamed from: d */
        private IMUser f80712d;

        public final void run() {
            this.f80710b = SystemClock.elapsedRealtime();
            m100436a();
        }

        /* renamed from: a */
        private void m100436a() {
            int i;
            if (!C31915n.m103671a()) {
                IMUser iMUser = this.f80712d;
                if (iMUser != null && (iMUser.getCommerceUserLevel() != 0 || iMUser.isWithCommerceEntry())) {
                    new StringBuilder("try send user action, hasContent=").append(this.f80711c);
                    String uid = iMUser.getUid();
                    if (!TextUtils.isEmpty(uid)) {
                        Conversation a = C6417a.m20015a().mo15530a(C6425b.m20076a(Long.valueOf(uid).longValue()));
                        if (a != null) {
                            C11474a aVar = new C11474a();
                            if (this.f80711c) {
                                i = 3;
                            } else {
                                i = 4;
                            }
                            aVar.mo27692a(i).mo27693a(a).mo27695a();
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo80688a(boolean z) {
            new StringBuilder("onStatusChanged hasContent=").append(z);
            this.f80711c = z;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f80710b + 2000;
            if (j <= elapsedRealtime || !z) {
                this.f80710b = elapsedRealtime;
                m100436a();
                return;
            }
            C30804c.this.f80671g.removeCallbacks(this);
            C30804c.this.f80671g.postDelayed(this, j - elapsedRealtime);
        }

        public C30820c(SessionInfo sessionInfo) {
            this.f80712d = C30804c.this.f80678n.getSingleChatFromUser();
        }
    }

    /* renamed from: a */
    public final void mo26596a() {
    }

    /* renamed from: e */
    public final AudioRecordBar mo80336e() {
        return this.f80684t;
    }

    /* renamed from: a */
    public final void mo80326a(C30819b bVar) {
        this.f80689y = bVar;
    }

    /* renamed from: a */
    public final void mo80327a(C31007e eVar) {
        if (this.f80666b != null) {
            this.f80666b.setMOnMentionInputListener(eVar);
        }
    }

    /* renamed from: a */
    public final void mo80648a(C30858b bVar) {
        String str;
        if (bVar.f80806f == 2) {
            String str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
            String str3 = ",";
            String charSequence = C7074e.m22069b().toString();
            String conversationId = this.f80678n.getConversationId();
            if (this.f80678n.isGroupChat()) {
                str = str2;
            } else {
                str = String.valueOf(C6425b.m20074a(conversationId));
            }
            String trim = this.f80666b.getText() == null ? "" : this.f80666b.getText().toString().trim();
            List<C30855a> b = this.f80676l.mo80561b();
            StringBuilder sb = new StringBuilder();
            if (b == null || b.isEmpty()) {
                sb.append(str2);
            } else {
                for (C30855a aVar : b) {
                    if (aVar instanceof C30858b) {
                        sb.append(((C30858b) aVar).f80803c);
                        sb.append(str3);
                    }
                }
                if (TextUtils.isEmpty(sb)) {
                    sb.append(str2);
                } else {
                    sb.substring(0, sb.length() - 1);
                }
            }
            C31858ad.m103433a(conversationId, str, charSequence, trim, sb.toString(), bVar.f80803c);
        }
    }

    /* renamed from: a */
    public final void mo80650a(C30864b bVar, C30856b bVar2) {
        Emoji emoji = new Emoji();
        emoji.setAnimateType(bVar.f80818a);
        emoji.setStickerType(3);
        emoji.setWidth(Integer.parseInt(bVar2.f80798b));
        emoji.setHeight(Integer.parseInt(bVar2.f80799c));
        emoji.setDisplayName(mo80663h().getString(R.string.bmt));
        List singletonList = Collections.singletonList(bVar2.f80797a);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(singletonList);
        emoji.setAnimateUrl(urlModel);
        C27517a aVar = new C27517a();
        aVar.f72559d = emoji;
        m100348G();
        this.f80683s.mo80324a(aVar);
    }

    /* renamed from: a */
    public final void mo80328a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f80666b.getText() == null || this.f80666b.getText().length() + str.length() <= C31863ai.m103525a()) {
                if (this.f80679o == -1) {
                    mo80659c(-2);
                }
                this.f80666b.mo81401a(str);
                return;
            }
            C10761a.m31399c(mo80663h(), (int) R.string.bmn).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo80329a(String str, String str2) {
        mo80659c(-2);
        if (!TextUtils.isEmpty(str)) {
            if (this.f80666b.getText() == null || this.f80666b.getText().length() + str.length() <= C31863ai.m103525a()) {
                this.f80666b.mo81402a(str, str2);
            } else {
                C10761a.m31399c(mo80663h(), (int) R.string.bmn).mo25750a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80652a(Boolean bool) {
        if (this.f80690z == null) {
            this.f80690z = new C30760b(this, this.f80688x);
            this.f80688x.mo29005a(2, this.f80690z.mo80546a());
        }
        this.f80690z.mo80554a((FragmentActivity) mo80663h(), bool.booleanValue());
        this.f80688x.mo29004a(2);
    }

    /* renamed from: a */
    public final void mo80330a(List<MediaModel> list, boolean z) {
        C30954u.m100739a(this.f80678n.getConversationId(), list, z);
    }

    /* renamed from: a */
    public final void mo80324a(C27517a aVar) {
        int stickerType = aVar.f72559d.getStickerType();
        if ((stickerType == 10 || stickerType == 2 || stickerType == 3) && mo80664i()) {
            C9738o.m28693a(mo80663h(), (int) R.string.bj6);
        } else {
            C7058be.m21980a().mo18268b(this.f80678n.getConversationId(), (BaseContent) EmojiContent.obtain(aVar.f72559d));
        }
    }

    /* renamed from: a */
    public final void mo80655a(boolean z) {
        if (!this.f80666b.f81178c && !TextUtils.isEmpty(this.f80666b.getText())) {
            this.f80666b.setTag(R.id.o, this.f80666b.getText());
        }
        this.f80666b.setSearchable(z);
        m100367r();
        if (z) {
            this.f80666b.setHint(R.string.bll);
            this.f80676l.mo80565d();
            if (!TextUtils.isEmpty(this.f80666b.getText())) {
                this.f80666b.setText("");
            }
            m100352K();
            this.f80682r.sendEmptyMessage(1);
            return;
        }
        mo80668m();
        this.f80675k.setVisibility(8);
        this.f80674j.setVisibility(8);
        CharSequence charSequence = (CharSequence) this.f80666b.getTag(R.id.o);
        if (charSequence != null) {
            this.f80666b.setTag(R.id.o, null);
            if (!TextUtils.equals(this.f80666b.getText(), charSequence)) {
                this.f80666b.setTag(R.id.j, charSequence);
                this.f80666b.setText(charSequence);
            }
        } else if (!TextUtils.isEmpty(this.f80666b.getText())) {
            this.f80666b.setText("");
        }
        this.f80666b.setHint(R.string.bln);
        Editable text = this.f80666b.getText();
        if (text != null) {
            this.f80666b.setSelection(text.length());
        }
        m100352K();
    }

    /* renamed from: a */
    public final void mo80653a(CharSequence charSequence) {
        if (!C27554a.m90296a().mo70786d()) {
            if (TextUtils.isEmpty(charSequence)) {
                m100360a(null);
                return;
            }
            m100360a(C27554a.m90296a().mo70780a(charSequence.toString()));
        }
    }

    /* renamed from: a */
    public final void mo80654a(Runnable runnable) {
        if (this.f80688x.mo29008c() == -2) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public final void mo80651a(C30865c cVar) {
        this.f80674j.setVisibility(0);
        this.f80676l.mo80559a(cVar);
        this.f80674j.mo5541b(0);
        m100355N();
        mo80657b(cVar);
    }

    /* renamed from: a */
    public final void mo80649a(C30859c cVar) {
        this.f80676l.mo80558a(cVar);
        this.f80674j.mo5541b(0);
    }

    /* renamed from: b */
    public final void mo80331b() {
        this.f80666b.setText("");
    }

    /* renamed from: d */
    public final void mo80335d() {
        this.f80688x.mo29007b();
    }

    /* renamed from: h */
    public final Context mo80663h() {
        return this.f80671g.getContext();
    }

    /* renamed from: A */
    private void m100342A() {
        if (this.f80650B) {
            this.f80668d.setImageResource(R.drawable.bhv);
        }
    }

    /* renamed from: D */
    private void m100345D() {
        if (this.f80661M == null) {
            this.f80661M = new C30848f(this);
        }
    }

    /* renamed from: G */
    private void m100348G() {
        if (this.f80683s == null) {
            this.f80683s = new C30570e(this, mo80663h());
        }
    }

    /* renamed from: J */
    private void m100351J() {
        if (this.f80663O == null) {
            this.f80663O = new C23467g() {
                public final void afterTextChanged(Editable editable) {
                    boolean z = true;
                    if (TextUtils.isEmpty(editable)) {
                        if (C30804c.this.f80677m != null) {
                            C30804c.this.f80677m.mo80547a(false);
                        }
                        C30804c.this.f80669e.setActivated(false);
                        C30804c.this.f80669e.setVisibility(8);
                        if (C31915n.m103671a() || C30804c.this.f80678n.isEnterpriseChat()) {
                            C30804c.this.f80668d.setVisibility(0);
                        } else {
                            C30804c.this.f80667c.setVisibility(0);
                        }
                    } else {
                        if (C30804c.this.f80677m != null) {
                            C30804c.this.f80677m.mo80547a(true);
                        }
                        C30804c.this.f80669e.setActivated(true);
                        C30804c.this.f80669e.setVisibility(0);
                        if (C31915n.m103671a() || C30804c.this.f80678n.isEnterpriseChat()) {
                            C30804c.this.f80668d.setVisibility(8);
                        } else {
                            C30804c.this.f80667c.setVisibility(8);
                        }
                    }
                    C30804c.this.mo80669n();
                    C30804c.this.mo80661f();
                    C30820c cVar = C30804c.this.f80681q;
                    if (editable.length() <= 0) {
                        z = false;
                    }
                    cVar.mo80688a(z);
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (C6956a.m21633b().enableExpressionTab() && C30804c.this.f80666b.f81178c) {
                        C30804c.this.mo80665j();
                    } else if (C31915n.m103671a() || C30199h.m98861a().getImAssociativeEmoticonAll().getShow().intValue() != 1 || C6956a.m21632a().mo18009f().getAssociativeEmoji() == 0 || !C7076p.m22077a().mo18342z() || ((C30804c.this.f80678n.isAuthorSupporterChat() && !C30733a.m100120d()) || charSequence.length() > 8)) {
                        CharSequence charSequence2 = (CharSequence) C30804c.this.f80666b.getTag(R.id.j);
                        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
                            C30804c.this.mo80653a(charSequence);
                        } else {
                            C30804c.this.f80666b.setTag(R.id.j, null);
                        }
                    } else {
                        C30804c.this.mo80665j();
                    }
                }
            };
        }
    }

    /* renamed from: K */
    private void m100352K() {
        if (this.f80682r.hasMessages(1)) {
            this.f80682r.removeMessages(1);
        }
    }

    /* renamed from: L */
    private void m100353L() {
        if (this.f80664P == null) {
            this.f80664P = new C30854b<C30865c>() {
                /* renamed from: a */
                public final void mo80673a() {
                    super.mo80673a();
                    if (C30804c.this.f80666b.f81178c) {
                        C30804c.this.mo80668m();
                        C30804c.this.f80676l.mo80564c();
                        C30804c.this.f80675k.setVisibility(8);
                        C30804c.this.f80674j.setVisibility(0);
                        C10761a.m31399c(C30804c.this.mo80663h(), (int) R.string.bna).mo25750a();
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public void mo80675b(C30865c cVar) {
                    super.mo80675b(cVar);
                    if (C30804c.this.f80666b.f81178c) {
                        C30804c.this.mo80651a(cVar);
                        C30804c.this.mo80668m();
                        C30804c.this.f80675k.setVisibility(8);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: c */
                public void mo80674a(C30865c cVar) {
                    super.mo80674a(cVar);
                    if (C30804c.this.f80666b.f81178c) {
                        C30804c.this.f80676l.mo80563b(cVar);
                        C30804c.this.mo80657b(cVar);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo80676c(C30865c cVar) {
                    super.mo80676c(cVar);
                    if (C30804c.this.f80666b.f81178c) {
                        C30804c.this.mo80651a(cVar);
                        C30804c.this.f80675k.setVisibility(0);
                        C30804c.this.mo80668m();
                        C30804c.this.f80682r.sendEmptyMessageDelayed(2, 3000);
                    }
                }
            };
        }
    }

    /* renamed from: M */
    private void m100354M() {
        if (this.f80665Q == null) {
            this.f80665Q = new C30854b<C30859c>() {
                /* access modifiers changed from: 0000 */
                /* renamed from: b */
                public final /* synthetic */ void mo80678b() {
                    C30804c.this.mo80660c(true);
                }

                /* renamed from: a */
                public final void mo80673a() {
                    super.mo80673a();
                    C30804c.this.mo80654a((Runnable) new C30871i(this));
                }

                /* access modifiers changed from: private */
                /* renamed from: c */
                public void mo80675b(C30859c cVar) {
                    super.mo80675b(cVar);
                    C30804c.this.mo80654a((Runnable) new C30849g(this, cVar));
                }

                /* access modifiers changed from: private */
                /* renamed from: d */
                public void mo80674a(C30859c cVar) {
                    super.mo80674a(cVar);
                    C30804c.this.mo80654a((Runnable) new C30870h(this, cVar));
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo80677a(C30859c cVar) {
                    C30804c.this.f80676l.mo80562b(cVar);
                    C30804c.this.mo80666k();
                    C30804c.this.mo80667l();
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: b */
                public final /* synthetic */ void mo80679b(C30859c cVar) {
                    C30804c.this.mo80660c(false);
                    C30804c.this.mo80658b(true);
                    C30804c.this.mo80670o();
                    C30804c.this.mo80649a(cVar);
                    C30804c.this.mo80666k();
                    C30804c.this.mo80667l();
                    C31858ad.m103507u(C30804c.this.f80678n.getConversationId());
                }
            };
        }
    }

    /* renamed from: O */
    private void m100356O() {
        if (this.f80662N == null) {
            this.f80662N = new OnKeyListener() {
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (view.equals(C30804c.this.f80666b) && i == 4 && keyEvent.getAction() == 0) {
                        return C30804c.this.mo80334c();
                    }
                    return false;
                }
            };
        }
    }

    /* renamed from: t */
    private void m100369t() {
        this.f80673i.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            /* renamed from: a */
            DmtRadioButton f80706a = ((DmtRadioButton) C30804c.this.f80673i.findViewById(R.id.co1));

            /* renamed from: b */
            DmtRadioButton f80707b = ((DmtRadioButton) C30804c.this.f80673i.findViewById(R.id.co2));

            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.co1) {
                    C30804c.this.mo80659c(1);
                    C30804c.this.mo80655a(false);
                    this.f80706a.setFontType(C10834d.f29332b);
                    this.f80707b.setFontType(C10834d.f29331a);
                    return;
                }
                C30804c.this.mo80659c(-2);
                C30804c.this.mo80655a(true);
                this.f80706a.setFontType(C10834d.f29331a);
                this.f80707b.setFontType(C10834d.f29332b);
            }
        });
    }

    /* renamed from: u */
    private void m100370u() {
        this.f80676l.f80538f = new C30764c() {
            /* renamed from: a */
            public final void mo80567a(C30858b bVar) {
                if (bVar != null) {
                    C30804c.this.mo80648a(bVar);
                    C30804c.this.mo80656b(bVar);
                    C30804c.this.mo80658b(false);
                }
            }

            /* renamed from: a */
            public final void mo80566a(int i) {
                if (i >= 0) {
                    if (C30804c.this.mo80664i()) {
                        C10761a.m31399c(C30804c.this.mo80663h(), (int) R.string.bj6).mo25750a();
                        return;
                    }
                    C30864b bVar = (C30864b) C30804c.this.f80680p.get(i);
                    if (bVar != null && bVar.f80819b != null && bVar.f80819b.f80824a != null) {
                        C30804c.this.mo80650a(bVar, bVar.f80819b.f80824a);
                        C30804c.m100359a(bVar);
                    }
                }
            }
        };
    }

    /* renamed from: w */
    private void m100372w() {
        this.f80676l.f80537e = new C30821d(this);
    }

    /* renamed from: g */
    public final void mo80662g() {
        mo80666k();
        this.f80676l.mo80565d();
    }

    /* renamed from: j */
    public final void mo80665j() {
        m100352K();
        this.f80682r.sendEmptyMessageDelayed(1, 200);
    }

    /* renamed from: k */
    public final void mo80666k() {
        if (this.f80682r.hasMessages(3)) {
            this.f80682r.removeMessages(3);
        }
    }

    /* renamed from: l */
    public final void mo80667l() {
        this.f80682r.sendEmptyMessageDelayed(3, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* renamed from: m */
    public final void mo80668m() {
        if (this.f80682r.hasMessages(2)) {
            this.f80682r.removeMessages(2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo80672p() {
        m100361b((CharSequence) this.f80666b.getText());
    }

    /* renamed from: B */
    private void m100343B() {
        if (!C31915n.m103671a() && this.f80688x.mo29008c() != -2 && !this.f80676l.mo80560a()) {
            mo80660c(true);
        }
    }

    /* renamed from: I */
    private void m100350I() {
        if (C6956a.m21633b().enableExpressionTab()) {
            this.f80673i.setVisibility(8);
            mo80655a(false);
        }
    }

    /* renamed from: N */
    private void m100355N() {
        if (this.f80680p == null) {
            this.f80680p = new ArrayList();
        } else {
            this.f80680p.clear();
        }
    }

    /* renamed from: r */
    private void m100367r() {
        int i;
        SearchableEditText searchableEditText = this.f80666b;
        if (this.f80652D || this.f80666b.f81178c) {
            i = R.drawable.bh_;
        } else {
            i = 0;
        }
        searchableEditText.setBackgroundResource(i);
    }

    /* renamed from: v */
    private void m100371v() {
        if (!C31915n.m103671a()) {
            this.f80674j.mo5528a((C1281m) new C1281m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        C30804c.this.mo80667l();
                    } else {
                        C30804c.this.mo80666k();
                    }
                    C30804c.this.mo80658b(false);
                }
            });
        }
    }

    /* renamed from: x */
    private void m100373x() {
        if (!this.f80653E || this.f80678n.isEnterpriseChat()) {
            this.f80667c.setVisibility(8);
        }
    }

    /* renamed from: y */
    private void m100374y() {
        if (C6956a.m21633b().enableExpressionTab() && this.f80673i.getVisibility() == 0) {
            m100350I();
        }
        m100375z();
        m100342A();
    }

    public final void bb_() {
        if (this.f80677m != null) {
            this.f80677m.mo80551e();
        }
        C30913u.m100638a().mo80839f();
    }

    /* renamed from: c */
    public final boolean mo80334c() {
        if (this.f80688x.mo29006a()) {
            mo80335d();
            return true;
        }
        if (mo80663h() instanceof ChatRoomActivity) {
            ((Activity) mo80663h()).finish();
        }
        return false;
    }

    /* renamed from: n */
    public final void mo80669n() {
        if (C6956a.m21633b().enableExpressionTab() && this.f80666b.f81178c) {
            this.f80669e.setVisibility(8);
            this.f80669e.setActivated(false);
        }
    }

    /* renamed from: C */
    private void m100344C() {
        if (this.f80656H == 0) {
            Resources resources = this.f80670f.getResources();
            this.f80656H = resources.getColor(R.color.hc);
            this.f80658J = resources.getColor(R.color.hd);
            this.f80657I = resources.getColor(R.color.hb);
            this.f80659K = resources.getColor(R.color.he);
        }
    }

    /* renamed from: H */
    private void m100349H() {
        int i = 1;
        if (C6956a.m21633b().enableExpressionTab()) {
            boolean z = false;
            this.f80673i.setVisibility(0);
            if (this.f80673i.getCheckedRadioButtonId() == R.id.co2) {
                z = true;
            }
            if (z) {
                i = -2;
            }
            mo80659c(i);
            mo80655a(z);
            return;
        }
        mo80659c(1);
    }

    /* renamed from: q */
    private void m100366q() {
        C7094a inputMenuCustomizer = IMService.get().getInputMenuCustomizer();
        if (this.f80678n.isSingleChat() && inputMenuCustomizer != null) {
            SingleSessionInfo singleSessionInfo = (SingleSessionInfo) this.f80678n;
            final IMUser fromUser = singleSessionInfo.getFromUser();
            if (fromUser != null) {
                fromUser.getUid();
                fromUser.getVerificationType();
                fromUser.getEnterpriseVerifyReason();
                new Object() {
                };
                singleSessionInfo.getImAdLog();
            }
        }
    }

    /* renamed from: z */
    private void m100375z() {
        if (this.f80651C && this.f80686v.isSelected()) {
            this.f80686v.setImageResource(R.drawable.bhk);
            this.f80686v.setContentDescription(mo80663h().getResources().getString(R.string.bg_));
            this.f80686v.setSelected(false);
        }
    }

    /* renamed from: f */
    public final void mo80661f() {
        m100373x();
        if (!this.f80654F) {
            this.f80666b.setVisibility(8);
        }
        if (!this.f80650B) {
            this.f80668d.setVisibility(8);
        }
        if (!this.f80651C) {
            this.f80686v.setVisibility(8);
        }
        if (!this.f80652D) {
            this.f80687w.setVisibility(8);
        }
    }

    /* renamed from: o */
    public final void mo80670o() {
        String sourceMessage = C30199h.m98861a().getImAssociativeEmoticonAll().getSourceMessage();
        if (!TextUtils.isEmpty(sourceMessage) && C27633d.m90594a().mo71032c()) {
            C10761a.m31387a(mo80663h(), sourceMessage).mo25750a();
            C27633d.m90594a().mo71030a(false);
        }
    }

    /* renamed from: F */
    private boolean m100347F() {
        if (this.f80678n.isGroupChat()) {
            return false;
        }
        if (this.f80678n.isAuthorSupporterChat() && C30733a.m100121e()) {
            return false;
        }
        IMUser b = C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(this.f80678n.getConversationId())));
        if (b == null || (b.getFollowStatus() != 2 && !C7074e.m22067a(b))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo80664i() {
        if (this.f80678n.isGroupChat()) {
            return false;
        }
        if (this.f80678n.isAuthorSupporterChat() && C30733a.m100119c()) {
            return false;
        }
        IMUser b = C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(this.f80678n.getConversationId())));
        if (!C31915n.m103671a() && ((b != null && b.getCommerceUserLevel() > 0) || (C7074e.m22071c() != null && C7074e.m22071c().getCommerceUserLevel() > 0))) {
            return false;
        }
        if (b == null || (b.getFollowStatus() != 2 && !C7074e.m22067a(b))) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private void m100346E() {
        if (m100347F()) {
            m100362b("sendMedia");
            C31858ad.m103406a();
            C31858ad.m103443b(0);
            C10761a.m31399c(mo80663h(), (int) R.string.bnr).mo25750a();
            return;
        }
        C31858ad.m103406a();
        C31858ad.m103443b(1);
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "im_story");
        intent.putExtra("enter_from", "from_chat");
        if (this.f80678n.isGroupChat()) {
            ConversationCoreInfo coreInfo = C6417a.m20015a().mo15530a(this.f80678n.getConversationId()).getCoreInfo();
            if (coreInfo != null) {
                UrlModel urlModel = new UrlModel();
                ArrayList arrayList = new ArrayList();
                arrayList.add(coreInfo.getIcon());
                urlModel.setUrlList(arrayList);
                intent.putExtra("send_to_user_head", urlModel);
            }
        } else if (this.f80678n.getSingleChatFromUser() != null) {
            intent.putExtra("send_to_user_head", this.f80678n.getSingleChatFromUser().getDisplayAvatar());
        }
        intent.putExtra("extra_launch_type", 1);
        ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).launchRecord(mo80663h(), intent);
        mo80335d();
    }

    /* renamed from: s */
    private void m100368s() {
        m100345D();
        m100351J();
        m100356O();
        this.f80666b.removeTextChangedListener(this.f80663O);
        this.f80666b.addTextChangedListener(this.f80663O);
        this.f80666b.setFilters(new InputFilter[]{new C31055x(C31863ai.m103525a())});
        this.f80666b.setOnKeyListener(this.f80662N);
        this.f80666b.setOnClickListener(this.f80661M);
        this.f80666b.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (!z) {
                    C30804c.this.mo80335d();
                }
            }
        });
        this.f80669e.setOnClickListener(this.f80661M);
        this.f80686v.setOnClickListener(this.f80661M);
        this.f80668d.setOnClickListener(this.f80661M);
        this.f80687w.setOnClickListener(this.f80661M);
        this.f80667c.setOnClickListener(this.f80661M);
        m100369t();
        m100370u();
        m100372w();
        m100371v();
        this.f80688x.setOnPanelChangeListener(this);
        this.f80688x.setOnClickListener(this.f80661M);
        C31882a.m103579n().mo82725a(this.f80667c, this.f80686v, this.f80668d, this.f80669e);
        this.f80670f.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (C30804c.this.f80670f.getVisibility() != 0) {
                    C30804c.this.mo80335d();
                }
            }
        });
    }

    public final void ba_() {
        long currentTimeMillis = System.currentTimeMillis();
        Editable text = this.f80666b.getText();
        if (text != null) {
            if (TextUtils.isEmpty(text.toString())) {
                C9738o.m28693a(mo80663h(), (int) R.string.bn4);
            } else if (text.length() > C31863ai.m103525a()) {
                C9738o.m28697a(mo80663h(), C6399b.m19921a().getResources().getString(R.string.bmn));
            } else {
                C27606a b = C27606a.m90489b(mo80663h());
                C31858ad.m103406a();
                C31858ad.m103434a(this.f80678n.getConversationId(), b.mo70935b(), b.mo70936a((CharSequence) text));
                TextContent obtain = TextContent.obtain(text.toString());
                obtain.setSendStartTime(Long.valueOf(currentTimeMillis));
                C30596a.m99924a(this.f80678n.getConversationId(), (BaseContent) obtain);
                C7058be.m21980a().mo18269b(this.f80678n.getConversationId(), (BaseContent) obtain, (C7059a) new C7059a() {
                    public final void onSendFailure(C11438g gVar) {
                    }

                    public final void onSendSuccess(Message message) {
                        if (C30804c.this.f80678n instanceof SingleSessionInfo) {
                            C31858ad.m103406a();
                            C31858ad.m103415a(((SingleSessionInfo) C30804c.this.f80678n).getImAdLog());
                        }
                    }

                    public final void onSend(Conversation conversation, List<Message> list) {
                        if (C30804c.this.f80678n.isGroupChat() && list != null) {
                            for (int i = 0; i < list.size(); i++) {
                                List mentionIds = C30804c.this.f80666b.getMentionIds();
                                if (mentionIds != null && !mentionIds.isEmpty()) {
                                    C31863ai.m103527a((Message) list.get(i), mentionIds);
                                }
                            }
                        }
                    }
                });
                this.f80666b.setText("");
            }
        }
    }

    @C7709l
    public void onEvent(C30731a aVar) {
        mo80335d();
    }

    /* renamed from: a */
    public final void mo80325a(final C30818a aVar) {
        if (this.f80666b != null) {
            this.f80666b.addTextChangedListener(new C23467g() {
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    aVar.mo80477c();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo80332b(int i) {
        this.f80671g.setVisibility(i);
    }

    /* renamed from: a */
    private void m100360a(List<Emoji> list) {
        if (this.f80685u == null) {
            this.f80685u = new C30839c(this, this.f80671g, this.f80678n.getConversationId());
        }
        this.f80685u.mo80725a(list);
    }

    /* renamed from: b */
    private void m100363b(List<C30864b> list) {
        if (this.f80680p == null) {
            this.f80680p = new ArrayList();
        }
        this.f80680p.addAll(list);
    }

    /* renamed from: a */
    public static void m100359a(C30864b bVar) {
        C30863a aVar = bVar.f80820c;
        if (aVar != null && aVar.f80817a != null && !TextUtils.isEmpty(aVar.f80817a.f80825a)) {
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.f80817a.f80825a);
            sb.append("&ts=");
            sb.append(System.currentTimeMillis());
            C30850a.m100520a(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo80657b(C30865c cVar) {
        C30869g gVar = cVar.f80823c;
        if (gVar != null && gVar.f80828a != null && gVar.f80828a.size() > 0) {
            m100363b(gVar.f80828a);
        }
    }

    /* renamed from: b */
    private void m100361b(CharSequence charSequence) {
        String str;
        String str2;
        String a = C31873as.m103564a(charSequence.toString());
        int i = this.f80676l.f80533a;
        if (C31915n.m103671a()) {
            m100353L();
            if (TextUtils.isEmpty(a)) {
                C30860a.m100531a(i, this.f80664P);
            } else {
                C30860a.m100533a(i, a, this.f80664P);
            }
        } else if (TextUtils.isEmpty(a)) {
            mo80660c(true);
        } else if (a.length() <= 8) {
            m100354M();
            if (this.f80678n.isSingleChat()) {
                str2 = "im";
                str = this.f80678n.getSingleChatFromUserId();
            } else {
                str2 = "im_group";
                str = this.f80678n.getConversationId();
            }
            C7077s.m22158a(a, i, str2, str, this.f80665Q);
        }
    }

    /* renamed from: d */
    private void m100365d(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f80660L != z) {
            this.f80660L = z;
            m100344C();
            SearchableEditText searchableEditText = this.f80666b;
            if (z) {
                i = this.f80656H;
            } else {
                i = this.f80658J;
            }
            searchableEditText.setHintTextColor(i);
            SearchableEditText searchableEditText2 = this.f80666b;
            if (z) {
                i2 = this.f80657I;
            } else {
                i2 = this.f80659K;
            }
            searchableEditText2.setTextColor(i2);
            this.f80666b.setSelected(z);
            this.f80667c.setActivated(z);
            this.f80668d.setActivated(z);
            this.f80686v.setActivated(z);
            if (z) {
                m100364d(4);
            }
            ImageView imageView = this.f80687w;
            if (z) {
                i3 = R.drawable.a9z;
            } else {
                i3 = R.drawable.bi2;
            }
            imageView.setImageResource(i3);
            LinearLayout linearLayout = this.f80670f;
            if (z) {
                i4 = R.drawable.nw;
            } else {
                i4 = R.drawable.nx;
            }
            linearLayout.setBackgroundResource(i4);
            mo80661f();
        }
    }

    /* renamed from: a */
    public final void mo80323a(int i) {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (!this.f80666b.mo81400a()) {
            this.f80666b.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: c */
    public final void mo80660c(final boolean z) {
        float f;
        float f2;
        float f3 = 20.0f;
        float f4 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 20.0f;
        }
        if (!z) {
            f3 = 0.0f;
        }
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (!z) {
            f4 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f80674j, "translationY", new float[]{f, f3});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f80674j, "alpha", new float[]{f2, f4});
        C308124 r4 = new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                if (!z) {
                    C30804c.this.f80674j.setVisibility(0);
                }
            }

            public final void onAnimationCancel(Animator animator) {
                if (z) {
                    C30804c.this.f80674j.setVisibility(8);
                    C30804c.this.mo80662g();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (z) {
                    C30804c.this.f80674j.setVisibility(8);
                    C30804c.this.mo80662g();
                }
            }
        };
        ofFloat.setDuration(60);
        ofFloat.setInterpolator(C0957c.m4073a(0.14f, 1.0f, 0.34f, 1.0f));
        ofFloat2.setDuration(40);
        ofFloat2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(r4);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    /* renamed from: a */
    private void m100358a(ViewGroup viewGroup) {
        int i;
        this.f80666b = (SearchableEditText) viewGroup.findViewById(R.id.c0e);
        m100367r();
        this.f80670f = (LinearLayout) viewGroup.findViewById(R.id.ac8);
        this.f80672h = (LinearLayout) viewGroup.findViewById(R.id.bhx);
        this.f80667c = (ImageView) viewGroup.findViewById(R.id.b_g);
        this.f80686v = (ImageView) viewGroup.findViewById(R.id.adv);
        this.f80668d = (ImageView) viewGroup.findViewById(R.id.cb6);
        this.f80669e = (ImageView) viewGroup.findViewById(R.id.d2x);
        this.f80687w = (ImageView) viewGroup.findViewById(R.id.des);
        this.f80684t = (AudioRecordBar) viewGroup.findViewById(R.id.byq);
        this.f80673i = (RadioGroup) viewGroup.findViewById(R.id.csr);
        this.f80674j = (RecyclerView) viewGroup.findViewById(R.id.cxb);
        this.f80675k = (TextView) viewGroup.findViewById(R.id.dv4);
        RecyclerView recyclerView = this.f80674j;
        if (C31915n.m103671a()) {
            i = 8;
        } else {
            i = 0;
        }
        recyclerView.setVisibility(i);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo80663h());
        linearLayoutManager.mo5427b(0);
        this.f80674j.setLayoutManager(linearLayoutManager);
        this.f80674j.mo5525a((C1272h) new HorizontalSpaceItemDecoration(mo80663h().getResources().getDimensionPixelSize(R.dimen.i4)));
        this.f80676l = new SearchGifAdapter(this.f80674j);
        this.f80674j.setAdapter(this.f80676l);
        this.f80688x = (SoftInputResizeFuncLayoutView) viewGroup.findViewById(R.id.c_6);
        this.f80688x.setEditText(this.f80666b);
        this.f80688x.setResizable(false);
        mo80661f();
    }

    /* renamed from: b */
    private void m100362b(String str) {
        try {
            IMUser b = C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(this.f80678n.getConversationId())));
            StringBuilder sb = new StringBuilder("User Follow Status : toUser=");
            sb.append(b.toString());
            sb.append(" fromUser=");
            sb.append(C31913m.m103668a(C7074e.m22071c()));
            sb.append(" type=");
            sb.append(str);
            C6921a.m21555a(sb.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private void m100364d(int i) {
        if ((this.f80688x.mo29008c() == 2 || this.f80688x.mo29008c() == 1) && i == 5) {
            this.f80668d.setImageResource(R.drawable.bhv);
            mo80335d();
        }
        if (i == 5) {
            if (mo80664i()) {
                C9738o.m28693a(mo80663h(), (int) R.string.bns);
            } else {
                this.f80684t.setVisibility(0);
                this.f80666b.setVisibility(8);
                if (this.f80649A != i) {
                    this.f80687w.setSelected(!this.f80687w.isSelected());
                    this.f80687w.setContentDescription(mo80663h().getResources().getString(R.string.bgg));
                }
                this.f80649A = 5;
            }
            if (!C31915n.m103671a()) {
                this.f80686v.setVisibility(8);
            }
        } else {
            this.f80684t.setVisibility(8);
            this.f80666b.setVisibility(0);
            if (this.f80649A != i) {
                this.f80687w.setSelected(!this.f80687w.isSelected());
                this.f80687w.setContentDescription(mo80663h().getResources().getString(R.string.bg7));
            }
            this.f80649A = 4;
            if (!C31915n.m103671a()) {
                this.f80686v.setVisibility(0);
            }
        }
    }

    /* renamed from: c */
    public final void mo80659c(int i) {
        if (this.f80688x.mo29008c() == 2 && i != this.f80688x.mo29008c()) {
            this.f80668d.setImageResource(R.drawable.bhv);
        }
        if (this.f80685u != null) {
            this.f80685u.mo80725a(null);
        }
        if (i == -1) {
            mo80335d();
        } else if (i == -2) {
            this.f80688x.mo29011e();
        } else if (i != 1) {
            if (i == 2) {
                if (this.f80688x.mo29008c() == 2) {
                    this.f80668d.setImageResource(R.drawable.bhv);
                    mo80335d();
                } else if (mo80664i()) {
                    m100362b("sendPhoto");
                    C9738o.m28693a(mo80663h(), (int) R.string.a2a);
                } else {
                    C30898i.m100632a().mo80818a((Activity) mo80663h(), new C30822e(this));
                }
            }
        } else if (this.f80688x.mo29008c() == 1) {
            mo80335d();
        } else {
            this.f80677m.mo80715j();
            this.f80688x.mo29004a(1);
        }
    }

    /* renamed from: b */
    public final void mo80656b(C30858b bVar) {
        UrlModel urlModel = bVar.f80802b;
        UrlModel urlModel2 = bVar.f80801a;
        if (urlModel2 != null && urlModel != null) {
            Emoji emoji = new Emoji();
            emoji.setAnimateUrl(urlModel2);
            emoji.setStaticUrl(urlModel);
            emoji.setId(bVar.f80804d);
            emoji.setWidth(urlModel2.getWidth());
            emoji.setHeight(urlModel2.getHeight());
            emoji.setStickerType(1);
            emoji.setAnimateType("gif");
            emoji.setStaticType("gif");
            emoji.setDisplayName(mo80663h().getString(R.string.bj0));
            C27517a aVar = new C27517a();
            aVar.f72559d = emoji;
            m100348G();
            C27508b.m90167a(emoji);
            this.f80683s.mo80324a(aVar);
            this.f80666b.setText("");
        }
    }

    /* renamed from: a */
    public final void mo27309a(android.os.Message message) {
        if (message.what == 1) {
            this.f80676l.f80533a = 0;
            m100361b((CharSequence) this.f80666b.getText());
        } else if (message.what == 2) {
            this.f80675k.setVisibility(8);
        } else {
            if (message.what == 3) {
                mo80660c(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo80658b(boolean z) {
        if (this.f80655G < 11) {
            if (z) {
                this.f80655G++;
            } else {
                this.f80655G = 0;
            }
            if (this.f80655G == 11) {
                C10761a.m31399c(mo80663h(), (int) R.string.bir).mo25750a();
            }
            C7076p.m22077a().mo18325i(this.f80655G);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80647a(View view) {
        if (!C31864aj.m103545a(view, 500)) {
            if (view.equals(this.f80666b)) {
                mo80659c(-2);
            } else if (view.equals(this.f80669e)) {
                m100348G();
                this.f80683s.ba_();
            } else if (view.equals(this.f80686v)) {
                this.f80686v.setSelected(!this.f80686v.isSelected());
                if (this.f80686v.isSelected()) {
                    this.f80686v.setImageResource(R.drawable.a1l);
                    this.f80686v.setContentDescription(mo80663h().getResources().getString(R.string.bgg));
                    m100349H();
                    C31858ad.m103406a();
                    C31858ad.m103459d();
                    return;
                }
                this.f80686v.setImageResource(R.drawable.bhk);
                this.f80686v.setContentDescription(mo80663h().getResources().getString(R.string.bg_));
                mo80659c(-2);
                m100350I();
            } else if (view.equals(this.f80668d)) {
                mo80659c(2);
                this.f80666b.setText("");
            } else if (!view.equals(this.f80687w)) {
                if (view.equals(this.f80667c)) {
                    m100346E();
                }
            } else if (this.f80649A == 4) {
                m100364d(5);
            } else {
                m100364d(4);
            }
        }
    }

    /* renamed from: a */
    public static C30804c m100357a(ViewGroup viewGroup, SessionInfo sessionInfo) {
        return new C30804c(viewGroup, sessionInfo);
    }

    private C30804c(ViewGroup viewGroup, SessionInfo sessionInfo) {
        this.f80678n = sessionInfo;
        this.f80650B = C6956a.m21632a().mo18009f().enableSendPic();
        this.f80653E = C6956a.m21633b().enableMediaRecord();
        this.f80651C = C6956a.m21633b().enableSendEmoji();
        this.f80652D = C6956a.m21633b().enableSendVoice();
        if (this.f80678n.isAuthorSupporterChat()) {
            this.f80654F = C30733a.m100114a();
            this.f80650B = C30733a.m100119c();
            this.f80653E = C30733a.m100121e();
            this.f80651C = C30733a.m100120d();
            this.f80652D = C30733a.m100116b();
        }
        if (viewGroup.getContext() instanceof AbsActivity) {
            ((AbsActivity) viewGroup.getContext()).registerLifeCycleMonitor(this);
        }
        this.f80681q = new C30820c(this.f80678n);
        this.f80671g = (ViewGroup) viewGroup.findViewById(R.id.b20);
        m100358a(viewGroup);
        m100368s();
        this.f80677m = new C30837a(this, this.f80688x).mo80723d().mo80720a().mo80721b().mo80722c().mo80724e();
        this.f80688x.mo29005a(1, this.f80677m.mo80546a());
        this.f80655G = Math.max(0, C7076p.m22077a().mo18285A());
        m100366q();
    }

    /* renamed from: a */
    public final void mo29021a(int i, View view) {
        int i2 = 0;
        if (i == -1) {
            m100374y();
            m100365d(false);
            this.f80677m.mo80718m();
        } else if (i == -2) {
            if (!(C6956a.m21633b().enableExpressionTab() && this.f80673i.getVisibility() == 0 && R.id.co2 == this.f80673i.getCheckedRadioButtonId())) {
                m100374y();
            }
            m100365d(true);
        } else if (i == 1) {
            m100365d(true);
        } else if (i == 2) {
            this.f80668d.setImageResource(R.drawable.aea);
            m100375z();
            m100365d(true);
            C31858ad.m103406a();
            C31858ad.m103465e();
        }
        if (this.f80689y != null) {
            C30819b bVar = this.f80689y;
            if (i == -1) {
                i2 = 8;
            }
            bVar.mo80400a(i2);
        }
        this.f80679o = i;
        m100343B();
    }
}

package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.AppCompatCheckBox;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.widget.C13031a;
import com.bytedance.widget.Widget;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.comment.C24021a;
import com.p280ss.android.ugc.aweme.comment.C24021a.C24023b;
import com.p280ss.android.ugc.aweme.comment.C24093d;
import com.p280ss.android.ugc.aweme.comment.C24196o;
import com.p280ss.android.ugc.aweme.comment.abtest.DouyinDirectShowCommentMentionList;
import com.p280ss.android.ugc.aweme.comment.adapter.C24080k;
import com.p280ss.android.ugc.aweme.comment.adapter.C24081l;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter.C24037b;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24130a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24142b;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24151g;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24157h;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.comment.widget.C24374b;
import com.p280ss.android.ugc.aweme.comment.widget.C24375c;
import com.p280ss.android.ugc.aweme.comment.widget.C24375c.C24376a;
import com.p280ss.android.ugc.aweme.comment.widgets.SearchGifWidget;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.keyboard.C25700b;
import com.p280ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p280ss.android.ugc.aweme.common.p1148ui.BaseDialogFragment;
import com.p280ss.android.ugc.aweme.detail.p1167ui.FadeImageView;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.C27582c;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.C27582c.C27584a;
import com.p280ss.android.ugc.aweme.emoji.miniemojichoose.C27603a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1205c.C27532f;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27606a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43095eh;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment */
public class KeyboardDialogFragment extends BaseDialogFragment implements OnShowListener, TextWatcher, C24318aq, C25700b {

    /* renamed from: A */
    private boolean f64150A = true;

    /* renamed from: B */
    private boolean f64151B = false;

    /* renamed from: C */
    private ValueAnimator f64152C;

    /* renamed from: D */
    private int[] f64153D = null;

    /* renamed from: E */
    private boolean f64154E = false;

    /* renamed from: F */
    private CharSequence f64155F = null;

    /* renamed from: G */
    private C24093d f64156G;

    /* renamed from: H */
    private boolean f64157H = false;

    /* renamed from: I */
    private boolean f64158I = true;

    /* renamed from: a */
    public C24299b f64159a;

    /* renamed from: b */
    public C24298a f64160b;

    /* renamed from: c */
    public C24300c f64161c;

    /* renamed from: d */
    protected boolean f64162d;

    /* renamed from: e */
    protected int f64163e;

    /* renamed from: f */
    protected boolean f64164f;

    /* renamed from: g */
    protected boolean f64165g;

    /* renamed from: h */
    public boolean f64166h;

    /* renamed from: i */
    protected int f64167i;

    /* renamed from: j */
    protected boolean f64168j = false;

    /* renamed from: k */
    public Aweme f64169k;

    /* renamed from: l */
    public SearchGifWidget f64170l;

    /* renamed from: m */
    public Emoji f64171m;
    FadeImageView mAtView;
    AppCompatCheckBox mCbForward;
    CommentAtSearchLayout mCommentAtSearchLayout;
    CommentAtSearchLoadingView mCommentAtSearchLoadingView;
    View mContentLayout;
    MentionEditText mEditText;
    FadeImageView mEmojiView;
    DmtTextView mErrorText;
    RemoteImageView mGifEmoji;
    View mGifEmojiClear;
    ImageView mGifEmojiDrawingCache;
    View mGifEmojiLayout;
    View mGuideLayout;
    TextView mGuideText;
    View mInputLayout;
    LinearLayout mMiniPanelContainer;
    MeasureLinearLayout mOutWrapper;
    LinearLayout mPanelContainer;
    FadeImageView mPublishView;
    RecyclerView mRvSearch;
    View mSearchGifLayout;

    /* renamed from: n */
    public boolean f64172n = false;

    /* renamed from: o */
    public C24021a f64173o;

    /* renamed from: p */
    public boolean f64174p = false;

    /* renamed from: q */
    public CommentAtSearchAdapter f64175q;

    /* renamed from: u */
    private C24375c f64176u;

    /* renamed from: v */
    private C27582c f64177v;

    /* renamed from: w */
    private C43095eh f64178w;

    /* renamed from: x */
    private C24339u f64179x;

    /* renamed from: y */
    private Pattern f64180y = Pattern.compile("^\\s*$");

    /* renamed from: z */
    private boolean f64181z = true;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment$a */
    public interface C24298a {
        /* renamed from: a */
        void mo62481a(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean);

        /* renamed from: b */
        void mo62491b(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment$b */
    public interface C24299b {
        /* renamed from: a */
        void mo62466a(int i, int i2, int i3, String str, String str2);

        /* renamed from: a */
        void mo62475a(CharSequence charSequence);

        /* renamed from: a */
        void mo62476a(CharSequence charSequence, List<TextExtraStruct> list, Emoji emoji, boolean z);

        /* renamed from: a */
        void mo62479a(String str);

        /* renamed from: a */
        void mo62480a(String str, int i);

        /* renamed from: a */
        void mo62485a(boolean z);

        /* renamed from: b */
        void mo62486b(int i);

        /* renamed from: b */
        void mo62490b(String str);

        /* renamed from: c */
        void mo62493c(int i);

        /* renamed from: c */
        void mo62496c(User user);

        /* renamed from: d */
        void mo62498d(User user);

        /* renamed from: h */
        int mo62501h();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment$c */
    public interface C24300c {
        /* renamed from: a */
        void mo62471a(Emoji emoji);

        /* renamed from: i */
        void mo62502i();
    }

    /* renamed from: c */
    private static String m79921c(int i) {
        return i == 2 ? "favorite" : i == 3 ? "recent" : "recommend";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo63133a() {
        return R.drawable.ac9;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo63134b() {
        return R.drawable.acb;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: f */
    public final void mo63173f() {
        m79932z();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63151a(CompoundButton compoundButton, boolean z) {
        if (!this.f64181z) {
            C10761a.m31409e(getContext(), (int) R.string.ah6).mo25750a();
            this.mCbForward.setChecked(false);
            return;
        }
        this.f64165g = z;
        if (z) {
            this.mEditText.setFilters(new InputFilter[]{new C24374b(60)});
            if (this.f64179x != null) {
                this.f64179x.f64256a = 60;
            }
        } else {
            this.mEditText.setFilters(new InputFilter[]{new C24374b(100)});
            if (this.f64179x != null) {
                this.f64179x.f64256a = 100;
            }
        }
        if (this.f64159a != null) {
            this.f64159a.mo62485a(z);
        }
    }

    /* renamed from: a */
    public final void mo63152a(C24093d dVar) {
        this.f64156G = dVar;
        if (this.mEditText != null) {
            this.f64156G.mo62487b((EditText) this.mEditText);
        }
    }

    /* renamed from: a */
    public final void mo63157a(boolean z, int i) {
        this.mEditText.postDelayed(new C24303ab(this, z), (long) i);
    }

    /* renamed from: a */
    public static boolean m79918a(CharSequence charSequence, int i) {
        if (DouyinDirectShowCommentMentionList.withImTag() && charSequence != null && i == charSequence.length()) {
            return Pattern.matches("^@+[^@]*$", charSequence);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo63156a(boolean z) {
        if (!C6399b.m19944t()) {
            this.f64181z = z;
        }
    }

    /* renamed from: a */
    public final void mo63154a(String str, int i) {
        if (this.f64159a != null) {
            this.f64159a.mo62480a(str, i);
        }
    }

    /* renamed from: a */
    public final void mo63149a(View view, Emoji emoji, int i, int i2) {
        m79931y();
        this.f64171m = emoji;
        mo63155a(m79921c(i), m79917a(emoji), i2, emoji.getLogPb());
        mo63180j();
        mo63148a(view);
    }

    /* renamed from: a */
    public final void mo63153a(Emoji emoji, int i, int i2) {
        mo63161b(m79921c(i), m79917a(emoji), i2, emoji.getLogPb());
    }

    /* renamed from: a */
    public final void mo63148a(View view) {
        this.mGifEmojiLayout.setVisibility(0);
        this.mSearchGifLayout.setVisibility(8);
        this.mInputLayout.setVisibility(0);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.mContentLayout.getLocationInWindow(iArr2);
        this.mGifEmojiLayout.post(new C24307af(this, view, iArr, iArr2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63150a(View view, int[] iArr, int[] iArr2) {
        if (this.f64152C != null && this.f64152C.isRunning()) {
            this.f64152C.cancel();
        }
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache != null) {
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
            int width = createBitmap.getWidth();
            int i = iArr[0] - iArr2[0];
            int i2 = iArr[1] - iArr2[1];
            int i3 = this.f64153D[0] - iArr2[0];
            int i4 = this.f64153D[1] - iArr2[1];
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mGifEmojiDrawingCache.getLayoutParams();
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.width = width;
            LayoutParams layoutParams = this.mGifEmojiLayout.getLayoutParams();
            int i5 = layoutParams.width;
            this.f64152C = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(300);
            this.f64152C.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimator = this.f64152C;
            C24308ag agVar = new C24308ag(this, createBitmap, marginLayoutParams, i, i3, i2, i4, layoutParams, width, i5);
            valueAnimator.addUpdateListener(agVar);
            this.f64152C.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63147a(Bitmap bitmap, MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, LayoutParams layoutParams, int i5, int i6, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue == 0.0f) {
            this.mGifEmojiDrawingCache.setImageBitmap(bitmap);
            this.mGifEmojiDrawingCache.setVisibility(0);
            this.mGifEmojiLayout.setVisibility(0);
            this.mGifEmojiClear.setVisibility(8);
        } else if (floatValue == 1.0f) {
            this.mGifEmojiDrawingCache.setVisibility(8);
            this.mGifEmoji.setVisibility(0);
            this.mGifEmojiClear.setVisibility(0);
            this.mGifEmoji.setImageBitmap(bitmap);
        }
        float f = 1.0f - floatValue;
        marginLayoutParams.leftMargin = (int) ((((float) i) * f) + (((float) i2) * floatValue));
        marginLayoutParams.topMargin = (int) ((((float) i3) * f) + (((float) i4) * floatValue));
        layoutParams.width = (int) ((floatValue * ((float) i5)) + (f * ((float) i6)));
        this.mGifEmojiDrawingCache.requestLayout();
        this.mGifEmojiLayout.requestLayout();
    }

    /* renamed from: a */
    public final void mo63155a(String str, String str2, int i, LogPbBean logPbBean) {
        if (this.f64160b != null) {
            this.f64160b.mo62481a(str, this.f64170l.mo63329z(), str2, i, logPbBean);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo63181k() {
        this.f64173o.mo62300c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ C7581n mo63184n() {
        dismiss();
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ C7581n mo63185o() {
        mo63179i();
        return null;
    }

    /* renamed from: d */
    public final MentionSpan[] mo63170d() {
        if (this.mEditText != null) {
            return this.mEditText.getMentionText();
        }
        return null;
    }

    /* renamed from: e */
    public final void mo63171e() {
        KeyboardUtils.m77057c(this.mEditText);
        dismiss();
    }

    /* renamed from: g */
    public final void mo63175g() {
        if (this.f64156G != null) {
            this.f64156G.mo62470a((EditText) this.mEditText);
        }
    }

    public void onPause() {
        super.onPause();
        this.mOutWrapper.getKeyBoardObservable().mo66593b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo63182l() {
        this.f64174p = true;
        int selectionStart = this.mEditText.getSelectionStart();
        Editable text = this.mEditText.getText();
        if (text != null) {
            text.insert(selectionStart, "@");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ void mo63183m() {
        if (this.f64159a != null && this.f64162d && !C24093d.m79096n()) {
            this.f64159a.mo62493c(this.mEditText.getMentionTextCount());
        }
    }

    public void onResume() {
        super.onResume();
        this.mOutWrapper.getKeyBoardObservable().mo66592a((C25700b) this);
        this.mEditText.requestFocus();
        mo63157a(!this.f64168j, (int) C34943c.f91127w);
    }

    /* renamed from: s */
    private void m79925s() {
        if (this.mMiniPanelContainer != null) {
            if (this.f64179x == null) {
                this.f64179x = new C24339u(this.mEditText, this.f64167i, this);
            }
            this.mMiniPanelContainer.addView(new C27603a(this.f64179x, this.mMiniPanelContainer, C27532f.f72580b.mo70750a()).mo70735a());
        }
    }

    /* renamed from: u */
    private void m79927u() {
        this.mGuideLayout.setVisibility(0);
        this.mGuideLayout.animate().setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(3000).alpha(0.0f).setDuration(200).start();
    }

    /* renamed from: v */
    private boolean m79928v() {
        if (C6399b.m19944t() || !this.f64172n) {
            return false;
        }
        int a = C24157h.m79363a().mo62585a(9);
        if (a != 1 && a != 5 && a != 9) {
            return false;
        }
        this.mGuideText.setText(R.string.a9g);
        m79927u();
        return true;
    }

    /* renamed from: y */
    private void m79931y() {
        if (this.f64153D == null) {
            int[] iArr = new int[2];
            this.mEditText.getLocationInWindow(iArr);
            this.f64153D = new int[2];
            this.f64153D[0] = iArr[0];
            this.f64153D[1] = (int) (((float) iArr[1]) + C9738o.m28708b(C6399b.m19921a(), -15.0f));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo63165c() {
        if (this.f64159a != null) {
            this.f64159a.mo62476a(this.mEditText.getText(), this.mEditText.getTextExtraStructList(), this.f64171m, this.f64165g);
            this.f64178w.mo104754b("comment");
            C27606a b = C27606a.m90489b(C6399b.m19921a());
            C24130a.m79271a(b.mo70935b(), b.mo70936a((CharSequence) this.mEditText.getText()));
        }
    }

    /* renamed from: h */
    public final boolean mo63178h() {
        if (!C6861a.m21337f().isLogin() || !this.f64162d) {
            return false;
        }
        if (this.mEditText.getTextExtraStructList() == null || this.mEditText.getTextExtraStructList().size() < 5) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo63180j() {
        boolean z;
        Editable text = this.mEditText.getText();
        FadeImageView fadeImageView = this.mPublishView;
        if ((text == null || text.length() <= 0 || this.f64180y.matcher(text).matches()) && this.f64171m == null) {
            z = false;
        } else {
            z = true;
        }
        fadeImageView.setEnabled(z);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f64156G != null) {
            this.f64156G.mo62494c((EditText) this.mEditText);
        }
        if (C24093d.m79096n() && this.f64173o != null) {
            this.f64173o.mo62302e();
        }
        if (this.f64177v != null) {
            this.f64177v.mo70739e();
        }
    }

    public void onStart() {
        super.onStart();
        if (C24093d.m79096n()) {
            try {
                Window window = getDialog().getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.dimAmount = 0.15f;
                    window.setAttributes(attributes);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: t */
    private void m79926t() {
        if (this.mPanelContainer != null) {
            if (this.f64179x == null) {
                this.f64179x = new C24339u(this.mEditText, this.f64167i, this);
            }
            C27584a a = new C27584a(this.f64179x, this.mPanelContainer).mo70822a();
            if (C24220a.m79551a().supportCommentGifEmoji() && this.f64163e != 4) {
                a.mo70823b().mo70824c();
            }
            this.f64177v = a.mo70825d();
            this.mPanelContainer.addView(this.f64177v.mo70735a());
        }
    }

    /* renamed from: w */
    private void m79929w() {
        if (!C6399b.m19944t() && C24220a.m79551a().shouldReplyDirectly()) {
            C22903bl a = C24196o.f63859b.mo62819a();
            String str = (String) a.mo59877d();
            String curUserId = C6861a.m21337f().getCurUserId();
            if (!str.contains(curUserId)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(curUserId);
                sb.append(";");
                a.mo59871a(sb.toString());
                if (C24220a.m79551a().isCommentShareable()) {
                    this.mGuideText.setText(R.string.a8n);
                } else {
                    this.mGuideText.setText(R.string.a8s);
                }
                m79927u();
            }
        }
    }

    /* renamed from: z */
    private void m79932z() {
        m79931y();
        int height = this.mInputLayout.getHeight();
        int height2 = this.mSearchGifLayout.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, (float) height2, 0.0f);
        translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation2.setDuration(300);
        translateAnimation.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                KeyboardDialogFragment.this.mInputLayout.setVisibility(8);
            }
        });
        translateAnimation2.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                KeyboardDialogFragment.this.mSearchGifLayout.setAlpha(1.0f);
                KeyboardDialogFragment.this.mSearchGifLayout.setVisibility(0);
                KeyboardDialogFragment.this.f64170l.mo63325v();
            }
        });
        this.mInputLayout.startAnimation(translateAnimation);
        this.mSearchGifLayout.startAnimation(translateAnimation2);
    }

    public void dismiss() {
        if (C24220a.m79551a().isMiniEmojiPanelEnabled()) {
            C27532f.f72580b.mo70752b();
        }
        this.f64179x = null;
        if (this.f64152C != null && this.f64152C.isRunning()) {
            this.f64152C.cancel();
            this.mGifEmojiDrawingCache.setVisibility(8);
        }
        this.f64170l.mo63327x();
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        if (this.f64161c != null) {
            this.f64161c.mo62471a(this.f64171m);
        }
        this.f64171m = null;
    }

    /* renamed from: i */
    public final void mo63179i() {
        this.f64170l.mo63326w();
        int height = this.mInputLayout.getHeight();
        int height2 = this.mSearchGifLayout.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height2));
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setDuration(300);
        translateAnimation.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                KeyboardDialogFragment.this.mInputLayout.setVisibility(0);
            }
        });
        animationSet.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                KeyboardDialogFragment.this.mSearchGifLayout.setAlpha(0.0f);
                KeyboardDialogFragment.this.mSearchGifLayout.setVisibility(8);
                KeyboardDialogFragment.this.mEditText.requestFocus();
                if (!KeyboardDialogFragment.this.f64168j) {
                    if (C24093d.m79096n()) {
                        KeyboardDialogFragment.this.f64173o.mo62293a(KeyboardDialogFragment.this.mEditText.getSelectionStart(), KeyboardDialogFragment.this.mEditText.getText());
                    }
                    KeyboardDialogFragment.this.mEmojiView.setImageResource(KeyboardDialogFragment.this.mo63133a());
                    KeyboardDialogFragment.this.mEmojiView.setContentDescription(C6399b.m19921a().getString(R.string.c7));
                    KeyboardUtils.m77056b(KeyboardDialogFragment.this.mEditText);
                    return;
                }
                if (C24093d.m79096n()) {
                    KeyboardDialogFragment.this.mCommentAtSearchLayout.dismiss();
                }
                KeyboardDialogFragment.this.mEmojiView.setImageResource(KeyboardDialogFragment.this.mo63134b());
                KeyboardDialogFragment.this.mEmojiView.setContentDescription(C6399b.m19921a().getString(R.string.c8));
                KeyboardUtils.m77057c(KeyboardDialogFragment.this.mEditText);
            }
        });
        this.mInputLayout.startAnimation(translateAnimation);
        this.mSearchGifLayout.startAnimation(animationSet);
    }

    /* renamed from: q */
    private void m79923q() {
        int i;
        int i2;
        this.mPublishView.setOnClickListener(new C24309ah(this));
        this.mAtView.setOnClickListener(new C24310ai(this));
        this.mEmojiView.setOnClickListener(new C24311aj(this));
        FadeImageView fadeImageView = this.mEmojiView;
        if (this.f64168j) {
            i = mo63134b();
        } else {
            i = mo63133a();
        }
        fadeImageView.setImageResource(i);
        FadeImageView fadeImageView2 = this.mEmojiView;
        Context a = C6399b.m19921a();
        if (this.f64168j) {
            i2 = R.string.c8;
        } else {
            i2 = R.string.c7;
        }
        fadeImageView2.setContentDescription(a.getString(i2));
        this.f64178w.mo104752a((EditText) this.mEditText);
        this.mEditText.setMentionTextColor(C0683b.m2912c(C6399b.m19921a(), R.color.a4p));
        this.mEditText.setOnMentionInputListener(new C24312ak(this));
        this.mEditText.setOnClickListener(new C24313al(this));
        this.mOutWrapper.setOnClickListener(new C24314am(this));
        this.mOutWrapper.findViewById(R.id.a19).setOnClickListener(C24315an.f64219a);
        this.mCbForward.setOnCheckedChangeListener(new C24316ao(this));
        this.mGifEmojiClear.setOnClickListener(new C24344z(this));
        this.f64176u = new C24375c(this.mPanelContainer);
        this.f64176u.mo63299a((C24376a) new C24302aa(this));
    }

    /* renamed from: x */
    private void m79930x() {
        if (C24093d.m79096n()) {
            if (this.f64173o == null) {
                this.f64173o = new C24021a();
            }
            this.f64173o.mo62301d();
            this.mRvSearch.setLayoutManager(new LinearLayoutManager(getActivity()));
            this.f64175q = new CommentAtSearchAdapter(this.f64169k, this.f64151B);
            this.mRvSearch.setAdapter(this.f64175q);
            this.mErrorText.setOnClickListener(new C24305ad(this));
            this.f64173o.mo62294a((C24023b) new C24023b() {
                public final void dismiss() {
                    KeyboardDialogFragment.this.mCommentAtSearchLayout.dismiss();
                }

                /* renamed from: a */
                public final void mo62304a() {
                    KeyboardDialogFragment.this.mErrorText.setVisibility(8);
                    KeyboardDialogFragment.this.mRvSearch.setVisibility(0);
                    KeyboardDialogFragment.this.mCommentAtSearchLayout.mo63048a();
                }

                /* renamed from: b */
                public final void mo62307b() {
                    KeyboardDialogFragment.this.mErrorText.setVisibility(0);
                    KeyboardDialogFragment.this.mRvSearch.setVisibility(8);
                }

                /* renamed from: a */
                public final void mo62305a(boolean z) {
                    KeyboardDialogFragment.this.mCommentAtSearchLoadingView.mo63060a(!z);
                    if (z) {
                        KeyboardDialogFragment.this.mCommentAtSearchLoadingView.setVisibility(8);
                    } else {
                        KeyboardDialogFragment.this.mCommentAtSearchLoadingView.setVisibility(0);
                    }
                }

                /* renamed from: a */
                public final boolean mo62306a(String str) {
                    return TextUtils.equals(str, C24021a.m78840a(KeyboardDialogFragment.this.mEditText.getSelectionStart(), KeyboardDialogFragment.this.mEditText.getEditableText(), true));
                }
            });
            this.f64173o.mo62295a(this.f64175q);
            this.f64175q.mo66504a((C6905a) new C24306ae(this));
            this.f64175q.f63569a = new C24037b() {
                /* renamed from: a */
                public final void mo62327a(User user) {
                    Context context = KeyboardDialogFragment.this.getContext();
                    if (context == null) {
                        context = C6399b.m19921a();
                    }
                    if (!C24317ap.m80000a(context)) {
                        C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
                    } else if (!KeyboardDialogFragment.this.mCommentAtSearchLayout.f63994c) {
                        KeyboardDialogFragment.this.f64159a.mo62496c(user);
                        C10761a.m31409e(context, (int) R.string.bpe).mo25750a();
                        KeyboardDialogFragment.this.mEditText.setText("");
                        KeyboardDialogFragment.this.mo63171e();
                    }
                }

                /* renamed from: a */
                public final void mo62326a(int i, SummonFriendItem summonFriendItem) {
                    int i2;
                    if (!KeyboardDialogFragment.this.mCommentAtSearchLayout.f63994c) {
                        KeyboardDialogFragment.this.mCommentAtSearchLayout.dismiss();
                        Editable text = KeyboardDialogFragment.this.mEditText.getText();
                        int selectionStart = KeyboardDialogFragment.this.mEditText.getSelectionStart();
                        String a = C24021a.m78840a(selectionStart, KeyboardDialogFragment.this.mEditText.getText(), false);
                        if (a == null) {
                            a = "";
                        }
                        String str = a;
                        if (text != null) {
                            text.delete(selectionStart - str.length(), selectionStart);
                        }
                        User user = summonFriendItem.mUser;
                        if (user != null) {
                            String nickname = user.getNickname();
                            boolean a2 = KeyboardDialogFragment.this.mo63158a(C43122ff.m136773d(summonFriendItem.mUser), summonFriendItem.mUser.getUid());
                            if (!a2 && KeyboardDialogFragment.this.getContext() != null) {
                                C9738o.m28693a(KeyboardDialogFragment.this.getContext(), (int) R.string.ib);
                            }
                            if (a2) {
                                C24299b bVar = KeyboardDialogFragment.this.f64159a;
                                int length = str.length();
                                if (nickname != null) {
                                    i2 = nickname.length();
                                } else {
                                    i2 = 0;
                                }
                                bVar.mo62466a(length, i2, i + 1, str, user.getUid());
                                KeyboardDialogFragment.this.f64159a.mo62498d(user);
                            }
                        }
                    }
                }
            };
            this.mEditText.addTextChangedListener(new C23467g() {
                public final void afterTextChanged(Editable editable) {
                    if (KeyboardDialogFragment.this.mo63178h() && !KeyboardDialogFragment.this.f64168j && !KeyboardDialogFragment.this.mCommentAtSearchLayout.f63995d) {
                        KeyboardDialogFragment.this.f64175q.f63571c = KeyboardDialogFragment.m79918a((CharSequence) editable, KeyboardDialogFragment.this.mEditText.getSelectionStart());
                        KeyboardDialogFragment.this.f64173o.mo62293a(KeyboardDialogFragment.this.mEditText.getSelectionStart(), editable);
                    }
                    KeyboardDialogFragment.this.mo63175g();
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (!TextUtils.isEmpty(charSequence) && i3 > 0) {
                        if ('@' == charSequence.toString().charAt((i + i3) - 1) && KeyboardDialogFragment.this.mo63178h()) {
                            KeyboardDialogFragment.this.mCommentAtSearchLayout.mo63048a();
                            if (KeyboardDialogFragment.this.f64159a != null) {
                                if (KeyboardDialogFragment.this.f64174p) {
                                    KeyboardDialogFragment.this.f64159a.mo62490b("button");
                                } else {
                                    KeyboardDialogFragment.this.f64159a.mo62490b("input");
                                }
                                if (KeyboardDialogFragment.this.f64168j) {
                                    KeyboardDialogFragment.this.f64159a.mo62479a("icon");
                                    KeyboardDialogFragment.this.mo63157a(KeyboardDialogFragment.this.f64168j, 0);
                                }
                            }
                            KeyboardDialogFragment.this.f64174p = false;
                        } else if (KeyboardDialogFragment.this.mEditText.getTextExtraStructList().size() >= 5) {
                            C9738o.m28693a(KeyboardDialogFragment.this.getContext(), (int) R.string.c8n);
                        }
                    }
                }
            });
            if (C6399b.m19947w()) {
                this.mEditText.setHighlightColor(getContext().getResources().getColor(R.color.a90));
            }
        }
    }

    /* renamed from: r */
    private void m79924r() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f64154E = arguments.getBoolean("clickAt");
            this.f64167i = arguments.getInt("maxLength");
            int i3 = 0;
            if (this.f64167i > 0) {
                this.mEditText.setFilters(new InputFilter[]{new C24374b(this.f64167i)});
            }
            m79920b(this.f64171m);
            CharSequence charSequence = arguments.getCharSequence("hint");
            if (charSequence != null) {
                this.mEditText.setHint(charSequence);
            }
            if (!m79928v()) {
                m79929w();
            }
            User user = (User) arguments.getSerializable("user");
            if (user != null) {
                this.mEditText.setHint(C6399b.m19921a().getString(R.string.dem, new Object[]{C43122ff.m136753A(user)}));
                if (this.f64159a != null) {
                    this.f64159a.mo62475a(this.mEditText.getHint());
                }
            }
            this.mEditText.addTextChangedListener(this);
            HashSet hashSet = (HashSet) arguments.getSerializable("atUserSet");
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    User user2 = (User) it.next();
                    mo63158a(C43122ff.m136773d(user2), user2.getUid());
                }
            }
            User user3 = (User) arguments.getSerializable("atUser");
            if (user3 != null) {
                mo63158a(C43122ff.m136773d(user3), user3.getUid());
            }
            this.mPublishView.setVisibility(0);
            mo63180j();
            boolean z3 = arguments.getBoolean("showAt");
            FadeImageView fadeImageView = this.mAtView;
            if (z3) {
                i = 0;
            } else {
                i = 8;
            }
            fadeImageView.setVisibility(i);
            this.f64162d = z3;
            this.f64163e = arguments.getInt("viewType");
            this.f64164f = arguments.getBoolean("canForward");
            if (!this.f64164f || this.f64163e == 4) {
                z = false;
            } else {
                z = true;
            }
            AppCompatCheckBox appCompatCheckBox = this.mCbForward;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            appCompatCheckBox.setVisibility(i2);
            if (!this.f64164f || z) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f64165g = z2;
            if (!this.f64181z) {
                this.mCbForward.setTextColor(getContext().getResources().getColor(R.color.ly));
            } else {
                this.mCbForward.setTextColor(getContext().getResources().getColor(R.color.a7r));
            }
            m79926t();
            C24375c cVar = this.f64176u;
            if (!this.f64168j) {
                i3 = 8;
            }
            cVar.mo63298a(i3);
            if (C24220a.m79551a().isMiniEmojiPanelEnabled()) {
                m79922e(!this.f64168j);
                m79925s();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo63168d(View view) {
        mo63171e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63146a(int i) {
        if (i == 0 && this.f64177v != null) {
            this.f64177v.mo70817g();
        }
    }

    public void afterTextChanged(Editable editable) {
        C27608b.m90502a((TextView) this.mEditText);
        mo63175g();
        mo63180j();
    }

    /* renamed from: b */
    public final void mo63162b(boolean z) {
        if (!C6399b.m19944t()) {
            this.f64150A = z;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mOutWrapper != null) {
            this.mOutWrapper.mo66588a();
        }
    }

    public void onShow(DialogInterface dialogInterface) {
        if (this.f64161c != null) {
            this.f64161c.mo62502i();
        }
    }

    /* renamed from: e */
    private void m79922e(boolean z) {
        int i;
        if (C24220a.m79551a().isMiniEmojiPanelEnabled() && this.mMiniPanelContainer != null) {
            LinearLayout linearLayout = this.mMiniPanelContainer;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo63160b(View view) {
        this.f64173o.mo62293a(this.mEditText.getSelectionStart(), this.mEditText.getText());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo63166c(View view) {
        this.mGifEmojiLayout.setVisibility(8);
        this.mGifEmoji.setImageBitmap(null);
        this.f64171m = null;
        mo63180j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo63174f(View view) {
        if (this.f64168j && this.f64159a != null) {
            this.f64159a.mo62479a("icon");
        }
        mo63157a(this.f64168j, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo63177h(View view) {
        if (!this.f64150A) {
            C10761a.m31409e(getContext(), (int) R.string.ah5).mo25750a();
        } else {
            C24151g.m79360a(getContext(), (C24142b) new C24142b() {
                /* renamed from: a */
                public final void mo62571a(boolean z) {
                    KeyboardDialogFragment.this.mo63165c();
                }
            });
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.sf);
        this.f64178w = new C43095eh();
    }

    /* renamed from: b */
    private void m79920b(Emoji emoji) {
        if (emoji != null) {
            UrlModel animateUrl = emoji.getAnimateUrl();
            if (animateUrl != null) {
                this.mGifEmojiLayout.setVisibility(0);
                this.mGifEmojiClear.setVisibility(0);
                int[] a = C24080k.m79004a(emoji);
                this.mGifEmojiLayout.getLayoutParams().width = a[0];
                this.mGifEmojiLayout.requestLayout();
                C23323e.m76506a(this.mGifEmoji, animateUrl, a[0], a[1]);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo63172e(View view) {
        if (this.f64168j && this.f64159a != null) {
            this.f64159a.mo62479a("box");
        }
        mo63157a(true, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo63176g(View view) {
        if (this.f64159a != null) {
            if (C24093d.m79096n()) {
                this.f64174p = true;
                if (!this.f64168j) {
                    int selectionStart = this.mEditText.getSelectionStart();
                    Editable text = this.mEditText.getText();
                    if (text != null) {
                        text.insert(selectionStart, "@");
                    }
                    return;
                }
                this.f64154E = true;
                mo63157a(true, 0);
                return;
            }
            this.f64159a.mo62486b(this.mEditText.getMentionTextCount());
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m79930x();
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().setOnShowListener(this);
        m79923q();
        m79924r();
        if (bundle != null) {
            try {
                super.dismiss();
            } catch (IllegalStateException unused) {
                super.dismissAllowingStateLoss();
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        int i;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("showEmojiPanel")) {
            i = 21;
        } else {
            i = 19;
            this.f64168j = true;
        }
        if (window != null) {
            window.setSoftInputMode(i);
            window.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    /* renamed from: b */
    private int m79919b(int i) {
        float f;
        Context context = getContext();
        if (C6399b.m19944t()) {
            f = 220.0f;
        } else {
            f = 200.0f;
        }
        float b = C9738o.m28708b(context, f);
        if (this.f64159a.mo62501h() <= 0) {
            return (int) b;
        }
        float h = ((float) (this.f64159a.mo62501h() - i)) - C9738o.m28708b(getContext(), 52.0f);
        if (h > b) {
            return (int) h;
        }
        if (((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), 52.0f) < b) {
            return (int) (((float) (C9738o.m28691a(getContext()) - i)) - C9738o.m28708b(getContext(), 52.0f));
        }
        return (int) b;
    }

    /* renamed from: c */
    public final void mo63167c(boolean z) {
        if (!C6399b.m19944t()) {
            this.f64151B = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo63169d(boolean z) {
        if (z) {
            if (C24093d.m79096n()) {
                this.f64175q.f63571c = m79918a((CharSequence) this.mEditText.getText(), this.mEditText.getSelectionStart());
                this.f64173o.mo62293a(this.mEditText.getSelectionStart(), this.mEditText.getText());
            }
            this.mEditText.requestFocus();
            KeyboardUtils.m77056b(this.mEditText);
        } else {
            if (C24093d.m79096n()) {
                this.mCommentAtSearchLayout.dismiss();
            }
            KeyboardUtils.m77057c(this.mEditText);
        }
        this.f64168j = !z;
    }

    /* renamed from: a */
    public static String m79917a(Emoji emoji) {
        String str = "";
        if (emoji == null || emoji.getAnimateUrl() == null) {
            return str;
        }
        return emoji.getAnimateUrl().getUri();
    }

    /* renamed from: a */
    public final boolean mo63158a(String str, String str2) {
        return this.mEditText.mo105248a(0, str, str2);
    }

    /* renamed from: a */
    private static KeyboardDialogFragment m79911a(int i, boolean z) {
        KeyboardDialogFragment keyboardDialogFragment = new KeyboardDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("viewType", i);
        bundle.putBoolean("canForward", z);
        keyboardDialogFragment.setArguments(bundle);
        return keyboardDialogFragment;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C13031a a = C13031a.f34476e.mo31608a(this, view);
        this.f64170l = new SearchGifWidget(new C24342x(this), new C24081l() {
            /* renamed from: b */
            public final void mo62400b(View view, Emoji emoji, int i) {
                KeyboardDialogFragment.this.mo63161b("search", KeyboardDialogFragment.m79917a(emoji), i, emoji.getLogPb());
            }

            /* renamed from: a */
            public final void mo62399a(View view, Emoji emoji, int i) {
                KeyboardDialogFragment.this.f64171m = emoji;
                KeyboardDialogFragment.this.mo63155a("search", KeyboardDialogFragment.m79917a(emoji), i, emoji.getLogPb());
                KeyboardDialogFragment.this.mo63180j();
                KeyboardDialogFragment.this.mo63148a(view);
                KeyboardDialogFragment.this.mo63179i();
            }
        }, new C24343y(this));
        a.mo31604a((int) R.id.bjm, (Widget) this.f64170l, false);
        if (this.f64156G != null) {
            this.f64156G.mo62487b((EditText) this.mEditText);
        }
    }

    /* renamed from: b */
    public final void mo63163b(boolean z, int i) {
        if (C24093d.m79096n()) {
            int b = m79919b(i);
            this.mCommentAtSearchLayout.getLayoutParams().height = b;
            this.mCommentAtSearchLayout.setInitValue(b);
            if (this.f64154E) {
                this.mEditText.postDelayed(new C24304ac(this), 300);
                this.f64154E = false;
            }
            if (z && !this.f64157H && !this.f64158I) {
                this.f64173o.mo62293a(this.mEditText.getSelectionStart(), this.mEditText.getText());
            }
            if (!z) {
                this.mCommentAtSearchLayout.dismiss();
            }
            this.f64158I = false;
        }
        int i2 = 8;
        if (z) {
            this.mEmojiView.setImageResource(mo63133a());
            this.mEmojiView.setContentDescription(C6399b.m19921a().getString(R.string.c7));
            this.f64176u.mo63298a(8);
            m79922e(true);
        } else {
            this.mEmojiView.setImageResource(mo63134b());
            this.mEmojiView.setContentDescription(C6399b.m19921a().getString(R.string.c8));
            C24375c cVar = this.f64176u;
            if (this.f64168j) {
                i2 = 0;
            }
            cVar.mo63298a(i2);
            m79922e(!this.f64168j);
            if (this.f64166h) {
                mo63157a(!this.f64168j, (int) C34943c.f91128x);
                this.f64166h = false;
            } else if (!this.f64168j || this.f64170l.f64409h) {
                dismiss();
            }
        }
        this.f64157H = z;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.oe, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    /* renamed from: a */
    public static KeyboardDialogFragment m79912a(User user, int i, int i2, boolean z) {
        KeyboardDialogFragment a = m79911a(i2, z);
        Bundle arguments = a.getArguments();
        if (arguments != null) {
            arguments.putSerializable("atUser", user);
            arguments.putInt("maxLength", i);
            arguments.putBoolean("showAt", true);
        }
        return a;
    }

    /* renamed from: b */
    public final void mo63161b(String str, String str2, int i, LogPbBean logPbBean) {
        if (this.f64160b != null) {
            this.f64160b.mo62491b(str, this.f64170l.mo63329z(), str2, i, logPbBean);
        }
    }

    /* renamed from: a */
    public static KeyboardDialogFragment m79916a(HashSet<User> hashSet, int i, int i2, boolean z) {
        KeyboardDialogFragment a = m79911a(i2, z);
        Bundle arguments = a.getArguments();
        if (arguments != null) {
            arguments.putSerializable("atUserSet", hashSet);
            arguments.putInt("maxLength", i);
            arguments.putBoolean("showAt", true);
        }
        return a;
    }

    /* renamed from: a */
    public static KeyboardDialogFragment m79913a(User user, int i, boolean z, int i2, boolean z2) {
        KeyboardDialogFragment a = m79911a(i2, z2);
        Bundle arguments = a.getArguments();
        if (arguments != null) {
            arguments.putSerializable("user", user);
            arguments.putInt("maxLength", i);
            arguments.putBoolean("showAt", true);
        }
        return a;
    }

    /* renamed from: a */
    public static KeyboardDialogFragment m79914a(CharSequence charSequence, int i, boolean z, int i2, boolean z2, boolean z3) {
        KeyboardDialogFragment a = m79911a(i2, z2);
        Bundle arguments = a.getArguments();
        if (arguments != null) {
            arguments.putCharSequence("hint", charSequence);
            arguments.putInt("maxLength", i);
            arguments.putBoolean("showAt", true);
            arguments.putBoolean("showEmojiPanel", z3);
        }
        return a;
    }

    /* renamed from: a */
    public static KeyboardDialogFragment m79915a(CharSequence charSequence, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
        KeyboardDialogFragment a = m79911a(i2, z2);
        Bundle arguments = a.getArguments();
        if (arguments != null) {
            arguments.putCharSequence("hint", charSequence);
            arguments.putInt("maxLength", i);
            arguments.putBoolean("showAt", true);
            arguments.putBoolean("showEmojiPanel", z3);
            arguments.putBoolean("clickAt", z4);
        }
        return a;
    }
}

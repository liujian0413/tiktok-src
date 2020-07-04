package android.support.p029v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.CursorAdapter;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.view.C1155c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends LinearLayoutCompat implements C1155c {

    /* renamed from: o */
    static final C1306a f5031o = new C1306a();

    /* renamed from: A */
    private final Drawable f5032A;

    /* renamed from: B */
    private final int f5033B;

    /* renamed from: C */
    private final int f5034C;

    /* renamed from: D */
    private final Intent f5035D;

    /* renamed from: E */
    private final Intent f5036E;

    /* renamed from: F */
    private final CharSequence f5037F;

    /* renamed from: G */
    private C1308c f5038G;

    /* renamed from: H */
    private C1307b f5039H;

    /* renamed from: I */
    private C1309d f5040I;

    /* renamed from: J */
    private OnClickListener f5041J;

    /* renamed from: K */
    private CharSequence f5042K;

    /* renamed from: L */
    private boolean f5043L;

    /* renamed from: M */
    private int f5044M;

    /* renamed from: N */
    private boolean f5045N;

    /* renamed from: O */
    private CharSequence f5046O;

    /* renamed from: P */
    private CharSequence f5047P;

    /* renamed from: Q */
    private boolean f5048Q;

    /* renamed from: R */
    private int f5049R;

    /* renamed from: S */
    private Bundle f5050S;

    /* renamed from: T */
    private final Runnable f5051T;

    /* renamed from: U */
    private Runnable f5052U;

    /* renamed from: V */
    private final WeakHashMap<String, ConstantState> f5053V;

    /* renamed from: W */
    private final OnClickListener f5054W;

    /* renamed from: a */
    final SearchAutoComplete f5055a;

    /* renamed from: aa */
    private final OnEditorActionListener f5056aa;

    /* renamed from: ab */
    private final OnItemClickListener f5057ab;

    /* renamed from: ac */
    private final OnItemSelectedListener f5058ac;

    /* renamed from: ad */
    private TextWatcher f5059ad;

    /* renamed from: b */
    final ImageView f5060b;

    /* renamed from: c */
    final ImageView f5061c;

    /* renamed from: d */
    final ImageView f5062d;

    /* renamed from: g */
    final ImageView f5063g;

    /* renamed from: h */
    OnFocusChangeListener f5064h;

    /* renamed from: i */
    public boolean f5065i;

    /* renamed from: j */
    public boolean f5066j;

    /* renamed from: k */
    CursorAdapter f5067k;

    /* renamed from: l */
    public boolean f5068l;

    /* renamed from: m */
    public boolean f5069m;

    /* renamed from: n */
    SearchableInfo f5070n;

    /* renamed from: p */
    OnKeyListener f5071p;

    /* renamed from: q */
    private final View f5072q;

    /* renamed from: r */
    private final View f5073r;

    /* renamed from: s */
    private final View f5074s;

    /* renamed from: t */
    private final View f5075t;

    /* renamed from: u */
    private C1310e f5076u;

    /* renamed from: v */
    private Rect f5077v;

    /* renamed from: w */
    private Rect f5078w;

    /* renamed from: x */
    private int[] f5079x;

    /* renamed from: y */
    private int[] f5080y;

    /* renamed from: z */
    private final ImageView f5081z;

    /* renamed from: android.support.v7.widget.SearchView$SavedState */
    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m6325a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m6323a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m6323a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m6325a(i);
            }

            /* renamed from: a */
            private static SavedState m6324a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m6324a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        boolean f5092a;

        public String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f5092a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f5092a));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5092a = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a */
        final Runnable f5093a;

        /* renamed from: b */
        private int f5094b;

        /* renamed from: c */
        private SearchView f5095c;

        /* renamed from: d */
        private boolean f5096d;

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5979a() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        public boolean enoughToFilter() {
            if (this.f5094b <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5980b() {
            if (this.f5096d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f5096d = false;
            }
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600 || (i >= 640 && i2 >= 480)) {
                return 192;
            }
            return 160;
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f5095c = searchView;
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f5094b = i;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f5096d) {
                removeCallbacks(this.f5093a);
                post(this.f5093a);
            }
            return onCreateInputConnection;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f5095c.hasFocus() && getVisibility() == 0) {
                this.f5096d = true;
                if (SearchView.m6292a(getContext())) {
                    SearchView.f5031o.mo5993a(this, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f5096d = false;
                removeCallbacks(this.f5093a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f5096d = false;
                removeCallbacks(this.f5093a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f5096d = true;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.bq);
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f5095c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f5095c.mo5938i();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f5093a = new Runnable() {
                public final void run() {
                    SearchAutoComplete.this.mo5980b();
                }
            };
            this.f5094b = getThreshold();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    static class C1306a {

        /* renamed from: a */
        private Method f5098a;

        /* renamed from: b */
        private Method f5099b;

        /* renamed from: c */
        private Method f5100c;

        C1306a() {
            try {
                this.f5098a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f5098a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f5099b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f5099b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f5100c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f5100c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5992a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f5098a != null) {
                try {
                    this.f5098a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5994b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f5099b != null) {
                try {
                    this.f5099b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5993a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f5100c != null) {
                try {
                    this.f5100c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(true)});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C1307b {
        /* renamed from: a */
        boolean mo5995a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C1308c {
        /* renamed from: a */
        boolean mo5996a(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C1309d {
        /* renamed from: a */
        boolean mo5997a(int i);

        /* renamed from: b */
        boolean mo5998b(int i);
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    static class C1310e extends TouchDelegate {

        /* renamed from: a */
        private final View f5101a;

        /* renamed from: b */
        private final Rect f5102b = new Rect();

        /* renamed from: c */
        private final Rect f5103c = new Rect();

        /* renamed from: d */
        private final Rect f5104d = new Rect();

        /* renamed from: e */
        private final int f5105e;

        /* renamed from: f */
        private boolean f5106f;

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                float r0 = r7.getX()
                int r0 = (int) r0
                float r1 = r7.getY()
                int r1 = (int) r1
                int r2 = r7.getAction()
                r3 = 1
                r4 = 0
                switch(r2) {
                    case 0: goto L_0x0027;
                    case 1: goto L_0x0019;
                    case 2: goto L_0x0019;
                    case 3: goto L_0x0014;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0033
            L_0x0014:
                boolean r2 = r6.f5106f
                r6.f5106f = r4
                goto L_0x0034
            L_0x0019:
                boolean r2 = r6.f5106f
                if (r2 == 0) goto L_0x0034
                android.graphics.Rect r5 = r6.f5104d
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L_0x0034
                r3 = 0
                goto L_0x0034
            L_0x0027:
                android.graphics.Rect r2 = r6.f5102b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x0033
                r6.f5106f = r3
                r2 = 1
                goto L_0x0034
            L_0x0033:
                r2 = 0
            L_0x0034:
                if (r2 == 0) goto L_0x006b
                if (r3 == 0) goto L_0x0056
                android.graphics.Rect r2 = r6.f5103c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0056
                android.view.View r0 = r6.f5101a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f5101a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                goto L_0x0065
            L_0x0056:
                android.graphics.Rect r2 = r6.f5103c
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r6.f5103c
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
            L_0x0065:
                android.view.View r0 = r6.f5101a
                boolean r4 = r0.dispatchTouchEvent(r7)
            L_0x006b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.SearchView.C1310e.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* renamed from: a */
        public final void mo5999a(Rect rect, Rect rect2) {
            this.f5102b.set(rect);
            this.f5104d.set(rect);
            this.f5104d.inset(-this.f5105e, -this.f5105e);
            this.f5103c.set(rect2);
        }

        public C1310e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f5105e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo5999a(rect, rect2);
            this.f5101a = view;
        }
    }

    public int getMaxWidth() {
        return this.f5044M;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionCommitIconResId() {
        return this.f5034C;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionRowLayout() {
        return this.f5033B;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.f5067k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5921a(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f5070n != null && this.f5067k != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo5920a(this.f5055a.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f5055a.length();
                }
                this.f5055a.setSelection(i2);
                this.f5055a.setListSelection(0);
                this.f5055a.clearListSelection();
                f5031o.mo5993a(this.f5055a, true);
                return true;
            } else if (i != 19 || this.f5055a.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo4577a() {
        if (!this.f5048Q) {
            this.f5048Q = true;
            this.f5049R = this.f5055a.getImeOptions();
            this.f5055a.setImeOptions(this.f5049R | 33554432);
            this.f5055a.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5920a(int i, int i2, String str) {
        if (this.f5040I != null && this.f5040I.mo5998b(i)) {
            return false;
        }
        m6295b(i, 0, null);
        this.f5055a.setImeVisibility(false);
        m6306s();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5918a(int i, String str, String str2) {
        getContext().startActivity(m6287a("android.intent.action.SEARCH", null, null, str2, 0, null));
    }

    /* renamed from: p */
    private void m6303p() {
        post(this.f5051T);
    }

    /* renamed from: s */
    private void m6306s() {
        this.f5055a.dismissDropDown();
    }

    public int getImeOptions() {
        return this.f5055a.getImeOptions();
    }

    public int getInputType() {
        return this.f5055a.getInputType();
    }

    public CharSequence getQuery() {
        return this.f5055a.getText();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.ar);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.as);
    }

    /* renamed from: m */
    private boolean m6300m() {
        if ((this.f5068l || this.f5045N) && !this.f5066j) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo5940k() {
        f5031o.mo5992a(this.f5055a);
        f5031o.mo5994b(this.f5055a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f5051T);
        post(this.f5052U);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5092a = this.f5066j;
        return savedState;
    }

    /* renamed from: n */
    private void m6301n() {
        int i;
        if (!m6300m() || !(this.f5061c.getVisibility() == 0 || this.f5063g.getVisibility() == 0)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f5074s.setVisibility(i);
    }

    /* renamed from: q */
    private void m6304q() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f5055a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m6296c(queryHint));
    }

    public void clearFocus() {
        this.f5043L = true;
        super.clearFocus();
        this.f5055a.clearFocus();
        this.f5055a.setImeVisibility(false);
        this.f5043L = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo5928f() {
        m6291a(false);
        this.f5055a.requestFocus();
        this.f5055a.setImeVisibility(true);
        if (this.f5041J != null) {
            this.f5041J.onClick(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo5938i() {
        m6291a(this.f5066j);
        m6303p();
        if (this.f5055a.hasFocus()) {
            mo5940k();
        }
    }

    /* renamed from: l */
    private boolean m6299l() {
        if (this.f5070n != null && this.f5070n.getVoiceSearchEnabled()) {
            Intent intent = null;
            if (this.f5070n.getVoiceSearchLaunchWebSearch()) {
                intent = this.f5035D;
            } else if (this.f5070n.getVoiceSearchLaunchRecognizer()) {
                intent = this.f5036E;
            }
            if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private void m6302o() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f5055a.getText());
        int i = 0;
        if (!z2 && (!this.f5065i || this.f5048Q)) {
            z = false;
        }
        ImageView imageView = this.f5062d;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f5062d.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ENABLED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo5926d() {
        Editable text = this.f5055a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f5038G == null || !this.f5038G.mo5996a(text.toString())) {
                if (this.f5070n != null) {
                    mo5918a(0, (String) null, text.toString());
                }
                this.f5055a.setImeVisibility(false);
                m6306s();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo5927e() {
        if (!TextUtils.isEmpty(this.f5055a.getText())) {
            this.f5055a.setText("");
            this.f5055a.requestFocus();
            this.f5055a.setImeVisibility(true);
        } else if (this.f5065i && (this.f5039H == null || !this.f5039H.mo5995a())) {
            clearFocus();
            m6291a(true);
        }
    }

    public CharSequence getQueryHint() {
        if (this.f5042K != null) {
            return this.f5042K;
        }
        if (this.f5070n == null || this.f5070n.getHintId() == 0) {
            return this.f5037F;
        }
        return getContext().getText(this.f5070n.getHintId());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo5937h() {
        if (this.f5070n != null) {
            SearchableInfo searchableInfo = this.f5070n;
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m6285a(this.f5035D, searchableInfo));
                    return;
                }
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m6293b(this.f5036E, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    /* renamed from: r */
    private void m6305r() {
        this.f5055a.setThreshold(this.f5070n.getSuggestThreshold());
        this.f5055a.setImeOptions(this.f5070n.getImeOptions());
        int inputType = this.f5070n.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f5070n.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f5055a.setInputType(inputType);
        if (this.f5067k != null) {
            this.f5067k.mo3814a((Cursor) null);
        }
        if (this.f5070n.getSuggestAuthority() != null) {
            this.f5067k = new C1359aq(getContext(), this, this.f5070n, this.f5053V);
            this.f5055a.setAdapter(this.f5067k);
            C1359aq aqVar = (C1359aq) this.f5067k;
            if (this.f5069m) {
                i = 2;
            }
            aqVar.f5308l = i;
        }
    }

    /* renamed from: b */
    public final void mo4578b() {
        m6290a((CharSequence) "", false);
        clearFocus();
        m6291a(true);
        this.f5055a.setImeOptions(this.f5049R);
        this.f5048Q = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo5939j() {
        int i;
        int i2;
        if (this.f5075t.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f5073r.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C1385bc.m6839a(this);
            if (this.f5065i) {
                i = resources.getDimensionPixelSize(R.dimen.ah) + resources.getDimensionPixelSize(R.dimen.ai);
            } else {
                i = 0;
            }
            this.f5055a.getDropDownBackground().getPadding(rect);
            if (a) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + i);
            }
            this.f5055a.setDropDownHorizontalOffset(i2);
            this.f5055a.setDropDownWidth((((this.f5075t.getWidth() + rect.left) + rect.right) + i) - paddingLeft);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5924c() {
        int[] iArr;
        if (this.f5055a.hasFocus()) {
            iArr = FOCUSED_STATE_SET;
        } else {
            iArr = EMPTY_STATE_SET;
        }
        Drawable background = this.f5073r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f5074s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5919a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f5050S = bundle;
    }

    public void setOnCloseListener(C1307b bVar) {
        this.f5039H = bVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f5064h = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C1308c cVar) {
        this.f5038G = cVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f5041J = onClickListener;
    }

    public void setOnSuggestionListener(C1309d dVar) {
        this.f5040I = dVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m6303p();
    }

    public void setImeOptions(int i) {
        this.f5055a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f5055a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f5044M = i;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f5042K = charSequence;
        m6304q();
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f5068l = z;
        m6291a(this.f5066j);
    }

    /* renamed from: a */
    private void m6288a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException unused) {
            }
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            mo5927e();
        } else {
            mo5928f();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f5065i != z) {
            this.f5065i = z;
            m6291a(z);
            m6304q();
        }
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.f5067k = cursorAdapter;
        this.f5055a.setAdapter(this.f5067k);
    }

    /* renamed from: b */
    private void m6294b(boolean z) {
        int i;
        if (!this.f5068l || !m6300m() || !hasFocus() || (!z && this.f5045N)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f5061c.setVisibility(i);
    }

    /* renamed from: c */
    private void m6298c(boolean z) {
        int i;
        if (!this.f5045N || this.f5066j || !z) {
            i = 8;
        } else {
            i = 0;
            this.f5061c.setVisibility(8);
        }
        this.f5063g.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        int i;
        this.f5055a.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f5055a;
        if (TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        searchAutoComplete.setSelection(i);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        m6291a(savedState.f5092a);
        requestLayout();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f5069m = z;
        if (this.f5067k instanceof C1359aq) {
            C1359aq aqVar = (C1359aq) this.f5067k;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            aqVar.f5308l = i;
        }
    }

    /* renamed from: c */
    private CharSequence m6296c(CharSequence charSequence) {
        if (!this.f5065i || this.f5032A == null) {
            return charSequence;
        }
        double textSize = (double) this.f5055a.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f5032A.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f5032A), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f5070n = searchableInfo;
        if (this.f5070n != null) {
            m6305r();
            m6304q();
        }
        this.f5045N = m6299l();
        if (this.f5045N) {
            this.f5055a.setPrivateImeOptions("nm");
        }
        m6291a(this.f5066j);
    }

    /* renamed from: c */
    private void m6297c(int i) {
        Editable text = this.f5055a.getText();
        Cursor a = this.f5067k.mo3811a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence c = this.f5067k.mo3819c(a);
                if (c != null) {
                    setQuery(c);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo5922b(CharSequence charSequence) {
        Editable text = this.f5055a.getText();
        this.f5047P = text;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(text);
        m6294b(z2);
        if (z2) {
            z = false;
        }
        m6298c(z);
        m6302o();
        m6301n();
        if (this.f5038G != null && !TextUtils.equals(charSequence, this.f5046O)) {
            charSequence.toString();
        }
        this.f5046O = charSequence.toString();
    }

    /* renamed from: a */
    private void m6291a(boolean z) {
        int i;
        int i2;
        this.f5066j = z;
        int i3 = 8;
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z3 = !TextUtils.isEmpty(this.f5055a.getText());
        this.f5060b.setVisibility(i);
        m6294b(z3);
        View view = this.f5072q;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.f5081z.getDrawable() != null && !this.f5065i) {
            i3 = 0;
        }
        this.f5081z.setVisibility(i3);
        m6302o();
        if (!z3) {
            z2 = true;
        }
        m6298c(z2);
        m6301n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo5923b(int i) {
        if (this.f5040I != null && this.f5040I.mo5997a(i)) {
            return false;
        }
        m6297c(i);
        return true;
    }

    /* renamed from: a */
    static boolean m6292a(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a14);
    }

    /* renamed from: a */
    private static Intent m6285a(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        String str2 = "calling_package";
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra(str2, str);
        return intent2;
    }

    /* renamed from: a */
    private void m6289a(View view, Rect rect) {
        view.getLocationInWindow(this.f5079x);
        getLocationInWindow(this.f5080y);
        int i = this.f5079x[1] - this.f5080y[1];
        int i2 = this.f5079x[0] - this.f5080y[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f5043L || !isFocusable()) {
            return false;
        }
        if (this.f5066j) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f5055a.requestFocus(i, rect);
        if (requestFocus) {
            m6291a(false);
        }
        return requestFocus;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f5066j) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = this.f5044M > 0 ? Math.min(this.f5044M, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f5044M > 0 ? this.f5044M : getPreferredWidth();
        } else if (mode == 1073741824 && this.f5044M > 0) {
            size = Math.min(this.f5044M, size);
        }
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* renamed from: b */
    private Intent m6293b(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        if (this.f5050S != null) {
            bundle.putParcelable("app_data", this.f5050S);
        }
        Intent intent3 = new Intent(intent);
        String str3 = "free_form";
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str2 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str3);
        intent3.putExtra("android.speech.extra.PROMPT", str);
        intent3.putExtra("android.speech.extra.LANGUAGE", str2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        String str5 = "calling_package";
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra(str5, str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private void m6290a(CharSequence charSequence, boolean z) {
        this.f5055a.setText(charSequence);
        this.f5055a.setSelection(this.f5055a.length());
        this.f5047P = charSequence;
    }

    /* renamed from: b */
    private boolean m6295b(int i, int i2, String str) {
        Cursor a = this.f5067k.mo3811a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m6288a(m6286a(a, 0, (String) null));
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent m6286a(android.database.Cursor r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = android.support.p029v7.widget.C1359aq.m6717a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x000f
            android.app.SearchableInfo r1 = r9.f5070n     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x000f:
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0013:
            r3 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = android.support.p029v7.widget.C1359aq.m6717a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x0022
            android.app.SearchableInfo r1 = r9.f5070n     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0022:
            if (r1 == 0) goto L_0x0044
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = android.support.p029v7.widget.C1359aq.m6717a(r10, r2)     // Catch:{ RuntimeException -> 0x0061 }
            if (r2 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0061 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0044:
            if (r1 != 0) goto L_0x0048
            r4 = r0
            goto L_0x004d
        L_0x0048:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x0061 }
            r4 = r1
        L_0x004d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r6 = android.support.p029v7.widget.C1359aq.m6717a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r5 = android.support.p029v7.widget.C1359aq.m6717a(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            r2 = r9
            r7 = r11
            r8 = r12
            android.content.Intent r11 = r2.m6287a(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0061 }
            return r11
        L_0x0061:
            r10.getPosition()     // Catch:{ RuntimeException -> 0x0064 }
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.SearchView.m6286a(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5077v = new Rect();
        this.f5078w = new Rect();
        this.f5079x = new int[2];
        this.f5080y = new int[2];
        this.f5051T = new Runnable() {
            public final void run() {
                SearchView.this.mo5924c();
            }
        };
        this.f5052U = new Runnable() {
            public final void run() {
                if (SearchView.this.f5067k != null && (SearchView.this.f5067k instanceof C1359aq)) {
                    SearchView.this.f5067k.mo3814a((Cursor) null);
                }
            }
        };
        this.f5053V = new WeakHashMap<>();
        this.f5054W = new OnClickListener() {
            public final void onClick(View view) {
                if (view == SearchView.this.f5060b) {
                    SearchView.this.mo5928f();
                } else if (view == SearchView.this.f5062d) {
                    SearchView.this.mo5927e();
                } else if (view == SearchView.this.f5061c) {
                    SearchView.this.mo5926d();
                } else if (view == SearchView.this.f5063g) {
                    SearchView.this.mo5937h();
                } else {
                    if (view == SearchView.this.f5055a) {
                        SearchView.this.mo5940k();
                    }
                }
            }
        };
        this.f5071p = new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.f5070n == null) {
                    return false;
                }
                if (SearchView.this.f5055a.isPopupShowing() && SearchView.this.f5055a.getListSelection() != -1) {
                    return SearchView.this.mo5921a(view, i, keyEvent);
                }
                if (SearchView.this.f5055a.mo5979a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView.this.mo5918a(0, (String) null, SearchView.this.f5055a.getText().toString());
                return true;
            }
        };
        this.f5056aa = new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.mo5926d();
                return true;
            }
        };
        this.f5057ab = new OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo5920a(i, 0, (String) null);
            }
        };
        this.f5058ac = new OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo5923b(i);
            }
        };
        this.f5059ad = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.mo5922b(charSequence);
            }
        };
        C1365av a = C1365av.m6744a(context, attributeSet, R$styleable.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo6405g(9, R.layout.z), this, true);
        this.f5055a = (SearchAutoComplete) findViewById(R.id.d1j);
        this.f5055a.setSearchView(this);
        this.f5072q = findViewById(R.id.d0r);
        this.f5073r = findViewById(R.id.d1d);
        this.f5074s = findViewById(R.id.dd6);
        this.f5060b = (ImageView) findViewById(R.id.d0g);
        this.f5061c = (ImageView) findViewById(R.id.d0x);
        this.f5062d = (ImageView) findViewById(R.id.d0l);
        this.f5063g = (ImageView) findViewById(R.id.d1l);
        this.f5081z = (ImageView) findViewById(R.id.d13);
        C0991u.m4185a(this.f5073r, a.mo6392a(10));
        C0991u.m4185a(this.f5074s, a.mo6392a(14));
        this.f5060b.setImageDrawable(a.mo6392a(13));
        this.f5061c.setImageDrawable(a.mo6392a(7));
        this.f5062d.setImageDrawable(a.mo6392a(4));
        this.f5063g.setImageDrawable(a.mo6392a(16));
        this.f5081z.setImageDrawable(a.mo6392a(13));
        this.f5032A = a.mo6392a(12);
        C1366aw.m6763a(this.f5060b, getResources().getString(R.string.bw));
        this.f5033B = a.mo6405g(15, R.layout.y);
        this.f5034C = a.mo6405g(5, 0);
        this.f5060b.setOnClickListener(this.f5054W);
        this.f5062d.setOnClickListener(this.f5054W);
        this.f5061c.setOnClickListener(this.f5054W);
        this.f5063g.setOnClickListener(this.f5054W);
        this.f5055a.setOnClickListener(this.f5054W);
        this.f5055a.addTextChangedListener(this.f5059ad);
        this.f5055a.setOnEditorActionListener(this.f5056aa);
        this.f5055a.setOnItemClickListener(this.f5057ab);
        this.f5055a.setOnItemSelectedListener(this.f5058ac);
        this.f5055a.setOnKeyListener(this.f5071p);
        this.f5055a.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.f5064h != null) {
                    SearchView.this.f5064h.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo6394a(8, true));
        int e = a.mo6401e(1, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f5037F = a.mo6398c(6);
        this.f5042K = a.mo6398c(11);
        int a2 = a.mo6390a(3, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo6390a(2, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo6394a(0, true));
        a.mo6393a();
        this.f5035D = new Intent("android.speech.action.WEB_SEARCH");
        this.f5035D.addFlags(268435456);
        this.f5035D.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f5036E = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f5036E.addFlags(268435456);
        this.f5075t = findViewById(this.f5055a.getDropDownAnchor());
        if (this.f5075t != null) {
            this.f5075t.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SearchView.this.mo5939j();
                }
            });
        }
        m6291a(this.f5065i);
        m6304q();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m6289a((View) this.f5055a, this.f5077v);
            this.f5078w.set(this.f5077v.left, 0, this.f5077v.right, i4 - i2);
            if (this.f5076u == null) {
                this.f5076u = new C1310e(this.f5078w, this.f5077v, this.f5055a);
                setTouchDelegate(this.f5076u);
                return;
            }
            this.f5076u.mo5999a(this.f5078w, this.f5077v);
        }
    }

    /* renamed from: a */
    private Intent m6287a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f5047P);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f5050S != null) {
            intent.putExtra("app_data", this.f5050S);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f5070n.getSearchActivity());
        return intent;
    }
}

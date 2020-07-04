package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.livesdk.C3916b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4453w;
import com.bytedance.android.livesdk.chatroom.utils.C5365s.C5366a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9083u;
import com.bytedance.android.livesdk.widget.BarrageView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.C7498y;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveInputDialogFragment */
public class LiveInputDialogFragment extends DialogFragment {

    /* renamed from: a */
    public View f14687a;

    /* renamed from: b */
    public ImageView f14688b;

    /* renamed from: c */
    public EditText f14689c;

    /* renamed from: d */
    public TextView f14690d;

    /* renamed from: e */
    public View f14691e;

    /* renamed from: f */
    public boolean f14692f;

    /* renamed from: g */
    public String f14693g;

    /* renamed from: h */
    public C5101c f14694h;

    /* renamed from: i */
    public boolean f14695i = false;

    /* renamed from: j */
    public boolean f14696j = false;

    /* renamed from: k */
    private BarrageView f14697k;

    /* renamed from: l */
    private InputFilter f14698l;

    /* renamed from: m */
    private final OnClickListener f14699m = new C5220bn(this);

    /* renamed from: n */
    private final TextWatcher f14700n = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            int i;
            int i2;
            String str2;
            if (LiveInputDialogFragment.this.f14696j) {
                Editable text = LiveInputDialogFragment.this.f14689c.getText();
                LiveInputDialogFragment liveInputDialogFragment = LiveInputDialogFragment.this;
                if (text == null) {
                    str = "";
                } else {
                    str = text.toString();
                }
                liveInputDialogFragment.f14693g = str;
                if (TextUtils.isEmpty(LiveInputDialogFragment.this.f14693g)) {
                    LiveInputDialogFragment.this.f14690d.setVisibility(0);
                    LiveInputDialogFragment.this.f14688b.setImageResource(R.drawable.cd8);
                } else {
                    LiveInputDialogFragment.this.f14690d.setVisibility(8);
                    LiveInputDialogFragment.this.f14688b.setImageResource(R.drawable.cd7);
                }
                int trimmedLength = TextUtils.getTrimmedLength(LiveInputDialogFragment.this.f14693g);
                int i3 = 15;
                if (LiveInputDialogFragment.this.f14692f) {
                    i = 15;
                } else {
                    i = 50;
                }
                if (trimmedLength > i) {
                    LiveInputDialogFragment.this.mo13245a(LiveInputDialogFragment.this.f14689c, LiveInputDialogFragment.this.f14693g.length());
                } else {
                    LiveInputDialogFragment.this.mo13244a(LiveInputDialogFragment.this.f14689c);
                }
                if (LiveInputDialogFragment.this.f14692f) {
                    i2 = 15;
                } else {
                    i2 = 50;
                }
                if (trimmedLength > i2) {
                    if (LiveInputDialogFragment.this.f14692f) {
                        str2 = LiveInputDialogFragment.this.getString(R.string.eq7);
                    } else {
                        str2 = LiveInputDialogFragment.this.getString(R.string.ens, Integer.valueOf(50));
                    }
                    C9049ap.m27029a(str2, 1);
                    String str3 = LiveInputDialogFragment.this.f14693g;
                    if (!LiveInputDialogFragment.this.f14692f) {
                        i3 = 50;
                    }
                    String substring = str3.substring(0, i3);
                    LiveInputDialogFragment.this.f14689c.setText(substring);
                    LiveInputDialogFragment.this.f14689c.setSelection(substring.length());
                }
            }
        }
    };

    /* renamed from: o */
    private final OnLayoutChangeListener f14701o = new OnLayoutChangeListener() {

        /* renamed from: b */
        private float f14714b = -1.0f;

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (LiveInputDialogFragment.this.f14687a != null) {
                if (this.f14714b < 0.0f) {
                    this.f14714b = ((float) LiveInputDialogFragment.this.getResources().getDisplayMetrics().heightPixels) * 0.75f;
                }
                if (((float) i4) < this.f14714b) {
                    if (!LiveInputDialogFragment.this.f14695i) {
                        LiveInputDialogFragment.this.f14695i = true;
                        int i9 = i8 - i4;
                        LiveInputDialogFragment.this.f14687a.setVisibility(0);
                        if (LiveInputDialogFragment.this.f14691e.getVisibility() == 0) {
                            i9 += LiveInputDialogFragment.this.f14691e.getHeight();
                        }
                        C9097a.m27146a().mo22267a((Object) new C4453w(i9, true));
                    }
                } else if (LiveInputDialogFragment.this.f14695i) {
                    LiveInputDialogFragment.this.f14695i = false;
                    LiveInputDialogFragment.this.f14687a.setVisibility(4);
                    try {
                        LiveInputDialogFragment.this.dismiss();
                    } catch (IllegalStateException unused) {
                    }
                    C9097a.m27146a().mo22267a((Object) new C4453w(0, false));
                }
            }
        }
    };

    /* renamed from: p */
    private View f14702p;

    /* renamed from: q */
    private TextView f14703q;

    /* renamed from: r */
    private View f14704r;

    /* renamed from: s */
    private boolean f14705s;

    /* renamed from: t */
    private boolean f14706t;

    /* renamed from: u */
    private boolean f14707u;

    /* renamed from: v */
    private boolean f14708v;

    /* renamed from: w */
    private C5099a f14709w;

    /* renamed from: x */
    private boolean f14710x = false;

    /* renamed from: y */
    private C5366a f14711y = new C5366a() {
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveInputDialogFragment$a */
    public interface C5099a {
        /* renamed from: a */
        void mo13255a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveInputDialogFragment$b */
    public static final class C5100b {

        /* renamed from: a */
        public boolean f14716a;

        /* renamed from: b */
        public boolean f14717b;

        /* renamed from: c */
        public boolean f14718c;

        /* renamed from: d */
        public String f14719d;

        /* renamed from: e */
        public boolean f14720e = true;

        /* renamed from: f */
        public boolean f14721f;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveInputDialogFragment$c */
    public interface C5101c {
        /* renamed from: a */
        void mo13256a(C5100b bVar);

        /* renamed from: a */
        void mo13257a(String str, boolean z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo13248a(View view, int i, KeyEvent keyEvent) {
        if (66 != i || 1 != keyEvent.getAction()) {
            return false;
        }
        this.f14688b.performClick();
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f14696j = false;
    }

    /* renamed from: a */
    public final void mo13241a() {
        if (this.f14689c != null) {
            C9083u.m27121b(getContext(), this.f14689c);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f14687a.removeOnLayoutChangeListener(this.f14701o);
        this.f14710x = false;
    }

    /* renamed from: d */
    private void m16447d() {
        if (!this.f14706t) {
            if (this.f14692f) {
                this.f14692f = false;
                this.f14697k.mo22410b(true);
            } else {
                this.f14692f = true;
                this.f14697k.mo22409a(true);
            }
            m16446c();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f14710x) {
            this.f14710x = false;
            m16444b(200, 1, 5);
            return;
        }
        this.f14689c.postDelayed(new C5222bp(this), 100);
    }

    /* renamed from: c */
    private void m16446c() {
        if (isAdded()) {
            if (this.f14706t) {
                this.f14689c.setText("");
                this.f14690d.setText(R.string.f5u);
                this.f14689c.setEnabled(false);
                return;
            }
            this.f14689c.setText(this.f14693g);
            if (!TextUtils.isEmpty(this.f14693g)) {
                this.f14689c.setSelection(this.f14693g.length());
            }
            this.f14689c.setTextSize(1, 17.0f);
            if (this.f14692f) {
                this.f14690d.setText(R.string.eho);
            } else if (this.f14705s) {
                this.f14690d.setText(R.string.ecc);
            } else {
                this.f14690d.setText(R.string.f3g);
            }
            this.f14689c.setEnabled(true);
        }
    }

    /* renamed from: f */
    private void m16449f() {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            TTLiveSDKContext.getHostService().mo22367h().mo22167a(getContext(), C8987h.m26865a().mo22192c("comment_recharge_guide").mo22188a(1000).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
        } else if (!TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.COMMENT)) {
            mo13241a();
            this.f14709w.mo13255a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13249b() {
        if (isAdded()) {
            this.f14689c.requestFocus();
            C9083u.m27120a(getContext(), this.f14689c);
        }
    }

    /* renamed from: e */
    private void m16448e() {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            if (getActivity() == null) {
                C9049ap.m27022a((int) R.string.ef8);
            } else {
                TTLiveSDKContext.getHostService().mo22367h().mo22167a(getActivity(), C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f67)).mo22192c("comment_live").mo22188a(1000).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
            }
        } else if (!TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.COMMENT)) {
            if (this.f14692f && TTLiveSDKContext.getHostService().mo22360a().isNeedProtectUnderage()) {
                C9049ap.m27022a((int) R.string.f0i);
            } else if (this.f14694h != null && this.f14689c.getText() != null) {
                String obj = this.f14689c.getText().toString();
                if (m16445b(obj)) {
                    this.f14694h.mo13257a(obj, this.f14692f);
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f14710x = this.f14695i;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
        }
    }

    /* renamed from: b */
    private static boolean m16445b(String str) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            z = !Character.isWhitespace(str.charAt(i));
            if (z) {
                break;
            }
        }
        if (!z || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C3916b.m13813a().mo11466c();
        super.onDismiss(dialogInterface);
        if (this.f14694h != null) {
            C5100b bVar = new C5100b();
            bVar.f14717b = this.f14705s;
            bVar.f14718c = this.f14706t;
            bVar.f14716a = this.f14692f;
            bVar.f14719d = this.f14693g;
            bVar.f14720e = this.f14707u;
            this.f14694h.mo13256a(bVar);
            this.f14694h = null;
            this.f14695i = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13243a(View view) {
        int id = view.getId();
        if (id == R.id.km) {
            m16447d();
        } else if (id == R.id.d37) {
            m16448e();
        } else {
            if (id == R.id.asj) {
                HashMap hashMap = new HashMap();
                hashMap.put("discount_type", "1");
                C8443c.m25663a().mo21606a("discount_recharge_click", hashMap, Room.class, new C8438j().mo21598a("live_detail").mo21600c("comment").mo21599b("live_function"), new C8439k());
                m16449f();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14696j = true;
        setStyle(1, R.style.yu);
        setCancelable(true);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        this.f14692f = arguments.getBoolean("live.intent.extra.DANMU_OPEN", false);
        this.f14705s = arguments.getBoolean("live.intent.extra.IS_BROADCASTER", false);
        this.f14706t = arguments.getBoolean("live.intent.extra.USER_BANNED", false);
        this.f14693g = arguments.getString("live.intent.extra.INPUT", "");
        this.f14707u = arguments.getBoolean("live.inter.extra.CAN_DANMU", true);
        this.f14708v = arguments.getBoolean("live.inter.extra.IS_OFFICIAL", false);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            window.addFlags(32);
            if ((getActivity() != null && getActivity().getRequestedOrientation() == 0) || (!this.f14705s && !C3387g.m12599a(getActivity()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo13244a(EditText editText) {
        if (this.f14698l != null) {
            editText.setFilters(new InputFilter[0]);
            this.f14698l = null;
        }
    }

    /* renamed from: b */
    public final void mo13250b(boolean z) {
        if (isAdded() && !this.f14706t && ((!this.f14692f || !z) && (this.f14692f || z))) {
            this.f14692f = z;
            if (z) {
                this.f14697k.mo22409a(true);
            } else {
                this.f14697k.mo22410b(true);
            }
            m16446c();
        }
    }

    /* renamed from: a */
    public final void mo13246a(String str) {
        if (isAdded() && !this.f14706t) {
            this.f14693g = str;
            m16446c();
        }
    }

    /* renamed from: a */
    public final void mo13247a(boolean z) {
        if (isAdded()) {
            if ((!this.f14706t || !z) && (this.f14706t || z)) {
                this.f14706t = z;
                m16446c();
            }
        }
    }

    public void show(C0608j jVar, String str) {
        C3916b.m13813a().mo11465b();
        super.show(jVar, str);
    }

    public void showNow(C0608j jVar, String str) {
        C3916b.m13813a().mo11465b();
        super.showNow(jVar, str);
    }

    /* renamed from: a */
    public static LiveInputDialogFragment m16443a(C5100b bVar, C5099a aVar) {
        LiveInputDialogFragment liveInputDialogFragment = new LiveInputDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("live.intent.extra.DANMU_OPEN", bVar.f14716a);
        bundle.putBoolean("live.intent.extra.IS_BROADCASTER", bVar.f14717b);
        bundle.putBoolean("live.intent.extra.USER_BANNED", bVar.f14718c);
        bundle.putString("live.intent.extra.INPUT", bVar.f14719d);
        bundle.putBoolean("live.inter.extra.CAN_DANMU", bVar.f14720e);
        bundle.putBoolean("live.inter.extra.IS_OFFICIAL", bVar.f14721f);
        liveInputDialogFragment.setArguments(bundle);
        liveInputDialogFragment.f14709w = aVar;
        return liveInputDialogFragment;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14689c.addTextChangedListener(this.f14700n);
        this.f14689c.setOnKeyListener(new C5221bo(this));
        this.f14697k.setOnClickListener(this.f14699m);
        this.f14688b.setOnClickListener(this.f14699m);
        if (this.f14708v) {
            C9738o.m28712b((View) this.f14697k, 8);
        }
        m16446c();
        if (!this.f14706t && this.f14692f) {
            this.f14697k.mo22409a(false);
        }
        this.f14691e.setVisibility(8);
        this.f14697k.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo13245a(EditText editText, int i) {
        this.f14698l = new LengthFilter(i);
        editText.setFilters(new InputFilter[]{this.f14698l});
    }

    /* renamed from: b */
    private void m16444b(long j, int i, int i2) {
        if (this.f14689c != null && i <= i2) {
            EditText editText = this.f14689c;
            C5223bq bqVar = new C5223bq(this, j, i, i2);
            editText.postDelayed(bqVar, j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13242a(long j, int i, int i2) {
        if (isResumed() && this.f14695i) {
            C9083u.m27120a(getContext(), this.f14689c);
            m16444b(j, i + 1, i2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aqj, viewGroup, false);
        this.f14687a = inflate;
        this.f14687a.addOnLayoutChangeListener(this.f14701o);
        KeyboardShadowView keyboardShadowView = (KeyboardShadowView) this.f14687a.findViewById(R.id.edd);
        keyboardShadowView.setActivity(getActivity());
        if (this.f14705s && (getActivity() == null || getActivity().getRequestedOrientation() != 0)) {
            z = true;
        }
        keyboardShadowView.setShowStatusBar(z);
        this.f14702p = inflate.findViewById(R.id.b1y);
        this.f14688b = (ImageView) inflate.findViewById(R.id.d37);
        this.f14697k = (BarrageView) inflate.findViewById(R.id.km);
        this.f14689c = (EditText) inflate.findViewById(R.id.acn);
        this.f14690d = (TextView) inflate.findViewById(R.id.aco);
        this.f14702p.getLayoutParams().width = (getResources().getDisplayMetrics().widthPixels - inflate.getPaddingLeft()) - inflate.getPaddingRight();
        this.f14691e = inflate.findViewById(R.id.cor);
        this.f14691e.getLayoutParams().width = (getResources().getDisplayMetrics().widthPixels - inflate.getPaddingLeft()) - inflate.getPaddingRight();
        this.f14704r = this.f14691e.findViewById(R.id.asj);
        this.f14703q = (TextView) this.f14691e.findViewById(R.id.e9m);
        return inflate;
    }
}

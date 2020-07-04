package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.livesdk.chatroom.event.C4453w;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9083u;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SimpleInputDialogFragment */
public class SimpleInputDialogFragment extends DialogFragment {

    /* renamed from: a */
    private final OnLayoutChangeListener f15180a = new OnLayoutChangeListener() {

        /* renamed from: b */
        private float f15192b = -1.0f;

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (SimpleInputDialogFragment.this.f15187h != null) {
                if (this.f15192b < 0.0f) {
                    this.f15192b = ((float) SimpleInputDialogFragment.this.getResources().getDisplayMetrics().heightPixels) * 0.75f;
                }
                if (((float) i4) < this.f15192b) {
                    if (!SimpleInputDialogFragment.this.f15183d) {
                        SimpleInputDialogFragment.this.f15183d = true;
                        int i9 = i8 - i4;
                        SimpleInputDialogFragment.this.f15187h.setVisibility(0);
                        SimpleInputDialogFragment.this.mo13393a(true, i9);
                    }
                } else if (SimpleInputDialogFragment.this.f15183d) {
                    SimpleInputDialogFragment.this.f15183d = false;
                    SimpleInputDialogFragment.this.f15187h.setVisibility(4);
                    try {
                        SimpleInputDialogFragment.this.dismiss();
                    } catch (IllegalStateException unused) {
                    }
                    SimpleInputDialogFragment.this.mo13393a(false, 0);
                }
            }
        }
    };

    /* renamed from: b */
    private boolean f15181b = false;

    /* renamed from: c */
    private boolean f15182c;

    /* renamed from: d */
    public boolean f15183d = false;

    /* renamed from: e */
    public C5171a f15184e = null;

    /* renamed from: f */
    protected EditText f15185f;

    /* renamed from: g */
    protected View f15186g;

    /* renamed from: h */
    public View f15187h;

    /* renamed from: i */
    protected String f15188i = null;

    /* renamed from: j */
    protected int f15189j = 0;

    /* renamed from: k */
    protected boolean f15190k = false;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.SimpleInputDialogFragment$a */
    public interface C5171a {
        /* renamed from: a */
        void mo13423a(String str);

        /* renamed from: b */
        void mo13424b(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo13394a() {
        return true;
    }

    /* renamed from: b */
    public final void mo13418b() {
        if (this.f15185f != null) {
            C9083u.m27121b(getContext(), this.f15185f);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f15187h.removeOnLayoutChangeListener(this.f15180a);
    }

    /* renamed from: c */
    public final void mo13419c() {
        if (this.f15185f != null && getContext() != null) {
            C9083u.m27120a(getContext(), this.f15185f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo13420d() {
        if (isAdded()) {
            C9083u.m27120a(getContext(), this.f15185f);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f15181b) {
            this.f15181b = false;
            m16766b(200, 1, 5);
            return;
        }
        this.f15185f.postDelayed(new C5308eb(this), 50);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f15181b = this.f15183d;
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f15188i = getArguments().getString("live.intent.extra.HINT", null);
            this.f15189j = getArguments().getInt("live.intent.extra.MAX_LENGTH", 0);
            this.f15190k = getArguments().getBoolean("live.intent.extra.TOUCH_MODAL", false);
            this.f15182c = getArguments().getBoolean("live.intent.extra.IS_BROADCASTER", false);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            if (!this.f15182c && !C3387g.m12599a(getActivity())) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (!this.f15190k) {
                window.addFlags(32);
                window.clearFlags(2);
            }
        }
        return onCreateDialog;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        super.onDismiss(dialogInterface);
        if (this.f15184e != null) {
            if (this.f15185f.getText() == null) {
                str = "";
            } else {
                str = this.f15185f.getText().toString().trim();
            }
            this.f15184e.mo13424b(str);
            this.f15184e = null;
            this.f15183d = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13415a(View view) {
        String str;
        if (this.f15184e != null) {
            if (this.f15185f.getText() == null) {
                str = "";
            } else {
                str = this.f15185f.getText().toString().trim();
            }
            this.f15184e.mo13423a(str);
        }
    }

    /* renamed from: a */
    public final void mo13416a(String str) {
        if (isAdded() && !TextUtils.isEmpty(str)) {
            this.f15185f.setText(str);
            this.f15185f.setSelection(this.f15185f.getText().length());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13393a(boolean z, int i) {
        C9097a.m27146a().mo22267a((Object) new C4453w(i, z));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            mo13416a(getArguments().getString("live.intent.extra.INPUT"));
        }
        this.f15185f.setOnEditorActionListener(new C5305dz(this));
        this.f15186g.setOnClickListener(new C5307ea(this));
    }

    /* renamed from: b */
    private void m16766b(long j, int i, int i2) {
        if (this.f15185f != null && i <= i2) {
            EditText editText = this.f15185f;
            C5309ec ecVar = new C5309ec(this, j, i, i2);
            editText.postDelayed(ecVar, j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13414a(long j, int i, int i2) {
        if (isResumed() && this.f15183d) {
            C9083u.m27120a(getContext(), this.f15185f);
            m16766b(j, i + 1, i2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InputFilter[] inputFilterArr;
        this.f15187h = LayoutInflater.from(getContext()).inflate(R.layout.aqs, viewGroup, false);
        this.f15187h.addOnLayoutChangeListener(this.f15180a);
        this.f15185f = (EditText) this.f15187h.findViewById(R.id.a6q);
        this.f15186g = this.f15187h.findViewById(R.id.d2y);
        KeyboardShadowView keyboardShadowView = (KeyboardShadowView) this.f15187h.findViewById(R.id.edd);
        if (mo13394a()) {
            keyboardShadowView.setActivity(getActivity());
        } else {
            keyboardShadowView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    SimpleInputDialogFragment.this.f15183d = false;
                    SimpleInputDialogFragment.this.f15187h.setVisibility(4);
                    try {
                        SimpleInputDialogFragment.this.dismiss();
                    } catch (IllegalStateException unused) {
                    }
                    SimpleInputDialogFragment.this.mo13393a(false, 0);
                }
            });
        }
        this.f15185f.setHint(this.f15188i);
        if (this.f15189j > 0) {
            InputFilter[] filters = this.f15185f.getFilters();
            if (filters == null || filters.length == 0) {
                inputFilterArr = new InputFilter[1];
            } else {
                inputFilterArr = new InputFilter[(filters.length + 1)];
                for (int i = 0; i < filters.length; i++) {
                    inputFilterArr[i] = filters[i];
                }
            }
            inputFilterArr[inputFilterArr.length - 1] = new LengthFilter(this.f15189j);
            this.f15185f.setFilters(inputFilterArr);
        }
        this.f15187h.findViewById(R.id.a6r).getLayoutParams().width = getResources().getDisplayMetrics().widthPixels;
        return this.f15187h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo13417a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        if (this.f15186g.isEnabled()) {
            this.f15186g.performClick();
        }
        return true;
    }

    /* renamed from: a */
    public static SimpleInputDialogFragment m16765a(String str, String str2, int i, boolean z, boolean z2) {
        SimpleInputDialogFragment simpleInputDialogFragment = new SimpleInputDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("live.intent.extra.INPUT", str);
        bundle.putString("live.intent.extra.HINT", str2);
        bundle.putInt("live.intent.extra.MAX_LENGTH", i);
        bundle.putBoolean("live.intent.extra.TOUCH_MODAL", false);
        bundle.putBoolean("live.intent.extra.IS_BROADCASTER", z2);
        simpleInputDialogFragment.setArguments(bundle);
        return simpleInputDialogFragment;
    }
}

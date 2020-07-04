package com.bytedance.android.live.wallet.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3701d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du.C5295a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.utils.C9042aj;
import com.bytedance.android.livesdk.utils.C9047an;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9053at;
import com.bytedance.android.livesdk.utils.C9083u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class BalanceChangeDialogFragment extends LiveDialogFragment {

    /* renamed from: a */
    ProgressDialog f11045a;

    /* renamed from: b */
    Activity f11046b;

    /* renamed from: c */
    String f11047c;

    /* renamed from: d */
    String f11048d;

    /* renamed from: e */
    EditText f11049e;

    /* renamed from: f */
    public C3701d f11050f;

    /* renamed from: a */
    public final void mo11209a() {
        if (this.f11045a != null && this.f11045a.isShowing()) {
            this.f11045a.dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yu);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f11050f != null) {
            this.f11050f.mo11208a(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11047c = arguments.getString("KEY_BUNDLE_REQUEST_PAGE", "");
            this.f11048d = arguments.getString("KEY_BUNDLE_CHARGE_REASON", "");
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
        }
    }

    /* renamed from: a */
    public final void mo11210a(final long j) {
        if (this.f11045a == null) {
            this.f11045a = C9053at.m27042a(this.f11046b);
            this.f11045a.setCancelable(false);
            this.f11045a.setCanceledOnTouchOutside(false);
        }
        if (!this.f11045a.isShowing()) {
            this.f11045a.show();
        }
        ((C3245ad) ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).diamondExchange(j).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10183a(new C7326g<C3479d<Object>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C3479d<Object> dVar) throws Exception {
                int i;
                BalanceChangeDialogFragment.this.mo11209a();
                HashMap hashMap = new HashMap();
                hashMap.put("money", String.valueOf(j));
                hashMap.put("charge_reason", BalanceChangeDialogFragment.this.f11048d);
                hashMap.put("request_page", BalanceChangeDialogFragment.this.f11047c);
                hashMap.put("pay_method", "ticket");
                String str = "is_first_recharge";
                if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a().getPayScores() > 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                hashMap.put(str, String.valueOf(i));
                hashMap.put("growth_deepevent", "1");
                C8443c.m25663a().mo21606a("livesdk_recharge_success", hashMap, C8438j.class, Room.class);
                ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
                C9049ap.m27022a((int) R.string.ei3);
                BalanceChangeDialogFragment.this.dismissAllowingStateLoss();
            }
        }, new C7326g<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                BalanceChangeDialogFragment.this.mo11209a();
                if (th instanceof ApiServerException) {
                    C9049ap.m27028a(((ApiServerException) th).getPrompt());
                } else {
                    C9049ap.m27022a((int) R.string.ei2);
                }
            }
        });
    }

    /* renamed from: a */
    private void m13366a(View view) {
        this.f11049e = (EditText) view.findViewById(R.id.afx);
        this.f11049e.post(new Runnable() {
            public final void run() {
                BalanceChangeDialogFragment.this.f11049e.requestFocus();
                if (BalanceChangeDialogFragment.this.getContext() != null) {
                    C9083u.m27120a(BalanceChangeDialogFragment.this.getContext(), BalanceChangeDialogFragment.this.f11049e);
                }
            }
        });
        final TextView textView = (TextView) view.findViewById(R.id.dr3);
        final View findViewById = view.findViewById(R.id.bqd);
        final View findViewById2 = view.findViewById(R.id.bqk);
        final TextView textView2 = (TextView) view.findViewById(R.id.dqg);
        ((TextView) view.findViewById(R.id.dr4)).setText(C3358ac.m12517a((int) R.string.ebw, Long.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d() / 100)));
        textView2.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String valueOf = String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d() / 100);
                BalanceChangeDialogFragment.this.f11049e.setText(valueOf);
                BalanceChangeDialogFragment.this.f11049e.setSelection(valueOf.length());
            }
        });
        View findViewById3 = view.findViewById(R.id.ds_);
        ((TextView) view.findViewById(R.id.dri)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String valueOf = String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d() / 100);
                BalanceChangeDialogFragment.this.f11049e.setText(valueOf);
                BalanceChangeDialogFragment.this.f11049e.setSelection(valueOf.length());
            }
        });
        this.f11049e.setKeyListener(DigitsKeyListener.getInstance());
        EditText editText = this.f11049e;
        final View view2 = findViewById3;
        C37054 r1 = new C9047an() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4;
                int i5;
                int i6;
                long d = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d() / 100;
                TextView textView = textView2;
                boolean z = false;
                if (TextUtils.isEmpty(charSequence)) {
                    i4 = 0;
                } else {
                    i4 = 4;
                }
                textView.setVisibility(i4);
                long j = 0;
                try {
                    j = Long.parseLong(charSequence.toString());
                } catch (Exception e) {
                    C3166a.m11963b("BalanceChangeDialogFrag", (Throwable) e);
                }
                EditText editText = BalanceChangeDialogFragment.this.f11049e;
                if (d >= j) {
                    i5 = R.color.acf;
                } else {
                    i5 = R.color.ach;
                }
                editText.setTextColor(C3358ac.m12521b(i5));
                View view = findViewById;
                int i7 = 8;
                if (d >= j) {
                    i6 = 8;
                } else {
                    i6 = 0;
                }
                view.setVisibility(i6);
                View view2 = findViewById2;
                if (d >= j) {
                    i7 = 0;
                }
                view2.setVisibility(i7);
                textView.setText(String.valueOf(j));
                View view3 = view2;
                if (!TextUtils.isEmpty(charSequence.toString()) && j <= d) {
                    z = true;
                }
                view3.setEnabled(z);
            }
        };
        editText.addTextChangedListener(r1);
        this.f11049e.setHint(C3358ac.m12517a((int) R.string.ebs, Long.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d() / 100)));
        view.findViewById(R.id.x_).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                BalanceChangeDialogFragment.this.dismissAllowingStateLoss();
            }
        });
        findViewById3.setOnTouchListener(new C9042aj());
        findViewById3.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                long j;
                final String obj = BalanceChangeDialogFragment.this.f11049e.getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    C3517a.m12962a((Context) BalanceChangeDialogFragment.this.getActivity(), C3358ac.m12515a((int) R.string.ec1));
                    return;
                }
                long d = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d();
                try {
                    j = Long.parseLong(obj);
                } catch (Exception e) {
                    C3166a.m11963b("BalanceChangeDialogFrag", (Throwable) e);
                    j = 0;
                }
                if (j == 0 || j > d / 100) {
                    C3517a.m12962a((Context) BalanceChangeDialogFragment.this.getActivity(), C3358ac.m12515a((int) R.string.f8a));
                    return;
                }
                SpannableString spannableString = new SpannableString(C3358ac.m12515a((int) R.string.ect));
                spannableString.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.acg)), 0, spannableString.length(), 33);
                SpannableString spannableString2 = new SpannableString(C3358ac.m12515a((int) R.string.es0));
                spannableString2.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.acg)), 0, spannableString2.length(), 33);
                new C5295a(BalanceChangeDialogFragment.this.getContext(), 2).mo13572a(true).mo13574b((int) R.string.ej7).mo13575b((CharSequence) C3358ac.m12517a((int) R.string.ej8, String.valueOf(j))).mo13571a(spannableString, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).mo13576b(spannableString2, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        long j;
                        dialogInterface.dismiss();
                        try {
                            j = Long.parseLong(obj);
                        } catch (Exception e) {
                            C3166a.m11963b("BalanceChangeDialogFrag", (Throwable) e);
                            j = 0;
                        }
                        BalanceChangeDialogFragment.this.mo11210a(j);
                    }
                }).mo13577b();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.amn, viewGroup, false);
        m13366a(inflate);
        return inflate;
    }
}

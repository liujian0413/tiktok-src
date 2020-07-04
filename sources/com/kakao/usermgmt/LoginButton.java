package com.kakao.usermgmt;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.kakao.auth.AuthType;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginButton extends FrameLayout {
    private Fragment fragment;
    private android.support.p022v4.app.Fragment supportFragment;

    static class Item {
        final AuthType authType;
        final int contentDescId;
        public final int icon;
        final int textId;

        Item(int i, Integer num, int i2, AuthType authType2) {
            this.textId = i;
            this.icon = num.intValue();
            this.contentDescId = i2;
            this.authType = authType2;
        }
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    public android.support.p022v4.app.Fragment getSupportFragment() {
        return this.supportFragment;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        inflate(getContext(), R.layout.a4e, this);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                LoginButton.this.onClickLoginButton(LoginButton.this.getAuthTypes());
            }
        });
    }

    public List<AuthType> getAuthTypes() {
        ArrayList arrayList = new ArrayList();
        if (Session.getCurrentSession().getAuthCodeManager().isTalkLoginAvailable()) {
            arrayList.add(AuthType.KAKAO_TALK);
            arrayList.add(AuthType.KAKAO_TALK_ONLY);
        }
        if (Session.getCurrentSession().getAuthCodeManager().isStoryLoginAvailable()) {
            arrayList.add(AuthType.KAKAO_STORY);
        }
        arrayList.add(AuthType.KAKAO_ACCOUNT);
        AuthType[] authTypes = KakaoSDK.getAdapter().getSessionConfig().getAuthTypes();
        if (authTypes == null || authTypes.length == 0 || (authTypes.length == 1 && authTypes[0] == AuthType.KAKAO_LOGIN_ALL)) {
            authTypes = AuthType.values();
        }
        arrayList.retainAll(Arrays.asList(authTypes));
        if (arrayList.contains(AuthType.KAKAO_TALK) && arrayList.contains(AuthType.KAKAO_TALK_ONLY)) {
            arrayList.remove(AuthType.KAKAO_TALK_ONLY);
        }
        if (arrayList.size() == 0) {
            arrayList.add(AuthType.KAKAO_ACCOUNT);
        }
        return arrayList;
    }

    public LoginButton(Context context) {
        super(context);
    }

    public void setFragment(Fragment fragment2) {
        this.fragment = fragment2;
    }

    public void setSuportFragment(android.support.p022v4.app.Fragment fragment2) {
        this.supportFragment = fragment2;
    }

    private ListAdapter createLoginAdapter(Item[] itemArr) {
        final Item[] itemArr2 = itemArr;
        C185382 r0 = new ArrayAdapter<Item>(getContext(), 17367057, 16908308, itemArr) {
            public View getView(int i, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.a8e, viewGroup, false);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.bvj);
                if (VERSION.SDK_INT >= 21) {
                    imageView.setImageDrawable(LoginButton.this.getResources().getDrawable(itemArr2[i].icon, getContext().getTheme()));
                } else {
                    imageView.setImageDrawable(LoginButton.this.getResources().getDrawable(itemArr2[i].icon));
                }
                ((TextView) view.findViewById(R.id.bvl)).setText(itemArr2[i].textId);
                return view;
            }
        };
        return r0;
    }

    public void onClickLoginButton(List<AuthType> list) {
        if (list.size() == 1) {
            openSession((AuthType) list.get(0));
            return;
        }
        Item[] createAuthItemArray = createAuthItemArray(list);
        createLoginDialog(createAuthItemArray, createLoginAdapter(createAuthItemArray)).show();
    }

    public void openSession(AuthType authType) {
        if (getFragment() != null) {
            Session.getCurrentSession().open(authType, getFragment());
        } else if (getSupportFragment() != null) {
            Session.getCurrentSession().open(authType, getSupportFragment());
        } else {
            Session.getCurrentSession().open(authType, (Activity) getContext());
        }
    }

    private Item[] createAuthItemArray(List<AuthType> list) {
        ArrayList arrayList = new ArrayList();
        if (list.contains(AuthType.KAKAO_TALK)) {
            arrayList.add(new Item(R.string.a74, Integer.valueOf(R.drawable.bkz), R.string.a75, AuthType.KAKAO_TALK));
        }
        if (list.contains(AuthType.KAKAO_TALK_ONLY)) {
            arrayList.add(new Item(R.string.a74, Integer.valueOf(R.drawable.bkz), R.string.a75, AuthType.KAKAO_TALK_ONLY));
        }
        if (list.contains(AuthType.KAKAO_STORY)) {
            arrayList.add(new Item(R.string.a72, Integer.valueOf(R.drawable.bkh), R.string.a73, AuthType.KAKAO_STORY));
        }
        if (list.contains(AuthType.KAKAO_ACCOUNT)) {
            arrayList.add(new Item(R.string.a7a, Integer.valueOf(R.drawable.br), R.string.a7b, AuthType.KAKAO_ACCOUNT));
        }
        return (Item[]) arrayList.toArray(new Item[0]);
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private Dialog createLoginDialog(final Item[] itemArr, ListAdapter listAdapter) {
        final Dialog dialog = new Dialog(getContext(), R.style.gs);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.a8d);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setGravity(17);
        }
        ListView listView = (ListView) dialog.findViewById(R.id.bvi);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new OnItemClickListener() {

            /* renamed from: com.kakao.usermgmt.LoginButton$3$_lancet */
            class _lancet {
                private _lancet() {
                }

                static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(Dialog dialog) {
                    if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        dialog.dismiss();
                        return;
                    }
                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                }
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AuthType authType = itemArr[i].authType;
                if (authType != null) {
                    LoginButton.this.openSession(authType);
                }
                _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(dialog);
            }
        });
        ((Button) dialog.findViewById(R.id.bve)).setOnClickListener(new OnClickListener() {

            /* renamed from: com.kakao.usermgmt.LoginButton$4$_lancet */
            class _lancet {
                private _lancet() {
                }

                static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(Dialog dialog) {
                    if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        dialog.dismiss();
                        return;
                    }
                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                }
            }

            public void onClick(View view) {
                _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(dialog);
            }
        });
        return dialog;
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

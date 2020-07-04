package com.p280ss.android.ugc.aweme.account.loginsetting;

import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse */
public class LoginSettingResponse {
    private List<SettingInfo> data;
    private int status_code;
    private String status_msg;

    /* renamed from: com.ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse$SettingInfo */
    public static class SettingInfo {
        public static final int JUMP_CANCEL = 2;
        public static final int JUMP_CONTINUE = 0;
        public static final int JUMP_RN = 3;
        public static final int JUMP_TO_H5 = 1;
        public static final int MATCH_ALL_ERRORCODE = 8888;
        public static final int PLAN_TYPE_AFTER_LOGIN = 2;
        public static final int PLAN_TYPE_BEFORE_LOGIN = 1;
        private String button_dialog;
        private String dialog_content;
        private String dialog_title;
        private List<Integer> error_codes;
        private int jump_type;
        private String jump_url;
        private String l_button_dialog;
        private int l_jump_type;
        private String l_jump_url;
        private int login_platform;
        private int plan_type;
        private String r_button_dialog;
        private int r_jump_type;
        private String r_jump_url;

        public SettingInfo() {
        }

        public String getButton_dialog() {
            return this.button_dialog;
        }

        public String getDialog_content() {
            return this.dialog_content;
        }

        public String getDialog_title() {
            return this.dialog_title;
        }

        public int getJump_type() {
            return this.jump_type;
        }

        public String getJump_url() {
            return this.jump_url;
        }

        public String getL_button_dialog() {
            return this.l_button_dialog;
        }

        public int getL_jump_type() {
            return this.l_jump_type;
        }

        public String getL_jump_url() {
            return this.l_jump_url;
        }

        public int getLogin_platform() {
            return this.login_platform;
        }

        public int getPlan_type() {
            return this.plan_type;
        }

        public String getR_button_dialog() {
            return this.r_button_dialog;
        }

        public int getR_jump_type() {
            return this.r_jump_type;
        }

        public String getR_jump_url() {
            return this.r_jump_url;
        }

        public List<Integer> getError_codes() {
            if (this.error_codes == null) {
                return Collections.EMPTY_LIST;
            }
            return this.error_codes;
        }

        public void setButton_dialog(String str) {
            this.button_dialog = str;
        }

        public void setDialog_content(String str) {
            this.dialog_content = str;
        }

        public void setDialog_title(String str) {
            this.dialog_title = str;
        }

        public void setError_codes(List<Integer> list) {
            this.error_codes = list;
        }

        public void setJump_type(int i) {
            this.jump_type = i;
        }

        public void setJump_url(String str) {
            this.jump_url = str;
        }

        public void setL_button_dialog(String str) {
            this.l_button_dialog = str;
        }

        public void setL_jump_type(int i) {
            this.l_jump_type = i;
        }

        public void setL_jump_url(String str) {
            this.l_jump_url = str;
        }

        public void setLogin_platform(int i) {
            this.login_platform = i;
        }

        public void setPlan_type(int i) {
            this.plan_type = i;
        }

        public void setR_button_dialog(String str) {
            this.r_button_dialog = str;
        }

        public void setR_jump_type(int i) {
            this.r_jump_type = i;
        }

        public void setR_jump_url(String str) {
            this.r_jump_url = str;
        }

        public SettingInfo(String str, String str2, String str3, String str4) {
            this.dialog_title = str;
            this.dialog_content = str2;
            this.l_button_dialog = str3;
            this.r_button_dialog = str4;
        }
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public List<SettingInfo> getData() {
        if (this.data == null) {
            return Collections.EMPTY_LIST;
        }
        return this.data;
    }

    public void setData(List<SettingInfo> list) {
        this.data = list;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}

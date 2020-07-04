package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanSetting */
public final class IMXPlanSetting extends Message<IMXPlanSetting, Builder> {
    public static final DefaultValueProtoAdapter<IMXPlanSetting> ADAPTER = new ProtoAdapter_IMXPlanSetting();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String alert_install_title;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 13)
    public final IMXPlanUrlModel b_chat_icon;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String chat_installed_x_button_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String chat_msg_fixed_subtitle;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
    public final Integer chat_msg_list_style;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String chat_no_installed_x_button_title;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 9)
    public final IMXPlanUrlModel chat_no_unread_msg_icon;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String chat_no_unread_msg_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 10)
    public final Integer chat_subtitle_style;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String download_x_url;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 14)
    public final IMXPlanUrlModel extra_icon_1;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 15)
    public final IMXPlanUrlModel extra_icon_2;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 16)
    public final IMXPlanUrlModel extra_icon_3;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 17)
    public final IMXPlanUrlModel extra_icon_4;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 18)
    public final IMXPlanUrlModel extra_icon_5;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 19)
    public final IMXPlanUrlModel extra_icon_6;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 20)
    public final IMXPlanUrlModel extra_icon_7;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 21)
    public final IMXPlanUrlModel extra_icon_8;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String extra_str_1;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 30)
    public final String extra_str_10;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 22)
    public final String extra_str_2;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 23)
    public final String extra_str_3;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 24)
    public final String extra_str_4;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public final String extra_str_5;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public final String extra_str_6;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 27)
    public final String extra_str_7;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 28)
    public final String extra_str_8;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 29)
    public final String extra_str_9;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 7)
    public final IMXPlanUrlModel profile_detail_msg_icon;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanUrlModel#ADAPTER", tag = 6)
    public final IMXPlanUrlModel profile_msg_icon;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanSetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<IMXPlanSetting, Builder> {
        public String alert_install_title;
        public IMXPlanUrlModel b_chat_icon;
        public String chat_installed_x_button_title;
        public String chat_msg_fixed_subtitle;
        public Integer chat_msg_list_style;
        public String chat_no_installed_x_button_title;
        public IMXPlanUrlModel chat_no_unread_msg_icon;
        public String chat_no_unread_msg_title;
        public Integer chat_subtitle_style;
        public String download_x_url;
        public IMXPlanUrlModel extra_icon_1;
        public IMXPlanUrlModel extra_icon_2;
        public IMXPlanUrlModel extra_icon_3;
        public IMXPlanUrlModel extra_icon_4;
        public IMXPlanUrlModel extra_icon_5;
        public IMXPlanUrlModel extra_icon_6;
        public IMXPlanUrlModel extra_icon_7;
        public IMXPlanUrlModel extra_icon_8;
        public String extra_str_1;
        public String extra_str_10;
        public String extra_str_2;
        public String extra_str_3;
        public String extra_str_4;
        public String extra_str_5;
        public String extra_str_6;
        public String extra_str_7;
        public String extra_str_8;
        public String extra_str_9;
        public IMXPlanUrlModel profile_detail_msg_icon;
        public IMXPlanUrlModel profile_msg_icon;

        public final IMXPlanSetting build() {
            return new IMXPlanSetting(this, super.buildUnknownFields());
        }

        public final Builder alert_install_title(String str) {
            this.alert_install_title = str;
            return this;
        }

        public final Builder b_chat_icon(IMXPlanUrlModel iMXPlanUrlModel) {
            this.b_chat_icon = iMXPlanUrlModel;
            return this;
        }

        public final Builder chat_installed_x_button_title(String str) {
            this.chat_installed_x_button_title = str;
            return this;
        }

        public final Builder chat_msg_fixed_subtitle(String str) {
            this.chat_msg_fixed_subtitle = str;
            return this;
        }

        public final Builder chat_msg_list_style(Integer num) {
            this.chat_msg_list_style = num;
            return this;
        }

        public final Builder chat_no_installed_x_button_title(String str) {
            this.chat_no_installed_x_button_title = str;
            return this;
        }

        public final Builder chat_no_unread_msg_icon(IMXPlanUrlModel iMXPlanUrlModel) {
            this.chat_no_unread_msg_icon = iMXPlanUrlModel;
            return this;
        }

        public final Builder chat_no_unread_msg_title(String str) {
            this.chat_no_unread_msg_title = str;
            return this;
        }

        public final Builder chat_subtitle_style(Integer num) {
            this.chat_subtitle_style = num;
            return this;
        }

        public final Builder download_x_url(String str) {
            this.download_x_url = str;
            return this;
        }

        public final Builder extra_icon_1(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_1 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_2(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_2 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_3(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_3 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_4(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_4 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_5(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_5 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_6(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_6 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_7(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_7 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_icon_8(IMXPlanUrlModel iMXPlanUrlModel) {
            this.extra_icon_8 = iMXPlanUrlModel;
            return this;
        }

        public final Builder extra_str_1(String str) {
            this.extra_str_1 = str;
            return this;
        }

        public final Builder extra_str_10(String str) {
            this.extra_str_10 = str;
            return this;
        }

        public final Builder extra_str_2(String str) {
            this.extra_str_2 = str;
            return this;
        }

        public final Builder extra_str_3(String str) {
            this.extra_str_3 = str;
            return this;
        }

        public final Builder extra_str_4(String str) {
            this.extra_str_4 = str;
            return this;
        }

        public final Builder extra_str_5(String str) {
            this.extra_str_5 = str;
            return this;
        }

        public final Builder extra_str_6(String str) {
            this.extra_str_6 = str;
            return this;
        }

        public final Builder extra_str_7(String str) {
            this.extra_str_7 = str;
            return this;
        }

        public final Builder extra_str_8(String str) {
            this.extra_str_8 = str;
            return this;
        }

        public final Builder extra_str_9(String str) {
            this.extra_str_9 = str;
            return this;
        }

        public final Builder profile_detail_msg_icon(IMXPlanUrlModel iMXPlanUrlModel) {
            this.profile_detail_msg_icon = iMXPlanUrlModel;
            return this;
        }

        public final Builder profile_msg_icon(IMXPlanUrlModel iMXPlanUrlModel) {
            this.profile_msg_icon = iMXPlanUrlModel;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanSetting$ProtoAdapter_IMXPlanSetting */
    static final class ProtoAdapter_IMXPlanSetting extends DefaultValueProtoAdapter<IMXPlanSetting> {
        public final IMXPlanSetting redact(IMXPlanSetting iMXPlanSetting) {
            return iMXPlanSetting;
        }

        public ProtoAdapter_IMXPlanSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, IMXPlanSetting.class);
        }

        public final IMXPlanSetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (IMXPlanSetting) null);
        }

        public final int encodedSize(IMXPlanSetting iMXPlanSetting) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, iMXPlanSetting.extra_str_1) + ProtoAdapter.STRING.encodedSizeWithTag(2, iMXPlanSetting.alert_install_title) + ProtoAdapter.STRING.encodedSizeWithTag(3, iMXPlanSetting.download_x_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, iMXPlanSetting.chat_installed_x_button_title) + ProtoAdapter.STRING.encodedSizeWithTag(5, iMXPlanSetting.chat_no_installed_x_button_title) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(6, iMXPlanSetting.profile_msg_icon) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(7, iMXPlanSetting.profile_detail_msg_icon) + ProtoAdapter.STRING.encodedSizeWithTag(8, iMXPlanSetting.chat_no_unread_msg_title) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(9, iMXPlanSetting.chat_no_unread_msg_icon) + ProtoAdapter.INT32.encodedSizeWithTag(10, iMXPlanSetting.chat_subtitle_style) + ProtoAdapter.STRING.encodedSizeWithTag(11, iMXPlanSetting.chat_msg_fixed_subtitle) + ProtoAdapter.INT32.encodedSizeWithTag(12, iMXPlanSetting.chat_msg_list_style) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(13, iMXPlanSetting.b_chat_icon) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(14, iMXPlanSetting.extra_icon_1) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(15, iMXPlanSetting.extra_icon_2) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(16, iMXPlanSetting.extra_icon_3) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(17, iMXPlanSetting.extra_icon_4) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(18, iMXPlanSetting.extra_icon_5) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(19, iMXPlanSetting.extra_icon_6) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(20, iMXPlanSetting.extra_icon_7) + IMXPlanUrlModel.ADAPTER.encodedSizeWithTag(21, iMXPlanSetting.extra_icon_8) + ProtoAdapter.STRING.encodedSizeWithTag(22, iMXPlanSetting.extra_str_2) + ProtoAdapter.STRING.encodedSizeWithTag(23, iMXPlanSetting.extra_str_3) + ProtoAdapter.STRING.encodedSizeWithTag(24, iMXPlanSetting.extra_str_4) + ProtoAdapter.STRING.encodedSizeWithTag(25, iMXPlanSetting.extra_str_5) + ProtoAdapter.STRING.encodedSizeWithTag(26, iMXPlanSetting.extra_str_6) + ProtoAdapter.STRING.encodedSizeWithTag(27, iMXPlanSetting.extra_str_7) + ProtoAdapter.STRING.encodedSizeWithTag(28, iMXPlanSetting.extra_str_8) + ProtoAdapter.STRING.encodedSizeWithTag(29, iMXPlanSetting.extra_str_9) + ProtoAdapter.STRING.encodedSizeWithTag(30, iMXPlanSetting.extra_str_10) + iMXPlanSetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, IMXPlanSetting iMXPlanSetting) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, iMXPlanSetting.extra_str_1);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, iMXPlanSetting.alert_install_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, iMXPlanSetting.download_x_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, iMXPlanSetting.chat_installed_x_button_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, iMXPlanSetting.chat_no_installed_x_button_title);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 6, iMXPlanSetting.profile_msg_icon);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 7, iMXPlanSetting.profile_detail_msg_icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, iMXPlanSetting.chat_no_unread_msg_title);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 9, iMXPlanSetting.chat_no_unread_msg_icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, iMXPlanSetting.chat_subtitle_style);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, iMXPlanSetting.chat_msg_fixed_subtitle);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, iMXPlanSetting.chat_msg_list_style);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 13, iMXPlanSetting.b_chat_icon);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 14, iMXPlanSetting.extra_icon_1);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 15, iMXPlanSetting.extra_icon_2);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 16, iMXPlanSetting.extra_icon_3);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 17, iMXPlanSetting.extra_icon_4);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 18, iMXPlanSetting.extra_icon_5);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 19, iMXPlanSetting.extra_icon_6);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 20, iMXPlanSetting.extra_icon_7);
            IMXPlanUrlModel.ADAPTER.encodeWithTag(protoWriter, 21, iMXPlanSetting.extra_icon_8);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, iMXPlanSetting.extra_str_2);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, iMXPlanSetting.extra_str_3);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, iMXPlanSetting.extra_str_4);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, iMXPlanSetting.extra_str_5);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, iMXPlanSetting.extra_str_6);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 27, iMXPlanSetting.extra_str_7);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, iMXPlanSetting.extra_str_8);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 29, iMXPlanSetting.extra_str_9);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, iMXPlanSetting.extra_str_10);
            protoWriter.writeBytes(iMXPlanSetting.unknownFields());
        }

        public final IMXPlanSetting decode(ProtoReader protoReader, IMXPlanSetting iMXPlanSetting) throws IOException {
            Builder builder;
            IMXPlanSetting iMXPlanSetting2 = (IMXPlanSetting) C10938a.m32097a().mo26425a(IMXPlanSetting.class, iMXPlanSetting);
            if (iMXPlanSetting2 != null) {
                builder = iMXPlanSetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.extra_str_1((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.alert_install_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.download_x_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.chat_installed_x_button_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.chat_no_installed_x_button_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.profile_msg_icon((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.profile_msg_icon));
                            break;
                        case 7:
                            builder.profile_detail_msg_icon((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.profile_detail_msg_icon));
                            break;
                        case 8:
                            builder.chat_no_unread_msg_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.chat_no_unread_msg_icon((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.chat_no_unread_msg_icon));
                            break;
                        case 10:
                            builder.chat_subtitle_style((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            builder.chat_msg_fixed_subtitle((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.chat_msg_list_style((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 13:
                            builder.b_chat_icon((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.b_chat_icon));
                            break;
                        case 14:
                            builder.extra_icon_1((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.extra_icon_1));
                            break;
                        case 15:
                            builder.extra_icon_2((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.extra_icon_2));
                            break;
                        case 16:
                            builder.extra_icon_3((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.extra_icon_3));
                            break;
                        case 17:
                            builder.extra_icon_4((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.extra_icon_4));
                            break;
                        case 18:
                            builder.extra_icon_5((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.extra_icon_5));
                            break;
                        case 19:
                            builder.extra_icon_6((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.extra_icon_6));
                            break;
                        case 20:
                            builder.extra_icon_7((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.extra_icon_7));
                            break;
                        case 21:
                            builder.extra_icon_8((IMXPlanUrlModel) IMXPlanUrlModel.ADAPTER.decode(protoReader, builder.extra_icon_8));
                            break;
                        case 22:
                            builder.extra_str_2((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 23:
                            builder.extra_str_3((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 24:
                            builder.extra_str_4((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 25:
                            builder.extra_str_5((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                            builder.extra_str_6((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                            builder.extra_str_7((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 28:
                            builder.extra_str_8((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 29:
                            builder.extra_str_9((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 30:
                            builder.extra_str_10((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (iMXPlanSetting2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getAlertInstallTitle() throws NullValueException {
        if (this.alert_install_title != null) {
            return this.alert_install_title;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getBChatIcon() throws NullValueException {
        if (this.b_chat_icon != null) {
            return this.b_chat_icon;
        }
        throw new NullValueException();
    }

    public final String getChatInstalledXButtonTitle() throws NullValueException {
        if (this.chat_installed_x_button_title != null) {
            return this.chat_installed_x_button_title;
        }
        throw new NullValueException();
    }

    public final String getChatMsgFixedSubtitle() throws NullValueException {
        if (this.chat_msg_fixed_subtitle != null) {
            return this.chat_msg_fixed_subtitle;
        }
        throw new NullValueException();
    }

    public final Integer getChatMsgListStyle() throws NullValueException {
        if (this.chat_msg_list_style != null) {
            return this.chat_msg_list_style;
        }
        throw new NullValueException();
    }

    public final String getChatNoInstalledXButtonTitle() throws NullValueException {
        if (this.chat_no_installed_x_button_title != null) {
            return this.chat_no_installed_x_button_title;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getChatNoUnreadMsgIcon() throws NullValueException {
        if (this.chat_no_unread_msg_icon != null) {
            return this.chat_no_unread_msg_icon;
        }
        throw new NullValueException();
    }

    public final String getChatNoUnreadMsgTitle() throws NullValueException {
        if (this.chat_no_unread_msg_title != null) {
            return this.chat_no_unread_msg_title;
        }
        throw new NullValueException();
    }

    public final Integer getChatSubtitleStyle() throws NullValueException {
        if (this.chat_subtitle_style != null) {
            return this.chat_subtitle_style;
        }
        throw new NullValueException();
    }

    public final String getDownloadXUrl() throws NullValueException {
        if (this.download_x_url != null) {
            return this.download_x_url;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getExtraIcon1() throws NullValueException {
        if (this.extra_icon_1 != null) {
            return this.extra_icon_1;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getExtraIcon2() throws NullValueException {
        if (this.extra_icon_2 != null) {
            return this.extra_icon_2;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getExtraIcon3() throws NullValueException {
        if (this.extra_icon_3 != null) {
            return this.extra_icon_3;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getExtraIcon4() throws NullValueException {
        if (this.extra_icon_4 != null) {
            return this.extra_icon_4;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getExtraIcon5() throws NullValueException {
        if (this.extra_icon_5 != null) {
            return this.extra_icon_5;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getExtraIcon6() throws NullValueException {
        if (this.extra_icon_6 != null) {
            return this.extra_icon_6;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getExtraIcon7() throws NullValueException {
        if (this.extra_icon_7 != null) {
            return this.extra_icon_7;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getExtraIcon8() throws NullValueException {
        if (this.extra_icon_8 != null) {
            return this.extra_icon_8;
        }
        throw new NullValueException();
    }

    public final String getExtraStr1() throws NullValueException {
        if (this.extra_str_1 != null) {
            return this.extra_str_1;
        }
        throw new NullValueException();
    }

    public final String getExtraStr10() throws NullValueException {
        if (this.extra_str_10 != null) {
            return this.extra_str_10;
        }
        throw new NullValueException();
    }

    public final String getExtraStr2() throws NullValueException {
        if (this.extra_str_2 != null) {
            return this.extra_str_2;
        }
        throw new NullValueException();
    }

    public final String getExtraStr3() throws NullValueException {
        if (this.extra_str_3 != null) {
            return this.extra_str_3;
        }
        throw new NullValueException();
    }

    public final String getExtraStr4() throws NullValueException {
        if (this.extra_str_4 != null) {
            return this.extra_str_4;
        }
        throw new NullValueException();
    }

    public final String getExtraStr5() throws NullValueException {
        if (this.extra_str_5 != null) {
            return this.extra_str_5;
        }
        throw new NullValueException();
    }

    public final String getExtraStr6() throws NullValueException {
        if (this.extra_str_6 != null) {
            return this.extra_str_6;
        }
        throw new NullValueException();
    }

    public final String getExtraStr7() throws NullValueException {
        if (this.extra_str_7 != null) {
            return this.extra_str_7;
        }
        throw new NullValueException();
    }

    public final String getExtraStr8() throws NullValueException {
        if (this.extra_str_8 != null) {
            return this.extra_str_8;
        }
        throw new NullValueException();
    }

    public final String getExtraStr9() throws NullValueException {
        if (this.extra_str_9 != null) {
            return this.extra_str_9;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getProfileDetailMsgIcon() throws NullValueException {
        if (this.profile_detail_msg_icon != null) {
            return this.profile_detail_msg_icon;
        }
        throw new NullValueException();
    }

    public final IMXPlanUrlModel getProfileMsgIcon() throws NullValueException {
        if (this.profile_msg_icon != null) {
            return this.profile_msg_icon;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.extra_str_1 = this.extra_str_1;
        builder.alert_install_title = this.alert_install_title;
        builder.download_x_url = this.download_x_url;
        builder.chat_installed_x_button_title = this.chat_installed_x_button_title;
        builder.chat_no_installed_x_button_title = this.chat_no_installed_x_button_title;
        builder.profile_msg_icon = this.profile_msg_icon;
        builder.profile_detail_msg_icon = this.profile_detail_msg_icon;
        builder.chat_no_unread_msg_title = this.chat_no_unread_msg_title;
        builder.chat_no_unread_msg_icon = this.chat_no_unread_msg_icon;
        builder.chat_subtitle_style = this.chat_subtitle_style;
        builder.chat_msg_fixed_subtitle = this.chat_msg_fixed_subtitle;
        builder.chat_msg_list_style = this.chat_msg_list_style;
        builder.b_chat_icon = this.b_chat_icon;
        builder.extra_icon_1 = this.extra_icon_1;
        builder.extra_icon_2 = this.extra_icon_2;
        builder.extra_icon_3 = this.extra_icon_3;
        builder.extra_icon_4 = this.extra_icon_4;
        builder.extra_icon_5 = this.extra_icon_5;
        builder.extra_icon_6 = this.extra_icon_6;
        builder.extra_icon_7 = this.extra_icon_7;
        builder.extra_icon_8 = this.extra_icon_8;
        builder.extra_str_2 = this.extra_str_2;
        builder.extra_str_3 = this.extra_str_3;
        builder.extra_str_4 = this.extra_str_4;
        builder.extra_str_5 = this.extra_str_5;
        builder.extra_str_6 = this.extra_str_6;
        builder.extra_str_7 = this.extra_str_7;
        builder.extra_str_8 = this.extra_str_8;
        builder.extra_str_9 = this.extra_str_9;
        builder.extra_str_10 = this.extra_str_10;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30 = this.hashCode;
        if (i30 != 0) {
            return i30;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i31 = 0;
        if (this.extra_str_1 != null) {
            i = this.extra_str_1.hashCode();
        } else {
            i = 0;
        }
        int i32 = (hashCode + i) * 37;
        if (this.alert_install_title != null) {
            i2 = this.alert_install_title.hashCode();
        } else {
            i2 = 0;
        }
        int i33 = (i32 + i2) * 37;
        if (this.download_x_url != null) {
            i3 = this.download_x_url.hashCode();
        } else {
            i3 = 0;
        }
        int i34 = (i33 + i3) * 37;
        if (this.chat_installed_x_button_title != null) {
            i4 = this.chat_installed_x_button_title.hashCode();
        } else {
            i4 = 0;
        }
        int i35 = (i34 + i4) * 37;
        if (this.chat_no_installed_x_button_title != null) {
            i5 = this.chat_no_installed_x_button_title.hashCode();
        } else {
            i5 = 0;
        }
        int i36 = (i35 + i5) * 37;
        if (this.profile_msg_icon != null) {
            i6 = this.profile_msg_icon.hashCode();
        } else {
            i6 = 0;
        }
        int i37 = (i36 + i6) * 37;
        if (this.profile_detail_msg_icon != null) {
            i7 = this.profile_detail_msg_icon.hashCode();
        } else {
            i7 = 0;
        }
        int i38 = (i37 + i7) * 37;
        if (this.chat_no_unread_msg_title != null) {
            i8 = this.chat_no_unread_msg_title.hashCode();
        } else {
            i8 = 0;
        }
        int i39 = (i38 + i8) * 37;
        if (this.chat_no_unread_msg_icon != null) {
            i9 = this.chat_no_unread_msg_icon.hashCode();
        } else {
            i9 = 0;
        }
        int i40 = (i39 + i9) * 37;
        if (this.chat_subtitle_style != null) {
            i10 = this.chat_subtitle_style.hashCode();
        } else {
            i10 = 0;
        }
        int i41 = (i40 + i10) * 37;
        if (this.chat_msg_fixed_subtitle != null) {
            i11 = this.chat_msg_fixed_subtitle.hashCode();
        } else {
            i11 = 0;
        }
        int i42 = (i41 + i11) * 37;
        if (this.chat_msg_list_style != null) {
            i12 = this.chat_msg_list_style.hashCode();
        } else {
            i12 = 0;
        }
        int i43 = (i42 + i12) * 37;
        if (this.b_chat_icon != null) {
            i13 = this.b_chat_icon.hashCode();
        } else {
            i13 = 0;
        }
        int i44 = (i43 + i13) * 37;
        if (this.extra_icon_1 != null) {
            i14 = this.extra_icon_1.hashCode();
        } else {
            i14 = 0;
        }
        int i45 = (i44 + i14) * 37;
        if (this.extra_icon_2 != null) {
            i15 = this.extra_icon_2.hashCode();
        } else {
            i15 = 0;
        }
        int i46 = (i45 + i15) * 37;
        if (this.extra_icon_3 != null) {
            i16 = this.extra_icon_3.hashCode();
        } else {
            i16 = 0;
        }
        int i47 = (i46 + i16) * 37;
        if (this.extra_icon_4 != null) {
            i17 = this.extra_icon_4.hashCode();
        } else {
            i17 = 0;
        }
        int i48 = (i47 + i17) * 37;
        if (this.extra_icon_5 != null) {
            i18 = this.extra_icon_5.hashCode();
        } else {
            i18 = 0;
        }
        int i49 = (i48 + i18) * 37;
        if (this.extra_icon_6 != null) {
            i19 = this.extra_icon_6.hashCode();
        } else {
            i19 = 0;
        }
        int i50 = (i49 + i19) * 37;
        if (this.extra_icon_7 != null) {
            i20 = this.extra_icon_7.hashCode();
        } else {
            i20 = 0;
        }
        int i51 = (i50 + i20) * 37;
        if (this.extra_icon_8 != null) {
            i21 = this.extra_icon_8.hashCode();
        } else {
            i21 = 0;
        }
        int i52 = (i51 + i21) * 37;
        if (this.extra_str_2 != null) {
            i22 = this.extra_str_2.hashCode();
        } else {
            i22 = 0;
        }
        int i53 = (i52 + i22) * 37;
        if (this.extra_str_3 != null) {
            i23 = this.extra_str_3.hashCode();
        } else {
            i23 = 0;
        }
        int i54 = (i53 + i23) * 37;
        if (this.extra_str_4 != null) {
            i24 = this.extra_str_4.hashCode();
        } else {
            i24 = 0;
        }
        int i55 = (i54 + i24) * 37;
        if (this.extra_str_5 != null) {
            i25 = this.extra_str_5.hashCode();
        } else {
            i25 = 0;
        }
        int i56 = (i55 + i25) * 37;
        if (this.extra_str_6 != null) {
            i26 = this.extra_str_6.hashCode();
        } else {
            i26 = 0;
        }
        int i57 = (i56 + i26) * 37;
        if (this.extra_str_7 != null) {
            i27 = this.extra_str_7.hashCode();
        } else {
            i27 = 0;
        }
        int i58 = (i57 + i27) * 37;
        if (this.extra_str_8 != null) {
            i28 = this.extra_str_8.hashCode();
        } else {
            i28 = 0;
        }
        int i59 = (i58 + i28) * 37;
        if (this.extra_str_9 != null) {
            i29 = this.extra_str_9.hashCode();
        } else {
            i29 = 0;
        }
        int i60 = (i59 + i29) * 37;
        if (this.extra_str_10 != null) {
            i31 = this.extra_str_10.hashCode();
        }
        int i61 = i60 + i31;
        this.hashCode = i61;
        return i61;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.extra_str_1 != null) {
            sb.append(", extra_str_1=");
            sb.append(this.extra_str_1);
        }
        if (this.alert_install_title != null) {
            sb.append(", alert_install_title=");
            sb.append(this.alert_install_title);
        }
        if (this.download_x_url != null) {
            sb.append(", download_x_url=");
            sb.append(this.download_x_url);
        }
        if (this.chat_installed_x_button_title != null) {
            sb.append(", chat_installed_x_button_title=");
            sb.append(this.chat_installed_x_button_title);
        }
        if (this.chat_no_installed_x_button_title != null) {
            sb.append(", chat_no_installed_x_button_title=");
            sb.append(this.chat_no_installed_x_button_title);
        }
        if (this.profile_msg_icon != null) {
            sb.append(", profile_msg_icon=");
            sb.append(this.profile_msg_icon);
        }
        if (this.profile_detail_msg_icon != null) {
            sb.append(", profile_detail_msg_icon=");
            sb.append(this.profile_detail_msg_icon);
        }
        if (this.chat_no_unread_msg_title != null) {
            sb.append(", chat_no_unread_msg_title=");
            sb.append(this.chat_no_unread_msg_title);
        }
        if (this.chat_no_unread_msg_icon != null) {
            sb.append(", chat_no_unread_msg_icon=");
            sb.append(this.chat_no_unread_msg_icon);
        }
        if (this.chat_subtitle_style != null) {
            sb.append(", chat_subtitle_style=");
            sb.append(this.chat_subtitle_style);
        }
        if (this.chat_msg_fixed_subtitle != null) {
            sb.append(", chat_msg_fixed_subtitle=");
            sb.append(this.chat_msg_fixed_subtitle);
        }
        if (this.chat_msg_list_style != null) {
            sb.append(", chat_msg_list_style=");
            sb.append(this.chat_msg_list_style);
        }
        if (this.b_chat_icon != null) {
            sb.append(", b_chat_icon=");
            sb.append(this.b_chat_icon);
        }
        if (this.extra_icon_1 != null) {
            sb.append(", extra_icon_1=");
            sb.append(this.extra_icon_1);
        }
        if (this.extra_icon_2 != null) {
            sb.append(", extra_icon_2=");
            sb.append(this.extra_icon_2);
        }
        if (this.extra_icon_3 != null) {
            sb.append(", extra_icon_3=");
            sb.append(this.extra_icon_3);
        }
        if (this.extra_icon_4 != null) {
            sb.append(", extra_icon_4=");
            sb.append(this.extra_icon_4);
        }
        if (this.extra_icon_5 != null) {
            sb.append(", extra_icon_5=");
            sb.append(this.extra_icon_5);
        }
        if (this.extra_icon_6 != null) {
            sb.append(", extra_icon_6=");
            sb.append(this.extra_icon_6);
        }
        if (this.extra_icon_7 != null) {
            sb.append(", extra_icon_7=");
            sb.append(this.extra_icon_7);
        }
        if (this.extra_icon_8 != null) {
            sb.append(", extra_icon_8=");
            sb.append(this.extra_icon_8);
        }
        if (this.extra_str_2 != null) {
            sb.append(", extra_str_2=");
            sb.append(this.extra_str_2);
        }
        if (this.extra_str_3 != null) {
            sb.append(", extra_str_3=");
            sb.append(this.extra_str_3);
        }
        if (this.extra_str_4 != null) {
            sb.append(", extra_str_4=");
            sb.append(this.extra_str_4);
        }
        if (this.extra_str_5 != null) {
            sb.append(", extra_str_5=");
            sb.append(this.extra_str_5);
        }
        if (this.extra_str_6 != null) {
            sb.append(", extra_str_6=");
            sb.append(this.extra_str_6);
        }
        if (this.extra_str_7 != null) {
            sb.append(", extra_str_7=");
            sb.append(this.extra_str_7);
        }
        if (this.extra_str_8 != null) {
            sb.append(", extra_str_8=");
            sb.append(this.extra_str_8);
        }
        if (this.extra_str_9 != null) {
            sb.append(", extra_str_9=");
            sb.append(this.extra_str_9);
        }
        if (this.extra_str_10 != null) {
            sb.append(", extra_str_10=");
            sb.append(this.extra_str_10);
        }
        StringBuilder replace = sb.replace(0, 2, "IMXPlanSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IMXPlanSetting)) {
            return false;
        }
        IMXPlanSetting iMXPlanSetting = (IMXPlanSetting) obj;
        if (!unknownFields().equals(iMXPlanSetting.unknownFields()) || !Internal.equals(this.extra_str_1, iMXPlanSetting.extra_str_1) || !Internal.equals(this.alert_install_title, iMXPlanSetting.alert_install_title) || !Internal.equals(this.download_x_url, iMXPlanSetting.download_x_url) || !Internal.equals(this.chat_installed_x_button_title, iMXPlanSetting.chat_installed_x_button_title) || !Internal.equals(this.chat_no_installed_x_button_title, iMXPlanSetting.chat_no_installed_x_button_title) || !Internal.equals(this.profile_msg_icon, iMXPlanSetting.profile_msg_icon) || !Internal.equals(this.profile_detail_msg_icon, iMXPlanSetting.profile_detail_msg_icon) || !Internal.equals(this.chat_no_unread_msg_title, iMXPlanSetting.chat_no_unread_msg_title) || !Internal.equals(this.chat_no_unread_msg_icon, iMXPlanSetting.chat_no_unread_msg_icon) || !Internal.equals(this.chat_subtitle_style, iMXPlanSetting.chat_subtitle_style) || !Internal.equals(this.chat_msg_fixed_subtitle, iMXPlanSetting.chat_msg_fixed_subtitle) || !Internal.equals(this.chat_msg_list_style, iMXPlanSetting.chat_msg_list_style) || !Internal.equals(this.b_chat_icon, iMXPlanSetting.b_chat_icon) || !Internal.equals(this.extra_icon_1, iMXPlanSetting.extra_icon_1) || !Internal.equals(this.extra_icon_2, iMXPlanSetting.extra_icon_2) || !Internal.equals(this.extra_icon_3, iMXPlanSetting.extra_icon_3) || !Internal.equals(this.extra_icon_4, iMXPlanSetting.extra_icon_4) || !Internal.equals(this.extra_icon_5, iMXPlanSetting.extra_icon_5) || !Internal.equals(this.extra_icon_6, iMXPlanSetting.extra_icon_6) || !Internal.equals(this.extra_icon_7, iMXPlanSetting.extra_icon_7) || !Internal.equals(this.extra_icon_8, iMXPlanSetting.extra_icon_8) || !Internal.equals(this.extra_str_2, iMXPlanSetting.extra_str_2) || !Internal.equals(this.extra_str_3, iMXPlanSetting.extra_str_3) || !Internal.equals(this.extra_str_4, iMXPlanSetting.extra_str_4) || !Internal.equals(this.extra_str_5, iMXPlanSetting.extra_str_5) || !Internal.equals(this.extra_str_6, iMXPlanSetting.extra_str_6) || !Internal.equals(this.extra_str_7, iMXPlanSetting.extra_str_7) || !Internal.equals(this.extra_str_8, iMXPlanSetting.extra_str_8) || !Internal.equals(this.extra_str_9, iMXPlanSetting.extra_str_9) || !Internal.equals(this.extra_str_10, iMXPlanSetting.extra_str_10)) {
            return false;
        }
        return true;
    }

    public IMXPlanSetting(Builder builder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.extra_str_1 = builder.extra_str_1;
        this.alert_install_title = builder.alert_install_title;
        this.download_x_url = builder.download_x_url;
        this.chat_installed_x_button_title = builder.chat_installed_x_button_title;
        this.chat_no_installed_x_button_title = builder.chat_no_installed_x_button_title;
        this.profile_msg_icon = builder.profile_msg_icon;
        this.profile_detail_msg_icon = builder.profile_detail_msg_icon;
        this.chat_no_unread_msg_title = builder.chat_no_unread_msg_title;
        this.chat_no_unread_msg_icon = builder.chat_no_unread_msg_icon;
        this.chat_subtitle_style = builder.chat_subtitle_style;
        this.chat_msg_fixed_subtitle = builder.chat_msg_fixed_subtitle;
        this.chat_msg_list_style = builder.chat_msg_list_style;
        this.b_chat_icon = builder.b_chat_icon;
        this.extra_icon_1 = builder.extra_icon_1;
        this.extra_icon_2 = builder.extra_icon_2;
        this.extra_icon_3 = builder.extra_icon_3;
        this.extra_icon_4 = builder.extra_icon_4;
        this.extra_icon_5 = builder.extra_icon_5;
        this.extra_icon_6 = builder.extra_icon_6;
        this.extra_icon_7 = builder.extra_icon_7;
        this.extra_icon_8 = builder.extra_icon_8;
        this.extra_str_2 = builder.extra_str_2;
        this.extra_str_3 = builder.extra_str_3;
        this.extra_str_4 = builder.extra_str_4;
        this.extra_str_5 = builder.extra_str_5;
        this.extra_str_6 = builder.extra_str_6;
        this.extra_str_7 = builder.extra_str_7;
        this.extra_str_8 = builder.extra_str_8;
        this.extra_str_9 = builder.extra_str_9;
        this.extra_str_10 = builder.extra_str_10;
    }
}

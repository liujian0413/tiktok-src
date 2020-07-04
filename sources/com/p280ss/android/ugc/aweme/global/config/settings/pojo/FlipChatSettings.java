package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings */
public final class FlipChatSettings extends Message<FlipChatSettings, Builder> {
    public static final DefaultValueProtoAdapter<FlipChatSettings> ADAPTER = new ProtoAdapter_FlipChatSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 1)
    public final Boolean main_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String msg_cell_avatar_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String msg_cell_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 2)
    public final Boolean show_launch_page_popup;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 3)
    public final Boolean show_login_icon;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 4)
    public final Boolean show_msg_cell;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FlipChatSettings, Builder> {
        public Boolean main_switch;
        public String msg_cell_avatar_url;
        public String msg_cell_name;
        public Boolean show_launch_page_popup;
        public Boolean show_login_icon;
        public Boolean show_msg_cell;

        public final FlipChatSettings build() {
            if (this.main_switch == null || this.show_launch_page_popup == null || this.show_login_icon == null || this.show_msg_cell == null) {
                throw C10939b.m32101a(this.main_switch, "main_switch", this.show_launch_page_popup, "show_launch_page_popup", this.show_login_icon, "show_login_icon", this.show_msg_cell, "show_msg_cell");
            }
            FlipChatSettings flipChatSettings = new FlipChatSettings(this.main_switch, this.show_launch_page_popup, this.show_login_icon, this.show_msg_cell, this.msg_cell_name, this.msg_cell_avatar_url, super.buildUnknownFields());
            return flipChatSettings;
        }

        public final Builder main_switch(Boolean bool) {
            this.main_switch = bool;
            return this;
        }

        public final Builder msg_cell_avatar_url(String str) {
            this.msg_cell_avatar_url = str;
            return this;
        }

        public final Builder msg_cell_name(String str) {
            this.msg_cell_name = str;
            return this;
        }

        public final Builder show_launch_page_popup(Boolean bool) {
            this.show_launch_page_popup = bool;
            return this;
        }

        public final Builder show_login_icon(Boolean bool) {
            this.show_login_icon = bool;
            return this;
        }

        public final Builder show_msg_cell(Boolean bool) {
            this.show_msg_cell = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings$ProtoAdapter_FlipChatSettings */
    static final class ProtoAdapter_FlipChatSettings extends DefaultValueProtoAdapter<FlipChatSettings> {
        public final FlipChatSettings redact(FlipChatSettings flipChatSettings) {
            return flipChatSettings;
        }

        public ProtoAdapter_FlipChatSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, FlipChatSettings.class);
        }

        public final FlipChatSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FlipChatSettings) null);
        }

        public final int encodedSize(FlipChatSettings flipChatSettings) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, flipChatSettings.main_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(2, flipChatSettings.show_launch_page_popup) + ProtoAdapter.BOOL.encodedSizeWithTag(3, flipChatSettings.show_login_icon) + ProtoAdapter.BOOL.encodedSizeWithTag(4, flipChatSettings.show_msg_cell) + ProtoAdapter.STRING.encodedSizeWithTag(5, flipChatSettings.msg_cell_name) + ProtoAdapter.STRING.encodedSizeWithTag(6, flipChatSettings.msg_cell_avatar_url) + flipChatSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FlipChatSettings flipChatSettings) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, flipChatSettings.main_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, flipChatSettings.show_launch_page_popup);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, flipChatSettings.show_login_icon);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, flipChatSettings.show_msg_cell);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, flipChatSettings.msg_cell_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, flipChatSettings.msg_cell_avatar_url);
            protoWriter.writeBytes(flipChatSettings.unknownFields());
        }

        public final FlipChatSettings decode(ProtoReader protoReader, FlipChatSettings flipChatSettings) throws IOException {
            Builder builder;
            FlipChatSettings flipChatSettings2 = (FlipChatSettings) C10938a.m32097a().mo26425a(FlipChatSettings.class, flipChatSettings);
            if (flipChatSettings2 != null) {
                builder = flipChatSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.main_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.show_launch_page_popup((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.show_login_icon((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.show_msg_cell((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 5:
                            builder.msg_cell_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.msg_cell_avatar_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (flipChatSettings2 != null) {
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

    public final Boolean getMainSwitch() {
        return this.main_switch;
    }

    public final Boolean getShowLaunchPagePopup() {
        return this.show_launch_page_popup;
    }

    public final Boolean getShowLoginIcon() {
        return this.show_login_icon;
    }

    public final Boolean getShowMsgCell() {
        return this.show_msg_cell;
    }

    public final String getMsgCellAvatarUrl() throws NullValueException {
        if (this.msg_cell_avatar_url != null) {
            return this.msg_cell_avatar_url;
        }
        throw new NullValueException();
    }

    public final String getMsgCellName() throws NullValueException {
        if (this.msg_cell_name != null) {
            return this.msg_cell_name;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.main_switch = this.main_switch;
        builder.show_launch_page_popup = this.show_launch_page_popup;
        builder.show_login_icon = this.show_login_icon;
        builder.show_msg_cell = this.show_msg_cell;
        builder.msg_cell_name = this.msg_cell_name;
        builder.msg_cell_avatar_url = this.msg_cell_avatar_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((((((unknownFields().hashCode() * 37) + this.main_switch.hashCode()) * 37) + this.show_launch_page_popup.hashCode()) * 37) + this.show_login_icon.hashCode()) * 37) + this.show_msg_cell.hashCode()) * 37;
        int i3 = 0;
        if (this.msg_cell_name != null) {
            i = this.msg_cell_name.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.msg_cell_avatar_url != null) {
            i3 = this.msg_cell_avatar_url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", main_switch=");
        sb.append(this.main_switch);
        sb.append(", show_launch_page_popup=");
        sb.append(this.show_launch_page_popup);
        sb.append(", show_login_icon=");
        sb.append(this.show_login_icon);
        sb.append(", show_msg_cell=");
        sb.append(this.show_msg_cell);
        if (this.msg_cell_name != null) {
            sb.append(", msg_cell_name=");
            sb.append(this.msg_cell_name);
        }
        if (this.msg_cell_avatar_url != null) {
            sb.append(", msg_cell_avatar_url=");
            sb.append(this.msg_cell_avatar_url);
        }
        StringBuilder replace = sb.replace(0, 2, "FlipChatSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FlipChatSettings)) {
            return false;
        }
        FlipChatSettings flipChatSettings = (FlipChatSettings) obj;
        if (!unknownFields().equals(flipChatSettings.unknownFields()) || !this.main_switch.equals(flipChatSettings.main_switch) || !this.show_launch_page_popup.equals(flipChatSettings.show_launch_page_popup) || !this.show_login_icon.equals(flipChatSettings.show_login_icon) || !this.show_msg_cell.equals(flipChatSettings.show_msg_cell) || !Internal.equals(this.msg_cell_name, flipChatSettings.msg_cell_name) || !Internal.equals(this.msg_cell_avatar_url, flipChatSettings.msg_cell_avatar_url)) {
            return false;
        }
        return true;
    }

    public FlipChatSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2) {
        this(bool, bool2, bool3, bool4, str, str2, ByteString.EMPTY);
    }

    public FlipChatSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.main_switch = bool;
        this.show_launch_page_popup = bool2;
        this.show_login_icon = bool3;
        this.show_msg_cell = bool4;
        this.msg_cell_name = str;
        this.msg_cell_avatar_url = str2;
    }
}

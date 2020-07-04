package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
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
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.EPlatformSettings */
public final class EPlatformSettings extends Message<EPlatformSettings, Builder> {
    public static final DefaultValueProtoAdapter<EPlatformSettings> ADAPTER = new ProtoAdapter_EPlatformSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String block_hint;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer block_mode;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 2)
    public final List<String> jump_block_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String jump_redirect_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String lite_link;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String profile_add_contact_info_text;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.EPlatformSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<EPlatformSettings, Builder> {
        public String block_hint;
        public Integer block_mode;
        public List<String> jump_block_list = Internal.newMutableList();
        public String jump_redirect_url;
        public String lite_link;
        public String profile_add_contact_info_text;

        public final EPlatformSettings build() {
            EPlatformSettings ePlatformSettings = new EPlatformSettings(this.lite_link, this.jump_block_list, this.jump_redirect_url, this.block_hint, this.block_mode, this.profile_add_contact_info_text, super.buildUnknownFields());
            return ePlatformSettings;
        }

        public final Builder block_hint(String str) {
            this.block_hint = str;
            return this;
        }

        public final Builder block_mode(Integer num) {
            this.block_mode = num;
            return this;
        }

        public final Builder jump_redirect_url(String str) {
            this.jump_redirect_url = str;
            return this;
        }

        public final Builder lite_link(String str) {
            this.lite_link = str;
            return this;
        }

        public final Builder profile_add_contact_info_text(String str) {
            this.profile_add_contact_info_text = str;
            return this;
        }

        public final Builder jump_block_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.jump_block_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.EPlatformSettings$ProtoAdapter_EPlatformSettings */
    static final class ProtoAdapter_EPlatformSettings extends DefaultValueProtoAdapter<EPlatformSettings> {
        public final EPlatformSettings redact(EPlatformSettings ePlatformSettings) {
            return ePlatformSettings;
        }

        public ProtoAdapter_EPlatformSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, EPlatformSettings.class);
        }

        public final EPlatformSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (EPlatformSettings) null);
        }

        public final int encodedSize(EPlatformSettings ePlatformSettings) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, ePlatformSettings.lite_link) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, ePlatformSettings.jump_block_list) + ProtoAdapter.STRING.encodedSizeWithTag(3, ePlatformSettings.jump_redirect_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, ePlatformSettings.block_hint) + ProtoAdapter.INT32.encodedSizeWithTag(5, ePlatformSettings.block_mode) + ProtoAdapter.STRING.encodedSizeWithTag(6, ePlatformSettings.profile_add_contact_info_text) + ePlatformSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, EPlatformSettings ePlatformSettings) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ePlatformSettings.lite_link);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, ePlatformSettings.jump_block_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ePlatformSettings.jump_redirect_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ePlatformSettings.block_hint);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, ePlatformSettings.block_mode);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, ePlatformSettings.profile_add_contact_info_text);
            protoWriter.writeBytes(ePlatformSettings.unknownFields());
        }

        public final EPlatformSettings decode(ProtoReader protoReader, EPlatformSettings ePlatformSettings) throws IOException {
            Builder builder;
            EPlatformSettings ePlatformSettings2 = (EPlatformSettings) C10938a.m32097a().mo26425a(EPlatformSettings.class, ePlatformSettings);
            if (ePlatformSettings2 != null) {
                builder = ePlatformSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.lite_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.jump_redirect_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.block_hint((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.block_mode((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.profile_add_contact_info_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ePlatformSettings2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.jump_block_list = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getJumpBlockList() {
        return this.jump_block_list;
    }

    public final String getBlockHint() throws NullValueException {
        if (this.block_hint != null) {
            return this.block_hint;
        }
        throw new NullValueException();
    }

    public final Integer getBlockMode() throws NullValueException {
        if (this.block_mode != null) {
            return this.block_mode;
        }
        throw new NullValueException();
    }

    public final String getJumpRedirectUrl() throws NullValueException {
        if (this.jump_redirect_url != null) {
            return this.jump_redirect_url;
        }
        throw new NullValueException();
    }

    public final String getLiteLink() throws NullValueException {
        if (this.lite_link != null) {
            return this.lite_link;
        }
        throw new NullValueException();
    }

    public final String getProfileAddContactInfoText() throws NullValueException {
        if (this.profile_add_contact_info_text != null) {
            return this.profile_add_contact_info_text;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.lite_link = this.lite_link;
        builder.jump_block_list = Internal.copyOf("jump_block_list", this.jump_block_list);
        builder.jump_redirect_url = this.jump_redirect_url;
        builder.block_hint = this.block_hint;
        builder.block_mode = this.block_mode;
        builder.profile_add_contact_info_text = this.profile_add_contact_info_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.lite_link != null) {
            i = this.lite_link.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 37) + this.jump_block_list.hashCode()) * 37;
        if (this.jump_redirect_url != null) {
            i2 = this.jump_redirect_url.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode2 + i2) * 37;
        if (this.block_hint != null) {
            i3 = this.block_hint.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.block_mode != null) {
            i4 = this.block_mode.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        if (this.profile_add_contact_info_text != null) {
            i6 = this.profile_add_contact_info_text.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.lite_link != null) {
            sb.append(", lite_link=");
            sb.append(this.lite_link);
        }
        if (!this.jump_block_list.isEmpty()) {
            sb.append(", jump_block_list=");
            sb.append(this.jump_block_list);
        }
        if (this.jump_redirect_url != null) {
            sb.append(", jump_redirect_url=");
            sb.append(this.jump_redirect_url);
        }
        if (this.block_hint != null) {
            sb.append(", block_hint=");
            sb.append(this.block_hint);
        }
        if (this.block_mode != null) {
            sb.append(", block_mode=");
            sb.append(this.block_mode);
        }
        if (this.profile_add_contact_info_text != null) {
            sb.append(", profile_add_contact_info_text=");
            sb.append(this.profile_add_contact_info_text);
        }
        StringBuilder replace = sb.replace(0, 2, "EPlatformSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EPlatformSettings)) {
            return false;
        }
        EPlatformSettings ePlatformSettings = (EPlatformSettings) obj;
        if (!unknownFields().equals(ePlatformSettings.unknownFields()) || !Internal.equals(this.lite_link, ePlatformSettings.lite_link) || !this.jump_block_list.equals(ePlatformSettings.jump_block_list) || !Internal.equals(this.jump_redirect_url, ePlatformSettings.jump_redirect_url) || !Internal.equals(this.block_hint, ePlatformSettings.block_hint) || !Internal.equals(this.block_mode, ePlatformSettings.block_mode) || !Internal.equals(this.profile_add_contact_info_text, ePlatformSettings.profile_add_contact_info_text)) {
            return false;
        }
        return true;
    }

    public EPlatformSettings(String str, List<String> list, String str2, String str3, Integer num, String str4) {
        this(str, list, str2, str3, num, str4, ByteString.EMPTY);
    }

    public EPlatformSettings(String str, List<String> list, String str2, String str3, Integer num, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.lite_link = str;
        this.jump_block_list = Internal.immutableCopyOf("jump_block_list", list);
        this.jump_redirect_url = str2;
        this.block_hint = str3;
        this.block_mode = num;
        this.profile_add_contact_info_text = str4;
    }
}

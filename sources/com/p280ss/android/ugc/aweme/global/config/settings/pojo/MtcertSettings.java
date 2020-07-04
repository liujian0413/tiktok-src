package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

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
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings */
public final class MtcertSettings extends Message<MtcertSettings, Builder> {
    public static final DefaultValueProtoAdapter<MtcertSettings> ADAPTER = new ProtoAdapter_MtcertSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 7)
    public final String cert_url_schema;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 4)
    public final Boolean enable_change_handle_notice;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 3)
    public final Boolean enable_change_mobile_notice;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 5)
    public final Boolean enable_change_nickname_notice;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 2)
    public final Boolean enable_private_account_notice;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 1)
    public final Boolean show_cert_entry;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.VerificationBadgeType#ADAPTER", label = 2, tag = 6)
    public final List<VerificationBadgeType> verification_badge_type;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MtcertSettings, Builder> {
        public String cert_url_schema = "";
        public Boolean enable_change_handle_notice = Boolean.valueOf(false);
        public Boolean enable_change_mobile_notice = Boolean.valueOf(false);
        public Boolean enable_change_nickname_notice = Boolean.valueOf(false);
        public Boolean enable_private_account_notice = Boolean.valueOf(false);
        public Boolean show_cert_entry = Boolean.valueOf(false);
        public List<VerificationBadgeType> verification_badge_type = Internal.newMutableList();

        public final MtcertSettings build() {
            if (this.show_cert_entry == null || this.enable_private_account_notice == null || this.enable_change_mobile_notice == null || this.enable_change_handle_notice == null || this.enable_change_nickname_notice == null || this.cert_url_schema == null) {
                throw C10939b.m32101a(this.show_cert_entry, "show_cert_entry", this.enable_private_account_notice, "enable_private_account_notice", this.enable_change_mobile_notice, "enable_change_mobile_notice", this.enable_change_handle_notice, "enable_change_handle_notice", this.enable_change_nickname_notice, "enable_change_nickname_notice", this.cert_url_schema, "cert_url_schema");
            }
            MtcertSettings mtcertSettings = new MtcertSettings(this.show_cert_entry, this.enable_private_account_notice, this.enable_change_mobile_notice, this.enable_change_handle_notice, this.enable_change_nickname_notice, this.verification_badge_type, this.cert_url_schema, super.buildUnknownFields());
            return mtcertSettings;
        }

        public final Builder cert_url_schema(String str) {
            this.cert_url_schema = str;
            return this;
        }

        public final Builder enable_change_handle_notice(Boolean bool) {
            this.enable_change_handle_notice = bool;
            return this;
        }

        public final Builder enable_change_mobile_notice(Boolean bool) {
            this.enable_change_mobile_notice = bool;
            return this;
        }

        public final Builder enable_change_nickname_notice(Boolean bool) {
            this.enable_change_nickname_notice = bool;
            return this;
        }

        public final Builder enable_private_account_notice(Boolean bool) {
            this.enable_private_account_notice = bool;
            return this;
        }

        public final Builder show_cert_entry(Boolean bool) {
            this.show_cert_entry = bool;
            return this;
        }

        public final Builder verification_badge_type(List<VerificationBadgeType> list) {
            Internal.checkElementsNotNull(list);
            this.verification_badge_type = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings$ProtoAdapter_MtcertSettings */
    static final class ProtoAdapter_MtcertSettings extends DefaultValueProtoAdapter<MtcertSettings> {
        public final MtcertSettings redact(MtcertSettings mtcertSettings) {
            return mtcertSettings;
        }

        public ProtoAdapter_MtcertSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, MtcertSettings.class);
        }

        public final MtcertSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (MtcertSettings) null);
        }

        public final int encodedSize(MtcertSettings mtcertSettings) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, mtcertSettings.show_cert_entry) + ProtoAdapter.BOOL.encodedSizeWithTag(2, mtcertSettings.enable_private_account_notice) + ProtoAdapter.BOOL.encodedSizeWithTag(3, mtcertSettings.enable_change_mobile_notice) + ProtoAdapter.BOOL.encodedSizeWithTag(4, mtcertSettings.enable_change_handle_notice) + ProtoAdapter.BOOL.encodedSizeWithTag(5, mtcertSettings.enable_change_nickname_notice) + VerificationBadgeType.ADAPTER.asRepeated().encodedSizeWithTag(6, mtcertSettings.verification_badge_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, mtcertSettings.cert_url_schema) + mtcertSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, MtcertSettings mtcertSettings) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mtcertSettings.show_cert_entry);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mtcertSettings.enable_private_account_notice);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mtcertSettings.enable_change_mobile_notice);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mtcertSettings.enable_change_handle_notice);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, mtcertSettings.enable_change_nickname_notice);
            VerificationBadgeType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, mtcertSettings.verification_badge_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, mtcertSettings.cert_url_schema);
            protoWriter.writeBytes(mtcertSettings.unknownFields());
        }

        public final MtcertSettings decode(ProtoReader protoReader, MtcertSettings mtcertSettings) throws IOException {
            Builder builder;
            MtcertSettings mtcertSettings2 = (MtcertSettings) C10938a.m32097a().mo26425a(MtcertSettings.class, mtcertSettings);
            if (mtcertSettings2 != null) {
                builder = mtcertSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<VerificationBadgeType> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show_cert_entry((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.enable_private_account_notice((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.enable_change_mobile_notice((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.enable_change_handle_notice((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 5:
                            builder.enable_change_nickname_notice((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            newMutableList.add(VerificationBadgeType.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(VerificationBadgeType.class)));
                            break;
                        case 7:
                            builder.cert_url_schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (mtcertSettings2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.verification_badge_type = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final String getCertUrlSchema() {
        return this.cert_url_schema;
    }

    public final Boolean getEnableChangeHandleNotice() {
        return this.enable_change_handle_notice;
    }

    public final Boolean getEnableChangeMobileNotice() {
        return this.enable_change_mobile_notice;
    }

    public final Boolean getEnableChangeNicknameNotice() {
        return this.enable_change_nickname_notice;
    }

    public final Boolean getEnablePrivateAccountNotice() {
        return this.enable_private_account_notice;
    }

    public final Boolean getShowCertEntry() {
        return this.show_cert_entry;
    }

    public final List<VerificationBadgeType> getVerificationBadgeType() {
        return this.verification_badge_type;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show_cert_entry = this.show_cert_entry;
        builder.enable_private_account_notice = this.enable_private_account_notice;
        builder.enable_change_mobile_notice = this.enable_change_mobile_notice;
        builder.enable_change_handle_notice = this.enable_change_handle_notice;
        builder.enable_change_nickname_notice = this.enable_change_nickname_notice;
        builder.verification_badge_type = Internal.copyOf("verification_badge_type", this.verification_badge_type);
        builder.cert_url_schema = this.cert_url_schema;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((((((unknownFields().hashCode() * 37) + this.show_cert_entry.hashCode()) * 37) + this.enable_private_account_notice.hashCode()) * 37) + this.enable_change_mobile_notice.hashCode()) * 37) + this.enable_change_handle_notice.hashCode()) * 37) + this.enable_change_nickname_notice.hashCode()) * 37) + this.verification_badge_type.hashCode()) * 37) + this.cert_url_schema.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", show_cert_entry=");
        sb.append(this.show_cert_entry);
        sb.append(", enable_private_account_notice=");
        sb.append(this.enable_private_account_notice);
        sb.append(", enable_change_mobile_notice=");
        sb.append(this.enable_change_mobile_notice);
        sb.append(", enable_change_handle_notice=");
        sb.append(this.enable_change_handle_notice);
        sb.append(", enable_change_nickname_notice=");
        sb.append(this.enable_change_nickname_notice);
        if (!this.verification_badge_type.isEmpty()) {
            sb.append(", verification_badge_type=");
            sb.append(this.verification_badge_type);
        }
        sb.append(", cert_url_schema=");
        sb.append(this.cert_url_schema);
        StringBuilder replace = sb.replace(0, 2, "MtcertSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MtcertSettings)) {
            return false;
        }
        MtcertSettings mtcertSettings = (MtcertSettings) obj;
        if (!unknownFields().equals(mtcertSettings.unknownFields()) || !this.show_cert_entry.equals(mtcertSettings.show_cert_entry) || !this.enable_private_account_notice.equals(mtcertSettings.enable_private_account_notice) || !this.enable_change_mobile_notice.equals(mtcertSettings.enable_change_mobile_notice) || !this.enable_change_handle_notice.equals(mtcertSettings.enable_change_handle_notice) || !this.enable_change_nickname_notice.equals(mtcertSettings.enable_change_nickname_notice) || !this.verification_badge_type.equals(mtcertSettings.verification_badge_type) || !this.cert_url_schema.equals(mtcertSettings.cert_url_schema)) {
            return false;
        }
        return true;
    }

    public MtcertSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List<VerificationBadgeType> list, String str) {
        this(bool, bool2, bool3, bool4, bool5, list, str, ByteString.EMPTY);
    }

    public MtcertSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List<VerificationBadgeType> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_cert_entry = bool;
        this.enable_private_account_notice = bool2;
        this.enable_change_mobile_notice = bool3;
        this.enable_change_handle_notice = bool4;
        this.enable_change_nickname_notice = bool5;
        this.verification_badge_type = Internal.immutableCopyOf("verification_badge_type", list);
        this.cert_url_schema = str;
    }
}

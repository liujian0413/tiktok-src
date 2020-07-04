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
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VerificationBadgeType */
public final class VerificationBadgeType extends Message<VerificationBadgeType, Builder> {
    public static final DefaultValueProtoAdapter<VerificationBadgeType> ADAPTER = new ProtoAdapter_VerificationBadgeType();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 2)
    public final Integer action_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer badge_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 3)
    public final String link;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VerificationBadgeType$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VerificationBadgeType, Builder> {
        public Integer action_type = Integer.valueOf(1);
        public Integer badge_type = Integer.valueOf(1);
        public String link = "";

        public final VerificationBadgeType build() {
            if (this.badge_type != null && this.action_type != null && this.link != null) {
                return new VerificationBadgeType(this.badge_type, this.action_type, this.link, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.badge_type, "badge_type", this.action_type, "action_type", this.link, "link");
        }

        public final Builder action_type(Integer num) {
            this.action_type = num;
            return this;
        }

        public final Builder badge_type(Integer num) {
            this.badge_type = num;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VerificationBadgeType$ProtoAdapter_VerificationBadgeType */
    static final class ProtoAdapter_VerificationBadgeType extends DefaultValueProtoAdapter<VerificationBadgeType> {
        public final VerificationBadgeType redact(VerificationBadgeType verificationBadgeType) {
            return verificationBadgeType;
        }

        public ProtoAdapter_VerificationBadgeType() {
            super(FieldEncoding.LENGTH_DELIMITED, VerificationBadgeType.class);
        }

        public final VerificationBadgeType decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (VerificationBadgeType) null);
        }

        public final int encodedSize(VerificationBadgeType verificationBadgeType) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, verificationBadgeType.badge_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, verificationBadgeType.action_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, verificationBadgeType.link) + verificationBadgeType.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, VerificationBadgeType verificationBadgeType) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, verificationBadgeType.badge_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, verificationBadgeType.action_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, verificationBadgeType.link);
            protoWriter.writeBytes(verificationBadgeType.unknownFields());
        }

        public final VerificationBadgeType decode(ProtoReader protoReader, VerificationBadgeType verificationBadgeType) throws IOException {
            Builder builder;
            VerificationBadgeType verificationBadgeType2 = (VerificationBadgeType) C10938a.m32097a().mo26425a(VerificationBadgeType.class, verificationBadgeType);
            if (verificationBadgeType2 != null) {
                builder = verificationBadgeType2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.badge_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.action_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (verificationBadgeType2 != null) {
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

    public final Integer getActionType() {
        return this.action_type;
    }

    public final Integer getBadgeType() {
        return this.badge_type;
    }

    public final String getLink() {
        return this.link;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.badge_type = this.badge_type;
        builder.action_type = this.action_type;
        builder.link = this.link;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((unknownFields().hashCode() * 37) + this.badge_type.hashCode()) * 37) + this.action_type.hashCode()) * 37) + this.link.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", badge_type=");
        sb.append(this.badge_type);
        sb.append(", action_type=");
        sb.append(this.action_type);
        sb.append(", link=");
        sb.append(this.link);
        StringBuilder replace = sb.replace(0, 2, "VerificationBadgeType{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationBadgeType)) {
            return false;
        }
        VerificationBadgeType verificationBadgeType = (VerificationBadgeType) obj;
        if (!unknownFields().equals(verificationBadgeType.unknownFields()) || !this.badge_type.equals(verificationBadgeType.badge_type) || !this.action_type.equals(verificationBadgeType.action_type) || !this.link.equals(verificationBadgeType.link)) {
            return false;
        }
        return true;
    }

    public VerificationBadgeType(Integer num, Integer num2, String str) {
        this(num, num2, str, ByteString.EMPTY);
    }

    public VerificationBadgeType(Integer num, Integer num2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.badge_type = num;
        this.action_type = num2;
        this.link = str;
    }
}

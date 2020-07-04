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
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser */
public final class UgNewUser extends Message<UgNewUser, Builder> {
    public static final DefaultValueProtoAdapter<UgNewUser> ADAPTER = new ProtoAdapter_UgNewUser();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer active_time_limit;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer download_time_limit;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgNewUser, Builder> {
        public Integer active_time_limit;
        public Integer download_time_limit;

        public final UgNewUser build() {
            return new UgNewUser(this.download_time_limit, this.active_time_limit, super.buildUnknownFields());
        }

        public final Builder active_time_limit(Integer num) {
            this.active_time_limit = num;
            return this;
        }

        public final Builder download_time_limit(Integer num) {
            this.download_time_limit = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser$ProtoAdapter_UgNewUser */
    static final class ProtoAdapter_UgNewUser extends DefaultValueProtoAdapter<UgNewUser> {
        public final UgNewUser redact(UgNewUser ugNewUser) {
            return ugNewUser;
        }

        public ProtoAdapter_UgNewUser() {
            super(FieldEncoding.LENGTH_DELIMITED, UgNewUser.class);
        }

        public final UgNewUser decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgNewUser) null);
        }

        public final int encodedSize(UgNewUser ugNewUser) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, ugNewUser.download_time_limit) + ProtoAdapter.INT32.encodedSizeWithTag(2, ugNewUser.active_time_limit) + ugNewUser.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgNewUser ugNewUser) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, ugNewUser.download_time_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, ugNewUser.active_time_limit);
            protoWriter.writeBytes(ugNewUser.unknownFields());
        }

        public final UgNewUser decode(ProtoReader protoReader, UgNewUser ugNewUser) throws IOException {
            Builder builder;
            UgNewUser ugNewUser2 = (UgNewUser) C10938a.m32097a().mo26425a(UgNewUser.class, ugNewUser);
            if (ugNewUser2 != null) {
                builder = ugNewUser2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.download_time_limit((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.active_time_limit((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ugNewUser2 != null) {
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

    public final Integer getActiveTimeLimit() throws NullValueException {
        if (this.active_time_limit != null) {
            return this.active_time_limit;
        }
        throw new NullValueException();
    }

    public final Integer getDownloadTimeLimit() throws NullValueException {
        if (this.download_time_limit != null) {
            return this.download_time_limit;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.download_time_limit = this.download_time_limit;
        builder.active_time_limit = this.active_time_limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.download_time_limit != null) {
            i = this.download_time_limit.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.active_time_limit != null) {
            i3 = this.active_time_limit.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.download_time_limit != null) {
            sb.append(", download_time_limit=");
            sb.append(this.download_time_limit);
        }
        if (this.active_time_limit != null) {
            sb.append(", active_time_limit=");
            sb.append(this.active_time_limit);
        }
        StringBuilder replace = sb.replace(0, 2, "UgNewUser{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgNewUser)) {
            return false;
        }
        UgNewUser ugNewUser = (UgNewUser) obj;
        if (!unknownFields().equals(ugNewUser.unknownFields()) || !Internal.equals(this.download_time_limit, ugNewUser.download_time_limit) || !Internal.equals(this.active_time_limit, ugNewUser.active_time_limit)) {
            return false;
        }
        return true;
    }

    public UgNewUser(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public UgNewUser(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.download_time_limit = num;
        this.active_time_limit = num2;
    }
}

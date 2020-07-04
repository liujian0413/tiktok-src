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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BusinessEC */
public final class BusinessEC extends Message<BusinessEC, Builder> {
    public static final DefaultValueProtoAdapter<BusinessEC> ADAPTER = new ProtoAdapter_BusinessEC();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String page_eshop_toolbox;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String page_home;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BusinessEC$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<BusinessEC, Builder> {
        public String page_eshop_toolbox;
        public String page_home;

        public final BusinessEC build() {
            return new BusinessEC(this.page_home, this.page_eshop_toolbox, super.buildUnknownFields());
        }

        public final Builder page_eshop_toolbox(String str) {
            this.page_eshop_toolbox = str;
            return this;
        }

        public final Builder page_home(String str) {
            this.page_home = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BusinessEC$ProtoAdapter_BusinessEC */
    static final class ProtoAdapter_BusinessEC extends DefaultValueProtoAdapter<BusinessEC> {
        public final BusinessEC redact(BusinessEC businessEC) {
            return businessEC;
        }

        public ProtoAdapter_BusinessEC() {
            super(FieldEncoding.LENGTH_DELIMITED, BusinessEC.class);
        }

        public final BusinessEC decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (BusinessEC) null);
        }

        public final int encodedSize(BusinessEC businessEC) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, businessEC.page_home) + ProtoAdapter.STRING.encodedSizeWithTag(3, businessEC.page_eshop_toolbox) + businessEC.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, BusinessEC businessEC) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, businessEC.page_home);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, businessEC.page_eshop_toolbox);
            protoWriter.writeBytes(businessEC.unknownFields());
        }

        public final BusinessEC decode(ProtoReader protoReader, BusinessEC businessEC) throws IOException {
            Builder builder;
            BusinessEC businessEC2 = (BusinessEC) C10938a.m32097a().mo26425a(BusinessEC.class, businessEC);
            if (businessEC2 != null) {
                builder = businessEC2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.page_home((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (businessEC2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.page_eshop_toolbox((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getPageEshopToolbox() throws NullValueException {
        if (this.page_eshop_toolbox != null) {
            return this.page_eshop_toolbox;
        }
        throw new NullValueException();
    }

    public final String getPageHome() throws NullValueException {
        if (this.page_home != null) {
            return this.page_home;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.page_home = this.page_home;
        builder.page_eshop_toolbox = this.page_eshop_toolbox;
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
        if (this.page_home != null) {
            i = this.page_home.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.page_eshop_toolbox != null) {
            i3 = this.page_eshop_toolbox.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.page_home != null) {
            sb.append(", page_home=");
            sb.append(this.page_home);
        }
        if (this.page_eshop_toolbox != null) {
            sb.append(", page_eshop_toolbox=");
            sb.append(this.page_eshop_toolbox);
        }
        StringBuilder replace = sb.replace(0, 2, "BusinessEC{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusinessEC)) {
            return false;
        }
        BusinessEC businessEC = (BusinessEC) obj;
        if (!unknownFields().equals(businessEC.unknownFields()) || !Internal.equals(this.page_home, businessEC.page_home) || !Internal.equals(this.page_eshop_toolbox, businessEC.page_eshop_toolbox)) {
            return false;
        }
        return true;
    }

    public BusinessEC(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public BusinessEC(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_home = str;
        this.page_eshop_toolbox = str2;
    }
}

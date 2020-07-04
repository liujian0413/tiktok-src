package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings */
public final class EmailLoginSettings extends Message<EmailLoginSettings, Builder> {
    public static final DefaultValueProtoAdapter<EmailLoginSettings> ADAPTER = new ProtoAdapter_EmailLoginSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 1)
    public final List<String> domain_recommendation;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<EmailLoginSettings, Builder> {
        public List<String> domain_recommendation = Internal.newMutableList();

        public final EmailLoginSettings build() {
            return new EmailLoginSettings(this.domain_recommendation, super.buildUnknownFields());
        }

        public final Builder domain_recommendation(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.domain_recommendation = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings$ProtoAdapter_EmailLoginSettings */
    static final class ProtoAdapter_EmailLoginSettings extends DefaultValueProtoAdapter<EmailLoginSettings> {
        public final EmailLoginSettings redact(EmailLoginSettings emailLoginSettings) {
            return emailLoginSettings;
        }

        public ProtoAdapter_EmailLoginSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, EmailLoginSettings.class);
        }

        public final EmailLoginSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (EmailLoginSettings) null);
        }

        public final int encodedSize(EmailLoginSettings emailLoginSettings) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, emailLoginSettings.domain_recommendation) + emailLoginSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, EmailLoginSettings emailLoginSettings) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, emailLoginSettings.domain_recommendation);
            protoWriter.writeBytes(emailLoginSettings.unknownFields());
        }

        public final EmailLoginSettings decode(ProtoReader protoReader, EmailLoginSettings emailLoginSettings) throws IOException {
            Builder builder;
            EmailLoginSettings emailLoginSettings2 = (EmailLoginSettings) C10938a.m32097a().mo26425a(EmailLoginSettings.class, emailLoginSettings);
            if (emailLoginSettings2 != null) {
                builder = emailLoginSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.domain_recommendation = newMutableList;
                    }
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (emailLoginSettings2 == null) {
                            throw e;
                        }
                    }
                } else {
                    newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final List<String> getDomainRecommendation() {
        return this.domain_recommendation;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.domain_recommendation.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.domain_recommendation = Internal.copyOf("domain_recommendation", this.domain_recommendation);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.domain_recommendation.isEmpty()) {
            sb.append(", domain_recommendation=");
            sb.append(this.domain_recommendation);
        }
        StringBuilder replace = sb.replace(0, 2, "EmailLoginSettings{");
        replace.append('}');
        return replace.toString();
    }

    public EmailLoginSettings(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmailLoginSettings)) {
            return false;
        }
        EmailLoginSettings emailLoginSettings = (EmailLoginSettings) obj;
        if (!unknownFields().equals(emailLoginSettings.unknownFields()) || !this.domain_recommendation.equals(emailLoginSettings.domain_recommendation)) {
            return false;
        }
        return true;
    }

    public EmailLoginSettings(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.domain_recommendation = Internal.immutableCopyOf("domain_recommendation", list);
    }
}

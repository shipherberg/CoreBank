package ir.biif.corebank.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import java.sql.Date;


@Document
@Setter
@Getter
public class RealCustomer extends Customer {
    @Field
    private String firstName;
    @Field
    private String lastName;
    @Field
    private String fatherName;
    @Field
    private String nationalCode;
    @Field
    private String mobile;
    @Field
    private Date birthdate;


}

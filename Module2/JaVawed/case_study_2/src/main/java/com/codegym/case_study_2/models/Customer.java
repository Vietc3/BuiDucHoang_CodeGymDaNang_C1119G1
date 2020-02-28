package com.codegym.case_study_2.models;


import javax.persistence.*;
import javax.validation.constraints.Pattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customer_f")
public class Customer  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;
    private String nameCustomer;
    private Date birthdayCustomer;
    @Pattern(regexp = "^((090|091)[\\d]{7})|(\\(84\\)\\+(09|91)[\\d]{7})$",message = "phone khong dung dinh dang")
    private String phoneNumberCustomer;
    private String emailCustomer;
    private String addressCustomer;
    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Date getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) throws ParseException {
        this.birthdayCustomer = new SimpleDateFormat("dd/MM/yyyy").parse(birthdayCustomer);
    }

    public String getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(String phoneNumberCustomer) {
        this.phoneNumberCustomer = phoneNumberCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public TypeOfCustomer getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(TypeOfCustomer typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public Customer() {
    }

    @ManyToOne
    @JoinColumn(name = "afk_typeOfCustomer")
    private TypeOfCustomer typeOfCustomer;

    @OneToMany(mappedBy = "customerC",cascade = CascadeType.ALL)
    private List<Contact> contactList;

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

}

package org.openmrs.module.hivtestingservices.api;


import org.openmrs.BaseOpenmrsData;
import org.openmrs.Obs;
import org.openmrs.Patient;

import java.util.Date;
import java.util.UUID;

public class PatientContact extends BaseOpenmrsData {

    private Integer id;
    private String uuid;
    private Obs obsGroupId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String sex;
    private Date birthDate;
    private String physicalAddress;
    private String phoneContact;
    private Patient patientRelatedTo;
    private String relationType;
    private Date appointmentDate;
    private String baselineHivStatus;
    private String ipvOutcome;
    private Patient patient;


    public PatientContact() {
        prePersist();
    }

    public PatientContact(String uuid, String firstName, String middleName,
                          String lastName, String sex, Date birthDate, String physicalAddress,
                          String phoneContact, String relationType, Date appointmentDate,
                          String baselineHivStatus, String ipvOutcome, Date dateCreated,
                          Integer changedBy, Date dateChanged, boolean voided, Integer voidedBy, Date dateVoided, String voidedReason) {
        this.uuid = uuid;
        // this.obsGroupId = obsGroupId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.physicalAddress = physicalAddress;
        this.phoneContact = phoneContact;
        // this.patientRelatedTo = patientRelatedTo;
        this.relationType = relationType;
        this.appointmentDate = appointmentDate;
        this.baselineHivStatus = baselineHivStatus;
        this.ipvOutcome = ipvOutcome;

    }


    public void prePersist() {

        if (null == getUuid())
            setUuid(UUID.randomUUID().toString());
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Obs getObsGroupId() {
        return obsGroupId;
    }


    public void setObsGroupId(Obs obsGroupId) {
        this.obsGroupId = obsGroupId;
    }

    public Patient getPatientRelatedTo() {
        return patientRelatedTo;
    }

    public void setPatientRelatedTo(Patient patientRelatedTo) {
        this.patientRelatedTo = patientRelatedTo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getBaselineHivStatus() {
        return baselineHivStatus;
    }

    public void setBaselineHivStatus(String baselineHivStatus) {
        this.baselineHivStatus = baselineHivStatus;
    }

    public String getIpvOutcome() {
        return ipvOutcome;
    }

    public void setIpvOutcome(String ipvOutcome) {
        this.ipvOutcome = ipvOutcome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}


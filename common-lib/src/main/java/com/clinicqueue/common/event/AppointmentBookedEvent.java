package com.clinicqueue.common.event;

import java.time.LocalDateTime;

public class AppointmentBookedEvent {

    private String appointmentId;
    private String patientId;
    private String doctorId;
    private String clinicId;
    private LocalDateTime slotStart;
    private LocalDateTime bookedAt;

    public AppointmentBookedEvent() {
    }

    public AppointmentBookedEvent(String appointmentId, String patientId, String doctorId,
                                   String clinicId, LocalDateTime slotStart, LocalDateTime bookedAt) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.clinicId = clinicId;
        this.slotStart = slotStart;
        this.bookedAt = bookedAt;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public LocalDateTime getSlotStart() {
        return slotStart;
    }

    public void setSlotStart(LocalDateTime slotStart) {
        this.slotStart = slotStart;
    }

    public LocalDateTime getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(LocalDateTime bookedAt) {
        this.bookedAt = bookedAt;
    }
}
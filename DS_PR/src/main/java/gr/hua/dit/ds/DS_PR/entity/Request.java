package gr.hua.dit.ds.DS_PR.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="students")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer Id;

    @Column(name="appointmentDate")
    private String appointmentDate;

    @Column(name="living_area")
    private String living_area;

    @Column(name="blood_type")
    private String blood_type;

    @Column(name="last_blood_test")
    private String last_blood_test;

    public Request() {
    }

    public Integer getId() {
        return Id;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getLiving_area() {
        return living_area;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public String getLast_blood_test() {
        return last_blood_test;
    }

    public void setLiving_area(String living_area) {
        this.living_area = living_area;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public void setLast_blood_test(String last_blood_test) {
        this.last_blood_test = last_blood_test;
    }

    public Request(String appointmentDate,String living_area,String blood_type,String last_blood_test) {
        this.appointmentDate = appointmentDate;
        this.living_area = living_area;
        this.blood_type = blood_type;
        this.last_blood_test = last_blood_test;
    }

    @Override
    public String toString() {
        return "Request{" +
                "Id=" + Id +
                ", appointmentDate='" + appointmentDate + '\'' +
                ", living_area='" + living_area + '\'' +
                ", blood_type='" + blood_type + '\'' +
                ", last_blood_test='" + last_blood_test + '\'' +
                '}';
    }

}

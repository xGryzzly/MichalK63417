package com.systemzarzadzaniaerphrm.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "pracownicy")
public class Pracownik {
    @Id

private Long Id;
private String Imie;
private String Nazwisko;
private Integer Nr_tel;
private Integer Data_zatrudnienia;
private String Email;
private Integer Status_zatrudnienia;
private Integer PESEL;

public Pracownik(){

}
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public Integer getNr_tel() {
        return Nr_tel;
    }

    public void setNr_tel(Integer nr_tel) {
        Nr_tel = nr_tel;
    }

    public Integer getData_zatrudnienia() {
        return Data_zatrudnienia;
    }

    public void setData_zatrudnienia(Integer data_zatrudnienia) {
        Data_zatrudnienia = data_zatrudnienia;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getStatus_zatrudnienia() {
        return Status_zatrudnienia;
    }

    public void setStatus_zatrudnienia(Integer status_zatrudnienia) {
        Status_zatrudnienia = status_zatrudnienia;
    }

    public Integer getPESEL() {
        return PESEL;
    }

    public void setPESEL(Integer PESEL) {
        this.PESEL = PESEL;
    }

    public Pracownik(String imie, String nazwisko, Integer nr_tel, Integer data_zatrudnienia, String email, Integer status_zatrudnienia, Integer PESEL) {
        Imie = imie;
        Nazwisko = nazwisko;
        Nr_tel = nr_tel;
        Data_zatrudnienia = data_zatrudnienia;
        Email = email;
        Status_zatrudnienia = status_zatrudnienia;
        this.PESEL = PESEL;
    }
    //    @Id
//    private Long id;
//
//    private String Imie;
//
//    private String Nazwisko;
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }


}
//    private Long id;
//
//    private String Imie;
//
//    private String Nazwisko;